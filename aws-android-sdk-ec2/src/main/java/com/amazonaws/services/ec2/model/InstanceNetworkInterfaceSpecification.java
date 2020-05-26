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
public class InstanceNetworkInterfaceSpecification implements Serializable {
    /**
     * <p>
     * Indicates whether to assign a public IPv4 address to an instance you
     * launch in a VPC. The public IP address can only be assigned to a network
     * interface for eth0, and can only be assigned to a new network interface,
     * not an existing one. You cannot specify more than one network interface
     * in the request. If launching into a default subnet, the default value is
     * <code>true</code>.
     * </p>
     */
    private Boolean associatePublicIpAddress;

    /**
     * <p>
     * If set to <code>true</code>, the interface is deleted when the instance
     * is terminated. You can specify <code>true</code> only if creating a new
     * network interface when launching an instance.
     * </p>
     */
    private Boolean deleteOnTermination;

    /**
     * <p>
     * The description of the network interface. Applies only if creating a
     * network interface when launching an instance.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The position of the network interface in the attachment order. A primary
     * network interface has a device index of 0.
     * </p>
     * <p>
     * If you specify a network interface when launching an instance, you must
     * specify the device index.
     * </p>
     */
    private Integer deviceIndex;

    /**
     * <p>
     * The IDs of the security groups for the network interface. Applies only if
     * creating a network interface when launching an instance.
     * </p>
     */
    private java.util.List<String> groups;

    /**
     * <p>
     * A number of IPv6 addresses to assign to the network interface. Amazon EC2
     * chooses the IPv6 addresses from the range of the subnet. You cannot
     * specify this option and the option to assign specific IPv6 addresses in
     * the same request. You can specify this option if you've specified a
     * minimum number of instances to launch.
     * </p>
     */
    private Integer ipv6AddressCount;

    /**
     * <p>
     * One or more IPv6 addresses to assign to the network interface. You cannot
     * specify this option and the option to assign a number of IPv6 addresses
     * in the same request. You cannot specify this option if you've specified a
     * minimum number of instances to launch.
     * </p>
     */
    private java.util.List<InstanceIpv6Address> ipv6Addresses;

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * <p>
     * If you are creating a Spot Fleet, omit this parameter because you can’t
     * specify a network interface ID in a launch specification.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * The private IPv4 address of the network interface. Applies only if
     * creating a network interface when launching an instance. You cannot
     * specify this option if you're launching more than one instance in a <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     * >RunInstances</a> request.
     * </p>
     */
    private String privateIpAddress;

    /**
     * <p>
     * One or more private IPv4 addresses to assign to the network interface.
     * Only one private IPv4 address can be designated as primary. You cannot
     * specify this option if you're launching more than one instance in a <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     * >RunInstances</a> request.
     * </p>
     */
    private java.util.List<PrivateIpAddressSpecification> privateIpAddresses;

    /**
     * <p>
     * The number of secondary private IPv4 addresses. You can't specify this
     * option and specify more than one private IP address using the private IP
     * addresses option. You cannot specify this option if you're launching more
     * than one instance in a <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     * >RunInstances</a> request.
     * </p>
     */
    private Integer secondaryPrivateIpAddressCount;

    /**
     * <p>
     * The ID of the subnet associated with the network interface. Applies only
     * if creating a network interface when launching an instance.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * The type of network interface. To create an Elastic Fabric Adapter (EFA),
     * specify <code>efa</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/efa.html"
     * >Elastic Fabric Adapter</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * If you are not creating an EFA, specify <code>interface</code> or omit
     * this parameter.
     * </p>
     * <p>
     * Valid values: <code>interface</code> | <code>efa</code>
     * </p>
     */
    private String interfaceType;

