package com.grabagrade.controller;

import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;
import com.grabagrade.interfaces.ISignUp;
import com.grabagrade.models.UserAuthModel;
import com.grabagrade.services.AuthService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SIgnUpControllerImpl implements ISignUp {

    public AuthService authService;

    public SIgnUpControllerImpl(AuthService authService)
    {
        this.authService = authService;
    }
    @Override
    @GetMapping("/signup")
    public String showSignUp()
    {
        return "signUp";
    }

    @PostMapping("/signup")
    public UserRecord saveAuthDetails(UserAuthModel userAuthModel) throws FirebaseAuthException
    {
        return authService.storeAuthDetails(userAuthModel);
    }

}
