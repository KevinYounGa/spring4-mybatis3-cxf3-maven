package com.rain6.cxf.service;

import com.rain6.cxf.pojo.Lawyer;

/**
 * Created by Rain6 on 2017/5/18.
 */
public interface TestService {
    Lawyer selectByPrimaryKey(String id);
}
