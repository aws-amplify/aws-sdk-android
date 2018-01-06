/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeNetworkInterfacesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeNetworkInterfaces(DescribeNetworkInterfacesRequest) DescribeNetworkInterfaces operation}.
 * <p>
 * Describes one or more of your network interfaces.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeNetworkInterfaces(DescribeNetworkInterfacesRequest)
 */
public class DescribeNetworkInterfacesRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeNetworkInterfacesRequest> {

    /**
     * One or more network interface IDs. <p>Default: Describes all your
     * network interfaces.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> networkInterfaceIds;

    /**
     * One or more filters. <ul> <li>
     * <p><code>addresses.private-ip-address</code> - The private IP
     * addresses associated with the network interface. </li> <li>
     * <p><code>addresses.primary</code> - Whether the private IP address is
     * the primary IP address associated with the network interface. </li>
     * <li> <p><code>addresses.association.public-ip</code> - The association
     * ID returned when the network interface was associated with the Elastic
     * IP address. </li> <li> <p><code>addresses.association.owner-id</code>
     * - The owner ID of the addresses associated with the network interface.
     * </li> <li> <p><code>association.association-id</code> - The
     * association ID returned when the network interface was associated with
     * an IP address. </li> <li> <p><code>association.allocation-id</code> -
     * The allocation ID returned when you allocated the Elastic IP address
     * for your network interface. </li> <li>
     * <p><code>association.ip-owner-id</code> - The owner of the Elastic IP
     * address associated with the network interface. </li> <li>
     * <p><code>association.public-ip</code> - The address of the Elastic IP
     * address bound to the network interface. </li> <li>
     * <p><code>association.public-dns-name</code> - The public DNS name for
     * the network interface. </li> <li>
     * <p><code>attachment.attachment-id</code> - The ID of the interface
     * attachment. </li> <li> <p><code>attachment.attach.time</code> - The
     * time that the network interface was attached to an instance. </li>
     * <li> <p><code>attachment.delete-on-termination</code> - Indicates
     * whether the attachment is deleted when an instance is terminated.
     * </li> <li> <p><code>attachment.device-index</code> - The device index
     * to which the network interface is attached. </li> <li>
     * <p><code>attachment.instance-id</code> - The ID of the instance to
     * which the network interface is attached. </li> <li>
     * <p><code>attachment.instance-owner-id</code> - The owner ID of the
     * instance to which the network interface is attached. </li> <li>
     * <p><code>attachment.nat-gateway-id</code> - The ID of the NAT gateway
     * to which the network interface is attached. </li> <li>
     * <p><code>attachment.status</code> - The status of the attachment
     * (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>). </li> <li>
     * <p><code>availability-zone</code> - The Availability Zone of the
     * network interface. </li> <li> <p><code>description</code> - The
     * description of the network interface. </li> <li>
     * <p><code>group-id</code> - The ID of a security group associated with
     * the network interface. </li> <li> <p><code>group-name</code> - The
     * name of a security group associated with the network interface. </li>
     * <li> <p><code>mac-address</code> - The MAC address of the network
     * interface. </li> <li> <p><code>network-interface-id</code> - The ID of
     * the network interface. </li> <li> <p><code>owner-id</code> - The AWS
     * account ID of the network interface owner. </li> <li>
     * <p><code>private-ip-address</code> - The private IP address or
     * addresses of the network interface. </li> <li>
     * <p><code>private-dns-name</code> - The private DNS name of the network
     * interface. </li> <li> <p><code>requester-id</code> - The ID of the
     * entity that launched the instance on your behalf (for example, AWS
     * Management Console, Auto Scaling, and so on). </li> <li>
     * <p><code>requester-managed</code> - Indicates whether the network
     * interface is being managed by an AWS service (for example, AWS
     * Management Console, Auto Scaling, and so on). </li> <li>
     * <p><code>source-desk-check</code> - Indicates whether the network
     * interface performs source/destination checking. A value of
     * <code>true</code> means checking is enabled, and <code>false</code>
     * means checking is disabled. The value must be <code>false</code> for
     * the network interface to perform network address translation (NAT) in
     * your VPC. </li> <li> <p><code>status</code> - The status of the
     * network interface. If the network interface is not attached to an
     * instance, the status is <code>available</code>; if a network interface
     * is attached to an instance the status is <code>in-use</code>. </li>
     * <li> <p><code>subnet-id</code> - The ID of the subnet for the network
     * interface. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> -
     * The key/value combination of a tag assigned to the resource. </li>
     * <li> <p><code>tag-key</code> - The key of a tag assigned to the
     * resource. This filter is independent of the <code>tag-value</code>
     * filter. For example, if you use both the filter "tag-key=Purpose" and
     * the filter "tag-value=X", you get any resources assigned both the tag
     * key Purpose (regardless of what the tag's value is), and the tag value
     * X (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC for the
     * network interface. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * One or more network interface IDs. <p>Default: Describes all your
     * network interfaces.
     *
     * @return One or more network interface IDs. <p>Default: Describes all your
     *         network interfaces.
     */
    public java.util.List<String> getNetworkInterfaceIds() {
        if (networkInterfaceIds == null) {
              networkInterfaceIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              networkInterfaceIds.setAutoConstruct(true);
        }
        return networkInterfaceIds;
    }
    
