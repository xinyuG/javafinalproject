package com.xinyu.javafinalprojectxy.controller;

import com.xinyu.javafinalprojectxy.domain.Demo;
import com.xinyu.javafinalprojectxy.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;
@RestController //return string
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoService demoService;
    @GetMapping("/list1")
    public List<Demo> list(){

        return demoService.list();
    }
}
