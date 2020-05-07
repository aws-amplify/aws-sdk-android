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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Unassigns one or more IPv6 addresses from a network interface.
 * </p>
 */
public class UnassignIpv6AddressesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The IPv6 addresses to unassign from the network interface.
     * </p>
     */
    private java.util.List<String> ipv6Addresses;

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * The IPv6 addresses to unassign from the network interface.
     * </p>
     *
     * @return <p>
     *         The IPv6 addresses to unassign from the network interface.
     *         </p>
     */
    public java.util.List<String> getIpv6Addresses() {
        return ipv6Addresses;
    }

    /**
     * <p>
     * The IPv6 addresses to unassign from the network interface.
     * </p>
     *
     * @param ipv6Addresses <p>
     *            The IPv6 addresses to unassign from the network interface.
     *            </p>
     */
    public void setIpv6Addresses(java.util.Collection<String> ipv6Addresses) {
        if (ipv6Addresses == null) {
            this.ipv6Addresses = null;
            return;
        }

        this.ipv6Addresses = new java.util.ArrayList<String>(ipv6Addresses);
    }

    /**
     * <p>
     * The IPv6 addresses to unassign from the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Addresses <p>
     *            The IPv6 addresses to unassign from the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnassignIpv6AddressesRequest withIpv6Addresses(String... ipv6Addresses) {
        if (getIpv6Addresses() == null) {
            this.ipv6Addresses = new java.util.ArrayList<String>(ipv6Addresses.length);
        }
        for (String value : ipv6Addresses) {
            this.ipv6Addresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IPv6 addresses to unassign from the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Addresses <p>
     *            The IPv6 addresses to unassign from the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnassignIpv6AddressesRequest withIpv6Addresses(java.util.Collection<String> ipv6Addresses) {
        setIpv6Addresses(ipv6Addresses);
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
    public UnassignIpv6AddressesRequest withNetworkInterfaceId(String networkInterfaceId) {
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
        if (getIpv6Addresses() != null)
            sb.append("Ipv6Addresses: " + getIpv6Addresses() + ",");
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
                + ((getIpv6Addresses() == null) ? 0 : getIpv6Addresses().hashCode());
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

        if (obj instanceof UnassignIpv6AddressesRequest == false)
            return false;
        UnassignIpv6AddressesRequest other = (UnassignIpv6AddressesRequest) obj;

        if (other.getIpv6Addresses() == null ^ this.getIpv6Addresses() == null)
            return false;
        if (other.getIpv6Addresses() != null
                && other.getIpv6Addresses().equals(this.getIpv6Addresses()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        return true;
    }
}
