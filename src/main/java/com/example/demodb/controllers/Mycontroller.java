package com.example.demodb.controllers;

import jakarta.persistence.Id;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Mycontroller {
    @GetMapping("/home")
    public String getPitch(){
        return "index.html";
    }
}
