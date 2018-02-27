package com.rain6.cxf.service.impl;

import com.rain6.cxf.mapper.LawyerMapper;
import com.rain6.cxf.pojo.Lawyer;
import com.rain6.cxf.service.TestWebService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;

/**
 * Created by Rain6 on 2017/5/18.
 */
@WebService(endpointInterface = "com.rain6.cxf.service.TestWebService",
        targetNamespace = "http://service.cxf.rain6.com/")
public class TestWebServiceImpl implements TestWebService {
    @Autowired
    LawyerMapper mapper;

    public Lawyer selectByPrimaryKey(String id) {
        System.out.println("----------------->>>>>>>>>>>>>server callling .... ");
        return mapper.selectByPrimaryKey(id);
    }
}
