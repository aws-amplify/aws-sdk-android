/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The Amazon Location rule action sends device location updates from an MQTT
 * message to an Amazon Location tracker resource.
 * </p>
 */
public class LocationAction implements Serializable {
    /**
     * <p>
     * The IAM role that grants permission to write to the Amazon Location
     * resource.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The name of the tracker resource in Amazon Location in which the location
     * is updated.
     * </p>
     */
    private String trackerName;

    /**
     * <p>
     * The unique ID of the device providing the location data.
     * </p>
     */
    private String deviceId;

    /**
     * <p>
     * The time that the location data was sampled. The default value is the
     * time the MQTT message was processed.
     * </p>
     */
    private LocationTimestamp timestamp;

    /**
     * <p>
     * A string that evaluates to a double value that represents the latitude of
     * the device's location.
     * </p>
     */
    private String latitude;

    /**
     * <p>
     * A string that evaluates to a double value that represents the longitude
     * of the device's location.
     * </p>
     */
    private String longitude;

    /**
     * <p>
     * The IAM role that grants permission to write to the Amazon Location
     * resource.
     * </p>
     *
     * @return <p>
     *         The IAM role that grants permission to write to the Amazon
     *         Location resource.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The IAM role that grants permission to write to the Amazon Location
     * resource.
     * </p>
     *
     * @param roleArn <p>
     *            The IAM role that grants permission to write to the Amazon
     *            Location resource.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role that grants permission to write to the Amazon Location
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The IAM role that grants permission to write to the Amazon
     *            Location resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocationAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The name of the tracker resource in Amazon Location in which the location
     * is updated.
     * </p>
     *
     * @return <p>
     *         The name of the tracker resource in Amazon Location in which the
     *         location is updated.
     *         </p>
     */
    public String getTrackerName() {
        return trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource in Amazon Location in which the location
     * is updated.
     * </p>
     *
     * @param trackerName <p>
     *            The name of the tracker resource in Amazon Location in which
     *            the location is updated.
     *            </p>
     */
    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource in Amazon Location in which the location
     * is updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trackerName <p>
     *            The name of the tracker resource in Amazon Location in which
     *            the location is updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocationAction withTrackerName(String trackerName) {
        this.trackerName = trackerName;
        return this;
    }

    /**
     * <p>
     * The unique ID of the device providing the location data.
     * </p>
     *
     * @return <p>
     *         The unique ID of the device providing the location data.
     *         </p>
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * <p>
     * The unique ID of the device providing the location data.
     * </p>
     *
     * @param deviceId <p>
     *            The unique ID of the device providing the location data.
     *            </p>
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The unique ID of the device providing the location data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceId <p>
     *            The unique ID of the device providing the location data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocationAction withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * <p>
     * The time that the location data was sampled. The default value is the
     * time the MQTT message was processed.
     * </p>
     *
     * @return <p>
     *         The time that the location data was sampled. The default value is
     *         the time the MQTT message was processed.
     *         </p>
     */
    public LocationTimestamp getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The time that the location data was sampled. The default value is the
     * time the MQTT message was processed.
     * </p>
     *
     * @param timestamp <p>
     *            The time that the location data was sampled. The default value
     *            is the time the MQTT message was processed.
     *            </p>
     */
    public void setTimestamp(LocationTimestamp timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time that the location data was sampled. The default value is the
     * time the MQTT message was processed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            The time that the location data was sampled. The default value
     *            is the time the MQTT message was processed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocationAction withTimestamp(LocationTimestamp timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * <p>
     * A string that evaluates to a double value that represents the latitude of
     * the device's location.
     * </p>
     *
     * @return <p>
     *         A string that evaluates to a double value that represents the
     *         latitude of the device's location.
     *         </p>
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * <p>
     * A string that evaluates to a double value that represents the latitude of
     * the device's location.
     * </p>
     *
     * @param latitude <p>
     *            A string that evaluates to a double value that represents the
     *            latitude of the device's location.
     *            </p>
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * <p>
     * A string that evaluates to a double value that represents the latitude of
     * the device's location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param latitude <p>
     *            A string that evaluates to a double value that represents the
     *            latitude of the device's location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocationAction withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * <p>
     * A string that evaluates to a double value that represents the longitude
     * of the device's location.
     * </p>
     *
     * @return <p>
     *         A string that evaluates to a double value that represents the
     *         longitude of the device's location.
     *         </p>
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * <p>
     * A string that evaluates to a double value that represents the longitude
     * of the device's location.
     * </p>
     *
     * @param longitude <p>
     *            A string that evaluates to a double value that represents the
     *            longitude of the device's location.
     *            </p>
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * <p>
     * A string that evaluates to a double value that represents the longitude
     * of the device's location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param longitude <p>
     *            A string that evaluates to a double value that represents the
     *            longitude of the device's location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocationAction withLongitude(String longitude) {
        this.longitude = longitude;
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
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getTrackerName() != null)
            sb.append("trackerName: " + getTrackerName() + ",");
        if (getDeviceId() != null)
            sb.append("deviceId: " + getDeviceId() + ",");
        if (getTimestamp() != null)
            sb.append("timestamp: " + getTimestamp() + ",");
        if (getLatitude() != null)
            sb.append("latitude: " + getLatitude() + ",");
        if (getLongitude() != null)
            sb.append("longitude: " + getLongitude());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getTrackerName() == null) ? 0 : getTrackerName().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        hashCode = prime * hashCode + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocationAction == false)
            return false;
        LocationAction other = (LocationAction) obj;

        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTrackerName() == null ^ this.getTrackerName() == null)
            return false;
        if (other.getTrackerName() != null
                && other.getTrackerName().equals(this.getTrackerName()) == false)
            return false;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getLatitude() == null ^ this.getLatitude() == null)
            return false;
        if (other.getLatitude() != null && other.getLatitude().equals(this.getLatitude()) == false)
            return false;
        if (other.getLongitude() == null ^ this.getLongitude() == null)
            return false;
        if (other.getLongitude() != null
                && other.getLongitude().equals(this.getLongitude()) == false)
            return false;
        return true;
    }
}
