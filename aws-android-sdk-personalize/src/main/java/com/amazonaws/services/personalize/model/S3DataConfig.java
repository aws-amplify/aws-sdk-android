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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

/**
 * <p>
 * The configuration details of an Amazon S3 input or output bucket.
 * </p>
 */
public class S3DataConfig implements Serializable {
    /**
     * <p>
     * The file path of the Amazon S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String path;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Key Management Service (KMS)
     * key that Amazon Personalize uses to encrypt or decrypt the input and
     * output files of a batch inference job.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The file path of the Amazon S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The file path of the Amazon S3 bucket.
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The file path of the Amazon S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param path <p>
     *            The file path of the Amazon S3 bucket.
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The file path of the Amazon S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param path <p>
     *            The file path of the Amazon S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3DataConfig withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Key Management Service (KMS)
     * key that Amazon Personalize uses to encrypt or decrypt the input and
     * output files of a batch inference job.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Amazon Key Management
     *         Service (KMS) key that Amazon Personalize uses to encrypt or
     *         decrypt the input and output files of a batch inference job.
     *         </p>
     */
    public String getKmsKeyArn() {
        return kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Key Management Service (KMS)
     * key that Amazon Personalize uses to encrypt or decrypt the input and
     * output files of a batch inference job.
     * </p>
     *
     * @param kmsKeyArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon Key Management
     *            Service (KMS) key that Amazon Personalize uses to encrypt or
     *            decrypt the input and output files of a batch inference job.
     *            </p>
     */
    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Key Management Service (KMS)
     * key that Amazon Personalize uses to encrypt or decrypt the input and
     * output files of a batch inference job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon Key Management
     *            Service (KMS) key that Amazon Personalize uses to encrypt or
     *            decrypt the input and output files of a batch inference job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3DataConfig withKmsKeyArn(String kmsKeyArn) {
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
        if (getPath() != null)
            sb.append("path: " + getPath() + ",");
        if (getKmsKeyArn() != null)
            sb.append("kmsKeyArn: " + getKmsKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3DataConfig == false)
            return false;
        S3DataConfig other = (S3DataConfig) obj;

        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null
                && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        return true;
    }
}
