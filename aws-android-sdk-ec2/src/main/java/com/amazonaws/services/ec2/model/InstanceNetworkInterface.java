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
 * Describes a network interface.
 * </p>
 */
public class InstanceNetworkInterface implements Serializable {
    /**
     * <p>
     * The association information for an Elastic IPv4 associated with the
     * network interface.
     * </p>
     */
    private InstanceNetworkInterfaceAssociation association;

    /**
     * <p>
     * The network interface attachment.
     * </p>
     */
    private InstanceNetworkInterfaceAttachment attachment;

    /**
     * <p>
     * The description.
     * </p>
     */
    private String description;

    /**
     * <p>
     * One or more security groups.
     * </p>
     */
    private java.util.List<GroupIdentifier> groups;

    /**
     * <p>
     * One or more IPv6 addresses associated with the network interface.
     * </p>
     */
    private java.util.List<InstanceIpv6Address> ipv6Addresses;

    /**
     * <p>
     * The MAC address.
     * </p>
     */
    private String macAddress;

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * The ID of the AWS account that created the network interface.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * The private DNS name.
     * </p>
     */
    private String privateDnsName;

    /**
     * <p>
     * The IPv4 address of the network interface within the subnet.
     * </p>
     */
    private String privateIpAddress;

    /**
     * <p>
     * One or more private IPv4 addresses associated with the network interface.
     * </p>
     */
    private java.util.List<InstancePrivateIpAddress> privateIpAddresses;

    /**
     * <p>
     * Indicates whether to validate network traffic to or from this network
     * interface.
     * </p>
     */
    private Boolean sourceDestCheck;

    /**
     * <p>
     * The status of the network interface.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, associated, attaching, in-use,
     * detaching
     */
    private String status;

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * Describes the type of network interface.
     * </p>
     * <p>
     * Valid values: <code>interface</code> | <code>efa</code>
     * </p>
     */
    private String interfaceType;

    /**
     * <p>
     * The association information for an Elastic IPv4 associated with the
     * network interface.
     * </p>
     *
     * @return <p>
     *         The association information for an Elastic IPv4 associated with
     *         the network interface.
     *         </p>
     */
    public InstanceNetworkInterfaceAssociation getAssociation() {
        return association;
    }

    /**
     * <p>
     * The association information for an Elastic IPv4 associated with the
     * network interface.
     * </p>
     *
     * @param association <p>
     *            The association information for an Elastic IPv4 associated
     *            with the network interface.
     *            </p>
     */
    public void setAssociation(InstanceNetworkInterfaceAssociation association) {
        this.association = association;
    }

    /**
     * <p>
     * The association information for an Elastic IPv4 associated with the
     * network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param association <p>
     *            The association information for an Elastic IPv4 associated
     *            with the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterface withAssociation(InstanceNetworkInterfaceAssociation association) {
        this.association = association;
        return this;
    }

    /**
     * <p>
     * The network interface attachment.
     * </p>
     *
     * @return <p>
     *         The network interface attachment.
     *         </p>
     */
    public InstanceNetworkInterfaceAttachment getAttachment() {
        return attachment;
    }

    /**
     * <p>
     * The network interface attachment.
     * </p>
     *
     * @param attachment <p>
     *            The network interface attachment.
     *            </p>
     */
    public void setAttachment(InstanceNetworkInterfaceAttachment attachment) {
        this.attachment = attachment;
    }

    /**
     * <p>
     * The network interface attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachment <p>
     *            The network interface attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterface withAttachment(InstanceNetworkInterfaceAttachment attachment) {
        this.attachment = attachment;
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
    public InstanceNetworkInterface withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * One or more security groups.
     * </p>
     *
     * @return <p>
     *         One or more security groups.
     *         </p>
     */
    public java.util.List<GroupIdentifier> getGroups() {
        return groups;
    }

    /**
     * <p>
     * One or more security groups.
     * </p>
     *
     * @param groups <p>
     *            One or more security groups.
     *            </p>
     */
    public void setGroups(java.util.Collection<GroupIdentifier> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<GroupIdentifier>(groups);
    }

