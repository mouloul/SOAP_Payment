/**
 * APCaptureReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class APCaptureReply  implements java.io.Serializable {
    private java.math.BigInteger reasonCode;

    private java.lang.String processorTransactionID;

    private java.lang.String status;

    private java.lang.String processorResponse;

    private java.lang.String amount;

    private java.lang.String dateTime;

    private java.lang.String reconciliationID;

    private java.lang.String providerResponse;

    private java.lang.String paymentStatus;

    private java.lang.String responseCode;

    private java.lang.String processorTransactionFee;

    public APCaptureReply() {
    }

    public APCaptureReply(
           java.math.BigInteger reasonCode,
           java.lang.String processorTransactionID,
           java.lang.String status,
           java.lang.String processorResponse,
           java.lang.String amount,
           java.lang.String dateTime,
           java.lang.String reconciliationID,
           java.lang.String providerResponse,
           java.lang.String paymentStatus,
           java.lang.String responseCode,
           java.lang.String processorTransactionFee) {
           this.reasonCode = reasonCode;
           this.processorTransactionID = processorTransactionID;
           this.status = status;
           this.processorResponse = processorResponse;
           this.amount = amount;
           this.dateTime = dateTime;
           this.reconciliationID = reconciliationID;
           this.providerResponse = providerResponse;
           this.paymentStatus = paymentStatus;
           this.responseCode = responseCode;
           this.processorTransactionFee = processorTransactionFee;
    }


    /**
     * Gets the reasonCode value for this APCaptureReply.
     * 
     * @return reasonCode
     */
    public java.math.BigInteger getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this APCaptureReply.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.math.BigInteger reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the processorTransactionID value for this APCaptureReply.
     * 
     * @return processorTransactionID
     */
    public java.lang.String getProcessorTransactionID() {
        return processorTransactionID;
    }


    /**
     * Sets the processorTransactionID value for this APCaptureReply.
     * 
     * @param processorTransactionID
     */
    public void setProcessorTransactionID(java.lang.String processorTransactionID) {
        this.processorTransactionID = processorTransactionID;
    }


    /**
     * Gets the status value for this APCaptureReply.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this APCaptureReply.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the processorResponse value for this APCaptureReply.
     * 
     * @return processorResponse
     */
    public java.lang.String getProcessorResponse() {
        return processorResponse;
    }


    /**
     * Sets the processorResponse value for this APCaptureReply.
     * 
     * @param processorResponse
     */
    public void setProcessorResponse(java.lang.String processorResponse) {
        this.processorResponse = processorResponse;
    }


    /**
     * Gets the amount value for this APCaptureReply.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this APCaptureReply.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the dateTime value for this APCaptureReply.
     * 
     * @return dateTime
     */
    public java.lang.String getDateTime() {
        return dateTime;
    }


    /**
     * Sets the dateTime value for this APCaptureReply.
     * 
     * @param dateTime
     */
    public void setDateTime(java.lang.String dateTime) {
        this.dateTime = dateTime;
    }


    /**
     * Gets the reconciliationID value for this APCaptureReply.
     * 
     * @return reconciliationID
     */
    public java.lang.String getReconciliationID() {
        return reconciliationID;
    }


    /**
     * Sets the reconciliationID value for this APCaptureReply.
     * 
     * @param reconciliationID
     */
    public void setReconciliationID(java.lang.String reconciliationID) {
        this.reconciliationID = reconciliationID;
    }


    /**
     * Gets the providerResponse value for this APCaptureReply.
     * 
     * @return providerResponse
     */
    public java.lang.String getProviderResponse() {
        return providerResponse;
    }


    /**
     * Sets the providerResponse value for this APCaptureReply.
     * 
     * @param providerResponse
     */
    public void setProviderResponse(java.lang.String providerResponse) {
        this.providerResponse = providerResponse;
    }


    /**
     * Gets the paymentStatus value for this APCaptureReply.
     * 
     * @return paymentStatus
     */
    public java.lang.String getPaymentStatus() {
        return paymentStatus;
    }


    /**
     * Sets the paymentStatus value for this APCaptureReply.
     * 
     * @param paymentStatus
     */
    public void setPaymentStatus(java.lang.String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }


    /**
     * Gets the responseCode value for this APCaptureReply.
     * 
     * @return responseCode
     */
    public java.lang.String getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this APCaptureReply.
     * 
     * @param responseCode
     */
    public void setResponseCode(java.lang.String responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the processorTransactionFee value for this APCaptureReply.
     * 
     * @return processorTransactionFee
     */
    public java.lang.String getProcessorTransactionFee() {
        return processorTransactionFee;
    }


    /**
     * Sets the processorTransactionFee value for this APCaptureReply.
     * 
     * @param processorTransactionFee
     */
    public void setProcessorTransactionFee(java.lang.String processorTransactionFee) {
        this.processorTransactionFee = processorTransactionFee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APCaptureReply)) return false;
        APCaptureReply other = (APCaptureReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode()))) &&
            ((this.processorTransactionID==null && other.getProcessorTransactionID()==null) || 
             (this.processorTransactionID!=null &&
              this.processorTransactionID.equals(other.getProcessorTransactionID()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.processorResponse==null && other.getProcessorResponse()==null) || 
             (this.processorResponse!=null &&
              this.processorResponse.equals(other.getProcessorResponse()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.dateTime==null && other.getDateTime()==null) || 
             (this.dateTime!=null &&
              this.dateTime.equals(other.getDateTime()))) &&
            ((this.reconciliationID==null && other.getReconciliationID()==null) || 
             (this.reconciliationID!=null &&
              this.reconciliationID.equals(other.getReconciliationID()))) &&
            ((this.providerResponse==null && other.getProviderResponse()==null) || 
             (this.providerResponse!=null &&
              this.providerResponse.equals(other.getProviderResponse()))) &&
            ((this.paymentStatus==null && other.getPaymentStatus()==null) || 
             (this.paymentStatus!=null &&
              this.paymentStatus.equals(other.getPaymentStatus()))) &&
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode()))) &&
            ((this.processorTransactionFee==null && other.getProcessorTransactionFee()==null) || 
             (this.processorTransactionFee!=null &&
              this.processorTransactionFee.equals(other.getProcessorTransactionFee())));
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
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        if (getProcessorTransactionID() != null) {
            _hashCode += getProcessorTransactionID().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getProcessorResponse() != null) {
            _hashCode += getProcessorResponse().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getDateTime() != null) {
            _hashCode += getDateTime().hashCode();
        }
        if (getReconciliationID() != null) {
            _hashCode += getReconciliationID().hashCode();
        }
        if (getProviderResponse() != null) {
            _hashCode += getProviderResponse().hashCode();
        }
        if (getPaymentStatus() != null) {
            _hashCode += getPaymentStatus().hashCode();
        }
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        if (getProcessorTransactionFee() != null) {
            _hashCode += getProcessorTransactionFee().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APCaptureReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APCaptureReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "reasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processorTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "processorTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processorResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "processorResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "dateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconciliationID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "reconciliationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "providerResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paymentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "responseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processorTransactionFee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "processorTransactionFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
