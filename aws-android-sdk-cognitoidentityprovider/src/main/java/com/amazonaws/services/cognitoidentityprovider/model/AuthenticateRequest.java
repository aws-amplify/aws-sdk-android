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
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#authenticate(AuthenticateRequest) Authenticate operation}.
 * <p>
 * The second step in the authentication flow of Secure Remote Password
 * protocol (SRP) for authenticating a user to get ID, access and refresh
 * tokens. To learn more about the first step, see
 * GetAuthenticationDetails.
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#authenticate(AuthenticateRequest)
 */
public class AuthenticateRequest extends AmazonWebServiceRequest implements Serializable {

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
     * The user name of the user you wish to authenticate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

    /**
     * The password claim of the authentication request.
     */
    private PasswordClaimType passwordClaim;

    /**
     * The timestamp of the authentication request.
     */
    private java.util.Date timestamp;

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
    public AuthenticateRequest withClientId(String clientId) {
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
    public AuthenticateRequest withSecretHash(String secretHash) {
        this.secretHash = secretHash;
        return this;
    }

    /**
     * The user name of the user you wish to authenticate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return The user name of the user you wish to authenticate.
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * The user name of the user you wish to authenticate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username The user name of the user you wish to authenticate.
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * The user name of the user you wish to authenticate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username The user name of the user you wish to authenticate.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AuthenticateRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * The password claim of the authentication request.
     *
     * @return The password claim of the authentication request.
     */
    public PasswordClaimType getPasswordClaim() {
        return passwordClaim;
    }
    
    /**
     * The password claim of the authentication request.
     *
     * @param passwordClaim The password claim of the authentication request.
     */
    public void setPasswordClaim(PasswordClaimType passwordClaim) {
        this.passwordClaim = passwordClaim;
    }
    
    /**
     * The password claim of the authentication request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param passwordClaim The password claim of the authentication request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AuthenticateRequest withPasswordClaim(PasswordClaimType passwordClaim) {
        this.passwordClaim = passwordClaim;
        return this;
    }

    /**
     * The timestamp of the authentication request.
     *
     * @return The timestamp of the authentication request.
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }
    
    /**
     * The timestamp of the authentication request.
     *
     * @param timestamp The timestamp of the authentication request.
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }
    
    /**
     * The timestamp of the authentication request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timestamp The timestamp of the authentication request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AuthenticateRequest withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
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
        if (getPasswordClaim() != null) sb.append("PasswordClaim: " + getPasswordClaim() + ",");
        if (getTimestamp() != null) sb.append("Timestamp: " + getTimestamp() );
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
        hashCode = prime * hashCode + ((getPasswordClaim() == null) ? 0 : getPasswordClaim().hashCode()); 
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AuthenticateRequest == false) return false;
        AuthenticateRequest other = (AuthenticateRequest)obj;
        
        if (other.getClientId() == null ^ this.getClientId() == null) return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false) return false; 
        if (other.getSecretHash() == null ^ this.getSecretHash() == null) return false;
        if (other.getSecretHash() != null && other.getSecretHash().equals(this.getSecretHash()) == false) return false; 
        if (other.getUsername() == null ^ this.getUsername() == null) return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false) return false; 
        if (other.getPasswordClaim() == null ^ this.getPasswordClaim() == null) return false;
        if (other.getPasswordClaim() != null && other.getPasswordClaim().equals(this.getPasswordClaim()) == false) return false; 
        if (other.getTimestamp() == null ^ this.getTimestamp() == null) return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false) return false; 
        return true;
    }
    
}
    