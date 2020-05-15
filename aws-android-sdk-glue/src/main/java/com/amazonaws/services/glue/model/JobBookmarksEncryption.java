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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies how job bookmark data should be encrypted.
 * </p>
 */
public class JobBookmarksEncryption implements Serializable {
    /**
     * <p>
     * The encryption mode to use for job bookmarks data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, CSE-KMS
     */
    private String jobBookmarksEncryptionMode;

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
     * The encryption mode to use for job bookmarks data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, CSE-KMS
     *
     * @return <p>
     *         The encryption mode to use for job bookmarks data.
     *         </p>
     * @see JobBookmarksEncryptionMode
     */
    public String getJobBookmarksEncryptionMode() {
        return jobBookmarksEncryptionMode;
    }

    /**
     * <p>
     * The encryption mode to use for job bookmarks data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, CSE-KMS
     *
     * @param jobBookmarksEncryptionMode <p>
     *            The encryption mode to use for job bookmarks data.
     *            </p>
     * @see JobBookmarksEncryptionMode
     */
    public void setJobBookmarksEncryptionMode(String jobBookmarksEncryptionMode) {
        this.jobBookmarksEncryptionMode = jobBookmarksEncryptionMode;
    }

    /**
     * <p>
     * The encryption mode to use for job bookmarks data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, CSE-KMS
     *
     * @param jobBookmarksEncryptionMode <p>
     *            The encryption mode to use for job bookmarks data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobBookmarksEncryptionMode
     */
    public JobBookmarksEncryption withJobBookmarksEncryptionMode(String jobBookmarksEncryptionMode) {
        this.jobBookmarksEncryptionMode = jobBookmarksEncryptionMode;
        return this;
    }

    /**
     * <p>
     * The encryption mode to use for job bookmarks data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, CSE-KMS
     *
     * @param jobBookmarksEncryptionMode <p>
     *            The encryption mode to use for job bookmarks data.
     *            </p>
     * @see JobBookmarksEncryptionMode
     */
    public void setJobBookmarksEncryptionMode(JobBookmarksEncryptionMode jobBookmarksEncryptionMode) {
        this.jobBookmarksEncryptionMode = jobBookmarksEncryptionMode.toString();
    }

    /**
     * <p>
     * The encryption mode to use for job bookmarks data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, CSE-KMS
     *
     * @param jobBookmarksEncryptionMode <p>
     *            The encryption mode to use for job bookmarks data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobBookmarksEncryptionMode
     */
    public JobBookmarksEncryption withJobBookmarksEncryptionMode(
            JobBookmarksEncryptionMode jobBookmarksEncryptionMode) {
        this.jobBookmarksEncryptionMode = jobBookmarksEncryptionMode.toString();
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
    public JobBookmarksEncryption withKmsKeyArn(String kmsKeyArn) {
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
        if (getJobBookmarksEncryptionMode() != null)
            sb.append("JobBookmarksEncryptionMode: " + getJobBookmarksEncryptionMode() + ",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: " + getKmsKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getJobBookmarksEncryptionMode() == null) ? 0 : getJobBookmarksEncryptionMode()
                        .hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobBookmarksEncryption == false)
            return false;
        JobBookmarksEncryption other = (JobBookmarksEncryption) obj;

        if (other.getJobBookmarksEncryptionMode() == null
                ^ this.getJobBookmarksEncryptionMode() == null)
            return false;
        if (other.getJobBookmarksEncryptionMode() != null
                && other.getJobBookmarksEncryptionMode().equals(
                        this.getJobBookmarksEncryptionMode()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null
                && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        return true;
    }
}
