package com.grabagrade.controller;

import com.grabagrade.interfaces.ITutorPage2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TutorPage2Impl implements ITutorPage2 {

    @Override
    @GetMapping("/tutorpage2")
    public String showTutorPage2() {
        return "tutorPage2";
    }
}
