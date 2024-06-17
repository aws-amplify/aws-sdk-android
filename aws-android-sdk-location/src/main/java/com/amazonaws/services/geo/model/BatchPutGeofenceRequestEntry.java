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
 * Contains geofence geometry details.
 * </p>
 */
public class BatchPutGeofenceRequestEntry implements Serializable {
    /**
     * <p>
     * The identifier for the geofence to be stored in a given geofence
     * collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\p{L}\p{N}]+<br/>
     */
    private String geofenceId;

    /**
     * <p>
     * Contains the details to specify the position of the geofence. Can be a
     * polygon, a circle or a polygon encoded in Geobuf format. Including
     * multiple selections will return a validation error.
     * </p>
     * <note>
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html"
     * > geofence polygon</a> format supports a maximum of 1,000 vertices. The
     * <a href=
     * "https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html"
     * >Geofence geobuf</a> format supports a maximum of 100,000 vertices.
     * </p>
     * </note>
     */
    private GeofenceGeometry geometry;

    /**
     * <p>
     * Associates one of more properties with the geofence. A property is a
     * key-value pair stored with the geofence and added to any geofence event
     * triggered with that geofence.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     */
    private java.util.Map<String, String> geofenceProperties;

    /**
     * <p>
     * The identifier for the geofence to be stored in a given geofence
     * collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\p{L}\p{N}]+<br/>
     *
     * @return <p>
     *         The identifier for the geofence to be stored in a given geofence
     *         collection.
     *         </p>
     */
    public String getGeofenceId() {
        return geofenceId;
    }

    /**
     * <p>
     * The identifier for the geofence to be stored in a given geofence
     * collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\p{L}\p{N}]+<br/>
     *
     * @param geofenceId <p>
     *            The identifier for the geofence to be stored in a given
     *            geofence collection.
     *            </p>
     */
    public void setGeofenceId(String geofenceId) {
        this.geofenceId = geofenceId;
    }

    /**
     * <p>
     * The identifier for the geofence to be stored in a given geofence
     * collection.
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
     *            The identifier for the geofence to be stored in a given
     *            geofence collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutGeofenceRequestEntry withGeofenceId(String geofenceId) {
        this.geofenceId = geofenceId;
        return this;
    }

    /**
     * <p>
     * Contains the details to specify the position of the geofence. Can be a
     * polygon, a circle or a polygon encoded in Geobuf format. Including
     * multiple selections will return a validation error.
     * </p>
     * <note>
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html"
     * > geofence polygon</a> format supports a maximum of 1,000 vertices. The
     * <a href=
     * "https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html"
     * >Geofence geobuf</a> format supports a maximum of 100,000 vertices.
     * </p>
     * </note>
     *
     * @return <p>
     *         Contains the details to specify the position of the geofence. Can
     *         be a polygon, a circle or a polygon encoded in Geobuf format.
     *         Including multiple selections will return a validation error.
     *         </p>
     *         <note>
     *         <p>
     *         The <a href=
     *         "https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html"
     *         > geofence polygon</a> format supports a maximum of 1,000
     *         vertices. The <a href=
     *         "https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html"
     *         >Geofence geobuf</a> format supports a maximum of 100,000
     *         vertices.
     *         </p>
     *         </note>
     */
    public GeofenceGeometry getGeometry() {
        return geometry;
    }

    /**
     * <p>
     * Contains the details to specify the position of the geofence. Can be a
     * polygon, a circle or a polygon encoded in Geobuf format. Including
     * multiple selections will return a validation error.
     * </p>
     * <note>
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html"
     * > geofence polygon</a> format supports a maximum of 1,000 vertices. The
     * <a href=
     * "https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html"
     * >Geofence geobuf</a> format supports a maximum of 100,000 vertices.
     * </p>
     * </note>
     *
     * @param geometry <p>
     *            Contains the details to specify the position of the geofence.
     *            Can be a polygon, a circle or a polygon encoded in Geobuf
     *            format. Including multiple selections will return a validation
     *            error.
     *            </p>
     *            <note>
     *            <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html"
     *            > geofence polygon</a> format supports a maximum of 1,000
     *            vertices. The <a href=
     *            "https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html"
     *            >Geofence geobuf</a> format supports a maximum of 100,000
     *            vertices.
     *            </p>
     *            </note>
     */
    public void setGeometry(GeofenceGeometry geometry) {
        this.geometry = geometry;
    }

