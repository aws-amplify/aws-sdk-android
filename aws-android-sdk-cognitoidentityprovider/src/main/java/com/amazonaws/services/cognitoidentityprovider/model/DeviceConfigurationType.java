/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The device-remembering configuration for a user pool. A null value indicates
 * that you have deactivated device remembering in your user pool.
 * </p>
 * <note>
 * <p>
 * When you provide a value for any <code>DeviceConfiguration</code> field, you
 * activate the Amazon Cognito device-remembering feature.
 * </p>
 * </note>
 */
public class DeviceConfigurationType implements Serializable {
    /**
     * <p>
     * When true, device authentication can replace SMS and time-based one-time
     * password (TOTP) factors for multi-factor authentication (MFA).
     * </p>
     * <note>
     * <p>
     * Regardless of the value of this field, users that sign in with new
     * devices that have not been confirmed or remembered must provide a second
     * factor if your user pool requires MFA.
     * </p>
     * </note>
     */
    private Boolean challengeRequiredOnNewDevice;

    /**
     * <p>
     * When true, Amazon Cognito doesn't remember newly-confirmed devices. Users
     * who want to authenticate with their device can instead opt in to
     * remembering their device. To collect a choice from your user, create an
     * input prompt in your app and return the value that the user chooses in an
     * <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     * >UpdateDeviceStatus</a> API request.
     * </p>
     */
    private Boolean deviceOnlyRememberedOnUserPrompt;

    /**
     * <p>
     * When true, device authentication can replace SMS and time-based one-time
     * password (TOTP) factors for multi-factor authentication (MFA).
     * </p>
     * <note>
     * <p>
     * Regardless of the value of this field, users that sign in with new
     * devices that have not been confirmed or remembered must provide a second
     * factor if your user pool requires MFA.
     * </p>
     * </note>
     *
     * @return <p>
     *         When true, device authentication can replace SMS and time-based
     *         one-time password (TOTP) factors for multi-factor authentication
     *         (MFA).
     *         </p>
     *         <note>
     *         <p>
     *         Regardless of the value of this field, users that sign in with
     *         new devices that have not been confirmed or remembered must
     *         provide a second factor if your user pool requires MFA.
     *         </p>
     *         </note>
     */
    public Boolean isChallengeRequiredOnNewDevice() {
        return challengeRequiredOnNewDevice;
    }

    /**
     * <p>
     * When true, device authentication can replace SMS and time-based one-time
     * password (TOTP) factors for multi-factor authentication (MFA).
     * </p>
     * <note>
     * <p>
     * Regardless of the value of this field, users that sign in with new
     * devices that have not been confirmed or remembered must provide a second
     * factor if your user pool requires MFA.
     * </p>
     * </note>
     *
     * @return <p>
     *         When true, device authentication can replace SMS and time-based
     *         one-time password (TOTP) factors for multi-factor authentication
     *         (MFA).
     *         </p>
     *         <note>
     *         <p>
     *         Regardless of the value of this field, users that sign in with
     *         new devices that have not been confirmed or remembered must
     *         provide a second factor if your user pool requires MFA.
     *         </p>
     *         </note>
     */
    public Boolean getChallengeRequiredOnNewDevice() {
        return challengeRequiredOnNewDevice;
    }

    /**
     * <p>
     * When true, device authentication can replace SMS and time-based one-time
     * password (TOTP) factors for multi-factor authentication (MFA).
     * </p>
     * <note>
     * <p>
     * Regardless of the value of this field, users that sign in with new
     * devices that have not been confirmed or remembered must provide a second
     * factor if your user pool requires MFA.
     * </p>
     * </note>
     *
     * @param challengeRequiredOnNewDevice <p>
     *            When true, device authentication can replace SMS and
     *            time-based one-time password (TOTP) factors for multi-factor
     *            authentication (MFA).
     *            </p>
     *            <note>
     *            <p>
     *            Regardless of the value of this field, users that sign in with
     *            new devices that have not been confirmed or remembered must
     *            provide a second factor if your user pool requires MFA.
     *            </p>
     *            </note>
     */
    public void setChallengeRequiredOnNewDevice(Boolean challengeRequiredOnNewDevice) {
        this.challengeRequiredOnNewDevice = challengeRequiredOnNewDevice;
    }

    /**
     * <p>
     * When true, device authentication can replace SMS and time-based one-time
     * password (TOTP) factors for multi-factor authentication (MFA).
     * </p>
     * <note>
     * <p>
     * Regardless of the value of this field, users that sign in with new
     * devices that have not been confirmed or remembered must provide a second
     * factor if your user pool requires MFA.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param challengeRequiredOnNewDevice <p>
     *            When true, device authentication can replace SMS and
     *            time-based one-time password (TOTP) factors for multi-factor
     *            authentication (MFA).
     *            </p>
     *            <note>
     *            <p>
     *            Regardless of the value of this field, users that sign in with
     *            new devices that have not been confirmed or remembered must
     *            provide a second factor if your user pool requires MFA.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceConfigurationType withChallengeRequiredOnNewDevice(
            Boolean challengeRequiredOnNewDevice) {
        this.challengeRequiredOnNewDevice = challengeRequiredOnNewDevice;
        return this;
    }

    /**
     * <p>
     * When true, Amazon Cognito doesn't remember newly-confirmed devices. Users
     * who want to authenticate with their device can instead opt in to
     * remembering their device. To collect a choice from your user, create an
     * input prompt in your app and return the value that the user chooses in an
     * <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     * >UpdateDeviceStatus</a> API request.
     * </p>
     *
     * @return <p>
     *         When true, Amazon Cognito doesn't remember newly-confirmed
     *         devices. Users who want to authenticate with their device can
     *         instead opt in to remembering their device. To collect a choice
     *         from your user, create an input prompt in your app and return the
     *         value that the user chooses in an <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     *         >UpdateDeviceStatus</a> API request.
     *         </p>
     */
    public Boolean isDeviceOnlyRememberedOnUserPrompt() {
        return deviceOnlyRememberedOnUserPrompt;
    }

