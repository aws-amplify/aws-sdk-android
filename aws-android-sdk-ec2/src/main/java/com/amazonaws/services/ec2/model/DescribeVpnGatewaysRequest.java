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
 * Describes one or more of your virtual private gateways.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html">AWS
 * Site-to-Site VPN</a> in the <i>AWS Site-to-Site VPN User Guide</i>.
 * </p>
 */
public class DescribeVpnGatewaysRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>amazon-side-asn</code> - The Autonomous System Number (ASN) for the
     * Amazon side of the gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.state</code> - The current state of the attachment
     * between the gateway and the VPC (<code>attaching</code> |
     * <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.vpc-id</code> - The ID of an attached VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone for the virtual
     * private gateway (if applicable).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the virtual private gateway (
     * <code>pending</code> | <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>).
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
     * <code>type</code> - The type of virtual private gateway. Currently the
     * only supported type is <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-gateway-id</code> - The ID of the virtual private gateway.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * One or more virtual private gateway IDs.
     * </p>
     * <p>
     * Default: Describes all your virtual private gateways.
     * </p>
     */
    private java.util.List<String> vpnGatewayIds;

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
     * <code>amazon-side-asn</code> - The Autonomous System Number (ASN) for the
     * Amazon side of the gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.state</code> - The current state of the attachment
     * between the gateway and the VPC (<code>attaching</code> |
     * <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.vpc-id</code> - The ID of an attached VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone for the virtual
     * private gateway (if applicable).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the virtual private gateway (
     * <code>pending</code> | <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>).
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
     * <code>type</code> - The type of virtual private gateway. Currently the
     * only supported type is <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-gateway-id</code> - The ID of the virtual private gateway.
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
     *         <code>amazon-side-asn</code> - The Autonomous System Number (ASN)
     *         for the Amazon side of the gateway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.state</code> - The current state of the
     *         attachment between the gateway and the VPC (
     *         <code>attaching</code> | <code>attached</code> |
     *         <code>detaching</code> | <code>detached</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.vpc-id</code> - The ID of an attached VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone for the
     *         virtual private gateway (if applicable).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the virtual private gateway (
     *         <code>pending</code> | <code>available</code> |
     *         <code>deleting</code> | <code>deleted</code>).
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
     *         <code>type</code> - The type of virtual private gateway.
     *         Currently the only supported type is <code>ipsec.1</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vpn-gateway-id</code> - The ID of the virtual private
     *         gateway.
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
     * <code>amazon-side-asn</code> - The Autonomous System Number (ASN) for the
     * Amazon side of the gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.state</code> - The current state of the attachment
     * between the gateway and the VPC (<code>attaching</code> |
     * <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.vpc-id</code> - The ID of an attached VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone for the virtual
     * private gateway (if applicable).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the virtual private gateway (
     * <code>pending</code> | <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>).
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
     * <code>type</code> - The type of virtual private gateway. Currently the
     * only supported type is <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-gateway-id</code> - The ID of the virtual private gateway.
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
     *            <code>amazon-side-asn</code> - The Autonomous System Number
     *            (ASN) for the Amazon side of the gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.state</code> - The current state of the
     *            attachment between the gateway and the VPC (
     *            <code>attaching</code> | <code>attached</code> |
     *            <code>detaching</code> | <code>detached</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.vpc-id</code> - The ID of an attached VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone for the
     *            virtual private gateway (if applicable).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the virtual private gateway
     *            (<code>pending</code> | <code>available</code> |
     *            <code>deleting</code> | <code>deleted</code>).
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
     *            <code>type</code> - The type of virtual private gateway.
     *            Currently the only supported type is <code>ipsec.1</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpn-gateway-id</code> - The ID of the virtual private
     *            gateway.
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
     * <code>amazon-side-asn</code> - The Autonomous System Number (ASN) for the
     * Amazon side of the gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.state</code> - The current state of the attachment
     * between the gateway and the VPC (<code>attaching</code> |
     * <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.vpc-id</code> - The ID of an attached VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone for the virtual
     * private gateway (if applicable).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the virtual private gateway (
     * <code>pending</code> | <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>).
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
     * <code>type</code> - The type of virtual private gateway. Currently the
     * only supported type is <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-gateway-id</code> - The ID of the virtual private gateway.
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
     *            <code>amazon-side-asn</code> - The Autonomous System Number
     *            (ASN) for the Amazon side of the gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.state</code> - The current state of the
     *            attachment between the gateway and the VPC (
     *            <code>attaching</code> | <code>attached</code> |
     *            <code>detaching</code> | <code>detached</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.vpc-id</code> - The ID of an attached VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone for the
     *            virtual private gateway (if applicable).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the virtual private gateway
     *            (<code>pending</code> | <code>available</code> |
     *            <code>deleting</code> | <code>deleted</code>).
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
     *            <code>type</code> - The type of virtual private gateway.
     *            Currently the only supported type is <code>ipsec.1</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpn-gateway-id</code> - The ID of the virtual private
     *            gateway.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpnGatewaysRequest withFilters(Filter... filters) {
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
     * <code>amazon-side-asn</code> - The Autonomous System Number (ASN) for the
     * Amazon side of the gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.state</code> - The current state of the attachment
     * between the gateway and the VPC (<code>attaching</code> |
     * <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.vpc-id</code> - The ID of an attached VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone for the virtual
     * private gateway (if applicable).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the virtual private gateway (
     * <code>pending</code> | <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>).
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
     * <code>type</code> - The type of virtual private gateway. Currently the
     * only supported type is <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-gateway-id</code> - The ID of the virtual private gateway.
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
     *            <code>amazon-side-asn</code> - The Autonomous System Number
     *            (ASN) for the Amazon side of the gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.state</code> - The current state of the
     *            attachment between the gateway and the VPC (
     *            <code>attaching</code> | <code>attached</code> |
     *            <code>detaching</code> | <code>detached</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.vpc-id</code> - The ID of an attached VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone for the
     *            virtual private gateway (if applicable).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the virtual private gateway
     *            (<code>pending</code> | <code>available</code> |
     *            <code>deleting</code> | <code>deleted</code>).
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
     *            <code>type</code> - The type of virtual private gateway.
     *            Currently the only supported type is <code>ipsec.1</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpn-gateway-id</code> - The ID of the virtual private
     *            gateway.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpnGatewaysRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * One or more virtual private gateway IDs.
     * </p>
     * <p>
     * Default: Describes all your virtual private gateways.
     * </p>
     *
     * @return <p>
     *         One or more virtual private gateway IDs.
     *         </p>
     *         <p>
     *         Default: Describes all your virtual private gateways.
     *         </p>
     */
    public java.util.List<String> getVpnGatewayIds() {
        return vpnGatewayIds;
    }

    /**
     * <p>
     * One or more virtual private gateway IDs.
     * </p>
     * <p>
     * Default: Describes all your virtual private gateways.
     * </p>
     *
     * @param vpnGatewayIds <p>
     *            One or more virtual private gateway IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your virtual private gateways.
     *            </p>
     */
    public void setVpnGatewayIds(java.util.Collection<String> vpnGatewayIds) {
        if (vpnGatewayIds == null) {
            this.vpnGatewayIds = null;
            return;
        }

        this.vpnGatewayIds = new java.util.ArrayList<String>(vpnGatewayIds);
    }

    /**
     * <p>
     * One or more virtual private gateway IDs.
     * </p>
     * <p>
     * Default: Describes all your virtual private gateways.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpnGatewayIds <p>
     *            One or more virtual private gateway IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your virtual private gateways.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpnGatewaysRequest withVpnGatewayIds(String... vpnGatewayIds) {
        if (getVpnGatewayIds() == null) {
            this.vpnGatewayIds = new java.util.ArrayList<String>(vpnGatewayIds.length);
        }
        for (String value : vpnGatewayIds) {
            this.vpnGatewayIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more virtual private gateway IDs.
     * </p>
     * <p>
     * Default: Describes all your virtual private gateways.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpnGatewayIds <p>
     *            One or more virtual private gateway IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your virtual private gateways.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpnGatewaysRequest withVpnGatewayIds(java.util.Collection<String> vpnGatewayIds) {
        setVpnGatewayIds(vpnGatewayIds);
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
    public DescribeVpnGatewaysRequest withDryRun(Boolean dryRun) {
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
        if (getVpnGatewayIds() != null)
            sb.append("VpnGatewayIds: " + getVpnGatewayIds() + ",");
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
                + ((getVpnGatewayIds() == null) ? 0 : getVpnGatewayIds().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpnGatewaysRequest == false)
            return false;
        DescribeVpnGatewaysRequest other = (DescribeVpnGatewaysRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getVpnGatewayIds() == null ^ this.getVpnGatewayIds() == null)
            return false;
        if (other.getVpnGatewayIds() != null
                && other.getVpnGatewayIds().equals(this.getVpnGatewayIds()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
