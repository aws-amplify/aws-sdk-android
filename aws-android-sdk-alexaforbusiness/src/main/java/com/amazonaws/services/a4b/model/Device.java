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
 * A device with attributes.
 * </p>
 */
public class Device implements Serializable {
    /**
     * <p>
     * The ARN of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String deviceArn;

    /**
     * <p>
     * The serial number of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9]{1,200}<br/>
     */
    private String deviceSerialNumber;

    /**
     * <p>
     * The type of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9]{1,200}<br/>
     */
    private String deviceType;

    /**
     * <p>
     * The name of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     */
    private String deviceName;

    /**
     * <p>
     * The software version of a device.
     * </p>
     */
    private String softwareVersion;

    /**
     * <p>
     * The MAC address of a device.
     * </p>
     */
    private String macAddress;

    /**
     * <p>
     * The room ARN of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String roomArn;

    /**
     * <p>
     * The status of a device. If the status is not READY, check the
     * DeviceStatusInfo value for details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, PENDING, WAS_OFFLINE, DEREGISTERED, FAILED
     */
    private String deviceStatus;

    /**
     * <p>
     * Detailed information about a device's status.
     * </p>
     */
    private DeviceStatusInfo deviceStatusInfo;

    /**
     * <p>
     * Detailed information about a device's network profile.
     * </p>
     */
    private DeviceNetworkProfileInfo networkProfileInfo;

    /**
     * <p>
     * The ARN of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of a device.
     *         </p>
     */
    public String getDeviceArn() {
        return deviceArn;
    }

