package com.grabagrade.controller;

import com.grabagrade.interfaces.IPersonalInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonalInfo implements IPersonalInfo {


    @Override
    @GetMapping("/personalInfo")
    public String showPersonalInfo() {
        return "personalInfo";
    }
}