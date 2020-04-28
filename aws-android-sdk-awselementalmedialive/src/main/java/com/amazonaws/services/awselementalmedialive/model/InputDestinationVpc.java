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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * The properties for a VPC type input destination.
 */
public class InputDestinationVpc implements Serializable {
    /**
     * The availability zone of the Input destination.
     */
    private String availabilityZone;

    /**
     * The network interface ID of the Input destination in the VPC.
     */
    private String networkInterfaceId;

    /**
     * The availability zone of the Input destination.
     * 
     * @return The availability zone of the Input destination.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * The availability zone of the Input destination.
     * 
     * @param availabilityZone The availability zone of the Input destination.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * The availability zone of the Input destination. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone The availability zone of the Input destination. @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDestinationVpc withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * The network interface ID of the Input destination in the VPC.
     * 
     * @return The network interface ID of the Input destination in the VPC.
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * The network interface ID of the Input destination in the VPC.
     * 
     * @param networkInterfaceId The network interface ID of the Input
     *            destination in the VPC.
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * The network interface ID of the Input destination in the VPC. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaceId The network interface ID of the Input
     *            destination in the VPC. @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDestinationVpc withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputDestinationVpc == false)
            return false;
        InputDestinationVpc other = (InputDestinationVpc) obj;

        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        return true;
    }
}
