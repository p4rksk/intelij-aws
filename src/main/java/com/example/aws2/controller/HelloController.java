package com.example.aws2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j // 이 어노테이션어을달면 log를 달 수있다
@RestController
public class HelloController {
    
    @GetMapping("/")
    public String home(){
        //로그 레벨의 디폴트는 info
        log.trace("get /");
        log.debug("get /");
        log.info("get /");
        log.warn("get /");
        log.error("get /");
        return "home";
    }

    @GetMapping("/aws/2")
    public String aws1(){
        log.info("get /aws/2");
        return "<h1>aws2</h1>";
    }
}
