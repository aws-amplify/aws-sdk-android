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
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#deleteUserAttributes(DeleteUserAttributesRequest) DeleteUserAttributes operation}.
 * <p>
 * Deletes the attributes for a user.
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#deleteUserAttributes(DeleteUserAttributesRequest)
 */
public class DeleteUserAttributesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * An array of strings representing the user attribute names you wish to
     * delete.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> userAttributeNames;

    /**
     * The access token used in the request to delete user attributes.
     */
    private String accessToken;

    /**
     * An array of strings representing the user attribute names you wish to
     * delete.
     *
     * @return An array of strings representing the user attribute names you wish to
     *         delete.
     */
    public java.util.List<String> getUserAttributeNames() {
        if (userAttributeNames == null) {
              userAttributeNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              userAttributeNames.setAutoConstruct(true);
        }
        return userAttributeNames;
    }
    
    /**
     * An array of strings representing the user attribute names you wish to
     * delete.
     *
     * @param userAttributeNames An array of strings representing the user attribute names you wish to
     *         delete.
     */
    public void setUserAttributeNames(java.util.Collection<String> userAttributeNames) {
        if (userAttributeNames == null) {
            this.userAttributeNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> userAttributeNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(userAttributeNames.size());
        userAttributeNamesCopy.addAll(userAttributeNames);
        this.userAttributeNames = userAttributeNamesCopy;
    }
    
    /**
     * An array of strings representing the user attribute names you wish to
     * delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userAttributeNames An array of strings representing the user attribute names you wish to
     *         delete.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteUserAttributesRequest withUserAttributeNames(String... userAttributeNames) {
        if (getUserAttributeNames() == null) setUserAttributeNames(new java.util.ArrayList<String>(userAttributeNames.length));
        for (String value : userAttributeNames) {
            getUserAttributeNames().add(value);
        }
        return this;
    }
    
    /**
     * An array of strings representing the user attribute names you wish to
     * delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userAttributeNames An array of strings representing the user attribute names you wish to
     *         delete.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteUserAttributesRequest withUserAttributeNames(java.util.Collection<String> userAttributeNames) {
        if (userAttributeNames == null) {
            this.userAttributeNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> userAttributeNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(userAttributeNames.size());
            userAttributeNamesCopy.addAll(userAttributeNames);
            this.userAttributeNames = userAttributeNamesCopy;
        }

        return this;
    }

    /**
     * The access token used in the request to delete user attributes.
     *
     * @return The access token used in the request to delete user attributes.
     */
    public String getAccessToken() {
        return accessToken;
    }
    
    /**
     * The access token used in the request to delete user attributes.
     *
     * @param accessToken The access token used in the request to delete user attributes.
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    
    /**
     * The access token used in the request to delete user attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accessToken The access token used in the request to delete user attributes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteUserAttributesRequest withAccessToken(String accessToken) {
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
        if (getUserAttributeNames() != null) sb.append("UserAttributeNames: " + getUserAttributeNames() + ",");
        if (getAccessToken() != null) sb.append("AccessToken: " + getAccessToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserAttributeNames() == null) ? 0 : getUserAttributeNames().hashCode()); 
        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteUserAttributesRequest == false) return false;
        DeleteUserAttributesRequest other = (DeleteUserAttributesRequest)obj;
        
        if (other.getUserAttributeNames() == null ^ this.getUserAttributeNames() == null) return false;
        if (other.getUserAttributeNames() != null && other.getUserAttributeNames().equals(this.getUserAttributeNames()) == false) return false; 
        if (other.getAccessToken() == null ^ this.getAccessToken() == null) return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false) return false; 
        return true;
    }
    
}
    