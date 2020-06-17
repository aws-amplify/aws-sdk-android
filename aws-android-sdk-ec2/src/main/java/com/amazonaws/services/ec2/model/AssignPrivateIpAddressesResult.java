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

public class AssignPrivateIpAddressesResult implements Serializable {
    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * The private IP addresses assigned to the network interface.
     * </p>
     */
    private java.util.List<AssignedPrivateIpAddress> assignedPrivateIpAddresses;

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     *
     * @return <p>
     *         The ID of the network interface.
     *         </p>
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     *
     * @param networkInterfaceId <p>
     *            The ID of the network interface.
     *            </p>
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaceId <p>
     *            The ID of the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssignPrivateIpAddressesResult withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * The private IP addresses assigned to the network interface.
     * </p>
     *
     * @return <p>
     *         The private IP addresses assigned to the network interface.
     *         </p>
     */
    public java.util.List<AssignedPrivateIpAddress> getAssignedPrivateIpAddresses() {
        return assignedPrivateIpAddresses;
    }

    /**
     * <p>
     * The private IP addresses assigned to the network interface.
     * </p>
     *
     * @param assignedPrivateIpAddresses <p>
     *            The private IP addresses assigned to the network interface.
     *            </p>
     */
    public void setAssignedPrivateIpAddresses(
            java.util.Collection<AssignedPrivateIpAddress> assignedPrivateIpAddresses) {
        if (assignedPrivateIpAddresses == null) {
            this.assignedPrivateIpAddresses = null;
            return;
        }

        this.assignedPrivateIpAddresses = new java.util.ArrayList<AssignedPrivateIpAddress>(
                assignedPrivateIpAddresses);
    }

    /**
     * <p>
     * The private IP addresses assigned to the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assignedPrivateIpAddresses <p>
     *            The private IP addresses assigned to the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssignPrivateIpAddressesResult withAssignedPrivateIpAddresses(
            AssignedPrivateIpAddress... assignedPrivateIpAddresses) {
        if (getAssignedPrivateIpAddresses() == null) {
            this.assignedPrivateIpAddresses = new java.util.ArrayList<AssignedPrivateIpAddress>(
                    assignedPrivateIpAddresses.length);
        }
        for (AssignedPrivateIpAddress value : assignedPrivateIpAddresses) {
            this.assignedPrivateIpAddresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The private IP addresses assigned to the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assignedPrivateIpAddresses <p>
     *            The private IP addresses assigned to the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssignPrivateIpAddressesResult withAssignedPrivateIpAddresses(
            java.util.Collection<AssignedPrivateIpAddress> assignedPrivateIpAddresses) {
        setAssignedPrivateIpAddresses(assignedPrivateIpAddresses);
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
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getAssignedPrivateIpAddresses() != null)
            sb.append("AssignedPrivateIpAddresses: " + getAssignedPrivateIpAddresses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssignedPrivateIpAddresses() == null) ? 0 : getAssignedPrivateIpAddresses()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssignPrivateIpAddressesResult == false)
            return false;
        AssignPrivateIpAddressesResult other = (AssignPrivateIpAddressesResult) obj;

        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getAssignedPrivateIpAddresses() == null
                ^ this.getAssignedPrivateIpAddresses() == null)
            return false;
        if (other.getAssignedPrivateIpAddresses() != null
                && other.getAssignedPrivateIpAddresses().equals(
                        this.getAssignedPrivateIpAddresses()) == false)
            return false;
        return true;
    }
}
