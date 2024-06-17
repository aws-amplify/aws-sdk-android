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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

/**
 * <p>
 * A forecasted event represents a geofence event in relation to the requested
 * device state, that may occur given the provided device state and time
 * horizon.
 * </p>
 */
public class ForecastedEvent implements Serializable {
    /**
     * <p>
     * The forecasted event identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     */
    private String eventId;

    /**
     * <p>
     * The geofence identifier pertaining to the forecasted event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\p{L}\p{N}]+<br/>
     */
    private String geofenceId;

    /**
     * <p>
     * Indicates if the device is located within the geofence.
     * </p>
     */
    private Boolean isDeviceInGeofence;

    /**
     * <p>
     * The closest distance from the device's position to the geofence.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - <br/>
     */
    private Double nearestDistance;

    /**
     * <p>
     * The event type, forecasting three states for which a device can be in
     * relative to a geofence:
     * </p>
     * <p>
     * <code>ENTER</code>: If a device is outside of a geofence, but would
     * breach the fence if the device is moving at its current speed within time
     * horizon window.
     * </p>
     * <p>
     * <code>EXIT</code>: If a device is inside of a geofence, but would breach
     * the fence if the device is moving at its current speed within time
     * horizon window.
     * </p>
     * <p>
     * <code>IDLE</code>: If a device is inside of a geofence, and the device is
     * not moving.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENTER, EXIT, IDLE
     */
    private String eventType;

    /**
     * <p>
     * The forecasted time the device will breach the geofence in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     */
    private java.util.Date forecastedBreachTime;

    /**
     * <p>
     * The geofence properties.
     * </p>
     */
    private java.util.Map<String, String> geofenceProperties;

    /**
     * <p>
     * The forecasted event identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @return <p>
     *         The forecasted event identifier.
     *         </p>
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * <p>
     * The forecasted event identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param eventId <p>
     *            The forecasted event identifier.
     *            </p>
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The forecasted event identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param eventId <p>
     *            The forecasted event identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForecastedEvent withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * <p>
     * The geofence identifier pertaining to the forecasted event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\p{L}\p{N}]+<br/>
     *
     * @return <p>
     *         The geofence identifier pertaining to the forecasted event.
     *         </p>
     */
    public String getGeofenceId() {
        return geofenceId;
    }

    /**
     * <p>
     * The geofence identifier pertaining to the forecasted event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\p{L}\p{N}]+<br/>
     *
     * @param geofenceId <p>
     *            The geofence identifier pertaining to the forecasted event.
     *            </p>
     */
    public void setGeofenceId(String geofenceId) {
        this.geofenceId = geofenceId;
    }

    /**
     * <p>
     * The geofence identifier pertaining to the forecasted event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\p{L}\p{N}]+<br/>
     *
     * @param geofenceId <p>
     *            The geofence identifier pertaining to the forecasted event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForecastedEvent withGeofenceId(String geofenceId) {
        this.geofenceId = geofenceId;
        return this;
    }

    /**
     * <p>
     * Indicates if the device is located within the geofence.
     * </p>
     *
     * @return <p>
     *         Indicates if the device is located within the geofence.
     *         </p>
     */
    public Boolean isIsDeviceInGeofence() {
        return isDeviceInGeofence;
    }

    /**
     * <p>
     * Indicates if the device is located within the geofence.
     * </p>
     *
     * @return <p>
     *         Indicates if the device is located within the geofence.
     *         </p>
     */
    public Boolean getIsDeviceInGeofence() {
        return isDeviceInGeofence;
    }

    /**
     * <p>
     * Indicates if the device is located within the geofence.
     * </p>
     *
     * @param isDeviceInGeofence <p>
     *            Indicates if the device is located within the geofence.
     *            </p>
     */
    public void setIsDeviceInGeofence(Boolean isDeviceInGeofence) {
        this.isDeviceInGeofence = isDeviceInGeofence;
    }

    /**
     * <p>
     * Indicates if the device is located within the geofence.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isDeviceInGeofence <p>
     *            Indicates if the device is located within the geofence.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForecastedEvent withIsDeviceInGeofence(Boolean isDeviceInGeofence) {
        this.isDeviceInGeofence = isDeviceInGeofence;
        return this;
    }

    /**
     * <p>
     * The closest distance from the device's position to the geofence.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - <br/>
     *
     * @return <p>
     *         The closest distance from the device's position to the geofence.
     *         </p>
     */
    public Double getNearestDistance() {
        return nearestDistance;
    }

