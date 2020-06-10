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
 * Describes the specified EBS volumes or all of your EBS volumes.
 * </p>
 * <p>
 * If you are describing a long list of volumes, you can paginate the output to
 * make the list more manageable. The <code>MaxResults</code> parameter sets the
 * maximum number of results returned in a single page. If the list of results
 * exceeds your <code>MaxResults</code> value, then that number of results is
 * returned along with a <code>NextToken</code> value that can be passed to a
 * subsequent <code>DescribeVolumes</code> request to retrieve the remaining
 * results.
 * </p>
 * <p>
 * For more information about EBS volumes, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumes.html"
 * >Amazon EBS Volumes</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i>.
 * </p>
 */
public class DescribeVolumesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attachment.attach-time</code> - The time stamp when the attachment
     * initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Whether the volume is
     * deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device</code> - The device name specified in the block
     * device mapping (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance the volume
     * is attached to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The attachment state (
     * <code>attaching</code> | <code>attached</code> | <code>detaching</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the
     * volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-time</code> - The time stamp when the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>encrypted</code> - Indicates whether the volume is encrypted (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>multi-attach-enabled</code> - Indicates whether the volume is
     * enabled for Multi-Attach (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fast-restored</code> - Indicates whether the volume was created
     * from a snapshot that is enabled for fast snapshot restore (
     * <code>true</code> | <code>false</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>size</code> - The size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot from which the volume was
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the volume (<code>creating</code> |
     * <code>available</code> | <code>in-use</code> | <code>deleting</code> |
     * <code>deleted</code> | <code>error</code>).
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
     * <code>volume-id</code> - The volume ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-type</code> - The Amazon EBS volume type. This can be
     * <code>gp2</code> for General Purpose SSD, <code>io1</code> for
     * Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD,
     * <code>sc1</code> for Cold HDD, or <code>standard</code> for Magnetic
     * volumes.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The volume IDs.
     * </p>
     */
    private java.util.List<String> volumeIds;

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
     * The maximum number of volume results returned by
     * <code>DescribeVolumes</code> in paginated output. When this parameter is
     * used, <code>DescribeVolumes</code> only returns <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another <code>DescribeVolumes</code> request with the returned
     * <code>NextToken</code> value. This value can be between 5 and 500; if
     * <code>MaxResults</code> is given a value larger than 500, only 500
     * results are returned. If this parameter is not used, then
     * <code>DescribeVolumes</code> returns all results. You cannot specify this
     * parameter and the volume IDs parameter in the same request.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated
     * <code>DescribeVolumes</code> request where <code>MaxResults</code> was
     * used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>NextToken</code> value. This value is <code>null</code> when there
     * are no more results to return.
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
     * <code>attachment.attach-time</code> - The time stamp when the attachment
     * initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Whether the volume is
     * deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device</code> - The device name specified in the block
     * device mapping (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance the volume
     * is attached to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The attachment state (
     * <code>attaching</code> | <code>attached</code> | <code>detaching</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the
     * volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-time</code> - The time stamp when the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>encrypted</code> - Indicates whether the volume is encrypted (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>multi-attach-enabled</code> - Indicates whether the volume is
     * enabled for Multi-Attach (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fast-restored</code> - Indicates whether the volume was created
     * from a snapshot that is enabled for fast snapshot restore (
     * <code>true</code> | <code>false</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>size</code> - The size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot from which the volume was
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the volume (<code>creating</code> |
     * <code>available</code> | <code>in-use</code> | <code>deleting</code> |
     * <code>deleted</code> | <code>error</code>).
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
     * <code>volume-id</code> - The volume ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-type</code> - The Amazon EBS volume type. This can be
     * <code>gp2</code> for General Purpose SSD, <code>io1</code> for
     * Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD,
     * <code>sc1</code> for Cold HDD, or <code>standard</code> for Magnetic
     * volumes.
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
     *         <code>attachment.attach-time</code> - The time stamp when the
     *         attachment initiated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.delete-on-termination</code> - Whether the
     *         volume is deleted on instance termination.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.device</code> - The device name specified in the
     *         block device mapping (for example, <code>/dev/sda1</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.instance-id</code> - The ID of the instance the
     *         volume is attached to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.status</code> - The attachment state (
     *         <code>attaching</code> | <code>attached</code> |
     *         <code>detaching</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone in which
     *         the volume was created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>create-time</code> - The time stamp when the volume was
     *         created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>encrypted</code> - Indicates whether the volume is
     *         encrypted (<code>true</code> | <code>false</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>multi-attach-enabled</code> - Indicates whether the volume
     *         is enabled for Multi-Attach (<code>true</code> |
     *         <code>false</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>fast-restored</code> - Indicates whether the volume was
     *         created from a snapshot that is enabled for fast snapshot restore
     *         (<code>true</code> | <code>false</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>size</code> - The size of the volume, in GiB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>snapshot-id</code> - The snapshot from which the volume was
     *         created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status</code> - The status of the volume (
     *         <code>creating</code> | <code>available</code> |
     *         <code>in-use</code> | <code>deleting</code> |
     *         <code>deleted</code> | <code>error</code>).
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
     *         <code>volume-id</code> - The volume ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>volume-type</code> - The Amazon EBS volume type. This can
     *         be <code>gp2</code> for General Purpose SSD, <code>io1</code> for
     *         Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized
     *         HDD, <code>sc1</code> for Cold HDD, or <code>standard</code> for
     *         Magnetic volumes.
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
     * <code>attachment.attach-time</code> - The time stamp when the attachment
     * initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Whether the volume is
     * deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device</code> - The device name specified in the block
     * device mapping (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance the volume
     * is attached to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The attachment state (
     * <code>attaching</code> | <code>attached</code> | <code>detaching</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the
     * volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-time</code> - The time stamp when the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>encrypted</code> - Indicates whether the volume is encrypted (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>multi-attach-enabled</code> - Indicates whether the volume is
     * enabled for Multi-Attach (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fast-restored</code> - Indicates whether the volume was created
     * from a snapshot that is enabled for fast snapshot restore (
     * <code>true</code> | <code>false</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>size</code> - The size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot from which the volume was
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the volume (<code>creating</code> |
     * <code>available</code> | <code>in-use</code> | <code>deleting</code> |
     * <code>deleted</code> | <code>error</code>).
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
     * <code>volume-id</code> - The volume ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-type</code> - The Amazon EBS volume type. This can be
     * <code>gp2</code> for General Purpose SSD, <code>io1</code> for
     * Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD,
     * <code>sc1</code> for Cold HDD, or <code>standard</code> for Magnetic
     * volumes.
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
     *            <code>attachment.attach-time</code> - The time stamp when the
     *            attachment initiated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.delete-on-termination</code> - Whether the
     *            volume is deleted on instance termination.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.device</code> - The device name specified in
     *            the block device mapping (for example, <code>/dev/sda1</code>
     *            ).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.instance-id</code> - The ID of the instance
     *            the volume is attached to.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.status</code> - The attachment state (
     *            <code>attaching</code> | <code>attached</code> |
     *            <code>detaching</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone in
     *            which the volume was created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>create-time</code> - The time stamp when the volume was
     *            created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>encrypted</code> - Indicates whether the volume is
     *            encrypted (<code>true</code> | <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>multi-attach-enabled</code> - Indicates whether the
     *            volume is enabled for Multi-Attach (<code>true</code> |
     *            <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>fast-restored</code> - Indicates whether the volume was
     *            created from a snapshot that is enabled for fast snapshot
     *            restore (<code>true</code> | <code>false</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>size</code> - The size of the volume, in GiB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>snapshot-id</code> - The snapshot from which the volume
     *            was created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>status</code> - The status of the volume (
     *            <code>creating</code> | <code>available</code> |
     *            <code>in-use</code> | <code>deleting</code> |
     *            <code>deleted</code> | <code>error</code>).
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
     *            <code>volume-id</code> - The volume ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>volume-type</code> - The Amazon EBS volume type. This
     *            can be <code>gp2</code> for General Purpose SSD,
     *            <code>io1</code> for Provisioned IOPS SSD, <code>st1</code>
     *            for Throughput Optimized HDD, <code>sc1</code> for Cold HDD,
     *            or <code>standard</code> for Magnetic volumes.
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
     * <code>attachment.attach-time</code> - The time stamp when the attachment
     * initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Whether the volume is
     * deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device</code> - The device name specified in the block
     * device mapping (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance the volume
     * is attached to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The attachment state (
     * <code>attaching</code> | <code>attached</code> | <code>detaching</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the
     * volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-time</code> - The time stamp when the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>encrypted</code> - Indicates whether the volume is encrypted (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>multi-attach-enabled</code> - Indicates whether the volume is
     * enabled for Multi-Attach (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fast-restored</code> - Indicates whether the volume was created
     * from a snapshot that is enabled for fast snapshot restore (
     * <code>true</code> | <code>false</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>size</code> - The size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot from which the volume was
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the volume (<code>creating</code> |
     * <code>available</code> | <code>in-use</code> | <code>deleting</code> |
     * <code>deleted</code> | <code>error</code>).
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
     * <code>volume-id</code> - The volume ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-type</code> - The Amazon EBS volume type. This can be
     * <code>gp2</code> for General Purpose SSD, <code>io1</code> for
     * Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD,
     * <code>sc1</code> for Cold HDD, or <code>standard</code> for Magnetic
     * volumes.
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
     *            <code>attachment.attach-time</code> - The time stamp when the
     *            attachment initiated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.delete-on-termination</code> - Whether the
     *            volume is deleted on instance termination.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.device</code> - The device name specified in
     *            the block device mapping (for example, <code>/dev/sda1</code>
     *            ).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.instance-id</code> - The ID of the instance
     *            the volume is attached to.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.status</code> - The attachment state (
     *            <code>attaching</code> | <code>attached</code> |
     *            <code>detaching</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone in
     *            which the volume was created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>create-time</code> - The time stamp when the volume was
     *            created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>encrypted</code> - Indicates whether the volume is
     *            encrypted (<code>true</code> | <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>multi-attach-enabled</code> - Indicates whether the
     *            volume is enabled for Multi-Attach (<code>true</code> |
     *            <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>fast-restored</code> - Indicates whether the volume was
     *            created from a snapshot that is enabled for fast snapshot
     *            restore (<code>true</code> | <code>false</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>size</code> - The size of the volume, in GiB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>snapshot-id</code> - The snapshot from which the volume
     *            was created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>status</code> - The status of the volume (
     *            <code>creating</code> | <code>available</code> |
     *            <code>in-use</code> | <code>deleting</code> |
     *            <code>deleted</code> | <code>error</code>).
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
     *            <code>volume-id</code> - The volume ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>volume-type</code> - The Amazon EBS volume type. This
     *            can be <code>gp2</code> for General Purpose SSD,
     *            <code>io1</code> for Provisioned IOPS SSD, <code>st1</code>
     *            for Throughput Optimized HDD, <code>sc1</code> for Cold HDD,
     *            or <code>standard</code> for Magnetic volumes.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumesRequest withFilters(Filter... filters) {
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
     * <code>attachment.attach-time</code> - The time stamp when the attachment
     * initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Whether the volume is
     * deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device</code> - The device name specified in the block
     * device mapping (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance the volume
     * is attached to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The attachment state (
     * <code>attaching</code> | <code>attached</code> | <code>detaching</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the
     * volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-time</code> - The time stamp when the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>encrypted</code> - Indicates whether the volume is encrypted (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>multi-attach-enabled</code> - Indicates whether the volume is
     * enabled for Multi-Attach (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fast-restored</code> - Indicates whether the volume was created
     * from a snapshot that is enabled for fast snapshot restore (
     * <code>true</code> | <code>false</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>size</code> - The size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot from which the volume was
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the volume (<code>creating</code> |
     * <code>available</code> | <code>in-use</code> | <code>deleting</code> |
     * <code>deleted</code> | <code>error</code>).
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
     * <code>volume-id</code> - The volume ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-type</code> - The Amazon EBS volume type. This can be
     * <code>gp2</code> for General Purpose SSD, <code>io1</code> for
     * Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD,
     * <code>sc1</code> for Cold HDD, or <code>standard</code> for Magnetic
     * volumes.
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
     *            <code>attachment.attach-time</code> - The time stamp when the
     *            attachment initiated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.delete-on-termination</code> - Whether the
     *            volume is deleted on instance termination.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.device</code> - The device name specified in
     *            the block device mapping (for example, <code>/dev/sda1</code>
     *            ).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.instance-id</code> - The ID of the instance
     *            the volume is attached to.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attachment.status</code> - The attachment state (
     *            <code>attaching</code> | <code>attached</code> |
     *            <code>detaching</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone in
     *            which the volume was created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>create-time</code> - The time stamp when the volume was
     *            created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>encrypted</code> - Indicates whether the volume is
     *            encrypted (<code>true</code> | <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>multi-attach-enabled</code> - Indicates whether the
     *            volume is enabled for Multi-Attach (<code>true</code> |
     *            <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>fast-restored</code> - Indicates whether the volume was
     *            created from a snapshot that is enabled for fast snapshot
     *            restore (<code>true</code> | <code>false</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>size</code> - The size of the volume, in GiB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>snapshot-id</code> - The snapshot from which the volume
     *            was created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>status</code> - The status of the volume (
     *            <code>creating</code> | <code>available</code> |
     *            <code>in-use</code> | <code>deleting</code> |
     *            <code>deleted</code> | <code>error</code>).
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
     *            <code>volume-id</code> - The volume ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>volume-type</code> - The Amazon EBS volume type. This
     *            can be <code>gp2</code> for General Purpose SSD,
     *            <code>io1</code> for Provisioned IOPS SSD, <code>st1</code>
     *            for Throughput Optimized HDD, <code>sc1</code> for Cold HDD,
     *            or <code>standard</code> for Magnetic volumes.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The volume IDs.
     * </p>
     *
     * @return <p>
     *         The volume IDs.
     *         </p>
     */
    public java.util.List<String> getVolumeIds() {
        return volumeIds;
    }

    /**
     * <p>
     * The volume IDs.
     * </p>
     *
     * @param volumeIds <p>
     *            The volume IDs.
     *            </p>
     */
    public void setVolumeIds(java.util.Collection<String> volumeIds) {
        if (volumeIds == null) {
            this.volumeIds = null;
            return;
        }

        this.volumeIds = new java.util.ArrayList<String>(volumeIds);
    }

    /**
     * <p>
     * The volume IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeIds <p>
     *            The volume IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumesRequest withVolumeIds(String... volumeIds) {
        if (getVolumeIds() == null) {
            this.volumeIds = new java.util.ArrayList<String>(volumeIds.length);
        }
        for (String value : volumeIds) {
            this.volumeIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The volume IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeIds <p>
     *            The volume IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumesRequest withVolumeIds(java.util.Collection<String> volumeIds) {
        setVolumeIds(volumeIds);
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
    public DescribeVolumesRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The maximum number of volume results returned by
     * <code>DescribeVolumes</code> in paginated output. When this parameter is
     * used, <code>DescribeVolumes</code> only returns <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another <code>DescribeVolumes</code> request with the returned
     * <code>NextToken</code> value. This value can be between 5 and 500; if
     * <code>MaxResults</code> is given a value larger than 500, only 500
     * results are returned. If this parameter is not used, then
     * <code>DescribeVolumes</code> returns all results. You cannot specify this
     * parameter and the volume IDs parameter in the same request.
     * </p>
     *
     * @return <p>
     *         The maximum number of volume results returned by
     *         <code>DescribeVolumes</code> in paginated output. When this
     *         parameter is used, <code>DescribeVolumes</code> only returns
     *         <code>MaxResults</code> results in a single page along with a
     *         <code>NextToken</code> response element. The remaining results of
     *         the initial request can be seen by sending another
     *         <code>DescribeVolumes</code> request with the returned
     *         <code>NextToken</code> value. This value can be between 5 and
     *         500; if <code>MaxResults</code> is given a value larger than 500,
     *         only 500 results are returned. If this parameter is not used,
     *         then <code>DescribeVolumes</code> returns all results. You cannot
     *         specify this parameter and the volume IDs parameter in the same
     *         request.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of volume results returned by
     * <code>DescribeVolumes</code> in paginated output. When this parameter is
     * used, <code>DescribeVolumes</code> only returns <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another <code>DescribeVolumes</code> request with the returned
     * <code>NextToken</code> value. This value can be between 5 and 500; if
     * <code>MaxResults</code> is given a value larger than 500, only 500
     * results are returned. If this parameter is not used, then
     * <code>DescribeVolumes</code> returns all results. You cannot specify this
     * parameter and the volume IDs parameter in the same request.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of volume results returned by
     *            <code>DescribeVolumes</code> in paginated output. When this
     *            parameter is used, <code>DescribeVolumes</code> only returns
     *            <code>MaxResults</code> results in a single page along with a
     *            <code>NextToken</code> response element. The remaining results
     *            of the initial request can be seen by sending another
     *            <code>DescribeVolumes</code> request with the returned
     *            <code>NextToken</code> value. This value can be between 5 and
     *            500; if <code>MaxResults</code> is given a value larger than
     *            500, only 500 results are returned. If this parameter is not
     *            used, then <code>DescribeVolumes</code> returns all results.
     *            You cannot specify this parameter and the volume IDs parameter
     *            in the same request.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of volume results returned by
     * <code>DescribeVolumes</code> in paginated output. When this parameter is
     * used, <code>DescribeVolumes</code> only returns <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another <code>DescribeVolumes</code> request with the returned
     * <code>NextToken</code> value. This value can be between 5 and 500; if
     * <code>MaxResults</code> is given a value larger than 500, only 500
     * results are returned. If this parameter is not used, then
     * <code>DescribeVolumes</code> returns all results. You cannot specify this
     * parameter and the volume IDs parameter in the same request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of volume results returned by
     *            <code>DescribeVolumes</code> in paginated output. When this
     *            parameter is used, <code>DescribeVolumes</code> only returns
     *            <code>MaxResults</code> results in a single page along with a
     *            <code>NextToken</code> response element. The remaining results
     *            of the initial request can be seen by sending another
     *            <code>DescribeVolumes</code> request with the returned
     *            <code>NextToken</code> value. This value can be between 5 and
     *            500; if <code>MaxResults</code> is given a value larger than
     *            500, only 500 results are returned. If this parameter is not
     *            used, then <code>DescribeVolumes</code> returns all results.
     *            You cannot specify this parameter and the volume IDs parameter
     *            in the same request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated
     * <code>DescribeVolumes</code> request where <code>MaxResults</code> was
     * used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>NextToken</code> value. This value is <code>null</code> when there
     * are no more results to return.
     * </p>
     *
     * @return <p>
     *         The <code>NextToken</code> value returned from a previous
     *         paginated <code>DescribeVolumes</code> request where
     *         <code>MaxResults</code> was used and the results exceeded the
     *         value of that parameter. Pagination continues from the end of the
     *         previous results that returned the <code>NextToken</code> value.
     *         This value is <code>null</code> when there are no more results to
     *         return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated
     * <code>DescribeVolumes</code> request where <code>MaxResults</code> was
     * used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>NextToken</code> value. This value is <code>null</code> when there
     * are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The <code>NextToken</code> value returned from a previous
     *            paginated <code>DescribeVolumes</code> request where
     *            <code>MaxResults</code> was used and the results exceeded the
     *            value of that parameter. Pagination continues from the end of
     *            the previous results that returned the <code>NextToken</code>
     *            value. This value is <code>null</code> when there are no more
     *            results to return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated
     * <code>DescribeVolumes</code> request where <code>MaxResults</code> was
     * used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>NextToken</code> value. This value is <code>null</code> when there
     * are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The <code>NextToken</code> value returned from a previous
     *            paginated <code>DescribeVolumes</code> request where
     *            <code>MaxResults</code> was used and the results exceeded the
     *            value of that parameter. Pagination continues from the end of
     *            the previous results that returned the <code>NextToken</code>
     *            value. This value is <code>null</code> when there are no more
     *            results to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumesRequest withNextToken(String nextToken) {
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
        if (getVolumeIds() != null)
            sb.append("VolumeIds: " + getVolumeIds() + ",");
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
        hashCode = prime * hashCode + ((getVolumeIds() == null) ? 0 : getVolumeIds().hashCode());
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

        if (obj instanceof DescribeVolumesRequest == false)
            return false;
        DescribeVolumesRequest other = (DescribeVolumesRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getVolumeIds() == null ^ this.getVolumeIds() == null)
            return false;
        if (other.getVolumeIds() != null
                && other.getVolumeIds().equals(this.getVolumeIds()) == false)
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
