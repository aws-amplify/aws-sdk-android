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

public class CreateRoleAliasResult implements Serializable {
    /**
     * <p>
     * The role alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     */
    private String roleAlias;

    /**
     * <p>
     * The role alias ARN.
     * </p>
     */
    private String roleAliasArn;

    /**
     * <p>
     * The role alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @return <p>
     *         The role alias.
     *         </p>
     */
    public String getRoleAlias() {
        return roleAlias;
    }

    /**
     * <p>
     * The role alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @param roleAlias <p>
     *            The role alias.
     *            </p>
     */
    public void setRoleAlias(String roleAlias) {
        this.roleAlias = roleAlias;
    }

    /**
     * <p>
     * The role alias.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @param roleAlias <p>
     *            The role alias.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRoleAliasResult withRoleAlias(String roleAlias) {
        this.roleAlias = roleAlias;
        return this;
    }

    /**
     * <p>
     * The role alias ARN.
     * </p>
     *
     * @return <p>
     *         The role alias ARN.
     *         </p>
     */
    public String getRoleAliasArn() {
        return roleAliasArn;
    }

    /**
     * <p>
     * The role alias ARN.
     * </p>
     *
     * @param roleAliasArn <p>
     *            The role alias ARN.
     *            </p>
     */
    public void setRoleAliasArn(String roleAliasArn) {
        this.roleAliasArn = roleAliasArn;
    }

    /**
     * <p>
     * The role alias ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleAliasArn <p>
     *            The role alias ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRoleAliasResult withRoleAliasArn(String roleAliasArn) {
        this.roleAliasArn = roleAliasArn;
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
        if (getRoleAlias() != null)
            sb.append("roleAlias: " + getRoleAlias() + ",");
        if (getRoleAliasArn() != null)
            sb.append("roleAliasArn: " + getRoleAliasArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleAlias() == null) ? 0 : getRoleAlias().hashCode());
        hashCode = prime * hashCode
                + ((getRoleAliasArn() == null) ? 0 : getRoleAliasArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRoleAliasResult == false)
            return false;
        CreateRoleAliasResult other = (CreateRoleAliasResult) obj;

        if (other.getRoleAlias() == null ^ this.getRoleAlias() == null)
            return false;
        if (other.getRoleAlias() != null
                && other.getRoleAlias().equals(this.getRoleAlias()) == false)
            return false;
        if (other.getRoleAliasArn() == null ^ this.getRoleAliasArn() == null)
            return false;
        if (other.getRoleAliasArn() != null
                && other.getRoleAliasArn().equals(this.getRoleAliasArn()) == false)
            return false;
        return true;
    }
}
