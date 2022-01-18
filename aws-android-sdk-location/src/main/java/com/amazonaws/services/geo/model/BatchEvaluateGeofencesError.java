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
 * Contains error details for each device that failed to evaluate its position
 * against the geofences in a given geofence collection.
 * </p>
 */
public class BatchEvaluateGeofencesError implements Serializable {
    /**
     * <p>
     * The device associated with the position evaluation error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\p{L}\p{N}]+$<br/>
     */
    private String deviceId;

    /**
     * <p>
     * Contains details associated to the batch error.
     * </p>
     */
    private BatchItemError error;

    /**
     * <p>
     * Specifies a timestamp for when the error occurred in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     */
    private java.util.Date sampleTime;

    /**
     * <p>
     * The device associated with the position evaluation error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\p{L}\p{N}]+$<br/>
     *
     * @return <p>
     *         The device associated with the position evaluation error.
     *         </p>
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * <p>
     * The device associated with the position evaluation error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\p{L}\p{N}]+$<br/>
     *
     * @param deviceId <p>
     *            The device associated with the position evaluation error.
     *            </p>
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The device associated with the position evaluation error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\p{L}\p{N}]+$<br/>
     *
     * @param deviceId <p>
     *            The device associated with the position evaluation error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchEvaluateGeofencesError withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * <p>
     * Contains details associated to the batch error.
     * </p>
     *
     * @return <p>
     *         Contains details associated to the batch error.
     *         </p>
     */
    public BatchItemError getError() {
        return error;
    }

    /**
     * <p>
     * Contains details associated to the batch error.
     * </p>
     *
     * @param error <p>
     *            Contains details associated to the batch error.
     *            </p>
     */
    public void setError(BatchItemError error) {
        this.error = error;
    }

    /**
     * <p>
     * Contains details associated to the batch error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param error <p>
     *            Contains details associated to the batch error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchEvaluateGeofencesError withError(BatchItemError error) {
        this.error = error;
        return this;
    }

    /**
     * <p>
     * Specifies a timestamp for when the error occurred in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     *
     * @return <p>
     *         Specifies a timestamp for when the error occurred in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *         8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     *         </p>
     */
    public java.util.Date getSampleTime() {
        return sampleTime;
    }

    /**
     * <p>
     * Specifies a timestamp for when the error occurred in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     *
     * @param sampleTime <p>
     *            Specifies a timestamp for when the error occurred in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     *            </p>
     */
    public void setSampleTime(java.util.Date sampleTime) {
        this.sampleTime = sampleTime;
    }

    /**
     * <p>
     * Specifies a timestamp for when the error occurred in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sampleTime <p>
     *            Specifies a timestamp for when the error occurred in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchEvaluateGeofencesError withSampleTime(java.util.Date sampleTime) {
        this.sampleTime = sampleTime;
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
        if (getDeviceId() != null)
            sb.append("DeviceId: " + getDeviceId() + ",");
        if (getError() != null)
            sb.append("Error: " + getError() + ",");
        if (getSampleTime() != null)
            sb.append("SampleTime: " + getSampleTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getSampleTime() == null) ? 0 : getSampleTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchEvaluateGeofencesError == false)
            return false;
        BatchEvaluateGeofencesError other = (BatchEvaluateGeofencesError) obj;

        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getSampleTime() == null ^ this.getSampleTime() == null)
            return false;
        if (other.getSampleTime() != null
                && other.getSampleTime().equals(this.getSampleTime()) == false)
            return false;
        return true;
    }
}
