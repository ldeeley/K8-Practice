package com.example.k8practice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/k8home")
public class HomeController {

    @GetMapping("/message")
    public String displayMessage(){
        return "Congratulations you successfully deployed application to kubernetes";
    }

}
