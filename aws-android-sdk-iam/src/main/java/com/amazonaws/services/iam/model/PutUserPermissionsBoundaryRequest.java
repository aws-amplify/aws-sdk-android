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
 * Adds or updates the policy that is specified as the IAM user's permissions
 * boundary. You can use an AWS managed policy or a customer managed policy to
 * set the boundary for a user. Use the boundary to control the maximum
 * permissions that the user can have. Setting a permissions boundary is an
 * advanced feature that can affect the permissions for the user.
 * </p>
 * <important>
 * <p>
 * Policies that are used as permissions boundaries do not provide permissions.
 * You must also attach a permissions policy to the user. To learn how the
 * effective permissions for a user are evaluated, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html"
 * >IAM JSON Policy Evaluation Logic</a> in the IAM User Guide.
 * </p>
 * </important>
 */
public class PutUserPermissionsBoundaryRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name (friendly name, not ARN) of the IAM user for which you want to
     * set the permissions boundary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String userName;

    /**
     * <p>
     * The ARN of the policy that is used to set the permissions boundary for
     * the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String permissionsBoundary;

    /**
     * <p>
     * The name (friendly name, not ARN) of the IAM user for which you want to
     * set the permissions boundary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name (friendly name, not ARN) of the IAM user for which you
     *         want to set the permissions boundary.
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) of the IAM user for which you want to
     * set the permissions boundary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The name (friendly name, not ARN) of the IAM user for which
     *            you want to set the permissions boundary.
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) of the IAM user for which you want to
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
     * @param userName <p>
     *            The name (friendly name, not ARN) of the IAM user for which
     *            you want to set the permissions boundary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutUserPermissionsBoundaryRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * The ARN of the policy that is used to set the permissions boundary for
     * the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The ARN of the policy that is used to set the permissions
     *         boundary for the user.
     *         </p>
     */
    public String getPermissionsBoundary() {
        return permissionsBoundary;
    }

    /**
     * <p>
     * The ARN of the policy that is used to set the permissions boundary for
     * the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param permissionsBoundary <p>
     *            The ARN of the policy that is used to set the permissions
     *            boundary for the user.
     *            </p>
     */
    public void setPermissionsBoundary(String permissionsBoundary) {
        this.permissionsBoundary = permissionsBoundary;
    }

    /**
     * <p>
     * The ARN of the policy that is used to set the permissions boundary for
     * the user.
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
     *            boundary for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutUserPermissionsBoundaryRequest withPermissionsBoundary(String permissionsBoundary) {
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
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getPermissionsBoundary() != null)
            sb.append("PermissionsBoundary: " + getPermissionsBoundary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
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

        if (obj instanceof PutUserPermissionsBoundaryRequest == false)
            return false;
        PutUserPermissionsBoundaryRequest other = (PutUserPermissionsBoundaryRequest) obj;

        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getPermissionsBoundary() == null ^ this.getPermissionsBoundary() == null)
            return false;
        if (other.getPermissionsBoundary() != null
                && other.getPermissionsBoundary().equals(this.getPermissionsBoundary()) == false)
            return false;
        return true;
    }
}
