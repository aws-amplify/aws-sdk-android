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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

public class DecryptResult implements Serializable {
    /**
     * <p>
     * ARN of the key used to perform the decryption. This value is returned if
     * no errors are encountered during the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * Decrypted plaintext data. When you use the HTTP API or the AWS CLI, the
     * value is Base64-encdoded. Otherwise, it is not encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     */
    private java.nio.ByteBuffer plaintext;

    /**
     * <p>
     * ARN of the key used to perform the decryption. This value is returned if
     * no errors are encountered during the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         ARN of the key used to perform the decryption. This value is
     *         returned if no errors are encountered during the operation.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * ARN of the key used to perform the decryption. This value is returned if
     * no errors are encountered during the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            ARN of the key used to perform the decryption. This value is
     *            returned if no errors are encountered during the operation.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * ARN of the key used to perform the decryption. This value is returned if
     * no errors are encountered during the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            ARN of the key used to perform the decryption. This value is
     *            returned if no errors are encountered during the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecryptResult withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * Decrypted plaintext data. When you use the HTTP API or the AWS CLI, the
     * value is Base64-encdoded. Otherwise, it is not encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @return <p>
     *         Decrypted plaintext data. When you use the HTTP API or the AWS
     *         CLI, the value is Base64-encdoded. Otherwise, it is not encoded.
     *         </p>
     */
    public java.nio.ByteBuffer getPlaintext() {
        return plaintext;
    }

    /**
     * <p>
     * Decrypted plaintext data. When you use the HTTP API or the AWS CLI, the
     * value is Base64-encdoded. Otherwise, it is not encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param plaintext <p>
     *            Decrypted plaintext data. When you use the HTTP API or the AWS
     *            CLI, the value is Base64-encdoded. Otherwise, it is not
     *            encoded.
     *            </p>
     */
    public void setPlaintext(java.nio.ByteBuffer plaintext) {
        this.plaintext = plaintext;
    }

    /**
     * <p>
     * Decrypted plaintext data. When you use the HTTP API or the AWS CLI, the
     * value is Base64-encdoded. Otherwise, it is not encoded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param plaintext <p>
     *            Decrypted plaintext data. When you use the HTTP API or the AWS
     *            CLI, the value is Base64-encdoded. Otherwise, it is not
     *            encoded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecryptResult withPlaintext(java.nio.ByteBuffer plaintext) {
        this.plaintext = plaintext;
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
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getPlaintext() != null)
            sb.append("Plaintext: " + getPlaintext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getPlaintext() == null) ? 0 : getPlaintext().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DecryptResult == false)
            return false;
        DecryptResult other = (DecryptResult) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getPlaintext() == null ^ this.getPlaintext() == null)
            return false;
        if (other.getPlaintext() != null
                && other.getPlaintext().equals(this.getPlaintext()) == false)
            return false;
        return true;
    }
}
