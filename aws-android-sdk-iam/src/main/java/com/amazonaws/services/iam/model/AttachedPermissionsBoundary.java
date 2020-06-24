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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about an attached permissions boundary.
 * </p>
 * <p>
 * An attached permissions boundary is a managed policy that has been attached
 * to a user or role to set the permissions boundary.
 * </p>
 * <p>
 * For more information about permissions boundaries, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html"
 * >Permissions Boundaries for IAM Identities </a> in the <i>IAM User Guide</i>.
 * </p>
 */
public class AttachedPermissionsBoundary implements Serializable {
    /**
     * <p>
     * The permissions boundary usage type that indicates what type of IAM
     * resource is used as the permissions boundary for an entity. This data
     * type can only have a value of <code>Policy</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PermissionsBoundaryPolicy
     */
    private String permissionsBoundaryType;

    /**
     * <p>
     * The ARN of the policy used to set the permissions boundary for the user
     * or role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String permissionsBoundaryArn;

    /**
     * <p>
     * The permissions boundary usage type that indicates what type of IAM
     * resource is used as the permissions boundary for an entity. This data
     * type can only have a value of <code>Policy</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PermissionsBoundaryPolicy
     *
     * @return <p>
     *         The permissions boundary usage type that indicates what type of
     *         IAM resource is used as the permissions boundary for an entity.
     *         This data type can only have a value of <code>Policy</code>.
     *         </p>
     * @see PermissionsBoundaryAttachmentType
     */
    public String getPermissionsBoundaryType() {
        return permissionsBoundaryType;
    }

    /**
     * <p>
     * The permissions boundary usage type that indicates what type of IAM
     * resource is used as the permissions boundary for an entity. This data
     * type can only have a value of <code>Policy</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PermissionsBoundaryPolicy
     *
     * @param permissionsBoundaryType <p>
     *            The permissions boundary usage type that indicates what type
     *            of IAM resource is used as the permissions boundary for an
     *            entity. This data type can only have a value of
     *            <code>Policy</code>.
     *            </p>
     * @see PermissionsBoundaryAttachmentType
     */
    public void setPermissionsBoundaryType(String permissionsBoundaryType) {
        this.permissionsBoundaryType = permissionsBoundaryType;
    }

    /**
     * <p>
     * The permissions boundary usage type that indicates what type of IAM
     * resource is used as the permissions boundary for an entity. This data
     * type can only have a value of <code>Policy</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PermissionsBoundaryPolicy
     *
     * @param permissionsBoundaryType <p>
     *            The permissions boundary usage type that indicates what type
     *            of IAM resource is used as the permissions boundary for an
     *            entity. This data type can only have a value of
     *            <code>Policy</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PermissionsBoundaryAttachmentType
     */
    public AttachedPermissionsBoundary withPermissionsBoundaryType(String permissionsBoundaryType) {
        this.permissionsBoundaryType = permissionsBoundaryType;
        return this;
    }

    /**
     * <p>
     * The permissions boundary usage type that indicates what type of IAM
     * resource is used as the permissions boundary for an entity. This data
     * type can only have a value of <code>Policy</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PermissionsBoundaryPolicy
     *
     * @param permissionsBoundaryType <p>
     *            The permissions boundary usage type that indicates what type
     *            of IAM resource is used as the permissions boundary for an
     *            entity. This data type can only have a value of
     *            <code>Policy</code>.
     *            </p>
     * @see PermissionsBoundaryAttachmentType
     */
    public void setPermissionsBoundaryType(PermissionsBoundaryAttachmentType permissionsBoundaryType) {
        this.permissionsBoundaryType = permissionsBoundaryType.toString();
    }

    /**
     * <p>
     * The permissions boundary usage type that indicates what type of IAM
     * resource is used as the permissions boundary for an entity. This data
     * type can only have a value of <code>Policy</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PermissionsBoundaryPolicy
     *
     * @param permissionsBoundaryType <p>
     *            The permissions boundary usage type that indicates what type
     *            of IAM resource is used as the permissions boundary for an
     *            entity. This data type can only have a value of
     *            <code>Policy</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PermissionsBoundaryAttachmentType
     */
    public AttachedPermissionsBoundary withPermissionsBoundaryType(
            PermissionsBoundaryAttachmentType permissionsBoundaryType) {
        this.permissionsBoundaryType = permissionsBoundaryType.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the policy used to set the permissions boundary for the user
     * or role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The ARN of the policy used to set the permissions boundary for
     *         the user or role.
     *         </p>
     */
    public String getPermissionsBoundaryArn() {
        return permissionsBoundaryArn;
    }

    /**
     * <p>
     * The ARN of the policy used to set the permissions boundary for the user
     * or role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param permissionsBoundaryArn <p>
     *            The ARN of the policy used to set the permissions boundary for
     *            the user or role.
     *            </p>
     */
    public void setPermissionsBoundaryArn(String permissionsBoundaryArn) {
        this.permissionsBoundaryArn = permissionsBoundaryArn;
    }

    /**
     * <p>
     * The ARN of the policy used to set the permissions boundary for the user
     * or role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param permissionsBoundaryArn <p>
     *            The ARN of the policy used to set the permissions boundary for
     *            the user or role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachedPermissionsBoundary withPermissionsBoundaryArn(String permissionsBoundaryArn) {
        this.permissionsBoundaryArn = permissionsBoundaryArn;
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
        if (getPermissionsBoundaryType() != null)
            sb.append("PermissionsBoundaryType: " + getPermissionsBoundaryType() + ",");
        if (getPermissionsBoundaryArn() != null)
            sb.append("PermissionsBoundaryArn: " + getPermissionsBoundaryArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPermissionsBoundaryType() == null) ? 0 : getPermissionsBoundaryType()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPermissionsBoundaryArn() == null) ? 0 : getPermissionsBoundaryArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachedPermissionsBoundary == false)
            return false;
        AttachedPermissionsBoundary other = (AttachedPermissionsBoundary) obj;

        if (other.getPermissionsBoundaryType() == null ^ this.getPermissionsBoundaryType() == null)
            return false;
        if (other.getPermissionsBoundaryType() != null
                && other.getPermissionsBoundaryType().equals(this.getPermissionsBoundaryType()) == false)
            return false;
        if (other.getPermissionsBoundaryArn() == null ^ this.getPermissionsBoundaryArn() == null)
            return false;
        if (other.getPermissionsBoundaryArn() != null
                && other.getPermissionsBoundaryArn().equals(this.getPermissionsBoundaryArn()) == false)
            return false;
        return true;
    }
}
