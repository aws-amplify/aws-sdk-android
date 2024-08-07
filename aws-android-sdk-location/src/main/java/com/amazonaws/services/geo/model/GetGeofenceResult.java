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

public class GetGeofenceResult implements Serializable {
    /**
     * <p>
     * The geofence identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\p{L}\p{N}]+<br/>
     */
    private String geofenceId;

    /**
     * <p>
     * Contains the geofence geometry details describing a polygon or a circle.
     * </p>
     */
    private GeofenceGeometry geometry;

    /**
     * <p>
     * Identifies the state of the geofence. A geofence will hold one of the
     * following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> — The geofence has been indexed by the system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> — The geofence is being processed by the system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> — The geofence failed to be indexed by the system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> — The geofence has been deleted from the system
     * index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> — The geofence is being deleted from the system
     * index.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The timestamp for when the geofence collection was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The timestamp for when the geofence collection was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * User defined properties of the geofence. A property is a key-value pair
     * stored with the geofence and added to any geofence event triggered with
     * that geofence.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     */
    private java.util.Map<String, String> geofenceProperties;

    /**
     * <p>
     * The geofence identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\p{L}\p{N}]+<br/>
     *
     * @return <p>
     *         The geofence identifier.
     *         </p>
     */
    public String getGeofenceId() {
        return geofenceId;
    }

    /**
     * <p>
     * The geofence identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\p{L}\p{N}]+<br/>
     *
     * @param geofenceId <p>
     *            The geofence identifier.
     *            </p>
     */
    public void setGeofenceId(String geofenceId) {
        this.geofenceId = geofenceId;
    }

    /**
     * <p>
     * The geofence identifier.
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
     *            The geofence identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetGeofenceResult withGeofenceId(String geofenceId) {
        this.geofenceId = geofenceId;
        return this;
    }

    /**
     * <p>
     * Contains the geofence geometry details describing a polygon or a circle.
     * </p>
     *
     * @return <p>
     *         Contains the geofence geometry details describing a polygon or a
     *         circle.
     *         </p>
     */
    public GeofenceGeometry getGeometry() {
        return geometry;
    }

    /**
     * <p>
     * Contains the geofence geometry details describing a polygon or a circle.
     * </p>
     *
     * @param geometry <p>
     *            Contains the geofence geometry details describing a polygon or
     *            a circle.
     *            </p>
     */
    public void setGeometry(GeofenceGeometry geometry) {
        this.geometry = geometry;
    }

    /**
     * <p>
     * Contains the geofence geometry details describing a polygon or a circle.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geometry <p>
     *            Contains the geofence geometry details describing a polygon or
     *            a circle.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetGeofenceResult withGeometry(GeofenceGeometry geometry) {
        this.geometry = geometry;
        return this;
    }

    /**
     * <p>
     * Identifies the state of the geofence. A geofence will hold one of the
     * following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> — The geofence has been indexed by the system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> — The geofence is being processed by the system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> — The geofence failed to be indexed by the system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> — The geofence has been deleted from the system
     * index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> — The geofence is being deleted from the system
     * index.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Identifies the state of the geofence. A geofence will hold one of
     *         the following states:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> — The geofence has been indexed by the
     *         system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING</code> — The geofence is being processed by the
     *         system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> — The geofence failed to be indexed by the
     *         system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETED</code> — The geofence has been deleted from the
     *         system index.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> — The geofence is being deleted from the
     *         system index.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Identifies the state of the geofence. A geofence will hold one of the
     * following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> — The geofence has been indexed by the system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> — The geofence is being processed by the system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> — The geofence failed to be indexed by the system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> — The geofence has been deleted from the system
     * index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> — The geofence is being deleted from the system
     * index.
     * </p>
     * </li>
     * </ul>
     *
     * @param status <p>
     *            Identifies the state of the geofence. A geofence will hold one
     *            of the following states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> — The geofence has been indexed by the
     *            system.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PENDING</code> — The geofence is being processed by the
     *            system.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> — The geofence failed to be indexed by the
     *            system.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETED</code> — The geofence has been deleted from the
     *            system index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> — The geofence is being deleted from the
     *            system index.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Identifies the state of the geofence. A geofence will hold one of the
     * following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> — The geofence has been indexed by the system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> — The geofence is being processed by the system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> — The geofence failed to be indexed by the system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> — The geofence has been deleted from the system
     * index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> — The geofence is being deleted from the system
     * index.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            Identifies the state of the geofence. A geofence will hold one
     *            of the following states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> — The geofence has been indexed by the
     *            system.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PENDING</code> — The geofence is being processed by the
     *            system.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> — The geofence failed to be indexed by the
     *            system.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETED</code> — The geofence has been deleted from the
     *            system index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> — The geofence is being deleted from the
     *            system index.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetGeofenceResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The timestamp for when the geofence collection was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     *
     * @return <p>
     *         The timestamp for when the geofence collection was created in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *         8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The timestamp for when the geofence collection was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     *
     * @param createTime <p>
     *            The timestamp for when the geofence collection was created in
     *            <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The timestamp for when the geofence collection was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            The timestamp for when the geofence collection was created in
     *            <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetGeofenceResult withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * The timestamp for when the geofence collection was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     *
     * @return <p>
     *         The timestamp for when the geofence collection was last updated
     *         in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *         8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     *         </p>
     */
    public java.util.Date getUpdateTime() {
        return updateTime;
    }

