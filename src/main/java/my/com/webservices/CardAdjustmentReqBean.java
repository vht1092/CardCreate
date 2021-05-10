/**
 * CardAdjustmentReqBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package my.com.webservices;

public class CardAdjustmentReqBean  implements java.io.Serializable {
    private java.lang.String actInd;

    private java.lang.String adjCde;

    private java.lang.String fi;

    private java.lang.String pan;

    private java.lang.String sequenceNo;

    private java.lang.String adjAmt;

    private java.lang.String brchCde;

    private java.lang.String merchantId;

    private java.lang.String termId;

    private java.lang.String officerId;

    private java.lang.String remarks;

    public CardAdjustmentReqBean() {
    }

    public CardAdjustmentReqBean(
           java.lang.String actInd,
           java.lang.String adjCde,
           java.lang.String fi,
           java.lang.String pan,
           java.lang.String sequenceNo,
           java.lang.String adjAmt,
           java.lang.String brchCde,
           java.lang.String merchantId,
           java.lang.String termId,
           java.lang.String officerId,
           java.lang.String remarks) {
           this.actInd = actInd;
           this.adjCde = adjCde;
           this.fi = fi;
           this.pan = pan;
           this.sequenceNo = sequenceNo;
           this.adjAmt = adjAmt;
           this.brchCde = brchCde;
           this.merchantId = merchantId;
           this.termId = termId;
           this.officerId = officerId;
           this.remarks = remarks;
    }


    /**
     * Gets the actInd value for this CardAdjustmentReqBean.
     * 
     * @return actInd
     */
    public java.lang.String getActInd() {
        return actInd;
    }


    /**
     * Sets the actInd value for this CardAdjustmentReqBean.
     * 
     * @param actInd
     */
    public void setActInd(java.lang.String actInd) {
        this.actInd = actInd;
    }


    /**
     * Gets the adjCde value for this CardAdjustmentReqBean.
     * 
     * @return adjCde
     */
    public java.lang.String getAdjCde() {
        return adjCde;
    }


    /**
     * Sets the adjCde value for this CardAdjustmentReqBean.
     * 
     * @param adjCde
     */
    public void setAdjCde(java.lang.String adjCde) {
        this.adjCde = adjCde;
    }


    /**
     * Gets the fi value for this CardAdjustmentReqBean.
     * 
     * @return fi
     */
    public java.lang.String getFi() {
        return fi;
    }


    /**
     * Sets the fi value for this CardAdjustmentReqBean.
     * 
     * @param fi
     */
    public void setFi(java.lang.String fi) {
        this.fi = fi;
    }


    /**
     * Gets the pan value for this CardAdjustmentReqBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this CardAdjustmentReqBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }


    /**
     * Gets the sequenceNo value for this CardAdjustmentReqBean.
     * 
     * @return sequenceNo
     */
    public java.lang.String getSequenceNo() {
        return sequenceNo;
    }


    /**
     * Sets the sequenceNo value for this CardAdjustmentReqBean.
     * 
     * @param sequenceNo
     */
    public void setSequenceNo(java.lang.String sequenceNo) {
        this.sequenceNo = sequenceNo;
    }


    /**
     * Gets the adjAmt value for this CardAdjustmentReqBean.
     * 
     * @return adjAmt
     */
    public java.lang.String getAdjAmt() {
        return adjAmt;
    }


    /**
     * Sets the adjAmt value for this CardAdjustmentReqBean.
     * 
     * @param adjAmt
     */
    public void setAdjAmt(java.lang.String adjAmt) {
        this.adjAmt = adjAmt;
    }


    /**
     * Gets the brchCde value for this CardAdjustmentReqBean.
     * 
     * @return brchCde
     */
    public java.lang.String getBrchCde() {
        return brchCde;
    }


    /**
     * Sets the brchCde value for this CardAdjustmentReqBean.
     * 
     * @param brchCde
     */
    public void setBrchCde(java.lang.String brchCde) {
        this.brchCde = brchCde;
    }


    /**
     * Gets the merchantId value for this CardAdjustmentReqBean.
     * 
     * @return merchantId
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this CardAdjustmentReqBean.
     * 
     * @param merchantId
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the termId value for this CardAdjustmentReqBean.
     * 
     * @return termId
     */
    public java.lang.String getTermId() {
        return termId;
    }


    /**
     * Sets the termId value for this CardAdjustmentReqBean.
     * 
     * @param termId
     */
    public void setTermId(java.lang.String termId) {
        this.termId = termId;
    }


    /**
     * Gets the officerId value for this CardAdjustmentReqBean.
     * 
     * @return officerId
     */
    public java.lang.String getOfficerId() {
        return officerId;
    }


    /**
     * Sets the officerId value for this CardAdjustmentReqBean.
     * 
     * @param officerId
     */
    public void setOfficerId(java.lang.String officerId) {
        this.officerId = officerId;
    }


    /**
     * Gets the remarks value for this CardAdjustmentReqBean.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this CardAdjustmentReqBean.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardAdjustmentReqBean)) return false;
        CardAdjustmentReqBean other = (CardAdjustmentReqBean) obj;
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
            ((this.adjCde==null && other.getAdjCde()==null) || 
             (this.adjCde!=null &&
              this.adjCde.equals(other.getAdjCde()))) &&
            ((this.fi==null && other.getFi()==null) || 
             (this.fi!=null &&
              this.fi.equals(other.getFi()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan()))) &&
            ((this.sequenceNo==null && other.getSequenceNo()==null) || 
             (this.sequenceNo!=null &&
              this.sequenceNo.equals(other.getSequenceNo()))) &&
            ((this.adjAmt==null && other.getAdjAmt()==null) || 
             (this.adjAmt!=null &&
              this.adjAmt.equals(other.getAdjAmt()))) &&
            ((this.brchCde==null && other.getBrchCde()==null) || 
             (this.brchCde!=null &&
              this.brchCde.equals(other.getBrchCde()))) &&
            ((this.merchantId==null && other.getMerchantId()==null) || 
             (this.merchantId!=null &&
              this.merchantId.equals(other.getMerchantId()))) &&
            ((this.termId==null && other.getTermId()==null) || 
             (this.termId!=null &&
              this.termId.equals(other.getTermId()))) &&
            ((this.officerId==null && other.getOfficerId()==null) || 
             (this.officerId!=null &&
              this.officerId.equals(other.getOfficerId()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks())));
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
        if (getAdjCde() != null) {
            _hashCode += getAdjCde().hashCode();
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
        if (getAdjAmt() != null) {
            _hashCode += getAdjAmt().hashCode();
        }
        if (getBrchCde() != null) {
            _hashCode += getBrchCde().hashCode();
        }
        if (getMerchantId() != null) {
            _hashCode += getMerchantId().hashCode();
        }
        if (getTermId() != null) {
            _hashCode += getTermId().hashCode();
        }
        if (getOfficerId() != null) {
            _hashCode += getOfficerId().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardAdjustmentReqBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardAdjustmentReqBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actInd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjCde");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjCde"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brchCde");
        elemField.setXmlName(new javax.xml.namespace.QName("", "brchCde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "merchantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "termId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remarks"));
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
