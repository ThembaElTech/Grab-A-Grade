package com.grabagrade.controller;

import com.grabagrade.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CreateAccountImpl implements ICreateAccount {

    @Override
    @GetMapping("/signup")
    public String signUpUser(Model model)
    {
        User user = new User();
        model.addAttribute("user", user);

        return "registrationPage";
    }

    @GetMapping("/tutor")
    @Override
    public String showTutorPage() {
        return "tutor";
    }

    @GetMapping("/tutorInfo")
    @Override
    public String showTutorInfoPage() {
        return "tutorInfo";
    }

    @GetMapping("/learner")
    @Override
    public String showLearnerPage() {
        return "StdGrade";
    }

    @PostMapping("/signup")
    public String storeUser(@ModelAttribute User user){

        System.out.println(user.toString());
        return "/registrationPage";
    }

}
