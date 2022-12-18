package com.xinyu.javafinalprojectxy.controller;

import com.xinyu.javafinalprojectxy.domain.Test;
import com.xinyu.javafinalprojectxy.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController //return string
public class TestController {
    @Value("${test.hello}")         //${test.hello:TEST}, but config always has higher priority
    private String testHello;


    @Resource
    private TestService testService;
    @GetMapping("/hello")
    public String hello(){
        return "Hello World!" + testHello;
    }
    @PostMapping ("/hello/post")
    public String helloPost(String name){
        return "Hello World! Post, " + name;
    }

    @GetMapping("/test/list")
    public List<Test> list(){

        return testService.list();
    }
}
