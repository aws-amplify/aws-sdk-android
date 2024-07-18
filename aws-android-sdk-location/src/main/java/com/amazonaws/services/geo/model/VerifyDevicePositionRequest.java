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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Verifies the integrity of the device's position by determining if it was
 * reported behind a proxy, and by comparing it to an inferred position
 * estimated based on the device's state.
 * </p>
 */
public class VerifyDevicePositionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the tracker resource to be associated with verification
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     */
    private String trackerName;

    /**
     * <p>
     * The device's state, including position, IP address, cell signals and
     * Wi-Fi access points.
     * </p>
     */
    private DeviceState deviceState;

    /**
     * <p>
     * The distance unit for the verification request.
     * </p>
     * <p>
     * Default Value: <code>Kilometers</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     */
    private String distanceUnit;

    /**
     * <p>
     * The name of the tracker resource to be associated with verification
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @return <p>
     *         The name of the tracker resource to be associated with
     *         verification request.
     *         </p>
     */
    public String getTrackerName() {
        return trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource to be associated with verification
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @param trackerName <p>
     *            The name of the tracker resource to be associated with
     *            verification request.
     *            </p>
     */
    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource to be associated with verification
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @param trackerName <p>
     *            The name of the tracker resource to be associated with
     *            verification request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifyDevicePositionRequest withTrackerName(String trackerName) {
        this.trackerName = trackerName;
        return this;
    }

    /**
     * <p>
     * The device's state, including position, IP address, cell signals and
     * Wi-Fi access points.
     * </p>
     *
     * @return <p>
     *         The device's state, including position, IP address, cell signals
     *         and Wi-Fi access points.
     *         </p>
     */
    public DeviceState getDeviceState() {
        return deviceState;
    }

    /**
     * <p>
     * The device's state, including position, IP address, cell signals and
     * Wi-Fi access points.
     * </p>
     *
     * @param deviceState <p>
     *            The device's state, including position, IP address, cell
     *            signals and Wi-Fi access points.
     *            </p>
     */
    public void setDeviceState(DeviceState deviceState) {
        this.deviceState = deviceState;
    }

    /**
     * <p>
     * The device's state, including position, IP address, cell signals and
     * Wi-Fi access points.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceState <p>
     *            The device's state, including position, IP address, cell
     *            signals and Wi-Fi access points.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifyDevicePositionRequest withDeviceState(DeviceState deviceState) {
        this.deviceState = deviceState;
        return this;
    }

    /**
     * <p>
     * The distance unit for the verification request.
     * </p>
     * <p>
     * Default Value: <code>Kilometers</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @return <p>
     *         The distance unit for the verification request.
     *         </p>
     *         <p>
     *         Default Value: <code>Kilometers</code>
     *         </p>
     * @see DistanceUnit
     */
    public String getDistanceUnit() {
        return distanceUnit;
    }

    /**
     * <p>
     * The distance unit for the verification request.
     * </p>
     * <p>
     * Default Value: <code>Kilometers</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @param distanceUnit <p>
     *            The distance unit for the verification request.
     *            </p>
     *            <p>
     *            Default Value: <code>Kilometers</code>
     *            </p>
     * @see DistanceUnit
     */
    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    /**
     * <p>
     * The distance unit for the verification request.
     * </p>
     * <p>
     * Default Value: <code>Kilometers</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @param distanceUnit <p>
     *            The distance unit for the verification request.
     *            </p>
     *            <p>
     *            Default Value: <code>Kilometers</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DistanceUnit
     */
    public VerifyDevicePositionRequest withDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
        return this;
    }

    /**
     * <p>
     * The distance unit for the verification request.
     * </p>
     * <p>
     * Default Value: <code>Kilometers</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @param distanceUnit <p>
     *            The distance unit for the verification request.
     *            </p>
     *            <p>
     *            Default Value: <code>Kilometers</code>
     *            </p>
     * @see DistanceUnit
     */
    public void setDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit.toString();
    }

    /**
     * <p>
     * The distance unit for the verification request.
     * </p>
     * <p>
     * Default Value: <code>Kilometers</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @param distanceUnit <p>
     *            The distance unit for the verification request.
     *            </p>
     *            <p>
     *            Default Value: <code>Kilometers</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DistanceUnit
     */
    public VerifyDevicePositionRequest withDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit.toString();
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
        if (getDeviceState() != null)
            sb.append("DeviceState: " + getDeviceState() + ",");
        if (getDistanceUnit() != null)
            sb.append("DistanceUnit: " + getDistanceUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTrackerName() == null) ? 0 : getTrackerName().hashCode());
        hashCode = prime * hashCode
                + ((getDeviceState() == null) ? 0 : getDeviceState().hashCode());
        hashCode = prime * hashCode
                + ((getDistanceUnit() == null) ? 0 : getDistanceUnit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifyDevicePositionRequest == false)
            return false;
        VerifyDevicePositionRequest other = (VerifyDevicePositionRequest) obj;

        if (other.getTrackerName() == null ^ this.getTrackerName() == null)
            return false;
        if (other.getTrackerName() != null
                && other.getTrackerName().equals(this.getTrackerName()) == false)
            return false;
        if (other.getDeviceState() == null ^ this.getDeviceState() == null)
            return false;
        if (other.getDeviceState() != null
                && other.getDeviceState().equals(this.getDeviceState()) == false)
            return false;
        if (other.getDistanceUnit() == null ^ this.getDistanceUnit() == null)
            return false;
        if (other.getDistanceUnit() != null
                && other.getDistanceUnit().equals(this.getDistanceUnit()) == false)
            return false;
        return true;
    }
}
