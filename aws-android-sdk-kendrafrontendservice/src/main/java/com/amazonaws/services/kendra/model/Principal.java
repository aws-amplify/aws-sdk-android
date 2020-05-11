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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

/**
 * <p>
 * Provides user and group information for document access filtering.
 * </p>
 */
public class Principal implements Serializable {
    /**
     * <p>
     * The name of the user or group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     */
    private String name;

    /**
     * <p>
     * The type of principal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, GROUP
     */
    private String type;

    /**
     * <p>
     * Whether to allow or deny access to the principal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW, DENY
     */
    private String access;

    /**
     * <p>
     * The name of the user or group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @return <p>
     *         The name of the user or group.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the user or group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @param name <p>
     *            The name of the user or group.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the user or group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @param name <p>
     *            The name of the user or group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Principal withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of principal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, GROUP
     *
     * @return <p>
     *         The type of principal.
     *         </p>
     * @see PrincipalType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of principal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, GROUP
     *
     * @param type <p>
     *            The type of principal.
     *            </p>
     * @see PrincipalType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of principal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, GROUP
     *
     * @param type <p>
     *            The type of principal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PrincipalType
     */
    public Principal withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of principal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, GROUP
     *
     * @param type <p>
     *            The type of principal.
     *            </p>
     * @see PrincipalType
     */
    public void setType(PrincipalType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of principal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, GROUP
     *
     * @param type <p>
     *            The type of principal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PrincipalType
     */
    public Principal withType(PrincipalType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Whether to allow or deny access to the principal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW, DENY
     *
     * @return <p>
     *         Whether to allow or deny access to the principal.
     *         </p>
     * @see ReadAccessType
     */
    public String getAccess() {
        return access;
    }

    /**
     * <p>
     * Whether to allow or deny access to the principal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW, DENY
     *
     * @param access <p>
     *            Whether to allow or deny access to the principal.
     *            </p>
     * @see ReadAccessType
     */
    public void setAccess(String access) {
        this.access = access;
    }

    /**
     * <p>
     * Whether to allow or deny access to the principal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW, DENY
     *
     * @param access <p>
     *            Whether to allow or deny access to the principal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReadAccessType
     */
    public Principal withAccess(String access) {
        this.access = access;
        return this;
    }

    /**
     * <p>
     * Whether to allow or deny access to the principal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW, DENY
     *
     * @param access <p>
     *            Whether to allow or deny access to the principal.
     *            </p>
     * @see ReadAccessType
     */
    public void setAccess(ReadAccessType access) {
        this.access = access.toString();
    }

    /**
     * <p>
     * Whether to allow or deny access to the principal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW, DENY
     *
     * @param access <p>
     *            Whether to allow or deny access to the principal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReadAccessType
     */
    public Principal withAccess(ReadAccessType access) {
        this.access = access.toString();
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getAccess() != null)
            sb.append("Access: " + getAccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getAccess() == null) ? 0 : getAccess().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Principal == false)
            return false;
        Principal other = (Principal) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAccess() == null ^ this.getAccess() == null)
            return false;
        if (other.getAccess() != null && other.getAccess().equals(this.getAccess()) == false)
            return false;
        return true;
    }
}
