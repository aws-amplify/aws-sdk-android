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
 * Describes reservations that are associated with Dedicated Hosts in your
 * account.
 * </p>
 */
public class DescribeHostReservationsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-family</code> - The instance family (for example,
     * <code>m4</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>payment-option</code> - The payment option (<code>NoUpfront</code>
     * | <code>PartialUpfront</code> | <code>AllUpfront</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the reservation (
     * <code>payment-pending</code> | <code>payment-failed</code> |
     * <code>active</code> | <code>retired</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
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
     * The host reservation IDs.
     * </p>
     */
    private java.util.List<String> hostReservationIdSet;

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * returned <code>nextToken</code> value. This value can be between 5 and
     * 500. If <code>maxResults</code> is given a larger value than 500, you
     * receive an error.
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
     * <code>instance-family</code> - The instance family (for example,
     * <code>m4</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>payment-option</code> - The payment option (<code>NoUpfront</code>
     * | <code>PartialUpfront</code> | <code>AllUpfront</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the reservation (
     * <code>payment-pending</code> | <code>payment-failed</code> |
     * <code>active</code> | <code>retired</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
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
     *         <code>instance-family</code> - The instance family (for example,
     *         <code>m4</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>payment-option</code> - The payment option (
     *         <code>NoUpfront</code> | <code>PartialUpfront</code> |
     *         <code>AllUpfront</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the reservation (
     *         <code>payment-pending</code> | <code>payment-failed</code> |
     *         <code>active</code> | <code>retired</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     *         assigned to the resource. Use the tag key in the filter name and
     *         the tag value as the filter value. For example, to find all
     *         resources that have a tag with the key <code>Owner</code> and the
     *         value <code>TeamA</code>, specify <code>tag:Owner</code> for the
     *         filter name and <code>TeamA</code> for the filter value.
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
     * <code>instance-family</code> - The instance family (for example,
     * <code>m4</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>payment-option</code> - The payment option (<code>NoUpfront</code>
     * | <code>PartialUpfront</code> | <code>AllUpfront</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the reservation (
     * <code>payment-pending</code> | <code>payment-failed</code> |
     * <code>active</code> | <code>retired</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
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
     *            <code>instance-family</code> - The instance family (for
     *            example, <code>m4</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>payment-option</code> - The payment option (
     *            <code>NoUpfront</code> | <code>PartialUpfront</code> |
     *            <code>AllUpfront</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the reservation (
     *            <code>payment-pending</code> | <code>payment-failed</code> |
     *            <code>active</code> | <code>retired</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag</code>:&lt;key&gt; - The key/value combination of a
     *            tag assigned to the resource. Use the tag key in the filter
     *            name and the tag value as the filter value. For example, to
     *            find all resources that have a tag with the key
     *            <code>Owner</code> and the value <code>TeamA</code>, specify
     *            <code>tag:Owner</code> for the filter name and
     *            <code>TeamA</code> for the filter value.
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
     * <code>instance-family</code> - The instance family (for example,
     * <code>m4</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>payment-option</code> - The payment option (<code>NoUpfront</code>
     * | <code>PartialUpfront</code> | <code>AllUpfront</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the reservation (
     * <code>payment-pending</code> | <code>payment-failed</code> |
     * <code>active</code> | <code>retired</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
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
     *            <code>instance-family</code> - The instance family (for
     *            example, <code>m4</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>payment-option</code> - The payment option (
     *            <code>NoUpfront</code> | <code>PartialUpfront</code> |
     *            <code>AllUpfront</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the reservation (
     *            <code>payment-pending</code> | <code>payment-failed</code> |
     *            <code>active</code> | <code>retired</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag</code>:&lt;key&gt; - The key/value combination of a
     *            tag assigned to the resource. Use the tag key in the filter
     *            name and the tag value as the filter value. For example, to
     *            find all resources that have a tag with the key
     *            <code>Owner</code> and the value <code>TeamA</code>, specify
     *            <code>tag:Owner</code> for the filter name and
     *            <code>TeamA</code> for the filter value.
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
    public DescribeHostReservationsRequest withFilter(Filter... filter) {
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
     * <code>instance-family</code> - The instance family (for example,
     * <code>m4</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>payment-option</code> - The payment option (<code>NoUpfront</code>
     * | <code>PartialUpfront</code> | <code>AllUpfront</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the reservation (
     * <code>payment-pending</code> | <code>payment-failed</code> |
     * <code>active</code> | <code>retired</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
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
     *            <code>instance-family</code> - The instance family (for
     *            example, <code>m4</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>payment-option</code> - The payment option (
     *            <code>NoUpfront</code> | <code>PartialUpfront</code> |
     *            <code>AllUpfront</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the reservation (
     *            <code>payment-pending</code> | <code>payment-failed</code> |
     *            <code>active</code> | <code>retired</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag</code>:&lt;key&gt; - The key/value combination of a
     *            tag assigned to the resource. Use the tag key in the filter
     *            name and the tag value as the filter value. For example, to
     *            find all resources that have a tag with the key
     *            <code>Owner</code> and the value <code>TeamA</code>, specify
     *            <code>tag:Owner</code> for the filter name and
     *            <code>TeamA</code> for the filter value.
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
    public DescribeHostReservationsRequest withFilter(java.util.Collection<Filter> filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The host reservation IDs.
     * </p>
     *
     * @return <p>
     *         The host reservation IDs.
     *         </p>
     */
    public java.util.List<String> getHostReservationIdSet() {
        return hostReservationIdSet;
    }

    /**
     * <p>
     * The host reservation IDs.
     * </p>
     *
     * @param hostReservationIdSet <p>
     *            The host reservation IDs.
     *            </p>
     */
    public void setHostReservationIdSet(java.util.Collection<String> hostReservationIdSet) {
        if (hostReservationIdSet == null) {
            this.hostReservationIdSet = null;
            return;
        }

        this.hostReservationIdSet = new java.util.ArrayList<String>(hostReservationIdSet);
    }

    /**
     * <p>
     * The host reservation IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostReservationIdSet <p>
     *            The host reservation IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHostReservationsRequest withHostReservationIdSet(String... hostReservationIdSet) {
        if (getHostReservationIdSet() == null) {
            this.hostReservationIdSet = new java.util.ArrayList<String>(hostReservationIdSet.length);
        }
        for (String value : hostReservationIdSet) {
            this.hostReservationIdSet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The host reservation IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostReservationIdSet <p>
     *            The host reservation IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHostReservationsRequest withHostReservationIdSet(
            java.util.Collection<String> hostReservationIdSet) {
        setHostReservationIdSet(hostReservationIdSet);
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
     *
     * @return <p>
     *         The maximum number of results to return for the request in a
     *         single page. The remaining results can be seen by sending another
     *         request with the returned <code>nextToken</code> value. This
     *         value can be between 5 and 500. If <code>maxResults</code> is
     *         given a larger value than 500, you receive an error.
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
     *
     * @param maxResults <p>
     *            The maximum number of results to return for the request in a
     *            single page. The remaining results can be seen by sending
     *            another request with the returned <code>nextToken</code>
     *            value. This value can be between 5 and 500. If
     *            <code>maxResults</code> is given a larger value than 500, you
     *            receive an error.
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHostReservationsRequest withMaxResults(Integer maxResults) {
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
    public DescribeHostReservationsRequest withNextToken(String nextToken) {
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
        if (getHostReservationIdSet() != null)
            sb.append("HostReservationIdSet: " + getHostReservationIdSet() + ",");
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
        hashCode = prime * hashCode
                + ((getHostReservationIdSet() == null) ? 0 : getHostReservationIdSet().hashCode());
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

        if (obj instanceof DescribeHostReservationsRequest == false)
            return false;
        DescribeHostReservationsRequest other = (DescribeHostReservationsRequest) obj;

        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getHostReservationIdSet() == null ^ this.getHostReservationIdSet() == null)
            return false;
        if (other.getHostReservationIdSet() != null
                && other.getHostReservationIdSet().equals(this.getHostReservationIdSet()) == false)
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
