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
 * Describes a subnet.
 * </p>
 */
public class Subnet implements Serializable {
    /**
     * <p>
     * The Availability Zone of the subnet.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The AZ ID of the subnet.
     * </p>
     */
    private String availabilityZoneId;

    /**
     * <p>
     * The number of unused private IPv4 addresses in the subnet. The IPv4
     * addresses for any stopped instances are considered unavailable.
     * </p>
     */
    private Integer availableIpAddressCount;

    /**
     * <p>
     * The IPv4 CIDR block assigned to the subnet.
     * </p>
     */
    private String cidrBlock;

    /**
     * <p>
     * Indicates whether this is the default subnet for the Availability Zone.
     * </p>
     */
    private Boolean defaultForAz;

    /**
     * <p>
     * Indicates whether instances launched in this subnet receive a public IPv4
     * address.
     * </p>
     */
    private Boolean mapPublicIpOnLaunch;

    /**
     * <p>
     * Indicates whether a network interface created in this subnet (including a
     * network interface created by <a>RunInstances</a>) receives a
     * customer-owned IPv4 address.
     * </p>
     */
    private Boolean mapCustomerOwnedIpOnLaunch;

    /**
     * <p>
     * The customer-owned IPv4 address pool associated with the subnet.
     * </p>
     */
    private String customerOwnedIpv4Pool;

    /**
     * <p>
     * The current state of the subnet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available
     */
    private String state;

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * The ID of the VPC the subnet is in.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The ID of the AWS account that owns the subnet.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * Indicates whether a network interface created in this subnet (including a
     * network interface created by <a>RunInstances</a>) receives an IPv6
     * address.
     * </p>
     */
    private Boolean assignIpv6AddressOnCreation;

    /**
     * <p>
     * Information about the IPv6 CIDR blocks associated with the subnet.
     * </p>
     */
    private java.util.List<SubnetIpv6CidrBlockAssociation> ipv6CidrBlockAssociationSet;

    /**
     * <p>
     * Any tags assigned to the subnet.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the subnet.
     * </p>
     */
    private String subnetArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     */
    private String outpostArn;

    /**
     * <p>
     * The Availability Zone of the subnet.
     * </p>
     *
     * @return <p>
     *         The Availability Zone of the subnet.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the subnet.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone of the subnet.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone of the subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subnet withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The AZ ID of the subnet.
     * </p>
     *
     * @return <p>
     *         The AZ ID of the subnet.
     *         </p>
     */
    public String getAvailabilityZoneId() {
        return availabilityZoneId;
    }

    /**
     * <p>
     * The AZ ID of the subnet.
     * </p>
     *
     * @param availabilityZoneId <p>
     *            The AZ ID of the subnet.
     *            </p>
     */
    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    /**
     * <p>
     * The AZ ID of the subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZoneId <p>
     *            The AZ ID of the subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subnet withAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
        return this;
    }

    /**
     * <p>
     * The number of unused private IPv4 addresses in the subnet. The IPv4
     * addresses for any stopped instances are considered unavailable.
     * </p>
     *
     * @return <p>
     *         The number of unused private IPv4 addresses in the subnet. The
     *         IPv4 addresses for any stopped instances are considered
     *         unavailable.
     *         </p>
     */
    public Integer getAvailableIpAddressCount() {
        return availableIpAddressCount;
    }

    /**
     * <p>
     * The number of unused private IPv4 addresses in the subnet. The IPv4
     * addresses for any stopped instances are considered unavailable.
     * </p>
     *
     * @param availableIpAddressCount <p>
     *            The number of unused private IPv4 addresses in the subnet. The
     *            IPv4 addresses for any stopped instances are considered
     *            unavailable.
     *            </p>
     */
    public void setAvailableIpAddressCount(Integer availableIpAddressCount) {
        this.availableIpAddressCount = availableIpAddressCount;
    }

