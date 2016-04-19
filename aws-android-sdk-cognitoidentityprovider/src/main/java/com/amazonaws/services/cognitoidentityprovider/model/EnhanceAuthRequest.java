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
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#enhanceAuth(EnhanceAuthRequest) EnhanceAuth operation}.
 * <p>
 * Grants the ability to supply a multi-factor authentication (MFA) token
 * for an MFA-enabled user to get the ID, access, and refresh tokens.
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#enhanceAuth(EnhanceAuthRequest)
 */
public class EnhanceAuthRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the client associated with the user pool.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     */
    private String clientId;

    /**
     * A keyed-hash message authentication code (HMAC) calculated using the
     * secret key of a user pool client and username plus the client ID in
     * the message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=/]+<br/>
     */
    private String secretHash;

    /**
     * The user name of the user for whom you wish to enhance authentication.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

    /**
     * The authentication state.
     */
    private String authState;

    /**
     * The code returned from the enhanced authentication request.
     */
    private String code;

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
    public EnhanceAuthRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * A keyed-hash message authentication code (HMAC) calculated using the
     * secret key of a user pool client and username plus the client ID in
     * the message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=/]+<br/>
     *
     * @return A keyed-hash message authentication code (HMAC) calculated using the
     *         secret key of a user pool client and username plus the client ID in
     *         the message.
     */
    public String getSecretHash() {
        return secretHash;
    }
    
    /**
     * A keyed-hash message authentication code (HMAC) calculated using the
     * secret key of a user pool client and username plus the client ID in
     * the message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=/]+<br/>
     *
     * @param secretHash A keyed-hash message authentication code (HMAC) calculated using the
     *         secret key of a user pool client and username plus the client ID in
     *         the message.
     */
    public void setSecretHash(String secretHash) {
        this.secretHash = secretHash;
    }
    
    /**
     * A keyed-hash message authentication code (HMAC) calculated using the
     * secret key of a user pool client and username plus the client ID in
     * the message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=/]+<br/>
     *
     * @param secretHash A keyed-hash message authentication code (HMAC) calculated using the
     *         secret key of a user pool client and username plus the client ID in
     *         the message.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EnhanceAuthRequest withSecretHash(String secretHash) {
        this.secretHash = secretHash;
        return this;
    }

    /**
     * The user name of the user for whom you wish to enhance authentication.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return The user name of the user for whom you wish to enhance authentication.
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * The user name of the user for whom you wish to enhance authentication.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username The user name of the user for whom you wish to enhance authentication.
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * The user name of the user for whom you wish to enhance authentication.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username The user name of the user for whom you wish to enhance authentication.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EnhanceAuthRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * The authentication state.
     *
     * @return The authentication state.
     */
    public String getAuthState() {
        return authState;
    }
    
    /**
     * The authentication state.
     *
     * @param authState The authentication state.
     */
    public void setAuthState(String authState) {
        this.authState = authState;
    }
    
    /**
     * The authentication state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param authState The authentication state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EnhanceAuthRequest withAuthState(String authState) {
        this.authState = authState;
        return this;
    }

    /**
     * The code returned from the enhanced authentication request.
     *
     * @return The code returned from the enhanced authentication request.
     */
    public String getCode() {
        return code;
    }
    
    /**
     * The code returned from the enhanced authentication request.
     *
     * @param code The code returned from the enhanced authentication request.
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * The code returned from the enhanced authentication request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param code The code returned from the enhanced authentication request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EnhanceAuthRequest withCode(String code) {
        this.code = code;
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
        if (getSecretHash() != null) sb.append("SecretHash: " + getSecretHash() + ",");
        if (getUsername() != null) sb.append("Username: " + getUsername() + ",");
        if (getAuthState() != null) sb.append("AuthState: " + getAuthState() + ",");
        if (getCode() != null) sb.append("Code: " + getCode() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode()); 
        hashCode = prime * hashCode + ((getSecretHash() == null) ? 0 : getSecretHash().hashCode()); 
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode()); 
        hashCode = prime * hashCode + ((getAuthState() == null) ? 0 : getAuthState().hashCode()); 
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EnhanceAuthRequest == false) return false;
        EnhanceAuthRequest other = (EnhanceAuthRequest)obj;
        
        if (other.getClientId() == null ^ this.getClientId() == null) return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false) return false; 
        if (other.getSecretHash() == null ^ this.getSecretHash() == null) return false;
        if (other.getSecretHash() != null && other.getSecretHash().equals(this.getSecretHash()) == false) return false; 
        if (other.getUsername() == null ^ this.getUsername() == null) return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false) return false; 
        if (other.getAuthState() == null ^ this.getAuthState() == null) return false;
        if (other.getAuthState() != null && other.getAuthState().equals(this.getAuthState()) == false) return false; 
        if (other.getCode() == null ^ this.getCode() == null) return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false) return false; 
        return true;
    }
    
}
    