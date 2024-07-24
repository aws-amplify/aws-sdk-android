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

public class VerifyDevicePositionResult implements Serializable {
    /**
     * <p>
     * The inferred state of the device, given the provided position, IP
     * address, cellular signals, and Wi-Fi- access points.
     * </p>
     */
    private InferredState inferredState;

    /**
     * <p>
     * The device identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\p{L}\p{N}]+<br/>
     */
    private String deviceId;

    /**
     * <p>
     * The timestamp at which the device's position was determined. Uses <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601
     * </a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date sampleTime;

    /**
     * <p>
     * The timestamp for when the tracker resource received the device position
     * in <a href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601 </a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date receivedTime;

    /**
     * <p>
     * The distance unit for the verification response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     */
    private String distanceUnit;

    /**
     * <p>
     * The inferred state of the device, given the provided position, IP
     * address, cellular signals, and Wi-Fi- access points.
     * </p>
     *
     * @return <p>
     *         The inferred state of the device, given the provided position, IP
     *         address, cellular signals, and Wi-Fi- access points.
     *         </p>
     */
    public InferredState getInferredState() {
        return inferredState;
    }

    /**
     * <p>
     * The inferred state of the device, given the provided position, IP
     * address, cellular signals, and Wi-Fi- access points.
     * </p>
     *
     * @param inferredState <p>
     *            The inferred state of the device, given the provided position,
     *            IP address, cellular signals, and Wi-Fi- access points.
     *            </p>
     */
    public void setInferredState(InferredState inferredState) {
        this.inferredState = inferredState;
    }

    /**
     * <p>
     * The inferred state of the device, given the provided position, IP
     * address, cellular signals, and Wi-Fi- access points.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inferredState <p>
     *            The inferred state of the device, given the provided position,
     *            IP address, cellular signals, and Wi-Fi- access points.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifyDevicePositionResult withInferredState(InferredState inferredState) {
        this.inferredState = inferredState;
        return this;
    }

    /**
     * <p>
     * The device identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\p{L}\p{N}]+<br/>
     *
     * @return <p>
     *         The device identifier.
     *         </p>
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * <p>
     * The device identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\p{L}\p{N}]+<br/>
     *
     * @param deviceId <p>
     *            The device identifier.
     *            </p>
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The device identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\p{L}\p{N}]+<br/>
     *
     * @param deviceId <p>
     *            The device identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifyDevicePositionResult withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * <p>
     * The timestamp at which the device's position was determined. Uses <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601
     * </a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     *
     * @return <p>
     *         The timestamp at which the device's position was determined. Uses
     *         <a href="https://www.iso.org/iso-8601-date-and-time-format.html">
     *         ISO 8601 </a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *         </p>
     */
    public java.util.Date getSampleTime() {
        return sampleTime;
    }

    /**
     * <p>
     * The timestamp at which the device's position was determined. Uses <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601
     * </a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     *
     * @param sampleTime <p>
     *            The timestamp at which the device's position was determined.
     *            Uses <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     *            8601 </a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *            </p>
     */
    public void setSampleTime(java.util.Date sampleTime) {
        this.sampleTime = sampleTime;
    }

    /**
     * <p>
     * The timestamp at which the device's position was determined. Uses <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601
     * </a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sampleTime <p>
     *            The timestamp at which the device's position was determined.
     *            Uses <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     *            8601 </a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifyDevicePositionResult withSampleTime(java.util.Date sampleTime) {
        this.sampleTime = sampleTime;
        return this;
    }

    /**
     * <p>
     * The timestamp for when the tracker resource received the device position
     * in <a href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601 </a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     *
     * @return <p>
     *         The timestamp for when the tracker resource received the device
     *         position in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">
     *         ISO 8601 </a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *         </p>
     */
    public java.util.Date getReceivedTime() {
        return receivedTime;
    }

    /**
     * <p>
     * The timestamp for when the tracker resource received the device position
     * in <a href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601 </a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     *
     * @param receivedTime <p>
     *            The timestamp for when the tracker resource received the
     *            device position in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     *            8601 </a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *            </p>
     */
    public void setReceivedTime(java.util.Date receivedTime) {
        this.receivedTime = receivedTime;
    }

    /**
     * <p>
     * The timestamp for when the tracker resource received the device position
     * in <a href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601 </a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param receivedTime <p>
     *            The timestamp for when the tracker resource received the
     *            device position in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     *            8601 </a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifyDevicePositionResult withReceivedTime(java.util.Date receivedTime) {
        this.receivedTime = receivedTime;
        return this;
    }

    /**
     * <p>
     * The distance unit for the verification response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @return <p>
     *         The distance unit for the verification response.
     *         </p>
     * @see DistanceUnit
     */
    public String getDistanceUnit() {
        return distanceUnit;
    }

    /**
     * <p>
     * The distance unit for the verification response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @param distanceUnit <p>
     *            The distance unit for the verification response.
     *            </p>
     * @see DistanceUnit
     */
    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    /**
     * <p>
     * The distance unit for the verification response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @param distanceUnit <p>
     *            The distance unit for the verification response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DistanceUnit
     */
    public VerifyDevicePositionResult withDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
        return this;
    }

    /**
     * <p>
     * The distance unit for the verification response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @param distanceUnit <p>
     *            The distance unit for the verification response.
     *            </p>
     * @see DistanceUnit
     */
    public void setDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit.toString();
    }

    /**
     * <p>
     * The distance unit for the verification response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @param distanceUnit <p>
     *            The distance unit for the verification response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DistanceUnit
     */
    public VerifyDevicePositionResult withDistanceUnit(DistanceUnit distanceUnit) {
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
        if (getInferredState() != null)
            sb.append("InferredState: " + getInferredState() + ",");
        if (getDeviceId() != null)
            sb.append("DeviceId: " + getDeviceId() + ",");
        if (getSampleTime() != null)
            sb.append("SampleTime: " + getSampleTime() + ",");
        if (getReceivedTime() != null)
            sb.append("ReceivedTime: " + getReceivedTime() + ",");
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
                + ((getInferredState() == null) ? 0 : getInferredState().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getSampleTime() == null) ? 0 : getSampleTime().hashCode());
        hashCode = prime * hashCode
                + ((getReceivedTime() == null) ? 0 : getReceivedTime().hashCode());
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

        if (obj instanceof VerifyDevicePositionResult == false)
            return false;
        VerifyDevicePositionResult other = (VerifyDevicePositionResult) obj;

        if (other.getInferredState() == null ^ this.getInferredState() == null)
            return false;
        if (other.getInferredState() != null
                && other.getInferredState().equals(this.getInferredState()) == false)
            return false;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getSampleTime() == null ^ this.getSampleTime() == null)
            return false;
        if (other.getSampleTime() != null
                && other.getSampleTime().equals(this.getSampleTime()) == false)
            return false;
        if (other.getReceivedTime() == null ^ this.getReceivedTime() == null)
            return false;
        if (other.getReceivedTime() != null
                && other.getReceivedTime().equals(this.getReceivedTime()) == false)
            return false;
        if (other.getDistanceUnit() == null ^ this.getDistanceUnit() == null)
            return false;
        if (other.getDistanceUnit() != null
                && other.getDistanceUnit().equals(this.getDistanceUnit()) == false)
            return false;
        return true;
    }
}
