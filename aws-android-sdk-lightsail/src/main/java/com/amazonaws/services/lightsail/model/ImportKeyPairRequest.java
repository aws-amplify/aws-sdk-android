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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Imports a public SSH key from a specific key pair.
 * </p>
 */
public class ImportKeyPairRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the key pair for which you want to import the public key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String keyPairName;

    /**
     * <p>
     * A base64-encoded public key of the <code>ssh-rsa</code> type.
     * </p>
     */
    private String publicKeyBase64;

    /**
     * <p>
     * The name of the key pair for which you want to import the public key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the key pair for which you want to import the public
     *         key.
     *         </p>
     */
    public String getKeyPairName() {
        return keyPairName;
    }

    /**
     * <p>
     * The name of the key pair for which you want to import the public key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param keyPairName <p>
     *            The name of the key pair for which you want to import the
     *            public key.
     *            </p>
     */
    public void setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
    }

    /**
     * <p>
     * The name of the key pair for which you want to import the public key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param keyPairName <p>
     *            The name of the key pair for which you want to import the
     *            public key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportKeyPairRequest withKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }

    /**
     * <p>
     * A base64-encoded public key of the <code>ssh-rsa</code> type.
     * </p>
     *
     * @return <p>
     *         A base64-encoded public key of the <code>ssh-rsa</code> type.
     *         </p>
     */
    public String getPublicKeyBase64() {
        return publicKeyBase64;
    }

    /**
     * <p>
     * A base64-encoded public key of the <code>ssh-rsa</code> type.
     * </p>
     *
     * @param publicKeyBase64 <p>
     *            A base64-encoded public key of the <code>ssh-rsa</code> type.
     *            </p>
     */
    public void setPublicKeyBase64(String publicKeyBase64) {
        this.publicKeyBase64 = publicKeyBase64;
    }

    /**
     * <p>
     * A base64-encoded public key of the <code>ssh-rsa</code> type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicKeyBase64 <p>
     *            A base64-encoded public key of the <code>ssh-rsa</code> type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportKeyPairRequest withPublicKeyBase64(String publicKeyBase64) {
        this.publicKeyBase64 = publicKeyBase64;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKeyPairName() != null)
            sb.append("keyPairName: " + getKeyPairName() + ",");
        if (getPublicKeyBase64() != null)
            sb.append("publicKeyBase64: " + getPublicKeyBase64());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKeyPairName() == null) ? 0 : getKeyPairName().hashCode());
        hashCode = prime * hashCode
                + ((getPublicKeyBase64() == null) ? 0 : getPublicKeyBase64().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportKeyPairRequest == false)
            return false;
        ImportKeyPairRequest other = (ImportKeyPairRequest) obj;

        if (other.getKeyPairName() == null ^ this.getKeyPairName() == null)
            return false;
        if (other.getKeyPairName() != null
                && other.getKeyPairName().equals(this.getKeyPairName()) == false)
            return false;
        if (other.getPublicKeyBase64() == null ^ this.getPublicKeyBase64() == null)
            return false;
        if (other.getPublicKeyBase64() != null
                && other.getPublicKeyBase64().equals(this.getPublicKeyBase64()) == false)
            return false;
        return true;
    }
}