    /**
     * <p>
     * The closest distance from the device's position to the geofence.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - <br/>
     *
     * @param nearestDistance <p>
     *            The closest distance from the device's position to the
     *            geofence.
     *            </p>
     */
    public void setNearestDistance(Double nearestDistance) {
        this.nearestDistance = nearestDistance;
    }

    /**
     * <p>
     * The closest distance from the device's position to the geofence.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - <br/>
     *
     * @param nearestDistance <p>
     *            The closest distance from the device's position to the
     *            geofence.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForecastedEvent withNearestDistance(Double nearestDistance) {
        this.nearestDistance = nearestDistance;
        return this;
    }

    /**
     * <p>
     * The event type, forecasting three states for which a device can be in
     * relative to a geofence:
     * </p>
     * <p>
     * <code>ENTER</code>: If a device is outside of a geofence, but would
     * breach the fence if the device is moving at its current speed within time
     * horizon window.
     * </p>
     * <p>
     * <code>EXIT</code>: If a device is inside of a geofence, but would breach
     * the fence if the device is moving at its current speed within time
     * horizon window.
     * </p>
     * <p>
     * <code>IDLE</code>: If a device is inside of a geofence, and the device is
     * not moving.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENTER, EXIT, IDLE
     *
     * @return <p>
     *         The event type, forecasting three states for which a device can
     *         be in relative to a geofence:
     *         </p>
     *         <p>
     *         <code>ENTER</code>: If a device is outside of a geofence, but
     *         would breach the fence if the device is moving at its current
     *         speed within time horizon window.
     *         </p>
     *         <p>
     *         <code>EXIT</code>: If a device is inside of a geofence, but would
     *         breach the fence if the device is moving at its current speed
     *         within time horizon window.
     *         </p>
     *         <p>
     *         <code>IDLE</code>: If a device is inside of a geofence, and the
     *         device is not moving.
     *         </p>
     * @see ForecastedGeofenceEventType
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * <p>
     * The event type, forecasting three states for which a device can be in
     * relative to a geofence:
     * </p>
     * <p>
     * <code>ENTER</code>: If a device is outside of a geofence, but would
     * breach the fence if the device is moving at its current speed within time
     * horizon window.
     * </p>
     * <p>
     * <code>EXIT</code>: If a device is inside of a geofence, but would breach
     * the fence if the device is moving at its current speed within time
     * horizon window.
     * </p>
     * <p>
     * <code>IDLE</code>: If a device is inside of a geofence, and the device is
     * not moving.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENTER, EXIT, IDLE
     *
     * @param eventType <p>
     *            The event type, forecasting three states for which a device
     *            can be in relative to a geofence:
     *            </p>
     *            <p>
     *            <code>ENTER</code>: If a device is outside of a geofence, but
     *            would breach the fence if the device is moving at its current
     *            speed within time horizon window.
     *            </p>
     *            <p>
     *            <code>EXIT</code>: If a device is inside of a geofence, but
     *            would breach the fence if the device is moving at its current
     *            speed within time horizon window.
     *            </p>
     *            <p>
     *            <code>IDLE</code>: If a device is inside of a geofence, and
     *            the device is not moving.
     *            </p>
     * @see ForecastedGeofenceEventType
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The event type, forecasting three states for which a device can be in
     * relative to a geofence:
     * </p>
     * <p>
     * <code>ENTER</code>: If a device is outside of a geofence, but would
     * breach the fence if the device is moving at its current speed within time
     * horizon window.
     * </p>
     * <p>
     * <code>EXIT</code>: If a device is inside of a geofence, but would breach
     * the fence if the device is moving at its current speed within time
     * horizon window.
     * </p>
     * <p>
     * <code>IDLE</code>: If a device is inside of a geofence, and the device is
     * not moving.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENTER, EXIT, IDLE
     *
     * @param eventType <p>
     *            The event type, forecasting three states for which a device
     *            can be in relative to a geofence:
     *            </p>
     *            <p>
     *            <code>ENTER</code>: If a device is outside of a geofence, but
     *            would breach the fence if the device is moving at its current
     *            speed within time horizon window.
     *            </p>
     *            <p>
     *            <code>EXIT</code>: If a device is inside of a geofence, but
     *            would breach the fence if the device is moving at its current
     *            speed within time horizon window.
     *            </p>
     *            <p>
     *            <code>IDLE</code>: If a device is inside of a geofence, and
     *            the device is not moving.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ForecastedGeofenceEventType
     */
    public ForecastedEvent withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * <p>
     * The event type, forecasting three states for which a device can be in
     * relative to a geofence:
     * </p>
     * <p>
     * <code>ENTER</code>: If a device is outside of a geofence, but would
     * breach the fence if the device is moving at its current speed within time
     * horizon window.
     * </p>
     * <p>
     * <code>EXIT</code>: If a device is inside of a geofence, but would breach
     * the fence if the device is moving at its current speed within time
     * horizon window.
     * </p>
     * <p>
     * <code>IDLE</code>: If a device is inside of a geofence, and the device is
     * not moving.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENTER, EXIT, IDLE
     *
     * @param eventType <p>
     *            The event type, forecasting three states for which a device
     *            can be in relative to a geofence:
     *            </p>
     *            <p>
     *            <code>ENTER</code>: If a device is outside of a geofence, but
     *            would breach the fence if the device is moving at its current
     *            speed within time horizon window.
     *            </p>
     *            <p>
     *            <code>EXIT</code>: If a device is inside of a geofence, but
     *            would breach the fence if the device is moving at its current
     *            speed within time horizon window.
     *            </p>
     *            <p>
     *            <code>IDLE</code>: If a device is inside of a geofence, and
     *            the device is not moving.
     *            </p>
     * @see ForecastedGeofenceEventType
     */
    public void setEventType(ForecastedGeofenceEventType eventType) {
        this.eventType = eventType.toString();
    }

