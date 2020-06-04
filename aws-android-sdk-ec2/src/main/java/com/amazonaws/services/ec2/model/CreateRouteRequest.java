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
 * Creates a route in a route table within a VPC.
 * </p>
 * <p>
 * You must specify one of the following targets: internet gateway or virtual
 * private gateway, NAT instance, NAT gateway, VPC peering connection, network
 * interface, egress-only internet gateway, or transit gateway.
 * </p>
 * <p>
 * When determining how to route traffic, we use the route with the most
 * specific match. For example, traffic is destined for the IPv4 address
 * <code>192.0.2.3</code>, and the route table includes the following two IPv4
 * routes:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>192.0.2.0/24</code> (goes to some target A)
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>192.0.2.0/28</code> (goes to some target B)
 * </p>
 * </li>
 * </ul>
 * <p>
 * Both routes apply to the traffic destined for <code>192.0.2.3</code>.
 * However, the second route in the list covers a smaller number of IP addresses
 * and is therefore more specific, so we use that route to determine where to
 * target the traffic.
 * </p>
 * <p>
 * For more information about route tables, see <a href=
 * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html"
 * >Route Tables</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
 * </p>
 */
public class CreateRouteRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The IPv4 CIDR address block used for the destination match. Routing
     * decisions are based on the most specific match.
     * </p>
     */
    private String destinationCidrBlock;

    /**
     * <p>
     * The IPv6 CIDR block used for the destination match. Routing decisions are
     * based on the most specific match.
     * </p>
     */
    private String destinationIpv6CidrBlock;

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
     * [IPv6 traffic only] The ID of an egress-only internet gateway.
     * </p>
     */
    private String egressOnlyInternetGatewayId;

    /**
     * <p>
     * The ID of an internet gateway or virtual private gateway attached to your
     * VPC.
     * </p>
     */
    private String gatewayId;

    /**
     * <p>
     * The ID of a NAT instance in your VPC. The operation fails if you specify
     * an instance ID unless exactly one network interface is attached.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * [IPv4 traffic only] The ID of a NAT gateway.
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
     * The ID of a network interface.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * The ID of the route table for the route.
     * </p>
     */
    private String routeTableId;

    /**
     * <p>
     * The ID of a VPC peering connection.
     * </p>
     */
    private String vpcPeeringConnectionId;

    /**
     * <p>
     * The IPv4 CIDR address block used for the destination match. Routing
     * decisions are based on the most specific match.
     * </p>
     *
     * @return <p>
     *         The IPv4 CIDR address block used for the destination match.
     *         Routing decisions are based on the most specific match.
     *         </p>
     */
    public String getDestinationCidrBlock() {
        return destinationCidrBlock;
    }

    /**
     * <p>
     * The IPv4 CIDR address block used for the destination match. Routing
     * decisions are based on the most specific match.
     * </p>
     *
     * @param destinationCidrBlock <p>
     *            The IPv4 CIDR address block used for the destination match.
     *            Routing decisions are based on the most specific match.
     *            </p>
     */
    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The IPv4 CIDR address block used for the destination match. Routing
     * decisions are based on the most specific match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationCidrBlock <p>
     *            The IPv4 CIDR address block used for the destination match.
     *            Routing decisions are based on the most specific match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRouteRequest withDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }

    /**
     * <p>
     * The IPv6 CIDR block used for the destination match. Routing decisions are
     * based on the most specific match.
     * </p>
     *
     * @return <p>
     *         The IPv6 CIDR block used for the destination match. Routing
     *         decisions are based on the most specific match.
     *         </p>
     */
    public String getDestinationIpv6CidrBlock() {
        return destinationIpv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block used for the destination match. Routing decisions are
     * based on the most specific match.
     * </p>
     *
     * @param destinationIpv6CidrBlock <p>
     *            The IPv6 CIDR block used for the destination match. Routing
     *            decisions are based on the most specific match.
     *            </p>
     */
    public void setDestinationIpv6CidrBlock(String destinationIpv6CidrBlock) {
        this.destinationIpv6CidrBlock = destinationIpv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block used for the destination match. Routing decisions are
     * based on the most specific match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationIpv6CidrBlock <p>
     *            The IPv6 CIDR block used for the destination match. Routing
     *            decisions are based on the most specific match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRouteRequest withDestinationIpv6CidrBlock(String destinationIpv6CidrBlock) {
        this.destinationIpv6CidrBlock = destinationIpv6CidrBlock;
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
    public CreateRouteRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * [IPv6 traffic only] The ID of an egress-only internet gateway.
     * </p>
     *
     * @return <p>
     *         [IPv6 traffic only] The ID of an egress-only internet gateway.
     *         </p>
     */
    public String getEgressOnlyInternetGatewayId() {
        return egressOnlyInternetGatewayId;
    }

    /**
     * <p>
     * [IPv6 traffic only] The ID of an egress-only internet gateway.
     * </p>
     *
     * @param egressOnlyInternetGatewayId <p>
     *            [IPv6 traffic only] The ID of an egress-only internet gateway.
     *            </p>
     */
    public void setEgressOnlyInternetGatewayId(String egressOnlyInternetGatewayId) {
        this.egressOnlyInternetGatewayId = egressOnlyInternetGatewayId;
    }

    /**
     * <p>
     * [IPv6 traffic only] The ID of an egress-only internet gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param egressOnlyInternetGatewayId <p>
     *            [IPv6 traffic only] The ID of an egress-only internet gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRouteRequest withEgressOnlyInternetGatewayId(String egressOnlyInternetGatewayId) {
        this.egressOnlyInternetGatewayId = egressOnlyInternetGatewayId;
        return this;
    }

    /**
     * <p>
     * The ID of an internet gateway or virtual private gateway attached to your
     * VPC.
     * </p>
     *
     * @return <p>
     *         The ID of an internet gateway or virtual private gateway attached
     *         to your VPC.
     *         </p>
     */
    public String getGatewayId() {
        return gatewayId;
    }

    /**
     * <p>
     * The ID of an internet gateway or virtual private gateway attached to your
     * VPC.
     * </p>
     *
     * @param gatewayId <p>
     *            The ID of an internet gateway or virtual private gateway
     *            attached to your VPC.
     *            </p>
     */
    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The ID of an internet gateway or virtual private gateway attached to your
     * VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gatewayId <p>
     *            The ID of an internet gateway or virtual private gateway
     *            attached to your VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRouteRequest withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * <p>
     * The ID of a NAT instance in your VPC. The operation fails if you specify
     * an instance ID unless exactly one network interface is attached.
     * </p>
     *
     * @return <p>
     *         The ID of a NAT instance in your VPC. The operation fails if you
     *         specify an instance ID unless exactly one network interface is
     *         attached.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of a NAT instance in your VPC. The operation fails if you specify
     * an instance ID unless exactly one network interface is attached.
     * </p>
     *
     * @param instanceId <p>
     *            The ID of a NAT instance in your VPC. The operation fails if
     *            you specify an instance ID unless exactly one network
     *            interface is attached.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of a NAT instance in your VPC. The operation fails if you specify
     * an instance ID unless exactly one network interface is attached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The ID of a NAT instance in your VPC. The operation fails if
     *            you specify an instance ID unless exactly one network
     *            interface is attached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRouteRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * [IPv4 traffic only] The ID of a NAT gateway.
     * </p>
     *
     * @return <p>
     *         [IPv4 traffic only] The ID of a NAT gateway.
     *         </p>
     */
    public String getNatGatewayId() {
        return natGatewayId;
    }

    /**
     * <p>
     * [IPv4 traffic only] The ID of a NAT gateway.
     * </p>
     *
     * @param natGatewayId <p>
     *            [IPv4 traffic only] The ID of a NAT gateway.
     *            </p>
     */
    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    /**
     * <p>
     * [IPv4 traffic only] The ID of a NAT gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param natGatewayId <p>
     *            [IPv4 traffic only] The ID of a NAT gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRouteRequest withNatGatewayId(String natGatewayId) {
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
    public CreateRouteRequest withTransitGatewayId(String transitGatewayId) {
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
    public CreateRouteRequest withLocalGatewayId(String localGatewayId) {
        this.localGatewayId = localGatewayId;
        return this;
    }

    /**
     * <p>
     * The ID of a network interface.
     * </p>
     *
     * @return <p>
     *         The ID of a network interface.
     *         </p>
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * <p>
     * The ID of a network interface.
     * </p>
     *
     * @param networkInterfaceId <p>
     *            The ID of a network interface.
     *            </p>
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of a network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaceId <p>
     *            The ID of a network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRouteRequest withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * The ID of the route table for the route.
     * </p>
     *
     * @return <p>
     *         The ID of the route table for the route.
     *         </p>
     */
    public String getRouteTableId() {
        return routeTableId;
    }

    /**
     * <p>
     * The ID of the route table for the route.
     * </p>
     *
     * @param routeTableId <p>
     *            The ID of the route table for the route.
     *            </p>
     */
    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    /**
     * <p>
     * The ID of the route table for the route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routeTableId <p>
     *            The ID of the route table for the route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRouteRequest withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
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
    public CreateRouteRequest withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getEgressOnlyInternetGatewayId() != null)
            sb.append("EgressOnlyInternetGatewayId: " + getEgressOnlyInternetGatewayId() + ",");
        if (getGatewayId() != null)
            sb.append("GatewayId: " + getGatewayId() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getNatGatewayId() != null)
            sb.append("NatGatewayId: " + getNatGatewayId() + ",");
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: " + getTransitGatewayId() + ",");
        if (getLocalGatewayId() != null)
            sb.append("LocalGatewayId: " + getLocalGatewayId() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getRouteTableId() != null)
            sb.append("RouteTableId: " + getRouteTableId() + ",");
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
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime
                * hashCode
                + ((getEgressOnlyInternetGatewayId() == null) ? 0
                        : getEgressOnlyInternetGatewayId().hashCode());
        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getNatGatewayId() == null) ? 0 : getNatGatewayId().hashCode());
        hashCode = prime * hashCode
                + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime * hashCode
                + ((getLocalGatewayId() == null) ? 0 : getLocalGatewayId().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode
                + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode());
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

        if (obj instanceof CreateRouteRequest == false)
            return false;
        CreateRouteRequest other = (CreateRouteRequest) obj;

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
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
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
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null)
            return false;
        if (other.getRouteTableId() != null
                && other.getRouteTableId().equals(this.getRouteTableId()) == false)
            return false;
        if (other.getVpcPeeringConnectionId() == null ^ this.getVpcPeeringConnectionId() == null)
            return false;
        if (other.getVpcPeeringConnectionId() != null
                && other.getVpcPeeringConnectionId().equals(this.getVpcPeeringConnectionId()) == false)
            return false;
        return true;
    }
}
