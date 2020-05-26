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
 * Adds a route to a network to a Client VPN endpoint. Each Client VPN endpoint
 * has a route table that describes the available destination network routes.
 * Each route in the route table specifies the path for traﬃc to speciﬁc
 * resources or networks.
 * </p>
 */
public class CreateClientVpnRouteRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the Client VPN endpoint to which to add the route.
     * </p>
     */
    private String clientVpnEndpointId;

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the route destination. For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To add a route for Internet access, enter <code>0.0.0.0/0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR range
     * </p>
     * </li>
     * <li>
     * <p>
     * To add a route for an on-premises network, enter the AWS Site-to-Site VPN
     * connection's IPv4 CIDR range
     * </p>
     * </li>
     * </ul>
     * <p>
     * Route address ranges cannot overlap with the CIDR range specified for
     * client allocation.
     * </p>
     */
    private String destinationCidrBlock;

    /**
     * <p>
     * The ID of the subnet through which you want to route traffic. The
     * specified subnet must be an existing target network of the Client VPN
     * endpoint.
     * </p>
     */
    private String targetVpcSubnetId;

    /**
     * <p>
     * A brief description of the route.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     */
    private String clientToken;

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
     * The ID of the Client VPN endpoint to which to add the route.
     * </p>
     *
     * @return <p>
     *         The ID of the Client VPN endpoint to which to add the route.
     *         </p>
     */
    public String getClientVpnEndpointId() {
        return clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint to which to add the route.
     * </p>
     *
     * @param clientVpnEndpointId <p>
     *            The ID of the Client VPN endpoint to which to add the route.
     *            </p>
     */
    public void setClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint to which to add the route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientVpnEndpointId <p>
     *            The ID of the Client VPN endpoint to which to add the route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClientVpnRouteRequest withClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
        return this;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the route destination. For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To add a route for Internet access, enter <code>0.0.0.0/0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR range
     * </p>
     * </li>
     * <li>
     * <p>
     * To add a route for an on-premises network, enter the AWS Site-to-Site VPN
     * connection's IPv4 CIDR range
     * </p>
     * </li>
     * </ul>
     * <p>
     * Route address ranges cannot overlap with the CIDR range specified for
     * client allocation.
     * </p>
     *
     * @return <p>
     *         The IPv4 address range, in CIDR notation, of the route
     *         destination. For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To add a route for Internet access, enter <code>0.0.0.0/0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR
     *         range
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To add a route for an on-premises network, enter the AWS
     *         Site-to-Site VPN connection's IPv4 CIDR range
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Route address ranges cannot overlap with the CIDR range specified
     *         for client allocation.
     *         </p>
     */
    public String getDestinationCidrBlock() {
        return destinationCidrBlock;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the route destination. For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To add a route for Internet access, enter <code>0.0.0.0/0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR range
     * </p>
     * </li>
     * <li>
     * <p>
     * To add a route for an on-premises network, enter the AWS Site-to-Site VPN
     * connection's IPv4 CIDR range
     * </p>
     * </li>
     * </ul>
     * <p>
     * Route address ranges cannot overlap with the CIDR range specified for
     * client allocation.
     * </p>
     *
     * @param destinationCidrBlock <p>
     *            The IPv4 address range, in CIDR notation, of the route
     *            destination. For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            To add a route for Internet access, enter
     *            <code>0.0.0.0/0</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To add a route for a peered VPC, enter the peered VPC's IPv4
     *            CIDR range
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To add a route for an on-premises network, enter the AWS
     *            Site-to-Site VPN connection's IPv4 CIDR range
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Route address ranges cannot overlap with the CIDR range
     *            specified for client allocation.
     *            </p>
     */
    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the route destination. For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To add a route for Internet access, enter <code>0.0.0.0/0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR range
     * </p>
     * </li>
     * <li>
     * <p>
     * To add a route for an on-premises network, enter the AWS Site-to-Site VPN
     * connection's IPv4 CIDR range
     * </p>
     * </li>
     * </ul>
     * <p>
     * Route address ranges cannot overlap with the CIDR range specified for
     * client allocation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationCidrBlock <p>
     *            The IPv4 address range, in CIDR notation, of the route
     *            destination. For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            To add a route for Internet access, enter
     *            <code>0.0.0.0/0</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To add a route for a peered VPC, enter the peered VPC's IPv4
     *            CIDR range
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To add a route for an on-premises network, enter the AWS
     *            Site-to-Site VPN connection's IPv4 CIDR range
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Route address ranges cannot overlap with the CIDR range
     *            specified for client allocation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClientVpnRouteRequest withDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }

    /**
     * <p>
     * The ID of the subnet through which you want to route traffic. The
     * specified subnet must be an existing target network of the Client VPN
     * endpoint.
     * </p>
     *
     * @return <p>
     *         The ID of the subnet through which you want to route traffic. The
     *         specified subnet must be an existing target network of the Client
     *         VPN endpoint.
     *         </p>
     */
    public String getTargetVpcSubnetId() {
        return targetVpcSubnetId;
    }

    /**
     * <p>
     * The ID of the subnet through which you want to route traffic. The
     * specified subnet must be an existing target network of the Client VPN
     * endpoint.
     * </p>
     *
     * @param targetVpcSubnetId <p>
     *            The ID of the subnet through which you want to route traffic.
     *            The specified subnet must be an existing target network of the
     *            Client VPN endpoint.
     *            </p>
     */
    public void setTargetVpcSubnetId(String targetVpcSubnetId) {
        this.targetVpcSubnetId = targetVpcSubnetId;
    }

    /**
     * <p>
     * The ID of the subnet through which you want to route traffic. The
     * specified subnet must be an existing target network of the Client VPN
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetVpcSubnetId <p>
     *            The ID of the subnet through which you want to route traffic.
     *            The specified subnet must be an existing target network of the
     *            Client VPN endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClientVpnRouteRequest withTargetVpcSubnetId(String targetVpcSubnetId) {
        this.targetVpcSubnetId = targetVpcSubnetId;
        return this;
    }

    /**
     * <p>
     * A brief description of the route.
     * </p>
     *
     * @return <p>
     *         A brief description of the route.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A brief description of the route.
     * </p>
     *
     * @param description <p>
     *            A brief description of the route.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A brief description of the route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClientVpnRouteRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier that you provide to ensure the
     *         idempotency of the request. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *         >How to Ensure Idempotency</a>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClientVpnRouteRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
    public CreateClientVpnRouteRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getClientVpnEndpointId() != null)
            sb.append("ClientVpnEndpointId: " + getClientVpnEndpointId() + ",");
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: " + getDestinationCidrBlock() + ",");
        if (getTargetVpcSubnetId() != null)
            sb.append("TargetVpcSubnetId: " + getTargetVpcSubnetId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        hashCode = prime * hashCode
                + ((getTargetVpcSubnetId() == null) ? 0 : getTargetVpcSubnetId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateClientVpnRouteRequest == false)
            return false;
        CreateClientVpnRouteRequest other = (CreateClientVpnRouteRequest) obj;

        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null
                && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null
                && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        if (other.getTargetVpcSubnetId() == null ^ this.getTargetVpcSubnetId() == null)
            return false;
        if (other.getTargetVpcSubnetId() != null
                && other.getTargetVpcSubnetId().equals(this.getTargetVpcSubnetId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
