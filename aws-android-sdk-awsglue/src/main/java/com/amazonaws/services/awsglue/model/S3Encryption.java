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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies how Amazon Simple Storage Service (Amazon S3) data should be
 * encrypted.
 * </p>
 */
public class S3Encryption implements Serializable {
    /**
     * <p>
     * The encryption mode to use for Amazon S3 data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, SSE-KMS, SSE-S3
     */
    private String s3EncryptionMode;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the
     * data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:kms:.*<br/>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The encryption mode to use for Amazon S3 data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, SSE-KMS, SSE-S3
     *
     * @return <p>
     *         The encryption mode to use for Amazon S3 data.
     *         </p>
     * @see S3EncryptionMode
     */
    public String getS3EncryptionMode() {
        return s3EncryptionMode;
    }

    /**
     * <p>
     * The encryption mode to use for Amazon S3 data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, SSE-KMS, SSE-S3
     *
     * @param s3EncryptionMode <p>
     *            The encryption mode to use for Amazon S3 data.
     *            </p>
     * @see S3EncryptionMode
     */
    public void setS3EncryptionMode(String s3EncryptionMode) {
        this.s3EncryptionMode = s3EncryptionMode;
    }

    /**
     * <p>
     * The encryption mode to use for Amazon S3 data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, SSE-KMS, SSE-S3
     *
     * @param s3EncryptionMode <p>
     *            The encryption mode to use for Amazon S3 data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see S3EncryptionMode
     */
    public S3Encryption withS3EncryptionMode(String s3EncryptionMode) {
        this.s3EncryptionMode = s3EncryptionMode;
        return this;
    }

    /**
     * <p>
     * The encryption mode to use for Amazon S3 data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, SSE-KMS, SSE-S3
     *
     * @param s3EncryptionMode <p>
     *            The encryption mode to use for Amazon S3 data.
     *            </p>
     * @see S3EncryptionMode
     */
    public void setS3EncryptionMode(S3EncryptionMode s3EncryptionMode) {
        this.s3EncryptionMode = s3EncryptionMode.toString();
    }

    /**
     * <p>
     * The encryption mode to use for Amazon S3 data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, SSE-KMS, SSE-S3
     *
     * @param s3EncryptionMode <p>
     *            The encryption mode to use for Amazon S3 data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see S3EncryptionMode
     */
    public S3Encryption withS3EncryptionMode(S3EncryptionMode s3EncryptionMode) {
        this.s3EncryptionMode = s3EncryptionMode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the
     * data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:kms:.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the KMS key to be used to
     *         encrypt the data.
     *         </p>
     */
    public String getKmsKeyArn() {
        return kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the
     * data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:kms:.*<br/>
     *
     * @param kmsKeyArn <p>
     *            The Amazon Resource Name (ARN) of the KMS key to be used to
     *            encrypt the data.
     *            </p>
     */
    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the
     * data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:kms:.*<br/>
     *
     * @param kmsKeyArn <p>
     *            The Amazon Resource Name (ARN) of the KMS key to be used to
     *            encrypt the data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Encryption withKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
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
        if (getS3EncryptionMode() != null)
            sb.append("S3EncryptionMode: " + getS3EncryptionMode() + ",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: " + getKmsKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getS3EncryptionMode() == null) ? 0 : getS3EncryptionMode().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Encryption == false)
            return false;
        S3Encryption other = (S3Encryption) obj;

        if (other.getS3EncryptionMode() == null ^ this.getS3EncryptionMode() == null)
            return false;
        if (other.getS3EncryptionMode() != null
                && other.getS3EncryptionMode().equals(this.getS3EncryptionMode()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null
                && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        return true;
    }
}
