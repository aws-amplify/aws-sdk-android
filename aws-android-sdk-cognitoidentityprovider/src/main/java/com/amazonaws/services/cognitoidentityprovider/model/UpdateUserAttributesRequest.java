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
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#updateUserAttributes(UpdateUserAttributesRequest) UpdateUserAttributes operation}.
 * <p>
 * Allows a user to update a specific attribute (one at a time).
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#updateUserAttributes(UpdateUserAttributesRequest)
 */
public class UpdateUserAttributesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * An array of name-value pairs representing user attributes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType> userAttributes;

    /**
     * The access token for the request to update user attributes.
     */
    private String accessToken;

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
    public UpdateUserAttributesRequest withUserAttributes(AttributeType... userAttributes) {
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
    public UpdateUserAttributesRequest withUserAttributes(java.util.Collection<AttributeType> userAttributes) {
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
     * The access token for the request to update user attributes.
     *
     * @return The access token for the request to update user attributes.
     */
    public String getAccessToken() {
        return accessToken;
    }
    
    /**
     * The access token for the request to update user attributes.
     *
     * @param accessToken The access token for the request to update user attributes.
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    
    /**
     * The access token for the request to update user attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accessToken The access token for the request to update user attributes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateUserAttributesRequest withAccessToken(String accessToken) {
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
        if (getUserAttributes() != null) sb.append("UserAttributes: " + getUserAttributes() + ",");
        if (getAccessToken() != null) sb.append("AccessToken: " + getAccessToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserAttributes() == null) ? 0 : getUserAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateUserAttributesRequest == false) return false;
        UpdateUserAttributesRequest other = (UpdateUserAttributesRequest)obj;
        
        if (other.getUserAttributes() == null ^ this.getUserAttributes() == null) return false;
        if (other.getUserAttributes() != null && other.getUserAttributes().equals(this.getUserAttributes()) == false) return false; 
        if (other.getAccessToken() == null ^ this.getAccessToken() == null) return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false) return false; 
        return true;
    }
    
}
    