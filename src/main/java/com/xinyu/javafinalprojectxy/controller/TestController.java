package com.xinyu.javafinalprojectxy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //return string
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
    @PostMapping ("/hello/post")
    public String helloPost(String name){
        return "Hello World! Post, " + name;
    }
}
