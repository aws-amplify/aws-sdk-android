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
 * Describes the most recent volume modification request for the specified EBS
 * volumes.
 * </p>
 * <p>
 * If a volume has never been modified, some information in the output will be
 * null. If a volume has been modified more than once, the output includes only
 * the most recent modification request.
 * </p>
 * <p>
 * You can also use CloudWatch Events to check the status of a modification to
 * an EBS volume. For information about CloudWatch Events, see the <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/">Amazon
 * CloudWatch Events User Guide</a>. For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-expand-volume.html#monitoring_mods"
 * >Monitoring Volume Modifications</a> in the <i>Amazon Elastic Compute Cloud
 * User Guide</i>.
 * </p>
 */
public class DescribeVolumesModificationsRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * The IDs of the volumes.
     * </p>
     */
    private java.util.List<String> volumeIds;

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>modification-state</code> - The current modification state
     * (modifying | optimizing | completed | failed).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-iops</code> - The original IOPS rate of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-size</code> - The original size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-volume-type</code> - The original volume type of the
     * volume (standard | io1 | gp2 | sc1 | st1).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>originalMultiAttachEnabled</code> - Indicates whether Multi-Attach
     * support was enabled (true | false).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The modification start time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-iops</code> - The target IOPS rate of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-size</code> - The target size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-volume-type</code> - The target volume type of the volume
     * (standard | io1 | gp2 | sc1 | st1).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targetMultiAttachEnabled</code> - Indicates whether Multi-Attach
     * support is to be enabled (true | false).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-id</code> - The ID of the volume.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The <code>nextToken</code> value returned by a previous paginated
     * request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results (up to a limit of 500) to be returned in a
     * paginated request.
     * </p>
     */
    private Integer maxResults;

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
    public DescribeVolumesModificationsRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The IDs of the volumes.
     * </p>
     *
     * @return <p>
     *         The IDs of the volumes.
     *         </p>
     */
    public java.util.List<String> getVolumeIds() {
        return volumeIds;
    }

    /**
     * <p>
     * The IDs of the volumes.
     * </p>
     *
     * @param volumeIds <p>
     *            The IDs of the volumes.
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
     * The IDs of the volumes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeIds <p>
     *            The IDs of the volumes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumesModificationsRequest withVolumeIds(String... volumeIds) {
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
     * The IDs of the volumes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeIds <p>
     *            The IDs of the volumes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumesModificationsRequest withVolumeIds(java.util.Collection<String> volumeIds) {
        setVolumeIds(volumeIds);
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>modification-state</code> - The current modification state
     * (modifying | optimizing | completed | failed).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-iops</code> - The original IOPS rate of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-size</code> - The original size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-volume-type</code> - The original volume type of the
     * volume (standard | io1 | gp2 | sc1 | st1).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>originalMultiAttachEnabled</code> - Indicates whether Multi-Attach
     * support was enabled (true | false).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The modification start time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-iops</code> - The target IOPS rate of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-size</code> - The target size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-volume-type</code> - The target volume type of the volume
     * (standard | io1 | gp2 | sc1 | st1).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targetMultiAttachEnabled</code> - Indicates whether Multi-Attach
     * support is to be enabled (true | false).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-id</code> - The ID of the volume.
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
     *         <code>modification-state</code> - The current modification state
     *         (modifying | optimizing | completed | failed).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>original-iops</code> - The original IOPS rate of the
     *         volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>original-size</code> - The original size of the volume, in
     *         GiB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>original-volume-type</code> - The original volume type of
     *         the volume (standard | io1 | gp2 | sc1 | st1).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>originalMultiAttachEnabled</code> - Indicates whether
     *         Multi-Attach support was enabled (true | false).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>start-time</code> - The modification start time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>target-iops</code> - The target IOPS rate of the volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>target-size</code> - The target size of the volume, in GiB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>target-volume-type</code> - The target volume type of the
     *         volume (standard | io1 | gp2 | sc1 | st1).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>targetMultiAttachEnabled</code> - Indicates whether
     *         Multi-Attach support is to be enabled (true | false).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>volume-id</code> - The ID of the volume.
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
     * <code>modification-state</code> - The current modification state
     * (modifying | optimizing | completed | failed).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-iops</code> - The original IOPS rate of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-size</code> - The original size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-volume-type</code> - The original volume type of the
     * volume (standard | io1 | gp2 | sc1 | st1).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>originalMultiAttachEnabled</code> - Indicates whether Multi-Attach
     * support was enabled (true | false).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The modification start time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-iops</code> - The target IOPS rate of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-size</code> - The target size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-volume-type</code> - The target volume type of the volume
     * (standard | io1 | gp2 | sc1 | st1).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targetMultiAttachEnabled</code> - Indicates whether Multi-Attach
     * support is to be enabled (true | false).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-id</code> - The ID of the volume.
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
     *            <code>modification-state</code> - The current modification
     *            state (modifying | optimizing | completed | failed).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>original-iops</code> - The original IOPS rate of the
     *            volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>original-size</code> - The original size of the volume,
     *            in GiB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>original-volume-type</code> - The original volume type
     *            of the volume (standard | io1 | gp2 | sc1 | st1).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>originalMultiAttachEnabled</code> - Indicates whether
     *            Multi-Attach support was enabled (true | false).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>start-time</code> - The modification start time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>target-iops</code> - The target IOPS rate of the volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>target-size</code> - The target size of the volume, in
     *            GiB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>target-volume-type</code> - The target volume type of
     *            the volume (standard | io1 | gp2 | sc1 | st1).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>targetMultiAttachEnabled</code> - Indicates whether
     *            Multi-Attach support is to be enabled (true | false).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>volume-id</code> - The ID of the volume.
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
     * <code>modification-state</code> - The current modification state
     * (modifying | optimizing | completed | failed).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-iops</code> - The original IOPS rate of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-size</code> - The original size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-volume-type</code> - The original volume type of the
     * volume (standard | io1 | gp2 | sc1 | st1).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>originalMultiAttachEnabled</code> - Indicates whether Multi-Attach
     * support was enabled (true | false).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The modification start time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-iops</code> - The target IOPS rate of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-size</code> - The target size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-volume-type</code> - The target volume type of the volume
     * (standard | io1 | gp2 | sc1 | st1).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targetMultiAttachEnabled</code> - Indicates whether Multi-Attach
     * support is to be enabled (true | false).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-id</code> - The ID of the volume.
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
     *            <code>modification-state</code> - The current modification
     *            state (modifying | optimizing | completed | failed).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>original-iops</code> - The original IOPS rate of the
     *            volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>original-size</code> - The original size of the volume,
     *            in GiB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>original-volume-type</code> - The original volume type
     *            of the volume (standard | io1 | gp2 | sc1 | st1).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>originalMultiAttachEnabled</code> - Indicates whether
     *            Multi-Attach support was enabled (true | false).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>start-time</code> - The modification start time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>target-iops</code> - The target IOPS rate of the volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>target-size</code> - The target size of the volume, in
     *            GiB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>target-volume-type</code> - The target volume type of
     *            the volume (standard | io1 | gp2 | sc1 | st1).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>targetMultiAttachEnabled</code> - Indicates whether
     *            Multi-Attach support is to be enabled (true | false).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>volume-id</code> - The ID of the volume.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumesModificationsRequest withFilters(Filter... filters) {
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
     * <code>modification-state</code> - The current modification state
     * (modifying | optimizing | completed | failed).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-iops</code> - The original IOPS rate of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-size</code> - The original size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-volume-type</code> - The original volume type of the
     * volume (standard | io1 | gp2 | sc1 | st1).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>originalMultiAttachEnabled</code> - Indicates whether Multi-Attach
     * support was enabled (true | false).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The modification start time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-iops</code> - The target IOPS rate of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-size</code> - The target size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-volume-type</code> - The target volume type of the volume
     * (standard | io1 | gp2 | sc1 | st1).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targetMultiAttachEnabled</code> - Indicates whether Multi-Attach
     * support is to be enabled (true | false).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-id</code> - The ID of the volume.
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
     *            <code>modification-state</code> - The current modification
     *            state (modifying | optimizing | completed | failed).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>original-iops</code> - The original IOPS rate of the
     *            volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>original-size</code> - The original size of the volume,
     *            in GiB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>original-volume-type</code> - The original volume type
     *            of the volume (standard | io1 | gp2 | sc1 | st1).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>originalMultiAttachEnabled</code> - Indicates whether
     *            Multi-Attach support was enabled (true | false).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>start-time</code> - The modification start time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>target-iops</code> - The target IOPS rate of the volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>target-size</code> - The target size of the volume, in
     *            GiB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>target-volume-type</code> - The target volume type of
     *            the volume (standard | io1 | gp2 | sc1 | st1).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>targetMultiAttachEnabled</code> - Indicates whether
     *            Multi-Attach support is to be enabled (true | false).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>volume-id</code> - The ID of the volume.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumesModificationsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned by a previous paginated
     * request.
     * </p>
     *
     * @return <p>
     *         The <code>nextToken</code> value returned by a previous paginated
     *         request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned by a previous paginated
     * request.
     * </p>
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value returned by a previous
     *            paginated request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned by a previous paginated
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value returned by a previous
     *            paginated request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumesModificationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results (up to a limit of 500) to be returned in a
     * paginated request.
     * </p>
     *
     * @return <p>
     *         The maximum number of results (up to a limit of 500) to be
     *         returned in a paginated request.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results (up to a limit of 500) to be returned in a
     * paginated request.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of results (up to a limit of 500) to be
     *            returned in a paginated request.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results (up to a limit of 500) to be returned in a
     * paginated request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of results (up to a limit of 500) to be
     *            returned in a paginated request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumesModificationsRequest withMaxResults(Integer maxResults) {
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getVolumeIds() != null)
            sb.append("VolumeIds: " + getVolumeIds() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
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

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getVolumeIds() == null) ? 0 : getVolumeIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
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

        if (obj instanceof DescribeVolumesModificationsRequest == false)
            return false;
        DescribeVolumesModificationsRequest other = (DescribeVolumesModificationsRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getVolumeIds() == null ^ this.getVolumeIds() == null)
            return false;
        if (other.getVolumeIds() != null
                && other.getVolumeIds().equals(this.getVolumeIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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
