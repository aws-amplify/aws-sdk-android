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
 * Searches for routes in the specified transit gateway route table.
 * </p>
 */
public class SearchTransitGatewayRoutesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the transit gateway route table.
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
     * <code>attachment.transit-gateway-attachment-id</code>- The id of the
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
     * <code>attachment.resource-type</code> - The attachment resource type (
     * <code>vpc</code> | <code>vpn</code>).
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
     * <code>state</code> - The state of the route (<code>active</code> |
     * <code>blackhole</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of route (<code>propagated</code> |
     * <code>static</code>).
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The maximum number of routes to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     */
    private Integer maxResults;

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
     * The ID of the transit gateway route table.
     * </p>
     *
     * @return <p>
     *         The ID of the transit gateway route table.
     *         </p>
     */
    public String getTransitGatewayRouteTableId() {
        return transitGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     *
     * @param transitGatewayRouteTableId <p>
     *            The ID of the transit gateway route table.
     *            </p>
     */
    public void setTransitGatewayRouteTableId(String transitGatewayRouteTableId) {
        this.transitGatewayRouteTableId = transitGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayRouteTableId <p>
     *            The ID of the transit gateway route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchTransitGatewayRoutesRequest withTransitGatewayRouteTableId(
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
     * <code>attachment.transit-gateway-attachment-id</code>- The id of the
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
     * <code>attachment.resource-type</code> - The attachment resource type (
     * <code>vpc</code> | <code>vpn</code>).
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
     * <code>state</code> - The state of the route (<code>active</code> |
     * <code>blackhole</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of route (<code>propagated</code> |
     * <code>static</code>).
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
     *         <code>attachment.transit-gateway-attachment-id</code>- The id of
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
     *         <code>attachment.resource-type</code> - The attachment resource
     *         type (<code>vpc</code> | <code>vpn</code>).
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
     *         <code>state</code> - The state of the route (<code>active</code>
     *         | <code>blackhole</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>type</code> - The type of route (<code>propagated</code> |
     *         <code>static</code>).
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
     * <code>attachment.transit-gateway-attachment-id</code>- The id of the
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
     * <code>attachment.resource-type</code> - The attachment resource type (
     * <code>vpc</code> | <code>vpn</code>).
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
     * <code>state</code> - The state of the route (<code>active</code> |
     * <code>blackhole</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of route (<code>propagated</code> |
     * <code>static</code>).
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
     *            <code>attachment.transit-gateway-attachment-id</code>- The id
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
     *            <code>attachment.resource-type</code> - The attachment
     *            resource type (<code>vpc</code> | <code>vpn</code>).
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
     *            <code>state</code> - The state of the route (
     *            <code>active</code> | <code>blackhole</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>type</code> - The type of route (<code>propagated</code>
     *            | <code>static</code>).
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
     * <code>attachment.transit-gateway-attachment-id</code>- The id of the
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
     * <code>attachment.resource-type</code> - The attachment resource type (
     * <code>vpc</code> | <code>vpn</code>).
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
     * <code>state</code> - The state of the route (<code>active</code> |
     * <code>blackhole</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of route (<code>propagated</code> |
     * <code>static</code>).
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
     *            <code>attachment.transit-gateway-attachment-id</code>- The id
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
     *            <code>attachment.resource-type</code> - The attachment
     *            resource type (<code>vpc</code> | <code>vpn</code>).
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
     *            <code>state</code> - The state of the route (
     *            <code>active</code> | <code>blackhole</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>type</code> - The type of route (<code>propagated</code>
     *            | <code>static</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchTransitGatewayRoutesRequest withFilters(Filter... filters) {
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
     * <code>attachment.transit-gateway-attachment-id</code>- The id of the
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
     * <code>attachment.resource-type</code> - The attachment resource type (
     * <code>vpc</code> | <code>vpn</code>).
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
     * <code>state</code> - The state of the route (<code>active</code> |
     * <code>blackhole</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of route (<code>propagated</code> |
     * <code>static</code>).
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
     *            <code>attachment.transit-gateway-attachment-id</code>- The id
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
     *            <code>attachment.resource-type</code> - The attachment
     *            resource type (<code>vpc</code> | <code>vpn</code>).
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
     *            <code>state</code> - The state of the route (
     *            <code>active</code> | <code>blackhole</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>type</code> - The type of route (<code>propagated</code>
     *            | <code>static</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchTransitGatewayRoutesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of routes to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     *
     * @return <p>
     *         The maximum number of routes to return.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of routes to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of routes to return.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of routes to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of routes to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchTransitGatewayRoutesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
    public SearchTransitGatewayRoutesRequest withDryRun(Boolean dryRun) {
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
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
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
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchTransitGatewayRoutesRequest == false)
            return false;
        SearchTransitGatewayRoutesRequest other = (SearchTransitGatewayRoutesRequest) obj;

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
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
