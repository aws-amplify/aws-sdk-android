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
 * Describes one or more transit gateway multicast domains.
 * </p>
 */
public class DescribeTransitGatewayMulticastDomainsRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     */
    private java.util.List<String> transitGatewayMulticastDomainIds;

    /**
     * <p>
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>state</code> - The state of the transit gateway multicast domain.
     * Valid values are <code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of the transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-multicast-domain-id</code> - The ID of the transit
     * gateway multicast domain.
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
     * The ID of the transit gateway multicast domain.
     * </p>
     *
     * @return <p>
     *         The ID of the transit gateway multicast domain.
     *         </p>
     */
    public java.util.List<String> getTransitGatewayMulticastDomainIds() {
        return transitGatewayMulticastDomainIds;
    }

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     *
     * @param transitGatewayMulticastDomainIds <p>
     *            The ID of the transit gateway multicast domain.
     *            </p>
     */
    public void setTransitGatewayMulticastDomainIds(
            java.util.Collection<String> transitGatewayMulticastDomainIds) {
        if (transitGatewayMulticastDomainIds == null) {
            this.transitGatewayMulticastDomainIds = null;
            return;
        }

        this.transitGatewayMulticastDomainIds = new java.util.ArrayList<String>(
                transitGatewayMulticastDomainIds);
    }

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayMulticastDomainIds <p>
     *            The ID of the transit gateway multicast domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTransitGatewayMulticastDomainsRequest withTransitGatewayMulticastDomainIds(
            String... transitGatewayMulticastDomainIds) {
        if (getTransitGatewayMulticastDomainIds() == null) {
            this.transitGatewayMulticastDomainIds = new java.util.ArrayList<String>(
                    transitGatewayMulticastDomainIds.length);
        }
        for (String value : transitGatewayMulticastDomainIds) {
            this.transitGatewayMulticastDomainIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayMulticastDomainIds <p>
     *            The ID of the transit gateway multicast domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTransitGatewayMulticastDomainsRequest withTransitGatewayMulticastDomainIds(
            java.util.Collection<String> transitGatewayMulticastDomainIds) {
        setTransitGatewayMulticastDomainIds(transitGatewayMulticastDomainIds);
        return this;
    }

    /**
     * <p>
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>state</code> - The state of the transit gateway multicast domain.
     * Valid values are <code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of the transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-multicast-domain-id</code> - The ID of the transit
     * gateway multicast domain.
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
     *         <code>state</code> - The state of the transit gateway multicast
     *         domain. Valid values are <code>pending</code> |
     *         <code>available</code> | <code>deleting</code> |
     *         <code>deleted</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>transit-gateway-id</code> - The ID of the transit gateway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>transit-gateway-multicast-domain-id</code> - The ID of the
     *         transit gateway multicast domain.
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
     * <code>state</code> - The state of the transit gateway multicast domain.
     * Valid values are <code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of the transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-multicast-domain-id</code> - The ID of the transit
     * gateway multicast domain.
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
     *            <code>state</code> - The state of the transit gateway
     *            multicast domain. Valid values are <code>pending</code> |
     *            <code>available</code> | <code>deleting</code> |
     *            <code>deleted</code>.
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
     *            <code>transit-gateway-multicast-domain-id</code> - The ID of
     *            the transit gateway multicast domain.
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
     * <code>state</code> - The state of the transit gateway multicast domain.
     * Valid values are <code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of the transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-multicast-domain-id</code> - The ID of the transit
     * gateway multicast domain.
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
     *            <code>state</code> - The state of the transit gateway
     *            multicast domain. Valid values are <code>pending</code> |
     *            <code>available</code> | <code>deleting</code> |
     *            <code>deleted</code>.
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
     *            <code>transit-gateway-multicast-domain-id</code> - The ID of
     *            the transit gateway multicast domain.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTransitGatewayMulticastDomainsRequest withFilters(Filter... filters) {
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
     * <code>state</code> - The state of the transit gateway multicast domain.
     * Valid values are <code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of the transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-multicast-domain-id</code> - The ID of the transit
     * gateway multicast domain.
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
     *            <code>state</code> - The state of the transit gateway
     *            multicast domain. Valid values are <code>pending</code> |
     *            <code>available</code> | <code>deleting</code> |
     *            <code>deleted</code>.
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
     *            <code>transit-gateway-multicast-domain-id</code> - The ID of
     *            the transit gateway multicast domain.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTransitGatewayMulticastDomainsRequest withFilters(
            java.util.Collection<Filter> filters) {
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
    public DescribeTransitGatewayMulticastDomainsRequest withMaxResults(Integer maxResults) {
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
    public DescribeTransitGatewayMulticastDomainsRequest withNextToken(String nextToken) {
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
    public DescribeTransitGatewayMulticastDomainsRequest withDryRun(Boolean dryRun) {
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
        if (getTransitGatewayMulticastDomainIds() != null)
            sb.append("TransitGatewayMulticastDomainIds: " + getTransitGatewayMulticastDomainIds()
                    + ",");
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
                + ((getTransitGatewayMulticastDomainIds() == null) ? 0
                        : getTransitGatewayMulticastDomainIds().hashCode());
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

        if (obj instanceof DescribeTransitGatewayMulticastDomainsRequest == false)
            return false;
        DescribeTransitGatewayMulticastDomainsRequest other = (DescribeTransitGatewayMulticastDomainsRequest) obj;

        if (other.getTransitGatewayMulticastDomainIds() == null
                ^ this.getTransitGatewayMulticastDomainIds() == null)
            return false;
        if (other.getTransitGatewayMulticastDomainIds() != null
                && other.getTransitGatewayMulticastDomainIds().equals(
                        this.getTransitGatewayMulticastDomainIds()) == false)
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
