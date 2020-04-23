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
 * Associates a permission with a resource share.
 * </p>
 */
public class AssociateResourceSharePermissionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     */
    private String resourceShareArn;

    /**
     * <p>
     * The ARN of the AWS RAM permission to associate with the resource share.
     * </p>
     */
    private String permissionArn;

    /**
     * <p>
     * Indicates whether the permission should replace the permissions that are
     * currently associated with the resource share. Use <code>true</code> to
     * replace the current permissions. Use <code>false</code> to add the
     * permission to the current permission.
     * </p>
     */
    private Boolean replace;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resource share.
     *         </p>
     */
    public String getResourceShareArn() {
        return resourceShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     *
     * @param resourceShareArn <p>
     *            The Amazon Resource Name (ARN) of the resource share.
     *            </p>
     */
    public void setResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareArn <p>
     *            The Amazon Resource Name (ARN) of the resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateResourceSharePermissionRequest withResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the AWS RAM permission to associate with the resource share.
     * </p>
     *
     * @return <p>
     *         The ARN of the AWS RAM permission to associate with the resource
     *         share.
     *         </p>
     */
    public String getPermissionArn() {
        return permissionArn;
    }

    /**
     * <p>
     * The ARN of the AWS RAM permission to associate with the resource share.
     * </p>
     *
     * @param permissionArn <p>
     *            The ARN of the AWS RAM permission to associate with the
     *            resource share.
     *            </p>
     */
    public void setPermissionArn(String permissionArn) {
        this.permissionArn = permissionArn;
    }

    /**
     * <p>
     * The ARN of the AWS RAM permission to associate with the resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissionArn <p>
     *            The ARN of the AWS RAM permission to associate with the
     *            resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateResourceSharePermissionRequest withPermissionArn(String permissionArn) {
        this.permissionArn = permissionArn;
        return this;
    }

    /**
     * <p>
     * Indicates whether the permission should replace the permissions that are
     * currently associated with the resource share. Use <code>true</code> to
     * replace the current permissions. Use <code>false</code> to add the
     * permission to the current permission.
     * </p>
     *
     * @return <p>
     *         Indicates whether the permission should replace the permissions
     *         that are currently associated with the resource share. Use
     *         <code>true</code> to replace the current permissions. Use
     *         <code>false</code> to add the permission to the current
     *         permission.
     *         </p>
     */
    public Boolean isReplace() {
        return replace;
    }

    /**
     * <p>
     * Indicates whether the permission should replace the permissions that are
     * currently associated with the resource share. Use <code>true</code> to
     * replace the current permissions. Use <code>false</code> to add the
     * permission to the current permission.
     * </p>
     *
     * @return <p>
     *         Indicates whether the permission should replace the permissions
     *         that are currently associated with the resource share. Use
     *         <code>true</code> to replace the current permissions. Use
     *         <code>false</code> to add the permission to the current
     *         permission.
     *         </p>
     */
    public Boolean getReplace() {
        return replace;
    }

    /**
     * <p>
     * Indicates whether the permission should replace the permissions that are
     * currently associated with the resource share. Use <code>true</code> to
     * replace the current permissions. Use <code>false</code> to add the
     * permission to the current permission.
     * </p>
     *
     * @param replace <p>
     *            Indicates whether the permission should replace the
     *            permissions that are currently associated with the resource
     *            share. Use <code>true</code> to replace the current
     *            permissions. Use <code>false</code> to add the permission to
     *            the current permission.
     *            </p>
     */
    public void setReplace(Boolean replace) {
        this.replace = replace;
    }

    /**
     * <p>
     * Indicates whether the permission should replace the permissions that are
     * currently associated with the resource share. Use <code>true</code> to
     * replace the current permissions. Use <code>false</code> to add the
     * permission to the current permission.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replace <p>
     *            Indicates whether the permission should replace the
     *            permissions that are currently associated with the resource
     *            share. Use <code>true</code> to replace the current
     *            permissions. Use <code>false</code> to add the permission to
     *            the current permission.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateResourceSharePermissionRequest withReplace(Boolean replace) {
        this.replace = replace;
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     *
     * @return <p>
     *         A unique, case-sensitive identifier that you provide to ensure
     *         the idempotency of the request.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateResourceSharePermissionRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (getResourceShareArn() != null)
            sb.append("resourceShareArn: " + getResourceShareArn() + ",");
        if (getPermissionArn() != null)
            sb.append("permissionArn: " + getPermissionArn() + ",");
        if (getReplace() != null)
            sb.append("replace: " + getReplace() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceShareArn() == null) ? 0 : getResourceShareArn().hashCode());
        hashCode = prime * hashCode
                + ((getPermissionArn() == null) ? 0 : getPermissionArn().hashCode());
        hashCode = prime * hashCode + ((getReplace() == null) ? 0 : getReplace().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateResourceSharePermissionRequest == false)
            return false;
        AssociateResourceSharePermissionRequest other = (AssociateResourceSharePermissionRequest) obj;

        if (other.getResourceShareArn() == null ^ this.getResourceShareArn() == null)
            return false;
        if (other.getResourceShareArn() != null
                && other.getResourceShareArn().equals(this.getResourceShareArn()) == false)
            return false;
        if (other.getPermissionArn() == null ^ this.getPermissionArn() == null)
            return false;
        if (other.getPermissionArn() != null
                && other.getPermissionArn().equals(this.getPermissionArn()) == false)
            return false;
        if (other.getReplace() == null ^ this.getReplace() == null)
            return false;
        if (other.getReplace() != null && other.getReplace().equals(this.getReplace()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
