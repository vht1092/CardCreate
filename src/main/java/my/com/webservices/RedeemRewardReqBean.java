/**
 * RedeemRewardReqBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package my.com.webservices;

public class RedeemRewardReqBean  implements java.io.Serializable {
    private java.lang.String crn;

    private java.lang.String fi;

    private java.lang.String sequenceNo;

    private java.lang.String pan;

    private java.lang.String actInd;

    private java.lang.String point;

    private java.lang.String rewardAction;

    private java.lang.String txnDesc;

    public RedeemRewardReqBean() {
    }

    public RedeemRewardReqBean(
           java.lang.String crn,
           java.lang.String fi,
           java.lang.String sequenceNo,
           java.lang.String pan,
           java.lang.String actInd,
           java.lang.String point,
           java.lang.String rewardAction,
           java.lang.String txnDesc) {
           this.crn = crn;
           this.fi = fi;
           this.sequenceNo = sequenceNo;
           this.pan = pan;
           this.actInd = actInd;
           this.point = point;
           this.rewardAction = rewardAction;
           this.txnDesc = txnDesc;
    }


    /**
     * Gets the crn value for this RedeemRewardReqBean.
     * 
     * @return crn
     */
    public java.lang.String getCrn() {
        return crn;
    }


    /**
     * Sets the crn value for this RedeemRewardReqBean.
     * 
     * @param crn
     */
    public void setCrn(java.lang.String crn) {
        this.crn = crn;
    }


    /**
     * Gets the fi value for this RedeemRewardReqBean.
     * 
     * @return fi
     */
    public java.lang.String getFi() {
        return fi;
    }


    /**
     * Sets the fi value for this RedeemRewardReqBean.
     * 
     * @param fi
     */
    public void setFi(java.lang.String fi) {
        this.fi = fi;
    }


    /**
     * Gets the sequenceNo value for this RedeemRewardReqBean.
     * 
     * @return sequenceNo
     */
    public java.lang.String getSequenceNo() {
        return sequenceNo;
    }


    /**
     * Sets the sequenceNo value for this RedeemRewardReqBean.
     * 
     * @param sequenceNo
     */
    public void setSequenceNo(java.lang.String sequenceNo) {
        this.sequenceNo = sequenceNo;
    }


    /**
     * Gets the pan value for this RedeemRewardReqBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this RedeemRewardReqBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }


    /**
     * Gets the actInd value for this RedeemRewardReqBean.
     * 
     * @return actInd
     */
    public java.lang.String getActInd() {
        return actInd;
    }


    /**
     * Sets the actInd value for this RedeemRewardReqBean.
     * 
     * @param actInd
     */
    public void setActInd(java.lang.String actInd) {
        this.actInd = actInd;
    }


    /**
     * Gets the point value for this RedeemRewardReqBean.
     * 
     * @return point
     */
    public java.lang.String getPoint() {
        return point;
    }


    /**
     * Sets the point value for this RedeemRewardReqBean.
     * 
     * @param point
     */
    public void setPoint(java.lang.String point) {
        this.point = point;
    }


    /**
     * Gets the rewardAction value for this RedeemRewardReqBean.
     * 
     * @return rewardAction
     */
    public java.lang.String getRewardAction() {
        return rewardAction;
    }


    /**
     * Sets the rewardAction value for this RedeemRewardReqBean.
     * 
     * @param rewardAction
     */
    public void setRewardAction(java.lang.String rewardAction) {
        this.rewardAction = rewardAction;
    }


    /**
     * Gets the txnDesc value for this RedeemRewardReqBean.
     * 
     * @return txnDesc
     */
    public java.lang.String getTxnDesc() {
        return txnDesc;
    }


    /**
     * Sets the txnDesc value for this RedeemRewardReqBean.
     * 
     * @param txnDesc
     */
    public void setTxnDesc(java.lang.String txnDesc) {
        this.txnDesc = txnDesc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RedeemRewardReqBean)) return false;
        RedeemRewardReqBean other = (RedeemRewardReqBean) obj;
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
              this.sequenceNo.equals(other.getSequenceNo()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan()))) &&
            ((this.actInd==null && other.getActInd()==null) || 
             (this.actInd!=null &&
              this.actInd.equals(other.getActInd()))) &&
            ((this.point==null && other.getPoint()==null) || 
             (this.point!=null &&
              this.point.equals(other.getPoint()))) &&
            ((this.rewardAction==null && other.getRewardAction()==null) || 
             (this.rewardAction!=null &&
              this.rewardAction.equals(other.getRewardAction()))) &&
            ((this.txnDesc==null && other.getTxnDesc()==null) || 
             (this.txnDesc!=null &&
              this.txnDesc.equals(other.getTxnDesc())));
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
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        if (getActInd() != null) {
            _hashCode += getActInd().hashCode();
        }
        if (getPoint() != null) {
            _hashCode += getPoint().hashCode();
        }
        if (getRewardAction() != null) {
            _hashCode += getRewardAction().hashCode();
        }
        if (getTxnDesc() != null) {
            _hashCode += getTxnDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RedeemRewardReqBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "RedeemRewardReqBean"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pan"));
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
        elemField.setFieldName("point");
        elemField.setXmlName(new javax.xml.namespace.QName("", "point"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rewardAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rewardAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txnDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "txnDesc"));
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
