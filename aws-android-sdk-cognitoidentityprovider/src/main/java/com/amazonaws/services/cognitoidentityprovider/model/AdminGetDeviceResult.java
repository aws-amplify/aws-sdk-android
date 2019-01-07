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
 * Gets the device response, as an administrator.
 * </p>
 */
public class AdminGetDeviceResult implements Serializable {
    /**
     * <p>
     * The device.
     * </p>
     */
    private DeviceType device;

    /**
     * <p>
     * The device.
     * </p>
     *
     * @return <p>
     *         The device.
     *         </p>
     */
    public DeviceType getDevice() {
        return device;
    }

    /**
     * <p>
     * The device.
     * </p>
     *
     * @param device <p>
     *            The device.
     *            </p>
     */
    public void setDevice(DeviceType device) {
        this.device = device;
    }

    /**
     * <p>
     * The device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param device <p>
     *            The device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminGetDeviceResult withDevice(DeviceType device) {
        this.device = device;
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
        if (getDevice() != null)
            sb.append("Device: " + getDevice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevice() == null) ? 0 : getDevice().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminGetDeviceResult == false)
            return false;
        AdminGetDeviceResult other = (AdminGetDeviceResult) obj;

        if (other.getDevice() == null ^ this.getDevice() == null)
            return false;
        if (other.getDevice() != null && other.getDevice().equals(this.getDevice()) == false)
            return false;
        return true;
    }
}
