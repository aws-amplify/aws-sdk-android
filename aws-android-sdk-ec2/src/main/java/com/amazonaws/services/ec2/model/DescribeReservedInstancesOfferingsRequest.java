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
 * Describes Reserved Instance offerings that are available for purchase. With
 * Reserved Instances, you purchase the right to launch instances for a period
 * of time. During that time period, you do not receive insufficient capacity
 * errors, and you pay a lower usage rate than the rate charged for On-Demand
 * instances for the actual time used.
 * </p>
 * <p>
 * If you have listed your own Reserved Instances for sale in the Reserved
 * Instance Marketplace, they will be excluded from these results. This is to
 * ensure that you do not purchase your own Reserved Instances.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"
 * >Reserved Instance Marketplace</a> in the <i>Amazon Elastic Compute Cloud
 * User Guide</i>.
 * </p>
 */
public class DescribeReservedInstancesOfferingsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Availability Zone in which the Reserved Instance can be used.
     * </p>
     */
    private String availabilityZone;

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
     * <code>duration</code> - The duration of the Reserved Instance (for
     * example, one year or three years), in seconds (<code>31536000</code> |
     * <code>94608000</code>).
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
     * <code>marketplace</code> - Set to <code>true</code> to show only Reserved
     * Instance Marketplace offerings. When this filter is not used, which is
     * the default behavior, all offerings from both AWS and the Reserved
     * Instance Marketplace are listed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The Reserved Instance product platform
     * description. Instances that include <code>(Amazon VPC)</code> in the
     * product platform description will only be displayed to EC2-Classic
     * account holders and are for use with Amazon VPC. (<code>Linux/UNIX</code>
     * | <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code> |
     * <code>SUSE Linux (Amazon VPC)</code> |
     * <code>Red Hat Enterprise Linux</code> |
     * <code>Red Hat Enterprise Linux (Amazon VPC)</code> | <code>Windows</code>
     * | <code>Windows (Amazon VPC)</code> |
     * <code>Windows with SQL Server Standard</code> |
     * <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     * <code>Windows with SQL Server Web</code> |
     * <code> Windows with SQL Server Web (Amazon VPC)</code> |
     * <code>Windows with SQL Server Enterprise</code> |
     * <code>Windows with SQL Server Enterprise (Amazon VPC)</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-offering-id</code> - The Reserved Instances
     * offering ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scope</code> - The scope of the Reserved Instance (
     * <code>Availability Zone</code> or <code>Region</code>).
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
     * Include Reserved Instance Marketplace offerings in the response.
     * </p>
     */
    private Boolean includeMarketplace;

    /**
     * <p>
     * The instance type that the reservation will cover (for example,
     * <code>m1.small</code>). For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium,
     * t2.large, t2.xlarge, t2.2xlarge, t3.nano, t3.micro, t3.small, t3.medium,
     * t3.large, t3.xlarge, t3.2xlarge, t3a.nano, t3a.micro, t3a.small,
     * t3a.medium, t3a.large, t3a.xlarge, t3a.2xlarge, m1.small, m1.medium,
     * m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge,
     * m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m4.16xlarge,
     * m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge,
     * r3.2xlarge, r3.4xlarge, r3.8xlarge, r4.large, r4.xlarge, r4.2xlarge,
     * r4.4xlarge, r4.8xlarge, r4.16xlarge, r5.large, r5.xlarge, r5.2xlarge,
     * r5.4xlarge, r5.8xlarge, r5.12xlarge, r5.16xlarge, r5.24xlarge, r5.metal,
     * r5a.large, r5a.xlarge, r5a.2xlarge, r5a.4xlarge, r5a.8xlarge,
     * r5a.12xlarge, r5a.16xlarge, r5a.24xlarge, r5d.large, r5d.xlarge,
     * r5d.2xlarge, r5d.4xlarge, r5d.8xlarge, r5d.12xlarge, r5d.16xlarge,
     * r5d.24xlarge, r5d.metal, r5ad.large, r5ad.xlarge, r5ad.2xlarge,
     * r5ad.4xlarge, r5ad.8xlarge, r5ad.12xlarge, r5ad.16xlarge, r5ad.24xlarge,
     * x1.16xlarge, x1.32xlarge, x1e.xlarge, x1e.2xlarge, x1e.4xlarge,
     * x1e.8xlarge, x1e.16xlarge, x1e.32xlarge, i2.xlarge, i2.2xlarge,
     * i2.4xlarge, i2.8xlarge, i3.large, i3.xlarge, i3.2xlarge, i3.4xlarge,
     * i3.8xlarge, i3.16xlarge, i3.metal, i3en.large, i3en.xlarge, i3en.2xlarge,
     * i3en.3xlarge, i3en.6xlarge, i3en.12xlarge, i3en.24xlarge, i3en.metal,
     * hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge,
     * c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge,
     * c4.4xlarge, c4.8xlarge, c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge,
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5d.large,
     * c5d.xlarge, c5d.2xlarge, c5d.4xlarge, c5d.9xlarge, c5d.12xlarge,
     * c5d.18xlarge, c5d.24xlarge, c5d.metal, c5n.large, c5n.xlarge,
     * c5n.2xlarge, c5n.4xlarge, c5n.9xlarge, c5n.18xlarge, cc1.4xlarge,
     * cc2.8xlarge, g2.2xlarge, g2.8xlarge, g3.4xlarge, g3.8xlarge, g3.16xlarge,
     * g3s.xlarge, g4dn.xlarge, g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge,
     * g4dn.12xlarge, g4dn.16xlarge, cg1.4xlarge, p2.xlarge, p2.8xlarge,
     * p2.16xlarge, p3.2xlarge, p3.8xlarge, p3.16xlarge, p3dn.24xlarge,
     * d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge,
     * f1.16xlarge, m5.large, m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge,
     * m5.12xlarge, m5.16xlarge, m5.24xlarge, m5.metal, m5a.large, m5a.xlarge,
     * m5a.2xlarge, m5a.4xlarge, m5a.8xlarge, m5a.12xlarge, m5a.16xlarge,
     * m5a.24xlarge, m5d.large, m5d.xlarge, m5d.2xlarge, m5d.4xlarge,
     * m5d.8xlarge, m5d.12xlarge, m5d.16xlarge, m5d.24xlarge, m5d.metal,
     * m5ad.large, m5ad.xlarge, m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge,
     * m5ad.12xlarge, m5ad.16xlarge, m5ad.24xlarge, h1.2xlarge, h1.4xlarge,
     * h1.8xlarge, h1.16xlarge, z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge,
     * z1d.6xlarge, z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal,
     * u-12tb1.metal, u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large,
     * a1.xlarge, a1.2xlarge, a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge,
     * m5dn.2xlarge, m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge,
     * m5dn.24xlarge, m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge,
     * m5n.8xlarge, m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large,
     * r5dn.xlarge, r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge,
     * r5dn.16xlarge, r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge,
     * r5n.4xlarge, r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge,
     * inf1.xlarge, inf1.2xlarge, inf1.6xlarge, inf1.24xlarge, m6g.metal,
     * m6g.medium, m6g.large, m6g.xlarge, m6g.2xlarge, m6g.4xlarge, m6g.8xlarge,
     * m6g.12xlarge, m6g.16xlarge
     */
    private String instanceType;

    /**
     * <p>
     * The maximum duration (in seconds) to filter when searching for offerings.
     * </p>
     * <p>
     * Default: 94608000 (3 years)
     * </p>
     */
    private Long maxDuration;

    /**
     * <p>
     * The maximum number of instances to filter when searching for offerings.
     * </p>
     * <p>
     * Default: 20
     * </p>
     */
    private Integer maxInstanceCount;

    /**
     * <p>
     * The minimum duration (in seconds) to filter when searching for offerings.
     * </p>
     * <p>
     * Default: 2592000 (1 month)
     * </p>
     */
    private Long minDuration;

    /**
     * <p>
     * The offering class of the Reserved Instance. Can be <code>standard</code>
     * or <code>convertible</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, convertible
     */
    private String offeringClass;

    /**
     * <p>
     * The Reserved Instance product platform description. Instances that
     * include <code>(Amazon VPC)</code> in the description are for use with
     * Amazon VPC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows,
     * Windows (Amazon VPC)
     */
    private String productDescription;

    /**
     * <p>
     * One or more Reserved Instances offering IDs.
     * </p>
     */
    private java.util.List<String> reservedInstancesOfferingIds;

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
     * The tenancy of the instances covered by the reservation. A Reserved
     * Instance with a tenancy of <code>dedicated</code> is applied to instances
     * that run in a VPC on single-tenant hardware (i.e., Dedicated Instances).
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this
     * parameter. Use the <code>default</code> or <code>dedicated</code> values
     * only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     */
    private String instanceTenancy;

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results of the initial request can be seen by sending
     * another request with the returned <code>NextToken</code> value. The
     * maximum is 100.
     * </p>
     * <p>
     * Default: 100
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
     * The Availability Zone in which the Reserved Instance can be used.
     * </p>
     *
     * @return <p>
     *         The Availability Zone in which the Reserved Instance can be used.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the Reserved Instance can be used.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone in which the Reserved Instance can be
     *            used.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the Reserved Instance can be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone in which the Reserved Instance can be
     *            used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedInstancesOfferingsRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
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
     * <code>duration</code> - The duration of the Reserved Instance (for
     * example, one year or three years), in seconds (<code>31536000</code> |
     * <code>94608000</code>).
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
     * <code>marketplace</code> - Set to <code>true</code> to show only Reserved
     * Instance Marketplace offerings. When this filter is not used, which is
     * the default behavior, all offerings from both AWS and the Reserved
     * Instance Marketplace are listed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The Reserved Instance product platform
     * description. Instances that include <code>(Amazon VPC)</code> in the
     * product platform description will only be displayed to EC2-Classic
     * account holders and are for use with Amazon VPC. (<code>Linux/UNIX</code>
     * | <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code> |
     * <code>SUSE Linux (Amazon VPC)</code> |
     * <code>Red Hat Enterprise Linux</code> |
     * <code>Red Hat Enterprise Linux (Amazon VPC)</code> | <code>Windows</code>
     * | <code>Windows (Amazon VPC)</code> |
     * <code>Windows with SQL Server Standard</code> |
     * <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     * <code>Windows with SQL Server Web</code> |
     * <code> Windows with SQL Server Web (Amazon VPC)</code> |
     * <code>Windows with SQL Server Enterprise</code> |
     * <code>Windows with SQL Server Enterprise (Amazon VPC)</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-offering-id</code> - The Reserved Instances
     * offering ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scope</code> - The scope of the Reserved Instance (
     * <code>Availability Zone</code> or <code>Region</code>).
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
     *         (for example, one year or three years), in seconds (
     *         <code>31536000</code> | <code>94608000</code>).
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
     *         <code>marketplace</code> - Set to <code>true</code> to show only
     *         Reserved Instance Marketplace offerings. When this filter is not
     *         used, which is the default behavior, all offerings from both AWS
     *         and the Reserved Instance Marketplace are listed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>product-description</code> - The Reserved Instance product
     *         platform description. Instances that include
     *         <code>(Amazon VPC)</code> in the product platform description
     *         will only be displayed to EC2-Classic account holders and are for
     *         use with Amazon VPC. (<code>Linux/UNIX</code> |
     *         <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code> |
     *         <code>SUSE Linux (Amazon VPC)</code> |
     *         <code>Red Hat Enterprise Linux</code> |
     *         <code>Red Hat Enterprise Linux (Amazon VPC)</code> |
     *         <code>Windows</code> | <code>Windows (Amazon VPC)</code> |
     *         <code>Windows with SQL Server Standard</code> |
     *         <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     *         <code>Windows with SQL Server Web</code> |
     *         <code> Windows with SQL Server Web (Amazon VPC)</code> |
     *         <code>Windows with SQL Server Enterprise</code> |
     *         <code>Windows with SQL Server Enterprise (Amazon VPC)</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>reserved-instances-offering-id</code> - The Reserved
     *         Instances offering ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>scope</code> - The scope of the Reserved Instance (
     *         <code>Availability Zone</code> or <code>Region</code>).
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
     * <code>duration</code> - The duration of the Reserved Instance (for
     * example, one year or three years), in seconds (<code>31536000</code> |
     * <code>94608000</code>).
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
     * <code>marketplace</code> - Set to <code>true</code> to show only Reserved
     * Instance Marketplace offerings. When this filter is not used, which is
     * the default behavior, all offerings from both AWS and the Reserved
     * Instance Marketplace are listed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The Reserved Instance product platform
     * description. Instances that include <code>(Amazon VPC)</code> in the
     * product platform description will only be displayed to EC2-Classic
     * account holders and are for use with Amazon VPC. (<code>Linux/UNIX</code>
     * | <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code> |
     * <code>SUSE Linux (Amazon VPC)</code> |
     * <code>Red Hat Enterprise Linux</code> |
     * <code>Red Hat Enterprise Linux (Amazon VPC)</code> | <code>Windows</code>
     * | <code>Windows (Amazon VPC)</code> |
     * <code>Windows with SQL Server Standard</code> |
     * <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     * <code>Windows with SQL Server Web</code> |
     * <code> Windows with SQL Server Web (Amazon VPC)</code> |
     * <code>Windows with SQL Server Enterprise</code> |
     * <code>Windows with SQL Server Enterprise (Amazon VPC)</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-offering-id</code> - The Reserved Instances
     * offering ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scope</code> - The scope of the Reserved Instance (
     * <code>Availability Zone</code> or <code>Region</code>).
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
     *            (for example, one year or three years), in seconds (
     *            <code>31536000</code> | <code>94608000</code>).
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
     *            <code>marketplace</code> - Set to <code>true</code> to show
     *            only Reserved Instance Marketplace offerings. When this filter
     *            is not used, which is the default behavior, all offerings from
     *            both AWS and the Reserved Instance Marketplace are listed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>product-description</code> - The Reserved Instance
     *            product platform description. Instances that include
     *            <code>(Amazon VPC)</code> in the product platform description
     *            will only be displayed to EC2-Classic account holders and are
     *            for use with Amazon VPC. (<code>Linux/UNIX</code> |
     *            <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code>
     *            | <code>SUSE Linux (Amazon VPC)</code> |
     *            <code>Red Hat Enterprise Linux</code> |
     *            <code>Red Hat Enterprise Linux (Amazon VPC)</code> |
     *            <code>Windows</code> | <code>Windows (Amazon VPC)</code> |
     *            <code>Windows with SQL Server Standard</code> |
     *            <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     *            <code>Windows with SQL Server Web</code> |
     *            <code> Windows with SQL Server Web (Amazon VPC)</code> |
     *            <code>Windows with SQL Server Enterprise</code> |
     *            <code>Windows with SQL Server Enterprise (Amazon VPC)</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>reserved-instances-offering-id</code> - The Reserved
     *            Instances offering ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>scope</code> - The scope of the Reserved Instance (
     *            <code>Availability Zone</code> or <code>Region</code>).
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
     * <code>duration</code> - The duration of the Reserved Instance (for
     * example, one year or three years), in seconds (<code>31536000</code> |
     * <code>94608000</code>).
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
     * <code>marketplace</code> - Set to <code>true</code> to show only Reserved
     * Instance Marketplace offerings. When this filter is not used, which is
     * the default behavior, all offerings from both AWS and the Reserved
     * Instance Marketplace are listed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The Reserved Instance product platform
     * description. Instances that include <code>(Amazon VPC)</code> in the
     * product platform description will only be displayed to EC2-Classic
     * account holders and are for use with Amazon VPC. (<code>Linux/UNIX</code>
     * | <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code> |
     * <code>SUSE Linux (Amazon VPC)</code> |
     * <code>Red Hat Enterprise Linux</code> |
     * <code>Red Hat Enterprise Linux (Amazon VPC)</code> | <code>Windows</code>
     * | <code>Windows (Amazon VPC)</code> |
     * <code>Windows with SQL Server Standard</code> |
     * <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     * <code>Windows with SQL Server Web</code> |
     * <code> Windows with SQL Server Web (Amazon VPC)</code> |
     * <code>Windows with SQL Server Enterprise</code> |
     * <code>Windows with SQL Server Enterprise (Amazon VPC)</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-offering-id</code> - The Reserved Instances
     * offering ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scope</code> - The scope of the Reserved Instance (
     * <code>Availability Zone</code> or <code>Region</code>).
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
     *            (for example, one year or three years), in seconds (
     *            <code>31536000</code> | <code>94608000</code>).
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
     *            <code>marketplace</code> - Set to <code>true</code> to show
     *            only Reserved Instance Marketplace offerings. When this filter
     *            is not used, which is the default behavior, all offerings from
     *            both AWS and the Reserved Instance Marketplace are listed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>product-description</code> - The Reserved Instance
     *            product platform description. Instances that include
     *            <code>(Amazon VPC)</code> in the product platform description
     *            will only be displayed to EC2-Classic account holders and are
     *            for use with Amazon VPC. (<code>Linux/UNIX</code> |
     *            <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code>
     *            | <code>SUSE Linux (Amazon VPC)</code> |
     *            <code>Red Hat Enterprise Linux</code> |
     *            <code>Red Hat Enterprise Linux (Amazon VPC)</code> |
     *            <code>Windows</code> | <code>Windows (Amazon VPC)</code> |
     *            <code>Windows with SQL Server Standard</code> |
     *            <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     *            <code>Windows with SQL Server Web</code> |
     *            <code> Windows with SQL Server Web (Amazon VPC)</code> |
     *            <code>Windows with SQL Server Enterprise</code> |
     *            <code>Windows with SQL Server Enterprise (Amazon VPC)</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>reserved-instances-offering-id</code> - The Reserved
     *            Instances offering ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>scope</code> - The scope of the Reserved Instance (
     *            <code>Availability Zone</code> or <code>Region</code>).
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
    public DescribeReservedInstancesOfferingsRequest withFilters(Filter... filters) {
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
     * <code>duration</code> - The duration of the Reserved Instance (for
     * example, one year or three years), in seconds (<code>31536000</code> |
     * <code>94608000</code>).
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
     * <code>marketplace</code> - Set to <code>true</code> to show only Reserved
     * Instance Marketplace offerings. When this filter is not used, which is
     * the default behavior, all offerings from both AWS and the Reserved
     * Instance Marketplace are listed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The Reserved Instance product platform
     * description. Instances that include <code>(Amazon VPC)</code> in the
     * product platform description will only be displayed to EC2-Classic
     * account holders and are for use with Amazon VPC. (<code>Linux/UNIX</code>
     * | <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code> |
     * <code>SUSE Linux (Amazon VPC)</code> |
     * <code>Red Hat Enterprise Linux</code> |
     * <code>Red Hat Enterprise Linux (Amazon VPC)</code> | <code>Windows</code>
     * | <code>Windows (Amazon VPC)</code> |
     * <code>Windows with SQL Server Standard</code> |
     * <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     * <code>Windows with SQL Server Web</code> |
     * <code> Windows with SQL Server Web (Amazon VPC)</code> |
     * <code>Windows with SQL Server Enterprise</code> |
     * <code>Windows with SQL Server Enterprise (Amazon VPC)</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-offering-id</code> - The Reserved Instances
     * offering ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scope</code> - The scope of the Reserved Instance (
     * <code>Availability Zone</code> or <code>Region</code>).
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
     *            (for example, one year or three years), in seconds (
     *            <code>31536000</code> | <code>94608000</code>).
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
     *            <code>marketplace</code> - Set to <code>true</code> to show
     *            only Reserved Instance Marketplace offerings. When this filter
     *            is not used, which is the default behavior, all offerings from
     *            both AWS and the Reserved Instance Marketplace are listed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>product-description</code> - The Reserved Instance
     *            product platform description. Instances that include
     *            <code>(Amazon VPC)</code> in the product platform description
     *            will only be displayed to EC2-Classic account holders and are
     *            for use with Amazon VPC. (<code>Linux/UNIX</code> |
     *            <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code>
     *            | <code>SUSE Linux (Amazon VPC)</code> |
     *            <code>Red Hat Enterprise Linux</code> |
     *            <code>Red Hat Enterprise Linux (Amazon VPC)</code> |
     *            <code>Windows</code> | <code>Windows (Amazon VPC)</code> |
     *            <code>Windows with SQL Server Standard</code> |
     *            <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     *            <code>Windows with SQL Server Web</code> |
     *            <code> Windows with SQL Server Web (Amazon VPC)</code> |
     *            <code>Windows with SQL Server Enterprise</code> |
     *            <code>Windows with SQL Server Enterprise (Amazon VPC)</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>reserved-instances-offering-id</code> - The Reserved
     *            Instances offering ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>scope</code> - The scope of the Reserved Instance (
     *            <code>Availability Zone</code> or <code>Region</code>).
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
    public DescribeReservedInstancesOfferingsRequest withFilters(
            java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Include Reserved Instance Marketplace offerings in the response.
     * </p>
     *
     * @return <p>
     *         Include Reserved Instance Marketplace offerings in the response.
     *         </p>
     */
    public Boolean isIncludeMarketplace() {
        return includeMarketplace;
    }

    /**
     * <p>
     * Include Reserved Instance Marketplace offerings in the response.
     * </p>
     *
     * @return <p>
     *         Include Reserved Instance Marketplace offerings in the response.
     *         </p>
     */
    public Boolean getIncludeMarketplace() {
        return includeMarketplace;
    }

    /**
     * <p>
     * Include Reserved Instance Marketplace offerings in the response.
     * </p>
     *
     * @param includeMarketplace <p>
     *            Include Reserved Instance Marketplace offerings in the
     *            response.
     *            </p>
     */
    public void setIncludeMarketplace(Boolean includeMarketplace) {
        this.includeMarketplace = includeMarketplace;
    }

    /**
     * <p>
     * Include Reserved Instance Marketplace offerings in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeMarketplace <p>
     *            Include Reserved Instance Marketplace offerings in the
     *            response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedInstancesOfferingsRequest withIncludeMarketplace(
            Boolean includeMarketplace) {
        this.includeMarketplace = includeMarketplace;
        return this;
    }

    /**
     * <p>
     * The instance type that the reservation will cover (for example,
     * <code>m1.small</code>). For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium,
     * t2.large, t2.xlarge, t2.2xlarge, t3.nano, t3.micro, t3.small, t3.medium,
     * t3.large, t3.xlarge, t3.2xlarge, t3a.nano, t3a.micro, t3a.small,
     * t3a.medium, t3a.large, t3a.xlarge, t3a.2xlarge, m1.small, m1.medium,
     * m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge,
     * m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m4.16xlarge,
     * m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge,
     * r3.2xlarge, r3.4xlarge, r3.8xlarge, r4.large, r4.xlarge, r4.2xlarge,
     * r4.4xlarge, r4.8xlarge, r4.16xlarge, r5.large, r5.xlarge, r5.2xlarge,
     * r5.4xlarge, r5.8xlarge, r5.12xlarge, r5.16xlarge, r5.24xlarge, r5.metal,
     * r5a.large, r5a.xlarge, r5a.2xlarge, r5a.4xlarge, r5a.8xlarge,
     * r5a.12xlarge, r5a.16xlarge, r5a.24xlarge, r5d.large, r5d.xlarge,
     * r5d.2xlarge, r5d.4xlarge, r5d.8xlarge, r5d.12xlarge, r5d.16xlarge,
     * r5d.24xlarge, r5d.metal, r5ad.large, r5ad.xlarge, r5ad.2xlarge,
     * r5ad.4xlarge, r5ad.8xlarge, r5ad.12xlarge, r5ad.16xlarge, r5ad.24xlarge,
     * x1.16xlarge, x1.32xlarge, x1e.xlarge, x1e.2xlarge, x1e.4xlarge,
     * x1e.8xlarge, x1e.16xlarge, x1e.32xlarge, i2.xlarge, i2.2xlarge,
     * i2.4xlarge, i2.8xlarge, i3.large, i3.xlarge, i3.2xlarge, i3.4xlarge,
     * i3.8xlarge, i3.16xlarge, i3.metal, i3en.large, i3en.xlarge, i3en.2xlarge,
     * i3en.3xlarge, i3en.6xlarge, i3en.12xlarge, i3en.24xlarge, i3en.metal,
     * hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge,
     * c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge,
     * c4.4xlarge, c4.8xlarge, c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge,
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5d.large,
     * c5d.xlarge, c5d.2xlarge, c5d.4xlarge, c5d.9xlarge, c5d.12xlarge,
     * c5d.18xlarge, c5d.24xlarge, c5d.metal, c5n.large, c5n.xlarge,
     * c5n.2xlarge, c5n.4xlarge, c5n.9xlarge, c5n.18xlarge, cc1.4xlarge,
     * cc2.8xlarge, g2.2xlarge, g2.8xlarge, g3.4xlarge, g3.8xlarge, g3.16xlarge,
     * g3s.xlarge, g4dn.xlarge, g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge,
     * g4dn.12xlarge, g4dn.16xlarge, cg1.4xlarge, p2.xlarge, p2.8xlarge,
     * p2.16xlarge, p3.2xlarge, p3.8xlarge, p3.16xlarge, p3dn.24xlarge,
     * d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge,
     * f1.16xlarge, m5.large, m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge,
     * m5.12xlarge, m5.16xlarge, m5.24xlarge, m5.metal, m5a.large, m5a.xlarge,
     * m5a.2xlarge, m5a.4xlarge, m5a.8xlarge, m5a.12xlarge, m5a.16xlarge,
     * m5a.24xlarge, m5d.large, m5d.xlarge, m5d.2xlarge, m5d.4xlarge,
     * m5d.8xlarge, m5d.12xlarge, m5d.16xlarge, m5d.24xlarge, m5d.metal,
     * m5ad.large, m5ad.xlarge, m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge,
     * m5ad.12xlarge, m5ad.16xlarge, m5ad.24xlarge, h1.2xlarge, h1.4xlarge,
     * h1.8xlarge, h1.16xlarge, z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge,
     * z1d.6xlarge, z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal,
     * u-12tb1.metal, u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large,
     * a1.xlarge, a1.2xlarge, a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge,
     * m5dn.2xlarge, m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge,
     * m5dn.24xlarge, m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge,
     * m5n.8xlarge, m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large,
     * r5dn.xlarge, r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge,
     * r5dn.16xlarge, r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge,
     * r5n.4xlarge, r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge,
     * inf1.xlarge, inf1.2xlarge, inf1.6xlarge, inf1.24xlarge, m6g.metal,
     * m6g.medium, m6g.large, m6g.xlarge, m6g.2xlarge, m6g.4xlarge, m6g.8xlarge,
     * m6g.12xlarge, m6g.16xlarge
     *
     * @return <p>
     *         The instance type that the reservation will cover (for example,
     *         <code>m1.small</code>). For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *         >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     *         </p>
     * @see InstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The instance type that the reservation will cover (for example,
     * <code>m1.small</code>). For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium,
     * t2.large, t2.xlarge, t2.2xlarge, t3.nano, t3.micro, t3.small, t3.medium,
     * t3.large, t3.xlarge, t3.2xlarge, t3a.nano, t3a.micro, t3a.small,
     * t3a.medium, t3a.large, t3a.xlarge, t3a.2xlarge, m1.small, m1.medium,
     * m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge,
     * m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m4.16xlarge,
     * m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge,
     * r3.2xlarge, r3.4xlarge, r3.8xlarge, r4.large, r4.xlarge, r4.2xlarge,
     * r4.4xlarge, r4.8xlarge, r4.16xlarge, r5.large, r5.xlarge, r5.2xlarge,
     * r5.4xlarge, r5.8xlarge, r5.12xlarge, r5.16xlarge, r5.24xlarge, r5.metal,
     * r5a.large, r5a.xlarge, r5a.2xlarge, r5a.4xlarge, r5a.8xlarge,
     * r5a.12xlarge, r5a.16xlarge, r5a.24xlarge, r5d.large, r5d.xlarge,
     * r5d.2xlarge, r5d.4xlarge, r5d.8xlarge, r5d.12xlarge, r5d.16xlarge,
     * r5d.24xlarge, r5d.metal, r5ad.large, r5ad.xlarge, r5ad.2xlarge,
     * r5ad.4xlarge, r5ad.8xlarge, r5ad.12xlarge, r5ad.16xlarge, r5ad.24xlarge,
     * x1.16xlarge, x1.32xlarge, x1e.xlarge, x1e.2xlarge, x1e.4xlarge,
     * x1e.8xlarge, x1e.16xlarge, x1e.32xlarge, i2.xlarge, i2.2xlarge,
     * i2.4xlarge, i2.8xlarge, i3.large, i3.xlarge, i3.2xlarge, i3.4xlarge,
     * i3.8xlarge, i3.16xlarge, i3.metal, i3en.large, i3en.xlarge, i3en.2xlarge,
     * i3en.3xlarge, i3en.6xlarge, i3en.12xlarge, i3en.24xlarge, i3en.metal,
     * hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge,
     * c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge,
     * c4.4xlarge, c4.8xlarge, c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge,
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5d.large,
     * c5d.xlarge, c5d.2xlarge, c5d.4xlarge, c5d.9xlarge, c5d.12xlarge,
     * c5d.18xlarge, c5d.24xlarge, c5d.metal, c5n.large, c5n.xlarge,
     * c5n.2xlarge, c5n.4xlarge, c5n.9xlarge, c5n.18xlarge, cc1.4xlarge,
     * cc2.8xlarge, g2.2xlarge, g2.8xlarge, g3.4xlarge, g3.8xlarge, g3.16xlarge,
     * g3s.xlarge, g4dn.xlarge, g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge,
     * g4dn.12xlarge, g4dn.16xlarge, cg1.4xlarge, p2.xlarge, p2.8xlarge,
     * p2.16xlarge, p3.2xlarge, p3.8xlarge, p3.16xlarge, p3dn.24xlarge,
     * d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge,
     * f1.16xlarge, m5.large, m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge,
     * m5.12xlarge, m5.16xlarge, m5.24xlarge, m5.metal, m5a.large, m5a.xlarge,
     * m5a.2xlarge, m5a.4xlarge, m5a.8xlarge, m5a.12xlarge, m5a.16xlarge,
     * m5a.24xlarge, m5d.large, m5d.xlarge, m5d.2xlarge, m5d.4xlarge,
     * m5d.8xlarge, m5d.12xlarge, m5d.16xlarge, m5d.24xlarge, m5d.metal,
     * m5ad.large, m5ad.xlarge, m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge,
     * m5ad.12xlarge, m5ad.16xlarge, m5ad.24xlarge, h1.2xlarge, h1.4xlarge,
     * h1.8xlarge, h1.16xlarge, z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge,
     * z1d.6xlarge, z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal,
     * u-12tb1.metal, u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large,
     * a1.xlarge, a1.2xlarge, a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge,
     * m5dn.2xlarge, m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge,
     * m5dn.24xlarge, m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge,
     * m5n.8xlarge, m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large,
     * r5dn.xlarge, r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge,
     * r5dn.16xlarge, r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge,
     * r5n.4xlarge, r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge,
     * inf1.xlarge, inf1.2xlarge, inf1.6xlarge, inf1.24xlarge, m6g.metal,
     * m6g.medium, m6g.large, m6g.xlarge, m6g.2xlarge, m6g.4xlarge, m6g.8xlarge,
     * m6g.12xlarge, m6g.16xlarge
     *
     * @param instanceType <p>
     *            The instance type that the reservation will cover (for
     *            example, <code>m1.small</code>). For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *            >Instance Types</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     * @see InstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type that the reservation will cover (for example,
     * <code>m1.small</code>). For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium,
     * t2.large, t2.xlarge, t2.2xlarge, t3.nano, t3.micro, t3.small, t3.medium,
     * t3.large, t3.xlarge, t3.2xlarge, t3a.nano, t3a.micro, t3a.small,
     * t3a.medium, t3a.large, t3a.xlarge, t3a.2xlarge, m1.small, m1.medium,
     * m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge,
     * m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m4.16xlarge,
     * m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge,
     * r3.2xlarge, r3.4xlarge, r3.8xlarge, r4.large, r4.xlarge, r4.2xlarge,
     * r4.4xlarge, r4.8xlarge, r4.16xlarge, r5.large, r5.xlarge, r5.2xlarge,
     * r5.4xlarge, r5.8xlarge, r5.12xlarge, r5.16xlarge, r5.24xlarge, r5.metal,
     * r5a.large, r5a.xlarge, r5a.2xlarge, r5a.4xlarge, r5a.8xlarge,
     * r5a.12xlarge, r5a.16xlarge, r5a.24xlarge, r5d.large, r5d.xlarge,
     * r5d.2xlarge, r5d.4xlarge, r5d.8xlarge, r5d.12xlarge, r5d.16xlarge,
     * r5d.24xlarge, r5d.metal, r5ad.large, r5ad.xlarge, r5ad.2xlarge,
     * r5ad.4xlarge, r5ad.8xlarge, r5ad.12xlarge, r5ad.16xlarge, r5ad.24xlarge,
     * x1.16xlarge, x1.32xlarge, x1e.xlarge, x1e.2xlarge, x1e.4xlarge,
     * x1e.8xlarge, x1e.16xlarge, x1e.32xlarge, i2.xlarge, i2.2xlarge,
     * i2.4xlarge, i2.8xlarge, i3.large, i3.xlarge, i3.2xlarge, i3.4xlarge,
     * i3.8xlarge, i3.16xlarge, i3.metal, i3en.large, i3en.xlarge, i3en.2xlarge,
     * i3en.3xlarge, i3en.6xlarge, i3en.12xlarge, i3en.24xlarge, i3en.metal,
     * hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge,
     * c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge,
     * c4.4xlarge, c4.8xlarge, c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge,
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5d.large,
     * c5d.xlarge, c5d.2xlarge, c5d.4xlarge, c5d.9xlarge, c5d.12xlarge,
     * c5d.18xlarge, c5d.24xlarge, c5d.metal, c5n.large, c5n.xlarge,
     * c5n.2xlarge, c5n.4xlarge, c5n.9xlarge, c5n.18xlarge, cc1.4xlarge,
     * cc2.8xlarge, g2.2xlarge, g2.8xlarge, g3.4xlarge, g3.8xlarge, g3.16xlarge,
     * g3s.xlarge, g4dn.xlarge, g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge,
     * g4dn.12xlarge, g4dn.16xlarge, cg1.4xlarge, p2.xlarge, p2.8xlarge,
     * p2.16xlarge, p3.2xlarge, p3.8xlarge, p3.16xlarge, p3dn.24xlarge,
     * d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge,
     * f1.16xlarge, m5.large, m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge,
     * m5.12xlarge, m5.16xlarge, m5.24xlarge, m5.metal, m5a.large, m5a.xlarge,
     * m5a.2xlarge, m5a.4xlarge, m5a.8xlarge, m5a.12xlarge, m5a.16xlarge,
     * m5a.24xlarge, m5d.large, m5d.xlarge, m5d.2xlarge, m5d.4xlarge,
     * m5d.8xlarge, m5d.12xlarge, m5d.16xlarge, m5d.24xlarge, m5d.metal,
     * m5ad.large, m5ad.xlarge, m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge,
     * m5ad.12xlarge, m5ad.16xlarge, m5ad.24xlarge, h1.2xlarge, h1.4xlarge,
     * h1.8xlarge, h1.16xlarge, z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge,
     * z1d.6xlarge, z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal,
     * u-12tb1.metal, u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large,
     * a1.xlarge, a1.2xlarge, a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge,
     * m5dn.2xlarge, m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge,
     * m5dn.24xlarge, m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge,
     * m5n.8xlarge, m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large,
     * r5dn.xlarge, r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge,
     * r5dn.16xlarge, r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge,
     * r5n.4xlarge, r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge,
     * inf1.xlarge, inf1.2xlarge, inf1.6xlarge, inf1.24xlarge, m6g.metal,
     * m6g.medium, m6g.large, m6g.xlarge, m6g.2xlarge, m6g.4xlarge, m6g.8xlarge,
     * m6g.12xlarge, m6g.16xlarge
     *
     * @param instanceType <p>
     *            The instance type that the reservation will cover (for
     *            example, <code>m1.small</code>). For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *            >Instance Types</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceType
     */
    public DescribeReservedInstancesOfferingsRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The instance type that the reservation will cover (for example,
     * <code>m1.small</code>). For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium,
     * t2.large, t2.xlarge, t2.2xlarge, t3.nano, t3.micro, t3.small, t3.medium,
     * t3.large, t3.xlarge, t3.2xlarge, t3a.nano, t3a.micro, t3a.small,
     * t3a.medium, t3a.large, t3a.xlarge, t3a.2xlarge, m1.small, m1.medium,
     * m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge,
     * m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m4.16xlarge,
     * m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge,
     * r3.2xlarge, r3.4xlarge, r3.8xlarge, r4.large, r4.xlarge, r4.2xlarge,
     * r4.4xlarge, r4.8xlarge, r4.16xlarge, r5.large, r5.xlarge, r5.2xlarge,
     * r5.4xlarge, r5.8xlarge, r5.12xlarge, r5.16xlarge, r5.24xlarge, r5.metal,
     * r5a.large, r5a.xlarge, r5a.2xlarge, r5a.4xlarge, r5a.8xlarge,
     * r5a.12xlarge, r5a.16xlarge, r5a.24xlarge, r5d.large, r5d.xlarge,
     * r5d.2xlarge, r5d.4xlarge, r5d.8xlarge, r5d.12xlarge, r5d.16xlarge,
     * r5d.24xlarge, r5d.metal, r5ad.large, r5ad.xlarge, r5ad.2xlarge,
     * r5ad.4xlarge, r5ad.8xlarge, r5ad.12xlarge, r5ad.16xlarge, r5ad.24xlarge,
     * x1.16xlarge, x1.32xlarge, x1e.xlarge, x1e.2xlarge, x1e.4xlarge,
     * x1e.8xlarge, x1e.16xlarge, x1e.32xlarge, i2.xlarge, i2.2xlarge,
     * i2.4xlarge, i2.8xlarge, i3.large, i3.xlarge, i3.2xlarge, i3.4xlarge,
     * i3.8xlarge, i3.16xlarge, i3.metal, i3en.large, i3en.xlarge, i3en.2xlarge,
     * i3en.3xlarge, i3en.6xlarge, i3en.12xlarge, i3en.24xlarge, i3en.metal,
     * hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge,
     * c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge,
     * c4.4xlarge, c4.8xlarge, c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge,
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5d.large,
     * c5d.xlarge, c5d.2xlarge, c5d.4xlarge, c5d.9xlarge, c5d.12xlarge,
     * c5d.18xlarge, c5d.24xlarge, c5d.metal, c5n.large, c5n.xlarge,
     * c5n.2xlarge, c5n.4xlarge, c5n.9xlarge, c5n.18xlarge, cc1.4xlarge,
     * cc2.8xlarge, g2.2xlarge, g2.8xlarge, g3.4xlarge, g3.8xlarge, g3.16xlarge,
     * g3s.xlarge, g4dn.xlarge, g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge,
     * g4dn.12xlarge, g4dn.16xlarge, cg1.4xlarge, p2.xlarge, p2.8xlarge,
     * p2.16xlarge, p3.2xlarge, p3.8xlarge, p3.16xlarge, p3dn.24xlarge,
     * d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge,
     * f1.16xlarge, m5.large, m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge,
     * m5.12xlarge, m5.16xlarge, m5.24xlarge, m5.metal, m5a.large, m5a.xlarge,
     * m5a.2xlarge, m5a.4xlarge, m5a.8xlarge, m5a.12xlarge, m5a.16xlarge,
     * m5a.24xlarge, m5d.large, m5d.xlarge, m5d.2xlarge, m5d.4xlarge,
     * m5d.8xlarge, m5d.12xlarge, m5d.16xlarge, m5d.24xlarge, m5d.metal,
     * m5ad.large, m5ad.xlarge, m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge,
     * m5ad.12xlarge, m5ad.16xlarge, m5ad.24xlarge, h1.2xlarge, h1.4xlarge,
     * h1.8xlarge, h1.16xlarge, z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge,
     * z1d.6xlarge, z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal,
     * u-12tb1.metal, u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large,
     * a1.xlarge, a1.2xlarge, a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge,
     * m5dn.2xlarge, m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge,
     * m5dn.24xlarge, m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge,
     * m5n.8xlarge, m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large,
     * r5dn.xlarge, r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge,
     * r5dn.16xlarge, r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge,
     * r5n.4xlarge, r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge,
     * inf1.xlarge, inf1.2xlarge, inf1.6xlarge, inf1.24xlarge, m6g.metal,
     * m6g.medium, m6g.large, m6g.xlarge, m6g.2xlarge, m6g.4xlarge, m6g.8xlarge,
     * m6g.12xlarge, m6g.16xlarge
     *
     * @param instanceType <p>
     *            The instance type that the reservation will cover (for
     *            example, <code>m1.small</code>). For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *            >Instance Types</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     * @see InstanceType
     */
    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }

    /**
     * <p>
     * The instance type that the reservation will cover (for example,
     * <code>m1.small</code>). For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium,
     * t2.large, t2.xlarge, t2.2xlarge, t3.nano, t3.micro, t3.small, t3.medium,
     * t3.large, t3.xlarge, t3.2xlarge, t3a.nano, t3a.micro, t3a.small,
     * t3a.medium, t3a.large, t3a.xlarge, t3a.2xlarge, m1.small, m1.medium,
     * m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge,
     * m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m4.16xlarge,
     * m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge,
     * r3.2xlarge, r3.4xlarge, r3.8xlarge, r4.large, r4.xlarge, r4.2xlarge,
     * r4.4xlarge, r4.8xlarge, r4.16xlarge, r5.large, r5.xlarge, r5.2xlarge,
     * r5.4xlarge, r5.8xlarge, r5.12xlarge, r5.16xlarge, r5.24xlarge, r5.metal,
     * r5a.large, r5a.xlarge, r5a.2xlarge, r5a.4xlarge, r5a.8xlarge,
     * r5a.12xlarge, r5a.16xlarge, r5a.24xlarge, r5d.large, r5d.xlarge,
     * r5d.2xlarge, r5d.4xlarge, r5d.8xlarge, r5d.12xlarge, r5d.16xlarge,
     * r5d.24xlarge, r5d.metal, r5ad.large, r5ad.xlarge, r5ad.2xlarge,
     * r5ad.4xlarge, r5ad.8xlarge, r5ad.12xlarge, r5ad.16xlarge, r5ad.24xlarge,
     * x1.16xlarge, x1.32xlarge, x1e.xlarge, x1e.2xlarge, x1e.4xlarge,
     * x1e.8xlarge, x1e.16xlarge, x1e.32xlarge, i2.xlarge, i2.2xlarge,
     * i2.4xlarge, i2.8xlarge, i3.large, i3.xlarge, i3.2xlarge, i3.4xlarge,
     * i3.8xlarge, i3.16xlarge, i3.metal, i3en.large, i3en.xlarge, i3en.2xlarge,
     * i3en.3xlarge, i3en.6xlarge, i3en.12xlarge, i3en.24xlarge, i3en.metal,
     * hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge,
     * c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge,
     * c4.4xlarge, c4.8xlarge, c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge,
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5d.large,
     * c5d.xlarge, c5d.2xlarge, c5d.4xlarge, c5d.9xlarge, c5d.12xlarge,
     * c5d.18xlarge, c5d.24xlarge, c5d.metal, c5n.large, c5n.xlarge,
     * c5n.2xlarge, c5n.4xlarge, c5n.9xlarge, c5n.18xlarge, cc1.4xlarge,
     * cc2.8xlarge, g2.2xlarge, g2.8xlarge, g3.4xlarge, g3.8xlarge, g3.16xlarge,
     * g3s.xlarge, g4dn.xlarge, g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge,
     * g4dn.12xlarge, g4dn.16xlarge, cg1.4xlarge, p2.xlarge, p2.8xlarge,
     * p2.16xlarge, p3.2xlarge, p3.8xlarge, p3.16xlarge, p3dn.24xlarge,
     * d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge,
     * f1.16xlarge, m5.large, m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge,
     * m5.12xlarge, m5.16xlarge, m5.24xlarge, m5.metal, m5a.large, m5a.xlarge,
     * m5a.2xlarge, m5a.4xlarge, m5a.8xlarge, m5a.12xlarge, m5a.16xlarge,
     * m5a.24xlarge, m5d.large, m5d.xlarge, m5d.2xlarge, m5d.4xlarge,
     * m5d.8xlarge, m5d.12xlarge, m5d.16xlarge, m5d.24xlarge, m5d.metal,
     * m5ad.large, m5ad.xlarge, m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge,
     * m5ad.12xlarge, m5ad.16xlarge, m5ad.24xlarge, h1.2xlarge, h1.4xlarge,
     * h1.8xlarge, h1.16xlarge, z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge,
     * z1d.6xlarge, z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal,
     * u-12tb1.metal, u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large,
     * a1.xlarge, a1.2xlarge, a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge,
     * m5dn.2xlarge, m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge,
     * m5dn.24xlarge, m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge,
     * m5n.8xlarge, m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large,
     * r5dn.xlarge, r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge,
     * r5dn.16xlarge, r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge,
     * r5n.4xlarge, r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge,
     * inf1.xlarge, inf1.2xlarge, inf1.6xlarge, inf1.24xlarge, m6g.metal,
     * m6g.medium, m6g.large, m6g.xlarge, m6g.2xlarge, m6g.4xlarge, m6g.8xlarge,
     * m6g.12xlarge, m6g.16xlarge
     *
     * @param instanceType <p>
     *            The instance type that the reservation will cover (for
     *            example, <code>m1.small</code>). For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *            >Instance Types</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceType
     */
    public DescribeReservedInstancesOfferingsRequest withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The maximum duration (in seconds) to filter when searching for offerings.
     * </p>
     * <p>
     * Default: 94608000 (3 years)
     * </p>
     *
     * @return <p>
     *         The maximum duration (in seconds) to filter when searching for
     *         offerings.
     *         </p>
     *         <p>
     *         Default: 94608000 (3 years)
     *         </p>
     */
    public Long getMaxDuration() {
        return maxDuration;
    }

    /**
     * <p>
     * The maximum duration (in seconds) to filter when searching for offerings.
     * </p>
     * <p>
     * Default: 94608000 (3 years)
     * </p>
     *
     * @param maxDuration <p>
     *            The maximum duration (in seconds) to filter when searching for
     *            offerings.
     *            </p>
     *            <p>
     *            Default: 94608000 (3 years)
     *            </p>
     */
    public void setMaxDuration(Long maxDuration) {
        this.maxDuration = maxDuration;
    }

    /**
     * <p>
     * The maximum duration (in seconds) to filter when searching for offerings.
     * </p>
     * <p>
     * Default: 94608000 (3 years)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxDuration <p>
     *            The maximum duration (in seconds) to filter when searching for
     *            offerings.
     *            </p>
     *            <p>
     *            Default: 94608000 (3 years)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedInstancesOfferingsRequest withMaxDuration(Long maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }

    /**
     * <p>
     * The maximum number of instances to filter when searching for offerings.
     * </p>
     * <p>
     * Default: 20
     * </p>
     *
     * @return <p>
     *         The maximum number of instances to filter when searching for
     *         offerings.
     *         </p>
     *         <p>
     *         Default: 20
     *         </p>
     */
    public Integer getMaxInstanceCount() {
        return maxInstanceCount;
    }

    /**
     * <p>
     * The maximum number of instances to filter when searching for offerings.
     * </p>
     * <p>
     * Default: 20
     * </p>
     *
     * @param maxInstanceCount <p>
     *            The maximum number of instances to filter when searching for
     *            offerings.
     *            </p>
     *            <p>
     *            Default: 20
     *            </p>
     */
    public void setMaxInstanceCount(Integer maxInstanceCount) {
        this.maxInstanceCount = maxInstanceCount;
    }

    /**
     * <p>
     * The maximum number of instances to filter when searching for offerings.
     * </p>
     * <p>
     * Default: 20
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxInstanceCount <p>
     *            The maximum number of instances to filter when searching for
     *            offerings.
     *            </p>
     *            <p>
     *            Default: 20
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedInstancesOfferingsRequest withMaxInstanceCount(Integer maxInstanceCount) {
        this.maxInstanceCount = maxInstanceCount;
        return this;
    }

    /**
     * <p>
     * The minimum duration (in seconds) to filter when searching for offerings.
     * </p>
     * <p>
     * Default: 2592000 (1 month)
     * </p>
     *
     * @return <p>
     *         The minimum duration (in seconds) to filter when searching for
     *         offerings.
     *         </p>
     *         <p>
     *         Default: 2592000 (1 month)
     *         </p>
     */
    public Long getMinDuration() {
        return minDuration;
    }

    /**
     * <p>
     * The minimum duration (in seconds) to filter when searching for offerings.
     * </p>
     * <p>
     * Default: 2592000 (1 month)
     * </p>
     *
     * @param minDuration <p>
     *            The minimum duration (in seconds) to filter when searching for
     *            offerings.
     *            </p>
     *            <p>
     *            Default: 2592000 (1 month)
     *            </p>
     */
    public void setMinDuration(Long minDuration) {
        this.minDuration = minDuration;
    }

    /**
     * <p>
     * The minimum duration (in seconds) to filter when searching for offerings.
     * </p>
     * <p>
     * Default: 2592000 (1 month)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minDuration <p>
     *            The minimum duration (in seconds) to filter when searching for
     *            offerings.
     *            </p>
     *            <p>
     *            Default: 2592000 (1 month)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedInstancesOfferingsRequest withMinDuration(Long minDuration) {
        this.minDuration = minDuration;
        return this;
    }

    /**
     * <p>
     * The offering class of the Reserved Instance. Can be <code>standard</code>
     * or <code>convertible</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, convertible
     *
     * @return <p>
     *         The offering class of the Reserved Instance. Can be
     *         <code>standard</code> or <code>convertible</code>.
     *         </p>
     * @see OfferingClassType
     */
    public String getOfferingClass() {
        return offeringClass;
    }

    /**
     * <p>
     * The offering class of the Reserved Instance. Can be <code>standard</code>
     * or <code>convertible</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, convertible
     *
     * @param offeringClass <p>
     *            The offering class of the Reserved Instance. Can be
     *            <code>standard</code> or <code>convertible</code>.
     *            </p>
     * @see OfferingClassType
     */
    public void setOfferingClass(String offeringClass) {
        this.offeringClass = offeringClass;
    }

    /**
     * <p>
     * The offering class of the Reserved Instance. Can be <code>standard</code>
     * or <code>convertible</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, convertible
     *
     * @param offeringClass <p>
     *            The offering class of the Reserved Instance. Can be
     *            <code>standard</code> or <code>convertible</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OfferingClassType
     */
    public DescribeReservedInstancesOfferingsRequest withOfferingClass(String offeringClass) {
        this.offeringClass = offeringClass;
        return this;
    }

    /**
     * <p>
     * The offering class of the Reserved Instance. Can be <code>standard</code>
     * or <code>convertible</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, convertible
     *
     * @param offeringClass <p>
     *            The offering class of the Reserved Instance. Can be
     *            <code>standard</code> or <code>convertible</code>.
     *            </p>
     * @see OfferingClassType
     */
    public void setOfferingClass(OfferingClassType offeringClass) {
        this.offeringClass = offeringClass.toString();
    }

    /**
     * <p>
     * The offering class of the Reserved Instance. Can be <code>standard</code>
     * or <code>convertible</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, convertible
     *
     * @param offeringClass <p>
     *            The offering class of the Reserved Instance. Can be
     *            <code>standard</code> or <code>convertible</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OfferingClassType
     */
    public DescribeReservedInstancesOfferingsRequest withOfferingClass(
            OfferingClassType offeringClass) {
        this.offeringClass = offeringClass.toString();
        return this;
    }

    /**
     * <p>
     * The Reserved Instance product platform description. Instances that
     * include <code>(Amazon VPC)</code> in the description are for use with
     * Amazon VPC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows,
     * Windows (Amazon VPC)
     *
     * @return <p>
     *         The Reserved Instance product platform description. Instances
     *         that include <code>(Amazon VPC)</code> in the description are for
     *         use with Amazon VPC.
     *         </p>
     * @see RIProductDescription
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * <p>
     * The Reserved Instance product platform description. Instances that
     * include <code>(Amazon VPC)</code> in the description are for use with
     * Amazon VPC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows,
     * Windows (Amazon VPC)
     *
     * @param productDescription <p>
     *            The Reserved Instance product platform description. Instances
     *            that include <code>(Amazon VPC)</code> in the description are
     *            for use with Amazon VPC.
     *            </p>
     * @see RIProductDescription
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * <p>
     * The Reserved Instance product platform description. Instances that
     * include <code>(Amazon VPC)</code> in the description are for use with
     * Amazon VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows,
     * Windows (Amazon VPC)
     *
     * @param productDescription <p>
     *            The Reserved Instance product platform description. Instances
     *            that include <code>(Amazon VPC)</code> in the description are
     *            for use with Amazon VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RIProductDescription
     */
    public DescribeReservedInstancesOfferingsRequest withProductDescription(
            String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * <p>
     * The Reserved Instance product platform description. Instances that
     * include <code>(Amazon VPC)</code> in the description are for use with
     * Amazon VPC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows,
     * Windows (Amazon VPC)
     *
     * @param productDescription <p>
     *            The Reserved Instance product platform description. Instances
     *            that include <code>(Amazon VPC)</code> in the description are
     *            for use with Amazon VPC.
     *            </p>
     * @see RIProductDescription
     */
    public void setProductDescription(RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
    }

    /**
     * <p>
     * The Reserved Instance product platform description. Instances that
     * include <code>(Amazon VPC)</code> in the description are for use with
     * Amazon VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows,
     * Windows (Amazon VPC)
     *
     * @param productDescription <p>
     *            The Reserved Instance product platform description. Instances
     *            that include <code>(Amazon VPC)</code> in the description are
     *            for use with Amazon VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RIProductDescription
     */
    public DescribeReservedInstancesOfferingsRequest withProductDescription(
            RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
        return this;
    }

    /**
     * <p>
     * One or more Reserved Instances offering IDs.
     * </p>
     *
     * @return <p>
     *         One or more Reserved Instances offering IDs.
     *         </p>
     */
    public java.util.List<String> getReservedInstancesOfferingIds() {
        return reservedInstancesOfferingIds;
    }

    /**
     * <p>
     * One or more Reserved Instances offering IDs.
     * </p>
     *
     * @param reservedInstancesOfferingIds <p>
     *            One or more Reserved Instances offering IDs.
     *            </p>
     */
    public void setReservedInstancesOfferingIds(
            java.util.Collection<String> reservedInstancesOfferingIds) {
        if (reservedInstancesOfferingIds == null) {
            this.reservedInstancesOfferingIds = null;
            return;
        }

        this.reservedInstancesOfferingIds = new java.util.ArrayList<String>(
                reservedInstancesOfferingIds);
    }

    /**
     * <p>
     * One or more Reserved Instances offering IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstancesOfferingIds <p>
     *            One or more Reserved Instances offering IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedInstancesOfferingsRequest withReservedInstancesOfferingIds(
            String... reservedInstancesOfferingIds) {
        if (getReservedInstancesOfferingIds() == null) {
            this.reservedInstancesOfferingIds = new java.util.ArrayList<String>(
                    reservedInstancesOfferingIds.length);
        }
        for (String value : reservedInstancesOfferingIds) {
            this.reservedInstancesOfferingIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more Reserved Instances offering IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstancesOfferingIds <p>
     *            One or more Reserved Instances offering IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedInstancesOfferingsRequest withReservedInstancesOfferingIds(
            java.util.Collection<String> reservedInstancesOfferingIds) {
        setReservedInstancesOfferingIds(reservedInstancesOfferingIds);
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
    public DescribeReservedInstancesOfferingsRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The tenancy of the instances covered by the reservation. A Reserved
     * Instance with a tenancy of <code>dedicated</code> is applied to instances
     * that run in a VPC on single-tenant hardware (i.e., Dedicated Instances).
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this
     * parameter. Use the <code>default</code> or <code>dedicated</code> values
     * only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @return <p>
     *         The tenancy of the instances covered by the reservation. A
     *         Reserved Instance with a tenancy of <code>dedicated</code> is
     *         applied to instances that run in a VPC on single-tenant hardware
     *         (i.e., Dedicated Instances).
     *         </p>
     *         <p>
     *         <b>Important:</b> The <code>host</code> value cannot be used with
     *         this parameter. Use the <code>default</code> or
     *         <code>dedicated</code> values only.
     *         </p>
     *         <p>
     *         Default: <code>default</code>
     *         </p>
     * @see Tenancy
     */
    public String getInstanceTenancy() {
        return instanceTenancy;
    }

    /**
     * <p>
     * The tenancy of the instances covered by the reservation. A Reserved
     * Instance with a tenancy of <code>dedicated</code> is applied to instances
     * that run in a VPC on single-tenant hardware (i.e., Dedicated Instances).
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this
     * parameter. Use the <code>default</code> or <code>dedicated</code> values
     * only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param instanceTenancy <p>
     *            The tenancy of the instances covered by the reservation. A
     *            Reserved Instance with a tenancy of <code>dedicated</code> is
     *            applied to instances that run in a VPC on single-tenant
     *            hardware (i.e., Dedicated Instances).
     *            </p>
     *            <p>
     *            <b>Important:</b> The <code>host</code> value cannot be used
     *            with this parameter. Use the <code>default</code> or
     *            <code>dedicated</code> values only.
     *            </p>
     *            <p>
     *            Default: <code>default</code>
     *            </p>
     * @see Tenancy
     */
    public void setInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
    }

    /**
     * <p>
     * The tenancy of the instances covered by the reservation. A Reserved
     * Instance with a tenancy of <code>dedicated</code> is applied to instances
     * that run in a VPC on single-tenant hardware (i.e., Dedicated Instances).
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this
     * parameter. Use the <code>default</code> or <code>dedicated</code> values
     * only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param instanceTenancy <p>
     *            The tenancy of the instances covered by the reservation. A
     *            Reserved Instance with a tenancy of <code>dedicated</code> is
     *            applied to instances that run in a VPC on single-tenant
     *            hardware (i.e., Dedicated Instances).
     *            </p>
     *            <p>
     *            <b>Important:</b> The <code>host</code> value cannot be used
     *            with this parameter. Use the <code>default</code> or
     *            <code>dedicated</code> values only.
     *            </p>
     *            <p>
     *            Default: <code>default</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Tenancy
     */
    public DescribeReservedInstancesOfferingsRequest withInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
        return this;
    }

    /**
     * <p>
     * The tenancy of the instances covered by the reservation. A Reserved
     * Instance with a tenancy of <code>dedicated</code> is applied to instances
     * that run in a VPC on single-tenant hardware (i.e., Dedicated Instances).
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this
     * parameter. Use the <code>default</code> or <code>dedicated</code> values
     * only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param instanceTenancy <p>
     *            The tenancy of the instances covered by the reservation. A
     *            Reserved Instance with a tenancy of <code>dedicated</code> is
     *            applied to instances that run in a VPC on single-tenant
     *            hardware (i.e., Dedicated Instances).
     *            </p>
     *            <p>
     *            <b>Important:</b> The <code>host</code> value cannot be used
     *            with this parameter. Use the <code>default</code> or
     *            <code>dedicated</code> values only.
     *            </p>
     *            <p>
     *            Default: <code>default</code>
     *            </p>
     * @see Tenancy
     */
    public void setInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
    }

    /**
     * <p>
     * The tenancy of the instances covered by the reservation. A Reserved
     * Instance with a tenancy of <code>dedicated</code> is applied to instances
     * that run in a VPC on single-tenant hardware (i.e., Dedicated Instances).
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this
     * parameter. Use the <code>default</code> or <code>dedicated</code> values
     * only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param instanceTenancy <p>
     *            The tenancy of the instances covered by the reservation. A
     *            Reserved Instance with a tenancy of <code>dedicated</code> is
     *            applied to instances that run in a VPC on single-tenant
     *            hardware (i.e., Dedicated Instances).
     *            </p>
     *            <p>
     *            <b>Important:</b> The <code>host</code> value cannot be used
     *            with this parameter. Use the <code>default</code> or
     *            <code>dedicated</code> values only.
     *            </p>
     *            <p>
     *            Default: <code>default</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Tenancy
     */
    public DescribeReservedInstancesOfferingsRequest withInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results of the initial request can be seen by sending
     * another request with the returned <code>NextToken</code> value. The
     * maximum is 100.
     * </p>
     * <p>
     * Default: 100
     * </p>
     *
     * @return <p>
     *         The maximum number of results to return for the request in a
     *         single page. The remaining results of the initial request can be
     *         seen by sending another request with the returned
     *         <code>NextToken</code> value. The maximum is 100.
     *         </p>
     *         <p>
     *         Default: 100
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results of the initial request can be seen by sending
     * another request with the returned <code>NextToken</code> value. The
     * maximum is 100.
     * </p>
     * <p>
     * Default: 100
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of results to return for the request in a
     *            single page. The remaining results of the initial request can
     *            be seen by sending another request with the returned
     *            <code>NextToken</code> value. The maximum is 100.
     *            </p>
     *            <p>
     *            Default: 100
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results of the initial request can be seen by sending
     * another request with the returned <code>NextToken</code> value. The
     * maximum is 100.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of results to return for the request in a
     *            single page. The remaining results of the initial request can
     *            be seen by sending another request with the returned
     *            <code>NextToken</code> value. The maximum is 100.
     *            </p>
     *            <p>
     *            Default: 100
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedInstancesOfferingsRequest withMaxResults(Integer maxResults) {
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
    public DescribeReservedInstancesOfferingsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
    public DescribeReservedInstancesOfferingsRequest withOfferingType(String offeringType) {
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
    public DescribeReservedInstancesOfferingsRequest withOfferingType(
            OfferingTypeValues offeringType) {
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getIncludeMarketplace() != null)
            sb.append("IncludeMarketplace: " + getIncludeMarketplace() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getMaxDuration() != null)
            sb.append("MaxDuration: " + getMaxDuration() + ",");
        if (getMaxInstanceCount() != null)
            sb.append("MaxInstanceCount: " + getMaxInstanceCount() + ",");
        if (getMinDuration() != null)
            sb.append("MinDuration: " + getMinDuration() + ",");
        if (getOfferingClass() != null)
            sb.append("OfferingClass: " + getOfferingClass() + ",");
        if (getProductDescription() != null)
            sb.append("ProductDescription: " + getProductDescription() + ",");
        if (getReservedInstancesOfferingIds() != null)
            sb.append("ReservedInstancesOfferingIds: " + getReservedInstancesOfferingIds() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getInstanceTenancy() != null)
            sb.append("InstanceTenancy: " + getInstanceTenancy() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getOfferingType() != null)
            sb.append("OfferingType: " + getOfferingType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode
                + ((getIncludeMarketplace() == null) ? 0 : getIncludeMarketplace().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getMaxDuration() == null) ? 0 : getMaxDuration().hashCode());
        hashCode = prime * hashCode
                + ((getMaxInstanceCount() == null) ? 0 : getMaxInstanceCount().hashCode());
        hashCode = prime * hashCode
                + ((getMinDuration() == null) ? 0 : getMinDuration().hashCode());
        hashCode = prime * hashCode
                + ((getOfferingClass() == null) ? 0 : getOfferingClass().hashCode());
        hashCode = prime * hashCode
                + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getReservedInstancesOfferingIds() == null) ? 0
                        : getReservedInstancesOfferingIds().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceTenancy() == null) ? 0 : getInstanceTenancy().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
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

        if (obj instanceof DescribeReservedInstancesOfferingsRequest == false)
            return false;
        DescribeReservedInstancesOfferingsRequest other = (DescribeReservedInstancesOfferingsRequest) obj;

        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getIncludeMarketplace() == null ^ this.getIncludeMarketplace() == null)
            return false;
        if (other.getIncludeMarketplace() != null
                && other.getIncludeMarketplace().equals(this.getIncludeMarketplace()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getMaxDuration() == null ^ this.getMaxDuration() == null)
            return false;
        if (other.getMaxDuration() != null
                && other.getMaxDuration().equals(this.getMaxDuration()) == false)
            return false;
        if (other.getMaxInstanceCount() == null ^ this.getMaxInstanceCount() == null)
            return false;
        if (other.getMaxInstanceCount() != null
                && other.getMaxInstanceCount().equals(this.getMaxInstanceCount()) == false)
            return false;
        if (other.getMinDuration() == null ^ this.getMinDuration() == null)
            return false;
        if (other.getMinDuration() != null
                && other.getMinDuration().equals(this.getMinDuration()) == false)
            return false;
        if (other.getOfferingClass() == null ^ this.getOfferingClass() == null)
            return false;
        if (other.getOfferingClass() != null
                && other.getOfferingClass().equals(this.getOfferingClass()) == false)
            return false;
        if (other.getProductDescription() == null ^ this.getProductDescription() == null)
            return false;
        if (other.getProductDescription() != null
                && other.getProductDescription().equals(this.getProductDescription()) == false)
            return false;
        if (other.getReservedInstancesOfferingIds() == null
                ^ this.getReservedInstancesOfferingIds() == null)
            return false;
        if (other.getReservedInstancesOfferingIds() != null
                && other.getReservedInstancesOfferingIds().equals(
                        this.getReservedInstancesOfferingIds()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getInstanceTenancy() == null ^ this.getInstanceTenancy() == null)
            return false;
        if (other.getInstanceTenancy() != null
                && other.getInstanceTenancy().equals(this.getInstanceTenancy()) == false)
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
        if (other.getOfferingType() == null ^ this.getOfferingType() == null)
            return false;
        if (other.getOfferingType() != null
                && other.getOfferingType().equals(this.getOfferingType()) == false)
            return false;
        return true;
    }
}