    /**
     * <p>
     * One or more security groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            One or more security groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterface withGroups(GroupIdentifier... groups) {
        if (getGroups() == null) {
            this.groups = new java.util.ArrayList<GroupIdentifier>(groups.length);
        }
        for (GroupIdentifier value : groups) {
            this.groups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more security groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            One or more security groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterface withGroups(java.util.Collection<GroupIdentifier> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * One or more IPv6 addresses associated with the network interface.
     * </p>
     *
     * @return <p>
     *         One or more IPv6 addresses associated with the network interface.
     *         </p>
     */
    public java.util.List<InstanceIpv6Address> getIpv6Addresses() {
        return ipv6Addresses;
    }

    /**
     * <p>
     * One or more IPv6 addresses associated with the network interface.
     * </p>
     *
     * @param ipv6Addresses <p>
     *            One or more IPv6 addresses associated with the network
     *            interface.
     *            </p>
     */
    public void setIpv6Addresses(java.util.Collection<InstanceIpv6Address> ipv6Addresses) {
        if (ipv6Addresses == null) {
            this.ipv6Addresses = null;
            return;
        }

        this.ipv6Addresses = new java.util.ArrayList<InstanceIpv6Address>(ipv6Addresses);
    }

    /**
     * <p>
     * One or more IPv6 addresses associated with the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Addresses <p>
     *            One or more IPv6 addresses associated with the network
     *            interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterface withIpv6Addresses(InstanceIpv6Address... ipv6Addresses) {
        if (getIpv6Addresses() == null) {
            this.ipv6Addresses = new java.util.ArrayList<InstanceIpv6Address>(ipv6Addresses.length);
        }
        for (InstanceIpv6Address value : ipv6Addresses) {
            this.ipv6Addresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more IPv6 addresses associated with the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Addresses <p>
     *            One or more IPv6 addresses associated with the network
     *            interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterface withIpv6Addresses(
            java.util.Collection<InstanceIpv6Address> ipv6Addresses) {
        setIpv6Addresses(ipv6Addresses);
        return this;
    }

    /**
     * <p>
     * The MAC address.
     * </p>
     *
     * @return <p>
     *         The MAC address.
     *         </p>
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * <p>
     * The MAC address.
     * </p>
     *
     * @param macAddress <p>
     *            The MAC address.
     *            </p>
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * <p>
     * The MAC address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param macAddress <p>
     *            The MAC address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterface withMacAddress(String macAddress) {
        this.macAddress = macAddress;
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
    public InstanceNetworkInterface withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that created the network interface.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that created the network interface.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that created the network interface.
     * </p>
     *
     * @param ownerId <p>
     *            The ID of the AWS account that created the network interface.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that created the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The ID of the AWS account that created the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterface withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * The private DNS name.
     * </p>
     *
     * @return <p>
     *         The private DNS name.
     *         </p>
     */
    public String getPrivateDnsName() {
        return privateDnsName;
    }

