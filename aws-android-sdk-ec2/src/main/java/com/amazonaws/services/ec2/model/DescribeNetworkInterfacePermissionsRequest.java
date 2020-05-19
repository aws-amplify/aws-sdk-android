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
 * Describes the permissions for your network interfaces.
 * </p>
 */
public class DescribeNetworkInterfacePermissionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * One or more network interface permission IDs.
     * </p>
     */
    private java.util.List<String> networkInterfacePermissionIds;

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>network-interface-permission.network-interface-permission-id</code>
     * - The ID of the permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.network-interface-id</code> - The ID
     * of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.aws-account-id</code> - The AWS
     * account ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.aws-service</code> - The AWS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.permission</code> - The type of
     * permission (<code>INSTANCE-ATTACH</code> | <code>EIP-ASSOCIATE</code>).
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value. If this parameter is not specified, up to
     * 50 results are returned by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 255<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * One or more network interface permission IDs.
     * </p>
     *
     * @return <p>
     *         One or more network interface permission IDs.
     *         </p>
     */
    public java.util.List<String> getNetworkInterfacePermissionIds() {
        return networkInterfacePermissionIds;
    }

    /**
     * <p>
     * One or more network interface permission IDs.
     * </p>
     *
     * @param networkInterfacePermissionIds <p>
     *            One or more network interface permission IDs.
     *            </p>
     */
    public void setNetworkInterfacePermissionIds(
            java.util.Collection<String> networkInterfacePermissionIds) {
        if (networkInterfacePermissionIds == null) {
            this.networkInterfacePermissionIds = null;
            return;
        }

        this.networkInterfacePermissionIds = new java.util.ArrayList<String>(
                networkInterfacePermissionIds);
    }

    /**
     * <p>
     * One or more network interface permission IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfacePermissionIds <p>
     *            One or more network interface permission IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNetworkInterfacePermissionsRequest withNetworkInterfacePermissionIds(
            String... networkInterfacePermissionIds) {
        if (getNetworkInterfacePermissionIds() == null) {
            this.networkInterfacePermissionIds = new java.util.ArrayList<String>(
                    networkInterfacePermissionIds.length);
        }
        for (String value : networkInterfacePermissionIds) {
            this.networkInterfacePermissionIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more network interface permission IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfacePermissionIds <p>
     *            One or more network interface permission IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNetworkInterfacePermissionsRequest withNetworkInterfacePermissionIds(
            java.util.Collection<String> networkInterfacePermissionIds) {
        setNetworkInterfacePermissionIds(networkInterfacePermissionIds);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>network-interface-permission.network-interface-permission-id</code>
     * - The ID of the permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.network-interface-id</code> - The ID
     * of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.aws-account-id</code> - The AWS
     * account ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.aws-service</code> - The AWS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.permission</code> - The type of
     * permission (<code>INSTANCE-ATTACH</code> | <code>EIP-ASSOCIATE</code>).
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
     *         <code>network-interface-permission.network-interface-permission-id</code>
     *         - The ID of the permission.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface-permission.network-interface-id</code> -
     *         The ID of the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface-permission.aws-account-id</code> - The
     *         AWS account ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface-permission.aws-service</code> - The AWS
     *         service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface-permission.permission</code> - The type
     *         of permission (<code>INSTANCE-ATTACH</code> |
     *         <code>EIP-ASSOCIATE</code>).
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
     * <code>network-interface-permission.network-interface-permission-id</code>
     * - The ID of the permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.network-interface-id</code> - The ID
     * of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.aws-account-id</code> - The AWS
     * account ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.aws-service</code> - The AWS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.permission</code> - The type of
     * permission (<code>INSTANCE-ATTACH</code> | <code>EIP-ASSOCIATE</code>).
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
     *            <code>network-interface-permission.network-interface-permission-id</code>
     *            - The ID of the permission.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface-permission.network-interface-id</code>
     *            - The ID of the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface-permission.aws-account-id</code> - The
     *            AWS account ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface-permission.aws-service</code> - The
     *            AWS service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface-permission.permission</code> - The
     *            type of permission (<code>INSTANCE-ATTACH</code> |
     *            <code>EIP-ASSOCIATE</code>).
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
     * <code>network-interface-permission.network-interface-permission-id</code>
     * - The ID of the permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.network-interface-id</code> - The ID
     * of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.aws-account-id</code> - The AWS
     * account ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.aws-service</code> - The AWS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.permission</code> - The type of
     * permission (<code>INSTANCE-ATTACH</code> | <code>EIP-ASSOCIATE</code>).
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
     *            <code>network-interface-permission.network-interface-permission-id</code>
     *            - The ID of the permission.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface-permission.network-interface-id</code>
     *            - The ID of the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface-permission.aws-account-id</code> - The
     *            AWS account ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface-permission.aws-service</code> - The
     *            AWS service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface-permission.permission</code> - The
     *            type of permission (<code>INSTANCE-ATTACH</code> |
     *            <code>EIP-ASSOCIATE</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNetworkInterfacePermissionsRequest withFilters(Filter... filters) {
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
     * <code>network-interface-permission.network-interface-permission-id</code>
     * - The ID of the permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.network-interface-id</code> - The ID
     * of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.aws-account-id</code> - The AWS
     * account ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.aws-service</code> - The AWS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.permission</code> - The type of
     * permission (<code>INSTANCE-ATTACH</code> | <code>EIP-ASSOCIATE</code>).
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
     *            <code>network-interface-permission.network-interface-permission-id</code>
     *            - The ID of the permission.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface-permission.network-interface-id</code>
     *            - The ID of the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface-permission.aws-account-id</code> - The
     *            AWS account ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface-permission.aws-service</code> - The
     *            AWS service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface-permission.permission</code> - The
     *            type of permission (<code>INSTANCE-ATTACH</code> |
     *            <code>EIP-ASSOCIATE</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNetworkInterfacePermissionsRequest withFilters(
            java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     *
     * @return <p>
     *         The token to request the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to request the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to request the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNetworkInterfacePermissionsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value. If this parameter is not specified, up to
     * 50 results are returned by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 255<br/>
     *
     * @return <p>
     *         The maximum number of results to return in a single call. To
     *         retrieve the remaining results, make another call with the
     *         returned <code>NextToken</code> value. If this parameter is not
     *         specified, up to 50 results are returned by default.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value. If this parameter is not specified, up to
     * 50 results are returned by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 255<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>NextToken</code> value. If this parameter is
     *            not specified, up to 50 results are returned by default.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value. If this parameter is not specified, up to
     * 50 results are returned by default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 255<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>NextToken</code> value. If this parameter is
     *            not specified, up to 50 results are returned by default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNetworkInterfacePermissionsRequest withMaxResults(Integer maxResults) {
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
        if (getNetworkInterfacePermissionIds() != null)
            sb.append("NetworkInterfacePermissionIds: " + getNetworkInterfacePermissionIds() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getNetworkInterfacePermissionIds() == null) ? 0
                        : getNetworkInterfacePermissionIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNetworkInterfacePermissionsRequest == false)
            return false;
        DescribeNetworkInterfacePermissionsRequest other = (DescribeNetworkInterfacePermissionsRequest) obj;

        if (other.getNetworkInterfacePermissionIds() == null
                ^ this.getNetworkInterfacePermissionIds() == null)
            return false;
        if (other.getNetworkInterfacePermissionIds() != null
                && other.getNetworkInterfacePermissionIds().equals(
                        this.getNetworkInterfacePermissionIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
