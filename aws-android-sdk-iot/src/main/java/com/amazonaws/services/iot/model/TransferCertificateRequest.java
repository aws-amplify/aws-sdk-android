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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.iot.AWSIot#transferCertificate(TransferCertificateRequest) TransferCertificate operation}.
 * <p>
 * Transfers the specified certificate to the specified AWS account.
 * </p>
 * <p>
 * You can cancel the transfer until it is acknowledged by the recipient.
 * </p>
 * <p>
 * No notification is sent to the transfer destination's account. It is
 * up to the caller to notify the transfer target.
 * </p>
 * <p>
 * The certificate being transferred must not be in the ACTIVE state. You
 * can use the UpdateCertificate API to deactivate it.
 * </p>
 * <p>
 * The certificate must not have any policies attached to it. You can use
 * the DetachPrincipalPolicy API to detach them.
 * </p>
 *
 * @see com.amazonaws.services.iot.AWSIot#transferCertificate(TransferCertificateRequest)
 */
public class TransferCertificateRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     */
    private String certificateId;

    /**
     * The AWS account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String targetAwsAccount;

    /**
     * The ID of the certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @return The ID of the certificate.
     */
    public String getCertificateId() {
        return certificateId;
    }
    
    /**
     * The ID of the certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @param certificateId The ID of the certificate.
     */
    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }
    
    /**
     * The ID of the certificate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @param certificateId The ID of the certificate.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TransferCertificateRequest withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * The AWS account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return The AWS account.
     */
    public String getTargetAwsAccount() {
        return targetAwsAccount;
    }
    
    /**
     * The AWS account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param targetAwsAccount The AWS account.
     */
    public void setTargetAwsAccount(String targetAwsAccount) {
        this.targetAwsAccount = targetAwsAccount;
    }
    
    /**
     * The AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param targetAwsAccount The AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TransferCertificateRequest withTargetAwsAccount(String targetAwsAccount) {
        this.targetAwsAccount = targetAwsAccount;
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
        if (getCertificateId() != null) sb.append("CertificateId: " + getCertificateId() + ",");
        if (getTargetAwsAccount() != null) sb.append("TargetAwsAccount: " + getTargetAwsAccount() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode()); 
        hashCode = prime * hashCode + ((getTargetAwsAccount() == null) ? 0 : getTargetAwsAccount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TransferCertificateRequest == false) return false;
        TransferCertificateRequest other = (TransferCertificateRequest)obj;
        
        if (other.getCertificateId() == null ^ this.getCertificateId() == null) return false;
        if (other.getCertificateId() != null && other.getCertificateId().equals(this.getCertificateId()) == false) return false; 
        if (other.getTargetAwsAccount() == null ^ this.getTargetAwsAccount() == null) return false;
        if (other.getTargetAwsAccount() != null && other.getTargetAwsAccount().equals(this.getTargetAwsAccount()) == false) return false; 
        return true;
    }
    
}
    