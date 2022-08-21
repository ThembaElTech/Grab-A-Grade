package com.grabagrade.controller;

import org.springframework.ui.Model;

public interface ICreateAccount {


    String signUpUser(Model model);
    String showTutorPage();
    String showTutorInfoPage();
    String showLearnerPage();


}
