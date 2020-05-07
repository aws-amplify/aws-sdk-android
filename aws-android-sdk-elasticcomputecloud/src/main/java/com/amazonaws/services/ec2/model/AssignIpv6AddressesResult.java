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

public class AssignIpv6AddressesResult implements Serializable {
    /**
     * <p>
     * The IPv6 addresses assigned to the network interface.
     * </p>
     */
    private java.util.List<String> assignedIpv6Addresses;

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * The IPv6 addresses assigned to the network interface.
     * </p>
     *
     * @return <p>
     *         The IPv6 addresses assigned to the network interface.
     *         </p>
     */
    public java.util.List<String> getAssignedIpv6Addresses() {
        return assignedIpv6Addresses;
    }

    /**
     * <p>
     * The IPv6 addresses assigned to the network interface.
     * </p>
     *
     * @param assignedIpv6Addresses <p>
     *            The IPv6 addresses assigned to the network interface.
     *            </p>
     */
    public void setAssignedIpv6Addresses(java.util.Collection<String> assignedIpv6Addresses) {
        if (assignedIpv6Addresses == null) {
            this.assignedIpv6Addresses = null;
            return;
        }

        this.assignedIpv6Addresses = new java.util.ArrayList<String>(assignedIpv6Addresses);
    }

    /**
     * <p>
     * The IPv6 addresses assigned to the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assignedIpv6Addresses <p>
     *            The IPv6 addresses assigned to the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssignIpv6AddressesResult withAssignedIpv6Addresses(String... assignedIpv6Addresses) {
        if (getAssignedIpv6Addresses() == null) {
            this.assignedIpv6Addresses = new java.util.ArrayList<String>(
                    assignedIpv6Addresses.length);
        }
        for (String value : assignedIpv6Addresses) {
            this.assignedIpv6Addresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IPv6 addresses assigned to the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assignedIpv6Addresses <p>
     *            The IPv6 addresses assigned to the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssignIpv6AddressesResult withAssignedIpv6Addresses(
            java.util.Collection<String> assignedIpv6Addresses) {
        setAssignedIpv6Addresses(assignedIpv6Addresses);
        return this;
    }

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
    public AssignIpv6AddressesResult withNetworkInterfaceId(String networkInterfaceId) {
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
        if (getAssignedIpv6Addresses() != null)
            sb.append("AssignedIpv6Addresses: " + getAssignedIpv6Addresses() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAssignedIpv6Addresses() == null) ? 0 : getAssignedIpv6Addresses().hashCode());
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

        if (obj instanceof AssignIpv6AddressesResult == false)
            return false;
        AssignIpv6AddressesResult other = (AssignIpv6AddressesResult) obj;

        if (other.getAssignedIpv6Addresses() == null ^ this.getAssignedIpv6Addresses() == null)
            return false;
        if (other.getAssignedIpv6Addresses() != null
                && other.getAssignedIpv6Addresses().equals(this.getAssignedIpv6Addresses()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        return true;
    }
}
