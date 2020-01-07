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

/**
 * <p>
 * The configuration for the user pool's device tracking.
 * </p>
 */
public class DeviceConfigurationType implements Serializable {
    /**
     * <p>
     * Indicates whether a challenge is required on a new device. Only
     * applicable to a new device.
     * </p>
     */
    private Boolean challengeRequiredOnNewDevice;

    /**
     * <p>
     * If true, a device is only remembered on user prompt.
     * </p>
     */
    private Boolean deviceOnlyRememberedOnUserPrompt;

    /**
     * <p>
     * Indicates whether a challenge is required on a new device. Only
     * applicable to a new device.
     * </p>
     *
     * @return <p>
     *         Indicates whether a challenge is required on a new device. Only
     *         applicable to a new device.
     *         </p>
     */
    public Boolean isChallengeRequiredOnNewDevice() {
        return challengeRequiredOnNewDevice;
    }

    /**
     * <p>
     * Indicates whether a challenge is required on a new device. Only
     * applicable to a new device.
     * </p>
     *
     * @return <p>
     *         Indicates whether a challenge is required on a new device. Only
     *         applicable to a new device.
     *         </p>
     */
    public Boolean getChallengeRequiredOnNewDevice() {
        return challengeRequiredOnNewDevice;
    }

    /**
     * <p>
     * Indicates whether a challenge is required on a new device. Only
     * applicable to a new device.
     * </p>
     *
     * @param challengeRequiredOnNewDevice <p>
     *            Indicates whether a challenge is required on a new device.
     *            Only applicable to a new device.
     *            </p>
     */
    public void setChallengeRequiredOnNewDevice(Boolean challengeRequiredOnNewDevice) {
        this.challengeRequiredOnNewDevice = challengeRequiredOnNewDevice;
    }

    /**
     * <p>
     * Indicates whether a challenge is required on a new device. Only
     * applicable to a new device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param challengeRequiredOnNewDevice <p>
     *            Indicates whether a challenge is required on a new device.
     *            Only applicable to a new device.
     *            </p>
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
     * If true, a device is only remembered on user prompt.
     * </p>
     *
     * @return <p>
     *         If true, a device is only remembered on user prompt.
     *         </p>
     */
    public Boolean isDeviceOnlyRememberedOnUserPrompt() {
        return deviceOnlyRememberedOnUserPrompt;
    }

    /**
     * <p>
     * If true, a device is only remembered on user prompt.
     * </p>
     *
     * @return <p>
     *         If true, a device is only remembered on user prompt.
     *         </p>
     */
    public Boolean getDeviceOnlyRememberedOnUserPrompt() {
        return deviceOnlyRememberedOnUserPrompt;
    }

    /**
     * <p>
     * If true, a device is only remembered on user prompt.
     * </p>
     *
     * @param deviceOnlyRememberedOnUserPrompt <p>
     *            If true, a device is only remembered on user prompt.
     *            </p>
     */
    public void setDeviceOnlyRememberedOnUserPrompt(Boolean deviceOnlyRememberedOnUserPrompt) {
        this.deviceOnlyRememberedOnUserPrompt = deviceOnlyRememberedOnUserPrompt;
    }

    /**
     * <p>
     * If true, a device is only remembered on user prompt.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceOnlyRememberedOnUserPrompt <p>
     *            If true, a device is only remembered on user prompt.
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
