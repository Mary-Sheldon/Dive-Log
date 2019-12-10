package org.launchcode.DiveLog.controllers;

import org.launchcode.DiveLog.models.Dive;
import org.launchcode.DiveLog.models.User;
import org.launchcode.DiveLog.models.data.DiveDao;

import org.launchcode.DiveLog.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.validation.Errors;


import javax.validation.Valid;

import java.util.Date;

@Controller
@RequestMapping("")
public class DiveController {

    @Autowired
    private DiveDao diveDao;

    @Autowired
    private UserDao userDao;

    @RequestMapping(value="dive", method = RequestMethod.GET)
    public String displayAddDive(Model model) {
        model.addAttribute("title", "Add Dive");
        model.addAttribute("dive", new Dive());
        model.addAttribute("dives", diveDao.findAll());

        return "add";
    }
    @RequestMapping(value="dive", method = RequestMethod.POST)
    public String processAddDive (Model model,@ModelAttribute @Valid Dive newDive, Errors errors, String fish, Integer time1, Integer time2, String ate,
                                  Integer psi1, Integer psi2, String depth, String visibility, Integer nitrogen1, Integer nitrogen2, Integer safteystopdur, Integer surfaceinterval, Integer surfacetemp, Integer airtemp, Integer bottomtemp,
                                  String divetype, String watertype, String booties, String full, String shorty, String skin, String weight, String buddy, String notes) {
        model.addAttribute(newDive);
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Dive");
            return "add";
        }
            diveDao.save(newDive);
            return "redirect:/dashboard";
        }


}
