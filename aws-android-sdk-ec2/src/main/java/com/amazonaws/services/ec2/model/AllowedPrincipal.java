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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a principal.
 * </p>
 */
public class AllowedPrincipal implements Serializable {
    /**
     * <p>
     * The type of principal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>All, Service, OrganizationUnit, Account, User,
     * Role
     */
    private String principalType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the principal.
     * </p>
     */
    private String principal;

    /**
     * <p>
     * The type of principal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>All, Service, OrganizationUnit, Account, User,
     * Role
     *
     * @return <p>
     *         The type of principal.
     *         </p>
     * @see PrincipalType
     */
    public String getPrincipalType() {
        return principalType;
    }

    /**
     * <p>
     * The type of principal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>All, Service, OrganizationUnit, Account, User,
     * Role
     *
     * @param principalType <p>
     *            The type of principal.
     *            </p>
     * @see PrincipalType
     */
    public void setPrincipalType(String principalType) {
        this.principalType = principalType;
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
     * <b>Allowed Values: </b>All, Service, OrganizationUnit, Account, User,
     * Role
     *
     * @param principalType <p>
     *            The type of principal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PrincipalType
     */
    public AllowedPrincipal withPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }

    /**
     * <p>
     * The type of principal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>All, Service, OrganizationUnit, Account, User,
     * Role
     *
     * @param principalType <p>
     *            The type of principal.
     *            </p>
     * @see PrincipalType
     */
    public void setPrincipalType(PrincipalType principalType) {
        this.principalType = principalType.toString();
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
     * <b>Allowed Values: </b>All, Service, OrganizationUnit, Account, User,
     * Role
     *
     * @param principalType <p>
     *            The type of principal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PrincipalType
     */
    public AllowedPrincipal withPrincipalType(PrincipalType principalType) {
        this.principalType = principalType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the principal.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the principal.
     *         </p>
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the principal.
     * </p>
     *
     * @param principal <p>
     *            The Amazon Resource Name (ARN) of the principal.
     *            </p>
     */
    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the principal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param principal <p>
     *            The Amazon Resource Name (ARN) of the principal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllowedPrincipal withPrincipal(String principal) {
        this.principal = principal;
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
        if (getPrincipalType() != null)
            sb.append("PrincipalType: " + getPrincipalType() + ",");
        if (getPrincipal() != null)
            sb.append("Principal: " + getPrincipal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPrincipalType() == null) ? 0 : getPrincipalType().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllowedPrincipal == false)
            return false;
        AllowedPrincipal other = (AllowedPrincipal) obj;

        if (other.getPrincipalType() == null ^ this.getPrincipalType() == null)
            return false;
        if (other.getPrincipalType() != null
                && other.getPrincipalType().equals(this.getPrincipalType()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null
                && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        return true;
    }
}
