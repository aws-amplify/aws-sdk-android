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
 * Contains a list of geofences stored in a given geofence collection.
 * </p>
 */
public class ListGeofenceResponseEntry implements Serializable {
    /**
     * <p>
     * The timestamp for when the geofence was stored in a geofence collection
     * in <a href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The geofence identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\p{L}\p{N}]+$<br/>
     */
    private String geofenceId;

    /**
     * <p>
     * Contains the geofence geometry details describing a polygon.
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
     * The timestamp for when the geofence was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The timestamp for when the geofence was stored in a geofence collection
     * in <a href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     *
     * @return <p>
     *         The timestamp for when the geofence was stored in a geofence
     *         collection in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *         8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The timestamp for when the geofence was stored in a geofence collection
     * in <a href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     *
     * @param createTime <p>
     *            The timestamp for when the geofence was stored in a geofence
     *            collection in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The timestamp for when the geofence was stored in a geofence collection
     * in <a href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            The timestamp for when the geofence was stored in a geofence
     *            collection in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGeofenceResponseEntry withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * The geofence identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\p{L}\p{N}]+$<br/>
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
     * <b>Pattern: </b>^[-._\p{L}\p{N}]+$<br/>
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
     * <b>Pattern: </b>^[-._\p{L}\p{N}]+$<br/>
     *
     * @param geofenceId <p>
     *            The geofence identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGeofenceResponseEntry withGeofenceId(String geofenceId) {
        this.geofenceId = geofenceId;
        return this;
    }

    /**
     * <p>
     * Contains the geofence geometry details describing a polygon.
     * </p>
     *
     * @return <p>
     *         Contains the geofence geometry details describing a polygon.
     *         </p>
     */
    public GeofenceGeometry getGeometry() {
        return geometry;
    }

    /**
     * <p>
     * Contains the geofence geometry details describing a polygon.
     * </p>
     *
     * @param geometry <p>
     *            Contains the geofence geometry details describing a polygon.
     *            </p>
     */
    public void setGeometry(GeofenceGeometry geometry) {
        this.geometry = geometry;
    }

    /**
     * <p>
     * Contains the geofence geometry details describing a polygon.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geometry <p>
     *            Contains the geofence geometry details describing a polygon.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGeofenceResponseEntry withGeometry(GeofenceGeometry geometry) {
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
    public ListGeofenceResponseEntry withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The timestamp for when the geofence was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     *
     * @return <p>
     *         The timestamp for when the geofence was last updated in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *         8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     *         </p>
     */
    public java.util.Date getUpdateTime() {
        return updateTime;
    }

    /**
     * <p>
     * The timestamp for when the geofence was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     *
     * @param updateTime <p>
     *            The timestamp for when the geofence was last updated in <a
     *            href
     *            ="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     *            </p>
     */
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The timestamp for when the geofence was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateTime <p>
     *            The timestamp for when the geofence was last updated in <a
     *            href
     *            ="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGeofenceResponseEntry withUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
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
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime() + ",");
        if (getGeofenceId() != null)
            sb.append("GeofenceId: " + getGeofenceId() + ",");
        if (getGeometry() != null)
            sb.append("Geometry: " + getGeometry() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: " + getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getGeofenceId() == null) ? 0 : getGeofenceId().hashCode());
        hashCode = prime * hashCode + ((getGeometry() == null) ? 0 : getGeometry().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGeofenceResponseEntry == false)
            return false;
        ListGeofenceResponseEntry other = (ListGeofenceResponseEntry) obj;

        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
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
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null
                && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }
}
