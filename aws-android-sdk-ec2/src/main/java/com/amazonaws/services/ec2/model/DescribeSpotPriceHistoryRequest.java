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
 * Describes the Spot price history. For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances-history.html"
 * >Spot Instance Pricing History</a> in the <i>Amazon EC2 User Guide for Linux
 * Instances</i>.
 * </p>
 * <p>
 * When you specify a start and end time, this operation returns the prices of
 * the instance types within the time range that you specified and the time when
 * the price changed. The price is valid within the time period that you
 * specified; the response merely indicates the last time that the price
 * changed.
 * </p>
 */
public class DescribeSpotPriceHistoryRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone for which prices
     * should be returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance (for example,
     * <code>m3.medium</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The product description for the Spot
     * price (<code>Linux/UNIX</code> | <code>SUSE Linux</code> |
     * <code>Windows</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux (Amazon VPC)</code> | <code>Windows (Amazon VPC)</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-price</code> - The Spot price. The value must match exactly
     * (or use wildcards; greater than or less than comparison is not
     * supported).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>timestamp</code> - The time stamp of the Spot price history, in UTC
     * format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You can
     * use wildcards (* and ?). Greater than or less than comparison is not
     * supported.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * Filters the results by the specified Availability Zone.
     * </p>
     */
    private String availabilityZone;

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
     * The date and time, up to the current date, from which to stop retrieving
     * the price history data, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * Filters the results by the specified instance types.
     * </p>
     */
    private java.util.List<String> instanceTypes;

    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value
     * between 1 and 1000. The default value is 1000. To retrieve the remaining
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
     * Filters the results by the specified basic product descriptions.
     * </p>
     */
    private java.util.List<String> productDescriptions;

    /**
     * <p>
     * The date and time, up to the past 90 days, from which to start retrieving
     * the price history data, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone for which prices
     * should be returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance (for example,
     * <code>m3.medium</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The product description for the Spot
     * price (<code>Linux/UNIX</code> | <code>SUSE Linux</code> |
     * <code>Windows</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux (Amazon VPC)</code> | <code>Windows (Amazon VPC)</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-price</code> - The Spot price. The value must match exactly
     * (or use wildcards; greater than or less than comparison is not
     * supported).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>timestamp</code> - The time stamp of the Spot price history, in UTC
     * format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You can
     * use wildcards (* and ?). Greater than or less than comparison is not
     * supported.
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
     *         <code>availability-zone</code> - The Availability Zone for which
     *         prices should be returned.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-type</code> - The type of instance (for example,
     *         <code>m3.medium</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>product-description</code> - The product description for
     *         the Spot price (<code>Linux/UNIX</code> | <code>SUSE Linux</code>
     *         | <code>Windows</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     *         <code>SUSE Linux (Amazon VPC)</code> |
     *         <code>Windows (Amazon VPC)</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>spot-price</code> - The Spot price. The value must match
     *         exactly (or use wildcards; greater than or less than comparison
     *         is not supported).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>timestamp</code> - The time stamp of the Spot price
     *         history, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *         You can use wildcards (* and ?). Greater than or less than
     *         comparison is not supported.
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
     * <code>availability-zone</code> - The Availability Zone for which prices
     * should be returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance (for example,
     * <code>m3.medium</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The product description for the Spot
     * price (<code>Linux/UNIX</code> | <code>SUSE Linux</code> |
     * <code>Windows</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux (Amazon VPC)</code> | <code>Windows (Amazon VPC)</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-price</code> - The Spot price. The value must match exactly
     * (or use wildcards; greater than or less than comparison is not
     * supported).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>timestamp</code> - The time stamp of the Spot price history, in UTC
     * format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You can
     * use wildcards (* and ?). Greater than or less than comparison is not
     * supported.
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
     *            <code>availability-zone</code> - The Availability Zone for
     *            which prices should be returned.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-type</code> - The type of instance (for
     *            example, <code>m3.medium</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>product-description</code> - The product description for
     *            the Spot price (<code>Linux/UNIX</code> |
     *            <code>SUSE Linux</code> | <code>Windows</code> |
     *            <code>Linux/UNIX (Amazon VPC)</code> |
     *            <code>SUSE Linux (Amazon VPC)</code> |
     *            <code>Windows (Amazon VPC)</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>spot-price</code> - The Spot price. The value must match
     *            exactly (or use wildcards; greater than or less than
     *            comparison is not supported).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>timestamp</code> - The time stamp of the Spot price
     *            history, in UTC format (for example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD
     *            </i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You can use wildcards (*
     *            and ?). Greater than or less than comparison is not supported.
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
     * <code>availability-zone</code> - The Availability Zone for which prices
     * should be returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance (for example,
     * <code>m3.medium</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The product description for the Spot
     * price (<code>Linux/UNIX</code> | <code>SUSE Linux</code> |
     * <code>Windows</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux (Amazon VPC)</code> | <code>Windows (Amazon VPC)</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-price</code> - The Spot price. The value must match exactly
     * (or use wildcards; greater than or less than comparison is not
     * supported).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>timestamp</code> - The time stamp of the Spot price history, in UTC
     * format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You can
     * use wildcards (* and ?). Greater than or less than comparison is not
     * supported.
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
     *            <code>availability-zone</code> - The Availability Zone for
     *            which prices should be returned.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-type</code> - The type of instance (for
     *            example, <code>m3.medium</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>product-description</code> - The product description for
     *            the Spot price (<code>Linux/UNIX</code> |
     *            <code>SUSE Linux</code> | <code>Windows</code> |
     *            <code>Linux/UNIX (Amazon VPC)</code> |
     *            <code>SUSE Linux (Amazon VPC)</code> |
     *            <code>Windows (Amazon VPC)</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>spot-price</code> - The Spot price. The value must match
     *            exactly (or use wildcards; greater than or less than
     *            comparison is not supported).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>timestamp</code> - The time stamp of the Spot price
     *            history, in UTC format (for example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD
     *            </i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You can use wildcards (*
     *            and ?). Greater than or less than comparison is not supported.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotPriceHistoryRequest withFilters(Filter... filters) {
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
     * <code>availability-zone</code> - The Availability Zone for which prices
     * should be returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance (for example,
     * <code>m3.medium</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The product description for the Spot
     * price (<code>Linux/UNIX</code> | <code>SUSE Linux</code> |
     * <code>Windows</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux (Amazon VPC)</code> | <code>Windows (Amazon VPC)</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-price</code> - The Spot price. The value must match exactly
     * (or use wildcards; greater than or less than comparison is not
     * supported).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>timestamp</code> - The time stamp of the Spot price history, in UTC
     * format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You can
     * use wildcards (* and ?). Greater than or less than comparison is not
     * supported.
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
     *            <code>availability-zone</code> - The Availability Zone for
     *            which prices should be returned.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-type</code> - The type of instance (for
     *            example, <code>m3.medium</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>product-description</code> - The product description for
     *            the Spot price (<code>Linux/UNIX</code> |
     *            <code>SUSE Linux</code> | <code>Windows</code> |
     *            <code>Linux/UNIX (Amazon VPC)</code> |
     *            <code>SUSE Linux (Amazon VPC)</code> |
     *            <code>Windows (Amazon VPC)</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>spot-price</code> - The Spot price. The value must match
     *            exactly (or use wildcards; greater than or less than
     *            comparison is not supported).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>timestamp</code> - The time stamp of the Spot price
     *            history, in UTC format (for example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD
     *            </i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You can use wildcards (*
     *            and ?). Greater than or less than comparison is not supported.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotPriceHistoryRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Filters the results by the specified Availability Zone.
     * </p>
     *
     * @return <p>
     *         Filters the results by the specified Availability Zone.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * Filters the results by the specified Availability Zone.
     * </p>
     *
     * @param availabilityZone <p>
     *            Filters the results by the specified Availability Zone.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * Filters the results by the specified Availability Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            Filters the results by the specified Availability Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotPriceHistoryRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
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
    public DescribeSpotPriceHistoryRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The date and time, up to the current date, from which to stop retrieving
     * the price history data, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     *
     * @return <p>
     *         The date and time, up to the current date, from which to stop
     *         retrieving the price history data, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The date and time, up to the current date, from which to stop retrieving
     * the price history data, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     *
     * @param endTime <p>
     *            The date and time, up to the current date, from which to stop
     *            retrieving the price history data, in UTC format (for example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z
     *            ).
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time, up to the current date, from which to stop retrieving
     * the price history data, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The date and time, up to the current date, from which to stop
     *            retrieving the price history data, in UTC format (for example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z
     *            ).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotPriceHistoryRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * Filters the results by the specified instance types.
     * </p>
     *
     * @return <p>
     *         Filters the results by the specified instance types.
     *         </p>
     */
    public java.util.List<String> getInstanceTypes() {
        return instanceTypes;
    }

    /**
     * <p>
     * Filters the results by the specified instance types.
     * </p>
     *
     * @param instanceTypes <p>
     *            Filters the results by the specified instance types.
     *            </p>
     */
    public void setInstanceTypes(java.util.Collection<String> instanceTypes) {
        if (instanceTypes == null) {
            this.instanceTypes = null;
            return;
        }

        this.instanceTypes = new java.util.ArrayList<String>(instanceTypes);
    }

    /**
     * <p>
     * Filters the results by the specified instance types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceTypes <p>
     *            Filters the results by the specified instance types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotPriceHistoryRequest withInstanceTypes(String... instanceTypes) {
        if (getInstanceTypes() == null) {
            this.instanceTypes = new java.util.ArrayList<String>(instanceTypes.length);
        }
        for (String value : instanceTypes) {
            this.instanceTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Filters the results by the specified instance types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceTypes <p>
     *            Filters the results by the specified instance types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotPriceHistoryRequest withInstanceTypes(
            java.util.Collection<String> instanceTypes) {
        setInstanceTypes(instanceTypes);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value
     * between 1 and 1000. The default value is 1000. To retrieve the remaining
     * results, make another call with the returned <code>NextToken</code>
     * value.
     * </p>
     *
     * @return <p>
     *         The maximum number of results to return in a single call. Specify
     *         a value between 1 and 1000. The default value is 1000. To
     *         retrieve the remaining results, make another call with the
     *         returned <code>NextToken</code> value.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value
     * between 1 and 1000. The default value is 1000. To retrieve the remaining
     * results, make another call with the returned <code>NextToken</code>
     * value.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call.
     *            Specify a value between 1 and 1000. The default value is 1000.
     *            To retrieve the remaining results, make another call with the
     *            returned <code>NextToken</code> value.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value
     * between 1 and 1000. The default value is 1000. To retrieve the remaining
     * results, make another call with the returned <code>NextToken</code>
     * value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call.
     *            Specify a value between 1 and 1000. The default value is 1000.
     *            To retrieve the remaining results, make another call with the
     *            returned <code>NextToken</code> value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotPriceHistoryRequest withMaxResults(Integer maxResults) {
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
    public DescribeSpotPriceHistoryRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Filters the results by the specified basic product descriptions.
     * </p>
     *
     * @return <p>
     *         Filters the results by the specified basic product descriptions.
     *         </p>
     */
    public java.util.List<String> getProductDescriptions() {
        return productDescriptions;
    }

    /**
     * <p>
     * Filters the results by the specified basic product descriptions.
     * </p>
     *
     * @param productDescriptions <p>
     *            Filters the results by the specified basic product
     *            descriptions.
     *            </p>
     */
    public void setProductDescriptions(java.util.Collection<String> productDescriptions) {
        if (productDescriptions == null) {
            this.productDescriptions = null;
            return;
        }

        this.productDescriptions = new java.util.ArrayList<String>(productDescriptions);
    }

    /**
     * <p>
     * Filters the results by the specified basic product descriptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productDescriptions <p>
     *            Filters the results by the specified basic product
     *            descriptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotPriceHistoryRequest withProductDescriptions(String... productDescriptions) {
        if (getProductDescriptions() == null) {
            this.productDescriptions = new java.util.ArrayList<String>(productDescriptions.length);
        }
        for (String value : productDescriptions) {
            this.productDescriptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Filters the results by the specified basic product descriptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productDescriptions <p>
     *            Filters the results by the specified basic product
     *            descriptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotPriceHistoryRequest withProductDescriptions(
            java.util.Collection<String> productDescriptions) {
        setProductDescriptions(productDescriptions);
        return this;
    }

    /**
     * <p>
     * The date and time, up to the past 90 days, from which to start retrieving
     * the price history data, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     *
     * @return <p>
     *         The date and time, up to the past 90 days, from which to start
     *         retrieving the price history data, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The date and time, up to the past 90 days, from which to start retrieving
     * the price history data, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     *
     * @param startTime <p>
     *            The date and time, up to the past 90 days, from which to start
     *            retrieving the price history data, in UTC format (for example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z
     *            ).
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time, up to the past 90 days, from which to start retrieving
     * the price history data, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The date and time, up to the past 90 days, from which to start
     *            retrieving the price history data, in UTC format (for example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z
     *            ).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotPriceHistoryRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
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
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getInstanceTypes() != null)
            sb.append("InstanceTypes: " + getInstanceTypes() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getProductDescriptions() != null)
            sb.append("ProductDescriptions: " + getProductDescriptions() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceTypes() == null) ? 0 : getInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getProductDescriptions() == null) ? 0 : getProductDescriptions().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSpotPriceHistoryRequest == false)
            return false;
        DescribeSpotPriceHistoryRequest other = (DescribeSpotPriceHistoryRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getInstanceTypes() == null ^ this.getInstanceTypes() == null)
            return false;
        if (other.getInstanceTypes() != null
                && other.getInstanceTypes().equals(this.getInstanceTypes()) == false)
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
        if (other.getProductDescriptions() == null ^ this.getProductDescriptions() == null)
            return false;
        if (other.getProductDescriptions() != null
                && other.getProductDescriptions().equals(this.getProductDescriptions()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }
}
