/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The output from the TransferCertificate operation.
 * </p>
 */
public class TransferCertificateResult implements Serializable {

    /**
     * The ARN of the certificate.
     */
    private String transferredCertificateArn;

    /**
     * The ARN of the certificate.
     *
     * @return The ARN of the certificate.
     */
    public String getTransferredCertificateArn() {
        return transferredCertificateArn;
    }
    
    /**
     * The ARN of the certificate.
     *
     * @param transferredCertificateArn The ARN of the certificate.
     */
    public void setTransferredCertificateArn(String transferredCertificateArn) {
        this.transferredCertificateArn = transferredCertificateArn;
    }
    
    /**
     * The ARN of the certificate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param transferredCertificateArn The ARN of the certificate.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TransferCertificateResult withTransferredCertificateArn(String transferredCertificateArn) {
        this.transferredCertificateArn = transferredCertificateArn;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTransferredCertificateArn() != null) sb.append("TransferredCertificateArn: " + getTransferredCertificateArn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTransferredCertificateArn() == null) ? 0 : getTransferredCertificateArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TransferCertificateResult == false) return false;
        TransferCertificateResult other = (TransferCertificateResult)obj;
        
        if (other.getTransferredCertificateArn() == null ^ this.getTransferredCertificateArn() == null) return false;
        if (other.getTransferredCertificateArn() != null && other.getTransferredCertificateArn().equals(this.getTransferredCertificateArn()) == false) return false; 
        return true;
    }
    
}
    