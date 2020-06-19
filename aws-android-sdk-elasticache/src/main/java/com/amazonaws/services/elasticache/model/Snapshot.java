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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a copy of an entire Redis cluster as of the time when the snapshot
 * was taken.
 * </p>
 */
public class Snapshot implements Serializable {
    /**
     * <p>
     * The name of a snapshot. For an automatic snapshot, the name is
     * system-generated. For a manual snapshot, this is the user-provided name.
     * </p>
     */
    private String snapshotName;

    /**
     * <p>
     * The unique identifier of the source replication group.
     * </p>
     */
    private String replicationGroupId;

    /**
     * <p>
     * A description of the source replication group.
     * </p>
     */
    private String replicationGroupDescription;

    /**
     * <p>
     * The user-supplied identifier of the source cluster.
     * </p>
     */
    private String cacheClusterId;

    /**
     * <p>
     * The status of the snapshot. Valid values: <code>creating</code> |
     * <code>available</code> | <code>restoring</code> | <code>copying</code> |
     * <code>deleting</code>.
     * </p>
     */
    private String snapshotStatus;

    /**
     * <p>
     * Indicates whether the snapshot is from an automatic backup (
     * <code>automated</code>) or was created manually (<code>manual</code>).
     * </p>
     */
    private String snapshotSource;

    /**
     * <p>
     * The name of the compute and memory capacity node type for the source
     * cluster.
     * </p>
     * <p>
     * The following node types are supported by ElastiCache. Generally
     * speaking, the current generation types provide more memory and
     * computational power at lower cost when compared to their equivalent
     * previous generation counterparts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>M5 node types:</b> <code>cache.m5.large</code>,
     * <code>cache.m5.xlarge</code>, <code>cache.m5.2xlarge</code>,
     * <code>cache.m5.4xlarge</code>, <code>cache.m5.12xlarge</code>,
     * <code>cache.m5.24xlarge</code>
     * </p>
     * <p>
     * <b>M4 node types:</b> <code>cache.m4.large</code>,
     * <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     * <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * <p>
     * <b>T3 node types:</b> <code>cache.t3.micro</code>,
     * <code>cache.t3.small</code>, <code>cache.t3.medium</code>
     * </p>
     * <p>
     * <b>T2 node types:</b> <code>cache.t2.micro</code>,
     * <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>T1 node types:</b> <code>cache.t1.micro</code>
     * </p>
     * <p>
     * <b>M1 node types:</b> <code>cache.m1.small</code>,
     * <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     * <code>cache.m1.xlarge</code>
     * </p>
     * <p>
     * <b>M3 node types:</b> <code>cache.m3.medium</code>,
     * <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>R5 node types:</b> <code>cache.r5.large</code>,
     * <code>cache.r5.xlarge</code>, <code>cache.r5.2xlarge</code>,
     * <code>cache.r5.4xlarge</code>, <code>cache.r5.12xlarge</code>,
     * <code>cache.r5.24xlarge</code>
     * </p>
     * <p>
     * <b>R4 node types:</b> <code>cache.r4.large</code>,
     * <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>,
     * <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>,
     * <code>cache.r4.16xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>M2 node types:</b> <code>cache.m2.xlarge</code>,
     * <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * <p>
     * <b>R3 node types:</b> <code>cache.r3.large</code>,
     * <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Additional node type info</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All current generation instance types are created in Amazon VPC by
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis append-only files (AOF) are not supported for T1 or T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Multi-AZ with automatic failover is not supported on T1 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis configuration variables <code>appendonly</code> and
     * <code>appendfsync</code> are not supported on Redis version 2.8.22 and
     * later.
     * </p>
     * </li>
     * </ul>
     */
    private String cacheNodeType;

    /**
     * <p>
     * The name of the cache engine (<code>memcached</code> or
     * <code>redis</code>) used by the source cluster.
     * </p>
     */
    private String engine;

    /**
     * <p>
     * The version of the cache engine version that is used by the source
     * cluster.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The number of cache nodes in the source cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running
     * Memcached, this value must be between 1 and 20.
     * </p>
     */
    private Integer numCacheNodes;

    /**
     * <p>
     * The name of the Availability Zone in which the source cluster is located.
     * </p>
     */
    private String preferredAvailabilityZone;

    /**
     * <p>
     * The date and time when the source cluster was created.
     * </p>
     */
    private java.util.Date cacheClusterCreateTime;

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cluster
     * is performed. It is specified as a range in the format
     * ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window
     * is a 60 minute period.
     * </p>
     * <p>
     * Valid values for <code>ddd</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sun</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tue</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>thu</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sat</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>sun:23:00-mon:01:30</code>
     * </p>
     */
    private String preferredMaintenanceWindow;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the topic used by the source cluster
     * for publishing notifications.
     * </p>
     */
    private String topicArn;

    /**
     * <p>
     * The port number used by each cache nodes in the source cluster.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The cache parameter group that is associated with the source cluster.
     * </p>
     */
    private String cacheParameterGroupName;

    /**
     * <p>
     * The name of the cache subnet group associated with the source cluster.
     * </p>
     */
    private String cacheSubnetGroupName;

    /**
     * <p>
     * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet
     * group for the source cluster.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * <p>
     * For an automatic snapshot, the number of days for which ElastiCache
     * retains the snapshot before deleting it.
     * </p>
     * <p>
     * For manual snapshots, this field reflects the
     * <code>SnapshotRetentionLimit</code> for the source cluster when the
     * snapshot was created. This field is otherwise ignored: Manual snapshots
     * do not expire, and can only be deleted using the
     * <code>DeleteSnapshot</code> operation.
     * </p>
     * <p>
     * <b>Important</b> If the value of SnapshotRetentionLimit is set to zero
     * (0), backups are turned off.
     * </p>
     */
    private Integer snapshotRetentionLimit;

    /**
     * <p>
     * The daily time range during which ElastiCache takes daily snapshots of
     * the source cluster.
     * </p>
     */
    private String snapshotWindow;

