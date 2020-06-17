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
 * Provides information about bucket-level permissions settings for an S3
 * bucket.
 * </p>
 */
public class BucketLevelPermissions implements Serializable {
    /**
     * <p>
     * The permissions settings of the access control list (ACL) for the bucket.
     * This value is null if an ACL hasn't been defined for the bucket.
     * </p>
     */
    private AccessControlList accessControlList;

    /**
     * <p>
     * The block public access settings for the bucket.
     * </p>
     */
    private BlockPublicAccess blockPublicAccess;

    /**
     * <p>
     * The permissions settings of the bucket policy for the bucket. This value
     * is null if a bucket policy hasn't been defined for the bucket.
     * </p>
     */
    private BucketPolicy bucketPolicy;

    /**
     * <p>
     * The permissions settings of the access control list (ACL) for the bucket.
     * This value is null if an ACL hasn't been defined for the bucket.
     * </p>
     *
     * @return <p>
     *         The permissions settings of the access control list (ACL) for the
     *         bucket. This value is null if an ACL hasn't been defined for the
     *         bucket.
     *         </p>
     */
    public AccessControlList getAccessControlList() {
        return accessControlList;
    }

    /**
     * <p>
     * The permissions settings of the access control list (ACL) for the bucket.
     * This value is null if an ACL hasn't been defined for the bucket.
     * </p>
     *
     * @param accessControlList <p>
     *            The permissions settings of the access control list (ACL) for
     *            the bucket. This value is null if an ACL hasn't been defined
     *            for the bucket.
     *            </p>
     */
    public void setAccessControlList(AccessControlList accessControlList) {
        this.accessControlList = accessControlList;
    }

    /**
     * <p>
     * The permissions settings of the access control list (ACL) for the bucket.
     * This value is null if an ACL hasn't been defined for the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessControlList <p>
     *            The permissions settings of the access control list (ACL) for
     *            the bucket. This value is null if an ACL hasn't been defined
     *            for the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketLevelPermissions withAccessControlList(AccessControlList accessControlList) {
        this.accessControlList = accessControlList;
        return this;
    }

    /**
     * <p>
     * The block public access settings for the bucket.
     * </p>
     *
     * @return <p>
     *         The block public access settings for the bucket.
     *         </p>
     */
    public BlockPublicAccess getBlockPublicAccess() {
        return blockPublicAccess;
    }

    /**
     * <p>
     * The block public access settings for the bucket.
     * </p>
     *
     * @param blockPublicAccess <p>
     *            The block public access settings for the bucket.
     *            </p>
     */
    public void setBlockPublicAccess(BlockPublicAccess blockPublicAccess) {
        this.blockPublicAccess = blockPublicAccess;
    }

    /**
     * <p>
     * The block public access settings for the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockPublicAccess <p>
     *            The block public access settings for the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketLevelPermissions withBlockPublicAccess(BlockPublicAccess blockPublicAccess) {
        this.blockPublicAccess = blockPublicAccess;
        return this;
    }

    /**
     * <p>
     * The permissions settings of the bucket policy for the bucket. This value
     * is null if a bucket policy hasn't been defined for the bucket.
     * </p>
     *
     * @return <p>
     *         The permissions settings of the bucket policy for the bucket.
     *         This value is null if a bucket policy hasn't been defined for the
     *         bucket.
     *         </p>
     */
    public BucketPolicy getBucketPolicy() {
        return bucketPolicy;
    }

    /**
     * <p>
     * The permissions settings of the bucket policy for the bucket. This value
     * is null if a bucket policy hasn't been defined for the bucket.
     * </p>
     *
     * @param bucketPolicy <p>
     *            The permissions settings of the bucket policy for the bucket.
     *            This value is null if a bucket policy hasn't been defined for
     *            the bucket.
     *            </p>
     */
    public void setBucketPolicy(BucketPolicy bucketPolicy) {
        this.bucketPolicy = bucketPolicy;
    }

    /**
     * <p>
     * The permissions settings of the bucket policy for the bucket. This value
     * is null if a bucket policy hasn't been defined for the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketPolicy <p>
     *            The permissions settings of the bucket policy for the bucket.
     *            This value is null if a bucket policy hasn't been defined for
     *            the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketLevelPermissions withBucketPolicy(BucketPolicy bucketPolicy) {
        this.bucketPolicy = bucketPolicy;
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
        if (getAccessControlList() != null)
            sb.append("accessControlList: " + getAccessControlList() + ",");
        if (getBlockPublicAccess() != null)
            sb.append("blockPublicAccess: " + getBlockPublicAccess() + ",");
        if (getBucketPolicy() != null)
            sb.append("bucketPolicy: " + getBucketPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccessControlList() == null) ? 0 : getAccessControlList().hashCode());
        hashCode = prime * hashCode
                + ((getBlockPublicAccess() == null) ? 0 : getBlockPublicAccess().hashCode());
        hashCode = prime * hashCode
                + ((getBucketPolicy() == null) ? 0 : getBucketPolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketLevelPermissions == false)
            return false;
        BucketLevelPermissions other = (BucketLevelPermissions) obj;

        if (other.getAccessControlList() == null ^ this.getAccessControlList() == null)
            return false;
        if (other.getAccessControlList() != null
                && other.getAccessControlList().equals(this.getAccessControlList()) == false)
            return false;
        if (other.getBlockPublicAccess() == null ^ this.getBlockPublicAccess() == null)
            return false;
        if (other.getBlockPublicAccess() != null
                && other.getBlockPublicAccess().equals(this.getBlockPublicAccess()) == false)
            return false;
        if (other.getBucketPolicy() == null ^ this.getBucketPolicy() == null)
            return false;
        if (other.getBucketPolicy() != null
                && other.getBucketPolicy().equals(this.getBucketPolicy()) == false)
            return false;
        return true;
    }
}
