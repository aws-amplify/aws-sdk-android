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
 * Describes one or more of your subnets.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">Your
 * VPC and Subnets</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
 * </p>
 */
public class DescribeSubnetsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone for the subnet.
     * You can also use <code>availabilityZone</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The ID of the Availability Zone for
     * the subnet. You can also use <code>availabilityZoneId</code> as the
     * filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available-ip-address-count</code> - The number of IPv4 addresses in
     * the subnet that are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block</code> - The IPv4 CIDR block of the subnet. The CIDR
     * block you specify must exactly match the subnet's CIDR block for
     * information to be returned for the subnet. You can also use
     * <code>cidr</code> or <code>cidrBlock</code> as the filter names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default-for-az</code> - Indicates whether this is the default
     * subnet for the Availability Zone. You can also use
     * <code>defaultForAz</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An IPv6 CIDR
     * block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.association-id</code> - An association
     * ID for an IPv6 CIDR block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.state</code> - The state of an IPv6
     * CIDR block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the subnet (<code>pending</code> |
     * <code>available</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-arn</code> - The Amazon Resource Name (ARN) of the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet.
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
     * <code>vpc-id</code> - The ID of the VPC for the subnet.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * One or more subnet IDs.
     * </p>
     * <p>
     * Default: Describes all your subnets.
     * </p>
     */
    private java.util.List<String> subnetIds;

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
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone for the subnet.
     * You can also use <code>availabilityZone</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The ID of the Availability Zone for
     * the subnet. You can also use <code>availabilityZoneId</code> as the
     * filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available-ip-address-count</code> - The number of IPv4 addresses in
     * the subnet that are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block</code> - The IPv4 CIDR block of the subnet. The CIDR
     * block you specify must exactly match the subnet's CIDR block for
     * information to be returned for the subnet. You can also use
     * <code>cidr</code> or <code>cidrBlock</code> as the filter names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default-for-az</code> - Indicates whether this is the default
     * subnet for the Availability Zone. You can also use
     * <code>defaultForAz</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An IPv6 CIDR
     * block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.association-id</code> - An association
     * ID for an IPv6 CIDR block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.state</code> - The state of an IPv6
     * CIDR block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the subnet (<code>pending</code> |
     * <code>available</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-arn</code> - The Amazon Resource Name (ARN) of the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet.
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
     * <code>vpc-id</code> - The ID of the VPC for the subnet.
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
     *         <code>availability-zone</code> - The Availability Zone for the
     *         subnet. You can also use <code>availabilityZone</code> as the
     *         filter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>availability-zone-id</code> - The ID of the Availability
     *         Zone for the subnet. You can also use
     *         <code>availabilityZoneId</code> as the filter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available-ip-address-count</code> - The number of IPv4
     *         addresses in the subnet that are available.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cidr-block</code> - The IPv4 CIDR block of the subnet. The
     *         CIDR block you specify must exactly match the subnet's CIDR block
     *         for information to be returned for the subnet. You can also use
     *         <code>cidr</code> or <code>cidrBlock</code> as the filter names.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>default-for-az</code> - Indicates whether this is the
     *         default subnet for the Availability Zone. You can also use
     *         <code>defaultForAz</code> as the filter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An
     *         IPv6 CIDR block associated with the subnet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ipv6-cidr-block-association.association-id</code> - An
     *         association ID for an IPv6 CIDR block associated with the subnet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ipv6-cidr-block-association.state</code> - The state of an
     *         IPv6 CIDR block associated with the subnet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code> - The ID of the AWS account that owns the
     *         subnet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the subnet (
     *         <code>pending</code> | <code>available</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>subnet-arn</code> - The Amazon Resource Name (ARN) of the
     *         subnet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>subnet-id</code> - The ID of the subnet.
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
     *         <code>vpc-id</code> - The ID of the VPC for the subnet.
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
     * <code>availability-zone</code> - The Availability Zone for the subnet.
     * You can also use <code>availabilityZone</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The ID of the Availability Zone for
     * the subnet. You can also use <code>availabilityZoneId</code> as the
     * filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available-ip-address-count</code> - The number of IPv4 addresses in
     * the subnet that are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block</code> - The IPv4 CIDR block of the subnet. The CIDR
     * block you specify must exactly match the subnet's CIDR block for
     * information to be returned for the subnet. You can also use
     * <code>cidr</code> or <code>cidrBlock</code> as the filter names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default-for-az</code> - Indicates whether this is the default
     * subnet for the Availability Zone. You can also use
     * <code>defaultForAz</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An IPv6 CIDR
     * block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.association-id</code> - An association
     * ID for an IPv6 CIDR block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.state</code> - The state of an IPv6
     * CIDR block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the subnet (<code>pending</code> |
     * <code>available</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-arn</code> - The Amazon Resource Name (ARN) of the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet.
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
     * <code>vpc-id</code> - The ID of the VPC for the subnet.
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
     *            <code>availability-zone</code> - The Availability Zone for the
     *            subnet. You can also use <code>availabilityZone</code> as the
     *            filter name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone-id</code> - The ID of the Availability
     *            Zone for the subnet. You can also use
     *            <code>availabilityZoneId</code> as the filter name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available-ip-address-count</code> - The number of IPv4
     *            addresses in the subnet that are available.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>cidr-block</code> - The IPv4 CIDR block of the subnet.
     *            The CIDR block you specify must exactly match the subnet's
     *            CIDR block for information to be returned for the subnet. You
     *            can also use <code>cidr</code> or <code>cidrBlock</code> as
     *            the filter names.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>default-for-az</code> - Indicates whether this is the
     *            default subnet for the Availability Zone. You can also use
     *            <code>defaultForAz</code> as the filter name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An
     *            IPv6 CIDR block associated with the subnet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ipv6-cidr-block-association.association-id</code> - An
     *            association ID for an IPv6 CIDR block associated with the
     *            subnet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ipv6-cidr-block-association.state</code> - The state of
     *            an IPv6 CIDR block associated with the subnet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The ID of the AWS account that owns
     *            the subnet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the subnet (
     *            <code>pending</code> | <code>available</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>subnet-arn</code> - The Amazon Resource Name (ARN) of
     *            the subnet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>subnet-id</code> - The ID of the subnet.
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
     *            <code>vpc-id</code> - The ID of the VPC for the subnet.
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
     * <code>availability-zone</code> - The Availability Zone for the subnet.
     * You can also use <code>availabilityZone</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The ID of the Availability Zone for
     * the subnet. You can also use <code>availabilityZoneId</code> as the
     * filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available-ip-address-count</code> - The number of IPv4 addresses in
     * the subnet that are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block</code> - The IPv4 CIDR block of the subnet. The CIDR
     * block you specify must exactly match the subnet's CIDR block for
     * information to be returned for the subnet. You can also use
     * <code>cidr</code> or <code>cidrBlock</code> as the filter names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default-for-az</code> - Indicates whether this is the default
     * subnet for the Availability Zone. You can also use
     * <code>defaultForAz</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An IPv6 CIDR
     * block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.association-id</code> - An association
     * ID for an IPv6 CIDR block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.state</code> - The state of an IPv6
     * CIDR block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the subnet (<code>pending</code> |
     * <code>available</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-arn</code> - The Amazon Resource Name (ARN) of the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet.
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
     * <code>vpc-id</code> - The ID of the VPC for the subnet.
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
     *            <code>availability-zone</code> - The Availability Zone for the
     *            subnet. You can also use <code>availabilityZone</code> as the
     *            filter name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone-id</code> - The ID of the Availability
     *            Zone for the subnet. You can also use
     *            <code>availabilityZoneId</code> as the filter name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available-ip-address-count</code> - The number of IPv4
     *            addresses in the subnet that are available.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>cidr-block</code> - The IPv4 CIDR block of the subnet.
     *            The CIDR block you specify must exactly match the subnet's
     *            CIDR block for information to be returned for the subnet. You
     *            can also use <code>cidr</code> or <code>cidrBlock</code> as
     *            the filter names.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>default-for-az</code> - Indicates whether this is the
     *            default subnet for the Availability Zone. You can also use
     *            <code>defaultForAz</code> as the filter name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An
     *            IPv6 CIDR block associated with the subnet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ipv6-cidr-block-association.association-id</code> - An
     *            association ID for an IPv6 CIDR block associated with the
     *            subnet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ipv6-cidr-block-association.state</code> - The state of
     *            an IPv6 CIDR block associated with the subnet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The ID of the AWS account that owns
     *            the subnet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the subnet (
     *            <code>pending</code> | <code>available</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>subnet-arn</code> - The Amazon Resource Name (ARN) of
     *            the subnet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>subnet-id</code> - The ID of the subnet.
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
     *            <code>vpc-id</code> - The ID of the VPC for the subnet.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSubnetsRequest withFilters(Filter... filters) {
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
     * <code>availability-zone</code> - The Availability Zone for the subnet.
     * You can also use <code>availabilityZone</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The ID of the Availability Zone for
     * the subnet. You can also use <code>availabilityZoneId</code> as the
     * filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available-ip-address-count</code> - The number of IPv4 addresses in
     * the subnet that are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block</code> - The IPv4 CIDR block of the subnet. The CIDR
     * block you specify must exactly match the subnet's CIDR block for
     * information to be returned for the subnet. You can also use
     * <code>cidr</code> or <code>cidrBlock</code> as the filter names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default-for-az</code> - Indicates whether this is the default
     * subnet for the Availability Zone. You can also use
     * <code>defaultForAz</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An IPv6 CIDR
     * block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.association-id</code> - An association
     * ID for an IPv6 CIDR block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.state</code> - The state of an IPv6
     * CIDR block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the subnet (<code>pending</code> |
     * <code>available</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-arn</code> - The Amazon Resource Name (ARN) of the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet.
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
     * <code>vpc-id</code> - The ID of the VPC for the subnet.
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
     *            <code>availability-zone</code> - The Availability Zone for the
     *            subnet. You can also use <code>availabilityZone</code> as the
     *            filter name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone-id</code> - The ID of the Availability
     *            Zone for the subnet. You can also use
     *            <code>availabilityZoneId</code> as the filter name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available-ip-address-count</code> - The number of IPv4
     *            addresses in the subnet that are available.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>cidr-block</code> - The IPv4 CIDR block of the subnet.
     *            The CIDR block you specify must exactly match the subnet's
     *            CIDR block for information to be returned for the subnet. You
     *            can also use <code>cidr</code> or <code>cidrBlock</code> as
     *            the filter names.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>default-for-az</code> - Indicates whether this is the
     *            default subnet for the Availability Zone. You can also use
     *            <code>defaultForAz</code> as the filter name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An
     *            IPv6 CIDR block associated with the subnet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ipv6-cidr-block-association.association-id</code> - An
     *            association ID for an IPv6 CIDR block associated with the
     *            subnet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ipv6-cidr-block-association.state</code> - The state of
     *            an IPv6 CIDR block associated with the subnet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The ID of the AWS account that owns
     *            the subnet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the subnet (
     *            <code>pending</code> | <code>available</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>subnet-arn</code> - The Amazon Resource Name (ARN) of
     *            the subnet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>subnet-id</code> - The ID of the subnet.
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
     *            <code>vpc-id</code> - The ID of the VPC for the subnet.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSubnetsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * One or more subnet IDs.
     * </p>
     * <p>
     * Default: Describes all your subnets.
     * </p>
     *
     * @return <p>
     *         One or more subnet IDs.
     *         </p>
     *         <p>
     *         Default: Describes all your subnets.
     *         </p>
     */
    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * One or more subnet IDs.
     * </p>
     * <p>
     * Default: Describes all your subnets.
     * </p>
     *
     * @param subnetIds <p>
     *            One or more subnet IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your subnets.
     *            </p>
     */
    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * One or more subnet IDs.
     * </p>
     * <p>
     * Default: Describes all your subnets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            One or more subnet IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your subnets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSubnetsRequest withSubnetIds(String... subnetIds) {
        if (getSubnetIds() == null) {
            this.subnetIds = new java.util.ArrayList<String>(subnetIds.length);
        }
        for (String value : subnetIds) {
            this.subnetIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more subnet IDs.
     * </p>
     * <p>
     * Default: Describes all your subnets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            One or more subnet IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your subnets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSubnetsRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
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
    public DescribeSubnetsRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
    public DescribeSubnetsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return with a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>nextToken</code> value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSubnetsRequest withMaxResults(Integer maxResults) {
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
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: " + getSubnetIds() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
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

        if (obj instanceof DescribeSubnetsRequest == false)
            return false;
        DescribeSubnetsRequest other = (DescribeSubnetsRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null
                && other.getSubnetIds().equals(this.getSubnetIds()) == false)
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
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