    /**
     * <p>
     * The timestamp for when the geofence collection was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     *
     * @param updateTime <p>
     *            The timestamp for when the geofence collection was last
     *            updated in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     *            </p>
     */
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The timestamp for when the geofence collection was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateTime <p>
     *            The timestamp for when the geofence collection was last
     *            updated in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetGeofenceResult withUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * <p>
     * User defined properties of the geofence. A property is a key-value pair
     * stored with the geofence and added to any geofence event triggered with
     * that geofence.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     *
     * @return <p>
     *         User defined properties of the geofence. A property is a
     *         key-value pair stored with the geofence and added to any geofence
     *         event triggered with that geofence.
     *         </p>
     *         <p>
     *         Format: <code>"key" : "value"</code>
     *         </p>
     */
    public java.util.Map<String, String> getGeofenceProperties() {
        return geofenceProperties;
    }

    /**
     * <p>
     * User defined properties of the geofence. A property is a key-value pair
     * stored with the geofence and added to any geofence event triggered with
     * that geofence.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     *
     * @param geofenceProperties <p>
     *            User defined properties of the geofence. A property is a
     *            key-value pair stored with the geofence and added to any
     *            geofence event triggered with that geofence.
     *            </p>
     *            <p>
     *            Format: <code>"key" : "value"</code>
     *            </p>
     */
    public void setGeofenceProperties(java.util.Map<String, String> geofenceProperties) {
        this.geofenceProperties = geofenceProperties;
    }

    /**
     * <p>
     * User defined properties of the geofence. A property is a key-value pair
     * stored with the geofence and added to any geofence event triggered with
     * that geofence.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geofenceProperties <p>
     *            User defined properties of the geofence. A property is a
     *            key-value pair stored with the geofence and added to any
     *            geofence event triggered with that geofence.
     *            </p>
     *            <p>
     *            Format: <code>"key" : "value"</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetGeofenceResult withGeofenceProperties(java.util.Map<String, String> geofenceProperties) {
        this.geofenceProperties = geofenceProperties;
        return this;
    }

    /**
     * <p>
     * User defined properties of the geofence. A property is a key-value pair
     * stored with the geofence and added to any geofence event triggered with
     * that geofence.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
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
    public GetGeofenceResult addGeofencePropertiesEntry(String key, String value) {
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
    public GetGeofenceResult clearGeofencePropertiesEntries() {
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
        if (getGeofenceId() != null)
            sb.append("GeofenceId: " + getGeofenceId() + ",");
        if (getGeometry() != null)
            sb.append("Geometry: " + getGeometry() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime() + ",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: " + getUpdateTime() + ",");
        if (getGeofenceProperties() != null)
            sb.append("GeofenceProperties: " + getGeofenceProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGeofenceId() == null) ? 0 : getGeofenceId().hashCode());
        hashCode = prime * hashCode + ((getGeometry() == null) ? 0 : getGeometry().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
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

        if (obj instanceof GetGeofenceResult == false)
            return false;
        GetGeofenceResult other = (GetGeofenceResult) obj;

        if (other.getGeofenceId() == null ^ this.getGeofenceId() == null)
            return false;
        if (other.getGeofenceId() != null
                && other.getGeofenceId().equals(this.getGeofenceId()) == false)
            return false;
        if (other.getGeometry() == null ^ this.getGeometry() == null)
            return false;
        if (other.getGeometry() != null && other.getGeometry().equals(this.getGeometry()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null
                && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getGeofenceProperties() == null ^ this.getGeofenceProperties() == null)
            return false;
        if (other.getGeofenceProperties() != null
                && other.getGeofenceProperties().equals(this.getGeofenceProperties()) == false)
            return false;
        return true;
    }
}
