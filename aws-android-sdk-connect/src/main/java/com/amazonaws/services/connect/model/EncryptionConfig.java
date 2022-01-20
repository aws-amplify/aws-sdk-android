/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * The encryption configuration.
 * </p>
 */
public class EncryptionConfig implements Serializable {
    /**
     * <p>
     * The type of encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KMS
     */
    private String encryptionType;

    /**
     * <p>
     * The full ARN of the encryption key.
     * </p>
     * <note>
     * <p>
     * Be sure to provide the full ARN of the encryption key, not just the ID.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String keyId;

    /**
     * <p>
     * The type of encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KMS
     *
     * @return <p>
     *         The type of encryption.
     *         </p>
     * @see EncryptionType
     */
    public String getEncryptionType() {
        return encryptionType;
    }

    /**
     * <p>
     * The type of encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KMS
     *
     * @param encryptionType <p>
     *            The type of encryption.
     *            </p>
     * @see EncryptionType
     */
    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * <p>
     * The type of encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KMS
     *
     * @param encryptionType <p>
     *            The type of encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionType
     */
    public EncryptionConfig withEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    /**
     * <p>
     * The type of encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KMS
     *
     * @param encryptionType <p>
     *            The type of encryption.
     *            </p>
     * @see EncryptionType
     */
    public void setEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
    }

    /**
     * <p>
     * The type of encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KMS
     *
     * @param encryptionType <p>
     *            The type of encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionType
     */
    public EncryptionConfig withEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
        return this;
    }

    /**
     * <p>
     * The full ARN of the encryption key.
     * </p>
     * <note>
     * <p>
     * Be sure to provide the full ARN of the encryption key, not just the ID.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The full ARN of the encryption key.
     *         </p>
     *         <note>
     *         <p>
     *         Be sure to provide the full ARN of the encryption key, not just
     *         the ID.
     *         </p>
     *         </note>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The full ARN of the encryption key.
     * </p>
     * <note>
     * <p>
     * Be sure to provide the full ARN of the encryption key, not just the ID.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param keyId <p>
     *            The full ARN of the encryption key.
     *            </p>
     *            <note>
     *            <p>
     *            Be sure to provide the full ARN of the encryption key, not
     *            just the ID.
     *            </p>
     *            </note>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The full ARN of the encryption key.
     * </p>
     * <note>
     * <p>
     * Be sure to provide the full ARN of the encryption key, not just the ID.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param keyId <p>
     *            The full ARN of the encryption key.
     *            </p>
     *            <note>
     *            <p>
     *            Be sure to provide the full ARN of the encryption key, not
     *            just the ID.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncryptionConfig withKeyId(String keyId) {
        this.keyId = keyId;
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
        if (getEncryptionType() != null)
            sb.append("EncryptionType: " + getEncryptionType() + ",");
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionConfig == false)
            return false;
        EncryptionConfig other = (EncryptionConfig) obj;

        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null
                && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        return true;
    }
}
