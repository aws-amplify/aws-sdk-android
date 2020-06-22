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
 * Modifies the customer gateway or the target gateway of an AWS Site-to-Site
 * VPN connection. To modify the target gateway, the following migration options
 * are available:
 * </p>
 * <ul>
 * <li>
 * <p>
 * An existing virtual private gateway to a new virtual private gateway
 * </p>
 * </li>
 * <li>
 * <p>
 * An existing virtual private gateway to a transit gateway
 * </p>
 * </li>
 * <li>
 * <p>
 * An existing transit gateway to a new transit gateway
 * </p>
 * </li>
 * <li>
 * <p>
 * An existing transit gateway to a virtual private gateway
 * </p>
 * </li>
 * </ul>
 * <p>
 * Before you perform the migration to the new gateway, you must configure the
 * new gateway. Use <a>CreateVpnGateway</a> to create a virtual private gateway,
 * or <a>CreateTransitGateway</a> to create a transit gateway.
 * </p>
 * <p>
 * This step is required when you migrate from a virtual private gateway with
 * static routes to a transit gateway.
 * </p>
 * <p>
 * You must delete the static routes before you migrate to the new gateway.
 * </p>
 * <p>
 * Keep a copy of the static route before you delete it. You will need to add
 * back these routes to the transit gateway after the VPN connection migration
 * is complete.
 * </p>
 * <p>
 * After you migrate to the new gateway, you might need to modify your VPC route
 * table. Use <a>CreateRoute</a> and <a>DeleteRoute</a> to make the changes
 * described in <a href=
 * "https://docs.aws.amazon.com/vpn/latest/s2svpn/modify-vpn-target.html#step-update-routing"
 * >VPN Gateway Target Modification Required VPC Route Table Updates</a> in the
 * <i>AWS Site-to-Site VPN User Guide</i>.
 * </p>
 * <p>
 * When the new gateway is a transit gateway, modify the transit gateway route
 * table to allow traffic between the VPC and the AWS Site-to-Site VPN
 * connection. Use <a>CreateTransitGatewayRoute</a> to add the routes.
 * </p>
 * <p>
 * If you deleted VPN static routes, you must add the static routes to the
 * transit gateway route table.
 * </p>
 * <p>
 * After you perform this operation, the AWS VPN endpoint's IP addresses on the
 * AWS side and the tunnel options remain intact. Your AWS Site-to-Site VPN
 * connection will be temporarily unavailable for a brief period while we
 * provision the new endpoints.
 * </p>
 */
public class ModifyVpnConnectionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the VPN connection.
     * </p>
     */
    private String vpnConnectionId;

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     */
    private String transitGatewayId;

    /**
     * <p>
     * The ID of the customer gateway at your end of the VPN connection.
     * </p>
     */
    private String customerGatewayId;

    /**
     * <p>
     * The ID of the virtual private gateway at the AWS side of the VPN
     * connection.
     * </p>
     */
    private String vpnGatewayId;

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
     * The ID of the VPN connection.
     * </p>
     *
     * @return <p>
     *         The ID of the VPN connection.
     *         </p>
     */
    public String getVpnConnectionId() {
        return vpnConnectionId;
    }

    /**
     * <p>
     * The ID of the VPN connection.
     * </p>
     *
     * @param vpnConnectionId <p>
     *            The ID of the VPN connection.
     *            </p>
     */
    public void setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
    }

    /**
     * <p>
     * The ID of the VPN connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpnConnectionId <p>
     *            The ID of the VPN connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpnConnectionRequest withVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the transit gateway.
     *         </p>
     */
    public String getTransitGatewayId() {
        return transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     *
     * @param transitGatewayId <p>
     *            The ID of the transit gateway.
     *            </p>
     */
    public void setTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayId <p>
     *            The ID of the transit gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpnConnectionRequest withTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
        return this;
    }

    /**
     * <p>
     * The ID of the customer gateway at your end of the VPN connection.
     * </p>
     *
     * @return <p>
     *         The ID of the customer gateway at your end of the VPN connection.
     *         </p>
     */
    public String getCustomerGatewayId() {
        return customerGatewayId;
    }

    /**
     * <p>
     * The ID of the customer gateway at your end of the VPN connection.
     * </p>
     *
     * @param customerGatewayId <p>
     *            The ID of the customer gateway at your end of the VPN
     *            connection.
     *            </p>
     */
    public void setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
    }

    /**
     * <p>
     * The ID of the customer gateway at your end of the VPN connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customerGatewayId <p>
     *            The ID of the customer gateway at your end of the VPN
     *            connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpnConnectionRequest withCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private gateway at the AWS side of the VPN
     * connection.
     * </p>
     *
     * @return <p>
     *         The ID of the virtual private gateway at the AWS side of the VPN
     *         connection.
     *         </p>
     */
    public String getVpnGatewayId() {
        return vpnGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway at the AWS side of the VPN
     * connection.
     * </p>
     *
     * @param vpnGatewayId <p>
     *            The ID of the virtual private gateway at the AWS side of the
     *            VPN connection.
     *            </p>
     */
    public void setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway at the AWS side of the VPN
     * connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpnGatewayId <p>
     *            The ID of the virtual private gateway at the AWS side of the
     *            VPN connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpnConnectionRequest withVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
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
    public ModifyVpnConnectionRequest withDryRun(Boolean dryRun) {
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
        if (getVpnConnectionId() != null)
            sb.append("VpnConnectionId: " + getVpnConnectionId() + ",");
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: " + getTransitGatewayId() + ",");
        if (getCustomerGatewayId() != null)
            sb.append("CustomerGatewayId: " + getCustomerGatewayId() + ",");
        if (getVpnGatewayId() != null)
            sb.append("VpnGatewayId: " + getVpnGatewayId() + ",");
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
                + ((getVpnConnectionId() == null) ? 0 : getVpnConnectionId().hashCode());
        hashCode = prime * hashCode
                + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime * hashCode
                + ((getCustomerGatewayId() == null) ? 0 : getCustomerGatewayId().hashCode());
        hashCode = prime * hashCode
                + ((getVpnGatewayId() == null) ? 0 : getVpnGatewayId().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpnConnectionRequest == false)
            return false;
        ModifyVpnConnectionRequest other = (ModifyVpnConnectionRequest) obj;

        if (other.getVpnConnectionId() == null ^ this.getVpnConnectionId() == null)
            return false;
        if (other.getVpnConnectionId() != null
                && other.getVpnConnectionId().equals(this.getVpnConnectionId()) == false)
            return false;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null
                && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        if (other.getCustomerGatewayId() == null ^ this.getCustomerGatewayId() == null)
            return false;
        if (other.getCustomerGatewayId() != null
                && other.getCustomerGatewayId().equals(this.getCustomerGatewayId()) == false)
            return false;
        if (other.getVpnGatewayId() == null ^ this.getVpnGatewayId() == null)
            return false;
        if (other.getVpnGatewayId() != null
                && other.getVpnGatewayId().equals(this.getVpnGatewayId()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
