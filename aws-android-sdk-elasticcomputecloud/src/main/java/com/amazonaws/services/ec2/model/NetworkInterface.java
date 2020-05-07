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
public class NetworkInterface implements Serializable {
    /**
     * <p>
     * The association information for an Elastic IP address (IPv4) associated
     * with the network interface.
     * </p>
     */
    private NetworkInterfaceAssociation association;

    /**
     * <p>
     * The network interface attachment.
     * </p>
     */
    private NetworkInterfaceAttachment attachment;

    /**
     * <p>
     * The Availability Zone.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * A description.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Any security groups for the network interface.
     * </p>
     */
    private java.util.List<GroupIdentifier> groups;

    /**
     * <p>
     * The type of network interface.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>interface, natGateway, efa
     */
    private String interfaceType;

    /**
     * <p>
     * The IPv6 addresses associated with the network interface.
     * </p>
     */
    private java.util.List<NetworkInterfaceIpv6Address> ipv6Addresses;

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
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     */
    private String outpostArn;

    /**
     * <p>
     * The AWS account ID of the owner of the network interface.
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
     * The private IPv4 addresses associated with the network interface.
     * </p>
     */
    private java.util.List<NetworkInterfacePrivateIpAddress> privateIpAddresses;

    /**
     * <p>
     * The ID of the entity that launched the instance on your behalf (for
     * example, AWS Management Console or Auto Scaling).
     * </p>
     */
    private String requesterId;

    /**
     * <p>
     * Indicates whether the network interface is being managed by AWS.
     * </p>
     */
    private Boolean requesterManaged;

    /**
     * <p>
     * Indicates whether traffic to or from the instance is validated.
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
     * Any tags assigned to the network interface.
     * </p>
     */
    private java.util.List<Tag> tagSet;

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The association information for an Elastic IP address (IPv4) associated
     * with the network interface.
     * </p>
     *
     * @return <p>
     *         The association information for an Elastic IP address (IPv4)
     *         associated with the network interface.
     *         </p>
     */
    public NetworkInterfaceAssociation getAssociation() {
        return association;
    }

    /**
     * <p>
     * The association information for an Elastic IP address (IPv4) associated
     * with the network interface.
     * </p>
     *
     * @param association <p>
     *            The association information for an Elastic IP address (IPv4)
     *            associated with the network interface.
     *            </p>
     */
    public void setAssociation(NetworkInterfaceAssociation association) {
        this.association = association;
    }

    /**
     * <p>
     * The association information for an Elastic IP address (IPv4) associated
     * with the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param association <p>
     *            The association information for an Elastic IP address (IPv4)
     *            associated with the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withAssociation(NetworkInterfaceAssociation association) {
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
    public NetworkInterfaceAttachment getAttachment() {
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
    public void setAttachment(NetworkInterfaceAttachment attachment) {
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
    public NetworkInterface withAttachment(NetworkInterfaceAttachment attachment) {
        this.attachment = attachment;
        return this;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     *
     * @return <p>
     *         The Availability Zone.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * A description.
     * </p>
     *
     * @return <p>
     *         A description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description.
     * </p>
     *
     * @param description <p>
     *            A description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Any security groups for the network interface.
     * </p>
     *
     * @return <p>
     *         Any security groups for the network interface.
     *         </p>
     */
    public java.util.List<GroupIdentifier> getGroups() {
        return groups;
    }

    /**
     * <p>
     * Any security groups for the network interface.
     * </p>
     *
     * @param groups <p>
     *            Any security groups for the network interface.
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
     * Any security groups for the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            Any security groups for the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withGroups(GroupIdentifier... groups) {
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
     * Any security groups for the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            Any security groups for the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withGroups(java.util.Collection<GroupIdentifier> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * The type of network interface.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>interface, natGateway, efa
     *
     * @return <p>
     *         The type of network interface.
     *         </p>
     * @see NetworkInterfaceType
     */
    public String getInterfaceType() {
        return interfaceType;
    }

