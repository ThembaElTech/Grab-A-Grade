package com.grabagrade.controller;

import com.grabagrade.interfaces.IUpdatePassword;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UpdatePasswordImpl implements IUpdatePassword
{
    @Override

    @GetMapping("/updatepassword")

    public String showUpdatePassword()
    {
        return "reset password";
    }
}
