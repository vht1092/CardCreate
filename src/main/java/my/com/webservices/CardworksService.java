/**
 * CardworksService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package my.com.webservices;

public interface CardworksService extends javax.xml.rpc.Service {
    public java.lang.String getCardworksAddress();

    public my.com.webservices.Cardworks_PortType getCardworks() throws javax.xml.rpc.ServiceException;

    public my.com.webservices.Cardworks_PortType getCardworks(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
