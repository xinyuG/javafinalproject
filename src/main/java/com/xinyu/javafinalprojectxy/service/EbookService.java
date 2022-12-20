package com.xinyu.javafinalprojectxy.service;

import com.xinyu.javafinalprojectxy.domain.Ebook;
import com.xinyu.javafinalprojectxy.domain.EbookExample;
import com.xinyu.javafinalprojectxy.mapper.EbookMapper;
import com.xinyu.javafinalprojectxy.req.EbookReq;
import com.xinyu.javafinalprojectxy.resp.EbookResp;
import com.xinyu.javafinalprojectxy.util.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service    
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;
    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+req.getName()+"%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);//work as where

//        List<EbookResp> respList=new ArrayList<>();
//        for (Ebook ebook : ebookList){//COPY OBJECT
//            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);
//            respList.add(ebookResp);
//        }
        //COPY OBJECT
        List<EbookResp> list = CopyUtil.copyList(ebookList, EbookResp.class);


        return list;
    }
}
