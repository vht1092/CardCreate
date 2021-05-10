/**
 * CardReloadRespBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package my.com.webservices;

public class CardReloadRespBean  implements java.io.Serializable {
    private java.lang.String approvalCode;

    private java.lang.String latestBalance;

    private java.lang.String responseCode;

    private java.lang.String responseDescription;

    private java.lang.String sequenceNo;

    public CardReloadRespBean() {
    }

    public CardReloadRespBean(
           java.lang.String approvalCode,
           java.lang.String latestBalance,
           java.lang.String responseCode,
           java.lang.String responseDescription,
           java.lang.String sequenceNo) {
           this.approvalCode = approvalCode;
           this.latestBalance = latestBalance;
           this.responseCode = responseCode;
           this.responseDescription = responseDescription;
           this.sequenceNo = sequenceNo;
    }


    /**
     * Gets the approvalCode value for this CardReloadRespBean.
     * 
     * @return approvalCode
     */
    public java.lang.String getApprovalCode() {
        return approvalCode;
    }


    /**
     * Sets the approvalCode value for this CardReloadRespBean.
     * 
     * @param approvalCode
     */
    public void setApprovalCode(java.lang.String approvalCode) {
        this.approvalCode = approvalCode;
    }


    /**
     * Gets the latestBalance value for this CardReloadRespBean.
     * 
     * @return latestBalance
     */
    public java.lang.String getLatestBalance() {
        return latestBalance;
    }


    /**
     * Sets the latestBalance value for this CardReloadRespBean.
     * 
     * @param latestBalance
     */
    public void setLatestBalance(java.lang.String latestBalance) {
        this.latestBalance = latestBalance;
    }


    /**
     * Gets the responseCode value for this CardReloadRespBean.
     * 
     * @return responseCode
     */
    public java.lang.String getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this CardReloadRespBean.
     * 
     * @param responseCode
     */
    public void setResponseCode(java.lang.String responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the responseDescription value for this CardReloadRespBean.
     * 
     * @return responseDescription
     */
    public java.lang.String getResponseDescription() {
        return responseDescription;
    }


    /**
     * Sets the responseDescription value for this CardReloadRespBean.
     * 
     * @param responseDescription
     */
    public void setResponseDescription(java.lang.String responseDescription) {
        this.responseDescription = responseDescription;
    }


    /**
     * Gets the sequenceNo value for this CardReloadRespBean.
     * 
     * @return sequenceNo
     */
    public java.lang.String getSequenceNo() {
        return sequenceNo;
    }


    /**
     * Sets the sequenceNo value for this CardReloadRespBean.
     * 
     * @param sequenceNo
     */
    public void setSequenceNo(java.lang.String sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardReloadRespBean)) return false;
        CardReloadRespBean other = (CardReloadRespBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.approvalCode==null && other.getApprovalCode()==null) || 
             (this.approvalCode!=null &&
              this.approvalCode.equals(other.getApprovalCode()))) &&
            ((this.latestBalance==null && other.getLatestBalance()==null) || 
             (this.latestBalance!=null &&
              this.latestBalance.equals(other.getLatestBalance()))) &&
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode()))) &&
            ((this.responseDescription==null && other.getResponseDescription()==null) || 
             (this.responseDescription!=null &&
              this.responseDescription.equals(other.getResponseDescription()))) &&
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
        if (getApprovalCode() != null) {
            _hashCode += getApprovalCode().hashCode();
        }
        if (getLatestBalance() != null) {
            _hashCode += getLatestBalance().hashCode();
        }
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        if (getResponseDescription() != null) {
            _hashCode += getResponseDescription().hashCode();
        }
        if (getSequenceNo() != null) {
            _hashCode += getSequenceNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardReloadRespBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardReloadRespBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approvalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latestBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "latestBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseDescription"));
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
