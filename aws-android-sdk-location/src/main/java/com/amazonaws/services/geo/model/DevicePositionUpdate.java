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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the position update details for a device.
 * </p>
 */
public class DevicePositionUpdate implements Serializable {
    /**
     * <p>
     * The accuracy of the device position.
     * </p>
     */
    private PositionalAccuracy accuracy;

    /**
     * <p>
     * The device associated to the position update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\p{L}\p{N}]+$<br/>
     */
    private String deviceId;

    /**
     * <p>
     * The latest device position defined in <a
     * href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a>
     * format: <code>[X or longitude, Y or latitude]</code>.
     * </p>
     */
    private java.util.List<Double> position;

    /**
     * <p>
     * Associates one of more properties with the position update. A property is
     * a key-value pair stored with the position update and added to any
     * geofence event the update may trigger.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     */
    private java.util.Map<String, String> positionProperties;

    /**
     * <p>
     * The timestamp at which the device's position was determined. Uses <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     */
    private java.util.Date sampleTime;

    /**
     * <p>
     * The accuracy of the device position.
     * </p>
     *
     * @return <p>
     *         The accuracy of the device position.
     *         </p>
     */
    public PositionalAccuracy getAccuracy() {
        return accuracy;
    }

    /**
     * <p>
     * The accuracy of the device position.
     * </p>
     *
     * @param accuracy <p>
     *            The accuracy of the device position.
     *            </p>
     */
    public void setAccuracy(PositionalAccuracy accuracy) {
        this.accuracy = accuracy;
    }

    /**
     * <p>
     * The accuracy of the device position.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accuracy <p>
     *            The accuracy of the device position.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevicePositionUpdate withAccuracy(PositionalAccuracy accuracy) {
        this.accuracy = accuracy;
        return this;
    }

    /**
     * <p>
     * The device associated to the position update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\p{L}\p{N}]+$<br/>
     *
     * @return <p>
     *         The device associated to the position update.
     *         </p>
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * <p>
     * The device associated to the position update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\p{L}\p{N}]+$<br/>
     *
     * @param deviceId <p>
     *            The device associated to the position update.
     *            </p>
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The device associated to the position update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\p{L}\p{N}]+$<br/>
     *
     * @param deviceId <p>
     *            The device associated to the position update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevicePositionUpdate withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * <p>
     * The latest device position defined in <a
     * href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a>
     * format: <code>[X or longitude, Y or latitude]</code>.
     * </p>
     *
     * @return <p>
     *         The latest device position defined in <a
     *         href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS
     *         84</a> format: <code>[X or longitude, Y or latitude]</code>.
     *         </p>
     */
    public java.util.List<Double> getPosition() {
        return position;
    }

    /**
     * <p>
     * The latest device position defined in <a
     * href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a>
     * format: <code>[X or longitude, Y or latitude]</code>.
     * </p>
     *
     * @param position <p>
     *            The latest device position defined in <a
     *            href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS
     *            84</a> format: <code>[X or longitude, Y or latitude]</code>.
     *            </p>
     */
    public void setPosition(java.util.Collection<Double> position) {
        if (position == null) {
            this.position = null;
            return;
        }

        this.position = new java.util.ArrayList<Double>(position);
    }

    /**
     * <p>
     * The latest device position defined in <a
     * href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a>
     * format: <code>[X or longitude, Y or latitude]</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param position <p>
     *            The latest device position defined in <a
     *            href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS
     *            84</a> format: <code>[X or longitude, Y or latitude]</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevicePositionUpdate withPosition(Double... position) {
        if (getPosition() == null) {
            this.position = new java.util.ArrayList<Double>(position.length);
        }
        for (Double value : position) {
            this.position.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The latest device position defined in <a
     * href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a>
     * format: <code>[X or longitude, Y or latitude]</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param position <p>
     *            The latest device position defined in <a
     *            href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS
     *            84</a> format: <code>[X or longitude, Y or latitude]</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevicePositionUpdate withPosition(java.util.Collection<Double> position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * Associates one of more properties with the position update. A property is
     * a key-value pair stored with the position update and added to any
     * geofence event the update may trigger.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     *
     * @return <p>
     *         Associates one of more properties with the position update. A
     *         property is a key-value pair stored with the position update and
     *         added to any geofence event the update may trigger.
     *         </p>
     *         <p>
     *         Format: <code>"key" : "value"</code>
     *         </p>
     */
    public java.util.Map<String, String> getPositionProperties() {
        return positionProperties;
    }

