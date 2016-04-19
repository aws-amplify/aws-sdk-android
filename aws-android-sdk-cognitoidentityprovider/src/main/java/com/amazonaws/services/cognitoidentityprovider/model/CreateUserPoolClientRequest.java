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
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#createUserPoolClient(CreateUserPoolClientRequest) CreateUserPoolClient operation}.
 * <p>
 * Creates the user pool client.
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#createUserPoolClient(CreateUserPoolClientRequest)
 */
public class CreateUserPoolClientRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The user pool ID for the user pool where you want to create a user
     * pool client.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     */
    private String userPoolId;

    /**
     * The client name for the user pool client you would like to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     */
    private String clientName;

    /**
     * Boolean to specify whether you want to generate a secret for the user
     * pool client being created.
     */
    private Boolean generateSecret;

    /**
     * The user pool ID for the user pool where you want to create a user
     * pool client.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @return The user pool ID for the user pool where you want to create a user
     *         pool client.
     */
    public String getUserPoolId() {
        return userPoolId;
    }
    
    /**
     * The user pool ID for the user pool where you want to create a user
     * pool client.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @param userPoolId The user pool ID for the user pool where you want to create a user
     *         pool client.
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }
    
    /**
     * The user pool ID for the user pool where you want to create a user
     * pool client.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @param userPoolId The user pool ID for the user pool where you want to create a user
     *         pool client.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateUserPoolClientRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * The client name for the user pool client you would like to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @return The client name for the user pool client you would like to create.
     */
    public String getClientName() {
        return clientName;
    }
    
    /**
     * The client name for the user pool client you would like to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param clientName The client name for the user pool client you would like to create.
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    
    /**
     * The client name for the user pool client you would like to create.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param clientName The client name for the user pool client you would like to create.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateUserPoolClientRequest withClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
     * Boolean to specify whether you want to generate a secret for the user
     * pool client being created.
     *
     * @return Boolean to specify whether you want to generate a secret for the user
     *         pool client being created.
     */
    public Boolean isGenerateSecret() {
        return generateSecret;
    }
    
    /**
     * Boolean to specify whether you want to generate a secret for the user
     * pool client being created.
     *
     * @param generateSecret Boolean to specify whether you want to generate a secret for the user
     *         pool client being created.
     */
    public void setGenerateSecret(Boolean generateSecret) {
        this.generateSecret = generateSecret;
    }
    
    /**
     * Boolean to specify whether you want to generate a secret for the user
     * pool client being created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param generateSecret Boolean to specify whether you want to generate a secret for the user
     *         pool client being created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateUserPoolClientRequest withGenerateSecret(Boolean generateSecret) {
        this.generateSecret = generateSecret;
        return this;
    }

    /**
     * Boolean to specify whether you want to generate a secret for the user
     * pool client being created.
     *
     * @return Boolean to specify whether you want to generate a secret for the user
     *         pool client being created.
     */
    public Boolean getGenerateSecret() {
        return generateSecret;
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
        if (getUserPoolId() != null) sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getClientName() != null) sb.append("ClientName: " + getClientName() + ",");
        if (isGenerateSecret() != null) sb.append("GenerateSecret: " + isGenerateSecret() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode()); 
        hashCode = prime * hashCode + ((getClientName() == null) ? 0 : getClientName().hashCode()); 
        hashCode = prime * hashCode + ((isGenerateSecret() == null) ? 0 : isGenerateSecret().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateUserPoolClientRequest == false) return false;
        CreateUserPoolClientRequest other = (CreateUserPoolClientRequest)obj;
        
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null) return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false) return false; 
        if (other.getClientName() == null ^ this.getClientName() == null) return false;
        if (other.getClientName() != null && other.getClientName().equals(this.getClientName()) == false) return false; 
        if (other.isGenerateSecret() == null ^ this.isGenerateSecret() == null) return false;
        if (other.isGenerateSecret() != null && other.isGenerateSecret().equals(this.isGenerateSecret()) == false) return false; 
        return true;
    }
    
}
    