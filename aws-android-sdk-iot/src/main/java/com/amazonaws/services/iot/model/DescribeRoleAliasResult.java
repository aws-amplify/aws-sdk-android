/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class DescribeRoleAliasResult implements Serializable {
    /**
     * <p>
     * The role alias description.
     * </p>
     */
    private RoleAliasDescription roleAliasDescription;

    /**
     * <p>
     * The role alias description.
     * </p>
     *
     * @return <p>
     *         The role alias description.
     *         </p>
     */
    public RoleAliasDescription getRoleAliasDescription() {
        return roleAliasDescription;
    }

    /**
     * <p>
     * The role alias description.
     * </p>
     *
     * @param roleAliasDescription <p>
     *            The role alias description.
     *            </p>
     */
    public void setRoleAliasDescription(RoleAliasDescription roleAliasDescription) {
        this.roleAliasDescription = roleAliasDescription;
    }

    /**
     * <p>
     * The role alias description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleAliasDescription <p>
     *            The role alias description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRoleAliasResult withRoleAliasDescription(
            RoleAliasDescription roleAliasDescription) {
        this.roleAliasDescription = roleAliasDescription;
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
        if (getRoleAliasDescription() != null)
            sb.append("roleAliasDescription: " + getRoleAliasDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRoleAliasDescription() == null) ? 0 : getRoleAliasDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRoleAliasResult == false)
            return false;
        DescribeRoleAliasResult other = (DescribeRoleAliasResult) obj;

        if (other.getRoleAliasDescription() == null ^ this.getRoleAliasDescription() == null)
            return false;
        if (other.getRoleAliasDescription() != null
                && other.getRoleAliasDescription().equals(this.getRoleAliasDescription()) == false)
            return false;
        return true;
    }
}