    /**
     * <p>
     * Associates one of more properties with the position update. A property is
     * a key-value pair stored with the position update and added to any
     * geofence event the update may trigger.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     *
     * @param positionProperties <p>
     *            Associates one of more properties with the position update. A
     *            property is a key-value pair stored with the position update
     *            and added to any geofence event the update may trigger.
     *            </p>
     *            <p>
     *            Format: <code>"key" : "value"</code>
     *            </p>
     */
    public void setPositionProperties(java.util.Map<String, String> positionProperties) {
        this.positionProperties = positionProperties;
    }

    /**
     * <p>
     * Associates one of more properties with the position update. A property is
     * a key-value pair stored with the position update and added to any
     * geofence event the update may trigger.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param positionProperties <p>
     *            Associates one of more properties with the position update. A
     *            property is a key-value pair stored with the position update
     *            and added to any geofence event the update may trigger.
     *            </p>
     *            <p>
     *            Format: <code>"key" : "value"</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevicePositionUpdate withPositionProperties(
            java.util.Map<String, String> positionProperties) {
        this.positionProperties = positionProperties;
        return this;
    }

    /**
     * <p>
     * Associates one of more properties with the position update. A property is
     * a key-value pair stored with the position update and added to any
     * geofence event the update may trigger.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * The method adds a new key-value pair into PositionProperties parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into PositionProperties.
     * @param value The corresponding value of the entry to be added into
     *            PositionProperties.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevicePositionUpdate addPositionPropertiesEntry(String key, String value) {
        if (null == this.positionProperties) {
            this.positionProperties = new java.util.HashMap<String, String>();
        }
        if (this.positionProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.positionProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PositionProperties.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DevicePositionUpdate clearPositionPropertiesEntries() {
        this.positionProperties = null;
        return this;
    }

    /**
     * <p>
     * The timestamp at which the device's position was determined. Uses <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     *
     * @return <p>
     *         The timestamp at which the device's position was determined. Uses
     *         <a href="https://www.iso.org/iso-8601-date-and-time-format.html">
     *         ISO 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     *         </p>
     */
    public java.util.Date getSampleTime() {
        return sampleTime;
    }

    /**
     * <p>
     * The timestamp at which the device's position was determined. Uses <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     *
     * @param sampleTime <p>
     *            The timestamp at which the device's position was determined.
     *            Uses <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     *            </p>
     */
    public void setSampleTime(java.util.Date sampleTime) {
        this.sampleTime = sampleTime;
    }

    /**
     * <p>
     * The timestamp at which the device's position was determined. Uses <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sampleTime <p>
     *            The timestamp at which the device's position was determined.
     *            Uses <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevicePositionUpdate withSampleTime(java.util.Date sampleTime) {
        this.sampleTime = sampleTime;
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
        if (getAccuracy() != null)
            sb.append("Accuracy: " + getAccuracy() + ",");
        if (getDeviceId() != null)
            sb.append("DeviceId: " + getDeviceId() + ",");
        if (getPosition() != null)
            sb.append("Position: " + getPosition() + ",");
        if (getPositionProperties() != null)
            sb.append("PositionProperties: " + getPositionProperties() + ",");
        if (getSampleTime() != null)
            sb.append("SampleTime: " + getSampleTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccuracy() == null) ? 0 : getAccuracy().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode
                + ((getPositionProperties() == null) ? 0 : getPositionProperties().hashCode());
        hashCode = prime * hashCode + ((getSampleTime() == null) ? 0 : getSampleTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DevicePositionUpdate == false)
            return false;
        DevicePositionUpdate other = (DevicePositionUpdate) obj;

        if (other.getAccuracy() == null ^ this.getAccuracy() == null)
            return false;
        if (other.getAccuracy() != null && other.getAccuracy().equals(this.getAccuracy()) == false)
            return false;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getPositionProperties() == null ^ this.getPositionProperties() == null)
            return false;
        if (other.getPositionProperties() != null
                && other.getPositionProperties().equals(this.getPositionProperties()) == false)
            return false;
        if (other.getSampleTime() == null ^ this.getSampleTime() == null)
            return false;
        if (other.getSampleTime() != null
                && other.getSampleTime().equals(this.getSampleTime()) == false)
            return false;
        return true;
    }
}
