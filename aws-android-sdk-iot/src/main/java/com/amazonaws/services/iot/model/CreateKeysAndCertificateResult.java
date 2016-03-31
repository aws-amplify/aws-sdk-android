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
 * The output of the CreateKeysAndCertificate operation.
 * </p>
 */
public class CreateKeysAndCertificateResult implements Serializable {

    /**
     * The ARN of the certificate.
     */
    private String certificateArn;

    /**
     * The ID of the certificate. AWS IoT issues a default subject name for
     * the certificate (for example, AWS IoT Certificate).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     */
    private String certificateId;

    /**
     * The certificate data, in PEM format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String certificatePem;

    /**
     * The generated key pair.
     */
    private KeyPair keyPair;

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
    public CreateKeysAndCertificateResult withCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
        return this;
    }

    /**
     * The ID of the certificate. AWS IoT issues a default subject name for
     * the certificate (for example, AWS IoT Certificate).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @return The ID of the certificate. AWS IoT issues a default subject name for
     *         the certificate (for example, AWS IoT Certificate).
     */
    public String getCertificateId() {
        return certificateId;
    }
    
    /**
     * The ID of the certificate. AWS IoT issues a default subject name for
     * the certificate (for example, AWS IoT Certificate).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @param certificateId The ID of the certificate. AWS IoT issues a default subject name for
     *         the certificate (for example, AWS IoT Certificate).
     */
    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }
    
    /**
     * The ID of the certificate. AWS IoT issues a default subject name for
     * the certificate (for example, AWS IoT Certificate).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @param certificateId The ID of the certificate. AWS IoT issues a default subject name for
     *         the certificate (for example, AWS IoT Certificate).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateKeysAndCertificateResult withCertificateId(String certificateId) {
        this.certificateId = certificateId;
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
    public CreateKeysAndCertificateResult withCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
        return this;
    }

    /**
     * The generated key pair.
     *
     * @return The generated key pair.
     */
    public KeyPair getKeyPair() {
        return keyPair;
    }
    
    /**
     * The generated key pair.
     *
     * @param keyPair The generated key pair.
     */
    public void setKeyPair(KeyPair keyPair) {
        this.keyPair = keyPair;
    }
    
    /**
     * The generated key pair.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyPair The generated key pair.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateKeysAndCertificateResult withKeyPair(KeyPair keyPair) {
        this.keyPair = keyPair;
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
        if (getCertificatePem() != null) sb.append("CertificatePem: " + getCertificatePem() + ",");
        if (getKeyPair() != null) sb.append("KeyPair: " + getKeyPair() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode()); 
        hashCode = prime * hashCode + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode()); 
        hashCode = prime * hashCode + ((getCertificatePem() == null) ? 0 : getCertificatePem().hashCode()); 
        hashCode = prime * hashCode + ((getKeyPair() == null) ? 0 : getKeyPair().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateKeysAndCertificateResult == false) return false;
        CreateKeysAndCertificateResult other = (CreateKeysAndCertificateResult)obj;
        
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null) return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false) return false; 
        if (other.getCertificateId() == null ^ this.getCertificateId() == null) return false;
        if (other.getCertificateId() != null && other.getCertificateId().equals(this.getCertificateId()) == false) return false; 
        if (other.getCertificatePem() == null ^ this.getCertificatePem() == null) return false;
        if (other.getCertificatePem() != null && other.getCertificatePem().equals(this.getCertificatePem()) == false) return false; 
        if (other.getKeyPair() == null ^ this.getKeyPair() == null) return false;
        if (other.getKeyPair() != null && other.getKeyPair().equals(this.getKeyPair()) == false) return false; 
        return true;
    }
    
}
    