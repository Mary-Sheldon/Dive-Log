package org.launchcode.DiveLog.controllers;

import org.launchcode.DiveLog.models.Dive;
import org.launchcode.DiveLog.models.User;
import org.launchcode.DiveLog.models.data.DiveDao;

import org.launchcode.DiveLog.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("")
public class DiveController {

    @Autowired
    private DiveDao diveDao;

    @Autowired
    private UserDao userDao;

    @RequestMapping(value="dive", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("title", "Dive");
        model.addAttribute("dive", diveDao.findAll());

        return "add";
    }

}
