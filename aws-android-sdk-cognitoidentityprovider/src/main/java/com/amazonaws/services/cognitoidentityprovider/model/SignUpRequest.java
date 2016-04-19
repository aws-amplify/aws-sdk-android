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
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#signUp(SignUpRequest) SignUp operation}.
 * <p>
 * Registers the user in the specified user pool and creates a user name,
 * password, and user attributes.
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#signUp(SignUpRequest)
 */
public class SignUpRequest extends AmazonWebServiceRequest implements Serializable {

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
     * The user name of the user you wish to register.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

    /**
     * The password of the user you wish to register.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 256<br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String password;

    /**
     * An array of name-value pairs representing user attributes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType> userAttributes;

    /**
     * The validation data in the request to register a user.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType> validationData;

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
    public SignUpRequest withClientId(String clientId) {
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
    public SignUpRequest withSecretHash(String secretHash) {
        this.secretHash = secretHash;
        return this;
    }

    /**
     * The user name of the user you wish to register.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return The user name of the user you wish to register.
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * The user name of the user you wish to register.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username The user name of the user you wish to register.
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * The user name of the user you wish to register.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username The user name of the user you wish to register.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SignUpRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * The password of the user you wish to register.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 256<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return The password of the user you wish to register.
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * The password of the user you wish to register.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 256<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param password The password of the user you wish to register.
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * The password of the user you wish to register.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 256<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param password The password of the user you wish to register.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SignUpRequest withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * An array of name-value pairs representing user attributes.
     *
     * @return An array of name-value pairs representing user attributes.
     */
    public java.util.List<AttributeType> getUserAttributes() {
        if (userAttributes == null) {
              userAttributes = new com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType>();
              userAttributes.setAutoConstruct(true);
        }
        return userAttributes;
    }
    
    /**
     * An array of name-value pairs representing user attributes.
     *
     * @param userAttributes An array of name-value pairs representing user attributes.
     */
    public void setUserAttributes(java.util.Collection<AttributeType> userAttributes) {
        if (userAttributes == null) {
            this.userAttributes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType> userAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType>(userAttributes.size());
        userAttributesCopy.addAll(userAttributes);
        this.userAttributes = userAttributesCopy;
    }
    
    /**
     * An array of name-value pairs representing user attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userAttributes An array of name-value pairs representing user attributes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SignUpRequest withUserAttributes(AttributeType... userAttributes) {
        if (getUserAttributes() == null) setUserAttributes(new java.util.ArrayList<AttributeType>(userAttributes.length));
        for (AttributeType value : userAttributes) {
            getUserAttributes().add(value);
        }
        return this;
    }
    
    /**
     * An array of name-value pairs representing user attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userAttributes An array of name-value pairs representing user attributes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SignUpRequest withUserAttributes(java.util.Collection<AttributeType> userAttributes) {
        if (userAttributes == null) {
            this.userAttributes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType> userAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType>(userAttributes.size());
            userAttributesCopy.addAll(userAttributes);
            this.userAttributes = userAttributesCopy;
        }

        return this;
    }

    /**
     * The validation data in the request to register a user.
     *
     * @return The validation data in the request to register a user.
     */
    public java.util.List<AttributeType> getValidationData() {
        if (validationData == null) {
              validationData = new com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType>();
              validationData.setAutoConstruct(true);
        }
        return validationData;
    }
    
    /**
     * The validation data in the request to register a user.
     *
     * @param validationData The validation data in the request to register a user.
     */
    public void setValidationData(java.util.Collection<AttributeType> validationData) {
        if (validationData == null) {
            this.validationData = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType> validationDataCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType>(validationData.size());
        validationDataCopy.addAll(validationData);
        this.validationData = validationDataCopy;
    }
    
    /**
     * The validation data in the request to register a user.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validationData The validation data in the request to register a user.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SignUpRequest withValidationData(AttributeType... validationData) {
        if (getValidationData() == null) setValidationData(new java.util.ArrayList<AttributeType>(validationData.length));
        for (AttributeType value : validationData) {
            getValidationData().add(value);
        }
        return this;
    }
    
    /**
     * The validation data in the request to register a user.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validationData The validation data in the request to register a user.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SignUpRequest withValidationData(java.util.Collection<AttributeType> validationData) {
        if (validationData == null) {
            this.validationData = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType> validationDataCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType>(validationData.size());
            validationDataCopy.addAll(validationData);
            this.validationData = validationDataCopy;
        }

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
        if (getPassword() != null) sb.append("Password: " + getPassword() + ",");
        if (getUserAttributes() != null) sb.append("UserAttributes: " + getUserAttributes() + ",");
        if (getValidationData() != null) sb.append("ValidationData: " + getValidationData() );
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
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode()); 
        hashCode = prime * hashCode + ((getUserAttributes() == null) ? 0 : getUserAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getValidationData() == null) ? 0 : getValidationData().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SignUpRequest == false) return false;
        SignUpRequest other = (SignUpRequest)obj;
        
        if (other.getClientId() == null ^ this.getClientId() == null) return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false) return false; 
        if (other.getSecretHash() == null ^ this.getSecretHash() == null) return false;
        if (other.getSecretHash() != null && other.getSecretHash().equals(this.getSecretHash()) == false) return false; 
        if (other.getUsername() == null ^ this.getUsername() == null) return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false) return false; 
        if (other.getPassword() == null ^ this.getPassword() == null) return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false) return false; 
        if (other.getUserAttributes() == null ^ this.getUserAttributes() == null) return false;
        if (other.getUserAttributes() != null && other.getUserAttributes().equals(this.getUserAttributes()) == false) return false; 
        if (other.getValidationData() == null ^ this.getValidationData() == null) return false;
        if (other.getValidationData() != null && other.getValidationData().equals(this.getValidationData()) == false) return false; 
        return true;
    }
    
}
    