/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class SetUserMFAPreferenceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The new value for the sMSMfaSettings property for this object.
     */
    private SMSMfaSettingsType sMSMfaSettings;

    /**
     * The new value for the softwareTokenMfaSettings property for this object.
     */
    private SoftwareTokenMfaSettingsType softwareTokenMfaSettings;

    /**
     * The new value for the accessToken property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     */
    private String accessToken;

    /**
     * Returns the value of the sMSMfaSettings property for this object.
     *
     * @return The value of the sMSMfaSettings property for this object.
     */
    public SMSMfaSettingsType getSMSMfaSettings() {
        return sMSMfaSettings;
    }

    /**
     * Sets the value of sMSMfaSettings
     *
     * @param sMSMfaSettings The new value for the sMSMfaSettings property for
     *            this object.
     */
    public void setSMSMfaSettings(SMSMfaSettingsType sMSMfaSettings) {
        this.sMSMfaSettings = sMSMfaSettings;
    }

    /**
     * Sets the value of the sMSMfaSettings property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sMSMfaSettings The new value for the sMSMfaSettings property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetUserMFAPreferenceRequest withSMSMfaSettings(SMSMfaSettingsType sMSMfaSettings) {
        this.sMSMfaSettings = sMSMfaSettings;
        return this;
    }

    /**
     * Returns the value of the softwareTokenMfaSettings property for this
     * object.
     *
     * @return The value of the softwareTokenMfaSettings property for this
     *         object.
     */
    public SoftwareTokenMfaSettingsType getSoftwareTokenMfaSettings() {
        return softwareTokenMfaSettings;
    }

    /**
     * Sets the value of softwareTokenMfaSettings
     *
     * @param softwareTokenMfaSettings The new value for the
     *            softwareTokenMfaSettings property for this object.
     */
    public void setSoftwareTokenMfaSettings(SoftwareTokenMfaSettingsType softwareTokenMfaSettings) {
        this.softwareTokenMfaSettings = softwareTokenMfaSettings;
    }

    /**
     * Sets the value of the softwareTokenMfaSettings property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param softwareTokenMfaSettings The new value for the
     *            softwareTokenMfaSettings property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetUserMFAPreferenceRequest withSoftwareTokenMfaSettings(
            SoftwareTokenMfaSettingsType softwareTokenMfaSettings) {
        this.softwareTokenMfaSettings = softwareTokenMfaSettings;
        return this;
    }

    /**
     * Returns the value of the accessToken property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @return The value of the accessToken property for this object.
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Sets the value of accessToken
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param accessToken The new value for the accessToken property for this
     *            object.
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * Sets the value of the accessToken property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param accessToken The new value for the accessToken property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetUserMFAPreferenceRequest withAccessToken(String accessToken) {
        this.accessToken = accessToken;
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
        if (getAccessToken() != null)
            sb.append("AccessToken: " + getAccessToken());
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
        hashCode = prime * hashCode
                + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetUserMFAPreferenceRequest == false)
            return false;
        SetUserMFAPreferenceRequest other = (SetUserMFAPreferenceRequest) obj;

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
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null
                && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        return true;
    }
}
