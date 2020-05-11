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
 * Describes a route in a route table.
 * </p>
 */
public class Route implements Serializable {
    /**
     * <p>
     * The IPv4 CIDR block used for the destination match.
     * </p>
     */
    private String destinationCidrBlock;

    /**
     * <p>
     * The IPv6 CIDR block used for the destination match.
     * </p>
     */
    private String destinationIpv6CidrBlock;

    /**
     * <p>
     * The prefix of the AWS service.
     * </p>
     */
    private String destinationPrefixListId;

    /**
     * <p>
     * The ID of the egress-only internet gateway.
     * </p>
     */
    private String egressOnlyInternetGatewayId;

    /**
     * <p>
     * The ID of a gateway attached to your VPC.
     * </p>
     */
    private String gatewayId;

    /**
     * <p>
     * The ID of a NAT instance in your VPC.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The AWS account ID of the owner of the instance.
     * </p>
     */
    private String instanceOwnerId;

    /**
     * <p>
     * The ID of a NAT gateway.
     * </p>
     */
    private String natGatewayId;

    /**
     * <p>
     * The ID of a transit gateway.
     * </p>
     */
    private String transitGatewayId;

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     */
    private String localGatewayId;

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * Describes how the route was created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreateRouteTable</code> - The route was automatically created when
     * the route table was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateRoute</code> - The route was manually added to the route
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EnableVgwRoutePropagation</code> - The route was propagated by
     * route propagation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreateRouteTable, CreateRoute,
     * EnableVgwRoutePropagation
     */
    private String origin;

    /**
     * <p>
     * The state of the route. The <code>blackhole</code> state indicates that
     * the route's target isn't available (for example, the specified gateway
     * isn't attached to the VPC, or the specified NAT instance has been
     * terminated).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, blackhole
     */
    private String state;

    /**
     * <p>
     * The ID of a VPC peering connection.
     * </p>
     */
    private String vpcPeeringConnectionId;

    /**
     * <p>
     * The IPv4 CIDR block used for the destination match.
     * </p>
     *
     * @return <p>
     *         The IPv4 CIDR block used for the destination match.
     *         </p>
     */
    public String getDestinationCidrBlock() {
        return destinationCidrBlock;
    }

