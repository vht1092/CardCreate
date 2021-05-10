/**
 * CardProfileMaintReqBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package my.com.webservices;

public class CardProfileMaintReqBean  implements java.io.Serializable {
    private java.lang.String actInd;

    private java.lang.String actCde;

    private java.lang.String actType;

    private java.lang.String fi;

    private java.lang.String pan;

    private java.lang.String sequenceNo;

    public CardProfileMaintReqBean() {
    }

    public CardProfileMaintReqBean(
           java.lang.String actInd,
           java.lang.String actCde,
           java.lang.String actType,
           java.lang.String fi,
           java.lang.String pan,
           java.lang.String sequenceNo) {
           this.actInd = actInd;
           this.actCde = actCde;
           this.actType = actType;
           this.fi = fi;
           this.pan = pan;
           this.sequenceNo = sequenceNo;
    }


    /**
     * Gets the actInd value for this CardProfileMaintReqBean.
     * 
     * @return actInd
     */
    public java.lang.String getActInd() {
        return actInd;
    }


    /**
     * Sets the actInd value for this CardProfileMaintReqBean.
     * 
     * @param actInd
     */
    public void setActInd(java.lang.String actInd) {
        this.actInd = actInd;
    }


    /**
     * Gets the actCde value for this CardProfileMaintReqBean.
     * 
     * @return actCde
     */
    public java.lang.String getActCde() {
        return actCde;
    }


    /**
     * Sets the actCde value for this CardProfileMaintReqBean.
     * 
     * @param actCde
     */
    public void setActCde(java.lang.String actCde) {
        this.actCde = actCde;
    }


    /**
     * Gets the actType value for this CardProfileMaintReqBean.
     * 
     * @return actType
     */
    public java.lang.String getActType() {
        return actType;
    }


    /**
     * Sets the actType value for this CardProfileMaintReqBean.
     * 
     * @param actType
     */
    public void setActType(java.lang.String actType) {
        this.actType = actType;
    }


    /**
     * Gets the fi value for this CardProfileMaintReqBean.
     * 
     * @return fi
     */
    public java.lang.String getFi() {
        return fi;
    }


    /**
     * Sets the fi value for this CardProfileMaintReqBean.
     * 
     * @param fi
     */
    public void setFi(java.lang.String fi) {
        this.fi = fi;
    }


    /**
     * Gets the pan value for this CardProfileMaintReqBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this CardProfileMaintReqBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }


    /**
     * Gets the sequenceNo value for this CardProfileMaintReqBean.
     * 
     * @return sequenceNo
     */
    public java.lang.String getSequenceNo() {
        return sequenceNo;
    }


    /**
     * Sets the sequenceNo value for this CardProfileMaintReqBean.
     * 
     * @param sequenceNo
     */
    public void setSequenceNo(java.lang.String sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardProfileMaintReqBean)) return false;
        CardProfileMaintReqBean other = (CardProfileMaintReqBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actInd==null && other.getActInd()==null) || 
             (this.actInd!=null &&
              this.actInd.equals(other.getActInd()))) &&
            ((this.actCde==null && other.getActCde()==null) || 
             (this.actCde!=null &&
              this.actCde.equals(other.getActCde()))) &&
            ((this.actType==null && other.getActType()==null) || 
             (this.actType!=null &&
              this.actType.equals(other.getActType()))) &&
            ((this.fi==null && other.getFi()==null) || 
             (this.fi!=null &&
              this.fi.equals(other.getFi()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan()))) &&
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
        if (getActInd() != null) {
            _hashCode += getActInd().hashCode();
        }
        if (getActCde() != null) {
            _hashCode += getActCde().hashCode();
        }
        if (getActType() != null) {
            _hashCode += getActType().hashCode();
        }
        if (getFi() != null) {
            _hashCode += getFi().hashCode();
        }
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        if (getSequenceNo() != null) {
            _hashCode += getSequenceNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardProfileMaintReqBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardProfileMaintReqBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actInd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actCde");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actCde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
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
