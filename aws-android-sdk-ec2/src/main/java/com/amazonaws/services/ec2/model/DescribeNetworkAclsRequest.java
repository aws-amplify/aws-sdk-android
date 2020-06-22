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
 * Describes one or more of your network ACLs.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_ACLs.html">Network
 * ACLs</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
 * </p>
 */
public class DescribeNetworkAclsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>association.association-id</code> - The ID of an association ID for
     * the ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.network-acl-id</code> - The ID of the network ACL
     * involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.subnet-id</code> - The ID of the subnet involved in the
     * association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default</code> - Indicates whether the ACL is the default network
     * ACL for the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.cidr</code> - The IPv4 CIDR range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.icmp.code</code> - The ICMP code specified in the entry, if
     * any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.icmp.type</code> - The ICMP type specified in the entry, if
     * any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.ipv6-cidr</code> - The IPv6 CIDR range specified in the
     * entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.port-range.from</code> - The start of the port range
     * specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.port-range.to</code> - The end of the port range specified in
     * the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.protocol</code> - The protocol specified in the entry (
     * <code>tcp</code> | <code>udp</code> | <code>icmp</code> or a protocol
     * number).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.rule-action</code> - Allows or denies the matching traffic (
     * <code>allow</code> | <code>deny</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.rule-number</code> - The number of an entry (in other words,
     * rule) in the set of ACL entries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-acl-id</code> - The ID of the network ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the network
     * ACL.
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
     * <code>vpc-id</code> - The ID of the VPC for the network ACL.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

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
     * One or more network ACL IDs.
     * </p>
     * <p>
     * Default: Describes all your network ACLs.
     * </p>
     */
    private java.util.List<String> networkAclIds;

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
     * <code>association.association-id</code> - The ID of an association ID for
     * the ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.network-acl-id</code> - The ID of the network ACL
     * involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.subnet-id</code> - The ID of the subnet involved in the
     * association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default</code> - Indicates whether the ACL is the default network
     * ACL for the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.cidr</code> - The IPv4 CIDR range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.icmp.code</code> - The ICMP code specified in the entry, if
     * any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.icmp.type</code> - The ICMP type specified in the entry, if
     * any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.ipv6-cidr</code> - The IPv6 CIDR range specified in the
     * entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.port-range.from</code> - The start of the port range
     * specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.port-range.to</code> - The end of the port range specified in
     * the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.protocol</code> - The protocol specified in the entry (
     * <code>tcp</code> | <code>udp</code> | <code>icmp</code> or a protocol
     * number).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.rule-action</code> - Allows or denies the matching traffic (
     * <code>allow</code> | <code>deny</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.rule-number</code> - The number of an entry (in other words,
     * rule) in the set of ACL entries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-acl-id</code> - The ID of the network ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the network
     * ACL.
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
     * <code>vpc-id</code> - The ID of the VPC for the network ACL.
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
     *         <code>association.association-id</code> - The ID of an
     *         association ID for the ACL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>association.network-acl-id</code> - The ID of the network
     *         ACL involved in the association.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>association.subnet-id</code> - The ID of the subnet
     *         involved in the association.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>default</code> - Indicates whether the ACL is the default
     *         network ACL for the VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>entry.cidr</code> - The IPv4 CIDR range specified in the
     *         entry.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>entry.icmp.code</code> - The ICMP code specified in the
     *         entry, if any.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>entry.icmp.type</code> - The ICMP type specified in the
     *         entry, if any.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>entry.ipv6-cidr</code> - The IPv6 CIDR range specified in
     *         the entry.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>entry.port-range.from</code> - The start of the port range
     *         specified in the entry.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>entry.port-range.to</code> - The end of the port range
     *         specified in the entry.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>entry.protocol</code> - The protocol specified in the entry
     *         (<code>tcp</code> | <code>udp</code> | <code>icmp</code> or a
     *         protocol number).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>entry.rule-action</code> - Allows or denies the matching
     *         traffic (<code>allow</code> | <code>deny</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>entry.rule-number</code> - The number of an entry (in other
     *         words, rule) in the set of ACL entries.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-acl-id</code> - The ID of the network ACL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code> - The ID of the AWS account that owns the
     *         network ACL.
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
     *         <code>vpc-id</code> - The ID of the VPC for the network ACL.
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
     * <code>association.association-id</code> - The ID of an association ID for
     * the ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.network-acl-id</code> - The ID of the network ACL
     * involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.subnet-id</code> - The ID of the subnet involved in the
     * association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default</code> - Indicates whether the ACL is the default network
     * ACL for the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.cidr</code> - The IPv4 CIDR range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.icmp.code</code> - The ICMP code specified in the entry, if
     * any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.icmp.type</code> - The ICMP type specified in the entry, if
     * any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.ipv6-cidr</code> - The IPv6 CIDR range specified in the
     * entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.port-range.from</code> - The start of the port range
     * specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.port-range.to</code> - The end of the port range specified in
     * the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.protocol</code> - The protocol specified in the entry (
     * <code>tcp</code> | <code>udp</code> | <code>icmp</code> or a protocol
     * number).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.rule-action</code> - Allows or denies the matching traffic (
     * <code>allow</code> | <code>deny</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.rule-number</code> - The number of an entry (in other words,
     * rule) in the set of ACL entries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-acl-id</code> - The ID of the network ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the network
     * ACL.
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
     * <code>vpc-id</code> - The ID of the VPC for the network ACL.
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
     *            <code>association.association-id</code> - The ID of an
     *            association ID for the ACL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.network-acl-id</code> - The ID of the
     *            network ACL involved in the association.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.subnet-id</code> - The ID of the subnet
     *            involved in the association.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>default</code> - Indicates whether the ACL is the
     *            default network ACL for the VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.cidr</code> - The IPv4 CIDR range specified in the
     *            entry.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.icmp.code</code> - The ICMP code specified in the
     *            entry, if any.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.icmp.type</code> - The ICMP type specified in the
     *            entry, if any.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.ipv6-cidr</code> - The IPv6 CIDR range specified
     *            in the entry.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.port-range.from</code> - The start of the port
     *            range specified in the entry.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.port-range.to</code> - The end of the port range
     *            specified in the entry.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.protocol</code> - The protocol specified in the
     *            entry (<code>tcp</code> | <code>udp</code> | <code>icmp</code>
     *            or a protocol number).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.rule-action</code> - Allows or denies the matching
     *            traffic (<code>allow</code> | <code>deny</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.rule-number</code> - The number of an entry (in
     *            other words, rule) in the set of ACL entries.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-acl-id</code> - The ID of the network ACL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The ID of the AWS account that owns
     *            the network ACL.
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
     *            <code>vpc-id</code> - The ID of the VPC for the network ACL.
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
     * <code>association.association-id</code> - The ID of an association ID for
     * the ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.network-acl-id</code> - The ID of the network ACL
     * involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.subnet-id</code> - The ID of the subnet involved in the
     * association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default</code> - Indicates whether the ACL is the default network
     * ACL for the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.cidr</code> - The IPv4 CIDR range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.icmp.code</code> - The ICMP code specified in the entry, if
     * any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.icmp.type</code> - The ICMP type specified in the entry, if
     * any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.ipv6-cidr</code> - The IPv6 CIDR range specified in the
     * entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.port-range.from</code> - The start of the port range
     * specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.port-range.to</code> - The end of the port range specified in
     * the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.protocol</code> - The protocol specified in the entry (
     * <code>tcp</code> | <code>udp</code> | <code>icmp</code> or a protocol
     * number).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.rule-action</code> - Allows or denies the matching traffic (
     * <code>allow</code> | <code>deny</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.rule-number</code> - The number of an entry (in other words,
     * rule) in the set of ACL entries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-acl-id</code> - The ID of the network ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the network
     * ACL.
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
     * <code>vpc-id</code> - The ID of the VPC for the network ACL.
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
     *            <code>association.association-id</code> - The ID of an
     *            association ID for the ACL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.network-acl-id</code> - The ID of the
     *            network ACL involved in the association.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.subnet-id</code> - The ID of the subnet
     *            involved in the association.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>default</code> - Indicates whether the ACL is the
     *            default network ACL for the VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.cidr</code> - The IPv4 CIDR range specified in the
     *            entry.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.icmp.code</code> - The ICMP code specified in the
     *            entry, if any.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.icmp.type</code> - The ICMP type specified in the
     *            entry, if any.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.ipv6-cidr</code> - The IPv6 CIDR range specified
     *            in the entry.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.port-range.from</code> - The start of the port
     *            range specified in the entry.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.port-range.to</code> - The end of the port range
     *            specified in the entry.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.protocol</code> - The protocol specified in the
     *            entry (<code>tcp</code> | <code>udp</code> | <code>icmp</code>
     *            or a protocol number).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.rule-action</code> - Allows or denies the matching
     *            traffic (<code>allow</code> | <code>deny</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.rule-number</code> - The number of an entry (in
     *            other words, rule) in the set of ACL entries.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-acl-id</code> - The ID of the network ACL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The ID of the AWS account that owns
     *            the network ACL.
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
     *            <code>vpc-id</code> - The ID of the VPC for the network ACL.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNetworkAclsRequest withFilters(Filter... filters) {
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
     * <code>association.association-id</code> - The ID of an association ID for
     * the ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.network-acl-id</code> - The ID of the network ACL
     * involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.subnet-id</code> - The ID of the subnet involved in the
     * association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default</code> - Indicates whether the ACL is the default network
     * ACL for the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.cidr</code> - The IPv4 CIDR range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.icmp.code</code> - The ICMP code specified in the entry, if
     * any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.icmp.type</code> - The ICMP type specified in the entry, if
     * any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.ipv6-cidr</code> - The IPv6 CIDR range specified in the
     * entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.port-range.from</code> - The start of the port range
     * specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.port-range.to</code> - The end of the port range specified in
     * the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.protocol</code> - The protocol specified in the entry (
     * <code>tcp</code> | <code>udp</code> | <code>icmp</code> or a protocol
     * number).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.rule-action</code> - Allows or denies the matching traffic (
     * <code>allow</code> | <code>deny</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.rule-number</code> - The number of an entry (in other words,
     * rule) in the set of ACL entries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-acl-id</code> - The ID of the network ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the network
     * ACL.
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
     * <code>vpc-id</code> - The ID of the VPC for the network ACL.
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
     *            <code>association.association-id</code> - The ID of an
     *            association ID for the ACL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.network-acl-id</code> - The ID of the
     *            network ACL involved in the association.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.subnet-id</code> - The ID of the subnet
     *            involved in the association.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>default</code> - Indicates whether the ACL is the
     *            default network ACL for the VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.cidr</code> - The IPv4 CIDR range specified in the
     *            entry.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.icmp.code</code> - The ICMP code specified in the
     *            entry, if any.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.icmp.type</code> - The ICMP type specified in the
     *            entry, if any.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.ipv6-cidr</code> - The IPv6 CIDR range specified
     *            in the entry.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.port-range.from</code> - The start of the port
     *            range specified in the entry.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.port-range.to</code> - The end of the port range
     *            specified in the entry.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.protocol</code> - The protocol specified in the
     *            entry (<code>tcp</code> | <code>udp</code> | <code>icmp</code>
     *            or a protocol number).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.rule-action</code> - Allows or denies the matching
     *            traffic (<code>allow</code> | <code>deny</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>entry.rule-number</code> - The number of an entry (in
     *            other words, rule) in the set of ACL entries.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-acl-id</code> - The ID of the network ACL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The ID of the AWS account that owns
     *            the network ACL.
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
     *            <code>vpc-id</code> - The ID of the VPC for the network ACL.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNetworkAclsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
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
    public DescribeNetworkAclsRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * One or more network ACL IDs.
     * </p>
     * <p>
     * Default: Describes all your network ACLs.
     * </p>
     *
     * @return <p>
     *         One or more network ACL IDs.
     *         </p>
     *         <p>
     *         Default: Describes all your network ACLs.
     *         </p>
     */
    public java.util.List<String> getNetworkAclIds() {
        return networkAclIds;
    }

    /**
     * <p>
     * One or more network ACL IDs.
     * </p>
     * <p>
     * Default: Describes all your network ACLs.
     * </p>
     *
     * @param networkAclIds <p>
     *            One or more network ACL IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your network ACLs.
     *            </p>
     */
    public void setNetworkAclIds(java.util.Collection<String> networkAclIds) {
        if (networkAclIds == null) {
            this.networkAclIds = null;
            return;
        }

        this.networkAclIds = new java.util.ArrayList<String>(networkAclIds);
    }

    /**
     * <p>
     * One or more network ACL IDs.
     * </p>
     * <p>
     * Default: Describes all your network ACLs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkAclIds <p>
     *            One or more network ACL IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your network ACLs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNetworkAclsRequest withNetworkAclIds(String... networkAclIds) {
        if (getNetworkAclIds() == null) {
            this.networkAclIds = new java.util.ArrayList<String>(networkAclIds.length);
        }
        for (String value : networkAclIds) {
            this.networkAclIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more network ACL IDs.
     * </p>
     * <p>
     * Default: Describes all your network ACLs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkAclIds <p>
     *            One or more network ACL IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your network ACLs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNetworkAclsRequest withNetworkAclIds(java.util.Collection<String> networkAclIds) {
        setNetworkAclIds(networkAclIds);
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
    public DescribeNetworkAclsRequest withNextToken(String nextToken) {
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
    public DescribeNetworkAclsRequest withMaxResults(Integer maxResults) {
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getNetworkAclIds() != null)
            sb.append("NetworkAclIds: " + getNetworkAclIds() + ",");
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
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkAclIds() == null) ? 0 : getNetworkAclIds().hashCode());
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

        if (obj instanceof DescribeNetworkAclsRequest == false)
            return false;
        DescribeNetworkAclsRequest other = (DescribeNetworkAclsRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getNetworkAclIds() == null ^ this.getNetworkAclIds() == null)
            return false;
        if (other.getNetworkAclIds() != null
                && other.getNetworkAclIds().equals(this.getNetworkAclIds()) == false)
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
