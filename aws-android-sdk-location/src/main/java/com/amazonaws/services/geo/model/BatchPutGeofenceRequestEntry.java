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
     * <b>Pattern: </b>^[-._\p{L}\p{N}]+$<br/>
     */
    private String geofenceId;

    /**
     * <p>
     * Contains the polygon details to specify the position of the geofence.
     * </p>
     * <note>
     * <p>
     * Each <a href=
     * "https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html"
     * >geofence polygon</a> can have a maximum of 1,000 vertices.
     * </p>
     * </note>
     */
    private GeofenceGeometry geometry;

    /**
     * <p>
     * The identifier for the geofence to be stored in a given geofence
     * collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\p{L}\p{N}]+$<br/>
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
     * <b>Pattern: </b>^[-._\p{L}\p{N}]+$<br/>
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
     * <b>Pattern: </b>^[-._\p{L}\p{N}]+$<br/>
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
     * Contains the polygon details to specify the position of the geofence.
     * </p>
     * <note>
     * <p>
     * Each <a href=
     * "https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html"
     * >geofence polygon</a> can have a maximum of 1,000 vertices.
     * </p>
     * </note>
     *
     * @return <p>
     *         Contains the polygon details to specify the position of the
     *         geofence.
     *         </p>
     *         <note>
     *         <p>
     *         Each <a href=
     *         "https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html"
     *         >geofence polygon</a> can have a maximum of 1,000 vertices.
     *         </p>
     *         </note>
     */
    public GeofenceGeometry getGeometry() {
        return geometry;
    }

    /**
     * <p>
     * Contains the polygon details to specify the position of the geofence.
     * </p>
     * <note>
     * <p>
     * Each <a href=
     * "https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html"
     * >geofence polygon</a> can have a maximum of 1,000 vertices.
     * </p>
     * </note>
     *
     * @param geometry <p>
     *            Contains the polygon details to specify the position of the
     *            geofence.
     *            </p>
     *            <note>
     *            <p>
     *            Each <a href=
     *            "https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html"
     *            >geofence polygon</a> can have a maximum of 1,000 vertices.
     *            </p>
     *            </note>
     */
    public void setGeometry(GeofenceGeometry geometry) {
        this.geometry = geometry;
    }

    /**
     * <p>
     * Contains the polygon details to specify the position of the geofence.
     * </p>
     * <note>
     * <p>
     * Each <a href=
     * "https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html"
     * >geofence polygon</a> can have a maximum of 1,000 vertices.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geometry <p>
     *            Contains the polygon details to specify the position of the
     *            geofence.
     *            </p>
     *            <note>
     *            <p>
     *            Each <a href=
     *            "https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html"
     *            >geofence polygon</a> can have a maximum of 1,000 vertices.
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
            sb.append("Geometry: " + getGeometry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGeofenceId() == null) ? 0 : getGeofenceId().hashCode());
        hashCode = prime * hashCode + ((getGeometry() == null) ? 0 : getGeometry().hashCode());
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
        return true;
    }
}
