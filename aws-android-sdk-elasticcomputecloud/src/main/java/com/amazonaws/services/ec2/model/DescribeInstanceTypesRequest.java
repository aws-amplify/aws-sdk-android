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
 * Returns a list of all instance types offered in your current AWS Region. The
 * results can be filtered by the attributes of the instance types.
 * </p>
 */
public class DescribeInstanceTypesRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The instance types. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     */
    private java.util.List<String> instanceTypes;

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto-recovery-supported</code> - Indicates whether auto recovery is
     * supported. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bare-metal</code> - Indicates whether it is a bare metal instance
     * type. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>burstable-performance-supported</code> - Indicates whether it is a
     * burstable performance instance type. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>current-generation</code> - Indicates whether this instance type is
     * the latest generation instance type of an instance family. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-info.ebs-optimized-support</code> - Indicates whether the
     * instance type is EBS-optimized. (<code>supported</code> |
     * <code>unsupported</code> | <code>default</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-info.encryption-support</code> - Indicates whether EBS
     * encryption is supported. (<code>supported</code> |
     * <code>unsupported</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>free-tier-eligible</code> - Indicates whether the instance type is
     * eligible to use in the free tier. (<code>true</code> | <code>false</code>
     * )
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hibernation-supported</code> - Indicates whether On-Demand
     * hibernation is supported. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor used. (<code>nitro</code> |
     * <code>xen</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.count</code> - The number of local
     * disks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.size-in-gb</code> - The storage size of
     * each instance storage disk, in GB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.type</code> - The storage technology for
     * the local instance storage disks. (<code>hdd</code> | <code>ssd</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.total-size-in-gb</code> - The total amount of
     * storage available from all local instance storage, in GB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-supported</code> - Indicates whether the instance
     * type has local instance storage. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>memory-info.size-in-mib</code> - The memory size.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ena-support</code> - Indicates whether Elastic Network
     * Adapter (ENA) is supported or required. (<code>required</code> |
     * <code>supported</code> | <code>unsupported</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv4-addresses-per-interface</code> - The maximum
     * number of private IPv4 addresses per network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv6-addresses-per-interface</code> - The maximum
     * number of private IPv6 addresses per network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv6-supported</code> - Indicates whether the instance
     * type supports IPv6. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.maximum-network-interfaces</code> - The maximum number
     * of network interfaces per instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.network-performance</code> - Describes the network
     * performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>processor-info.sustained-clock-speed-in-ghz</code> - The CPU clock
     * speed, in GHz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-cores</code> - The default number of cores for
     * the instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-threads-per-core</code> - The default number of
     * threads per core for the instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-vcpus</code> - The default number of vCPUs for
     * the instance type.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * next token value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 100<br/>
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
    public DescribeInstanceTypesRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The instance types. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         The instance types. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *         >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     *         </p>
     */
    public java.util.List<String> getInstanceTypes() {
        return instanceTypes;
    }

    /**
     * <p>
     * The instance types. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @param instanceTypes <p>
     *            The instance types. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *            >Instance Types</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
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
     * The instance types. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceTypes <p>
     *            The instance types. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *            >Instance Types</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceTypesRequest withInstanceTypes(String... instanceTypes) {
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
     * The instance types. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceTypes <p>
     *            The instance types. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *            >Instance Types</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceTypesRequest withInstanceTypes(java.util.Collection<String> instanceTypes) {
        setInstanceTypes(instanceTypes);
        return this;
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto-recovery-supported</code> - Indicates whether auto recovery is
     * supported. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bare-metal</code> - Indicates whether it is a bare metal instance
     * type. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>burstable-performance-supported</code> - Indicates whether it is a
     * burstable performance instance type. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>current-generation</code> - Indicates whether this instance type is
     * the latest generation instance type of an instance family. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-info.ebs-optimized-support</code> - Indicates whether the
     * instance type is EBS-optimized. (<code>supported</code> |
     * <code>unsupported</code> | <code>default</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-info.encryption-support</code> - Indicates whether EBS
     * encryption is supported. (<code>supported</code> |
     * <code>unsupported</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>free-tier-eligible</code> - Indicates whether the instance type is
     * eligible to use in the free tier. (<code>true</code> | <code>false</code>
     * )
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hibernation-supported</code> - Indicates whether On-Demand
     * hibernation is supported. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor used. (<code>nitro</code> |
     * <code>xen</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.count</code> - The number of local
     * disks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.size-in-gb</code> - The storage size of
     * each instance storage disk, in GB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.type</code> - The storage technology for
     * the local instance storage disks. (<code>hdd</code> | <code>ssd</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.total-size-in-gb</code> - The total amount of
     * storage available from all local instance storage, in GB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-supported</code> - Indicates whether the instance
     * type has local instance storage. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>memory-info.size-in-mib</code> - The memory size.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ena-support</code> - Indicates whether Elastic Network
     * Adapter (ENA) is supported or required. (<code>required</code> |
     * <code>supported</code> | <code>unsupported</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv4-addresses-per-interface</code> - The maximum
     * number of private IPv4 addresses per network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv6-addresses-per-interface</code> - The maximum
     * number of private IPv6 addresses per network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv6-supported</code> - Indicates whether the instance
     * type supports IPv6. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.maximum-network-interfaces</code> - The maximum number
     * of network interfaces per instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.network-performance</code> - Describes the network
     * performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>processor-info.sustained-clock-speed-in-ghz</code> - The CPU clock
     * speed, in GHz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-cores</code> - The default number of cores for
     * the instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-threads-per-core</code> - The default number of
     * threads per core for the instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-vcpus</code> - The default number of vCPUs for
     * the instance type.
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
     *         <code>auto-recovery-supported</code> - Indicates whether auto
     *         recovery is supported. (<code>true</code> | <code>false</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>bare-metal</code> - Indicates whether it is a bare metal
     *         instance type. (<code>true</code> | <code>false</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>burstable-performance-supported</code> - Indicates whether
     *         it is a burstable performance instance type. (<code>true</code> |
     *         <code>false</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>current-generation</code> - Indicates whether this instance
     *         type is the latest generation instance type of an instance
     *         family. (<code>true</code> | <code>false</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ebs-info.ebs-optimized-support</code> - Indicates whether
     *         the instance type is EBS-optimized. (<code>supported</code> |
     *         <code>unsupported</code> | <code>default</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ebs-info.encryption-support</code> - Indicates whether EBS
     *         encryption is supported. (<code>supported</code> |
     *         <code>unsupported</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>free-tier-eligible</code> - Indicates whether the instance
     *         type is eligible to use in the free tier. (<code>true</code> |
     *         <code>false</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>hibernation-supported</code> - Indicates whether On-Demand
     *         hibernation is supported. (<code>true</code> | <code>false</code>
     *         )
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>hypervisor</code> - The hypervisor used. (
     *         <code>nitro</code> | <code>xen</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-storage-info.disk.count</code> - The number of
     *         local disks.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-storage-info.disk.size-in-gb</code> - The storage
     *         size of each instance storage disk, in GB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-storage-info.disk.type</code> - The storage
     *         technology for the local instance storage disks. (
     *         <code>hdd</code> | <code>ssd</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-storage-info.total-size-in-gb</code> - The total
     *         amount of storage available from all local instance storage, in
     *         GB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-storage-supported</code> - Indicates whether the
     *         instance type has local instance storage. (<code>true</code> |
     *         <code>false</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>memory-info.size-in-mib</code> - The memory size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-info.ena-support</code> - Indicates whether Elastic
     *         Network Adapter (ENA) is supported or required. (
     *         <code>required</code> | <code>supported</code> |
     *         <code>unsupported</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-info.ipv4-addresses-per-interface</code> - The
     *         maximum number of private IPv4 addresses per network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-info.ipv6-addresses-per-interface</code> - The
     *         maximum number of private IPv6 addresses per network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-info.ipv6-supported</code> - Indicates whether the
     *         instance type supports IPv6. (<code>true</code> |
     *         <code>false</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-info.maximum-network-interfaces</code> - The
     *         maximum number of network interfaces per instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-info.network-performance</code> - Describes the
     *         network performance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>processor-info.sustained-clock-speed-in-ghz</code> - The
     *         CPU clock speed, in GHz.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vcpu-info.default-cores</code> - The default number of
     *         cores for the instance type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vcpu-info.default-threads-per-core</code> - The default
     *         number of threads per core for the instance type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vcpu-info.default-vcpus</code> - The default number of
     *         vCPUs for the instance type.
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
     * <code>auto-recovery-supported</code> - Indicates whether auto recovery is
     * supported. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bare-metal</code> - Indicates whether it is a bare metal instance
     * type. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>burstable-performance-supported</code> - Indicates whether it is a
     * burstable performance instance type. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>current-generation</code> - Indicates whether this instance type is
     * the latest generation instance type of an instance family. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-info.ebs-optimized-support</code> - Indicates whether the
     * instance type is EBS-optimized. (<code>supported</code> |
     * <code>unsupported</code> | <code>default</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-info.encryption-support</code> - Indicates whether EBS
     * encryption is supported. (<code>supported</code> |
     * <code>unsupported</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>free-tier-eligible</code> - Indicates whether the instance type is
     * eligible to use in the free tier. (<code>true</code> | <code>false</code>
     * )
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hibernation-supported</code> - Indicates whether On-Demand
     * hibernation is supported. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor used. (<code>nitro</code> |
     * <code>xen</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.count</code> - The number of local
     * disks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.size-in-gb</code> - The storage size of
     * each instance storage disk, in GB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.type</code> - The storage technology for
     * the local instance storage disks. (<code>hdd</code> | <code>ssd</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.total-size-in-gb</code> - The total amount of
     * storage available from all local instance storage, in GB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-supported</code> - Indicates whether the instance
     * type has local instance storage. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>memory-info.size-in-mib</code> - The memory size.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ena-support</code> - Indicates whether Elastic Network
     * Adapter (ENA) is supported or required. (<code>required</code> |
     * <code>supported</code> | <code>unsupported</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv4-addresses-per-interface</code> - The maximum
     * number of private IPv4 addresses per network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv6-addresses-per-interface</code> - The maximum
     * number of private IPv6 addresses per network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv6-supported</code> - Indicates whether the instance
     * type supports IPv6. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.maximum-network-interfaces</code> - The maximum number
     * of network interfaces per instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.network-performance</code> - Describes the network
     * performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>processor-info.sustained-clock-speed-in-ghz</code> - The CPU clock
     * speed, in GHz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-cores</code> - The default number of cores for
     * the instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-threads-per-core</code> - The default number of
     * threads per core for the instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-vcpus</code> - The default number of vCPUs for
     * the instance type.
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
     *            <code>auto-recovery-supported</code> - Indicates whether auto
     *            recovery is supported. (<code>true</code> | <code>false</code>
     *            )
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>bare-metal</code> - Indicates whether it is a bare metal
     *            instance type. (<code>true</code> | <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>burstable-performance-supported</code> - Indicates
     *            whether it is a burstable performance instance type. (
     *            <code>true</code> | <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>current-generation</code> - Indicates whether this
     *            instance type is the latest generation instance type of an
     *            instance family. (<code>true</code> | <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ebs-info.ebs-optimized-support</code> - Indicates
     *            whether the instance type is EBS-optimized. (
     *            <code>supported</code> | <code>unsupported</code> |
     *            <code>default</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ebs-info.encryption-support</code> - Indicates whether
     *            EBS encryption is supported. (<code>supported</code> |
     *            <code>unsupported</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>free-tier-eligible</code> - Indicates whether the
     *            instance type is eligible to use in the free tier. (
     *            <code>true</code> | <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>hibernation-supported</code> - Indicates whether
     *            On-Demand hibernation is supported. (<code>true</code> |
     *            <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>hypervisor</code> - The hypervisor used. (
     *            <code>nitro</code> | <code>xen</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-storage-info.disk.count</code> - The number of
     *            local disks.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-storage-info.disk.size-in-gb</code> - The
     *            storage size of each instance storage disk, in GB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-storage-info.disk.type</code> - The storage
     *            technology for the local instance storage disks. (
     *            <code>hdd</code> | <code>ssd</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-storage-info.total-size-in-gb</code> - The
     *            total amount of storage available from all local instance
     *            storage, in GB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-storage-supported</code> - Indicates whether
     *            the instance type has local instance storage. (
     *            <code>true</code> | <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>memory-info.size-in-mib</code> - The memory size.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-info.ena-support</code> - Indicates whether
     *            Elastic Network Adapter (ENA) is supported or required. (
     *            <code>required</code> | <code>supported</code> |
     *            <code>unsupported</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-info.ipv4-addresses-per-interface</code> - The
     *            maximum number of private IPv4 addresses per network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-info.ipv6-addresses-per-interface</code> - The
     *            maximum number of private IPv6 addresses per network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-info.ipv6-supported</code> - Indicates whether
     *            the instance type supports IPv6. (<code>true</code> |
     *            <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-info.maximum-network-interfaces</code> - The
     *            maximum number of network interfaces per instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-info.network-performance</code> - Describes the
     *            network performance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>processor-info.sustained-clock-speed-in-ghz</code> - The
     *            CPU clock speed, in GHz.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vcpu-info.default-cores</code> - The default number of
     *            cores for the instance type.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vcpu-info.default-threads-per-core</code> - The default
     *            number of threads per core for the instance type.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vcpu-info.default-vcpus</code> - The default number of
     *            vCPUs for the instance type.
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
     * <code>auto-recovery-supported</code> - Indicates whether auto recovery is
     * supported. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bare-metal</code> - Indicates whether it is a bare metal instance
     * type. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>burstable-performance-supported</code> - Indicates whether it is a
     * burstable performance instance type. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>current-generation</code> - Indicates whether this instance type is
     * the latest generation instance type of an instance family. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-info.ebs-optimized-support</code> - Indicates whether the
     * instance type is EBS-optimized. (<code>supported</code> |
     * <code>unsupported</code> | <code>default</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-info.encryption-support</code> - Indicates whether EBS
     * encryption is supported. (<code>supported</code> |
     * <code>unsupported</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>free-tier-eligible</code> - Indicates whether the instance type is
     * eligible to use in the free tier. (<code>true</code> | <code>false</code>
     * )
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hibernation-supported</code> - Indicates whether On-Demand
     * hibernation is supported. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor used. (<code>nitro</code> |
     * <code>xen</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.count</code> - The number of local
     * disks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.size-in-gb</code> - The storage size of
     * each instance storage disk, in GB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.type</code> - The storage technology for
     * the local instance storage disks. (<code>hdd</code> | <code>ssd</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.total-size-in-gb</code> - The total amount of
     * storage available from all local instance storage, in GB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-supported</code> - Indicates whether the instance
     * type has local instance storage. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>memory-info.size-in-mib</code> - The memory size.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ena-support</code> - Indicates whether Elastic Network
     * Adapter (ENA) is supported or required. (<code>required</code> |
     * <code>supported</code> | <code>unsupported</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv4-addresses-per-interface</code> - The maximum
     * number of private IPv4 addresses per network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv6-addresses-per-interface</code> - The maximum
     * number of private IPv6 addresses per network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv6-supported</code> - Indicates whether the instance
     * type supports IPv6. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.maximum-network-interfaces</code> - The maximum number
     * of network interfaces per instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.network-performance</code> - Describes the network
     * performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>processor-info.sustained-clock-speed-in-ghz</code> - The CPU clock
     * speed, in GHz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-cores</code> - The default number of cores for
     * the instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-threads-per-core</code> - The default number of
     * threads per core for the instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-vcpus</code> - The default number of vCPUs for
     * the instance type.
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
     *            <code>auto-recovery-supported</code> - Indicates whether auto
     *            recovery is supported. (<code>true</code> | <code>false</code>
     *            )
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>bare-metal</code> - Indicates whether it is a bare metal
     *            instance type. (<code>true</code> | <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>burstable-performance-supported</code> - Indicates
     *            whether it is a burstable performance instance type. (
     *            <code>true</code> | <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>current-generation</code> - Indicates whether this
     *            instance type is the latest generation instance type of an
     *            instance family. (<code>true</code> | <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ebs-info.ebs-optimized-support</code> - Indicates
     *            whether the instance type is EBS-optimized. (
     *            <code>supported</code> | <code>unsupported</code> |
     *            <code>default</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ebs-info.encryption-support</code> - Indicates whether
     *            EBS encryption is supported. (<code>supported</code> |
     *            <code>unsupported</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>free-tier-eligible</code> - Indicates whether the
     *            instance type is eligible to use in the free tier. (
     *            <code>true</code> | <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>hibernation-supported</code> - Indicates whether
     *            On-Demand hibernation is supported. (<code>true</code> |
     *            <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>hypervisor</code> - The hypervisor used. (
     *            <code>nitro</code> | <code>xen</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-storage-info.disk.count</code> - The number of
     *            local disks.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-storage-info.disk.size-in-gb</code> - The
     *            storage size of each instance storage disk, in GB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-storage-info.disk.type</code> - The storage
     *            technology for the local instance storage disks. (
     *            <code>hdd</code> | <code>ssd</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-storage-info.total-size-in-gb</code> - The
     *            total amount of storage available from all local instance
     *            storage, in GB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-storage-supported</code> - Indicates whether
     *            the instance type has local instance storage. (
     *            <code>true</code> | <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>memory-info.size-in-mib</code> - The memory size.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-info.ena-support</code> - Indicates whether
     *            Elastic Network Adapter (ENA) is supported or required. (
     *            <code>required</code> | <code>supported</code> |
     *            <code>unsupported</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-info.ipv4-addresses-per-interface</code> - The
     *            maximum number of private IPv4 addresses per network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-info.ipv6-addresses-per-interface</code> - The
     *            maximum number of private IPv6 addresses per network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-info.ipv6-supported</code> - Indicates whether
     *            the instance type supports IPv6. (<code>true</code> |
     *            <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-info.maximum-network-interfaces</code> - The
     *            maximum number of network interfaces per instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-info.network-performance</code> - Describes the
     *            network performance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>processor-info.sustained-clock-speed-in-ghz</code> - The
     *            CPU clock speed, in GHz.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vcpu-info.default-cores</code> - The default number of
     *            cores for the instance type.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vcpu-info.default-threads-per-core</code> - The default
     *            number of threads per core for the instance type.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vcpu-info.default-vcpus</code> - The default number of
     *            vCPUs for the instance type.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceTypesRequest withFilters(Filter... filters) {
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
     * <code>auto-recovery-supported</code> - Indicates whether auto recovery is
     * supported. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bare-metal</code> - Indicates whether it is a bare metal instance
     * type. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>burstable-performance-supported</code> - Indicates whether it is a
     * burstable performance instance type. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>current-generation</code> - Indicates whether this instance type is
     * the latest generation instance type of an instance family. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-info.ebs-optimized-support</code> - Indicates whether the
     * instance type is EBS-optimized. (<code>supported</code> |
     * <code>unsupported</code> | <code>default</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-info.encryption-support</code> - Indicates whether EBS
     * encryption is supported. (<code>supported</code> |
     * <code>unsupported</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>free-tier-eligible</code> - Indicates whether the instance type is
     * eligible to use in the free tier. (<code>true</code> | <code>false</code>
     * )
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hibernation-supported</code> - Indicates whether On-Demand
     * hibernation is supported. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor used. (<code>nitro</code> |
     * <code>xen</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.count</code> - The number of local
     * disks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.size-in-gb</code> - The storage size of
     * each instance storage disk, in GB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.type</code> - The storage technology for
     * the local instance storage disks. (<code>hdd</code> | <code>ssd</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.total-size-in-gb</code> - The total amount of
     * storage available from all local instance storage, in GB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-supported</code> - Indicates whether the instance
     * type has local instance storage. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>memory-info.size-in-mib</code> - The memory size.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ena-support</code> - Indicates whether Elastic Network
     * Adapter (ENA) is supported or required. (<code>required</code> |
     * <code>supported</code> | <code>unsupported</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv4-addresses-per-interface</code> - The maximum
     * number of private IPv4 addresses per network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv6-addresses-per-interface</code> - The maximum
     * number of private IPv6 addresses per network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv6-supported</code> - Indicates whether the instance
     * type supports IPv6. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.maximum-network-interfaces</code> - The maximum number
     * of network interfaces per instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.network-performance</code> - Describes the network
     * performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>processor-info.sustained-clock-speed-in-ghz</code> - The CPU clock
     * speed, in GHz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-cores</code> - The default number of cores for
     * the instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-threads-per-core</code> - The default number of
     * threads per core for the instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-vcpus</code> - The default number of vCPUs for
     * the instance type.
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
     *            <code>auto-recovery-supported</code> - Indicates whether auto
     *            recovery is supported. (<code>true</code> | <code>false</code>
     *            )
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>bare-metal</code> - Indicates whether it is a bare metal
     *            instance type. (<code>true</code> | <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>burstable-performance-supported</code> - Indicates
     *            whether it is a burstable performance instance type. (
     *            <code>true</code> | <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>current-generation</code> - Indicates whether this
     *            instance type is the latest generation instance type of an
     *            instance family. (<code>true</code> | <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ebs-info.ebs-optimized-support</code> - Indicates
     *            whether the instance type is EBS-optimized. (
     *            <code>supported</code> | <code>unsupported</code> |
     *            <code>default</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ebs-info.encryption-support</code> - Indicates whether
     *            EBS encryption is supported. (<code>supported</code> |
     *            <code>unsupported</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>free-tier-eligible</code> - Indicates whether the
     *            instance type is eligible to use in the free tier. (
     *            <code>true</code> | <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>hibernation-supported</code> - Indicates whether
     *            On-Demand hibernation is supported. (<code>true</code> |
     *            <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>hypervisor</code> - The hypervisor used. (
     *            <code>nitro</code> | <code>xen</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-storage-info.disk.count</code> - The number of
     *            local disks.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-storage-info.disk.size-in-gb</code> - The
     *            storage size of each instance storage disk, in GB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-storage-info.disk.type</code> - The storage
     *            technology for the local instance storage disks. (
     *            <code>hdd</code> | <code>ssd</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-storage-info.total-size-in-gb</code> - The
     *            total amount of storage available from all local instance
     *            storage, in GB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-storage-supported</code> - Indicates whether
     *            the instance type has local instance storage. (
     *            <code>true</code> | <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>memory-info.size-in-mib</code> - The memory size.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-info.ena-support</code> - Indicates whether
     *            Elastic Network Adapter (ENA) is supported or required. (
     *            <code>required</code> | <code>supported</code> |
     *            <code>unsupported</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-info.ipv4-addresses-per-interface</code> - The
     *            maximum number of private IPv4 addresses per network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-info.ipv6-addresses-per-interface</code> - The
     *            maximum number of private IPv6 addresses per network
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-info.ipv6-supported</code> - Indicates whether
     *            the instance type supports IPv6. (<code>true</code> |
     *            <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-info.maximum-network-interfaces</code> - The
     *            maximum number of network interfaces per instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>network-info.network-performance</code> - Describes the
     *            network performance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>processor-info.sustained-clock-speed-in-ghz</code> - The
     *            CPU clock speed, in GHz.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vcpu-info.default-cores</code> - The default number of
     *            cores for the instance type.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vcpu-info.default-threads-per-core</code> - The default
     *            number of threads per core for the instance type.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vcpu-info.default-vcpus</code> - The default number of
     *            vCPUs for the instance type.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceTypesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * next token value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 100<br/>
     *
     * @return <p>
     *         The maximum number of results to return for the request in a
     *         single page. The remaining results can be seen by sending another
     *         request with the next token value.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * next token value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return for the request in a
     *            single page. The remaining results can be seen by sending
     *            another request with the next token value.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * next token value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return for the request in a
     *            single page. The remaining results can be seen by sending
     *            another request with the next token value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceTypesRequest withMaxResults(Integer maxResults) {
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
    public DescribeInstanceTypesRequest withNextToken(String nextToken) {
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getInstanceTypes() != null)
            sb.append("InstanceTypes: " + getInstanceTypes() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
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

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceTypes() == null) ? 0 : getInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
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

        if (obj instanceof DescribeInstanceTypesRequest == false)
            return false;
        DescribeInstanceTypesRequest other = (DescribeInstanceTypesRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getInstanceTypes() == null ^ this.getInstanceTypes() == null)
            return false;
        if (other.getInstanceTypes() != null
                && other.getInstanceTypes().equals(this.getInstanceTypes()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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
