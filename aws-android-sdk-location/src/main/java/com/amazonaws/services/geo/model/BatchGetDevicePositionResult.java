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

public class BatchGetDevicePositionResult implements Serializable {
    /**
     * <p>
     * Contains device position details such as the device ID, position, and
     * timestamps for when the position was received and sampled.
     * </p>
     */
    private java.util.List<DevicePosition> devicePositions;

    /**
     * <p>
     * Contains error details for each device that failed to send its position
     * to the tracker resource.
     * </p>
     */
    private java.util.List<BatchGetDevicePositionError> errors;

    /**
     * <p>
     * Contains device position details such as the device ID, position, and
     * timestamps for when the position was received and sampled.
     * </p>
     *
     * @return <p>
     *         Contains device position details such as the device ID, position,
     *         and timestamps for when the position was received and sampled.
     *         </p>
     */
    public java.util.List<DevicePosition> getDevicePositions() {
        return devicePositions;
    }

    /**
     * <p>
     * Contains device position details such as the device ID, position, and
     * timestamps for when the position was received and sampled.
     * </p>
     *
     * @param devicePositions <p>
     *            Contains device position details such as the device ID,
     *            position, and timestamps for when the position was received
     *            and sampled.
     *            </p>
     */
    public void setDevicePositions(java.util.Collection<DevicePosition> devicePositions) {
        if (devicePositions == null) {
            this.devicePositions = null;
            return;
        }

        this.devicePositions = new java.util.ArrayList<DevicePosition>(devicePositions);
    }

    /**
     * <p>
     * Contains device position details such as the device ID, position, and
     * timestamps for when the position was received and sampled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param devicePositions <p>
     *            Contains device position details such as the device ID,
     *            position, and timestamps for when the position was received
     *            and sampled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDevicePositionResult withDevicePositions(DevicePosition... devicePositions) {
        if (getDevicePositions() == null) {
            this.devicePositions = new java.util.ArrayList<DevicePosition>(devicePositions.length);
        }
        for (DevicePosition value : devicePositions) {
            this.devicePositions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains device position details such as the device ID, position, and
     * timestamps for when the position was received and sampled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param devicePositions <p>
     *            Contains device position details such as the device ID,
     *            position, and timestamps for when the position was received
     *            and sampled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDevicePositionResult withDevicePositions(
            java.util.Collection<DevicePosition> devicePositions) {
        setDevicePositions(devicePositions);
        return this;
    }

    /**
     * <p>
     * Contains error details for each device that failed to send its position
     * to the tracker resource.
     * </p>
     *
     * @return <p>
     *         Contains error details for each device that failed to send its
     *         position to the tracker resource.
     *         </p>
     */
    public java.util.List<BatchGetDevicePositionError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Contains error details for each device that failed to send its position
     * to the tracker resource.
     * </p>
     *
     * @param errors <p>
     *            Contains error details for each device that failed to send its
     *            position to the tracker resource.
     *            </p>
     */
    public void setErrors(java.util.Collection<BatchGetDevicePositionError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchGetDevicePositionError>(errors);
    }

    /**
     * <p>
     * Contains error details for each device that failed to send its position
     * to the tracker resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            Contains error details for each device that failed to send its
     *            position to the tracker resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDevicePositionResult withErrors(BatchGetDevicePositionError... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<BatchGetDevicePositionError>(errors.length);
        }
        for (BatchGetDevicePositionError value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains error details for each device that failed to send its position
     * to the tracker resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            Contains error details for each device that failed to send its
     *            position to the tracker resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDevicePositionResult withErrors(
            java.util.Collection<BatchGetDevicePositionError> errors) {
        setErrors(errors);
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
        if (getDevicePositions() != null)
            sb.append("DevicePositions: " + getDevicePositions() + ",");
        if (getErrors() != null)
            sb.append("Errors: " + getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDevicePositions() == null) ? 0 : getDevicePositions().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetDevicePositionResult == false)
            return false;
        BatchGetDevicePositionResult other = (BatchGetDevicePositionResult) obj;

        if (other.getDevicePositions() == null ^ this.getDevicePositions() == null)
            return false;
        if (other.getDevicePositions() != null
                && other.getDevicePositions().equals(this.getDevicePositions()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }
}
