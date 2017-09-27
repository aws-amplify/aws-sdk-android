/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Initiates the authentication flow.
 * </p>
 */
public class InitiateAuthRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The authentication flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER_SRP_AUTH, REFRESH_TOKEN_AUTH, REFRESH_TOKEN,
     * CUSTOM_AUTH, ADMIN_NO_SRP_AUTH
     */
    private String authFlow;

    /**
     * <p>
     * The authentication parameters.
     * </p>
     */
    private java.util.Map<String, String> authParameters;

    /**
     * <p>
     * The client app's metadata.
     * </p>
     */
    private java.util.Map<String, String> clientMetadata;

    /**
     * <p>
     * The client ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     */
    private String clientId;

    /**
     * <p>
     * The pinpoint installation id.
     * </p>
     */
    private AnalyticsMetadataType analyticsMetadata;

    /**
     * <p>
     * The authentication flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER_SRP_AUTH, REFRESH_TOKEN_AUTH, REFRESH_TOKEN,
     * CUSTOM_AUTH, ADMIN_NO_SRP_AUTH
     *
     * @return <p>
     *         The authentication flow.
     *         </p>
     * @see AuthFlowType
     */
    public String getAuthFlow() {
        return authFlow;
    }

    /**
     * <p>
     * The authentication flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER_SRP_AUTH, REFRESH_TOKEN_AUTH, REFRESH_TOKEN,
     * CUSTOM_AUTH, ADMIN_NO_SRP_AUTH
     *
     * @param authFlow <p>
     *            The authentication flow.
     *            </p>
     * @see AuthFlowType
     */
    public void setAuthFlow(String authFlow) {
        this.authFlow = authFlow;
    }

    /**
     * <p>
     * The authentication flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER_SRP_AUTH, REFRESH_TOKEN_AUTH, REFRESH_TOKEN,
     * CUSTOM_AUTH, ADMIN_NO_SRP_AUTH
     *
     * @param authFlow <p>
     *            The authentication flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthFlowType
     */
    public InitiateAuthRequest withAuthFlow(String authFlow) {
        this.authFlow = authFlow;
        return this;
    }

    /**
     * <p>
     * The authentication flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER_SRP_AUTH, REFRESH_TOKEN_AUTH, REFRESH_TOKEN,
     * CUSTOM_AUTH, ADMIN_NO_SRP_AUTH
     *
     * @param authFlow <p>
     *            The authentication flow.
     *            </p>
     * @see AuthFlowType
     */
    public void setAuthFlow(AuthFlowType authFlow) {
        this.authFlow = authFlow.toString();
    }

    /**
     * <p>
     * The authentication flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER_SRP_AUTH, REFRESH_TOKEN_AUTH, REFRESH_TOKEN,
     * CUSTOM_AUTH, ADMIN_NO_SRP_AUTH
     *
     * @param authFlow <p>
     *            The authentication flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthFlowType
     */
    public InitiateAuthRequest withAuthFlow(AuthFlowType authFlow) {
        this.authFlow = authFlow.toString();
        return this;
    }

    /**
     * <p>
     * The authentication parameters.
     * </p>
     *
     * @return <p>
     *         The authentication parameters.
     *         </p>
     */
    public java.util.Map<String, String> getAuthParameters() {
        return authParameters;
    }

    /**
     * <p>
     * The authentication parameters.
     * </p>
     *
     * @param authParameters <p>
     *            The authentication parameters.
     *            </p>
     */
    public void setAuthParameters(java.util.Map<String, String> authParameters) {
        this.authParameters = authParameters;
    }

    /**
     * <p>
     * The authentication parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authParameters <p>
     *            The authentication parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InitiateAuthRequest withAuthParameters(java.util.Map<String, String> authParameters) {
        this.authParameters = authParameters;
        return this;
    }

    /**
     * <p>
     * The authentication parameters.
     * </p>
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
    public InitiateAuthRequest addAuthParametersEntry(String key, String value) {
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
    public InitiateAuthRequest clearAuthParametersEntries() {
        this.authParameters = null;
        return this;
    }

    /**
     * <p>
     * The client app's metadata.
     * </p>
     *
     * @return <p>
     *         The client app's metadata.
     *         </p>
     */
    public java.util.Map<String, String> getClientMetadata() {
        return clientMetadata;
    }

    /**
     * <p>
     * The client app's metadata.
     * </p>
     *
     * @param clientMetadata <p>
     *            The client app's metadata.
     *            </p>
     */
    public void setClientMetadata(java.util.Map<String, String> clientMetadata) {
        this.clientMetadata = clientMetadata;
    }

    /**
     * <p>
     * The client app's metadata.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientMetadata <p>
     *            The client app's metadata.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InitiateAuthRequest withClientMetadata(java.util.Map<String, String> clientMetadata) {
        this.clientMetadata = clientMetadata;
        return this;
    }

    /**
     * <p>
     * The client app's metadata.
     * </p>
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
    public InitiateAuthRequest addClientMetadataEntry(String key, String value) {
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
    public InitiateAuthRequest clearClientMetadataEntries() {
        this.clientMetadata = null;
        return this;
    }

    /**
     * <p>
     * The client ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @return <p>
     *         The client ID.
     *         </p>
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * <p>
     * The client ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId <p>
     *            The client ID.
     *            </p>
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The client ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId <p>
     *            The client ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InitiateAuthRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * <p>
     * The pinpoint installation id.
     * </p>
     *
     * @return <p>
     *         The pinpoint installation id.
     *         </p>
     */
    public AnalyticsMetadataType getAnalyticsMetadata() {
        return analyticsMetadata;
    }

    /**
     * <p>
     * The pinpoint installation id.
     * </p>
     *
     * @param analyticsMetadata <p>
     *            The pinpoint installation id.
     *            </p>
     */
    public void setAnalyticsMetadata(AnalyticsMetadataType analyticsMetadata) {
        this.analyticsMetadata = analyticsMetadata;
    }

    /**
     * <p>
     * The pinpoint installation id.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param analyticsMetadata <p>
     *            The pinpoint installation id.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InitiateAuthRequest withAnalyticsMetadata(AnalyticsMetadataType analyticsMetadata) {
        this.analyticsMetadata = analyticsMetadata;
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
        if (getAuthFlow() != null)
            sb.append("AuthFlow: " + getAuthFlow() + ",");
        if (getAuthParameters() != null)
            sb.append("AuthParameters: " + getAuthParameters() + ",");
        if (getClientMetadata() != null)
            sb.append("ClientMetadata: " + getClientMetadata() + ",");
        if (getClientId() != null)
            sb.append("ClientId: " + getClientId() + ",");
        if (getAnalyticsMetadata() != null)
            sb.append("AnalyticsMetadata: " + getAnalyticsMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthFlow() == null) ? 0 : getAuthFlow().hashCode());
        hashCode = prime * hashCode
                + ((getAuthParameters() == null) ? 0 : getAuthParameters().hashCode());
        hashCode = prime * hashCode
                + ((getClientMetadata() == null) ? 0 : getClientMetadata().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode
                + ((getAnalyticsMetadata() == null) ? 0 : getAnalyticsMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InitiateAuthRequest == false)
            return false;
        InitiateAuthRequest other = (InitiateAuthRequest) obj;

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
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getAnalyticsMetadata() == null ^ this.getAnalyticsMetadata() == null)
            return false;
        if (other.getAnalyticsMetadata() != null
                && other.getAnalyticsMetadata().equals(this.getAnalyticsMetadata()) == false)
            return false;
        return true;
    }
}
