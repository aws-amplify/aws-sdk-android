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
 * Describes one or more of your network interfaces.
 * </p>
 */
public class DescribeNetworkInterfacesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>addresses.private-ip-address</code> - The private IPv4 addresses
     * associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.primary</code> - Whether the private IPv4 address is the
     * primary IP address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.association.public-ip</code> - The association ID
     * returned when the network interface was associated with the Elastic IP
     * address (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.association.owner-id</code> - The owner ID of the
     * addresses associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.association-id</code> - The association ID returned
     * when the network interface was associated with an IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.allocation-id</code> - The allocation ID returned when
     * you allocated the Elastic IP address (IPv4) for your network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.ip-owner-id</code> - The owner of the Elastic IP
     * address (IPv4) associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.public-ip</code> - The address of the Elastic IP
     * address (IPv4) bound to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.public-dns-name</code> - The public DNS name for the
     * network interface (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.attachment-id</code> - The ID of the interface
     * attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.attach-time</code> - The time that the network interface
     * was attached to an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Indicates whether the
     * attachment is deleted when an instance is terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device-index</code> - The device index to which the
     * network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance to which the
     * network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-owner-id</code> - The owner ID of the instance
     * to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.nat-gateway-id</code> - The ID of the NAT gateway to
     * which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The status of the attachment (
     * <code>attaching</code> | <code>attached</code> | <code>detaching</code> |
     * <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code> - The description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of a security group associated with the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code> - The name of a security group associated with
     * the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-addresses.ipv6-address</code> - An IPv6 address associated
     * with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mac-address</code> - The MAC address of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the network interface
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - The private IPv4 address or addresses
     * of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name</code> - The private DNS name of the network
     * interface (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-id</code> - The ID of the entity that launched the
     * instance on your behalf (for example, AWS Management Console, Auto
     * Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-managed</code> - Indicates whether the network interface
     * is being managed by an AWS service (for example, AWS Management Console,
     * Auto Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-dest-check</code> - Indicates whether the network interface
     * performs source/destination checking. A value of <code>true</code> means
     * checking is enabled, and <code>false</code> means checking is disabled.
     * The value must be <code>false</code> for the network interface to perform
     * network address translation (NAT) in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the network interface. If the network
     * interface is not attached to an instance, the status is
     * <code>available</code>; if a network interface is attached to an instance
     * the status is <code>in-use</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet for the network interface.
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
     * <code>vpc-id</code> - The ID of the VPC for the network interface.
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
     * One or more network interface IDs.
     * </p>
     * <p>
     * Default: Describes all your network interfaces.
     * </p>
     */
    private java.util.List<String> networkInterfaceIds;

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the next
     * set of results. You cannot specify this parameter and the network
     * interface IDs parameter in the same request.
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
     * <code>addresses.private-ip-address</code> - The private IPv4 addresses
     * associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.primary</code> - Whether the private IPv4 address is the
     * primary IP address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.association.public-ip</code> - The association ID
     * returned when the network interface was associated with the Elastic IP
     * address (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.association.owner-id</code> - The owner ID of the
     * addresses associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.association-id</code> - The association ID returned
     * when the network interface was associated with an IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.allocation-id</code> - The allocation ID returned when
     * you allocated the Elastic IP address (IPv4) for your network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.ip-owner-id</code> - The owner of the Elastic IP
     * address (IPv4) associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.public-ip</code> - The address of the Elastic IP
     * address (IPv4) bound to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.public-dns-name</code> - The public DNS name for the
     * network interface (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.attachment-id</code> - The ID of the interface
     * attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.attach-time</code> - The time that the network interface
     * was attached to an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Indicates whether the
     * attachment is deleted when an instance is terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device-index</code> - The device index to which the
     * network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance to which the
     * network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-owner-id</code> - The owner ID of the instance
     * to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.nat-gateway-id</code> - The ID of the NAT gateway to
     * which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The status of the attachment (
     * <code>attaching</code> | <code>attached</code> | <code>detaching</code> |
     * <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code> - The description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of a security group associated with the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code> - The name of a security group associated with
     * the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-addresses.ipv6-address</code> - An IPv6 address associated
     * with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mac-address</code> - The MAC address of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the network interface
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - The private IPv4 address or addresses
     * of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name</code> - The private DNS name of the network
     * interface (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-id</code> - The ID of the entity that launched the
     * instance on your behalf (for example, AWS Management Console, Auto
     * Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-managed</code> - Indicates whether the network interface
     * is being managed by an AWS service (for example, AWS Management Console,
     * Auto Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-dest-check</code> - Indicates whether the network interface
     * performs source/destination checking. A value of <code>true</code> means
     * checking is enabled, and <code>false</code> means checking is disabled.
     * The value must be <code>false</code> for the network interface to perform
     * network address translation (NAT) in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the network interface. If the network
     * interface is not attached to an instance, the status is
     * <code>available</code>; if a network interface is attached to an instance
     * the status is <code>in-use</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet for the network interface.
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
     * <code>vpc-id</code> - The ID of the VPC for the network interface.
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
     *         <code>addresses.private-ip-address</code> - The private IPv4
     *         addresses associated with the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>addresses.primary</code> - Whether the private IPv4 address
     *         is the primary IP address associated with the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>addresses.association.public-ip</code> - The association ID
     *         returned when the network interface was associated with the
     *         Elastic IP address (IPv4).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>addresses.association.owner-id</code> - The owner ID of the
     *         addresses associated with the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>association.association-id</code> - The association ID
     *         returned when the network interface was associated with an IPv4
     *         address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>association.allocation-id</code> - The allocation ID
     *         returned when you allocated the Elastic IP address (IPv4) for
     *         your network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>association.ip-owner-id</code> - The owner of the Elastic
     *         IP address (IPv4) associated with the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>association.public-ip</code> - The address of the Elastic
     *         IP address (IPv4) bound to the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>association.public-dns-name</code> - The public DNS name
     *         for the network interface (IPv4).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.attachment-id</code> - The ID of the interface
     *         attachment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.attach-time</code> - The time that the network
     *         interface was attached to an instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.delete-on-termination</code> - Indicates whether
     *         the attachment is deleted when an instance is terminated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.device-index</code> - The device index to which
     *         the network interface is attached.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.instance-id</code> - The ID of the instance to
     *         which the network interface is attached.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.instance-owner-id</code> - The owner ID of the
     *         instance to which the network interface is attached.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.nat-gateway-id</code> - The ID of the NAT
     *         gateway to which the network interface is attached.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.status</code> - The status of the attachment (
     *         <code>attaching</code> | <code>attached</code> |
     *         <code>detaching</code> | <code>detached</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone of the
     *         network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>description</code> - The description of the network
     *         interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>group-id</code> - The ID of a security group associated
     *         with the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>group-name</code> - The name of a security group associated
     *         with the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ipv6-addresses.ipv6-address</code> - An IPv6 address
     *         associated with the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mac-address</code> - The MAC address of the network
     *         interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface-id</code> - The ID of the network
     *         interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code> - The AWS account ID of the network
     *         interface owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>private-ip-address</code> - The private IPv4 address or
     *         addresses of the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>private-dns-name</code> - The private DNS name of the
     *         network interface (IPv4).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>requester-id</code> - The ID of the entity that launched
     *         the instance on your behalf (for example, AWS Management Console,
     *         Auto Scaling, and so on).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>requester-managed</code> - Indicates whether the network
     *         interface is being managed by an AWS service (for example, AWS
     *         Management Console, Auto Scaling, and so on).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>source-dest-check</code> - Indicates whether the network
     *         interface performs source/destination checking. A value of
     *         <code>true</code> means checking is enabled, and
     *         <code>false</code> means checking is disabled. The value must be
     *         <code>false</code> for the network interface to perform network
     *         address translation (NAT) in your VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status</code> - The status of the network interface. If the
     *         network interface is not attached to an instance, the status is
     *         <code>available</code>; if a network interface is attached to an
     *         instance the status is <code>in-use</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>subnet-id</code> - The ID of the subnet for the network
     *         interface.
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
     *         <code>vpc-id</code> - The ID of the VPC for the network
     *         interface.
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
     * <code>addresses.private-ip-address</code> - The private IPv4 addresses
     * associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.primary</code> - Whether the private IPv4 address is the
     * primary IP address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.association.public-ip</code> - The association ID
     * returned when the network interface was associated with the Elastic IP
     * address (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.association.owner-id</code> - The owner ID of the
     * addresses associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.association-id</code> - The association ID returned
     * when the network interface was associated with an IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.allocation-id</code> - The allocation ID returned when
     * you allocated the Elastic IP address (IPv4) for your network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.ip-owner-id</code> - The owner of the Elastic IP
     * address (IPv4) associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.public-ip</code> - The address of the Elastic IP
     * address (IPv4) bound to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.public-dns-name</code> - The public DNS name for the
     * network interface (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.attachment-id</code> - The ID of the interface
     * attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.attach-time</code> - The time that the network interface
     * was attached to an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Indicates whether the
     * attachment is deleted when an instance is terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device-index</code> - The device index to which the
     * network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance to which the
     * network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-owner-id</code> - The owner ID of the instance
     * to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.nat-gateway-id</code> - The ID of the NAT gateway to
     * which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The status of the attachment (
     * <code>attaching</code> | <code>attached</code> | <code>detaching</code> |
     * <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code> - The description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of a security group associated with the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code> - The name of a security group associated with
     * the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-addresses.ipv6-address</code> - An IPv6 address associated
     * with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mac-address</code> - The MAC address of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the network interface
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - The private IPv4 address or addresses
     * of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name</code> - The private DNS name of the network
     * interface (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-id</code> - The ID of the entity that launched the
     * instance on your behalf (for example, AWS Management Console, Auto
     * Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-managed</code> - Indicates whether the network interface
     * is being managed by an AWS service (for example, AWS Management Console,
     * Auto Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-dest-check</code> - Indicates whether the network interface
     * performs source/destination checking. A value of <code>true</code> means
     * checking is enabled, and <code>false</code> means checking is disabled.
     * The value must be <code>false</code> for the network interface to perform
     * network address translation (NAT) in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the network interface. If the network
     * interface is not attached to an instance, the status is
     * <code>available</code>; if a network interface is attached to an instance
     * the status is <code>in-use</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet for the network interface.
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
     * <code>vpc-id</code> - The ID of the VPC for the network interface.
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
     *            <code>addresses.private-ip-address</code> - The private IPv4
     *            addresses associated with the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>addresses.primary</code> - Whether the private IPv4
     *            address is the primary IP address associated with the network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>addresses.association.public-ip</code> - The association
     *            ID returned when the network interface was associated with the
     *            Elastic IP address (IPv4).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>addresses.association.owner-id</code> - The owner ID of
     *            the addresses associated with the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.association-id</code> - The association ID
     *            returned when the network interface was associated with an
     *            IPv4 address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.allocation-id</code> - The allocation ID
     *            returned when you allocated the Elastic IP address (IPv4) for
     *            your network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.ip-owner-id</code> - The owner of the
     *            Elastic IP address (IPv4) associated with the network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.public-ip</code> - The address of the
     *            Elastic IP address (IPv4) bound to the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.public-dns-name</code> - The public DNS name
     *            for the network interface (IPv4).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.attachment-id</code> - The ID of the
     *            interface attachment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.attach-time</code> - The time that the
     *            network interface was attached to an instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.delete-on-termination</code> - Indicates
     *            whether the attachment is deleted when an instance is
     *            terminated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.device-index</code> - The device index to
     *            which the network interface is attached.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.instance-id</code> - The ID of the instance
     *            to which the network interface is attached.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.instance-owner-id</code> - The owner ID of
     *            the instance to which the network interface is attached.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.nat-gateway-id</code> - The ID of the NAT
     *            gateway to which the network interface is attached.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.status</code> - The status of the attachment
     *            (<code>attaching</code> | <code>attached</code> |
     *            <code>detaching</code> | <code>detached</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone of the
     *            network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>description</code> - The description of the network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>group-id</code> - The ID of a security group associated
     *            with the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>group-name</code> - The name of a security group
     *            associated with the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ipv6-addresses.ipv6-address</code> - An IPv6 address
     *            associated with the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>mac-address</code> - The MAC address of the network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface-id</code> - The ID of the network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The AWS account ID of the network
     *            interface owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>private-ip-address</code> - The private IPv4 address or
     *            addresses of the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>private-dns-name</code> - The private DNS name of the
     *            network interface (IPv4).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>requester-id</code> - The ID of the entity that launched
     *            the instance on your behalf (for example, AWS Management
     *            Console, Auto Scaling, and so on).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>requester-managed</code> - Indicates whether the network
     *            interface is being managed by an AWS service (for example, AWS
     *            Management Console, Auto Scaling, and so on).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>source-dest-check</code> - Indicates whether the network
     *            interface performs source/destination checking. A value of
     *            <code>true</code> means checking is enabled, and
     *            <code>false</code> means checking is disabled. The value must
     *            be <code>false</code> for the network interface to perform
     *            network address translation (NAT) in your VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>status</code> - The status of the network interface. If
     *            the network interface is not attached to an instance, the
     *            status is <code>available</code>; if a network interface is
     *            attached to an instance the status is <code>in-use</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>subnet-id</code> - The ID of the subnet for the network
     *            interface.
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
     *            <code>vpc-id</code> - The ID of the VPC for the network
     *            interface.
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
     * <code>addresses.private-ip-address</code> - The private IPv4 addresses
     * associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.primary</code> - Whether the private IPv4 address is the
     * primary IP address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.association.public-ip</code> - The association ID
     * returned when the network interface was associated with the Elastic IP
     * address (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.association.owner-id</code> - The owner ID of the
     * addresses associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.association-id</code> - The association ID returned
     * when the network interface was associated with an IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.allocation-id</code> - The allocation ID returned when
     * you allocated the Elastic IP address (IPv4) for your network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.ip-owner-id</code> - The owner of the Elastic IP
     * address (IPv4) associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.public-ip</code> - The address of the Elastic IP
     * address (IPv4) bound to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.public-dns-name</code> - The public DNS name for the
     * network interface (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.attachment-id</code> - The ID of the interface
     * attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.attach-time</code> - The time that the network interface
     * was attached to an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Indicates whether the
     * attachment is deleted when an instance is terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device-index</code> - The device index to which the
     * network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance to which the
     * network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-owner-id</code> - The owner ID of the instance
     * to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.nat-gateway-id</code> - The ID of the NAT gateway to
     * which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The status of the attachment (
     * <code>attaching</code> | <code>attached</code> | <code>detaching</code> |
     * <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code> - The description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of a security group associated with the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code> - The name of a security group associated with
     * the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-addresses.ipv6-address</code> - An IPv6 address associated
     * with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mac-address</code> - The MAC address of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the network interface
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - The private IPv4 address or addresses
     * of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name</code> - The private DNS name of the network
     * interface (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-id</code> - The ID of the entity that launched the
     * instance on your behalf (for example, AWS Management Console, Auto
     * Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-managed</code> - Indicates whether the network interface
     * is being managed by an AWS service (for example, AWS Management Console,
     * Auto Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-dest-check</code> - Indicates whether the network interface
     * performs source/destination checking. A value of <code>true</code> means
     * checking is enabled, and <code>false</code> means checking is disabled.
     * The value must be <code>false</code> for the network interface to perform
     * network address translation (NAT) in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the network interface. If the network
     * interface is not attached to an instance, the status is
     * <code>available</code>; if a network interface is attached to an instance
     * the status is <code>in-use</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet for the network interface.
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
     * <code>vpc-id</code> - The ID of the VPC for the network interface.
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
     *            <code>addresses.private-ip-address</code> - The private IPv4
     *            addresses associated with the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>addresses.primary</code> - Whether the private IPv4
     *            address is the primary IP address associated with the network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>addresses.association.public-ip</code> - The association
     *            ID returned when the network interface was associated with the
     *            Elastic IP address (IPv4).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>addresses.association.owner-id</code> - The owner ID of
     *            the addresses associated with the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.association-id</code> - The association ID
     *            returned when the network interface was associated with an
     *            IPv4 address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.allocation-id</code> - The allocation ID
     *            returned when you allocated the Elastic IP address (IPv4) for
     *            your network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.ip-owner-id</code> - The owner of the
     *            Elastic IP address (IPv4) associated with the network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.public-ip</code> - The address of the
     *            Elastic IP address (IPv4) bound to the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.public-dns-name</code> - The public DNS name
     *            for the network interface (IPv4).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.attachment-id</code> - The ID of the
     *            interface attachment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.attach-time</code> - The time that the
     *            network interface was attached to an instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.delete-on-termination</code> - Indicates
     *            whether the attachment is deleted when an instance is
     *            terminated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.device-index</code> - The device index to
     *            which the network interface is attached.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.instance-id</code> - The ID of the instance
     *            to which the network interface is attached.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.instance-owner-id</code> - The owner ID of
     *            the instance to which the network interface is attached.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.nat-gateway-id</code> - The ID of the NAT
     *            gateway to which the network interface is attached.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.status</code> - The status of the attachment
     *            (<code>attaching</code> | <code>attached</code> |
     *            <code>detaching</code> | <code>detached</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone of the
     *            network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>description</code> - The description of the network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>group-id</code> - The ID of a security group associated
     *            with the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>group-name</code> - The name of a security group
     *            associated with the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ipv6-addresses.ipv6-address</code> - An IPv6 address
     *            associated with the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>mac-address</code> - The MAC address of the network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface-id</code> - The ID of the network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The AWS account ID of the network
     *            interface owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>private-ip-address</code> - The private IPv4 address or
     *            addresses of the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>private-dns-name</code> - The private DNS name of the
     *            network interface (IPv4).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>requester-id</code> - The ID of the entity that launched
     *            the instance on your behalf (for example, AWS Management
     *            Console, Auto Scaling, and so on).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>requester-managed</code> - Indicates whether the network
     *            interface is being managed by an AWS service (for example, AWS
     *            Management Console, Auto Scaling, and so on).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>source-dest-check</code> - Indicates whether the network
     *            interface performs source/destination checking. A value of
     *            <code>true</code> means checking is enabled, and
     *            <code>false</code> means checking is disabled. The value must
     *            be <code>false</code> for the network interface to perform
     *            network address translation (NAT) in your VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>status</code> - The status of the network interface. If
     *            the network interface is not attached to an instance, the
     *            status is <code>available</code>; if a network interface is
     *            attached to an instance the status is <code>in-use</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>subnet-id</code> - The ID of the subnet for the network
     *            interface.
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
     *            <code>vpc-id</code> - The ID of the VPC for the network
     *            interface.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNetworkInterfacesRequest withFilters(Filter... filters) {
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
     * <code>addresses.private-ip-address</code> - The private IPv4 addresses
     * associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.primary</code> - Whether the private IPv4 address is the
     * primary IP address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.association.public-ip</code> - The association ID
     * returned when the network interface was associated with the Elastic IP
     * address (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.association.owner-id</code> - The owner ID of the
     * addresses associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.association-id</code> - The association ID returned
     * when the network interface was associated with an IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.allocation-id</code> - The allocation ID returned when
     * you allocated the Elastic IP address (IPv4) for your network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.ip-owner-id</code> - The owner of the Elastic IP
     * address (IPv4) associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.public-ip</code> - The address of the Elastic IP
     * address (IPv4) bound to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.public-dns-name</code> - The public DNS name for the
     * network interface (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.attachment-id</code> - The ID of the interface
     * attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.attach-time</code> - The time that the network interface
     * was attached to an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Indicates whether the
     * attachment is deleted when an instance is terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device-index</code> - The device index to which the
     * network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance to which the
     * network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-owner-id</code> - The owner ID of the instance
     * to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.nat-gateway-id</code> - The ID of the NAT gateway to
     * which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The status of the attachment (
     * <code>attaching</code> | <code>attached</code> | <code>detaching</code> |
     * <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code> - The description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of a security group associated with the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code> - The name of a security group associated with
     * the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-addresses.ipv6-address</code> - An IPv6 address associated
     * with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mac-address</code> - The MAC address of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the network interface
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - The private IPv4 address or addresses
     * of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name</code> - The private DNS name of the network
     * interface (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-id</code> - The ID of the entity that launched the
     * instance on your behalf (for example, AWS Management Console, Auto
     * Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-managed</code> - Indicates whether the network interface
     * is being managed by an AWS service (for example, AWS Management Console,
     * Auto Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-dest-check</code> - Indicates whether the network interface
     * performs source/destination checking. A value of <code>true</code> means
     * checking is enabled, and <code>false</code> means checking is disabled.
     * The value must be <code>false</code> for the network interface to perform
     * network address translation (NAT) in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the network interface. If the network
     * interface is not attached to an instance, the status is
     * <code>available</code>; if a network interface is attached to an instance
     * the status is <code>in-use</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet for the network interface.
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
     * <code>vpc-id</code> - The ID of the VPC for the network interface.
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
     *            <code>addresses.private-ip-address</code> - The private IPv4
     *            addresses associated with the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>addresses.primary</code> - Whether the private IPv4
     *            address is the primary IP address associated with the network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>addresses.association.public-ip</code> - The association
     *            ID returned when the network interface was associated with the
     *            Elastic IP address (IPv4).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>addresses.association.owner-id</code> - The owner ID of
     *            the addresses associated with the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.association-id</code> - The association ID
     *            returned when the network interface was associated with an
     *            IPv4 address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.allocation-id</code> - The allocation ID
     *            returned when you allocated the Elastic IP address (IPv4) for
     *            your network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.ip-owner-id</code> - The owner of the
     *            Elastic IP address (IPv4) associated with the network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.public-ip</code> - The address of the
     *            Elastic IP address (IPv4) bound to the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.public-dns-name</code> - The public DNS name
     *            for the network interface (IPv4).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.attachment-id</code> - The ID of the
     *            interface attachment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.attach-time</code> - The time that the
     *            network interface was attached to an instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.delete-on-termination</code> - Indicates
     *            whether the attachment is deleted when an instance is
     *            terminated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.device-index</code> - The device index to
     *            which the network interface is attached.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.instance-id</code> - The ID of the instance
     *            to which the network interface is attached.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.instance-owner-id</code> - The owner ID of
     *            the instance to which the network interface is attached.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.nat-gateway-id</code> - The ID of the NAT
     *            gateway to which the network interface is attached.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.status</code> - The status of the attachment
     *            (<code>attaching</code> | <code>attached</code> |
     *            <code>detaching</code> | <code>detached</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone of the
     *            network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>description</code> - The description of the network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>group-id</code> - The ID of a security group associated
     *            with the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>group-name</code> - The name of a security group
     *            associated with the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ipv6-addresses.ipv6-address</code> - An IPv6 address
     *            associated with the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>mac-address</code> - The MAC address of the network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface-id</code> - The ID of the network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The AWS account ID of the network
     *            interface owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>private-ip-address</code> - The private IPv4 address or
     *            addresses of the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>private-dns-name</code> - The private DNS name of the
     *            network interface (IPv4).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>requester-id</code> - The ID of the entity that launched
     *            the instance on your behalf (for example, AWS Management
     *            Console, Auto Scaling, and so on).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>requester-managed</code> - Indicates whether the network
     *            interface is being managed by an AWS service (for example, AWS
     *            Management Console, Auto Scaling, and so on).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>source-dest-check</code> - Indicates whether the network
     *            interface performs source/destination checking. A value of
     *            <code>true</code> means checking is enabled, and
     *            <code>false</code> means checking is disabled. The value must
     *            be <code>false</code> for the network interface to perform
     *            network address translation (NAT) in your VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>status</code> - The status of the network interface. If
     *            the network interface is not attached to an instance, the
     *            status is <code>available</code>; if a network interface is
     *            attached to an instance the status is <code>in-use</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>subnet-id</code> - The ID of the subnet for the network
     *            interface.
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
     *            <code>vpc-id</code> - The ID of the VPC for the network
     *            interface.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNetworkInterfacesRequest withFilters(java.util.Collection<Filter> filters) {
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
    public DescribeNetworkInterfacesRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * One or more network interface IDs.
     * </p>
     * <p>
     * Default: Describes all your network interfaces.
     * </p>
     *
     * @return <p>
     *         One or more network interface IDs.
     *         </p>
     *         <p>
     *         Default: Describes all your network interfaces.
     *         </p>
     */
    public java.util.List<String> getNetworkInterfaceIds() {
        return networkInterfaceIds;
    }

    /**
     * <p>
     * One or more network interface IDs.
     * </p>
     * <p>
     * Default: Describes all your network interfaces.
     * </p>
     *
     * @param networkInterfaceIds <p>
     *            One or more network interface IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your network interfaces.
     *            </p>
     */
    public void setNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        if (networkInterfaceIds == null) {
            this.networkInterfaceIds = null;
            return;
        }

        this.networkInterfaceIds = new java.util.ArrayList<String>(networkInterfaceIds);
    }

    /**
     * <p>
     * One or more network interface IDs.
     * </p>
     * <p>
     * Default: Describes all your network interfaces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaceIds <p>
     *            One or more network interface IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your network interfaces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNetworkInterfacesRequest withNetworkInterfaceIds(String... networkInterfaceIds) {
        if (getNetworkInterfaceIds() == null) {
            this.networkInterfaceIds = new java.util.ArrayList<String>(networkInterfaceIds.length);
        }
        for (String value : networkInterfaceIds) {
            this.networkInterfaceIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more network interface IDs.
     * </p>
     * <p>
     * Default: Describes all your network interfaces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaceIds <p>
     *            One or more network interface IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your network interfaces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNetworkInterfacesRequest withNetworkInterfaceIds(
            java.util.Collection<String> networkInterfaceIds) {
        setNetworkInterfaceIds(networkInterfaceIds);
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
    public DescribeNetworkInterfacesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the next
     * set of results. You cannot specify this parameter and the network
     * interface IDs parameter in the same request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     *
     * @return <p>
     *         The maximum number of items to return for this request. The
     *         request returns a token that you can specify in a subsequent call
     *         to get the next set of results. You cannot specify this parameter
     *         and the network interface IDs parameter in the same request.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the next
     * set of results. You cannot specify this parameter and the network
     * interface IDs parameter in the same request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return for this request. The
     *            request returns a token that you can specify in a subsequent
     *            call to get the next set of results. You cannot specify this
     *            parameter and the network interface IDs parameter in the same
     *            request.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the next
     * set of results. You cannot specify this parameter and the network
     * interface IDs parameter in the same request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return for this request. The
     *            request returns a token that you can specify in a subsequent
     *            call to get the next set of results. You cannot specify this
     *            parameter and the network interface IDs parameter in the same
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNetworkInterfacesRequest withMaxResults(Integer maxResults) {
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
        if (getNetworkInterfaceIds() != null)
            sb.append("NetworkInterfaceIds: " + getNetworkInterfaceIds() + ",");
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
                + ((getNetworkInterfaceIds() == null) ? 0 : getNetworkInterfaceIds().hashCode());
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

        if (obj instanceof DescribeNetworkInterfacesRequest == false)
            return false;
        DescribeNetworkInterfacesRequest other = (DescribeNetworkInterfacesRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getNetworkInterfaceIds() == null ^ this.getNetworkInterfaceIds() == null)
            return false;
        if (other.getNetworkInterfaceIds() != null
                && other.getNetworkInterfaceIds().equals(this.getNetworkInterfaceIds()) == false)
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
