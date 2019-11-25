package org.launchcode.DiveLog.controllers;

import org.launchcode.DiveLog.models.data.DiveDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class DiveController {

    @Autowired
    private DiveDao diveDao;
}
