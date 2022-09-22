package com.grabagrade.controller;

import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;
import com.grabagrade.interfaces.ISignIn;
import com.grabagrade.models.UserAuthModel;
import com.grabagrade.services.AuthService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignInControllerImpl implements ISignIn {

    public AuthService authService;

    public SignInControllerImpl(AuthService authService)
    {
        this.authService = authService;
    }
    @Override
    @GetMapping("/signIn")
    public String showSignIn()
    {
        return "signIn";
    }

    @RequestMapping(value = "/login")
    public String getUserAuth(UserAuthModel userAuthModel) throws FirebaseAuthException
    {

        authService.getAuthDetails(userAuthModel);
        return "signUp";
    }
}
