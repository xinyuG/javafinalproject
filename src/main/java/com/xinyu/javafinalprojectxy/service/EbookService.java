package com.xinyu.javafinalprojectxy.service;

import com.xinyu.javafinalprojectxy.domain.Ebook;
import com.xinyu.javafinalprojectxy.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service    
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;
    public List<Ebook> list(){

        return ebookMapper.selectByExample(null);//work as where
    }
}
