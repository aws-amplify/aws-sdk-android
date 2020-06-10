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
 * The account-level and bucket-level permissions settings for an S3 bucket, or
 * the bucket that contains an object.
 * </p>
 */
public class BucketPermissionConfiguration implements Serializable {
    /**
     * <p>
     * The account-level permissions settings that apply to the bucket.
     * </p>
     */
    private AccountLevelPermissions accountLevelPermissions;

    /**
     * <p>
     * The bucket-level permissions settings for the bucket.
     * </p>
     */
    private BucketLevelPermissions bucketLevelPermissions;

    /**
     * <p>
     * The account-level permissions settings that apply to the bucket.
     * </p>
     *
     * @return <p>
     *         The account-level permissions settings that apply to the bucket.
     *         </p>
     */
    public AccountLevelPermissions getAccountLevelPermissions() {
        return accountLevelPermissions;
    }

    /**
     * <p>
     * The account-level permissions settings that apply to the bucket.
     * </p>
     *
     * @param accountLevelPermissions <p>
     *            The account-level permissions settings that apply to the
     *            bucket.
     *            </p>
     */
    public void setAccountLevelPermissions(AccountLevelPermissions accountLevelPermissions) {
        this.accountLevelPermissions = accountLevelPermissions;
    }

    /**
     * <p>
     * The account-level permissions settings that apply to the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountLevelPermissions <p>
     *            The account-level permissions settings that apply to the
     *            bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketPermissionConfiguration withAccountLevelPermissions(
            AccountLevelPermissions accountLevelPermissions) {
        this.accountLevelPermissions = accountLevelPermissions;
        return this;
    }

    /**
     * <p>
     * The bucket-level permissions settings for the bucket.
     * </p>
     *
     * @return <p>
     *         The bucket-level permissions settings for the bucket.
     *         </p>
     */
    public BucketLevelPermissions getBucketLevelPermissions() {
        return bucketLevelPermissions;
    }

    /**
     * <p>
     * The bucket-level permissions settings for the bucket.
     * </p>
     *
     * @param bucketLevelPermissions <p>
     *            The bucket-level permissions settings for the bucket.
     *            </p>
     */
    public void setBucketLevelPermissions(BucketLevelPermissions bucketLevelPermissions) {
        this.bucketLevelPermissions = bucketLevelPermissions;
    }

    /**
     * <p>
     * The bucket-level permissions settings for the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketLevelPermissions <p>
     *            The bucket-level permissions settings for the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketPermissionConfiguration withBucketLevelPermissions(
            BucketLevelPermissions bucketLevelPermissions) {
        this.bucketLevelPermissions = bucketLevelPermissions;
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
        if (getAccountLevelPermissions() != null)
            sb.append("accountLevelPermissions: " + getAccountLevelPermissions() + ",");
        if (getBucketLevelPermissions() != null)
            sb.append("bucketLevelPermissions: " + getBucketLevelPermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAccountLevelPermissions() == null) ? 0 : getAccountLevelPermissions()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getBucketLevelPermissions() == null) ? 0 : getBucketLevelPermissions()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketPermissionConfiguration == false)
            return false;
        BucketPermissionConfiguration other = (BucketPermissionConfiguration) obj;

        if (other.getAccountLevelPermissions() == null ^ this.getAccountLevelPermissions() == null)
            return false;
        if (other.getAccountLevelPermissions() != null
                && other.getAccountLevelPermissions().equals(this.getAccountLevelPermissions()) == false)
            return false;
        if (other.getBucketLevelPermissions() == null ^ this.getBucketLevelPermissions() == null)
            return false;
        if (other.getBucketLevelPermissions() != null
                && other.getBucketLevelPermissions().equals(this.getBucketLevelPermissions()) == false)
            return false;
        return true;
    }
}
