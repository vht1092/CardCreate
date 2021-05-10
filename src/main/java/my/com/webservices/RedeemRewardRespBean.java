/**
 * RedeemRewardRespBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package my.com.webservices;

public class RedeemRewardRespBean  implements java.io.Serializable {
    private java.lang.String crn;

    private java.lang.String pointAdjustment;

    private java.lang.String pointAvailable;

    private java.lang.String pointCarriedForward;

    private java.lang.String pointEarnThisMonth;

    private java.lang.String pointRedeemed;

    private java.lang.String responseCode;

    private java.lang.String responseDescription;

    private java.lang.String sequenceNo;

    private java.lang.String pan;

    public RedeemRewardRespBean() {
    }

    public RedeemRewardRespBean(
           java.lang.String crn,
           java.lang.String pointAdjustment,
           java.lang.String pointAvailable,
           java.lang.String pointCarriedForward,
           java.lang.String pointEarnThisMonth,
           java.lang.String pointRedeemed,
           java.lang.String responseCode,
           java.lang.String responseDescription,
           java.lang.String sequenceNo,
           java.lang.String pan) {
           this.crn = crn;
           this.pointAdjustment = pointAdjustment;
           this.pointAvailable = pointAvailable;
           this.pointCarriedForward = pointCarriedForward;
           this.pointEarnThisMonth = pointEarnThisMonth;
           this.pointRedeemed = pointRedeemed;
           this.responseCode = responseCode;
           this.responseDescription = responseDescription;
           this.sequenceNo = sequenceNo;
           this.pan = pan;
    }


    /**
     * Gets the crn value for this RedeemRewardRespBean.
     * 
     * @return crn
     */
    public java.lang.String getCrn() {
        return crn;
    }


    /**
     * Sets the crn value for this RedeemRewardRespBean.
     * 
     * @param crn
     */
    public void setCrn(java.lang.String crn) {
        this.crn = crn;
    }


    /**
     * Gets the pointAdjustment value for this RedeemRewardRespBean.
     * 
     * @return pointAdjustment
     */
    public java.lang.String getPointAdjustment() {
        return pointAdjustment;
    }


    /**
     * Sets the pointAdjustment value for this RedeemRewardRespBean.
     * 
     * @param pointAdjustment
     */
    public void setPointAdjustment(java.lang.String pointAdjustment) {
        this.pointAdjustment = pointAdjustment;
    }


    /**
     * Gets the pointAvailable value for this RedeemRewardRespBean.
     * 
     * @return pointAvailable
     */
    public java.lang.String getPointAvailable() {
        return pointAvailable;
    }


    /**
     * Sets the pointAvailable value for this RedeemRewardRespBean.
     * 
     * @param pointAvailable
     */
    public void setPointAvailable(java.lang.String pointAvailable) {
        this.pointAvailable = pointAvailable;
    }


    /**
     * Gets the pointCarriedForward value for this RedeemRewardRespBean.
     * 
     * @return pointCarriedForward
     */
    public java.lang.String getPointCarriedForward() {
        return pointCarriedForward;
    }


    /**
     * Sets the pointCarriedForward value for this RedeemRewardRespBean.
     * 
     * @param pointCarriedForward
     */
    public void setPointCarriedForward(java.lang.String pointCarriedForward) {
        this.pointCarriedForward = pointCarriedForward;
    }


    /**
     * Gets the pointEarnThisMonth value for this RedeemRewardRespBean.
     * 
     * @return pointEarnThisMonth
     */
    public java.lang.String getPointEarnThisMonth() {
        return pointEarnThisMonth;
    }


    /**
     * Sets the pointEarnThisMonth value for this RedeemRewardRespBean.
     * 
     * @param pointEarnThisMonth
     */
    public void setPointEarnThisMonth(java.lang.String pointEarnThisMonth) {
        this.pointEarnThisMonth = pointEarnThisMonth;
    }


    /**
     * Gets the pointRedeemed value for this RedeemRewardRespBean.
     * 
     * @return pointRedeemed
     */
    public java.lang.String getPointRedeemed() {
        return pointRedeemed;
    }


    /**
     * Sets the pointRedeemed value for this RedeemRewardRespBean.
     * 
     * @param pointRedeemed
     */
    public void setPointRedeemed(java.lang.String pointRedeemed) {
        this.pointRedeemed = pointRedeemed;
    }


    /**
     * Gets the responseCode value for this RedeemRewardRespBean.
     * 
     * @return responseCode
     */
    public java.lang.String getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this RedeemRewardRespBean.
     * 
     * @param responseCode
     */
    public void setResponseCode(java.lang.String responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the responseDescription value for this RedeemRewardRespBean.
     * 
     * @return responseDescription
     */
    public java.lang.String getResponseDescription() {
        return responseDescription;
    }


    /**
     * Sets the responseDescription value for this RedeemRewardRespBean.
     * 
     * @param responseDescription
     */
    public void setResponseDescription(java.lang.String responseDescription) {
        this.responseDescription = responseDescription;
    }


    /**
     * Gets the sequenceNo value for this RedeemRewardRespBean.
     * 
     * @return sequenceNo
     */
    public java.lang.String getSequenceNo() {
        return sequenceNo;
    }


    /**
     * Sets the sequenceNo value for this RedeemRewardRespBean.
     * 
     * @param sequenceNo
     */
    public void setSequenceNo(java.lang.String sequenceNo) {
        this.sequenceNo = sequenceNo;
    }


    /**
     * Gets the pan value for this RedeemRewardRespBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this RedeemRewardRespBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RedeemRewardRespBean)) return false;
        RedeemRewardRespBean other = (RedeemRewardRespBean) obj;
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
            ((this.pointAdjustment==null && other.getPointAdjustment()==null) || 
             (this.pointAdjustment!=null &&
              this.pointAdjustment.equals(other.getPointAdjustment()))) &&
            ((this.pointAvailable==null && other.getPointAvailable()==null) || 
             (this.pointAvailable!=null &&
              this.pointAvailable.equals(other.getPointAvailable()))) &&
            ((this.pointCarriedForward==null && other.getPointCarriedForward()==null) || 
             (this.pointCarriedForward!=null &&
              this.pointCarriedForward.equals(other.getPointCarriedForward()))) &&
            ((this.pointEarnThisMonth==null && other.getPointEarnThisMonth()==null) || 
             (this.pointEarnThisMonth!=null &&
              this.pointEarnThisMonth.equals(other.getPointEarnThisMonth()))) &&
            ((this.pointRedeemed==null && other.getPointRedeemed()==null) || 
             (this.pointRedeemed!=null &&
              this.pointRedeemed.equals(other.getPointRedeemed()))) &&
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode()))) &&
            ((this.responseDescription==null && other.getResponseDescription()==null) || 
             (this.responseDescription!=null &&
              this.responseDescription.equals(other.getResponseDescription()))) &&
            ((this.sequenceNo==null && other.getSequenceNo()==null) || 
             (this.sequenceNo!=null &&
              this.sequenceNo.equals(other.getSequenceNo()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan())));
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
        if (getPointAdjustment() != null) {
            _hashCode += getPointAdjustment().hashCode();
        }
        if (getPointAvailable() != null) {
            _hashCode += getPointAvailable().hashCode();
        }
        if (getPointCarriedForward() != null) {
            _hashCode += getPointCarriedForward().hashCode();
        }
        if (getPointEarnThisMonth() != null) {
            _hashCode += getPointEarnThisMonth().hashCode();
        }
        if (getPointRedeemed() != null) {
            _hashCode += getPointRedeemed().hashCode();
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
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RedeemRewardRespBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "RedeemRewardRespBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pointAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pointAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointCarriedForward");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pointCarriedForward"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointEarnThisMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pointEarnThisMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointRedeemed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pointRedeemed"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pan"));
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
