package com.grabagrade.controller;

import com.grabagrade.interfaces.IResetPassword;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ResetPasswordImpl implements IResetPassword {
    @Override
    @GetMapping("/Reset")
    public String showResetPassword() {
        return "forgotPwd";
    }
}
