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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * A container for information about an identity provider for a user pool.
 * </p>
 */
public class ProviderUserIdentifierType implements Serializable {
    /**
     * <p>
     * The name of the provider, for example, Facebook, Google, or Login with
     * Amazon.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String providerName;

    /**
     * <p>
     * The name of the provider attribute to link to, for example,
     * <code>NameID</code>.
     * </p>
     */
    private String providerAttributeName;

    /**
     * <p>
     * The value of the provider attribute to link to, for example,
     * <code>xxxxx_account</code>.
     * </p>
     */
    private String providerAttributeValue;

    /**
     * <p>
     * The name of the provider, for example, Facebook, Google, or Login with
     * Amazon.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return <p>
     *         The name of the provider, for example, Facebook, Google, or Login
     *         with Amazon.
     *         </p>
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * <p>
     * The name of the provider, for example, Facebook, Google, or Login with
     * Amazon.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param providerName <p>
     *            The name of the provider, for example, Facebook, Google, or
     *            Login with Amazon.
     *            </p>
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The name of the provider, for example, Facebook, Google, or Login with
     * Amazon.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param providerName <p>
     *            The name of the provider, for example, Facebook, Google, or
     *            Login with Amazon.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProviderUserIdentifierType withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * <p>
     * The name of the provider attribute to link to, for example,
     * <code>NameID</code>.
     * </p>
     *
     * @return <p>
     *         The name of the provider attribute to link to, for example,
     *         <code>NameID</code>.
     *         </p>
     */
    public String getProviderAttributeName() {
        return providerAttributeName;
    }

    /**
     * <p>
     * The name of the provider attribute to link to, for example,
     * <code>NameID</code>.
     * </p>
     *
     * @param providerAttributeName <p>
     *            The name of the provider attribute to link to, for example,
     *            <code>NameID</code>.
     *            </p>
     */
    public void setProviderAttributeName(String providerAttributeName) {
        this.providerAttributeName = providerAttributeName;
    }

    /**
     * <p>
     * The name of the provider attribute to link to, for example,
     * <code>NameID</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param providerAttributeName <p>
     *            The name of the provider attribute to link to, for example,
     *            <code>NameID</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProviderUserIdentifierType withProviderAttributeName(String providerAttributeName) {
        this.providerAttributeName = providerAttributeName;
        return this;
    }

    /**
     * <p>
     * The value of the provider attribute to link to, for example,
     * <code>xxxxx_account</code>.
     * </p>
     *
     * @return <p>
     *         The value of the provider attribute to link to, for example,
     *         <code>xxxxx_account</code>.
     *         </p>
     */
    public String getProviderAttributeValue() {
        return providerAttributeValue;
    }

    /**
     * <p>
     * The value of the provider attribute to link to, for example,
     * <code>xxxxx_account</code>.
     * </p>
     *
     * @param providerAttributeValue <p>
     *            The value of the provider attribute to link to, for example,
     *            <code>xxxxx_account</code>.
     *            </p>
     */
    public void setProviderAttributeValue(String providerAttributeValue) {
        this.providerAttributeValue = providerAttributeValue;
    }

    /**
     * <p>
     * The value of the provider attribute to link to, for example,
     * <code>xxxxx_account</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param providerAttributeValue <p>
     *            The value of the provider attribute to link to, for example,
     *            <code>xxxxx_account</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProviderUserIdentifierType withProviderAttributeValue(String providerAttributeValue) {
        this.providerAttributeValue = providerAttributeValue;
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
        if (getProviderName() != null)
            sb.append("ProviderName: " + getProviderName() + ",");
        if (getProviderAttributeName() != null)
            sb.append("ProviderAttributeName: " + getProviderAttributeName() + ",");
        if (getProviderAttributeValue() != null)
            sb.append("ProviderAttributeValue: " + getProviderAttributeValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        hashCode = prime
                * hashCode
                + ((getProviderAttributeName() == null) ? 0 : getProviderAttributeName().hashCode());
        hashCode = prime
                * hashCode
                + ((getProviderAttributeValue() == null) ? 0 : getProviderAttributeValue()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProviderUserIdentifierType == false)
            return false;
        ProviderUserIdentifierType other = (ProviderUserIdentifierType) obj;

        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null
                && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        if (other.getProviderAttributeName() == null ^ this.getProviderAttributeName() == null)
            return false;
        if (other.getProviderAttributeName() != null
                && other.getProviderAttributeName().equals(this.getProviderAttributeName()) == false)
            return false;
        if (other.getProviderAttributeValue() == null ^ this.getProviderAttributeValue() == null)
            return false;
        if (other.getProviderAttributeValue() != null
                && other.getProviderAttributeValue().equals(this.getProviderAttributeValue()) == false)
            return false;
        return true;
    }
}
