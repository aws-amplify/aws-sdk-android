/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class AdminInitiateAuthRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The new value for the userPoolId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     */
    private String userPoolId;

    /**
     * The new value for the clientId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     */
    private String clientId;

    /**
     * The new value for the authFlow property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER_SRP_AUTH, REFRESH_TOKEN_AUTH, CUSTOM_AUTH,
     * ADMIN_NO_SRP_AUTH
     */
    private String authFlow;

    /**
     * The new value for the authParameters property for this object.
     */
    private java.util.Map<String, String> authParameters;

    /**
     * The new value for the clientMetadata property for this object.
     */
    private java.util.Map<String, String> clientMetadata;

    /**
     * Returns the value of the userPoolId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @return The value of the userPoolId property for this object.
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * Sets the value of userPoolId
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @param userPoolId The new value for the userPoolId property for this
     *            object.
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * Sets the value of the userPoolId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @param userPoolId The new value for the userPoolId property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminInitiateAuthRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * Returns the value of the clientId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @return The value of the clientId property for this object.
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of clientId
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId The new value for the clientId property for this object.
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * Sets the value of the clientId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId The new value for the clientId property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminInitiateAuthRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Returns the value of the authFlow property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER_SRP_AUTH, REFRESH_TOKEN_AUTH, CUSTOM_AUTH,
     * ADMIN_NO_SRP_AUTH
     *
     * @return The value of the authFlow property for this object.
     * @see AuthFlowType
     */
    public String getAuthFlow() {
        return authFlow;
    }

    /**
     * Sets the value of authFlow
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER_SRP_AUTH, REFRESH_TOKEN_AUTH, CUSTOM_AUTH,
     * ADMIN_NO_SRP_AUTH
     *
     * @param authFlow The new value for the authFlow property for this object.
     * @see AuthFlowType
     */
    public void setAuthFlow(String authFlow) {
        this.authFlow = authFlow;
    }

    /**
     * Sets the value of the authFlow property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER_SRP_AUTH, REFRESH_TOKEN_AUTH, CUSTOM_AUTH,
     * ADMIN_NO_SRP_AUTH
     *
     * @param authFlow The new value for the authFlow property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthFlowType
     */
    public AdminInitiateAuthRequest withAuthFlow(String authFlow) {
        this.authFlow = authFlow;
        return this;
    }

    /**
     * Sets the value of authFlow
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER_SRP_AUTH, REFRESH_TOKEN_AUTH, CUSTOM_AUTH,
     * ADMIN_NO_SRP_AUTH
     *
     * @param authFlow The new value for the authFlow property for this object.
     * @see AuthFlowType
     */
    public void setAuthFlow(AuthFlowType authFlow) {
        this.authFlow = authFlow.toString();
    }

    /**
     * Sets the value of the authFlow property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER_SRP_AUTH, REFRESH_TOKEN_AUTH, CUSTOM_AUTH,
     * ADMIN_NO_SRP_AUTH
     *
     * @param authFlow The new value for the authFlow property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthFlowType
     */
    public AdminInitiateAuthRequest withAuthFlow(AuthFlowType authFlow) {
        this.authFlow = authFlow.toString();
        return this;
    }

    /**
     * Returns the value of the authParameters property for this object.
     *
     * @return The value of the authParameters property for this object.
     */
    public java.util.Map<String, String> getAuthParameters() {
        return authParameters;
    }

    /**
     * Sets the value of authParameters
     *
     * @param authParameters The new value for the authParameters property for
     *            this object.
     */
    public void setAuthParameters(java.util.Map<String, String> authParameters) {
        this.authParameters = authParameters;
    }

    /**
     * Sets the value of the authParameters property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authParameters The new value for the authParameters property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminInitiateAuthRequest withAuthParameters(java.util.Map<String, String> authParameters) {
        this.authParameters = authParameters;
        return this;
    }

    /**
     * Sets the value of the authParameters property for this object.
     * <p>
     * The method adds a new key-value pair into AuthParameters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into AuthParameters.
     * @param value The corresponding value of the entry to be added into
     *            AuthParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminInitiateAuthRequest addAuthParametersEntry(String key, String value) {
        if (null == this.authParameters) {
            this.authParameters = new java.util.HashMap<String, String>();
        }
        if (this.authParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.authParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AuthParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public AdminInitiateAuthRequest clearAuthParametersEntries() {
        this.authParameters = null;
        return this;
    }

    /**
     * Returns the value of the clientMetadata property for this object.
     *
     * @return The value of the clientMetadata property for this object.
     */
    public java.util.Map<String, String> getClientMetadata() {
        return clientMetadata;
    }

    /**
     * Sets the value of clientMetadata
     *
     * @param clientMetadata The new value for the clientMetadata property for
     *            this object.
     */
    public void setClientMetadata(java.util.Map<String, String> clientMetadata) {
        this.clientMetadata = clientMetadata;
    }

    /**
     * Sets the value of the clientMetadata property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientMetadata The new value for the clientMetadata property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminInitiateAuthRequest withClientMetadata(java.util.Map<String, String> clientMetadata) {
        this.clientMetadata = clientMetadata;
        return this;
    }

    /**
     * Sets the value of the clientMetadata property for this object.
     * <p>
     * The method adds a new key-value pair into ClientMetadata parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into ClientMetadata.
     * @param value The corresponding value of the entry to be added into
     *            ClientMetadata.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminInitiateAuthRequest addClientMetadataEntry(String key, String value) {
        if (null == this.clientMetadata) {
            this.clientMetadata = new java.util.HashMap<String, String>();
        }
        if (this.clientMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.clientMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ClientMetadata.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public AdminInitiateAuthRequest clearClientMetadataEntries() {
        this.clientMetadata = null;
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
        if (getClientId() != null)
            sb.append("ClientId: " + getClientId() + ",");
        if (getAuthFlow() != null)
            sb.append("AuthFlow: " + getAuthFlow() + ",");
        if (getAuthParameters() != null)
            sb.append("AuthParameters: " + getAuthParameters() + ",");
        if (getClientMetadata() != null)
            sb.append("ClientMetadata: " + getClientMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getAuthFlow() == null) ? 0 : getAuthFlow().hashCode());
        hashCode = prime * hashCode
                + ((getAuthParameters() == null) ? 0 : getAuthParameters().hashCode());
        hashCode = prime * hashCode
                + ((getClientMetadata() == null) ? 0 : getClientMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminInitiateAuthRequest == false)
            return false;
        AdminInitiateAuthRequest other = (AdminInitiateAuthRequest) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getAuthFlow() == null ^ this.getAuthFlow() == null)
            return false;
        if (other.getAuthFlow() != null && other.getAuthFlow().equals(this.getAuthFlow()) == false)
            return false;
        if (other.getAuthParameters() == null ^ this.getAuthParameters() == null)
            return false;
        if (other.getAuthParameters() != null
                && other.getAuthParameters().equals(this.getAuthParameters()) == false)
            return false;
        if (other.getClientMetadata() == null ^ this.getClientMetadata() == null)
            return false;
        if (other.getClientMetadata() != null
                && other.getClientMetadata().equals(this.getClientMetadata()) == false)
            return false;
        return true;
    }
}
