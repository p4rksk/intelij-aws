package com.example.aws2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HelloController {
    
    @GetMapping("/")
    public String home(){
        log.info("get /");
        return "home";
    }

    @GetMapping("/aws/2")
    public String aws1(){
        log.info("get /aws/2");
        return "<h1>aws2</h1>";
    }
}
