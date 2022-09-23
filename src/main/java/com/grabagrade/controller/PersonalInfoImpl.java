package com.grabagrade.controller;

import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;
import com.grabagrade.interfaces.IPersonalInfo;
import com.grabagrade.models.PersonalInfoModel;
import com.grabagrade.models.UserAuthModel;
import com.grabagrade.services.AuthService;
import com.grabagrade.services.PersonalInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.concurrent.ExecutionException;

@Controller
public class PersonalInfoImpl implements IPersonalInfo {

    public PersonalInfoService personalInfoService;

    public PersonalInfoImpl(PersonalInfoService personalInfoService)
    {
        this.personalInfoService = personalInfoService;
    }

    @PostMapping("/personalInfo")
    public String savePersonalInfo(PersonalInfoModel personalInfoModel) throws ExecutionException, InterruptedException {
        return personalInfoService.saveInfo(personalInfoModel);
    }

    @Override
    @GetMapping("/personalInfo")
    public String showPersonalInfo() {
        return "personalInfo";
    }
}