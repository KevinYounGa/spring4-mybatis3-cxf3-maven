package com.rain6.cxf.interceptor;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;

import javax.xml.namespace.QName;

public class CheckUserInterceptor extends AbstractPhaseInterceptor<SoapMessage> {
    public CheckUserInterceptor() {
        super(Phase.PRE_PROTOCOL);
    }

    public void handleMessage(SoapMessage soapMessage) throws Fault {
        //List<Header> headers = soapMessage.getHeaders();
        Header header = soapMessage.getHeader(new QName("daidao"));
        if(header != null){
            Element ele = (Element) header.getObject();
            String name = ele.getElementsByTagName("name").item(0).getTextContent();
            String pwd = ele.getElementsByTagName("password").item(0).getTextContent();
            if("kevin".equals(name) && "123456".equals(pwd)){
                System.out.println("----------->>>>>>>>>server 通过拦截器");
                return;
            }
            System.out.println("----------->>>>>>>>>server 不通过拦截器");
            throw new Fault(new RuntimeException("用户名的密码应该一致。。。。。"));
        }
    }
}