    /**
     * <p>
     * Indicates whether to assign a public IPv4 address to an instance you
     * launch in a VPC. The public IP address can only be assigned to a network
     * interface for eth0, and can only be assigned to a new network interface,
     * not an existing one. You cannot specify more than one network interface
     * in the request. If launching into a default subnet, the default value is
     * <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Indicates whether to assign a public IPv4 address to an instance
     *         you launch in a VPC. The public IP address can only be assigned
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
     * Indicates whether to assign a public IPv4 address to an instance you
     * launch in a VPC. The public IP address can only be assigned to a network
     * interface for eth0, and can only be assigned to a new network interface,
     * not an existing one. You cannot specify more than one network interface
     * in the request. If launching into a default subnet, the default value is
     * <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Indicates whether to assign a public IPv4 address to an instance
     *         you launch in a VPC. The public IP address can only be assigned
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
     * Indicates whether to assign a public IPv4 address to an instance you
     * launch in a VPC. The public IP address can only be assigned to a network
     * interface for eth0, and can only be assigned to a new network interface,
     * not an existing one. You cannot specify more than one network interface
     * in the request. If launching into a default subnet, the default value is
     * <code>true</code>.
     * </p>
     *
     * @param associatePublicIpAddress <p>
     *            Indicates whether to assign a public IPv4 address to an
     *            instance you launch in a VPC. The public IP address can only
     *            be assigned to a network interface for eth0, and can only be
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
     * Indicates whether to assign a public IPv4 address to an instance you
     * launch in a VPC. The public IP address can only be assigned to a network
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
     *            Indicates whether to assign a public IPv4 address to an
     *            instance you launch in a VPC. The public IP address can only
     *            be assigned to a network interface for eth0, and can only be
     *            assigned to a new network interface, not an existing one. You
     *            cannot specify more than one network interface in the request.
     *            If launching into a default subnet, the default value is
     *            <code>true</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterfaceSpecification withAssociatePublicIpAddress(
            Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, the interface is deleted when the instance
     * is terminated. You can specify <code>true</code> only if creating a new
     * network interface when launching an instance.
     * </p>
     *
     * @return <p>
     *         If set to <code>true</code>, the interface is deleted when the
     *         instance is terminated. You can specify <code>true</code> only if
     *         creating a new network interface when launching an instance.
     *         </p>
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * <p>
     * If set to <code>true</code>, the interface is deleted when the instance
     * is terminated. You can specify <code>true</code> only if creating a new
     * network interface when launching an instance.
     * </p>
     *
     * @return <p>
     *         If set to <code>true</code>, the interface is deleted when the
     *         instance is terminated. You can specify <code>true</code> only if
     *         creating a new network interface when launching an instance.
     *         </p>
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * <p>
     * If set to <code>true</code>, the interface is deleted when the instance
     * is terminated. You can specify <code>true</code> only if creating a new
     * network interface when launching an instance.
     * </p>
     *
     * @param deleteOnTermination <p>
     *            If set to <code>true</code>, the interface is deleted when the
     *            instance is terminated. You can specify <code>true</code> only
     *            if creating a new network interface when launching an
     *            instance.
     *            </p>
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * If set to <code>true</code>, the interface is deleted when the instance
     * is terminated. You can specify <code>true</code> only if creating a new
     * network interface when launching an instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteOnTermination <p>
     *            If set to <code>true</code>, the interface is deleted when the
     *            instance is terminated. You can specify <code>true</code> only
     *            if creating a new network interface when launching an
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterfaceSpecification withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * <p>
     * The description of the network interface. Applies only if creating a
     * network interface when launching an instance.
     * </p>
     *
     * @return <p>
     *         The description of the network interface. Applies only if
     *         creating a network interface when launching an instance.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the network interface. Applies only if creating a
     * network interface when launching an instance.
     * </p>
     *
     * @param description <p>
     *            The description of the network interface. Applies only if
     *            creating a network interface when launching an instance.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the network interface. Applies only if creating a
     * network interface when launching an instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the network interface. Applies only if
     *            creating a network interface when launching an instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterfaceSpecification withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The position of the network interface in the attachment order. A primary
     * network interface has a device index of 0.
     * </p>
     * <p>
     * If you specify a network interface when launching an instance, you must
     * specify the device index.
     * </p>
     *
     * @return <p>
     *         The position of the network interface in the attachment order. A
     *         primary network interface has a device index of 0.
     *         </p>
     *         <p>
     *         If you specify a network interface when launching an instance,
     *         you must specify the device index.
     *         </p>
     */
    public Integer getDeviceIndex() {
        return deviceIndex;
    }

