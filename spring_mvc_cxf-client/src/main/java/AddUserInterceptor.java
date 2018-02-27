import com.sun.org.apache.xml.internal.utils.DOMHelper;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.namespace.QName;
import java.util.List;

public class AddUserInterceptor extends AbstractPhaseInterceptor <SoapMessage>{
    private String name;
    private String password;
    public AddUserInterceptor(String name,String password) {
        super(Phase.PRE_PROTOCOL);
        this.name=name;
        this.password=password;
        System.out.println("---------------->>>>>>>>>>AddUserInterceptor.......");
    }



    public void handleMessage(SoapMessage soapMessage) throws Fault {
        List<Header> headers = soapMessage.getHeaders();
        Document document = DOMHelper.createDocument();
        Element rootEle = document.createElement("daidao");
        Element nameEle = document.createElement("name");
        nameEle.setTextContent(name);
        rootEle.appendChild(nameEle);

        Element pwdEle = document.createElement("password");
        pwdEle.setTextContent(password);
        rootEle.appendChild(pwdEle);

        headers.add(new Header(new QName("daidao"),rootEle));
        System.out.println("---------------->>>>>>>>>>client handleMessage");

    }
}
