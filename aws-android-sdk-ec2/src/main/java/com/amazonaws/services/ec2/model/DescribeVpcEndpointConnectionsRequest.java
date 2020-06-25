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
 * Describes the VPC endpoint connections to your VPC endpoint services,
 * including any endpoints that are pending your acceptance.
 * </p>
 */
public class DescribeVpcEndpointConnectionsRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * <code>service-id</code> - The ID of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-endpoint-owner</code> - The AWS account number of the owner of
     * the endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-endpoint-state</code> - The state of the endpoint (
     * <code>pendingAcceptance</code> | <code>pending</code> |
     * <code>available</code> | <code>deleting</code> | <code>deleted</code> |
     * <code>rejected</code> | <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-endpoint-id</code> - The ID of the endpoint.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results of the initial request can be seen by sending
     * another request with the returned <code>NextToken</code> value. This
     * value can be between 5 and 1,000; if <code>MaxResults</code> is given a
     * value larger than 1,000, only 1,000 results are returned.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token to retrieve the next page of results.
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
    public DescribeVpcEndpointConnectionsRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>service-id</code> - The ID of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-endpoint-owner</code> - The AWS account number of the owner of
     * the endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-endpoint-state</code> - The state of the endpoint (
     * <code>pendingAcceptance</code> | <code>pending</code> |
     * <code>available</code> | <code>deleting</code> | <code>deleted</code> |
     * <code>rejected</code> | <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-endpoint-id</code> - The ID of the endpoint.
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
     *         <code>service-id</code> - The ID of the service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vpc-endpoint-owner</code> - The AWS account number of the
     *         owner of the endpoint.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vpc-endpoint-state</code> - The state of the endpoint (
     *         <code>pendingAcceptance</code> | <code>pending</code> |
     *         <code>available</code> | <code>deleting</code> |
     *         <code>deleted</code> | <code>rejected</code> |
     *         <code>failed</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vpc-endpoint-id</code> - The ID of the endpoint.
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
     * <code>service-id</code> - The ID of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-endpoint-owner</code> - The AWS account number of the owner of
     * the endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-endpoint-state</code> - The state of the endpoint (
     * <code>pendingAcceptance</code> | <code>pending</code> |
     * <code>available</code> | <code>deleting</code> | <code>deleted</code> |
     * <code>rejected</code> | <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-endpoint-id</code> - The ID of the endpoint.
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
     *            <code>service-id</code> - The ID of the service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpc-endpoint-owner</code> - The AWS account number of
     *            the owner of the endpoint.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpc-endpoint-state</code> - The state of the endpoint (
     *            <code>pendingAcceptance</code> | <code>pending</code> |
     *            <code>available</code> | <code>deleting</code> |
     *            <code>deleted</code> | <code>rejected</code> |
     *            <code>failed</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpc-endpoint-id</code> - The ID of the endpoint.
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
     * <code>service-id</code> - The ID of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-endpoint-owner</code> - The AWS account number of the owner of
     * the endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-endpoint-state</code> - The state of the endpoint (
     * <code>pendingAcceptance</code> | <code>pending</code> |
     * <code>available</code> | <code>deleting</code> | <code>deleted</code> |
     * <code>rejected</code> | <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-endpoint-id</code> - The ID of the endpoint.
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
     *            <code>service-id</code> - The ID of the service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpc-endpoint-owner</code> - The AWS account number of
     *            the owner of the endpoint.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpc-endpoint-state</code> - The state of the endpoint (
     *            <code>pendingAcceptance</code> | <code>pending</code> |
     *            <code>available</code> | <code>deleting</code> |
     *            <code>deleted</code> | <code>rejected</code> |
     *            <code>failed</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpc-endpoint-id</code> - The ID of the endpoint.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcEndpointConnectionsRequest withFilters(Filter... filters) {
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
     * <code>service-id</code> - The ID of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-endpoint-owner</code> - The AWS account number of the owner of
     * the endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-endpoint-state</code> - The state of the endpoint (
     * <code>pendingAcceptance</code> | <code>pending</code> |
     * <code>available</code> | <code>deleting</code> | <code>deleted</code> |
     * <code>rejected</code> | <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-endpoint-id</code> - The ID of the endpoint.
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
     *            <code>service-id</code> - The ID of the service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpc-endpoint-owner</code> - The AWS account number of
     *            the owner of the endpoint.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpc-endpoint-state</code> - The state of the endpoint (
     *            <code>pendingAcceptance</code> | <code>pending</code> |
     *            <code>available</code> | <code>deleting</code> |
     *            <code>deleted</code> | <code>rejected</code> |
     *            <code>failed</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpc-endpoint-id</code> - The ID of the endpoint.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcEndpointConnectionsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results of the initial request can be seen by sending
     * another request with the returned <code>NextToken</code> value. This
     * value can be between 5 and 1,000; if <code>MaxResults</code> is given a
     * value larger than 1,000, only 1,000 results are returned.
     * </p>
     *
     * @return <p>
     *         The maximum number of results to return for the request in a
     *         single page. The remaining results of the initial request can be
     *         seen by sending another request with the returned
     *         <code>NextToken</code> value. This value can be between 5 and
     *         1,000; if <code>MaxResults</code> is given a value larger than
     *         1,000, only 1,000 results are returned.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results of the initial request can be seen by sending
     * another request with the returned <code>NextToken</code> value. This
     * value can be between 5 and 1,000; if <code>MaxResults</code> is given a
     * value larger than 1,000, only 1,000 results are returned.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of results to return for the request in a
     *            single page. The remaining results of the initial request can
     *            be seen by sending another request with the returned
     *            <code>NextToken</code> value. This value can be between 5 and
     *            1,000; if <code>MaxResults</code> is given a value larger than
     *            1,000, only 1,000 results are returned.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results of the initial request can be seen by sending
     * another request with the returned <code>NextToken</code> value. This
     * value can be between 5 and 1,000; if <code>MaxResults</code> is given a
     * value larger than 1,000, only 1,000 results are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of results to return for the request in a
     *            single page. The remaining results of the initial request can
     *            be seen by sending another request with the returned
     *            <code>NextToken</code> value. This value can be between 5 and
     *            1,000; if <code>MaxResults</code> is given a value larger than
     *            1,000, only 1,000 results are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcEndpointConnectionsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     *
     * @return <p>
     *         The token to retrieve the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to retrieve the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to retrieve the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcEndpointConnectionsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpcEndpointConnectionsRequest == false)
            return false;
        DescribeVpcEndpointConnectionsRequest other = (DescribeVpcEndpointConnectionsRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
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
        return true;
    }
}