    /**
     * <p>
     * The private DNS name.
     * </p>
     *
     * @param privateDnsName <p>
     *            The private DNS name.
     *            </p>
     */
    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }

    /**
     * <p>
     * The private DNS name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateDnsName <p>
     *            The private DNS name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterface withPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
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
    public InstanceNetworkInterface withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * <p>
     * One or more private IPv4 addresses associated with the network interface.
     * </p>
     *
     * @return <p>
     *         One or more private IPv4 addresses associated with the network
     *         interface.
     *         </p>
     */
    public java.util.List<InstancePrivateIpAddress> getPrivateIpAddresses() {
        return privateIpAddresses;
    }

    /**
     * <p>
     * One or more private IPv4 addresses associated with the network interface.
     * </p>
     *
     * @param privateIpAddresses <p>
     *            One or more private IPv4 addresses associated with the network
     *            interface.
     *            </p>
     */
    public void setPrivateIpAddresses(
            java.util.Collection<InstancePrivateIpAddress> privateIpAddresses) {
        if (privateIpAddresses == null) {
            this.privateIpAddresses = null;
            return;
        }

        this.privateIpAddresses = new java.util.ArrayList<InstancePrivateIpAddress>(
                privateIpAddresses);
    }

    /**
     * <p>
     * One or more private IPv4 addresses associated with the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddresses <p>
     *            One or more private IPv4 addresses associated with the network
     *            interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterface withPrivateIpAddresses(
            InstancePrivateIpAddress... privateIpAddresses) {
        if (getPrivateIpAddresses() == null) {
            this.privateIpAddresses = new java.util.ArrayList<InstancePrivateIpAddress>(
                    privateIpAddresses.length);
        }
        for (InstancePrivateIpAddress value : privateIpAddresses) {
            this.privateIpAddresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more private IPv4 addresses associated with the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddresses <p>
     *            One or more private IPv4 addresses associated with the network
     *            interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterface withPrivateIpAddresses(
            java.util.Collection<InstancePrivateIpAddress> privateIpAddresses) {
        setPrivateIpAddresses(privateIpAddresses);
        return this;
    }

    /**
     * <p>
     * Indicates whether to validate network traffic to or from this network
     * interface.
     * </p>
     *
     * @return <p>
     *         Indicates whether to validate network traffic to or from this
     *         network interface.
     *         </p>
     */
    public Boolean isSourceDestCheck() {
        return sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether to validate network traffic to or from this network
     * interface.
     * </p>
     *
     * @return <p>
     *         Indicates whether to validate network traffic to or from this
     *         network interface.
     *         </p>
     */
    public Boolean getSourceDestCheck() {
        return sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether to validate network traffic to or from this network
     * interface.
     * </p>
     *
     * @param sourceDestCheck <p>
     *            Indicates whether to validate network traffic to or from this
     *            network interface.
     *            </p>
     */
    public void setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether to validate network traffic to or from this network
     * interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceDestCheck <p>
     *            Indicates whether to validate network traffic to or from this
     *            network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterface withSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
        return this;
    }

    /**
     * <p>
     * The status of the network interface.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, associated, attaching, in-use,
     * detaching
     *
     * @return <p>
     *         The status of the network interface.
     *         </p>
     * @see NetworkInterfaceStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the network interface.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, associated, attaching, in-use,
     * detaching
     *
     * @param status <p>
     *            The status of the network interface.
     *            </p>
     * @see NetworkInterfaceStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, associated, attaching, in-use,
     * detaching
     *
     * @param status <p>
     *            The status of the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NetworkInterfaceStatus
     */
    public InstanceNetworkInterface withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the network interface.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, associated, attaching, in-use,
     * detaching
     *
     * @param status <p>
     *            The status of the network interface.
     *            </p>
     * @see NetworkInterfaceStatus
     */
    public void setStatus(NetworkInterfaceStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, associated, attaching, in-use,
     * detaching
     *
     * @param status <p>
     *            The status of the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NetworkInterfaceStatus
     */
    public InstanceNetworkInterface withStatus(NetworkInterfaceStatus status) {
        this.status = status.toString();
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
    public InstanceNetworkInterface withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     *
     * @return <p>
     *         The ID of the VPC.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     *
     * @param vpcId <p>
     *            The ID of the VPC.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            The ID of the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterface withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * Describes the type of network interface.
     * </p>
     * <p>
     * Valid values: <code>interface</code> | <code>efa</code>
     * </p>
     *
     * @return <p>
     *         Describes the type of network interface.
     *         </p>
     *         <p>
     *         Valid values: <code>interface</code> | <code>efa</code>
     *         </p>
     */
    public String getInterfaceType() {
        return interfaceType;
    }

    /**
     * <p>
     * Describes the type of network interface.
     * </p>
     * <p>
     * Valid values: <code>interface</code> | <code>efa</code>
     * </p>
     *
     * @param interfaceType <p>
     *            Describes the type of network interface.
     *            </p>
     *            <p>
     *            Valid values: <code>interface</code> | <code>efa</code>
     *            </p>
     */
    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }

    /**
     * <p>
     * Describes the type of network interface.
     * </p>
     * <p>
     * Valid values: <code>interface</code> | <code>efa</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param interfaceType <p>
     *            Describes the type of network interface.
     *            </p>
     *            <p>
     *            Valid values: <code>interface</code> | <code>efa</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterface withInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
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
        if (getAssociation() != null)
            sb.append("Association: " + getAssociation() + ",");
        if (getAttachment() != null)
            sb.append("Attachment: " + getAttachment() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getGroups() != null)
            sb.append("Groups: " + getGroups() + ",");
        if (getIpv6Addresses() != null)
            sb.append("Ipv6Addresses: " + getIpv6Addresses() + ",");
        if (getMacAddress() != null)
            sb.append("MacAddress: " + getMacAddress() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getPrivateDnsName() != null)
            sb.append("PrivateDnsName: " + getPrivateDnsName() + ",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: " + getPrivateIpAddress() + ",");
        if (getPrivateIpAddresses() != null)
            sb.append("PrivateIpAddresses: " + getPrivateIpAddresses() + ",");
        if (getSourceDestCheck() != null)
            sb.append("SourceDestCheck: " + getSourceDestCheck() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getInterfaceType() != null)
            sb.append("InterfaceType: " + getInterfaceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssociation() == null) ? 0 : getAssociation().hashCode());
        hashCode = prime * hashCode + ((getAttachment() == null) ? 0 : getAttachment().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode
                + ((getIpv6Addresses() == null) ? 0 : getIpv6Addresses().hashCode());
        hashCode = prime * hashCode + ((getMacAddress() == null) ? 0 : getMacAddress().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateDnsName() == null) ? 0 : getPrivateDnsName().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateIpAddresses() == null) ? 0 : getPrivateIpAddresses().hashCode());
        hashCode = prime * hashCode
                + ((getSourceDestCheck() == null) ? 0 : getSourceDestCheck().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode
                + ((getInterfaceType() == null) ? 0 : getInterfaceType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceNetworkInterface == false)
            return false;
        InstanceNetworkInterface other = (InstanceNetworkInterface) obj;

        if (other.getAssociation() == null ^ this.getAssociation() == null)
            return false;
        if (other.getAssociation() != null
                && other.getAssociation().equals(this.getAssociation()) == false)
            return false;
        if (other.getAttachment() == null ^ this.getAttachment() == null)
            return false;
        if (other.getAttachment() != null
                && other.getAttachment().equals(this.getAttachment()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getIpv6Addresses() == null ^ this.getIpv6Addresses() == null)
            return false;
        if (other.getIpv6Addresses() != null
                && other.getIpv6Addresses().equals(this.getIpv6Addresses()) == false)
            return false;
        if (other.getMacAddress() == null ^ this.getMacAddress() == null)
            return false;
        if (other.getMacAddress() != null
                && other.getMacAddress().equals(this.getMacAddress()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getPrivateDnsName() == null ^ this.getPrivateDnsName() == null)
            return false;
        if (other.getPrivateDnsName() != null
                && other.getPrivateDnsName().equals(this.getPrivateDnsName()) == false)
            return false;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null
                && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        if (other.getPrivateIpAddresses() == null ^ this.getPrivateIpAddresses() == null)
            return false;
        if (other.getPrivateIpAddresses() != null
                && other.getPrivateIpAddresses().equals(this.getPrivateIpAddresses()) == false)
            return false;
        if (other.getSourceDestCheck() == null ^ this.getSourceDestCheck() == null)
            return false;
        if (other.getSourceDestCheck() != null
                && other.getSourceDestCheck().equals(this.getSourceDestCheck()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getInterfaceType() == null ^ this.getInterfaceType() == null)
            return false;
        if (other.getInterfaceType() != null
                && other.getInterfaceType().equals(this.getInterfaceType()) == false)
            return false;
        return true;
    }
}
