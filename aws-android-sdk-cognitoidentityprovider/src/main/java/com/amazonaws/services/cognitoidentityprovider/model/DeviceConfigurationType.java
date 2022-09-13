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
 * The device-remembering configuration for a user pool. A <a href=
 * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DescribeUserPool.html"
 * > DescribeUserPool</a> request returns a null value for this object when the
 * user pool isn't configured to remember devices. When device remembering is
 * active, you can remember a user's device with a <a href=
 * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ConfirmDevice.html"
 * >ConfirmDevice</a> API request. Additionally. when the property
 * <code>DeviceOnlyRememberedOnUserPrompt</code> is <code>true</code>, you must
 * follow <code>ConfirmDevice</code> with an <a href=
 * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
 * >UpdateDeviceStatus</a> API request that sets the user's device to
 * <code>remembered</code> or <code>not_remembered</code>.
 * </p>
 * <p>
 * To sign in with a remembered device, include <code>DEVICE_KEY</code> in the
 * authentication parameters in your user's <a href=
 * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_InitiateAuth.html"
 * > InitiateAuth</a> request. If your app doesn't include a
 * <code>DEVICE_KEY</code> parameter, the <a href=
 * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_InitiateAuth.html#API_InitiateAuth_ResponseSyntax"
 * >response</a> from Amazon Cognito includes newly-generated
 * <code>DEVICE_KEY</code> and <code>DEVICE_GROUP_KEY</code> values under
 * <code>NewDeviceMetadata</code>. Store these values to use in future
 * device-authentication requests.
 * </p>
 * <note>
 * <p>
 * When you provide a value for any property of <code>DeviceConfiguration</code>
 * , you activate the device remembering for the user pool.
 * </p>
 * </note>
 */
public class DeviceConfigurationType implements Serializable {
    /**
     * <p>
     * When true, a remembered device can sign in with device authentication
     * instead of SMS and time-based one-time password (TOTP) factors for
     * multi-factor authentication (MFA).
     * </p>
     * <note>
     * <p>
     * Whether or not <code>ChallengeRequiredOnNewDevice</code> is true, users
     * who sign in with devices that have not been confirmed or remembered must
     * still provide a second factor in a user pool that requires MFA.
     * </p>
     * </note>
     */
    private Boolean challengeRequiredOnNewDevice;

    /**
     * <p>
     * When true, Amazon Cognito doesn't automatically remember a user's device
     * when your app sends a <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ConfirmDevice.html"
     * > ConfirmDevice</a> API request. In your app, create a prompt for your
     * user to choose whether they want to remember their device. Return the
     * user's choice in an <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     * > UpdateDeviceStatus</a> API request.
     * </p>
     * <p>
     * When <code>DeviceOnlyRememberedOnUserPrompt</code> is <code>false</code>,
     * Amazon Cognito immediately remembers devices that you register in a
     * <code>ConfirmDevice</code> API request.
     * </p>
     */
    private Boolean deviceOnlyRememberedOnUserPrompt;

    /**
     * <p>
     * When true, a remembered device can sign in with device authentication
     * instead of SMS and time-based one-time password (TOTP) factors for
     * multi-factor authentication (MFA).
     * </p>
     * <note>
     * <p>
     * Whether or not <code>ChallengeRequiredOnNewDevice</code> is true, users
     * who sign in with devices that have not been confirmed or remembered must
     * still provide a second factor in a user pool that requires MFA.
     * </p>
     * </note>
     *
     * @return <p>
     *         When true, a remembered device can sign in with device
     *         authentication instead of SMS and time-based one-time password
     *         (TOTP) factors for multi-factor authentication (MFA).
     *         </p>
     *         <note>
     *         <p>
     *         Whether or not <code>ChallengeRequiredOnNewDevice</code> is true,
     *         users who sign in with devices that have not been confirmed or
     *         remembered must still provide a second factor in a user pool that
     *         requires MFA.
     *         </p>
     *         </note>
     */
    public Boolean isChallengeRequiredOnNewDevice() {
        return challengeRequiredOnNewDevice;
    }

