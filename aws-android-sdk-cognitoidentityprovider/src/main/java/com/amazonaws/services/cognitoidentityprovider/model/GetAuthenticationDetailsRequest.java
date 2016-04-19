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
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#getAuthenticationDetails(GetAuthenticationDetailsRequest) GetAuthenticationDetails operation}.
 * <p>
 * First step of the Secure Remote Password protocol (SRP) auth flow to
 * authenticate a user. To learn about the second step, see Authenticate.
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#getAuthenticationDetails(GetAuthenticationDetailsRequest)
 */
public class GetAuthenticationDetailsRequest extends AmazonWebServiceRequest implements Serializable {

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
     * The user name of the user for whom you wish to retrieve authentication
     * details.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

    /**
     * The Secure Remote Password protocol (SRP) key. For more information,
     * see <a
     * href="https://en.wikipedia.org/wiki/Secure_Remote_Password_protocol">Secure
     * Remote Password Protocol</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]+$<br/>
     */
    private String srpA;

    /**
     * The validation data of the request to get authentication details.
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
    public GetAuthenticationDetailsRequest withClientId(String clientId) {
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
    public GetAuthenticationDetailsRequest withSecretHash(String secretHash) {
        this.secretHash = secretHash;
        return this;
    }

    /**
     * The user name of the user for whom you wish to retrieve authentication
     * details.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return The user name of the user for whom you wish to retrieve authentication
     *         details.
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * The user name of the user for whom you wish to retrieve authentication
     * details.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username The user name of the user for whom you wish to retrieve authentication
     *         details.
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * The user name of the user for whom you wish to retrieve authentication
     * details.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username The user name of the user for whom you wish to retrieve authentication
     *         details.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAuthenticationDetailsRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * The Secure Remote Password protocol (SRP) key. For more information,
     * see <a
     * href="https://en.wikipedia.org/wiki/Secure_Remote_Password_protocol">Secure
     * Remote Password Protocol</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]+$<br/>
     *
     * @return The Secure Remote Password protocol (SRP) key. For more information,
     *         see <a
     *         href="https://en.wikipedia.org/wiki/Secure_Remote_Password_protocol">Secure
     *         Remote Password Protocol</a>.
     */
    public String getSrpA() {
        return srpA;
    }
    
    /**
     * The Secure Remote Password protocol (SRP) key. For more information,
     * see <a
     * href="https://en.wikipedia.org/wiki/Secure_Remote_Password_protocol">Secure
     * Remote Password Protocol</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]+$<br/>
     *
     * @param srpA The Secure Remote Password protocol (SRP) key. For more information,
     *         see <a
     *         href="https://en.wikipedia.org/wiki/Secure_Remote_Password_protocol">Secure
     *         Remote Password Protocol</a>.
     */
    public void setSrpA(String srpA) {
        this.srpA = srpA;
    }
    
    /**
     * The Secure Remote Password protocol (SRP) key. For more information,
     * see <a
     * href="https://en.wikipedia.org/wiki/Secure_Remote_Password_protocol">Secure
     * Remote Password Protocol</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]+$<br/>
     *
     * @param srpA The Secure Remote Password protocol (SRP) key. For more information,
     *         see <a
     *         href="https://en.wikipedia.org/wiki/Secure_Remote_Password_protocol">Secure
     *         Remote Password Protocol</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAuthenticationDetailsRequest withSrpA(String srpA) {
        this.srpA = srpA;
        return this;
    }

    /**
     * The validation data of the request to get authentication details.
     *
     * @return The validation data of the request to get authentication details.
     */
    public java.util.List<AttributeType> getValidationData() {
        if (validationData == null) {
              validationData = new com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType>();
              validationData.setAutoConstruct(true);
        }
        return validationData;
    }
    
    /**
     * The validation data of the request to get authentication details.
     *
     * @param validationData The validation data of the request to get authentication details.
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
     * The validation data of the request to get authentication details.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validationData The validation data of the request to get authentication details.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAuthenticationDetailsRequest withValidationData(AttributeType... validationData) {
        if (getValidationData() == null) setValidationData(new java.util.ArrayList<AttributeType>(validationData.length));
        for (AttributeType value : validationData) {
            getValidationData().add(value);
        }
        return this;
    }
    
    /**
     * The validation data of the request to get authentication details.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validationData The validation data of the request to get authentication details.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAuthenticationDetailsRequest withValidationData(java.util.Collection<AttributeType> validationData) {
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
        if (getSrpA() != null) sb.append("SrpA: " + getSrpA() + ",");
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
        hashCode = prime * hashCode + ((getSrpA() == null) ? 0 : getSrpA().hashCode()); 
        hashCode = prime * hashCode + ((getValidationData() == null) ? 0 : getValidationData().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetAuthenticationDetailsRequest == false) return false;
        GetAuthenticationDetailsRequest other = (GetAuthenticationDetailsRequest)obj;
        
        if (other.getClientId() == null ^ this.getClientId() == null) return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false) return false; 
        if (other.getSecretHash() == null ^ this.getSecretHash() == null) return false;
        if (other.getSecretHash() != null && other.getSecretHash().equals(this.getSecretHash()) == false) return false; 
        if (other.getUsername() == null ^ this.getUsername() == null) return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false) return false; 
        if (other.getSrpA() == null ^ this.getSrpA() == null) return false;
        if (other.getSrpA() != null && other.getSrpA().equals(this.getSrpA()) == false) return false; 
        if (other.getValidationData() == null ^ this.getValidationData() == null) return false;
        if (other.getValidationData() != null && other.getValidationData().equals(this.getValidationData()) == false) return false; 
        return true;
    }
    
}
    