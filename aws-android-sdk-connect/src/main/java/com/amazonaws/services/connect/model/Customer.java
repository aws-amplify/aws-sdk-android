/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the Customer on the contact.
 * </p>
 */
public class Customer implements Serializable {
    /**
     * <p>
     * Information regarding Customer’s device.
     * </p>
     */
    private DeviceInfo deviceInfo;

    /**
     * <p>
     * The configuration for the allowed capabilities for participants present
     * over the call.
     * </p>
     */
    private ParticipantCapabilities capabilities;

    /**
     * <p>
     * Information regarding Customer’s device.
     * </p>
     *
     * @return <p>
     *         Information regarding Customer’s device.
     *         </p>
     */
    public DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * <p>
     * Information regarding Customer’s device.
     * </p>
     *
     * @param deviceInfo <p>
     *            Information regarding Customer’s device.
     *            </p>
     */
    public void setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    /**
     * <p>
     * Information regarding Customer’s device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceInfo <p>
     *            Information regarding Customer’s device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Customer withDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }

    /**
     * <p>
     * The configuration for the allowed capabilities for participants present
     * over the call.
     * </p>
     *
     * @return <p>
     *         The configuration for the allowed capabilities for participants
     *         present over the call.
     *         </p>
     */
    public ParticipantCapabilities getCapabilities() {
        return capabilities;
    }

    /**
     * <p>
     * The configuration for the allowed capabilities for participants present
     * over the call.
     * </p>
     *
     * @param capabilities <p>
     *            The configuration for the allowed capabilities for
     *            participants present over the call.
     *            </p>
     */
    public void setCapabilities(ParticipantCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * <p>
     * The configuration for the allowed capabilities for participants present
     * over the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capabilities <p>
     *            The configuration for the allowed capabilities for
     *            participants present over the call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Customer withCapabilities(ParticipantCapabilities capabilities) {
        this.capabilities = capabilities;
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
        if (getDeviceInfo() != null)
            sb.append("DeviceInfo: " + getDeviceInfo() + ",");
        if (getCapabilities() != null)
            sb.append("Capabilities: " + getCapabilities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceInfo() == null) ? 0 : getDeviceInfo().hashCode());
        hashCode = prime * hashCode
                + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Customer == false)
            return false;
        Customer other = (Customer) obj;

        if (other.getDeviceInfo() == null ^ this.getDeviceInfo() == null)
            return false;
        if (other.getDeviceInfo() != null
                && other.getDeviceInfo().equals(this.getDeviceInfo()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null
                && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        return true;
    }
}
