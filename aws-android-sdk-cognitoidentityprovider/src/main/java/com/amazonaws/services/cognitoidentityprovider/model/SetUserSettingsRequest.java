/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * <i>This action is no longer supported.</i> You can use it to configure only
 * SMS MFA. You can't use it to configure TOTP software token MFA. To configure
 * either type of MFA, use the <a>SetUserMFAPreference</a> action instead.
 * </p>
 */
public class SetUserSettingsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The access token for the set user settings request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     */
    private String accessToken;

    /**
     * <p>
     * You can use this parameter only to set an SMS configuration that uses SMS
     * for delivery.
     * </p>
     */
    private java.util.List<MFAOptionType> mFAOptions;

    /**
     * <p>
     * The access token for the set user settings request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @return <p>
     *         The access token for the set user settings request.
     *         </p>
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * <p>
     * The access token for the set user settings request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param accessToken <p>
     *            The access token for the set user settings request.
     *            </p>
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * The access token for the set user settings request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param accessToken <p>
     *            The access token for the set user settings request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetUserSettingsRequest withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * <p>
     * You can use this parameter only to set an SMS configuration that uses SMS
     * for delivery.
     * </p>
     *
     * @return <p>
     *         You can use this parameter only to set an SMS configuration that
     *         uses SMS for delivery.
     *         </p>
     */
    public java.util.List<MFAOptionType> getMFAOptions() {
        return mFAOptions;
    }

    /**
     * <p>
     * You can use this parameter only to set an SMS configuration that uses SMS
     * for delivery.
     * </p>
     *
     * @param mFAOptions <p>
     *            You can use this parameter only to set an SMS configuration
     *            that uses SMS for delivery.
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
     * You can use this parameter only to set an SMS configuration that uses SMS
     * for delivery.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mFAOptions <p>
     *            You can use this parameter only to set an SMS configuration
     *            that uses SMS for delivery.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetUserSettingsRequest withMFAOptions(MFAOptionType... mFAOptions) {
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
     * You can use this parameter only to set an SMS configuration that uses SMS
     * for delivery.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mFAOptions <p>
     *            You can use this parameter only to set an SMS configuration
     *            that uses SMS for delivery.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetUserSettingsRequest withMFAOptions(java.util.Collection<MFAOptionType> mFAOptions) {
        setMFAOptions(mFAOptions);
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
        if (getAccessToken() != null)
            sb.append("AccessToken: " + getAccessToken() + ",");
        if (getMFAOptions() != null)
            sb.append("MFAOptions: " + getMFAOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getMFAOptions() == null) ? 0 : getMFAOptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetUserSettingsRequest == false)
            return false;
        SetUserSettingsRequest other = (SetUserSettingsRequest) obj;

        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null
                && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getMFAOptions() == null ^ this.getMFAOptions() == null)
            return false;
        if (other.getMFAOptions() != null
                && other.getMFAOptions().equals(this.getMFAOptions()) == false)
            return false;
        return true;
    }
}
