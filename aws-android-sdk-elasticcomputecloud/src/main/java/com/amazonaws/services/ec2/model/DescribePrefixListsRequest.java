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
 * Describes available AWS services in a prefix list format, which includes the
 * prefix list name and prefix list ID of the service and the IP address range
 * for the service. A prefix list ID is required for creating an outbound
 * security group rule that allows traffic from a VPC to access an AWS service
 * through a gateway VPC endpoint. Currently, the services that support this
 * action are Amazon S3 and Amazon DynamoDB.
 * </p>
 */
public class DescribePrefixListsRequest extends AmazonWebServiceRequest implements Serializable {
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
     * <code>prefix-list-id</code>: The ID of a prefix list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>prefix-list-name</code>: The name of a prefix list.
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
     * One or more prefix list IDs.
     * </p>
     */
    private java.util.List<String> prefixListIds;

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
    public DescribePrefixListsRequest withDryRun(Boolean dryRun) {
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
     * <code>prefix-list-id</code>: The ID of a prefix list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>prefix-list-name</code>: The name of a prefix list.
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
     *         <code>prefix-list-id</code>: The ID of a prefix list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>prefix-list-name</code>: The name of a prefix list.
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
     * <code>prefix-list-id</code>: The ID of a prefix list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>prefix-list-name</code>: The name of a prefix list.
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
     *            <code>prefix-list-id</code>: The ID of a prefix list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>prefix-list-name</code>: The name of a prefix list.
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
     * <code>prefix-list-id</code>: The ID of a prefix list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>prefix-list-name</code>: The name of a prefix list.
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
     *            <code>prefix-list-id</code>: The ID of a prefix list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>prefix-list-name</code>: The name of a prefix list.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePrefixListsRequest withFilters(Filter... filters) {
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
     * <code>prefix-list-id</code>: The ID of a prefix list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>prefix-list-name</code>: The name of a prefix list.
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
     *            <code>prefix-list-id</code>: The ID of a prefix list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>prefix-list-name</code>: The name of a prefix list.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePrefixListsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
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
     *
     * @param maxResults <p>
     *            The maximum number of results to return with a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>nextToken</code> value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePrefixListsRequest withMaxResults(Integer maxResults) {
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
    public DescribePrefixListsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * One or more prefix list IDs.
     * </p>
     *
     * @return <p>
     *         One or more prefix list IDs.
     *         </p>
     */
    public java.util.List<String> getPrefixListIds() {
        return prefixListIds;
    }

    /**
     * <p>
     * One or more prefix list IDs.
     * </p>
     *
     * @param prefixListIds <p>
     *            One or more prefix list IDs.
     *            </p>
     */
    public void setPrefixListIds(java.util.Collection<String> prefixListIds) {
        if (prefixListIds == null) {
            this.prefixListIds = null;
            return;
        }

        this.prefixListIds = new java.util.ArrayList<String>(prefixListIds);
    }

    /**
     * <p>
     * One or more prefix list IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefixListIds <p>
     *            One or more prefix list IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePrefixListsRequest withPrefixListIds(String... prefixListIds) {
        if (getPrefixListIds() == null) {
            this.prefixListIds = new java.util.ArrayList<String>(prefixListIds.length);
        }
        for (String value : prefixListIds) {
            this.prefixListIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more prefix list IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefixListIds <p>
     *            One or more prefix list IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePrefixListsRequest withPrefixListIds(java.util.Collection<String> prefixListIds) {
        setPrefixListIds(prefixListIds);
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
            sb.append("NextToken: " + getNextToken() + ",");
        if (getPrefixListIds() != null)
            sb.append("PrefixListIds: " + getPrefixListIds());
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
        hashCode = prime * hashCode
                + ((getPrefixListIds() == null) ? 0 : getPrefixListIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePrefixListsRequest == false)
            return false;
        DescribePrefixListsRequest other = (DescribePrefixListsRequest) obj;

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
        if (other.getPrefixListIds() == null ^ this.getPrefixListIds() == null)
            return false;
        if (other.getPrefixListIds() != null
                && other.getPrefixListIds().equals(this.getPrefixListIds()) == false)
            return false;
        return true;
    }
}
