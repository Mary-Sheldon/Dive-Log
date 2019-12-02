package org.launchcode.DiveLog.controllers;

import org.launchcode.DiveLog.models.data.DiveDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("dive")
public class DiveController {

    @Autowired
    private DiveDao diveDao;

    @RequestMapping(value = "dive")
    @ResponseBody
    public String index(HttpServletRequest request) {
        /* I need to put "name" in the parenthesis below */
        return "index";
    }
}
