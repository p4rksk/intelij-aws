package com.example.aws2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/aws/2")
    public String aws1(){
        return "<h1>aws2</h1>";
    }
}
