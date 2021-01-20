/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * You can use this operation to use default (username and clientID) attribute
 * or custom attribute mappings.
 * </p>
 */
public class SetPrincipalTagAttributeMapRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the Identity Pool you want to set attribute mappings for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityPoolId;

    /**
     * <p>
     * The provider name you want to use for attribute mappings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String identityProviderName;

    /**
     * <p>
     * You can use this operation to use default (username and clientID)
     * attribute mappings.
     * </p>
     */
    private Boolean useDefaults;

    /**
     * <p>
     * You can use this operation to add principal tags.
     * </p>
     */
    private java.util.Map<String, String> principalTags;

    /**
     * <p>
     * The ID of the Identity Pool you want to set attribute mappings for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return <p>
     *         The ID of the Identity Pool you want to set attribute mappings
     *         for.
     *         </p>
     */
    public String getIdentityPoolId() {
        return identityPoolId;
    }

    /**
     * <p>
     * The ID of the Identity Pool you want to set attribute mappings for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId <p>
     *            The ID of the Identity Pool you want to set attribute mappings
     *            for.
     *            </p>
     */
    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * <p>
     * The ID of the Identity Pool you want to set attribute mappings for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId <p>
     *            The ID of the Identity Pool you want to set attribute mappings
     *            for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetPrincipalTagAttributeMapRequest withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * <p>
     * The provider name you want to use for attribute mappings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The provider name you want to use for attribute mappings.
     *         </p>
     */
    public String getIdentityProviderName() {
        return identityProviderName;
    }

    /**
     * <p>
     * The provider name you want to use for attribute mappings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param identityProviderName <p>
     *            The provider name you want to use for attribute mappings.
     *            </p>
     */
    public void setIdentityProviderName(String identityProviderName) {
        this.identityProviderName = identityProviderName;
    }

    /**
     * <p>
     * The provider name you want to use for attribute mappings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param identityProviderName <p>
     *            The provider name you want to use for attribute mappings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetPrincipalTagAttributeMapRequest withIdentityProviderName(String identityProviderName) {
        this.identityProviderName = identityProviderName;
        return this;
    }

    /**
     * <p>
     * You can use this operation to use default (username and clientID)
     * attribute mappings.
     * </p>
     *
     * @return <p>
     *         You can use this operation to use default (username and clientID)
     *         attribute mappings.
     *         </p>
     */
    public Boolean isUseDefaults() {
        return useDefaults;
    }

    /**
     * <p>
     * You can use this operation to use default (username and clientID)
     * attribute mappings.
     * </p>
     *
     * @return <p>
     *         You can use this operation to use default (username and clientID)
     *         attribute mappings.
     *         </p>
     */
    public Boolean getUseDefaults() {
        return useDefaults;
    }

    /**
     * <p>
     * You can use this operation to use default (username and clientID)
     * attribute mappings.
     * </p>
     *
     * @param useDefaults <p>
     *            You can use this operation to use default (username and
     *            clientID) attribute mappings.
     *            </p>
     */
    public void setUseDefaults(Boolean useDefaults) {
        this.useDefaults = useDefaults;
    }

    /**
     * <p>
     * You can use this operation to use default (username and clientID)
     * attribute mappings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param useDefaults <p>
     *            You can use this operation to use default (username and
     *            clientID) attribute mappings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetPrincipalTagAttributeMapRequest withUseDefaults(Boolean useDefaults) {
        this.useDefaults = useDefaults;
        return this;
    }

    /**
     * <p>
     * You can use this operation to add principal tags.
     * </p>
     *
     * @return <p>
     *         You can use this operation to add principal tags.
     *         </p>
     */
    public java.util.Map<String, String> getPrincipalTags() {
        return principalTags;
    }

    /**
     * <p>
     * You can use this operation to add principal tags.
     * </p>
     *
     * @param principalTags <p>
     *            You can use this operation to add principal tags.
     *            </p>
     */
    public void setPrincipalTags(java.util.Map<String, String> principalTags) {
        this.principalTags = principalTags;
    }

    /**
     * <p>
     * You can use this operation to add principal tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param principalTags <p>
     *            You can use this operation to add principal tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetPrincipalTagAttributeMapRequest withPrincipalTags(
            java.util.Map<String, String> principalTags) {
        this.principalTags = principalTags;
        return this;
    }

    /**
     * <p>
     * You can use this operation to add principal tags.
     * </p>
     * <p>
     * The method adds a new key-value pair into PrincipalTags parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into PrincipalTags.
     * @param value The corresponding value of the entry to be added into
     *            PrincipalTags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetPrincipalTagAttributeMapRequest addPrincipalTagsEntry(String key, String value) {
        if (null == this.principalTags) {
            this.principalTags = new java.util.HashMap<String, String>();
        }
        if (this.principalTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.principalTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PrincipalTags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SetPrincipalTagAttributeMapRequest clearPrincipalTagsEntries() {
        this.principalTags = null;
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
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getIdentityProviderName() != null)
            sb.append("IdentityProviderName: " + getIdentityProviderName() + ",");
        if (getUseDefaults() != null)
            sb.append("UseDefaults: " + getUseDefaults() + ",");
        if (getPrincipalTags() != null)
            sb.append("PrincipalTags: " + getPrincipalTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode
                + ((getIdentityProviderName() == null) ? 0 : getIdentityProviderName().hashCode());
        hashCode = prime * hashCode
                + ((getUseDefaults() == null) ? 0 : getUseDefaults().hashCode());
        hashCode = prime * hashCode
                + ((getPrincipalTags() == null) ? 0 : getPrincipalTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetPrincipalTagAttributeMapRequest == false)
            return false;
        SetPrincipalTagAttributeMapRequest other = (SetPrincipalTagAttributeMapRequest) obj;

        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null
                && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getIdentityProviderName() == null ^ this.getIdentityProviderName() == null)
            return false;
        if (other.getIdentityProviderName() != null
                && other.getIdentityProviderName().equals(this.getIdentityProviderName()) == false)
            return false;
        if (other.getUseDefaults() == null ^ this.getUseDefaults() == null)
            return false;
        if (other.getUseDefaults() != null
                && other.getUseDefaults().equals(this.getUseDefaults()) == false)
            return false;
        if (other.getPrincipalTags() == null ^ this.getPrincipalTags() == null)
            return false;
        if (other.getPrincipalTags() != null
                && other.getPrincipalTags().equals(this.getPrincipalTags()) == false)
            return false;
        return true;
    }
}
