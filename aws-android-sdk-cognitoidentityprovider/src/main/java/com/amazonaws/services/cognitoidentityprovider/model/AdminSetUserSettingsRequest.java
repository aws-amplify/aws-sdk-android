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
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#adminSetUserSettings(AdminSetUserSettingsRequest) AdminSetUserSettings operation}.
 * <p>
 * Sets all the user settings for a specified user name. Works on any
 * user.
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#adminSetUserSettings(AdminSetUserSettingsRequest)
 */
public class AdminSetUserSettingsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The user pool ID for the user pool where you want to set the user's
     * settings, such as MFA options.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     */
    private String userPoolId;

    /**
     * The user name of the user for whom you wish to set user settings.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

    /**
     * Specifies the options for MFA (e.g., email or phone number).
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<MFAOptionType> mFAOptions;

    /**
     * The user pool ID for the user pool where you want to set the user's
     * settings, such as MFA options.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @return The user pool ID for the user pool where you want to set the user's
     *         settings, such as MFA options.
     */
    public String getUserPoolId() {
        return userPoolId;
    }
    
    /**
     * The user pool ID for the user pool where you want to set the user's
     * settings, such as MFA options.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @param userPoolId The user pool ID for the user pool where you want to set the user's
     *         settings, such as MFA options.
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }
    
    /**
     * The user pool ID for the user pool where you want to set the user's
     * settings, such as MFA options.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @param userPoolId The user pool ID for the user pool where you want to set the user's
     *         settings, such as MFA options.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AdminSetUserSettingsRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * The user name of the user for whom you wish to set user settings.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return The user name of the user for whom you wish to set user settings.
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * The user name of the user for whom you wish to set user settings.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username The user name of the user for whom you wish to set user settings.
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * The user name of the user for whom you wish to set user settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username The user name of the user for whom you wish to set user settings.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AdminSetUserSettingsRequest withUsername(String username) {
        this.username = username;
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
    public AdminSetUserSettingsRequest withMFAOptions(MFAOptionType... mFAOptions) {
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
    public AdminSetUserSettingsRequest withMFAOptions(java.util.Collection<MFAOptionType> mFAOptions) {
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
        if (getUserPoolId() != null) sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getUsername() != null) sb.append("Username: " + getUsername() + ",");
        if (getMFAOptions() != null) sb.append("MFAOptions: " + getMFAOptions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode()); 
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode()); 
        hashCode = prime * hashCode + ((getMFAOptions() == null) ? 0 : getMFAOptions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AdminSetUserSettingsRequest == false) return false;
        AdminSetUserSettingsRequest other = (AdminSetUserSettingsRequest)obj;
        
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null) return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false) return false; 
        if (other.getUsername() == null ^ this.getUsername() == null) return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false) return false; 
        if (other.getMFAOptions() == null ^ this.getMFAOptions() == null) return false;
        if (other.getMFAOptions() != null && other.getMFAOptions().equals(this.getMFAOptions()) == false) return false; 
        return true;
    }
    
}
    