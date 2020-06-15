/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Resets a device and its account to the known default settings. This clears
 * all information and settings set by previous users in the following ways:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Bluetooth - This unpairs all bluetooth devices paired with your echo device.
 * </p>
 * </li>
 * <li>
 * <p>
 * Volume - This resets the echo device's volume to the default value.
 * </p>
 * </li>
 * <li>
 * <p>
 * Notifications - This clears all notifications from your echo device.
 * </p>
 * </li>
 * <li>
 * <p>
 * Lists - This clears all to-do items from your echo device.
 * </p>
 * </li>
 * <li>
 * <p>
 * Settings - This internally syncs the room's profile (if the device is
 * assigned to a room), contacts, address books, delegation access for account
 * linking, and communications (if enabled on the room profile).
 * </p>
 * </li>
 * </ul>
 */
public class StartDeviceSyncRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the room with which the device to sync is associated.
     * Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String roomArn;

    /**
     * <p>
     * The ARN of the device to sync. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String deviceArn;

    /**
     * <p>
     * Request structure to start the device sync. Required.
     * </p>
     */
    private java.util.List<String> features;

    /**
     * <p>
     * The ARN of the room with which the device to sync is associated.
     * Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the room with which the device to sync is associated.
     *         Required.
     *         </p>
     */
    public String getRoomArn() {
        return roomArn;
    }

    /**
     * <p>
     * The ARN of the room with which the device to sync is associated.
     * Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roomArn <p>
     *            The ARN of the room with which the device to sync is
     *            associated. Required.
     *            </p>
     */
    public void setRoomArn(String roomArn) {
        this.roomArn = roomArn;
    }

    /**
     * <p>
     * The ARN of the room with which the device to sync is associated.
     * Required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roomArn <p>
     *            The ARN of the room with which the device to sync is
     *            associated. Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDeviceSyncRequest withRoomArn(String roomArn) {
        this.roomArn = roomArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the device to sync. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the device to sync. Required.
     *         </p>
     */
    public String getDeviceArn() {
        return deviceArn;
    }

    /**
     * <p>
     * The ARN of the device to sync. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param deviceArn <p>
     *            The ARN of the device to sync. Required.
     *            </p>
     */
    public void setDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
    }

    /**
     * <p>
     * The ARN of the device to sync. Required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param deviceArn <p>
     *            The ARN of the device to sync. Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDeviceSyncRequest withDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
        return this;
    }

    /**
     * <p>
     * Request structure to start the device sync. Required.
     * </p>
     *
     * @return <p>
     *         Request structure to start the device sync. Required.
     *         </p>
     */
    public java.util.List<String> getFeatures() {
        return features;
    }

    /**
     * <p>
     * Request structure to start the device sync. Required.
     * </p>
     *
     * @param features <p>
     *            Request structure to start the device sync. Required.
     *            </p>
     */
    public void setFeatures(java.util.Collection<String> features) {
        if (features == null) {
            this.features = null;
            return;
        }

        this.features = new java.util.ArrayList<String>(features);
    }

    /**
     * <p>
     * Request structure to start the device sync. Required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param features <p>
     *            Request structure to start the device sync. Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDeviceSyncRequest withFeatures(String... features) {
        if (getFeatures() == null) {
            this.features = new java.util.ArrayList<String>(features.length);
        }
        for (String value : features) {
            this.features.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Request structure to start the device sync. Required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param features <p>
     *            Request structure to start the device sync. Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDeviceSyncRequest withFeatures(java.util.Collection<String> features) {
        setFeatures(features);
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
        if (getRoomArn() != null)
            sb.append("RoomArn: " + getRoomArn() + ",");
        if (getDeviceArn() != null)
            sb.append("DeviceArn: " + getDeviceArn() + ",");
        if (getFeatures() != null)
            sb.append("Features: " + getFeatures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoomArn() == null) ? 0 : getRoomArn().hashCode());
        hashCode = prime * hashCode + ((getDeviceArn() == null) ? 0 : getDeviceArn().hashCode());
        hashCode = prime * hashCode + ((getFeatures() == null) ? 0 : getFeatures().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDeviceSyncRequest == false)
            return false;
        StartDeviceSyncRequest other = (StartDeviceSyncRequest) obj;

        if (other.getRoomArn() == null ^ this.getRoomArn() == null)
            return false;
        if (other.getRoomArn() != null && other.getRoomArn().equals(this.getRoomArn()) == false)
            return false;
        if (other.getDeviceArn() == null ^ this.getDeviceArn() == null)
            return false;
        if (other.getDeviceArn() != null
                && other.getDeviceArn().equals(this.getDeviceArn()) == false)
            return false;
        if (other.getFeatures() == null ^ this.getFeatures() == null)
            return false;
        if (other.getFeatures() != null && other.getFeatures().equals(this.getFeatures()) == false)
            return false;
        return true;
    }
}
