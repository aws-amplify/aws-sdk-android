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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class DescribeAvailabilityZonesResult implements Serializable {
    /**
     * <p>
     * Information about the Availability Zones and Local Zones.
     * </p>
     */
    private java.util.List<AvailabilityZone> availabilityZones;

    /**
     * <p>
     * Information about the Availability Zones and Local Zones.
     * </p>
     *
     * @return <p>
     *         Information about the Availability Zones and Local Zones.
     *         </p>
     */
    public java.util.List<AvailabilityZone> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * Information about the Availability Zones and Local Zones.
     * </p>
     *
     * @param availabilityZones <p>
     *            Information about the Availability Zones and Local Zones.
     *            </p>
     */
    public void setAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<AvailabilityZone>(availabilityZones);
    }

    /**
     * <p>
     * Information about the Availability Zones and Local Zones.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            Information about the Availability Zones and Local Zones.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAvailabilityZonesResult withAvailabilityZones(
            AvailabilityZone... availabilityZones) {
        if (getAvailabilityZones() == null) {
            this.availabilityZones = new java.util.ArrayList<AvailabilityZone>(
                    availabilityZones.length);
        }
        for (AvailabilityZone value : availabilityZones) {
            this.availabilityZones.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Availability Zones and Local Zones.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            Information about the Availability Zones and Local Zones.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAvailabilityZonesResult withAvailabilityZones(
            java.util.Collection<AvailabilityZone> availabilityZones) {
        setAvailabilityZones(availabilityZones);
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
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: " + getAvailabilityZones());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAvailabilityZonesResult == false)
            return false;
        DescribeAvailabilityZonesResult other = (DescribeAvailabilityZonesResult) obj;

        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null
                && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        return true;
    }
}
