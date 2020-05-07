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
 * Describes one or more of your VPN connections.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html">AWS
 * Site-to-Site VPN</a> in the <i>AWS Site-to-Site VPN User Guide</i>.
 * </p>
 */
public class DescribeVpnConnectionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>customer-gateway-configuration</code> - The configuration
     * information for the customer gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>customer-gateway-id</code> - The ID of a customer gateway
     * associated with the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the VPN connection (
     * <code>pending</code> | <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>option.static-routes-only</code> - Indicates whether the connection
     * has static routes only. Used for devices that do not support Border
     * Gateway Protocol (BGP).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-cidr-block</code> - The destination CIDR block.
     * This corresponds to the subnet used in a customer data center.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bgp-asn</code> - The BGP Autonomous System Number (ASN) associated
     * with a BGP device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of VPN connection. Currently the only
     * supported type is <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-connection-id</code> - The ID of the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-gateway-id</code> - The ID of a virtual private gateway
     * associated with the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of a transit gateway associated
     * with the VPN connection.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * One or more VPN connection IDs.
     * </p>
     * <p>
     * Default: Describes your VPN connections.
     * </p>
     */
    private java.util.List<String> vpnConnectionIds;

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
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>customer-gateway-configuration</code> - The configuration
     * information for the customer gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>customer-gateway-id</code> - The ID of a customer gateway
     * associated with the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the VPN connection (
     * <code>pending</code> | <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>option.static-routes-only</code> - Indicates whether the connection
     * has static routes only. Used for devices that do not support Border
     * Gateway Protocol (BGP).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-cidr-block</code> - The destination CIDR block.
     * This corresponds to the subnet used in a customer data center.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bgp-asn</code> - The BGP Autonomous System Number (ASN) associated
     * with a BGP device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of VPN connection. Currently the only
     * supported type is <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-connection-id</code> - The ID of the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-gateway-id</code> - The ID of a virtual private gateway
     * associated with the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of a transit gateway associated
     * with the VPN connection.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         One or more filters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>customer-gateway-configuration</code> - The configuration
     *         information for the customer gateway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>customer-gateway-id</code> - The ID of a customer gateway
     *         associated with the VPN connection.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the VPN connection (
     *         <code>pending</code> | <code>available</code> |
     *         <code>deleting</code> | <code>deleted</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>option.static-routes-only</code> - Indicates whether the
     *         connection has static routes only. Used for devices that do not
     *         support Border Gateway Protocol (BGP).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route.destination-cidr-block</code> - The destination CIDR
     *         block. This corresponds to the subnet used in a customer data
     *         center.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>bgp-asn</code> - The BGP Autonomous System Number (ASN)
     *         associated with a BGP device.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     *         assigned to the resource. Use the tag key in the filter name and
     *         the tag value as the filter value. For example, to find all
     *         resources that have a tag with the key <code>Owner</code> and the
     *         value <code>TeamA</code>, specify <code>tag:Owner</code> for the
     *         filter name and <code>TeamA</code> for the filter value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-key</code> - The key of a tag assigned to the resource.
     *         Use this filter to find all resources assigned a tag with a
     *         specific key, regardless of the tag value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>type</code> - The type of VPN connection. Currently the
     *         only supported type is <code>ipsec.1</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vpn-connection-id</code> - The ID of the VPN connection.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vpn-gateway-id</code> - The ID of a virtual private gateway
     *         associated with the VPN connection.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>transit-gateway-id</code> - The ID of a transit gateway
     *         associated with the VPN connection.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>customer-gateway-configuration</code> - The configuration
     * information for the customer gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>customer-gateway-id</code> - The ID of a customer gateway
     * associated with the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the VPN connection (
     * <code>pending</code> | <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>option.static-routes-only</code> - Indicates whether the connection
     * has static routes only. Used for devices that do not support Border
     * Gateway Protocol (BGP).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-cidr-block</code> - The destination CIDR block.
     * This corresponds to the subnet used in a customer data center.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bgp-asn</code> - The BGP Autonomous System Number (ASN) associated
     * with a BGP device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of VPN connection. Currently the only
     * supported type is <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-connection-id</code> - The ID of the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-gateway-id</code> - The ID of a virtual private gateway
     * associated with the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of a transit gateway associated
     * with the VPN connection.
     * </p>
     * </li>
     * </ul>
     *
     * @param filters <p>
     *            One or more filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>customer-gateway-configuration</code> - The
     *            configuration information for the customer gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>customer-gateway-id</code> - The ID of a customer
     *            gateway associated with the VPN connection.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the VPN connection (
     *            <code>pending</code> | <code>available</code> |
     *            <code>deleting</code> | <code>deleted</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>option.static-routes-only</code> - Indicates whether the
     *            connection has static routes only. Used for devices that do
     *            not support Border Gateway Protocol (BGP).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.destination-cidr-block</code> - The destination
     *            CIDR block. This corresponds to the subnet used in a customer
     *            data center.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>bgp-asn</code> - The BGP Autonomous System Number (ASN)
     *            associated with a BGP device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag</code>:&lt;key&gt; - The key/value combination of a
     *            tag assigned to the resource. Use the tag key in the filter
     *            name and the tag value as the filter value. For example, to
     *            find all resources that have a tag with the key
     *            <code>Owner</code> and the value <code>TeamA</code>, specify
     *            <code>tag:Owner</code> for the filter name and
     *            <code>TeamA</code> for the filter value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag-key</code> - The key of a tag assigned to the
     *            resource. Use this filter to find all resources assigned a tag
     *            with a specific key, regardless of the tag value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>type</code> - The type of VPN connection. Currently the
     *            only supported type is <code>ipsec.1</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpn-connection-id</code> - The ID of the VPN connection.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpn-gateway-id</code> - The ID of a virtual private
     *            gateway associated with the VPN connection.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>transit-gateway-id</code> - The ID of a transit gateway
     *            associated with the VPN connection.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>customer-gateway-configuration</code> - The configuration
     * information for the customer gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>customer-gateway-id</code> - The ID of a customer gateway
     * associated with the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the VPN connection (
     * <code>pending</code> | <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>option.static-routes-only</code> - Indicates whether the connection
     * has static routes only. Used for devices that do not support Border
     * Gateway Protocol (BGP).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-cidr-block</code> - The destination CIDR block.
     * This corresponds to the subnet used in a customer data center.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bgp-asn</code> - The BGP Autonomous System Number (ASN) associated
     * with a BGP device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of VPN connection. Currently the only
     * supported type is <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-connection-id</code> - The ID of the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-gateway-id</code> - The ID of a virtual private gateway
     * associated with the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of a transit gateway associated
     * with the VPN connection.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>customer-gateway-configuration</code> - The
     *            configuration information for the customer gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>customer-gateway-id</code> - The ID of a customer
     *            gateway associated with the VPN connection.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the VPN connection (
     *            <code>pending</code> | <code>available</code> |
     *            <code>deleting</code> | <code>deleted</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>option.static-routes-only</code> - Indicates whether the
     *            connection has static routes only. Used for devices that do
     *            not support Border Gateway Protocol (BGP).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.destination-cidr-block</code> - The destination
     *            CIDR block. This corresponds to the subnet used in a customer
     *            data center.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>bgp-asn</code> - The BGP Autonomous System Number (ASN)
     *            associated with a BGP device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag</code>:&lt;key&gt; - The key/value combination of a
     *            tag assigned to the resource. Use the tag key in the filter
     *            name and the tag value as the filter value. For example, to
     *            find all resources that have a tag with the key
     *            <code>Owner</code> and the value <code>TeamA</code>, specify
     *            <code>tag:Owner</code> for the filter name and
     *            <code>TeamA</code> for the filter value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag-key</code> - The key of a tag assigned to the
     *            resource. Use this filter to find all resources assigned a tag
     *            with a specific key, regardless of the tag value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>type</code> - The type of VPN connection. Currently the
     *            only supported type is <code>ipsec.1</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpn-connection-id</code> - The ID of the VPN connection.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpn-gateway-id</code> - The ID of a virtual private
     *            gateway associated with the VPN connection.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>transit-gateway-id</code> - The ID of a transit gateway
     *            associated with the VPN connection.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpnConnectionsRequest withFilters(Filter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<Filter>(filters.length);
        }
        for (Filter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>customer-gateway-configuration</code> - The configuration
     * information for the customer gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>customer-gateway-id</code> - The ID of a customer gateway
     * associated with the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the VPN connection (
     * <code>pending</code> | <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>option.static-routes-only</code> - Indicates whether the connection
     * has static routes only. Used for devices that do not support Border
     * Gateway Protocol (BGP).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-cidr-block</code> - The destination CIDR block.
     * This corresponds to the subnet used in a customer data center.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bgp-asn</code> - The BGP Autonomous System Number (ASN) associated
     * with a BGP device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of VPN connection. Currently the only
     * supported type is <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-connection-id</code> - The ID of the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-gateway-id</code> - The ID of a virtual private gateway
     * associated with the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of a transit gateway associated
     * with the VPN connection.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>customer-gateway-configuration</code> - The
     *            configuration information for the customer gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>customer-gateway-id</code> - The ID of a customer
     *            gateway associated with the VPN connection.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the VPN connection (
     *            <code>pending</code> | <code>available</code> |
     *            <code>deleting</code> | <code>deleted</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>option.static-routes-only</code> - Indicates whether the
     *            connection has static routes only. Used for devices that do
     *            not support Border Gateway Protocol (BGP).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.destination-cidr-block</code> - The destination
     *            CIDR block. This corresponds to the subnet used in a customer
     *            data center.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>bgp-asn</code> - The BGP Autonomous System Number (ASN)
     *            associated with a BGP device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag</code>:&lt;key&gt; - The key/value combination of a
     *            tag assigned to the resource. Use the tag key in the filter
     *            name and the tag value as the filter value. For example, to
     *            find all resources that have a tag with the key
     *            <code>Owner</code> and the value <code>TeamA</code>, specify
     *            <code>tag:Owner</code> for the filter name and
     *            <code>TeamA</code> for the filter value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag-key</code> - The key of a tag assigned to the
     *            resource. Use this filter to find all resources assigned a tag
     *            with a specific key, regardless of the tag value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>type</code> - The type of VPN connection. Currently the
     *            only supported type is <code>ipsec.1</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpn-connection-id</code> - The ID of the VPN connection.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpn-gateway-id</code> - The ID of a virtual private
     *            gateway associated with the VPN connection.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>transit-gateway-id</code> - The ID of a transit gateway
     *            associated with the VPN connection.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpnConnectionsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * One or more VPN connection IDs.
     * </p>
     * <p>
     * Default: Describes your VPN connections.
     * </p>
     *
     * @return <p>
     *         One or more VPN connection IDs.
     *         </p>
     *         <p>
     *         Default: Describes your VPN connections.
     *         </p>
     */
    public java.util.List<String> getVpnConnectionIds() {
        return vpnConnectionIds;
    }

    /**
     * <p>
     * One or more VPN connection IDs.
     * </p>
     * <p>
     * Default: Describes your VPN connections.
     * </p>
     *
     * @param vpnConnectionIds <p>
     *            One or more VPN connection IDs.
     *            </p>
     *            <p>
     *            Default: Describes your VPN connections.
     *            </p>
     */
    public void setVpnConnectionIds(java.util.Collection<String> vpnConnectionIds) {
        if (vpnConnectionIds == null) {
            this.vpnConnectionIds = null;
            return;
        }

        this.vpnConnectionIds = new java.util.ArrayList<String>(vpnConnectionIds);
    }

    /**
     * <p>
     * One or more VPN connection IDs.
     * </p>
     * <p>
     * Default: Describes your VPN connections.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpnConnectionIds <p>
     *            One or more VPN connection IDs.
     *            </p>
     *            <p>
     *            Default: Describes your VPN connections.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpnConnectionsRequest withVpnConnectionIds(String... vpnConnectionIds) {
        if (getVpnConnectionIds() == null) {
            this.vpnConnectionIds = new java.util.ArrayList<String>(vpnConnectionIds.length);
        }
        for (String value : vpnConnectionIds) {
            this.vpnConnectionIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more VPN connection IDs.
     * </p>
     * <p>
     * Default: Describes your VPN connections.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpnConnectionIds <p>
     *            One or more VPN connection IDs.
     *            </p>
     *            <p>
     *            Default: Describes your VPN connections.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpnConnectionsRequest withVpnConnectionIds(
            java.util.Collection<String> vpnConnectionIds) {
        setVpnConnectionIds(vpnConnectionIds);
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
    public DescribeVpnConnectionsRequest withDryRun(Boolean dryRun) {
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
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getVpnConnectionIds() != null)
            sb.append("VpnConnectionIds: " + getVpnConnectionIds() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode
                + ((getVpnConnectionIds() == null) ? 0 : getVpnConnectionIds().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpnConnectionsRequest == false)
            return false;
        DescribeVpnConnectionsRequest other = (DescribeVpnConnectionsRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getVpnConnectionIds() == null ^ this.getVpnConnectionIds() == null)
            return false;
        if (other.getVpnConnectionIds() != null
                && other.getVpnConnectionIds().equals(this.getVpnConnectionIds()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
