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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Uploads position update data for one or more devices to a tracker resource.
 * Amazon Location uses the data when it reports the last known device position
 * and position history. Amazon Location retains location data for 30 days.
 * </p>
 * <note>
 * <p>
 * Position updates are handled based on the <code>PositionFiltering</code>
 * property of the tracker. When <code>PositionFiltering</code> is set to
 * <code>TimeBased</code>, updates are evaluated against linked geofence
 * collections, and location data is stored at a maximum of one position per 30
 * second interval. If your update frequency is more often than every 30
 * seconds, only one update per 30 seconds is stored for each unique device ID.
 * </p>
 * <p>
 * When <code>PositionFiltering</code> is set to <code>DistanceBased</code>
 * filtering, location data is stored and evaluated against linked geofence
 * collections only if the device has moved more than 30 m (98.4 ft).
 * </p>
 * <p>
 * When <code>PositionFiltering</code> is set to <code>AccuracyBased</code>
 * filtering, location data is stored and evaluated against linked geofence
 * collections only if the device has moved more than the measured accuracy. For
 * example, if two consecutive updates from a device have a horizontal accuracy
 * of 5 m and 10 m, the second update is neither stored or evaluated if the
 * device has moved less than 15 m. If <code>PositionFiltering</code> is set to
 * <code>AccuracyBased</code> filtering, Amazon Location uses the default value
 * <code>{ "Horizontal": 0}</code> when accuracy is not provided on a
 * <code>DevicePositionUpdate</code>.
 * </p>
 * </note>
 */
public class BatchUpdateDevicePositionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the tracker resource to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     */
    private String trackerName;

    /**
     * <p>
     * Contains the position update details for each device.
     * </p>
     */
    private java.util.List<DevicePositionUpdate> updates;

    /**
     * <p>
     * The name of the tracker resource to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @return <p>
     *         The name of the tracker resource to update.
     *         </p>
     */
    public String getTrackerName() {
        return trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param trackerName <p>
     *            The name of the tracker resource to update.
     *            </p>
     */
    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param trackerName <p>
     *            The name of the tracker resource to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateDevicePositionRequest withTrackerName(String trackerName) {
        this.trackerName = trackerName;
        return this;
    }

    /**
     * <p>
     * Contains the position update details for each device.
     * </p>
     *
     * @return <p>
     *         Contains the position update details for each device.
     *         </p>
     */
    public java.util.List<DevicePositionUpdate> getUpdates() {
        return updates;
    }

    /**
     * <p>
     * Contains the position update details for each device.
     * </p>
     *
     * @param updates <p>
     *            Contains the position update details for each device.
     *            </p>
     */
    public void setUpdates(java.util.Collection<DevicePositionUpdate> updates) {
        if (updates == null) {
            this.updates = null;
            return;
        }

        this.updates = new java.util.ArrayList<DevicePositionUpdate>(updates);
    }

    /**
     * <p>
     * Contains the position update details for each device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updates <p>
     *            Contains the position update details for each device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateDevicePositionRequest withUpdates(DevicePositionUpdate... updates) {
        if (getUpdates() == null) {
            this.updates = new java.util.ArrayList<DevicePositionUpdate>(updates.length);
        }
        for (DevicePositionUpdate value : updates) {
            this.updates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains the position update details for each device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updates <p>
     *            Contains the position update details for each device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateDevicePositionRequest withUpdates(
            java.util.Collection<DevicePositionUpdate> updates) {
        setUpdates(updates);
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
        if (getTrackerName() != null)
            sb.append("TrackerName: " + getTrackerName() + ",");
        if (getUpdates() != null)
            sb.append("Updates: " + getUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTrackerName() == null) ? 0 : getTrackerName().hashCode());
        hashCode = prime * hashCode + ((getUpdates() == null) ? 0 : getUpdates().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateDevicePositionRequest == false)
            return false;
        BatchUpdateDevicePositionRequest other = (BatchUpdateDevicePositionRequest) obj;

        if (other.getTrackerName() == null ^ this.getTrackerName() == null)
            return false;
        if (other.getTrackerName() != null
                && other.getTrackerName().equals(this.getTrackerName()) == false)
            return false;
        if (other.getUpdates() == null ^ this.getUpdates() == null)
            return false;
        if (other.getUpdates() != null && other.getUpdates().equals(this.getUpdates()) == false)
            return false;
        return true;
    }
}
