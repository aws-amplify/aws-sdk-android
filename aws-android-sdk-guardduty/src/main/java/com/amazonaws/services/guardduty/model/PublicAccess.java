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
 * Describes the public access policies that apply to the S3 bucket.
 * </p>
 */
public class PublicAccess implements Serializable {
    /**
     * <p>
     * Contains information about how permissions are configured for the S3
     * bucket.
     * </p>
     */
    private PermissionConfiguration permissionConfiguration;

    /**
     * <p>
     * Describes the effective permission on this bucket after factoring all
     * attached policies.
     * </p>
     */
    private String effectivePermission;

    /**
     * <p>
     * Contains information about how permissions are configured for the S3
     * bucket.
     * </p>
     *
     * @return <p>
     *         Contains information about how permissions are configured for the
     *         S3 bucket.
     *         </p>
     */
    public PermissionConfiguration getPermissionConfiguration() {
        return permissionConfiguration;
    }

    /**
     * <p>
     * Contains information about how permissions are configured for the S3
     * bucket.
     * </p>
     *
     * @param permissionConfiguration <p>
     *            Contains information about how permissions are configured for
     *            the S3 bucket.
     *            </p>
     */
    public void setPermissionConfiguration(PermissionConfiguration permissionConfiguration) {
        this.permissionConfiguration = permissionConfiguration;
    }

    /**
     * <p>
     * Contains information about how permissions are configured for the S3
     * bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissionConfiguration <p>
     *            Contains information about how permissions are configured for
     *            the S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicAccess withPermissionConfiguration(PermissionConfiguration permissionConfiguration) {
        this.permissionConfiguration = permissionConfiguration;
        return this;
    }

    /**
     * <p>
     * Describes the effective permission on this bucket after factoring all
     * attached policies.
     * </p>
     *
     * @return <p>
     *         Describes the effective permission on this bucket after factoring
     *         all attached policies.
     *         </p>
     */
    public String getEffectivePermission() {
        return effectivePermission;
    }

    /**
     * <p>
     * Describes the effective permission on this bucket after factoring all
     * attached policies.
     * </p>
     *
     * @param effectivePermission <p>
     *            Describes the effective permission on this bucket after
     *            factoring all attached policies.
     *            </p>
     */
    public void setEffectivePermission(String effectivePermission) {
        this.effectivePermission = effectivePermission;
    }

    /**
     * <p>
     * Describes the effective permission on this bucket after factoring all
     * attached policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param effectivePermission <p>
     *            Describes the effective permission on this bucket after
     *            factoring all attached policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicAccess withEffectivePermission(String effectivePermission) {
        this.effectivePermission = effectivePermission;
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
        if (getPermissionConfiguration() != null)
            sb.append("PermissionConfiguration: " + getPermissionConfiguration() + ",");
        if (getEffectivePermission() != null)
            sb.append("EffectivePermission: " + getEffectivePermission());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPermissionConfiguration() == null) ? 0 : getPermissionConfiguration()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getEffectivePermission() == null) ? 0 : getEffectivePermission().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublicAccess == false)
            return false;
        PublicAccess other = (PublicAccess) obj;

        if (other.getPermissionConfiguration() == null ^ this.getPermissionConfiguration() == null)
            return false;
        if (other.getPermissionConfiguration() != null
                && other.getPermissionConfiguration().equals(this.getPermissionConfiguration()) == false)
            return false;
        if (other.getEffectivePermission() == null ^ this.getEffectivePermission() == null)
            return false;
        if (other.getEffectivePermission() != null
                && other.getEffectivePermission().equals(this.getEffectivePermission()) == false)
            return false;
        return true;
    }
}
