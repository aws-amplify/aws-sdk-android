/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains the output of DescribeAvailabiltyZones.
 * </p>
 */
public class DescribeAvailabilityZonesResult implements Serializable {

    /**
     * Information about one or more Availability Zones.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AvailabilityZone> availabilityZones;

    /**
     * Information about one or more Availability Zones.
     *
     * @return Information about one or more Availability Zones.
     */
    public java.util.List<AvailabilityZone> getAvailabilityZones() {
        if (availabilityZones == null) {
              availabilityZones = new com.amazonaws.internal.ListWithAutoConstructFlag<AvailabilityZone>();
              availabilityZones.setAutoConstruct(true);
        }
        return availabilityZones;
    }
    
    /**
     * Information about one or more Availability Zones.
     *
     * @param availabilityZones Information about one or more Availability Zones.
     */
    public void setAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AvailabilityZone> availabilityZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AvailabilityZone>(availabilityZones.size());
        availabilityZonesCopy.addAll(availabilityZones);
        this.availabilityZones = availabilityZonesCopy;
    }
    
    /**
     * Information about one or more Availability Zones.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones Information about one or more Availability Zones.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAvailabilityZonesResult withAvailabilityZones(AvailabilityZone... availabilityZones) {
        if (getAvailabilityZones() == null) setAvailabilityZones(new java.util.ArrayList<AvailabilityZone>(availabilityZones.length));
        for (AvailabilityZone value : availabilityZones) {
            getAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * Information about one or more Availability Zones.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones Information about one or more Availability Zones.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAvailabilityZonesResult withAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AvailabilityZone> availabilityZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AvailabilityZone>(availabilityZones.size());
            availabilityZonesCopy.addAll(availabilityZones);
            this.availabilityZones = availabilityZonesCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAvailabilityZones() != null) sb.append("AvailabilityZones: " + getAvailabilityZones() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAvailabilityZonesResult == false) return false;
        DescribeAvailabilityZonesResult other = (DescribeAvailabilityZonesResult)obj;
        
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null) return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false) return false; 
        return true;
    }
    
}
    