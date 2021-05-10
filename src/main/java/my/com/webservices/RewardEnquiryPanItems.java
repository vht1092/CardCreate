/**
 * RewardEnquiryPanItems.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package my.com.webservices;

public class RewardEnquiryPanItems  implements java.io.Serializable {
    private java.lang.String bonusPointOfTheMonth;

    private java.lang.String pan;

    private java.lang.String pointAdjustment;

    private java.lang.String pointAvailable;

    private java.lang.String pointCarriedForward;

    private java.lang.String pointEarnThisMonth;

    private java.lang.String pointRedeemed;

    private my.com.webservices.RewardEnquiryPntItems[] rewardEnquiryPntItems;

    public RewardEnquiryPanItems() {
    }

    public RewardEnquiryPanItems(
           java.lang.String bonusPointOfTheMonth,
           java.lang.String pan,
           java.lang.String pointAdjustment,
           java.lang.String pointAvailable,
           java.lang.String pointCarriedForward,
           java.lang.String pointEarnThisMonth,
           java.lang.String pointRedeemed,
           my.com.webservices.RewardEnquiryPntItems[] rewardEnquiryPntItems) {
           this.bonusPointOfTheMonth = bonusPointOfTheMonth;
           this.pan = pan;
           this.pointAdjustment = pointAdjustment;
           this.pointAvailable = pointAvailable;
           this.pointCarriedForward = pointCarriedForward;
           this.pointEarnThisMonth = pointEarnThisMonth;
           this.pointRedeemed = pointRedeemed;
           this.rewardEnquiryPntItems = rewardEnquiryPntItems;
    }


    /**
     * Gets the bonusPointOfTheMonth value for this RewardEnquiryPanItems.
     * 
     * @return bonusPointOfTheMonth
     */
    public java.lang.String getBonusPointOfTheMonth() {
        return bonusPointOfTheMonth;
    }


    /**
     * Sets the bonusPointOfTheMonth value for this RewardEnquiryPanItems.
     * 
     * @param bonusPointOfTheMonth
     */
    public void setBonusPointOfTheMonth(java.lang.String bonusPointOfTheMonth) {
        this.bonusPointOfTheMonth = bonusPointOfTheMonth;
    }


    /**
     * Gets the pan value for this RewardEnquiryPanItems.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this RewardEnquiryPanItems.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }


    /**
     * Gets the pointAdjustment value for this RewardEnquiryPanItems.
     * 
     * @return pointAdjustment
     */
    public java.lang.String getPointAdjustment() {
        return pointAdjustment;
    }


    /**
     * Sets the pointAdjustment value for this RewardEnquiryPanItems.
     * 
     * @param pointAdjustment
     */
    public void setPointAdjustment(java.lang.String pointAdjustment) {
        this.pointAdjustment = pointAdjustment;
    }


    /**
     * Gets the pointAvailable value for this RewardEnquiryPanItems.
     * 
     * @return pointAvailable
     */
    public java.lang.String getPointAvailable() {
        return pointAvailable;
    }


    /**
     * Sets the pointAvailable value for this RewardEnquiryPanItems.
     * 
     * @param pointAvailable
     */
    public void setPointAvailable(java.lang.String pointAvailable) {
        this.pointAvailable = pointAvailable;
    }


    /**
     * Gets the pointCarriedForward value for this RewardEnquiryPanItems.
     * 
     * @return pointCarriedForward
     */
    public java.lang.String getPointCarriedForward() {
        return pointCarriedForward;
    }


    /**
     * Sets the pointCarriedForward value for this RewardEnquiryPanItems.
     * 
     * @param pointCarriedForward
     */
    public void setPointCarriedForward(java.lang.String pointCarriedForward) {
        this.pointCarriedForward = pointCarriedForward;
    }


    /**
     * Gets the pointEarnThisMonth value for this RewardEnquiryPanItems.
     * 
     * @return pointEarnThisMonth
     */
    public java.lang.String getPointEarnThisMonth() {
        return pointEarnThisMonth;
    }


    /**
     * Sets the pointEarnThisMonth value for this RewardEnquiryPanItems.
     * 
     * @param pointEarnThisMonth
     */
    public void setPointEarnThisMonth(java.lang.String pointEarnThisMonth) {
        this.pointEarnThisMonth = pointEarnThisMonth;
    }


    /**
     * Gets the pointRedeemed value for this RewardEnquiryPanItems.
     * 
     * @return pointRedeemed
     */
    public java.lang.String getPointRedeemed() {
        return pointRedeemed;
    }


    /**
     * Sets the pointRedeemed value for this RewardEnquiryPanItems.
     * 
     * @param pointRedeemed
     */
    public void setPointRedeemed(java.lang.String pointRedeemed) {
        this.pointRedeemed = pointRedeemed;
    }


    /**
     * Gets the rewardEnquiryPntItems value for this RewardEnquiryPanItems.
     * 
     * @return rewardEnquiryPntItems
     */
    public my.com.webservices.RewardEnquiryPntItems[] getRewardEnquiryPntItems() {
        return rewardEnquiryPntItems;
    }


    /**
     * Sets the rewardEnquiryPntItems value for this RewardEnquiryPanItems.
     * 
     * @param rewardEnquiryPntItems
     */
    public void setRewardEnquiryPntItems(my.com.webservices.RewardEnquiryPntItems[] rewardEnquiryPntItems) {
        this.rewardEnquiryPntItems = rewardEnquiryPntItems;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RewardEnquiryPanItems)) return false;
        RewardEnquiryPanItems other = (RewardEnquiryPanItems) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bonusPointOfTheMonth==null && other.getBonusPointOfTheMonth()==null) || 
             (this.bonusPointOfTheMonth!=null &&
              this.bonusPointOfTheMonth.equals(other.getBonusPointOfTheMonth()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan()))) &&
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
            ((this.rewardEnquiryPntItems==null && other.getRewardEnquiryPntItems()==null) || 
             (this.rewardEnquiryPntItems!=null &&
              java.util.Arrays.equals(this.rewardEnquiryPntItems, other.getRewardEnquiryPntItems())));
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
        if (getBonusPointOfTheMonth() != null) {
            _hashCode += getBonusPointOfTheMonth().hashCode();
        }
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
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
        if (getRewardEnquiryPntItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRewardEnquiryPntItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRewardEnquiryPntItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RewardEnquiryPanItems.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "RewardEnquiryPanItems"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusPointOfTheMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusPointOfTheMonth"));
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
        elemField.setFieldName("rewardEnquiryPntItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rewardEnquiryPntItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "RewardEnquiryPntItems"));
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