    /**
     * <p>
     * The IPv4 CIDR block used for the destination match.
     * </p>
     *
     * @param destinationCidrBlock <p>
     *            The IPv4 CIDR block used for the destination match.
     *            </p>
     */
    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The IPv4 CIDR block used for the destination match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationCidrBlock <p>
     *            The IPv4 CIDR block used for the destination match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Route withDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }

    /**
     * <p>
     * The IPv6 CIDR block used for the destination match.
     * </p>
     *
     * @return <p>
     *         The IPv6 CIDR block used for the destination match.
     *         </p>
     */
    public String getDestinationIpv6CidrBlock() {
        return destinationIpv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block used for the destination match.
     * </p>
     *
     * @param destinationIpv6CidrBlock <p>
     *            The IPv6 CIDR block used for the destination match.
     *            </p>
     */
    public void setDestinationIpv6CidrBlock(String destinationIpv6CidrBlock) {
        this.destinationIpv6CidrBlock = destinationIpv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block used for the destination match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationIpv6CidrBlock <p>
     *            The IPv6 CIDR block used for the destination match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Route withDestinationIpv6CidrBlock(String destinationIpv6CidrBlock) {
        this.destinationIpv6CidrBlock = destinationIpv6CidrBlock;
        return this;
    }

    /**
     * <p>
     * The prefix of the AWS service.
     * </p>
     *
     * @return <p>
     *         The prefix of the AWS service.
     *         </p>
     */
    public String getDestinationPrefixListId() {
        return destinationPrefixListId;
    }

    /**
     * <p>
     * The prefix of the AWS service.
     * </p>
     *
     * @param destinationPrefixListId <p>
     *            The prefix of the AWS service.
     *            </p>
     */
    public void setDestinationPrefixListId(String destinationPrefixListId) {
        this.destinationPrefixListId = destinationPrefixListId;
    }

    /**
     * <p>
     * The prefix of the AWS service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationPrefixListId <p>
     *            The prefix of the AWS service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Route withDestinationPrefixListId(String destinationPrefixListId) {
        this.destinationPrefixListId = destinationPrefixListId;
        return this;
    }

    /**
     * <p>
     * The ID of the egress-only internet gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the egress-only internet gateway.
     *         </p>
     */
    public String getEgressOnlyInternetGatewayId() {
        return egressOnlyInternetGatewayId;
    }

    /**
     * <p>
     * The ID of the egress-only internet gateway.
     * </p>
     *
     * @param egressOnlyInternetGatewayId <p>
     *            The ID of the egress-only internet gateway.
     *            </p>
     */
    public void setEgressOnlyInternetGatewayId(String egressOnlyInternetGatewayId) {
        this.egressOnlyInternetGatewayId = egressOnlyInternetGatewayId;
    }

    /**
     * <p>
     * The ID of the egress-only internet gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param egressOnlyInternetGatewayId <p>
     *            The ID of the egress-only internet gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Route withEgressOnlyInternetGatewayId(String egressOnlyInternetGatewayId) {
        this.egressOnlyInternetGatewayId = egressOnlyInternetGatewayId;
        return this;
    }

    /**
     * <p>
     * The ID of a gateway attached to your VPC.
     * </p>
     *
     * @return <p>
     *         The ID of a gateway attached to your VPC.
     *         </p>
     */
    public String getGatewayId() {
        return gatewayId;
    }

    /**
     * <p>
     * The ID of a gateway attached to your VPC.
     * </p>
     *
     * @param gatewayId <p>
     *            The ID of a gateway attached to your VPC.
     *            </p>
     */
    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The ID of a gateway attached to your VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gatewayId <p>
     *            The ID of a gateway attached to your VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Route withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * <p>
     * The ID of a NAT instance in your VPC.
     * </p>
     *
     * @return <p>
     *         The ID of a NAT instance in your VPC.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of a NAT instance in your VPC.
     * </p>
     *
     * @param instanceId <p>
     *            The ID of a NAT instance in your VPC.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of a NAT instance in your VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The ID of a NAT instance in your VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Route withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the instance.
     * </p>
     *
     * @return <p>
     *         The AWS account ID of the owner of the instance.
     *         </p>
     */
    public String getInstanceOwnerId() {
        return instanceOwnerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the instance.
     * </p>
     *
     * @param instanceOwnerId <p>
     *            The AWS account ID of the owner of the instance.
     *            </p>
     */
    public void setInstanceOwnerId(String instanceOwnerId) {
        this.instanceOwnerId = instanceOwnerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceOwnerId <p>
     *            The AWS account ID of the owner of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Route withInstanceOwnerId(String instanceOwnerId) {
        this.instanceOwnerId = instanceOwnerId;
        return this;
    }

    /**
     * <p>
     * The ID of a NAT gateway.
     * </p>
     *
     * @return <p>
     *         The ID of a NAT gateway.
     *         </p>
     */
    public String getNatGatewayId() {
        return natGatewayId;
    }

    /**
     * <p>
     * The ID of a NAT gateway.
     * </p>
     *
     * @param natGatewayId <p>
     *            The ID of a NAT gateway.
     *            </p>
     */
    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    /**
     * <p>
     * The ID of a NAT gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param natGatewayId <p>
     *            The ID of a NAT gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Route withNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }

    /**
     * <p>
     * The ID of a transit gateway.
     * </p>
     *
     * @return <p>
     *         The ID of a transit gateway.
     *         </p>
     */
    public String getTransitGatewayId() {
        return transitGatewayId;
    }

    /**
     * <p>
     * The ID of a transit gateway.
     * </p>
     *
     * @param transitGatewayId <p>
     *            The ID of a transit gateway.
     *            </p>
     */
    public void setTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
    }

    /**
     * <p>
     * The ID of a transit gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayId <p>
     *            The ID of a transit gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Route withTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
        return this;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the local gateway.
     *         </p>
     */
    public String getLocalGatewayId() {
        return localGatewayId;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     *
     * @param localGatewayId <p>
     *            The ID of the local gateway.
     *            </p>
     */
    public void setLocalGatewayId(String localGatewayId) {
        this.localGatewayId = localGatewayId;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localGatewayId <p>
     *            The ID of the local gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Route withLocalGatewayId(String localGatewayId) {
        this.localGatewayId = localGatewayId;
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
    public Route withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * Describes how the route was created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreateRouteTable</code> - The route was automatically created when
     * the route table was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateRoute</code> - The route was manually added to the route
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EnableVgwRoutePropagation</code> - The route was propagated by
     * route propagation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreateRouteTable, CreateRoute,
     * EnableVgwRoutePropagation
     *
     * @return <p>
     *         Describes how the route was created.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CreateRouteTable</code> - The route was automatically
     *         created when the route table was created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CreateRoute</code> - The route was manually added to the
     *         route table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EnableVgwRoutePropagation</code> - The route was propagated
     *         by route propagation.
     *         </p>
     *         </li>
     *         </ul>
     * @see RouteOrigin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * <p>
     * Describes how the route was created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreateRouteTable</code> - The route was automatically created when
     * the route table was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateRoute</code> - The route was manually added to the route
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EnableVgwRoutePropagation</code> - The route was propagated by
     * route propagation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreateRouteTable, CreateRoute,
     * EnableVgwRoutePropagation
     *
     * @param origin <p>
     *            Describes how the route was created.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CreateRouteTable</code> - The route was automatically
     *            created when the route table was created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CreateRoute</code> - The route was manually added to the
     *            route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EnableVgwRoutePropagation</code> - The route was
     *            propagated by route propagation.
     *            </p>
     *            </li>
     *            </ul>
     * @see RouteOrigin
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * <p>
     * Describes how the route was created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreateRouteTable</code> - The route was automatically created when
     * the route table was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateRoute</code> - The route was manually added to the route
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EnableVgwRoutePropagation</code> - The route was propagated by
     * route propagation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreateRouteTable, CreateRoute,
     * EnableVgwRoutePropagation
     *
     * @param origin <p>
     *            Describes how the route was created.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CreateRouteTable</code> - The route was automatically
     *            created when the route table was created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CreateRoute</code> - The route was manually added to the
     *            route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EnableVgwRoutePropagation</code> - The route was
     *            propagated by route propagation.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RouteOrigin
     */
    public Route withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * <p>
     * Describes how the route was created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreateRouteTable</code> - The route was automatically created when
     * the route table was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateRoute</code> - The route was manually added to the route
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EnableVgwRoutePropagation</code> - The route was propagated by
     * route propagation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreateRouteTable, CreateRoute,
     * EnableVgwRoutePropagation
     *
     * @param origin <p>
     *            Describes how the route was created.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CreateRouteTable</code> - The route was automatically
     *            created when the route table was created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CreateRoute</code> - The route was manually added to the
     *            route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EnableVgwRoutePropagation</code> - The route was
     *            propagated by route propagation.
     *            </p>
     *            </li>
     *            </ul>
     * @see RouteOrigin
     */
    public void setOrigin(RouteOrigin origin) {
        this.origin = origin.toString();
    }

    /**
     * <p>
     * Describes how the route was created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreateRouteTable</code> - The route was automatically created when
     * the route table was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateRoute</code> - The route was manually added to the route
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EnableVgwRoutePropagation</code> - The route was propagated by
     * route propagation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreateRouteTable, CreateRoute,
     * EnableVgwRoutePropagation
     *
     * @param origin <p>
     *            Describes how the route was created.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CreateRouteTable</code> - The route was automatically
     *            created when the route table was created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CreateRoute</code> - The route was manually added to the
     *            route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EnableVgwRoutePropagation</code> - The route was
     *            propagated by route propagation.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RouteOrigin
     */
    public Route withOrigin(RouteOrigin origin) {
        this.origin = origin.toString();
        return this;
    }

    /**
     * <p>
     * The state of the route. The <code>blackhole</code> state indicates that
     * the route's target isn't available (for example, the specified gateway
     * isn't attached to the VPC, or the specified NAT instance has been
     * terminated).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, blackhole
     *
     * @return <p>
     *         The state of the route. The <code>blackhole</code> state
     *         indicates that the route's target isn't available (for example,
     *         the specified gateway isn't attached to the VPC, or the specified
     *         NAT instance has been terminated).
     *         </p>
     * @see RouteState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the route. The <code>blackhole</code> state indicates that
     * the route's target isn't available (for example, the specified gateway
     * isn't attached to the VPC, or the specified NAT instance has been
     * terminated).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, blackhole
     *
     * @param state <p>
     *            The state of the route. The <code>blackhole</code> state
     *            indicates that the route's target isn't available (for
     *            example, the specified gateway isn't attached to the VPC, or
     *            the specified NAT instance has been terminated).
     *            </p>
     * @see RouteState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the route. The <code>blackhole</code> state indicates that
     * the route's target isn't available (for example, the specified gateway
     * isn't attached to the VPC, or the specified NAT instance has been
     * terminated).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, blackhole
     *
     * @param state <p>
     *            The state of the route. The <code>blackhole</code> state
     *            indicates that the route's target isn't available (for
     *            example, the specified gateway isn't attached to the VPC, or
     *            the specified NAT instance has been terminated).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RouteState
     */
    public Route withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the route. The <code>blackhole</code> state indicates that
     * the route's target isn't available (for example, the specified gateway
     * isn't attached to the VPC, or the specified NAT instance has been
     * terminated).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, blackhole
     *
     * @param state <p>
     *            The state of the route. The <code>blackhole</code> state
     *            indicates that the route's target isn't available (for
     *            example, the specified gateway isn't attached to the VPC, or
     *            the specified NAT instance has been terminated).
     *            </p>
     * @see RouteState
     */
    public void setState(RouteState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the route. The <code>blackhole</code> state indicates that
     * the route's target isn't available (for example, the specified gateway
     * isn't attached to the VPC, or the specified NAT instance has been
     * terminated).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, blackhole
     *
     * @param state <p>
     *            The state of the route. The <code>blackhole</code> state
     *            indicates that the route's target isn't available (for
     *            example, the specified gateway isn't attached to the VPC, or
     *            the specified NAT instance has been terminated).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RouteState
     */
    public Route withState(RouteState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The ID of a VPC peering connection.
     * </p>
     *
     * @return <p>
     *         The ID of a VPC peering connection.
     *         </p>
     */
    public String getVpcPeeringConnectionId() {
        return vpcPeeringConnectionId;
    }

    /**
     * <p>
     * The ID of a VPC peering connection.
     * </p>
     *
     * @param vpcPeeringConnectionId <p>
     *            The ID of a VPC peering connection.
     *            </p>
     */
    public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }

    /**
     * <p>
     * The ID of a VPC peering connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcPeeringConnectionId <p>
     *            The ID of a VPC peering connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Route withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
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
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: " + getDestinationCidrBlock() + ",");
        if (getDestinationIpv6CidrBlock() != null)
            sb.append("DestinationIpv6CidrBlock: " + getDestinationIpv6CidrBlock() + ",");
        if (getDestinationPrefixListId() != null)
            sb.append("DestinationPrefixListId: " + getDestinationPrefixListId() + ",");
        if (getEgressOnlyInternetGatewayId() != null)
            sb.append("EgressOnlyInternetGatewayId: " + getEgressOnlyInternetGatewayId() + ",");
        if (getGatewayId() != null)
            sb.append("GatewayId: " + getGatewayId() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getInstanceOwnerId() != null)
            sb.append("InstanceOwnerId: " + getInstanceOwnerId() + ",");
        if (getNatGatewayId() != null)
            sb.append("NatGatewayId: " + getNatGatewayId() + ",");
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: " + getTransitGatewayId() + ",");
        if (getLocalGatewayId() != null)
            sb.append("LocalGatewayId: " + getLocalGatewayId() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getOrigin() != null)
            sb.append("Origin: " + getOrigin() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getVpcPeeringConnectionId() != null)
            sb.append("VpcPeeringConnectionId: " + getVpcPeeringConnectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationIpv6CidrBlock() == null) ? 0 : getDestinationIpv6CidrBlock()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationPrefixListId() == null) ? 0 : getDestinationPrefixListId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEgressOnlyInternetGatewayId() == null) ? 0
                        : getEgressOnlyInternetGatewayId().hashCode());
        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceOwnerId() == null) ? 0 : getInstanceOwnerId().hashCode());
        hashCode = prime * hashCode
                + ((getNatGatewayId() == null) ? 0 : getNatGatewayId().hashCode());
        hashCode = prime * hashCode
                + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime * hashCode
                + ((getLocalGatewayId() == null) ? 0 : getLocalGatewayId().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime
                * hashCode
                + ((getVpcPeeringConnectionId() == null) ? 0 : getVpcPeeringConnectionId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Route == false)
            return false;
        Route other = (Route) obj;

        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null
                && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        if (other.getDestinationIpv6CidrBlock() == null
                ^ this.getDestinationIpv6CidrBlock() == null)
            return false;
        if (other.getDestinationIpv6CidrBlock() != null
                && other.getDestinationIpv6CidrBlock().equals(this.getDestinationIpv6CidrBlock()) == false)
            return false;
        if (other.getDestinationPrefixListId() == null ^ this.getDestinationPrefixListId() == null)
            return false;
        if (other.getDestinationPrefixListId() != null
                && other.getDestinationPrefixListId().equals(this.getDestinationPrefixListId()) == false)
            return false;
        if (other.getEgressOnlyInternetGatewayId() == null
                ^ this.getEgressOnlyInternetGatewayId() == null)
            return false;
        if (other.getEgressOnlyInternetGatewayId() != null
                && other.getEgressOnlyInternetGatewayId().equals(
                        this.getEgressOnlyInternetGatewayId()) == false)
            return false;
        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null
                && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceOwnerId() == null ^ this.getInstanceOwnerId() == null)
            return false;
        if (other.getInstanceOwnerId() != null
                && other.getInstanceOwnerId().equals(this.getInstanceOwnerId()) == false)
            return false;
        if (other.getNatGatewayId() == null ^ this.getNatGatewayId() == null)
            return false;
        if (other.getNatGatewayId() != null
                && other.getNatGatewayId().equals(this.getNatGatewayId()) == false)
            return false;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null
                && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        if (other.getLocalGatewayId() == null ^ this.getLocalGatewayId() == null)
            return false;
        if (other.getLocalGatewayId() != null
                && other.getLocalGatewayId().equals(this.getLocalGatewayId()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getOrigin() == null ^ this.getOrigin() == null)
            return false;
        if (other.getOrigin() != null && other.getOrigin().equals(this.getOrigin()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getVpcPeeringConnectionId() == null ^ this.getVpcPeeringConnectionId() == null)
            return false;
        if (other.getVpcPeeringConnectionId() != null
                && other.getVpcPeeringConnectionId().equals(this.getVpcPeeringConnectionId()) == false)
            return false;
        return true;
    }
}
