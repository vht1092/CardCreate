/**
 * RewardEnquiryRespBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package my.com.webservices;

public class RewardEnquiryRespBean  implements java.io.Serializable {
    private java.lang.String crn;

    private java.lang.String responseCode;

    private java.lang.String responseDescription;

    private my.com.webservices.RewardEnquiryPanItems[] rewardEnquiryPanItems;

    private java.lang.String sequenceNo;

    public RewardEnquiryRespBean() {
    }

    public RewardEnquiryRespBean(
           java.lang.String crn,
           java.lang.String responseCode,
           java.lang.String responseDescription,
           my.com.webservices.RewardEnquiryPanItems[] rewardEnquiryPanItems,
           java.lang.String sequenceNo) {
           this.crn = crn;
           this.responseCode = responseCode;
           this.responseDescription = responseDescription;
           this.rewardEnquiryPanItems = rewardEnquiryPanItems;
           this.sequenceNo = sequenceNo;
    }


    /**
     * Gets the crn value for this RewardEnquiryRespBean.
     * 
     * @return crn
     */
    public java.lang.String getCrn() {
        return crn;
    }


    /**
     * Sets the crn value for this RewardEnquiryRespBean.
     * 
     * @param crn
     */
    public void setCrn(java.lang.String crn) {
        this.crn = crn;
    }


    /**
     * Gets the responseCode value for this RewardEnquiryRespBean.
     * 
     * @return responseCode
     */
    public java.lang.String getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this RewardEnquiryRespBean.
     * 
     * @param responseCode
     */
    public void setResponseCode(java.lang.String responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the responseDescription value for this RewardEnquiryRespBean.
     * 
     * @return responseDescription
     */
    public java.lang.String getResponseDescription() {
        return responseDescription;
    }


    /**
     * Sets the responseDescription value for this RewardEnquiryRespBean.
     * 
     * @param responseDescription
     */
    public void setResponseDescription(java.lang.String responseDescription) {
        this.responseDescription = responseDescription;
    }


    /**
     * Gets the rewardEnquiryPanItems value for this RewardEnquiryRespBean.
     * 
     * @return rewardEnquiryPanItems
     */
    public my.com.webservices.RewardEnquiryPanItems[] getRewardEnquiryPanItems() {
        return rewardEnquiryPanItems;
    }


    /**
     * Sets the rewardEnquiryPanItems value for this RewardEnquiryRespBean.
     * 
     * @param rewardEnquiryPanItems
     */
    public void setRewardEnquiryPanItems(my.com.webservices.RewardEnquiryPanItems[] rewardEnquiryPanItems) {
        this.rewardEnquiryPanItems = rewardEnquiryPanItems;
    }


    /**
     * Gets the sequenceNo value for this RewardEnquiryRespBean.
     * 
     * @return sequenceNo
     */
    public java.lang.String getSequenceNo() {
        return sequenceNo;
    }


    /**
     * Sets the sequenceNo value for this RewardEnquiryRespBean.
     * 
     * @param sequenceNo
     */
    public void setSequenceNo(java.lang.String sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RewardEnquiryRespBean)) return false;
        RewardEnquiryRespBean other = (RewardEnquiryRespBean) obj;
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
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode()))) &&
            ((this.responseDescription==null && other.getResponseDescription()==null) || 
             (this.responseDescription!=null &&
              this.responseDescription.equals(other.getResponseDescription()))) &&
            ((this.rewardEnquiryPanItems==null && other.getRewardEnquiryPanItems()==null) || 
             (this.rewardEnquiryPanItems!=null &&
              java.util.Arrays.equals(this.rewardEnquiryPanItems, other.getRewardEnquiryPanItems()))) &&
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
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        if (getResponseDescription() != null) {
            _hashCode += getResponseDescription().hashCode();
        }
        if (getRewardEnquiryPanItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRewardEnquiryPanItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRewardEnquiryPanItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSequenceNo() != null) {
            _hashCode += getSequenceNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RewardEnquiryRespBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "RewardEnquiryRespBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crn"));
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
        elemField.setFieldName("rewardEnquiryPanItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rewardEnquiryPanItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "RewardEnquiryPanItems"));
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
