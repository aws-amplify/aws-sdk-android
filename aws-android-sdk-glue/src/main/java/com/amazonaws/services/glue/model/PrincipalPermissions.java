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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * Permissions granted to a principal.
 * </p>
 */
public class PrincipalPermissions implements Serializable {
    /**
     * <p>
     * The principal who is granted permissions.
     * </p>
     */
    private DataLakePrincipal principal;

    /**
     * <p>
     * The permissions that are granted to the principal.
     * </p>
     */
    private java.util.List<String> permissions;

    /**
     * <p>
     * The principal who is granted permissions.
     * </p>
     *
     * @return <p>
     *         The principal who is granted permissions.
     *         </p>
     */
    public DataLakePrincipal getPrincipal() {
        return principal;
    }

    /**
     * <p>
     * The principal who is granted permissions.
     * </p>
     *
     * @param principal <p>
     *            The principal who is granted permissions.
     *            </p>
     */
    public void setPrincipal(DataLakePrincipal principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The principal who is granted permissions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param principal <p>
     *            The principal who is granted permissions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PrincipalPermissions withPrincipal(DataLakePrincipal principal) {
        this.principal = principal;
        return this;
    }

    /**
     * <p>
     * The permissions that are granted to the principal.
     * </p>
     *
     * @return <p>
     *         The permissions that are granted to the principal.
     *         </p>
     */
    public java.util.List<String> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * The permissions that are granted to the principal.
     * </p>
     *
     * @param permissions <p>
     *            The permissions that are granted to the principal.
     *            </p>
     */
    public void setPermissions(java.util.Collection<String> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<String>(permissions);
    }

    /**
     * <p>
     * The permissions that are granted to the principal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissions <p>
     *            The permissions that are granted to the principal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PrincipalPermissions withPermissions(String... permissions) {
        if (getPermissions() == null) {
            this.permissions = new java.util.ArrayList<String>(permissions.length);
        }
        for (String value : permissions) {
            this.permissions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The permissions that are granted to the principal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissions <p>
     *            The permissions that are granted to the principal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PrincipalPermissions withPermissions(java.util.Collection<String> permissions) {
        setPermissions(permissions);
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
        if (getPrincipal() != null)
            sb.append("Principal: " + getPrincipal() + ",");
        if (getPermissions() != null)
            sb.append("Permissions: " + getPermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode
                + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrincipalPermissions == false)
            return false;
        PrincipalPermissions other = (PrincipalPermissions) obj;

        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null
                && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null
                && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        return true;
    }
}
