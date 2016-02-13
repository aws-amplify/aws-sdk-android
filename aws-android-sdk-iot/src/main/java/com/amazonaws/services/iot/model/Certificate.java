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
 * Information about a certificate.
 * </p>
 */
public class Certificate implements Serializable {

    /**
     * The ARN of the certificate.
     */
    private String certificateArn;

    /**
     * The ID of the certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     */
    private String certificateId;

    /**
     * The status of the certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER
     */
    private String status;

    /**
     * The date and time the certificate was created.
     */
    private java.util.Date creationDate;

    /**
     * The ARN of the certificate.
     *
     * @return The ARN of the certificate.
     */
    public String getCertificateArn() {
        return certificateArn;
    }
    
    /**
     * The ARN of the certificate.
     *
     * @param certificateArn The ARN of the certificate.
     */
    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }
    
    /**
     * The ARN of the certificate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param certificateArn The ARN of the certificate.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Certificate withCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
        return this;
    }

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
    public Certificate withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * The status of the certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER
     *
     * @return The status of the certificate.
     *
     * @see CertificateStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER
     *
     * @param status The status of the certificate.
     *
     * @see CertificateStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the certificate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER
     *
     * @param status The status of the certificate.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see CertificateStatus
     */
    public Certificate withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER
     *
     * @param status The status of the certificate.
     *
     * @see CertificateStatus
     */
    public void setStatus(CertificateStatus status) {
        this.status = status.toString();
    }
    
    /**
     * The status of the certificate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER
     *
     * @param status The status of the certificate.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see CertificateStatus
     */
    public Certificate withStatus(CertificateStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * The date and time the certificate was created.
     *
     * @return The date and time the certificate was created.
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }
    
    /**
     * The date and time the certificate was created.
     *
     * @param creationDate The date and time the certificate was created.
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }
    
    /**
     * The date and time the certificate was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDate The date and time the certificate was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Certificate withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
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
        if (getCertificateArn() != null) sb.append("CertificateArn: " + getCertificateArn() + ",");
        if (getCertificateId() != null) sb.append("CertificateId: " + getCertificateId() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getCreationDate() != null) sb.append("CreationDate: " + getCreationDate() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode()); 
        hashCode = prime * hashCode + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Certificate == false) return false;
        Certificate other = (Certificate)obj;
        
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null) return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false) return false; 
        if (other.getCertificateId() == null ^ this.getCertificateId() == null) return false;
        if (other.getCertificateId() != null && other.getCertificateId().equals(this.getCertificateId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getCreationDate() == null ^ this.getCreationDate() == null) return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false) return false; 
        return true;
    }
    
}
    