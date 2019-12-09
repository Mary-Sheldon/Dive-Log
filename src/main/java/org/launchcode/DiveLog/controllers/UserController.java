package org.launchcode.DiveLog.controllers;

import org.launchcode.DiveLog.models.User;
import org.launchcode.DiveLog.models.data.DiveDao;
import org.launchcode.DiveLog.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("")
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private DiveDao diveDao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("title", "Register");
        model.addAttribute("user", new User());
        model.addAttribute("users", userDao.findAll());

        return"index";
    }


    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addUser(Model model, @ModelAttribute @Valid User user,
                      Errors errors, String verify, String password) {

        model.addAttribute(user);
       // boolean passwordsMatch = true;
//        if (password == null || verify == null
//                || !password.equals(verify)) {
//            //passwordsMatch = false;
//            user.setPassword("");
//            model.addAttribute("verifyError", "Passwords must match");
//        }
//
//        if (!errors.hasErrors()) {
//            return "index";
//
//        }
        userDao.save(user);
        return "redirect:/dashboard";
    }
    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String displayDashboard(Model model){
        model.addAttribute("title", "Diver Dashboard");
        model.addAttribute("users", userDao.findAll());

        return"dashboard";
    }
}
