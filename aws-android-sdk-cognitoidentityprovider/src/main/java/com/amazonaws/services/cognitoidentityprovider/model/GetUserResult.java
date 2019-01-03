/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the response from the server from the request to get information
 * about the user.
 * </p>
 */
public class GetUserResult implements Serializable {
    /**
     * <p>
     * The user name of the user you wish to retrieve from the get user request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     */
    private java.util.List<AttributeType> userAttributes;

    /**
     * <p>
     * Specifies the options for MFA (e.g., email or phone number).
     * </p>
     */
    private java.util.List<MFAOptionType> mFAOptions;

    /**
     * <p>
     * The user's preferred MFA setting.
     * </p>
     */
    private String preferredMfaSetting;

    /**
     * <p>
     * The list of the user's MFA settings.
     * </p>
     */
    private java.util.List<String> userMFASettingList;

    /**
     * <p>
     * The user name of the user you wish to retrieve from the get user request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return <p>
     *         The user name of the user you wish to retrieve from the get user
     *         request.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The user name of the user you wish to retrieve from the get user request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username <p>
     *            The user name of the user you wish to retrieve from the get
     *            user request.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name of the user you wish to retrieve from the get user request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username <p>
     *            The user name of the user you wish to retrieve from the get
     *            user request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUserResult withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     *
     * @return <p>
     *         An array of name-value pairs representing user attributes.
     *         </p>
     *         <p>
     *         For custom attributes, you must prepend the <code>custom:</code>
     *         prefix to the attribute name.
     *         </p>
     */
    public java.util.List<AttributeType> getUserAttributes() {
        return userAttributes;
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     *
     * @param userAttributes <p>
     *            An array of name-value pairs representing user attributes.
     *            </p>
     *            <p>
     *            For custom attributes, you must prepend the
     *            <code>custom:</code> prefix to the attribute name.
     *            </p>
     */
    public void setUserAttributes(java.util.Collection<AttributeType> userAttributes) {
        if (userAttributes == null) {
            this.userAttributes = null;
            return;
        }

        this.userAttributes = new java.util.ArrayList<AttributeType>(userAttributes);
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userAttributes <p>
     *            An array of name-value pairs representing user attributes.
     *            </p>
     *            <p>
     *            For custom attributes, you must prepend the
     *            <code>custom:</code> prefix to the attribute name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUserResult withUserAttributes(AttributeType... userAttributes) {
        if (getUserAttributes() == null) {
            this.userAttributes = new java.util.ArrayList<AttributeType>(userAttributes.length);
        }
        for (AttributeType value : userAttributes) {
            this.userAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userAttributes <p>
     *            An array of name-value pairs representing user attributes.
     *            </p>
     *            <p>
     *            For custom attributes, you must prepend the
     *            <code>custom:</code> prefix to the attribute name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUserResult withUserAttributes(java.util.Collection<AttributeType> userAttributes) {
        setUserAttributes(userAttributes);
        return this;
    }

    /**
     * <p>
     * Specifies the options for MFA (e.g., email or phone number).
     * </p>
     *
     * @return <p>
     *         Specifies the options for MFA (e.g., email or phone number).
     *         </p>
     */
    public java.util.List<MFAOptionType> getMFAOptions() {
        return mFAOptions;
    }

    /**
     * <p>
     * Specifies the options for MFA (e.g., email or phone number).
     * </p>
     *
     * @param mFAOptions <p>
     *            Specifies the options for MFA (e.g., email or phone number).
     *            </p>
     */
    public void setMFAOptions(java.util.Collection<MFAOptionType> mFAOptions) {
        if (mFAOptions == null) {
            this.mFAOptions = null;
            return;
        }

        this.mFAOptions = new java.util.ArrayList<MFAOptionType>(mFAOptions);
    }

    /**
     * <p>
     * Specifies the options for MFA (e.g., email or phone number).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mFAOptions <p>
     *            Specifies the options for MFA (e.g., email or phone number).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUserResult withMFAOptions(MFAOptionType... mFAOptions) {
        if (getMFAOptions() == null) {
            this.mFAOptions = new java.util.ArrayList<MFAOptionType>(mFAOptions.length);
        }
        for (MFAOptionType value : mFAOptions) {
            this.mFAOptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the options for MFA (e.g., email or phone number).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mFAOptions <p>
     *            Specifies the options for MFA (e.g., email or phone number).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUserResult withMFAOptions(java.util.Collection<MFAOptionType> mFAOptions) {
        setMFAOptions(mFAOptions);
        return this;
    }

    /**
     * <p>
     * The user's preferred MFA setting.
     * </p>
     *
     * @return <p>
     *         The user's preferred MFA setting.
     *         </p>
     */
    public String getPreferredMfaSetting() {
        return preferredMfaSetting;
    }

    /**
     * <p>
     * The user's preferred MFA setting.
     * </p>
     *
     * @param preferredMfaSetting <p>
     *            The user's preferred MFA setting.
     *            </p>
     */
    public void setPreferredMfaSetting(String preferredMfaSetting) {
        this.preferredMfaSetting = preferredMfaSetting;
    }

    /**
     * <p>
     * The user's preferred MFA setting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredMfaSetting <p>
     *            The user's preferred MFA setting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUserResult withPreferredMfaSetting(String preferredMfaSetting) {
        this.preferredMfaSetting = preferredMfaSetting;
        return this;
    }

    /**
     * <p>
     * The list of the user's MFA settings.
     * </p>
     *
     * @return <p>
     *         The list of the user's MFA settings.
     *         </p>
     */
    public java.util.List<String> getUserMFASettingList() {
        return userMFASettingList;
    }

    /**
     * <p>
     * The list of the user's MFA settings.
     * </p>
     *
     * @param userMFASettingList <p>
     *            The list of the user's MFA settings.
     *            </p>
     */
    public void setUserMFASettingList(java.util.Collection<String> userMFASettingList) {
        if (userMFASettingList == null) {
            this.userMFASettingList = null;
            return;
        }

        this.userMFASettingList = new java.util.ArrayList<String>(userMFASettingList);
    }

    /**
     * <p>
     * The list of the user's MFA settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userMFASettingList <p>
     *            The list of the user's MFA settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUserResult withUserMFASettingList(String... userMFASettingList) {
        if (getUserMFASettingList() == null) {
            this.userMFASettingList = new java.util.ArrayList<String>(userMFASettingList.length);
        }
        for (String value : userMFASettingList) {
            this.userMFASettingList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of the user's MFA settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userMFASettingList <p>
     *            The list of the user's MFA settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUserResult withUserMFASettingList(java.util.Collection<String> userMFASettingList) {
        setUserMFASettingList(userMFASettingList);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getUserAttributes() != null)
            sb.append("UserAttributes: " + getUserAttributes() + ",");
        if (getMFAOptions() != null)
            sb.append("MFAOptions: " + getMFAOptions() + ",");
        if (getPreferredMfaSetting() != null)
            sb.append("PreferredMfaSetting: " + getPreferredMfaSetting() + ",");
        if (getUserMFASettingList() != null)
            sb.append("UserMFASettingList: " + getUserMFASettingList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode
                + ((getUserAttributes() == null) ? 0 : getUserAttributes().hashCode());
        hashCode = prime * hashCode + ((getMFAOptions() == null) ? 0 : getMFAOptions().hashCode());
        hashCode = prime * hashCode
                + ((getPreferredMfaSetting() == null) ? 0 : getPreferredMfaSetting().hashCode());
        hashCode = prime * hashCode
                + ((getUserMFASettingList() == null) ? 0 : getUserMFASettingList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUserResult == false)
            return false;
        GetUserResult other = (GetUserResult) obj;

        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getUserAttributes() == null ^ this.getUserAttributes() == null)
            return false;
        if (other.getUserAttributes() != null
                && other.getUserAttributes().equals(this.getUserAttributes()) == false)
            return false;
        if (other.getMFAOptions() == null ^ this.getMFAOptions() == null)
            return false;
        if (other.getMFAOptions() != null
                && other.getMFAOptions().equals(this.getMFAOptions()) == false)
            return false;
        if (other.getPreferredMfaSetting() == null ^ this.getPreferredMfaSetting() == null)
            return false;
        if (other.getPreferredMfaSetting() != null
                && other.getPreferredMfaSetting().equals(this.getPreferredMfaSetting()) == false)
            return false;
        if (other.getUserMFASettingList() == null ^ this.getUserMFASettingList() == null)
            return false;
        if (other.getUserMFASettingList() != null
                && other.getUserMFASettingList().equals(this.getUserMFASettingList()) == false)
            return false;
        return true;
    }
}
