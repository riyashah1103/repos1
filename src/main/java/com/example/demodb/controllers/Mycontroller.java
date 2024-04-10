package com.example.demodb.controllers;

import jakarta.persistence.Id;
import org.springframework.stereotype.Controller;
<<<<<<< HEAD
import org.springframework.ui.Model;
=======
>>>>>>> origin/master
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Mycontroller {
    @GetMapping("/home")
    public String getPitch(){
        return "index.html";
    }
<<<<<<< HEAD
    @GetMapping("/about")
    public String m2(Model model){
        String a="javascript";
        model.addAttribute("num",a);
        return "about.html";
    }
=======
>>>>>>> origin/master
}