    /**
     * <p>
     * The type of network interface.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>interface, natGateway, efa
     *
     * @param interfaceType <p>
     *            The type of network interface.
     *            </p>
     * @see NetworkInterfaceType
     */
    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }

    /**
     * <p>
     * The type of network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>interface, natGateway, efa
     *
     * @param interfaceType <p>
     *            The type of network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NetworkInterfaceType
     */
    public NetworkInterface withInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
        return this;
    }

    /**
     * <p>
     * The type of network interface.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>interface, natGateway, efa
     *
     * @param interfaceType <p>
     *            The type of network interface.
     *            </p>
     * @see NetworkInterfaceType
     */
    public void setInterfaceType(NetworkInterfaceType interfaceType) {
        this.interfaceType = interfaceType.toString();
    }

    /**
     * <p>
     * The type of network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>interface, natGateway, efa
     *
     * @param interfaceType <p>
     *            The type of network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NetworkInterfaceType
     */
    public NetworkInterface withInterfaceType(NetworkInterfaceType interfaceType) {
        this.interfaceType = interfaceType.toString();
        return this;
    }

    /**
     * <p>
     * The IPv6 addresses associated with the network interface.
     * </p>
     *
     * @return <p>
     *         The IPv6 addresses associated with the network interface.
     *         </p>
     */
    public java.util.List<NetworkInterfaceIpv6Address> getIpv6Addresses() {
        return ipv6Addresses;
    }

    /**
     * <p>
     * The IPv6 addresses associated with the network interface.
     * </p>
     *
     * @param ipv6Addresses <p>
     *            The IPv6 addresses associated with the network interface.
     *            </p>
     */
    public void setIpv6Addresses(java.util.Collection<NetworkInterfaceIpv6Address> ipv6Addresses) {
        if (ipv6Addresses == null) {
            this.ipv6Addresses = null;
            return;
        }

        this.ipv6Addresses = new java.util.ArrayList<NetworkInterfaceIpv6Address>(ipv6Addresses);
    }

    /**
     * <p>
     * The IPv6 addresses associated with the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Addresses <p>
     *            The IPv6 addresses associated with the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withIpv6Addresses(NetworkInterfaceIpv6Address... ipv6Addresses) {
        if (getIpv6Addresses() == null) {
            this.ipv6Addresses = new java.util.ArrayList<NetworkInterfaceIpv6Address>(
                    ipv6Addresses.length);
        }
        for (NetworkInterfaceIpv6Address value : ipv6Addresses) {
            this.ipv6Addresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IPv6 addresses associated with the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Addresses <p>
     *            The IPv6 addresses associated with the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withIpv6Addresses(
            java.util.Collection<NetworkInterfaceIpv6Address> ipv6Addresses) {
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
    public NetworkInterface withMacAddress(String macAddress) {
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
    public NetworkInterface withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Outpost.
     *         </p>
     */
    public String getOutpostArn() {
        return outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     *
     * @param outpostArn <p>
     *            The Amazon Resource Name (ARN) of the Outpost.
     *            </p>
     */
    public void setOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outpostArn <p>
     *            The Amazon Resource Name (ARN) of the Outpost.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the network interface.
     * </p>
     *
     * @return <p>
     *         The AWS account ID of the owner of the network interface.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the network interface.
     * </p>
     *
     * @param ownerId <p>
     *            The AWS account ID of the owner of the network interface.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The AWS account ID of the owner of the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withOwnerId(String ownerId) {
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
    public NetworkInterface withPrivateDnsName(String privateDnsName) {
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
    public NetworkInterface withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * <p>
     * The private IPv4 addresses associated with the network interface.
     * </p>
     *
     * @return <p>
     *         The private IPv4 addresses associated with the network interface.
     *         </p>
     */
    public java.util.List<NetworkInterfacePrivateIpAddress> getPrivateIpAddresses() {
        return privateIpAddresses;
    }

    /**
     * <p>
     * The private IPv4 addresses associated with the network interface.
     * </p>
     *
     * @param privateIpAddresses <p>
     *            The private IPv4 addresses associated with the network
     *            interface.
     *            </p>
     */
    public void setPrivateIpAddresses(
            java.util.Collection<NetworkInterfacePrivateIpAddress> privateIpAddresses) {
        if (privateIpAddresses == null) {
            this.privateIpAddresses = null;
            return;
        }

        this.privateIpAddresses = new java.util.ArrayList<NetworkInterfacePrivateIpAddress>(
                privateIpAddresses);
    }

    /**
     * <p>
     * The private IPv4 addresses associated with the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddresses <p>
     *            The private IPv4 addresses associated with the network
     *            interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withPrivateIpAddresses(
            NetworkInterfacePrivateIpAddress... privateIpAddresses) {
        if (getPrivateIpAddresses() == null) {
            this.privateIpAddresses = new java.util.ArrayList<NetworkInterfacePrivateIpAddress>(
                    privateIpAddresses.length);
        }
        for (NetworkInterfacePrivateIpAddress value : privateIpAddresses) {
            this.privateIpAddresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The private IPv4 addresses associated with the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddresses <p>
     *            The private IPv4 addresses associated with the network
     *            interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withPrivateIpAddresses(
            java.util.Collection<NetworkInterfacePrivateIpAddress> privateIpAddresses) {
        setPrivateIpAddresses(privateIpAddresses);
        return this;
    }

    /**
     * <p>
     * The ID of the entity that launched the instance on your behalf (for
     * example, AWS Management Console or Auto Scaling).
     * </p>
     *
     * @return <p>
     *         The ID of the entity that launched the instance on your behalf
     *         (for example, AWS Management Console or Auto Scaling).
     *         </p>
     */
    public String getRequesterId() {
        return requesterId;
    }

    /**
     * <p>
     * The ID of the entity that launched the instance on your behalf (for
     * example, AWS Management Console or Auto Scaling).
     * </p>
     *
     * @param requesterId <p>
     *            The ID of the entity that launched the instance on your behalf
     *            (for example, AWS Management Console or Auto Scaling).
     *            </p>
     */
    public void setRequesterId(String requesterId) {
        this.requesterId = requesterId;
    }

    /**
     * <p>
     * The ID of the entity that launched the instance on your behalf (for
     * example, AWS Management Console or Auto Scaling).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requesterId <p>
     *            The ID of the entity that launched the instance on your behalf
     *            (for example, AWS Management Console or Auto Scaling).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withRequesterId(String requesterId) {
        this.requesterId = requesterId;
        return this;
    }

    /**
     * <p>
     * Indicates whether the network interface is being managed by AWS.
     * </p>
     *
     * @return <p>
     *         Indicates whether the network interface is being managed by AWS.
     *         </p>
     */
    public Boolean isRequesterManaged() {
        return requesterManaged;
    }

    /**
     * <p>
     * Indicates whether the network interface is being managed by AWS.
     * </p>
     *
     * @return <p>
     *         Indicates whether the network interface is being managed by AWS.
     *         </p>
     */
    public Boolean getRequesterManaged() {
        return requesterManaged;
    }

    /**
     * <p>
     * Indicates whether the network interface is being managed by AWS.
     * </p>
     *
     * @param requesterManaged <p>
     *            Indicates whether the network interface is being managed by
     *            AWS.
     *            </p>
     */
    public void setRequesterManaged(Boolean requesterManaged) {
        this.requesterManaged = requesterManaged;
    }

    /**
     * <p>
     * Indicates whether the network interface is being managed by AWS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requesterManaged <p>
     *            Indicates whether the network interface is being managed by
     *            AWS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withRequesterManaged(Boolean requesterManaged) {
        this.requesterManaged = requesterManaged;
        return this;
    }

    /**
     * <p>
     * Indicates whether traffic to or from the instance is validated.
     * </p>
     *
     * @return <p>
     *         Indicates whether traffic to or from the instance is validated.
     *         </p>
     */
    public Boolean isSourceDestCheck() {
        return sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether traffic to or from the instance is validated.
     * </p>
     *
     * @return <p>
     *         Indicates whether traffic to or from the instance is validated.
     *         </p>
     */
    public Boolean getSourceDestCheck() {
        return sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether traffic to or from the instance is validated.
     * </p>
     *
     * @param sourceDestCheck <p>
     *            Indicates whether traffic to or from the instance is
     *            validated.
     *            </p>
     */
    public void setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether traffic to or from the instance is validated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceDestCheck <p>
     *            Indicates whether traffic to or from the instance is
     *            validated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withSourceDestCheck(Boolean sourceDestCheck) {
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
    public NetworkInterface withStatus(String status) {
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
    public NetworkInterface withStatus(NetworkInterfaceStatus status) {
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
    public NetworkInterface withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the network interface.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the network interface.
     *         </p>
     */
    public java.util.List<Tag> getTagSet() {
        return tagSet;
    }

    /**
     * <p>
     * Any tags assigned to the network interface.
     * </p>
     *
     * @param tagSet <p>
     *            Any tags assigned to the network interface.
     *            </p>
     */
    public void setTagSet(java.util.Collection<Tag> tagSet) {
        if (tagSet == null) {
            this.tagSet = null;
            return;
        }

        this.tagSet = new java.util.ArrayList<Tag>(tagSet);
    }

    /**
     * <p>
     * Any tags assigned to the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSet <p>
     *            Any tags assigned to the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withTagSet(Tag... tagSet) {
        if (getTagSet() == null) {
            this.tagSet = new java.util.ArrayList<Tag>(tagSet.length);
        }
        for (Tag value : tagSet) {
            this.tagSet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSet <p>
     *            Any tags assigned to the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withTagSet(java.util.Collection<Tag> tagSet) {
        setTagSet(tagSet);
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
    public NetworkInterface withVpcId(String vpcId) {
        this.vpcId = vpcId;
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getGroups() != null)
            sb.append("Groups: " + getGroups() + ",");
        if (getInterfaceType() != null)
            sb.append("InterfaceType: " + getInterfaceType() + ",");
        if (getIpv6Addresses() != null)
            sb.append("Ipv6Addresses: " + getIpv6Addresses() + ",");
        if (getMacAddress() != null)
            sb.append("MacAddress: " + getMacAddress() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getOutpostArn() != null)
            sb.append("OutpostArn: " + getOutpostArn() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getPrivateDnsName() != null)
            sb.append("PrivateDnsName: " + getPrivateDnsName() + ",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: " + getPrivateIpAddress() + ",");
        if (getPrivateIpAddresses() != null)
            sb.append("PrivateIpAddresses: " + getPrivateIpAddresses() + ",");
        if (getRequesterId() != null)
            sb.append("RequesterId: " + getRequesterId() + ",");
        if (getRequesterManaged() != null)
            sb.append("RequesterManaged: " + getRequesterManaged() + ",");
        if (getSourceDestCheck() != null)
            sb.append("SourceDestCheck: " + getSourceDestCheck() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getTagSet() != null)
            sb.append("TagSet: " + getTagSet() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId());
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
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode
                + ((getInterfaceType() == null) ? 0 : getInterfaceType().hashCode());
        hashCode = prime * hashCode
                + ((getIpv6Addresses() == null) ? 0 : getIpv6Addresses().hashCode());
        hashCode = prime * hashCode + ((getMacAddress() == null) ? 0 : getMacAddress().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateDnsName() == null) ? 0 : getPrivateDnsName().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateIpAddresses() == null) ? 0 : getPrivateIpAddresses().hashCode());
        hashCode = prime * hashCode
                + ((getRequesterId() == null) ? 0 : getRequesterId().hashCode());
        hashCode = prime * hashCode
                + ((getRequesterManaged() == null) ? 0 : getRequesterManaged().hashCode());
        hashCode = prime * hashCode
                + ((getSourceDestCheck() == null) ? 0 : getSourceDestCheck().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getTagSet() == null) ? 0 : getTagSet().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkInterface == false)
            return false;
        NetworkInterface other = (NetworkInterface) obj;

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
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
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
        if (other.getInterfaceType() == null ^ this.getInterfaceType() == null)
            return false;
        if (other.getInterfaceType() != null
                && other.getInterfaceType().equals(this.getInterfaceType()) == false)
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
        if (other.getOutpostArn() == null ^ this.getOutpostArn() == null)
            return false;
        if (other.getOutpostArn() != null
                && other.getOutpostArn().equals(this.getOutpostArn()) == false)
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
        if (other.getRequesterId() == null ^ this.getRequesterId() == null)
            return false;
        if (other.getRequesterId() != null
                && other.getRequesterId().equals(this.getRequesterId()) == false)
            return false;
        if (other.getRequesterManaged() == null ^ this.getRequesterManaged() == null)
            return false;
        if (other.getRequesterManaged() != null
                && other.getRequesterManaged().equals(this.getRequesterManaged()) == false)
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
        if (other.getTagSet() == null ^ this.getTagSet() == null)
            return false;
        if (other.getTagSet() != null && other.getTagSet().equals(this.getTagSet()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }
}
