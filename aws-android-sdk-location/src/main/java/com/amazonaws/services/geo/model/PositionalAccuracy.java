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
 * Defines the level of certainty of the position.
 * </p>
 */
public class PositionalAccuracy implements Serializable {
    /**
     * <p>
     * Estimated maximum distance, in meters, between the measured position and
     * the true position of a device, along the Earth's surface.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10000<br/>
     */
    private Double horizontal;

    /**
     * <p>
     * Estimated maximum distance, in meters, between the measured position and
     * the true position of a device, along the Earth's surface.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10000<br/>
     *
     * @return <p>
     *         Estimated maximum distance, in meters, between the measured
     *         position and the true position of a device, along the Earth's
     *         surface.
     *         </p>
     */
    public Double getHorizontal() {
        return horizontal;
    }

    /**
     * <p>
     * Estimated maximum distance, in meters, between the measured position and
     * the true position of a device, along the Earth's surface.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10000<br/>
     *
     * @param horizontal <p>
     *            Estimated maximum distance, in meters, between the measured
     *            position and the true position of a device, along the Earth's
     *            surface.
     *            </p>
     */
    public void setHorizontal(Double horizontal) {
        this.horizontal = horizontal;
    }

    /**
     * <p>
     * Estimated maximum distance, in meters, between the measured position and
     * the true position of a device, along the Earth's surface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10000<br/>
     *
     * @param horizontal <p>
     *            Estimated maximum distance, in meters, between the measured
     *            position and the true position of a device, along the Earth's
     *            surface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PositionalAccuracy withHorizontal(Double horizontal) {
        this.horizontal = horizontal;
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
        if (getHorizontal() != null)
            sb.append("Horizontal: " + getHorizontal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHorizontal() == null) ? 0 : getHorizontal().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PositionalAccuracy == false)
            return false;
        PositionalAccuracy other = (PositionalAccuracy) obj;

        if (other.getHorizontal() == null ^ this.getHorizontal() == null)
            return false;
        if (other.getHorizontal() != null
                && other.getHorizontal().equals(this.getHorizontal()) == false)
            return false;
        return true;
    }
}
