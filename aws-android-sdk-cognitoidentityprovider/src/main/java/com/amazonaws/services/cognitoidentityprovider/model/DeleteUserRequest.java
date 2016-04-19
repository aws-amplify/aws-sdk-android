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
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#deleteUser(DeleteUserRequest) DeleteUser operation}.
 * <p>
 * Allows a user to delete one's self.
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#deleteUser(DeleteUserRequest)
 */
public class DeleteUserRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The access token from a request to delete a user.
     */
    private String accessToken;

    /**
     * The access token from a request to delete a user.
     *
     * @return The access token from a request to delete a user.
     */
    public String getAccessToken() {
        return accessToken;
    }
    
    /**
     * The access token from a request to delete a user.
     *
     * @param accessToken The access token from a request to delete a user.
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    
    /**
     * The access token from a request to delete a user.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accessToken The access token from a request to delete a user.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteUserRequest withAccessToken(String accessToken) {
        this.accessToken = accessToken;
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
        if (getAccessToken() != null) sb.append("AccessToken: " + getAccessToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteUserRequest == false) return false;
        DeleteUserRequest other = (DeleteUserRequest)obj;
        
        if (other.getAccessToken() == null ^ this.getAccessToken() == null) return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false) return false; 
        return true;
    }
    
}
    