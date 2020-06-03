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
 * Contains the response to a successful <a>CreateRole</a> request.
 * </p>
 */
public class CreateRoleResult implements Serializable {
    /**
     * <p>
     * A structure containing details about the new role.
     * </p>
     */
    private Role role;

    /**
     * <p>
     * A structure containing details about the new role.
     * </p>
     *
     * @return <p>
     *         A structure containing details about the new role.
     *         </p>
     */
    public Role getRole() {
        return role;
    }

    /**
     * <p>
     * A structure containing details about the new role.
     * </p>
     *
     * @param role <p>
     *            A structure containing details about the new role.
     *            </p>
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * <p>
     * A structure containing details about the new role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param role <p>
     *            A structure containing details about the new role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRoleResult withRole(Role role) {
        this.role = role;
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
        if (getRole() != null)
            sb.append("Role: " + getRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRoleResult == false)
            return false;
        CreateRoleResult other = (CreateRoleResult) obj;

        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        return true;
    }
}
