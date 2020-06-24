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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds or updates the policy that is specified as the IAM role's permissions
 * boundary. You can use an AWS managed policy or a customer managed policy to
 * set the boundary for a role. Use the boundary to control the maximum
 * permissions that the role can have. Setting a permissions boundary is an
 * advanced feature that can affect the permissions for the role.
 * </p>
 * <p>
 * You cannot set the boundary for a service-linked role.
 * </p>
 * <important>
 * <p>
 * Policies used as permissions boundaries do not provide permissions. You must
 * also attach a permissions policy to the role. To learn how the effective
 * permissions for a role are evaluated, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html"
 * >IAM JSON Policy Evaluation Logic</a> in the IAM User Guide.
 * </p>
 * </important>
 */
public class PutRolePermissionsBoundaryRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name (friendly name, not ARN) of the IAM role for which you want to
     * set the permissions boundary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String roleName;

    /**
     * <p>
     * The ARN of the policy that is used to set the permissions boundary for
     * the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String permissionsBoundary;

    /**
     * <p>
     * The name (friendly name, not ARN) of the IAM role for which you want to
     * set the permissions boundary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name (friendly name, not ARN) of the IAM role for which you
     *         want to set the permissions boundary.
     *         </p>
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) of the IAM role for which you want to
     * set the permissions boundary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param roleName <p>
     *            The name (friendly name, not ARN) of the IAM role for which
     *            you want to set the permissions boundary.
     *            </p>
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) of the IAM role for which you want to
     * set the permissions boundary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param roleName <p>
     *            The name (friendly name, not ARN) of the IAM role for which
     *            you want to set the permissions boundary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRolePermissionsBoundaryRequest withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * <p>
     * The ARN of the policy that is used to set the permissions boundary for
     * the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The ARN of the policy that is used to set the permissions
     *         boundary for the role.
     *         </p>
     */
    public String getPermissionsBoundary() {
        return permissionsBoundary;
    }

    /**
     * <p>
     * The ARN of the policy that is used to set the permissions boundary for
     * the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param permissionsBoundary <p>
     *            The ARN of the policy that is used to set the permissions
     *            boundary for the role.
     *            </p>
     */
    public void setPermissionsBoundary(String permissionsBoundary) {
        this.permissionsBoundary = permissionsBoundary;
    }

    /**
     * <p>
     * The ARN of the policy that is used to set the permissions boundary for
     * the role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param permissionsBoundary <p>
     *            The ARN of the policy that is used to set the permissions
     *            boundary for the role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRolePermissionsBoundaryRequest withPermissionsBoundary(String permissionsBoundary) {
        this.permissionsBoundary = permissionsBoundary;
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
        if (getRoleName() != null)
            sb.append("RoleName: " + getRoleName() + ",");
        if (getPermissionsBoundary() != null)
            sb.append("PermissionsBoundary: " + getPermissionsBoundary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode
                + ((getPermissionsBoundary() == null) ? 0 : getPermissionsBoundary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRolePermissionsBoundaryRequest == false)
            return false;
        PutRolePermissionsBoundaryRequest other = (PutRolePermissionsBoundaryRequest) obj;

        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getPermissionsBoundary() == null ^ this.getPermissionsBoundary() == null)
            return false;
        if (other.getPermissionsBoundary() != null
                && other.getPermissionsBoundary().equals(this.getPermissionsBoundary()) == false)
            return false;
        return true;
    }
}
