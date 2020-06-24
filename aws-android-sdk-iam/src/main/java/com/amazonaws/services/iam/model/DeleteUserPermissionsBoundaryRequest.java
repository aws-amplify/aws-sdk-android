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
 * Deletes the permissions boundary for the specified IAM user.
 * </p>
 * <important>
 * <p>
 * Deleting the permissions boundary for a user might increase its permissions
 * by allowing the user to perform all the actions granted in its permissions
 * policies.
 * </p>
 * </important>
 */
public class DeleteUserPermissionsBoundaryRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name (friendly name, not ARN) of the IAM user from which you want to
     * remove the permissions boundary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String userName;

    /**
     * <p>
     * The name (friendly name, not ARN) of the IAM user from which you want to
     * remove the permissions boundary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name (friendly name, not ARN) of the IAM user from which you
     *         want to remove the permissions boundary.
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) of the IAM user from which you want to
     * remove the permissions boundary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The name (friendly name, not ARN) of the IAM user from which
     *            you want to remove the permissions boundary.
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) of the IAM user from which you want to
     * remove the permissions boundary.
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
     *            The name (friendly name, not ARN) of the IAM user from which
     *            you want to remove the permissions boundary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteUserPermissionsBoundaryRequest withUserName(String userName) {
        this.userName = userName;
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
            sb.append("UserName: " + getUserName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteUserPermissionsBoundaryRequest == false)
            return false;
        DeleteUserPermissionsBoundaryRequest other = (DeleteUserPermissionsBoundaryRequest) obj;

        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        return true;
    }
}
