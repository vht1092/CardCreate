/**
 * CardworksServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package my.com.webservices;

import com.vaadin.server.VaadinServlet;
import com.wscw.SpringConfigurationValueHelper;
import com.wscw.SpringContextHelper;

public class CardworksServiceLocator extends org.apache.axis.client.Service implements my.com.webservices.CardworksService {

    public CardworksServiceLocator() {
    }
    


    public CardworksServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CardworksServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }
    
    // Use to get a proxy class for Cardworks
    private java.lang.String Cardworks_address = "";

    public java.lang.String getCardworksAddress() {
        return Cardworks_address;
    }
    
    

    public void setCardworksAddress(java.lang.String cardworks_address) {
		Cardworks_address = cardworks_address;
	}

	// The WSDD service name defaults to the port name.
    private java.lang.String CardworksWSDDServiceName = "Cardworks";

    public java.lang.String getCardworksWSDDServiceName() {
        return CardworksWSDDServiceName;
    }

    public void setCardworksWSDDServiceName(java.lang.String name) {
        CardworksWSDDServiceName = name;
    }

    public my.com.webservices.Cardworks_PortType getCardworks() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Cardworks_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCardworks(endpoint);
    }

    public my.com.webservices.Cardworks_PortType getCardworks(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            my.com.webservices.CardworksSoapBindingStub _stub = new my.com.webservices.CardworksSoapBindingStub(portAddress, this);
            _stub.setPortName(getCardworksWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCardworksEndpointAddress(java.lang.String address) {
        Cardworks_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (my.com.webservices.Cardworks_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                my.com.webservices.CardworksSoapBindingStub _stub = new my.com.webservices.CardworksSoapBindingStub(new java.net.URL(Cardworks_address), this);
                _stub.setPortName(getCardworksWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Cardworks".equals(inputPortName)) {
            return getCardworks();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:webservices.com.my", "CardworksService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:webservices.com.my", "Cardworks"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Cardworks".equals(portName)) {
            setCardworksEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
