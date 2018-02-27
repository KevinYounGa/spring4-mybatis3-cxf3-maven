package com.rain6.cxf.service.impl;

import com.rain6.cxf.mapper.LawyerMapper;
import com.rain6.cxf.pojo.Lawyer;
import com.rain6.cxf.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Rain6 on 2017/5/18.
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    LawyerMapper mapper;

    public Lawyer selectByPrimaryKey(String id) {
        return mapper.selectByPrimaryKey(id);
    }
}
