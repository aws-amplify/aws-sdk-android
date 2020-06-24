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
 * Submits a service-linked role deletion request and returns a
 * <code>DeletionTaskId</code>, which you can use to check the status of the
 * deletion. Before you call this operation, confirm that the role has no active
 * sessions and that any resources used by the role in the linked service are
 * deleted. If you call this operation more than once for the same
 * service-linked role and an earlier deletion task is not complete, then the
 * <code>DeletionTaskId</code> of the earlier request is returned.
 * </p>
 * <p>
 * If you submit a deletion request for a service-linked role whose linked
 * service is still accessing a resource, then the deletion task fails. If it
 * fails, the <a>GetServiceLinkedRoleDeletionStatus</a> API operation returns
 * the reason for the failure, usually including the resources that must be
 * deleted. To delete the service-linked role, you must first remove those
 * resources from the linked service and then submit the deletion request again.
 * Resources are specific to the service that is linked to the role. For more
 * information about removing resources from a service, see the <a
 * href="http://docs.aws.amazon.com/">AWS documentation</a> for your service.
 * </p>
 * <p>
 * For more information about service-linked roles, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html#iam-term-service-linked-role"
 * >Roles Terms and Concepts: AWS Service-Linked Role</a> in the <i>IAM User
 * Guide</i>.
 * </p>
 */
public class DeleteServiceLinkedRoleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the service-linked role to be deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String roleName;

    /**
     * <p>
     * The name of the service-linked role to be deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name of the service-linked role to be deleted.
     *         </p>
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * <p>
     * The name of the service-linked role to be deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param roleName <p>
     *            The name of the service-linked role to be deleted.
     *            </p>
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the service-linked role to be deleted.
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
     *            The name of the service-linked role to be deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteServiceLinkedRoleRequest withRoleName(String roleName) {
        this.roleName = roleName;
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
            sb.append("RoleName: " + getRoleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteServiceLinkedRoleRequest == false)
            return false;
        DeleteServiceLinkedRoleRequest other = (DeleteServiceLinkedRoleRequest) obj;

        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        return true;
    }
}