    /**
     * <p>
     * The ARN of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param deviceArn <p>
     *            The ARN of a device.
     *            </p>
     */
    public void setDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
    }

    /**
     * <p>
     * The ARN of a device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param deviceArn <p>
     *            The ARN of a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Device withDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
        return this;
    }

    /**
     * <p>
     * The serial number of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9]{1,200}<br/>
     *
     * @return <p>
     *         The serial number of a device.
     *         </p>
     */
    public String getDeviceSerialNumber() {
        return deviceSerialNumber;
    }

    /**
     * <p>
     * The serial number of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9]{1,200}<br/>
     *
     * @param deviceSerialNumber <p>
     *            The serial number of a device.
     *            </p>
     */
    public void setDeviceSerialNumber(String deviceSerialNumber) {
        this.deviceSerialNumber = deviceSerialNumber;
    }

    /**
     * <p>
     * The serial number of a device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9]{1,200}<br/>
     *
     * @param deviceSerialNumber <p>
     *            The serial number of a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Device withDeviceSerialNumber(String deviceSerialNumber) {
        this.deviceSerialNumber = deviceSerialNumber;
        return this;
    }

    /**
     * <p>
     * The type of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9]{1,200}<br/>
     *
     * @return <p>
     *         The type of a device.
     *         </p>
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * <p>
     * The type of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9]{1,200}<br/>
     *
     * @param deviceType <p>
     *            The type of a device.
     *            </p>
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * <p>
     * The type of a device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9]{1,200}<br/>
     *
     * @param deviceType <p>
     *            The type of a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Device withDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * <p>
     * The name of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @return <p>
     *         The name of a device.
     *         </p>
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * <p>
     * The name of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param deviceName <p>
     *            The name of a device.
     *            </p>
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The name of a device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param deviceName <p>
     *            The name of a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Device withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * <p>
     * The software version of a device.
     * </p>
     *
     * @return <p>
     *         The software version of a device.
     *         </p>
     */
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    /**
     * <p>
     * The software version of a device.
     * </p>
     *
     * @param softwareVersion <p>
     *            The software version of a device.
     *            </p>
     */
    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    /**
     * <p>
     * The software version of a device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param softwareVersion <p>
     *            The software version of a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Device withSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
        return this;
    }

    /**
     * <p>
     * The MAC address of a device.
     * </p>
     *
     * @return <p>
     *         The MAC address of a device.
     *         </p>
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * <p>
     * The MAC address of a device.
     * </p>
     *
     * @param macAddress <p>
     *            The MAC address of a device.
     *            </p>
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * <p>
     * The MAC address of a device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param macAddress <p>
     *            The MAC address of a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Device withMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    /**
     * <p>
     * The room ARN of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The room ARN of a device.
     *         </p>
     */
    public String getRoomArn() {
        return roomArn;
    }

    /**
     * <p>
     * The room ARN of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roomArn <p>
     *            The room ARN of a device.
     *            </p>
     */
    public void setRoomArn(String roomArn) {
        this.roomArn = roomArn;
    }

    /**
     * <p>
     * The room ARN of a device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roomArn <p>
     *            The room ARN of a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Device withRoomArn(String roomArn) {
        this.roomArn = roomArn;
        return this;
    }

    /**
     * <p>
     * The status of a device. If the status is not READY, check the
     * DeviceStatusInfo value for details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, PENDING, WAS_OFFLINE, DEREGISTERED, FAILED
     *
     * @return <p>
     *         The status of a device. If the status is not READY, check the
     *         DeviceStatusInfo value for details.
     *         </p>
     * @see DeviceStatus
     */
    public String getDeviceStatus() {
        return deviceStatus;
    }

    /**
     * <p>
     * The status of a device. If the status is not READY, check the
     * DeviceStatusInfo value for details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, PENDING, WAS_OFFLINE, DEREGISTERED, FAILED
     *
     * @param deviceStatus <p>
     *            The status of a device. If the status is not READY, check the
     *            DeviceStatusInfo value for details.
     *            </p>
     * @see DeviceStatus
     */
    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    /**
     * <p>
     * The status of a device. If the status is not READY, check the
     * DeviceStatusInfo value for details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, PENDING, WAS_OFFLINE, DEREGISTERED, FAILED
     *
     * @param deviceStatus <p>
     *            The status of a device. If the status is not READY, check the
     *            DeviceStatusInfo value for details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceStatus
     */
    public Device withDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
        return this;
    }

    /**
     * <p>
     * The status of a device. If the status is not READY, check the
     * DeviceStatusInfo value for details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, PENDING, WAS_OFFLINE, DEREGISTERED, FAILED
     *
     * @param deviceStatus <p>
     *            The status of a device. If the status is not READY, check the
     *            DeviceStatusInfo value for details.
     *            </p>
     * @see DeviceStatus
     */
    public void setDeviceStatus(DeviceStatus deviceStatus) {
        this.deviceStatus = deviceStatus.toString();
    }

    /**
     * <p>
     * The status of a device. If the status is not READY, check the
     * DeviceStatusInfo value for details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, PENDING, WAS_OFFLINE, DEREGISTERED, FAILED
     *
     * @param deviceStatus <p>
     *            The status of a device. If the status is not READY, check the
     *            DeviceStatusInfo value for details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceStatus
     */
    public Device withDeviceStatus(DeviceStatus deviceStatus) {
        this.deviceStatus = deviceStatus.toString();
        return this;
    }

    /**
     * <p>
     * Detailed information about a device's status.
     * </p>
     *
     * @return <p>
     *         Detailed information about a device's status.
     *         </p>
     */
    public DeviceStatusInfo getDeviceStatusInfo() {
        return deviceStatusInfo;
    }

    /**
     * <p>
     * Detailed information about a device's status.
     * </p>
     *
     * @param deviceStatusInfo <p>
     *            Detailed information about a device's status.
     *            </p>
     */
    public void setDeviceStatusInfo(DeviceStatusInfo deviceStatusInfo) {
        this.deviceStatusInfo = deviceStatusInfo;
    }

    /**
     * <p>
     * Detailed information about a device's status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceStatusInfo <p>
     *            Detailed information about a device's status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Device withDeviceStatusInfo(DeviceStatusInfo deviceStatusInfo) {
        this.deviceStatusInfo = deviceStatusInfo;
        return this;
    }

    /**
     * <p>
     * Detailed information about a device's network profile.
     * </p>
     *
     * @return <p>
     *         Detailed information about a device's network profile.
     *         </p>
     */
    public DeviceNetworkProfileInfo getNetworkProfileInfo() {
        return networkProfileInfo;
    }

    /**
     * <p>
     * Detailed information about a device's network profile.
     * </p>
     *
     * @param networkProfileInfo <p>
     *            Detailed information about a device's network profile.
     *            </p>
     */
    public void setNetworkProfileInfo(DeviceNetworkProfileInfo networkProfileInfo) {
        this.networkProfileInfo = networkProfileInfo;
    }

    /**
     * <p>
     * Detailed information about a device's network profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkProfileInfo <p>
     *            Detailed information about a device's network profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Device withNetworkProfileInfo(DeviceNetworkProfileInfo networkProfileInfo) {
        this.networkProfileInfo = networkProfileInfo;
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
        if (getDeviceArn() != null)
            sb.append("DeviceArn: " + getDeviceArn() + ",");
        if (getDeviceSerialNumber() != null)
            sb.append("DeviceSerialNumber: " + getDeviceSerialNumber() + ",");
        if (getDeviceType() != null)
            sb.append("DeviceType: " + getDeviceType() + ",");
        if (getDeviceName() != null)
            sb.append("DeviceName: " + getDeviceName() + ",");
        if (getSoftwareVersion() != null)
            sb.append("SoftwareVersion: " + getSoftwareVersion() + ",");
        if (getMacAddress() != null)
            sb.append("MacAddress: " + getMacAddress() + ",");
        if (getRoomArn() != null)
            sb.append("RoomArn: " + getRoomArn() + ",");
        if (getDeviceStatus() != null)
            sb.append("DeviceStatus: " + getDeviceStatus() + ",");
        if (getDeviceStatusInfo() != null)
            sb.append("DeviceStatusInfo: " + getDeviceStatusInfo() + ",");
        if (getNetworkProfileInfo() != null)
            sb.append("NetworkProfileInfo: " + getNetworkProfileInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceArn() == null) ? 0 : getDeviceArn().hashCode());
        hashCode = prime * hashCode
                + ((getDeviceSerialNumber() == null) ? 0 : getDeviceSerialNumber().hashCode());
        hashCode = prime * hashCode + ((getDeviceType() == null) ? 0 : getDeviceType().hashCode());
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode
                + ((getSoftwareVersion() == null) ? 0 : getSoftwareVersion().hashCode());
        hashCode = prime * hashCode + ((getMacAddress() == null) ? 0 : getMacAddress().hashCode());
        hashCode = prime * hashCode + ((getRoomArn() == null) ? 0 : getRoomArn().hashCode());
        hashCode = prime * hashCode
                + ((getDeviceStatus() == null) ? 0 : getDeviceStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDeviceStatusInfo() == null) ? 0 : getDeviceStatusInfo().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkProfileInfo() == null) ? 0 : getNetworkProfileInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Device == false)
            return false;
        Device other = (Device) obj;

        if (other.getDeviceArn() == null ^ this.getDeviceArn() == null)
            return false;
        if (other.getDeviceArn() != null
                && other.getDeviceArn().equals(this.getDeviceArn()) == false)
            return false;
        if (other.getDeviceSerialNumber() == null ^ this.getDeviceSerialNumber() == null)
            return false;
        if (other.getDeviceSerialNumber() != null
                && other.getDeviceSerialNumber().equals(this.getDeviceSerialNumber()) == false)
            return false;
        if (other.getDeviceType() == null ^ this.getDeviceType() == null)
            return false;
        if (other.getDeviceType() != null
                && other.getDeviceType().equals(this.getDeviceType()) == false)
            return false;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null
                && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getSoftwareVersion() == null ^ this.getSoftwareVersion() == null)
            return false;
        if (other.getSoftwareVersion() != null
                && other.getSoftwareVersion().equals(this.getSoftwareVersion()) == false)
            return false;
        if (other.getMacAddress() == null ^ this.getMacAddress() == null)
            return false;
        if (other.getMacAddress() != null
                && other.getMacAddress().equals(this.getMacAddress()) == false)
            return false;
        if (other.getRoomArn() == null ^ this.getRoomArn() == null)
            return false;
        if (other.getRoomArn() != null && other.getRoomArn().equals(this.getRoomArn()) == false)
            return false;
        if (other.getDeviceStatus() == null ^ this.getDeviceStatus() == null)
            return false;
        if (other.getDeviceStatus() != null
                && other.getDeviceStatus().equals(this.getDeviceStatus()) == false)
            return false;
        if (other.getDeviceStatusInfo() == null ^ this.getDeviceStatusInfo() == null)
            return false;
        if (other.getDeviceStatusInfo() != null
                && other.getDeviceStatusInfo().equals(this.getDeviceStatusInfo()) == false)
            return false;
        if (other.getNetworkProfileInfo() == null ^ this.getNetworkProfileInfo() == null)
            return false;
        if (other.getNetworkProfileInfo() != null
                && other.getNetworkProfileInfo().equals(this.getNetworkProfileInfo()) == false)
            return false;
        return true;
    }
}
