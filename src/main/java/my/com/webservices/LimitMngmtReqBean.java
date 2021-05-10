/**
 * LimitMngmtReqBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package my.com.webservices;

public class LimitMngmtReqBean  implements java.io.Serializable {
    private java.lang.String action;

    private java.lang.String fi;

    private java.lang.String actInd;

    private java.lang.String pan;

    private java.lang.String holdAmt;

    private java.lang.String sequenceNo;

    public LimitMngmtReqBean() {
    }

    public LimitMngmtReqBean(
           java.lang.String action,
           java.lang.String fi,
           java.lang.String actInd,
           java.lang.String pan,
           java.lang.String holdAmt,
           java.lang.String sequenceNo) {
           this.action = action;
           this.fi = fi;
           this.actInd = actInd;
           this.pan = pan;
           this.holdAmt = holdAmt;
           this.sequenceNo = sequenceNo;
    }


    /**
     * Gets the action value for this LimitMngmtReqBean.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this LimitMngmtReqBean.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the fi value for this LimitMngmtReqBean.
     * 
     * @return fi
     */
    public java.lang.String getFi() {
        return fi;
    }


    /**
     * Sets the fi value for this LimitMngmtReqBean.
     * 
     * @param fi
     */
    public void setFi(java.lang.String fi) {
        this.fi = fi;
    }


    /**
     * Gets the actInd value for this LimitMngmtReqBean.
     * 
     * @return actInd
     */
    public java.lang.String getActInd() {
        return actInd;
    }


    /**
     * Sets the actInd value for this LimitMngmtReqBean.
     * 
     * @param actInd
     */
    public void setActInd(java.lang.String actInd) {
        this.actInd = actInd;
    }


    /**
     * Gets the pan value for this LimitMngmtReqBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this LimitMngmtReqBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }


    /**
     * Gets the holdAmt value for this LimitMngmtReqBean.
     * 
     * @return holdAmt
     */
    public java.lang.String getHoldAmt() {
        return holdAmt;
    }


    /**
     * Sets the holdAmt value for this LimitMngmtReqBean.
     * 
     * @param holdAmt
     */
    public void setHoldAmt(java.lang.String holdAmt) {
        this.holdAmt = holdAmt;
    }


    /**
     * Gets the sequenceNo value for this LimitMngmtReqBean.
     * 
     * @return sequenceNo
     */
    public java.lang.String getSequenceNo() {
        return sequenceNo;
    }


    /**
     * Sets the sequenceNo value for this LimitMngmtReqBean.
     * 
     * @param sequenceNo
     */
    public void setSequenceNo(java.lang.String sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LimitMngmtReqBean)) return false;
        LimitMngmtReqBean other = (LimitMngmtReqBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.fi==null && other.getFi()==null) || 
             (this.fi!=null &&
              this.fi.equals(other.getFi()))) &&
            ((this.actInd==null && other.getActInd()==null) || 
             (this.actInd!=null &&
              this.actInd.equals(other.getActInd()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan()))) &&
            ((this.holdAmt==null && other.getHoldAmt()==null) || 
             (this.holdAmt!=null &&
              this.holdAmt.equals(other.getHoldAmt()))) &&
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
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getFi() != null) {
            _hashCode += getFi().hashCode();
        }
        if (getActInd() != null) {
            _hashCode += getActInd().hashCode();
        }
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        if (getHoldAmt() != null) {
            _hashCode += getHoldAmt().hashCode();
        }
        if (getSequenceNo() != null) {
            _hashCode += getSequenceNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LimitMngmtReqBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "LimitMngmtReqBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
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
        elemField.setFieldName("holdAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "holdAmt"));
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
