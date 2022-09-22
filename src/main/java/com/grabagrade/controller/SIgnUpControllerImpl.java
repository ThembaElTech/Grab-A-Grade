package com.grabagrade.controller;

import com.grabagrade.interfaces.ISignUp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SIgnUpControllerImpl implements ISignUp {
    @Override
    @GetMapping("/signup")
    public String showSignUp()
    {
        return "signUp";
    }
}
