package com.example.demodb.controllers;

import com.example.demodb.models.Student;
import com.example.demodb.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentService service;
    @PostMapping("/post")
    public void addStudent(@RequestBody Student s1){
        service.addStudent(s1);
    }
}