    /**
     * <p>
     * The number of node groups (shards) in this snapshot. When restoring from
     * a snapshot, the number of node groups (shards) in the snapshot and in the
     * restored replication group must be the same.
     * </p>
     */
    private Integer numNodeGroups;

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for the source
     * Redis replication group.
     * </p>
     * <p>
     * Amazon ElastiCache for Redis does not support Multi-AZ with automatic
     * failover on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): T1 node types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): T1 node types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled, enabling, disabling
     */
    private String automaticFailover;

    /**
     * <p>
     * A list of the cache nodes in the source cluster.
     * </p>
     */
    private java.util.List<NodeSnapshot> nodeSnapshots;

    /**
     * <p>
     * The ID of the KMS key used to encrypt the snapshot.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the snapshot.
     * </p>
     */
    private String aRN;

    /**
     * <p>
     * The name of a snapshot. For an automatic snapshot, the name is
     * system-generated. For a manual snapshot, this is the user-provided name.
     * </p>
     *
     * @return <p>
     *         The name of a snapshot. For an automatic snapshot, the name is
     *         system-generated. For a manual snapshot, this is the
     *         user-provided name.
     *         </p>
     */
    public String getSnapshotName() {
        return snapshotName;
    }

    /**
     * <p>
     * The name of a snapshot. For an automatic snapshot, the name is
     * system-generated. For a manual snapshot, this is the user-provided name.
     * </p>
     *
     * @param snapshotName <p>
     *            The name of a snapshot. For an automatic snapshot, the name is
     *            system-generated. For a manual snapshot, this is the
     *            user-provided name.
     *            </p>
     */
    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * The name of a snapshot. For an automatic snapshot, the name is
     * system-generated. For a manual snapshot, this is the user-provided name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotName <p>
     *            The name of a snapshot. For an automatic snapshot, the name is
     *            system-generated. For a manual snapshot, this is the
     *            user-provided name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }

    /**
     * <p>
     * The unique identifier of the source replication group.
     * </p>
     *
     * @return <p>
     *         The unique identifier of the source replication group.
     *         </p>
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }

    /**
     * <p>
     * The unique identifier of the source replication group.
     * </p>
     *
     * @param replicationGroupId <p>
     *            The unique identifier of the source replication group.
     *            </p>
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The unique identifier of the source replication group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupId <p>
     *            The unique identifier of the source replication group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
        return this;
    }

    /**
     * <p>
     * A description of the source replication group.
     * </p>
     *
     * @return <p>
     *         A description of the source replication group.
     *         </p>
     */
    public String getReplicationGroupDescription() {
        return replicationGroupDescription;
    }

    /**
     * <p>
     * A description of the source replication group.
     * </p>
     *
     * @param replicationGroupDescription <p>
     *            A description of the source replication group.
     *            </p>
     */
    public void setReplicationGroupDescription(String replicationGroupDescription) {
        this.replicationGroupDescription = replicationGroupDescription;
    }

    /**
     * <p>
     * A description of the source replication group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupDescription <p>
     *            A description of the source replication group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withReplicationGroupDescription(String replicationGroupDescription) {
        this.replicationGroupDescription = replicationGroupDescription;
        return this;
    }

    /**
     * <p>
     * The user-supplied identifier of the source cluster.
     * </p>
     *
     * @return <p>
     *         The user-supplied identifier of the source cluster.
     *         </p>
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }

    /**
     * <p>
     * The user-supplied identifier of the source cluster.
     * </p>
     *
     * @param cacheClusterId <p>
     *            The user-supplied identifier of the source cluster.
     *            </p>
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * The user-supplied identifier of the source cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheClusterId <p>
     *            The user-supplied identifier of the source cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
        return this;
    }

    /**
     * <p>
     * The status of the snapshot. Valid values: <code>creating</code> |
     * <code>available</code> | <code>restoring</code> | <code>copying</code> |
     * <code>deleting</code>.
     * </p>
     *
     * @return <p>
     *         The status of the snapshot. Valid values: <code>creating</code> |
     *         <code>available</code> | <code>restoring</code> |
     *         <code>copying</code> | <code>deleting</code>.
     *         </p>
     */
    public String getSnapshotStatus() {
        return snapshotStatus;
    }

    /**
     * <p>
     * The status of the snapshot. Valid values: <code>creating</code> |
     * <code>available</code> | <code>restoring</code> | <code>copying</code> |
     * <code>deleting</code>.
     * </p>
     *
     * @param snapshotStatus <p>
     *            The status of the snapshot. Valid values:
     *            <code>creating</code> | <code>available</code> |
     *            <code>restoring</code> | <code>copying</code> |
     *            <code>deleting</code>.
     *            </p>
     */
    public void setSnapshotStatus(String snapshotStatus) {
        this.snapshotStatus = snapshotStatus;
    }

    /**
     * <p>
     * The status of the snapshot. Valid values: <code>creating</code> |
     * <code>available</code> | <code>restoring</code> | <code>copying</code> |
     * <code>deleting</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotStatus <p>
     *            The status of the snapshot. Valid values:
     *            <code>creating</code> | <code>available</code> |
     *            <code>restoring</code> | <code>copying</code> |
     *            <code>deleting</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withSnapshotStatus(String snapshotStatus) {
        this.snapshotStatus = snapshotStatus;
        return this;
    }

    /**
     * <p>
     * Indicates whether the snapshot is from an automatic backup (
     * <code>automated</code>) or was created manually (<code>manual</code>).
     * </p>
     *
     * @return <p>
     *         Indicates whether the snapshot is from an automatic backup (
     *         <code>automated</code>) or was created manually (
     *         <code>manual</code>).
     *         </p>
     */
    public String getSnapshotSource() {
        return snapshotSource;
    }

    /**
     * <p>
     * Indicates whether the snapshot is from an automatic backup (
     * <code>automated</code>) or was created manually (<code>manual</code>).
     * </p>
     *
     * @param snapshotSource <p>
     *            Indicates whether the snapshot is from an automatic backup (
     *            <code>automated</code>) or was created manually (
     *            <code>manual</code>).
     *            </p>
     */
    public void setSnapshotSource(String snapshotSource) {
        this.snapshotSource = snapshotSource;
    }

    /**
     * <p>
     * Indicates whether the snapshot is from an automatic backup (
     * <code>automated</code>) or was created manually (<code>manual</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotSource <p>
     *            Indicates whether the snapshot is from an automatic backup (
     *            <code>automated</code>) or was created manually (
     *            <code>manual</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withSnapshotSource(String snapshotSource) {
        this.snapshotSource = snapshotSource;
        return this;
    }

    /**
     * <p>
     * The name of the compute and memory capacity node type for the source
     * cluster.
     * </p>
     * <p>
     * The following node types are supported by ElastiCache. Generally
     * speaking, the current generation types provide more memory and
     * computational power at lower cost when compared to their equivalent
     * previous generation counterparts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>M5 node types:</b> <code>cache.m5.large</code>,
     * <code>cache.m5.xlarge</code>, <code>cache.m5.2xlarge</code>,
     * <code>cache.m5.4xlarge</code>, <code>cache.m5.12xlarge</code>,
     * <code>cache.m5.24xlarge</code>
     * </p>
     * <p>
     * <b>M4 node types:</b> <code>cache.m4.large</code>,
     * <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     * <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * <p>
     * <b>T3 node types:</b> <code>cache.t3.micro</code>,
     * <code>cache.t3.small</code>, <code>cache.t3.medium</code>
     * </p>
     * <p>
     * <b>T2 node types:</b> <code>cache.t2.micro</code>,
     * <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>T1 node types:</b> <code>cache.t1.micro</code>
     * </p>
     * <p>
     * <b>M1 node types:</b> <code>cache.m1.small</code>,
     * <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     * <code>cache.m1.xlarge</code>
     * </p>
     * <p>
     * <b>M3 node types:</b> <code>cache.m3.medium</code>,
     * <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>R5 node types:</b> <code>cache.r5.large</code>,
     * <code>cache.r5.xlarge</code>, <code>cache.r5.2xlarge</code>,
     * <code>cache.r5.4xlarge</code>, <code>cache.r5.12xlarge</code>,
     * <code>cache.r5.24xlarge</code>
     * </p>
     * <p>
     * <b>R4 node types:</b> <code>cache.r4.large</code>,
     * <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>,
     * <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>,
     * <code>cache.r4.16xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>M2 node types:</b> <code>cache.m2.xlarge</code>,
     * <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * <p>
     * <b>R3 node types:</b> <code>cache.r3.large</code>,
     * <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Additional node type info</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All current generation instance types are created in Amazon VPC by
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis append-only files (AOF) are not supported for T1 or T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Multi-AZ with automatic failover is not supported on T1 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis configuration variables <code>appendonly</code> and
     * <code>appendfsync</code> are not supported on Redis version 2.8.22 and
     * later.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name of the compute and memory capacity node type for the
     *         source cluster.
     *         </p>
     *         <p>
     *         The following node types are supported by ElastiCache. Generally
     *         speaking, the current generation types provide more memory and
     *         computational power at lower cost when compared to their
     *         equivalent previous generation counterparts.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         General purpose:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Current generation:
     *         </p>
     *         <p>
     *         <b>M5 node types:</b> <code>cache.m5.large</code>,
     *         <code>cache.m5.xlarge</code>, <code>cache.m5.2xlarge</code>,
     *         <code>cache.m5.4xlarge</code>, <code>cache.m5.12xlarge</code>,
     *         <code>cache.m5.24xlarge</code>
     *         </p>
     *         <p>
     *         <b>M4 node types:</b> <code>cache.m4.large</code>,
     *         <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     *         <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     *         </p>
     *         <p>
     *         <b>T3 node types:</b> <code>cache.t3.micro</code>,
     *         <code>cache.t3.small</code>, <code>cache.t3.medium</code>
     *         </p>
     *         <p>
     *         <b>T2 node types:</b> <code>cache.t2.micro</code>,
     *         <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Previous generation: (not recommended)
     *         </p>
     *         <p>
     *         <b>T1 node types:</b> <code>cache.t1.micro</code>
     *         </p>
     *         <p>
     *         <b>M1 node types:</b> <code>cache.m1.small</code>,
     *         <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     *         <code>cache.m1.xlarge</code>
     *         </p>
     *         <p>
     *         <b>M3 node types:</b> <code>cache.m3.medium</code>,
     *         <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     *         <code>cache.m3.2xlarge</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Compute optimized:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Previous generation: (not recommended)
     *         </p>
     *         <p>
     *         <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Memory optimized:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Current generation:
     *         </p>
     *         <p>
     *         <b>R5 node types:</b> <code>cache.r5.large</code>,
     *         <code>cache.r5.xlarge</code>, <code>cache.r5.2xlarge</code>,
     *         <code>cache.r5.4xlarge</code>, <code>cache.r5.12xlarge</code>,
     *         <code>cache.r5.24xlarge</code>
     *         </p>
     *         <p>
     *         <b>R4 node types:</b> <code>cache.r4.large</code>,
     *         <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>,
     *         <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>,
     *         <code>cache.r4.16xlarge</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Previous generation: (not recommended)
     *         </p>
     *         <p>
     *         <b>M2 node types:</b> <code>cache.m2.xlarge</code>,
     *         <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     *         </p>
     *         <p>
     *         <b>R3 node types:</b> <code>cache.r3.large</code>,
     *         <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     *         <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Additional node type info</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         All current generation instance types are created in Amazon VPC
     *         by default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis append-only files (AOF) are not supported for T1 or T2
     *         instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis Multi-AZ with automatic failover is not supported on T1
     *         instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis configuration variables <code>appendonly</code> and
     *         <code>appendfsync</code> are not supported on Redis version
     *         2.8.22 and later.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getCacheNodeType() {
        return cacheNodeType;
    }

    /**
     * <p>
     * The name of the compute and memory capacity node type for the source
     * cluster.
     * </p>
     * <p>
     * The following node types are supported by ElastiCache. Generally
     * speaking, the current generation types provide more memory and
     * computational power at lower cost when compared to their equivalent
     * previous generation counterparts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>M5 node types:</b> <code>cache.m5.large</code>,
     * <code>cache.m5.xlarge</code>, <code>cache.m5.2xlarge</code>,
     * <code>cache.m5.4xlarge</code>, <code>cache.m5.12xlarge</code>,
     * <code>cache.m5.24xlarge</code>
     * </p>
     * <p>
     * <b>M4 node types:</b> <code>cache.m4.large</code>,
     * <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     * <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * <p>
     * <b>T3 node types:</b> <code>cache.t3.micro</code>,
     * <code>cache.t3.small</code>, <code>cache.t3.medium</code>
     * </p>
     * <p>
     * <b>T2 node types:</b> <code>cache.t2.micro</code>,
     * <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>T1 node types:</b> <code>cache.t1.micro</code>
     * </p>
     * <p>
     * <b>M1 node types:</b> <code>cache.m1.small</code>,
     * <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     * <code>cache.m1.xlarge</code>
     * </p>
     * <p>
     * <b>M3 node types:</b> <code>cache.m3.medium</code>,
     * <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>R5 node types:</b> <code>cache.r5.large</code>,
     * <code>cache.r5.xlarge</code>, <code>cache.r5.2xlarge</code>,
     * <code>cache.r5.4xlarge</code>, <code>cache.r5.12xlarge</code>,
     * <code>cache.r5.24xlarge</code>
     * </p>
     * <p>
     * <b>R4 node types:</b> <code>cache.r4.large</code>,
     * <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>,
     * <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>,
     * <code>cache.r4.16xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>M2 node types:</b> <code>cache.m2.xlarge</code>,
     * <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * <p>
     * <b>R3 node types:</b> <code>cache.r3.large</code>,
     * <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Additional node type info</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All current generation instance types are created in Amazon VPC by
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis append-only files (AOF) are not supported for T1 or T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Multi-AZ with automatic failover is not supported on T1 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis configuration variables <code>appendonly</code> and
     * <code>appendfsync</code> are not supported on Redis version 2.8.22 and
     * later.
     * </p>
     * </li>
     * </ul>
     *
     * @param cacheNodeType <p>
     *            The name of the compute and memory capacity node type for the
     *            source cluster.
     *            </p>
     *            <p>
     *            The following node types are supported by ElastiCache.
     *            Generally speaking, the current generation types provide more
     *            memory and computational power at lower cost when compared to
     *            their equivalent previous generation counterparts.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            General purpose:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Current generation:
     *            </p>
     *            <p>
     *            <b>M5 node types:</b> <code>cache.m5.large</code>,
     *            <code>cache.m5.xlarge</code>, <code>cache.m5.2xlarge</code>,
     *            <code>cache.m5.4xlarge</code>, <code>cache.m5.12xlarge</code>,
     *            <code>cache.m5.24xlarge</code>
     *            </p>
     *            <p>
     *            <b>M4 node types:</b> <code>cache.m4.large</code>,
     *            <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     *            <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     *            </p>
     *            <p>
     *            <b>T3 node types:</b> <code>cache.t3.micro</code>,
     *            <code>cache.t3.small</code>, <code>cache.t3.medium</code>
     *            </p>
     *            <p>
     *            <b>T2 node types:</b> <code>cache.t2.micro</code>,
     *            <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Previous generation: (not recommended)
     *            </p>
     *            <p>
     *            <b>T1 node types:</b> <code>cache.t1.micro</code>
     *            </p>
     *            <p>
     *            <b>M1 node types:</b> <code>cache.m1.small</code>,
     *            <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     *            <code>cache.m1.xlarge</code>
     *            </p>
     *            <p>
     *            <b>M3 node types:</b> <code>cache.m3.medium</code>,
     *            <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     *            <code>cache.m3.2xlarge</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Compute optimized:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Previous generation: (not recommended)
     *            </p>
     *            <p>
     *            <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Memory optimized:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Current generation:
     *            </p>
     *            <p>
     *            <b>R5 node types:</b> <code>cache.r5.large</code>,
     *            <code>cache.r5.xlarge</code>, <code>cache.r5.2xlarge</code>,
     *            <code>cache.r5.4xlarge</code>, <code>cache.r5.12xlarge</code>,
     *            <code>cache.r5.24xlarge</code>
     *            </p>
     *            <p>
     *            <b>R4 node types:</b> <code>cache.r4.large</code>,
     *            <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>,
     *            <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>,
     *            <code>cache.r4.16xlarge</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Previous generation: (not recommended)
     *            </p>
     *            <p>
     *            <b>M2 node types:</b> <code>cache.m2.xlarge</code>,
     *            <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     *            </p>
     *            <p>
     *            <b>R3 node types:</b> <code>cache.r3.large</code>,
     *            <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     *            <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Additional node type info</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            All current generation instance types are created in Amazon
     *            VPC by default.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis append-only files (AOF) are not supported for T1 or T2
     *            instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis Multi-AZ with automatic failover is not supported on T1
     *            instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis configuration variables <code>appendonly</code> and
     *            <code>appendfsync</code> are not supported on Redis version
     *            2.8.22 and later.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    /**
     * <p>
     * The name of the compute and memory capacity node type for the source
     * cluster.
     * </p>
     * <p>
     * The following node types are supported by ElastiCache. Generally
     * speaking, the current generation types provide more memory and
     * computational power at lower cost when compared to their equivalent
     * previous generation counterparts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>M5 node types:</b> <code>cache.m5.large</code>,
     * <code>cache.m5.xlarge</code>, <code>cache.m5.2xlarge</code>,
     * <code>cache.m5.4xlarge</code>, <code>cache.m5.12xlarge</code>,
     * <code>cache.m5.24xlarge</code>
     * </p>
     * <p>
     * <b>M4 node types:</b> <code>cache.m4.large</code>,
     * <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     * <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * <p>
     * <b>T3 node types:</b> <code>cache.t3.micro</code>,
     * <code>cache.t3.small</code>, <code>cache.t3.medium</code>
     * </p>
     * <p>
     * <b>T2 node types:</b> <code>cache.t2.micro</code>,
     * <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>T1 node types:</b> <code>cache.t1.micro</code>
     * </p>
     * <p>
     * <b>M1 node types:</b> <code>cache.m1.small</code>,
     * <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     * <code>cache.m1.xlarge</code>
     * </p>
     * <p>
     * <b>M3 node types:</b> <code>cache.m3.medium</code>,
     * <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>R5 node types:</b> <code>cache.r5.large</code>,
     * <code>cache.r5.xlarge</code>, <code>cache.r5.2xlarge</code>,
     * <code>cache.r5.4xlarge</code>, <code>cache.r5.12xlarge</code>,
     * <code>cache.r5.24xlarge</code>
     * </p>
     * <p>
     * <b>R4 node types:</b> <code>cache.r4.large</code>,
     * <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>,
     * <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>,
     * <code>cache.r4.16xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>M2 node types:</b> <code>cache.m2.xlarge</code>,
     * <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * <p>
     * <b>R3 node types:</b> <code>cache.r3.large</code>,
     * <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Additional node type info</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All current generation instance types are created in Amazon VPC by
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis append-only files (AOF) are not supported for T1 or T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Multi-AZ with automatic failover is not supported on T1 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis configuration variables <code>appendonly</code> and
     * <code>appendfsync</code> are not supported on Redis version 2.8.22 and
     * later.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeType <p>
     *            The name of the compute and memory capacity node type for the
     *            source cluster.
     *            </p>
     *            <p>
     *            The following node types are supported by ElastiCache.
     *            Generally speaking, the current generation types provide more
     *            memory and computational power at lower cost when compared to
     *            their equivalent previous generation counterparts.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            General purpose:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Current generation:
     *            </p>
     *            <p>
     *            <b>M5 node types:</b> <code>cache.m5.large</code>,
     *            <code>cache.m5.xlarge</code>, <code>cache.m5.2xlarge</code>,
     *            <code>cache.m5.4xlarge</code>, <code>cache.m5.12xlarge</code>,
     *            <code>cache.m5.24xlarge</code>
     *            </p>
     *            <p>
     *            <b>M4 node types:</b> <code>cache.m4.large</code>,
     *            <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     *            <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     *            </p>
     *            <p>
     *            <b>T3 node types:</b> <code>cache.t3.micro</code>,
     *            <code>cache.t3.small</code>, <code>cache.t3.medium</code>
     *            </p>
     *            <p>
     *            <b>T2 node types:</b> <code>cache.t2.micro</code>,
     *            <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Previous generation: (not recommended)
     *            </p>
     *            <p>
     *            <b>T1 node types:</b> <code>cache.t1.micro</code>
     *            </p>
     *            <p>
     *            <b>M1 node types:</b> <code>cache.m1.small</code>,
     *            <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     *            <code>cache.m1.xlarge</code>
     *            </p>
     *            <p>
     *            <b>M3 node types:</b> <code>cache.m3.medium</code>,
     *            <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     *            <code>cache.m3.2xlarge</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Compute optimized:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Previous generation: (not recommended)
     *            </p>
     *            <p>
     *            <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Memory optimized:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Current generation:
     *            </p>
     *            <p>
     *            <b>R5 node types:</b> <code>cache.r5.large</code>,
     *            <code>cache.r5.xlarge</code>, <code>cache.r5.2xlarge</code>,
     *            <code>cache.r5.4xlarge</code>, <code>cache.r5.12xlarge</code>,
     *            <code>cache.r5.24xlarge</code>
     *            </p>
     *            <p>
     *            <b>R4 node types:</b> <code>cache.r4.large</code>,
     *            <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>,
     *            <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>,
     *            <code>cache.r4.16xlarge</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Previous generation: (not recommended)
     *            </p>
     *            <p>
     *            <b>M2 node types:</b> <code>cache.m2.xlarge</code>,
     *            <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     *            </p>
     *            <p>
     *            <b>R3 node types:</b> <code>cache.r3.large</code>,
     *            <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     *            <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Additional node type info</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            All current generation instance types are created in Amazon
     *            VPC by default.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis append-only files (AOF) are not supported for T1 or T2
     *            instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis Multi-AZ with automatic failover is not supported on T1
     *            instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis configuration variables <code>appendonly</code> and
     *            <code>appendfsync</code> are not supported on Redis version
     *            2.8.22 and later.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
        return this;
    }

    /**
     * <p>
     * The name of the cache engine (<code>memcached</code> or
     * <code>redis</code>) used by the source cluster.
     * </p>
     *
     * @return <p>
     *         The name of the cache engine (<code>memcached</code> or
     *         <code>redis</code>) used by the source cluster.
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The name of the cache engine (<code>memcached</code> or
     * <code>redis</code>) used by the source cluster.
     * </p>
     *
     * @param engine <p>
     *            The name of the cache engine (<code>memcached</code> or
     *            <code>redis</code>) used by the source cluster.
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the cache engine (<code>memcached</code> or
     * <code>redis</code>) used by the source cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            The name of the cache engine (<code>memcached</code> or
     *            <code>redis</code>) used by the source cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * The version of the cache engine version that is used by the source
     * cluster.
     * </p>
     *
     * @return <p>
     *         The version of the cache engine version that is used by the
     *         source cluster.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The version of the cache engine version that is used by the source
     * cluster.
     * </p>
     *
     * @param engineVersion <p>
     *            The version of the cache engine version that is used by the
     *            source cluster.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version of the cache engine version that is used by the source
     * cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The version of the cache engine version that is used by the
     *            source cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * The number of cache nodes in the source cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running
     * Memcached, this value must be between 1 and 20.
     * </p>
     *
     * @return <p>
     *         The number of cache nodes in the source cluster.
     *         </p>
     *         <p>
     *         For clusters running Redis, this value must be 1. For clusters
     *         running Memcached, this value must be between 1 and 20.
     *         </p>
     */
    public Integer getNumCacheNodes() {
        return numCacheNodes;
    }

    /**
     * <p>
     * The number of cache nodes in the source cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running
     * Memcached, this value must be between 1 and 20.
     * </p>
     *
     * @param numCacheNodes <p>
     *            The number of cache nodes in the source cluster.
     *            </p>
     *            <p>
     *            For clusters running Redis, this value must be 1. For clusters
     *            running Memcached, this value must be between 1 and 20.
     *            </p>
     */
    public void setNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
    }

    /**
     * <p>
     * The number of cache nodes in the source cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running
     * Memcached, this value must be between 1 and 20.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numCacheNodes <p>
     *            The number of cache nodes in the source cluster.
     *            </p>
     *            <p>
     *            For clusters running Redis, this value must be 1. For clusters
     *            running Memcached, this value must be between 1 and 20.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
        return this;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the source cluster is located.
     * </p>
     *
     * @return <p>
     *         The name of the Availability Zone in which the source cluster is
     *         located.
     *         </p>
     */
    public String getPreferredAvailabilityZone() {
        return preferredAvailabilityZone;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the source cluster is located.
     * </p>
     *
     * @param preferredAvailabilityZone <p>
     *            The name of the Availability Zone in which the source cluster
     *            is located.
     *            </p>
     */
    public void setPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the source cluster is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredAvailabilityZone <p>
     *            The name of the Availability Zone in which the source cluster
     *            is located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
        return this;
    }

    /**
     * <p>
     * The date and time when the source cluster was created.
     * </p>
     *
     * @return <p>
     *         The date and time when the source cluster was created.
     *         </p>
     */
    public java.util.Date getCacheClusterCreateTime() {
        return cacheClusterCreateTime;
    }

    /**
     * <p>
     * The date and time when the source cluster was created.
     * </p>
     *
     * @param cacheClusterCreateTime <p>
     *            The date and time when the source cluster was created.
     *            </p>
     */
    public void setCacheClusterCreateTime(java.util.Date cacheClusterCreateTime) {
        this.cacheClusterCreateTime = cacheClusterCreateTime;
    }

    /**
     * <p>
     * The date and time when the source cluster was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheClusterCreateTime <p>
     *            The date and time when the source cluster was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withCacheClusterCreateTime(java.util.Date cacheClusterCreateTime) {
        this.cacheClusterCreateTime = cacheClusterCreateTime;
        return this;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cluster
     * is performed. It is specified as a range in the format
     * ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window
     * is a 60 minute period.
     * </p>
     * <p>
     * Valid values for <code>ddd</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sun</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tue</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>thu</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sat</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>sun:23:00-mon:01:30</code>
     * </p>
     *
     * @return <p>
     *         Specifies the weekly time range during which maintenance on the
     *         cluster is performed. It is specified as a range in the format
     *         ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance
     *         window is a 60 minute period.
     *         </p>
     *         <p>
     *         Valid values for <code>ddd</code> are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>sun</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mon</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tue</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>wed</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>thu</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>fri</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sat</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>sun:23:00-mon:01:30</code>
     *         </p>
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cluster
     * is performed. It is specified as a range in the format
     * ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window
     * is a 60 minute period.
     * </p>
     * <p>
     * Valid values for <code>ddd</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sun</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tue</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>thu</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sat</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>sun:23:00-mon:01:30</code>
     * </p>
     *
     * @param preferredMaintenanceWindow <p>
     *            Specifies the weekly time range during which maintenance on
     *            the cluster is performed. It is specified as a range in the
     *            format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum
     *            maintenance window is a 60 minute period.
     *            </p>
     *            <p>
     *            Valid values for <code>ddd</code> are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>sun</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>mon</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tue</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>wed</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>thu</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>fri</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sat</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>sun:23:00-mon:01:30</code>
     *            </p>
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cluster
     * is performed. It is specified as a range in the format
     * ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window
     * is a 60 minute period.
     * </p>
     * <p>
     * Valid values for <code>ddd</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sun</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tue</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>thu</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sat</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>sun:23:00-mon:01:30</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredMaintenanceWindow <p>
     *            Specifies the weekly time range during which maintenance on
     *            the cluster is performed. It is specified as a range in the
     *            format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum
     *            maintenance window is a 60 minute period.
     *            </p>
     *            <p>
     *            Valid values for <code>ddd</code> are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>sun</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>mon</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tue</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>wed</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>thu</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>fri</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sat</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>sun:23:00-mon:01:30</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the topic used by the source cluster
     * for publishing notifications.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the topic used by the source
     *         cluster for publishing notifications.
     *         </p>
     */
    public String getTopicArn() {
        return topicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the topic used by the source cluster
     * for publishing notifications.
     * </p>
     *
     * @param topicArn <p>
     *            The Amazon Resource Name (ARN) for the topic used by the
     *            source cluster for publishing notifications.
     *            </p>
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the topic used by the source cluster
     * for publishing notifications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topicArn <p>
     *            The Amazon Resource Name (ARN) for the topic used by the
     *            source cluster for publishing notifications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withTopicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
     * <p>
     * The port number used by each cache nodes in the source cluster.
     * </p>
     *
     * @return <p>
     *         The port number used by each cache nodes in the source cluster.
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * The port number used by each cache nodes in the source cluster.
     * </p>
     *
     * @param port <p>
     *            The port number used by each cache nodes in the source
     *            cluster.
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number used by each cache nodes in the source cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            The port number used by each cache nodes in the source
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * The cache parameter group that is associated with the source cluster.
     * </p>
     *
     * @return <p>
     *         The cache parameter group that is associated with the source
     *         cluster.
     *         </p>
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }

    /**
     * <p>
     * The cache parameter group that is associated with the source cluster.
     * </p>
     *
     * @param cacheParameterGroupName <p>
     *            The cache parameter group that is associated with the source
     *            cluster.
     *            </p>
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    /**
     * <p>
     * The cache parameter group that is associated with the source cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheParameterGroupName <p>
     *            The cache parameter group that is associated with the source
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }

    /**
     * <p>
     * The name of the cache subnet group associated with the source cluster.
     * </p>
     *
     * @return <p>
     *         The name of the cache subnet group associated with the source
     *         cluster.
     *         </p>
     */
    public String getCacheSubnetGroupName() {
        return cacheSubnetGroupName;
    }

    /**
     * <p>
     * The name of the cache subnet group associated with the source cluster.
     * </p>
     *
     * @param cacheSubnetGroupName <p>
     *            The name of the cache subnet group associated with the source
     *            cluster.
     *            </p>
     */
    public void setCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }

    /**
     * <p>
     * The name of the cache subnet group associated with the source cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheSubnetGroupName <p>
     *            The name of the cache subnet group associated with the source
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
        return this;
    }

    /**
     * <p>
     * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet
     * group for the source cluster.
     * </p>
     *
     * @return <p>
     *         The Amazon Virtual Private Cloud identifier (VPC ID) of the cache
     *         subnet group for the source cluster.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet
     * group for the source cluster.
     * </p>
     *
     * @param vpcId <p>
     *            The Amazon Virtual Private Cloud identifier (VPC ID) of the
     *            cache subnet group for the source cluster.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet
     * group for the source cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            The Amazon Virtual Private Cloud identifier (VPC ID) of the
     *            cache subnet group for the source cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     *
     * @return <p>
     *         This parameter is currently disabled.
     *         </p>
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     *
     * @return <p>
     *         This parameter is currently disabled.
     *         </p>
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     *
     * @param autoMinorVersionUpgrade <p>
     *            This parameter is currently disabled.
     *            </p>
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoMinorVersionUpgrade <p>
     *            This parameter is currently disabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * <p>
     * For an automatic snapshot, the number of days for which ElastiCache
     * retains the snapshot before deleting it.
     * </p>
     * <p>
     * For manual snapshots, this field reflects the
     * <code>SnapshotRetentionLimit</code> for the source cluster when the
     * snapshot was created. This field is otherwise ignored: Manual snapshots
     * do not expire, and can only be deleted using the
     * <code>DeleteSnapshot</code> operation.
     * </p>
     * <p>
     * <b>Important</b> If the value of SnapshotRetentionLimit is set to zero
     * (0), backups are turned off.
     * </p>
     *
     * @return <p>
     *         For an automatic snapshot, the number of days for which
     *         ElastiCache retains the snapshot before deleting it.
     *         </p>
     *         <p>
     *         For manual snapshots, this field reflects the
     *         <code>SnapshotRetentionLimit</code> for the source cluster when
     *         the snapshot was created. This field is otherwise ignored: Manual
     *         snapshots do not expire, and can only be deleted using the
     *         <code>DeleteSnapshot</code> operation.
     *         </p>
     *         <p>
     *         <b>Important</b> If the value of SnapshotRetentionLimit is set to
     *         zero (0), backups are turned off.
     *         </p>
     */
    public Integer getSnapshotRetentionLimit() {
        return snapshotRetentionLimit;
    }

    /**
     * <p>
     * For an automatic snapshot, the number of days for which ElastiCache
     * retains the snapshot before deleting it.
     * </p>
     * <p>
     * For manual snapshots, this field reflects the
     * <code>SnapshotRetentionLimit</code> for the source cluster when the
     * snapshot was created. This field is otherwise ignored: Manual snapshots
     * do not expire, and can only be deleted using the
     * <code>DeleteSnapshot</code> operation.
     * </p>
     * <p>
     * <b>Important</b> If the value of SnapshotRetentionLimit is set to zero
     * (0), backups are turned off.
     * </p>
     *
     * @param snapshotRetentionLimit <p>
     *            For an automatic snapshot, the number of days for which
     *            ElastiCache retains the snapshot before deleting it.
     *            </p>
     *            <p>
     *            For manual snapshots, this field reflects the
     *            <code>SnapshotRetentionLimit</code> for the source cluster
     *            when the snapshot was created. This field is otherwise
     *            ignored: Manual snapshots do not expire, and can only be
     *            deleted using the <code>DeleteSnapshot</code> operation.
     *            </p>
     *            <p>
     *            <b>Important</b> If the value of SnapshotRetentionLimit is set
     *            to zero (0), backups are turned off.
     *            </p>
     */
    public void setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
    }

    /**
     * <p>
     * For an automatic snapshot, the number of days for which ElastiCache
     * retains the snapshot before deleting it.
     * </p>
     * <p>
     * For manual snapshots, this field reflects the
     * <code>SnapshotRetentionLimit</code> for the source cluster when the
     * snapshot was created. This field is otherwise ignored: Manual snapshots
     * do not expire, and can only be deleted using the
     * <code>DeleteSnapshot</code> operation.
     * </p>
     * <p>
     * <b>Important</b> If the value of SnapshotRetentionLimit is set to zero
     * (0), backups are turned off.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotRetentionLimit <p>
     *            For an automatic snapshot, the number of days for which
     *            ElastiCache retains the snapshot before deleting it.
     *            </p>
     *            <p>
     *            For manual snapshots, this field reflects the
     *            <code>SnapshotRetentionLimit</code> for the source cluster
     *            when the snapshot was created. This field is otherwise
     *            ignored: Manual snapshots do not expire, and can only be
     *            deleted using the <code>DeleteSnapshot</code> operation.
     *            </p>
     *            <p>
     *            <b>Important</b> If the value of SnapshotRetentionLimit is set
     *            to zero (0), backups are turned off.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
        return this;
    }

    /**
     * <p>
     * The daily time range during which ElastiCache takes daily snapshots of
     * the source cluster.
     * </p>
     *
     * @return <p>
     *         The daily time range during which ElastiCache takes daily
     *         snapshots of the source cluster.
     *         </p>
     */
    public String getSnapshotWindow() {
        return snapshotWindow;
    }

    /**
     * <p>
     * The daily time range during which ElastiCache takes daily snapshots of
     * the source cluster.
     * </p>
     *
     * @param snapshotWindow <p>
     *            The daily time range during which ElastiCache takes daily
     *            snapshots of the source cluster.
     *            </p>
     */
    public void setSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
    }

    /**
     * <p>
     * The daily time range during which ElastiCache takes daily snapshots of
     * the source cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotWindow <p>
     *            The daily time range during which ElastiCache takes daily
     *            snapshots of the source cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
        return this;
    }

    /**
     * <p>
     * The number of node groups (shards) in this snapshot. When restoring from
     * a snapshot, the number of node groups (shards) in the snapshot and in the
     * restored replication group must be the same.
     * </p>
     *
     * @return <p>
     *         The number of node groups (shards) in this snapshot. When
     *         restoring from a snapshot, the number of node groups (shards) in
     *         the snapshot and in the restored replication group must be the
     *         same.
     *         </p>
     */
    public Integer getNumNodeGroups() {
        return numNodeGroups;
    }

    /**
     * <p>
     * The number of node groups (shards) in this snapshot. When restoring from
     * a snapshot, the number of node groups (shards) in the snapshot and in the
     * restored replication group must be the same.
     * </p>
     *
     * @param numNodeGroups <p>
     *            The number of node groups (shards) in this snapshot. When
     *            restoring from a snapshot, the number of node groups (shards)
     *            in the snapshot and in the restored replication group must be
     *            the same.
     *            </p>
     */
    public void setNumNodeGroups(Integer numNodeGroups) {
        this.numNodeGroups = numNodeGroups;
    }

    /**
     * <p>
     * The number of node groups (shards) in this snapshot. When restoring from
     * a snapshot, the number of node groups (shards) in the snapshot and in the
     * restored replication group must be the same.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numNodeGroups <p>
     *            The number of node groups (shards) in this snapshot. When
     *            restoring from a snapshot, the number of node groups (shards)
     *            in the snapshot and in the restored replication group must be
     *            the same.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withNumNodeGroups(Integer numNodeGroups) {
        this.numNodeGroups = numNodeGroups;
        return this;
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for the source
     * Redis replication group.
     * </p>
     * <p>
     * Amazon ElastiCache for Redis does not support Multi-AZ with automatic
     * failover on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): T1 node types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): T1 node types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled, enabling, disabling
     *
     * @return <p>
     *         Indicates the status of Multi-AZ with automatic failover for the
     *         source Redis replication group.
     *         </p>
     *         <p>
     *         Amazon ElastiCache for Redis does not support Multi-AZ with
     *         automatic failover on:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Redis versions earlier than 2.8.6.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis (cluster mode disabled): T1 node types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis (cluster mode enabled): T1 node types.
     *         </p>
     *         </li>
     *         </ul>
     * @see AutomaticFailoverStatus
     */
    public String getAutomaticFailover() {
        return automaticFailover;
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for the source
     * Redis replication group.
     * </p>
     * <p>
     * Amazon ElastiCache for Redis does not support Multi-AZ with automatic
     * failover on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): T1 node types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): T1 node types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled, enabling, disabling
     *
     * @param automaticFailover <p>
     *            Indicates the status of Multi-AZ with automatic failover for
     *            the source Redis replication group.
     *            </p>
     *            <p>
     *            Amazon ElastiCache for Redis does not support Multi-AZ with
     *            automatic failover on:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Redis versions earlier than 2.8.6.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis (cluster mode disabled): T1 node types.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis (cluster mode enabled): T1 node types.
     *            </p>
     *            </li>
     *            </ul>
     * @see AutomaticFailoverStatus
     */
    public void setAutomaticFailover(String automaticFailover) {
        this.automaticFailover = automaticFailover;
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for the source
     * Redis replication group.
     * </p>
     * <p>
     * Amazon ElastiCache for Redis does not support Multi-AZ with automatic
     * failover on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): T1 node types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): T1 node types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled, enabling, disabling
     *
     * @param automaticFailover <p>
     *            Indicates the status of Multi-AZ with automatic failover for
     *            the source Redis replication group.
     *            </p>
     *            <p>
     *            Amazon ElastiCache for Redis does not support Multi-AZ with
     *            automatic failover on:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Redis versions earlier than 2.8.6.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis (cluster mode disabled): T1 node types.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis (cluster mode enabled): T1 node types.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutomaticFailoverStatus
     */
    public Snapshot withAutomaticFailover(String automaticFailover) {
        this.automaticFailover = automaticFailover;
        return this;
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for the source
     * Redis replication group.
     * </p>
     * <p>
     * Amazon ElastiCache for Redis does not support Multi-AZ with automatic
     * failover on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): T1 node types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): T1 node types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled, enabling, disabling
     *
     * @param automaticFailover <p>
     *            Indicates the status of Multi-AZ with automatic failover for
     *            the source Redis replication group.
     *            </p>
     *            <p>
     *            Amazon ElastiCache for Redis does not support Multi-AZ with
     *            automatic failover on:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Redis versions earlier than 2.8.6.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis (cluster mode disabled): T1 node types.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis (cluster mode enabled): T1 node types.
     *            </p>
     *            </li>
     *            </ul>
     * @see AutomaticFailoverStatus
     */
    public void setAutomaticFailover(AutomaticFailoverStatus automaticFailover) {
        this.automaticFailover = automaticFailover.toString();
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for the source
     * Redis replication group.
     * </p>
     * <p>
     * Amazon ElastiCache for Redis does not support Multi-AZ with automatic
     * failover on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): T1 node types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): T1 node types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled, enabling, disabling
     *
     * @param automaticFailover <p>
     *            Indicates the status of Multi-AZ with automatic failover for
     *            the source Redis replication group.
     *            </p>
     *            <p>
     *            Amazon ElastiCache for Redis does not support Multi-AZ with
     *            automatic failover on:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Redis versions earlier than 2.8.6.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis (cluster mode disabled): T1 node types.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis (cluster mode enabled): T1 node types.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutomaticFailoverStatus
     */
    public Snapshot withAutomaticFailover(AutomaticFailoverStatus automaticFailover) {
        this.automaticFailover = automaticFailover.toString();
        return this;
    }

    /**
     * <p>
     * A list of the cache nodes in the source cluster.
     * </p>
     *
     * @return <p>
     *         A list of the cache nodes in the source cluster.
     *         </p>
     */
    public java.util.List<NodeSnapshot> getNodeSnapshots() {
        return nodeSnapshots;
    }

    /**
     * <p>
     * A list of the cache nodes in the source cluster.
     * </p>
     *
     * @param nodeSnapshots <p>
     *            A list of the cache nodes in the source cluster.
     *            </p>
     */
    public void setNodeSnapshots(java.util.Collection<NodeSnapshot> nodeSnapshots) {
        if (nodeSnapshots == null) {
            this.nodeSnapshots = null;
            return;
        }

        this.nodeSnapshots = new java.util.ArrayList<NodeSnapshot>(nodeSnapshots);
    }

    /**
     * <p>
     * A list of the cache nodes in the source cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeSnapshots <p>
     *            A list of the cache nodes in the source cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withNodeSnapshots(NodeSnapshot... nodeSnapshots) {
        if (getNodeSnapshots() == null) {
            this.nodeSnapshots = new java.util.ArrayList<NodeSnapshot>(nodeSnapshots.length);
        }
        for (NodeSnapshot value : nodeSnapshots) {
            this.nodeSnapshots.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the cache nodes in the source cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeSnapshots <p>
     *            A list of the cache nodes in the source cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withNodeSnapshots(java.util.Collection<NodeSnapshot> nodeSnapshots) {
        setNodeSnapshots(nodeSnapshots);
        return this;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the snapshot.
     * </p>
     *
     * @return <p>
     *         The ID of the KMS key used to encrypt the snapshot.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the snapshot.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The ID of the KMS key used to encrypt the snapshot.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The ID of the KMS key used to encrypt the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the snapshot.
     * </p>
     *
     * @return <p>
     *         The ARN (Amazon Resource Name) of the snapshot.
     *         </p>
     */
    public String getARN() {
        return aRN;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the snapshot.
     * </p>
     *
     * @param aRN <p>
     *            The ARN (Amazon Resource Name) of the snapshot.
     *            </p>
     */
    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aRN <p>
     *            The ARN (Amazon Resource Name) of the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withARN(String aRN) {
        this.aRN = aRN;
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
        if (getSnapshotName() != null)
            sb.append("SnapshotName: " + getSnapshotName() + ",");
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: " + getReplicationGroupId() + ",");
        if (getReplicationGroupDescription() != null)
            sb.append("ReplicationGroupDescription: " + getReplicationGroupDescription() + ",");
        if (getCacheClusterId() != null)
            sb.append("CacheClusterId: " + getCacheClusterId() + ",");
        if (getSnapshotStatus() != null)
            sb.append("SnapshotStatus: " + getSnapshotStatus() + ",");
        if (getSnapshotSource() != null)
            sb.append("SnapshotSource: " + getSnapshotSource() + ",");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: " + getCacheNodeType() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getNumCacheNodes() != null)
            sb.append("NumCacheNodes: " + getNumCacheNodes() + ",");
        if (getPreferredAvailabilityZone() != null)
            sb.append("PreferredAvailabilityZone: " + getPreferredAvailabilityZone() + ",");
        if (getCacheClusterCreateTime() != null)
            sb.append("CacheClusterCreateTime: " + getCacheClusterCreateTime() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getTopicArn() != null)
            sb.append("TopicArn: " + getTopicArn() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getCacheParameterGroupName() != null)
            sb.append("CacheParameterGroupName: " + getCacheParameterGroupName() + ",");
        if (getCacheSubnetGroupName() != null)
            sb.append("CacheSubnetGroupName: " + getCacheSubnetGroupName() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: " + getAutoMinorVersionUpgrade() + ",");
        if (getSnapshotRetentionLimit() != null)
            sb.append("SnapshotRetentionLimit: " + getSnapshotRetentionLimit() + ",");
        if (getSnapshotWindow() != null)
            sb.append("SnapshotWindow: " + getSnapshotWindow() + ",");
        if (getNumNodeGroups() != null)
            sb.append("NumNodeGroups: " + getNumNodeGroups() + ",");
        if (getAutomaticFailover() != null)
            sb.append("AutomaticFailover: " + getAutomaticFailover() + ",");
        if (getNodeSnapshots() != null)
            sb.append("NodeSnapshots: " + getNodeSnapshots() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getARN() != null)
            sb.append("ARN: " + getARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode());
        hashCode = prime * hashCode
                + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationGroupDescription() == null) ? 0
                        : getReplicationGroupDescription().hashCode());
        hashCode = prime * hashCode
                + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotStatus() == null) ? 0 : getSnapshotStatus().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotSource() == null) ? 0 : getSnapshotSource().hashCode());
        hashCode = prime * hashCode
                + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode
                + ((getNumCacheNodes() == null) ? 0 : getNumCacheNodes().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredAvailabilityZone() == null) ? 0 : getPreferredAvailabilityZone()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheClusterCreateTime() == null) ? 0 : getCacheClusterCreateTime()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow()
                        .hashCode());
        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheParameterGroupName() == null) ? 0 : getCacheParameterGroupName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCacheSubnetGroupName() == null) ? 0 : getCacheSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotRetentionLimit() == null) ? 0 : getSnapshotRetentionLimit()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotWindow() == null) ? 0 : getSnapshotWindow().hashCode());
        hashCode = prime * hashCode
                + ((getNumNodeGroups() == null) ? 0 : getNumNodeGroups().hashCode());
        hashCode = prime * hashCode
                + ((getAutomaticFailover() == null) ? 0 : getAutomaticFailover().hashCode());
        hashCode = prime * hashCode
                + ((getNodeSnapshots() == null) ? 0 : getNodeSnapshots().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Snapshot == false)
            return false;
        Snapshot other = (Snapshot) obj;

        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null
                && other.getSnapshotName().equals(this.getSnapshotName()) == false)
            return false;
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null
                && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getReplicationGroupDescription() == null
                ^ this.getReplicationGroupDescription() == null)
            return false;
        if (other.getReplicationGroupDescription() != null
                && other.getReplicationGroupDescription().equals(
                        this.getReplicationGroupDescription()) == false)
            return false;
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null
                && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getSnapshotStatus() == null ^ this.getSnapshotStatus() == null)
            return false;
        if (other.getSnapshotStatus() != null
                && other.getSnapshotStatus().equals(this.getSnapshotStatus()) == false)
            return false;
        if (other.getSnapshotSource() == null ^ this.getSnapshotSource() == null)
            return false;
        if (other.getSnapshotSource() != null
                && other.getSnapshotSource().equals(this.getSnapshotSource()) == false)
            return false;
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null)
            return false;
        if (other.getCacheNodeType() != null
                && other.getCacheNodeType().equals(this.getCacheNodeType()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getNumCacheNodes() == null ^ this.getNumCacheNodes() == null)
            return false;
        if (other.getNumCacheNodes() != null
                && other.getNumCacheNodes().equals(this.getNumCacheNodes()) == false)
            return false;
        if (other.getPreferredAvailabilityZone() == null
                ^ this.getPreferredAvailabilityZone() == null)
            return false;
        if (other.getPreferredAvailabilityZone() != null
                && other.getPreferredAvailabilityZone().equals(this.getPreferredAvailabilityZone()) == false)
            return false;
        if (other.getCacheClusterCreateTime() == null ^ this.getCacheClusterCreateTime() == null)
            return false;
        if (other.getCacheClusterCreateTime() != null
                && other.getCacheClusterCreateTime().equals(this.getCacheClusterCreateTime()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null
                ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null
                && other.getPreferredMaintenanceWindow().equals(
                        this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getCacheParameterGroupName() == null ^ this.getCacheParameterGroupName() == null)
            return false;
        if (other.getCacheParameterGroupName() != null
                && other.getCacheParameterGroupName().equals(this.getCacheParameterGroupName()) == false)
            return false;
        if (other.getCacheSubnetGroupName() == null ^ this.getCacheSubnetGroupName() == null)
            return false;
        if (other.getCacheSubnetGroupName() != null
                && other.getCacheSubnetGroupName().equals(this.getCacheSubnetGroupName()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null
                && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getSnapshotRetentionLimit() == null ^ this.getSnapshotRetentionLimit() == null)
            return false;
        if (other.getSnapshotRetentionLimit() != null
                && other.getSnapshotRetentionLimit().equals(this.getSnapshotRetentionLimit()) == false)
            return false;
        if (other.getSnapshotWindow() == null ^ this.getSnapshotWindow() == null)
            return false;
        if (other.getSnapshotWindow() != null
                && other.getSnapshotWindow().equals(this.getSnapshotWindow()) == false)
            return false;
        if (other.getNumNodeGroups() == null ^ this.getNumNodeGroups() == null)
            return false;
        if (other.getNumNodeGroups() != null
                && other.getNumNodeGroups().equals(this.getNumNodeGroups()) == false)
            return false;
        if (other.getAutomaticFailover() == null ^ this.getAutomaticFailover() == null)
            return false;
        if (other.getAutomaticFailover() != null
                && other.getAutomaticFailover().equals(this.getAutomaticFailover()) == false)
            return false;
        if (other.getNodeSnapshots() == null ^ this.getNodeSnapshots() == null)
            return false;
        if (other.getNodeSnapshots() != null
                && other.getNodeSnapshots().equals(this.getNodeSnapshots()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        return true;
    }
}
