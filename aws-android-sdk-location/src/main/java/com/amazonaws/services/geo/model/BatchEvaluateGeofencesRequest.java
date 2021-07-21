/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Evaluates device positions against the geofence geometries from a given
 * geofence collection.
 * </p>
 * <p>
 * This operation always returns an empty response because geofences are
 * asynchronously evaluated. The evaluation determines if the device has entered
 * or exited a geofenced area, and then publishes one of the following events to
 * Amazon EventBridge:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>ENTER</code> if Amazon Location determines that the tracked device has
 * entered a geofenced area.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>EXIT</code> if Amazon Location determines that the tracked device has
 * exited a geofenced area.
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * The last geofence that a device was observed within is tracked for 30 days
 * after the most recent device position update.
 * </p>
 * </note>
 */
public class BatchEvaluateGeofencesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The geofence collection used in evaluating the position of devices
     * against its geofences.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     */
    private String collectionName;

    /**
     * <p>
     * Contains device details for each device to be evaluated against the given
     * geofence collection.
     * </p>
     */
    private java.util.List<DevicePositionUpdate> devicePositionUpdates;

    /**
     * <p>
     * The geofence collection used in evaluating the position of devices
     * against its geofences.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @return <p>
     *         The geofence collection used in evaluating the position of
     *         devices against its geofences.
     *         </p>
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     * <p>
     * The geofence collection used in evaluating the position of devices
     * against its geofences.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param collectionName <p>
     *            The geofence collection used in evaluating the position of
     *            devices against its geofences.
     *            </p>
     */
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * <p>
     * The geofence collection used in evaluating the position of devices
     * against its geofences.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param collectionName <p>
     *            The geofence collection used in evaluating the position of
     *            devices against its geofences.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchEvaluateGeofencesRequest withCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }

    /**
     * <p>
     * Contains device details for each device to be evaluated against the given
     * geofence collection.
     * </p>
     *
     * @return <p>
     *         Contains device details for each device to be evaluated against
     *         the given geofence collection.
     *         </p>
     */
    public java.util.List<DevicePositionUpdate> getDevicePositionUpdates() {
        return devicePositionUpdates;
    }

    /**
     * <p>
     * Contains device details for each device to be evaluated against the given
     * geofence collection.
     * </p>
     *
     * @param devicePositionUpdates <p>
     *            Contains device details for each device to be evaluated
     *            against the given geofence collection.
     *            </p>
     */
    public void setDevicePositionUpdates(
            java.util.Collection<DevicePositionUpdate> devicePositionUpdates) {
        if (devicePositionUpdates == null) {
            this.devicePositionUpdates = null;
            return;
        }

        this.devicePositionUpdates = new java.util.ArrayList<DevicePositionUpdate>(
                devicePositionUpdates);
    }

    /**
     * <p>
     * Contains device details for each device to be evaluated against the given
     * geofence collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param devicePositionUpdates <p>
     *            Contains device details for each device to be evaluated
     *            against the given geofence collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchEvaluateGeofencesRequest withDevicePositionUpdates(
            DevicePositionUpdate... devicePositionUpdates) {
        if (getDevicePositionUpdates() == null) {
            this.devicePositionUpdates = new java.util.ArrayList<DevicePositionUpdate>(
                    devicePositionUpdates.length);
        }
        for (DevicePositionUpdate value : devicePositionUpdates) {
            this.devicePositionUpdates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains device details for each device to be evaluated against the given
     * geofence collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param devicePositionUpdates <p>
     *            Contains device details for each device to be evaluated
     *            against the given geofence collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchEvaluateGeofencesRequest withDevicePositionUpdates(
            java.util.Collection<DevicePositionUpdate> devicePositionUpdates) {
        setDevicePositionUpdates(devicePositionUpdates);
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
        if (getCollectionName() != null)
            sb.append("CollectionName: " + getCollectionName() + ",");
        if (getDevicePositionUpdates() != null)
            sb.append("DevicePositionUpdates: " + getDevicePositionUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCollectionName() == null) ? 0 : getCollectionName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDevicePositionUpdates() == null) ? 0 : getDevicePositionUpdates().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchEvaluateGeofencesRequest == false)
            return false;
        BatchEvaluateGeofencesRequest other = (BatchEvaluateGeofencesRequest) obj;

        if (other.getCollectionName() == null ^ this.getCollectionName() == null)
            return false;
        if (other.getCollectionName() != null
                && other.getCollectionName().equals(this.getCollectionName()) == false)
            return false;
        if (other.getDevicePositionUpdates() == null ^ this.getDevicePositionUpdates() == null)
            return false;
        if (other.getDevicePositionUpdates() != null
                && other.getDevicePositionUpdates().equals(this.getDevicePositionUpdates()) == false)
            return false;
        return true;
    }
}
