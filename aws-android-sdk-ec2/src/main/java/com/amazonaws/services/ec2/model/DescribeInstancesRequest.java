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
 * Describes the specified instances or all instances.
 * </p>
 * <p>
 * If you specify instance IDs, the output includes information for only the
 * specified instances. If you specify filters, the output includes information
 * for only those instances that meet the filter criteria. If you do not specify
 * instance IDs or filters, the output includes information for all instances,
 * which can affect performance. We recommend that you use pagination to ensure
 * that the operation returns quickly and successfully.
 * </p>
 * <p>
 * If you specify an instance ID that is not valid, an error is returned. If you
 * specify an instance that you do not own, it is not included in the output.
 * </p>
 * <p>
 * Recently terminated instances might appear in the returned results. This
 * interval is usually less than one hour.
 * </p>
 * <p>
 * If you describe instances in the rare case where an Availability Zone is
 * experiencing a service disruption and you specify instance IDs that are in
 * the affected zone, or do not specify any instance IDs at all, the call fails.
 * If you describe instances and specify only instance IDs that are in an
 * unaffected zone, the call works normally.
 * </p>
 */
public class DescribeInstancesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>affinity</code> - The affinity setting for an instance running on a
     * Dedicated Host (<code>default</code> | <code>host</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>architecture</code> - The instance architecture (<code>i386</code>
     * | <code>x86_64</code> | <code>arm64</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.attach-time</code> - The attach time for an
     * EBS volume mapped to the instance, for example,
     * <code>2010-09-15T17:15:20.000Z</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.delete-on-termination</code> - A Boolean that
     * indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.device-name</code> - The device name specified
     * in the block device mapping (for example, <code>/dev/sdh</code> or
     * <code>xvdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.status</code> - The status for the EBS volume
     * (<code>attaching</code> | <code>attached</code> | <code>detaching</code>
     * | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-id</code> - The volume ID of the EBS
     * volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token you provided when you
     * launched the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dns-name</code> - The public DNS name of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of the security group for the instance.
     * EC2-Classic only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code> - The name of the security group for the
     * instance. EC2-Classic only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hibernation-options.configured</code> - A Boolean that indicates
     * whether the instance is enabled for hibernation. A value of
     * <code>true</code> means that the instance is enabled for hibernation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>host-id</code> - The ID of the Dedicated Host on which the instance
     * is running, if applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor type of the instance (
     * <code>ovm</code> | <code>xen</code>). The value <code>xen</code> is used
     * for both Xen and Nitro hypervisors.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile.arn</code> - The instance profile associated
     * with the instance. Specified as an ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the image used to launch the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-lifecycle</code> - Indicates whether this is a Spot
     * Instance or a Scheduled Instance (<code>spot</code> |
     * <code>scheduled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-code</code> - The state of the instance, as a 16-bit
     * unsigned integer. The high byte is used for internal purposes and should
     * be ignored. The low byte is set based on the state represented. The valid
     * values are: 0 (pending), 16 (running), 32 (shutting-down), 48
     * (terminated), 64 (stopping), and 80 (stopped).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-name</code> - The state of the instance (
     * <code>pending</code> | <code>running</code> | <code>shutting-down</code>
     * | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance (for example,
     * <code>t2.micro</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance.group-id</code> - The ID of the security group for the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance.group-name</code> - The name of the security group for the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-address</code> - The public IPv4 address of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key-name</code> - The name of the key pair used when the instance
     * was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-index</code> - When launching multiple instances, this is
     * the index for the instance in the launch group (for example, 0, 1, 2, and
     * so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-time</code> - The time when the instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-tokens</code> - The metadata request
     * authorization state (<code>optional</code> | <code>required</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-put-response-hop-limit</code> - The http
     * metadata request put response hop limit (integer, possible values
     * <code>1</code> to <code>64</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-endpoint</code> - Enable or disable metadata
     * access on http endpoint (<code>enabled</code> | <code>disabled</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>monitoring-state</code> - Indicates whether detailed monitoring is
     * enabled (<code>disabled</code> | <code>enabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.private-ip-address</code> - The private
     * IPv4 address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.primary</code> - Specifies whether the
     * IPv4 address of the network interface is the primary private IPv4
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.public-ip</code> - The ID
     * of the association of an Elastic IP address (IPv4) with a network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.ip-owner-id</code> - The
     * owner ID of the private IPv4 address associated with the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.public-ip</code> - The address of the
     * Elastic IP address (IPv4) bound to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.ip-owner-id</code> - The owner of the
     * Elastic IP address (IPv4) associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.allocation-id</code> - The allocation
     * ID returned when you allocated the Elastic IP address (IPv4) for your
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.association-id</code> - The
     * association ID returned when the network interface was associated with an
     * IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.attachment-id</code> - The ID of the
     * interface attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.instance-id</code> - The ID of the
     * instance to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.instance-owner-id</code> - The owner
     * ID of the instance to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.device-index</code> - The device index
     * to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.status</code> - The status of the
     * attachment (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.attach-time</code> - The time that the
     * network interface was attached to an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.delete-on-termination</code> -
     * Specifies whether the attachment is deleted when an instance is
     * terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.availability-zone</code> - The Availability Zone
     * for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.description</code> - The description of the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-id</code> - The ID of a security group
     * associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-name</code> - The name of a security group
     * associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-addresses.ipv6-address</code> - The IPv6
     * address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.mac-address</code> - The MAC address of the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.network-interface-id</code> - The ID of the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.owner-id</code> - The ID of the owner of the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-dns-name</code> - The private DNS name of
     * the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.requester-id</code> - The requester ID for the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.requester-managed</code> - Indicates whether the
     * network interface is being managed by AWS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.status</code> - The status of the network
     * interface (<code>available</code>) | <code>in-use</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.source-dest-check</code> - Whether the network
     * interface performs source/destination checking. A value of
     * <code>true</code> means that checking is enabled, and <code>false</code>
     * means that checking is disabled. The value must be <code>false</code> for
     * the network interface to perform network address translation (NAT) in
     * your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.subnet-id</code> - The ID of the subnet for the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.vpc-id</code> - The ID of the VPC for the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the instance owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>placement-group-name</code> - The name of the placement group for
     * the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>placement-partition-number</code> - The partition in which the
     * instance is located.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform. To list only Windows instances, use
     * <code>windows</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name</code> - The private IPv4 DNS name of the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - The private IPv4 address of the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code associated with the AMI used
     * to launch the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code.type</code> - The type of product code (
     * <code>devpay</code> | <code>marketplace</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reason</code> - The reason for the current state of the instance
     * (for example, shows "User Initiated [date]" when you stop or terminate
     * the instance). Similar to the state-reason-code filter.
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
     * <code>reservation-id</code> - The ID of the instance's reservation. A
     * reservation ID is created any time you launch an instance. A reservation
     * ID has a one-to-one relationship with an instance launch request, but can
     * be associated with more than one instance if you launch multiple
     * instances using the same launch request. For example, if you launch one
     * instance, you get one reservation ID. If you launch ten instances using
     * the same launch request, you also get one reservation ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-name</code> - The device name of the root device volume
     * (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-type</code> - The type of the root device volume (
     * <code>ebs</code> | <code>instance-store</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-dest-check</code> - Indicates whether the instance performs
     * source/destination checking. A value of <code>true</code> means that
     * checking is enabled, and <code>false</code> means that checking is
     * disabled. The value must be <code>false</code> for the instance to
     * perform network address translation (NAT) in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-instance-request-id</code> - The ID of the Spot Instance
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-code</code> - The reason code for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-message</code> - A message that describes the state
     * change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet for the instance.
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
     * this filter to find all resources that have a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - The tenancy of an instance (<code>dedicated</code>
     * | <code>default</code> | <code>host</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>virtualization-type</code> - The virtualization type of the
     * instance (<code>paravirtual</code> | <code>hvm</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC that the instance is running in.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     */
    private java.util.List<String> instanceIds;

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
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000. You
     * cannot specify this parameter and the instance IDs parameter in the same
     * call.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>affinity</code> - The affinity setting for an instance running on a
     * Dedicated Host (<code>default</code> | <code>host</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>architecture</code> - The instance architecture (<code>i386</code>
     * | <code>x86_64</code> | <code>arm64</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.attach-time</code> - The attach time for an
     * EBS volume mapped to the instance, for example,
     * <code>2010-09-15T17:15:20.000Z</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.delete-on-termination</code> - A Boolean that
     * indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.device-name</code> - The device name specified
     * in the block device mapping (for example, <code>/dev/sdh</code> or
     * <code>xvdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.status</code> - The status for the EBS volume
     * (<code>attaching</code> | <code>attached</code> | <code>detaching</code>
     * | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-id</code> - The volume ID of the EBS
     * volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token you provided when you
     * launched the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dns-name</code> - The public DNS name of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of the security group for the instance.
     * EC2-Classic only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code> - The name of the security group for the
     * instance. EC2-Classic only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hibernation-options.configured</code> - A Boolean that indicates
     * whether the instance is enabled for hibernation. A value of
     * <code>true</code> means that the instance is enabled for hibernation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>host-id</code> - The ID of the Dedicated Host on which the instance
     * is running, if applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor type of the instance (
     * <code>ovm</code> | <code>xen</code>). The value <code>xen</code> is used
     * for both Xen and Nitro hypervisors.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile.arn</code> - The instance profile associated
     * with the instance. Specified as an ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the image used to launch the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-lifecycle</code> - Indicates whether this is a Spot
     * Instance or a Scheduled Instance (<code>spot</code> |
     * <code>scheduled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-code</code> - The state of the instance, as a 16-bit
     * unsigned integer. The high byte is used for internal purposes and should
     * be ignored. The low byte is set based on the state represented. The valid
     * values are: 0 (pending), 16 (running), 32 (shutting-down), 48
     * (terminated), 64 (stopping), and 80 (stopped).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-name</code> - The state of the instance (
     * <code>pending</code> | <code>running</code> | <code>shutting-down</code>
     * | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance (for example,
     * <code>t2.micro</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance.group-id</code> - The ID of the security group for the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance.group-name</code> - The name of the security group for the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-address</code> - The public IPv4 address of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key-name</code> - The name of the key pair used when the instance
     * was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-index</code> - When launching multiple instances, this is
     * the index for the instance in the launch group (for example, 0, 1, 2, and
     * so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-time</code> - The time when the instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-tokens</code> - The metadata request
     * authorization state (<code>optional</code> | <code>required</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-put-response-hop-limit</code> - The http
     * metadata request put response hop limit (integer, possible values
     * <code>1</code> to <code>64</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-endpoint</code> - Enable or disable metadata
     * access on http endpoint (<code>enabled</code> | <code>disabled</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>monitoring-state</code> - Indicates whether detailed monitoring is
     * enabled (<code>disabled</code> | <code>enabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.private-ip-address</code> - The private
     * IPv4 address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.primary</code> - Specifies whether the
     * IPv4 address of the network interface is the primary private IPv4
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.public-ip</code> - The ID
     * of the association of an Elastic IP address (IPv4) with a network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.ip-owner-id</code> - The
     * owner ID of the private IPv4 address associated with the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.public-ip</code> - The address of the
     * Elastic IP address (IPv4) bound to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.ip-owner-id</code> - The owner of the
     * Elastic IP address (IPv4) associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.allocation-id</code> - The allocation
     * ID returned when you allocated the Elastic IP address (IPv4) for your
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.association-id</code> - The
     * association ID returned when the network interface was associated with an
     * IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.attachment-id</code> - The ID of the
     * interface attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.instance-id</code> - The ID of the
     * instance to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.instance-owner-id</code> - The owner
     * ID of the instance to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.device-index</code> - The device index
     * to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.status</code> - The status of the
     * attachment (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.attach-time</code> - The time that the
     * network interface was attached to an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.delete-on-termination</code> -
     * Specifies whether the attachment is deleted when an instance is
     * terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.availability-zone</code> - The Availability Zone
     * for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.description</code> - The description of the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-id</code> - The ID of a security group
     * associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-name</code> - The name of a security group
     * associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-addresses.ipv6-address</code> - The IPv6
     * address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.mac-address</code> - The MAC address of the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.network-interface-id</code> - The ID of the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.owner-id</code> - The ID of the owner of the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-dns-name</code> - The private DNS name of
     * the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.requester-id</code> - The requester ID for the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.requester-managed</code> - Indicates whether the
     * network interface is being managed by AWS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.status</code> - The status of the network
     * interface (<code>available</code>) | <code>in-use</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.source-dest-check</code> - Whether the network
     * interface performs source/destination checking. A value of
     * <code>true</code> means that checking is enabled, and <code>false</code>
     * means that checking is disabled. The value must be <code>false</code> for
     * the network interface to perform network address translation (NAT) in
     * your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.subnet-id</code> - The ID of the subnet for the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.vpc-id</code> - The ID of the VPC for the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the instance owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>placement-group-name</code> - The name of the placement group for
     * the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>placement-partition-number</code> - The partition in which the
     * instance is located.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform. To list only Windows instances, use
     * <code>windows</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name</code> - The private IPv4 DNS name of the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - The private IPv4 address of the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code associated with the AMI used
     * to launch the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code.type</code> - The type of product code (
     * <code>devpay</code> | <code>marketplace</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reason</code> - The reason for the current state of the instance
     * (for example, shows "User Initiated [date]" when you stop or terminate
     * the instance). Similar to the state-reason-code filter.
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
     * <code>reservation-id</code> - The ID of the instance's reservation. A
     * reservation ID is created any time you launch an instance. A reservation
     * ID has a one-to-one relationship with an instance launch request, but can
     * be associated with more than one instance if you launch multiple
     * instances using the same launch request. For example, if you launch one
     * instance, you get one reservation ID. If you launch ten instances using
     * the same launch request, you also get one reservation ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-name</code> - The device name of the root device volume
     * (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-type</code> - The type of the root device volume (
     * <code>ebs</code> | <code>instance-store</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-dest-check</code> - Indicates whether the instance performs
     * source/destination checking. A value of <code>true</code> means that
     * checking is enabled, and <code>false</code> means that checking is
     * disabled. The value must be <code>false</code> for the instance to
     * perform network address translation (NAT) in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-instance-request-id</code> - The ID of the Spot Instance
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-code</code> - The reason code for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-message</code> - A message that describes the state
     * change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet for the instance.
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
     * this filter to find all resources that have a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - The tenancy of an instance (<code>dedicated</code>
     * | <code>default</code> | <code>host</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>virtualization-type</code> - The virtualization type of the
     * instance (<code>paravirtual</code> | <code>hvm</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC that the instance is running in.
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
     *         <code>affinity</code> - The affinity setting for an instance
     *         running on a Dedicated Host (<code>default</code> |
     *         <code>host</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>architecture</code> - The instance architecture (
     *         <code>i386</code> | <code>x86_64</code> | <code>arm64</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone of the
     *         instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>block-device-mapping.attach-time</code> - The attach time
     *         for an EBS volume mapped to the instance, for example,
     *         <code>2010-09-15T17:15:20.000Z</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>block-device-mapping.delete-on-termination</code> - A
     *         Boolean that indicates whether the EBS volume is deleted on
     *         instance termination.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>block-device-mapping.device-name</code> - The device name
     *         specified in the block device mapping (for example,
     *         <code>/dev/sdh</code> or <code>xvdh</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>block-device-mapping.status</code> - The status for the EBS
     *         volume (<code>attaching</code> | <code>attached</code> |
     *         <code>detaching</code> | <code>detached</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>block-device-mapping.volume-id</code> - The volume ID of
     *         the EBS volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>client-token</code> - The idempotency token you provided
     *         when you launched the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dns-name</code> - The public DNS name of the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>group-id</code> - The ID of the security group for the
     *         instance. EC2-Classic only.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>group-name</code> - The name of the security group for the
     *         instance. EC2-Classic only.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>hibernation-options.configured</code> - A Boolean that
     *         indicates whether the instance is enabled for hibernation. A
     *         value of <code>true</code> means that the instance is enabled for
     *         hibernation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>host-id</code> - The ID of the Dedicated Host on which the
     *         instance is running, if applicable.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>hypervisor</code> - The hypervisor type of the instance (
     *         <code>ovm</code> | <code>xen</code>). The value <code>xen</code>
     *         is used for both Xen and Nitro hypervisors.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>iam-instance-profile.arn</code> - The instance profile
     *         associated with the instance. Specified as an ARN.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>image-id</code> - The ID of the image used to launch the
     *         instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-id</code> - The ID of the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-lifecycle</code> - Indicates whether this is a
     *         Spot Instance or a Scheduled Instance (<code>spot</code> |
     *         <code>scheduled</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-state-code</code> - The state of the instance, as
     *         a 16-bit unsigned integer. The high byte is used for internal
     *         purposes and should be ignored. The low byte is set based on the
     *         state represented. The valid values are: 0 (pending), 16
     *         (running), 32 (shutting-down), 48 (terminated), 64 (stopping),
     *         and 80 (stopped).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-state-name</code> - The state of the instance (
     *         <code>pending</code> | <code>running</code> |
     *         <code>shutting-down</code> | <code>terminated</code> |
     *         <code>stopping</code> | <code>stopped</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-type</code> - The type of instance (for example,
     *         <code>t2.micro</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance.group-id</code> - The ID of the security group for
     *         the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance.group-name</code> - The name of the security group
     *         for the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ip-address</code> - The public IPv4 address of the
     *         instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>kernel-id</code> - The kernel ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>key-name</code> - The name of the key pair used when the
     *         instance was launched.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch-index</code> - When launching multiple instances,
     *         this is the index for the instance in the launch group (for
     *         example, 0, 1, 2, and so on).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch-time</code> - The time when the instance was
     *         launched.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>metadata-options.http-tokens</code> - The metadata request
     *         authorization state (<code>optional</code> |
     *         <code>required</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>metadata-options.http-put-response-hop-limit</code> - The
     *         http metadata request put response hop limit (integer, possible
     *         values <code>1</code> to <code>64</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>metadata-options.http-endpoint</code> - Enable or disable
     *         metadata access on http endpoint (<code>enabled</code> |
     *         <code>disabled</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>monitoring-state</code> - Indicates whether detailed
     *         monitoring is enabled (<code>disabled</code> |
     *         <code>enabled</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.addresses.private-ip-address</code> - The
     *         private IPv4 address associated with the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.addresses.primary</code> - Specifies
     *         whether the IPv4 address of the network interface is the primary
     *         private IPv4 address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.addresses.association.public-ip</code> -
     *         The ID of the association of an Elastic IP address (IPv4) with a
     *         network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.addresses.association.ip-owner-id</code>
     *         - The owner ID of the private IPv4 address associated with the
     *         network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.association.public-ip</code> - The
     *         address of the Elastic IP address (IPv4) bound to the network
     *         interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.association.ip-owner-id</code> - The
     *         owner of the Elastic IP address (IPv4) associated with the
     *         network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.association.allocation-id</code> - The
     *         allocation ID returned when you allocated the Elastic IP address
     *         (IPv4) for your network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.association.association-id</code> - The
     *         association ID returned when the network interface was associated
     *         with an IPv4 address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.attachment.attachment-id</code> - The ID
     *         of the interface attachment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.attachment.instance-id</code> - The ID of
     *         the instance to which the network interface is attached.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.attachment.instance-owner-id</code> - The
     *         owner ID of the instance to which the network interface is
     *         attached.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.attachment.device-index</code> - The
     *         device index to which the network interface is attached.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.attachment.status</code> - The status of
     *         the attachment (<code>attaching</code> | <code>attached</code> |
     *         <code>detaching</code> | <code>detached</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.attachment.attach-time</code> - The time
     *         that the network interface was attached to an instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.attachment.delete-on-termination</code> -
     *         Specifies whether the attachment is deleted when an instance is
     *         terminated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.availability-zone</code> - The
     *         Availability Zone for the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.description</code> - The description of
     *         the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.group-id</code> - The ID of a security
     *         group associated with the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.group-name</code> - The name of a
     *         security group associated with the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.ipv6-addresses.ipv6-address</code> - The
     *         IPv6 address associated with the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.mac-address</code> - The MAC address of
     *         the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.network-interface-id</code> - The ID of
     *         the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.owner-id</code> - The ID of the owner of
     *         the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.private-dns-name</code> - The private DNS
     *         name of the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.requester-id</code> - The requester ID
     *         for the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.requester-managed</code> - Indicates
     *         whether the network interface is being managed by AWS.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.status</code> - The status of the network
     *         interface (<code>available</code>) | <code>in-use</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.source-dest-check</code> - Whether the
     *         network interface performs source/destination checking. A value
     *         of <code>true</code> means that checking is enabled, and
     *         <code>false</code> means that checking is disabled. The value
     *         must be <code>false</code> for the network interface to perform
     *         network address translation (NAT) in your VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.subnet-id</code> - The ID of the subnet
     *         for the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.vpc-id</code> - The ID of the VPC for the
     *         network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code> - The AWS account ID of the instance owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>placement-group-name</code> - The name of the placement
     *         group for the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>placement-partition-number</code> - The partition in which
     *         the instance is located.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>platform</code> - The platform. To list only Windows
     *         instances, use <code>windows</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>private-dns-name</code> - The private IPv4 DNS name of the
     *         instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>private-ip-address</code> - The private IPv4 address of the
     *         instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>product-code</code> - The product code associated with the
     *         AMI used to launch the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>product-code.type</code> - The type of product code (
     *         <code>devpay</code> | <code>marketplace</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ramdisk-id</code> - The RAM disk ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>reason</code> - The reason for the current state of the
     *         instance (for example, shows "User Initiated [date]" when you
     *         stop or terminate the instance). Similar to the state-reason-code
     *         filter.
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
     *         <code>reservation-id</code> - The ID of the instance's
     *         reservation. A reservation ID is created any time you launch an
     *         instance. A reservation ID has a one-to-one relationship with an
     *         instance launch request, but can be associated with more than one
     *         instance if you launch multiple instances using the same launch
     *         request. For example, if you launch one instance, you get one
     *         reservation ID. If you launch ten instances using the same launch
     *         request, you also get one reservation ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>root-device-name</code> - The device name of the root
     *         device volume (for example, <code>/dev/sda1</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>root-device-type</code> - The type of the root device
     *         volume (<code>ebs</code> | <code>instance-store</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>source-dest-check</code> - Indicates whether the instance
     *         performs source/destination checking. A value of
     *         <code>true</code> means that checking is enabled, and
     *         <code>false</code> means that checking is disabled. The value
     *         must be <code>false</code> for the instance to perform network
     *         address translation (NAT) in your VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>spot-instance-request-id</code> - The ID of the Spot
     *         Instance request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state-reason-code</code> - The reason code for the state
     *         change.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state-reason-message</code> - A message that describes the
     *         state change.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>subnet-id</code> - The ID of the subnet for the instance.
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
     *         Use this filter to find all resources that have a tag with a
     *         specific key, regardless of the tag value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tenancy</code> - The tenancy of an instance (
     *         <code>dedicated</code> | <code>default</code> | <code>host</code>
     *         ).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>virtualization-type</code> - The virtualization type of the
     *         instance (<code>paravirtual</code> | <code>hvm</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vpc-id</code> - The ID of the VPC that the instance is
     *         running in.
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
     * <code>affinity</code> - The affinity setting for an instance running on a
     * Dedicated Host (<code>default</code> | <code>host</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>architecture</code> - The instance architecture (<code>i386</code>
     * | <code>x86_64</code> | <code>arm64</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.attach-time</code> - The attach time for an
     * EBS volume mapped to the instance, for example,
     * <code>2010-09-15T17:15:20.000Z</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.delete-on-termination</code> - A Boolean that
     * indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.device-name</code> - The device name specified
     * in the block device mapping (for example, <code>/dev/sdh</code> or
     * <code>xvdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.status</code> - The status for the EBS volume
     * (<code>attaching</code> | <code>attached</code> | <code>detaching</code>
     * | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-id</code> - The volume ID of the EBS
     * volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token you provided when you
     * launched the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dns-name</code> - The public DNS name of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of the security group for the instance.
     * EC2-Classic only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code> - The name of the security group for the
     * instance. EC2-Classic only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hibernation-options.configured</code> - A Boolean that indicates
     * whether the instance is enabled for hibernation. A value of
     * <code>true</code> means that the instance is enabled for hibernation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>host-id</code> - The ID of the Dedicated Host on which the instance
     * is running, if applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor type of the instance (
     * <code>ovm</code> | <code>xen</code>). The value <code>xen</code> is used
     * for both Xen and Nitro hypervisors.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile.arn</code> - The instance profile associated
     * with the instance. Specified as an ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the image used to launch the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-lifecycle</code> - Indicates whether this is a Spot
     * Instance or a Scheduled Instance (<code>spot</code> |
     * <code>scheduled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-code</code> - The state of the instance, as a 16-bit
     * unsigned integer. The high byte is used for internal purposes and should
     * be ignored. The low byte is set based on the state represented. The valid
     * values are: 0 (pending), 16 (running), 32 (shutting-down), 48
     * (terminated), 64 (stopping), and 80 (stopped).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-name</code> - The state of the instance (
     * <code>pending</code> | <code>running</code> | <code>shutting-down</code>
     * | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance (for example,
     * <code>t2.micro</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance.group-id</code> - The ID of the security group for the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance.group-name</code> - The name of the security group for the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-address</code> - The public IPv4 address of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key-name</code> - The name of the key pair used when the instance
     * was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-index</code> - When launching multiple instances, this is
     * the index for the instance in the launch group (for example, 0, 1, 2, and
     * so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-time</code> - The time when the instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-tokens</code> - The metadata request
     * authorization state (<code>optional</code> | <code>required</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-put-response-hop-limit</code> - The http
     * metadata request put response hop limit (integer, possible values
     * <code>1</code> to <code>64</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-endpoint</code> - Enable or disable metadata
     * access on http endpoint (<code>enabled</code> | <code>disabled</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>monitoring-state</code> - Indicates whether detailed monitoring is
     * enabled (<code>disabled</code> | <code>enabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.private-ip-address</code> - The private
     * IPv4 address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.primary</code> - Specifies whether the
     * IPv4 address of the network interface is the primary private IPv4
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.public-ip</code> - The ID
     * of the association of an Elastic IP address (IPv4) with a network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.ip-owner-id</code> - The
     * owner ID of the private IPv4 address associated with the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.public-ip</code> - The address of the
     * Elastic IP address (IPv4) bound to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.ip-owner-id</code> - The owner of the
     * Elastic IP address (IPv4) associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.allocation-id</code> - The allocation
     * ID returned when you allocated the Elastic IP address (IPv4) for your
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.association-id</code> - The
     * association ID returned when the network interface was associated with an
     * IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.attachment-id</code> - The ID of the
     * interface attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.instance-id</code> - The ID of the
     * instance to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.instance-owner-id</code> - The owner
     * ID of the instance to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.device-index</code> - The device index
     * to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.status</code> - The status of the
     * attachment (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.attach-time</code> - The time that the
     * network interface was attached to an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.delete-on-termination</code> -
     * Specifies whether the attachment is deleted when an instance is
     * terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.availability-zone</code> - The Availability Zone
     * for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.description</code> - The description of the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-id</code> - The ID of a security group
     * associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-name</code> - The name of a security group
     * associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-addresses.ipv6-address</code> - The IPv6
     * address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.mac-address</code> - The MAC address of the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.network-interface-id</code> - The ID of the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.owner-id</code> - The ID of the owner of the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-dns-name</code> - The private DNS name of
     * the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.requester-id</code> - The requester ID for the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.requester-managed</code> - Indicates whether the
     * network interface is being managed by AWS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.status</code> - The status of the network
     * interface (<code>available</code>) | <code>in-use</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.source-dest-check</code> - Whether the network
     * interface performs source/destination checking. A value of
     * <code>true</code> means that checking is enabled, and <code>false</code>
     * means that checking is disabled. The value must be <code>false</code> for
     * the network interface to perform network address translation (NAT) in
     * your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.subnet-id</code> - The ID of the subnet for the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.vpc-id</code> - The ID of the VPC for the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the instance owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>placement-group-name</code> - The name of the placement group for
     * the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>placement-partition-number</code> - The partition in which the
     * instance is located.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform. To list only Windows instances, use
     * <code>windows</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name</code> - The private IPv4 DNS name of the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - The private IPv4 address of the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code associated with the AMI used
     * to launch the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code.type</code> - The type of product code (
     * <code>devpay</code> | <code>marketplace</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reason</code> - The reason for the current state of the instance
     * (for example, shows "User Initiated [date]" when you stop or terminate
     * the instance). Similar to the state-reason-code filter.
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
     * <code>reservation-id</code> - The ID of the instance's reservation. A
     * reservation ID is created any time you launch an instance. A reservation
     * ID has a one-to-one relationship with an instance launch request, but can
     * be associated with more than one instance if you launch multiple
     * instances using the same launch request. For example, if you launch one
     * instance, you get one reservation ID. If you launch ten instances using
     * the same launch request, you also get one reservation ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-name</code> - The device name of the root device volume
     * (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-type</code> - The type of the root device volume (
     * <code>ebs</code> | <code>instance-store</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-dest-check</code> - Indicates whether the instance performs
     * source/destination checking. A value of <code>true</code> means that
     * checking is enabled, and <code>false</code> means that checking is
     * disabled. The value must be <code>false</code> for the instance to
     * perform network address translation (NAT) in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-instance-request-id</code> - The ID of the Spot Instance
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-code</code> - The reason code for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-message</code> - A message that describes the state
     * change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet for the instance.
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
     * this filter to find all resources that have a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - The tenancy of an instance (<code>dedicated</code>
     * | <code>default</code> | <code>host</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>virtualization-type</code> - The virtualization type of the
     * instance (<code>paravirtual</code> | <code>hvm</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC that the instance is running in.
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
     *            <code>affinity</code> - The affinity setting for an instance
     *            running on a Dedicated Host (<code>default</code> |
     *            <code>host</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>architecture</code> - The instance architecture (
     *            <code>i386</code> | <code>x86_64</code> | <code>arm64</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone of the
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.attach-time</code> - The attach
     *            time for an EBS volume mapped to the instance, for example,
     *            <code>2010-09-15T17:15:20.000Z</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.delete-on-termination</code> - A
     *            Boolean that indicates whether the EBS volume is deleted on
     *            instance termination.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.device-name</code> - The device
     *            name specified in the block device mapping (for example,
     *            <code>/dev/sdh</code> or <code>xvdh</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.status</code> - The status for the
     *            EBS volume (<code>attaching</code> | <code>attached</code> |
     *            <code>detaching</code> | <code>detached</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.volume-id</code> - The volume ID of
     *            the EBS volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>client-token</code> - The idempotency token you provided
     *            when you launched the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dns-name</code> - The public DNS name of the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>group-id</code> - The ID of the security group for the
     *            instance. EC2-Classic only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>group-name</code> - The name of the security group for
     *            the instance. EC2-Classic only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>hibernation-options.configured</code> - A Boolean that
     *            indicates whether the instance is enabled for hibernation. A
     *            value of <code>true</code> means that the instance is enabled
     *            for hibernation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>host-id</code> - The ID of the Dedicated Host on which
     *            the instance is running, if applicable.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>hypervisor</code> - The hypervisor type of the instance
     *            (<code>ovm</code> | <code>xen</code>). The value
     *            <code>xen</code> is used for both Xen and Nitro hypervisors.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>iam-instance-profile.arn</code> - The instance profile
     *            associated with the instance. Specified as an ARN.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>image-id</code> - The ID of the image used to launch the
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-id</code> - The ID of the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-lifecycle</code> - Indicates whether this is a
     *            Spot Instance or a Scheduled Instance (<code>spot</code> |
     *            <code>scheduled</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-state-code</code> - The state of the instance,
     *            as a 16-bit unsigned integer. The high byte is used for
     *            internal purposes and should be ignored. The low byte is set
     *            based on the state represented. The valid values are: 0
     *            (pending), 16 (running), 32 (shutting-down), 48 (terminated),
     *            64 (stopping), and 80 (stopped).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-state-name</code> - The state of the instance (
     *            <code>pending</code> | <code>running</code> |
     *            <code>shutting-down</code> | <code>terminated</code> |
     *            <code>stopping</code> | <code>stopped</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-type</code> - The type of instance (for
     *            example, <code>t2.micro</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance.group-id</code> - The ID of the security group
     *            for the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance.group-name</code> - The name of the security
     *            group for the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ip-address</code> - The public IPv4 address of the
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>kernel-id</code> - The kernel ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>key-name</code> - The name of the key pair used when the
     *            instance was launched.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>launch-index</code> - When launching multiple instances,
     *            this is the index for the instance in the launch group (for
     *            example, 0, 1, 2, and so on).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>launch-time</code> - The time when the instance was
     *            launched.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>metadata-options.http-tokens</code> - The metadata
     *            request authorization state (<code>optional</code> |
     *            <code>required</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>metadata-options.http-put-response-hop-limit</code> -
     *            The http metadata request put response hop limit (integer,
     *            possible values <code>1</code> to <code>64</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>metadata-options.http-endpoint</code> - Enable or
     *            disable metadata access on http endpoint (<code>enabled</code>
     *            | <code>disabled</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>monitoring-state</code> - Indicates whether detailed
     *            monitoring is enabled (<code>disabled</code> |
     *            <code>enabled</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.addresses.private-ip-address</code> -
     *            The private IPv4 address associated with the network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.addresses.primary</code> - Specifies
     *            whether the IPv4 address of the network interface is the
     *            primary private IPv4 address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.addresses.association.public-ip</code>
     *            - The ID of the association of an Elastic IP address (IPv4)
     *            with a network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.addresses.association.ip-owner-id</code>
     *            - The owner ID of the private IPv4 address associated with the
     *            network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.association.public-ip</code> - The
     *            address of the Elastic IP address (IPv4) bound to the network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.association.ip-owner-id</code> - The
     *            owner of the Elastic IP address (IPv4) associated with the
     *            network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.association.allocation-id</code> - The
     *            allocation ID returned when you allocated the Elastic IP
     *            address (IPv4) for your network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.association.association-id</code> -
     *            The association ID returned when the network interface was
     *            associated with an IPv4 address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.attachment.attachment-id</code> - The
     *            ID of the interface attachment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.attachment.instance-id</code> - The ID
     *            of the instance to which the network interface is attached.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.attachment.instance-owner-id</code> -
     *            The owner ID of the instance to which the network interface is
     *            attached.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.attachment.device-index</code> - The
     *            device index to which the network interface is attached.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.attachment.status</code> - The status
     *            of the attachment (<code>attaching</code> |
     *            <code>attached</code> | <code>detaching</code> |
     *            <code>detached</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.attachment.attach-time</code> - The
     *            time that the network interface was attached to an instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.attachment.delete-on-termination</code>
     *            - Specifies whether the attachment is deleted when an instance
     *            is terminated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.availability-zone</code> - The
     *            Availability Zone for the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.description</code> - The description
     *            of the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.group-id</code> - The ID of a security
     *            group associated with the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.group-name</code> - The name of a
     *            security group associated with the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.ipv6-addresses.ipv6-address</code> -
     *            The IPv6 address associated with the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.mac-address</code> - The MAC address
     *            of the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.network-interface-id</code> - The ID
     *            of the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.owner-id</code> - The ID of the owner
     *            of the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.private-dns-name</code> - The private
     *            DNS name of the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.requester-id</code> - The requester ID
     *            for the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.requester-managed</code> - Indicates
     *            whether the network interface is being managed by AWS.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.status</code> - The status of the
     *            network interface (<code>available</code>) |
     *            <code>in-use</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.source-dest-check</code> - Whether the
     *            network interface performs source/destination checking. A
     *            value of <code>true</code> means that checking is enabled, and
     *            <code>false</code> means that checking is disabled. The value
     *            must be <code>false</code> for the network interface to
     *            perform network address translation (NAT) in your VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.subnet-id</code> - The ID of the
     *            subnet for the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.vpc-id</code> - The ID of the VPC for
     *            the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The AWS account ID of the instance
     *            owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>placement-group-name</code> - The name of the placement
     *            group for the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>placement-partition-number</code> - The partition in
     *            which the instance is located.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>platform</code> - The platform. To list only Windows
     *            instances, use <code>windows</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>private-dns-name</code> - The private IPv4 DNS name of
     *            the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>private-ip-address</code> - The private IPv4 address of
     *            the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>product-code</code> - The product code associated with
     *            the AMI used to launch the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>product-code.type</code> - The type of product code (
     *            <code>devpay</code> | <code>marketplace</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ramdisk-id</code> - The RAM disk ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>reason</code> - The reason for the current state of the
     *            instance (for example, shows "User Initiated [date]" when you
     *            stop or terminate the instance). Similar to the
     *            state-reason-code filter.
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
     *            <code>reservation-id</code> - The ID of the instance's
     *            reservation. A reservation ID is created any time you launch
     *            an instance. A reservation ID has a one-to-one relationship
     *            with an instance launch request, but can be associated with
     *            more than one instance if you launch multiple instances using
     *            the same launch request. For example, if you launch one
     *            instance, you get one reservation ID. If you launch ten
     *            instances using the same launch request, you also get one
     *            reservation ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>root-device-name</code> - The device name of the root
     *            device volume (for example, <code>/dev/sda1</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>root-device-type</code> - The type of the root device
     *            volume (<code>ebs</code> | <code>instance-store</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>source-dest-check</code> - Indicates whether the
     *            instance performs source/destination checking. A value of
     *            <code>true</code> means that checking is enabled, and
     *            <code>false</code> means that checking is disabled. The value
     *            must be <code>false</code> for the instance to perform network
     *            address translation (NAT) in your VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>spot-instance-request-id</code> - The ID of the Spot
     *            Instance request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state-reason-code</code> - The reason code for the state
     *            change.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state-reason-message</code> - A message that describes
     *            the state change.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>subnet-id</code> - The ID of the subnet for the
     *            instance.
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
     *            resource. Use this filter to find all resources that have a
     *            tag with a specific key, regardless of the tag value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tenancy</code> - The tenancy of an instance (
     *            <code>dedicated</code> | <code>default</code> |
     *            <code>host</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>virtualization-type</code> - The virtualization type of
     *            the instance (<code>paravirtual</code> | <code>hvm</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpc-id</code> - The ID of the VPC that the instance is
     *            running in.
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
     * <code>affinity</code> - The affinity setting for an instance running on a
     * Dedicated Host (<code>default</code> | <code>host</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>architecture</code> - The instance architecture (<code>i386</code>
     * | <code>x86_64</code> | <code>arm64</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.attach-time</code> - The attach time for an
     * EBS volume mapped to the instance, for example,
     * <code>2010-09-15T17:15:20.000Z</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.delete-on-termination</code> - A Boolean that
     * indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.device-name</code> - The device name specified
     * in the block device mapping (for example, <code>/dev/sdh</code> or
     * <code>xvdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.status</code> - The status for the EBS volume
     * (<code>attaching</code> | <code>attached</code> | <code>detaching</code>
     * | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-id</code> - The volume ID of the EBS
     * volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token you provided when you
     * launched the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dns-name</code> - The public DNS name of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of the security group for the instance.
     * EC2-Classic only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code> - The name of the security group for the
     * instance. EC2-Classic only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hibernation-options.configured</code> - A Boolean that indicates
     * whether the instance is enabled for hibernation. A value of
     * <code>true</code> means that the instance is enabled for hibernation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>host-id</code> - The ID of the Dedicated Host on which the instance
     * is running, if applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor type of the instance (
     * <code>ovm</code> | <code>xen</code>). The value <code>xen</code> is used
     * for both Xen and Nitro hypervisors.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile.arn</code> - The instance profile associated
     * with the instance. Specified as an ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the image used to launch the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-lifecycle</code> - Indicates whether this is a Spot
     * Instance or a Scheduled Instance (<code>spot</code> |
     * <code>scheduled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-code</code> - The state of the instance, as a 16-bit
     * unsigned integer. The high byte is used for internal purposes and should
     * be ignored. The low byte is set based on the state represented. The valid
     * values are: 0 (pending), 16 (running), 32 (shutting-down), 48
     * (terminated), 64 (stopping), and 80 (stopped).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-name</code> - The state of the instance (
     * <code>pending</code> | <code>running</code> | <code>shutting-down</code>
     * | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance (for example,
     * <code>t2.micro</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance.group-id</code> - The ID of the security group for the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance.group-name</code> - The name of the security group for the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-address</code> - The public IPv4 address of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key-name</code> - The name of the key pair used when the instance
     * was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-index</code> - When launching multiple instances, this is
     * the index for the instance in the launch group (for example, 0, 1, 2, and
     * so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-time</code> - The time when the instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-tokens</code> - The metadata request
     * authorization state (<code>optional</code> | <code>required</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-put-response-hop-limit</code> - The http
     * metadata request put response hop limit (integer, possible values
     * <code>1</code> to <code>64</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-endpoint</code> - Enable or disable metadata
     * access on http endpoint (<code>enabled</code> | <code>disabled</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>monitoring-state</code> - Indicates whether detailed monitoring is
     * enabled (<code>disabled</code> | <code>enabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.private-ip-address</code> - The private
     * IPv4 address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.primary</code> - Specifies whether the
     * IPv4 address of the network interface is the primary private IPv4
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.public-ip</code> - The ID
     * of the association of an Elastic IP address (IPv4) with a network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.ip-owner-id</code> - The
     * owner ID of the private IPv4 address associated with the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.public-ip</code> - The address of the
     * Elastic IP address (IPv4) bound to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.ip-owner-id</code> - The owner of the
     * Elastic IP address (IPv4) associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.allocation-id</code> - The allocation
     * ID returned when you allocated the Elastic IP address (IPv4) for your
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.association-id</code> - The
     * association ID returned when the network interface was associated with an
     * IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.attachment-id</code> - The ID of the
     * interface attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.instance-id</code> - The ID of the
     * instance to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.instance-owner-id</code> - The owner
     * ID of the instance to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.device-index</code> - The device index
     * to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.status</code> - The status of the
     * attachment (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.attach-time</code> - The time that the
     * network interface was attached to an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.delete-on-termination</code> -
     * Specifies whether the attachment is deleted when an instance is
     * terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.availability-zone</code> - The Availability Zone
     * for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.description</code> - The description of the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-id</code> - The ID of a security group
     * associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-name</code> - The name of a security group
     * associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-addresses.ipv6-address</code> - The IPv6
     * address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.mac-address</code> - The MAC address of the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.network-interface-id</code> - The ID of the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.owner-id</code> - The ID of the owner of the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-dns-name</code> - The private DNS name of
     * the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.requester-id</code> - The requester ID for the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.requester-managed</code> - Indicates whether the
     * network interface is being managed by AWS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.status</code> - The status of the network
     * interface (<code>available</code>) | <code>in-use</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.source-dest-check</code> - Whether the network
     * interface performs source/destination checking. A value of
     * <code>true</code> means that checking is enabled, and <code>false</code>
     * means that checking is disabled. The value must be <code>false</code> for
     * the network interface to perform network address translation (NAT) in
     * your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.subnet-id</code> - The ID of the subnet for the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.vpc-id</code> - The ID of the VPC for the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the instance owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>placement-group-name</code> - The name of the placement group for
     * the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>placement-partition-number</code> - The partition in which the
     * instance is located.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform. To list only Windows instances, use
     * <code>windows</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name</code> - The private IPv4 DNS name of the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - The private IPv4 address of the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code associated with the AMI used
     * to launch the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code.type</code> - The type of product code (
     * <code>devpay</code> | <code>marketplace</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reason</code> - The reason for the current state of the instance
     * (for example, shows "User Initiated [date]" when you stop or terminate
     * the instance). Similar to the state-reason-code filter.
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
     * <code>reservation-id</code> - The ID of the instance's reservation. A
     * reservation ID is created any time you launch an instance. A reservation
     * ID has a one-to-one relationship with an instance launch request, but can
     * be associated with more than one instance if you launch multiple
     * instances using the same launch request. For example, if you launch one
     * instance, you get one reservation ID. If you launch ten instances using
     * the same launch request, you also get one reservation ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-name</code> - The device name of the root device volume
     * (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-type</code> - The type of the root device volume (
     * <code>ebs</code> | <code>instance-store</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-dest-check</code> - Indicates whether the instance performs
     * source/destination checking. A value of <code>true</code> means that
     * checking is enabled, and <code>false</code> means that checking is
     * disabled. The value must be <code>false</code> for the instance to
     * perform network address translation (NAT) in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-instance-request-id</code> - The ID of the Spot Instance
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-code</code> - The reason code for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-message</code> - A message that describes the state
     * change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet for the instance.
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
     * this filter to find all resources that have a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - The tenancy of an instance (<code>dedicated</code>
     * | <code>default</code> | <code>host</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>virtualization-type</code> - The virtualization type of the
     * instance (<code>paravirtual</code> | <code>hvm</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC that the instance is running in.
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
     *            <code>affinity</code> - The affinity setting for an instance
     *            running on a Dedicated Host (<code>default</code> |
     *            <code>host</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>architecture</code> - The instance architecture (
     *            <code>i386</code> | <code>x86_64</code> | <code>arm64</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone of the
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.attach-time</code> - The attach
     *            time for an EBS volume mapped to the instance, for example,
     *            <code>2010-09-15T17:15:20.000Z</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.delete-on-termination</code> - A
     *            Boolean that indicates whether the EBS volume is deleted on
     *            instance termination.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.device-name</code> - The device
     *            name specified in the block device mapping (for example,
     *            <code>/dev/sdh</code> or <code>xvdh</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.status</code> - The status for the
     *            EBS volume (<code>attaching</code> | <code>attached</code> |
     *            <code>detaching</code> | <code>detached</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.volume-id</code> - The volume ID of
     *            the EBS volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>client-token</code> - The idempotency token you provided
     *            when you launched the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dns-name</code> - The public DNS name of the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>group-id</code> - The ID of the security group for the
     *            instance. EC2-Classic only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>group-name</code> - The name of the security group for
     *            the instance. EC2-Classic only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>hibernation-options.configured</code> - A Boolean that
     *            indicates whether the instance is enabled for hibernation. A
     *            value of <code>true</code> means that the instance is enabled
     *            for hibernation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>host-id</code> - The ID of the Dedicated Host on which
     *            the instance is running, if applicable.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>hypervisor</code> - The hypervisor type of the instance
     *            (<code>ovm</code> | <code>xen</code>). The value
     *            <code>xen</code> is used for both Xen and Nitro hypervisors.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>iam-instance-profile.arn</code> - The instance profile
     *            associated with the instance. Specified as an ARN.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>image-id</code> - The ID of the image used to launch the
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-id</code> - The ID of the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-lifecycle</code> - Indicates whether this is a
     *            Spot Instance or a Scheduled Instance (<code>spot</code> |
     *            <code>scheduled</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-state-code</code> - The state of the instance,
     *            as a 16-bit unsigned integer. The high byte is used for
     *            internal purposes and should be ignored. The low byte is set
     *            based on the state represented. The valid values are: 0
     *            (pending), 16 (running), 32 (shutting-down), 48 (terminated),
     *            64 (stopping), and 80 (stopped).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-state-name</code> - The state of the instance (
     *            <code>pending</code> | <code>running</code> |
     *            <code>shutting-down</code> | <code>terminated</code> |
     *            <code>stopping</code> | <code>stopped</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-type</code> - The type of instance (for
     *            example, <code>t2.micro</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance.group-id</code> - The ID of the security group
     *            for the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance.group-name</code> - The name of the security
     *            group for the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ip-address</code> - The public IPv4 address of the
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>kernel-id</code> - The kernel ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>key-name</code> - The name of the key pair used when the
     *            instance was launched.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>launch-index</code> - When launching multiple instances,
     *            this is the index for the instance in the launch group (for
     *            example, 0, 1, 2, and so on).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>launch-time</code> - The time when the instance was
     *            launched.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>metadata-options.http-tokens</code> - The metadata
     *            request authorization state (<code>optional</code> |
     *            <code>required</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>metadata-options.http-put-response-hop-limit</code> -
     *            The http metadata request put response hop limit (integer,
     *            possible values <code>1</code> to <code>64</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>metadata-options.http-endpoint</code> - Enable or
     *            disable metadata access on http endpoint (<code>enabled</code>
     *            | <code>disabled</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>monitoring-state</code> - Indicates whether detailed
     *            monitoring is enabled (<code>disabled</code> |
     *            <code>enabled</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.addresses.private-ip-address</code> -
     *            The private IPv4 address associated with the network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.addresses.primary</code> - Specifies
     *            whether the IPv4 address of the network interface is the
     *            primary private IPv4 address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.addresses.association.public-ip</code>
     *            - The ID of the association of an Elastic IP address (IPv4)
     *            with a network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.addresses.association.ip-owner-id</code>
     *            - The owner ID of the private IPv4 address associated with the
     *            network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.association.public-ip</code> - The
     *            address of the Elastic IP address (IPv4) bound to the network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.association.ip-owner-id</code> - The
     *            owner of the Elastic IP address (IPv4) associated with the
     *            network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.association.allocation-id</code> - The
     *            allocation ID returned when you allocated the Elastic IP
     *            address (IPv4) for your network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.association.association-id</code> -
     *            The association ID returned when the network interface was
     *            associated with an IPv4 address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.attachment.attachment-id</code> - The
     *            ID of the interface attachment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.attachment.instance-id</code> - The ID
     *            of the instance to which the network interface is attached.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.attachment.instance-owner-id</code> -
     *            The owner ID of the instance to which the network interface is
     *            attached.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.attachment.device-index</code> - The
     *            device index to which the network interface is attached.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.attachment.status</code> - The status
     *            of the attachment (<code>attaching</code> |
     *            <code>attached</code> | <code>detaching</code> |
     *            <code>detached</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.attachment.attach-time</code> - The
     *            time that the network interface was attached to an instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.attachment.delete-on-termination</code>
     *            - Specifies whether the attachment is deleted when an instance
     *            is terminated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.availability-zone</code> - The
     *            Availability Zone for the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.description</code> - The description
     *            of the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.group-id</code> - The ID of a security
     *            group associated with the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.group-name</code> - The name of a
     *            security group associated with the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.ipv6-addresses.ipv6-address</code> -
     *            The IPv6 address associated with the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.mac-address</code> - The MAC address
     *            of the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.network-interface-id</code> - The ID
     *            of the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.owner-id</code> - The ID of the owner
     *            of the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.private-dns-name</code> - The private
     *            DNS name of the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.requester-id</code> - The requester ID
     *            for the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.requester-managed</code> - Indicates
     *            whether the network interface is being managed by AWS.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.status</code> - The status of the
     *            network interface (<code>available</code>) |
     *            <code>in-use</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.source-dest-check</code> - Whether the
     *            network interface performs source/destination checking. A
     *            value of <code>true</code> means that checking is enabled, and
     *            <code>false</code> means that checking is disabled. The value
     *            must be <code>false</code> for the network interface to
     *            perform network address translation (NAT) in your VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.subnet-id</code> - The ID of the
     *            subnet for the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.vpc-id</code> - The ID of the VPC for
     *            the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The AWS account ID of the instance
     *            owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>placement-group-name</code> - The name of the placement
     *            group for the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>placement-partition-number</code> - The partition in
     *            which the instance is located.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>platform</code> - The platform. To list only Windows
     *            instances, use <code>windows</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>private-dns-name</code> - The private IPv4 DNS name of
     *            the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>private-ip-address</code> - The private IPv4 address of
     *            the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>product-code</code> - The product code associated with
     *            the AMI used to launch the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>product-code.type</code> - The type of product code (
     *            <code>devpay</code> | <code>marketplace</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ramdisk-id</code> - The RAM disk ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>reason</code> - The reason for the current state of the
     *            instance (for example, shows "User Initiated [date]" when you
     *            stop or terminate the instance). Similar to the
     *            state-reason-code filter.
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
     *            <code>reservation-id</code> - The ID of the instance's
     *            reservation. A reservation ID is created any time you launch
     *            an instance. A reservation ID has a one-to-one relationship
     *            with an instance launch request, but can be associated with
     *            more than one instance if you launch multiple instances using
     *            the same launch request. For example, if you launch one
     *            instance, you get one reservation ID. If you launch ten
     *            instances using the same launch request, you also get one
     *            reservation ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>root-device-name</code> - The device name of the root
     *            device volume (for example, <code>/dev/sda1</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>root-device-type</code> - The type of the root device
     *            volume (<code>ebs</code> | <code>instance-store</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>source-dest-check</code> - Indicates whether the
     *            instance performs source/destination checking. A value of
     *            <code>true</code> means that checking is enabled, and
     *            <code>false</code> means that checking is disabled. The value
     *            must be <code>false</code> for the instance to perform network
     *            address translation (NAT) in your VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>spot-instance-request-id</code> - The ID of the Spot
     *            Instance request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state-reason-code</code> - The reason code for the state
     *            change.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state-reason-message</code> - A message that describes
     *            the state change.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>subnet-id</code> - The ID of the subnet for the
     *            instance.
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
     *            resource. Use this filter to find all resources that have a
     *            tag with a specific key, regardless of the tag value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tenancy</code> - The tenancy of an instance (
     *            <code>dedicated</code> | <code>default</code> |
     *            <code>host</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>virtualization-type</code> - The virtualization type of
     *            the instance (<code>paravirtual</code> | <code>hvm</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpc-id</code> - The ID of the VPC that the instance is
     *            running in.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstancesRequest withFilters(Filter... filters) {
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
     * <code>affinity</code> - The affinity setting for an instance running on a
     * Dedicated Host (<code>default</code> | <code>host</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>architecture</code> - The instance architecture (<code>i386</code>
     * | <code>x86_64</code> | <code>arm64</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.attach-time</code> - The attach time for an
     * EBS volume mapped to the instance, for example,
     * <code>2010-09-15T17:15:20.000Z</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.delete-on-termination</code> - A Boolean that
     * indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.device-name</code> - The device name specified
     * in the block device mapping (for example, <code>/dev/sdh</code> or
     * <code>xvdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.status</code> - The status for the EBS volume
     * (<code>attaching</code> | <code>attached</code> | <code>detaching</code>
     * | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-id</code> - The volume ID of the EBS
     * volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token you provided when you
     * launched the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dns-name</code> - The public DNS name of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of the security group for the instance.
     * EC2-Classic only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code> - The name of the security group for the
     * instance. EC2-Classic only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hibernation-options.configured</code> - A Boolean that indicates
     * whether the instance is enabled for hibernation. A value of
     * <code>true</code> means that the instance is enabled for hibernation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>host-id</code> - The ID of the Dedicated Host on which the instance
     * is running, if applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor type of the instance (
     * <code>ovm</code> | <code>xen</code>). The value <code>xen</code> is used
     * for both Xen and Nitro hypervisors.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile.arn</code> - The instance profile associated
     * with the instance. Specified as an ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the image used to launch the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-lifecycle</code> - Indicates whether this is a Spot
     * Instance or a Scheduled Instance (<code>spot</code> |
     * <code>scheduled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-code</code> - The state of the instance, as a 16-bit
     * unsigned integer. The high byte is used for internal purposes and should
     * be ignored. The low byte is set based on the state represented. The valid
     * values are: 0 (pending), 16 (running), 32 (shutting-down), 48
     * (terminated), 64 (stopping), and 80 (stopped).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-name</code> - The state of the instance (
     * <code>pending</code> | <code>running</code> | <code>shutting-down</code>
     * | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance (for example,
     * <code>t2.micro</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance.group-id</code> - The ID of the security group for the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance.group-name</code> - The name of the security group for the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-address</code> - The public IPv4 address of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key-name</code> - The name of the key pair used when the instance
     * was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-index</code> - When launching multiple instances, this is
     * the index for the instance in the launch group (for example, 0, 1, 2, and
     * so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-time</code> - The time when the instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-tokens</code> - The metadata request
     * authorization state (<code>optional</code> | <code>required</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-put-response-hop-limit</code> - The http
     * metadata request put response hop limit (integer, possible values
     * <code>1</code> to <code>64</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-endpoint</code> - Enable or disable metadata
     * access on http endpoint (<code>enabled</code> | <code>disabled</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>monitoring-state</code> - Indicates whether detailed monitoring is
     * enabled (<code>disabled</code> | <code>enabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.private-ip-address</code> - The private
     * IPv4 address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.primary</code> - Specifies whether the
     * IPv4 address of the network interface is the primary private IPv4
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.public-ip</code> - The ID
     * of the association of an Elastic IP address (IPv4) with a network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.ip-owner-id</code> - The
     * owner ID of the private IPv4 address associated with the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.public-ip</code> - The address of the
     * Elastic IP address (IPv4) bound to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.ip-owner-id</code> - The owner of the
     * Elastic IP address (IPv4) associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.allocation-id</code> - The allocation
     * ID returned when you allocated the Elastic IP address (IPv4) for your
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.association-id</code> - The
     * association ID returned when the network interface was associated with an
     * IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.attachment-id</code> - The ID of the
     * interface attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.instance-id</code> - The ID of the
     * instance to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.instance-owner-id</code> - The owner
     * ID of the instance to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.device-index</code> - The device index
     * to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.status</code> - The status of the
     * attachment (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.attach-time</code> - The time that the
     * network interface was attached to an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.delete-on-termination</code> -
     * Specifies whether the attachment is deleted when an instance is
     * terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.availability-zone</code> - The Availability Zone
     * for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.description</code> - The description of the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-id</code> - The ID of a security group
     * associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-name</code> - The name of a security group
     * associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-addresses.ipv6-address</code> - The IPv6
     * address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.mac-address</code> - The MAC address of the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.network-interface-id</code> - The ID of the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.owner-id</code> - The ID of the owner of the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-dns-name</code> - The private DNS name of
     * the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.requester-id</code> - The requester ID for the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.requester-managed</code> - Indicates whether the
     * network interface is being managed by AWS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.status</code> - The status of the network
     * interface (<code>available</code>) | <code>in-use</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.source-dest-check</code> - Whether the network
     * interface performs source/destination checking. A value of
     * <code>true</code> means that checking is enabled, and <code>false</code>
     * means that checking is disabled. The value must be <code>false</code> for
     * the network interface to perform network address translation (NAT) in
     * your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.subnet-id</code> - The ID of the subnet for the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.vpc-id</code> - The ID of the VPC for the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the instance owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>placement-group-name</code> - The name of the placement group for
     * the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>placement-partition-number</code> - The partition in which the
     * instance is located.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform. To list only Windows instances, use
     * <code>windows</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name</code> - The private IPv4 DNS name of the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - The private IPv4 address of the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code associated with the AMI used
     * to launch the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code.type</code> - The type of product code (
     * <code>devpay</code> | <code>marketplace</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reason</code> - The reason for the current state of the instance
     * (for example, shows "User Initiated [date]" when you stop or terminate
     * the instance). Similar to the state-reason-code filter.
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
     * <code>reservation-id</code> - The ID of the instance's reservation. A
     * reservation ID is created any time you launch an instance. A reservation
     * ID has a one-to-one relationship with an instance launch request, but can
     * be associated with more than one instance if you launch multiple
     * instances using the same launch request. For example, if you launch one
     * instance, you get one reservation ID. If you launch ten instances using
     * the same launch request, you also get one reservation ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-name</code> - The device name of the root device volume
     * (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-type</code> - The type of the root device volume (
     * <code>ebs</code> | <code>instance-store</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-dest-check</code> - Indicates whether the instance performs
     * source/destination checking. A value of <code>true</code> means that
     * checking is enabled, and <code>false</code> means that checking is
     * disabled. The value must be <code>false</code> for the instance to
     * perform network address translation (NAT) in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-instance-request-id</code> - The ID of the Spot Instance
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-code</code> - The reason code for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-message</code> - A message that describes the state
     * change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet for the instance.
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
     * this filter to find all resources that have a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - The tenancy of an instance (<code>dedicated</code>
     * | <code>default</code> | <code>host</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>virtualization-type</code> - The virtualization type of the
     * instance (<code>paravirtual</code> | <code>hvm</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC that the instance is running in.
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
     *            <code>affinity</code> - The affinity setting for an instance
     *            running on a Dedicated Host (<code>default</code> |
     *            <code>host</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>architecture</code> - The instance architecture (
     *            <code>i386</code> | <code>x86_64</code> | <code>arm64</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone of the
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.attach-time</code> - The attach
     *            time for an EBS volume mapped to the instance, for example,
     *            <code>2010-09-15T17:15:20.000Z</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.delete-on-termination</code> - A
     *            Boolean that indicates whether the EBS volume is deleted on
     *            instance termination.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.device-name</code> - The device
     *            name specified in the block device mapping (for example,
     *            <code>/dev/sdh</code> or <code>xvdh</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.status</code> - The status for the
     *            EBS volume (<code>attaching</code> | <code>attached</code> |
     *            <code>detaching</code> | <code>detached</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.volume-id</code> - The volume ID of
     *            the EBS volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>client-token</code> - The idempotency token you provided
     *            when you launched the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dns-name</code> - The public DNS name of the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>group-id</code> - The ID of the security group for the
     *            instance. EC2-Classic only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>group-name</code> - The name of the security group for
     *            the instance. EC2-Classic only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>hibernation-options.configured</code> - A Boolean that
     *            indicates whether the instance is enabled for hibernation. A
     *            value of <code>true</code> means that the instance is enabled
     *            for hibernation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>host-id</code> - The ID of the Dedicated Host on which
     *            the instance is running, if applicable.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>hypervisor</code> - The hypervisor type of the instance
     *            (<code>ovm</code> | <code>xen</code>). The value
     *            <code>xen</code> is used for both Xen and Nitro hypervisors.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>iam-instance-profile.arn</code> - The instance profile
     *            associated with the instance. Specified as an ARN.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>image-id</code> - The ID of the image used to launch the
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-id</code> - The ID of the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-lifecycle</code> - Indicates whether this is a
     *            Spot Instance or a Scheduled Instance (<code>spot</code> |
     *            <code>scheduled</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-state-code</code> - The state of the instance,
     *            as a 16-bit unsigned integer. The high byte is used for
     *            internal purposes and should be ignored. The low byte is set
     *            based on the state represented. The valid values are: 0
     *            (pending), 16 (running), 32 (shutting-down), 48 (terminated),
     *            64 (stopping), and 80 (stopped).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-state-name</code> - The state of the instance (
     *            <code>pending</code> | <code>running</code> |
     *            <code>shutting-down</code> | <code>terminated</code> |
     *            <code>stopping</code> | <code>stopped</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-type</code> - The type of instance (for
     *            example, <code>t2.micro</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance.group-id</code> - The ID of the security group
     *            for the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance.group-name</code> - The name of the security
     *            group for the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ip-address</code> - The public IPv4 address of the
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>kernel-id</code> - The kernel ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>key-name</code> - The name of the key pair used when the
     *            instance was launched.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>launch-index</code> - When launching multiple instances,
     *            this is the index for the instance in the launch group (for
     *            example, 0, 1, 2, and so on).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>launch-time</code> - The time when the instance was
     *            launched.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>metadata-options.http-tokens</code> - The metadata
     *            request authorization state (<code>optional</code> |
     *            <code>required</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>metadata-options.http-put-response-hop-limit</code> -
     *            The http metadata request put response hop limit (integer,
     *            possible values <code>1</code> to <code>64</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>metadata-options.http-endpoint</code> - Enable or
     *            disable metadata access on http endpoint (<code>enabled</code>
     *            | <code>disabled</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>monitoring-state</code> - Indicates whether detailed
     *            monitoring is enabled (<code>disabled</code> |
     *            <code>enabled</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.addresses.private-ip-address</code> -
     *            The private IPv4 address associated with the network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.addresses.primary</code> - Specifies
     *            whether the IPv4 address of the network interface is the
     *            primary private IPv4 address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.addresses.association.public-ip</code>
     *            - The ID of the association of an Elastic IP address (IPv4)
     *            with a network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.addresses.association.ip-owner-id</code>
     *            - The owner ID of the private IPv4 address associated with the
     *            network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.association.public-ip</code> - The
     *            address of the Elastic IP address (IPv4) bound to the network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.association.ip-owner-id</code> - The
     *            owner of the Elastic IP address (IPv4) associated with the
     *            network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.association.allocation-id</code> - The
     *            allocation ID returned when you allocated the Elastic IP
     *            address (IPv4) for your network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.association.association-id</code> -
     *            The association ID returned when the network interface was
     *            associated with an IPv4 address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.attachment.attachment-id</code> - The
     *            ID of the interface attachment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.attachment.instance-id</code> - The ID
     *            of the instance to which the network interface is attached.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.attachment.instance-owner-id</code> -
     *            The owner ID of the instance to which the network interface is
     *            attached.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.attachment.device-index</code> - The
     *            device index to which the network interface is attached.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.attachment.status</code> - The status
     *            of the attachment (<code>attaching</code> |
     *            <code>attached</code> | <code>detaching</code> |
     *            <code>detached</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.attachment.attach-time</code> - The
     *            time that the network interface was attached to an instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.attachment.delete-on-termination</code>
     *            - Specifies whether the attachment is deleted when an instance
     *            is terminated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.availability-zone</code> - The
     *            Availability Zone for the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.description</code> - The description
     *            of the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.group-id</code> - The ID of a security
     *            group associated with the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.group-name</code> - The name of a
     *            security group associated with the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.ipv6-addresses.ipv6-address</code> -
     *            The IPv6 address associated with the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.mac-address</code> - The MAC address
     *            of the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.network-interface-id</code> - The ID
     *            of the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.owner-id</code> - The ID of the owner
     *            of the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.private-dns-name</code> - The private
     *            DNS name of the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.requester-id</code> - The requester ID
     *            for the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.requester-managed</code> - Indicates
     *            whether the network interface is being managed by AWS.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.status</code> - The status of the
     *            network interface (<code>available</code>) |
     *            <code>in-use</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.source-dest-check</code> - Whether the
     *            network interface performs source/destination checking. A
     *            value of <code>true</code> means that checking is enabled, and
     *            <code>false</code> means that checking is disabled. The value
     *            must be <code>false</code> for the network interface to
     *            perform network address translation (NAT) in your VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.subnet-id</code> - The ID of the
     *            subnet for the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-interface.vpc-id</code> - The ID of the VPC for
     *            the network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The AWS account ID of the instance
     *            owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>placement-group-name</code> - The name of the placement
     *            group for the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>placement-partition-number</code> - The partition in
     *            which the instance is located.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>platform</code> - The platform. To list only Windows
     *            instances, use <code>windows</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>private-dns-name</code> - The private IPv4 DNS name of
     *            the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>private-ip-address</code> - The private IPv4 address of
     *            the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>product-code</code> - The product code associated with
     *            the AMI used to launch the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>product-code.type</code> - The type of product code (
     *            <code>devpay</code> | <code>marketplace</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ramdisk-id</code> - The RAM disk ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>reason</code> - The reason for the current state of the
     *            instance (for example, shows "User Initiated [date]" when you
     *            stop or terminate the instance). Similar to the
     *            state-reason-code filter.
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
     *            <code>reservation-id</code> - The ID of the instance's
     *            reservation. A reservation ID is created any time you launch
     *            an instance. A reservation ID has a one-to-one relationship
     *            with an instance launch request, but can be associated with
     *            more than one instance if you launch multiple instances using
     *            the same launch request. For example, if you launch one
     *            instance, you get one reservation ID. If you launch ten
     *            instances using the same launch request, you also get one
     *            reservation ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>root-device-name</code> - The device name of the root
     *            device volume (for example, <code>/dev/sda1</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>root-device-type</code> - The type of the root device
     *            volume (<code>ebs</code> | <code>instance-store</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>source-dest-check</code> - Indicates whether the
     *            instance performs source/destination checking. A value of
     *            <code>true</code> means that checking is enabled, and
     *            <code>false</code> means that checking is disabled. The value
     *            must be <code>false</code> for the instance to perform network
     *            address translation (NAT) in your VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>spot-instance-request-id</code> - The ID of the Spot
     *            Instance request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state-reason-code</code> - The reason code for the state
     *            change.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state-reason-message</code> - A message that describes
     *            the state change.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>subnet-id</code> - The ID of the subnet for the
     *            instance.
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
     *            resource. Use this filter to find all resources that have a
     *            tag with a specific key, regardless of the tag value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tenancy</code> - The tenancy of an instance (
     *            <code>dedicated</code> | <code>default</code> |
     *            <code>host</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>virtualization-type</code> - The virtualization type of
     *            the instance (<code>paravirtual</code> | <code>hvm</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpc-id</code> - The ID of the VPC that the instance is
     *            running in.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstancesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     *
     * @return <p>
     *         The instance IDs.
     *         </p>
     *         <p>
     *         Default: Describes all your instances.
     *         </p>
     */
    public java.util.List<String> getInstanceIds() {
        return instanceIds;
    }

    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     *
     * @param instanceIds <p>
     *            The instance IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your instances.
     *            </p>
     */
    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new java.util.ArrayList<String>(instanceIds);
    }

    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceIds <p>
     *            The instance IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstancesRequest withInstanceIds(String... instanceIds) {
        if (getInstanceIds() == null) {
            this.instanceIds = new java.util.ArrayList<String>(instanceIds.length);
        }
        for (String value : instanceIds) {
            this.instanceIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceIds <p>
     *            The instance IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstancesRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
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
    public DescribeInstancesRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000. You
     * cannot specify this parameter and the instance IDs parameter in the same
     * call.
     * </p>
     *
     * @return <p>
     *         The maximum number of results to return in a single call. To
     *         retrieve the remaining results, make another call with the
     *         returned <code>NextToken</code> value. This value can be between
     *         5 and 1000. You cannot specify this parameter and the instance
     *         IDs parameter in the same call.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000. You
     * cannot specify this parameter and the instance IDs parameter in the same
     * call.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>NextToken</code> value. This value can be
     *            between 5 and 1000. You cannot specify this parameter and the
     *            instance IDs parameter in the same call.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000. You
     * cannot specify this parameter and the instance IDs parameter in the same
     * call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>NextToken</code> value. This value can be
     *            between 5 and 1000. You cannot specify this parameter and the
     *            instance IDs parameter in the same call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstancesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     *
     * @return <p>
     *         The token to request the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to request the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to request the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstancesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getInstanceIds() != null)
            sb.append("InstanceIds: " + getInstanceIds() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstancesRequest == false)
            return false;
        DescribeInstancesRequest other = (DescribeInstancesRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null
                && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
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
        return true;
    }
}
