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
 * Provides information about permissions settings that determine whether an S3
 * bucket is publicly accessible.
 * </p>
 */
public class BucketPublicAccess implements Serializable {
    /**
     * <p>
     * Specifies whether the bucket is publicly accessible due to the
     * combination of permissions settings that apply to the bucket. Possible
     * values are: PUBLIC, the bucket is publicly accessible; and, NOT_PUBLIC,
     * the bucket isn't publicly accessible.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, NOT_PUBLIC
     */
    private String effectivePermission;

    /**
     * <p>
     * The account-level and bucket-level permissions for the bucket.
     * </p>
     */
    private BucketPermissionConfiguration permissionConfiguration;

    /**
     * <p>
     * Specifies whether the bucket is publicly accessible due to the
     * combination of permissions settings that apply to the bucket. Possible
     * values are: PUBLIC, the bucket is publicly accessible; and, NOT_PUBLIC,
     * the bucket isn't publicly accessible.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, NOT_PUBLIC
     *
     * @return <p>
     *         Specifies whether the bucket is publicly accessible due to the
     *         combination of permissions settings that apply to the bucket.
     *         Possible values are: PUBLIC, the bucket is publicly accessible;
     *         and, NOT_PUBLIC, the bucket isn't publicly accessible.
     *         </p>
     * @see EffectivePermission
     */
    public String getEffectivePermission() {
        return effectivePermission;
    }

    /**
     * <p>
     * Specifies whether the bucket is publicly accessible due to the
     * combination of permissions settings that apply to the bucket. Possible
     * values are: PUBLIC, the bucket is publicly accessible; and, NOT_PUBLIC,
     * the bucket isn't publicly accessible.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, NOT_PUBLIC
     *
     * @param effectivePermission <p>
     *            Specifies whether the bucket is publicly accessible due to the
     *            combination of permissions settings that apply to the bucket.
     *            Possible values are: PUBLIC, the bucket is publicly
     *            accessible; and, NOT_PUBLIC, the bucket isn't publicly
     *            accessible.
     *            </p>
     * @see EffectivePermission
     */
    public void setEffectivePermission(String effectivePermission) {
        this.effectivePermission = effectivePermission;
    }

    /**
     * <p>
     * Specifies whether the bucket is publicly accessible due to the
     * combination of permissions settings that apply to the bucket. Possible
     * values are: PUBLIC, the bucket is publicly accessible; and, NOT_PUBLIC,
     * the bucket isn't publicly accessible.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, NOT_PUBLIC
     *
     * @param effectivePermission <p>
     *            Specifies whether the bucket is publicly accessible due to the
     *            combination of permissions settings that apply to the bucket.
     *            Possible values are: PUBLIC, the bucket is publicly
     *            accessible; and, NOT_PUBLIC, the bucket isn't publicly
     *            accessible.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EffectivePermission
     */
    public BucketPublicAccess withEffectivePermission(String effectivePermission) {
        this.effectivePermission = effectivePermission;
        return this;
    }

    /**
     * <p>
     * Specifies whether the bucket is publicly accessible due to the
     * combination of permissions settings that apply to the bucket. Possible
     * values are: PUBLIC, the bucket is publicly accessible; and, NOT_PUBLIC,
     * the bucket isn't publicly accessible.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, NOT_PUBLIC
     *
     * @param effectivePermission <p>
     *            Specifies whether the bucket is publicly accessible due to the
     *            combination of permissions settings that apply to the bucket.
     *            Possible values are: PUBLIC, the bucket is publicly
     *            accessible; and, NOT_PUBLIC, the bucket isn't publicly
     *            accessible.
     *            </p>
     * @see EffectivePermission
     */
    public void setEffectivePermission(EffectivePermission effectivePermission) {
        this.effectivePermission = effectivePermission.toString();
    }

    /**
     * <p>
     * Specifies whether the bucket is publicly accessible due to the
     * combination of permissions settings that apply to the bucket. Possible
     * values are: PUBLIC, the bucket is publicly accessible; and, NOT_PUBLIC,
     * the bucket isn't publicly accessible.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, NOT_PUBLIC
     *
     * @param effectivePermission <p>
     *            Specifies whether the bucket is publicly accessible due to the
     *            combination of permissions settings that apply to the bucket.
     *            Possible values are: PUBLIC, the bucket is publicly
     *            accessible; and, NOT_PUBLIC, the bucket isn't publicly
     *            accessible.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EffectivePermission
     */
    public BucketPublicAccess withEffectivePermission(EffectivePermission effectivePermission) {
        this.effectivePermission = effectivePermission.toString();
        return this;
    }

    /**
     * <p>
     * The account-level and bucket-level permissions for the bucket.
     * </p>
     *
     * @return <p>
     *         The account-level and bucket-level permissions for the bucket.
     *         </p>
     */
    public BucketPermissionConfiguration getPermissionConfiguration() {
        return permissionConfiguration;
    }

    /**
     * <p>
     * The account-level and bucket-level permissions for the bucket.
     * </p>
     *
     * @param permissionConfiguration <p>
     *            The account-level and bucket-level permissions for the bucket.
     *            </p>
     */
    public void setPermissionConfiguration(BucketPermissionConfiguration permissionConfiguration) {
        this.permissionConfiguration = permissionConfiguration;
    }

    /**
     * <p>
     * The account-level and bucket-level permissions for the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissionConfiguration <p>
     *            The account-level and bucket-level permissions for the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketPublicAccess withPermissionConfiguration(
            BucketPermissionConfiguration permissionConfiguration) {
        this.permissionConfiguration = permissionConfiguration;
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
        if (getEffectivePermission() != null)
            sb.append("effectivePermission: " + getEffectivePermission() + ",");
        if (getPermissionConfiguration() != null)
            sb.append("permissionConfiguration: " + getPermissionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEffectivePermission() == null) ? 0 : getEffectivePermission().hashCode());
        hashCode = prime
                * hashCode
                + ((getPermissionConfiguration() == null) ? 0 : getPermissionConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketPublicAccess == false)
            return false;
        BucketPublicAccess other = (BucketPublicAccess) obj;

        if (other.getEffectivePermission() == null ^ this.getEffectivePermission() == null)
            return false;
        if (other.getEffectivePermission() != null
                && other.getEffectivePermission().equals(this.getEffectivePermission()) == false)
            return false;
        if (other.getPermissionConfiguration() == null ^ this.getPermissionConfiguration() == null)
            return false;
        if (other.getPermissionConfiguration() != null
                && other.getPermissionConfiguration().equals(this.getPermissionConfiguration()) == false)
            return false;
        return true;
    }
}
