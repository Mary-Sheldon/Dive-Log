package org.launchcode.DiveLog.controllers;

import org.launchcode.DiveLog.models.Dive;
import org.launchcode.DiveLog.models.data.DiveDao;
import org.launchcode.DiveLog.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

public class DisplayController {

    @Autowired
    private DiveDao diveDao;

    @Autowired
    private UserDao userDao;

    @RequestMapping(value="single", method = RequestMethod.GET)
    public String displayAddDive(Model model) {
        model.addAttribute("title", "Single Dive");
        model.addAttribute("dives", diveDao.findById(15));

        return "redirect:/single";    }


}
