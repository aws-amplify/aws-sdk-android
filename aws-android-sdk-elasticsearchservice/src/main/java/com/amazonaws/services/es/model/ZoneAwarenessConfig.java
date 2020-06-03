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

package com.amazonaws.services.es.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the zone awareness configuration for the domain cluster, such as
 * the number of availability zones.
 * </p>
 */
public class ZoneAwarenessConfig implements Serializable {
    /**
     * <p>
     * An integer value to indicate the number of availability zones for a
     * domain when zone awareness is enabled. This should be equal to number of
     * subnets if VPC endpoints is enabled
     * </p>
     */
    private Integer availabilityZoneCount;

    /**
     * <p>
     * An integer value to indicate the number of availability zones for a
     * domain when zone awareness is enabled. This should be equal to number of
     * subnets if VPC endpoints is enabled
     * </p>
     *
     * @return <p>
     *         An integer value to indicate the number of availability zones for
     *         a domain when zone awareness is enabled. This should be equal to
     *         number of subnets if VPC endpoints is enabled
     *         </p>
     */
    public Integer getAvailabilityZoneCount() {
        return availabilityZoneCount;
    }

    /**
     * <p>
     * An integer value to indicate the number of availability zones for a
     * domain when zone awareness is enabled. This should be equal to number of
     * subnets if VPC endpoints is enabled
     * </p>
     *
     * @param availabilityZoneCount <p>
     *            An integer value to indicate the number of availability zones
     *            for a domain when zone awareness is enabled. This should be
     *            equal to number of subnets if VPC endpoints is enabled
     *            </p>
     */
    public void setAvailabilityZoneCount(Integer availabilityZoneCount) {
        this.availabilityZoneCount = availabilityZoneCount;
    }

    /**
     * <p>
     * An integer value to indicate the number of availability zones for a
     * domain when zone awareness is enabled. This should be equal to number of
     * subnets if VPC endpoints is enabled
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZoneCount <p>
     *            An integer value to indicate the number of availability zones
     *            for a domain when zone awareness is enabled. This should be
     *            equal to number of subnets if VPC endpoints is enabled
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ZoneAwarenessConfig withAvailabilityZoneCount(Integer availabilityZoneCount) {
        this.availabilityZoneCount = availabilityZoneCount;
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
        if (getAvailabilityZoneCount() != null)
            sb.append("AvailabilityZoneCount: " + getAvailabilityZoneCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAvailabilityZoneCount() == null) ? 0 : getAvailabilityZoneCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ZoneAwarenessConfig == false)
            return false;
        ZoneAwarenessConfig other = (ZoneAwarenessConfig) obj;

        if (other.getAvailabilityZoneCount() == null ^ this.getAvailabilityZoneCount() == null)
            return false;
        if (other.getAvailabilityZoneCount() != null
                && other.getAvailabilityZoneCount().equals(this.getAvailabilityZoneCount()) == false)
            return false;
        return true;
    }
}
