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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a principal.
 * </p>
 */
public class Principal implements Serializable {
    /**
     * <p>
     * The ARN of the principal (IAM user, role, or group).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String principalARN;

    /**
     * <p>
     * The principal type. The supported value is <code>IAM</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IAM
     */
    private String principalType;

    /**
     * <p>
     * The ARN of the principal (IAM user, role, or group).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The ARN of the principal (IAM user, role, or group).
     *         </p>
     */
    public String getPrincipalARN() {
        return principalARN;
    }

    /**
     * <p>
     * The ARN of the principal (IAM user, role, or group).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param principalARN <p>
     *            The ARN of the principal (IAM user, role, or group).
     *            </p>
     */
    public void setPrincipalARN(String principalARN) {
        this.principalARN = principalARN;
    }

    /**
     * <p>
     * The ARN of the principal (IAM user, role, or group).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param principalARN <p>
     *            The ARN of the principal (IAM user, role, or group).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Principal withPrincipalARN(String principalARN) {
        this.principalARN = principalARN;
        return this;
    }

    /**
     * <p>
     * The principal type. The supported value is <code>IAM</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IAM
     *
     * @return <p>
     *         The principal type. The supported value is <code>IAM</code>.
     *         </p>
     * @see PrincipalType
     */
    public String getPrincipalType() {
        return principalType;
    }

    /**
     * <p>
     * The principal type. The supported value is <code>IAM</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IAM
     *
     * @param principalType <p>
     *            The principal type. The supported value is <code>IAM</code>.
     *            </p>
     * @see PrincipalType
     */
    public void setPrincipalType(String principalType) {
        this.principalType = principalType;
    }

    /**
     * <p>
     * The principal type. The supported value is <code>IAM</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IAM
     *
     * @param principalType <p>
     *            The principal type. The supported value is <code>IAM</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PrincipalType
     */
    public Principal withPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }

    /**
     * <p>
     * The principal type. The supported value is <code>IAM</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IAM
     *
     * @param principalType <p>
     *            The principal type. The supported value is <code>IAM</code>.
     *            </p>
     * @see PrincipalType
     */
    public void setPrincipalType(PrincipalType principalType) {
        this.principalType = principalType.toString();
    }

    /**
     * <p>
     * The principal type. The supported value is <code>IAM</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IAM
     *
     * @param principalType <p>
     *            The principal type. The supported value is <code>IAM</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PrincipalType
     */
    public Principal withPrincipalType(PrincipalType principalType) {
        this.principalType = principalType.toString();
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
        if (getPrincipalARN() != null)
            sb.append("PrincipalARN: " + getPrincipalARN() + ",");
        if (getPrincipalType() != null)
            sb.append("PrincipalType: " + getPrincipalType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPrincipalARN() == null) ? 0 : getPrincipalARN().hashCode());
        hashCode = prime * hashCode
                + ((getPrincipalType() == null) ? 0 : getPrincipalType().hashCode());
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

        if (other.getPrincipalARN() == null ^ this.getPrincipalARN() == null)
            return false;
        if (other.getPrincipalARN() != null
                && other.getPrincipalARN().equals(this.getPrincipalARN()) == false)
            return false;
        if (other.getPrincipalType() == null ^ this.getPrincipalType() == null)
            return false;
        if (other.getPrincipalType() != null
                && other.getPrincipalType().equals(this.getPrincipalType()) == false)
            return false;
        return true;
    }
}
