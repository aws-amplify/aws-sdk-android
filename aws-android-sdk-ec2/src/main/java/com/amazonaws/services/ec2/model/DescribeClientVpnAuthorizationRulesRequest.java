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
 * Describes the authorization rules for a specified Client VPN endpoint.
 * </p>
 */
public class DescribeClientVpnAuthorizationRulesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     */
    private String clientVpnEndpointId;

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
     * The token to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>description</code> - The description of the authorization rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destination-cidr</code> - The CIDR of the network to which the
     * authorization rule applies.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of the Active Directory group to which the
     * authorization rule grants access.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * nextToken value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     *
     * @return <p>
     *         The ID of the Client VPN endpoint.
     *         </p>
     */
    public String getClientVpnEndpointId() {
        return clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     *
     * @param clientVpnEndpointId <p>
     *            The ID of the Client VPN endpoint.
     *            </p>
     */
    public void setClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientVpnEndpointId <p>
     *            The ID of the Client VPN endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClientVpnAuthorizationRulesRequest withClientVpnEndpointId(
            String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
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
    public DescribeClientVpnAuthorizationRulesRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
    public DescribeClientVpnAuthorizationRulesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>description</code> - The description of the authorization rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destination-cidr</code> - The CIDR of the network to which the
     * authorization rule applies.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of the Active Directory group to which the
     * authorization rule grants access.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         One or more filters. Filter names and values are case-sensitive.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>description</code> - The description of the authorization
     *         rule.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>destination-cidr</code> - The CIDR of the network to which
     *         the authorization rule applies.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>group-id</code> - The ID of the Active Directory group to
     *         which the authorization rule grants access.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>description</code> - The description of the authorization rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destination-cidr</code> - The CIDR of the network to which the
     * authorization rule applies.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of the Active Directory group to which the
     * authorization rule grants access.
     * </p>
     * </li>
     * </ul>
     *
     * @param filters <p>
     *            One or more filters. Filter names and values are
     *            case-sensitive.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>description</code> - The description of the
     *            authorization rule.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>destination-cidr</code> - The CIDR of the network to
     *            which the authorization rule applies.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>group-id</code> - The ID of the Active Directory group
     *            to which the authorization rule grants access.
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
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>description</code> - The description of the authorization rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destination-cidr</code> - The CIDR of the network to which the
     * authorization rule applies.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of the Active Directory group to which the
     * authorization rule grants access.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more filters. Filter names and values are
     *            case-sensitive.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>description</code> - The description of the
     *            authorization rule.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>destination-cidr</code> - The CIDR of the network to
     *            which the authorization rule applies.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>group-id</code> - The ID of the Active Directory group
     *            to which the authorization rule grants access.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClientVpnAuthorizationRulesRequest withFilters(Filter... filters) {
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
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>description</code> - The description of the authorization rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destination-cidr</code> - The CIDR of the network to which the
     * authorization rule applies.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of the Active Directory group to which the
     * authorization rule grants access.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more filters. Filter names and values are
     *            case-sensitive.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>description</code> - The description of the
     *            authorization rule.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>destination-cidr</code> - The CIDR of the network to
     *            which the authorization rule applies.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>group-id</code> - The ID of the Active Directory group
     *            to which the authorization rule grants access.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClientVpnAuthorizationRulesRequest withFilters(
            java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * nextToken value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     *
     * @return <p>
     *         The maximum number of results to return for the request in a
     *         single page. The remaining results can be seen by sending another
     *         request with the nextToken value.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * nextToken value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return for the request in a
     *            single page. The remaining results can be seen by sending
     *            another request with the nextToken value.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * nextToken value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return for the request in a
     *            single page. The remaining results can be seen by sending
     *            another request with the nextToken value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClientVpnAuthorizationRulesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getClientVpnEndpointId() != null)
            sb.append("ClientVpnEndpointId: " + getClientVpnEndpointId() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClientVpnAuthorizationRulesRequest == false)
            return false;
        DescribeClientVpnAuthorizationRulesRequest other = (DescribeClientVpnAuthorizationRulesRequest) obj;

        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null
                && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
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
        return true;
    }
}
