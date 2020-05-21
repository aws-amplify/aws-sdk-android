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

public class UnassignIpv6AddressesResult implements Serializable {
    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * The IPv6 addresses that have been unassigned from the network interface.
     * </p>
     */
    private java.util.List<String> unassignedIpv6Addresses;

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
    public UnassignIpv6AddressesResult withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * The IPv6 addresses that have been unassigned from the network interface.
     * </p>
     *
     * @return <p>
     *         The IPv6 addresses that have been unassigned from the network
     *         interface.
     *         </p>
     */
    public java.util.List<String> getUnassignedIpv6Addresses() {
        return unassignedIpv6Addresses;
    }

    /**
     * <p>
     * The IPv6 addresses that have been unassigned from the network interface.
     * </p>
     *
     * @param unassignedIpv6Addresses <p>
     *            The IPv6 addresses that have been unassigned from the network
     *            interface.
     *            </p>
     */
    public void setUnassignedIpv6Addresses(java.util.Collection<String> unassignedIpv6Addresses) {
        if (unassignedIpv6Addresses == null) {
            this.unassignedIpv6Addresses = null;
            return;
        }

        this.unassignedIpv6Addresses = new java.util.ArrayList<String>(unassignedIpv6Addresses);
    }

    /**
     * <p>
     * The IPv6 addresses that have been unassigned from the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unassignedIpv6Addresses <p>
     *            The IPv6 addresses that have been unassigned from the network
     *            interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnassignIpv6AddressesResult withUnassignedIpv6Addresses(
            String... unassignedIpv6Addresses) {
        if (getUnassignedIpv6Addresses() == null) {
            this.unassignedIpv6Addresses = new java.util.ArrayList<String>(
                    unassignedIpv6Addresses.length);
        }
        for (String value : unassignedIpv6Addresses) {
            this.unassignedIpv6Addresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IPv6 addresses that have been unassigned from the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unassignedIpv6Addresses <p>
     *            The IPv6 addresses that have been unassigned from the network
     *            interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnassignIpv6AddressesResult withUnassignedIpv6Addresses(
            java.util.Collection<String> unassignedIpv6Addresses) {
        setUnassignedIpv6Addresses(unassignedIpv6Addresses);
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
        if (getUnassignedIpv6Addresses() != null)
            sb.append("UnassignedIpv6Addresses: " + getUnassignedIpv6Addresses());
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
                + ((getUnassignedIpv6Addresses() == null) ? 0 : getUnassignedIpv6Addresses()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnassignIpv6AddressesResult == false)
            return false;
        UnassignIpv6AddressesResult other = (UnassignIpv6AddressesResult) obj;

        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getUnassignedIpv6Addresses() == null ^ this.getUnassignedIpv6Addresses() == null)
            return false;
        if (other.getUnassignedIpv6Addresses() != null
                && other.getUnassignedIpv6Addresses().equals(this.getUnassignedIpv6Addresses()) == false)
            return false;
        return true;
    }
}
