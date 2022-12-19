package com.xinyu.javafinalprojectxy.service;

import com.xinyu.javafinalprojectxy.domain.Demo;
import com.xinyu.javafinalprojectxy.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service    
public class DemoService {
    @Resource
    private DemoMapper demoMapper;
    public List<Demo> list(){

        return demoMapper.selectByExample(null);//work as where
    }
}
