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
 * Use <code>GetPrincipalTagAttributeMap</code> to list all mappings between
 * <code>PrincipalTags</code> and user attributes.
 * </p>
 */
public class GetPrincipalTagAttributeMapRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * You can use this operation to get the ID of the Identity Pool you setup
     * attribute mappings for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityPoolId;

    /**
     * <p>
     * You can use this operation to get the provider name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String identityProviderName;

    /**
     * <p>
     * You can use this operation to get the ID of the Identity Pool you setup
     * attribute mappings for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return <p>
     *         You can use this operation to get the ID of the Identity Pool you
     *         setup attribute mappings for.
     *         </p>
     */
    public String getIdentityPoolId() {
        return identityPoolId;
    }

    /**
     * <p>
     * You can use this operation to get the ID of the Identity Pool you setup
     * attribute mappings for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId <p>
     *            You can use this operation to get the ID of the Identity Pool
     *            you setup attribute mappings for.
     *            </p>
     */
    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * <p>
     * You can use this operation to get the ID of the Identity Pool you setup
     * attribute mappings for.
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
     *            You can use this operation to get the ID of the Identity Pool
     *            you setup attribute mappings for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPrincipalTagAttributeMapRequest withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * <p>
     * You can use this operation to get the provider name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         You can use this operation to get the provider name.
     *         </p>
     */
    public String getIdentityProviderName() {
        return identityProviderName;
    }

    /**
     * <p>
     * You can use this operation to get the provider name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param identityProviderName <p>
     *            You can use this operation to get the provider name.
     *            </p>
     */
    public void setIdentityProviderName(String identityProviderName) {
        this.identityProviderName = identityProviderName;
    }

    /**
     * <p>
     * You can use this operation to get the provider name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param identityProviderName <p>
     *            You can use this operation to get the provider name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPrincipalTagAttributeMapRequest withIdentityProviderName(String identityProviderName) {
        this.identityProviderName = identityProviderName;
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
            sb.append("IdentityProviderName: " + getIdentityProviderName());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPrincipalTagAttributeMapRequest == false)
            return false;
        GetPrincipalTagAttributeMapRequest other = (GetPrincipalTagAttributeMapRequest) obj;

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
        return true;
    }
}
