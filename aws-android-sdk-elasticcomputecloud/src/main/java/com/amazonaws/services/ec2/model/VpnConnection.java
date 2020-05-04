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
 * Describes a VPN connection.
 * </p>
 */
public class VpnConnection implements Serializable {
    /**
     * <p>
     * The configuration information for the VPN connection's customer gateway
     * (in the native XML format). This element is always present in the
     * <a>CreateVpnConnection</a> response; however, it's present in the
     * <a>DescribeVpnConnections</a> response only if the VPN connection is in
     * the <code>pending</code> or <code>available</code> state.
     * </p>
     */
    private String customerGatewayConfiguration;

    /**
     * <p>
     * The ID of the customer gateway at your end of the VPN connection.
     * </p>
     */
    private String customerGatewayId;

    /**
     * <p>
     * The category of the VPN connection. A value of <code>VPN</code> indicates
     * an AWS VPN connection. A value of <code>VPN-Classic</code> indicates an
     * AWS Classic VPN connection.
     * </p>
     */
    private String category;

    /**
     * <p>
     * The current state of the VPN connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     */
    private String state;

    /**
     * <p>
     * The type of VPN connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     */
    private String type;

    /**
     * <p>
     * The ID of the VPN connection.
     * </p>
     */
    private String vpnConnectionId;

    /**
     * <p>
     * The ID of the virtual private gateway at the AWS side of the VPN
     * connection.
     * </p>
     */
    private String vpnGatewayId;

    /**
     * <p>
     * The ID of the transit gateway associated with the VPN connection.
     * </p>
     */
    private String transitGatewayId;

    /**
     * <p>
     * The VPN connection options.
     * </p>
     */
    private VpnConnectionOptions options;

    /**
     * <p>
     * The static routes associated with the VPN connection.
     * </p>
     */
    private java.util.List<VpnStaticRoute> routes;

    /**
     * <p>
     * Any tags assigned to the VPN connection.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Information about the VPN tunnel.
     * </p>
     */
    private java.util.List<VgwTelemetry> vgwTelemetry;

    /**
     * <p>
     * The configuration information for the VPN connection's customer gateway
     * (in the native XML format). This element is always present in the
     * <a>CreateVpnConnection</a> response; however, it's present in the
     * <a>DescribeVpnConnections</a> response only if the VPN connection is in
     * the <code>pending</code> or <code>available</code> state.
     * </p>
     *
     * @return <p>
     *         The configuration information for the VPN connection's customer
     *         gateway (in the native XML format). This element is always
     *         present in the <a>CreateVpnConnection</a> response; however, it's
     *         present in the <a>DescribeVpnConnections</a> response only if the
     *         VPN connection is in the <code>pending</code> or
     *         <code>available</code> state.
     *         </p>
     */
    public String getCustomerGatewayConfiguration() {
        return customerGatewayConfiguration;
    }

    /**
     * <p>
     * The configuration information for the VPN connection's customer gateway
     * (in the native XML format). This element is always present in the
     * <a>CreateVpnConnection</a> response; however, it's present in the
     * <a>DescribeVpnConnections</a> response only if the VPN connection is in
     * the <code>pending</code> or <code>available</code> state.
     * </p>
     *
     * @param customerGatewayConfiguration <p>
     *            The configuration information for the VPN connection's
     *            customer gateway (in the native XML format). This element is
     *            always present in the <a>CreateVpnConnection</a> response;
     *            however, it's present in the <a>DescribeVpnConnections</a>
     *            response only if the VPN connection is in the
     *            <code>pending</code> or <code>available</code> state.
     *            </p>
     */
    public void setCustomerGatewayConfiguration(String customerGatewayConfiguration) {
        this.customerGatewayConfiguration = customerGatewayConfiguration;
    }

    /**
     * <p>
     * The configuration information for the VPN connection's customer gateway
     * (in the native XML format). This element is always present in the
     * <a>CreateVpnConnection</a> response; however, it's present in the
     * <a>DescribeVpnConnections</a> response only if the VPN connection is in
     * the <code>pending</code> or <code>available</code> state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customerGatewayConfiguration <p>
     *            The configuration information for the VPN connection's
     *            customer gateway (in the native XML format). This element is
     *            always present in the <a>CreateVpnConnection</a> response;
     *            however, it's present in the <a>DescribeVpnConnections</a>
     *            response only if the VPN connection is in the
     *            <code>pending</code> or <code>available</code> state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnConnection withCustomerGatewayConfiguration(String customerGatewayConfiguration) {
        this.customerGatewayConfiguration = customerGatewayConfiguration;
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
    public VpnConnection withCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }

    /**
     * <p>
     * The category of the VPN connection. A value of <code>VPN</code> indicates
     * an AWS VPN connection. A value of <code>VPN-Classic</code> indicates an
     * AWS Classic VPN connection.
     * </p>
     *
     * @return <p>
     *         The category of the VPN connection. A value of <code>VPN</code>
     *         indicates an AWS VPN connection. A value of
     *         <code>VPN-Classic</code> indicates an AWS Classic VPN connection.
     *         </p>
     */
    public String getCategory() {
        return category;
    }

