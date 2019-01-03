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
 * Creates a new OAuth2.0 resource server and defines custom scopes in it.
 * </p>
 */
public class CreateResourceServerRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * A unique resource server identifier for the resource server. This could
     * be an HTTPS endpoint where the resource server is located. For example,
     * <code>https://my-weather-api.example.com</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\x21\x23-\x5B\x5D-\x7E]+<br/>
     */
    private String identifier;

    /**
     * <p>
     * A friendly name for the resource server.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     */
    private String name;

    /**
     * <p>
     * A list of scopes. Each scope is map, where the keys are <code>name</code>
     * and <code>description</code>.
     * </p>
     */
    private java.util.List<ResourceServerScopeType> scopes;

    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID for the user pool.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool.
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
     *            The user pool ID for the user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateResourceServerRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * A unique resource server identifier for the resource server. This could
     * be an HTTPS endpoint where the resource server is located. For example,
     * <code>https://my-weather-api.example.com</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\x21\x23-\x5B\x5D-\x7E]+<br/>
     *
     * @return <p>
     *         A unique resource server identifier for the resource server. This
     *         could be an HTTPS endpoint where the resource server is located.
     *         For example, <code>https://my-weather-api.example.com</code>.
     *         </p>
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * <p>
     * A unique resource server identifier for the resource server. This could
     * be an HTTPS endpoint where the resource server is located. For example,
     * <code>https://my-weather-api.example.com</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\x21\x23-\x5B\x5D-\x7E]+<br/>
     *
     * @param identifier <p>
     *            A unique resource server identifier for the resource server.
     *            This could be an HTTPS endpoint where the resource server is
     *            located. For example,
     *            <code>https://my-weather-api.example.com</code>.
     *            </p>
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * A unique resource server identifier for the resource server. This could
     * be an HTTPS endpoint where the resource server is located. For example,
     * <code>https://my-weather-api.example.com</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\x21\x23-\x5B\x5D-\x7E]+<br/>
     *
     * @param identifier <p>
     *            A unique resource server identifier for the resource server.
     *            This could be an HTTPS endpoint where the resource server is
     *            located. For example,
     *            <code>https://my-weather-api.example.com</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateResourceServerRequest withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * <p>
     * A friendly name for the resource server.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @return <p>
     *         A friendly name for the resource server.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A friendly name for the resource server.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param name <p>
     *            A friendly name for the resource server.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name for the resource server.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param name <p>
     *            A friendly name for the resource server.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateResourceServerRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A list of scopes. Each scope is map, where the keys are <code>name</code>
     * and <code>description</code>.
     * </p>
     *
     * @return <p>
     *         A list of scopes. Each scope is map, where the keys are
     *         <code>name</code> and <code>description</code>.
     *         </p>
     */
    public java.util.List<ResourceServerScopeType> getScopes() {
        return scopes;
    }

    /**
     * <p>
     * A list of scopes. Each scope is map, where the keys are <code>name</code>
     * and <code>description</code>.
     * </p>
     *
     * @param scopes <p>
     *            A list of scopes. Each scope is map, where the keys are
     *            <code>name</code> and <code>description</code>.
     *            </p>
     */
    public void setScopes(java.util.Collection<ResourceServerScopeType> scopes) {
        if (scopes == null) {
            this.scopes = null;
            return;
        }

        this.scopes = new java.util.ArrayList<ResourceServerScopeType>(scopes);
    }

    /**
     * <p>
     * A list of scopes. Each scope is map, where the keys are <code>name</code>
     * and <code>description</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scopes <p>
     *            A list of scopes. Each scope is map, where the keys are
     *            <code>name</code> and <code>description</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateResourceServerRequest withScopes(ResourceServerScopeType... scopes) {
        if (getScopes() == null) {
            this.scopes = new java.util.ArrayList<ResourceServerScopeType>(scopes.length);
        }
        for (ResourceServerScopeType value : scopes) {
            this.scopes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of scopes. Each scope is map, where the keys are <code>name</code>
     * and <code>description</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scopes <p>
     *            A list of scopes. Each scope is map, where the keys are
     *            <code>name</code> and <code>description</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateResourceServerRequest withScopes(
            java.util.Collection<ResourceServerScopeType> scopes) {
        setScopes(scopes);
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
        if (getIdentifier() != null)
            sb.append("Identifier: " + getIdentifier() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getScopes() != null)
            sb.append("Scopes: " + getScopes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getScopes() == null) ? 0 : getScopes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateResourceServerRequest == false)
            return false;
        CreateResourceServerRequest other = (CreateResourceServerRequest) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null
                && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getScopes() == null ^ this.getScopes() == null)
            return false;
        if (other.getScopes() != null && other.getScopes().equals(this.getScopes()) == false)
            return false;
        return true;
    }
}
