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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

public class EncryptResult implements Serializable {
    /**
     * <p>
     * The encrypted plaintext. When you use the HTTP API or the AWS CLI, the
     * value is Base64-encoded. Otherwise, it is not Base64-encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     */
    private java.nio.ByteBuffer ciphertextBlob;

    /**
     * <p>
     * The ID of the key used during encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * The encryption algorithm that was used to encrypt the plaintext.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     */
    private String encryptionAlgorithm;

    /**
     * <p>
     * The encrypted plaintext. When you use the HTTP API or the AWS CLI, the
     * value is Base64-encoded. Otherwise, it is not Base64-encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @return <p>
     *         The encrypted plaintext. When you use the HTTP API or the AWS
     *         CLI, the value is Base64-encoded. Otherwise, it is not
     *         Base64-encoded.
     *         </p>
     */
    public java.nio.ByteBuffer getCiphertextBlob() {
        return ciphertextBlob;
    }

    /**
     * <p>
     * The encrypted plaintext. When you use the HTTP API or the AWS CLI, the
     * value is Base64-encoded. Otherwise, it is not Base64-encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param ciphertextBlob <p>
     *            The encrypted plaintext. When you use the HTTP API or the AWS
     *            CLI, the value is Base64-encoded. Otherwise, it is not
     *            Base64-encoded.
     *            </p>
     */
    public void setCiphertextBlob(java.nio.ByteBuffer ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
    }

    /**
     * <p>
     * The encrypted plaintext. When you use the HTTP API or the AWS CLI, the
     * value is Base64-encoded. Otherwise, it is not Base64-encoded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param ciphertextBlob <p>
     *            The encrypted plaintext. When you use the HTTP API or the AWS
     *            CLI, the value is Base64-encoded. Otherwise, it is not
     *            Base64-encoded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncryptResult withCiphertextBlob(java.nio.ByteBuffer ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }

    /**
     * <p>
     * The ID of the key used during encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The ID of the key used during encryption.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The ID of the key used during encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The ID of the key used during encryption.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The ID of the key used during encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The ID of the key used during encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncryptResult withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * The encryption algorithm that was used to encrypt the plaintext.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @return <p>
     *         The encryption algorithm that was used to encrypt the plaintext.
     *         </p>
     * @see EncryptionAlgorithmSpec
     */
    public String getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    /**
     * <p>
     * The encryption algorithm that was used to encrypt the plaintext.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @param encryptionAlgorithm <p>
     *            The encryption algorithm that was used to encrypt the
     *            plaintext.
     *            </p>
     * @see EncryptionAlgorithmSpec
     */
    public void setEncryptionAlgorithm(String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    /**
     * <p>
     * The encryption algorithm that was used to encrypt the plaintext.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @param encryptionAlgorithm <p>
     *            The encryption algorithm that was used to encrypt the
     *            plaintext.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionAlgorithmSpec
     */
    public EncryptResult withEncryptionAlgorithm(String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        return this;
    }

    /**
     * <p>
     * The encryption algorithm that was used to encrypt the plaintext.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @param encryptionAlgorithm <p>
     *            The encryption algorithm that was used to encrypt the
     *            plaintext.
     *            </p>
     * @see EncryptionAlgorithmSpec
     */
    public void setEncryptionAlgorithm(EncryptionAlgorithmSpec encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm.toString();
    }

    /**
     * <p>
     * The encryption algorithm that was used to encrypt the plaintext.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @param encryptionAlgorithm <p>
     *            The encryption algorithm that was used to encrypt the
     *            plaintext.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionAlgorithmSpec
     */
    public EncryptResult withEncryptionAlgorithm(EncryptionAlgorithmSpec encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm.toString();
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
        if (getCiphertextBlob() != null)
            sb.append("CiphertextBlob: " + getCiphertextBlob() + ",");
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getEncryptionAlgorithm() != null)
            sb.append("EncryptionAlgorithm: " + getEncryptionAlgorithm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCiphertextBlob() == null) ? 0 : getCiphertextBlob().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionAlgorithm() == null) ? 0 : getEncryptionAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptResult == false)
            return false;
        EncryptResult other = (EncryptResult) obj;

        if (other.getCiphertextBlob() == null ^ this.getCiphertextBlob() == null)
            return false;
        if (other.getCiphertextBlob() != null
                && other.getCiphertextBlob().equals(this.getCiphertextBlob()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getEncryptionAlgorithm() == null ^ this.getEncryptionAlgorithm() == null)
            return false;
        if (other.getEncryptionAlgorithm() != null
                && other.getEncryptionAlgorithm().equals(this.getEncryptionAlgorithm()) == false)
            return false;
        return true;
    }
}
