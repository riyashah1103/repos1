package com.example.demodb.controllers;

import jakarta.persistence.Id;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Mycontroller {
    @GetMapping("/home")
    public String getPitch(){
        return "index.html";
    }

    @GetMapping("/about")
    public String m2(Model model){
        String a="javascript";
        model.addAttribute("num",a);
        return "about.html";
    }

    @PostMapping("/login")
    public void login(@RequestParam String username, @RequestParam String password) {
        // Handle the login request
        System.out.println(username);
        System.out.println(password);
    }

}
