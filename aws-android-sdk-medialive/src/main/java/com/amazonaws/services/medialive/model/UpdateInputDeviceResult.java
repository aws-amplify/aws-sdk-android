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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Placeholder documentation for UpdateInputDeviceResponse
 */
public class UpdateInputDeviceResult implements Serializable {
    /**
     * The unique ARN of the input device.
     */
    private String arn;

    /**
     * The state of the connection between the input device and AWS.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISCONNECTED, CONNECTED
     */
    private String connectionState;

    /**
     * The status of the action to synchronize the device configuration. If you
     * change the configuration of the input device (for example, the maximum
     * bitrate), MediaLive sends the new data to the device. The device might
     * not update itself immediately. SYNCED means the device has updated its
     * configuration. SYNCING means that it has not updated its configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYNCED, SYNCING
     */
    private String deviceSettingsSyncState;

    /**
     * Settings that describe an input device that is type HD.
     */
    private InputDeviceHdSettings hdDeviceSettings;

    /**
     * The unique ID of the input device.
     */
    private String id;

    /**
     * The network MAC address of the input device.
     */
    private String macAddress;

    /**
     * A name that you specify for the input device.
     */
    private String name;

    /**
     * The network settings for the input device.
     */
    private InputDeviceNetworkSettings networkSettings;

    /**
     * The unique serial number of the input device.
     */
    private String serialNumber;

    /**
     * The type of the input device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HD
     */
    private String type;

    /**
     * The unique ARN of the input device.
     *
     * @return The unique ARN of the input device.
     */
    public String getArn() {
        return arn;
    }

    /**
     * The unique ARN of the input device.
     *
     * @param arn The unique ARN of the input device.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The unique ARN of the input device.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn The unique ARN of the input device.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateInputDeviceResult withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * The state of the connection between the input device and AWS.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISCONNECTED, CONNECTED
     *
     * @return The state of the connection between the input device and AWS.
     * @see InputDeviceConnectionState
     */
    public String getConnectionState() {
        return connectionState;
    }

    /**
     * The state of the connection between the input device and AWS.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISCONNECTED, CONNECTED
     *
     * @param connectionState The state of the connection between the input
     *            device and AWS.
     * @see InputDeviceConnectionState
     */
    public void setConnectionState(String connectionState) {
        this.connectionState = connectionState;
    }

    /**
     * The state of the connection between the input device and AWS.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISCONNECTED, CONNECTED
     *
     * @param connectionState The state of the connection between the input
     *            device and AWS.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputDeviceConnectionState
     */
    public UpdateInputDeviceResult withConnectionState(String connectionState) {
        this.connectionState = connectionState;
        return this;
    }

    /**
     * The state of the connection between the input device and AWS.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISCONNECTED, CONNECTED
     *
     * @param connectionState The state of the connection between the input
     *            device and AWS.
     * @see InputDeviceConnectionState
     */
    public void setConnectionState(InputDeviceConnectionState connectionState) {
        this.connectionState = connectionState.toString();
    }

    /**
     * The state of the connection between the input device and AWS.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISCONNECTED, CONNECTED
     *
     * @param connectionState The state of the connection between the input
     *            device and AWS.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputDeviceConnectionState
     */
    public UpdateInputDeviceResult withConnectionState(InputDeviceConnectionState connectionState) {
        this.connectionState = connectionState.toString();
        return this;
    }

    /**
     * The status of the action to synchronize the device configuration. If you
     * change the configuration of the input device (for example, the maximum
     * bitrate), MediaLive sends the new data to the device. The device might
     * not update itself immediately. SYNCED means the device has updated its
     * configuration. SYNCING means that it has not updated its configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYNCED, SYNCING
     *
     * @return The status of the action to synchronize the device configuration.
     *         If you change the configuration of the input device (for example,
     *         the maximum bitrate), MediaLive sends the new data to the device.
     *         The device might not update itself immediately. SYNCED means the
     *         device has updated its configuration. SYNCING means that it has
     *         not updated its configuration.
     * @see DeviceSettingsSyncState
     */
    public String getDeviceSettingsSyncState() {
        return deviceSettingsSyncState;
    }

