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

/**
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#refreshTokens(RefreshTokensRequest) RefreshTokens operation}.
 * <p>
 * Refreshes the tokens for the specified client ID.
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#refreshTokens(RefreshTokensRequest)
 */
public class RefreshTokensRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the client associated with the user pool.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     */
    private String clientId;

    /**
     * The client secret for a user's request to refresh tokens.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     */
    private String clientSecret;

    /**
     * The refresh token for a user's request to refresh tokens.
     */
    private String refreshToken;

    /**
     * The ID of the client associated with the user pool.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @return The ID of the client associated with the user pool.
     */
    public String getClientId() {
        return clientId;
    }
    
    /**
     * The ID of the client associated with the user pool.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId The ID of the client associated with the user pool.
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    
    /**
     * The ID of the client associated with the user pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId The ID of the client associated with the user pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RefreshTokensRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * The client secret for a user's request to refresh tokens.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @return The client secret for a user's request to refresh tokens.
     */
    public String getClientSecret() {
        return clientSecret;
    }
    
    /**
     * The client secret for a user's request to refresh tokens.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientSecret The client secret for a user's request to refresh tokens.
     */
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }
    
    /**
     * The client secret for a user's request to refresh tokens.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientSecret The client secret for a user's request to refresh tokens.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RefreshTokensRequest withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * The refresh token for a user's request to refresh tokens.
     *
     * @return The refresh token for a user's request to refresh tokens.
     */
    public String getRefreshToken() {
        return refreshToken;
    }
    
    /**
     * The refresh token for a user's request to refresh tokens.
     *
     * @param refreshToken The refresh token for a user's request to refresh tokens.
     */
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
    
    /**
     * The refresh token for a user's request to refresh tokens.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param refreshToken The refresh token for a user's request to refresh tokens.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RefreshTokensRequest withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClientId() != null) sb.append("ClientId: " + getClientId() + ",");
        if (getClientSecret() != null) sb.append("ClientSecret: " + getClientSecret() + ",");
        if (getRefreshToken() != null) sb.append("RefreshToken: " + getRefreshToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode()); 
        hashCode = prime * hashCode + ((getClientSecret() == null) ? 0 : getClientSecret().hashCode()); 
        hashCode = prime * hashCode + ((getRefreshToken() == null) ? 0 : getRefreshToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RefreshTokensRequest == false) return false;
        RefreshTokensRequest other = (RefreshTokensRequest)obj;
        
        if (other.getClientId() == null ^ this.getClientId() == null) return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false) return false; 
        if (other.getClientSecret() == null ^ this.getClientSecret() == null) return false;
        if (other.getClientSecret() != null && other.getClientSecret().equals(this.getClientSecret()) == false) return false; 
        if (other.getRefreshToken() == null ^ this.getRefreshToken() == null) return false;
        if (other.getRefreshToken() != null && other.getRefreshToken().equals(this.getRefreshToken()) == false) return false; 
        return true;
    }
    
}
    