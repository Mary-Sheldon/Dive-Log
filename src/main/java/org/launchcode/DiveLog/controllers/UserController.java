package org.launchcode.DiveLog.controllers;

import org.launchcode.DiveLog.models.User;
import org.launchcode.DiveLog.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("title", "Register");
        model.addAttribute("user", new User());
        model.addAttribute("users", userDao.findAll());

        return"index";
    }


    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String add(Model model, @ModelAttribute @Valid User user,
                      Errors errors, String verify) {

        model.addAttribute(user);
        boolean passwordsMatch = true;
        if (user.getPassword() == null || verify == null
                || !user.getPassword().equals(verify)) {
            passwordsMatch = false;
            user.setPassword("");
            model.addAttribute("verifyError", "Passwords must match");
        }

        if (!errors.hasErrors() && passwordsMatch) {
            return "/";
        }

        return "/";

    }
}