    /**
     * <p>
     * The event type, forecasting three states for which a device can be in
     * relative to a geofence:
     * </p>
     * <p>
     * <code>ENTER</code>: If a device is outside of a geofence, but would
     * breach the fence if the device is moving at its current speed within time
     * horizon window.
     * </p>
     * <p>
     * <code>EXIT</code>: If a device is inside of a geofence, but would breach
     * the fence if the device is moving at its current speed within time
     * horizon window.
     * </p>
     * <p>
     * <code>IDLE</code>: If a device is inside of a geofence, and the device is
     * not moving.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENTER, EXIT, IDLE
     *
     * @param eventType <p>
     *            The event type, forecasting three states for which a device
     *            can be in relative to a geofence:
     *            </p>
     *            <p>
     *            <code>ENTER</code>: If a device is outside of a geofence, but
     *            would breach the fence if the device is moving at its current
     *            speed within time horizon window.
     *            </p>
     *            <p>
     *            <code>EXIT</code>: If a device is inside of a geofence, but
     *            would breach the fence if the device is moving at its current
     *            speed within time horizon window.
     *            </p>
     *            <p>
     *            <code>IDLE</code>: If a device is inside of a geofence, and
     *            the device is not moving.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ForecastedGeofenceEventType
     */
    public ForecastedEvent withEventType(ForecastedGeofenceEventType eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * <p>
     * The forecasted time the device will breach the geofence in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     *
     * @return <p>
     *         The forecasted time the device will breach the geofence in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *         8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     *         </p>
     */
    public java.util.Date getForecastedBreachTime() {
        return forecastedBreachTime;
    }

    /**
     * <p>
     * The forecasted time the device will breach the geofence in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     *
     * @param forecastedBreachTime <p>
     *            The forecasted time the device will breach the geofence in <a
     *            href
     *            ="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     *            </p>
     */
    public void setForecastedBreachTime(java.util.Date forecastedBreachTime) {
        this.forecastedBreachTime = forecastedBreachTime;
    }

    /**
     * <p>
     * The forecasted time the device will breach the geofence in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param forecastedBreachTime <p>
     *            The forecasted time the device will breach the geofence in <a
     *            href
     *            ="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForecastedEvent withForecastedBreachTime(java.util.Date forecastedBreachTime) {
        this.forecastedBreachTime = forecastedBreachTime;
        return this;
    }

    /**
     * <p>
     * The geofence properties.
     * </p>
     *
     * @return <p>
     *         The geofence properties.
     *         </p>
     */
    public java.util.Map<String, String> getGeofenceProperties() {
        return geofenceProperties;
    }

    /**
     * <p>
     * The geofence properties.
     * </p>
     *
     * @param geofenceProperties <p>
     *            The geofence properties.
     *            </p>
     */
    public void setGeofenceProperties(java.util.Map<String, String> geofenceProperties) {
        this.geofenceProperties = geofenceProperties;
    }

    /**
     * <p>
     * The geofence properties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geofenceProperties <p>
     *            The geofence properties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForecastedEvent withGeofenceProperties(java.util.Map<String, String> geofenceProperties) {
        this.geofenceProperties = geofenceProperties;
        return this;
    }

    /**
     * <p>
     * The geofence properties.
     * </p>
     * <p>
     * The method adds a new key-value pair into GeofenceProperties parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into GeofenceProperties.
     * @param value The corresponding value of the entry to be added into
     *            GeofenceProperties.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForecastedEvent addGeofencePropertiesEntry(String key, String value) {
        if (null == this.geofenceProperties) {
            this.geofenceProperties = new java.util.HashMap<String, String>();
        }
        if (this.geofenceProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.geofenceProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into GeofenceProperties.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ForecastedEvent clearGeofencePropertiesEntries() {
        this.geofenceProperties = null;
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
        if (getEventId() != null)
            sb.append("EventId: " + getEventId() + ",");
        if (getGeofenceId() != null)
            sb.append("GeofenceId: " + getGeofenceId() + ",");
        if (getIsDeviceInGeofence() != null)
            sb.append("IsDeviceInGeofence: " + getIsDeviceInGeofence() + ",");
        if (getNearestDistance() != null)
            sb.append("NearestDistance: " + getNearestDistance() + ",");
        if (getEventType() != null)
            sb.append("EventType: " + getEventType() + ",");
        if (getForecastedBreachTime() != null)
            sb.append("ForecastedBreachTime: " + getForecastedBreachTime() + ",");
        if (getGeofenceProperties() != null)
            sb.append("GeofenceProperties: " + getGeofenceProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getGeofenceId() == null) ? 0 : getGeofenceId().hashCode());
        hashCode = prime * hashCode
                + ((getIsDeviceInGeofence() == null) ? 0 : getIsDeviceInGeofence().hashCode());
        hashCode = prime * hashCode
                + ((getNearestDistance() == null) ? 0 : getNearestDistance().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode
                + ((getForecastedBreachTime() == null) ? 0 : getForecastedBreachTime().hashCode());
        hashCode = prime * hashCode
                + ((getGeofenceProperties() == null) ? 0 : getGeofenceProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ForecastedEvent == false)
            return false;
        ForecastedEvent other = (ForecastedEvent) obj;

        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getGeofenceId() == null ^ this.getGeofenceId() == null)
            return false;
        if (other.getGeofenceId() != null
                && other.getGeofenceId().equals(this.getGeofenceId()) == false)
            return false;
        if (other.getIsDeviceInGeofence() == null ^ this.getIsDeviceInGeofence() == null)
            return false;
        if (other.getIsDeviceInGeofence() != null
                && other.getIsDeviceInGeofence().equals(this.getIsDeviceInGeofence()) == false)
            return false;
        if (other.getNearestDistance() == null ^ this.getNearestDistance() == null)
            return false;
        if (other.getNearestDistance() != null
                && other.getNearestDistance().equals(this.getNearestDistance()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null
                && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getForecastedBreachTime() == null ^ this.getForecastedBreachTime() == null)
            return false;
        if (other.getForecastedBreachTime() != null
                && other.getForecastedBreachTime().equals(this.getForecastedBreachTime()) == false)
            return false;
        if (other.getGeofenceProperties() == null ^ this.getGeofenceProperties() == null)
            return false;
        if (other.getGeofenceProperties() != null
                && other.getGeofenceProperties().equals(this.getGeofenceProperties()) == false)
            return false;
        return true;
    }
}
