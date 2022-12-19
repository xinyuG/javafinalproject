package com.xinyu.javafinalprojectxy.controller;

import com.xinyu.javafinalprojectxy.domain.Ebook;
import com.xinyu.javafinalprojectxy.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController //return string
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;
    @GetMapping("/list")
    public List<Ebook> list(){

        return ebookService.list();
    }
}
