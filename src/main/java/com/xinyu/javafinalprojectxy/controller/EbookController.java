package com.xinyu.javafinalprojectxy.controller;

import com.xinyu.javafinalprojectxy.req.EbookReq;
import com.xinyu.javafinalprojectxy.resp.CommonResp;
import com.xinyu.javafinalprojectxy.resp.EbookResp;
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
    /*response from back end*/
    public CommonResp list(EbookReq req){
        CommonResp<List<EbookResp> > resp = new CommonResp<>();
        List<EbookResp>  list = ebookService.list(req);
        resp.setContent(list);
        return resp;


    }
}
