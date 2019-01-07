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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sets the user's multi-factor authentication (MFA) preference.
 * </p>
 */
public class AdminSetUserMFAPreferenceRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The SMS text message MFA settings.
     * </p>
     */
    private SMSMfaSettingsType sMSMfaSettings;

    /**
     * <p>
     * The time-based one-time password software token MFA settings.
     * </p>
     */
    private SoftwareTokenMfaSettingsType softwareTokenMfaSettings;

    /**
     * <p>
     * The user pool username or alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * The SMS text message MFA settings.
     * </p>
     *
     * @return <p>
     *         The SMS text message MFA settings.
     *         </p>
     */
    public SMSMfaSettingsType getSMSMfaSettings() {
        return sMSMfaSettings;
    }

    /**
     * <p>
     * The SMS text message MFA settings.
     * </p>
     *
     * @param sMSMfaSettings <p>
     *            The SMS text message MFA settings.
     *            </p>
     */
    public void setSMSMfaSettings(SMSMfaSettingsType sMSMfaSettings) {
        this.sMSMfaSettings = sMSMfaSettings;
    }

    /**
     * <p>
     * The SMS text message MFA settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sMSMfaSettings <p>
     *            The SMS text message MFA settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminSetUserMFAPreferenceRequest withSMSMfaSettings(SMSMfaSettingsType sMSMfaSettings) {
        this.sMSMfaSettings = sMSMfaSettings;
        return this;
    }

    /**
     * <p>
     * The time-based one-time password software token MFA settings.
     * </p>
     *
     * @return <p>
     *         The time-based one-time password software token MFA settings.
     *         </p>
     */
    public SoftwareTokenMfaSettingsType getSoftwareTokenMfaSettings() {
        return softwareTokenMfaSettings;
    }

    /**
     * <p>
     * The time-based one-time password software token MFA settings.
     * </p>
     *
     * @param softwareTokenMfaSettings <p>
     *            The time-based one-time password software token MFA settings.
     *            </p>
     */
    public void setSoftwareTokenMfaSettings(SoftwareTokenMfaSettingsType softwareTokenMfaSettings) {
        this.softwareTokenMfaSettings = softwareTokenMfaSettings;
    }

    /**
     * <p>
     * The time-based one-time password software token MFA settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param softwareTokenMfaSettings <p>
     *            The time-based one-time password software token MFA settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminSetUserMFAPreferenceRequest withSoftwareTokenMfaSettings(
            SoftwareTokenMfaSettingsType softwareTokenMfaSettings) {
        this.softwareTokenMfaSettings = softwareTokenMfaSettings;
        return this;
    }

    /**
     * <p>
     * The user pool username or alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return <p>
     *         The user pool username or alias.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The user pool username or alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username <p>
     *            The user pool username or alias.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user pool username or alias.
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
     *            The user pool username or alias.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminSetUserMFAPreferenceRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminSetUserMFAPreferenceRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
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
        if (getSMSMfaSettings() != null)
            sb.append("SMSMfaSettings: " + getSMSMfaSettings() + ",");
        if (getSoftwareTokenMfaSettings() != null)
            sb.append("SoftwareTokenMfaSettings: " + getSoftwareTokenMfaSettings() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSMSMfaSettings() == null) ? 0 : getSMSMfaSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getSoftwareTokenMfaSettings() == null) ? 0 : getSoftwareTokenMfaSettings()
                        .hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminSetUserMFAPreferenceRequest == false)
            return false;
        AdminSetUserMFAPreferenceRequest other = (AdminSetUserMFAPreferenceRequest) obj;

        if (other.getSMSMfaSettings() == null ^ this.getSMSMfaSettings() == null)
            return false;
        if (other.getSMSMfaSettings() != null
                && other.getSMSMfaSettings().equals(this.getSMSMfaSettings()) == false)
            return false;
        if (other.getSoftwareTokenMfaSettings() == null
                ^ this.getSoftwareTokenMfaSettings() == null)
            return false;
        if (other.getSoftwareTokenMfaSettings() != null
                && other.getSoftwareTokenMfaSettings().equals(this.getSoftwareTokenMfaSettings()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        return true;
    }
}