    /**
     * <p>
     * When true, Amazon Cognito doesn't remember newly-confirmed devices. Users
     * who want to authenticate with their device can instead opt in to
     * remembering their device. To collect a choice from your user, create an
     * input prompt in your app and return the value that the user chooses in an
     * <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     * >UpdateDeviceStatus</a> API request.
     * </p>
     *
     * @return <p>
     *         When true, Amazon Cognito doesn't remember newly-confirmed
     *         devices. Users who want to authenticate with their device can
     *         instead opt in to remembering their device. To collect a choice
     *         from your user, create an input prompt in your app and return the
     *         value that the user chooses in an <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     *         >UpdateDeviceStatus</a> API request.
     *         </p>
     */
    public Boolean getDeviceOnlyRememberedOnUserPrompt() {
        return deviceOnlyRememberedOnUserPrompt;
    }

    /**
     * <p>
     * When true, Amazon Cognito doesn't remember newly-confirmed devices. Users
     * who want to authenticate with their device can instead opt in to
     * remembering their device. To collect a choice from your user, create an
     * input prompt in your app and return the value that the user chooses in an
     * <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     * >UpdateDeviceStatus</a> API request.
     * </p>
     *
     * @param deviceOnlyRememberedOnUserPrompt <p>
     *            When true, Amazon Cognito doesn't remember newly-confirmed
     *            devices. Users who want to authenticate with their device can
     *            instead opt in to remembering their device. To collect a
     *            choice from your user, create an input prompt in your app and
     *            return the value that the user chooses in an <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     *            >UpdateDeviceStatus</a> API request.
     *            </p>
     */
    public void setDeviceOnlyRememberedOnUserPrompt(Boolean deviceOnlyRememberedOnUserPrompt) {
        this.deviceOnlyRememberedOnUserPrompt = deviceOnlyRememberedOnUserPrompt;
    }

    /**
     * <p>
     * When true, Amazon Cognito doesn't remember newly-confirmed devices. Users
     * who want to authenticate with their device can instead opt in to
     * remembering their device. To collect a choice from your user, create an
     * input prompt in your app and return the value that the user chooses in an
     * <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     * >UpdateDeviceStatus</a> API request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceOnlyRememberedOnUserPrompt <p>
     *            When true, Amazon Cognito doesn't remember newly-confirmed
     *            devices. Users who want to authenticate with their device can
     *            instead opt in to remembering their device. To collect a
     *            choice from your user, create an input prompt in your app and
     *            return the value that the user chooses in an <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     *            >UpdateDeviceStatus</a> API request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceConfigurationType withDeviceOnlyRememberedOnUserPrompt(
            Boolean deviceOnlyRememberedOnUserPrompt) {
        this.deviceOnlyRememberedOnUserPrompt = deviceOnlyRememberedOnUserPrompt;
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
        if (getChallengeRequiredOnNewDevice() != null)
            sb.append("ChallengeRequiredOnNewDevice: " + getChallengeRequiredOnNewDevice() + ",");
        if (getDeviceOnlyRememberedOnUserPrompt() != null)
            sb.append("DeviceOnlyRememberedOnUserPrompt: " + getDeviceOnlyRememberedOnUserPrompt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getChallengeRequiredOnNewDevice() == null) ? 0
                        : getChallengeRequiredOnNewDevice().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeviceOnlyRememberedOnUserPrompt() == null) ? 0
                        : getDeviceOnlyRememberedOnUserPrompt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceConfigurationType == false)
            return false;
        DeviceConfigurationType other = (DeviceConfigurationType) obj;

        if (other.getChallengeRequiredOnNewDevice() == null
                ^ this.getChallengeRequiredOnNewDevice() == null)
            return false;
        if (other.getChallengeRequiredOnNewDevice() != null
                && other.getChallengeRequiredOnNewDevice().equals(
                        this.getChallengeRequiredOnNewDevice()) == false)
            return false;
        if (other.getDeviceOnlyRememberedOnUserPrompt() == null
                ^ this.getDeviceOnlyRememberedOnUserPrompt() == null)
            return false;
        if (other.getDeviceOnlyRememberedOnUserPrompt() != null
                && other.getDeviceOnlyRememberedOnUserPrompt().equals(
                        this.getDeviceOnlyRememberedOnUserPrompt()) == false)
            return false;
        return true;
    }
}
