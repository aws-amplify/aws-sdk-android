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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

/**
 * Accelerated transcoding can significantly speed up jobs with long, visually
 * complex content.
 */
public class AccelerationSettings implements Serializable {
    /**
     * Specify the conditions when the service will run your job with
     * accelerated transcoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, PREFERRED
     */
    private String mode;

    /**
     * Specify the conditions when the service will run your job with
     * accelerated transcoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, PREFERRED
     *
     * @return Specify the conditions when the service will run your job with
     *         accelerated transcoding.
     * @see AccelerationMode
     */
    public String getMode() {
        return mode;
    }

    /**
     * Specify the conditions when the service will run your job with
     * accelerated transcoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, PREFERRED
     *
     * @param mode Specify the conditions when the service will run your job
     *            with accelerated transcoding.
     * @see AccelerationMode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * Specify the conditions when the service will run your job with
     * accelerated transcoding.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, PREFERRED
     *
     * @param mode Specify the conditions when the service will run your job
     *            with accelerated transcoding.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccelerationMode
     */
    public AccelerationSettings withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Specify the conditions when the service will run your job with
     * accelerated transcoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, PREFERRED
     *
     * @param mode Specify the conditions when the service will run your job
     *            with accelerated transcoding.
     * @see AccelerationMode
     */
    public void setMode(AccelerationMode mode) {
        this.mode = mode.toString();
    }

    /**
     * Specify the conditions when the service will run your job with
     * accelerated transcoding.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, PREFERRED
     *
     * @param mode Specify the conditions when the service will run your job
     *            with accelerated transcoding.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccelerationMode
     */
    public AccelerationSettings withMode(AccelerationMode mode) {
        this.mode = mode.toString();
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
        if (getMode() != null)
            sb.append("Mode: " + getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccelerationSettings == false)
            return false;
        AccelerationSettings other = (AccelerationSettings) obj;

        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        return true;
    }
}
