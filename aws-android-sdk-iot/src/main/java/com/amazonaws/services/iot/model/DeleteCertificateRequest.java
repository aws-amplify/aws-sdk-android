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
 * Container for the parameters to the {@link com.amazonaws.services.iot.AWSIot#deleteCertificate(DeleteCertificateRequest) DeleteCertificate operation}.
 * <p>
 * Deletes the specified certificate.
 * </p>
 * <p>
 * A certificate cannot be deleted if it has a policy attached to it or
 * if its status is set to ACTIVE. To delete a certificate, first use the
 * DetachPrincipalPolicy API to detach all policies. Next, use the
 * UpdateCertificate API to set the certificate to the INACTIVE status.
 * </p>
 *
 * @see com.amazonaws.services.iot.AWSIot#deleteCertificate(DeleteCertificateRequest)
 */
public class DeleteCertificateRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     */
    private String certificateId;

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
    public DeleteCertificateRequest withCertificateId(String certificateId) {
        this.certificateId = certificateId;
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
        if (getCertificateId() != null) sb.append("CertificateId: " + getCertificateId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteCertificateRequest == false) return false;
        DeleteCertificateRequest other = (DeleteCertificateRequest)obj;
        
        if (other.getCertificateId() == null ^ this.getCertificateId() == null) return false;
        if (other.getCertificateId() != null && other.getCertificateId().equals(this.getCertificateId()) == false) return false; 
        return true;
    }
    
}
    