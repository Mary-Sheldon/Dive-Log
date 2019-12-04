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

import static org.springframework.web.bind.annotation.RequestMethod.POST;

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
        model.addAttribute(new Dive());
        model.addAttribute("dive", diveDao.findAll());

        return "add";
    }
    @RequestMapping(value="dive", method = POST)
    public String ProcessaddDive (@ModelAttribute @Valid Dive newDive, Errors errors,  Model model){
     if (errors.hasErrors()){
         model.addAttribute("title", "Add Dive");
         return "add";
     }
    diveDao.save(newDive);
        return "redirect:/dashboard";
}

}
