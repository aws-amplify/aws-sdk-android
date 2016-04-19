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
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#setUserSettings(SetUserSettingsRequest) SetUserSettings operation}.
 * <p>
 * Sets the user settings like multi-factor authentication (MFA). If MFA
 * is to be removed for a particular attribute pass the attribute with
 * code delivery as null. If null list is passed, all MFA options are
 * removed.
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#setUserSettings(SetUserSettingsRequest)
 */
public class SetUserSettingsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The access token for the set user settings request.
     */
    private String accessToken;

    /**
     * Specifies the options for MFA (e.g., email or phone number).
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<MFAOptionType> mFAOptions;

    /**
     * The access token for the set user settings request.
     *
     * @return The access token for the set user settings request.
     */
    public String getAccessToken() {
        return accessToken;
    }
    
    /**
     * The access token for the set user settings request.
     *
     * @param accessToken The access token for the set user settings request.
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    
    /**
     * The access token for the set user settings request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accessToken The access token for the set user settings request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SetUserSettingsRequest withAccessToken(String accessToken) {
        this.accessToken = accessToken;
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
    public SetUserSettingsRequest withMFAOptions(MFAOptionType... mFAOptions) {
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
    public SetUserSettingsRequest withMFAOptions(java.util.Collection<MFAOptionType> mFAOptions) {
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
        if (getAccessToken() != null) sb.append("AccessToken: " + getAccessToken() + ",");
        if (getMFAOptions() != null) sb.append("MFAOptions: " + getMFAOptions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode()); 
        hashCode = prime * hashCode + ((getMFAOptions() == null) ? 0 : getMFAOptions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetUserSettingsRequest == false) return false;
        SetUserSettingsRequest other = (SetUserSettingsRequest)obj;
        
        if (other.getAccessToken() == null ^ this.getAccessToken() == null) return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false) return false; 
        if (other.getMFAOptions() == null ^ this.getMFAOptions() == null) return false;
        if (other.getMFAOptions() != null && other.getMFAOptions().equals(this.getMFAOptions()) == false) return false; 
        return true;
    }
    
}
    