package com.example.lms.Controller;

import com.example.lms.entity.Student;
import com.example.lms.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class student {
    @Autowired
    private Studentservice studentservice;

    @GetMapping ("/getAPI")
    public  String getAPI(){
        return  studentservice.getAppInfo();
    }


}
