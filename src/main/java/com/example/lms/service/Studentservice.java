package com.example.lms.service;

import com.example.lms.entity.Student;
import com.example.lms.repository.studentRepostory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Studentservice {
    private  final studentRepostory repostory;
    public Student saveStudent(Student student){
        return repostory.save(student);
    }
    public List<Student> getAllStudent(){
        return  repostory.findAll();
    }

@Value("${app.name}")
    private String appName;
    @Value("${app.version}")
    private  String appVersion;
    public String getAppInfo(){
        return "ApplicationName: " + appName + " | Version: "+ appVersion;
    }

}
