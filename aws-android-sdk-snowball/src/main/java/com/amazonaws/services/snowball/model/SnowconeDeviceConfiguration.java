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

package com.amazonaws.services.snowball.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the device configuration for an AWS Snowcone job.
 * </p>
 */
public class SnowconeDeviceConfiguration implements Serializable {
    /**
     * <p>
     * Configures the wireless connection for the AWS Snowcone device.
     * </p>
     */
    private WirelessConnection wirelessConnection;

    /**
     * <p>
     * Configures the wireless connection for the AWS Snowcone device.
     * </p>
     *
     * @return <p>
     *         Configures the wireless connection for the AWS Snowcone device.
     *         </p>
     */
    public WirelessConnection getWirelessConnection() {
        return wirelessConnection;
    }

    /**
     * <p>
     * Configures the wireless connection for the AWS Snowcone device.
     * </p>
     *
     * @param wirelessConnection <p>
     *            Configures the wireless connection for the AWS Snowcone
     *            device.
     *            </p>
     */
    public void setWirelessConnection(WirelessConnection wirelessConnection) {
        this.wirelessConnection = wirelessConnection;
    }

    /**
     * <p>
     * Configures the wireless connection for the AWS Snowcone device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param wirelessConnection <p>
     *            Configures the wireless connection for the AWS Snowcone
     *            device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnowconeDeviceConfiguration withWirelessConnection(WirelessConnection wirelessConnection) {
        this.wirelessConnection = wirelessConnection;
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
        if (getWirelessConnection() != null)
            sb.append("WirelessConnection: " + getWirelessConnection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getWirelessConnection() == null) ? 0 : getWirelessConnection().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnowconeDeviceConfiguration == false)
            return false;
        SnowconeDeviceConfiguration other = (SnowconeDeviceConfiguration) obj;

        if (other.getWirelessConnection() == null ^ this.getWirelessConnection() == null)
            return false;
        if (other.getWirelessConnection() != null
                && other.getWirelessConnection().equals(this.getWirelessConnection()) == false)
            return false;
        return true;
    }
}
