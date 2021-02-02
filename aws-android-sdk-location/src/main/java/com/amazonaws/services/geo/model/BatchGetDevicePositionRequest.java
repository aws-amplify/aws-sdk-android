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
 * A batch request to retrieve device positions.
 * </p>
 * <note>
 * <p>
 * The response will return the device positions from the last 24 hours.
 * </p>
 * </note>
 */
public class BatchGetDevicePositionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Devices whose position you want to retrieve.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, for two devices:
     * <code>device-ids=DeviceId1&amp;device-ids=DeviceId2</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> deviceIds;

    /**
     * <p>
     * The tracker resource retrieving the device position.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     */
    private String trackerName;

    /**
     * <p>
     * Devices whose position you want to retrieve.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, for two devices:
     * <code>device-ids=DeviceId1&amp;device-ids=DeviceId2</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Devices whose position you want to retrieve.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For example, for two devices:
     *         <code>device-ids=DeviceId1&amp;device-ids=DeviceId2</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getDeviceIds() {
        return deviceIds;
    }

    /**
     * <p>
     * Devices whose position you want to retrieve.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, for two devices:
     * <code>device-ids=DeviceId1&amp;device-ids=DeviceId2</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param deviceIds <p>
     *            Devices whose position you want to retrieve.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For example, for two devices:
     *            <code>device-ids=DeviceId1&amp;device-ids=DeviceId2</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDeviceIds(java.util.Collection<String> deviceIds) {
        if (deviceIds == null) {
            this.deviceIds = null;
            return;
        }

        this.deviceIds = new java.util.ArrayList<String>(deviceIds);
    }

    /**
     * <p>
     * Devices whose position you want to retrieve.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, for two devices:
     * <code>device-ids=DeviceId1&amp;device-ids=DeviceId2</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceIds <p>
     *            Devices whose position you want to retrieve.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For example, for two devices:
     *            <code>device-ids=DeviceId1&amp;device-ids=DeviceId2</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDevicePositionRequest withDeviceIds(String... deviceIds) {
        if (getDeviceIds() == null) {
            this.deviceIds = new java.util.ArrayList<String>(deviceIds.length);
        }
        for (String value : deviceIds) {
            this.deviceIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Devices whose position you want to retrieve.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, for two devices:
     * <code>device-ids=DeviceId1&amp;device-ids=DeviceId2</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceIds <p>
     *            Devices whose position you want to retrieve.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For example, for two devices:
     *            <code>device-ids=DeviceId1&amp;device-ids=DeviceId2</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDevicePositionRequest withDeviceIds(java.util.Collection<String> deviceIds) {
        setDeviceIds(deviceIds);
        return this;
    }

    /**
     * <p>
     * The tracker resource retrieving the device position.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @return <p>
     *         The tracker resource retrieving the device position.
     *         </p>
     */
    public String getTrackerName() {
        return trackerName;
    }

    /**
     * <p>
     * The tracker resource retrieving the device position.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param trackerName <p>
     *            The tracker resource retrieving the device position.
     *            </p>
     */
    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    /**
     * <p>
     * The tracker resource retrieving the device position.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param trackerName <p>
     *            The tracker resource retrieving the device position.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDevicePositionRequest withTrackerName(String trackerName) {
        this.trackerName = trackerName;
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
        if (getDeviceIds() != null)
            sb.append("DeviceIds: " + getDeviceIds() + ",");
        if (getTrackerName() != null)
            sb.append("TrackerName: " + getTrackerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceIds() == null) ? 0 : getDeviceIds().hashCode());
        hashCode = prime * hashCode
                + ((getTrackerName() == null) ? 0 : getTrackerName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetDevicePositionRequest == false)
            return false;
        BatchGetDevicePositionRequest other = (BatchGetDevicePositionRequest) obj;

        if (other.getDeviceIds() == null ^ this.getDeviceIds() == null)
            return false;
        if (other.getDeviceIds() != null
                && other.getDeviceIds().equals(this.getDeviceIds()) == false)
            return false;
        if (other.getTrackerName() == null ^ this.getTrackerName() == null)
            return false;
        if (other.getTrackerName() != null
                && other.getTrackerName().equals(this.getTrackerName()) == false)
            return false;
        return true;
    }
}
