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
 * Describes the specified Dedicated Hosts or all your Dedicated Hosts.
 * </p>
 * <p>
 * The results describe only the Dedicated Hosts in the Region you're currently
 * using. All listed instances consume capacity on your Dedicated Host.
 * Dedicated Hosts that have recently been released are listed with the state
 * <code>released</code>.
 * </p>
 */
public class DescribeHostsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto-placement</code> - Whether auto-placement is enabled or
     * disabled (<code>on</code> | <code>off</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token that you provided when
     * you allocated the host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>host-reservation-id</code> - The ID of the reservation assigned to
     * this host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type size that the Dedicated
     * Host is configured to support.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The allocation state of the Dedicated Host (
     * <code>available</code> | <code>under-assessment</code> |
     * <code>permanent-failure</code> | <code>released</code> |
     * <code>released-permanent-failure</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filter;

    /**
     * <p>
     * The IDs of the Dedicated Hosts. The IDs are used for targeted instance
     * launches.
     * </p>
     */
    private java.util.List<String> hostIds;

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * returned <code>nextToken</code> value. This value can be between 5 and
     * 500. If <code>maxResults</code> is given a larger value than 500, you
     * receive an error.
     * </p>
     * <p>
     * You cannot specify this parameter and the host IDs parameter in the same
     * request.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto-placement</code> - Whether auto-placement is enabled or
     * disabled (<code>on</code> | <code>off</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token that you provided when
     * you allocated the host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>host-reservation-id</code> - The ID of the reservation assigned to
     * this host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type size that the Dedicated
     * Host is configured to support.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The allocation state of the Dedicated Host (
     * <code>available</code> | <code>under-assessment</code> |
     * <code>permanent-failure</code> | <code>released</code> |
     * <code>released-permanent-failure</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The filters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>auto-placement</code> - Whether auto-placement is enabled
     *         or disabled (<code>on</code> | <code>off</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone of the
     *         host.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>client-token</code> - The idempotency token that you
     *         provided when you allocated the host.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>host-reservation-id</code> - The ID of the reservation
     *         assigned to this host.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-type</code> - The instance type size that the
     *         Dedicated Host is configured to support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The allocation state of the Dedicated Host (
     *         <code>available</code> | <code>under-assessment</code> |
     *         <code>permanent-failure</code> | <code>released</code> |
     *         <code>released-permanent-failure</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-key</code> - The key of a tag assigned to the resource.
     *         Use this filter to find all resources assigned a tag with a
     *         specific key, regardless of the tag value.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilter() {
        return filter;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto-placement</code> - Whether auto-placement is enabled or
     * disabled (<code>on</code> | <code>off</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token that you provided when
     * you allocated the host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>host-reservation-id</code> - The ID of the reservation assigned to
     * this host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type size that the Dedicated
     * Host is configured to support.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The allocation state of the Dedicated Host (
     * <code>available</code> | <code>under-assessment</code> |
     * <code>permanent-failure</code> | <code>released</code> |
     * <code>released-permanent-failure</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     *
     * @param filter <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>auto-placement</code> - Whether auto-placement is
     *            enabled or disabled (<code>on</code> | <code>off</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone of the
     *            host.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>client-token</code> - The idempotency token that you
     *            provided when you allocated the host.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>host-reservation-id</code> - The ID of the reservation
     *            assigned to this host.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-type</code> - The instance type size that the
     *            Dedicated Host is configured to support.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The allocation state of the Dedicated
     *            Host (<code>available</code> | <code>under-assessment</code> |
     *            <code>permanent-failure</code> | <code>released</code> |
     *            <code>released-permanent-failure</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag-key</code> - The key of a tag assigned to the
     *            resource. Use this filter to find all resources assigned a tag
     *            with a specific key, regardless of the tag value.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFilter(java.util.Collection<Filter> filter) {
        if (filter == null) {
            this.filter = null;
            return;
        }

        this.filter = new java.util.ArrayList<Filter>(filter);
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto-placement</code> - Whether auto-placement is enabled or
     * disabled (<code>on</code> | <code>off</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token that you provided when
     * you allocated the host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>host-reservation-id</code> - The ID of the reservation assigned to
     * this host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type size that the Dedicated
     * Host is configured to support.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The allocation state of the Dedicated Host (
     * <code>available</code> | <code>under-assessment</code> |
     * <code>permanent-failure</code> | <code>released</code> |
     * <code>released-permanent-failure</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>auto-placement</code> - Whether auto-placement is
     *            enabled or disabled (<code>on</code> | <code>off</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone of the
     *            host.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>client-token</code> - The idempotency token that you
     *            provided when you allocated the host.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>host-reservation-id</code> - The ID of the reservation
     *            assigned to this host.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-type</code> - The instance type size that the
     *            Dedicated Host is configured to support.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The allocation state of the Dedicated
     *            Host (<code>available</code> | <code>under-assessment</code> |
     *            <code>permanent-failure</code> | <code>released</code> |
     *            <code>released-permanent-failure</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag-key</code> - The key of a tag assigned to the
     *            resource. Use this filter to find all resources assigned a tag
     *            with a specific key, regardless of the tag value.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHostsRequest withFilter(Filter... filter) {
        if (getFilter() == null) {
            this.filter = new java.util.ArrayList<Filter>(filter.length);
        }
        for (Filter value : filter) {
            this.filter.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto-placement</code> - Whether auto-placement is enabled or
     * disabled (<code>on</code> | <code>off</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token that you provided when
     * you allocated the host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>host-reservation-id</code> - The ID of the reservation assigned to
     * this host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type size that the Dedicated
     * Host is configured to support.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The allocation state of the Dedicated Host (
     * <code>available</code> | <code>under-assessment</code> |
     * <code>permanent-failure</code> | <code>released</code> |
     * <code>released-permanent-failure</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>auto-placement</code> - Whether auto-placement is
     *            enabled or disabled (<code>on</code> | <code>off</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone of the
     *            host.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>client-token</code> - The idempotency token that you
     *            provided when you allocated the host.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>host-reservation-id</code> - The ID of the reservation
     *            assigned to this host.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-type</code> - The instance type size that the
     *            Dedicated Host is configured to support.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The allocation state of the Dedicated
     *            Host (<code>available</code> | <code>under-assessment</code> |
     *            <code>permanent-failure</code> | <code>released</code> |
     *            <code>released-permanent-failure</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag-key</code> - The key of a tag assigned to the
     *            resource. Use this filter to find all resources assigned a tag
     *            with a specific key, regardless of the tag value.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHostsRequest withFilter(java.util.Collection<Filter> filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts. The IDs are used for targeted instance
     * launches.
     * </p>
     *
     * @return <p>
     *         The IDs of the Dedicated Hosts. The IDs are used for targeted
     *         instance launches.
     *         </p>
     */
    public java.util.List<String> getHostIds() {
        return hostIds;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts. The IDs are used for targeted instance
     * launches.
     * </p>
     *
     * @param hostIds <p>
     *            The IDs of the Dedicated Hosts. The IDs are used for targeted
     *            instance launches.
     *            </p>
     */
    public void setHostIds(java.util.Collection<String> hostIds) {
        if (hostIds == null) {
            this.hostIds = null;
            return;
        }

        this.hostIds = new java.util.ArrayList<String>(hostIds);
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts. The IDs are used for targeted instance
     * launches.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostIds <p>
     *            The IDs of the Dedicated Hosts. The IDs are used for targeted
     *            instance launches.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHostsRequest withHostIds(String... hostIds) {
        if (getHostIds() == null) {
            this.hostIds = new java.util.ArrayList<String>(hostIds.length);
        }
        for (String value : hostIds) {
            this.hostIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts. The IDs are used for targeted instance
     * launches.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostIds <p>
     *            The IDs of the Dedicated Hosts. The IDs are used for targeted
     *            instance launches.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHostsRequest withHostIds(java.util.Collection<String> hostIds) {
        setHostIds(hostIds);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * returned <code>nextToken</code> value. This value can be between 5 and
     * 500. If <code>maxResults</code> is given a larger value than 500, you
     * receive an error.
     * </p>
     * <p>
     * You cannot specify this parameter and the host IDs parameter in the same
     * request.
     * </p>
     *
     * @return <p>
     *         The maximum number of results to return for the request in a
     *         single page. The remaining results can be seen by sending another
     *         request with the returned <code>nextToken</code> value. This
     *         value can be between 5 and 500. If <code>maxResults</code> is
     *         given a larger value than 500, you receive an error.
     *         </p>
     *         <p>
     *         You cannot specify this parameter and the host IDs parameter in
     *         the same request.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * returned <code>nextToken</code> value. This value can be between 5 and
     * 500. If <code>maxResults</code> is given a larger value than 500, you
     * receive an error.
     * </p>
     * <p>
     * You cannot specify this parameter and the host IDs parameter in the same
     * request.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of results to return for the request in a
     *            single page. The remaining results can be seen by sending
     *            another request with the returned <code>nextToken</code>
     *            value. This value can be between 5 and 500. If
     *            <code>maxResults</code> is given a larger value than 500, you
     *            receive an error.
     *            </p>
     *            <p>
     *            You cannot specify this parameter and the host IDs parameter
     *            in the same request.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * returned <code>nextToken</code> value. This value can be between 5 and
     * 500. If <code>maxResults</code> is given a larger value than 500, you
     * receive an error.
     * </p>
     * <p>
     * You cannot specify this parameter and the host IDs parameter in the same
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of results to return for the request in a
     *            single page. The remaining results can be seen by sending
     *            another request with the returned <code>nextToken</code>
     *            value. This value can be between 5 and 500. If
     *            <code>maxResults</code> is given a larger value than 500, you
     *            receive an error.
     *            </p>
     *            <p>
     *            You cannot specify this parameter and the host IDs parameter
     *            in the same request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHostsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHostsRequest withNextToken(String nextToken) {
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
        if (getFilter() != null)
            sb.append("Filter: " + getFilter() + ",");
        if (getHostIds() != null)
            sb.append("HostIds: " + getHostIds() + ",");
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

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getHostIds() == null) ? 0 : getHostIds().hashCode());
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

        if (obj instanceof DescribeHostsRequest == false)
            return false;
        DescribeHostsRequest other = (DescribeHostsRequest) obj;

        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getHostIds() == null ^ this.getHostIds() == null)
            return false;
        if (other.getHostIds() != null && other.getHostIds().equals(this.getHostIds()) == false)
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
