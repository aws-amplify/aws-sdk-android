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

/**
 * <p>
 * Represents the response from the server from the request to get
 * information about the user.
 * </p>
 */
public class GetUserResult implements Serializable {

    /**
     * The user name of the user you wish to retrieve from the get user
     * request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

    /**
     * An array of name-value pairs representing user attributes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType> userAttributes;

    /**
     * Specifies the options for MFA (e.g., email or phone number).
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<MFAOptionType> mFAOptions;

    /**
     * The user name of the user you wish to retrieve from the get user
     * request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return The user name of the user you wish to retrieve from the get user
     *         request.
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * The user name of the user you wish to retrieve from the get user
     * request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username The user name of the user you wish to retrieve from the get user
     *         request.
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * The user name of the user you wish to retrieve from the get user
     * request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username The user name of the user you wish to retrieve from the get user
     *         request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetUserResult withUsername(String username) {
        this.username = username;
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
    public GetUserResult withUserAttributes(AttributeType... userAttributes) {
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
    public GetUserResult withUserAttributes(java.util.Collection<AttributeType> userAttributes) {
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
     * Specifies the options for MFA (e.g., email or phone number).
     *
     * @return Specifies the options for MFA (e.g., email or phone number).
     */
    public java.util.List<MFAOptionType> getMFAOptions() {
        if (mFAOptions == null) {
              mFAOptions = new com.amazonaws.internal.ListWithAutoConstructFlag<MFAOptionType>();
              mFAOptions.setAutoConstruct(true);
        }
        return mFAOptions;
    }
    
    /**
     * Specifies the options for MFA (e.g., email or phone number).
     *
     * @param mFAOptions Specifies the options for MFA (e.g., email or phone number).
     */
    public void setMFAOptions(java.util.Collection<MFAOptionType> mFAOptions) {
        if (mFAOptions == null) {
            this.mFAOptions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<MFAOptionType> mFAOptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MFAOptionType>(mFAOptions.size());
        mFAOptionsCopy.addAll(mFAOptions);
        this.mFAOptions = mFAOptionsCopy;
    }
    
    /**
     * Specifies the options for MFA (e.g., email or phone number).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mFAOptions Specifies the options for MFA (e.g., email or phone number).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetUserResult withMFAOptions(MFAOptionType... mFAOptions) {
        if (getMFAOptions() == null) setMFAOptions(new java.util.ArrayList<MFAOptionType>(mFAOptions.length));
        for (MFAOptionType value : mFAOptions) {
            getMFAOptions().add(value);
        }
        return this;
    }
    
    /**
     * Specifies the options for MFA (e.g., email or phone number).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mFAOptions Specifies the options for MFA (e.g., email or phone number).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetUserResult withMFAOptions(java.util.Collection<MFAOptionType> mFAOptions) {
        if (mFAOptions == null) {
            this.mFAOptions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<MFAOptionType> mFAOptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MFAOptionType>(mFAOptions.size());
            mFAOptionsCopy.addAll(mFAOptions);
            this.mFAOptions = mFAOptionsCopy;
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
        if (getUsername() != null) sb.append("Username: " + getUsername() + ",");
        if (getUserAttributes() != null) sb.append("UserAttributes: " + getUserAttributes() + ",");
        if (getMFAOptions() != null) sb.append("MFAOptions: " + getMFAOptions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode()); 
        hashCode = prime * hashCode + ((getUserAttributes() == null) ? 0 : getUserAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getMFAOptions() == null) ? 0 : getMFAOptions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetUserResult == false) return false;
        GetUserResult other = (GetUserResult)obj;
        
        if (other.getUsername() == null ^ this.getUsername() == null) return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false) return false; 
        if (other.getUserAttributes() == null ^ this.getUserAttributes() == null) return false;
        if (other.getUserAttributes() != null && other.getUserAttributes().equals(this.getUserAttributes()) == false) return false; 
        if (other.getMFAOptions() == null ^ this.getMFAOptions() == null) return false;
        if (other.getMFAOptions() != null && other.getMFAOptions().equals(this.getMFAOptions()) == false) return false; 
        return true;
    }
    
}
    