    /**
     * <p>
     * The position of the network interface in the attachment order. A primary
     * network interface has a device index of 0.
     * </p>
     * <p>
     * If you specify a network interface when launching an instance, you must
     * specify the device index.
     * </p>
     *
     * @param deviceIndex <p>
     *            The position of the network interface in the attachment order.
     *            A primary network interface has a device index of 0.
     *            </p>
     *            <p>
     *            If you specify a network interface when launching an instance,
     *            you must specify the device index.
     *            </p>
     */
    public void setDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
    }

    /**
     * <p>
     * The position of the network interface in the attachment order. A primary
     * network interface has a device index of 0.
     * </p>
     * <p>
     * If you specify a network interface when launching an instance, you must
     * specify the device index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceIndex <p>
     *            The position of the network interface in the attachment order.
     *            A primary network interface has a device index of 0.
     *            </p>
     *            <p>
     *            If you specify a network interface when launching an instance,
     *            you must specify the device index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterfaceSpecification withDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups for the network interface. Applies only if
     * creating a network interface when launching an instance.
     * </p>
     *
     * @return <p>
     *         The IDs of the security groups for the network interface. Applies
     *         only if creating a network interface when launching an instance.
     *         </p>
     */
    public java.util.List<String> getGroups() {
        return groups;
    }

    /**
     * <p>
     * The IDs of the security groups for the network interface. Applies only if
     * creating a network interface when launching an instance.
     * </p>
     *
     * @param groups <p>
     *            The IDs of the security groups for the network interface.
     *            Applies only if creating a network interface when launching an
     *            instance.
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
     * The IDs of the security groups for the network interface. Applies only if
     * creating a network interface when launching an instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            The IDs of the security groups for the network interface.
     *            Applies only if creating a network interface when launching an
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterfaceSpecification withGroups(String... groups) {
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
     * The IDs of the security groups for the network interface. Applies only if
     * creating a network interface when launching an instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            The IDs of the security groups for the network interface.
     *            Applies only if creating a network interface when launching an
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterfaceSpecification withGroups(java.util.Collection<String> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * A number of IPv6 addresses to assign to the network interface. Amazon EC2
     * chooses the IPv6 addresses from the range of the subnet. You cannot
     * specify this option and the option to assign specific IPv6 addresses in
     * the same request. You can specify this option if you've specified a
     * minimum number of instances to launch.
     * </p>
     *
     * @return <p>
     *         A number of IPv6 addresses to assign to the network interface.
     *         Amazon EC2 chooses the IPv6 addresses from the range of the
     *         subnet. You cannot specify this option and the option to assign
     *         specific IPv6 addresses in the same request. You can specify this
     *         option if you've specified a minimum number of instances to
     *         launch.
     *         </p>
     */
    public Integer getIpv6AddressCount() {
        return ipv6AddressCount;
    }

    /**
     * <p>
     * A number of IPv6 addresses to assign to the network interface. Amazon EC2
     * chooses the IPv6 addresses from the range of the subnet. You cannot
     * specify this option and the option to assign specific IPv6 addresses in
     * the same request. You can specify this option if you've specified a
     * minimum number of instances to launch.
     * </p>
     *
     * @param ipv6AddressCount <p>
     *            A number of IPv6 addresses to assign to the network interface.
     *            Amazon EC2 chooses the IPv6 addresses from the range of the
     *            subnet. You cannot specify this option and the option to
     *            assign specific IPv6 addresses in the same request. You can
     *            specify this option if you've specified a minimum number of
     *            instances to launch.
     *            </p>
     */
    public void setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
    }

    /**
     * <p>
     * A number of IPv6 addresses to assign to the network interface. Amazon EC2
     * chooses the IPv6 addresses from the range of the subnet. You cannot
     * specify this option and the option to assign specific IPv6 addresses in
     * the same request. You can specify this option if you've specified a
     * minimum number of instances to launch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6AddressCount <p>
     *            A number of IPv6 addresses to assign to the network interface.
     *            Amazon EC2 chooses the IPv6 addresses from the range of the
     *            subnet. You cannot specify this option and the option to
     *            assign specific IPv6 addresses in the same request. You can
     *            specify this option if you've specified a minimum number of
     *            instances to launch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterfaceSpecification withIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }

    /**
     * <p>
     * One or more IPv6 addresses to assign to the network interface. You cannot
     * specify this option and the option to assign a number of IPv6 addresses
     * in the same request. You cannot specify this option if you've specified a
     * minimum number of instances to launch.
     * </p>
     *
     * @return <p>
     *         One or more IPv6 addresses to assign to the network interface.
     *         You cannot specify this option and the option to assign a number
     *         of IPv6 addresses in the same request. You cannot specify this
     *         option if you've specified a minimum number of instances to
     *         launch.
     *         </p>
     */
    public java.util.List<InstanceIpv6Address> getIpv6Addresses() {
        return ipv6Addresses;
    }

    /**
     * <p>
     * One or more IPv6 addresses to assign to the network interface. You cannot
     * specify this option and the option to assign a number of IPv6 addresses
     * in the same request. You cannot specify this option if you've specified a
     * minimum number of instances to launch.
     * </p>
     *
     * @param ipv6Addresses <p>
     *            One or more IPv6 addresses to assign to the network interface.
     *            You cannot specify this option and the option to assign a
     *            number of IPv6 addresses in the same request. You cannot
     *            specify this option if you've specified a minimum number of
     *            instances to launch.
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
     * One or more IPv6 addresses to assign to the network interface. You cannot
     * specify this option and the option to assign a number of IPv6 addresses
     * in the same request. You cannot specify this option if you've specified a
     * minimum number of instances to launch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Addresses <p>
     *            One or more IPv6 addresses to assign to the network interface.
     *            You cannot specify this option and the option to assign a
     *            number of IPv6 addresses in the same request. You cannot
     *            specify this option if you've specified a minimum number of
     *            instances to launch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterfaceSpecification withIpv6Addresses(
            InstanceIpv6Address... ipv6Addresses) {
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
     * One or more IPv6 addresses to assign to the network interface. You cannot
     * specify this option and the option to assign a number of IPv6 addresses
     * in the same request. You cannot specify this option if you've specified a
     * minimum number of instances to launch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Addresses <p>
     *            One or more IPv6 addresses to assign to the network interface.
     *            You cannot specify this option and the option to assign a
     *            number of IPv6 addresses in the same request. You cannot
     *            specify this option if you've specified a minimum number of
     *            instances to launch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterfaceSpecification withIpv6Addresses(
            java.util.Collection<InstanceIpv6Address> ipv6Addresses) {
        setIpv6Addresses(ipv6Addresses);
        return this;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * <p>
     * If you are creating a Spot Fleet, omit this parameter because you can’t
     * specify a network interface ID in a launch specification.
     * </p>
     *
     * @return <p>
     *         The ID of the network interface.
     *         </p>
     *         <p>
     *         If you are creating a Spot Fleet, omit this parameter because you
     *         can’t specify a network interface ID in a launch specification.
     *         </p>
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * <p>
     * If you are creating a Spot Fleet, omit this parameter because you can’t
     * specify a network interface ID in a launch specification.
     * </p>
     *
     * @param networkInterfaceId <p>
     *            The ID of the network interface.
     *            </p>
     *            <p>
     *            If you are creating a Spot Fleet, omit this parameter because
     *            you can’t specify a network interface ID in a launch
     *            specification.
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
     * If you are creating a Spot Fleet, omit this parameter because you can’t
     * specify a network interface ID in a launch specification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaceId <p>
     *            The ID of the network interface.
     *            </p>
     *            <p>
     *            If you are creating a Spot Fleet, omit this parameter because
     *            you can’t specify a network interface ID in a launch
     *            specification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterfaceSpecification withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * The private IPv4 address of the network interface. Applies only if
     * creating a network interface when launching an instance. You cannot
     * specify this option if you're launching more than one instance in a <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     * >RunInstances</a> request.
     * </p>
     *
     * @return <p>
     *         The private IPv4 address of the network interface. Applies only
     *         if creating a network interface when launching an instance. You
     *         cannot specify this option if you're launching more than one
     *         instance in a <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     *         >RunInstances</a> request.
     *         </p>
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * <p>
     * The private IPv4 address of the network interface. Applies only if
     * creating a network interface when launching an instance. You cannot
     * specify this option if you're launching more than one instance in a <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     * >RunInstances</a> request.
     * </p>
     *
     * @param privateIpAddress <p>
     *            The private IPv4 address of the network interface. Applies
     *            only if creating a network interface when launching an
     *            instance. You cannot specify this option if you're launching
     *            more than one instance in a <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     *            >RunInstances</a> request.
     *            </p>
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The private IPv4 address of the network interface. Applies only if
     * creating a network interface when launching an instance. You cannot
     * specify this option if you're launching more than one instance in a <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     * >RunInstances</a> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddress <p>
     *            The private IPv4 address of the network interface. Applies
     *            only if creating a network interface when launching an
     *            instance. You cannot specify this option if you're launching
     *            more than one instance in a <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     *            >RunInstances</a> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterfaceSpecification withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * <p>
     * One or more private IPv4 addresses to assign to the network interface.
     * Only one private IPv4 address can be designated as primary. You cannot
     * specify this option if you're launching more than one instance in a <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     * >RunInstances</a> request.
     * </p>
     *
     * @return <p>
     *         One or more private IPv4 addresses to assign to the network
     *         interface. Only one private IPv4 address can be designated as
     *         primary. You cannot specify this option if you're launching more
     *         than one instance in a <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     *         >RunInstances</a> request.
     *         </p>
     */
    public java.util.List<PrivateIpAddressSpecification> getPrivateIpAddresses() {
        return privateIpAddresses;
    }

    /**
     * <p>
     * One or more private IPv4 addresses to assign to the network interface.
     * Only one private IPv4 address can be designated as primary. You cannot
     * specify this option if you're launching more than one instance in a <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     * >RunInstances</a> request.
     * </p>
     *
     * @param privateIpAddresses <p>
     *            One or more private IPv4 addresses to assign to the network
     *            interface. Only one private IPv4 address can be designated as
     *            primary. You cannot specify this option if you're launching
     *            more than one instance in a <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     *            >RunInstances</a> request.
     *            </p>
     */
    public void setPrivateIpAddresses(
            java.util.Collection<PrivateIpAddressSpecification> privateIpAddresses) {
        if (privateIpAddresses == null) {
            this.privateIpAddresses = null;
            return;
        }

        this.privateIpAddresses = new java.util.ArrayList<PrivateIpAddressSpecification>(
                privateIpAddresses);
    }

    /**
     * <p>
     * One or more private IPv4 addresses to assign to the network interface.
     * Only one private IPv4 address can be designated as primary. You cannot
     * specify this option if you're launching more than one instance in a <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     * >RunInstances</a> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddresses <p>
     *            One or more private IPv4 addresses to assign to the network
     *            interface. Only one private IPv4 address can be designated as
     *            primary. You cannot specify this option if you're launching
     *            more than one instance in a <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     *            >RunInstances</a> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterfaceSpecification withPrivateIpAddresses(
            PrivateIpAddressSpecification... privateIpAddresses) {
        if (getPrivateIpAddresses() == null) {
            this.privateIpAddresses = new java.util.ArrayList<PrivateIpAddressSpecification>(
                    privateIpAddresses.length);
        }
        for (PrivateIpAddressSpecification value : privateIpAddresses) {
            this.privateIpAddresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more private IPv4 addresses to assign to the network interface.
     * Only one private IPv4 address can be designated as primary. You cannot
     * specify this option if you're launching more than one instance in a <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     * >RunInstances</a> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddresses <p>
     *            One or more private IPv4 addresses to assign to the network
     *            interface. Only one private IPv4 address can be designated as
     *            primary. You cannot specify this option if you're launching
     *            more than one instance in a <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     *            >RunInstances</a> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterfaceSpecification withPrivateIpAddresses(
            java.util.Collection<PrivateIpAddressSpecification> privateIpAddresses) {
        setPrivateIpAddresses(privateIpAddresses);
        return this;
    }

    /**
     * <p>
     * The number of secondary private IPv4 addresses. You can't specify this
     * option and specify more than one private IP address using the private IP
     * addresses option. You cannot specify this option if you're launching more
     * than one instance in a <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     * >RunInstances</a> request.
     * </p>
     *
     * @return <p>
     *         The number of secondary private IPv4 addresses. You can't specify
     *         this option and specify more than one private IP address using
     *         the private IP addresses option. You cannot specify this option
     *         if you're launching more than one instance in a <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     *         >RunInstances</a> request.
     *         </p>
     */
    public Integer getSecondaryPrivateIpAddressCount() {
        return secondaryPrivateIpAddressCount;
    }

    /**
     * <p>
     * The number of secondary private IPv4 addresses. You can't specify this
     * option and specify more than one private IP address using the private IP
     * addresses option. You cannot specify this option if you're launching more
     * than one instance in a <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     * >RunInstances</a> request.
     * </p>
     *
     * @param secondaryPrivateIpAddressCount <p>
     *            The number of secondary private IPv4 addresses. You can't
     *            specify this option and specify more than one private IP
     *            address using the private IP addresses option. You cannot
     *            specify this option if you're launching more than one instance
     *            in a <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     *            >RunInstances</a> request.
     *            </p>
     */
    public void setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
    }

    /**
     * <p>
     * The number of secondary private IPv4 addresses. You can't specify this
     * option and specify more than one private IP address using the private IP
     * addresses option. You cannot specify this option if you're launching more
     * than one instance in a <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     * >RunInstances</a> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondaryPrivateIpAddressCount <p>
     *            The number of secondary private IPv4 addresses. You can't
     *            specify this option and specify more than one private IP
     *            address using the private IP addresses option. You cannot
     *            specify this option if you're launching more than one instance
     *            in a <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     *            >RunInstances</a> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterfaceSpecification withSecondaryPrivateIpAddressCount(
            Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
        return this;
    }

    /**
     * <p>
     * The ID of the subnet associated with the network interface. Applies only
     * if creating a network interface when launching an instance.
     * </p>
     *
     * @return <p>
     *         The ID of the subnet associated with the network interface.
     *         Applies only if creating a network interface when launching an
     *         instance.
     *         </p>
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * <p>
     * The ID of the subnet associated with the network interface. Applies only
     * if creating a network interface when launching an instance.
     * </p>
     *
     * @param subnetId <p>
     *            The ID of the subnet associated with the network interface.
     *            Applies only if creating a network interface when launching an
     *            instance.
     *            </p>
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet associated with the network interface. Applies only
     * if creating a network interface when launching an instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetId <p>
     *            The ID of the subnet associated with the network interface.
     *            Applies only if creating a network interface when launching an
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterfaceSpecification withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * <p>
     * The type of network interface. To create an Elastic Fabric Adapter (EFA),
     * specify <code>efa</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/efa.html"
     * >Elastic Fabric Adapter</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * If you are not creating an EFA, specify <code>interface</code> or omit
     * this parameter.
     * </p>
     * <p>
     * Valid values: <code>interface</code> | <code>efa</code>
     * </p>
     *
     * @return <p>
     *         The type of network interface. To create an Elastic Fabric
     *         Adapter (EFA), specify <code>efa</code>. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/efa.html"
     *         >Elastic Fabric Adapter</a> in the <i>Amazon Elastic Compute
     *         Cloud User Guide</i>.
     *         </p>
     *         <p>
     *         If you are not creating an EFA, specify <code>interface</code> or
     *         omit this parameter.
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
     * The type of network interface. To create an Elastic Fabric Adapter (EFA),
     * specify <code>efa</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/efa.html"
     * >Elastic Fabric Adapter</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * If you are not creating an EFA, specify <code>interface</code> or omit
     * this parameter.
     * </p>
     * <p>
     * Valid values: <code>interface</code> | <code>efa</code>
     * </p>
     *
     * @param interfaceType <p>
     *            The type of network interface. To create an Elastic Fabric
     *            Adapter (EFA), specify <code>efa</code>. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/efa.html"
     *            >Elastic Fabric Adapter</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     *            <p>
     *            If you are not creating an EFA, specify <code>interface</code>
     *            or omit this parameter.
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
     * The type of network interface. To create an Elastic Fabric Adapter (EFA),
     * specify <code>efa</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/efa.html"
     * >Elastic Fabric Adapter</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * If you are not creating an EFA, specify <code>interface</code> or omit
     * this parameter.
     * </p>
     * <p>
     * Valid values: <code>interface</code> | <code>efa</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param interfaceType <p>
     *            The type of network interface. To create an Elastic Fabric
     *            Adapter (EFA), specify <code>efa</code>. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/efa.html"
     *            >Elastic Fabric Adapter</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     *            <p>
     *            If you are not creating an EFA, specify <code>interface</code>
     *            or omit this parameter.
     *            </p>
     *            <p>
     *            Valid values: <code>interface</code> | <code>efa</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterfaceSpecification withInterfaceType(String interfaceType) {
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
        if (getPrivateIpAddresses() != null)
            sb.append("PrivateIpAddresses: " + getPrivateIpAddresses() + ",");
        if (getSecondaryPrivateIpAddressCount() != null)
            sb.append("SecondaryPrivateIpAddressCount: " + getSecondaryPrivateIpAddressCount()
                    + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getInterfaceType() != null)
            sb.append("InterfaceType: " + getInterfaceType());
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
        hashCode = prime * hashCode
                + ((getPrivateIpAddresses() == null) ? 0 : getPrivateIpAddresses().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecondaryPrivateIpAddressCount() == null) ? 0
                        : getSecondaryPrivateIpAddressCount().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
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

        if (obj instanceof InstanceNetworkInterfaceSpecification == false)
            return false;
        InstanceNetworkInterfaceSpecification other = (InstanceNetworkInterfaceSpecification) obj;

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
        if (other.getPrivateIpAddresses() == null ^ this.getPrivateIpAddresses() == null)
            return false;
        if (other.getPrivateIpAddresses() != null
                && other.getPrivateIpAddresses().equals(this.getPrivateIpAddresses()) == false)
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
        if (other.getInterfaceType() == null ^ this.getInterfaceType() == null)
            return false;
        if (other.getInterfaceType() != null
                && other.getInterfaceType().equals(this.getInterfaceType()) == false)
            return false;
        return true;
    }
}
