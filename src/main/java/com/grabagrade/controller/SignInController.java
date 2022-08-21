package com.grabagrade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignInController implements ISignIn {

    @GetMapping("/login")
    @Override
    public String showLoginPage() {
        return "login";
    }

    @GetMapping("/forgotPassword")
    @Override
    public String showForgotPwdPage() {
        return "forgotPwd";
    }

    @GetMapping("/otpCapture")
    @Override
    public String showOTPPage() {
        return "otpCapture";
    }
}
