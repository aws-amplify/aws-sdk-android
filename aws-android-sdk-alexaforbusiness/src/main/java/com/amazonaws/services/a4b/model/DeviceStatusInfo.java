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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

/**
 * <p>
 * Detailed information about a device's status.
 * </p>
 */
public class DeviceStatusInfo implements Serializable {
    /**
     * <p>
     * One or more device status detail descriptions.
     * </p>
     */
    private java.util.List<DeviceStatusDetail> deviceStatusDetails;

    /**
     * <p>
     * The latest available information about the connection status of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLINE, OFFLINE
     */
    private String connectionStatus;

    /**
     * <p>
     * The time (in epoch) when the device connection status changed.
     * </p>
     */
    private java.util.Date connectionStatusUpdatedTime;

    /**
     * <p>
     * One or more device status detail descriptions.
     * </p>
     *
     * @return <p>
     *         One or more device status detail descriptions.
     *         </p>
     */
    public java.util.List<DeviceStatusDetail> getDeviceStatusDetails() {
        return deviceStatusDetails;
    }

    /**
     * <p>
     * One or more device status detail descriptions.
     * </p>
     *
     * @param deviceStatusDetails <p>
     *            One or more device status detail descriptions.
     *            </p>
     */
    public void setDeviceStatusDetails(java.util.Collection<DeviceStatusDetail> deviceStatusDetails) {
        if (deviceStatusDetails == null) {
            this.deviceStatusDetails = null;
            return;
        }

        this.deviceStatusDetails = new java.util.ArrayList<DeviceStatusDetail>(deviceStatusDetails);
    }

    /**
     * <p>
     * One or more device status detail descriptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceStatusDetails <p>
     *            One or more device status detail descriptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceStatusInfo withDeviceStatusDetails(DeviceStatusDetail... deviceStatusDetails) {
        if (getDeviceStatusDetails() == null) {
            this.deviceStatusDetails = new java.util.ArrayList<DeviceStatusDetail>(
                    deviceStatusDetails.length);
        }
        for (DeviceStatusDetail value : deviceStatusDetails) {
            this.deviceStatusDetails.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more device status detail descriptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceStatusDetails <p>
     *            One or more device status detail descriptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceStatusInfo withDeviceStatusDetails(
            java.util.Collection<DeviceStatusDetail> deviceStatusDetails) {
        setDeviceStatusDetails(deviceStatusDetails);
        return this;
    }

    /**
     * <p>
     * The latest available information about the connection status of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLINE, OFFLINE
     *
     * @return <p>
     *         The latest available information about the connection status of a
     *         device.
     *         </p>
     * @see ConnectionStatus
     */
    public String getConnectionStatus() {
        return connectionStatus;
    }

    /**
     * <p>
     * The latest available information about the connection status of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLINE, OFFLINE
     *
     * @param connectionStatus <p>
     *            The latest available information about the connection status
     *            of a device.
     *            </p>
     * @see ConnectionStatus
     */
    public void setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    /**
     * <p>
     * The latest available information about the connection status of a device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLINE, OFFLINE
     *
     * @param connectionStatus <p>
     *            The latest available information about the connection status
     *            of a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConnectionStatus
     */
    public DeviceStatusInfo withConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
        return this;
    }

    /**
     * <p>
     * The latest available information about the connection status of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLINE, OFFLINE
     *
     * @param connectionStatus <p>
     *            The latest available information about the connection status
     *            of a device.
     *            </p>
     * @see ConnectionStatus
     */
    public void setConnectionStatus(ConnectionStatus connectionStatus) {
        this.connectionStatus = connectionStatus.toString();
    }

    /**
     * <p>
     * The latest available information about the connection status of a device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLINE, OFFLINE
     *
     * @param connectionStatus <p>
     *            The latest available information about the connection status
     *            of a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConnectionStatus
     */
    public DeviceStatusInfo withConnectionStatus(ConnectionStatus connectionStatus) {
        this.connectionStatus = connectionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time (in epoch) when the device connection status changed.
     * </p>
     *
     * @return <p>
     *         The time (in epoch) when the device connection status changed.
     *         </p>
     */
    public java.util.Date getConnectionStatusUpdatedTime() {
        return connectionStatusUpdatedTime;
    }

    /**
     * <p>
     * The time (in epoch) when the device connection status changed.
     * </p>
     *
     * @param connectionStatusUpdatedTime <p>
     *            The time (in epoch) when the device connection status changed.
     *            </p>
     */
    public void setConnectionStatusUpdatedTime(java.util.Date connectionStatusUpdatedTime) {
        this.connectionStatusUpdatedTime = connectionStatusUpdatedTime;
    }

    /**
     * <p>
     * The time (in epoch) when the device connection status changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionStatusUpdatedTime <p>
     *            The time (in epoch) when the device connection status changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceStatusInfo withConnectionStatusUpdatedTime(
            java.util.Date connectionStatusUpdatedTime) {
        this.connectionStatusUpdatedTime = connectionStatusUpdatedTime;
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
        if (getDeviceStatusDetails() != null)
            sb.append("DeviceStatusDetails: " + getDeviceStatusDetails() + ",");
        if (getConnectionStatus() != null)
            sb.append("ConnectionStatus: " + getConnectionStatus() + ",");
        if (getConnectionStatusUpdatedTime() != null)
            sb.append("ConnectionStatusUpdatedTime: " + getConnectionStatusUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeviceStatusDetails() == null) ? 0 : getDeviceStatusDetails().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionStatus() == null) ? 0 : getConnectionStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getConnectionStatusUpdatedTime() == null) ? 0
                        : getConnectionStatusUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceStatusInfo == false)
            return false;
        DeviceStatusInfo other = (DeviceStatusInfo) obj;

        if (other.getDeviceStatusDetails() == null ^ this.getDeviceStatusDetails() == null)
            return false;
        if (other.getDeviceStatusDetails() != null
                && other.getDeviceStatusDetails().equals(this.getDeviceStatusDetails()) == false)
            return false;
        if (other.getConnectionStatus() == null ^ this.getConnectionStatus() == null)
            return false;
        if (other.getConnectionStatus() != null
                && other.getConnectionStatus().equals(this.getConnectionStatus()) == false)
            return false;
        if (other.getConnectionStatusUpdatedTime() == null
                ^ this.getConnectionStatusUpdatedTime() == null)
            return false;
        if (other.getConnectionStatusUpdatedTime() != null
                && other.getConnectionStatusUpdatedTime().equals(
                        this.getConnectionStatusUpdatedTime()) == false)
            return false;
        return true;
    }
}
