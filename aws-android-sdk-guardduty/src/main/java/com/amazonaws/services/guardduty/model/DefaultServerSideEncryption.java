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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information on the server side encryption method used in the S3
 * bucket. See <a href=
 * "https://docs.aws.amazon.com/AmazonS3/atest/dev/serv-side-encryption.html">S3
 * Server-Side Encryption</a> for more information.
 * </p>
 */
public class DefaultServerSideEncryption implements Serializable {
    /**
     * <p>
     * The type of encryption used for objects within the S3 bucket.
     * </p>
     */
    private String encryptionType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS encryption key. Only available
     * if the bucket <code>EncryptionType</code> is <code>aws:kms</code>.
     * </p>
     */
    private String kmsMasterKeyArn;

    /**
     * <p>
     * The type of encryption used for objects within the S3 bucket.
     * </p>
     *
     * @return <p>
     *         The type of encryption used for objects within the S3 bucket.
     *         </p>
     */
    public String getEncryptionType() {
        return encryptionType;
    }

    /**
     * <p>
     * The type of encryption used for objects within the S3 bucket.
     * </p>
     *
     * @param encryptionType <p>
     *            The type of encryption used for objects within the S3 bucket.
     *            </p>
     */
    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * <p>
     * The type of encryption used for objects within the S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionType <p>
     *            The type of encryption used for objects within the S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultServerSideEncryption withEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS encryption key. Only available
     * if the bucket <code>EncryptionType</code> is <code>aws:kms</code>.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the KMS encryption key. Only
     *         available if the bucket <code>EncryptionType</code> is
     *         <code>aws:kms</code>.
     *         </p>
     */
    public String getKmsMasterKeyArn() {
        return kmsMasterKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS encryption key. Only available
     * if the bucket <code>EncryptionType</code> is <code>aws:kms</code>.
     * </p>
     *
     * @param kmsMasterKeyArn <p>
     *            The Amazon Resource Name (ARN) of the KMS encryption key. Only
     *            available if the bucket <code>EncryptionType</code> is
     *            <code>aws:kms</code>.
     *            </p>
     */
    public void setKmsMasterKeyArn(String kmsMasterKeyArn) {
        this.kmsMasterKeyArn = kmsMasterKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS encryption key. Only available
     * if the bucket <code>EncryptionType</code> is <code>aws:kms</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsMasterKeyArn <p>
     *            The Amazon Resource Name (ARN) of the KMS encryption key. Only
     *            available if the bucket <code>EncryptionType</code> is
     *            <code>aws:kms</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultServerSideEncryption withKmsMasterKeyArn(String kmsMasterKeyArn) {
        this.kmsMasterKeyArn = kmsMasterKeyArn;
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
        if (getKmsMasterKeyArn() != null)
            sb.append("KmsMasterKeyArn: " + getKmsMasterKeyArn());
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
                + ((getKmsMasterKeyArn() == null) ? 0 : getKmsMasterKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultServerSideEncryption == false)
            return false;
        DefaultServerSideEncryption other = (DefaultServerSideEncryption) obj;

        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null
                && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        if (other.getKmsMasterKeyArn() == null ^ this.getKmsMasterKeyArn() == null)
            return false;
        if (other.getKmsMasterKeyArn() != null
                && other.getKmsMasterKeyArn().equals(this.getKmsMasterKeyArn()) == false)
            return false;
        return true;
    }
}
