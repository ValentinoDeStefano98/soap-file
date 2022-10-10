
package com.roytuts.soap.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.roytuts.soap.stubs package. 
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

    private final static QName _SendFile_QNAME = new QName("http://service.soap.com/", "sendFile");
    private final static QName _SendFileResponse_QNAME = new QName("http://service.soap.com/", "sendFileResponse");
    private final static QName _SendFileArg0_QNAME = new QName("", "arg0");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.roytuts.soap.stubs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendFile }
     * 
     */
    public SendFile createSendFile() {
        return new SendFile();
    }

    /**
     * Create an instance of {@link SendFileResponse }
     * 
     */
    public SendFileResponse createSendFileResponse() {
        return new SendFileResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendFile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendFile }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soap.com/", name = "sendFile")
    public JAXBElement<SendFile> createSendFile(SendFile value) {
        return new JAXBElement<SendFile>(_SendFile_QNAME, SendFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendFileResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendFileResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soap.com/", name = "sendFileResponse")
    public JAXBElement<SendFileResponse> createSendFileResponse(SendFileResponse value) {
        return new JAXBElement<SendFileResponse>(_SendFileResponse_QNAME, SendFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "", name = "arg0", scope = SendFile.class)
    public JAXBElement<byte[]> createSendFileArg0(byte[] value) {
        return new JAXBElement<byte[]>(_SendFileArg0_QNAME, byte[].class, SendFile.class, ((byte[]) value));
    }

}
