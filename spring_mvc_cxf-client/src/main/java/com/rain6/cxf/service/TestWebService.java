package com.rain6.cxf.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.16
 * 2018-02-27T14:44:08.205+08:00
 * Generated source version: 3.0.16
 * 
 */
@WebService(targetNamespace = "http://service.cxf.rain6.com/", name = "TestWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface TestWebService {

    @WebMethod
    @RequestWrapper(localName = "selectByPrimaryKey", targetNamespace = "http://service.cxf.rain6.com/", className = "com.rain6.cxf.service.SelectByPrimaryKey")
    @ResponseWrapper(localName = "selectByPrimaryKeyResponse", targetNamespace = "http://service.cxf.rain6.com/", className = "com.rain6.cxf.service.SelectByPrimaryKeyResponse")
    @WebResult(name = "return", targetNamespace = "")
    public Lawyer selectByPrimaryKey(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0
    );
}
