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
 * Describes one or more of the Reserved Instances that you purchased.
 * </p>
 * <p>
 * For more information about Reserved Instances, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/concepts-on-demand-reserved-instances.html"
 * >Reserved Instances</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i>.
 * </p>
 */
public class DescribeReservedInstancesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone where the Reserved
     * Instance can be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>duration</code> - The duration of the Reserved Instance (one year
     * or three years), in seconds (<code>31536000</code> |
     * <code>94608000</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end</code> - The time when the Reserved Instance expires (for
     * example, 2015-08-07T11:54:42.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fixed-price</code> - The purchase price of the Reserved Instance
     * (for example, 9800.0).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type that is covered by the
     * reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scope</code> - The scope of the Reserved Instance (
     * <code>Region</code> or <code>Availability Zone</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The Reserved Instance product platform
     * description. Instances that include <code>(Amazon VPC)</code> in the
     * product platform description will only be displayed to EC2-Classic
     * account holders and are for use with Amazon VPC (<code>Linux/UNIX</code>
     * | <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code> |
     * <code>SUSE Linux (Amazon VPC)</code> |
     * <code>Red Hat Enterprise Linux</code> |
     * <code>Red Hat Enterprise Linux (Amazon VPC)</code> | <code>Windows</code>
     * | <code>Windows (Amazon VPC)</code> |
     * <code>Windows with SQL Server Standard</code> |
     * <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     * <code>Windows with SQL Server Web</code> |
     * <code>Windows with SQL Server Web (Amazon VPC)</code> |
     * <code>Windows with SQL Server Enterprise</code> |
     * <code>Windows with SQL Server Enterprise (Amazon VPC)</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-id</code> - The ID of the Reserved Instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start</code> - The time at which the Reserved Instance purchase
     * request was placed (for example, 2014-08-07T11:54:42.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Reserved Instance (
     * <code>payment-pending</code> | <code>active</code> |
     * <code>payment-failed</code> | <code>retired</code>).
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
     * <li>
     * <p>
     * <code>usage-price</code> - The usage price of the Reserved Instance, per
     * hour (for example, 0.84).
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * Describes whether the Reserved Instance is Standard or Convertible.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, convertible
     */
    private String offeringClass;

    /**
     * <p>
     * One or more Reserved Instance IDs.
     * </p>
     * <p>
     * Default: Describes all your Reserved Instances, or only those otherwise
     * specified.
     * </p>
     */
    private java.util.List<String> reservedInstancesIds;

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
     * The Reserved Instance offering type. If you are using tools that predate
     * the 2011-11-01 API version, you only have access to the
     * <code>Medium Utilization</code> Reserved Instance offering type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light
     * Utilization, No Upfront, Partial Upfront, All Upfront
     */
    private String offeringType;

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone where the Reserved
     * Instance can be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>duration</code> - The duration of the Reserved Instance (one year
     * or three years), in seconds (<code>31536000</code> |
     * <code>94608000</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end</code> - The time when the Reserved Instance expires (for
     * example, 2015-08-07T11:54:42.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fixed-price</code> - The purchase price of the Reserved Instance
     * (for example, 9800.0).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type that is covered by the
     * reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scope</code> - The scope of the Reserved Instance (
     * <code>Region</code> or <code>Availability Zone</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The Reserved Instance product platform
     * description. Instances that include <code>(Amazon VPC)</code> in the
     * product platform description will only be displayed to EC2-Classic
     * account holders and are for use with Amazon VPC (<code>Linux/UNIX</code>
     * | <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code> |
     * <code>SUSE Linux (Amazon VPC)</code> |
     * <code>Red Hat Enterprise Linux</code> |
     * <code>Red Hat Enterprise Linux (Amazon VPC)</code> | <code>Windows</code>
     * | <code>Windows (Amazon VPC)</code> |
     * <code>Windows with SQL Server Standard</code> |
     * <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     * <code>Windows with SQL Server Web</code> |
     * <code>Windows with SQL Server Web (Amazon VPC)</code> |
     * <code>Windows with SQL Server Enterprise</code> |
     * <code>Windows with SQL Server Enterprise (Amazon VPC)</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-id</code> - The ID of the Reserved Instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start</code> - The time at which the Reserved Instance purchase
     * request was placed (for example, 2014-08-07T11:54:42.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Reserved Instance (
     * <code>payment-pending</code> | <code>active</code> |
     * <code>payment-failed</code> | <code>retired</code>).
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
     * <li>
     * <p>
     * <code>usage-price</code> - The usage price of the Reserved Instance, per
     * hour (for example, 0.84).
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
     *         <code>availability-zone</code> - The Availability Zone where the
     *         Reserved Instance can be used.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>duration</code> - The duration of the Reserved Instance
     *         (one year or three years), in seconds (<code>31536000</code> |
     *         <code>94608000</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>end</code> - The time when the Reserved Instance expires
     *         (for example, 2015-08-07T11:54:42.000Z).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>fixed-price</code> - The purchase price of the Reserved
     *         Instance (for example, 9800.0).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-type</code> - The instance type that is covered by
     *         the reservation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>scope</code> - The scope of the Reserved Instance (
     *         <code>Region</code> or <code>Availability Zone</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>product-description</code> - The Reserved Instance product
     *         platform description. Instances that include
     *         <code>(Amazon VPC)</code> in the product platform description
     *         will only be displayed to EC2-Classic account holders and are for
     *         use with Amazon VPC (<code>Linux/UNIX</code> |
     *         <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code> |
     *         <code>SUSE Linux (Amazon VPC)</code> |
     *         <code>Red Hat Enterprise Linux</code> |
     *         <code>Red Hat Enterprise Linux (Amazon VPC)</code> |
     *         <code>Windows</code> | <code>Windows (Amazon VPC)</code> |
     *         <code>Windows with SQL Server Standard</code> |
     *         <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     *         <code>Windows with SQL Server Web</code> |
     *         <code>Windows with SQL Server Web (Amazon VPC)</code> |
     *         <code>Windows with SQL Server Enterprise</code> |
     *         <code>Windows with SQL Server Enterprise (Amazon VPC)</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>reserved-instances-id</code> - The ID of the Reserved
     *         Instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>start</code> - The time at which the Reserved Instance
     *         purchase request was placed (for example,
     *         2014-08-07T11:54:42.000Z).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the Reserved Instance (
     *         <code>payment-pending</code> | <code>active</code> |
     *         <code>payment-failed</code> | <code>retired</code>).
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
     *         <li>
     *         <p>
     *         <code>usage-price</code> - The usage price of the Reserved
     *         Instance, per hour (for example, 0.84).
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
     * <code>availability-zone</code> - The Availability Zone where the Reserved
     * Instance can be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>duration</code> - The duration of the Reserved Instance (one year
     * or three years), in seconds (<code>31536000</code> |
     * <code>94608000</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end</code> - The time when the Reserved Instance expires (for
     * example, 2015-08-07T11:54:42.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fixed-price</code> - The purchase price of the Reserved Instance
     * (for example, 9800.0).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type that is covered by the
     * reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scope</code> - The scope of the Reserved Instance (
     * <code>Region</code> or <code>Availability Zone</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The Reserved Instance product platform
     * description. Instances that include <code>(Amazon VPC)</code> in the
     * product platform description will only be displayed to EC2-Classic
     * account holders and are for use with Amazon VPC (<code>Linux/UNIX</code>
     * | <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code> |
     * <code>SUSE Linux (Amazon VPC)</code> |
     * <code>Red Hat Enterprise Linux</code> |
     * <code>Red Hat Enterprise Linux (Amazon VPC)</code> | <code>Windows</code>
     * | <code>Windows (Amazon VPC)</code> |
     * <code>Windows with SQL Server Standard</code> |
     * <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     * <code>Windows with SQL Server Web</code> |
     * <code>Windows with SQL Server Web (Amazon VPC)</code> |
     * <code>Windows with SQL Server Enterprise</code> |
     * <code>Windows with SQL Server Enterprise (Amazon VPC)</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-id</code> - The ID of the Reserved Instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start</code> - The time at which the Reserved Instance purchase
     * request was placed (for example, 2014-08-07T11:54:42.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Reserved Instance (
     * <code>payment-pending</code> | <code>active</code> |
     * <code>payment-failed</code> | <code>retired</code>).
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
     * <li>
     * <p>
     * <code>usage-price</code> - The usage price of the Reserved Instance, per
     * hour (for example, 0.84).
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
     *            <code>availability-zone</code> - The Availability Zone where
     *            the Reserved Instance can be used.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>duration</code> - The duration of the Reserved Instance
     *            (one year or three years), in seconds (<code>31536000</code> |
     *            <code>94608000</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>end</code> - The time when the Reserved Instance expires
     *            (for example, 2015-08-07T11:54:42.000Z).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>fixed-price</code> - The purchase price of the Reserved
     *            Instance (for example, 9800.0).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-type</code> - The instance type that is covered
     *            by the reservation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>scope</code> - The scope of the Reserved Instance (
     *            <code>Region</code> or <code>Availability Zone</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>product-description</code> - The Reserved Instance
     *            product platform description. Instances that include
     *            <code>(Amazon VPC)</code> in the product platform description
     *            will only be displayed to EC2-Classic account holders and are
     *            for use with Amazon VPC (<code>Linux/UNIX</code> |
     *            <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code>
     *            | <code>SUSE Linux (Amazon VPC)</code> |
     *            <code>Red Hat Enterprise Linux</code> |
     *            <code>Red Hat Enterprise Linux (Amazon VPC)</code> |
     *            <code>Windows</code> | <code>Windows (Amazon VPC)</code> |
     *            <code>Windows with SQL Server Standard</code> |
     *            <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     *            <code>Windows with SQL Server Web</code> |
     *            <code>Windows with SQL Server Web (Amazon VPC)</code> |
     *            <code>Windows with SQL Server Enterprise</code> |
     *            <code>Windows with SQL Server Enterprise (Amazon VPC)</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>reserved-instances-id</code> - The ID of the Reserved
     *            Instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>start</code> - The time at which the Reserved Instance
     *            purchase request was placed (for example,
     *            2014-08-07T11:54:42.000Z).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the Reserved Instance (
     *            <code>payment-pending</code> | <code>active</code> |
     *            <code>payment-failed</code> | <code>retired</code>).
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
     *            <li>
     *            <p>
     *            <code>usage-price</code> - The usage price of the Reserved
     *            Instance, per hour (for example, 0.84).
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
     * <code>availability-zone</code> - The Availability Zone where the Reserved
     * Instance can be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>duration</code> - The duration of the Reserved Instance (one year
     * or three years), in seconds (<code>31536000</code> |
     * <code>94608000</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end</code> - The time when the Reserved Instance expires (for
     * example, 2015-08-07T11:54:42.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fixed-price</code> - The purchase price of the Reserved Instance
     * (for example, 9800.0).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type that is covered by the
     * reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scope</code> - The scope of the Reserved Instance (
     * <code>Region</code> or <code>Availability Zone</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The Reserved Instance product platform
     * description. Instances that include <code>(Amazon VPC)</code> in the
     * product platform description will only be displayed to EC2-Classic
     * account holders and are for use with Amazon VPC (<code>Linux/UNIX</code>
     * | <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code> |
     * <code>SUSE Linux (Amazon VPC)</code> |
     * <code>Red Hat Enterprise Linux</code> |
     * <code>Red Hat Enterprise Linux (Amazon VPC)</code> | <code>Windows</code>
     * | <code>Windows (Amazon VPC)</code> |
     * <code>Windows with SQL Server Standard</code> |
     * <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     * <code>Windows with SQL Server Web</code> |
     * <code>Windows with SQL Server Web (Amazon VPC)</code> |
     * <code>Windows with SQL Server Enterprise</code> |
     * <code>Windows with SQL Server Enterprise (Amazon VPC)</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-id</code> - The ID of the Reserved Instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start</code> - The time at which the Reserved Instance purchase
     * request was placed (for example, 2014-08-07T11:54:42.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Reserved Instance (
     * <code>payment-pending</code> | <code>active</code> |
     * <code>payment-failed</code> | <code>retired</code>).
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
     * <li>
     * <p>
     * <code>usage-price</code> - The usage price of the Reserved Instance, per
     * hour (for example, 0.84).
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
     *            <code>availability-zone</code> - The Availability Zone where
     *            the Reserved Instance can be used.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>duration</code> - The duration of the Reserved Instance
     *            (one year or three years), in seconds (<code>31536000</code> |
     *            <code>94608000</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>end</code> - The time when the Reserved Instance expires
     *            (for example, 2015-08-07T11:54:42.000Z).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>fixed-price</code> - The purchase price of the Reserved
     *            Instance (for example, 9800.0).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-type</code> - The instance type that is covered
     *            by the reservation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>scope</code> - The scope of the Reserved Instance (
     *            <code>Region</code> or <code>Availability Zone</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>product-description</code> - The Reserved Instance
     *            product platform description. Instances that include
     *            <code>(Amazon VPC)</code> in the product platform description
     *            will only be displayed to EC2-Classic account holders and are
     *            for use with Amazon VPC (<code>Linux/UNIX</code> |
     *            <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code>
     *            | <code>SUSE Linux (Amazon VPC)</code> |
     *            <code>Red Hat Enterprise Linux</code> |
     *            <code>Red Hat Enterprise Linux (Amazon VPC)</code> |
     *            <code>Windows</code> | <code>Windows (Amazon VPC)</code> |
     *            <code>Windows with SQL Server Standard</code> |
     *            <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     *            <code>Windows with SQL Server Web</code> |
     *            <code>Windows with SQL Server Web (Amazon VPC)</code> |
     *            <code>Windows with SQL Server Enterprise</code> |
     *            <code>Windows with SQL Server Enterprise (Amazon VPC)</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>reserved-instances-id</code> - The ID of the Reserved
     *            Instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>start</code> - The time at which the Reserved Instance
     *            purchase request was placed (for example,
     *            2014-08-07T11:54:42.000Z).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the Reserved Instance (
     *            <code>payment-pending</code> | <code>active</code> |
     *            <code>payment-failed</code> | <code>retired</code>).
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
     *            <li>
     *            <p>
     *            <code>usage-price</code> - The usage price of the Reserved
     *            Instance, per hour (for example, 0.84).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedInstancesRequest withFilters(Filter... filters) {
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
     * <code>availability-zone</code> - The Availability Zone where the Reserved
     * Instance can be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>duration</code> - The duration of the Reserved Instance (one year
     * or three years), in seconds (<code>31536000</code> |
     * <code>94608000</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end</code> - The time when the Reserved Instance expires (for
     * example, 2015-08-07T11:54:42.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fixed-price</code> - The purchase price of the Reserved Instance
     * (for example, 9800.0).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type that is covered by the
     * reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scope</code> - The scope of the Reserved Instance (
     * <code>Region</code> or <code>Availability Zone</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The Reserved Instance product platform
     * description. Instances that include <code>(Amazon VPC)</code> in the
     * product platform description will only be displayed to EC2-Classic
     * account holders and are for use with Amazon VPC (<code>Linux/UNIX</code>
     * | <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code> |
     * <code>SUSE Linux (Amazon VPC)</code> |
     * <code>Red Hat Enterprise Linux</code> |
     * <code>Red Hat Enterprise Linux (Amazon VPC)</code> | <code>Windows</code>
     * | <code>Windows (Amazon VPC)</code> |
     * <code>Windows with SQL Server Standard</code> |
     * <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     * <code>Windows with SQL Server Web</code> |
     * <code>Windows with SQL Server Web (Amazon VPC)</code> |
     * <code>Windows with SQL Server Enterprise</code> |
     * <code>Windows with SQL Server Enterprise (Amazon VPC)</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-id</code> - The ID of the Reserved Instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start</code> - The time at which the Reserved Instance purchase
     * request was placed (for example, 2014-08-07T11:54:42.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Reserved Instance (
     * <code>payment-pending</code> | <code>active</code> |
     * <code>payment-failed</code> | <code>retired</code>).
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
     * <li>
     * <p>
     * <code>usage-price</code> - The usage price of the Reserved Instance, per
     * hour (for example, 0.84).
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
     *            <code>availability-zone</code> - The Availability Zone where
     *            the Reserved Instance can be used.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>duration</code> - The duration of the Reserved Instance
     *            (one year or three years), in seconds (<code>31536000</code> |
     *            <code>94608000</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>end</code> - The time when the Reserved Instance expires
     *            (for example, 2015-08-07T11:54:42.000Z).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>fixed-price</code> - The purchase price of the Reserved
     *            Instance (for example, 9800.0).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-type</code> - The instance type that is covered
     *            by the reservation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>scope</code> - The scope of the Reserved Instance (
     *            <code>Region</code> or <code>Availability Zone</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>product-description</code> - The Reserved Instance
     *            product platform description. Instances that include
     *            <code>(Amazon VPC)</code> in the product platform description
     *            will only be displayed to EC2-Classic account holders and are
     *            for use with Amazon VPC (<code>Linux/UNIX</code> |
     *            <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code>
     *            | <code>SUSE Linux (Amazon VPC)</code> |
     *            <code>Red Hat Enterprise Linux</code> |
     *            <code>Red Hat Enterprise Linux (Amazon VPC)</code> |
     *            <code>Windows</code> | <code>Windows (Amazon VPC)</code> |
     *            <code>Windows with SQL Server Standard</code> |
     *            <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     *            <code>Windows with SQL Server Web</code> |
     *            <code>Windows with SQL Server Web (Amazon VPC)</code> |
     *            <code>Windows with SQL Server Enterprise</code> |
     *            <code>Windows with SQL Server Enterprise (Amazon VPC)</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>reserved-instances-id</code> - The ID of the Reserved
     *            Instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>start</code> - The time at which the Reserved Instance
     *            purchase request was placed (for example,
     *            2014-08-07T11:54:42.000Z).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the Reserved Instance (
     *            <code>payment-pending</code> | <code>active</code> |
     *            <code>payment-failed</code> | <code>retired</code>).
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
     *            <li>
     *            <p>
     *            <code>usage-price</code> - The usage price of the Reserved
     *            Instance, per hour (for example, 0.84).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedInstancesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Describes whether the Reserved Instance is Standard or Convertible.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, convertible
     *
     * @return <p>
     *         Describes whether the Reserved Instance is Standard or
     *         Convertible.
     *         </p>
     * @see OfferingClassType
     */
    public String getOfferingClass() {
        return offeringClass;
    }

    /**
     * <p>
     * Describes whether the Reserved Instance is Standard or Convertible.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, convertible
     *
     * @param offeringClass <p>
     *            Describes whether the Reserved Instance is Standard or
     *            Convertible.
     *            </p>
     * @see OfferingClassType
     */
    public void setOfferingClass(String offeringClass) {
        this.offeringClass = offeringClass;
    }

    /**
     * <p>
     * Describes whether the Reserved Instance is Standard or Convertible.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, convertible
     *
     * @param offeringClass <p>
     *            Describes whether the Reserved Instance is Standard or
     *            Convertible.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OfferingClassType
     */
    public DescribeReservedInstancesRequest withOfferingClass(String offeringClass) {
        this.offeringClass = offeringClass;
        return this;
    }

    /**
     * <p>
     * Describes whether the Reserved Instance is Standard or Convertible.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, convertible
     *
     * @param offeringClass <p>
     *            Describes whether the Reserved Instance is Standard or
     *            Convertible.
     *            </p>
     * @see OfferingClassType
     */
    public void setOfferingClass(OfferingClassType offeringClass) {
        this.offeringClass = offeringClass.toString();
    }

    /**
     * <p>
     * Describes whether the Reserved Instance is Standard or Convertible.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, convertible
     *
     * @param offeringClass <p>
     *            Describes whether the Reserved Instance is Standard or
     *            Convertible.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OfferingClassType
     */
    public DescribeReservedInstancesRequest withOfferingClass(OfferingClassType offeringClass) {
        this.offeringClass = offeringClass.toString();
        return this;
    }

    /**
     * <p>
     * One or more Reserved Instance IDs.
     * </p>
     * <p>
     * Default: Describes all your Reserved Instances, or only those otherwise
     * specified.
     * </p>
     *
     * @return <p>
     *         One or more Reserved Instance IDs.
     *         </p>
     *         <p>
     *         Default: Describes all your Reserved Instances, or only those
     *         otherwise specified.
     *         </p>
     */
    public java.util.List<String> getReservedInstancesIds() {
        return reservedInstancesIds;
    }

    /**
     * <p>
     * One or more Reserved Instance IDs.
     * </p>
     * <p>
     * Default: Describes all your Reserved Instances, or only those otherwise
     * specified.
     * </p>
     *
     * @param reservedInstancesIds <p>
     *            One or more Reserved Instance IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your Reserved Instances, or only those
     *            otherwise specified.
     *            </p>
     */
    public void setReservedInstancesIds(java.util.Collection<String> reservedInstancesIds) {
        if (reservedInstancesIds == null) {
            this.reservedInstancesIds = null;
            return;
        }

        this.reservedInstancesIds = new java.util.ArrayList<String>(reservedInstancesIds);
    }

    /**
     * <p>
     * One or more Reserved Instance IDs.
     * </p>
     * <p>
     * Default: Describes all your Reserved Instances, or only those otherwise
     * specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstancesIds <p>
     *            One or more Reserved Instance IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your Reserved Instances, or only those
     *            otherwise specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedInstancesRequest withReservedInstancesIds(String... reservedInstancesIds) {
        if (getReservedInstancesIds() == null) {
            this.reservedInstancesIds = new java.util.ArrayList<String>(reservedInstancesIds.length);
        }
        for (String value : reservedInstancesIds) {
            this.reservedInstancesIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more Reserved Instance IDs.
     * </p>
     * <p>
     * Default: Describes all your Reserved Instances, or only those otherwise
     * specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstancesIds <p>
     *            One or more Reserved Instance IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your Reserved Instances, or only those
     *            otherwise specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedInstancesRequest withReservedInstancesIds(
            java.util.Collection<String> reservedInstancesIds) {
        setReservedInstancesIds(reservedInstancesIds);
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
    public DescribeReservedInstancesRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The Reserved Instance offering type. If you are using tools that predate
     * the 2011-11-01 API version, you only have access to the
     * <code>Medium Utilization</code> Reserved Instance offering type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light
     * Utilization, No Upfront, Partial Upfront, All Upfront
     *
     * @return <p>
     *         The Reserved Instance offering type. If you are using tools that
     *         predate the 2011-11-01 API version, you only have access to the
     *         <code>Medium Utilization</code> Reserved Instance offering type.
     *         </p>
     * @see OfferingTypeValues
     */
    public String getOfferingType() {
        return offeringType;
    }

    /**
     * <p>
     * The Reserved Instance offering type. If you are using tools that predate
     * the 2011-11-01 API version, you only have access to the
     * <code>Medium Utilization</code> Reserved Instance offering type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light
     * Utilization, No Upfront, Partial Upfront, All Upfront
     *
     * @param offeringType <p>
     *            The Reserved Instance offering type. If you are using tools
     *            that predate the 2011-11-01 API version, you only have access
     *            to the <code>Medium Utilization</code> Reserved Instance
     *            offering type.
     *            </p>
     * @see OfferingTypeValues
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    /**
     * <p>
     * The Reserved Instance offering type. If you are using tools that predate
     * the 2011-11-01 API version, you only have access to the
     * <code>Medium Utilization</code> Reserved Instance offering type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light
     * Utilization, No Upfront, Partial Upfront, All Upfront
     *
     * @param offeringType <p>
     *            The Reserved Instance offering type. If you are using tools
     *            that predate the 2011-11-01 API version, you only have access
     *            to the <code>Medium Utilization</code> Reserved Instance
     *            offering type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OfferingTypeValues
     */
    public DescribeReservedInstancesRequest withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    /**
     * <p>
     * The Reserved Instance offering type. If you are using tools that predate
     * the 2011-11-01 API version, you only have access to the
     * <code>Medium Utilization</code> Reserved Instance offering type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light
     * Utilization, No Upfront, Partial Upfront, All Upfront
     *
     * @param offeringType <p>
     *            The Reserved Instance offering type. If you are using tools
     *            that predate the 2011-11-01 API version, you only have access
     *            to the <code>Medium Utilization</code> Reserved Instance
     *            offering type.
     *            </p>
     * @see OfferingTypeValues
     */
    public void setOfferingType(OfferingTypeValues offeringType) {
        this.offeringType = offeringType.toString();
    }

    /**
     * <p>
     * The Reserved Instance offering type. If you are using tools that predate
     * the 2011-11-01 API version, you only have access to the
     * <code>Medium Utilization</code> Reserved Instance offering type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light
     * Utilization, No Upfront, Partial Upfront, All Upfront
     *
     * @param offeringType <p>
     *            The Reserved Instance offering type. If you are using tools
     *            that predate the 2011-11-01 API version, you only have access
     *            to the <code>Medium Utilization</code> Reserved Instance
     *            offering type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OfferingTypeValues
     */
    public DescribeReservedInstancesRequest withOfferingType(OfferingTypeValues offeringType) {
        this.offeringType = offeringType.toString();
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
        if (getOfferingClass() != null)
            sb.append("OfferingClass: " + getOfferingClass() + ",");
        if (getReservedInstancesIds() != null)
            sb.append("ReservedInstancesIds: " + getReservedInstancesIds() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getOfferingType() != null)
            sb.append("OfferingType: " + getOfferingType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode
                + ((getOfferingClass() == null) ? 0 : getOfferingClass().hashCode());
        hashCode = prime * hashCode
                + ((getReservedInstancesIds() == null) ? 0 : getReservedInstancesIds().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedInstancesRequest == false)
            return false;
        DescribeReservedInstancesRequest other = (DescribeReservedInstancesRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getOfferingClass() == null ^ this.getOfferingClass() == null)
            return false;
        if (other.getOfferingClass() != null
                && other.getOfferingClass().equals(this.getOfferingClass()) == false)
            return false;
        if (other.getReservedInstancesIds() == null ^ this.getReservedInstancesIds() == null)
            return false;
        if (other.getReservedInstancesIds() != null
                && other.getReservedInstancesIds().equals(this.getReservedInstancesIds()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getOfferingType() == null ^ this.getOfferingType() == null)
            return false;
        if (other.getOfferingType() != null
                && other.getOfferingType().equals(this.getOfferingType()) == false)
            return false;
        return true;
    }
}
