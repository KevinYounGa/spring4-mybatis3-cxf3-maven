package com.rain6.cxf.service;

import com.rain6.cxf.pojo.Lawyer;

import javax.jws.WebService;

/**
 * Created by Rain6 on 2017/5/18.
 */
@WebService
public interface TestWebService {
    Lawyer selectByPrimaryKey(String id);
}
