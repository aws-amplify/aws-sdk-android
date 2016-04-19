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
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#adminDeleteUserAttributes(AdminDeleteUserAttributesRequest) AdminDeleteUserAttributes operation}.
 * <p>
 * Deletes the user attributes in a user pool as an administrator. Works
 * on any user.
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#adminDeleteUserAttributes(AdminDeleteUserAttributesRequest)
 */
public class AdminDeleteUserAttributesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The user pool ID for the user pool where you want to delete user
     * attributes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     */
    private String userPoolId;

    /**
     * The user name of the user from which you would like to delete
     * attributes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

    /**
     * An array of strings representing the user attribute names you wish to
     * delete.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> userAttributeNames;

    /**
     * The user pool ID for the user pool where you want to delete user
     * attributes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @return The user pool ID for the user pool where you want to delete user
     *         attributes.
     */
    public String getUserPoolId() {
        return userPoolId;
    }
    
    /**
     * The user pool ID for the user pool where you want to delete user
     * attributes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @param userPoolId The user pool ID for the user pool where you want to delete user
     *         attributes.
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }
    
    /**
     * The user pool ID for the user pool where you want to delete user
     * attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @param userPoolId The user pool ID for the user pool where you want to delete user
     *         attributes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AdminDeleteUserAttributesRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * The user name of the user from which you would like to delete
     * attributes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return The user name of the user from which you would like to delete
     *         attributes.
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * The user name of the user from which you would like to delete
     * attributes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username The user name of the user from which you would like to delete
     *         attributes.
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * The user name of the user from which you would like to delete
     * attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username The user name of the user from which you would like to delete
     *         attributes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AdminDeleteUserAttributesRequest withUsername(String username) {
        this.username = username;
        return this;
    }

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
    public AdminDeleteUserAttributesRequest withUserAttributeNames(String... userAttributeNames) {
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
    public AdminDeleteUserAttributesRequest withUserAttributeNames(java.util.Collection<String> userAttributeNames) {
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
        if (getUsername() != null) sb.append("Username: " + getUsername() + ",");
        if (getUserAttributeNames() != null) sb.append("UserAttributeNames: " + getUserAttributeNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode()); 
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode()); 
        hashCode = prime * hashCode + ((getUserAttributeNames() == null) ? 0 : getUserAttributeNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AdminDeleteUserAttributesRequest == false) return false;
        AdminDeleteUserAttributesRequest other = (AdminDeleteUserAttributesRequest)obj;
        
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null) return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false) return false; 
        if (other.getUsername() == null ^ this.getUsername() == null) return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false) return false; 
        if (other.getUserAttributeNames() == null ^ this.getUserAttributeNames() == null) return false;
        if (other.getUserAttributeNames() != null && other.getUserAttributeNames().equals(this.getUserAttributeNames()) == false) return false; 
        return true;
    }
    
}
    