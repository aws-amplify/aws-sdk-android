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
 * Describes one or more transit gateways. By default, all transit gateways are
 * described. Alternatively, you can filter the results.
 * </p>
 */
public class DescribeTransitGatewaysRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The IDs of the transit gateways.
     * </p>
     */
    private java.util.List<String> transitGatewayIds;

    /**
     * <p>
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>options.propagation-default-route-table-id</code> - The ID of the
     * default propagation route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.amazon-side-asn</code> - The private ASN for the Amazon
     * side of a BGP session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.association-default-route-table-id</code> - The ID of the
     * default association route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.auto-accept-shared-attachments</code> - Indicates whether
     * there is automatic acceptance of attachment requests (<code>enable</code>
     * | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.default-route-table-association</code> - Indicates whether
     * resource attachments are automatically associated with the default
     * association route table (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.default-route-table-propagation</code> - Indicates whether
     * resource attachments automatically propagate routes to the default
     * propagation route table (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.dns-support</code> - Indicates whether DNS support is
     * enabled (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.vpn-ecmp-support</code> - Indicates whether Equal Cost
     * Multipath Protocol support is enabled (<code>enable</code> |
     * <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the transit
     * gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the attachment (<code>available</code>
     * | <code>deleted</code> | <code>deleting</code> | <code>failed</code> |
     * <code>modifying</code> | <code>pendingAcceptance</code> |
     * <code>pending</code> | <code>rollingBack</code> | <code>rejected</code> |
     * <code>rejecting</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of the transit gateway.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

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
     * The IDs of the transit gateways.
     * </p>
     *
     * @return <p>
     *         The IDs of the transit gateways.
     *         </p>
     */
    public java.util.List<String> getTransitGatewayIds() {
        return transitGatewayIds;
    }

    /**
     * <p>
     * The IDs of the transit gateways.
     * </p>
     *
     * @param transitGatewayIds <p>
     *            The IDs of the transit gateways.
     *            </p>
     */
    public void setTransitGatewayIds(java.util.Collection<String> transitGatewayIds) {
        if (transitGatewayIds == null) {
            this.transitGatewayIds = null;
            return;
        }

        this.transitGatewayIds = new java.util.ArrayList<String>(transitGatewayIds);
    }

    /**
     * <p>
     * The IDs of the transit gateways.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayIds <p>
     *            The IDs of the transit gateways.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTransitGatewaysRequest withTransitGatewayIds(String... transitGatewayIds) {
        if (getTransitGatewayIds() == null) {
            this.transitGatewayIds = new java.util.ArrayList<String>(transitGatewayIds.length);
        }
        for (String value : transitGatewayIds) {
            this.transitGatewayIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the transit gateways.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayIds <p>
     *            The IDs of the transit gateways.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTransitGatewaysRequest withTransitGatewayIds(
            java.util.Collection<String> transitGatewayIds) {
        setTransitGatewayIds(transitGatewayIds);
        return this;
    }

    /**
     * <p>
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>options.propagation-default-route-table-id</code> - The ID of the
     * default propagation route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.amazon-side-asn</code> - The private ASN for the Amazon
     * side of a BGP session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.association-default-route-table-id</code> - The ID of the
     * default association route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.auto-accept-shared-attachments</code> - Indicates whether
     * there is automatic acceptance of attachment requests (<code>enable</code>
     * | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.default-route-table-association</code> - Indicates whether
     * resource attachments are automatically associated with the default
     * association route table (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.default-route-table-propagation</code> - Indicates whether
     * resource attachments automatically propagate routes to the default
     * propagation route table (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.dns-support</code> - Indicates whether DNS support is
     * enabled (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.vpn-ecmp-support</code> - Indicates whether Equal Cost
     * Multipath Protocol support is enabled (<code>enable</code> |
     * <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the transit
     * gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the attachment (<code>available</code>
     * | <code>deleted</code> | <code>deleting</code> | <code>failed</code> |
     * <code>modifying</code> | <code>pendingAcceptance</code> |
     * <code>pending</code> | <code>rollingBack</code> | <code>rejected</code> |
     * <code>rejecting</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of the transit gateway.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         One or more filters. The possible values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>options.propagation-default-route-table-id</code> - The ID
     *         of the default propagation route table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>options.amazon-side-asn</code> - The private ASN for the
     *         Amazon side of a BGP session.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>options.association-default-route-table-id</code> - The ID
     *         of the default association route table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>options.auto-accept-shared-attachments</code> - Indicates
     *         whether there is automatic acceptance of attachment requests (
     *         <code>enable</code> | <code>disable</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>options.default-route-table-association</code> - Indicates
     *         whether resource attachments are automatically associated with
     *         the default association route table (<code>enable</code> |
     *         <code>disable</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>options.default-route-table-propagation</code> - Indicates
     *         whether resource attachments automatically propagate routes to
     *         the default propagation route table (<code>enable</code> |
     *         <code>disable</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>options.dns-support</code> - Indicates whether DNS support
     *         is enabled (<code>enable</code> | <code>disable</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>options.vpn-ecmp-support</code> - Indicates whether Equal
     *         Cost Multipath Protocol support is enabled (<code>enable</code> |
     *         <code>disable</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code> - The ID of the AWS account that owns the
     *         transit gateway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the attachment (
     *         <code>available</code> | <code>deleted</code> |
     *         <code>deleting</code> | <code>failed</code> |
     *         <code>modifying</code> | <code>pendingAcceptance</code> |
     *         <code>pending</code> | <code>rollingBack</code> |
     *         <code>rejected</code> | <code>rejecting</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>transit-gateway-id</code> - The ID of the transit gateway.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>options.propagation-default-route-table-id</code> - The ID of the
     * default propagation route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.amazon-side-asn</code> - The private ASN for the Amazon
     * side of a BGP session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.association-default-route-table-id</code> - The ID of the
     * default association route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.auto-accept-shared-attachments</code> - Indicates whether
     * there is automatic acceptance of attachment requests (<code>enable</code>
     * | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.default-route-table-association</code> - Indicates whether
     * resource attachments are automatically associated with the default
     * association route table (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.default-route-table-propagation</code> - Indicates whether
     * resource attachments automatically propagate routes to the default
     * propagation route table (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.dns-support</code> - Indicates whether DNS support is
     * enabled (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.vpn-ecmp-support</code> - Indicates whether Equal Cost
     * Multipath Protocol support is enabled (<code>enable</code> |
     * <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the transit
     * gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the attachment (<code>available</code>
     * | <code>deleted</code> | <code>deleting</code> | <code>failed</code> |
     * <code>modifying</code> | <code>pendingAcceptance</code> |
     * <code>pending</code> | <code>rollingBack</code> | <code>rejected</code> |
     * <code>rejecting</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of the transit gateway.
     * </p>
     * </li>
     * </ul>
     *
     * @param filters <p>
     *            One or more filters. The possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>options.propagation-default-route-table-id</code> - The
     *            ID of the default propagation route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>options.amazon-side-asn</code> - The private ASN for the
     *            Amazon side of a BGP session.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>options.association-default-route-table-id</code> - The
     *            ID of the default association route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>options.auto-accept-shared-attachments</code> -
     *            Indicates whether there is automatic acceptance of attachment
     *            requests (<code>enable</code> | <code>disable</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>options.default-route-table-association</code> -
     *            Indicates whether resource attachments are automatically
     *            associated with the default association route table (
     *            <code>enable</code> | <code>disable</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>options.default-route-table-propagation</code> -
     *            Indicates whether resource attachments automatically propagate
     *            routes to the default propagation route table (
     *            <code>enable</code> | <code>disable</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>options.dns-support</code> - Indicates whether DNS
     *            support is enabled (<code>enable</code> | <code>disable</code>
     *            ).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>options.vpn-ecmp-support</code> - Indicates whether
     *            Equal Cost Multipath Protocol support is enabled (
     *            <code>enable</code> | <code>disable</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The ID of the AWS account that owns
     *            the transit gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the attachment (
     *            <code>available</code> | <code>deleted</code> |
     *            <code>deleting</code> | <code>failed</code> |
     *            <code>modifying</code> | <code>pendingAcceptance</code> |
     *            <code>pending</code> | <code>rollingBack</code> |
     *            <code>rejected</code> | <code>rejecting</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>transit-gateway-id</code> - The ID of the transit
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
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>options.propagation-default-route-table-id</code> - The ID of the
     * default propagation route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.amazon-side-asn</code> - The private ASN for the Amazon
     * side of a BGP session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.association-default-route-table-id</code> - The ID of the
     * default association route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.auto-accept-shared-attachments</code> - Indicates whether
     * there is automatic acceptance of attachment requests (<code>enable</code>
     * | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.default-route-table-association</code> - Indicates whether
     * resource attachments are automatically associated with the default
     * association route table (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.default-route-table-propagation</code> - Indicates whether
     * resource attachments automatically propagate routes to the default
     * propagation route table (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.dns-support</code> - Indicates whether DNS support is
     * enabled (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.vpn-ecmp-support</code> - Indicates whether Equal Cost
     * Multipath Protocol support is enabled (<code>enable</code> |
     * <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the transit
     * gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the attachment (<code>available</code>
     * | <code>deleted</code> | <code>deleting</code> | <code>failed</code> |
     * <code>modifying</code> | <code>pendingAcceptance</code> |
     * <code>pending</code> | <code>rollingBack</code> | <code>rejected</code> |
     * <code>rejecting</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of the transit gateway.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more filters. The possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>options.propagation-default-route-table-id</code> - The
     *            ID of the default propagation route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>options.amazon-side-asn</code> - The private ASN for the
     *            Amazon side of a BGP session.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>options.association-default-route-table-id</code> - The
     *            ID of the default association route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>options.auto-accept-shared-attachments</code> -
     *            Indicates whether there is automatic acceptance of attachment
     *            requests (<code>enable</code> | <code>disable</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>options.default-route-table-association</code> -
     *            Indicates whether resource attachments are automatically
     *            associated with the default association route table (
     *            <code>enable</code> | <code>disable</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>options.default-route-table-propagation</code> -
     *            Indicates whether resource attachments automatically propagate
     *            routes to the default propagation route table (
     *            <code>enable</code> | <code>disable</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>options.dns-support</code> - Indicates whether DNS
     *            support is enabled (<code>enable</code> | <code>disable</code>
     *            ).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>options.vpn-ecmp-support</code> - Indicates whether
     *            Equal Cost Multipath Protocol support is enabled (
     *            <code>enable</code> | <code>disable</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The ID of the AWS account that owns
     *            the transit gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the attachment (
     *            <code>available</code> | <code>deleted</code> |
     *            <code>deleting</code> | <code>failed</code> |
     *            <code>modifying</code> | <code>pendingAcceptance</code> |
     *            <code>pending</code> | <code>rollingBack</code> |
     *            <code>rejected</code> | <code>rejecting</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>transit-gateway-id</code> - The ID of the transit
     *            gateway.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTransitGatewaysRequest withFilters(Filter... filters) {
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
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>options.propagation-default-route-table-id</code> - The ID of the
     * default propagation route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.amazon-side-asn</code> - The private ASN for the Amazon
     * side of a BGP session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.association-default-route-table-id</code> - The ID of the
     * default association route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.auto-accept-shared-attachments</code> - Indicates whether
     * there is automatic acceptance of attachment requests (<code>enable</code>
     * | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.default-route-table-association</code> - Indicates whether
     * resource attachments are automatically associated with the default
     * association route table (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.default-route-table-propagation</code> - Indicates whether
     * resource attachments automatically propagate routes to the default
     * propagation route table (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.dns-support</code> - Indicates whether DNS support is
     * enabled (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.vpn-ecmp-support</code> - Indicates whether Equal Cost
     * Multipath Protocol support is enabled (<code>enable</code> |
     * <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the transit
     * gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the attachment (<code>available</code>
     * | <code>deleted</code> | <code>deleting</code> | <code>failed</code> |
     * <code>modifying</code> | <code>pendingAcceptance</code> |
     * <code>pending</code> | <code>rollingBack</code> | <code>rejected</code> |
     * <code>rejecting</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of the transit gateway.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more filters. The possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>options.propagation-default-route-table-id</code> - The
     *            ID of the default propagation route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>options.amazon-side-asn</code> - The private ASN for the
     *            Amazon side of a BGP session.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>options.association-default-route-table-id</code> - The
     *            ID of the default association route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>options.auto-accept-shared-attachments</code> -
     *            Indicates whether there is automatic acceptance of attachment
     *            requests (<code>enable</code> | <code>disable</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>options.default-route-table-association</code> -
     *            Indicates whether resource attachments are automatically
     *            associated with the default association route table (
     *            <code>enable</code> | <code>disable</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>options.default-route-table-propagation</code> -
     *            Indicates whether resource attachments automatically propagate
     *            routes to the default propagation route table (
     *            <code>enable</code> | <code>disable</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>options.dns-support</code> - Indicates whether DNS
     *            support is enabled (<code>enable</code> | <code>disable</code>
     *            ).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>options.vpn-ecmp-support</code> - Indicates whether
     *            Equal Cost Multipath Protocol support is enabled (
     *            <code>enable</code> | <code>disable</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The ID of the AWS account that owns
     *            the transit gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the attachment (
     *            <code>available</code> | <code>deleted</code> |
     *            <code>deleting</code> | <code>failed</code> |
     *            <code>modifying</code> | <code>pendingAcceptance</code> |
     *            <code>pending</code> | <code>rollingBack</code> |
     *            <code>rejected</code> | <code>rejecting</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>transit-gateway-id</code> - The ID of the transit
     *            gateway.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTransitGatewaysRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     *
     * @return <p>
     *         The maximum number of results to return with a single call. To
     *         retrieve the remaining results, make another call with the
     *         returned <code>nextToken</code> value.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return with a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>nextToken</code> value.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return with a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>nextToken</code> value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTransitGatewaysRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     *
     * @return <p>
     *         The token for the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTransitGatewaysRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
    public DescribeTransitGatewaysRequest withDryRun(Boolean dryRun) {
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
        if (getTransitGatewayIds() != null)
            sb.append("TransitGatewayIds: " + getTransitGatewayIds() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
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
                + ((getTransitGatewayIds() == null) ? 0 : getTransitGatewayIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTransitGatewaysRequest == false)
            return false;
        DescribeTransitGatewaysRequest other = (DescribeTransitGatewaysRequest) obj;

        if (other.getTransitGatewayIds() == null ^ this.getTransitGatewayIds() == null)
            return false;
        if (other.getTransitGatewayIds() != null
                && other.getTransitGatewayIds().equals(this.getTransitGatewayIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
