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
 * Describes the specified EBS snapshots available to you or all of the EBS
 * snapshots available to you.
 * </p>
 * <p>
 * The snapshots available to you include public snapshots, private snapshots
 * that you own, and private snapshots owned by other AWS accounts for which you
 * have explicit create volume permissions.
 * </p>
 * <p>
 * The create volume permissions fall into the following categories:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>public</i>: The owner of the snapshot granted create volume permissions
 * for the snapshot to the <code>all</code> group. All AWS accounts have create
 * volume permissions for these snapshots.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>explicit</i>: The owner of the snapshot granted create volume permissions
 * to a specific AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>implicit</i>: An AWS account has implicit create volume permissions for
 * all snapshots it owns.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The list of snapshots returned can be filtered by specifying snapshot IDs,
 * snapshot owners, or AWS accounts with create volume permissions. If no
 * options are specified, Amazon EC2 returns all snapshots for which you have
 * create volume permissions.
 * </p>
 * <p>
 * If you specify one or more snapshot IDs, only snapshots that have the
 * specified IDs are returned. If you specify an invalid snapshot ID, an error
 * is returned. If you specify a snapshot ID for which you do not have access,
 * it is not included in the returned results.
 * </p>
 * <p>
 * If you specify one or more snapshot owners using the <code>OwnerIds</code>
 * option, only snapshots from the specified owners and for which you have
 * access are returned. The results can include the AWS account IDs of the
 * specified owners, <code>amazon</code> for snapshots owned by Amazon, or
 * <code>self</code> for snapshots that you own.
 * </p>
 * <p>
 * If you specify a list of restorable users, only snapshots with create
 * snapshot permissions for those users are returned. You can specify AWS
 * account IDs (if you own the snapshots), <code>self</code> for snapshots for
 * which you own or have explicit permissions, or <code>all</code> for public
 * snapshots.
 * </p>
 * <p>
 * If you are describing a long list of snapshots, you can paginate the output
 * to make the list more manageable. The <code>MaxResults</code> parameter sets
 * the maximum number of results returned in a single page. If the list of
 * results exceeds your <code>MaxResults</code> value, then that number of
 * results is returned along with a <code>NextToken</code> value that can be
 * passed to a subsequent <code>DescribeSnapshots</code> request to retrieve the
 * remaining results.
 * </p>
 * <p>
 * To get the state of fast snapshot restores for a snapshot, use
 * <a>DescribeFastSnapshotRestores</a>.
 * </p>
 * <p>
 * For more information about EBS snapshots, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSSnapshots.html"
 * >Amazon EBS Snapshots</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i>.
 * </p>
 */