    /**
     * The status of the action to synchronize the device configuration. If you
     * change the configuration of the input device (for example, the maximum
     * bitrate), MediaLive sends the new data to the device. The device might
     * not update itself immediately. SYNCED means the device has updated its
     * configuration. SYNCING means that it has not updated its configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYNCED, SYNCING
     *
     * @param deviceSettingsSyncState The status of the action to synchronize
     *            the device configuration. If you change the configuration of
     *            the input device (for example, the maximum bitrate), MediaLive
     *            sends the new data to the device. The device might not update
     *            itself immediately. SYNCED means the device has updated its
     *            configuration. SYNCING means that it has not updated its
     *            configuration.
     * @see DeviceSettingsSyncState
     */
    public void setDeviceSettingsSyncState(String deviceSettingsSyncState) {
        this.deviceSettingsSyncState = deviceSettingsSyncState;
    }

    /**
     * The status of the action to synchronize the device configuration. If you
     * change the configuration of the input device (for example, the maximum
     * bitrate), MediaLive sends the new data to the device. The device might
     * not update itself immediately. SYNCED means the device has updated its
     * configuration. SYNCING means that it has not updated its configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYNCED, SYNCING
     *
     * @param deviceSettingsSyncState The status of the action to synchronize
     *            the device configuration. If you change the configuration of
     *            the input device (for example, the maximum bitrate), MediaLive
     *            sends the new data to the device. The device might not update
     *            itself immediately. SYNCED means the device has updated its
     *            configuration. SYNCING means that it has not updated its
     *            configuration.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceSettingsSyncState
     */
    public UpdateInputDeviceResult withDeviceSettingsSyncState(String deviceSettingsSyncState) {
        this.deviceSettingsSyncState = deviceSettingsSyncState;
        return this;
    }

    /**
     * The status of the action to synchronize the device configuration. If you
     * change the configuration of the input device (for example, the maximum
     * bitrate), MediaLive sends the new data to the device. The device might
     * not update itself immediately. SYNCED means the device has updated its
     * configuration. SYNCING means that it has not updated its configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYNCED, SYNCING
     *
     * @param deviceSettingsSyncState The status of the action to synchronize
     *            the device configuration. If you change the configuration of
     *            the input device (for example, the maximum bitrate), MediaLive
     *            sends the new data to the device. The device might not update
     *            itself immediately. SYNCED means the device has updated its
     *            configuration. SYNCING means that it has not updated its
     *            configuration.
     * @see DeviceSettingsSyncState
     */
    public void setDeviceSettingsSyncState(DeviceSettingsSyncState deviceSettingsSyncState) {
        this.deviceSettingsSyncState = deviceSettingsSyncState.toString();
    }

    /**
     * The status of the action to synchronize the device configuration. If you
     * change the configuration of the input device (for example, the maximum
     * bitrate), MediaLive sends the new data to the device. The device might
     * not update itself immediately. SYNCED means the device has updated its
     * configuration. SYNCING means that it has not updated its configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYNCED, SYNCING
     *
     * @param deviceSettingsSyncState The status of the action to synchronize
     *            the device configuration. If you change the configuration of
     *            the input device (for example, the maximum bitrate), MediaLive
     *            sends the new data to the device. The device might not update
     *            itself immediately. SYNCED means the device has updated its
     *            configuration. SYNCING means that it has not updated its
     *            configuration.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceSettingsSyncState
     */
    public UpdateInputDeviceResult withDeviceSettingsSyncState(
            DeviceSettingsSyncState deviceSettingsSyncState) {
        this.deviceSettingsSyncState = deviceSettingsSyncState.toString();
        return this;
    }

    /**
     * Settings that describe an input device that is type HD.
     *
     * @return Settings that describe an input device that is type HD.
     */
    public InputDeviceHdSettings getHdDeviceSettings() {
        return hdDeviceSettings;
    }

    /**
     * Settings that describe an input device that is type HD.
     *
     * @param hdDeviceSettings Settings that describe an input device that is
     *            type HD.
     */
    public void setHdDeviceSettings(InputDeviceHdSettings hdDeviceSettings) {
        this.hdDeviceSettings = hdDeviceSettings;
    }

    /**
     * Settings that describe an input device that is type HD.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hdDeviceSettings Settings that describe an input device that is
     *            type HD.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateInputDeviceResult withHdDeviceSettings(InputDeviceHdSettings hdDeviceSettings) {
        this.hdDeviceSettings = hdDeviceSettings;
        return this;
    }

    /**
     * The unique ID of the input device.
     *
     * @return The unique ID of the input device.
     */
    public String getId() {
        return id;
    }