    /**
     * <p>
     * The number of unused private IPv4 addresses in the subnet. The IPv4
     * addresses for any stopped instances are considered unavailable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availableIpAddressCount <p>
     *            The number of unused private IPv4 addresses in the subnet. The
     *            IPv4 addresses for any stopped instances are considered
     *            unavailable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subnet withAvailableIpAddressCount(Integer availableIpAddressCount) {
        this.availableIpAddressCount = availableIpAddressCount;
        return this;
    }

    /**
     * <p>
     * The IPv4 CIDR block assigned to the subnet.
     * </p>
     *
     * @return <p>
     *         The IPv4 CIDR block assigned to the subnet.
     *         </p>
     */
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * <p>
     * The IPv4 CIDR block assigned to the subnet.
     * </p>
     *
     * @param cidrBlock <p>
     *            The IPv4 CIDR block assigned to the subnet.
     *            </p>
     */
    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The IPv4 CIDR block assigned to the subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrBlock <p>
     *            The IPv4 CIDR block assigned to the subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subnet withCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }

    /**
     * <p>
     * Indicates whether this is the default subnet for the Availability Zone.
     * </p>
     *
     * @return <p>
     *         Indicates whether this is the default subnet for the Availability
     *         Zone.
     *         </p>
     */
    public Boolean isDefaultForAz() {
        return defaultForAz;
    }

    /**
     * <p>
     * Indicates whether this is the default subnet for the Availability Zone.
     * </p>
     *
     * @return <p>
     *         Indicates whether this is the default subnet for the Availability
     *         Zone.
     *         </p>
     */
    public Boolean getDefaultForAz() {
        return defaultForAz;
    }

    /**
     * <p>
     * Indicates whether this is the default subnet for the Availability Zone.
     * </p>
     *
     * @param defaultForAz <p>
     *            Indicates whether this is the default subnet for the
     *            Availability Zone.
     *            </p>
     */
    public void setDefaultForAz(Boolean defaultForAz) {
        this.defaultForAz = defaultForAz;
    }

    /**
     * <p>
     * Indicates whether this is the default subnet for the Availability Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultForAz <p>
     *            Indicates whether this is the default subnet for the
     *            Availability Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subnet withDefaultForAz(Boolean defaultForAz) {
        this.defaultForAz = defaultForAz;
        return this;
    }

    /**
     * <p>
     * Indicates whether instances launched in this subnet receive a public IPv4
     * address.
     * </p>
     *
     * @return <p>
     *         Indicates whether instances launched in this subnet receive a
     *         public IPv4 address.
     *         </p>
     */
    public Boolean isMapPublicIpOnLaunch() {
        return mapPublicIpOnLaunch;
    }

    /**
     * <p>
     * Indicates whether instances launched in this subnet receive a public IPv4
     * address.
     * </p>
     *
     * @return <p>
     *         Indicates whether instances launched in this subnet receive a
     *         public IPv4 address.
     *         </p>
     */
    public Boolean getMapPublicIpOnLaunch() {
        return mapPublicIpOnLaunch;
    }

    /**
     * <p>
     * Indicates whether instances launched in this subnet receive a public IPv4
     * address.
     * </p>
     *
     * @param mapPublicIpOnLaunch <p>
     *            Indicates whether instances launched in this subnet receive a
     *            public IPv4 address.
     *            </p>
     */
    public void setMapPublicIpOnLaunch(Boolean mapPublicIpOnLaunch) {
        this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
    }

    /**
     * <p>
     * Indicates whether instances launched in this subnet receive a public IPv4
     * address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mapPublicIpOnLaunch <p>
     *            Indicates whether instances launched in this subnet receive a
     *            public IPv4 address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subnet withMapPublicIpOnLaunch(Boolean mapPublicIpOnLaunch) {
        this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
        return this;
    }

    /**
     * <p>
     * Indicates whether a network interface created in this subnet (including a
     * network interface created by <a>RunInstances</a>) receives a
     * customer-owned IPv4 address.
     * </p>
     *
     * @return <p>
     *         Indicates whether a network interface created in this subnet
     *         (including a network interface created by <a>RunInstances</a>)
     *         receives a customer-owned IPv4 address.
     *         </p>
     */
    public Boolean isMapCustomerOwnedIpOnLaunch() {
        return mapCustomerOwnedIpOnLaunch;
    }

    /**
     * <p>
     * Indicates whether a network interface created in this subnet (including a
     * network interface created by <a>RunInstances</a>) receives a
     * customer-owned IPv4 address.
     * </p>
     *
     * @return <p>
     *         Indicates whether a network interface created in this subnet
     *         (including a network interface created by <a>RunInstances</a>)
     *         receives a customer-owned IPv4 address.
     *         </p>
     */
    public Boolean getMapCustomerOwnedIpOnLaunch() {
        return mapCustomerOwnedIpOnLaunch;
    }

    /**
     * <p>
     * Indicates whether a network interface created in this subnet (including a
     * network interface created by <a>RunInstances</a>) receives a
     * customer-owned IPv4 address.
     * </p>
     *
     * @param mapCustomerOwnedIpOnLaunch <p>
     *            Indicates whether a network interface created in this subnet
     *            (including a network interface created by <a>RunInstances</a>)
     *            receives a customer-owned IPv4 address.
     *            </p>
     */
    public void setMapCustomerOwnedIpOnLaunch(Boolean mapCustomerOwnedIpOnLaunch) {
        this.mapCustomerOwnedIpOnLaunch = mapCustomerOwnedIpOnLaunch;
    }

    /**
     * <p>
     * Indicates whether a network interface created in this subnet (including a
     * network interface created by <a>RunInstances</a>) receives a
     * customer-owned IPv4 address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mapCustomerOwnedIpOnLaunch <p>
     *            Indicates whether a network interface created in this subnet
     *            (including a network interface created by <a>RunInstances</a>)
     *            receives a customer-owned IPv4 address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subnet withMapCustomerOwnedIpOnLaunch(Boolean mapCustomerOwnedIpOnLaunch) {
        this.mapCustomerOwnedIpOnLaunch = mapCustomerOwnedIpOnLaunch;
        return this;
    }

    /**
     * <p>
     * The customer-owned IPv4 address pool associated with the subnet.
     * </p>
     *
     * @return <p>
     *         The customer-owned IPv4 address pool associated with the subnet.
     *         </p>
     */
    public String getCustomerOwnedIpv4Pool() {
        return customerOwnedIpv4Pool;
    }

    /**
     * <p>
     * The customer-owned IPv4 address pool associated with the subnet.
     * </p>
     *
     * @param customerOwnedIpv4Pool <p>
     *            The customer-owned IPv4 address pool associated with the
     *            subnet.
     *            </p>
     */
    public void setCustomerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
        this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
    }

    /**
     * <p>
     * The customer-owned IPv4 address pool associated with the subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customerOwnedIpv4Pool <p>
     *            The customer-owned IPv4 address pool associated with the
     *            subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subnet withCustomerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
        this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
        return this;
    }

    /**
     * <p>
     * The current state of the subnet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available
     *
     * @return <p>
     *         The current state of the subnet.
     *         </p>
     * @see SubnetState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The current state of the subnet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available
     *
     * @param state <p>
     *            The current state of the subnet.
     *            </p>
     * @see SubnetState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available
     *
     * @param state <p>
     *            The current state of the subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SubnetState
     */
    public Subnet withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The current state of the subnet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available
     *
     * @param state <p>
     *            The current state of the subnet.
     *            </p>
     * @see SubnetState
     */
    public void setState(SubnetState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The current state of the subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available
     *
     * @param state <p>
     *            The current state of the subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SubnetState
     */
    public Subnet withState(SubnetState state) {
        this.state = state.toString();
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
    public Subnet withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * <p>
     * The ID of the VPC the subnet is in.
     * </p>
     *
     * @return <p>
     *         The ID of the VPC the subnet is in.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The ID of the VPC the subnet is in.
     * </p>
     *
     * @param vpcId <p>
     *            The ID of the VPC the subnet is in.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC the subnet is in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            The ID of the VPC the subnet is in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subnet withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the subnet.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the subnet.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the subnet.
     * </p>
     *
     * @param ownerId <p>
     *            The ID of the AWS account that owns the subnet.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The ID of the AWS account that owns the subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subnet withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * Indicates whether a network interface created in this subnet (including a
     * network interface created by <a>RunInstances</a>) receives an IPv6
     * address.
     * </p>
     *
     * @return <p>
     *         Indicates whether a network interface created in this subnet
     *         (including a network interface created by <a>RunInstances</a>)
     *         receives an IPv6 address.
     *         </p>
     */
    public Boolean isAssignIpv6AddressOnCreation() {
        return assignIpv6AddressOnCreation;
    }

    /**
     * <p>
     * Indicates whether a network interface created in this subnet (including a
     * network interface created by <a>RunInstances</a>) receives an IPv6
     * address.
     * </p>
     *
     * @return <p>
     *         Indicates whether a network interface created in this subnet
     *         (including a network interface created by <a>RunInstances</a>)
     *         receives an IPv6 address.
     *         </p>
     */
    public Boolean getAssignIpv6AddressOnCreation() {
        return assignIpv6AddressOnCreation;
    }

    /**
     * <p>
     * Indicates whether a network interface created in this subnet (including a
     * network interface created by <a>RunInstances</a>) receives an IPv6
     * address.
     * </p>
     *
     * @param assignIpv6AddressOnCreation <p>
     *            Indicates whether a network interface created in this subnet
     *            (including a network interface created by <a>RunInstances</a>)
     *            receives an IPv6 address.
     *            </p>
     */
    public void setAssignIpv6AddressOnCreation(Boolean assignIpv6AddressOnCreation) {
        this.assignIpv6AddressOnCreation = assignIpv6AddressOnCreation;
    }

    /**
     * <p>
     * Indicates whether a network interface created in this subnet (including a
     * network interface created by <a>RunInstances</a>) receives an IPv6
     * address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assignIpv6AddressOnCreation <p>
     *            Indicates whether a network interface created in this subnet
     *            (including a network interface created by <a>RunInstances</a>)
     *            receives an IPv6 address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subnet withAssignIpv6AddressOnCreation(Boolean assignIpv6AddressOnCreation) {
        this.assignIpv6AddressOnCreation = assignIpv6AddressOnCreation;
        return this;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR blocks associated with the subnet.
     * </p>
     *
     * @return <p>
     *         Information about the IPv6 CIDR blocks associated with the
     *         subnet.
     *         </p>
     */
    public java.util.List<SubnetIpv6CidrBlockAssociation> getIpv6CidrBlockAssociationSet() {
        return ipv6CidrBlockAssociationSet;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR blocks associated with the subnet.
     * </p>
     *
     * @param ipv6CidrBlockAssociationSet <p>
     *            Information about the IPv6 CIDR blocks associated with the
     *            subnet.
     *            </p>
     */
    public void setIpv6CidrBlockAssociationSet(
            java.util.Collection<SubnetIpv6CidrBlockAssociation> ipv6CidrBlockAssociationSet) {
        if (ipv6CidrBlockAssociationSet == null) {
            this.ipv6CidrBlockAssociationSet = null;
            return;
        }

        this.ipv6CidrBlockAssociationSet = new java.util.ArrayList<SubnetIpv6CidrBlockAssociation>(
                ipv6CidrBlockAssociationSet);
    }

    /**
     * <p>
     * Information about the IPv6 CIDR blocks associated with the subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6CidrBlockAssociationSet <p>
     *            Information about the IPv6 CIDR blocks associated with the
     *            subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subnet withIpv6CidrBlockAssociationSet(
            SubnetIpv6CidrBlockAssociation... ipv6CidrBlockAssociationSet) {
        if (getIpv6CidrBlockAssociationSet() == null) {
            this.ipv6CidrBlockAssociationSet = new java.util.ArrayList<SubnetIpv6CidrBlockAssociation>(
                    ipv6CidrBlockAssociationSet.length);
        }
        for (SubnetIpv6CidrBlockAssociation value : ipv6CidrBlockAssociationSet) {
            this.ipv6CidrBlockAssociationSet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR blocks associated with the subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6CidrBlockAssociationSet <p>
     *            Information about the IPv6 CIDR blocks associated with the
     *            subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subnet withIpv6CidrBlockAssociationSet(
            java.util.Collection<SubnetIpv6CidrBlockAssociation> ipv6CidrBlockAssociationSet) {
        setIpv6CidrBlockAssociationSet(ipv6CidrBlockAssociationSet);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the subnet.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the subnet.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the subnet.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the subnet.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subnet withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subnet withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the subnet.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the subnet.
     *         </p>
     */
    public String getSubnetArn() {
        return subnetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the subnet.
     * </p>
     *
     * @param subnetArn <p>
     *            The Amazon Resource Name (ARN) of the subnet.
     *            </p>
     */
    public void setSubnetArn(String subnetArn) {
        this.subnetArn = subnetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetArn <p>
     *            The Amazon Resource Name (ARN) of the subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subnet withSubnetArn(String subnetArn) {
        this.subnetArn = subnetArn;
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
    public Subnet withOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getAvailabilityZoneId() != null)
            sb.append("AvailabilityZoneId: " + getAvailabilityZoneId() + ",");
        if (getAvailableIpAddressCount() != null)
            sb.append("AvailableIpAddressCount: " + getAvailableIpAddressCount() + ",");
        if (getCidrBlock() != null)
            sb.append("CidrBlock: " + getCidrBlock() + ",");
        if (getDefaultForAz() != null)
            sb.append("DefaultForAz: " + getDefaultForAz() + ",");
        if (getMapPublicIpOnLaunch() != null)
            sb.append("MapPublicIpOnLaunch: " + getMapPublicIpOnLaunch() + ",");
        if (getMapCustomerOwnedIpOnLaunch() != null)
            sb.append("MapCustomerOwnedIpOnLaunch: " + getMapCustomerOwnedIpOnLaunch() + ",");
        if (getCustomerOwnedIpv4Pool() != null)
            sb.append("CustomerOwnedIpv4Pool: " + getCustomerOwnedIpv4Pool() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getAssignIpv6AddressOnCreation() != null)
            sb.append("AssignIpv6AddressOnCreation: " + getAssignIpv6AddressOnCreation() + ",");
        if (getIpv6CidrBlockAssociationSet() != null)
            sb.append("Ipv6CidrBlockAssociationSet: " + getIpv6CidrBlockAssociationSet() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getSubnetArn() != null)
            sb.append("SubnetArn: " + getSubnetArn() + ",");
        if (getOutpostArn() != null)
            sb.append("OutpostArn: " + getOutpostArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZoneId() == null) ? 0 : getAvailabilityZoneId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAvailableIpAddressCount() == null) ? 0 : getAvailableIpAddressCount()
                        .hashCode());
        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultForAz() == null) ? 0 : getDefaultForAz().hashCode());
        hashCode = prime * hashCode
                + ((getMapPublicIpOnLaunch() == null) ? 0 : getMapPublicIpOnLaunch().hashCode());
        hashCode = prime
                * hashCode
                + ((getMapCustomerOwnedIpOnLaunch() == null) ? 0 : getMapCustomerOwnedIpOnLaunch()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCustomerOwnedIpv4Pool() == null) ? 0 : getCustomerOwnedIpv4Pool().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssignIpv6AddressOnCreation() == null) ? 0
                        : getAssignIpv6AddressOnCreation().hashCode());
        hashCode = prime
                * hashCode
                + ((getIpv6CidrBlockAssociationSet() == null) ? 0
                        : getIpv6CidrBlockAssociationSet().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getSubnetArn() == null) ? 0 : getSubnetArn().hashCode());
        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Subnet == false)
            return false;
        Subnet other = (Subnet) obj;

        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getAvailabilityZoneId() == null ^ this.getAvailabilityZoneId() == null)
            return false;
        if (other.getAvailabilityZoneId() != null
                && other.getAvailabilityZoneId().equals(this.getAvailabilityZoneId()) == false)
            return false;
        if (other.getAvailableIpAddressCount() == null ^ this.getAvailableIpAddressCount() == null)
            return false;
        if (other.getAvailableIpAddressCount() != null
                && other.getAvailableIpAddressCount().equals(this.getAvailableIpAddressCount()) == false)
            return false;
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null
                && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        if (other.getDefaultForAz() == null ^ this.getDefaultForAz() == null)
            return false;
        if (other.getDefaultForAz() != null
                && other.getDefaultForAz().equals(this.getDefaultForAz()) == false)
            return false;
        if (other.getMapPublicIpOnLaunch() == null ^ this.getMapPublicIpOnLaunch() == null)
            return false;
        if (other.getMapPublicIpOnLaunch() != null
                && other.getMapPublicIpOnLaunch().equals(this.getMapPublicIpOnLaunch()) == false)
            return false;
        if (other.getMapCustomerOwnedIpOnLaunch() == null
                ^ this.getMapCustomerOwnedIpOnLaunch() == null)
            return false;
        if (other.getMapCustomerOwnedIpOnLaunch() != null
                && other.getMapCustomerOwnedIpOnLaunch().equals(
                        this.getMapCustomerOwnedIpOnLaunch()) == false)
            return false;
        if (other.getCustomerOwnedIpv4Pool() == null ^ this.getCustomerOwnedIpv4Pool() == null)
            return false;
        if (other.getCustomerOwnedIpv4Pool() != null
                && other.getCustomerOwnedIpv4Pool().equals(this.getCustomerOwnedIpv4Pool()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getAssignIpv6AddressOnCreation() == null
                ^ this.getAssignIpv6AddressOnCreation() == null)
            return false;
        if (other.getAssignIpv6AddressOnCreation() != null
                && other.getAssignIpv6AddressOnCreation().equals(
                        this.getAssignIpv6AddressOnCreation()) == false)
            return false;
        if (other.getIpv6CidrBlockAssociationSet() == null
                ^ this.getIpv6CidrBlockAssociationSet() == null)
            return false;
        if (other.getIpv6CidrBlockAssociationSet() != null
                && other.getIpv6CidrBlockAssociationSet().equals(
                        this.getIpv6CidrBlockAssociationSet()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSubnetArn() == null ^ this.getSubnetArn() == null)
            return false;
        if (other.getSubnetArn() != null
                && other.getSubnetArn().equals(this.getSubnetArn()) == false)
            return false;
        if (other.getOutpostArn() == null ^ this.getOutpostArn() == null)
            return false;
        if (other.getOutpostArn() != null
                && other.getOutpostArn().equals(this.getOutpostArn()) == false)
            return false;
        return true;
    }
}
