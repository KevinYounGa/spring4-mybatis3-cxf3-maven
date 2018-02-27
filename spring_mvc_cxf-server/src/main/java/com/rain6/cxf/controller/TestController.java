package com.rain6.cxf.controller;

import com.rain6.cxf.pojo.Lawyer;
import com.rain6.cxf.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Rain6 on 2017/5/18.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    TestService service;

    @RequestMapping("count")
    @ResponseBody
    public Lawyer getCount() {
        return this.service.selectByPrimaryKey("143347");
    }
}
