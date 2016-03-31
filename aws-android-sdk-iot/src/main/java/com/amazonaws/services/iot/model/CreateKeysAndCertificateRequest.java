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
 * Container for the parameters to the {@link com.amazonaws.services.iot.AWSIot#createKeysAndCertificate(CreateKeysAndCertificateRequest) CreateKeysAndCertificate operation}.
 * <p>
 * Creates a 2048-bit RSA key pair and issues an X.509 certificate using
 * the issued public key.
 * </p>
 * <p>
 * <b>Note</b> This is the only time AWS IoT issues the private key for
 * this certificate, so it is important to keep it in a secure location.
 * </p>
 *
 * @see com.amazonaws.services.iot.AWSIot#createKeysAndCertificate(CreateKeysAndCertificateRequest)
 */
public class CreateKeysAndCertificateRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Specifies whether the certificate is active.
     */
    private Boolean setAsActive;

    /**
     * Specifies whether the certificate is active.
     *
     * @return Specifies whether the certificate is active.
     */
    public Boolean isSetAsActive() {
        return setAsActive;
    }
    
    /**
     * Specifies whether the certificate is active.
     *
     * @param setAsActive Specifies whether the certificate is active.
     */
    public void setSetAsActive(Boolean setAsActive) {
        this.setAsActive = setAsActive;
    }
    
    /**
     * Specifies whether the certificate is active.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param setAsActive Specifies whether the certificate is active.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateKeysAndCertificateRequest withSetAsActive(Boolean setAsActive) {
        this.setAsActive = setAsActive;
        return this;
    }

    /**
     * Specifies whether the certificate is active.
     *
     * @return Specifies whether the certificate is active.
     */
    public Boolean getSetAsActive() {
        return setAsActive;
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
        if (isSetAsActive() != null) sb.append("SetAsActive: " + isSetAsActive() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((isSetAsActive() == null) ? 0 : isSetAsActive().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateKeysAndCertificateRequest == false) return false;
        CreateKeysAndCertificateRequest other = (CreateKeysAndCertificateRequest)obj;
        
        if (other.isSetAsActive() == null ^ this.isSetAsActive() == null) return false;
        if (other.isSetAsActive() != null && other.isSetAsActive().equals(this.isSetAsActive()) == false) return false; 
        return true;
    }
    
}
    