    /**
     * <p>
     * The category of the VPN connection. A value of <code>VPN</code> indicates
     * an AWS VPN connection. A value of <code>VPN-Classic</code> indicates an
     * AWS Classic VPN connection.
     * </p>
     *
     * @param category <p>
     *            The category of the VPN connection. A value of
     *            <code>VPN</code> indicates an AWS VPN connection. A value of
     *            <code>VPN-Classic</code> indicates an AWS Classic VPN
     *            connection.
     *            </p>
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category of the VPN connection. A value of <code>VPN</code> indicates
     * an AWS VPN connection. A value of <code>VPN-Classic</code> indicates an
     * AWS Classic VPN connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param category <p>
     *            The category of the VPN connection. A value of
     *            <code>VPN</code> indicates an AWS VPN connection. A value of
     *            <code>VPN-Classic</code> indicates an AWS Classic VPN
     *            connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnConnection withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * <p>
     * The current state of the VPN connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @return <p>
     *         The current state of the VPN connection.
     *         </p>
     * @see VpnState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The current state of the VPN connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state <p>
     *            The current state of the VPN connection.
     *            </p>
     * @see VpnState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the VPN connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state <p>
     *            The current state of the VPN connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VpnState
     */
    public VpnConnection withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The current state of the VPN connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state <p>
     *            The current state of the VPN connection.
     *            </p>
     * @see VpnState
     */
    public void setState(VpnState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The current state of the VPN connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state <p>
     *            The current state of the VPN connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VpnState
     */
    public VpnConnection withState(VpnState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The type of VPN connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @return <p>
     *         The type of VPN connection.
     *         </p>
     * @see GatewayType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of VPN connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type <p>
     *            The type of VPN connection.
     *            </p>
     * @see GatewayType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of VPN connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type <p>
     *            The type of VPN connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GatewayType
     */
    public VpnConnection withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of VPN connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type <p>
     *            The type of VPN connection.
     *            </p>
     * @see GatewayType
     */
    public void setType(GatewayType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of VPN connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type <p>
     *            The type of VPN connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GatewayType
     */
    public VpnConnection withType(GatewayType type) {
        this.type = type.toString();
        return this;
    }

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
    public VpnConnection withVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
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
    public VpnConnection withVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }

    /**
     * <p>
     * The ID of the transit gateway associated with the VPN connection.
     * </p>
     *
     * @return <p>
     *         The ID of the transit gateway associated with the VPN connection.
     *         </p>
     */
    public String getTransitGatewayId() {
        return transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway associated with the VPN connection.
     * </p>
     *
     * @param transitGatewayId <p>
     *            The ID of the transit gateway associated with the VPN
     *            connection.
     *            </p>
     */
    public void setTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway associated with the VPN connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayId <p>
     *            The ID of the transit gateway associated with the VPN
     *            connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnConnection withTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
        return this;
    }

    /**
     * <p>
     * The VPN connection options.
     * </p>
     *
     * @return <p>
     *         The VPN connection options.
     *         </p>
     */
    public VpnConnectionOptions getOptions() {
        return options;
    }

    /**
     * <p>
     * The VPN connection options.
     * </p>
     *
     * @param options <p>
     *            The VPN connection options.
     *            </p>
     */
    public void setOptions(VpnConnectionOptions options) {
        this.options = options;
    }

    /**
     * <p>
     * The VPN connection options.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param options <p>
     *            The VPN connection options.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnConnection withOptions(VpnConnectionOptions options) {
        this.options = options;
        return this;
    }

    /**
     * <p>
     * The static routes associated with the VPN connection.
     * </p>
     *
     * @return <p>
     *         The static routes associated with the VPN connection.
     *         </p>
     */
    public java.util.List<VpnStaticRoute> getRoutes() {
        return routes;
    }

    /**
     * <p>
     * The static routes associated with the VPN connection.
     * </p>
     *
     * @param routes <p>
     *            The static routes associated with the VPN connection.
     *            </p>
     */
    public void setRoutes(java.util.Collection<VpnStaticRoute> routes) {
        if (routes == null) {
            this.routes = null;
            return;
        }

        this.routes = new java.util.ArrayList<VpnStaticRoute>(routes);
    }

    /**
     * <p>
     * The static routes associated with the VPN connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routes <p>
     *            The static routes associated with the VPN connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnConnection withRoutes(VpnStaticRoute... routes) {
        if (getRoutes() == null) {
            this.routes = new java.util.ArrayList<VpnStaticRoute>(routes.length);
        }
        for (VpnStaticRoute value : routes) {
            this.routes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The static routes associated with the VPN connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routes <p>
     *            The static routes associated with the VPN connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnConnection withRoutes(java.util.Collection<VpnStaticRoute> routes) {
        setRoutes(routes);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the VPN connection.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the VPN connection.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the VPN connection.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the VPN connection.
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
     * Any tags assigned to the VPN connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the VPN connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnConnection withTags(Tag... tags) {
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
     * Any tags assigned to the VPN connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the VPN connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnConnection withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Information about the VPN tunnel.
     * </p>
     *
     * @return <p>
     *         Information about the VPN tunnel.
     *         </p>
     */
    public java.util.List<VgwTelemetry> getVgwTelemetry() {
        return vgwTelemetry;
    }

    /**
     * <p>
     * Information about the VPN tunnel.
     * </p>
     *
     * @param vgwTelemetry <p>
     *            Information about the VPN tunnel.
     *            </p>
     */
    public void setVgwTelemetry(java.util.Collection<VgwTelemetry> vgwTelemetry) {
        if (vgwTelemetry == null) {
            this.vgwTelemetry = null;
            return;
        }

        this.vgwTelemetry = new java.util.ArrayList<VgwTelemetry>(vgwTelemetry);
    }

    /**
     * <p>
     * Information about the VPN tunnel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vgwTelemetry <p>
     *            Information about the VPN tunnel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnConnection withVgwTelemetry(VgwTelemetry... vgwTelemetry) {
        if (getVgwTelemetry() == null) {
            this.vgwTelemetry = new java.util.ArrayList<VgwTelemetry>(vgwTelemetry.length);
        }
        for (VgwTelemetry value : vgwTelemetry) {
            this.vgwTelemetry.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the VPN tunnel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vgwTelemetry <p>
     *            Information about the VPN tunnel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnConnection withVgwTelemetry(java.util.Collection<VgwTelemetry> vgwTelemetry) {
        setVgwTelemetry(vgwTelemetry);
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
        if (getCustomerGatewayConfiguration() != null)
            sb.append("CustomerGatewayConfiguration: " + getCustomerGatewayConfiguration() + ",");
        if (getCustomerGatewayId() != null)
            sb.append("CustomerGatewayId: " + getCustomerGatewayId() + ",");
        if (getCategory() != null)
            sb.append("Category: " + getCategory() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getVpnConnectionId() != null)
            sb.append("VpnConnectionId: " + getVpnConnectionId() + ",");
        if (getVpnGatewayId() != null)
            sb.append("VpnGatewayId: " + getVpnGatewayId() + ",");
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: " + getTransitGatewayId() + ",");
        if (getOptions() != null)
            sb.append("Options: " + getOptions() + ",");
        if (getRoutes() != null)
            sb.append("Routes: " + getRoutes() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getVgwTelemetry() != null)
            sb.append("VgwTelemetry: " + getVgwTelemetry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCustomerGatewayConfiguration() == null) ? 0
                        : getCustomerGatewayConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getCustomerGatewayId() == null) ? 0 : getCustomerGatewayId().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getVpnConnectionId() == null) ? 0 : getVpnConnectionId().hashCode());
        hashCode = prime * hashCode
                + ((getVpnGatewayId() == null) ? 0 : getVpnGatewayId().hashCode());
        hashCode = prime * hashCode
                + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getRoutes() == null) ? 0 : getRoutes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getVgwTelemetry() == null) ? 0 : getVgwTelemetry().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpnConnection == false)
            return false;
        VpnConnection other = (VpnConnection) obj;

        if (other.getCustomerGatewayConfiguration() == null
                ^ this.getCustomerGatewayConfiguration() == null)
            return false;
        if (other.getCustomerGatewayConfiguration() != null
                && other.getCustomerGatewayConfiguration().equals(
                        this.getCustomerGatewayConfiguration()) == false)
            return false;
        if (other.getCustomerGatewayId() == null ^ this.getCustomerGatewayId() == null)
            return false;
        if (other.getCustomerGatewayId() != null
                && other.getCustomerGatewayId().equals(this.getCustomerGatewayId()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getVpnConnectionId() == null ^ this.getVpnConnectionId() == null)
            return false;
        if (other.getVpnConnectionId() != null
                && other.getVpnConnectionId().equals(this.getVpnConnectionId()) == false)
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
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getRoutes() == null ^ this.getRoutes() == null)
            return false;
        if (other.getRoutes() != null && other.getRoutes().equals(this.getRoutes()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVgwTelemetry() == null ^ this.getVgwTelemetry() == null)
            return false;
        if (other.getVgwTelemetry() != null
                && other.getVgwTelemetry().equals(this.getVgwTelemetry()) == false)
            return false;
        return true;
    }
}
