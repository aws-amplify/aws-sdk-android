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

/**
 * <p>
 * The device's position, IP address, and WiFi access points.
 * </p>
 */
public class ForecastGeofenceEventsDeviceState implements Serializable {
    /**
     * <p>
     * The device's position.
     * </p>
     */
    private java.util.List<Double> position;

    /**
     * <p>
     * The device's speed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - <br/>
     */
    private Double speed;

    /**
     * <p>
     * The device's position.
     * </p>
     *
     * @return <p>
     *         The device's position.
     *         </p>
     */
    public java.util.List<Double> getPosition() {
        return position;
    }

    /**
     * <p>
     * The device's position.
     * </p>
     *
     * @param position <p>
     *            The device's position.
     *            </p>
     */
    public void setPosition(java.util.Collection<Double> position) {
        if (position == null) {
            this.position = null;
            return;
        }

        this.position = new java.util.ArrayList<Double>(position);
    }

    /**
     * <p>
     * The device's position.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param position <p>
     *            The device's position.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForecastGeofenceEventsDeviceState withPosition(Double... position) {
        if (getPosition() == null) {
            this.position = new java.util.ArrayList<Double>(position.length);
        }
        for (Double value : position) {
            this.position.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The device's position.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param position <p>
     *            The device's position.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForecastGeofenceEventsDeviceState withPosition(java.util.Collection<Double> position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * The device's speed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - <br/>
     *
     * @return <p>
     *         The device's speed.
     *         </p>
     */
    public Double getSpeed() {
        return speed;
    }

    /**
     * <p>
     * The device's speed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - <br/>
     *
     * @param speed <p>
     *            The device's speed.
     *            </p>
     */
    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    /**
     * <p>
     * The device's speed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - <br/>
     *
     * @param speed <p>
     *            The device's speed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForecastGeofenceEventsDeviceState withSpeed(Double speed) {
        this.speed = speed;
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
        if (getPosition() != null)
            sb.append("Position: " + getPosition() + ",");
        if (getSpeed() != null)
            sb.append("Speed: " + getSpeed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getSpeed() == null) ? 0 : getSpeed().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ForecastGeofenceEventsDeviceState == false)
            return false;
        ForecastGeofenceEventsDeviceState other = (ForecastGeofenceEventsDeviceState) obj;

        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getSpeed() == null ^ this.getSpeed() == null)
            return false;
        if (other.getSpeed() != null && other.getSpeed().equals(this.getSpeed()) == false)
            return false;
        return true;
    }
}
