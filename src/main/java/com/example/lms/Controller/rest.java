package com.example.lms.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rest {
    @GetMapping("/Hello")
    public String hi(){

        return "Hiiiii";
    }
}