    /**
     * The unique ID of the input device.
     *
     * @param id The unique ID of the input device.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique ID of the input device.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id The unique ID of the input device.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateInputDeviceResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The network MAC address of the input device.
     *
     * @return The network MAC address of the input device.
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * The network MAC address of the input device.
     *
     * @param macAddress The network MAC address of the input device.
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * The network MAC address of the input device.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param macAddress The network MAC address of the input device.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateInputDeviceResult withMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    /**
     * A name that you specify for the input device.
     *
     * @return A name that you specify for the input device.
     */
    public String getName() {
        return name;
    }

    /**
     * A name that you specify for the input device.
     *
     * @param name A name that you specify for the input device.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A name that you specify for the input device.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name A name that you specify for the input device.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateInputDeviceResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The network settings for the input device.
     *
     * @return The network settings for the input device.
     */
    public InputDeviceNetworkSettings getNetworkSettings() {
        return networkSettings;
    }

    /**
     * The network settings for the input device.
     *
     * @param networkSettings The network settings for the input device.
     */
    public void setNetworkSettings(InputDeviceNetworkSettings networkSettings) {
        this.networkSettings = networkSettings;
    }

    /**
     * The network settings for the input device.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkSettings The network settings for the input device.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateInputDeviceResult withNetworkSettings(InputDeviceNetworkSettings networkSettings) {
        this.networkSettings = networkSettings;
        return this;
    }

    /**
     * The unique serial number of the input device.
     *
     * @return The unique serial number of the input device.
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * The unique serial number of the input device.
     *
     * @param serialNumber The unique serial number of the input device.
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * The unique serial number of the input device.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serialNumber The unique serial number of the input device.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateInputDeviceResult withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * The type of the input device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HD
     *
     * @return The type of the input device.
     * @see InputDeviceType
     */
    public String getType() {
        return type;
    }

    /**
     * The type of the input device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HD
     *
     * @param type The type of the input device.
     * @see InputDeviceType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The type of the input device.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HD
     *
     * @param type The type of the input device.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputDeviceType
     */
    public UpdateInputDeviceResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The type of the input device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HD
     *
     * @param type The type of the input device.
     * @see InputDeviceType
     */
    public void setType(InputDeviceType type) {
        this.type = type.toString();
    }

    /**
     * The type of the input device.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HD
     *
     * @param type The type of the input device.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputDeviceType
     */
    public UpdateInputDeviceResult withType(InputDeviceType type) {
        this.type = type.toString();
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getConnectionState() != null)
            sb.append("ConnectionState: " + getConnectionState() + ",");
        if (getDeviceSettingsSyncState() != null)
            sb.append("DeviceSettingsSyncState: " + getDeviceSettingsSyncState() + ",");
        if (getHdDeviceSettings() != null)
            sb.append("HdDeviceSettings: " + getHdDeviceSettings() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getMacAddress() != null)
            sb.append("MacAddress: " + getMacAddress() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getNetworkSettings() != null)
            sb.append("NetworkSettings: " + getNetworkSettings() + ",");
        if (getSerialNumber() != null)
            sb.append("SerialNumber: " + getSerialNumber() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionState() == null) ? 0 : getConnectionState().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeviceSettingsSyncState() == null) ? 0 : getDeviceSettingsSyncState()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getHdDeviceSettings() == null) ? 0 : getHdDeviceSettings().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMacAddress() == null) ? 0 : getMacAddress().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkSettings() == null) ? 0 : getNetworkSettings().hashCode());
        hashCode = prime * hashCode
                + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateInputDeviceResult == false)
            return false;
        UpdateInputDeviceResult other = (UpdateInputDeviceResult) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getConnectionState() == null ^ this.getConnectionState() == null)
            return false;
        if (other.getConnectionState() != null
                && other.getConnectionState().equals(this.getConnectionState()) == false)
            return false;
        if (other.getDeviceSettingsSyncState() == null ^ this.getDeviceSettingsSyncState() == null)
            return false;
        if (other.getDeviceSettingsSyncState() != null
                && other.getDeviceSettingsSyncState().equals(this.getDeviceSettingsSyncState()) == false)
            return false;
        if (other.getHdDeviceSettings() == null ^ this.getHdDeviceSettings() == null)
            return false;
        if (other.getHdDeviceSettings() != null
                && other.getHdDeviceSettings().equals(this.getHdDeviceSettings()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMacAddress() == null ^ this.getMacAddress() == null)
            return false;
        if (other.getMacAddress() != null
                && other.getMacAddress().equals(this.getMacAddress()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNetworkSettings() == null ^ this.getNetworkSettings() == null)
            return false;
        if (other.getNetworkSettings() != null
                && other.getNetworkSettings().equals(this.getNetworkSettings()) == false)
            return false;
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null
                && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
