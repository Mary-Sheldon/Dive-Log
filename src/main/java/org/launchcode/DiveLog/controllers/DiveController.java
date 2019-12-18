package org.launchcode.DiveLog.controllers;

import org.launchcode.DiveLog.models.Dive;
import org.launchcode.DiveLog.models.User;
import org.launchcode.DiveLog.models.data.DiveDao;

import org.launchcode.DiveLog.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
    public String processAddDive (Model model,@ModelAttribute @Valid Dive newDive, Errors errors) {
        model.addAttribute(newDive);
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Dive");
            return "add";
        }
            diveDao.save(newDive);
            return "redirect:dive/" + newDive.getId();
        }

    @RequestMapping(value="dive/{diveId}", method = RequestMethod.GET)
    public String displaySingleDive(Model model, @PathVariable int diveId) {
     Dive dive = diveDao.findById();

        return "add";
    }

}
