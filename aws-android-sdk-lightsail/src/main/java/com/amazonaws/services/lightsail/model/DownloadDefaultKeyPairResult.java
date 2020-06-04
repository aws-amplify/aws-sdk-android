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

public class DownloadDefaultKeyPairResult implements Serializable {
    /**
     * <p>
     * A base64-encoded public key of the <code>ssh-rsa</code> type.
     * </p>
     */
    private String publicKeyBase64;

    /**
     * <p>
     * A base64-encoded RSA private key.
     * </p>
     */
    private String privateKeyBase64;

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
    public DownloadDefaultKeyPairResult withPublicKeyBase64(String publicKeyBase64) {
        this.publicKeyBase64 = publicKeyBase64;
        return this;
    }

    /**
     * <p>
     * A base64-encoded RSA private key.
     * </p>
     *
     * @return <p>
     *         A base64-encoded RSA private key.
     *         </p>
     */
    public String getPrivateKeyBase64() {
        return privateKeyBase64;
    }

    /**
     * <p>
     * A base64-encoded RSA private key.
     * </p>
     *
     * @param privateKeyBase64 <p>
     *            A base64-encoded RSA private key.
     *            </p>
     */
    public void setPrivateKeyBase64(String privateKeyBase64) {
        this.privateKeyBase64 = privateKeyBase64;
    }

    /**
     * <p>
     * A base64-encoded RSA private key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateKeyBase64 <p>
     *            A base64-encoded RSA private key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DownloadDefaultKeyPairResult withPrivateKeyBase64(String privateKeyBase64) {
        this.privateKeyBase64 = privateKeyBase64;
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
        if (getPublicKeyBase64() != null)
            sb.append("publicKeyBase64: " + getPublicKeyBase64() + ",");
        if (getPrivateKeyBase64() != null)
            sb.append("privateKeyBase64: " + getPrivateKeyBase64());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPublicKeyBase64() == null) ? 0 : getPublicKeyBase64().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateKeyBase64() == null) ? 0 : getPrivateKeyBase64().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DownloadDefaultKeyPairResult == false)
            return false;
        DownloadDefaultKeyPairResult other = (DownloadDefaultKeyPairResult) obj;

        if (other.getPublicKeyBase64() == null ^ this.getPublicKeyBase64() == null)
            return false;
        if (other.getPublicKeyBase64() != null
                && other.getPublicKeyBase64().equals(this.getPublicKeyBase64()) == false)
            return false;
        if (other.getPrivateKeyBase64() == null ^ this.getPrivateKeyBase64() == null)
            return false;
        if (other.getPrivateKeyBase64() != null
                && other.getPrivateKeyBase64().equals(this.getPrivateKeyBase64()) == false)
            return false;
        return true;
    }
}
