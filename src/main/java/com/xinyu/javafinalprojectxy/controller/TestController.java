package com.xinyu.javafinalprojectxy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //return string
public class TestController {
    @Value("${test.hello}")         //${test.hello:TEST}, but config always has higher priority
    private String testHello;
    @GetMapping("/hello")
    public String hello(){
        return "Hello World!" + testHello;
    }
    @PostMapping ("/hello/post")
    public String helloPost(String name){
        return "Hello World! Post, " + name;
    }
}
