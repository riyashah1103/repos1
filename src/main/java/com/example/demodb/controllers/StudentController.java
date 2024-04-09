package com.example.demodb.controllers;

import com.example.demodb.models.Student;
import com.example.demodb.repos.StudentRepos;
import com.example.demodb.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    StudentService service;
    @Autowired
    StudentRepos repos;
    @PostMapping("/post")
    public void addStudent(@RequestBody Student s1){
        service.addStudent(s1);
    }
    @GetMapping("/getstudent")
    public Student getStudent(@RequestParam int id) {
        Student s1= repos.findById(id).get();
        return s1;
    }
    @PutMapping("/update")
    public Student updateStudent(@RequestParam int id, @RequestParam String city){
        return service.updateStudent(id,city);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id")int id){
        return service.deleteStudent(id);
    }
}
