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

package com.amazonaws.services.awsresourceaccessmanager.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets the contents of an AWS RAM permission in JSON format.
 * </p>
 */
public class GetPermissionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the permission.
     * </p>
     */
    private String permissionArn;

    /**
     * <p>
     * The identifier for the version of the permission.
     * </p>
     */
    private Integer permissionVersion;

    /**
     * <p>
     * The ARN of the permission.
     * </p>
     *
     * @return <p>
     *         The ARN of the permission.
     *         </p>
     */
    public String getPermissionArn() {
        return permissionArn;
    }

    /**
     * <p>
     * The ARN of the permission.
     * </p>
     *
     * @param permissionArn <p>
     *            The ARN of the permission.
     *            </p>
     */
    public void setPermissionArn(String permissionArn) {
        this.permissionArn = permissionArn;
    }

    /**
     * <p>
     * The ARN of the permission.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissionArn <p>
     *            The ARN of the permission.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPermissionRequest withPermissionArn(String permissionArn) {
        this.permissionArn = permissionArn;
        return this;
    }

    /**
     * <p>
     * The identifier for the version of the permission.
     * </p>
     *
     * @return <p>
     *         The identifier for the version of the permission.
     *         </p>
     */
    public Integer getPermissionVersion() {
        return permissionVersion;
    }

    /**
     * <p>
     * The identifier for the version of the permission.
     * </p>
     *
     * @param permissionVersion <p>
     *            The identifier for the version of the permission.
     *            </p>
     */
    public void setPermissionVersion(Integer permissionVersion) {
        this.permissionVersion = permissionVersion;
    }

    /**
     * <p>
     * The identifier for the version of the permission.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissionVersion <p>
     *            The identifier for the version of the permission.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPermissionRequest withPermissionVersion(Integer permissionVersion) {
        this.permissionVersion = permissionVersion;
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
        if (getPermissionArn() != null)
            sb.append("permissionArn: " + getPermissionArn() + ",");
        if (getPermissionVersion() != null)
            sb.append("permissionVersion: " + getPermissionVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPermissionArn() == null) ? 0 : getPermissionArn().hashCode());
        hashCode = prime * hashCode
                + ((getPermissionVersion() == null) ? 0 : getPermissionVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPermissionRequest == false)
            return false;
        GetPermissionRequest other = (GetPermissionRequest) obj;

        if (other.getPermissionArn() == null ^ this.getPermissionArn() == null)
            return false;
        if (other.getPermissionArn() != null
                && other.getPermissionArn().equals(this.getPermissionArn()) == false)
            return false;
        if (other.getPermissionVersion() == null ^ this.getPermissionVersion() == null)
            return false;
        if (other.getPermissionVersion() != null
                && other.getPermissionVersion().equals(this.getPermissionVersion()) == false)
            return false;
        return true;
    }
}
