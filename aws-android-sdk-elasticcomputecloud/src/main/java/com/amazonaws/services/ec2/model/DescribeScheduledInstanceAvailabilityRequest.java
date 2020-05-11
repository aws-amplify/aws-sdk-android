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
 * Finds available schedules that meet the specified criteria.
 * </p>
 * <p>
 * You can search for an available schedule no more than 3 months in advance.
 * You must meet the minimum required duration of 1,200 hours per year. For
 * example, the minimum daily schedule is 4 hours, the minimum weekly schedule
 * is 24 hours, and the minimum monthly schedule is 100 hours.
 * </p>
 * <p>
 * After you find a schedule that meets your needs, call
 * <a>PurchaseScheduledInstances</a> to purchase Scheduled Instances with that
 * schedule.
 * </p>
 */
public class DescribeScheduledInstanceAvailabilityRequest extends AmazonWebServiceRequest implements
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
     * The time period for the first schedule to start.
     * </p>
     */
    private SlotDateTimeRangeRequest firstSlotStartTimeRange;

    /**
     * <p>
     * The maximum number of results to return in a single call. This value can
     * be between 5 and 300. The default value is 300. To retrieve the remaining
     * results, make another call with the returned <code>NextToken</code>
     * value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 300<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The maximum available duration, in hours. This value must be greater than
     * <code>MinSlotDurationInHours</code> and less than 1,720.
     * </p>
     */
    private Integer maxSlotDurationInHours;

    /**
     * <p>
     * The minimum available duration, in hours. The minimum required duration
     * is 1,200 hours per year. For example, the minimum daily schedule is 4
     * hours, the minimum weekly schedule is 24 hours, and the minimum monthly
     * schedule is 100 hours.
     * </p>
     */
    private Integer minSlotDurationInHours;

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The schedule recurrence.
     * </p>
     */
    private ScheduledInstanceRecurrenceRequest recurrence;

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
    public DescribeScheduledInstanceAvailabilityRequest withDryRun(Boolean dryRun) {
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
    public DescribeScheduledInstanceAvailabilityRequest withFilters(Filter... filters) {
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
    public DescribeScheduledInstanceAvailabilityRequest withFilters(
            java.util.Collection<Filter> filters) {
        setFilters(filters);
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
    public SlotDateTimeRangeRequest getFirstSlotStartTimeRange() {
        return firstSlotStartTimeRange;
    }

    /**
     * <p>
     * The time period for the first schedule to start.
     * </p>
     *
     * @param firstSlotStartTimeRange <p>
     *            The time period for the first schedule to start.
     *            </p>
     */
    public void setFirstSlotStartTimeRange(SlotDateTimeRangeRequest firstSlotStartTimeRange) {
        this.firstSlotStartTimeRange = firstSlotStartTimeRange;
    }

    /**
     * <p>
     * The time period for the first schedule to start.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param firstSlotStartTimeRange <p>
     *            The time period for the first schedule to start.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledInstanceAvailabilityRequest withFirstSlotStartTimeRange(
            SlotDateTimeRangeRequest firstSlotStartTimeRange) {
        this.firstSlotStartTimeRange = firstSlotStartTimeRange;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. This value can
     * be between 5 and 300. The default value is 300. To retrieve the remaining
     * results, make another call with the returned <code>NextToken</code>
     * value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 300<br/>
     *
     * @return <p>
     *         The maximum number of results to return in a single call. This
     *         value can be between 5 and 300. The default value is 300. To
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
     * be between 5 and 300. The default value is 300. To retrieve the remaining
     * results, make another call with the returned <code>NextToken</code>
     * value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 300<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call. This
     *            value can be between 5 and 300. The default value is 300. To
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
     * be between 5 and 300. The default value is 300. To retrieve the remaining
     * results, make another call with the returned <code>NextToken</code>
     * value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 300<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call. This
     *            value can be between 5 and 300. The default value is 300. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>NextToken</code> value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledInstanceAvailabilityRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The maximum available duration, in hours. This value must be greater than
     * <code>MinSlotDurationInHours</code> and less than 1,720.
     * </p>
     *
     * @return <p>
     *         The maximum available duration, in hours. This value must be
     *         greater than <code>MinSlotDurationInHours</code> and less than
     *         1,720.
     *         </p>
     */
    public Integer getMaxSlotDurationInHours() {
        return maxSlotDurationInHours;
    }

    /**
     * <p>
     * The maximum available duration, in hours. This value must be greater than
     * <code>MinSlotDurationInHours</code> and less than 1,720.
     * </p>
     *
     * @param maxSlotDurationInHours <p>
     *            The maximum available duration, in hours. This value must be
     *            greater than <code>MinSlotDurationInHours</code> and less than
     *            1,720.
     *            </p>
     */
    public void setMaxSlotDurationInHours(Integer maxSlotDurationInHours) {
        this.maxSlotDurationInHours = maxSlotDurationInHours;
    }

    /**
     * <p>
     * The maximum available duration, in hours. This value must be greater than
     * <code>MinSlotDurationInHours</code> and less than 1,720.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxSlotDurationInHours <p>
     *            The maximum available duration, in hours. This value must be
     *            greater than <code>MinSlotDurationInHours</code> and less than
     *            1,720.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledInstanceAvailabilityRequest withMaxSlotDurationInHours(
            Integer maxSlotDurationInHours) {
        this.maxSlotDurationInHours = maxSlotDurationInHours;
        return this;
    }

    /**
     * <p>
     * The minimum available duration, in hours. The minimum required duration
     * is 1,200 hours per year. For example, the minimum daily schedule is 4
     * hours, the minimum weekly schedule is 24 hours, and the minimum monthly
     * schedule is 100 hours.
     * </p>
     *
     * @return <p>
     *         The minimum available duration, in hours. The minimum required
     *         duration is 1,200 hours per year. For example, the minimum daily
     *         schedule is 4 hours, the minimum weekly schedule is 24 hours, and
     *         the minimum monthly schedule is 100 hours.
     *         </p>
     */
    public Integer getMinSlotDurationInHours() {
        return minSlotDurationInHours;
    }

    /**
     * <p>
     * The minimum available duration, in hours. The minimum required duration
     * is 1,200 hours per year. For example, the minimum daily schedule is 4
     * hours, the minimum weekly schedule is 24 hours, and the minimum monthly
     * schedule is 100 hours.
     * </p>
     *
     * @param minSlotDurationInHours <p>
     *            The minimum available duration, in hours. The minimum required
     *            duration is 1,200 hours per year. For example, the minimum
     *            daily schedule is 4 hours, the minimum weekly schedule is 24
     *            hours, and the minimum monthly schedule is 100 hours.
     *            </p>
     */
    public void setMinSlotDurationInHours(Integer minSlotDurationInHours) {
        this.minSlotDurationInHours = minSlotDurationInHours;
    }

    /**
     * <p>
     * The minimum available duration, in hours. The minimum required duration
     * is 1,200 hours per year. For example, the minimum daily schedule is 4
     * hours, the minimum weekly schedule is 24 hours, and the minimum monthly
     * schedule is 100 hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minSlotDurationInHours <p>
     *            The minimum available duration, in hours. The minimum required
     *            duration is 1,200 hours per year. For example, the minimum
     *            daily schedule is 4 hours, the minimum weekly schedule is 24
     *            hours, and the minimum monthly schedule is 100 hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledInstanceAvailabilityRequest withMinSlotDurationInHours(
            Integer minSlotDurationInHours) {
        this.minSlotDurationInHours = minSlotDurationInHours;
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
    public DescribeScheduledInstanceAvailabilityRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The schedule recurrence.
     * </p>
     *
     * @return <p>
     *         The schedule recurrence.
     *         </p>
     */
    public ScheduledInstanceRecurrenceRequest getRecurrence() {
        return recurrence;
    }

    /**
     * <p>
     * The schedule recurrence.
     * </p>
     *
     * @param recurrence <p>
     *            The schedule recurrence.
     *            </p>
     */
    public void setRecurrence(ScheduledInstanceRecurrenceRequest recurrence) {
        this.recurrence = recurrence;
    }

    /**
     * <p>
     * The schedule recurrence.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recurrence <p>
     *            The schedule recurrence.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledInstanceAvailabilityRequest withRecurrence(
            ScheduledInstanceRecurrenceRequest recurrence) {
        this.recurrence = recurrence;
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
        if (getFirstSlotStartTimeRange() != null)
            sb.append("FirstSlotStartTimeRange: " + getFirstSlotStartTimeRange() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getMaxSlotDurationInHours() != null)
            sb.append("MaxSlotDurationInHours: " + getMaxSlotDurationInHours() + ",");
        if (getMinSlotDurationInHours() != null)
            sb.append("MinSlotDurationInHours: " + getMinSlotDurationInHours() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getRecurrence() != null)
            sb.append("Recurrence: " + getRecurrence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime
                * hashCode
                + ((getFirstSlotStartTimeRange() == null) ? 0 : getFirstSlotStartTimeRange()
                        .hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime
                * hashCode
                + ((getMaxSlotDurationInHours() == null) ? 0 : getMaxSlotDurationInHours()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMinSlotDurationInHours() == null) ? 0 : getMinSlotDurationInHours()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRecurrence() == null) ? 0 : getRecurrence().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeScheduledInstanceAvailabilityRequest == false)
            return false;
        DescribeScheduledInstanceAvailabilityRequest other = (DescribeScheduledInstanceAvailabilityRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getFirstSlotStartTimeRange() == null ^ this.getFirstSlotStartTimeRange() == null)
            return false;
        if (other.getFirstSlotStartTimeRange() != null
                && other.getFirstSlotStartTimeRange().equals(this.getFirstSlotStartTimeRange()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getMaxSlotDurationInHours() == null ^ this.getMaxSlotDurationInHours() == null)
            return false;
        if (other.getMaxSlotDurationInHours() != null
                && other.getMaxSlotDurationInHours().equals(this.getMaxSlotDurationInHours()) == false)
            return false;
        if (other.getMinSlotDurationInHours() == null ^ this.getMinSlotDurationInHours() == null)
            return false;
        if (other.getMinSlotDurationInHours() != null
                && other.getMinSlotDurationInHours().equals(this.getMinSlotDurationInHours()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRecurrence() == null ^ this.getRecurrence() == null)
            return false;
        if (other.getRecurrence() != null
                && other.getRecurrence().equals(this.getRecurrence()) == false)
            return false;
        return true;
    }
}
