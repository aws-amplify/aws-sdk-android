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
 * Creates a network interface in the specified subnet.
 * </p>
 * <p>
 * For more information about network interfaces, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html"
 * >Elastic Network Interfaces</a> in the <i>Amazon Virtual Private Cloud User
 * Guide</i>.
 * </p>
 */
public class CreateNetworkInterfaceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A description for the network interface.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The IDs of one or more security groups.
     * </p>
     */
    private java.util.List<String> groups;

    /**
     * <p>
     * The number of IPv6 addresses to assign to a network interface. Amazon EC2
     * automatically selects the IPv6 addresses from the subnet range. You can't
     * use this option if specifying specific IPv6 addresses. If your subnet has
     * the <code>AssignIpv6AddressOnCreation</code> attribute set to
     * <code>true</code>, you can specify <code>0</code> to override this
     * setting.
     * </p>
     */
    private Integer ipv6AddressCount;

    /**
     * <p>
     * One or more specific IPv6 addresses from the IPv6 CIDR block range of
     * your subnet. You can't use this option if you're specifying a number of
     * IPv6 addresses.
     * </p>
     */
    private java.util.List<InstanceIpv6Address> ipv6Addresses;

    /**
     * <p>
     * The primary private IPv4 address of the network interface. If you don't
     * specify an IPv4 address, Amazon EC2 selects one for you from the subnet's
     * IPv4 CIDR range. If you specify an IP address, you cannot indicate any IP
     * addresses specified in <code>privateIpAddresses</code> as primary (only
     * one IP address can be designated as primary).
     * </p>
     */
    private String privateIpAddress;

    /**
     * <p>
     * One or more private IPv4 addresses.
     * </p>
     */
    private java.util.List<PrivateIpAddressSpecification> privateIpAddresses;

    /**
     * <p>
     * The number of secondary private IPv4 addresses to assign to a network
     * interface. When you specify a number of secondary IPv4 addresses, Amazon
     * EC2 selects these IP addresses within the subnet's IPv4 CIDR range. You
     * can't specify this option and specify more than one private IP address
     * using <code>privateIpAddresses</code>.
     * </p>
     * <p>
     * The number of IP addresses you can assign to a network interface varies
     * by instance type. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI"
     * >IP Addresses Per ENI Per Instance Type</a> in the <i>Amazon Virtual
     * Private Cloud User Guide</i>.
     * </p>
     */
    private Integer secondaryPrivateIpAddressCount;

    /**
     * <p>
     * Indicates the type of network interface. To create an Elastic Fabric
     * Adapter (EFA), specify <code>efa</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/efa.html">
     * Elastic Fabric Adapter</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>efa
     */
    private String interfaceType;

    /**
     * <p>
     * The ID of the subnet to associate with the network interface.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * A description for the network interface.
     * </p>
     *
     * @return <p>
     *         A description for the network interface.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description for the network interface.
     * </p>
     *
     * @param description <p>
     *            A description for the network interface.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description for the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNetworkInterfaceRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNetworkInterfaceRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The IDs of one or more security groups.
     * </p>
     *
     * @return <p>
     *         The IDs of one or more security groups.
     *         </p>
     */
    public java.util.List<String> getGroups() {
        return groups;
    }

    /**
     * <p>
     * The IDs of one or more security groups.
     * </p>
     *
     * @param groups <p>
     *            The IDs of one or more security groups.
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
     * The IDs of one or more security groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            The IDs of one or more security groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNetworkInterfaceRequest withGroups(String... groups) {
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
     * The IDs of one or more security groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            The IDs of one or more security groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNetworkInterfaceRequest withGroups(java.util.Collection<String> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * The number of IPv6 addresses to assign to a network interface. Amazon EC2
     * automatically selects the IPv6 addresses from the subnet range. You can't
     * use this option if specifying specific IPv6 addresses. If your subnet has
     * the <code>AssignIpv6AddressOnCreation</code> attribute set to
     * <code>true</code>, you can specify <code>0</code> to override this
     * setting.
     * </p>
     *
     * @return <p>
     *         The number of IPv6 addresses to assign to a network interface.
     *         Amazon EC2 automatically selects the IPv6 addresses from the
     *         subnet range. You can't use this option if specifying specific
     *         IPv6 addresses. If your subnet has the
     *         <code>AssignIpv6AddressOnCreation</code> attribute set to
     *         <code>true</code>, you can specify <code>0</code> to override
     *         this setting.
     *         </p>
     */
    public Integer getIpv6AddressCount() {
        return ipv6AddressCount;
    }

    /**
     * <p>
     * The number of IPv6 addresses to assign to a network interface. Amazon EC2
     * automatically selects the IPv6 addresses from the subnet range. You can't
     * use this option if specifying specific IPv6 addresses. If your subnet has
     * the <code>AssignIpv6AddressOnCreation</code> attribute set to
     * <code>true</code>, you can specify <code>0</code> to override this
     * setting.
     * </p>
     *
     * @param ipv6AddressCount <p>
     *            The number of IPv6 addresses to assign to a network interface.
     *            Amazon EC2 automatically selects the IPv6 addresses from the
     *            subnet range. You can't use this option if specifying specific
     *            IPv6 addresses. If your subnet has the
     *            <code>AssignIpv6AddressOnCreation</code> attribute set to
     *            <code>true</code>, you can specify <code>0</code> to override
     *            this setting.
     *            </p>
     */
    public void setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
    }

    /**
     * <p>
     * The number of IPv6 addresses to assign to a network interface. Amazon EC2
     * automatically selects the IPv6 addresses from the subnet range. You can't
     * use this option if specifying specific IPv6 addresses. If your subnet has
     * the <code>AssignIpv6AddressOnCreation</code> attribute set to
     * <code>true</code>, you can specify <code>0</code> to override this
     * setting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6AddressCount <p>
     *            The number of IPv6 addresses to assign to a network interface.
     *            Amazon EC2 automatically selects the IPv6 addresses from the
     *            subnet range. You can't use this option if specifying specific
     *            IPv6 addresses. If your subnet has the
     *            <code>AssignIpv6AddressOnCreation</code> attribute set to
     *            <code>true</code>, you can specify <code>0</code> to override
     *            this setting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNetworkInterfaceRequest withIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }

    /**
     * <p>
     * One or more specific IPv6 addresses from the IPv6 CIDR block range of
     * your subnet. You can't use this option if you're specifying a number of
     * IPv6 addresses.
     * </p>
     *
     * @return <p>
     *         One or more specific IPv6 addresses from the IPv6 CIDR block
     *         range of your subnet. You can't use this option if you're
     *         specifying a number of IPv6 addresses.
     *         </p>
     */
    public java.util.List<InstanceIpv6Address> getIpv6Addresses() {
        return ipv6Addresses;
    }

    /**
     * <p>
     * One or more specific IPv6 addresses from the IPv6 CIDR block range of
     * your subnet. You can't use this option if you're specifying a number of
     * IPv6 addresses.
     * </p>
     *
     * @param ipv6Addresses <p>
     *            One or more specific IPv6 addresses from the IPv6 CIDR block
     *            range of your subnet. You can't use this option if you're
     *            specifying a number of IPv6 addresses.
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
     * One or more specific IPv6 addresses from the IPv6 CIDR block range of
     * your subnet. You can't use this option if you're specifying a number of
     * IPv6 addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Addresses <p>
     *            One or more specific IPv6 addresses from the IPv6 CIDR block
     *            range of your subnet. You can't use this option if you're
     *            specifying a number of IPv6 addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNetworkInterfaceRequest withIpv6Addresses(InstanceIpv6Address... ipv6Addresses) {
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
     * One or more specific IPv6 addresses from the IPv6 CIDR block range of
     * your subnet. You can't use this option if you're specifying a number of
     * IPv6 addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Addresses <p>
     *            One or more specific IPv6 addresses from the IPv6 CIDR block
     *            range of your subnet. You can't use this option if you're
     *            specifying a number of IPv6 addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNetworkInterfaceRequest withIpv6Addresses(
            java.util.Collection<InstanceIpv6Address> ipv6Addresses) {
        setIpv6Addresses(ipv6Addresses);
        return this;
    }

    /**
     * <p>
     * The primary private IPv4 address of the network interface. If you don't
     * specify an IPv4 address, Amazon EC2 selects one for you from the subnet's
     * IPv4 CIDR range. If you specify an IP address, you cannot indicate any IP
     * addresses specified in <code>privateIpAddresses</code> as primary (only
     * one IP address can be designated as primary).
     * </p>
     *
     * @return <p>
     *         The primary private IPv4 address of the network interface. If you
     *         don't specify an IPv4 address, Amazon EC2 selects one for you
     *         from the subnet's IPv4 CIDR range. If you specify an IP address,
     *         you cannot indicate any IP addresses specified in
     *         <code>privateIpAddresses</code> as primary (only one IP address
     *         can be designated as primary).
     *         </p>
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * <p>
     * The primary private IPv4 address of the network interface. If you don't
     * specify an IPv4 address, Amazon EC2 selects one for you from the subnet's
     * IPv4 CIDR range. If you specify an IP address, you cannot indicate any IP
     * addresses specified in <code>privateIpAddresses</code> as primary (only
     * one IP address can be designated as primary).
     * </p>
     *
     * @param privateIpAddress <p>
     *            The primary private IPv4 address of the network interface. If
     *            you don't specify an IPv4 address, Amazon EC2 selects one for
     *            you from the subnet's IPv4 CIDR range. If you specify an IP
     *            address, you cannot indicate any IP addresses specified in
     *            <code>privateIpAddresses</code> as primary (only one IP
     *            address can be designated as primary).
     *            </p>
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The primary private IPv4 address of the network interface. If you don't
     * specify an IPv4 address, Amazon EC2 selects one for you from the subnet's
     * IPv4 CIDR range. If you specify an IP address, you cannot indicate any IP
     * addresses specified in <code>privateIpAddresses</code> as primary (only
     * one IP address can be designated as primary).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddress <p>
     *            The primary private IPv4 address of the network interface. If
     *            you don't specify an IPv4 address, Amazon EC2 selects one for
     *            you from the subnet's IPv4 CIDR range. If you specify an IP
     *            address, you cannot indicate any IP addresses specified in
     *            <code>privateIpAddresses</code> as primary (only one IP
     *            address can be designated as primary).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNetworkInterfaceRequest withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * <p>
     * One or more private IPv4 addresses.
     * </p>
     *
     * @return <p>
     *         One or more private IPv4 addresses.
     *         </p>
     */
    public java.util.List<PrivateIpAddressSpecification> getPrivateIpAddresses() {
        return privateIpAddresses;
    }

    /**
     * <p>
     * One or more private IPv4 addresses.
     * </p>
     *
     * @param privateIpAddresses <p>
     *            One or more private IPv4 addresses.
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
     * One or more private IPv4 addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddresses <p>
     *            One or more private IPv4 addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNetworkInterfaceRequest withPrivateIpAddresses(
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
     * One or more private IPv4 addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddresses <p>
     *            One or more private IPv4 addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNetworkInterfaceRequest withPrivateIpAddresses(
            java.util.Collection<PrivateIpAddressSpecification> privateIpAddresses) {
        setPrivateIpAddresses(privateIpAddresses);
        return this;
    }

    /**
     * <p>
     * The number of secondary private IPv4 addresses to assign to a network
     * interface. When you specify a number of secondary IPv4 addresses, Amazon
     * EC2 selects these IP addresses within the subnet's IPv4 CIDR range. You
     * can't specify this option and specify more than one private IP address
     * using <code>privateIpAddresses</code>.
     * </p>
     * <p>
     * The number of IP addresses you can assign to a network interface varies
     * by instance type. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI"
     * >IP Addresses Per ENI Per Instance Type</a> in the <i>Amazon Virtual
     * Private Cloud User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The number of secondary private IPv4 addresses to assign to a
     *         network interface. When you specify a number of secondary IPv4
     *         addresses, Amazon EC2 selects these IP addresses within the
     *         subnet's IPv4 CIDR range. You can't specify this option and
     *         specify more than one private IP address using
     *         <code>privateIpAddresses</code>.
     *         </p>
     *         <p>
     *         The number of IP addresses you can assign to a network interface
     *         varies by instance type. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI"
     *         >IP Addresses Per ENI Per Instance Type</a> in the <i>Amazon
     *         Virtual Private Cloud User Guide</i>.
     *         </p>
     */
    public Integer getSecondaryPrivateIpAddressCount() {
        return secondaryPrivateIpAddressCount;
    }

    /**
     * <p>
     * The number of secondary private IPv4 addresses to assign to a network
     * interface. When you specify a number of secondary IPv4 addresses, Amazon
     * EC2 selects these IP addresses within the subnet's IPv4 CIDR range. You
     * can't specify this option and specify more than one private IP address
     * using <code>privateIpAddresses</code>.
     * </p>
     * <p>
     * The number of IP addresses you can assign to a network interface varies
     * by instance type. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI"
     * >IP Addresses Per ENI Per Instance Type</a> in the <i>Amazon Virtual
     * Private Cloud User Guide</i>.
     * </p>
     *
     * @param secondaryPrivateIpAddressCount <p>
     *            The number of secondary private IPv4 addresses to assign to a
     *            network interface. When you specify a number of secondary IPv4
     *            addresses, Amazon EC2 selects these IP addresses within the
     *            subnet's IPv4 CIDR range. You can't specify this option and
     *            specify more than one private IP address using
     *            <code>privateIpAddresses</code>.
     *            </p>
     *            <p>
     *            The number of IP addresses you can assign to a network
     *            interface varies by instance type. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI"
     *            >IP Addresses Per ENI Per Instance Type</a> in the <i>Amazon
     *            Virtual Private Cloud User Guide</i>.
     *            </p>
     */
    public void setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
    }

    /**
     * <p>
     * The number of secondary private IPv4 addresses to assign to a network
     * interface. When you specify a number of secondary IPv4 addresses, Amazon
     * EC2 selects these IP addresses within the subnet's IPv4 CIDR range. You
     * can't specify this option and specify more than one private IP address
     * using <code>privateIpAddresses</code>.
     * </p>
     * <p>
     * The number of IP addresses you can assign to a network interface varies
     * by instance type. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI"
     * >IP Addresses Per ENI Per Instance Type</a> in the <i>Amazon Virtual
     * Private Cloud User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondaryPrivateIpAddressCount <p>
     *            The number of secondary private IPv4 addresses to assign to a
     *            network interface. When you specify a number of secondary IPv4
     *            addresses, Amazon EC2 selects these IP addresses within the
     *            subnet's IPv4 CIDR range. You can't specify this option and
     *            specify more than one private IP address using
     *            <code>privateIpAddresses</code>.
     *            </p>
     *            <p>
     *            The number of IP addresses you can assign to a network
     *            interface varies by instance type. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI"
     *            >IP Addresses Per ENI Per Instance Type</a> in the <i>Amazon
     *            Virtual Private Cloud User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNetworkInterfaceRequest withSecondaryPrivateIpAddressCount(
            Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
        return this;
    }

    /**
     * <p>
     * Indicates the type of network interface. To create an Elastic Fabric
     * Adapter (EFA), specify <code>efa</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/efa.html">
     * Elastic Fabric Adapter</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>efa
     *
     * @return <p>
     *         Indicates the type of network interface. To create an Elastic
     *         Fabric Adapter (EFA), specify <code>efa</code>. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/efa.html">
     *         Elastic Fabric Adapter</a> in the <i>Amazon Elastic Compute Cloud
     *         User Guide</i>.
     *         </p>
     * @see NetworkInterfaceCreationType
     */
    public String getInterfaceType() {
        return interfaceType;
    }

    /**
     * <p>
     * Indicates the type of network interface. To create an Elastic Fabric
     * Adapter (EFA), specify <code>efa</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/efa.html">
     * Elastic Fabric Adapter</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>efa
     *
     * @param interfaceType <p>
     *            Indicates the type of network interface. To create an Elastic
     *            Fabric Adapter (EFA), specify <code>efa</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/efa.html"
     *            > Elastic Fabric Adapter</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     * @see NetworkInterfaceCreationType
     */
    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }

    /**
     * <p>
     * Indicates the type of network interface. To create an Elastic Fabric
     * Adapter (EFA), specify <code>efa</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/efa.html">
     * Elastic Fabric Adapter</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>efa
     *
     * @param interfaceType <p>
     *            Indicates the type of network interface. To create an Elastic
     *            Fabric Adapter (EFA), specify <code>efa</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/efa.html"
     *            > Elastic Fabric Adapter</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NetworkInterfaceCreationType
     */
    public CreateNetworkInterfaceRequest withInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
        return this;
    }

    /**
     * <p>
     * Indicates the type of network interface. To create an Elastic Fabric
     * Adapter (EFA), specify <code>efa</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/efa.html">
     * Elastic Fabric Adapter</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>efa
     *
     * @param interfaceType <p>
     *            Indicates the type of network interface. To create an Elastic
     *            Fabric Adapter (EFA), specify <code>efa</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/efa.html"
     *            > Elastic Fabric Adapter</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     * @see NetworkInterfaceCreationType
     */
    public void setInterfaceType(NetworkInterfaceCreationType interfaceType) {
        this.interfaceType = interfaceType.toString();
    }

    /**
     * <p>
     * Indicates the type of network interface. To create an Elastic Fabric
     * Adapter (EFA), specify <code>efa</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/efa.html">
     * Elastic Fabric Adapter</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>efa
     *
     * @param interfaceType <p>
     *            Indicates the type of network interface. To create an Elastic
     *            Fabric Adapter (EFA), specify <code>efa</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/efa.html"
     *            > Elastic Fabric Adapter</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NetworkInterfaceCreationType
     */
    public CreateNetworkInterfaceRequest withInterfaceType(
            NetworkInterfaceCreationType interfaceType) {
        this.interfaceType = interfaceType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the subnet to associate with the network interface.
     * </p>
     *
     * @return <p>
     *         The ID of the subnet to associate with the network interface.
     *         </p>
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * <p>
     * The ID of the subnet to associate with the network interface.
     * </p>
     *
     * @param subnetId <p>
     *            The ID of the subnet to associate with the network interface.
     *            </p>
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet to associate with the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetId <p>
     *            The ID of the subnet to associate with the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNetworkInterfaceRequest withSubnetId(String subnetId) {
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getGroups() != null)
            sb.append("Groups: " + getGroups() + ",");
        if (getIpv6AddressCount() != null)
            sb.append("Ipv6AddressCount: " + getIpv6AddressCount() + ",");
        if (getIpv6Addresses() != null)
            sb.append("Ipv6Addresses: " + getIpv6Addresses() + ",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: " + getPrivateIpAddress() + ",");
        if (getPrivateIpAddresses() != null)
            sb.append("PrivateIpAddresses: " + getPrivateIpAddresses() + ",");
        if (getSecondaryPrivateIpAddressCount() != null)
            sb.append("SecondaryPrivateIpAddressCount: " + getSecondaryPrivateIpAddressCount()
                    + ",");
        if (getInterfaceType() != null)
            sb.append("InterfaceType: " + getInterfaceType() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode
                + ((getIpv6AddressCount() == null) ? 0 : getIpv6AddressCount().hashCode());
        hashCode = prime * hashCode
                + ((getIpv6Addresses() == null) ? 0 : getIpv6Addresses().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateIpAddresses() == null) ? 0 : getPrivateIpAddresses().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecondaryPrivateIpAddressCount() == null) ? 0
                        : getSecondaryPrivateIpAddressCount().hashCode());
        hashCode = prime * hashCode
                + ((getInterfaceType() == null) ? 0 : getInterfaceType().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNetworkInterfaceRequest == false)
            return false;
        CreateNetworkInterfaceRequest other = (CreateNetworkInterfaceRequest) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
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
        if (other.getInterfaceType() == null ^ this.getInterfaceType() == null)
            return false;
        if (other.getInterfaceType() != null
                && other.getInterfaceType().equals(this.getInterfaceType()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        return true;
    }
}
