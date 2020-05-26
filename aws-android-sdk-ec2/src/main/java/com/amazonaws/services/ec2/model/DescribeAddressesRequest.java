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
 * Describes the specified Elastic IP addresses or all of your Elastic IP
 * addresses.
 * </p>
 * <p>
 * An Elastic IP address is for use in either the EC2-Classic platform or in a
 * VPC. For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"
 * >Elastic IP Addresses</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i>.
 * </p>
 */
public class DescribeAddressesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allocation-id</code> - [EC2-VPC] The allocation ID for the address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association-id</code> - [EC2-VPC] The association ID for the
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>domain</code> - Indicates whether the address is for use in
     * EC2-Classic (<code>standard</code>) or in a VPC (<code>vpc</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance the address is
     * associated with, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-border-group</code> - The location from where the IP
     * address is advertised.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-id</code> - [EC2-VPC] The ID of the network
     * interface that the address is associated with, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-owner-id</code> - The AWS account ID of the
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - [EC2-VPC] The private IP address
     * associated with the Elastic IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public-ip</code> - The Elastic IP address.
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
    private java.util.List<Filter> filters;

    /**
     * <p>
     * One or more Elastic IP addresses.
     * </p>
     * <p>
     * Default: Describes all your Elastic IP addresses.
     * </p>
     */
    private java.util.List<String> publicIps;

    /**
     * <p>
     * [EC2-VPC] Information about the allocation IDs.
     * </p>
     */
    private java.util.List<String> allocationIds;

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
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allocation-id</code> - [EC2-VPC] The allocation ID for the address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association-id</code> - [EC2-VPC] The association ID for the
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>domain</code> - Indicates whether the address is for use in
     * EC2-Classic (<code>standard</code>) or in a VPC (<code>vpc</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance the address is
     * associated with, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-border-group</code> - The location from where the IP
     * address is advertised.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-id</code> - [EC2-VPC] The ID of the network
     * interface that the address is associated with, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-owner-id</code> - The AWS account ID of the
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - [EC2-VPC] The private IP address
     * associated with the Elastic IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public-ip</code> - The Elastic IP address.
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
     *         One or more filters. Filter names and values are case-sensitive.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>allocation-id</code> - [EC2-VPC] The allocation ID for the
     *         address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>association-id</code> - [EC2-VPC] The association ID for
     *         the address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>domain</code> - Indicates whether the address is for use in
     *         EC2-Classic (<code>standard</code>) or in a VPC (<code>vpc</code>
     *         ).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-id</code> - The ID of the instance the address is
     *         associated with, if any.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-border-group</code> - The location from where the
     *         IP address is advertised.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface-id</code> - [EC2-VPC] The ID of the
     *         network interface that the address is associated with, if any.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface-owner-id</code> - The AWS account ID of
     *         the owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>private-ip-address</code> - [EC2-VPC] The private IP
     *         address associated with the Elastic IP address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>public-ip</code> - The Elastic IP address.
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
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allocation-id</code> - [EC2-VPC] The allocation ID for the address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association-id</code> - [EC2-VPC] The association ID for the
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>domain</code> - Indicates whether the address is for use in
     * EC2-Classic (<code>standard</code>) or in a VPC (<code>vpc</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance the address is
     * associated with, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-border-group</code> - The location from where the IP
     * address is advertised.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-id</code> - [EC2-VPC] The ID of the network
     * interface that the address is associated with, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-owner-id</code> - The AWS account ID of the
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - [EC2-VPC] The private IP address
     * associated with the Elastic IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public-ip</code> - The Elastic IP address.
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
     * @param filters <p>
     *            One or more filters. Filter names and values are
     *            case-sensitive.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>allocation-id</code> - [EC2-VPC] The allocation ID for
     *            the address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association-id</code> - [EC2-VPC] The association ID for
     *            the address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>domain</code> - Indicates whether the address is for use
     *            in EC2-Classic (<code>standard</code>) or in a VPC (
     *            <code>vpc</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-id</code> - The ID of the instance the address
     *            is associated with, if any.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-border-group</code> - The location from where
     *            the IP address is advertised.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface-id</code> - [EC2-VPC] The ID of the
     *            network interface that the address is associated with, if any.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface-owner-id</code> - The AWS account ID
     *            of the owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>private-ip-address</code> - [EC2-VPC] The private IP
     *            address associated with the Elastic IP address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>public-ip</code> - The Elastic IP address.
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
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allocation-id</code> - [EC2-VPC] The allocation ID for the address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association-id</code> - [EC2-VPC] The association ID for the
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>domain</code> - Indicates whether the address is for use in
     * EC2-Classic (<code>standard</code>) or in a VPC (<code>vpc</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance the address is
     * associated with, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-border-group</code> - The location from where the IP
     * address is advertised.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-id</code> - [EC2-VPC] The ID of the network
     * interface that the address is associated with, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-owner-id</code> - The AWS account ID of the
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - [EC2-VPC] The private IP address
     * associated with the Elastic IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public-ip</code> - The Elastic IP address.
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
     * @param filters <p>
     *            One or more filters. Filter names and values are
     *            case-sensitive.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>allocation-id</code> - [EC2-VPC] The allocation ID for
     *            the address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association-id</code> - [EC2-VPC] The association ID for
     *            the address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>domain</code> - Indicates whether the address is for use
     *            in EC2-Classic (<code>standard</code>) or in a VPC (
     *            <code>vpc</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-id</code> - The ID of the instance the address
     *            is associated with, if any.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-border-group</code> - The location from where
     *            the IP address is advertised.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface-id</code> - [EC2-VPC] The ID of the
     *            network interface that the address is associated with, if any.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface-owner-id</code> - The AWS account ID
     *            of the owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>private-ip-address</code> - [EC2-VPC] The private IP
     *            address associated with the Elastic IP address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>public-ip</code> - The Elastic IP address.
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
    public DescribeAddressesRequest withFilters(Filter... filters) {
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
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allocation-id</code> - [EC2-VPC] The allocation ID for the address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association-id</code> - [EC2-VPC] The association ID for the
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>domain</code> - Indicates whether the address is for use in
     * EC2-Classic (<code>standard</code>) or in a VPC (<code>vpc</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance the address is
     * associated with, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-border-group</code> - The location from where the IP
     * address is advertised.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-id</code> - [EC2-VPC] The ID of the network
     * interface that the address is associated with, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-owner-id</code> - The AWS account ID of the
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - [EC2-VPC] The private IP address
     * associated with the Elastic IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public-ip</code> - The Elastic IP address.
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
     * @param filters <p>
     *            One or more filters. Filter names and values are
     *            case-sensitive.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>allocation-id</code> - [EC2-VPC] The allocation ID for
     *            the address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association-id</code> - [EC2-VPC] The association ID for
     *            the address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>domain</code> - Indicates whether the address is for use
     *            in EC2-Classic (<code>standard</code>) or in a VPC (
     *            <code>vpc</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-id</code> - The ID of the instance the address
     *            is associated with, if any.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-border-group</code> - The location from where
     *            the IP address is advertised.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface-id</code> - [EC2-VPC] The ID of the
     *            network interface that the address is associated with, if any.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface-owner-id</code> - The AWS account ID
     *            of the owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>private-ip-address</code> - [EC2-VPC] The private IP
     *            address associated with the Elastic IP address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>public-ip</code> - The Elastic IP address.
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
    public DescribeAddressesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * One or more Elastic IP addresses.
     * </p>
     * <p>
     * Default: Describes all your Elastic IP addresses.
     * </p>
     *
     * @return <p>
     *         One or more Elastic IP addresses.
     *         </p>
     *         <p>
     *         Default: Describes all your Elastic IP addresses.
     *         </p>
     */
    public java.util.List<String> getPublicIps() {
        return publicIps;
    }

    /**
     * <p>
     * One or more Elastic IP addresses.
     * </p>
     * <p>
     * Default: Describes all your Elastic IP addresses.
     * </p>
     *
     * @param publicIps <p>
     *            One or more Elastic IP addresses.
     *            </p>
     *            <p>
     *            Default: Describes all your Elastic IP addresses.
     *            </p>
     */
    public void setPublicIps(java.util.Collection<String> publicIps) {
        if (publicIps == null) {
            this.publicIps = null;
            return;
        }

        this.publicIps = new java.util.ArrayList<String>(publicIps);
    }

    /**
     * <p>
     * One or more Elastic IP addresses.
     * </p>
     * <p>
     * Default: Describes all your Elastic IP addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicIps <p>
     *            One or more Elastic IP addresses.
     *            </p>
     *            <p>
     *            Default: Describes all your Elastic IP addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAddressesRequest withPublicIps(String... publicIps) {
        if (getPublicIps() == null) {
            this.publicIps = new java.util.ArrayList<String>(publicIps.length);
        }
        for (String value : publicIps) {
            this.publicIps.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more Elastic IP addresses.
     * </p>
     * <p>
     * Default: Describes all your Elastic IP addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicIps <p>
     *            One or more Elastic IP addresses.
     *            </p>
     *            <p>
     *            Default: Describes all your Elastic IP addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAddressesRequest withPublicIps(java.util.Collection<String> publicIps) {
        setPublicIps(publicIps);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] Information about the allocation IDs.
     * </p>
     *
     * @return <p>
     *         [EC2-VPC] Information about the allocation IDs.
     *         </p>
     */
    public java.util.List<String> getAllocationIds() {
        return allocationIds;
    }

    /**
     * <p>
     * [EC2-VPC] Information about the allocation IDs.
     * </p>
     *
     * @param allocationIds <p>
     *            [EC2-VPC] Information about the allocation IDs.
     *            </p>
     */
    public void setAllocationIds(java.util.Collection<String> allocationIds) {
        if (allocationIds == null) {
            this.allocationIds = null;
            return;
        }

        this.allocationIds = new java.util.ArrayList<String>(allocationIds);
    }

    /**
     * <p>
     * [EC2-VPC] Information about the allocation IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allocationIds <p>
     *            [EC2-VPC] Information about the allocation IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAddressesRequest withAllocationIds(String... allocationIds) {
        if (getAllocationIds() == null) {
            this.allocationIds = new java.util.ArrayList<String>(allocationIds.length);
        }
        for (String value : allocationIds) {
            this.allocationIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] Information about the allocation IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allocationIds <p>
     *            [EC2-VPC] Information about the allocation IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAddressesRequest withAllocationIds(java.util.Collection<String> allocationIds) {
        setAllocationIds(allocationIds);
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
    public DescribeAddressesRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getPublicIps() != null)
            sb.append("PublicIps: " + getPublicIps() + ",");
        if (getAllocationIds() != null)
            sb.append("AllocationIds: " + getAllocationIds() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getPublicIps() == null) ? 0 : getPublicIps().hashCode());
        hashCode = prime * hashCode
                + ((getAllocationIds() == null) ? 0 : getAllocationIds().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAddressesRequest == false)
            return false;
        DescribeAddressesRequest other = (DescribeAddressesRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getPublicIps() == null ^ this.getPublicIps() == null)
            return false;
        if (other.getPublicIps() != null
                && other.getPublicIps().equals(this.getPublicIps()) == false)
            return false;
        if (other.getAllocationIds() == null ^ this.getAllocationIds() == null)
            return false;
        if (other.getAllocationIds() != null
                && other.getAllocationIds().equals(this.getAllocationIds()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
