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
 * Contains information about how permissions are configured for the S3 bucket.
 * </p>
 */
public class PermissionConfiguration implements Serializable {
    /**
     * <p>
     * Contains information about the bucket level permissions for the S3
     * bucket.
     * </p>
     */
    private BucketLevelPermissions bucketLevelPermissions;

    /**
     * <p>
     * Contains information about the account level permissions on the S3
     * bucket.
     * </p>
     */
    private AccountLevelPermissions accountLevelPermissions;

    /**
     * <p>
     * Contains information about the bucket level permissions for the S3
     * bucket.
     * </p>
     *
     * @return <p>
     *         Contains information about the bucket level permissions for the
     *         S3 bucket.
     *         </p>
     */
    public BucketLevelPermissions getBucketLevelPermissions() {
        return bucketLevelPermissions;
    }

    /**
     * <p>
     * Contains information about the bucket level permissions for the S3
     * bucket.
     * </p>
     *
     * @param bucketLevelPermissions <p>
     *            Contains information about the bucket level permissions for
     *            the S3 bucket.
     *            </p>
     */
    public void setBucketLevelPermissions(BucketLevelPermissions bucketLevelPermissions) {
        this.bucketLevelPermissions = bucketLevelPermissions;
    }

    /**
     * <p>
     * Contains information about the bucket level permissions for the S3
     * bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketLevelPermissions <p>
     *            Contains information about the bucket level permissions for
     *            the S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PermissionConfiguration withBucketLevelPermissions(
            BucketLevelPermissions bucketLevelPermissions) {
        this.bucketLevelPermissions = bucketLevelPermissions;
        return this;
    }

    /**
     * <p>
     * Contains information about the account level permissions on the S3
     * bucket.
     * </p>
     *
     * @return <p>
     *         Contains information about the account level permissions on the
     *         S3 bucket.
     *         </p>
     */
    public AccountLevelPermissions getAccountLevelPermissions() {
        return accountLevelPermissions;
    }

    /**
     * <p>
     * Contains information about the account level permissions on the S3
     * bucket.
     * </p>
     *
     * @param accountLevelPermissions <p>
     *            Contains information about the account level permissions on
     *            the S3 bucket.
     *            </p>
     */
    public void setAccountLevelPermissions(AccountLevelPermissions accountLevelPermissions) {
        this.accountLevelPermissions = accountLevelPermissions;
    }

    /**
     * <p>
     * Contains information about the account level permissions on the S3
     * bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountLevelPermissions <p>
     *            Contains information about the account level permissions on
     *            the S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PermissionConfiguration withAccountLevelPermissions(
            AccountLevelPermissions accountLevelPermissions) {
        this.accountLevelPermissions = accountLevelPermissions;
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
        if (getBucketLevelPermissions() != null)
            sb.append("BucketLevelPermissions: " + getBucketLevelPermissions() + ",");
        if (getAccountLevelPermissions() != null)
            sb.append("AccountLevelPermissions: " + getAccountLevelPermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getBucketLevelPermissions() == null) ? 0 : getBucketLevelPermissions()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAccountLevelPermissions() == null) ? 0 : getAccountLevelPermissions()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PermissionConfiguration == false)
            return false;
        PermissionConfiguration other = (PermissionConfiguration) obj;

        if (other.getBucketLevelPermissions() == null ^ this.getBucketLevelPermissions() == null)
            return false;
        if (other.getBucketLevelPermissions() != null
                && other.getBucketLevelPermissions().equals(this.getBucketLevelPermissions()) == false)
            return false;
        if (other.getAccountLevelPermissions() == null ^ this.getAccountLevelPermissions() == null)
            return false;
        if (other.getAccountLevelPermissions() != null
                && other.getAccountLevelPermissions().equals(this.getAccountLevelPermissions()) == false)
            return false;
        return true;
    }
}
