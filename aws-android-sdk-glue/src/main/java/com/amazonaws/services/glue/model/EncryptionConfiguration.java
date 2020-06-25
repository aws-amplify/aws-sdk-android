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
 * Specifies an encryption configuration.
 * </p>
 */
public class EncryptionConfiguration implements Serializable {
    /**
     * <p>
     * The encryption configuration for Amazon Simple Storage Service (Amazon
     * S3) data.
     * </p>
     */
    private java.util.List<S3Encryption> s3Encryption;

    /**
     * <p>
     * The encryption configuration for Amazon CloudWatch.
     * </p>
     */
    private CloudWatchEncryption cloudWatchEncryption;

    /**
     * <p>
     * The encryption configuration for job bookmarks.
     * </p>
     */
    private JobBookmarksEncryption jobBookmarksEncryption;

    /**
     * <p>
     * The encryption configuration for Amazon Simple Storage Service (Amazon
     * S3) data.
     * </p>
     *
     * @return <p>
     *         The encryption configuration for Amazon Simple Storage Service
     *         (Amazon S3) data.
     *         </p>
     */
    public java.util.List<S3Encryption> getS3Encryption() {
        return s3Encryption;
    }

    /**
     * <p>
     * The encryption configuration for Amazon Simple Storage Service (Amazon
     * S3) data.
     * </p>
     *
     * @param s3Encryption <p>
     *            The encryption configuration for Amazon Simple Storage Service
     *            (Amazon S3) data.
     *            </p>
     */
    public void setS3Encryption(java.util.Collection<S3Encryption> s3Encryption) {
        if (s3Encryption == null) {
            this.s3Encryption = null;
            return;
        }

        this.s3Encryption = new java.util.ArrayList<S3Encryption>(s3Encryption);
    }

    /**
     * <p>
     * The encryption configuration for Amazon Simple Storage Service (Amazon
     * S3) data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Encryption <p>
     *            The encryption configuration for Amazon Simple Storage Service
     *            (Amazon S3) data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncryptionConfiguration withS3Encryption(S3Encryption... s3Encryption) {
        if (getS3Encryption() == null) {
            this.s3Encryption = new java.util.ArrayList<S3Encryption>(s3Encryption.length);
        }
        for (S3Encryption value : s3Encryption) {
            this.s3Encryption.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The encryption configuration for Amazon Simple Storage Service (Amazon
     * S3) data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Encryption <p>
     *            The encryption configuration for Amazon Simple Storage Service
     *            (Amazon S3) data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncryptionConfiguration withS3Encryption(java.util.Collection<S3Encryption> s3Encryption) {
        setS3Encryption(s3Encryption);
        return this;
    }

    /**
     * <p>
     * The encryption configuration for Amazon CloudWatch.
     * </p>
     *
     * @return <p>
     *         The encryption configuration for Amazon CloudWatch.
     *         </p>
     */
    public CloudWatchEncryption getCloudWatchEncryption() {
        return cloudWatchEncryption;
    }

    /**
     * <p>
     * The encryption configuration for Amazon CloudWatch.
     * </p>
     *
     * @param cloudWatchEncryption <p>
     *            The encryption configuration for Amazon CloudWatch.
     *            </p>
     */
    public void setCloudWatchEncryption(CloudWatchEncryption cloudWatchEncryption) {
        this.cloudWatchEncryption = cloudWatchEncryption;
    }

    /**
     * <p>
     * The encryption configuration for Amazon CloudWatch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudWatchEncryption <p>
     *            The encryption configuration for Amazon CloudWatch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncryptionConfiguration withCloudWatchEncryption(
            CloudWatchEncryption cloudWatchEncryption) {
        this.cloudWatchEncryption = cloudWatchEncryption;
        return this;
    }

    /**
     * <p>
     * The encryption configuration for job bookmarks.
     * </p>
     *
     * @return <p>
     *         The encryption configuration for job bookmarks.
     *         </p>
     */
    public JobBookmarksEncryption getJobBookmarksEncryption() {
        return jobBookmarksEncryption;
    }

    /**
     * <p>
     * The encryption configuration for job bookmarks.
     * </p>
     *
     * @param jobBookmarksEncryption <p>
     *            The encryption configuration for job bookmarks.
     *            </p>
     */
    public void setJobBookmarksEncryption(JobBookmarksEncryption jobBookmarksEncryption) {
        this.jobBookmarksEncryption = jobBookmarksEncryption;
    }

    /**
     * <p>
     * The encryption configuration for job bookmarks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobBookmarksEncryption <p>
     *            The encryption configuration for job bookmarks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncryptionConfiguration withJobBookmarksEncryption(
            JobBookmarksEncryption jobBookmarksEncryption) {
        this.jobBookmarksEncryption = jobBookmarksEncryption;
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
        if (getS3Encryption() != null)
            sb.append("S3Encryption: " + getS3Encryption() + ",");
        if (getCloudWatchEncryption() != null)
            sb.append("CloudWatchEncryption: " + getCloudWatchEncryption() + ",");
        if (getJobBookmarksEncryption() != null)
            sb.append("JobBookmarksEncryption: " + getJobBookmarksEncryption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getS3Encryption() == null) ? 0 : getS3Encryption().hashCode());
        hashCode = prime * hashCode
                + ((getCloudWatchEncryption() == null) ? 0 : getCloudWatchEncryption().hashCode());
        hashCode = prime
                * hashCode
                + ((getJobBookmarksEncryption() == null) ? 0 : getJobBookmarksEncryption()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionConfiguration == false)
            return false;
        EncryptionConfiguration other = (EncryptionConfiguration) obj;

        if (other.getS3Encryption() == null ^ this.getS3Encryption() == null)
            return false;
        if (other.getS3Encryption() != null
                && other.getS3Encryption().equals(this.getS3Encryption()) == false)
            return false;
        if (other.getCloudWatchEncryption() == null ^ this.getCloudWatchEncryption() == null)
            return false;
        if (other.getCloudWatchEncryption() != null
                && other.getCloudWatchEncryption().equals(this.getCloudWatchEncryption()) == false)
            return false;
        if (other.getJobBookmarksEncryption() == null ^ this.getJobBookmarksEncryption() == null)
            return false;
        if (other.getJobBookmarksEncryption() != null
                && other.getJobBookmarksEncryption().equals(this.getJobBookmarksEncryption()) == false)
            return false;
        return true;
    }
}