    /**
     * <p>
     * When true, a remembered device can sign in with device authentication
     * instead of SMS and time-based one-time password (TOTP) factors for
     * multi-factor authentication (MFA).
     * </p>
     * <note>
     * <p>
     * Whether or not <code>ChallengeRequiredOnNewDevice</code> is true, users
     * who sign in with devices that have not been confirmed or remembered must
     * still provide a second factor in a user pool that requires MFA.
     * </p>
     * </note>
     *
     * @return <p>
     *         When true, a remembered device can sign in with device
     *         authentication instead of SMS and time-based one-time password
     *         (TOTP) factors for multi-factor authentication (MFA).
     *         </p>
     *         <note>
     *         <p>
     *         Whether or not <code>ChallengeRequiredOnNewDevice</code> is true,
     *         users who sign in with devices that have not been confirmed or
     *         remembered must still provide a second factor in a user pool that
     *         requires MFA.
     *         </p>
     *         </note>
     */
    public Boolean getChallengeRequiredOnNewDevice() {
        return challengeRequiredOnNewDevice;
    }

    /**
     * <p>
     * When true, a remembered device can sign in with device authentication
     * instead of SMS and time-based one-time password (TOTP) factors for
     * multi-factor authentication (MFA).
     * </p>
     * <note>
     * <p>
     * Whether or not <code>ChallengeRequiredOnNewDevice</code> is true, users
     * who sign in with devices that have not been confirmed or remembered must
     * still provide a second factor in a user pool that requires MFA.
     * </p>
     * </note>
     *
     * @param challengeRequiredOnNewDevice <p>
     *            When true, a remembered device can sign in with device
     *            authentication instead of SMS and time-based one-time password
     *            (TOTP) factors for multi-factor authentication (MFA).
     *            </p>
     *            <note>
     *            <p>
     *            Whether or not <code>ChallengeRequiredOnNewDevice</code> is
     *            true, users who sign in with devices that have not been
     *            confirmed or remembered must still provide a second factor in
     *            a user pool that requires MFA.
     *            </p>
     *            </note>
     */
    public void setChallengeRequiredOnNewDevice(Boolean challengeRequiredOnNewDevice) {
        this.challengeRequiredOnNewDevice = challengeRequiredOnNewDevice;
    }

    /**
     * <p>
     * When true, a remembered device can sign in with device authentication
     * instead of SMS and time-based one-time password (TOTP) factors for
     * multi-factor authentication (MFA).
     * </p>
     * <note>
     * <p>
     * Whether or not <code>ChallengeRequiredOnNewDevice</code> is true, users
     * who sign in with devices that have not been confirmed or remembered must
     * still provide a second factor in a user pool that requires MFA.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param challengeRequiredOnNewDevice <p>
     *            When true, a remembered device can sign in with device
     *            authentication instead of SMS and time-based one-time password
     *            (TOTP) factors for multi-factor authentication (MFA).
     *            </p>
     *            <note>
     *            <p>
     *            Whether or not <code>ChallengeRequiredOnNewDevice</code> is
     *            true, users who sign in with devices that have not been
     *            confirmed or remembered must still provide a second factor in
     *            a user pool that requires MFA.
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
     * When true, Amazon Cognito doesn't automatically remember a user's device
     * when your app sends a <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ConfirmDevice.html"
     * > ConfirmDevice</a> API request. In your app, create a prompt for your
     * user to choose whether they want to remember their device. Return the
     * user's choice in an <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     * > UpdateDeviceStatus</a> API request.
     * </p>
     * <p>
     * When <code>DeviceOnlyRememberedOnUserPrompt</code> is <code>false</code>,
     * Amazon Cognito immediately remembers devices that you register in a
     * <code>ConfirmDevice</code> API request.
     * </p>
     *
     * @return <p>
     *         When true, Amazon Cognito doesn't automatically remember a user's
     *         device when your app sends a <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ConfirmDevice.html"
     *         > ConfirmDevice</a> API request. In your app, create a prompt for
     *         your user to choose whether they want to remember their device.
     *         Return the user's choice in an <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     *         > UpdateDeviceStatus</a> API request.
     *         </p>
     *         <p>
     *         When <code>DeviceOnlyRememberedOnUserPrompt</code> is
     *         <code>false</code>, Amazon Cognito immediately remembers devices
     *         that you register in a <code>ConfirmDevice</code> API request.
     *         </p>
     */
    public Boolean isDeviceOnlyRememberedOnUserPrompt() {
        return deviceOnlyRememberedOnUserPrompt;
    }

