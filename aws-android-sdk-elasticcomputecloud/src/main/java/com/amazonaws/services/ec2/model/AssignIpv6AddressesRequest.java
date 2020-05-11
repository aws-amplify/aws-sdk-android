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
 * Assigns one or more IPv6 addresses to the specified network interface. You
 * can specify one or more specific IPv6 addresses, or you can specify the
 * number of IPv6 addresses to be automatically assigned from within the
 * subnet's IPv6 CIDR block range. You can assign as many IPv6 addresses to a
 * network interface as you can assign private IPv4 addresses, and the limit
 * varies per instance type. For information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI"
 * >IP Addresses Per Network Interface Per Instance Type</a> in the <i>Amazon
 * Elastic Compute Cloud User Guide</i>.
 * </p>
 * <p>
 * You must specify either the IPv6 addresses or the IPv6 address count in the
 * request.
 * </p>
 */
public class AssignIpv6AddressesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The number of IPv6 addresses to assign to the network interface. Amazon
     * EC2 automatically selects the IPv6 addresses from the subnet range. You
     * can't use this option if specifying specific IPv6 addresses.
     * </p>
     */
    private Integer ipv6AddressCount;

    /**
     * <p>
     * One or more specific IPv6 addresses to be assigned to the network
     * interface. You can't use this option if you're specifying a number of
     * IPv6 addresses.
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
     * The number of IPv6 addresses to assign to the network interface. Amazon
     * EC2 automatically selects the IPv6 addresses from the subnet range. You
     * can't use this option if specifying specific IPv6 addresses.
     * </p>
     *
     * @return <p>
     *         The number of IPv6 addresses to assign to the network interface.
     *         Amazon EC2 automatically selects the IPv6 addresses from the
     *         subnet range. You can't use this option if specifying specific
     *         IPv6 addresses.
     *         </p>
     */
    public Integer getIpv6AddressCount() {
        return ipv6AddressCount;
    }

    /**
     * <p>
     * The number of IPv6 addresses to assign to the network interface. Amazon
     * EC2 automatically selects the IPv6 addresses from the subnet range. You
     * can't use this option if specifying specific IPv6 addresses.
     * </p>
     *
     * @param ipv6AddressCount <p>
     *            The number of IPv6 addresses to assign to the network
     *            interface. Amazon EC2 automatically selects the IPv6 addresses
     *            from the subnet range. You can't use this option if specifying
     *            specific IPv6 addresses.
     *            </p>
     */
    public void setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
    }

    /**
     * <p>
     * The number of IPv6 addresses to assign to the network interface. Amazon
     * EC2 automatically selects the IPv6 addresses from the subnet range. You
     * can't use this option if specifying specific IPv6 addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6AddressCount <p>
     *            The number of IPv6 addresses to assign to the network
     *            interface. Amazon EC2 automatically selects the IPv6 addresses
     *            from the subnet range. You can't use this option if specifying
     *            specific IPv6 addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssignIpv6AddressesRequest withIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }

    /**
     * <p>
     * One or more specific IPv6 addresses to be assigned to the network
     * interface. You can't use this option if you're specifying a number of
     * IPv6 addresses.
     * </p>
     *
     * @return <p>
     *         One or more specific IPv6 addresses to be assigned to the network
     *         interface. You can't use this option if you're specifying a
     *         number of IPv6 addresses.
     *         </p>
     */
    public java.util.List<String> getIpv6Addresses() {
        return ipv6Addresses;
    }

    /**
     * <p>
     * One or more specific IPv6 addresses to be assigned to the network
     * interface. You can't use this option if you're specifying a number of
     * IPv6 addresses.
     * </p>
     *
     * @param ipv6Addresses <p>
     *            One or more specific IPv6 addresses to be assigned to the
     *            network interface. You can't use this option if you're
     *            specifying a number of IPv6 addresses.
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
     * One or more specific IPv6 addresses to be assigned to the network
     * interface. You can't use this option if you're specifying a number of
     * IPv6 addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Addresses <p>
     *            One or more specific IPv6 addresses to be assigned to the
     *            network interface. You can't use this option if you're
     *            specifying a number of IPv6 addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssignIpv6AddressesRequest withIpv6Addresses(String... ipv6Addresses) {
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
     * One or more specific IPv6 addresses to be assigned to the network
     * interface. You can't use this option if you're specifying a number of
     * IPv6 addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Addresses <p>
     *            One or more specific IPv6 addresses to be assigned to the
     *            network interface. You can't use this option if you're
     *            specifying a number of IPv6 addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssignIpv6AddressesRequest withIpv6Addresses(java.util.Collection<String> ipv6Addresses) {
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
    public AssignIpv6AddressesRequest withNetworkInterfaceId(String networkInterfaceId) {
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
        if (getIpv6AddressCount() != null)
            sb.append("Ipv6AddressCount: " + getIpv6AddressCount() + ",");
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
                + ((getIpv6AddressCount() == null) ? 0 : getIpv6AddressCount().hashCode());
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

        if (obj instanceof AssignIpv6AddressesRequest == false)
            return false;
        AssignIpv6AddressesRequest other = (AssignIpv6AddressesRequest) obj;

        if (other.getIpv6AddressCount() == null ^ this.getIpv6AddressCount() == null)
            return false;
        if (other.getIpv6AddressCount() != null
                && other.getIpv6AddressCount().equals(this.getIpv6AddressCount()) == false)
            return false;
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
