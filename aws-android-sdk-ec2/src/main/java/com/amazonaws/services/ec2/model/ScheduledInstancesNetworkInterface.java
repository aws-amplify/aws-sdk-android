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

/**
 * <p>
 * Describes a network interface for a Scheduled Instance.
 * </p>
 */
public class ScheduledInstancesNetworkInterface implements Serializable {
    /**
     * <p>
     * Indicates whether to assign a public IPv4 address to instances launched
     * in a VPC. The public IPv4 address can only be assigned to a network
     * interface for eth0, and can only be assigned to a new network interface,
     * not an existing one. You cannot specify more than one network interface
     * in the request. If launching into a default subnet, the default value is
     * <code>true</code>.
     * </p>
     */
    private Boolean associatePublicIpAddress;

    /**
     * <p>
     * Indicates whether to delete the interface when the instance is
     * terminated.
     * </p>
     */
    private Boolean deleteOnTermination;

    /**
     * <p>
     * The description.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The index of the device for the network interface attachment.
     * </p>
     */
    private Integer deviceIndex;

    /**
     * <p>
     * The IDs of the security groups.
     * </p>
     */
    private java.util.List<String> groups;

    /**
     * <p>
     * The number of IPv6 addresses to assign to the network interface. The IPv6
     * addresses are automatically selected from the subnet range.
     * </p>
     */
    private Integer ipv6AddressCount;

    /**
     * <p>
     * The specific IPv6 addresses from the subnet range.
     * </p>
     */
    private java.util.List<ScheduledInstancesIpv6Address> ipv6Addresses;

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * The IPv4 address of the network interface within the subnet.
     * </p>
     */
    private String privateIpAddress;

    /**
     * <p>
     * The private IPv4 addresses.
     * </p>
     */
    private java.util.List<ScheduledInstancesPrivateIpAddressConfig> privateIpAddressConfigs;

    /**
     * <p>
     * The number of secondary private IPv4 addresses.
     * </p>
     */
    private Integer secondaryPrivateIpAddressCount;

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * Indicates whether to assign a public IPv4 address to instances launched
     * in a VPC. The public IPv4 address can only be assigned to a network
     * interface for eth0, and can only be assigned to a new network interface,
     * not an existing one. You cannot specify more than one network interface
     * in the request. If launching into a default subnet, the default value is
     * <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Indicates whether to assign a public IPv4 address to instances
     *         launched in a VPC. The public IPv4 address can only be assigned
     *         to a network interface for eth0, and can only be assigned to a
     *         new network interface, not an existing one. You cannot specify
     *         more than one network interface in the request. If launching into
     *         a default subnet, the default value is <code>true</code>.
     *         </p>
     */
    public Boolean isAssociatePublicIpAddress() {
        return associatePublicIpAddress;
    }

    /**
     * <p>
     * Indicates whether to assign a public IPv4 address to instances launched
     * in a VPC. The public IPv4 address can only be assigned to a network
     * interface for eth0, and can only be assigned to a new network interface,
     * not an existing one. You cannot specify more than one network interface
     * in the request. If launching into a default subnet, the default value is
     * <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Indicates whether to assign a public IPv4 address to instances
     *         launched in a VPC. The public IPv4 address can only be assigned
     *         to a network interface for eth0, and can only be assigned to a
     *         new network interface, not an existing one. You cannot specify
     *         more than one network interface in the request. If launching into
     *         a default subnet, the default value is <code>true</code>.
     *         </p>
     */
    public Boolean getAssociatePublicIpAddress() {
        return associatePublicIpAddress;
    }

