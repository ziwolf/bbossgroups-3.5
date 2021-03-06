package org.frameworkset.spi.remote.wsclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2013-11-12T14:21:57.234+08:00
 * Generated source version: 2.7.6
 * 
 */
@WebService(targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style", name = "ZWS_FI_FYKZ_V1")
@XmlSeeAlso({ObjectFactory.class})
public interface ZWSFIFYKZV1 {

    @RequestWrapper(localName = "ZfmFiFykzV1", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style", className = "org.frameworkset.spi.remote.wsclient.ZfmFiFykzV1")
    @WebMethod(operationName = "ZfmFiFykzV1")
    @ResponseWrapper(localName = "ZfmFiFykzV1Response", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style", className = "org.frameworkset.spi.remote.wsclient.ZfmFiFykzV1Response")
    public void zfmFiFykzV1(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Fi00O06", targetNamespace = "")
        javax.xml.ws.Holder<TableOfZstFykz> fi00O06,
        @WebParam(name = "IFuncArea", targetNamespace = "")
        java.lang.String iFuncArea,
        @WebParam(name = "IPstngDate", targetNamespace = "")
        java.lang.String iPstngDate,
        @WebParam(name = "ITxtlg", targetNamespace = "")
        java.lang.String iTxtlg,
        @WebParam(mode = WebParam.Mode.OUT, name = "OFuncArea", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> oFuncArea,
        @WebParam(mode = WebParam.Mode.OUT, name = "OPstngDate", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> oPstngDate,
        @WebParam(mode = WebParam.Mode.OUT, name = "OTxtlg", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> oTxtlg
    );
}
