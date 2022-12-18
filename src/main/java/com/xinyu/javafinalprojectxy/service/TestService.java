package com.xinyu.javafinalprojectxy.service;

import com.xinyu.javafinalprojectxy.domain.Test;
import com.xinyu.javafinalprojectxy.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {
    @Resource
    private TestMapper testMapper;
    public List<Test> list(){

        return testMapper.list();
    }
}
