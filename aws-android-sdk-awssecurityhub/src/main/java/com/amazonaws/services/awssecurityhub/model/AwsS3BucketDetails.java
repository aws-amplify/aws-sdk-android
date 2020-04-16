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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * The details of an Amazon S3 bucket.
 * </p>
 */
public class AwsS3BucketDetails implements Serializable {
    /**
     * <p>
     * The canonical user ID of the owner of the S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String ownerId;

    /**
     * <p>
     * The display name of the owner of the S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String ownerName;

    /**
     * <p>
     * The date and time when the S3 bucket was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String createdAt;

    /**
     * <p>
     * The encryption rules that are applied to the S3 bucket.
     * </p>
     */
    private AwsS3BucketServerSideEncryptionConfiguration serverSideEncryptionConfiguration;

    /**
     * <p>
     * The canonical user ID of the owner of the S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The canonical user ID of the owner of the S3 bucket.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The canonical user ID of the owner of the S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ownerId <p>
     *            The canonical user ID of the owner of the S3 bucket.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The canonical user ID of the owner of the S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ownerId <p>
     *            The canonical user ID of the owner of the S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsS3BucketDetails withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * The display name of the owner of the S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The display name of the owner of the S3 bucket.
     *         </p>
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * <p>
     * The display name of the owner of the S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ownerName <p>
     *            The display name of the owner of the S3 bucket.
     *            </p>
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * <p>
     * The display name of the owner of the S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ownerName <p>
     *            The display name of the owner of the S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsS3BucketDetails withOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    /**
     * <p>
     * The date and time when the S3 bucket was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The date and time when the S3 bucket was created.
     *         </p>
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The date and time when the S3 bucket was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param createdAt <p>
     *            The date and time when the S3 bucket was created.
     *            </p>
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time when the S3 bucket was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param createdAt <p>
     *            The date and time when the S3 bucket was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsS3BucketDetails withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The encryption rules that are applied to the S3 bucket.
     * </p>
     *
     * @return <p>
     *         The encryption rules that are applied to the S3 bucket.
     *         </p>
     */
    public AwsS3BucketServerSideEncryptionConfiguration getServerSideEncryptionConfiguration() {
        return serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The encryption rules that are applied to the S3 bucket.
     * </p>
     *
     * @param serverSideEncryptionConfiguration <p>
     *            The encryption rules that are applied to the S3 bucket.
     *            </p>
     */
    public void setServerSideEncryptionConfiguration(
            AwsS3BucketServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The encryption rules that are applied to the S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverSideEncryptionConfiguration <p>
     *            The encryption rules that are applied to the S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsS3BucketDetails withServerSideEncryptionConfiguration(
            AwsS3BucketServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
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
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getOwnerName() != null)
            sb.append("OwnerName: " + getOwnerName() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getServerSideEncryptionConfiguration() != null)
            sb.append("ServerSideEncryptionConfiguration: "
                    + getServerSideEncryptionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getOwnerName() == null) ? 0 : getOwnerName().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime
                * hashCode
                + ((getServerSideEncryptionConfiguration() == null) ? 0
                        : getServerSideEncryptionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3BucketDetails == false)
            return false;
        AwsS3BucketDetails other = (AwsS3BucketDetails) obj;

        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getOwnerName() == null ^ this.getOwnerName() == null)
            return false;
        if (other.getOwnerName() != null
                && other.getOwnerName().equals(this.getOwnerName()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getServerSideEncryptionConfiguration() == null
                ^ this.getServerSideEncryptionConfiguration() == null)
            return false;
        if (other.getServerSideEncryptionConfiguration() != null
                && other.getServerSideEncryptionConfiguration().equals(
                        this.getServerSideEncryptionConfiguration()) == false)
            return false;
        return true;
    }
}
