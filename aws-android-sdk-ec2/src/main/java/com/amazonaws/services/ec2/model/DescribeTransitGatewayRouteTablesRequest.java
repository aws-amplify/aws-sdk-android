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
 * Describes one or more transit gateway route tables. By default, all transit
 * gateway route tables are described. Alternatively, you can filter the
 * results.
 * </p>
 */
public class DescribeTransitGatewayRouteTablesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The IDs of the transit gateway route tables.
     * </p>
     */
    private java.util.List<String> transitGatewayRouteTableIds;

    /**
     * <p>
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default-association-route-table</code> - Indicates whether this is
     * the default association route table for the transit gateway (
     * <code>true</code> | <code>false</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default-propagation-route-table</code> - Indicates whether this is
     * the default propagation route table for the transit gateway (
     * <code>true</code> | <code>false</code>).
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
     * <li>
     * <p>
     * <code>transit-gateway-route-table-id</code> - The ID of the transit
     * gateway route table.
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
     * The IDs of the transit gateway route tables.
     * </p>
     *
     * @return <p>
     *         The IDs of the transit gateway route tables.
     *         </p>
     */
    public java.util.List<String> getTransitGatewayRouteTableIds() {
        return transitGatewayRouteTableIds;
    }

    /**
     * <p>
     * The IDs of the transit gateway route tables.
     * </p>
     *
     * @param transitGatewayRouteTableIds <p>
     *            The IDs of the transit gateway route tables.
     *            </p>
     */
    public void setTransitGatewayRouteTableIds(
            java.util.Collection<String> transitGatewayRouteTableIds) {
        if (transitGatewayRouteTableIds == null) {
            this.transitGatewayRouteTableIds = null;
            return;
        }

        this.transitGatewayRouteTableIds = new java.util.ArrayList<String>(
                transitGatewayRouteTableIds);
    }

    /**
     * <p>
     * The IDs of the transit gateway route tables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayRouteTableIds <p>
     *            The IDs of the transit gateway route tables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTransitGatewayRouteTablesRequest withTransitGatewayRouteTableIds(
            String... transitGatewayRouteTableIds) {
        if (getTransitGatewayRouteTableIds() == null) {
            this.transitGatewayRouteTableIds = new java.util.ArrayList<String>(
                    transitGatewayRouteTableIds.length);
        }
        for (String value : transitGatewayRouteTableIds) {
            this.transitGatewayRouteTableIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the transit gateway route tables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayRouteTableIds <p>
     *            The IDs of the transit gateway route tables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTransitGatewayRouteTablesRequest withTransitGatewayRouteTableIds(
            java.util.Collection<String> transitGatewayRouteTableIds) {
        setTransitGatewayRouteTableIds(transitGatewayRouteTableIds);
        return this;
    }

    /**
     * <p>
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default-association-route-table</code> - Indicates whether this is
     * the default association route table for the transit gateway (
     * <code>true</code> | <code>false</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default-propagation-route-table</code> - Indicates whether this is
     * the default propagation route table for the transit gateway (
     * <code>true</code> | <code>false</code>).
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
     * <li>
     * <p>
     * <code>transit-gateway-route-table-id</code> - The ID of the transit
     * gateway route table.
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
     *         <code>default-association-route-table</code> - Indicates whether
     *         this is the default association route table for the transit
     *         gateway (<code>true</code> | <code>false</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>default-propagation-route-table</code> - Indicates whether
     *         this is the default propagation route table for the transit
     *         gateway (<code>true</code> | <code>false</code>).
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
     *         <li>
     *         <p>
     *         <code>transit-gateway-route-table-id</code> - The ID of the
     *         transit gateway route table.
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
     * <code>default-association-route-table</code> - Indicates whether this is
     * the default association route table for the transit gateway (
     * <code>true</code> | <code>false</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default-propagation-route-table</code> - Indicates whether this is
     * the default propagation route table for the transit gateway (
     * <code>true</code> | <code>false</code>).
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
     * <li>
     * <p>
     * <code>transit-gateway-route-table-id</code> - The ID of the transit
     * gateway route table.
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
     *            <code>default-association-route-table</code> - Indicates
     *            whether this is the default association route table for the
     *            transit gateway (<code>true</code> | <code>false</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>default-propagation-route-table</code> - Indicates
     *            whether this is the default propagation route table for the
     *            transit gateway (<code>true</code> | <code>false</code>).
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
     *            <li>
     *            <p>
     *            <code>transit-gateway-route-table-id</code> - The ID of the
     *            transit gateway route table.
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
     * <code>default-association-route-table</code> - Indicates whether this is
     * the default association route table for the transit gateway (
     * <code>true</code> | <code>false</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default-propagation-route-table</code> - Indicates whether this is
     * the default propagation route table for the transit gateway (
     * <code>true</code> | <code>false</code>).
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
     * <li>
     * <p>
     * <code>transit-gateway-route-table-id</code> - The ID of the transit
     * gateway route table.
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
     *            <code>default-association-route-table</code> - Indicates
     *            whether this is the default association route table for the
     *            transit gateway (<code>true</code> | <code>false</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>default-propagation-route-table</code> - Indicates
     *            whether this is the default propagation route table for the
     *            transit gateway (<code>true</code> | <code>false</code>).
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
     *            <li>
     *            <p>
     *            <code>transit-gateway-route-table-id</code> - The ID of the
     *            transit gateway route table.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTransitGatewayRouteTablesRequest withFilters(Filter... filters) {
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
     * <code>default-association-route-table</code> - Indicates whether this is
     * the default association route table for the transit gateway (
     * <code>true</code> | <code>false</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default-propagation-route-table</code> - Indicates whether this is
     * the default propagation route table for the transit gateway (
     * <code>true</code> | <code>false</code>).
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
     * <li>
     * <p>
     * <code>transit-gateway-route-table-id</code> - The ID of the transit
     * gateway route table.
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
     *            <code>default-association-route-table</code> - Indicates
     *            whether this is the default association route table for the
     *            transit gateway (<code>true</code> | <code>false</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>default-propagation-route-table</code> - Indicates
     *            whether this is the default propagation route table for the
     *            transit gateway (<code>true</code> | <code>false</code>).
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
     *            <li>
     *            <p>
     *            <code>transit-gateway-route-table-id</code> - The ID of the
     *            transit gateway route table.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTransitGatewayRouteTablesRequest withFilters(java.util.Collection<Filter> filters) {
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
    public DescribeTransitGatewayRouteTablesRequest withMaxResults(Integer maxResults) {
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
    public DescribeTransitGatewayRouteTablesRequest withNextToken(String nextToken) {
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
    public DescribeTransitGatewayRouteTablesRequest withDryRun(Boolean dryRun) {
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
        if (getTransitGatewayRouteTableIds() != null)
            sb.append("TransitGatewayRouteTableIds: " + getTransitGatewayRouteTableIds() + ",");
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

        hashCode = prime
                * hashCode
                + ((getTransitGatewayRouteTableIds() == null) ? 0
                        : getTransitGatewayRouteTableIds().hashCode());
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

        if (obj instanceof DescribeTransitGatewayRouteTablesRequest == false)
            return false;
        DescribeTransitGatewayRouteTablesRequest other = (DescribeTransitGatewayRouteTablesRequest) obj;

        if (other.getTransitGatewayRouteTableIds() == null
                ^ this.getTransitGatewayRouteTableIds() == null)
            return false;
        if (other.getTransitGatewayRouteTableIds() != null
                && other.getTransitGatewayRouteTableIds().equals(
                        this.getTransitGatewayRouteTableIds()) == false)
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
