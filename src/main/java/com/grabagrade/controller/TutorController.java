package com.grabagrade.controller;

/*import com.grabagrade.model.TutorInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.grabagrade.model.User;
import com.grabagrade.service.CreateAccountService;*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.grabagrade.interfaces.ITutor;
import java.util.concurrent.ExecutionException;

@Controller

public class TutorController  implements ITutor{



    @GetMapping("/tutorDocuments")

    public String showTutorInfoPage() {
        return "tutorDocuments";
    }



    /*private CreateAccountService tutorService;

    @PostMapping("/tutorDocuments")
    public String saveTutor( TutorInfo tutorInfo)throws ExecutionException, InterruptedException {
        return tutorService.saveTutorInfo(tutorInfo);
    }*/

}
