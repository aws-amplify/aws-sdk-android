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
 * A container for identity provider details.
 * </p>
 */
public class ProviderDescription implements Serializable {
    /**
     * <p>
     * The identity provider name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String providerName;

    /**
     * <p>
     * The identity provider type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML, Facebook, Google, LoginWithAmazon, OIDC
     */
    private String providerType;

    /**
     * <p>
     * The date the provider was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The date the provider was added to the user pool.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The identity provider name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return <p>
     *         The identity provider name.
     *         </p>
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * <p>
     * The identity provider name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param providerName <p>
     *            The identity provider name.
     *            </p>
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The identity provider name.
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
     *            The identity provider name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProviderDescription withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * <p>
     * The identity provider type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML, Facebook, Google, LoginWithAmazon, OIDC
     *
     * @return <p>
     *         The identity provider type.
     *         </p>
     * @see IdentityProviderTypeType
     */
    public String getProviderType() {
        return providerType;
    }

    /**
     * <p>
     * The identity provider type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML, Facebook, Google, LoginWithAmazon, OIDC
     *
     * @param providerType <p>
     *            The identity provider type.
     *            </p>
     * @see IdentityProviderTypeType
     */
    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /**
     * <p>
     * The identity provider type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML, Facebook, Google, LoginWithAmazon, OIDC
     *
     * @param providerType <p>
     *            The identity provider type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IdentityProviderTypeType
     */
    public ProviderDescription withProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }

    /**
     * <p>
     * The identity provider type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML, Facebook, Google, LoginWithAmazon, OIDC
     *
     * @param providerType <p>
     *            The identity provider type.
     *            </p>
     * @see IdentityProviderTypeType
     */
    public void setProviderType(IdentityProviderTypeType providerType) {
        this.providerType = providerType.toString();
    }

    /**
     * <p>
     * The identity provider type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML, Facebook, Google, LoginWithAmazon, OIDC
     *
     * @param providerType <p>
     *            The identity provider type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IdentityProviderTypeType
     */
    public ProviderDescription withProviderType(IdentityProviderTypeType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>
     * The date the provider was last modified.
     * </p>
     *
     * @return <p>
     *         The date the provider was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date the provider was last modified.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date the provider was last modified.
     *            </p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date the provider was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date the provider was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProviderDescription withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>
     * The date the provider was added to the user pool.
     * </p>
     *
     * @return <p>
     *         The date the provider was added to the user pool.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date the provider was added to the user pool.
     * </p>
     *
     * @param creationDate <p>
     *            The date the provider was added to the user pool.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the provider was added to the user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date the provider was added to the user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProviderDescription withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
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
        if (getProviderType() != null)
            sb.append("ProviderType: " + getProviderType() + ",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        hashCode = prime * hashCode
                + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProviderDescription == false)
            return false;
        ProviderDescription other = (ProviderDescription) obj;

        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null
                && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        if (other.getProviderType() == null ^ this.getProviderType() == null)
            return false;
        if (other.getProviderType() != null
                && other.getProviderType().equals(this.getProviderType()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }
}
