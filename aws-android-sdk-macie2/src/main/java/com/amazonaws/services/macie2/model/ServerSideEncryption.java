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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about the server-side encryption settings for an S3
 * bucket or object.
 * </p>
 */
public class ServerSideEncryption implements Serializable {
    /**
     * <p>
     * The server-side encryption algorithm that's used when storing data in the
     * bucket or object. If encryption is disabled for the bucket or object,
     * this value is NONE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, AES256, aws:kms, UNKNOWN
     */
    private String encryptionType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS
     * KMS) master key that's used to encrypt the bucket or object. This value
     * is null if KMS isn't used to encrypt the bucket or object.
     * </p>
     */
    private String kmsMasterKeyId;

    /**
     * <p>
     * The server-side encryption algorithm that's used when storing data in the
     * bucket or object. If encryption is disabled for the bucket or object,
     * this value is NONE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, AES256, aws:kms, UNKNOWN
     *
     * @return <p>
     *         The server-side encryption algorithm that's used when storing
     *         data in the bucket or object. If encryption is disabled for the
     *         bucket or object, this value is NONE.
     *         </p>
     * @see EncryptionType
     */
    public String getEncryptionType() {
        return encryptionType;
    }

    /**
     * <p>
     * The server-side encryption algorithm that's used when storing data in the
     * bucket or object. If encryption is disabled for the bucket or object,
     * this value is NONE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, AES256, aws:kms, UNKNOWN
     *
     * @param encryptionType <p>
     *            The server-side encryption algorithm that's used when storing
     *            data in the bucket or object. If encryption is disabled for
     *            the bucket or object, this value is NONE.
     *            </p>
     * @see EncryptionType
     */
    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * <p>
     * The server-side encryption algorithm that's used when storing data in the
     * bucket or object. If encryption is disabled for the bucket or object,
     * this value is NONE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, AES256, aws:kms, UNKNOWN
     *
     * @param encryptionType <p>
     *            The server-side encryption algorithm that's used when storing
     *            data in the bucket or object. If encryption is disabled for
     *            the bucket or object, this value is NONE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionType
     */
    public ServerSideEncryption withEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    /**
     * <p>
     * The server-side encryption algorithm that's used when storing data in the
     * bucket or object. If encryption is disabled for the bucket or object,
     * this value is NONE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, AES256, aws:kms, UNKNOWN
     *
     * @param encryptionType <p>
     *            The server-side encryption algorithm that's used when storing
     *            data in the bucket or object. If encryption is disabled for
     *            the bucket or object, this value is NONE.
     *            </p>
     * @see EncryptionType
     */
    public void setEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
    }

    /**
     * <p>
     * The server-side encryption algorithm that's used when storing data in the
     * bucket or object. If encryption is disabled for the bucket or object,
     * this value is NONE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, AES256, aws:kms, UNKNOWN
     *
     * @param encryptionType <p>
     *            The server-side encryption algorithm that's used when storing
     *            data in the bucket or object. If encryption is disabled for
     *            the bucket or object, this value is NONE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionType
     */
    public ServerSideEncryption withEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS
     * KMS) master key that's used to encrypt the bucket or object. This value
     * is null if KMS isn't used to encrypt the bucket or object.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS Key Management Service
     *         (AWS KMS) master key that's used to encrypt the bucket or object.
     *         This value is null if KMS isn't used to encrypt the bucket or
     *         object.
     *         </p>
     */
    public String getKmsMasterKeyId() {
        return kmsMasterKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS
     * KMS) master key that's used to encrypt the bucket or object. This value
     * is null if KMS isn't used to encrypt the bucket or object.
     * </p>
     *
     * @param kmsMasterKeyId <p>
     *            The Amazon Resource Name (ARN) of the AWS Key Management
     *            Service (AWS KMS) master key that's used to encrypt the bucket
     *            or object. This value is null if KMS isn't used to encrypt the
     *            bucket or object.
     *            </p>
     */
    public void setKmsMasterKeyId(String kmsMasterKeyId) {
        this.kmsMasterKeyId = kmsMasterKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS
     * KMS) master key that's used to encrypt the bucket or object. This value
     * is null if KMS isn't used to encrypt the bucket or object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsMasterKeyId <p>
     *            The Amazon Resource Name (ARN) of the AWS Key Management
     *            Service (AWS KMS) master key that's used to encrypt the bucket
     *            or object. This value is null if KMS isn't used to encrypt the
     *            bucket or object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServerSideEncryption withKmsMasterKeyId(String kmsMasterKeyId) {
        this.kmsMasterKeyId = kmsMasterKeyId;
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
            sb.append("encryptionType: " + getEncryptionType() + ",");
        if (getKmsMasterKeyId() != null)
            sb.append("kmsMasterKeyId: " + getKmsMasterKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        hashCode = prime * hashCode
                + ((getKmsMasterKeyId() == null) ? 0 : getKmsMasterKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerSideEncryption == false)
            return false;
        ServerSideEncryption other = (ServerSideEncryption) obj;

        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null
                && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        if (other.getKmsMasterKeyId() == null ^ this.getKmsMasterKeyId() == null)
            return false;
        if (other.getKmsMasterKeyId() != null
                && other.getKmsMasterKeyId().equals(this.getKmsMasterKeyId()) == false)
            return false;
        return true;
    }
}
