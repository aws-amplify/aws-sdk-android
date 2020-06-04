/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackage-vod.model;

import java.io.Serializable;


/**
 * An HTTP Live Streaming (HLS) encryption configuration.
 */
public class HlsEncryption implements Serializable {
    /**
     * A constant initialization vector for encryption (optional).
When not specified the initialization vector will be periodically rotated.

     */
    private String constantInitializationVector;

    /**
     * The encryption method to use.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_128, SAMPLE_AES
     */
    private String encryptionMethod;

    /**
     * A configuration for accessing an external Secure Packager and Encoder Key Exchange (SPEKE) service that will provide encryption keys.
     */
    private SpekeKeyProvider spekeKeyProvider;

    /**
     * A constant initialization vector for encryption (optional).
When not specified the initialization vector will be periodically rotated.

     *
     * @return A constant initialization vector for encryption (optional).
When not specified the initialization vector will be periodically rotated.

     */
    public String getConstantInitializationVector() {
        return constantInitializationVector;
    }

    /**
     * A constant initialization vector for encryption (optional).
When not specified the initialization vector will be periodically rotated.

     *
     * @param constantInitializationVector A constant initialization vector for encryption (optional).
When not specified the initialization vector will be periodically rotated.

     */
    public void setConstantInitializationVector(String constantInitializationVector) {
        this.constantInitializationVector = constantInitializationVector;
    }

    /**
     * A constant initialization vector for encryption (optional).
When not specified the initialization vector will be periodically rotated.

     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param constantInitializationVector A constant initialization vector for encryption (optional).
When not specified the initialization vector will be periodically rotated.

     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public HlsEncryption withConstantInitializationVector(String constantInitializationVector) {
        this.constantInitializationVector = constantInitializationVector;
        return this;
    }

    /**
     * The encryption method to use.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_128, SAMPLE_AES
     *
     * @return The encryption method to use.
     *
     * @see EncryptionMethod
     */
    public String getEncryptionMethod() {
        return encryptionMethod;
    }

    /**
     * The encryption method to use.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_128, SAMPLE_AES
     *
     * @param encryptionMethod The encryption method to use.
     *
     * @see EncryptionMethod
     */
    public void setEncryptionMethod(String encryptionMethod) {
        this.encryptionMethod = encryptionMethod;
    }

    /**
     * The encryption method to use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_128, SAMPLE_AES
     *
     * @param encryptionMethod The encryption method to use.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see EncryptionMethod
     */
    public HlsEncryption withEncryptionMethod(String encryptionMethod) {
        this.encryptionMethod = encryptionMethod;
        return this;
    }

    /**
     * The encryption method to use.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_128, SAMPLE_AES
     *
     * @param encryptionMethod The encryption method to use.
     *
     * @see EncryptionMethod
     */
    public void setEncryptionMethod(EncryptionMethod encryptionMethod) {
        this.encryptionMethod = encryptionMethod.toString();
    }

    /**
     * The encryption method to use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_128, SAMPLE_AES
     *
     * @param encryptionMethod The encryption method to use.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see EncryptionMethod
     */
    public HlsEncryption withEncryptionMethod(EncryptionMethod encryptionMethod) {
        this.encryptionMethod = encryptionMethod.toString();
        return this;
    }

    /**
     * A configuration for accessing an external Secure Packager and Encoder Key Exchange (SPEKE) service that will provide encryption keys.
     *
     * @return A configuration for accessing an external Secure Packager and Encoder Key Exchange (SPEKE) service that will provide encryption keys.
     */
    public SpekeKeyProvider getSpekeKeyProvider() {
        return spekeKeyProvider;
    }

    /**
     * A configuration for accessing an external Secure Packager and Encoder Key Exchange (SPEKE) service that will provide encryption keys.
     *
     * @param spekeKeyProvider A configuration for accessing an external Secure Packager and Encoder Key Exchange (SPEKE) service that will provide encryption keys.
     */
    public void setSpekeKeyProvider(SpekeKeyProvider spekeKeyProvider) {
        this.spekeKeyProvider = spekeKeyProvider;
    }

    /**
     * A configuration for accessing an external Secure Packager and Encoder Key Exchange (SPEKE) service that will provide encryption keys.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spekeKeyProvider A configuration for accessing an external Secure Packager and Encoder Key Exchange (SPEKE) service that will provide encryption keys.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public HlsEncryption withSpekeKeyProvider(SpekeKeyProvider spekeKeyProvider) {
        this.spekeKeyProvider = spekeKeyProvider;
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
        if (getConstantInitializationVector() != null) sb.append("ConstantInitializationVector: " + getConstantInitializationVector() + ",");
        if (getEncryptionMethod() != null) sb.append("EncryptionMethod: " + getEncryptionMethod() + ",");
        if (getSpekeKeyProvider() != null) sb.append("SpekeKeyProvider: " + getSpekeKeyProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConstantInitializationVector() == null) ? 0 : getConstantInitializationVector().hashCode());
        hashCode = prime * hashCode + ((getEncryptionMethod() == null) ? 0 : getEncryptionMethod().hashCode());
        hashCode = prime * hashCode + ((getSpekeKeyProvider() == null) ? 0 : getSpekeKeyProvider().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof HlsEncryption == false) return false;
        HlsEncryption other = (HlsEncryption)obj;

        if (other.getConstantInitializationVector() == null ^ this.getConstantInitializationVector() == null) return false;
        if (other.getConstantInitializationVector() != null && other.getConstantInitializationVector().equals(this.getConstantInitializationVector()) == false) return false;
        if (other.getEncryptionMethod() == null ^ this.getEncryptionMethod() == null) return false;
        if (other.getEncryptionMethod() != null && other.getEncryptionMethod().equals(this.getEncryptionMethod()) == false) return false;
        if (other.getSpekeKeyProvider() == null ^ this.getSpekeKeyProvider() == null) return false;
        if (other.getSpekeKeyProvider() != null && other.getSpekeKeyProvider().equals(this.getSpekeKeyProvider()) == false) return false;
        return true;
    }
}
