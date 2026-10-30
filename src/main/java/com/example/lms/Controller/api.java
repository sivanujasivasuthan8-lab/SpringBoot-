package com.example.lms.Controller;

import com.example.lms.entity.Student;
import com.example.lms.service.Studentservice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController

@RequiredArgsConstructor
@RequestMapping("/student")
public class api {
    private final Studentservice service;
    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return service.saveStudent(student);

    }
    @GetMapping
    public List<Student>getAllStudent(){
        return service.getAllStudent();
    }

}