    /**
     * One or more network interface IDs. <p>Default: Describes all your
     * network interfaces.
     *
     * @param networkInterfaceIds One or more network interface IDs. <p>Default: Describes all your
     *         network interfaces.
     */
    public void setNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        if (networkInterfaceIds == null) {
            this.networkInterfaceIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> networkInterfaceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(networkInterfaceIds.size());
        networkInterfaceIdsCopy.addAll(networkInterfaceIds);
        this.networkInterfaceIds = networkInterfaceIdsCopy;
    }
    
    /**
     * One or more network interface IDs. <p>Default: Describes all your
     * network interfaces.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaceIds One or more network interface IDs. <p>Default: Describes all your
     *         network interfaces.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNetworkInterfacesRequest withNetworkInterfaceIds(String... networkInterfaceIds) {
        if (getNetworkInterfaceIds() == null) setNetworkInterfaceIds(new java.util.ArrayList<String>(networkInterfaceIds.length));
        for (String value : networkInterfaceIds) {
            getNetworkInterfaceIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more network interface IDs. <p>Default: Describes all your
     * network interfaces.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaceIds One or more network interface IDs. <p>Default: Describes all your
     *         network interfaces.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNetworkInterfacesRequest withNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        if (networkInterfaceIds == null) {
            this.networkInterfaceIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> networkInterfaceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(networkInterfaceIds.size());
            networkInterfaceIdsCopy.addAll(networkInterfaceIds);
            this.networkInterfaceIds = networkInterfaceIdsCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li>
     * <p><code>addresses.private-ip-address</code> - The private IP
     * addresses associated with the network interface. </li> <li>
     * <p><code>addresses.primary</code> - Whether the private IP address is
     * the primary IP address associated with the network interface. </li>
     * <li> <p><code>addresses.association.public-ip</code> - The association
     * ID returned when the network interface was associated with the Elastic
     * IP address. </li> <li> <p><code>addresses.association.owner-id</code>
     * - The owner ID of the addresses associated with the network interface.
     * </li> <li> <p><code>association.association-id</code> - The
     * association ID returned when the network interface was associated with
     * an IP address. </li> <li> <p><code>association.allocation-id</code> -
     * The allocation ID returned when you allocated the Elastic IP address
     * for your network interface. </li> <li>
     * <p><code>association.ip-owner-id</code> - The owner of the Elastic IP
     * address associated with the network interface. </li> <li>
     * <p><code>association.public-ip</code> - The address of the Elastic IP
     * address bound to the network interface. </li> <li>
     * <p><code>association.public-dns-name</code> - The public DNS name for
     * the network interface. </li> <li>
     * <p><code>attachment.attachment-id</code> - The ID of the interface
     * attachment. </li> <li> <p><code>attachment.attach.time</code> - The
     * time that the network interface was attached to an instance. </li>
     * <li> <p><code>attachment.delete-on-termination</code> - Indicates
     * whether the attachment is deleted when an instance is terminated.
     * </li> <li> <p><code>attachment.device-index</code> - The device index
     * to which the network interface is attached. </li> <li>
     * <p><code>attachment.instance-id</code> - The ID of the instance to
     * which the network interface is attached. </li> <li>
     * <p><code>attachment.instance-owner-id</code> - The owner ID of the
     * instance to which the network interface is attached. </li> <li>
     * <p><code>attachment.nat-gateway-id</code> - The ID of the NAT gateway
     * to which the network interface is attached. </li> <li>
     * <p><code>attachment.status</code> - The status of the attachment
     * (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>). </li> <li>
     * <p><code>availability-zone</code> - The Availability Zone of the
     * network interface. </li> <li> <p><code>description</code> - The
     * description of the network interface. </li> <li>
     * <p><code>group-id</code> - The ID of a security group associated with
     * the network interface. </li> <li> <p><code>group-name</code> - The
     * name of a security group associated with the network interface. </li>
     * <li> <p><code>mac-address</code> - The MAC address of the network
     * interface. </li> <li> <p><code>network-interface-id</code> - The ID of
     * the network interface. </li> <li> <p><code>owner-id</code> - The AWS
     * account ID of the network interface owner. </li> <li>
     * <p><code>private-ip-address</code> - The private IP address or
     * addresses of the network interface. </li> <li>
     * <p><code>private-dns-name</code> - The private DNS name of the network
     * interface. </li> <li> <p><code>requester-id</code> - The ID of the
     * entity that launched the instance on your behalf (for example, AWS
     * Management Console, Auto Scaling, and so on). </li> <li>
     * <p><code>requester-managed</code> - Indicates whether the network
     * interface is being managed by an AWS service (for example, AWS
     * Management Console, Auto Scaling, and so on). </li> <li>
     * <p><code>source-desk-check</code> - Indicates whether the network
     * interface performs source/destination checking. A value of
     * <code>true</code> means checking is enabled, and <code>false</code>
     * means checking is disabled. The value must be <code>false</code> for
     * the network interface to perform network address translation (NAT) in
     * your VPC. </li> <li> <p><code>status</code> - The status of the
     * network interface. If the network interface is not attached to an
     * instance, the status is <code>available</code>; if a network interface
     * is attached to an instance the status is <code>in-use</code>. </li>
     * <li> <p><code>subnet-id</code> - The ID of the subnet for the network
     * interface. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> -
     * The key/value combination of a tag assigned to the resource. </li>
     * <li> <p><code>tag-key</code> - The key of a tag assigned to the
     * resource. This filter is independent of the <code>tag-value</code>
     * filter. For example, if you use both the filter "tag-key=Purpose" and
     * the filter "tag-value=X", you get any resources assigned both the tag
     * key Purpose (regardless of what the tag's value is), and the tag value
     * X (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC for the
     * network interface. </li> </ul>
     *
     * @return One or more filters. <ul> <li>
     *         <p><code>addresses.private-ip-address</code> - The private IP
     *         addresses associated with the network interface. </li> <li>
     *         <p><code>addresses.primary</code> - Whether the private IP address is
     *         the primary IP address associated with the network interface. </li>
     *         <li> <p><code>addresses.association.public-ip</code> - The association
     *         ID returned when the network interface was associated with the Elastic
     *         IP address. </li> <li> <p><code>addresses.association.owner-id</code>
     *         - The owner ID of the addresses associated with the network interface.
     *         </li> <li> <p><code>association.association-id</code> - The
     *         association ID returned when the network interface was associated with
     *         an IP address. </li> <li> <p><code>association.allocation-id</code> -
     *         The allocation ID returned when you allocated the Elastic IP address
     *         for your network interface. </li> <li>
     *         <p><code>association.ip-owner-id</code> - The owner of the Elastic IP
     *         address associated with the network interface. </li> <li>
     *         <p><code>association.public-ip</code> - The address of the Elastic IP
     *         address bound to the network interface. </li> <li>
     *         <p><code>association.public-dns-name</code> - The public DNS name for
     *         the network interface. </li> <li>
     *         <p><code>attachment.attachment-id</code> - The ID of the interface
     *         attachment. </li> <li> <p><code>attachment.attach.time</code> - The
     *         time that the network interface was attached to an instance. </li>
     *         <li> <p><code>attachment.delete-on-termination</code> - Indicates
     *         whether the attachment is deleted when an instance is terminated.
     *         </li> <li> <p><code>attachment.device-index</code> - The device index
     *         to which the network interface is attached. </li> <li>
     *         <p><code>attachment.instance-id</code> - The ID of the instance to
     *         which the network interface is attached. </li> <li>
     *         <p><code>attachment.instance-owner-id</code> - The owner ID of the
     *         instance to which the network interface is attached. </li> <li>
     *         <p><code>attachment.nat-gateway-id</code> - The ID of the NAT gateway
     *         to which the network interface is attached. </li> <li>
     *         <p><code>attachment.status</code> - The status of the attachment
     *         (<code>attaching</code> | <code>attached</code> |
     *         <code>detaching</code> | <code>detached</code>). </li> <li>
     *         <p><code>availability-zone</code> - The Availability Zone of the
     *         network interface. </li> <li> <p><code>description</code> - The
     *         description of the network interface. </li> <li>
     *         <p><code>group-id</code> - The ID of a security group associated with
     *         the network interface. </li> <li> <p><code>group-name</code> - The
     *         name of a security group associated with the network interface. </li>
     *         <li> <p><code>mac-address</code> - The MAC address of the network
     *         interface. </li> <li> <p><code>network-interface-id</code> - The ID of
     *         the network interface. </li> <li> <p><code>owner-id</code> - The AWS
     *         account ID of the network interface owner. </li> <li>
     *         <p><code>private-ip-address</code> - The private IP address or
     *         addresses of the network interface. </li> <li>
     *         <p><code>private-dns-name</code> - The private DNS name of the network
     *         interface. </li> <li> <p><code>requester-id</code> - The ID of the
     *         entity that launched the instance on your behalf (for example, AWS
     *         Management Console, Auto Scaling, and so on). </li> <li>
     *         <p><code>requester-managed</code> - Indicates whether the network
     *         interface is being managed by an AWS service (for example, AWS
     *         Management Console, Auto Scaling, and so on). </li> <li>
     *         <p><code>source-desk-check</code> - Indicates whether the network
     *         interface performs source/destination checking. A value of
     *         <code>true</code> means checking is enabled, and <code>false</code>
     *         means checking is disabled. The value must be <code>false</code> for
     *         the network interface to perform network address translation (NAT) in
     *         your VPC. </li> <li> <p><code>status</code> - The status of the
     *         network interface. If the network interface is not attached to an
     *         instance, the status is <code>available</code>; if a network interface
     *         is attached to an instance the status is <code>in-use</code>. </li>
     *         <li> <p><code>subnet-id</code> - The ID of the subnet for the network
     *         interface. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> -
     *         The key/value combination of a tag assigned to the resource. </li>
     *         <li> <p><code>tag-key</code> - The key of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-value</code>
     *         filter. For example, if you use both the filter "tag-key=Purpose" and
     *         the filter "tag-value=X", you get any resources assigned both the tag
     *         key Purpose (regardless of what the tag's value is), and the tag value
     *         X (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC for the
     *         network interface. </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li>
     * <p><code>addresses.private-ip-address</code> - The private IP
     * addresses associated with the network interface. </li> <li>
     * <p><code>addresses.primary</code> - Whether the private IP address is
     * the primary IP address associated with the network interface. </li>
     * <li> <p><code>addresses.association.public-ip</code> - The association
     * ID returned when the network interface was associated with the Elastic
     * IP address. </li> <li> <p><code>addresses.association.owner-id</code>
     * - The owner ID of the addresses associated with the network interface.
     * </li> <li> <p><code>association.association-id</code> - The
     * association ID returned when the network interface was associated with
     * an IP address. </li> <li> <p><code>association.allocation-id</code> -
     * The allocation ID returned when you allocated the Elastic IP address
     * for your network interface. </li> <li>
     * <p><code>association.ip-owner-id</code> - The owner of the Elastic IP
     * address associated with the network interface. </li> <li>
     * <p><code>association.public-ip</code> - The address of the Elastic IP
     * address bound to the network interface. </li> <li>
     * <p><code>association.public-dns-name</code> - The public DNS name for
     * the network interface. </li> <li>
     * <p><code>attachment.attachment-id</code> - The ID of the interface
     * attachment. </li> <li> <p><code>attachment.attach.time</code> - The
     * time that the network interface was attached to an instance. </li>
     * <li> <p><code>attachment.delete-on-termination</code> - Indicates
     * whether the attachment is deleted when an instance is terminated.
     * </li> <li> <p><code>attachment.device-index</code> - The device index
     * to which the network interface is attached. </li> <li>
     * <p><code>attachment.instance-id</code> - The ID of the instance to
     * which the network interface is attached. </li> <li>
     * <p><code>attachment.instance-owner-id</code> - The owner ID of the
     * instance to which the network interface is attached. </li> <li>
     * <p><code>attachment.nat-gateway-id</code> - The ID of the NAT gateway
     * to which the network interface is attached. </li> <li>
     * <p><code>attachment.status</code> - The status of the attachment
     * (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>). </li> <li>
     * <p><code>availability-zone</code> - The Availability Zone of the
     * network interface. </li> <li> <p><code>description</code> - The
     * description of the network interface. </li> <li>
     * <p><code>group-id</code> - The ID of a security group associated with
     * the network interface. </li> <li> <p><code>group-name</code> - The
     * name of a security group associated with the network interface. </li>
     * <li> <p><code>mac-address</code> - The MAC address of the network
     * interface. </li> <li> <p><code>network-interface-id</code> - The ID of
     * the network interface. </li> <li> <p><code>owner-id</code> - The AWS
     * account ID of the network interface owner. </li> <li>
     * <p><code>private-ip-address</code> - The private IP address or
     * addresses of the network interface. </li> <li>
     * <p><code>private-dns-name</code> - The private DNS name of the network
     * interface. </li> <li> <p><code>requester-id</code> - The ID of the
     * entity that launched the instance on your behalf (for example, AWS
     * Management Console, Auto Scaling, and so on). </li> <li>
     * <p><code>requester-managed</code> - Indicates whether the network
     * interface is being managed by an AWS service (for example, AWS
     * Management Console, Auto Scaling, and so on). </li> <li>
     * <p><code>source-desk-check</code> - Indicates whether the network
     * interface performs source/destination checking. A value of
     * <code>true</code> means checking is enabled, and <code>false</code>
     * means checking is disabled. The value must be <code>false</code> for
     * the network interface to perform network address translation (NAT) in
     * your VPC. </li> <li> <p><code>status</code> - The status of the
     * network interface. If the network interface is not attached to an
     * instance, the status is <code>available</code>; if a network interface
     * is attached to an instance the status is <code>in-use</code>. </li>
     * <li> <p><code>subnet-id</code> - The ID of the subnet for the network
     * interface. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> -
     * The key/value combination of a tag assigned to the resource. </li>
     * <li> <p><code>tag-key</code> - The key of a tag assigned to the
     * resource. This filter is independent of the <code>tag-value</code>
     * filter. For example, if you use both the filter "tag-key=Purpose" and
     * the filter "tag-value=X", you get any resources assigned both the tag
     * key Purpose (regardless of what the tag's value is), and the tag value
     * X (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC for the
     * network interface. </li> </ul>
     *
     * @param filters One or more filters. <ul> <li>
     *         <p><code>addresses.private-ip-address</code> - The private IP
     *         addresses associated with the network interface. </li> <li>
     *         <p><code>addresses.primary</code> - Whether the private IP address is
     *         the primary IP address associated with the network interface. </li>
     *         <li> <p><code>addresses.association.public-ip</code> - The association
     *         ID returned when the network interface was associated with the Elastic
     *         IP address. </li> <li> <p><code>addresses.association.owner-id</code>
     *         - The owner ID of the addresses associated with the network interface.
     *         </li> <li> <p><code>association.association-id</code> - The
     *         association ID returned when the network interface was associated with
     *         an IP address. </li> <li> <p><code>association.allocation-id</code> -
     *         The allocation ID returned when you allocated the Elastic IP address
     *         for your network interface. </li> <li>
     *         <p><code>association.ip-owner-id</code> - The owner of the Elastic IP
     *         address associated with the network interface. </li> <li>
     *         <p><code>association.public-ip</code> - The address of the Elastic IP
     *         address bound to the network interface. </li> <li>
     *         <p><code>association.public-dns-name</code> - The public DNS name for
     *         the network interface. </li> <li>
     *         <p><code>attachment.attachment-id</code> - The ID of the interface
     *         attachment. </li> <li> <p><code>attachment.attach.time</code> - The
     *         time that the network interface was attached to an instance. </li>
     *         <li> <p><code>attachment.delete-on-termination</code> - Indicates
     *         whether the attachment is deleted when an instance is terminated.
     *         </li> <li> <p><code>attachment.device-index</code> - The device index
     *         to which the network interface is attached. </li> <li>
     *         <p><code>attachment.instance-id</code> - The ID of the instance to
     *         which the network interface is attached. </li> <li>
     *         <p><code>attachment.instance-owner-id</code> - The owner ID of the
     *         instance to which the network interface is attached. </li> <li>
     *         <p><code>attachment.nat-gateway-id</code> - The ID of the NAT gateway
     *         to which the network interface is attached. </li> <li>
     *         <p><code>attachment.status</code> - The status of the attachment
     *         (<code>attaching</code> | <code>attached</code> |
     *         <code>detaching</code> | <code>detached</code>). </li> <li>
     *         <p><code>availability-zone</code> - The Availability Zone of the
     *         network interface. </li> <li> <p><code>description</code> - The
     *         description of the network interface. </li> <li>
     *         <p><code>group-id</code> - The ID of a security group associated with
     *         the network interface. </li> <li> <p><code>group-name</code> - The
     *         name of a security group associated with the network interface. </li>
     *         <li> <p><code>mac-address</code> - The MAC address of the network
     *         interface. </li> <li> <p><code>network-interface-id</code> - The ID of
     *         the network interface. </li> <li> <p><code>owner-id</code> - The AWS
     *         account ID of the network interface owner. </li> <li>
     *         <p><code>private-ip-address</code> - The private IP address or
     *         addresses of the network interface. </li> <li>
     *         <p><code>private-dns-name</code> - The private DNS name of the network
     *         interface. </li> <li> <p><code>requester-id</code> - The ID of the
     *         entity that launched the instance on your behalf (for example, AWS
     *         Management Console, Auto Scaling, and so on). </li> <li>
     *         <p><code>requester-managed</code> - Indicates whether the network
     *         interface is being managed by an AWS service (for example, AWS
     *         Management Console, Auto Scaling, and so on). </li> <li>
     *         <p><code>source-desk-check</code> - Indicates whether the network
     *         interface performs source/destination checking. A value of
     *         <code>true</code> means checking is enabled, and <code>false</code>
     *         means checking is disabled. The value must be <code>false</code> for
     *         the network interface to perform network address translation (NAT) in
     *         your VPC. </li> <li> <p><code>status</code> - The status of the
     *         network interface. If the network interface is not attached to an
     *         instance, the status is <code>available</code>; if a network interface
     *         is attached to an instance the status is <code>in-use</code>. </li>
     *         <li> <p><code>subnet-id</code> - The ID of the subnet for the network
     *         interface. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> -
     *         The key/value combination of a tag assigned to the resource. </li>
     *         <li> <p><code>tag-key</code> - The key of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-value</code>
     *         filter. For example, if you use both the filter "tag-key=Purpose" and
     *         the filter "tag-value=X", you get any resources assigned both the tag
     *         key Purpose (regardless of what the tag's value is), and the tag value
     *         X (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC for the
     *         network interface. </li> </ul>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * One or more filters. <ul> <li>
     * <p><code>addresses.private-ip-address</code> - The private IP
     * addresses associated with the network interface. </li> <li>
     * <p><code>addresses.primary</code> - Whether the private IP address is
     * the primary IP address associated with the network interface. </li>
     * <li> <p><code>addresses.association.public-ip</code> - The association
     * ID returned when the network interface was associated with the Elastic
     * IP address. </li> <li> <p><code>addresses.association.owner-id</code>
     * - The owner ID of the addresses associated with the network interface.
     * </li> <li> <p><code>association.association-id</code> - The
     * association ID returned when the network interface was associated with
     * an IP address. </li> <li> <p><code>association.allocation-id</code> -
     * The allocation ID returned when you allocated the Elastic IP address
     * for your network interface. </li> <li>
     * <p><code>association.ip-owner-id</code> - The owner of the Elastic IP
     * address associated with the network interface. </li> <li>
     * <p><code>association.public-ip</code> - The address of the Elastic IP
     * address bound to the network interface. </li> <li>
     * <p><code>association.public-dns-name</code> - The public DNS name for
     * the network interface. </li> <li>
     * <p><code>attachment.attachment-id</code> - The ID of the interface
     * attachment. </li> <li> <p><code>attachment.attach.time</code> - The
     * time that the network interface was attached to an instance. </li>
     * <li> <p><code>attachment.delete-on-termination</code> - Indicates
     * whether the attachment is deleted when an instance is terminated.
     * </li> <li> <p><code>attachment.device-index</code> - The device index
     * to which the network interface is attached. </li> <li>
     * <p><code>attachment.instance-id</code> - The ID of the instance to
     * which the network interface is attached. </li> <li>
     * <p><code>attachment.instance-owner-id</code> - The owner ID of the
     * instance to which the network interface is attached. </li> <li>
     * <p><code>attachment.nat-gateway-id</code> - The ID of the NAT gateway
     * to which the network interface is attached. </li> <li>
     * <p><code>attachment.status</code> - The status of the attachment
     * (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>). </li> <li>
     * <p><code>availability-zone</code> - The Availability Zone of the
     * network interface. </li> <li> <p><code>description</code> - The
     * description of the network interface. </li> <li>
     * <p><code>group-id</code> - The ID of a security group associated with
     * the network interface. </li> <li> <p><code>group-name</code> - The
     * name of a security group associated with the network interface. </li>
     * <li> <p><code>mac-address</code> - The MAC address of the network
     * interface. </li> <li> <p><code>network-interface-id</code> - The ID of
     * the network interface. </li> <li> <p><code>owner-id</code> - The AWS
     * account ID of the network interface owner. </li> <li>
     * <p><code>private-ip-address</code> - The private IP address or
     * addresses of the network interface. </li> <li>
     * <p><code>private-dns-name</code> - The private DNS name of the network
     * interface. </li> <li> <p><code>requester-id</code> - The ID of the
     * entity that launched the instance on your behalf (for example, AWS
     * Management Console, Auto Scaling, and so on). </li> <li>
     * <p><code>requester-managed</code> - Indicates whether the network
     * interface is being managed by an AWS service (for example, AWS
     * Management Console, Auto Scaling, and so on). </li> <li>
     * <p><code>source-desk-check</code> - Indicates whether the network
     * interface performs source/destination checking. A value of
     * <code>true</code> means checking is enabled, and <code>false</code>
     * means checking is disabled. The value must be <code>false</code> for
     * the network interface to perform network address translation (NAT) in
     * your VPC. </li> <li> <p><code>status</code> - The status of the
     * network interface. If the network interface is not attached to an
     * instance, the status is <code>available</code>; if a network interface
     * is attached to an instance the status is <code>in-use</code>. </li>
     * <li> <p><code>subnet-id</code> - The ID of the subnet for the network
     * interface. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> -
     * The key/value combination of a tag assigned to the resource. </li>
     * <li> <p><code>tag-key</code> - The key of a tag assigned to the
     * resource. This filter is independent of the <code>tag-value</code>
     * filter. For example, if you use both the filter "tag-key=Purpose" and
     * the filter "tag-value=X", you get any resources assigned both the tag
     * key Purpose (regardless of what the tag's value is), and the tag value
     * X (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC for the
     * network interface. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li>
     *         <p><code>addresses.private-ip-address</code> - The private IP
     *         addresses associated with the network interface. </li> <li>
     *         <p><code>addresses.primary</code> - Whether the private IP address is
     *         the primary IP address associated with the network interface. </li>
     *         <li> <p><code>addresses.association.public-ip</code> - The association
     *         ID returned when the network interface was associated with the Elastic
     *         IP address. </li> <li> <p><code>addresses.association.owner-id</code>
     *         - The owner ID of the addresses associated with the network interface.
     *         </li> <li> <p><code>association.association-id</code> - The
     *         association ID returned when the network interface was associated with
     *         an IP address. </li> <li> <p><code>association.allocation-id</code> -
     *         The allocation ID returned when you allocated the Elastic IP address
     *         for your network interface. </li> <li>
     *         <p><code>association.ip-owner-id</code> - The owner of the Elastic IP
     *         address associated with the network interface. </li> <li>
     *         <p><code>association.public-ip</code> - The address of the Elastic IP
     *         address bound to the network interface. </li> <li>
     *         <p><code>association.public-dns-name</code> - The public DNS name for
     *         the network interface. </li> <li>
     *         <p><code>attachment.attachment-id</code> - The ID of the interface
     *         attachment. </li> <li> <p><code>attachment.attach.time</code> - The
     *         time that the network interface was attached to an instance. </li>
     *         <li> <p><code>attachment.delete-on-termination</code> - Indicates
     *         whether the attachment is deleted when an instance is terminated.
     *         </li> <li> <p><code>attachment.device-index</code> - The device index
     *         to which the network interface is attached. </li> <li>
     *         <p><code>attachment.instance-id</code> - The ID of the instance to
     *         which the network interface is attached. </li> <li>
     *         <p><code>attachment.instance-owner-id</code> - The owner ID of the
     *         instance to which the network interface is attached. </li> <li>
     *         <p><code>attachment.nat-gateway-id</code> - The ID of the NAT gateway
     *         to which the network interface is attached. </li> <li>
     *         <p><code>attachment.status</code> - The status of the attachment
     *         (<code>attaching</code> | <code>attached</code> |
     *         <code>detaching</code> | <code>detached</code>). </li> <li>
     *         <p><code>availability-zone</code> - The Availability Zone of the
     *         network interface. </li> <li> <p><code>description</code> - The
     *         description of the network interface. </li> <li>
     *         <p><code>group-id</code> - The ID of a security group associated with
     *         the network interface. </li> <li> <p><code>group-name</code> - The
     *         name of a security group associated with the network interface. </li>
     *         <li> <p><code>mac-address</code> - The MAC address of the network
     *         interface. </li> <li> <p><code>network-interface-id</code> - The ID of
     *         the network interface. </li> <li> <p><code>owner-id</code> - The AWS
     *         account ID of the network interface owner. </li> <li>
     *         <p><code>private-ip-address</code> - The private IP address or
     *         addresses of the network interface. </li> <li>
     *         <p><code>private-dns-name</code> - The private DNS name of the network
     *         interface. </li> <li> <p><code>requester-id</code> - The ID of the
     *         entity that launched the instance on your behalf (for example, AWS
     *         Management Console, Auto Scaling, and so on). </li> <li>
     *         <p><code>requester-managed</code> - Indicates whether the network
     *         interface is being managed by an AWS service (for example, AWS
     *         Management Console, Auto Scaling, and so on). </li> <li>
     *         <p><code>source-desk-check</code> - Indicates whether the network
     *         interface performs source/destination checking. A value of
     *         <code>true</code> means checking is enabled, and <code>false</code>
     *         means checking is disabled. The value must be <code>false</code> for
     *         the network interface to perform network address translation (NAT) in
     *         your VPC. </li> <li> <p><code>status</code> - The status of the
     *         network interface. If the network interface is not attached to an
     *         instance, the status is <code>available</code>; if a network interface
     *         is attached to an instance the status is <code>in-use</code>. </li>
     *         <li> <p><code>subnet-id</code> - The ID of the subnet for the network
     *         interface. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> -
     *         The key/value combination of a tag assigned to the resource. </li>
     *         <li> <p><code>tag-key</code> - The key of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-value</code>
     *         filter. For example, if you use both the filter "tag-key=Purpose" and
     *         the filter "tag-value=X", you get any resources assigned both the tag
     *         key Purpose (regardless of what the tag's value is), and the tag value
     *         X (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC for the
     *         network interface. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNetworkInterfacesRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li>
     * <p><code>addresses.private-ip-address</code> - The private IP
     * addresses associated with the network interface. </li> <li>
     * <p><code>addresses.primary</code> - Whether the private IP address is
     * the primary IP address associated with the network interface. </li>
     * <li> <p><code>addresses.association.public-ip</code> - The association
     * ID returned when the network interface was associated with the Elastic
     * IP address. </li> <li> <p><code>addresses.association.owner-id</code>
     * - The owner ID of the addresses associated with the network interface.
     * </li> <li> <p><code>association.association-id</code> - The
     * association ID returned when the network interface was associated with
     * an IP address. </li> <li> <p><code>association.allocation-id</code> -
     * The allocation ID returned when you allocated the Elastic IP address
     * for your network interface. </li> <li>
     * <p><code>association.ip-owner-id</code> - The owner of the Elastic IP
     * address associated with the network interface. </li> <li>
     * <p><code>association.public-ip</code> - The address of the Elastic IP
     * address bound to the network interface. </li> <li>
     * <p><code>association.public-dns-name</code> - The public DNS name for
     * the network interface. </li> <li>
     * <p><code>attachment.attachment-id</code> - The ID of the interface
     * attachment. </li> <li> <p><code>attachment.attach.time</code> - The
     * time that the network interface was attached to an instance. </li>
     * <li> <p><code>attachment.delete-on-termination</code> - Indicates
     * whether the attachment is deleted when an instance is terminated.
     * </li> <li> <p><code>attachment.device-index</code> - The device index
     * to which the network interface is attached. </li> <li>
     * <p><code>attachment.instance-id</code> - The ID of the instance to
     * which the network interface is attached. </li> <li>
     * <p><code>attachment.instance-owner-id</code> - The owner ID of the
     * instance to which the network interface is attached. </li> <li>
     * <p><code>attachment.nat-gateway-id</code> - The ID of the NAT gateway
     * to which the network interface is attached. </li> <li>
     * <p><code>attachment.status</code> - The status of the attachment
     * (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>). </li> <li>
     * <p><code>availability-zone</code> - The Availability Zone of the
     * network interface. </li> <li> <p><code>description</code> - The
     * description of the network interface. </li> <li>
     * <p><code>group-id</code> - The ID of a security group associated with
     * the network interface. </li> <li> <p><code>group-name</code> - The
     * name of a security group associated with the network interface. </li>
     * <li> <p><code>mac-address</code> - The MAC address of the network
     * interface. </li> <li> <p><code>network-interface-id</code> - The ID of
     * the network interface. </li> <li> <p><code>owner-id</code> - The AWS
     * account ID of the network interface owner. </li> <li>
     * <p><code>private-ip-address</code> - The private IP address or
     * addresses of the network interface. </li> <li>
     * <p><code>private-dns-name</code> - The private DNS name of the network
     * interface. </li> <li> <p><code>requester-id</code> - The ID of the
     * entity that launched the instance on your behalf (for example, AWS
     * Management Console, Auto Scaling, and so on). </li> <li>
     * <p><code>requester-managed</code> - Indicates whether the network
     * interface is being managed by an AWS service (for example, AWS
     * Management Console, Auto Scaling, and so on). </li> <li>
     * <p><code>source-desk-check</code> - Indicates whether the network
     * interface performs source/destination checking. A value of
     * <code>true</code> means checking is enabled, and <code>false</code>
     * means checking is disabled. The value must be <code>false</code> for
     * the network interface to perform network address translation (NAT) in
     * your VPC. </li> <li> <p><code>status</code> - The status of the
     * network interface. If the network interface is not attached to an
     * instance, the status is <code>available</code>; if a network interface
     * is attached to an instance the status is <code>in-use</code>. </li>
     * <li> <p><code>subnet-id</code> - The ID of the subnet for the network
     * interface. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> -
     * The key/value combination of a tag assigned to the resource. </li>
     * <li> <p><code>tag-key</code> - The key of a tag assigned to the
     * resource. This filter is independent of the <code>tag-value</code>
     * filter. For example, if you use both the filter "tag-key=Purpose" and
     * the filter "tag-value=X", you get any resources assigned both the tag
     * key Purpose (regardless of what the tag's value is), and the tag value
     * X (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC for the
     * network interface. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li>
     *         <p><code>addresses.private-ip-address</code> - The private IP
     *         addresses associated with the network interface. </li> <li>
     *         <p><code>addresses.primary</code> - Whether the private IP address is
     *         the primary IP address associated with the network interface. </li>
     *         <li> <p><code>addresses.association.public-ip</code> - The association
     *         ID returned when the network interface was associated with the Elastic
     *         IP address. </li> <li> <p><code>addresses.association.owner-id</code>
     *         - The owner ID of the addresses associated with the network interface.
     *         </li> <li> <p><code>association.association-id</code> - The
     *         association ID returned when the network interface was associated with
     *         an IP address. </li> <li> <p><code>association.allocation-id</code> -
     *         The allocation ID returned when you allocated the Elastic IP address
     *         for your network interface. </li> <li>
     *         <p><code>association.ip-owner-id</code> - The owner of the Elastic IP
     *         address associated with the network interface. </li> <li>
     *         <p><code>association.public-ip</code> - The address of the Elastic IP
     *         address bound to the network interface. </li> <li>
     *         <p><code>association.public-dns-name</code> - The public DNS name for
     *         the network interface. </li> <li>
     *         <p><code>attachment.attachment-id</code> - The ID of the interface
     *         attachment. </li> <li> <p><code>attachment.attach.time</code> - The
     *         time that the network interface was attached to an instance. </li>
     *         <li> <p><code>attachment.delete-on-termination</code> - Indicates
     *         whether the attachment is deleted when an instance is terminated.
     *         </li> <li> <p><code>attachment.device-index</code> - The device index
     *         to which the network interface is attached. </li> <li>
     *         <p><code>attachment.instance-id</code> - The ID of the instance to
     *         which the network interface is attached. </li> <li>
     *         <p><code>attachment.instance-owner-id</code> - The owner ID of the
     *         instance to which the network interface is attached. </li> <li>
     *         <p><code>attachment.nat-gateway-id</code> - The ID of the NAT gateway
     *         to which the network interface is attached. </li> <li>
     *         <p><code>attachment.status</code> - The status of the attachment
     *         (<code>attaching</code> | <code>attached</code> |
     *         <code>detaching</code> | <code>detached</code>). </li> <li>
     *         <p><code>availability-zone</code> - The Availability Zone of the
     *         network interface. </li> <li> <p><code>description</code> - The
     *         description of the network interface. </li> <li>
     *         <p><code>group-id</code> - The ID of a security group associated with
     *         the network interface. </li> <li> <p><code>group-name</code> - The
     *         name of a security group associated with the network interface. </li>
     *         <li> <p><code>mac-address</code> - The MAC address of the network
     *         interface. </li> <li> <p><code>network-interface-id</code> - The ID of
     *         the network interface. </li> <li> <p><code>owner-id</code> - The AWS
     *         account ID of the network interface owner. </li> <li>
     *         <p><code>private-ip-address</code> - The private IP address or
     *         addresses of the network interface. </li> <li>
     *         <p><code>private-dns-name</code> - The private DNS name of the network
     *         interface. </li> <li> <p><code>requester-id</code> - The ID of the
     *         entity that launched the instance on your behalf (for example, AWS
     *         Management Console, Auto Scaling, and so on). </li> <li>
     *         <p><code>requester-managed</code> - Indicates whether the network
     *         interface is being managed by an AWS service (for example, AWS
     *         Management Console, Auto Scaling, and so on). </li> <li>
     *         <p><code>source-desk-check</code> - Indicates whether the network
     *         interface performs source/destination checking. A value of
     *         <code>true</code> means checking is enabled, and <code>false</code>
     *         means checking is disabled. The value must be <code>false</code> for
     *         the network interface to perform network address translation (NAT) in
     *         your VPC. </li> <li> <p><code>status</code> - The status of the
     *         network interface. If the network interface is not attached to an
     *         instance, the status is <code>available</code>; if a network interface
     *         is attached to an instance the status is <code>in-use</code>. </li>
     *         <li> <p><code>subnet-id</code> - The ID of the subnet for the network
     *         interface. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> -
     *         The key/value combination of a tag assigned to the resource. </li>
     *         <li> <p><code>tag-key</code> - The key of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-value</code>
     *         filter. For example, if you use both the filter "tag-key=Purpose" and
     *         the filter "tag-value=X", you get any resources assigned both the tag
     *         key Purpose (regardless of what the tag's value is), and the tag value
     *         X (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC for the
     *         network interface. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNetworkInterfacesRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeNetworkInterfacesRequest> getDryRunRequest() {
        Request<DescribeNetworkInterfacesRequest> request = new DescribeNetworkInterfacesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNetworkInterfaceIds() != null) sb.append("NetworkInterfaceIds: " + getNetworkInterfaceIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNetworkInterfaceIds() == null) ? 0 : getNetworkInterfaceIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeNetworkInterfacesRequest == false) return false;
        DescribeNetworkInterfacesRequest other = (DescribeNetworkInterfacesRequest)obj;
        
        if (other.getNetworkInterfaceIds() == null ^ this.getNetworkInterfaceIds() == null) return false;
        if (other.getNetworkInterfaceIds() != null && other.getNetworkInterfaceIds().equals(this.getNetworkInterfaceIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    