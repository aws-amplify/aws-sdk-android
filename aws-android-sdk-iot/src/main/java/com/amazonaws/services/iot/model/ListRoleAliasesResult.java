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

public class ListRoleAliasesResult implements Serializable {
    /**
     * <p>
     * The role aliases.
     * </p>
     */
    private java.util.List<String> roleAliases;

    /**
     * <p>
     * A marker used to get the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     */
    private String nextMarker;

    /**
     * <p>
     * The role aliases.
     * </p>
     *
     * @return <p>
     *         The role aliases.
     *         </p>
     */
    public java.util.List<String> getRoleAliases() {
        return roleAliases;
    }

    /**
     * <p>
     * The role aliases.
     * </p>
     *
     * @param roleAliases <p>
     *            The role aliases.
     *            </p>
     */
    public void setRoleAliases(java.util.Collection<String> roleAliases) {
        if (roleAliases == null) {
            this.roleAliases = null;
            return;
        }

        this.roleAliases = new java.util.ArrayList<String>(roleAliases);
    }

    /**
     * <p>
     * The role aliases.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleAliases <p>
     *            The role aliases.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRoleAliasesResult withRoleAliases(String... roleAliases) {
        if (getRoleAliases() == null) {
            this.roleAliases = new java.util.ArrayList<String>(roleAliases.length);
        }
        for (String value : roleAliases) {
            this.roleAliases.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The role aliases.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleAliases <p>
     *            The role aliases.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRoleAliasesResult withRoleAliases(java.util.Collection<String> roleAliases) {
        setRoleAliases(roleAliases);
        return this;
    }

    /**
     * <p>
     * A marker used to get the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @return <p>
     *         A marker used to get the next set of results.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * A marker used to get the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @param nextMarker <p>
     *            A marker used to get the next set of results.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * A marker used to get the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @param nextMarker <p>
     *            A marker used to get the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRoleAliasesResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
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
        if (getRoleAliases() != null)
            sb.append("roleAliases: " + getRoleAliases() + ",");
        if (getNextMarker() != null)
            sb.append("nextMarker: " + getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRoleAliases() == null) ? 0 : getRoleAliases().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRoleAliasesResult == false)
            return false;
        ListRoleAliasesResult other = (ListRoleAliasesResult) obj;

        if (other.getRoleAliases() == null ^ this.getRoleAliases() == null)
            return false;
        if (other.getRoleAliases() != null
                && other.getRoleAliases().equals(this.getRoleAliases()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }
}
