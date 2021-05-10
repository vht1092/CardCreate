/**
 * DirectDebitReqBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package my.com.webservices;

public class DirectDebitReqBean  implements java.io.Serializable {
    private java.lang.String amount;

    private java.lang.String currencyCode;

    private java.lang.String cvv2;

    private java.lang.String expiryDate;

    private java.lang.String fi;

    private java.lang.String mid;

    private java.lang.String pan;

    private java.lang.String referenceNo;

    private java.lang.String sequenceNo;

    private java.lang.String tid;

    private java.lang.String trxDate;

    private java.lang.String trxTime;

    private java.lang.String actInd;

    private java.lang.String merName;

    public DirectDebitReqBean() {
    }

    public DirectDebitReqBean(
           java.lang.String amount,
           java.lang.String currencyCode,
           java.lang.String cvv2,
           java.lang.String expiryDate,
           java.lang.String fi,
           java.lang.String mid,
           java.lang.String pan,
           java.lang.String referenceNo,
           java.lang.String sequenceNo,
           java.lang.String tid,
           java.lang.String trxDate,
           java.lang.String trxTime,
           java.lang.String actInd,
           java.lang.String merName) {
           this.amount = amount;
           this.currencyCode = currencyCode;
           this.cvv2 = cvv2;
           this.expiryDate = expiryDate;
           this.fi = fi;
           this.mid = mid;
           this.pan = pan;
           this.referenceNo = referenceNo;
           this.sequenceNo = sequenceNo;
           this.tid = tid;
           this.trxDate = trxDate;
           this.trxTime = trxTime;
           this.actInd = actInd;
           this.merName = merName;
    }


    /**
     * Gets the amount value for this DirectDebitReqBean.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this DirectDebitReqBean.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the currencyCode value for this DirectDebitReqBean.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this DirectDebitReqBean.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the cvv2 value for this DirectDebitReqBean.
     * 
     * @return cvv2
     */
    public java.lang.String getCvv2() {
        return cvv2;
    }


    /**
     * Sets the cvv2 value for this DirectDebitReqBean.
     * 
     * @param cvv2
     */
    public void setCvv2(java.lang.String cvv2) {
        this.cvv2 = cvv2;
    }


    /**
     * Gets the expiryDate value for this DirectDebitReqBean.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this DirectDebitReqBean.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the fi value for this DirectDebitReqBean.
     * 
     * @return fi
     */
    public java.lang.String getFi() {
        return fi;
    }


    /**
     * Sets the fi value for this DirectDebitReqBean.
     * 
     * @param fi
     */
    public void setFi(java.lang.String fi) {
        this.fi = fi;
    }


    /**
     * Gets the mid value for this DirectDebitReqBean.
     * 
     * @return mid
     */
    public java.lang.String getMid() {
        return mid;
    }


    /**
     * Sets the mid value for this DirectDebitReqBean.
     * 
     * @param mid
     */
    public void setMid(java.lang.String mid) {
        this.mid = mid;
    }


    /**
     * Gets the pan value for this DirectDebitReqBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this DirectDebitReqBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }


    /**
     * Gets the referenceNo value for this DirectDebitReqBean.
     * 
     * @return referenceNo
     */
    public java.lang.String getReferenceNo() {
        return referenceNo;
    }


    /**
     * Sets the referenceNo value for this DirectDebitReqBean.
     * 
     * @param referenceNo
     */
    public void setReferenceNo(java.lang.String referenceNo) {
        this.referenceNo = referenceNo;
    }


    /**
     * Gets the sequenceNo value for this DirectDebitReqBean.
     * 
     * @return sequenceNo
     */
    public java.lang.String getSequenceNo() {
        return sequenceNo;
    }


    /**
     * Sets the sequenceNo value for this DirectDebitReqBean.
     * 
     * @param sequenceNo
     */
    public void setSequenceNo(java.lang.String sequenceNo) {
        this.sequenceNo = sequenceNo;
    }


    /**
     * Gets the tid value for this DirectDebitReqBean.
     * 
     * @return tid
     */
    public java.lang.String getTid() {
        return tid;
    }


    /**
     * Sets the tid value for this DirectDebitReqBean.
     * 
     * @param tid
     */
    public void setTid(java.lang.String tid) {
        this.tid = tid;
    }


    /**
     * Gets the trxDate value for this DirectDebitReqBean.
     * 
     * @return trxDate
     */
    public java.lang.String getTrxDate() {
        return trxDate;
    }


    /**
     * Sets the trxDate value for this DirectDebitReqBean.
     * 
     * @param trxDate
     */
    public void setTrxDate(java.lang.String trxDate) {
        this.trxDate = trxDate;
    }


    /**
     * Gets the trxTime value for this DirectDebitReqBean.
     * 
     * @return trxTime
     */
    public java.lang.String getTrxTime() {
        return trxTime;
    }


    /**
     * Sets the trxTime value for this DirectDebitReqBean.
     * 
     * @param trxTime
     */
    public void setTrxTime(java.lang.String trxTime) {
        this.trxTime = trxTime;
    }


    /**
     * Gets the actInd value for this DirectDebitReqBean.
     * 
     * @return actInd
     */
    public java.lang.String getActInd() {
        return actInd;
    }


    /**
     * Sets the actInd value for this DirectDebitReqBean.
     * 
     * @param actInd
     */
    public void setActInd(java.lang.String actInd) {
        this.actInd = actInd;
    }


    /**
     * Gets the merName value for this DirectDebitReqBean.
     * 
     * @return merName
     */
    public java.lang.String getMerName() {
        return merName;
    }


    /**
     * Sets the merName value for this DirectDebitReqBean.
     * 
     * @param merName
     */
    public void setMerName(java.lang.String merName) {
        this.merName = merName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DirectDebitReqBean)) return false;
        DirectDebitReqBean other = (DirectDebitReqBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.cvv2==null && other.getCvv2()==null) || 
             (this.cvv2!=null &&
              this.cvv2.equals(other.getCvv2()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.fi==null && other.getFi()==null) || 
             (this.fi!=null &&
              this.fi.equals(other.getFi()))) &&
            ((this.mid==null && other.getMid()==null) || 
             (this.mid!=null &&
              this.mid.equals(other.getMid()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan()))) &&
            ((this.referenceNo==null && other.getReferenceNo()==null) || 
             (this.referenceNo!=null &&
              this.referenceNo.equals(other.getReferenceNo()))) &&
            ((this.sequenceNo==null && other.getSequenceNo()==null) || 
             (this.sequenceNo!=null &&
              this.sequenceNo.equals(other.getSequenceNo()))) &&
            ((this.tid==null && other.getTid()==null) || 
             (this.tid!=null &&
              this.tid.equals(other.getTid()))) &&
            ((this.trxDate==null && other.getTrxDate()==null) || 
             (this.trxDate!=null &&
              this.trxDate.equals(other.getTrxDate()))) &&
            ((this.trxTime==null && other.getTrxTime()==null) || 
             (this.trxTime!=null &&
              this.trxTime.equals(other.getTrxTime()))) &&
            ((this.actInd==null && other.getActInd()==null) || 
             (this.actInd!=null &&
              this.actInd.equals(other.getActInd()))) &&
            ((this.merName==null && other.getMerName()==null) || 
             (this.merName!=null &&
              this.merName.equals(other.getMerName())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getCvv2() != null) {
            _hashCode += getCvv2().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getFi() != null) {
            _hashCode += getFi().hashCode();
        }
        if (getMid() != null) {
            _hashCode += getMid().hashCode();
        }
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        if (getReferenceNo() != null) {
            _hashCode += getReferenceNo().hashCode();
        }
        if (getSequenceNo() != null) {
            _hashCode += getSequenceNo().hashCode();
        }
        if (getTid() != null) {
            _hashCode += getTid().hashCode();
        }
        if (getTrxDate() != null) {
            _hashCode += getTrxDate().hashCode();
        }
        if (getTrxTime() != null) {
            _hashCode += getTrxTime().hashCode();
        }
        if (getActInd() != null) {
            _hashCode += getActInd().hashCode();
        }
        if (getMerName() != null) {
            _hashCode += getMerName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DirectDebitReqBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "DirectDebitReqBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvv2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cvv2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequenceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trxDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trxDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trxTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trxTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actInd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "merName"));
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
