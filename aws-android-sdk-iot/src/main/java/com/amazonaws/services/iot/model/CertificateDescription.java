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
 * Describes a certificate.
 * </p>
 */
public class CertificateDescription implements Serializable {

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
     * The certificate data, in PEM format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String certificatePem;

    /**
     * The ID of the AWS account that owns the certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String ownedBy;

    /**
     * The date and time the certificate was created.
     */
    private java.util.Date creationDate;

    /**
     * The date and time the certificate was last modified.
     */
    private java.util.Date lastModifiedDate;

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
    public CertificateDescription withCertificateArn(String certificateArn) {
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
    public CertificateDescription withCertificateId(String certificateId) {
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
    public CertificateDescription withStatus(String status) {
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
    public CertificateDescription withStatus(CertificateStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * The certificate data, in PEM format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The certificate data, in PEM format.
     */
    public String getCertificatePem() {
        return certificatePem;
    }
    
    /**
     * The certificate data, in PEM format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param certificatePem The certificate data, in PEM format.
     */
    public void setCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
    }
    
    /**
     * The certificate data, in PEM format.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param certificatePem The certificate data, in PEM format.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CertificateDescription withCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
        return this;
    }

    /**
     * The ID of the AWS account that owns the certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return The ID of the AWS account that owns the certificate.
     */
    public String getOwnedBy() {
        return ownedBy;
    }
    
    /**
     * The ID of the AWS account that owns the certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param ownedBy The ID of the AWS account that owns the certificate.
     */
    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }
    
    /**
     * The ID of the AWS account that owns the certificate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param ownedBy The ID of the AWS account that owns the certificate.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CertificateDescription withOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
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
    public CertificateDescription withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * The date and time the certificate was last modified.
     *
     * @return The date and time the certificate was last modified.
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }
    
    /**
     * The date and time the certificate was last modified.
     *
     * @param lastModifiedDate The date and time the certificate was last modified.
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    
    /**
     * The date and time the certificate was last modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastModifiedDate The date and time the certificate was last modified.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CertificateDescription withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
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
        if (getCertificatePem() != null) sb.append("CertificatePem: " + getCertificatePem() + ",");
        if (getOwnedBy() != null) sb.append("OwnedBy: " + getOwnedBy() + ",");
        if (getCreationDate() != null) sb.append("CreationDate: " + getCreationDate() + ",");
        if (getLastModifiedDate() != null) sb.append("LastModifiedDate: " + getLastModifiedDate() );
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
        hashCode = prime * hashCode + ((getCertificatePem() == null) ? 0 : getCertificatePem().hashCode()); 
        hashCode = prime * hashCode + ((getOwnedBy() == null) ? 0 : getOwnedBy().hashCode()); 
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode()); 
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CertificateDescription == false) return false;
        CertificateDescription other = (CertificateDescription)obj;
        
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null) return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false) return false; 
        if (other.getCertificateId() == null ^ this.getCertificateId() == null) return false;
        if (other.getCertificateId() != null && other.getCertificateId().equals(this.getCertificateId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getCertificatePem() == null ^ this.getCertificatePem() == null) return false;
        if (other.getCertificatePem() != null && other.getCertificatePem().equals(this.getCertificatePem()) == false) return false; 
        if (other.getOwnedBy() == null ^ this.getOwnedBy() == null) return false;
        if (other.getOwnedBy() != null && other.getOwnedBy().equals(this.getOwnedBy()) == false) return false; 
        if (other.getCreationDate() == null ^ this.getCreationDate() == null) return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false) return false; 
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null) return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false) return false; 
        return true;
    }
    
}
    