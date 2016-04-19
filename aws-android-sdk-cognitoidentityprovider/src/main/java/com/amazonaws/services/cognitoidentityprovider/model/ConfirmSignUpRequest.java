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
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#confirmSignUp(ConfirmSignUpRequest) ConfirmSignUp operation}.
 * <p>
 * Confirms registration of a user and handles the existing alias from a
 * previous user.
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#confirmSignUp(ConfirmSignUpRequest)
 */
public class ConfirmSignUpRequest extends AmazonWebServiceRequest implements Serializable {

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
     * The user name of the user whose registration you wish to confirm.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

    /**
     * The confirmation code sent by a user's request to confirm
     * registration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String confirmationCode;

    /**
     * Boolean to be specified to force user confirmation irrespective of
     * existing alias. By default set to False. If this parameter is set to
     * True and the phone number/email used for sign up confirmation already
     * exists as an alias with a different user, the API call will migrate
     * the alias from the previous user to the newly created user being
     * confirmed. If set to False, the API will throw an
     * <b>AliasExistsException</b> error.
     */
    private Boolean forceAliasCreation;

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
    public ConfirmSignUpRequest withClientId(String clientId) {
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
    public ConfirmSignUpRequest withSecretHash(String secretHash) {
        this.secretHash = secretHash;
        return this;
    }

    /**
     * The user name of the user whose registration you wish to confirm.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return The user name of the user whose registration you wish to confirm.
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * The user name of the user whose registration you wish to confirm.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username The user name of the user whose registration you wish to confirm.
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * The user name of the user whose registration you wish to confirm.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username The user name of the user whose registration you wish to confirm.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfirmSignUpRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * The confirmation code sent by a user's request to confirm
     * registration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return The confirmation code sent by a user's request to confirm
     *         registration.
     */
    public String getConfirmationCode() {
        return confirmationCode;
    }
    
    /**
     * The confirmation code sent by a user's request to confirm
     * registration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param confirmationCode The confirmation code sent by a user's request to confirm
     *         registration.
     */
    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode;
    }
    
    /**
     * The confirmation code sent by a user's request to confirm
     * registration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param confirmationCode The confirmation code sent by a user's request to confirm
     *         registration.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfirmSignUpRequest withConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode;
        return this;
    }

    /**
     * Boolean to be specified to force user confirmation irrespective of
     * existing alias. By default set to False. If this parameter is set to
     * True and the phone number/email used for sign up confirmation already
     * exists as an alias with a different user, the API call will migrate
     * the alias from the previous user to the newly created user being
     * confirmed. If set to False, the API will throw an
     * <b>AliasExistsException</b> error.
     *
     * @return Boolean to be specified to force user confirmation irrespective of
     *         existing alias. By default set to False. If this parameter is set to
     *         True and the phone number/email used for sign up confirmation already
     *         exists as an alias with a different user, the API call will migrate
     *         the alias from the previous user to the newly created user being
     *         confirmed. If set to False, the API will throw an
     *         <b>AliasExistsException</b> error.
     */
    public Boolean isForceAliasCreation() {
        return forceAliasCreation;
    }
    
    /**
     * Boolean to be specified to force user confirmation irrespective of
     * existing alias. By default set to False. If this parameter is set to
     * True and the phone number/email used for sign up confirmation already
     * exists as an alias with a different user, the API call will migrate
     * the alias from the previous user to the newly created user being
     * confirmed. If set to False, the API will throw an
     * <b>AliasExistsException</b> error.
     *
     * @param forceAliasCreation Boolean to be specified to force user confirmation irrespective of
     *         existing alias. By default set to False. If this parameter is set to
     *         True and the phone number/email used for sign up confirmation already
     *         exists as an alias with a different user, the API call will migrate
     *         the alias from the previous user to the newly created user being
     *         confirmed. If set to False, the API will throw an
     *         <b>AliasExistsException</b> error.
     */
    public void setForceAliasCreation(Boolean forceAliasCreation) {
        this.forceAliasCreation = forceAliasCreation;
    }
    
    /**
     * Boolean to be specified to force user confirmation irrespective of
     * existing alias. By default set to False. If this parameter is set to
     * True and the phone number/email used for sign up confirmation already
     * exists as an alias with a different user, the API call will migrate
     * the alias from the previous user to the newly created user being
     * confirmed. If set to False, the API will throw an
     * <b>AliasExistsException</b> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param forceAliasCreation Boolean to be specified to force user confirmation irrespective of
     *         existing alias. By default set to False. If this parameter is set to
     *         True and the phone number/email used for sign up confirmation already
     *         exists as an alias with a different user, the API call will migrate
     *         the alias from the previous user to the newly created user being
     *         confirmed. If set to False, the API will throw an
     *         <b>AliasExistsException</b> error.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfirmSignUpRequest withForceAliasCreation(Boolean forceAliasCreation) {
        this.forceAliasCreation = forceAliasCreation;
        return this;
    }

    /**
     * Boolean to be specified to force user confirmation irrespective of
     * existing alias. By default set to False. If this parameter is set to
     * True and the phone number/email used for sign up confirmation already
     * exists as an alias with a different user, the API call will migrate
     * the alias from the previous user to the newly created user being
     * confirmed. If set to False, the API will throw an
     * <b>AliasExistsException</b> error.
     *
     * @return Boolean to be specified to force user confirmation irrespective of
     *         existing alias. By default set to False. If this parameter is set to
     *         True and the phone number/email used for sign up confirmation already
     *         exists as an alias with a different user, the API call will migrate
     *         the alias from the previous user to the newly created user being
     *         confirmed. If set to False, the API will throw an
     *         <b>AliasExistsException</b> error.
     */
    public Boolean getForceAliasCreation() {
        return forceAliasCreation;
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
        if (getConfirmationCode() != null) sb.append("ConfirmationCode: " + getConfirmationCode() + ",");
        if (isForceAliasCreation() != null) sb.append("ForceAliasCreation: " + isForceAliasCreation() );
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
        hashCode = prime * hashCode + ((getConfirmationCode() == null) ? 0 : getConfirmationCode().hashCode()); 
        hashCode = prime * hashCode + ((isForceAliasCreation() == null) ? 0 : isForceAliasCreation().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ConfirmSignUpRequest == false) return false;
        ConfirmSignUpRequest other = (ConfirmSignUpRequest)obj;
        
        if (other.getClientId() == null ^ this.getClientId() == null) return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false) return false; 
        if (other.getSecretHash() == null ^ this.getSecretHash() == null) return false;
        if (other.getSecretHash() != null && other.getSecretHash().equals(this.getSecretHash()) == false) return false; 
        if (other.getUsername() == null ^ this.getUsername() == null) return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false) return false; 
        if (other.getConfirmationCode() == null ^ this.getConfirmationCode() == null) return false;
        if (other.getConfirmationCode() != null && other.getConfirmationCode().equals(this.getConfirmationCode()) == false) return false; 
        if (other.isForceAliasCreation() == null ^ this.isForceAliasCreation() == null) return false;
        if (other.isForceAliasCreation() != null && other.isForceAliasCreation().equals(this.isForceAliasCreation()) == false) return false; 
        return true;
    }
    
}
    