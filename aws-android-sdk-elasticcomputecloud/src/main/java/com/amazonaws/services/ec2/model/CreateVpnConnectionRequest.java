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
 * Creates a VPN connection between an existing virtual private gateway and a
 * VPN customer gateway. The supported connection type is <code>ipsec.1</code>.
 * </p>
 * <p>
 * The response includes information that you need to give to your network
 * administrator to configure your customer gateway.
 * </p>
 * <important>
 * <p>
 * We strongly recommend that you use HTTPS when calling this operation because
 * the response contains sensitive cryptographic information for configuring
 * your customer gateway.
 * </p>
 * </important>
 * <p>
 * If you decide to shut down your VPN connection for any reason and later
 * create a new VPN connection, you must reconfigure your customer gateway with
 * the new information returned from this call.
 * </p>
 * <p>
 * This is an idempotent operation. If you perform the operation more than once,
 * Amazon EC2 doesn't return an error.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html">AWS
 * Site-to-Site VPN</a> in the <i>AWS Site-to-Site VPN User Guide</i>.
 * </p>
 */
public class CreateVpnConnectionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the customer gateway.
     * </p>
     */
    private String customerGatewayId;

    /**
     * <p>
     * The type of VPN connection (<code>ipsec.1</code>).
     * </p>
     */
    private String type;

    /**
     * <p>
     * The ID of the virtual private gateway. If you specify a virtual private
     * gateway, you cannot specify a transit gateway.
     * </p>
     */
    private String vpnGatewayId;

    /**
     * <p>
     * The ID of the transit gateway. If you specify a transit gateway, you
     * cannot specify a virtual private gateway.
     * </p>
     */
    private String transitGatewayId;

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
     * The options for the VPN connection.
     * </p>
     */
    private VpnConnectionOptionsSpecification options;

    /**
     * <p>
     * The ID of the customer gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the customer gateway.
     *         </p>
     */
    public String getCustomerGatewayId() {
        return customerGatewayId;
    }

    /**
     * <p>
     * The ID of the customer gateway.
     * </p>
     *
     * @param customerGatewayId <p>
     *            The ID of the customer gateway.
     *            </p>
     */
    public void setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
    }

    /**
     * <p>
     * The ID of the customer gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customerGatewayId <p>
     *            The ID of the customer gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpnConnectionRequest withCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }

    /**
     * <p>
     * The type of VPN connection (<code>ipsec.1</code>).
     * </p>
     *
     * @return <p>
     *         The type of VPN connection (<code>ipsec.1</code>).
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of VPN connection (<code>ipsec.1</code>).
     * </p>
     *
     * @param type <p>
     *            The type of VPN connection (<code>ipsec.1</code>).
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of VPN connection (<code>ipsec.1</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The type of VPN connection (<code>ipsec.1</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpnConnectionRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private gateway. If you specify a virtual private
     * gateway, you cannot specify a transit gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the virtual private gateway. If you specify a virtual
     *         private gateway, you cannot specify a transit gateway.
     *         </p>
     */
    public String getVpnGatewayId() {
        return vpnGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway. If you specify a virtual private
     * gateway, you cannot specify a transit gateway.
     * </p>
     *
     * @param vpnGatewayId <p>
     *            The ID of the virtual private gateway. If you specify a
     *            virtual private gateway, you cannot specify a transit gateway.
     *            </p>
     */
    public void setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway. If you specify a virtual private
     * gateway, you cannot specify a transit gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpnGatewayId <p>
     *            The ID of the virtual private gateway. If you specify a
     *            virtual private gateway, you cannot specify a transit gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpnConnectionRequest withVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }

    /**
     * <p>
     * The ID of the transit gateway. If you specify a transit gateway, you
     * cannot specify a virtual private gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the transit gateway. If you specify a transit gateway,
     *         you cannot specify a virtual private gateway.
     *         </p>
     */
    public String getTransitGatewayId() {
        return transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway. If you specify a transit gateway, you
     * cannot specify a virtual private gateway.
     * </p>
     *
     * @param transitGatewayId <p>
     *            The ID of the transit gateway. If you specify a transit
     *            gateway, you cannot specify a virtual private gateway.
     *            </p>
     */
    public void setTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway. If you specify a transit gateway, you
     * cannot specify a virtual private gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayId <p>
     *            The ID of the transit gateway. If you specify a transit
     *            gateway, you cannot specify a virtual private gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpnConnectionRequest withTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
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
    public CreateVpnConnectionRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The options for the VPN connection.
     * </p>
     *
     * @return <p>
     *         The options for the VPN connection.
     *         </p>
     */
    public VpnConnectionOptionsSpecification getOptions() {
        return options;
    }

    /**
     * <p>
     * The options for the VPN connection.
     * </p>
     *
     * @param options <p>
     *            The options for the VPN connection.
     *            </p>
     */
    public void setOptions(VpnConnectionOptionsSpecification options) {
        this.options = options;
    }

    /**
     * <p>
     * The options for the VPN connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param options <p>
     *            The options for the VPN connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpnConnectionRequest withOptions(VpnConnectionOptionsSpecification options) {
        this.options = options;
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
        if (getCustomerGatewayId() != null)
            sb.append("CustomerGatewayId: " + getCustomerGatewayId() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getVpnGatewayId() != null)
            sb.append("VpnGatewayId: " + getVpnGatewayId() + ",");
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: " + getTransitGatewayId() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getOptions() != null)
            sb.append("Options: " + getOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCustomerGatewayId() == null) ? 0 : getCustomerGatewayId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getVpnGatewayId() == null) ? 0 : getVpnGatewayId().hashCode());
        hashCode = prime * hashCode
                + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpnConnectionRequest == false)
            return false;
        CreateVpnConnectionRequest other = (CreateVpnConnectionRequest) obj;

        if (other.getCustomerGatewayId() == null ^ this.getCustomerGatewayId() == null)
            return false;
        if (other.getCustomerGatewayId() != null
                && other.getCustomerGatewayId().equals(this.getCustomerGatewayId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getVpnGatewayId() == null ^ this.getVpnGatewayId() == null)
            return false;
        if (other.getVpnGatewayId() != null
                && other.getVpnGatewayId().equals(this.getVpnGatewayId()) == false)
            return false;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null
                && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        return true;
    }
}
