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
 * The output from the CreateCertificateFromCsr operation.
 * </p>
 */
public class CreateCertificateFromCsrResult implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the certificate. You can use the ARN
     * as a principal for policy operations.
     */
    private String certificateArn;

    /**
     * The ID of the certificate. Certificate management operations only take
     * a certificateId.
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
     * The Amazon Resource Name (ARN) of the certificate. You can use the ARN
     * as a principal for policy operations.
     *
     * @return The Amazon Resource Name (ARN) of the certificate. You can use the ARN
     *         as a principal for policy operations.
     */
    public String getCertificateArn() {
        return certificateArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the certificate. You can use the ARN
     * as a principal for policy operations.
     *
     * @param certificateArn The Amazon Resource Name (ARN) of the certificate. You can use the ARN
     *         as a principal for policy operations.
     */
    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the certificate. You can use the ARN
     * as a principal for policy operations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param certificateArn The Amazon Resource Name (ARN) of the certificate. You can use the ARN
     *         as a principal for policy operations.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCertificateFromCsrResult withCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
        return this;
    }

    /**
     * The ID of the certificate. Certificate management operations only take
     * a certificateId.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @return The ID of the certificate. Certificate management operations only take
     *         a certificateId.
     */
    public String getCertificateId() {
        return certificateId;
    }
    
    /**
     * The ID of the certificate. Certificate management operations only take
     * a certificateId.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @param certificateId The ID of the certificate. Certificate management operations only take
     *         a certificateId.
     */
    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }
    
    /**
     * The ID of the certificate. Certificate management operations only take
     * a certificateId.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @param certificateId The ID of the certificate. Certificate management operations only take
     *         a certificateId.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCertificateFromCsrResult withCertificateId(String certificateId) {
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
    public CreateCertificateFromCsrResult withCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
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
        if (getCertificatePem() != null) sb.append("CertificatePem: " + getCertificatePem() );
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
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateCertificateFromCsrResult == false) return false;
        CreateCertificateFromCsrResult other = (CreateCertificateFromCsrResult)obj;
        
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null) return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false) return false; 
        if (other.getCertificateId() == null ^ this.getCertificateId() == null) return false;
        if (other.getCertificateId() != null && other.getCertificateId().equals(this.getCertificateId()) == false) return false; 
        if (other.getCertificatePem() == null ^ this.getCertificatePem() == null) return false;
        if (other.getCertificatePem() != null && other.getCertificatePem().equals(this.getCertificatePem()) == false) return false; 
        return true;
    }
    
}
    