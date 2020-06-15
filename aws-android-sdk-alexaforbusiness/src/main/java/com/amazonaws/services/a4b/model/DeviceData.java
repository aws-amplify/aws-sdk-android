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
 * Device attributes.
 * </p>
 */
public class DeviceData implements Serializable {
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
     * The status of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, PENDING, WAS_OFFLINE, DEREGISTERED, FAILED
     */
    private String deviceStatus;

    /**
     * <p>
     * The ARN of the network profile associated with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String networkProfileArn;

    /**
     * <p>
     * The name of the network profile associated with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     */
    private String networkProfileName;

    /**
     * <p>
     * The room ARN associated with a device.
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
     * The name of the room associated with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     */
    private String roomName;

    /**
     * <p>
     * Detailed information about a device's status.
     * </p>
     */
    private DeviceStatusInfo deviceStatusInfo;

    /**
     * <p>
     * The time (in epoch) when the device data was created.
     * </p>
     */
    private java.util.Date createdTime;

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
    public DeviceData withDeviceArn(String deviceArn) {
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
    public DeviceData withDeviceSerialNumber(String deviceSerialNumber) {
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
    public DeviceData withDeviceType(String deviceType) {
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
    public DeviceData withDeviceName(String deviceName) {
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
    public DeviceData withSoftwareVersion(String softwareVersion) {
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
    public DeviceData withMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    /**
     * <p>
     * The status of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, PENDING, WAS_OFFLINE, DEREGISTERED, FAILED
     *
     * @return <p>
     *         The status of a device.
     *         </p>
     * @see DeviceStatus
     */
    public String getDeviceStatus() {
        return deviceStatus;
    }

    /**
     * <p>
     * The status of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, PENDING, WAS_OFFLINE, DEREGISTERED, FAILED
     *
     * @param deviceStatus <p>
     *            The status of a device.
     *            </p>
     * @see DeviceStatus
     */
    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    /**
     * <p>
     * The status of a device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, PENDING, WAS_OFFLINE, DEREGISTERED, FAILED
     *
     * @param deviceStatus <p>
     *            The status of a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceStatus
     */
    public DeviceData withDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
        return this;
    }

    /**
     * <p>
     * The status of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, PENDING, WAS_OFFLINE, DEREGISTERED, FAILED
     *
     * @param deviceStatus <p>
     *            The status of a device.
     *            </p>
     * @see DeviceStatus
     */
    public void setDeviceStatus(DeviceStatus deviceStatus) {
        this.deviceStatus = deviceStatus.toString();
    }

    /**
     * <p>
     * The status of a device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, PENDING, WAS_OFFLINE, DEREGISTERED, FAILED
     *
     * @param deviceStatus <p>
     *            The status of a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceStatus
     */
    public DeviceData withDeviceStatus(DeviceStatus deviceStatus) {
        this.deviceStatus = deviceStatus.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the network profile associated with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the network profile associated with a device.
     *         </p>
     */
    public String getNetworkProfileArn() {
        return networkProfileArn;
    }

    /**
     * <p>
     * The ARN of the network profile associated with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param networkProfileArn <p>
     *            The ARN of the network profile associated with a device.
     *            </p>
     */
    public void setNetworkProfileArn(String networkProfileArn) {
        this.networkProfileArn = networkProfileArn;
    }

    /**
     * <p>
     * The ARN of the network profile associated with a device.
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
     * @param networkProfileArn <p>
     *            The ARN of the network profile associated with a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceData withNetworkProfileArn(String networkProfileArn) {
        this.networkProfileArn = networkProfileArn;
        return this;
    }

    /**
     * <p>
     * The name of the network profile associated with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @return <p>
     *         The name of the network profile associated with a device.
     *         </p>
     */
    public String getNetworkProfileName() {
        return networkProfileName;
    }

    /**
     * <p>
     * The name of the network profile associated with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param networkProfileName <p>
     *            The name of the network profile associated with a device.
     *            </p>
     */
    public void setNetworkProfileName(String networkProfileName) {
        this.networkProfileName = networkProfileName;
    }

    /**
     * <p>
     * The name of the network profile associated with a device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param networkProfileName <p>
     *            The name of the network profile associated with a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceData withNetworkProfileName(String networkProfileName) {
        this.networkProfileName = networkProfileName;
        return this;
    }

    /**
     * <p>
     * The room ARN associated with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The room ARN associated with a device.
     *         </p>
     */
    public String getRoomArn() {
        return roomArn;
    }

    /**
     * <p>
     * The room ARN associated with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roomArn <p>
     *            The room ARN associated with a device.
     *            </p>
     */
    public void setRoomArn(String roomArn) {
        this.roomArn = roomArn;
    }

    /**
     * <p>
     * The room ARN associated with a device.
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
     *            The room ARN associated with a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceData withRoomArn(String roomArn) {
        this.roomArn = roomArn;
        return this;
    }

    /**
     * <p>
     * The name of the room associated with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @return <p>
     *         The name of the room associated with a device.
     *         </p>
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * <p>
     * The name of the room associated with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param roomName <p>
     *            The name of the room associated with a device.
     *            </p>
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * <p>
     * The name of the room associated with a device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param roomName <p>
     *            The name of the room associated with a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceData withRoomName(String roomName) {
        this.roomName = roomName;
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
    public DeviceData withDeviceStatusInfo(DeviceStatusInfo deviceStatusInfo) {
        this.deviceStatusInfo = deviceStatusInfo;
        return this;
    }

    /**
     * <p>
     * The time (in epoch) when the device data was created.
     * </p>
     *
     * @return <p>
     *         The time (in epoch) when the device data was created.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The time (in epoch) when the device data was created.
     * </p>
     *
     * @param createdTime <p>
     *            The time (in epoch) when the device data was created.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time (in epoch) when the device data was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The time (in epoch) when the device data was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceData withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
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
        if (getDeviceStatus() != null)
            sb.append("DeviceStatus: " + getDeviceStatus() + ",");
        if (getNetworkProfileArn() != null)
            sb.append("NetworkProfileArn: " + getNetworkProfileArn() + ",");
        if (getNetworkProfileName() != null)
            sb.append("NetworkProfileName: " + getNetworkProfileName() + ",");
        if (getRoomArn() != null)
            sb.append("RoomArn: " + getRoomArn() + ",");
        if (getRoomName() != null)
            sb.append("RoomName: " + getRoomName() + ",");
        if (getDeviceStatusInfo() != null)
            sb.append("DeviceStatusInfo: " + getDeviceStatusInfo() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime());
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
        hashCode = prime * hashCode
                + ((getDeviceStatus() == null) ? 0 : getDeviceStatus().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkProfileArn() == null) ? 0 : getNetworkProfileArn().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkProfileName() == null) ? 0 : getNetworkProfileName().hashCode());
        hashCode = prime * hashCode + ((getRoomArn() == null) ? 0 : getRoomArn().hashCode());
        hashCode = prime * hashCode + ((getRoomName() == null) ? 0 : getRoomName().hashCode());
        hashCode = prime * hashCode
                + ((getDeviceStatusInfo() == null) ? 0 : getDeviceStatusInfo().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceData == false)
            return false;
        DeviceData other = (DeviceData) obj;

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
        if (other.getDeviceStatus() == null ^ this.getDeviceStatus() == null)
            return false;
        if (other.getDeviceStatus() != null
                && other.getDeviceStatus().equals(this.getDeviceStatus()) == false)
            return false;
        if (other.getNetworkProfileArn() == null ^ this.getNetworkProfileArn() == null)
            return false;
        if (other.getNetworkProfileArn() != null
                && other.getNetworkProfileArn().equals(this.getNetworkProfileArn()) == false)
            return false;
        if (other.getNetworkProfileName() == null ^ this.getNetworkProfileName() == null)
            return false;
        if (other.getNetworkProfileName() != null
                && other.getNetworkProfileName().equals(this.getNetworkProfileName()) == false)
            return false;
        if (other.getRoomArn() == null ^ this.getRoomArn() == null)
            return false;
        if (other.getRoomArn() != null && other.getRoomArn().equals(this.getRoomArn()) == false)
            return false;
        if (other.getRoomName() == null ^ this.getRoomName() == null)
            return false;
        if (other.getRoomName() != null && other.getRoomName().equals(this.getRoomName()) == false)
            return false;
        if (other.getDeviceStatusInfo() == null ^ this.getDeviceStatusInfo() == null)
            return false;
        if (other.getDeviceStatusInfo() != null
                && other.getDeviceStatusInfo().equals(this.getDeviceStatusInfo()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }
}
