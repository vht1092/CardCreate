/**
 * PINSelectionReqBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package my.com.webservices;

public class PINSelectionReqBean  implements java.io.Serializable {
    private java.lang.String fi;

    private java.lang.String actInd;

    private java.lang.String pan;

    private java.lang.String mobileNo;

    private java.lang.String newPIN;

    private java.lang.String sequenceNo;

    public PINSelectionReqBean() {
    }

    public PINSelectionReqBean(
           java.lang.String fi,
           java.lang.String actInd,
           java.lang.String pan,
           java.lang.String mobileNo,
           java.lang.String newPIN,
           java.lang.String sequenceNo) {
           this.fi = fi;
           this.actInd = actInd;
           this.pan = pan;
           this.mobileNo = mobileNo;
           this.newPIN = newPIN;
           this.sequenceNo = sequenceNo;
    }


    /**
     * Gets the fi value for this PINSelectionReqBean.
     * 
     * @return fi
     */
    public java.lang.String getFi() {
        return fi;
    }


    /**
     * Sets the fi value for this PINSelectionReqBean.
     * 
     * @param fi
     */
    public void setFi(java.lang.String fi) {
        this.fi = fi;
    }


    /**
     * Gets the actInd value for this PINSelectionReqBean.
     * 
     * @return actInd
     */
    public java.lang.String getActInd() {
        return actInd;
    }


    /**
     * Sets the actInd value for this PINSelectionReqBean.
     * 
     * @param actInd
     */
    public void setActInd(java.lang.String actInd) {
        this.actInd = actInd;
    }


    /**
     * Gets the pan value for this PINSelectionReqBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this PINSelectionReqBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }


    /**
     * Gets the mobileNo value for this PINSelectionReqBean.
     * 
     * @return mobileNo
     */
    public java.lang.String getMobileNo() {
        return mobileNo;
    }


    /**
     * Sets the mobileNo value for this PINSelectionReqBean.
     * 
     * @param mobileNo
     */
    public void setMobileNo(java.lang.String mobileNo) {
        this.mobileNo = mobileNo;
    }


    /**
     * Gets the newPIN value for this PINSelectionReqBean.
     * 
     * @return newPIN
     */
    public java.lang.String getNewPIN() {
        return newPIN;
    }


    /**
     * Sets the newPIN value for this PINSelectionReqBean.
     * 
     * @param newPIN
     */
    public void setNewPIN(java.lang.String newPIN) {
        this.newPIN = newPIN;
    }


    /**
     * Gets the sequenceNo value for this PINSelectionReqBean.
     * 
     * @return sequenceNo
     */
    public java.lang.String getSequenceNo() {
        return sequenceNo;
    }


    /**
     * Sets the sequenceNo value for this PINSelectionReqBean.
     * 
     * @param sequenceNo
     */
    public void setSequenceNo(java.lang.String sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PINSelectionReqBean)) return false;
        PINSelectionReqBean other = (PINSelectionReqBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fi==null && other.getFi()==null) || 
             (this.fi!=null &&
              this.fi.equals(other.getFi()))) &&
            ((this.actInd==null && other.getActInd()==null) || 
             (this.actInd!=null &&
              this.actInd.equals(other.getActInd()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan()))) &&
            ((this.mobileNo==null && other.getMobileNo()==null) || 
             (this.mobileNo!=null &&
              this.mobileNo.equals(other.getMobileNo()))) &&
            ((this.newPIN==null && other.getNewPIN()==null) || 
             (this.newPIN!=null &&
              this.newPIN.equals(other.getNewPIN()))) &&
            ((this.sequenceNo==null && other.getSequenceNo()==null) || 
             (this.sequenceNo!=null &&
              this.sequenceNo.equals(other.getSequenceNo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFi() != null) {
            _hashCode += getFi().hashCode();
        }
        if (getActInd() != null) {
            _hashCode += getActInd().hashCode();
        }
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        if (getMobileNo() != null) {
            _hashCode += getMobileNo().hashCode();
        }
        if (getNewPIN() != null) {
            _hashCode += getNewPIN().hashCode();
        }
        if (getSequenceNo() != null) {
            _hashCode += getSequenceNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PINSelectionReqBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "PINSelectionReqBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actInd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobileNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPIN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newPIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequenceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