    /**
     * <p>
     * Indicates whether to assign a public IPv4 address to instances launched
     * in a VPC. The public IPv4 address can only be assigned to a network
     * interface for eth0, and can only be assigned to a new network interface,
     * not an existing one. You cannot specify more than one network interface
     * in the request. If launching into a default subnet, the default value is
     * <code>true</code>.
     * </p>
     *
     * @param associatePublicIpAddress <p>
     *            Indicates whether to assign a public IPv4 address to instances
     *            launched in a VPC. The public IPv4 address can only be
     *            assigned to a network interface for eth0, and can only be
     *            assigned to a new network interface, not an existing one. You
     *            cannot specify more than one network interface in the request.
     *            If launching into a default subnet, the default value is
     *            <code>true</code>.
     *            </p>
     */
    public void setAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
    }

    /**
     * <p>
     * Indicates whether to assign a public IPv4 address to instances launched
     * in a VPC. The public IPv4 address can only be assigned to a network
     * interface for eth0, and can only be assigned to a new network interface,
     * not an existing one. You cannot specify more than one network interface
     * in the request. If launching into a default subnet, the default value is
     * <code>true</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatePublicIpAddress <p>
     *            Indicates whether to assign a public IPv4 address to instances
     *            launched in a VPC. The public IPv4 address can only be
     *            assigned to a network interface for eth0, and can only be
     *            assigned to a new network interface, not an existing one. You
     *            cannot specify more than one network interface in the request.
     *            If launching into a default subnet, the default value is
     *            <code>true</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesNetworkInterface withAssociatePublicIpAddress(
            Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
        return this;
    }

    /**
     * <p>
     * Indicates whether to delete the interface when the instance is
     * terminated.
     * </p>
     *
     * @return <p>
     *         Indicates whether to delete the interface when the instance is
     *         terminated.
     *         </p>
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether to delete the interface when the instance is
     * terminated.
     * </p>
     *
     * @return <p>
     *         Indicates whether to delete the interface when the instance is
     *         terminated.
     *         </p>
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether to delete the interface when the instance is
     * terminated.
     * </p>
     *
     * @param deleteOnTermination <p>
     *            Indicates whether to delete the interface when the instance is
     *            terminated.
     *            </p>
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether to delete the interface when the instance is
     * terminated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteOnTermination <p>
     *            Indicates whether to delete the interface when the instance is
     *            terminated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesNetworkInterface withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * <p>
     * The description.
     * </p>
     *
     * @return <p>
     *         The description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description.
     * </p>
     *
     * @param description <p>
     *            The description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesNetworkInterface withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The index of the device for the network interface attachment.
     * </p>
     *
     * @return <p>
     *         The index of the device for the network interface attachment.
     *         </p>
     */
    public Integer getDeviceIndex() {
        return deviceIndex;
    }

    /**
     * <p>
     * The index of the device for the network interface attachment.
     * </p>
     *
     * @param deviceIndex <p>
     *            The index of the device for the network interface attachment.
     *            </p>
     */
    public void setDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
    }

    /**
     * <p>
     * The index of the device for the network interface attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceIndex <p>
     *            The index of the device for the network interface attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesNetworkInterface withDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups.
     * </p>
     *
     * @return <p>
     *         The IDs of the security groups.
     *         </p>
     */
    public java.util.List<String> getGroups() {
        return groups;
    }

    /**
     * <p>
     * The IDs of the security groups.
     * </p>
     *
     * @param groups <p>
     *            The IDs of the security groups.
     *            </p>
     */
    public void setGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<String>(groups);
    }

    /**
     * <p>
     * The IDs of the security groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            The IDs of the security groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesNetworkInterface withGroups(String... groups) {
        if (getGroups() == null) {
            this.groups = new java.util.ArrayList<String>(groups.length);
        }
        for (String value : groups) {
            this.groups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            The IDs of the security groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesNetworkInterface withGroups(java.util.Collection<String> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * The number of IPv6 addresses to assign to the network interface. The IPv6
     * addresses are automatically selected from the subnet range.
     * </p>
     *
     * @return <p>
     *         The number of IPv6 addresses to assign to the network interface.
     *         The IPv6 addresses are automatically selected from the subnet
     *         range.
     *         </p>
     */
    public Integer getIpv6AddressCount() {
        return ipv6AddressCount;
    }

    /**
     * <p>
     * The number of IPv6 addresses to assign to the network interface. The IPv6
     * addresses are automatically selected from the subnet range.
     * </p>
     *
     * @param ipv6AddressCount <p>
     *            The number of IPv6 addresses to assign to the network
     *            interface. The IPv6 addresses are automatically selected from
     *            the subnet range.
     *            </p>
     */
    public void setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
    }

    /**
     * <p>
     * The number of IPv6 addresses to assign to the network interface. The IPv6
     * addresses are automatically selected from the subnet range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6AddressCount <p>
     *            The number of IPv6 addresses to assign to the network
     *            interface. The IPv6 addresses are automatically selected from
     *            the subnet range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesNetworkInterface withIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }

    /**
     * <p>
     * The specific IPv6 addresses from the subnet range.
     * </p>
     *
     * @return <p>
     *         The specific IPv6 addresses from the subnet range.
     *         </p>
     */
    public java.util.List<ScheduledInstancesIpv6Address> getIpv6Addresses() {
        return ipv6Addresses;
    }

    /**
     * <p>
     * The specific IPv6 addresses from the subnet range.
     * </p>
     *
     * @param ipv6Addresses <p>
     *            The specific IPv6 addresses from the subnet range.
     *            </p>
     */
    public void setIpv6Addresses(java.util.Collection<ScheduledInstancesIpv6Address> ipv6Addresses) {
        if (ipv6Addresses == null) {
            this.ipv6Addresses = null;
            return;
        }

        this.ipv6Addresses = new java.util.ArrayList<ScheduledInstancesIpv6Address>(ipv6Addresses);
    }

    /**
     * <p>
     * The specific IPv6 addresses from the subnet range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Addresses <p>
     *            The specific IPv6 addresses from the subnet range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesNetworkInterface withIpv6Addresses(
            ScheduledInstancesIpv6Address... ipv6Addresses) {
        if (getIpv6Addresses() == null) {
            this.ipv6Addresses = new java.util.ArrayList<ScheduledInstancesIpv6Address>(
                    ipv6Addresses.length);
        }
        for (ScheduledInstancesIpv6Address value : ipv6Addresses) {
            this.ipv6Addresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The specific IPv6 addresses from the subnet range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Addresses <p>
     *            The specific IPv6 addresses from the subnet range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesNetworkInterface withIpv6Addresses(
            java.util.Collection<ScheduledInstancesIpv6Address> ipv6Addresses) {
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
    public ScheduledInstancesNetworkInterface withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * The IPv4 address of the network interface within the subnet.
     * </p>
     *
     * @return <p>
     *         The IPv4 address of the network interface within the subnet.
     *         </p>
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * <p>
     * The IPv4 address of the network interface within the subnet.
     * </p>
     *
     * @param privateIpAddress <p>
     *            The IPv4 address of the network interface within the subnet.
     *            </p>
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The IPv4 address of the network interface within the subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddress <p>
     *            The IPv4 address of the network interface within the subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesNetworkInterface withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * <p>
     * The private IPv4 addresses.
     * </p>
     *
     * @return <p>
     *         The private IPv4 addresses.
     *         </p>
     */
    public java.util.List<ScheduledInstancesPrivateIpAddressConfig> getPrivateIpAddressConfigs() {
        return privateIpAddressConfigs;
    }

    /**
     * <p>
     * The private IPv4 addresses.
     * </p>
     *
     * @param privateIpAddressConfigs <p>
     *            The private IPv4 addresses.
     *            </p>
     */
    public void setPrivateIpAddressConfigs(
            java.util.Collection<ScheduledInstancesPrivateIpAddressConfig> privateIpAddressConfigs) {
        if (privateIpAddressConfigs == null) {
            this.privateIpAddressConfigs = null;
            return;
        }

        this.privateIpAddressConfigs = new java.util.ArrayList<ScheduledInstancesPrivateIpAddressConfig>(
                privateIpAddressConfigs);
    }

    /**
     * <p>
     * The private IPv4 addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddressConfigs <p>
     *            The private IPv4 addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesNetworkInterface withPrivateIpAddressConfigs(
            ScheduledInstancesPrivateIpAddressConfig... privateIpAddressConfigs) {
        if (getPrivateIpAddressConfigs() == null) {
            this.privateIpAddressConfigs = new java.util.ArrayList<ScheduledInstancesPrivateIpAddressConfig>(
                    privateIpAddressConfigs.length);
        }
        for (ScheduledInstancesPrivateIpAddressConfig value : privateIpAddressConfigs) {
            this.privateIpAddressConfigs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The private IPv4 addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddressConfigs <p>
     *            The private IPv4 addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesNetworkInterface withPrivateIpAddressConfigs(
            java.util.Collection<ScheduledInstancesPrivateIpAddressConfig> privateIpAddressConfigs) {
        setPrivateIpAddressConfigs(privateIpAddressConfigs);
        return this;
    }

    /**
     * <p>
     * The number of secondary private IPv4 addresses.
     * </p>
     *
     * @return <p>
     *         The number of secondary private IPv4 addresses.
     *         </p>
     */
    public Integer getSecondaryPrivateIpAddressCount() {
        return secondaryPrivateIpAddressCount;
    }

    /**
     * <p>
     * The number of secondary private IPv4 addresses.
     * </p>
     *
     * @param secondaryPrivateIpAddressCount <p>
     *            The number of secondary private IPv4 addresses.
     *            </p>
     */
    public void setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
    }

    /**
     * <p>
     * The number of secondary private IPv4 addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondaryPrivateIpAddressCount <p>
     *            The number of secondary private IPv4 addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesNetworkInterface withSecondaryPrivateIpAddressCount(
            Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
        return this;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     *
     * @return <p>
     *         The ID of the subnet.
     *         </p>
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     *
     * @param subnetId <p>
     *            The ID of the subnet.
     *            </p>
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetId <p>
     *            The ID of the subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesNetworkInterface withSubnetId(String subnetId) {
        this.subnetId = subnetId;
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
        if (getAssociatePublicIpAddress() != null)
            sb.append("AssociatePublicIpAddress: " + getAssociatePublicIpAddress() + ",");
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: " + getDeleteOnTermination() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDeviceIndex() != null)
            sb.append("DeviceIndex: " + getDeviceIndex() + ",");
        if (getGroups() != null)
            sb.append("Groups: " + getGroups() + ",");
        if (getIpv6AddressCount() != null)
            sb.append("Ipv6AddressCount: " + getIpv6AddressCount() + ",");
        if (getIpv6Addresses() != null)
            sb.append("Ipv6Addresses: " + getIpv6Addresses() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: " + getPrivateIpAddress() + ",");
        if (getPrivateIpAddressConfigs() != null)
            sb.append("PrivateIpAddressConfigs: " + getPrivateIpAddressConfigs() + ",");
        if (getSecondaryPrivateIpAddressCount() != null)
            sb.append("SecondaryPrivateIpAddressCount: " + getSecondaryPrivateIpAddressCount()
                    + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAssociatePublicIpAddress() == null) ? 0 : getAssociatePublicIpAddress()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDeleteOnTermination() == null) ? 0 : getDeleteOnTermination().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getDeviceIndex() == null) ? 0 : getDeviceIndex().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode
                + ((getIpv6AddressCount() == null) ? 0 : getIpv6AddressCount().hashCode());
        hashCode = prime * hashCode
                + ((getIpv6Addresses() == null) ? 0 : getIpv6Addresses().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        hashCode = prime
                * hashCode
                + ((getPrivateIpAddressConfigs() == null) ? 0 : getPrivateIpAddressConfigs()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSecondaryPrivateIpAddressCount() == null) ? 0
                        : getSecondaryPrivateIpAddressCount().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledInstancesNetworkInterface == false)
            return false;
        ScheduledInstancesNetworkInterface other = (ScheduledInstancesNetworkInterface) obj;

        if (other.getAssociatePublicIpAddress() == null
                ^ this.getAssociatePublicIpAddress() == null)
            return false;
        if (other.getAssociatePublicIpAddress() != null
                && other.getAssociatePublicIpAddress().equals(this.getAssociatePublicIpAddress()) == false)
            return false;
        if (other.getDeleteOnTermination() == null ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null
                && other.getDeleteOnTermination().equals(this.getDeleteOnTermination()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDeviceIndex() == null ^ this.getDeviceIndex() == null)
            return false;
        if (other.getDeviceIndex() != null
                && other.getDeviceIndex().equals(this.getDeviceIndex()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
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
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null
                && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        if (other.getPrivateIpAddressConfigs() == null ^ this.getPrivateIpAddressConfigs() == null)
            return false;
        if (other.getPrivateIpAddressConfigs() != null
                && other.getPrivateIpAddressConfigs().equals(this.getPrivateIpAddressConfigs()) == false)
            return false;
        if (other.getSecondaryPrivateIpAddressCount() == null
                ^ this.getSecondaryPrivateIpAddressCount() == null)
            return false;
        if (other.getSecondaryPrivateIpAddressCount() != null
                && other.getSecondaryPrivateIpAddressCount().equals(
                        this.getSecondaryPrivateIpAddressCount()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        return true;
    }
}
