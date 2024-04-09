package com.example.demodb.services;

import com.example.demodb.models.Student;
import com.example.demodb.repos.StudentRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepos studentr;

    public void addStudent(Student s1){
       studentr.save(s1);
    }


    public Student updateStudent(int id, String city) {
        Student s1= studentr.findById(id).get();
        s1.setCity(city);
        return studentr.save(s1);
    }

    public String deleteStudent(int id) {
        studentr.deleteById(id);
        return ("student deleted");
    }
}
