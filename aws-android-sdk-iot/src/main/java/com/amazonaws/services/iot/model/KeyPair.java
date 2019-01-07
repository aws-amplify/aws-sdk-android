/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a key pair.
 * </p>
 */
public class KeyPair implements Serializable {
    /**
     * <p>
     * The public key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String publicKey;

    /**
     * <p>
     * The private key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String privateKey;

    /**
     * <p>
     * The public key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The public key.
     *         </p>
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * <p>
     * The public key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param publicKey <p>
     *            The public key.
     *            </p>
     */
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * <p>
     * The public key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param publicKey <p>
     *            The public key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyPair withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * <p>
     * The private key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The private key.
     *         </p>
     */
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * <p>
     * The private key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param privateKey <p>
     *            The private key.
     *            </p>
     */
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    /**
     * <p>
     * The private key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param privateKey <p>
     *            The private key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyPair withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
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
        if (getPublicKey() != null)
            sb.append("PublicKey: " + getPublicKey() + ",");
        if (getPrivateKey() != null)
            sb.append("PrivateKey: " + getPrivateKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        hashCode = prime * hashCode + ((getPrivateKey() == null) ? 0 : getPrivateKey().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyPair == false)
            return false;
        KeyPair other = (KeyPair) obj;

        if (other.getPublicKey() == null ^ this.getPublicKey() == null)
            return false;
        if (other.getPublicKey() != null
                && other.getPublicKey().equals(this.getPublicKey()) == false)
            return false;
        if (other.getPrivateKey() == null ^ this.getPrivateKey() == null)
            return false;
        if (other.getPrivateKey() != null
                && other.getPrivateKey().equals(this.getPrivateKey()) == false)
            return false;
        return true;
    }
}
