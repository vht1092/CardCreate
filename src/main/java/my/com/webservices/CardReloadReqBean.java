/**
 * CardReloadReqBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package my.com.webservices;

public class CardReloadReqBean  implements java.io.Serializable {
    private java.lang.String amount;

    private java.lang.String branchCode;

    private java.lang.String currencyCode;

    private java.lang.String expiryDate;

    private java.lang.String fi;

    private java.lang.String pan;

    private java.lang.String referenceNo;

    private java.lang.String reloadMethod;

    private java.lang.String reloadSource;

    private java.lang.String sequenceNo;

    private java.lang.String sourceSystem;

    private java.lang.String src;

    private java.lang.String surchargeFee;

    private java.lang.String surchargeFeeSign;

    private java.lang.String transferorPAN;

    private java.lang.String actInd;

    public CardReloadReqBean() {
    }

    public CardReloadReqBean(
           java.lang.String amount,
           java.lang.String branchCode,
           java.lang.String currencyCode,
           java.lang.String expiryDate,
           java.lang.String fi,
           java.lang.String pan,
           java.lang.String referenceNo,
           java.lang.String reloadMethod,
           java.lang.String reloadSource,
           java.lang.String sequenceNo,
           java.lang.String sourceSystem,
           java.lang.String src,
           java.lang.String surchargeFee,
           java.lang.String surchargeFeeSign,
           java.lang.String transferorPAN,
           java.lang.String actInd) {
           this.amount = amount;
           this.branchCode = branchCode;
           this.currencyCode = currencyCode;
           this.expiryDate = expiryDate;
           this.fi = fi;
           this.pan = pan;
           this.referenceNo = referenceNo;
           this.reloadMethod = reloadMethod;
           this.reloadSource = reloadSource;
           this.sequenceNo = sequenceNo;
           this.sourceSystem = sourceSystem;
           this.src = src;
           this.surchargeFee = surchargeFee;
           this.surchargeFeeSign = surchargeFeeSign;
           this.transferorPAN = transferorPAN;
           this.actInd = actInd;
    }


    /**
     * Gets the amount value for this CardReloadReqBean.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CardReloadReqBean.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the branchCode value for this CardReloadReqBean.
     * 
     * @return branchCode
     */
    public java.lang.String getBranchCode() {
        return branchCode;
    }


    /**
     * Sets the branchCode value for this CardReloadReqBean.
     * 
     * @param branchCode
     */
    public void setBranchCode(java.lang.String branchCode) {
        this.branchCode = branchCode;
    }


    /**
     * Gets the currencyCode value for this CardReloadReqBean.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this CardReloadReqBean.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the expiryDate value for this CardReloadReqBean.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this CardReloadReqBean.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the fi value for this CardReloadReqBean.
     * 
     * @return fi
     */
    public java.lang.String getFi() {
        return fi;
    }


    /**
     * Sets the fi value for this CardReloadReqBean.
     * 
     * @param fi
     */
    public void setFi(java.lang.String fi) {
        this.fi = fi;
    }


    /**
     * Gets the pan value for this CardReloadReqBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this CardReloadReqBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }


    /**
     * Gets the referenceNo value for this CardReloadReqBean.
     * 
     * @return referenceNo
     */
    public java.lang.String getReferenceNo() {
        return referenceNo;
    }


    /**
     * Sets the referenceNo value for this CardReloadReqBean.
     * 
     * @param referenceNo
     */
    public void setReferenceNo(java.lang.String referenceNo) {
        this.referenceNo = referenceNo;
    }


    /**
     * Gets the reloadMethod value for this CardReloadReqBean.
     * 
     * @return reloadMethod
     */
    public java.lang.String getReloadMethod() {
        return reloadMethod;
    }


    /**
     * Sets the reloadMethod value for this CardReloadReqBean.
     * 
     * @param reloadMethod
     */
    public void setReloadMethod(java.lang.String reloadMethod) {
        this.reloadMethod = reloadMethod;
    }


    /**
     * Gets the reloadSource value for this CardReloadReqBean.
     * 
     * @return reloadSource
     */
    public java.lang.String getReloadSource() {
        return reloadSource;
    }


    /**
     * Sets the reloadSource value for this CardReloadReqBean.
     * 
     * @param reloadSource
     */
    public void setReloadSource(java.lang.String reloadSource) {
        this.reloadSource = reloadSource;
    }


    /**
     * Gets the sequenceNo value for this CardReloadReqBean.
     * 
     * @return sequenceNo
     */
    public java.lang.String getSequenceNo() {
        return sequenceNo;
    }


    /**
     * Sets the sequenceNo value for this CardReloadReqBean.
     * 
     * @param sequenceNo
     */
    public void setSequenceNo(java.lang.String sequenceNo) {
        this.sequenceNo = sequenceNo;
    }


    /**
     * Gets the sourceSystem value for this CardReloadReqBean.
     * 
     * @return sourceSystem
     */
    public java.lang.String getSourceSystem() {
        return sourceSystem;
    }


    /**
     * Sets the sourceSystem value for this CardReloadReqBean.
     * 
     * @param sourceSystem
     */
    public void setSourceSystem(java.lang.String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }


    /**
     * Gets the src value for this CardReloadReqBean.
     * 
     * @return src
     */
    public java.lang.String getSrc() {
        return src;
    }


    /**
     * Sets the src value for this CardReloadReqBean.
     * 
     * @param src
     */
    public void setSrc(java.lang.String src) {
        this.src = src;
    }


    /**
     * Gets the surchargeFee value for this CardReloadReqBean.
     * 
     * @return surchargeFee
     */
    public java.lang.String getSurchargeFee() {
        return surchargeFee;
    }


    /**
     * Sets the surchargeFee value for this CardReloadReqBean.
     * 
     * @param surchargeFee
     */
    public void setSurchargeFee(java.lang.String surchargeFee) {
        this.surchargeFee = surchargeFee;
    }


    /**
     * Gets the surchargeFeeSign value for this CardReloadReqBean.
     * 
     * @return surchargeFeeSign
     */
    public java.lang.String getSurchargeFeeSign() {
        return surchargeFeeSign;
    }


    /**
     * Sets the surchargeFeeSign value for this CardReloadReqBean.
     * 
     * @param surchargeFeeSign
     */
    public void setSurchargeFeeSign(java.lang.String surchargeFeeSign) {
        this.surchargeFeeSign = surchargeFeeSign;
    }


    /**
     * Gets the transferorPAN value for this CardReloadReqBean.
     * 
     * @return transferorPAN
     */
    public java.lang.String getTransferorPAN() {
        return transferorPAN;
    }


    /**
     * Sets the transferorPAN value for this CardReloadReqBean.
     * 
     * @param transferorPAN
     */
    public void setTransferorPAN(java.lang.String transferorPAN) {
        this.transferorPAN = transferorPAN;
    }


    /**
     * Gets the actInd value for this CardReloadReqBean.
     * 
     * @return actInd
     */
    public java.lang.String getActInd() {
        return actInd;
    }


    /**
     * Sets the actInd value for this CardReloadReqBean.
     * 
     * @param actInd
     */
    public void setActInd(java.lang.String actInd) {
        this.actInd = actInd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardReloadReqBean)) return false;
        CardReloadReqBean other = (CardReloadReqBean) obj;
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
            ((this.branchCode==null && other.getBranchCode()==null) || 
             (this.branchCode!=null &&
              this.branchCode.equals(other.getBranchCode()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.fi==null && other.getFi()==null) || 
             (this.fi!=null &&
              this.fi.equals(other.getFi()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan()))) &&
            ((this.referenceNo==null && other.getReferenceNo()==null) || 
             (this.referenceNo!=null &&
              this.referenceNo.equals(other.getReferenceNo()))) &&
            ((this.reloadMethod==null && other.getReloadMethod()==null) || 
             (this.reloadMethod!=null &&
              this.reloadMethod.equals(other.getReloadMethod()))) &&
            ((this.reloadSource==null && other.getReloadSource()==null) || 
             (this.reloadSource!=null &&
              this.reloadSource.equals(other.getReloadSource()))) &&
            ((this.sequenceNo==null && other.getSequenceNo()==null) || 
             (this.sequenceNo!=null &&
              this.sequenceNo.equals(other.getSequenceNo()))) &&
            ((this.sourceSystem==null && other.getSourceSystem()==null) || 
             (this.sourceSystem!=null &&
              this.sourceSystem.equals(other.getSourceSystem()))) &&
            ((this.src==null && other.getSrc()==null) || 
             (this.src!=null &&
              this.src.equals(other.getSrc()))) &&
            ((this.surchargeFee==null && other.getSurchargeFee()==null) || 
             (this.surchargeFee!=null &&
              this.surchargeFee.equals(other.getSurchargeFee()))) &&
            ((this.surchargeFeeSign==null && other.getSurchargeFeeSign()==null) || 
             (this.surchargeFeeSign!=null &&
              this.surchargeFeeSign.equals(other.getSurchargeFeeSign()))) &&
            ((this.transferorPAN==null && other.getTransferorPAN()==null) || 
             (this.transferorPAN!=null &&
              this.transferorPAN.equals(other.getTransferorPAN()))) &&
            ((this.actInd==null && other.getActInd()==null) || 
             (this.actInd!=null &&
              this.actInd.equals(other.getActInd())));
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
        if (getBranchCode() != null) {
            _hashCode += getBranchCode().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getFi() != null) {
            _hashCode += getFi().hashCode();
        }
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        if (getReferenceNo() != null) {
            _hashCode += getReferenceNo().hashCode();
        }
        if (getReloadMethod() != null) {
            _hashCode += getReloadMethod().hashCode();
        }
        if (getReloadSource() != null) {
            _hashCode += getReloadSource().hashCode();
        }
        if (getSequenceNo() != null) {
            _hashCode += getSequenceNo().hashCode();
        }
        if (getSourceSystem() != null) {
            _hashCode += getSourceSystem().hashCode();
        }
        if (getSrc() != null) {
            _hashCode += getSrc().hashCode();
        }
        if (getSurchargeFee() != null) {
            _hashCode += getSurchargeFee().hashCode();
        }
        if (getSurchargeFeeSign() != null) {
            _hashCode += getSurchargeFeeSign().hashCode();
        }
        if (getTransferorPAN() != null) {
            _hashCode += getTransferorPAN().hashCode();
        }
        if (getActInd() != null) {
            _hashCode += getActInd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardReloadReqBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardReloadReqBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "branchCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expiryDate"));
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
        elemField.setFieldName("referenceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reloadMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reloadMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reloadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reloadSource"));
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
        elemField.setFieldName("sourceSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("src");
        elemField.setXmlName(new javax.xml.namespace.QName("", "src"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surchargeFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "surchargeFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surchargeFeeSign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "surchargeFeeSign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferorPAN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferorPAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actInd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actInd"));
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
