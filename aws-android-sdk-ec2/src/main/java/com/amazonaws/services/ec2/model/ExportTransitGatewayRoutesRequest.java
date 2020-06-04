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
 * Exports routes from the specified transit gateway route table to the
 * specified S3 bucket. By default, all routes are exported. Alternatively, you
 * can filter by CIDR range.
 * </p>
 * <p>
 * The routes are saved to the specified bucket in a JSON file. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/vpc/latest/tgw/tgw-route-tables.html#tgw-export-route-tables"
 * >Export Route Tables to Amazon S3</a> in <i>Transit Gateways</i>.
 * </p>
 */
public class ExportTransitGatewayRoutesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the route table.
     * </p>
     */
    private String transitGatewayRouteTableId;

    /**
     * <p>
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attachment.transit-gateway-attachment-id</code> - The id of the
     * transit gateway attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.resource-id</code> - The resource id of the transit
     * gateway attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.exact-match</code> - The exact match of the specified
     * filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.longest-prefix-match</code> - The longest prefix that
     * matches the route.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.subnet-of-match</code> - The routes with a subnet that
     * match the specified CIDR filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.supernet-of-match</code> - The routes with a CIDR that
     * encompass the CIDR filter. For example, if you have 10.0.1.0/29 and
     * 10.0.1.0/31 routes in your route table and you specify supernet-of-match
     * as 10.0.1.0/30, then the result returns 10.0.1.0/29.
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
     * <code>transit-gateway-route-destination-cidr-block</code> - The CIDR
     * range.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of route (<code>active</code> |
     * <code>blackhole</code>).
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     */
    private String s3Bucket;

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
     * The ID of the route table.
     * </p>
     *
     * @return <p>
     *         The ID of the route table.
     *         </p>
     */
    public String getTransitGatewayRouteTableId() {
        return transitGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     *
     * @param transitGatewayRouteTableId <p>
     *            The ID of the route table.
     *            </p>
     */
    public void setTransitGatewayRouteTableId(String transitGatewayRouteTableId) {
        this.transitGatewayRouteTableId = transitGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayRouteTableId <p>
     *            The ID of the route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTransitGatewayRoutesRequest withTransitGatewayRouteTableId(
            String transitGatewayRouteTableId) {
        this.transitGatewayRouteTableId = transitGatewayRouteTableId;
        return this;
    }

    /**
     * <p>
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attachment.transit-gateway-attachment-id</code> - The id of the
     * transit gateway attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.resource-id</code> - The resource id of the transit
     * gateway attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.exact-match</code> - The exact match of the specified
     * filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.longest-prefix-match</code> - The longest prefix that
     * matches the route.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.subnet-of-match</code> - The routes with a subnet that
     * match the specified CIDR filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.supernet-of-match</code> - The routes with a CIDR that
     * encompass the CIDR filter. For example, if you have 10.0.1.0/29 and
     * 10.0.1.0/31 routes in your route table and you specify supernet-of-match
     * as 10.0.1.0/30, then the result returns 10.0.1.0/29.
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
     * <code>transit-gateway-route-destination-cidr-block</code> - The CIDR
     * range.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of route (<code>active</code> |
     * <code>blackhole</code>).
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
     *         <code>attachment.transit-gateway-attachment-id</code> - The id of
     *         the transit gateway attachment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.resource-id</code> - The resource id of the
     *         transit gateway attachment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route-search.exact-match</code> - The exact match of the
     *         specified filter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route-search.longest-prefix-match</code> - The longest
     *         prefix that matches the route.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route-search.subnet-of-match</code> - The routes with a
     *         subnet that match the specified CIDR filter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route-search.supernet-of-match</code> - The routes with a
     *         CIDR that encompass the CIDR filter. For example, if you have
     *         10.0.1.0/29 and 10.0.1.0/31 routes in your route table and you
     *         specify supernet-of-match as 10.0.1.0/30, then the result returns
     *         10.0.1.0/29.
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
     *         <code>transit-gateway-route-destination-cidr-block</code> - The
     *         CIDR range.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>type</code> - The type of route (<code>active</code> |
     *         <code>blackhole</code>).
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
     * <code>attachment.transit-gateway-attachment-id</code> - The id of the
     * transit gateway attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.resource-id</code> - The resource id of the transit
     * gateway attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.exact-match</code> - The exact match of the specified
     * filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.longest-prefix-match</code> - The longest prefix that
     * matches the route.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.subnet-of-match</code> - The routes with a subnet that
     * match the specified CIDR filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.supernet-of-match</code> - The routes with a CIDR that
     * encompass the CIDR filter. For example, if you have 10.0.1.0/29 and
     * 10.0.1.0/31 routes in your route table and you specify supernet-of-match
     * as 10.0.1.0/30, then the result returns 10.0.1.0/29.
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
     * <code>transit-gateway-route-destination-cidr-block</code> - The CIDR
     * range.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of route (<code>active</code> |
     * <code>blackhole</code>).
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
     *            <code>attachment.transit-gateway-attachment-id</code> - The id
     *            of the transit gateway attachment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.resource-id</code> - The resource id of the
     *            transit gateway attachment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route-search.exact-match</code> - The exact match of the
     *            specified filter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route-search.longest-prefix-match</code> - The longest
     *            prefix that matches the route.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route-search.subnet-of-match</code> - The routes with a
     *            subnet that match the specified CIDR filter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route-search.supernet-of-match</code> - The routes with
     *            a CIDR that encompass the CIDR filter. For example, if you
     *            have 10.0.1.0/29 and 10.0.1.0/31 routes in your route table
     *            and you specify supernet-of-match as 10.0.1.0/30, then the
     *            result returns 10.0.1.0/29.
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
     *            <code>transit-gateway-route-destination-cidr-block</code> -
     *            The CIDR range.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>type</code> - The type of route (<code>active</code> |
     *            <code>blackhole</code>).
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
     * <code>attachment.transit-gateway-attachment-id</code> - The id of the
     * transit gateway attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.resource-id</code> - The resource id of the transit
     * gateway attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.exact-match</code> - The exact match of the specified
     * filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.longest-prefix-match</code> - The longest prefix that
     * matches the route.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.subnet-of-match</code> - The routes with a subnet that
     * match the specified CIDR filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.supernet-of-match</code> - The routes with a CIDR that
     * encompass the CIDR filter. For example, if you have 10.0.1.0/29 and
     * 10.0.1.0/31 routes in your route table and you specify supernet-of-match
     * as 10.0.1.0/30, then the result returns 10.0.1.0/29.
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
     * <code>transit-gateway-route-destination-cidr-block</code> - The CIDR
     * range.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of route (<code>active</code> |
     * <code>blackhole</code>).
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
     *            <code>attachment.transit-gateway-attachment-id</code> - The id
     *            of the transit gateway attachment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.resource-id</code> - The resource id of the
     *            transit gateway attachment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route-search.exact-match</code> - The exact match of the
     *            specified filter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route-search.longest-prefix-match</code> - The longest
     *            prefix that matches the route.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route-search.subnet-of-match</code> - The routes with a
     *            subnet that match the specified CIDR filter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route-search.supernet-of-match</code> - The routes with
     *            a CIDR that encompass the CIDR filter. For example, if you
     *            have 10.0.1.0/29 and 10.0.1.0/31 routes in your route table
     *            and you specify supernet-of-match as 10.0.1.0/30, then the
     *            result returns 10.0.1.0/29.
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
     *            <code>transit-gateway-route-destination-cidr-block</code> -
     *            The CIDR range.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>type</code> - The type of route (<code>active</code> |
     *            <code>blackhole</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTransitGatewayRoutesRequest withFilters(Filter... filters) {
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
     * <code>attachment.transit-gateway-attachment-id</code> - The id of the
     * transit gateway attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.resource-id</code> - The resource id of the transit
     * gateway attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.exact-match</code> - The exact match of the specified
     * filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.longest-prefix-match</code> - The longest prefix that
     * matches the route.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.subnet-of-match</code> - The routes with a subnet that
     * match the specified CIDR filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.supernet-of-match</code> - The routes with a CIDR that
     * encompass the CIDR filter. For example, if you have 10.0.1.0/29 and
     * 10.0.1.0/31 routes in your route table and you specify supernet-of-match
     * as 10.0.1.0/30, then the result returns 10.0.1.0/29.
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
     * <code>transit-gateway-route-destination-cidr-block</code> - The CIDR
     * range.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of route (<code>active</code> |
     * <code>blackhole</code>).
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
     *            <code>attachment.transit-gateway-attachment-id</code> - The id
     *            of the transit gateway attachment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.resource-id</code> - The resource id of the
     *            transit gateway attachment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route-search.exact-match</code> - The exact match of the
     *            specified filter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route-search.longest-prefix-match</code> - The longest
     *            prefix that matches the route.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route-search.subnet-of-match</code> - The routes with a
     *            subnet that match the specified CIDR filter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route-search.supernet-of-match</code> - The routes with
     *            a CIDR that encompass the CIDR filter. For example, if you
     *            have 10.0.1.0/29 and 10.0.1.0/31 routes in your route table
     *            and you specify supernet-of-match as 10.0.1.0/30, then the
     *            result returns 10.0.1.0/29.
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
     *            <code>transit-gateway-route-destination-cidr-block</code> -
     *            The CIDR range.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>type</code> - The type of route (<code>active</code> |
     *            <code>blackhole</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTransitGatewayRoutesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     *
     * @return <p>
     *         The name of the S3 bucket.
     *         </p>
     */
    public String getS3Bucket() {
        return s3Bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     *
     * @param s3Bucket <p>
     *            The name of the S3 bucket.
     *            </p>
     */
    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Bucket <p>
     *            The name of the S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTransitGatewayRoutesRequest withS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
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
    public ExportTransitGatewayRoutesRequest withDryRun(Boolean dryRun) {
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
        if (getTransitGatewayRouteTableId() != null)
            sb.append("TransitGatewayRouteTableId: " + getTransitGatewayRouteTableId() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getS3Bucket() != null)
            sb.append("S3Bucket: " + getS3Bucket() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTransitGatewayRouteTableId() == null) ? 0 : getTransitGatewayRouteTableId()
                        .hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportTransitGatewayRoutesRequest == false)
            return false;
        ExportTransitGatewayRoutesRequest other = (ExportTransitGatewayRoutesRequest) obj;

        if (other.getTransitGatewayRouteTableId() == null
                ^ this.getTransitGatewayRouteTableId() == null)
            return false;
        if (other.getTransitGatewayRouteTableId() != null
                && other.getTransitGatewayRouteTableId().equals(
                        this.getTransitGatewayRouteTableId()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