    /**
     * <p>
     * When true, Amazon Cognito doesn't automatically remember a user's device
     * when your app sends a <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ConfirmDevice.html"
     * > ConfirmDevice</a> API request. In your app, create a prompt for your
     * user to choose whether they want to remember their device. Return the
     * user's choice in an <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     * > UpdateDeviceStatus</a> API request.
     * </p>
     * <p>
     * When <code>DeviceOnlyRememberedOnUserPrompt</code> is <code>false</code>,
     * Amazon Cognito immediately remembers devices that you register in a
     * <code>ConfirmDevice</code> API request.
     * </p>
     *
     * @return <p>
     *         When true, Amazon Cognito doesn't automatically remember a user's
     *         device when your app sends a <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ConfirmDevice.html"
     *         > ConfirmDevice</a> API request. In your app, create a prompt for
     *         your user to choose whether they want to remember their device.
     *         Return the user's choice in an <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     *         > UpdateDeviceStatus</a> API request.
     *         </p>
     *         <p>
     *         When <code>DeviceOnlyRememberedOnUserPrompt</code> is
     *         <code>false</code>, Amazon Cognito immediately remembers devices
     *         that you register in a <code>ConfirmDevice</code> API request.
     *         </p>
     */
    public Boolean getDeviceOnlyRememberedOnUserPrompt() {
        return deviceOnlyRememberedOnUserPrompt;
    }

    /**
     * <p>
     * When true, Amazon Cognito doesn't automatically remember a user's device
     * when your app sends a <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ConfirmDevice.html"
     * > ConfirmDevice</a> API request. In your app, create a prompt for your
     * user to choose whether they want to remember their device. Return the
     * user's choice in an <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     * > UpdateDeviceStatus</a> API request.
     * </p>
     * <p>
     * When <code>DeviceOnlyRememberedOnUserPrompt</code> is <code>false</code>,
     * Amazon Cognito immediately remembers devices that you register in a
     * <code>ConfirmDevice</code> API request.
     * </p>
     *
     * @param deviceOnlyRememberedOnUserPrompt <p>
     *            When true, Amazon Cognito doesn't automatically remember a
     *            user's device when your app sends a <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ConfirmDevice.html"
     *            > ConfirmDevice</a> API request. In your app, create a prompt
     *            for your user to choose whether they want to remember their
     *            device. Return the user's choice in an <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     *            > UpdateDeviceStatus</a> API request.
     *            </p>
     *            <p>
     *            When <code>DeviceOnlyRememberedOnUserPrompt</code> is
     *            <code>false</code>, Amazon Cognito immediately remembers
     *            devices that you register in a <code>ConfirmDevice</code> API
     *            request.
     *            </p>
     */
    public void setDeviceOnlyRememberedOnUserPrompt(Boolean deviceOnlyRememberedOnUserPrompt) {
        this.deviceOnlyRememberedOnUserPrompt = deviceOnlyRememberedOnUserPrompt;
    }

    /**
     * <p>
     * When true, Amazon Cognito doesn't automatically remember a user's device
     * when your app sends a <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ConfirmDevice.html"
     * > ConfirmDevice</a> API request. In your app, create a prompt for your
     * user to choose whether they want to remember their device. Return the
     * user's choice in an <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     * > UpdateDeviceStatus</a> API request.
     * </p>
     * <p>
     * When <code>DeviceOnlyRememberedOnUserPrompt</code> is <code>false</code>,
     * Amazon Cognito immediately remembers devices that you register in a
     * <code>ConfirmDevice</code> API request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceOnlyRememberedOnUserPrompt <p>
     *            When true, Amazon Cognito doesn't automatically remember a
     *            user's device when your app sends a <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ConfirmDevice.html"
     *            > ConfirmDevice</a> API request. In your app, create a prompt
     *            for your user to choose whether they want to remember their
     *            device. Return the user's choice in an <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     *            > UpdateDeviceStatus</a> API request.
     *            </p>
     *            <p>
     *            When <code>DeviceOnlyRememberedOnUserPrompt</code> is
     *            <code>false</code>, Amazon Cognito immediately remembers
     *            devices that you register in a <code>ConfirmDevice</code> API
     *            request.
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
