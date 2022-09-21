package com.grabagrade.controller;

import com.grabagrade.interfaces.ISignIn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignInControllerImpl implements ISignIn {
    @Override
    @GetMapping("/signIn")
    public String showSignIn()
    {
        return "signIn";
    }
}