    /**
     * <p>
     * Contains the details to specify the position of the geofence. Can be a
     * polygon, a circle or a polygon encoded in Geobuf format. Including
     * multiple selections will return a validation error.
     * </p>
     * <note>
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html"
     * > geofence polygon</a> format supports a maximum of 1,000 vertices. The
     * <a href=
     * "https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html"
     * >Geofence geobuf</a> format supports a maximum of 100,000 vertices.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geometry <p>
     *            Contains the details to specify the position of the geofence.
     *            Can be a polygon, a circle or a polygon encoded in Geobuf
     *            format. Including multiple selections will return a validation
     *            error.
     *            </p>
     *            <note>
     *            <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html"
     *            > geofence polygon</a> format supports a maximum of 1,000
     *            vertices. The <a href=
     *            "https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html"
     *            >Geofence geobuf</a> format supports a maximum of 100,000
     *            vertices.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutGeofenceRequestEntry withGeometry(GeofenceGeometry geometry) {
        this.geometry = geometry;
        return this;
    }

    /**
     * <p>
     * Associates one of more properties with the geofence. A property is a
     * key-value pair stored with the geofence and added to any geofence event
     * triggered with that geofence.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     *
     * @return <p>
     *         Associates one of more properties with the geofence. A property
     *         is a key-value pair stored with the geofence and added to any
     *         geofence event triggered with that geofence.
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
     * Associates one of more properties with the geofence. A property is a
     * key-value pair stored with the geofence and added to any geofence event
     * triggered with that geofence.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     *
     * @param geofenceProperties <p>
     *            Associates one of more properties with the geofence. A
     *            property is a key-value pair stored with the geofence and
     *            added to any geofence event triggered with that geofence.
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
     * Associates one of more properties with the geofence. A property is a
     * key-value pair stored with the geofence and added to any geofence event
     * triggered with that geofence.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geofenceProperties <p>
     *            Associates one of more properties with the geofence. A
     *            property is a key-value pair stored with the geofence and
     *            added to any geofence event triggered with that geofence.
     *            </p>
     *            <p>
     *            Format: <code>"key" : "value"</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutGeofenceRequestEntry withGeofenceProperties(
            java.util.Map<String, String> geofenceProperties) {
        this.geofenceProperties = geofenceProperties;
        return this;
    }

    /**
     * <p>
     * Associates one of more properties with the geofence. A property is a
     * key-value pair stored with the geofence and added to any geofence event
     * triggered with that geofence.
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
    public BatchPutGeofenceRequestEntry addGeofencePropertiesEntry(String key, String value) {
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
    public BatchPutGeofenceRequestEntry clearGeofencePropertiesEntries() {
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

        if (obj instanceof BatchPutGeofenceRequestEntry == false)
            return false;
        BatchPutGeofenceRequestEntry other = (BatchPutGeofenceRequestEntry) obj;

        if (other.getGeofenceId() == null ^ this.getGeofenceId() == null)
            return false;
        if (other.getGeofenceId() != null
                && other.getGeofenceId().equals(this.getGeofenceId()) == false)
            return false;
        if (other.getGeometry() == null ^ this.getGeometry() == null)
            return false;
        if (other.getGeometry() != null && other.getGeometry().equals(this.getGeometry()) == false)
            return false;
        if (other.getGeofenceProperties() == null ^ this.getGeofenceProperties() == null)
            return false;
        if (other.getGeofenceProperties() != null
                && other.getGeofenceProperties().equals(this.getGeofenceProperties()) == false)
            return false;
        return true;
    }
}
