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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an identity provider for a user pool.
 * </p>
 */
public class CreateIdentityProviderRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * The identity provider name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[^_][\p{L}\p{M}\p{S}\p{N}\p{P}][^_]+<br/>
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
     * The identity provider details, such as <code>MetadataURL</code> and
     * <code>MetadataFile</code>.
     * </p>
     */
    private java.util.Map<String, String> providerDetails;

    /**
     * <p>
     * A mapping of identity provider attributes to standard and custom user
     * pool attributes.
     * </p>
     */
    private java.util.Map<String, String> attributeMapping;

    /**
     * <p>
     * A list of identity provider identifiers.
     * </p>
     */
    private java.util.List<String> idpIdentifiers;

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityProviderRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The identity provider name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[^_][\p{L}\p{M}\p{S}\p{N}\p{P}][^_]+<br/>
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
     * <b>Pattern: </b>[^_][\p{L}\p{M}\p{S}\p{N}\p{P}][^_]+<br/>
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
     * <b>Pattern: </b>[^_][\p{L}\p{M}\p{S}\p{N}\p{P}][^_]+<br/>
     *
     * @param providerName <p>
     *            The identity provider name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityProviderRequest withProviderName(String providerName) {
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
    public CreateIdentityProviderRequest withProviderType(String providerType) {
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
    public CreateIdentityProviderRequest withProviderType(IdentityProviderTypeType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>
     * The identity provider details, such as <code>MetadataURL</code> and
     * <code>MetadataFile</code>.
     * </p>
     *
     * @return <p>
     *         The identity provider details, such as <code>MetadataURL</code>
     *         and <code>MetadataFile</code>.
     *         </p>
     */
    public java.util.Map<String, String> getProviderDetails() {
        return providerDetails;
    }

    /**
     * <p>
     * The identity provider details, such as <code>MetadataURL</code> and
     * <code>MetadataFile</code>.
     * </p>
     *
     * @param providerDetails <p>
     *            The identity provider details, such as
     *            <code>MetadataURL</code> and <code>MetadataFile</code>.
     *            </p>
     */
    public void setProviderDetails(java.util.Map<String, String> providerDetails) {
        this.providerDetails = providerDetails;
    }

    /**
     * <p>
     * The identity provider details, such as <code>MetadataURL</code> and
     * <code>MetadataFile</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param providerDetails <p>
     *            The identity provider details, such as
     *            <code>MetadataURL</code> and <code>MetadataFile</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityProviderRequest withProviderDetails(
            java.util.Map<String, String> providerDetails) {
        this.providerDetails = providerDetails;
        return this;
    }

    /**
     * <p>
     * The identity provider details, such as <code>MetadataURL</code> and
     * <code>MetadataFile</code>.
     * </p>
     * <p>
     * The method adds a new key-value pair into ProviderDetails parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into ProviderDetails.
     * @param value The corresponding value of the entry to be added into
     *            ProviderDetails.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityProviderRequest addProviderDetailsEntry(String key, String value) {
        if (null == this.providerDetails) {
            this.providerDetails = new java.util.HashMap<String, String>();
        }
        if (this.providerDetails.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.providerDetails.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ProviderDetails.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateIdentityProviderRequest clearProviderDetailsEntries() {
        this.providerDetails = null;
        return this;
    }

    /**
     * <p>
     * A mapping of identity provider attributes to standard and custom user
     * pool attributes.
     * </p>
     *
     * @return <p>
     *         A mapping of identity provider attributes to standard and custom
     *         user pool attributes.
     *         </p>
     */
    public java.util.Map<String, String> getAttributeMapping() {
        return attributeMapping;
    }

    /**
     * <p>
     * A mapping of identity provider attributes to standard and custom user
     * pool attributes.
     * </p>
     *
     * @param attributeMapping <p>
     *            A mapping of identity provider attributes to standard and
     *            custom user pool attributes.
     *            </p>
     */
    public void setAttributeMapping(java.util.Map<String, String> attributeMapping) {
        this.attributeMapping = attributeMapping;
    }

    /**
     * <p>
     * A mapping of identity provider attributes to standard and custom user
     * pool attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeMapping <p>
     *            A mapping of identity provider attributes to standard and
     *            custom user pool attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityProviderRequest withAttributeMapping(
            java.util.Map<String, String> attributeMapping) {
        this.attributeMapping = attributeMapping;
        return this;
    }

    /**
     * <p>
     * A mapping of identity provider attributes to standard and custom user
     * pool attributes.
     * </p>
     * <p>
     * The method adds a new key-value pair into AttributeMapping parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into AttributeMapping.
     * @param value The corresponding value of the entry to be added into
     *            AttributeMapping.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityProviderRequest addAttributeMappingEntry(String key, String value) {
        if (null == this.attributeMapping) {
            this.attributeMapping = new java.util.HashMap<String, String>();
        }
        if (this.attributeMapping.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributeMapping.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AttributeMapping.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateIdentityProviderRequest clearAttributeMappingEntries() {
        this.attributeMapping = null;
        return this;
    }

    /**
     * <p>
     * A list of identity provider identifiers.
     * </p>
     *
     * @return <p>
     *         A list of identity provider identifiers.
     *         </p>
     */
    public java.util.List<String> getIdpIdentifiers() {
        return idpIdentifiers;
    }

    /**
     * <p>
     * A list of identity provider identifiers.
     * </p>
     *
     * @param idpIdentifiers <p>
     *            A list of identity provider identifiers.
     *            </p>
     */
    public void setIdpIdentifiers(java.util.Collection<String> idpIdentifiers) {
        if (idpIdentifiers == null) {
            this.idpIdentifiers = null;
            return;
        }

        this.idpIdentifiers = new java.util.ArrayList<String>(idpIdentifiers);
    }

    /**
     * <p>
     * A list of identity provider identifiers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param idpIdentifiers <p>
     *            A list of identity provider identifiers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityProviderRequest withIdpIdentifiers(String... idpIdentifiers) {
        if (getIdpIdentifiers() == null) {
            this.idpIdentifiers = new java.util.ArrayList<String>(idpIdentifiers.length);
        }
        for (String value : idpIdentifiers) {
            this.idpIdentifiers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of identity provider identifiers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param idpIdentifiers <p>
     *            A list of identity provider identifiers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityProviderRequest withIdpIdentifiers(
            java.util.Collection<String> idpIdentifiers) {
        setIdpIdentifiers(idpIdentifiers);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getProviderName() != null)
            sb.append("ProviderName: " + getProviderName() + ",");
        if (getProviderType() != null)
            sb.append("ProviderType: " + getProviderType() + ",");
        if (getProviderDetails() != null)
            sb.append("ProviderDetails: " + getProviderDetails() + ",");
        if (getAttributeMapping() != null)
            sb.append("AttributeMapping: " + getAttributeMapping() + ",");
        if (getIdpIdentifiers() != null)
            sb.append("IdpIdentifiers: " + getIdpIdentifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode
                + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        hashCode = prime * hashCode
                + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode
                + ((getProviderDetails() == null) ? 0 : getProviderDetails().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeMapping() == null) ? 0 : getAttributeMapping().hashCode());
        hashCode = prime * hashCode
                + ((getIdpIdentifiers() == null) ? 0 : getIdpIdentifiers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIdentityProviderRequest == false)
            return false;
        CreateIdentityProviderRequest other = (CreateIdentityProviderRequest) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
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
        if (other.getProviderDetails() == null ^ this.getProviderDetails() == null)
            return false;
        if (other.getProviderDetails() != null
                && other.getProviderDetails().equals(this.getProviderDetails()) == false)
            return false;
        if (other.getAttributeMapping() == null ^ this.getAttributeMapping() == null)
            return false;
        if (other.getAttributeMapping() != null
                && other.getAttributeMapping().equals(this.getAttributeMapping()) == false)
            return false;
        if (other.getIdpIdentifiers() == null ^ this.getIdpIdentifiers() == null)
            return false;
        if (other.getIdpIdentifiers() != null
                && other.getIdpIdentifiers().equals(this.getIdpIdentifiers()) == false)
            return false;
        return true;
    }
}
