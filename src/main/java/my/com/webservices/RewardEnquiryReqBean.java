/**
 * RewardEnquiryReqBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package my.com.webservices;

public class RewardEnquiryReqBean  implements java.io.Serializable {
    private java.lang.String crn;

    private java.lang.String fi;

    private java.lang.String sequenceNo;

    public RewardEnquiryReqBean() {
    }

    public RewardEnquiryReqBean(
           java.lang.String crn,
           java.lang.String fi,
           java.lang.String sequenceNo) {
           this.crn = crn;
           this.fi = fi;
           this.sequenceNo = sequenceNo;
    }


    /**
     * Gets the crn value for this RewardEnquiryReqBean.
     * 
     * @return crn
     */
    public java.lang.String getCrn() {
        return crn;
    }


    /**
     * Sets the crn value for this RewardEnquiryReqBean.
     * 
     * @param crn
     */
    public void setCrn(java.lang.String crn) {
        this.crn = crn;
    }


    /**
     * Gets the fi value for this RewardEnquiryReqBean.
     * 
     * @return fi
     */
    public java.lang.String getFi() {
        return fi;
    }


    /**
     * Sets the fi value for this RewardEnquiryReqBean.
     * 
     * @param fi
     */
    public void setFi(java.lang.String fi) {
        this.fi = fi;
    }


    /**
     * Gets the sequenceNo value for this RewardEnquiryReqBean.
     * 
     * @return sequenceNo
     */
    public java.lang.String getSequenceNo() {
        return sequenceNo;
    }


    /**
     * Sets the sequenceNo value for this RewardEnquiryReqBean.
     * 
     * @param sequenceNo
     */
    public void setSequenceNo(java.lang.String sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RewardEnquiryReqBean)) return false;
        RewardEnquiryReqBean other = (RewardEnquiryReqBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.crn==null && other.getCrn()==null) || 
             (this.crn!=null &&
              this.crn.equals(other.getCrn()))) &&
            ((this.fi==null && other.getFi()==null) || 
             (this.fi!=null &&
              this.fi.equals(other.getFi()))) &&
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
        if (getCrn() != null) {
            _hashCode += getCrn().hashCode();
        }
        if (getFi() != null) {
            _hashCode += getFi().hashCode();
        }
        if (getSequenceNo() != null) {
            _hashCode += getSequenceNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RewardEnquiryReqBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "RewardEnquiryReqBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crn"));
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
