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
 * Describes the specified Scheduled Instances or all your Scheduled Instances.
 * </p>
 */
public class DescribeScheduledInstancesRequest extends AmazonWebServiceRequest implements
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone (for example,
     * <code>us-west-2a</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type (for example,
     * <code>c4.large</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-platform</code> - The network platform (
     * <code>EC2-Classic</code> or <code>EC2-VPC</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform (<code>Linux/UNIX</code> or
     * <code>Windows</code>).
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The maximum number of results to return in a single call. This value can
     * be between 5 and 300. The default value is 100. To retrieve the remaining
     * results, make another call with the returned <code>NextToken</code>
     * value.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Scheduled Instance IDs.
     * </p>
     */
    private java.util.List<String> scheduledInstanceIds;

    /**
     * <p>
     * The time period for the first schedule to start.
     * </p>
     */
    private SlotStartTimeRangeRequest slotStartTimeRange;

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
    public DescribeScheduledInstancesRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone (for example,
     * <code>us-west-2a</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type (for example,
     * <code>c4.large</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-platform</code> - The network platform (
     * <code>EC2-Classic</code> or <code>EC2-VPC</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform (<code>Linux/UNIX</code> or
     * <code>Windows</code>).
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
     *         <code>availability-zone</code> - The Availability Zone (for
     *         example, <code>us-west-2a</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-type</code> - The instance type (for example,
     *         <code>c4.large</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-platform</code> - The network platform (
     *         <code>EC2-Classic</code> or <code>EC2-VPC</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>platform</code> - The platform (<code>Linux/UNIX</code> or
     *         <code>Windows</code>).
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone (for example,
     * <code>us-west-2a</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type (for example,
     * <code>c4.large</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-platform</code> - The network platform (
     * <code>EC2-Classic</code> or <code>EC2-VPC</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform (<code>Linux/UNIX</code> or
     * <code>Windows</code>).
     * </p>
     * </li>
     * </ul>
     *
     * @param filters <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone (for
     *            example, <code>us-west-2a</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-type</code> - The instance type (for example,
     *            <code>c4.large</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-platform</code> - The network platform (
     *            <code>EC2-Classic</code> or <code>EC2-VPC</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>platform</code> - The platform (<code>Linux/UNIX</code>
     *            or <code>Windows</code>).
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone (for example,
     * <code>us-west-2a</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type (for example,
     * <code>c4.large</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-platform</code> - The network platform (
     * <code>EC2-Classic</code> or <code>EC2-VPC</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform (<code>Linux/UNIX</code> or
     * <code>Windows</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone (for
     *            example, <code>us-west-2a</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-type</code> - The instance type (for example,
     *            <code>c4.large</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-platform</code> - The network platform (
     *            <code>EC2-Classic</code> or <code>EC2-VPC</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>platform</code> - The platform (<code>Linux/UNIX</code>
     *            or <code>Windows</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledInstancesRequest withFilters(Filter... filters) {
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone (for example,
     * <code>us-west-2a</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type (for example,
     * <code>c4.large</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-platform</code> - The network platform (
     * <code>EC2-Classic</code> or <code>EC2-VPC</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform (<code>Linux/UNIX</code> or
     * <code>Windows</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone (for
     *            example, <code>us-west-2a</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-type</code> - The instance type (for example,
     *            <code>c4.large</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-platform</code> - The network platform (
     *            <code>EC2-Classic</code> or <code>EC2-VPC</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>platform</code> - The platform (<code>Linux/UNIX</code>
     *            or <code>Windows</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledInstancesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. This value can
     * be between 5 and 300. The default value is 100. To retrieve the remaining
     * results, make another call with the returned <code>NextToken</code>
     * value.
     * </p>
     *
     * @return <p>
     *         The maximum number of results to return in a single call. This
     *         value can be between 5 and 300. The default value is 100. To
     *         retrieve the remaining results, make another call with the
     *         returned <code>NextToken</code> value.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. This value can
     * be between 5 and 300. The default value is 100. To retrieve the remaining
     * results, make another call with the returned <code>NextToken</code>
     * value.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call. This
     *            value can be between 5 and 300. The default value is 100. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>NextToken</code> value.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. This value can
     * be between 5 and 300. The default value is 100. To retrieve the remaining
     * results, make another call with the returned <code>NextToken</code>
     * value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call. This
     *            value can be between 5 and 300. The default value is 100. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>NextToken</code> value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledInstancesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     *
     * @return <p>
     *         The token for the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledInstancesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The Scheduled Instance IDs.
     * </p>
     *
     * @return <p>
     *         The Scheduled Instance IDs.
     *         </p>
     */
    public java.util.List<String> getScheduledInstanceIds() {
        return scheduledInstanceIds;
    }

    /**
     * <p>
     * The Scheduled Instance IDs.
     * </p>
     *
     * @param scheduledInstanceIds <p>
     *            The Scheduled Instance IDs.
     *            </p>
     */
    public void setScheduledInstanceIds(java.util.Collection<String> scheduledInstanceIds) {
        if (scheduledInstanceIds == null) {
            this.scheduledInstanceIds = null;
            return;
        }

        this.scheduledInstanceIds = new java.util.ArrayList<String>(scheduledInstanceIds);
    }

    /**
     * <p>
     * The Scheduled Instance IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledInstanceIds <p>
     *            The Scheduled Instance IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledInstancesRequest withScheduledInstanceIds(
            String... scheduledInstanceIds) {
        if (getScheduledInstanceIds() == null) {
            this.scheduledInstanceIds = new java.util.ArrayList<String>(scheduledInstanceIds.length);
        }
        for (String value : scheduledInstanceIds) {
            this.scheduledInstanceIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Scheduled Instance IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledInstanceIds <p>
     *            The Scheduled Instance IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledInstancesRequest withScheduledInstanceIds(
            java.util.Collection<String> scheduledInstanceIds) {
        setScheduledInstanceIds(scheduledInstanceIds);
        return this;
    }

    /**
     * <p>
     * The time period for the first schedule to start.
     * </p>
     *
     * @return <p>
     *         The time period for the first schedule to start.
     *         </p>
     */
    public SlotStartTimeRangeRequest getSlotStartTimeRange() {
        return slotStartTimeRange;
    }

    /**
     * <p>
     * The time period for the first schedule to start.
     * </p>
     *
     * @param slotStartTimeRange <p>
     *            The time period for the first schedule to start.
     *            </p>
     */
    public void setSlotStartTimeRange(SlotStartTimeRangeRequest slotStartTimeRange) {
        this.slotStartTimeRange = slotStartTimeRange;
    }

    /**
     * <p>
     * The time period for the first schedule to start.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slotStartTimeRange <p>
     *            The time period for the first schedule to start.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledInstancesRequest withSlotStartTimeRange(
            SlotStartTimeRangeRequest slotStartTimeRange) {
        this.slotStartTimeRange = slotStartTimeRange;
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
        if (getScheduledInstanceIds() != null)
            sb.append("ScheduledInstanceIds: " + getScheduledInstanceIds() + ",");
        if (getSlotStartTimeRange() != null)
            sb.append("SlotStartTimeRange: " + getSlotStartTimeRange());
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
                + ((getScheduledInstanceIds() == null) ? 0 : getScheduledInstanceIds().hashCode());
        hashCode = prime * hashCode
                + ((getSlotStartTimeRange() == null) ? 0 : getSlotStartTimeRange().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeScheduledInstancesRequest == false)
            return false;
        DescribeScheduledInstancesRequest other = (DescribeScheduledInstancesRequest) obj;

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
        if (other.getScheduledInstanceIds() == null ^ this.getScheduledInstanceIds() == null)
            return false;
        if (other.getScheduledInstanceIds() != null
                && other.getScheduledInstanceIds().equals(this.getScheduledInstanceIds()) == false)
            return false;
        if (other.getSlotStartTimeRange() == null ^ this.getSlotStartTimeRange() == null)
            return false;
        if (other.getSlotStartTimeRange() != null
                && other.getSlotStartTimeRange().equals(this.getSlotStartTimeRange()) == false)
            return false;
        return true;
    }
}
