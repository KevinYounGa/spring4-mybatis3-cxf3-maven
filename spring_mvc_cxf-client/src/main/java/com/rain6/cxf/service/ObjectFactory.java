
package com.rain6.cxf.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rain6.cxf.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SelectByPrimaryKey_QNAME = new QName("http://service.cxf.rain6.com/", "selectByPrimaryKey");
    private final static QName _SelectByPrimaryKeyResponse_QNAME = new QName("http://service.cxf.rain6.com/", "selectByPrimaryKeyResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rain6.cxf.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SelectByPrimaryKey }
     * 
     */
    public SelectByPrimaryKey createSelectByPrimaryKey() {
        return new SelectByPrimaryKey();
    }

    /**
     * Create an instance of {@link SelectByPrimaryKeyResponse }
     * 
     */
    public SelectByPrimaryKeyResponse createSelectByPrimaryKeyResponse() {
        return new SelectByPrimaryKeyResponse();
    }

    /**
     * Create an instance of {@link Lawyer }
     * 
     */
    public Lawyer createLawyer() {
        return new Lawyer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByPrimaryKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.rain6.com/", name = "selectByPrimaryKey")
    public JAXBElement<SelectByPrimaryKey> createSelectByPrimaryKey(SelectByPrimaryKey value) {
        return new JAXBElement<SelectByPrimaryKey>(_SelectByPrimaryKey_QNAME, SelectByPrimaryKey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByPrimaryKeyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.rain6.com/", name = "selectByPrimaryKeyResponse")
    public JAXBElement<SelectByPrimaryKeyResponse> createSelectByPrimaryKeyResponse(SelectByPrimaryKeyResponse value) {
        return new JAXBElement<SelectByPrimaryKeyResponse>(_SelectByPrimaryKeyResponse_QNAME, SelectByPrimaryKeyResponse.class, null, value);
    }

}