public class DescribeSnapshotsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>description</code> - A description of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>encrypted</code> - Indicates whether the snapshot is encrypted (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-alias</code> - Value from an Amazon-maintained list (
     * <code>amazon</code> | <code>self</code> | <code>all</code> |
     * <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot
     * owners. Not to be confused with the user-configured AWS account alias,
     * which is set from the IAM console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>progress</code> - The progress of the snapshot, as a percentage
     * (for example, 80%).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The time stamp when the snapshot was initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the snapshot (<code>pending</code> |
     * <code>completed</code> | <code>error</code>).
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
     * <code>volume-id</code> - The ID of the volume the snapshot is for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-size</code> - The size of the volume, in GiB.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The maximum number of snapshot results returned by
     * <code>DescribeSnapshots</code> in paginated output. When this parameter
     * is used, <code>DescribeSnapshots</code> only returns
     * <code>MaxResults</code> results in a single page along with a
     * <code>NextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>DescribeSnapshots</code> request with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000
     * results are returned. If this parameter is not used, then
     * <code>DescribeSnapshots</code> returns all results. You cannot specify
     * this parameter and the snapshot IDs parameter in the same request.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated
     * <code>DescribeSnapshots</code> request where <code>MaxResults</code> was
     * used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>NextToken</code> value. This value is <code>null</code> when there
     * are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Describes the snapshots owned by these owners.
     * </p>
     */
    private java.util.List<String> ownerIds;

    /**
     * <p>
     * The IDs of the AWS accounts that can create volumes from the snapshot.
     * </p>
     */
    private java.util.List<String> restorableByUserIds;

    /**
     * <p>
     * The snapshot IDs.
     * </p>
     * <p>
     * Default: Describes the snapshots for which you have create volume
     * permissions.
     * </p>
     */
    private java.util.List<String> snapshotIds;

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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>description</code> - A description of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>encrypted</code> - Indicates whether the snapshot is encrypted (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-alias</code> - Value from an Amazon-maintained list (
     * <code>amazon</code> | <code>self</code> | <code>all</code> |
     * <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot
     * owners. Not to be confused with the user-configured AWS account alias,
     * which is set from the IAM console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>progress</code> - The progress of the snapshot, as a percentage
     * (for example, 80%).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The time stamp when the snapshot was initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the snapshot (<code>pending</code> |
     * <code>completed</code> | <code>error</code>).
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
     * <code>volume-id</code> - The ID of the volume the snapshot is for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-size</code> - The size of the volume, in GiB.
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
     *         <code>description</code> - A description of the snapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>encrypted</code> - Indicates whether the snapshot is
     *         encrypted (<code>true</code> | <code>false</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-alias</code> - Value from an Amazon-maintained list (
     *         <code>amazon</code> | <code>self</code> | <code>all</code> |
     *         <code>aws-marketplace</code> | <code>microsoft</code>) of
     *         snapshot owners. Not to be confused with the user-configured AWS
     *         account alias, which is set from the IAM console.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code> - The ID of the AWS account that owns the
     *         snapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>progress</code> - The progress of the snapshot, as a
     *         percentage (for example, 80%).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>snapshot-id</code> - The snapshot ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>start-time</code> - The time stamp when the snapshot was
     *         initiated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status</code> - The status of the snapshot (
     *         <code>pending</code> | <code>completed</code> |
     *         <code>error</code>).
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
     *         <code>volume-id</code> - The ID of the volume the snapshot is
     *         for.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>volume-size</code> - The size of the volume, in GiB.
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
     * <code>description</code> - A description of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>encrypted</code> - Indicates whether the snapshot is encrypted (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-alias</code> - Value from an Amazon-maintained list (
     * <code>amazon</code> | <code>self</code> | <code>all</code> |
     * <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot
     * owners. Not to be confused with the user-configured AWS account alias,
     * which is set from the IAM console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>progress</code> - The progress of the snapshot, as a percentage
     * (for example, 80%).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The time stamp when the snapshot was initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the snapshot (<code>pending</code> |
     * <code>completed</code> | <code>error</code>).
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
     * <code>volume-id</code> - The ID of the volume the snapshot is for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-size</code> - The size of the volume, in GiB.
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
     *            <code>description</code> - A description of the snapshot.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>encrypted</code> - Indicates whether the snapshot is
     *            encrypted (<code>true</code> | <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-alias</code> - Value from an Amazon-maintained
     *            list (<code>amazon</code> | <code>self</code> |
     *            <code>all</code> | <code>aws-marketplace</code> |
     *            <code>microsoft</code>) of snapshot owners. Not to be confused
     *            with the user-configured AWS account alias, which is set from
     *            the IAM console.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The ID of the AWS account that owns
     *            the snapshot.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>progress</code> - The progress of the snapshot, as a
     *            percentage (for example, 80%).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>snapshot-id</code> - The snapshot ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>start-time</code> - The time stamp when the snapshot was
     *            initiated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>status</code> - The status of the snapshot (
     *            <code>pending</code> | <code>completed</code> |
     *            <code>error</code>).
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
     *            <code>volume-id</code> - The ID of the volume the snapshot is
     *            for.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>volume-size</code> - The size of the volume, in GiB.
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
     * <code>description</code> - A description of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>encrypted</code> - Indicates whether the snapshot is encrypted (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-alias</code> - Value from an Amazon-maintained list (
     * <code>amazon</code> | <code>self</code> | <code>all</code> |
     * <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot
     * owners. Not to be confused with the user-configured AWS account alias,
     * which is set from the IAM console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>progress</code> - The progress of the snapshot, as a percentage
     * (for example, 80%).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The time stamp when the snapshot was initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the snapshot (<code>pending</code> |
     * <code>completed</code> | <code>error</code>).
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
     * <code>volume-id</code> - The ID of the volume the snapshot is for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-size</code> - The size of the volume, in GiB.
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
     *            <code>description</code> - A description of the snapshot.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>encrypted</code> - Indicates whether the snapshot is
     *            encrypted (<code>true</code> | <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-alias</code> - Value from an Amazon-maintained
     *            list (<code>amazon</code> | <code>self</code> |
     *            <code>all</code> | <code>aws-marketplace</code> |
     *            <code>microsoft</code>) of snapshot owners. Not to be confused
     *            with the user-configured AWS account alias, which is set from
     *            the IAM console.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The ID of the AWS account that owns
     *            the snapshot.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>progress</code> - The progress of the snapshot, as a
     *            percentage (for example, 80%).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>snapshot-id</code> - The snapshot ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>start-time</code> - The time stamp when the snapshot was
     *            initiated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>status</code> - The status of the snapshot (
     *            <code>pending</code> | <code>completed</code> |
     *            <code>error</code>).
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
     *            <code>volume-id</code> - The ID of the volume the snapshot is
     *            for.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>volume-size</code> - The size of the volume, in GiB.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotsRequest withFilters(Filter... filters) {
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
     * <code>description</code> - A description of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>encrypted</code> - Indicates whether the snapshot is encrypted (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-alias</code> - Value from an Amazon-maintained list (
     * <code>amazon</code> | <code>self</code> | <code>all</code> |
     * <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot
     * owners. Not to be confused with the user-configured AWS account alias,
     * which is set from the IAM console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>progress</code> - The progress of the snapshot, as a percentage
     * (for example, 80%).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The time stamp when the snapshot was initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the snapshot (<code>pending</code> |
     * <code>completed</code> | <code>error</code>).
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
     * <code>volume-id</code> - The ID of the volume the snapshot is for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-size</code> - The size of the volume, in GiB.
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
     *            <code>description</code> - A description of the snapshot.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>encrypted</code> - Indicates whether the snapshot is
     *            encrypted (<code>true</code> | <code>false</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-alias</code> - Value from an Amazon-maintained
     *            list (<code>amazon</code> | <code>self</code> |
     *            <code>all</code> | <code>aws-marketplace</code> |
     *            <code>microsoft</code>) of snapshot owners. Not to be confused
     *            with the user-configured AWS account alias, which is set from
     *            the IAM console.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The ID of the AWS account that owns
     *            the snapshot.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>progress</code> - The progress of the snapshot, as a
     *            percentage (for example, 80%).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>snapshot-id</code> - The snapshot ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>start-time</code> - The time stamp when the snapshot was
     *            initiated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>status</code> - The status of the snapshot (
     *            <code>pending</code> | <code>completed</code> |
     *            <code>error</code>).
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
     *            <code>volume-id</code> - The ID of the volume the snapshot is
     *            for.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>volume-size</code> - The size of the volume, in GiB.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of snapshot results returned by
     * <code>DescribeSnapshots</code> in paginated output. When this parameter
     * is used, <code>DescribeSnapshots</code> only returns
     * <code>MaxResults</code> results in a single page along with a
     * <code>NextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>DescribeSnapshots</code> request with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000
     * results are returned. If this parameter is not used, then
     * <code>DescribeSnapshots</code> returns all results. You cannot specify
     * this parameter and the snapshot IDs parameter in the same request.
     * </p>
     *
     * @return <p>
     *         The maximum number of snapshot results returned by
     *         <code>DescribeSnapshots</code> in paginated output. When this
     *         parameter is used, <code>DescribeSnapshots</code> only returns
     *         <code>MaxResults</code> results in a single page along with a
     *         <code>NextToken</code> response element. The remaining results of
     *         the initial request can be seen by sending another
     *         <code>DescribeSnapshots</code> request with the returned
     *         <code>NextToken</code> value. This value can be between 5 and
     *         1000; if <code>MaxResults</code> is given a value larger than
     *         1000, only 1000 results are returned. If this parameter is not
     *         used, then <code>DescribeSnapshots</code> returns all results.
     *         You cannot specify this parameter and the snapshot IDs parameter
     *         in the same request.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of snapshot results returned by
     * <code>DescribeSnapshots</code> in paginated output. When this parameter
     * is used, <code>DescribeSnapshots</code> only returns
     * <code>MaxResults</code> results in a single page along with a
     * <code>NextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>DescribeSnapshots</code> request with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000
     * results are returned. If this parameter is not used, then
     * <code>DescribeSnapshots</code> returns all results. You cannot specify
     * this parameter and the snapshot IDs parameter in the same request.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of snapshot results returned by
     *            <code>DescribeSnapshots</code> in paginated output. When this
     *            parameter is used, <code>DescribeSnapshots</code> only returns
     *            <code>MaxResults</code> results in a single page along with a
     *            <code>NextToken</code> response element. The remaining results
     *            of the initial request can be seen by sending another
     *            <code>DescribeSnapshots</code> request with the returned
     *            <code>NextToken</code> value. This value can be between 5 and
     *            1000; if <code>MaxResults</code> is given a value larger than
     *            1000, only 1000 results are returned. If this parameter is not
     *            used, then <code>DescribeSnapshots</code> returns all results.
     *            You cannot specify this parameter and the snapshot IDs
     *            parameter in the same request.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of snapshot results returned by
     * <code>DescribeSnapshots</code> in paginated output. When this parameter
     * is used, <code>DescribeSnapshots</code> only returns
     * <code>MaxResults</code> results in a single page along with a
     * <code>NextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>DescribeSnapshots</code> request with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000
     * results are returned. If this parameter is not used, then
     * <code>DescribeSnapshots</code> returns all results. You cannot specify
     * this parameter and the snapshot IDs parameter in the same request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of snapshot results returned by
     *            <code>DescribeSnapshots</code> in paginated output. When this
     *            parameter is used, <code>DescribeSnapshots</code> only returns
     *            <code>MaxResults</code> results in a single page along with a
     *            <code>NextToken</code> response element. The remaining results
     *            of the initial request can be seen by sending another
     *            <code>DescribeSnapshots</code> request with the returned
     *            <code>NextToken</code> value. This value can be between 5 and
     *            1000; if <code>MaxResults</code> is given a value larger than
     *            1000, only 1000 results are returned. If this parameter is not
     *            used, then <code>DescribeSnapshots</code> returns all results.
     *            You cannot specify this parameter and the snapshot IDs
     *            parameter in the same request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated
     * <code>DescribeSnapshots</code> request where <code>MaxResults</code> was
     * used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>NextToken</code> value. This value is <code>null</code> when there
     * are no more results to return.
     * </p>
     *
     * @return <p>
     *         The <code>NextToken</code> value returned from a previous
     *         paginated <code>DescribeSnapshots</code> request where
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
     * <code>DescribeSnapshots</code> request where <code>MaxResults</code> was
     * used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>NextToken</code> value. This value is <code>null</code> when there
     * are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The <code>NextToken</code> value returned from a previous
     *            paginated <code>DescribeSnapshots</code> request where
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
     * <code>DescribeSnapshots</code> request where <code>MaxResults</code> was
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
     *            paginated <code>DescribeSnapshots</code> request where
     *            <code>MaxResults</code> was used and the results exceeded the
     *            value of that parameter. Pagination continues from the end of
     *            the previous results that returned the <code>NextToken</code>
     *            value. This value is <code>null</code> when there are no more
     *            results to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Describes the snapshots owned by these owners.
     * </p>
     *
     * @return <p>
     *         Describes the snapshots owned by these owners.
     *         </p>
     */
    public java.util.List<String> getOwnerIds() {
        return ownerIds;
    }

    /**
     * <p>
     * Describes the snapshots owned by these owners.
     * </p>
     *
     * @param ownerIds <p>
     *            Describes the snapshots owned by these owners.
     *            </p>
     */
    public void setOwnerIds(java.util.Collection<String> ownerIds) {
        if (ownerIds == null) {
            this.ownerIds = null;
            return;
        }

        this.ownerIds = new java.util.ArrayList<String>(ownerIds);
    }

    /**
     * <p>
     * Describes the snapshots owned by these owners.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerIds <p>
     *            Describes the snapshots owned by these owners.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotsRequest withOwnerIds(String... ownerIds) {
        if (getOwnerIds() == null) {
            this.ownerIds = new java.util.ArrayList<String>(ownerIds.length);
        }
        for (String value : ownerIds) {
            this.ownerIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Describes the snapshots owned by these owners.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerIds <p>
     *            Describes the snapshots owned by these owners.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotsRequest withOwnerIds(java.util.Collection<String> ownerIds) {
        setOwnerIds(ownerIds);
        return this;
    }

    /**
     * <p>
     * The IDs of the AWS accounts that can create volumes from the snapshot.
     * </p>
     *
     * @return <p>
     *         The IDs of the AWS accounts that can create volumes from the
     *         snapshot.
     *         </p>
     */
    public java.util.List<String> getRestorableByUserIds() {
        return restorableByUserIds;
    }

    /**
     * <p>
     * The IDs of the AWS accounts that can create volumes from the snapshot.
     * </p>
     *
     * @param restorableByUserIds <p>
     *            The IDs of the AWS accounts that can create volumes from the
     *            snapshot.
     *            </p>
     */
    public void setRestorableByUserIds(java.util.Collection<String> restorableByUserIds) {
        if (restorableByUserIds == null) {
            this.restorableByUserIds = null;
            return;
        }

        this.restorableByUserIds = new java.util.ArrayList<String>(restorableByUserIds);
    }

    /**
     * <p>
     * The IDs of the AWS accounts that can create volumes from the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restorableByUserIds <p>
     *            The IDs of the AWS accounts that can create volumes from the
     *            snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotsRequest withRestorableByUserIds(String... restorableByUserIds) {
        if (getRestorableByUserIds() == null) {
            this.restorableByUserIds = new java.util.ArrayList<String>(restorableByUserIds.length);
        }
        for (String value : restorableByUserIds) {
            this.restorableByUserIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the AWS accounts that can create volumes from the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restorableByUserIds <p>
     *            The IDs of the AWS accounts that can create volumes from the
     *            snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotsRequest withRestorableByUserIds(
            java.util.Collection<String> restorableByUserIds) {
        setRestorableByUserIds(restorableByUserIds);
        return this;
    }

    /**
     * <p>
     * The snapshot IDs.
     * </p>
     * <p>
     * Default: Describes the snapshots for which you have create volume
     * permissions.
     * </p>
     *
     * @return <p>
     *         The snapshot IDs.
     *         </p>
     *         <p>
     *         Default: Describes the snapshots for which you have create volume
     *         permissions.
     *         </p>
     */
    public java.util.List<String> getSnapshotIds() {
        return snapshotIds;
    }

    /**
     * <p>
     * The snapshot IDs.
     * </p>
     * <p>
     * Default: Describes the snapshots for which you have create volume
     * permissions.
     * </p>
     *
     * @param snapshotIds <p>
     *            The snapshot IDs.
     *            </p>
     *            <p>
     *            Default: Describes the snapshots for which you have create
     *            volume permissions.
     *            </p>
     */
    public void setSnapshotIds(java.util.Collection<String> snapshotIds) {
        if (snapshotIds == null) {
            this.snapshotIds = null;
            return;
        }

        this.snapshotIds = new java.util.ArrayList<String>(snapshotIds);
    }

    /**
     * <p>
     * The snapshot IDs.
     * </p>
     * <p>
     * Default: Describes the snapshots for which you have create volume
     * permissions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotIds <p>
     *            The snapshot IDs.
     *            </p>
     *            <p>
     *            Default: Describes the snapshots for which you have create
     *            volume permissions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotsRequest withSnapshotIds(String... snapshotIds) {
        if (getSnapshotIds() == null) {
            this.snapshotIds = new java.util.ArrayList<String>(snapshotIds.length);
        }
        for (String value : snapshotIds) {
            this.snapshotIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The snapshot IDs.
     * </p>
     * <p>
     * Default: Describes the snapshots for which you have create volume
     * permissions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotIds <p>
     *            The snapshot IDs.
     *            </p>
     *            <p>
     *            Default: Describes the snapshots for which you have create
     *            volume permissions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotsRequest withSnapshotIds(java.util.Collection<String> snapshotIds) {
        setSnapshotIds(snapshotIds);
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
    public DescribeSnapshotsRequest withDryRun(Boolean dryRun) {
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
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getOwnerIds() != null)
            sb.append("OwnerIds: " + getOwnerIds() + ",");
        if (getRestorableByUserIds() != null)
            sb.append("RestorableByUserIds: " + getRestorableByUserIds() + ",");
        if (getSnapshotIds() != null)
            sb.append("SnapshotIds: " + getSnapshotIds() + ",");
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
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOwnerIds() == null) ? 0 : getOwnerIds().hashCode());
        hashCode = prime * hashCode
                + ((getRestorableByUserIds() == null) ? 0 : getRestorableByUserIds().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotIds() == null) ? 0 : getSnapshotIds().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSnapshotsRequest == false)
            return false;
        DescribeSnapshotsRequest other = (DescribeSnapshotsRequest) obj;

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
        if (other.getOwnerIds() == null ^ this.getOwnerIds() == null)
            return false;
        if (other.getOwnerIds() != null && other.getOwnerIds().equals(this.getOwnerIds()) == false)
            return false;
        if (other.getRestorableByUserIds() == null ^ this.getRestorableByUserIds() == null)
            return false;
        if (other.getRestorableByUserIds() != null
                && other.getRestorableByUserIds().equals(this.getRestorableByUserIds()) == false)
            return false;
        if (other.getSnapshotIds() == null ^ this.getSnapshotIds() == null)
            return false;
        if (other.getSnapshotIds() != null
                && other.getSnapshotIds().equals(this.getSnapshotIds()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
