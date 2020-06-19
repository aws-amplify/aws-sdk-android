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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a Redis (cluster mode disabled) or a Redis (cluster mode enabled)
 * replication group.
 * </p>
 * <p>
 * This API can be used to create a standalone regional replication group or a
 * secondary replication group associated with a Global Datastore.
 * </p>
 * <p>
 * A Redis (cluster mode disabled) replication group is a collection of
 * clusters, where one of the clusters is a read/write primary and the others
 * are read-only replicas. Writes to the primary are asynchronously propagated
 * to the replicas.
 * </p>
 * <p>
 * A Redis (cluster mode enabled) replication group is a collection of 1 to 90
 * node groups (shards). Each node group (shard) has one read/write primary node
 * and up to 5 read-only replica nodes. Writes to the primary are asynchronously
 * propagated to the replicas. Redis (cluster mode enabled) replication groups
 * partition the data across node groups (shards).
 * </p>
 * <p>
 * When a Redis (cluster mode disabled) replication group has been successfully
 * created, you can add one or more read replicas to it, up to a total of 5 read
 * replicas. You cannot alter a Redis (cluster mode enabled) replication group
 * after it has been created. However, if you need to increase or decrease the
 * number of node groups (console: shards), you can avail yourself of
 * ElastiCache for Redis' enhanced backup and restore. For more information, see
 * <a href=
 * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-restoring.html"
 * >Restoring From a Backup with Cluster Resizing</a> in the <i>ElastiCache User
 * Guide</i>.
 * </p>
 * <note>
 * <p>
 * This operation is valid for Redis only.
 * </p>
 * </note>
 */
public class CreateReplicationGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The replication group identifier. This parameter is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A name must contain from 1 to 40 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A name cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     */
    private String replicationGroupId;

    /**
     * <p>
     * A user-created description for the replication group.
     * </p>
     */
    private String replicationGroupDescription;

    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     */
    private String globalReplicationGroupId;

    /**
     * <p>
     * The identifier of the cluster that serves as the primary for this
     * replication group. This cluster must already exist and have a status of
     * <code>available</code>.
     * </p>
     * <p>
     * This parameter is not required if <code>NumCacheClusters</code>,
     * <code>NumNodeGroups</code>, or <code>ReplicasPerNodeGroup</code> is
     * specified.
     * </p>
     */
    private String primaryClusterId;

    /**
     * <p>
     * Specifies whether a read-only replica is automatically promoted to
     * read/write primary if the existing primary fails.
     * </p>
     * <p>
     * <code>AutomaticFailoverEnabled</code> must be enabled for Redis (cluster
     * mode enabled) replication groups.
     * </p>
     * <p>
     * Default: false
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
     */
    private Boolean automaticFailoverEnabled;

    /**
     * <p>
     * A flag indicating if you have Multi-AZ enabled to enhance fault
     * tolerance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html"
     * >Minimizing Downtime: Multi-AZ</a>.
     * </p>
     */
    private Boolean multiAZEnabled;

    /**
     * <p>
     * The number of clusters this replication group initially has.
     * </p>
     * <p>
     * This parameter is not used if there is more than one node group (shard).
     * You should use <code>ReplicasPerNodeGroup</code> instead.
     * </p>
     * <p>
     * If <code>AutomaticFailoverEnabled</code> is <code>true</code>, the value
     * of this parameter must be at least 2. If
     * <code>AutomaticFailoverEnabled</code> is <code>false</code> you can omit
     * this parameter (it will default to 1), or you can explicitly set it to a
     * value between 2 and 6.
     * </p>
     * <p>
     * The maximum permitted value for <code>NumCacheClusters</code> is 6 (1
     * primary plus 5 replicas).
     * </p>
     */
    private Integer numCacheClusters;

    /**
     * <p>
     * A list of EC2 Availability Zones in which the replication group's
     * clusters are created. The order of the Availability Zones in the list is
     * the order in which clusters are allocated. The primary cluster is created
     * in the first AZ in the list.
     * </p>
     * <p>
     * This parameter is not used if there is more than one node group (shard).
     * You should use <code>NodeGroupConfiguration</code> instead.
     * </p>
     * <note>
     * <p>
     * If you are creating your replication group in an Amazon VPC
     * (recommended), you can only locate clusters in Availability Zones
     * associated with the subnets in the selected subnet group.
     * </p>
     * <p>
     * The number of Availability Zones listed must equal the value of
     * <code>NumCacheClusters</code>.
     * </p>
     * </note>
     * <p>
     * Default: system chosen Availability Zones.
     * </p>
     */
    private java.util.List<String> preferredCacheClusterAZs;

    /**
     * <p>
     * An optional parameter that specifies the number of node groups (shards)
     * for this Redis (cluster mode enabled) replication group. For Redis
     * (cluster mode disabled) either omit this parameter or set it to 1.
     * </p>
     * <p>
     * Default: 1
     * </p>
     */
    private Integer numNodeGroups;

    /**
     * <p>
     * An optional parameter that specifies the number of replica nodes in each
     * node group (shard). Valid values are 0 to 5.
     * </p>
     */
    private Integer replicasPerNodeGroup;

    /**
     * <p>
     * A list of node group (shard) configuration options. Each node group
     * (shard) configuration has the following members:
     * <code>PrimaryAvailabilityZone</code>,
     * <code>ReplicaAvailabilityZones</code>, <code>ReplicaCount</code>, and
     * <code>Slots</code>.
     * </p>
     * <p>
     * If you're creating a Redis (cluster mode disabled) or a Redis (cluster
     * mode enabled) replication group, you can use this parameter to
     * individually configure each node group (shard), or you can omit this
     * parameter. However, it is required when seeding a Redis (cluster mode
     * enabled) cluster from a S3 rdb file. You must configure each node group
     * (shard) using this parameter because you must specify the slots for each
     * node group.
     * </p>
     */
    private java.util.List<NodeGroupConfiguration> nodeGroupConfiguration;

    /**
     * <p>
     * The compute and memory capacity of the nodes in the node group (shard).
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
     * The name of the cache engine to be used for the clusters in this
     * replication group.
     * </p>
     */
    private String engine;

    /**
     * <p>
     * The version number of the cache engine to be used for the clusters in
     * this replication group. To view the supported cache engine versions, use
     * the <code>DescribeCacheEngineVersions</code> operation.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     * >Selecting a Cache Engine and Version</a>) in the <i>ElastiCache User
     * Guide</i>, but you cannot downgrade to an earlier engine version. If you
     * want to use an earlier engine version, you must delete the existing
     * cluster or replication group and create it anew with the earlier engine
     * version.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The name of the parameter group to associate with this replication group.
     * If this argument is omitted, the default cache parameter group for the
     * specified engine is used.
     * </p>
     * <note>
     * <p>
     * If you are restoring to an engine version that is different than the
     * original, you must specify the default version of that version. For
     * example, <code>CacheParameterGroupName=default.redis4.0</code>.
     * </p>
     * </note>
     * <p>
     * If you are running Redis version 3.2.4 or later, only one node group
     * (shard), and want to use a default parameter group, we recommend that you
     * specify the parameter group by name.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create a Redis (cluster mode disabled) replication group, use
     * <code>CacheParameterGroupName=default.redis3.2</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a Redis (cluster mode enabled) replication group, use
     * <code>CacheParameterGroupName=default.redis3.2.cluster.on</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String cacheParameterGroupName;

    /**
     * <p>
     * The name of the cache subnet group to be used for the replication group.
     * </p>
     * <important>
     * <p>
     * If you're going to launch your cluster in an Amazon VPC, you need to
     * create a subnet group before you start creating a cluster. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SubnetGroups.html"
     * >Subnets and Subnet Groups</a>.
     * </p>
     * </important>
     */
    private String cacheSubnetGroupName;

    /**
     * <p>
     * A list of cache security group names to associate with this replication
     * group.
     * </p>
     */
    private java.util.List<String> cacheSecurityGroupNames;

    /**
     * <p>
     * One or more Amazon VPC security groups associated with this replication
     * group.
     * </p>
     * <p>
     * Use this parameter only when you are creating a replication group in an
     * Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * A list of cost allocation tags to be added to this resource. Tags are
     * comma-separated key,value pairs (e.g. Key=<code>myKey</code>, Value=
     * <code>myKeyValue</code>. You can include multiple tags as shown
     * following: Key=<code>myKey</code>, Value=<code>myKeyValue</code> Key=
     * <code>mySecondKey</code>, Value=<code>mySecondKeyValue</code>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A list of Amazon Resource Names (ARN) that uniquely identify the Redis
     * RDB snapshot files stored in Amazon S3. The snapshot files are used to
     * populate the new replication group. The Amazon S3 object name in the ARN
     * cannot contain any commas. The new replication group will have the number
     * of node groups (console: shards) specified by the parameter
     * <i>NumNodeGroups</i> or the number of node groups configured by
     * <i>NodeGroupConfiguration</i> regardless of the number of ARNs specified
     * here.
     * </p>
     * <p>
     * Example of an Amazon S3 ARN:
     * <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     * </p>
     */
    private java.util.List<String> snapshotArns;

    /**
     * <p>
     * The name of a snapshot from which to restore data into the new
     * replication group. The snapshot status changes to <code>restoring</code>
     * while the new replication group is being created.
     * </p>
     */
    private String snapshotName;

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cluster
     * is performed. It is specified as a range in the format
     * ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window
     * is a 60 minute period. Valid values for <code>ddd</code> are:
     * </p>
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
     * The port number on which each member of the replication group accepts
     * connections.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service
     * (SNS) topic to which notifications are sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be the same as the cluster owner.
     * </p>
     * </note>
     */
    private String notificationTopicArn;

    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic snapshots
     * before deleting them. For example, if you set
     * <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today
     * is retained for 5 days before being deleted.
     * </p>
     * <p>
     * Default: 0 (i.e., automatic backups are disabled for this cluster).
     * </p>
     */
    private Integer snapshotRetentionLimit;

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a
     * daily snapshot of your node group (shard).
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * If you do not specify this parameter, ElastiCache automatically chooses
     * an appropriate time range.
     * </p>
     */
    private String snapshotWindow;

    /**
     * <p>
     * <b>Reserved parameter.</b> The password used to access a password
     * protected server.
     * </p>
     * <p>
     * <code>AuthToken</code> can be specified only on replication groups where
     * <code>TransitEncryptionEnabled</code> is <code>true</code>.
     * </p>
     * <important>
     * <p>
     * For HIPAA compliance, you must specify
     * <code>TransitEncryptionEnabled</code> as <code>true</code>, an
     * <code>AuthToken</code>, and a <code>CacheSubnetGroup</code>.
     * </p>
     * </important>
     * <p>
     * Password constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be only printable ASCII characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 16 characters and no more than 128 characters in length.
     * </p>
     * </li>
     * <li>
     * <p>
     * The only permitted printable special characters are !, &amp;, #, $, ^,
     * &lt;, &gt;, and -. Other printable special characters cannot be used in
     * the AUTH token.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="http://redis.io/commands/AUTH">AUTH
     * password</a> at http://redis.io/commands/AUTH.
     * </p>
     */
    private String authToken;

    /**
     * <p>
     * A flag that enables in-transit encryption when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>TransitEncryptionEnabled</code>
     * after the cluster is created. To enable in-transit encryption on a
     * cluster you must set <code>TransitEncryptionEnabled</code> to
     * <code>true</code> when you create a cluster.
     * </p>
     * <p>
     * This parameter is valid only if the <code>Engine</code> parameter is
     * <code>redis</code>, the <code>EngineVersion</code> parameter is
     * <code>3.2.6</code>, <code>4.x</code> or later, and the cluster is being
     * created in an Amazon VPC.
     * </p>
     * <p>
     * If you enable in-transit encryption, you must also specify a value for
     * <code>CacheSubnetGroup</code>.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an
     * Amazon VPC using redis version <code>3.2.6</code>, <code>4.x</code> or
     * later.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <important>
     * <p>
     * For HIPAA compliance, you must specify
     * <code>TransitEncryptionEnabled</code> as <code>true</code>, an
     * <code>AuthToken</code>, and a <code>CacheSubnetGroup</code>.
     * </p>
     * </important>
     */
    private Boolean transitEncryptionEnabled;

    /**
     * <p>
     * A flag that enables encryption at rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after
     * the replication group is created. To enable encryption at rest on a
     * replication group you must set <code>AtRestEncryptionEnabled</code> to
     * <code>true</code> when you create the replication group.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an
     * Amazon VPC using redis version <code>3.2.6</code>, <code>4.x</code> or
     * later.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean atRestEncryptionEnabled;

    /**
     * <p>
     * The ID of the KMS key used to encrypt the disk in the cluster.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The replication group identifier. This parameter is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A name must contain from 1 to 40 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A name cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The replication group identifier. This parameter is stored as a
     *         lowercase string.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A name must contain from 1 to 40 alphanumeric characters or
     *         hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The first character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A name cannot end with a hyphen or contain two consecutive
     *         hyphens.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }

    /**
     * <p>
     * The replication group identifier. This parameter is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A name must contain from 1 to 40 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A name cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     *
     * @param replicationGroupId <p>
     *            The replication group identifier. This parameter is stored as
     *            a lowercase string.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            A name must contain from 1 to 40 alphanumeric characters or
     *            hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The first character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A name cannot end with a hyphen or contain two consecutive
     *            hyphens.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The replication group identifier. This parameter is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A name must contain from 1 to 40 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A name cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupId <p>
     *            The replication group identifier. This parameter is stored as
     *            a lowercase string.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            A name must contain from 1 to 40 alphanumeric characters or
     *            hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The first character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A name cannot end with a hyphen or contain two consecutive
     *            hyphens.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
        return this;
    }

    /**
     * <p>
     * A user-created description for the replication group.
     * </p>
     *
     * @return <p>
     *         A user-created description for the replication group.
     *         </p>
     */
    public String getReplicationGroupDescription() {
        return replicationGroupDescription;
    }

    /**
     * <p>
     * A user-created description for the replication group.
     * </p>
     *
     * @param replicationGroupDescription <p>
     *            A user-created description for the replication group.
     *            </p>
     */
    public void setReplicationGroupDescription(String replicationGroupDescription) {
        this.replicationGroupDescription = replicationGroupDescription;
    }

    /**
     * <p>
     * A user-created description for the replication group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupDescription <p>
     *            A user-created description for the replication group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withReplicationGroupDescription(
            String replicationGroupDescription) {
        this.replicationGroupDescription = replicationGroupDescription;
        return this;
    }

    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     *
     * @return <p>
     *         The name of the Global Datastore
     *         </p>
     */
    public String getGlobalReplicationGroupId() {
        return globalReplicationGroupId;
    }

    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     *
     * @param globalReplicationGroupId <p>
     *            The name of the Global Datastore
     *            </p>
     */
    public void setGlobalReplicationGroupId(String globalReplicationGroupId) {
        this.globalReplicationGroupId = globalReplicationGroupId;
    }

    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalReplicationGroupId <p>
     *            The name of the Global Datastore
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withGlobalReplicationGroupId(
            String globalReplicationGroupId) {
        this.globalReplicationGroupId = globalReplicationGroupId;
        return this;
    }

    /**
     * <p>
     * The identifier of the cluster that serves as the primary for this
     * replication group. This cluster must already exist and have a status of
     * <code>available</code>.
     * </p>
     * <p>
     * This parameter is not required if <code>NumCacheClusters</code>,
     * <code>NumNodeGroups</code>, or <code>ReplicasPerNodeGroup</code> is
     * specified.
     * </p>
     *
     * @return <p>
     *         The identifier of the cluster that serves as the primary for this
     *         replication group. This cluster must already exist and have a
     *         status of <code>available</code>.
     *         </p>
     *         <p>
     *         This parameter is not required if <code>NumCacheClusters</code>,
     *         <code>NumNodeGroups</code>, or <code>ReplicasPerNodeGroup</code>
     *         is specified.
     *         </p>
     */
    public String getPrimaryClusterId() {
        return primaryClusterId;
    }

    /**
     * <p>
     * The identifier of the cluster that serves as the primary for this
     * replication group. This cluster must already exist and have a status of
     * <code>available</code>.
     * </p>
     * <p>
     * This parameter is not required if <code>NumCacheClusters</code>,
     * <code>NumNodeGroups</code>, or <code>ReplicasPerNodeGroup</code> is
     * specified.
     * </p>
     *
     * @param primaryClusterId <p>
     *            The identifier of the cluster that serves as the primary for
     *            this replication group. This cluster must already exist and
     *            have a status of <code>available</code>.
     *            </p>
     *            <p>
     *            This parameter is not required if
     *            <code>NumCacheClusters</code>, <code>NumNodeGroups</code>, or
     *            <code>ReplicasPerNodeGroup</code> is specified.
     *            </p>
     */
    public void setPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
    }

    /**
     * <p>
     * The identifier of the cluster that serves as the primary for this
     * replication group. This cluster must already exist and have a status of
     * <code>available</code>.
     * </p>
     * <p>
     * This parameter is not required if <code>NumCacheClusters</code>,
     * <code>NumNodeGroups</code>, or <code>ReplicasPerNodeGroup</code> is
     * specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param primaryClusterId <p>
     *            The identifier of the cluster that serves as the primary for
     *            this replication group. This cluster must already exist and
     *            have a status of <code>available</code>.
     *            </p>
     *            <p>
     *            This parameter is not required if
     *            <code>NumCacheClusters</code>, <code>NumNodeGroups</code>, or
     *            <code>ReplicasPerNodeGroup</code> is specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
        return this;
    }

    /**
     * <p>
     * Specifies whether a read-only replica is automatically promoted to
     * read/write primary if the existing primary fails.
     * </p>
     * <p>
     * <code>AutomaticFailoverEnabled</code> must be enabled for Redis (cluster
     * mode enabled) replication groups.
     * </p>
     * <p>
     * Default: false
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
     *
     * @return <p>
     *         Specifies whether a read-only replica is automatically promoted
     *         to read/write primary if the existing primary fails.
     *         </p>
     *         <p>
     *         <code>AutomaticFailoverEnabled</code> must be enabled for Redis
     *         (cluster mode enabled) replication groups.
     *         </p>
     *         <p>
     *         Default: false
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
     */
    public Boolean isAutomaticFailoverEnabled() {
        return automaticFailoverEnabled;
    }

    /**
     * <p>
     * Specifies whether a read-only replica is automatically promoted to
     * read/write primary if the existing primary fails.
     * </p>
     * <p>
     * <code>AutomaticFailoverEnabled</code> must be enabled for Redis (cluster
     * mode enabled) replication groups.
     * </p>
     * <p>
     * Default: false
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
     *
     * @return <p>
     *         Specifies whether a read-only replica is automatically promoted
     *         to read/write primary if the existing primary fails.
     *         </p>
     *         <p>
     *         <code>AutomaticFailoverEnabled</code> must be enabled for Redis
     *         (cluster mode enabled) replication groups.
     *         </p>
     *         <p>
     *         Default: false
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
     */
    public Boolean getAutomaticFailoverEnabled() {
        return automaticFailoverEnabled;
    }

    /**
     * <p>
     * Specifies whether a read-only replica is automatically promoted to
     * read/write primary if the existing primary fails.
     * </p>
     * <p>
     * <code>AutomaticFailoverEnabled</code> must be enabled for Redis (cluster
     * mode enabled) replication groups.
     * </p>
     * <p>
     * Default: false
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
     *
     * @param automaticFailoverEnabled <p>
     *            Specifies whether a read-only replica is automatically
     *            promoted to read/write primary if the existing primary fails.
     *            </p>
     *            <p>
     *            <code>AutomaticFailoverEnabled</code> must be enabled for
     *            Redis (cluster mode enabled) replication groups.
     *            </p>
     *            <p>
     *            Default: false
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
     */
    public void setAutomaticFailoverEnabled(Boolean automaticFailoverEnabled) {
        this.automaticFailoverEnabled = automaticFailoverEnabled;
    }

    /**
     * <p>
     * Specifies whether a read-only replica is automatically promoted to
     * read/write primary if the existing primary fails.
     * </p>
     * <p>
     * <code>AutomaticFailoverEnabled</code> must be enabled for Redis (cluster
     * mode enabled) replication groups.
     * </p>
     * <p>
     * Default: false
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
     *
     * @param automaticFailoverEnabled <p>
     *            Specifies whether a read-only replica is automatically
     *            promoted to read/write primary if the existing primary fails.
     *            </p>
     *            <p>
     *            <code>AutomaticFailoverEnabled</code> must be enabled for
     *            Redis (cluster mode enabled) replication groups.
     *            </p>
     *            <p>
     *            Default: false
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
     */
    public CreateReplicationGroupRequest withAutomaticFailoverEnabled(
            Boolean automaticFailoverEnabled) {
        this.automaticFailoverEnabled = automaticFailoverEnabled;
        return this;
    }

    /**
     * <p>
     * A flag indicating if you have Multi-AZ enabled to enhance fault
     * tolerance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html"
     * >Minimizing Downtime: Multi-AZ</a>.
     * </p>
     *
     * @return <p>
     *         A flag indicating if you have Multi-AZ enabled to enhance fault
     *         tolerance. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html"
     *         >Minimizing Downtime: Multi-AZ</a>.
     *         </p>
     */
    public Boolean isMultiAZEnabled() {
        return multiAZEnabled;
    }

    /**
     * <p>
     * A flag indicating if you have Multi-AZ enabled to enhance fault
     * tolerance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html"
     * >Minimizing Downtime: Multi-AZ</a>.
     * </p>
     *
     * @return <p>
     *         A flag indicating if you have Multi-AZ enabled to enhance fault
     *         tolerance. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html"
     *         >Minimizing Downtime: Multi-AZ</a>.
     *         </p>
     */
    public Boolean getMultiAZEnabled() {
        return multiAZEnabled;
    }

    /**
     * <p>
     * A flag indicating if you have Multi-AZ enabled to enhance fault
     * tolerance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html"
     * >Minimizing Downtime: Multi-AZ</a>.
     * </p>
     *
     * @param multiAZEnabled <p>
     *            A flag indicating if you have Multi-AZ enabled to enhance
     *            fault tolerance. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html"
     *            >Minimizing Downtime: Multi-AZ</a>.
     *            </p>
     */
    public void setMultiAZEnabled(Boolean multiAZEnabled) {
        this.multiAZEnabled = multiAZEnabled;
    }

    /**
     * <p>
     * A flag indicating if you have Multi-AZ enabled to enhance fault
     * tolerance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html"
     * >Minimizing Downtime: Multi-AZ</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiAZEnabled <p>
     *            A flag indicating if you have Multi-AZ enabled to enhance
     *            fault tolerance. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html"
     *            >Minimizing Downtime: Multi-AZ</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withMultiAZEnabled(Boolean multiAZEnabled) {
        this.multiAZEnabled = multiAZEnabled;
        return this;
    }

    /**
     * <p>
     * The number of clusters this replication group initially has.
     * </p>
     * <p>
     * This parameter is not used if there is more than one node group (shard).
     * You should use <code>ReplicasPerNodeGroup</code> instead.
     * </p>
     * <p>
     * If <code>AutomaticFailoverEnabled</code> is <code>true</code>, the value
     * of this parameter must be at least 2. If
     * <code>AutomaticFailoverEnabled</code> is <code>false</code> you can omit
     * this parameter (it will default to 1), or you can explicitly set it to a
     * value between 2 and 6.
     * </p>
     * <p>
     * The maximum permitted value for <code>NumCacheClusters</code> is 6 (1
     * primary plus 5 replicas).
     * </p>
     *
     * @return <p>
     *         The number of clusters this replication group initially has.
     *         </p>
     *         <p>
     *         This parameter is not used if there is more than one node group
     *         (shard). You should use <code>ReplicasPerNodeGroup</code>
     *         instead.
     *         </p>
     *         <p>
     *         If <code>AutomaticFailoverEnabled</code> is <code>true</code>,
     *         the value of this parameter must be at least 2. If
     *         <code>AutomaticFailoverEnabled</code> is <code>false</code> you
     *         can omit this parameter (it will default to 1), or you can
     *         explicitly set it to a value between 2 and 6.
     *         </p>
     *         <p>
     *         The maximum permitted value for <code>NumCacheClusters</code> is
     *         6 (1 primary plus 5 replicas).
     *         </p>
     */
    public Integer getNumCacheClusters() {
        return numCacheClusters;
    }

    /**
     * <p>
     * The number of clusters this replication group initially has.
     * </p>
     * <p>
     * This parameter is not used if there is more than one node group (shard).
     * You should use <code>ReplicasPerNodeGroup</code> instead.
     * </p>
     * <p>
     * If <code>AutomaticFailoverEnabled</code> is <code>true</code>, the value
     * of this parameter must be at least 2. If
     * <code>AutomaticFailoverEnabled</code> is <code>false</code> you can omit
     * this parameter (it will default to 1), or you can explicitly set it to a
     * value between 2 and 6.
     * </p>
     * <p>
     * The maximum permitted value for <code>NumCacheClusters</code> is 6 (1
     * primary plus 5 replicas).
     * </p>
     *
     * @param numCacheClusters <p>
     *            The number of clusters this replication group initially has.
     *            </p>
     *            <p>
     *            This parameter is not used if there is more than one node
     *            group (shard). You should use
     *            <code>ReplicasPerNodeGroup</code> instead.
     *            </p>
     *            <p>
     *            If <code>AutomaticFailoverEnabled</code> is <code>true</code>,
     *            the value of this parameter must be at least 2. If
     *            <code>AutomaticFailoverEnabled</code> is <code>false</code>
     *            you can omit this parameter (it will default to 1), or you can
     *            explicitly set it to a value between 2 and 6.
     *            </p>
     *            <p>
     *            The maximum permitted value for <code>NumCacheClusters</code>
     *            is 6 (1 primary plus 5 replicas).
     *            </p>
     */
    public void setNumCacheClusters(Integer numCacheClusters) {
        this.numCacheClusters = numCacheClusters;
    }

    /**
     * <p>
     * The number of clusters this replication group initially has.
     * </p>
     * <p>
     * This parameter is not used if there is more than one node group (shard).
     * You should use <code>ReplicasPerNodeGroup</code> instead.
     * </p>
     * <p>
     * If <code>AutomaticFailoverEnabled</code> is <code>true</code>, the value
     * of this parameter must be at least 2. If
     * <code>AutomaticFailoverEnabled</code> is <code>false</code> you can omit
     * this parameter (it will default to 1), or you can explicitly set it to a
     * value between 2 and 6.
     * </p>
     * <p>
     * The maximum permitted value for <code>NumCacheClusters</code> is 6 (1
     * primary plus 5 replicas).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numCacheClusters <p>
     *            The number of clusters this replication group initially has.
     *            </p>
     *            <p>
     *            This parameter is not used if there is more than one node
     *            group (shard). You should use
     *            <code>ReplicasPerNodeGroup</code> instead.
     *            </p>
     *            <p>
     *            If <code>AutomaticFailoverEnabled</code> is <code>true</code>,
     *            the value of this parameter must be at least 2. If
     *            <code>AutomaticFailoverEnabled</code> is <code>false</code>
     *            you can omit this parameter (it will default to 1), or you can
     *            explicitly set it to a value between 2 and 6.
     *            </p>
     *            <p>
     *            The maximum permitted value for <code>NumCacheClusters</code>
     *            is 6 (1 primary plus 5 replicas).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withNumCacheClusters(Integer numCacheClusters) {
        this.numCacheClusters = numCacheClusters;
        return this;
    }

    /**
     * <p>
     * A list of EC2 Availability Zones in which the replication group's
     * clusters are created. The order of the Availability Zones in the list is
     * the order in which clusters are allocated. The primary cluster is created
     * in the first AZ in the list.
     * </p>
     * <p>
     * This parameter is not used if there is more than one node group (shard).
     * You should use <code>NodeGroupConfiguration</code> instead.
     * </p>
     * <note>
     * <p>
     * If you are creating your replication group in an Amazon VPC
     * (recommended), you can only locate clusters in Availability Zones
     * associated with the subnets in the selected subnet group.
     * </p>
     * <p>
     * The number of Availability Zones listed must equal the value of
     * <code>NumCacheClusters</code>.
     * </p>
     * </note>
     * <p>
     * Default: system chosen Availability Zones.
     * </p>
     *
     * @return <p>
     *         A list of EC2 Availability Zones in which the replication group's
     *         clusters are created. The order of the Availability Zones in the
     *         list is the order in which clusters are allocated. The primary
     *         cluster is created in the first AZ in the list.
     *         </p>
     *         <p>
     *         This parameter is not used if there is more than one node group
     *         (shard). You should use <code>NodeGroupConfiguration</code>
     *         instead.
     *         </p>
     *         <note>
     *         <p>
     *         If you are creating your replication group in an Amazon VPC
     *         (recommended), you can only locate clusters in Availability Zones
     *         associated with the subnets in the selected subnet group.
     *         </p>
     *         <p>
     *         The number of Availability Zones listed must equal the value of
     *         <code>NumCacheClusters</code>.
     *         </p>
     *         </note>
     *         <p>
     *         Default: system chosen Availability Zones.
     *         </p>
     */
    public java.util.List<String> getPreferredCacheClusterAZs() {
        return preferredCacheClusterAZs;
    }

    /**
     * <p>
     * A list of EC2 Availability Zones in which the replication group's
     * clusters are created. The order of the Availability Zones in the list is
     * the order in which clusters are allocated. The primary cluster is created
     * in the first AZ in the list.
     * </p>
     * <p>
     * This parameter is not used if there is more than one node group (shard).
     * You should use <code>NodeGroupConfiguration</code> instead.
     * </p>
     * <note>
     * <p>
     * If you are creating your replication group in an Amazon VPC
     * (recommended), you can only locate clusters in Availability Zones
     * associated with the subnets in the selected subnet group.
     * </p>
     * <p>
     * The number of Availability Zones listed must equal the value of
     * <code>NumCacheClusters</code>.
     * </p>
     * </note>
     * <p>
     * Default: system chosen Availability Zones.
     * </p>
     *
     * @param preferredCacheClusterAZs <p>
     *            A list of EC2 Availability Zones in which the replication
     *            group's clusters are created. The order of the Availability
     *            Zones in the list is the order in which clusters are
     *            allocated. The primary cluster is created in the first AZ in
     *            the list.
     *            </p>
     *            <p>
     *            This parameter is not used if there is more than one node
     *            group (shard). You should use
     *            <code>NodeGroupConfiguration</code> instead.
     *            </p>
     *            <note>
     *            <p>
     *            If you are creating your replication group in an Amazon VPC
     *            (recommended), you can only locate clusters in Availability
     *            Zones associated with the subnets in the selected subnet
     *            group.
     *            </p>
     *            <p>
     *            The number of Availability Zones listed must equal the value
     *            of <code>NumCacheClusters</code>.
     *            </p>
     *            </note>
     *            <p>
     *            Default: system chosen Availability Zones.
     *            </p>
     */
    public void setPreferredCacheClusterAZs(java.util.Collection<String> preferredCacheClusterAZs) {
        if (preferredCacheClusterAZs == null) {
            this.preferredCacheClusterAZs = null;
            return;
        }

        this.preferredCacheClusterAZs = new java.util.ArrayList<String>(preferredCacheClusterAZs);
    }

    /**
     * <p>
     * A list of EC2 Availability Zones in which the replication group's
     * clusters are created. The order of the Availability Zones in the list is
     * the order in which clusters are allocated. The primary cluster is created
     * in the first AZ in the list.
     * </p>
     * <p>
     * This parameter is not used if there is more than one node group (shard).
     * You should use <code>NodeGroupConfiguration</code> instead.
     * </p>
     * <note>
     * <p>
     * If you are creating your replication group in an Amazon VPC
     * (recommended), you can only locate clusters in Availability Zones
     * associated with the subnets in the selected subnet group.
     * </p>
     * <p>
     * The number of Availability Zones listed must equal the value of
     * <code>NumCacheClusters</code>.
     * </p>
     * </note>
     * <p>
     * Default: system chosen Availability Zones.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredCacheClusterAZs <p>
     *            A list of EC2 Availability Zones in which the replication
     *            group's clusters are created. The order of the Availability
     *            Zones in the list is the order in which clusters are
     *            allocated. The primary cluster is created in the first AZ in
     *            the list.
     *            </p>
     *            <p>
     *            This parameter is not used if there is more than one node
     *            group (shard). You should use
     *            <code>NodeGroupConfiguration</code> instead.
     *            </p>
     *            <note>
     *            <p>
     *            If you are creating your replication group in an Amazon VPC
     *            (recommended), you can only locate clusters in Availability
     *            Zones associated with the subnets in the selected subnet
     *            group.
     *            </p>
     *            <p>
     *            The number of Availability Zones listed must equal the value
     *            of <code>NumCacheClusters</code>.
     *            </p>
     *            </note>
     *            <p>
     *            Default: system chosen Availability Zones.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withPreferredCacheClusterAZs(
            String... preferredCacheClusterAZs) {
        if (getPreferredCacheClusterAZs() == null) {
            this.preferredCacheClusterAZs = new java.util.ArrayList<String>(
                    preferredCacheClusterAZs.length);
        }
        for (String value : preferredCacheClusterAZs) {
            this.preferredCacheClusterAZs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of EC2 Availability Zones in which the replication group's
     * clusters are created. The order of the Availability Zones in the list is
     * the order in which clusters are allocated. The primary cluster is created
     * in the first AZ in the list.
     * </p>
     * <p>
     * This parameter is not used if there is more than one node group (shard).
     * You should use <code>NodeGroupConfiguration</code> instead.
     * </p>
     * <note>
     * <p>
     * If you are creating your replication group in an Amazon VPC
     * (recommended), you can only locate clusters in Availability Zones
     * associated with the subnets in the selected subnet group.
     * </p>
     * <p>
     * The number of Availability Zones listed must equal the value of
     * <code>NumCacheClusters</code>.
     * </p>
     * </note>
     * <p>
     * Default: system chosen Availability Zones.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredCacheClusterAZs <p>
     *            A list of EC2 Availability Zones in which the replication
     *            group's clusters are created. The order of the Availability
     *            Zones in the list is the order in which clusters are
     *            allocated. The primary cluster is created in the first AZ in
     *            the list.
     *            </p>
     *            <p>
     *            This parameter is not used if there is more than one node
     *            group (shard). You should use
     *            <code>NodeGroupConfiguration</code> instead.
     *            </p>
     *            <note>
     *            <p>
     *            If you are creating your replication group in an Amazon VPC
     *            (recommended), you can only locate clusters in Availability
     *            Zones associated with the subnets in the selected subnet
     *            group.
     *            </p>
     *            <p>
     *            The number of Availability Zones listed must equal the value
     *            of <code>NumCacheClusters</code>.
     *            </p>
     *            </note>
     *            <p>
     *            Default: system chosen Availability Zones.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withPreferredCacheClusterAZs(
            java.util.Collection<String> preferredCacheClusterAZs) {
        setPreferredCacheClusterAZs(preferredCacheClusterAZs);
        return this;
    }

    /**
     * <p>
     * An optional parameter that specifies the number of node groups (shards)
     * for this Redis (cluster mode enabled) replication group. For Redis
     * (cluster mode disabled) either omit this parameter or set it to 1.
     * </p>
     * <p>
     * Default: 1
     * </p>
     *
     * @return <p>
     *         An optional parameter that specifies the number of node groups
     *         (shards) for this Redis (cluster mode enabled) replication group.
     *         For Redis (cluster mode disabled) either omit this parameter or
     *         set it to 1.
     *         </p>
     *         <p>
     *         Default: 1
     *         </p>
     */
    public Integer getNumNodeGroups() {
        return numNodeGroups;
    }

    /**
     * <p>
     * An optional parameter that specifies the number of node groups (shards)
     * for this Redis (cluster mode enabled) replication group. For Redis
     * (cluster mode disabled) either omit this parameter or set it to 1.
     * </p>
     * <p>
     * Default: 1
     * </p>
     *
     * @param numNodeGroups <p>
     *            An optional parameter that specifies the number of node groups
     *            (shards) for this Redis (cluster mode enabled) replication
     *            group. For Redis (cluster mode disabled) either omit this
     *            parameter or set it to 1.
     *            </p>
     *            <p>
     *            Default: 1
     *            </p>
     */
    public void setNumNodeGroups(Integer numNodeGroups) {
        this.numNodeGroups = numNodeGroups;
    }

    /**
     * <p>
     * An optional parameter that specifies the number of node groups (shards)
     * for this Redis (cluster mode enabled) replication group. For Redis
     * (cluster mode disabled) either omit this parameter or set it to 1.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numNodeGroups <p>
     *            An optional parameter that specifies the number of node groups
     *            (shards) for this Redis (cluster mode enabled) replication
     *            group. For Redis (cluster mode disabled) either omit this
     *            parameter or set it to 1.
     *            </p>
     *            <p>
     *            Default: 1
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withNumNodeGroups(Integer numNodeGroups) {
        this.numNodeGroups = numNodeGroups;
        return this;
    }

    /**
     * <p>
     * An optional parameter that specifies the number of replica nodes in each
     * node group (shard). Valid values are 0 to 5.
     * </p>
     *
     * @return <p>
     *         An optional parameter that specifies the number of replica nodes
     *         in each node group (shard). Valid values are 0 to 5.
     *         </p>
     */
    public Integer getReplicasPerNodeGroup() {
        return replicasPerNodeGroup;
    }

    /**
     * <p>
     * An optional parameter that specifies the number of replica nodes in each
     * node group (shard). Valid values are 0 to 5.
     * </p>
     *
     * @param replicasPerNodeGroup <p>
     *            An optional parameter that specifies the number of replica
     *            nodes in each node group (shard). Valid values are 0 to 5.
     *            </p>
     */
    public void setReplicasPerNodeGroup(Integer replicasPerNodeGroup) {
        this.replicasPerNodeGroup = replicasPerNodeGroup;
    }

    /**
     * <p>
     * An optional parameter that specifies the number of replica nodes in each
     * node group (shard). Valid values are 0 to 5.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicasPerNodeGroup <p>
     *            An optional parameter that specifies the number of replica
     *            nodes in each node group (shard). Valid values are 0 to 5.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withReplicasPerNodeGroup(Integer replicasPerNodeGroup) {
        this.replicasPerNodeGroup = replicasPerNodeGroup;
        return this;
    }

    /**
     * <p>
     * A list of node group (shard) configuration options. Each node group
     * (shard) configuration has the following members:
     * <code>PrimaryAvailabilityZone</code>,
     * <code>ReplicaAvailabilityZones</code>, <code>ReplicaCount</code>, and
     * <code>Slots</code>.
     * </p>
     * <p>
     * If you're creating a Redis (cluster mode disabled) or a Redis (cluster
     * mode enabled) replication group, you can use this parameter to
     * individually configure each node group (shard), or you can omit this
     * parameter. However, it is required when seeding a Redis (cluster mode
     * enabled) cluster from a S3 rdb file. You must configure each node group
     * (shard) using this parameter because you must specify the slots for each
     * node group.
     * </p>
     *
     * @return <p>
     *         A list of node group (shard) configuration options. Each node
     *         group (shard) configuration has the following members:
     *         <code>PrimaryAvailabilityZone</code>,
     *         <code>ReplicaAvailabilityZones</code>, <code>ReplicaCount</code>,
     *         and <code>Slots</code>.
     *         </p>
     *         <p>
     *         If you're creating a Redis (cluster mode disabled) or a Redis
     *         (cluster mode enabled) replication group, you can use this
     *         parameter to individually configure each node group (shard), or
     *         you can omit this parameter. However, it is required when seeding
     *         a Redis (cluster mode enabled) cluster from a S3 rdb file. You
     *         must configure each node group (shard) using this parameter
     *         because you must specify the slots for each node group.
     *         </p>
     */
    public java.util.List<NodeGroupConfiguration> getNodeGroupConfiguration() {
        return nodeGroupConfiguration;
    }

    /**
     * <p>
     * A list of node group (shard) configuration options. Each node group
     * (shard) configuration has the following members:
     * <code>PrimaryAvailabilityZone</code>,
     * <code>ReplicaAvailabilityZones</code>, <code>ReplicaCount</code>, and
     * <code>Slots</code>.
     * </p>
     * <p>
     * If you're creating a Redis (cluster mode disabled) or a Redis (cluster
     * mode enabled) replication group, you can use this parameter to
     * individually configure each node group (shard), or you can omit this
     * parameter. However, it is required when seeding a Redis (cluster mode
     * enabled) cluster from a S3 rdb file. You must configure each node group
     * (shard) using this parameter because you must specify the slots for each
     * node group.
     * </p>
     *
     * @param nodeGroupConfiguration <p>
     *            A list of node group (shard) configuration options. Each node
     *            group (shard) configuration has the following members:
     *            <code>PrimaryAvailabilityZone</code>,
     *            <code>ReplicaAvailabilityZones</code>,
     *            <code>ReplicaCount</code>, and <code>Slots</code>.
     *            </p>
     *            <p>
     *            If you're creating a Redis (cluster mode disabled) or a Redis
     *            (cluster mode enabled) replication group, you can use this
     *            parameter to individually configure each node group (shard),
     *            or you can omit this parameter. However, it is required when
     *            seeding a Redis (cluster mode enabled) cluster from a S3 rdb
     *            file. You must configure each node group (shard) using this
     *            parameter because you must specify the slots for each node
     *            group.
     *            </p>
     */
    public void setNodeGroupConfiguration(
            java.util.Collection<NodeGroupConfiguration> nodeGroupConfiguration) {
        if (nodeGroupConfiguration == null) {
            this.nodeGroupConfiguration = null;
            return;
        }

        this.nodeGroupConfiguration = new java.util.ArrayList<NodeGroupConfiguration>(
                nodeGroupConfiguration);
    }

    /**
     * <p>
     * A list of node group (shard) configuration options. Each node group
     * (shard) configuration has the following members:
     * <code>PrimaryAvailabilityZone</code>,
     * <code>ReplicaAvailabilityZones</code>, <code>ReplicaCount</code>, and
     * <code>Slots</code>.
     * </p>
     * <p>
     * If you're creating a Redis (cluster mode disabled) or a Redis (cluster
     * mode enabled) replication group, you can use this parameter to
     * individually configure each node group (shard), or you can omit this
     * parameter. However, it is required when seeding a Redis (cluster mode
     * enabled) cluster from a S3 rdb file. You must configure each node group
     * (shard) using this parameter because you must specify the slots for each
     * node group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeGroupConfiguration <p>
     *            A list of node group (shard) configuration options. Each node
     *            group (shard) configuration has the following members:
     *            <code>PrimaryAvailabilityZone</code>,
     *            <code>ReplicaAvailabilityZones</code>,
     *            <code>ReplicaCount</code>, and <code>Slots</code>.
     *            </p>
     *            <p>
     *            If you're creating a Redis (cluster mode disabled) or a Redis
     *            (cluster mode enabled) replication group, you can use this
     *            parameter to individually configure each node group (shard),
     *            or you can omit this parameter. However, it is required when
     *            seeding a Redis (cluster mode enabled) cluster from a S3 rdb
     *            file. You must configure each node group (shard) using this
     *            parameter because you must specify the slots for each node
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withNodeGroupConfiguration(
            NodeGroupConfiguration... nodeGroupConfiguration) {
        if (getNodeGroupConfiguration() == null) {
            this.nodeGroupConfiguration = new java.util.ArrayList<NodeGroupConfiguration>(
                    nodeGroupConfiguration.length);
        }
        for (NodeGroupConfiguration value : nodeGroupConfiguration) {
            this.nodeGroupConfiguration.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of node group (shard) configuration options. Each node group
     * (shard) configuration has the following members:
     * <code>PrimaryAvailabilityZone</code>,
     * <code>ReplicaAvailabilityZones</code>, <code>ReplicaCount</code>, and
     * <code>Slots</code>.
     * </p>
     * <p>
     * If you're creating a Redis (cluster mode disabled) or a Redis (cluster
     * mode enabled) replication group, you can use this parameter to
     * individually configure each node group (shard), or you can omit this
     * parameter. However, it is required when seeding a Redis (cluster mode
     * enabled) cluster from a S3 rdb file. You must configure each node group
     * (shard) using this parameter because you must specify the slots for each
     * node group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeGroupConfiguration <p>
     *            A list of node group (shard) configuration options. Each node
     *            group (shard) configuration has the following members:
     *            <code>PrimaryAvailabilityZone</code>,
     *            <code>ReplicaAvailabilityZones</code>,
     *            <code>ReplicaCount</code>, and <code>Slots</code>.
     *            </p>
     *            <p>
     *            If you're creating a Redis (cluster mode disabled) or a Redis
     *            (cluster mode enabled) replication group, you can use this
     *            parameter to individually configure each node group (shard),
     *            or you can omit this parameter. However, it is required when
     *            seeding a Redis (cluster mode enabled) cluster from a S3 rdb
     *            file. You must configure each node group (shard) using this
     *            parameter because you must specify the slots for each node
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withNodeGroupConfiguration(
            java.util.Collection<NodeGroupConfiguration> nodeGroupConfiguration) {
        setNodeGroupConfiguration(nodeGroupConfiguration);
        return this;
    }

    /**
     * <p>
     * The compute and memory capacity of the nodes in the node group (shard).
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
     *         The compute and memory capacity of the nodes in the node group
     *         (shard).
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
     * The compute and memory capacity of the nodes in the node group (shard).
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
     *            The compute and memory capacity of the nodes in the node group
     *            (shard).
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
     * The compute and memory capacity of the nodes in the node group (shard).
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
     *            The compute and memory capacity of the nodes in the node group
     *            (shard).
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
    public CreateReplicationGroupRequest withCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
        return this;
    }

    /**
     * <p>
     * The name of the cache engine to be used for the clusters in this
     * replication group.
     * </p>
     *
     * @return <p>
     *         The name of the cache engine to be used for the clusters in this
     *         replication group.
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The name of the cache engine to be used for the clusters in this
     * replication group.
     * </p>
     *
     * @param engine <p>
     *            The name of the cache engine to be used for the clusters in
     *            this replication group.
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the cache engine to be used for the clusters in this
     * replication group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            The name of the cache engine to be used for the clusters in
     *            this replication group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * The version number of the cache engine to be used for the clusters in
     * this replication group. To view the supported cache engine versions, use
     * the <code>DescribeCacheEngineVersions</code> operation.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     * >Selecting a Cache Engine and Version</a>) in the <i>ElastiCache User
     * Guide</i>, but you cannot downgrade to an earlier engine version. If you
     * want to use an earlier engine version, you must delete the existing
     * cluster or replication group and create it anew with the earlier engine
     * version.
     * </p>
     *
     * @return <p>
     *         The version number of the cache engine to be used for the
     *         clusters in this replication group. To view the supported cache
     *         engine versions, use the <code>DescribeCacheEngineVersions</code>
     *         operation.
     *         </p>
     *         <p>
     *         <b>Important:</b> You can upgrade to a newer engine version (see
     *         <a href=
     *         "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     *         >Selecting a Cache Engine and Version</a>) in the <i>ElastiCache
     *         User Guide</i>, but you cannot downgrade to an earlier engine
     *         version. If you want to use an earlier engine version, you must
     *         delete the existing cluster or replication group and create it
     *         anew with the earlier engine version.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The version number of the cache engine to be used for the clusters in
     * this replication group. To view the supported cache engine versions, use
     * the <code>DescribeCacheEngineVersions</code> operation.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     * >Selecting a Cache Engine and Version</a>) in the <i>ElastiCache User
     * Guide</i>, but you cannot downgrade to an earlier engine version. If you
     * want to use an earlier engine version, you must delete the existing
     * cluster or replication group and create it anew with the earlier engine
     * version.
     * </p>
     *
     * @param engineVersion <p>
     *            The version number of the cache engine to be used for the
     *            clusters in this replication group. To view the supported
     *            cache engine versions, use the
     *            <code>DescribeCacheEngineVersions</code> operation.
     *            </p>
     *            <p>
     *            <b>Important:</b> You can upgrade to a newer engine version
     *            (see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     *            >Selecting a Cache Engine and Version</a>) in the
     *            <i>ElastiCache User Guide</i>, but you cannot downgrade to an
     *            earlier engine version. If you want to use an earlier engine
     *            version, you must delete the existing cluster or replication
     *            group and create it anew with the earlier engine version.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the cache engine to be used for the clusters in
     * this replication group. To view the supported cache engine versions, use
     * the <code>DescribeCacheEngineVersions</code> operation.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     * >Selecting a Cache Engine and Version</a>) in the <i>ElastiCache User
     * Guide</i>, but you cannot downgrade to an earlier engine version. If you
     * want to use an earlier engine version, you must delete the existing
     * cluster or replication group and create it anew with the earlier engine
     * version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The version number of the cache engine to be used for the
     *            clusters in this replication group. To view the supported
     *            cache engine versions, use the
     *            <code>DescribeCacheEngineVersions</code> operation.
     *            </p>
     *            <p>
     *            <b>Important:</b> You can upgrade to a newer engine version
     *            (see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     *            >Selecting a Cache Engine and Version</a>) in the
     *            <i>ElastiCache User Guide</i>, but you cannot downgrade to an
     *            earlier engine version. If you want to use an earlier engine
     *            version, you must delete the existing cluster or replication
     *            group and create it anew with the earlier engine version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * The name of the parameter group to associate with this replication group.
     * If this argument is omitted, the default cache parameter group for the
     * specified engine is used.
     * </p>
     * <note>
     * <p>
     * If you are restoring to an engine version that is different than the
     * original, you must specify the default version of that version. For
     * example, <code>CacheParameterGroupName=default.redis4.0</code>.
     * </p>
     * </note>
     * <p>
     * If you are running Redis version 3.2.4 or later, only one node group
     * (shard), and want to use a default parameter group, we recommend that you
     * specify the parameter group by name.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create a Redis (cluster mode disabled) replication group, use
     * <code>CacheParameterGroupName=default.redis3.2</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a Redis (cluster mode enabled) replication group, use
     * <code>CacheParameterGroupName=default.redis3.2.cluster.on</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name of the parameter group to associate with this
     *         replication group. If this argument is omitted, the default cache
     *         parameter group for the specified engine is used.
     *         </p>
     *         <note>
     *         <p>
     *         If you are restoring to an engine version that is different than
     *         the original, you must specify the default version of that
     *         version. For example,
     *         <code>CacheParameterGroupName=default.redis4.0</code>.
     *         </p>
     *         </note>
     *         <p>
     *         If you are running Redis version 3.2.4 or later, only one node
     *         group (shard), and want to use a default parameter group, we
     *         recommend that you specify the parameter group by name.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To create a Redis (cluster mode disabled) replication group, use
     *         <code>CacheParameterGroupName=default.redis3.2</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To create a Redis (cluster mode enabled) replication group, use
     *         <code>CacheParameterGroupName=default.redis3.2.cluster.on</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group to associate with this replication group.
     * If this argument is omitted, the default cache parameter group for the
     * specified engine is used.
     * </p>
     * <note>
     * <p>
     * If you are restoring to an engine version that is different than the
     * original, you must specify the default version of that version. For
     * example, <code>CacheParameterGroupName=default.redis4.0</code>.
     * </p>
     * </note>
     * <p>
     * If you are running Redis version 3.2.4 or later, only one node group
     * (shard), and want to use a default parameter group, we recommend that you
     * specify the parameter group by name.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create a Redis (cluster mode disabled) replication group, use
     * <code>CacheParameterGroupName=default.redis3.2</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a Redis (cluster mode enabled) replication group, use
     * <code>CacheParameterGroupName=default.redis3.2.cluster.on</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @param cacheParameterGroupName <p>
     *            The name of the parameter group to associate with this
     *            replication group. If this argument is omitted, the default
     *            cache parameter group for the specified engine is used.
     *            </p>
     *            <note>
     *            <p>
     *            If you are restoring to an engine version that is different
     *            than the original, you must specify the default version of
     *            that version. For example,
     *            <code>CacheParameterGroupName=default.redis4.0</code>.
     *            </p>
     *            </note>
     *            <p>
     *            If you are running Redis version 3.2.4 or later, only one node
     *            group (shard), and want to use a default parameter group, we
     *            recommend that you specify the parameter group by name.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            To create a Redis (cluster mode disabled) replication group,
     *            use <code>CacheParameterGroupName=default.redis3.2</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To create a Redis (cluster mode enabled) replication group,
     *            use
     *            <code>CacheParameterGroupName=default.redis3.2.cluster.on</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group to associate with this replication group.
     * If this argument is omitted, the default cache parameter group for the
     * specified engine is used.
     * </p>
     * <note>
     * <p>
     * If you are restoring to an engine version that is different than the
     * original, you must specify the default version of that version. For
     * example, <code>CacheParameterGroupName=default.redis4.0</code>.
     * </p>
     * </note>
     * <p>
     * If you are running Redis version 3.2.4 or later, only one node group
     * (shard), and want to use a default parameter group, we recommend that you
     * specify the parameter group by name.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create a Redis (cluster mode disabled) replication group, use
     * <code>CacheParameterGroupName=default.redis3.2</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a Redis (cluster mode enabled) replication group, use
     * <code>CacheParameterGroupName=default.redis3.2.cluster.on</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheParameterGroupName <p>
     *            The name of the parameter group to associate with this
     *            replication group. If this argument is omitted, the default
     *            cache parameter group for the specified engine is used.
     *            </p>
     *            <note>
     *            <p>
     *            If you are restoring to an engine version that is different
     *            than the original, you must specify the default version of
     *            that version. For example,
     *            <code>CacheParameterGroupName=default.redis4.0</code>.
     *            </p>
     *            </note>
     *            <p>
     *            If you are running Redis version 3.2.4 or later, only one node
     *            group (shard), and want to use a default parameter group, we
     *            recommend that you specify the parameter group by name.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            To create a Redis (cluster mode disabled) replication group,
     *            use <code>CacheParameterGroupName=default.redis3.2</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To create a Redis (cluster mode enabled) replication group,
     *            use
     *            <code>CacheParameterGroupName=default.redis3.2.cluster.on</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }

    /**
     * <p>
     * The name of the cache subnet group to be used for the replication group.
     * </p>
     * <important>
     * <p>
     * If you're going to launch your cluster in an Amazon VPC, you need to
     * create a subnet group before you start creating a cluster. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SubnetGroups.html"
     * >Subnets and Subnet Groups</a>.
     * </p>
     * </important>
     *
     * @return <p>
     *         The name of the cache subnet group to be used for the replication
     *         group.
     *         </p>
     *         <important>
     *         <p>
     *         If you're going to launch your cluster in an Amazon VPC, you need
     *         to create a subnet group before you start creating a cluster. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SubnetGroups.html"
     *         >Subnets and Subnet Groups</a>.
     *         </p>
     *         </important>
     */
    public String getCacheSubnetGroupName() {
        return cacheSubnetGroupName;
    }

    /**
     * <p>
     * The name of the cache subnet group to be used for the replication group.
     * </p>
     * <important>
     * <p>
     * If you're going to launch your cluster in an Amazon VPC, you need to
     * create a subnet group before you start creating a cluster. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SubnetGroups.html"
     * >Subnets and Subnet Groups</a>.
     * </p>
     * </important>
     *
     * @param cacheSubnetGroupName <p>
     *            The name of the cache subnet group to be used for the
     *            replication group.
     *            </p>
     *            <important>
     *            <p>
     *            If you're going to launch your cluster in an Amazon VPC, you
     *            need to create a subnet group before you start creating a
     *            cluster. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SubnetGroups.html"
     *            >Subnets and Subnet Groups</a>.
     *            </p>
     *            </important>
     */
    public void setCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }

    /**
     * <p>
     * The name of the cache subnet group to be used for the replication group.
     * </p>
     * <important>
     * <p>
     * If you're going to launch your cluster in an Amazon VPC, you need to
     * create a subnet group before you start creating a cluster. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SubnetGroups.html"
     * >Subnets and Subnet Groups</a>.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheSubnetGroupName <p>
     *            The name of the cache subnet group to be used for the
     *            replication group.
     *            </p>
     *            <important>
     *            <p>
     *            If you're going to launch your cluster in an Amazon VPC, you
     *            need to create a subnet group before you start creating a
     *            cluster. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SubnetGroups.html"
     *            >Subnets and Subnet Groups</a>.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
        return this;
    }

    /**
     * <p>
     * A list of cache security group names to associate with this replication
     * group.
     * </p>
     *
     * @return <p>
     *         A list of cache security group names to associate with this
     *         replication group.
     *         </p>
     */
    public java.util.List<String> getCacheSecurityGroupNames() {
        return cacheSecurityGroupNames;
    }

    /**
     * <p>
     * A list of cache security group names to associate with this replication
     * group.
     * </p>
     *
     * @param cacheSecurityGroupNames <p>
     *            A list of cache security group names to associate with this
     *            replication group.
     *            </p>
     */
    public void setCacheSecurityGroupNames(java.util.Collection<String> cacheSecurityGroupNames) {
        if (cacheSecurityGroupNames == null) {
            this.cacheSecurityGroupNames = null;
            return;
        }

        this.cacheSecurityGroupNames = new java.util.ArrayList<String>(cacheSecurityGroupNames);
    }

    /**
     * <p>
     * A list of cache security group names to associate with this replication
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheSecurityGroupNames <p>
     *            A list of cache security group names to associate with this
     *            replication group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withCacheSecurityGroupNames(
            String... cacheSecurityGroupNames) {
        if (getCacheSecurityGroupNames() == null) {
            this.cacheSecurityGroupNames = new java.util.ArrayList<String>(
                    cacheSecurityGroupNames.length);
        }
        for (String value : cacheSecurityGroupNames) {
            this.cacheSecurityGroupNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of cache security group names to associate with this replication
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheSecurityGroupNames <p>
     *            A list of cache security group names to associate with this
     *            replication group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withCacheSecurityGroupNames(
            java.util.Collection<String> cacheSecurityGroupNames) {
        setCacheSecurityGroupNames(cacheSecurityGroupNames);
        return this;
    }

    /**
     * <p>
     * One or more Amazon VPC security groups associated with this replication
     * group.
     * </p>
     * <p>
     * Use this parameter only when you are creating a replication group in an
     * Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     *
     * @return <p>
     *         One or more Amazon VPC security groups associated with this
     *         replication group.
     *         </p>
     *         <p>
     *         Use this parameter only when you are creating a replication group
     *         in an Amazon Virtual Private Cloud (Amazon VPC).
     *         </p>
     */
    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * One or more Amazon VPC security groups associated with this replication
     * group.
     * </p>
     * <p>
     * Use this parameter only when you are creating a replication group in an
     * Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     *
     * @param securityGroupIds <p>
     *            One or more Amazon VPC security groups associated with this
     *            replication group.
     *            </p>
     *            <p>
     *            Use this parameter only when you are creating a replication
     *            group in an Amazon Virtual Private Cloud (Amazon VPC).
     *            </p>
     */
    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * One or more Amazon VPC security groups associated with this replication
     * group.
     * </p>
     * <p>
     * Use this parameter only when you are creating a replication group in an
     * Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            One or more Amazon VPC security groups associated with this
     *            replication group.
     *            </p>
     *            <p>
     *            Use this parameter only when you are creating a replication
     *            group in an Amazon Virtual Private Cloud (Amazon VPC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withSecurityGroupIds(String... securityGroupIds) {
        if (getSecurityGroupIds() == null) {
            this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds.length);
        }
        for (String value : securityGroupIds) {
            this.securityGroupIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more Amazon VPC security groups associated with this replication
     * group.
     * </p>
     * <p>
     * Use this parameter only when you are creating a replication group in an
     * Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            One or more Amazon VPC security groups associated with this
     *            replication group.
     *            </p>
     *            <p>
     *            Use this parameter only when you are creating a replication
     *            group in an Amazon Virtual Private Cloud (Amazon VPC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withSecurityGroupIds(
            java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * A list of cost allocation tags to be added to this resource. Tags are
     * comma-separated key,value pairs (e.g. Key=<code>myKey</code>, Value=
     * <code>myKeyValue</code>. You can include multiple tags as shown
     * following: Key=<code>myKey</code>, Value=<code>myKeyValue</code> Key=
     * <code>mySecondKey</code>, Value=<code>mySecondKeyValue</code>.
     * </p>
     *
     * @return <p>
     *         A list of cost allocation tags to be added to this resource. Tags
     *         are comma-separated key,value pairs (e.g. Key=<code>myKey</code>,
     *         Value=<code>myKeyValue</code>. You can include multiple tags as
     *         shown following: Key=<code>myKey</code>, Value=
     *         <code>myKeyValue</code> Key=<code>mySecondKey</code>, Value=
     *         <code>mySecondKeyValue</code>.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of cost allocation tags to be added to this resource. Tags are
     * comma-separated key,value pairs (e.g. Key=<code>myKey</code>, Value=
     * <code>myKeyValue</code>. You can include multiple tags as shown
     * following: Key=<code>myKey</code>, Value=<code>myKeyValue</code> Key=
     * <code>mySecondKey</code>, Value=<code>mySecondKeyValue</code>.
     * </p>
     *
     * @param tags <p>
     *            A list of cost allocation tags to be added to this resource.
     *            Tags are comma-separated key,value pairs (e.g. Key=
     *            <code>myKey</code>, Value=<code>myKeyValue</code>. You can
     *            include multiple tags as shown following: Key=
     *            <code>myKey</code>, Value=<code>myKeyValue</code> Key=
     *            <code>mySecondKey</code>, Value=<code>mySecondKeyValue</code>.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of cost allocation tags to be added to this resource. Tags are
     * comma-separated key,value pairs (e.g. Key=<code>myKey</code>, Value=
     * <code>myKeyValue</code>. You can include multiple tags as shown
     * following: Key=<code>myKey</code>, Value=<code>myKeyValue</code> Key=
     * <code>mySecondKey</code>, Value=<code>mySecondKeyValue</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of cost allocation tags to be added to this resource.
     *            Tags are comma-separated key,value pairs (e.g. Key=
     *            <code>myKey</code>, Value=<code>myKeyValue</code>. You can
     *            include multiple tags as shown following: Key=
     *            <code>myKey</code>, Value=<code>myKeyValue</code> Key=
     *            <code>mySecondKey</code>, Value=<code>mySecondKeyValue</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of cost allocation tags to be added to this resource. Tags are
     * comma-separated key,value pairs (e.g. Key=<code>myKey</code>, Value=
     * <code>myKeyValue</code>. You can include multiple tags as shown
     * following: Key=<code>myKey</code>, Value=<code>myKeyValue</code> Key=
     * <code>mySecondKey</code>, Value=<code>mySecondKeyValue</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of cost allocation tags to be added to this resource.
     *            Tags are comma-separated key,value pairs (e.g. Key=
     *            <code>myKey</code>, Value=<code>myKeyValue</code>. You can
     *            include multiple tags as shown following: Key=
     *            <code>myKey</code>, Value=<code>myKeyValue</code> Key=
     *            <code>mySecondKey</code>, Value=<code>mySecondKeyValue</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARN) that uniquely identify the Redis
     * RDB snapshot files stored in Amazon S3. The snapshot files are used to
     * populate the new replication group. The Amazon S3 object name in the ARN
     * cannot contain any commas. The new replication group will have the number
     * of node groups (console: shards) specified by the parameter
     * <i>NumNodeGroups</i> or the number of node groups configured by
     * <i>NodeGroupConfiguration</i> regardless of the number of ARNs specified
     * here.
     * </p>
     * <p>
     * Example of an Amazon S3 ARN:
     * <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     * </p>
     *
     * @return <p>
     *         A list of Amazon Resource Names (ARN) that uniquely identify the
     *         Redis RDB snapshot files stored in Amazon S3. The snapshot files
     *         are used to populate the new replication group. The Amazon S3
     *         object name in the ARN cannot contain any commas. The new
     *         replication group will have the number of node groups (console:
     *         shards) specified by the parameter <i>NumNodeGroups</i> or the
     *         number of node groups configured by <i>NodeGroupConfiguration</i>
     *         regardless of the number of ARNs specified here.
     *         </p>
     *         <p>
     *         Example of an Amazon S3 ARN:
     *         <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     *         </p>
     */
    public java.util.List<String> getSnapshotArns() {
        return snapshotArns;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARN) that uniquely identify the Redis
     * RDB snapshot files stored in Amazon S3. The snapshot files are used to
     * populate the new replication group. The Amazon S3 object name in the ARN
     * cannot contain any commas. The new replication group will have the number
     * of node groups (console: shards) specified by the parameter
     * <i>NumNodeGroups</i> or the number of node groups configured by
     * <i>NodeGroupConfiguration</i> regardless of the number of ARNs specified
     * here.
     * </p>
     * <p>
     * Example of an Amazon S3 ARN:
     * <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     * </p>
     *
     * @param snapshotArns <p>
     *            A list of Amazon Resource Names (ARN) that uniquely identify
     *            the Redis RDB snapshot files stored in Amazon S3. The snapshot
     *            files are used to populate the new replication group. The
     *            Amazon S3 object name in the ARN cannot contain any commas.
     *            The new replication group will have the number of node groups
     *            (console: shards) specified by the parameter
     *            <i>NumNodeGroups</i> or the number of node groups configured
     *            by <i>NodeGroupConfiguration</i> regardless of the number of
     *            ARNs specified here.
     *            </p>
     *            <p>
     *            Example of an Amazon S3 ARN:
     *            <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     *            </p>
     */
    public void setSnapshotArns(java.util.Collection<String> snapshotArns) {
        if (snapshotArns == null) {
            this.snapshotArns = null;
            return;
        }

        this.snapshotArns = new java.util.ArrayList<String>(snapshotArns);
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARN) that uniquely identify the Redis
     * RDB snapshot files stored in Amazon S3. The snapshot files are used to
     * populate the new replication group. The Amazon S3 object name in the ARN
     * cannot contain any commas. The new replication group will have the number
     * of node groups (console: shards) specified by the parameter
     * <i>NumNodeGroups</i> or the number of node groups configured by
     * <i>NodeGroupConfiguration</i> regardless of the number of ARNs specified
     * here.
     * </p>
     * <p>
     * Example of an Amazon S3 ARN:
     * <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotArns <p>
     *            A list of Amazon Resource Names (ARN) that uniquely identify
     *            the Redis RDB snapshot files stored in Amazon S3. The snapshot
     *            files are used to populate the new replication group. The
     *            Amazon S3 object name in the ARN cannot contain any commas.
     *            The new replication group will have the number of node groups
     *            (console: shards) specified by the parameter
     *            <i>NumNodeGroups</i> or the number of node groups configured
     *            by <i>NodeGroupConfiguration</i> regardless of the number of
     *            ARNs specified here.
     *            </p>
     *            <p>
     *            Example of an Amazon S3 ARN:
     *            <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withSnapshotArns(String... snapshotArns) {
        if (getSnapshotArns() == null) {
            this.snapshotArns = new java.util.ArrayList<String>(snapshotArns.length);
        }
        for (String value : snapshotArns) {
            this.snapshotArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARN) that uniquely identify the Redis
     * RDB snapshot files stored in Amazon S3. The snapshot files are used to
     * populate the new replication group. The Amazon S3 object name in the ARN
     * cannot contain any commas. The new replication group will have the number
     * of node groups (console: shards) specified by the parameter
     * <i>NumNodeGroups</i> or the number of node groups configured by
     * <i>NodeGroupConfiguration</i> regardless of the number of ARNs specified
     * here.
     * </p>
     * <p>
     * Example of an Amazon S3 ARN:
     * <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotArns <p>
     *            A list of Amazon Resource Names (ARN) that uniquely identify
     *            the Redis RDB snapshot files stored in Amazon S3. The snapshot
     *            files are used to populate the new replication group. The
     *            Amazon S3 object name in the ARN cannot contain any commas.
     *            The new replication group will have the number of node groups
     *            (console: shards) specified by the parameter
     *            <i>NumNodeGroups</i> or the number of node groups configured
     *            by <i>NodeGroupConfiguration</i> regardless of the number of
     *            ARNs specified here.
     *            </p>
     *            <p>
     *            Example of an Amazon S3 ARN:
     *            <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withSnapshotArns(java.util.Collection<String> snapshotArns) {
        setSnapshotArns(snapshotArns);
        return this;
    }

    /**
     * <p>
     * The name of a snapshot from which to restore data into the new
     * replication group. The snapshot status changes to <code>restoring</code>
     * while the new replication group is being created.
     * </p>
     *
     * @return <p>
     *         The name of a snapshot from which to restore data into the new
     *         replication group. The snapshot status changes to
     *         <code>restoring</code> while the new replication group is being
     *         created.
     *         </p>
     */
    public String getSnapshotName() {
        return snapshotName;
    }

    /**
     * <p>
     * The name of a snapshot from which to restore data into the new
     * replication group. The snapshot status changes to <code>restoring</code>
     * while the new replication group is being created.
     * </p>
     *
     * @param snapshotName <p>
     *            The name of a snapshot from which to restore data into the new
     *            replication group. The snapshot status changes to
     *            <code>restoring</code> while the new replication group is
     *            being created.
     *            </p>
     */
    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * The name of a snapshot from which to restore data into the new
     * replication group. The snapshot status changes to <code>restoring</code>
     * while the new replication group is being created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotName <p>
     *            The name of a snapshot from which to restore data into the new
     *            replication group. The snapshot status changes to
     *            <code>restoring</code> while the new replication group is
     *            being created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cluster
     * is performed. It is specified as a range in the format
     * ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window
     * is a 60 minute period. Valid values for <code>ddd</code> are:
     * </p>
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
     *         window is a 60 minute period. Valid values for <code>ddd</code>
     *         are:
     *         </p>
     *         <p>
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
     * is a 60 minute period. Valid values for <code>ddd</code> are:
     * </p>
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
     *            maintenance window is a 60 minute period. Valid values for
     *            <code>ddd</code> are:
     *            </p>
     *            <p>
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
     * is a 60 minute period. Valid values for <code>ddd</code> are:
     * </p>
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
     *            maintenance window is a 60 minute period. Valid values for
     *            <code>ddd</code> are:
     *            </p>
     *            <p>
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
    public CreateReplicationGroupRequest withPreferredMaintenanceWindow(
            String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * <p>
     * The port number on which each member of the replication group accepts
     * connections.
     * </p>
     *
     * @return <p>
     *         The port number on which each member of the replication group
     *         accepts connections.
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * The port number on which each member of the replication group accepts
     * connections.
     * </p>
     *
     * @param port <p>
     *            The port number on which each member of the replication group
     *            accepts connections.
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which each member of the replication group accepts
     * connections.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            The port number on which each member of the replication group
     *            accepts connections.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service
     * (SNS) topic to which notifications are sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be the same as the cluster owner.
     * </p>
     * </note>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *         Service (SNS) topic to which notifications are sent.
     *         </p>
     *         <note>
     *         <p>
     *         The Amazon SNS topic owner must be the same as the cluster owner.
     *         </p>
     *         </note>
     */
    public String getNotificationTopicArn() {
        return notificationTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service
     * (SNS) topic to which notifications are sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be the same as the cluster owner.
     * </p>
     * </note>
     *
     * @param notificationTopicArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon Simple
     *            Notification Service (SNS) topic to which notifications are
     *            sent.
     *            </p>
     *            <note>
     *            <p>
     *            The Amazon SNS topic owner must be the same as the cluster
     *            owner.
     *            </p>
     *            </note>
     */
    public void setNotificationTopicArn(String notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service
     * (SNS) topic to which notifications are sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be the same as the cluster owner.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationTopicArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon Simple
     *            Notification Service (SNS) topic to which notifications are
     *            sent.
     *            </p>
     *            <note>
     *            <p>
     *            The Amazon SNS topic owner must be the same as the cluster
     *            owner.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withNotificationTopicArn(String notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
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
    public CreateReplicationGroupRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic snapshots
     * before deleting them. For example, if you set
     * <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today
     * is retained for 5 days before being deleted.
     * </p>
     * <p>
     * Default: 0 (i.e., automatic backups are disabled for this cluster).
     * </p>
     *
     * @return <p>
     *         The number of days for which ElastiCache retains automatic
     *         snapshots before deleting them. For example, if you set
     *         <code>SnapshotRetentionLimit</code> to 5, a snapshot that was
     *         taken today is retained for 5 days before being deleted.
     *         </p>
     *         <p>
     *         Default: 0 (i.e., automatic backups are disabled for this
     *         cluster).
     *         </p>
     */
    public Integer getSnapshotRetentionLimit() {
        return snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic snapshots
     * before deleting them. For example, if you set
     * <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today
     * is retained for 5 days before being deleted.
     * </p>
     * <p>
     * Default: 0 (i.e., automatic backups are disabled for this cluster).
     * </p>
     *
     * @param snapshotRetentionLimit <p>
     *            The number of days for which ElastiCache retains automatic
     *            snapshots before deleting them. For example, if you set
     *            <code>SnapshotRetentionLimit</code> to 5, a snapshot that was
     *            taken today is retained for 5 days before being deleted.
     *            </p>
     *            <p>
     *            Default: 0 (i.e., automatic backups are disabled for this
     *            cluster).
     *            </p>
     */
    public void setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic snapshots
     * before deleting them. For example, if you set
     * <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today
     * is retained for 5 days before being deleted.
     * </p>
     * <p>
     * Default: 0 (i.e., automatic backups are disabled for this cluster).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotRetentionLimit <p>
     *            The number of days for which ElastiCache retains automatic
     *            snapshots before deleting them. For example, if you set
     *            <code>SnapshotRetentionLimit</code> to 5, a snapshot that was
     *            taken today is retained for 5 days before being deleted.
     *            </p>
     *            <p>
     *            Default: 0 (i.e., automatic backups are disabled for this
     *            cluster).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
        return this;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a
     * daily snapshot of your node group (shard).
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * If you do not specify this parameter, ElastiCache automatically chooses
     * an appropriate time range.
     * </p>
     *
     * @return <p>
     *         The daily time range (in UTC) during which ElastiCache begins
     *         taking a daily snapshot of your node group (shard).
     *         </p>
     *         <p>
     *         Example: <code>05:00-09:00</code>
     *         </p>
     *         <p>
     *         If you do not specify this parameter, ElastiCache automatically
     *         chooses an appropriate time range.
     *         </p>
     */
    public String getSnapshotWindow() {
        return snapshotWindow;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a
     * daily snapshot of your node group (shard).
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * If you do not specify this parameter, ElastiCache automatically chooses
     * an appropriate time range.
     * </p>
     *
     * @param snapshotWindow <p>
     *            The daily time range (in UTC) during which ElastiCache begins
     *            taking a daily snapshot of your node group (shard).
     *            </p>
     *            <p>
     *            Example: <code>05:00-09:00</code>
     *            </p>
     *            <p>
     *            If you do not specify this parameter, ElastiCache
     *            automatically chooses an appropriate time range.
     *            </p>
     */
    public void setSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a
     * daily snapshot of your node group (shard).
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * If you do not specify this parameter, ElastiCache automatically chooses
     * an appropriate time range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotWindow <p>
     *            The daily time range (in UTC) during which ElastiCache begins
     *            taking a daily snapshot of your node group (shard).
     *            </p>
     *            <p>
     *            Example: <code>05:00-09:00</code>
     *            </p>
     *            <p>
     *            If you do not specify this parameter, ElastiCache
     *            automatically chooses an appropriate time range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
        return this;
    }

    /**
     * <p>
     * <b>Reserved parameter.</b> The password used to access a password
     * protected server.
     * </p>
     * <p>
     * <code>AuthToken</code> can be specified only on replication groups where
     * <code>TransitEncryptionEnabled</code> is <code>true</code>.
     * </p>
     * <important>
     * <p>
     * For HIPAA compliance, you must specify
     * <code>TransitEncryptionEnabled</code> as <code>true</code>, an
     * <code>AuthToken</code>, and a <code>CacheSubnetGroup</code>.
     * </p>
     * </important>
     * <p>
     * Password constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be only printable ASCII characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 16 characters and no more than 128 characters in length.
     * </p>
     * </li>
     * <li>
     * <p>
     * The only permitted printable special characters are !, &amp;, #, $, ^,
     * &lt;, &gt;, and -. Other printable special characters cannot be used in
     * the AUTH token.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="http://redis.io/commands/AUTH">AUTH
     * password</a> at http://redis.io/commands/AUTH.
     * </p>
     *
     * @return <p>
     *         <b>Reserved parameter.</b> The password used to access a password
     *         protected server.
     *         </p>
     *         <p>
     *         <code>AuthToken</code> can be specified only on replication
     *         groups where <code>TransitEncryptionEnabled</code> is
     *         <code>true</code>.
     *         </p>
     *         <important>
     *         <p>
     *         For HIPAA compliance, you must specify
     *         <code>TransitEncryptionEnabled</code> as <code>true</code>, an
     *         <code>AuthToken</code>, and a <code>CacheSubnetGroup</code>.
     *         </p>
     *         </important>
     *         <p>
     *         Password constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be only printable ASCII characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be at least 16 characters and no more than 128 characters in
     *         length.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The only permitted printable special characters are !, &amp;, #,
     *         $, ^, &lt;, &gt;, and -. Other printable special characters
     *         cannot be used in the AUTH token.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="http://redis.io/commands/AUTH">AUTH password</a> at
     *         http://redis.io/commands/AUTH.
     *         </p>
     */
    public String getAuthToken() {
        return authToken;
    }

    /**
     * <p>
     * <b>Reserved parameter.</b> The password used to access a password
     * protected server.
     * </p>
     * <p>
     * <code>AuthToken</code> can be specified only on replication groups where
     * <code>TransitEncryptionEnabled</code> is <code>true</code>.
     * </p>
     * <important>
     * <p>
     * For HIPAA compliance, you must specify
     * <code>TransitEncryptionEnabled</code> as <code>true</code>, an
     * <code>AuthToken</code>, and a <code>CacheSubnetGroup</code>.
     * </p>
     * </important>
     * <p>
     * Password constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be only printable ASCII characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 16 characters and no more than 128 characters in length.
     * </p>
     * </li>
     * <li>
     * <p>
     * The only permitted printable special characters are !, &amp;, #, $, ^,
     * &lt;, &gt;, and -. Other printable special characters cannot be used in
     * the AUTH token.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="http://redis.io/commands/AUTH">AUTH
     * password</a> at http://redis.io/commands/AUTH.
     * </p>
     *
     * @param authToken <p>
     *            <b>Reserved parameter.</b> The password used to access a
     *            password protected server.
     *            </p>
     *            <p>
     *            <code>AuthToken</code> can be specified only on replication
     *            groups where <code>TransitEncryptionEnabled</code> is
     *            <code>true</code>.
     *            </p>
     *            <important>
     *            <p>
     *            For HIPAA compliance, you must specify
     *            <code>TransitEncryptionEnabled</code> as <code>true</code>, an
     *            <code>AuthToken</code>, and a <code>CacheSubnetGroup</code>.
     *            </p>
     *            </important>
     *            <p>
     *            Password constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be only printable ASCII characters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be at least 16 characters and no more than 128 characters
     *            in length.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The only permitted printable special characters are !, &amp;,
     *            #, $, ^, &lt;, &gt;, and -. Other printable special characters
     *            cannot be used in the AUTH token.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a
     *            href="http://redis.io/commands/AUTH">AUTH password</a> at
     *            http://redis.io/commands/AUTH.
     *            </p>
     */
    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    /**
     * <p>
     * <b>Reserved parameter.</b> The password used to access a password
     * protected server.
     * </p>
     * <p>
     * <code>AuthToken</code> can be specified only on replication groups where
     * <code>TransitEncryptionEnabled</code> is <code>true</code>.
     * </p>
     * <important>
     * <p>
     * For HIPAA compliance, you must specify
     * <code>TransitEncryptionEnabled</code> as <code>true</code>, an
     * <code>AuthToken</code>, and a <code>CacheSubnetGroup</code>.
     * </p>
     * </important>
     * <p>
     * Password constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be only printable ASCII characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 16 characters and no more than 128 characters in length.
     * </p>
     * </li>
     * <li>
     * <p>
     * The only permitted printable special characters are !, &amp;, #, $, ^,
     * &lt;, &gt;, and -. Other printable special characters cannot be used in
     * the AUTH token.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="http://redis.io/commands/AUTH">AUTH
     * password</a> at http://redis.io/commands/AUTH.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authToken <p>
     *            <b>Reserved parameter.</b> The password used to access a
     *            password protected server.
     *            </p>
     *            <p>
     *            <code>AuthToken</code> can be specified only on replication
     *            groups where <code>TransitEncryptionEnabled</code> is
     *            <code>true</code>.
     *            </p>
     *            <important>
     *            <p>
     *            For HIPAA compliance, you must specify
     *            <code>TransitEncryptionEnabled</code> as <code>true</code>, an
     *            <code>AuthToken</code>, and a <code>CacheSubnetGroup</code>.
     *            </p>
     *            </important>
     *            <p>
     *            Password constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be only printable ASCII characters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be at least 16 characters and no more than 128 characters
     *            in length.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The only permitted printable special characters are !, &amp;,
     *            #, $, ^, &lt;, &gt;, and -. Other printable special characters
     *            cannot be used in the AUTH token.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a
     *            href="http://redis.io/commands/AUTH">AUTH password</a> at
     *            http://redis.io/commands/AUTH.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }

    /**
     * <p>
     * A flag that enables in-transit encryption when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>TransitEncryptionEnabled</code>
     * after the cluster is created. To enable in-transit encryption on a
     * cluster you must set <code>TransitEncryptionEnabled</code> to
     * <code>true</code> when you create a cluster.
     * </p>
     * <p>
     * This parameter is valid only if the <code>Engine</code> parameter is
     * <code>redis</code>, the <code>EngineVersion</code> parameter is
     * <code>3.2.6</code>, <code>4.x</code> or later, and the cluster is being
     * created in an Amazon VPC.
     * </p>
     * <p>
     * If you enable in-transit encryption, you must also specify a value for
     * <code>CacheSubnetGroup</code>.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an
     * Amazon VPC using redis version <code>3.2.6</code>, <code>4.x</code> or
     * later.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <important>
     * <p>
     * For HIPAA compliance, you must specify
     * <code>TransitEncryptionEnabled</code> as <code>true</code>, an
     * <code>AuthToken</code>, and a <code>CacheSubnetGroup</code>.
     * </p>
     * </important>
     *
     * @return <p>
     *         A flag that enables in-transit encryption when set to
     *         <code>true</code>.
     *         </p>
     *         <p>
     *         You cannot modify the value of
     *         <code>TransitEncryptionEnabled</code> after the cluster is
     *         created. To enable in-transit encryption on a cluster you must
     *         set <code>TransitEncryptionEnabled</code> to <code>true</code>
     *         when you create a cluster.
     *         </p>
     *         <p>
     *         This parameter is valid only if the <code>Engine</code> parameter
     *         is <code>redis</code>, the <code>EngineVersion</code> parameter
     *         is <code>3.2.6</code>, <code>4.x</code> or later, and the cluster
     *         is being created in an Amazon VPC.
     *         </p>
     *         <p>
     *         If you enable in-transit encryption, you must also specify a
     *         value for <code>CacheSubnetGroup</code>.
     *         </p>
     *         <p>
     *         <b>Required:</b> Only available when creating a replication group
     *         in an Amazon VPC using redis version <code>3.2.6</code>,
     *         <code>4.x</code> or later.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     *         <important>
     *         <p>
     *         For HIPAA compliance, you must specify
     *         <code>TransitEncryptionEnabled</code> as <code>true</code>, an
     *         <code>AuthToken</code>, and a <code>CacheSubnetGroup</code>.
     *         </p>
     *         </important>
     */
    public Boolean isTransitEncryptionEnabled() {
        return transitEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables in-transit encryption when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>TransitEncryptionEnabled</code>
     * after the cluster is created. To enable in-transit encryption on a
     * cluster you must set <code>TransitEncryptionEnabled</code> to
     * <code>true</code> when you create a cluster.
     * </p>
     * <p>
     * This parameter is valid only if the <code>Engine</code> parameter is
     * <code>redis</code>, the <code>EngineVersion</code> parameter is
     * <code>3.2.6</code>, <code>4.x</code> or later, and the cluster is being
     * created in an Amazon VPC.
     * </p>
     * <p>
     * If you enable in-transit encryption, you must also specify a value for
     * <code>CacheSubnetGroup</code>.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an
     * Amazon VPC using redis version <code>3.2.6</code>, <code>4.x</code> or
     * later.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <important>
     * <p>
     * For HIPAA compliance, you must specify
     * <code>TransitEncryptionEnabled</code> as <code>true</code>, an
     * <code>AuthToken</code>, and a <code>CacheSubnetGroup</code>.
     * </p>
     * </important>
     *
     * @return <p>
     *         A flag that enables in-transit encryption when set to
     *         <code>true</code>.
     *         </p>
     *         <p>
     *         You cannot modify the value of
     *         <code>TransitEncryptionEnabled</code> after the cluster is
     *         created. To enable in-transit encryption on a cluster you must
     *         set <code>TransitEncryptionEnabled</code> to <code>true</code>
     *         when you create a cluster.
     *         </p>
     *         <p>
     *         This parameter is valid only if the <code>Engine</code> parameter
     *         is <code>redis</code>, the <code>EngineVersion</code> parameter
     *         is <code>3.2.6</code>, <code>4.x</code> or later, and the cluster
     *         is being created in an Amazon VPC.
     *         </p>
     *         <p>
     *         If you enable in-transit encryption, you must also specify a
     *         value for <code>CacheSubnetGroup</code>.
     *         </p>
     *         <p>
     *         <b>Required:</b> Only available when creating a replication group
     *         in an Amazon VPC using redis version <code>3.2.6</code>,
     *         <code>4.x</code> or later.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     *         <important>
     *         <p>
     *         For HIPAA compliance, you must specify
     *         <code>TransitEncryptionEnabled</code> as <code>true</code>, an
     *         <code>AuthToken</code>, and a <code>CacheSubnetGroup</code>.
     *         </p>
     *         </important>
     */
    public Boolean getTransitEncryptionEnabled() {
        return transitEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables in-transit encryption when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>TransitEncryptionEnabled</code>
     * after the cluster is created. To enable in-transit encryption on a
     * cluster you must set <code>TransitEncryptionEnabled</code> to
     * <code>true</code> when you create a cluster.
     * </p>
     * <p>
     * This parameter is valid only if the <code>Engine</code> parameter is
     * <code>redis</code>, the <code>EngineVersion</code> parameter is
     * <code>3.2.6</code>, <code>4.x</code> or later, and the cluster is being
     * created in an Amazon VPC.
     * </p>
     * <p>
     * If you enable in-transit encryption, you must also specify a value for
     * <code>CacheSubnetGroup</code>.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an
     * Amazon VPC using redis version <code>3.2.6</code>, <code>4.x</code> or
     * later.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <important>
     * <p>
     * For HIPAA compliance, you must specify
     * <code>TransitEncryptionEnabled</code> as <code>true</code>, an
     * <code>AuthToken</code>, and a <code>CacheSubnetGroup</code>.
     * </p>
     * </important>
     *
     * @param transitEncryptionEnabled <p>
     *            A flag that enables in-transit encryption when set to
     *            <code>true</code>.
     *            </p>
     *            <p>
     *            You cannot modify the value of
     *            <code>TransitEncryptionEnabled</code> after the cluster is
     *            created. To enable in-transit encryption on a cluster you must
     *            set <code>TransitEncryptionEnabled</code> to <code>true</code>
     *            when you create a cluster.
     *            </p>
     *            <p>
     *            This parameter is valid only if the <code>Engine</code>
     *            parameter is <code>redis</code>, the
     *            <code>EngineVersion</code> parameter is <code>3.2.6</code>,
     *            <code>4.x</code> or later, and the cluster is being created in
     *            an Amazon VPC.
     *            </p>
     *            <p>
     *            If you enable in-transit encryption, you must also specify a
     *            value for <code>CacheSubnetGroup</code>.
     *            </p>
     *            <p>
     *            <b>Required:</b> Only available when creating a replication
     *            group in an Amazon VPC using redis version <code>3.2.6</code>,
     *            <code>4.x</code> or later.
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     *            <important>
     *            <p>
     *            For HIPAA compliance, you must specify
     *            <code>TransitEncryptionEnabled</code> as <code>true</code>, an
     *            <code>AuthToken</code>, and a <code>CacheSubnetGroup</code>.
     *            </p>
     *            </important>
     */
    public void setTransitEncryptionEnabled(Boolean transitEncryptionEnabled) {
        this.transitEncryptionEnabled = transitEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables in-transit encryption when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>TransitEncryptionEnabled</code>
     * after the cluster is created. To enable in-transit encryption on a
     * cluster you must set <code>TransitEncryptionEnabled</code> to
     * <code>true</code> when you create a cluster.
     * </p>
     * <p>
     * This parameter is valid only if the <code>Engine</code> parameter is
     * <code>redis</code>, the <code>EngineVersion</code> parameter is
     * <code>3.2.6</code>, <code>4.x</code> or later, and the cluster is being
     * created in an Amazon VPC.
     * </p>
     * <p>
     * If you enable in-transit encryption, you must also specify a value for
     * <code>CacheSubnetGroup</code>.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an
     * Amazon VPC using redis version <code>3.2.6</code>, <code>4.x</code> or
     * later.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <important>
     * <p>
     * For HIPAA compliance, you must specify
     * <code>TransitEncryptionEnabled</code> as <code>true</code>, an
     * <code>AuthToken</code>, and a <code>CacheSubnetGroup</code>.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitEncryptionEnabled <p>
     *            A flag that enables in-transit encryption when set to
     *            <code>true</code>.
     *            </p>
     *            <p>
     *            You cannot modify the value of
     *            <code>TransitEncryptionEnabled</code> after the cluster is
     *            created. To enable in-transit encryption on a cluster you must
     *            set <code>TransitEncryptionEnabled</code> to <code>true</code>
     *            when you create a cluster.
     *            </p>
     *            <p>
     *            This parameter is valid only if the <code>Engine</code>
     *            parameter is <code>redis</code>, the
     *            <code>EngineVersion</code> parameter is <code>3.2.6</code>,
     *            <code>4.x</code> or later, and the cluster is being created in
     *            an Amazon VPC.
     *            </p>
     *            <p>
     *            If you enable in-transit encryption, you must also specify a
     *            value for <code>CacheSubnetGroup</code>.
     *            </p>
     *            <p>
     *            <b>Required:</b> Only available when creating a replication
     *            group in an Amazon VPC using redis version <code>3.2.6</code>,
     *            <code>4.x</code> or later.
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     *            <important>
     *            <p>
     *            For HIPAA compliance, you must specify
     *            <code>TransitEncryptionEnabled</code> as <code>true</code>, an
     *            <code>AuthToken</code>, and a <code>CacheSubnetGroup</code>.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withTransitEncryptionEnabled(
            Boolean transitEncryptionEnabled) {
        this.transitEncryptionEnabled = transitEncryptionEnabled;
        return this;
    }

    /**
     * <p>
     * A flag that enables encryption at rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after
     * the replication group is created. To enable encryption at rest on a
     * replication group you must set <code>AtRestEncryptionEnabled</code> to
     * <code>true</code> when you create the replication group.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an
     * Amazon VPC using redis version <code>3.2.6</code>, <code>4.x</code> or
     * later.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @return <p>
     *         A flag that enables encryption at rest when set to
     *         <code>true</code>.
     *         </p>
     *         <p>
     *         You cannot modify the value of
     *         <code>AtRestEncryptionEnabled</code> after the replication group
     *         is created. To enable encryption at rest on a replication group
     *         you must set <code>AtRestEncryptionEnabled</code> to
     *         <code>true</code> when you create the replication group.
     *         </p>
     *         <p>
     *         <b>Required:</b> Only available when creating a replication group
     *         in an Amazon VPC using redis version <code>3.2.6</code>,
     *         <code>4.x</code> or later.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     */
    public Boolean isAtRestEncryptionEnabled() {
        return atRestEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables encryption at rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after
     * the replication group is created. To enable encryption at rest on a
     * replication group you must set <code>AtRestEncryptionEnabled</code> to
     * <code>true</code> when you create the replication group.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an
     * Amazon VPC using redis version <code>3.2.6</code>, <code>4.x</code> or
     * later.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @return <p>
     *         A flag that enables encryption at rest when set to
     *         <code>true</code>.
     *         </p>
     *         <p>
     *         You cannot modify the value of
     *         <code>AtRestEncryptionEnabled</code> after the replication group
     *         is created. To enable encryption at rest on a replication group
     *         you must set <code>AtRestEncryptionEnabled</code> to
     *         <code>true</code> when you create the replication group.
     *         </p>
     *         <p>
     *         <b>Required:</b> Only available when creating a replication group
     *         in an Amazon VPC using redis version <code>3.2.6</code>,
     *         <code>4.x</code> or later.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     */
    public Boolean getAtRestEncryptionEnabled() {
        return atRestEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables encryption at rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after
     * the replication group is created. To enable encryption at rest on a
     * replication group you must set <code>AtRestEncryptionEnabled</code> to
     * <code>true</code> when you create the replication group.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an
     * Amazon VPC using redis version <code>3.2.6</code>, <code>4.x</code> or
     * later.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @param atRestEncryptionEnabled <p>
     *            A flag that enables encryption at rest when set to
     *            <code>true</code>.
     *            </p>
     *            <p>
     *            You cannot modify the value of
     *            <code>AtRestEncryptionEnabled</code> after the replication
     *            group is created. To enable encryption at rest on a
     *            replication group you must set
     *            <code>AtRestEncryptionEnabled</code> to <code>true</code> when
     *            you create the replication group.
     *            </p>
     *            <p>
     *            <b>Required:</b> Only available when creating a replication
     *            group in an Amazon VPC using redis version <code>3.2.6</code>,
     *            <code>4.x</code> or later.
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     */
    public void setAtRestEncryptionEnabled(Boolean atRestEncryptionEnabled) {
        this.atRestEncryptionEnabled = atRestEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables encryption at rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after
     * the replication group is created. To enable encryption at rest on a
     * replication group you must set <code>AtRestEncryptionEnabled</code> to
     * <code>true</code> when you create the replication group.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an
     * Amazon VPC using redis version <code>3.2.6</code>, <code>4.x</code> or
     * later.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param atRestEncryptionEnabled <p>
     *            A flag that enables encryption at rest when set to
     *            <code>true</code>.
     *            </p>
     *            <p>
     *            You cannot modify the value of
     *            <code>AtRestEncryptionEnabled</code> after the replication
     *            group is created. To enable encryption at rest on a
     *            replication group you must set
     *            <code>AtRestEncryptionEnabled</code> to <code>true</code> when
     *            you create the replication group.
     *            </p>
     *            <p>
     *            <b>Required:</b> Only available when creating a replication
     *            group in an Amazon VPC using redis version <code>3.2.6</code>,
     *            <code>4.x</code> or later.
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withAtRestEncryptionEnabled(Boolean atRestEncryptionEnabled) {
        this.atRestEncryptionEnabled = atRestEncryptionEnabled;
        return this;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the disk in the cluster.
     * </p>
     *
     * @return <p>
     *         The ID of the KMS key used to encrypt the disk in the cluster.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the disk in the cluster.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The ID of the KMS key used to encrypt the disk in the cluster.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the disk in the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The ID of the KMS key used to encrypt the disk in the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
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
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: " + getReplicationGroupId() + ",");
        if (getReplicationGroupDescription() != null)
            sb.append("ReplicationGroupDescription: " + getReplicationGroupDescription() + ",");
        if (getGlobalReplicationGroupId() != null)
            sb.append("GlobalReplicationGroupId: " + getGlobalReplicationGroupId() + ",");
        if (getPrimaryClusterId() != null)
            sb.append("PrimaryClusterId: " + getPrimaryClusterId() + ",");
        if (getAutomaticFailoverEnabled() != null)
            sb.append("AutomaticFailoverEnabled: " + getAutomaticFailoverEnabled() + ",");
        if (getMultiAZEnabled() != null)
            sb.append("MultiAZEnabled: " + getMultiAZEnabled() + ",");
        if (getNumCacheClusters() != null)
            sb.append("NumCacheClusters: " + getNumCacheClusters() + ",");
        if (getPreferredCacheClusterAZs() != null)
            sb.append("PreferredCacheClusterAZs: " + getPreferredCacheClusterAZs() + ",");
        if (getNumNodeGroups() != null)
            sb.append("NumNodeGroups: " + getNumNodeGroups() + ",");
        if (getReplicasPerNodeGroup() != null)
            sb.append("ReplicasPerNodeGroup: " + getReplicasPerNodeGroup() + ",");
        if (getNodeGroupConfiguration() != null)
            sb.append("NodeGroupConfiguration: " + getNodeGroupConfiguration() + ",");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: " + getCacheNodeType() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getCacheParameterGroupName() != null)
            sb.append("CacheParameterGroupName: " + getCacheParameterGroupName() + ",");
        if (getCacheSubnetGroupName() != null)
            sb.append("CacheSubnetGroupName: " + getCacheSubnetGroupName() + ",");
        if (getCacheSecurityGroupNames() != null)
            sb.append("CacheSecurityGroupNames: " + getCacheSecurityGroupNames() + ",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getSnapshotArns() != null)
            sb.append("SnapshotArns: " + getSnapshotArns() + ",");
        if (getSnapshotName() != null)
            sb.append("SnapshotName: " + getSnapshotName() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getNotificationTopicArn() != null)
            sb.append("NotificationTopicArn: " + getNotificationTopicArn() + ",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: " + getAutoMinorVersionUpgrade() + ",");
        if (getSnapshotRetentionLimit() != null)
            sb.append("SnapshotRetentionLimit: " + getSnapshotRetentionLimit() + ",");
        if (getSnapshotWindow() != null)
            sb.append("SnapshotWindow: " + getSnapshotWindow() + ",");
        if (getAuthToken() != null)
            sb.append("AuthToken: " + getAuthToken() + ",");
        if (getTransitEncryptionEnabled() != null)
            sb.append("TransitEncryptionEnabled: " + getTransitEncryptionEnabled() + ",");
        if (getAtRestEncryptionEnabled() != null)
            sb.append("AtRestEncryptionEnabled: " + getAtRestEncryptionEnabled() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationGroupDescription() == null) ? 0
                        : getReplicationGroupDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getGlobalReplicationGroupId() == null) ? 0 : getGlobalReplicationGroupId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPrimaryClusterId() == null) ? 0 : getPrimaryClusterId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutomaticFailoverEnabled() == null) ? 0 : getAutomaticFailoverEnabled()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMultiAZEnabled() == null) ? 0 : getMultiAZEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getNumCacheClusters() == null) ? 0 : getNumCacheClusters().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredCacheClusterAZs() == null) ? 0 : getPreferredCacheClusterAZs()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNumNodeGroups() == null) ? 0 : getNumNodeGroups().hashCode());
        hashCode = prime * hashCode
                + ((getReplicasPerNodeGroup() == null) ? 0 : getReplicasPerNodeGroup().hashCode());
        hashCode = prime
                * hashCode
                + ((getNodeGroupConfiguration() == null) ? 0 : getNodeGroupConfiguration()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheParameterGroupName() == null) ? 0 : getCacheParameterGroupName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCacheSubnetGroupName() == null) ? 0 : getCacheSubnetGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheSecurityGroupNames() == null) ? 0 : getCacheSecurityGroupNames()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotArns() == null) ? 0 : getSnapshotArns().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow()
                        .hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode
                + ((getNotificationTopicArn() == null) ? 0 : getNotificationTopicArn().hashCode());
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
        hashCode = prime * hashCode + ((getAuthToken() == null) ? 0 : getAuthToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getTransitEncryptionEnabled() == null) ? 0 : getTransitEncryptionEnabled()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAtRestEncryptionEnabled() == null) ? 0 : getAtRestEncryptionEnabled()
                        .hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReplicationGroupRequest == false)
            return false;
        CreateReplicationGroupRequest other = (CreateReplicationGroupRequest) obj;

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
        if (other.getGlobalReplicationGroupId() == null
                ^ this.getGlobalReplicationGroupId() == null)
            return false;
        if (other.getGlobalReplicationGroupId() != null
                && other.getGlobalReplicationGroupId().equals(this.getGlobalReplicationGroupId()) == false)
            return false;
        if (other.getPrimaryClusterId() == null ^ this.getPrimaryClusterId() == null)
            return false;
        if (other.getPrimaryClusterId() != null
                && other.getPrimaryClusterId().equals(this.getPrimaryClusterId()) == false)
            return false;
        if (other.getAutomaticFailoverEnabled() == null
                ^ this.getAutomaticFailoverEnabled() == null)
            return false;
        if (other.getAutomaticFailoverEnabled() != null
                && other.getAutomaticFailoverEnabled().equals(this.getAutomaticFailoverEnabled()) == false)
            return false;
        if (other.getMultiAZEnabled() == null ^ this.getMultiAZEnabled() == null)
            return false;
        if (other.getMultiAZEnabled() != null
                && other.getMultiAZEnabled().equals(this.getMultiAZEnabled()) == false)
            return false;
        if (other.getNumCacheClusters() == null ^ this.getNumCacheClusters() == null)
            return false;
        if (other.getNumCacheClusters() != null
                && other.getNumCacheClusters().equals(this.getNumCacheClusters()) == false)
            return false;
        if (other.getPreferredCacheClusterAZs() == null
                ^ this.getPreferredCacheClusterAZs() == null)
            return false;
        if (other.getPreferredCacheClusterAZs() != null
                && other.getPreferredCacheClusterAZs().equals(this.getPreferredCacheClusterAZs()) == false)
            return false;
        if (other.getNumNodeGroups() == null ^ this.getNumNodeGroups() == null)
            return false;
        if (other.getNumNodeGroups() != null
                && other.getNumNodeGroups().equals(this.getNumNodeGroups()) == false)
            return false;
        if (other.getReplicasPerNodeGroup() == null ^ this.getReplicasPerNodeGroup() == null)
            return false;
        if (other.getReplicasPerNodeGroup() != null
                && other.getReplicasPerNodeGroup().equals(this.getReplicasPerNodeGroup()) == false)
            return false;
        if (other.getNodeGroupConfiguration() == null ^ this.getNodeGroupConfiguration() == null)
            return false;
        if (other.getNodeGroupConfiguration() != null
                && other.getNodeGroupConfiguration().equals(this.getNodeGroupConfiguration()) == false)
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
        if (other.getCacheSecurityGroupNames() == null ^ this.getCacheSecurityGroupNames() == null)
            return false;
        if (other.getCacheSecurityGroupNames() != null
                && other.getCacheSecurityGroupNames().equals(this.getCacheSecurityGroupNames()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null
                && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSnapshotArns() == null ^ this.getSnapshotArns() == null)
            return false;
        if (other.getSnapshotArns() != null
                && other.getSnapshotArns().equals(this.getSnapshotArns()) == false)
            return false;
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null
                && other.getSnapshotName().equals(this.getSnapshotName()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null
                ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null
                && other.getPreferredMaintenanceWindow().equals(
                        this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getNotificationTopicArn() == null ^ this.getNotificationTopicArn() == null)
            return false;
        if (other.getNotificationTopicArn() != null
                && other.getNotificationTopicArn().equals(this.getNotificationTopicArn()) == false)
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
        if (other.getAuthToken() == null ^ this.getAuthToken() == null)
            return false;
        if (other.getAuthToken() != null
                && other.getAuthToken().equals(this.getAuthToken()) == false)
            return false;
        if (other.getTransitEncryptionEnabled() == null
                ^ this.getTransitEncryptionEnabled() == null)
            return false;
        if (other.getTransitEncryptionEnabled() != null
                && other.getTransitEncryptionEnabled().equals(this.getTransitEncryptionEnabled()) == false)
            return false;
        if (other.getAtRestEncryptionEnabled() == null ^ this.getAtRestEncryptionEnabled() == null)
            return false;
        if (other.getAtRestEncryptionEnabled() != null
                && other.getAtRestEncryptionEnabled().equals(this.getAtRestEncryptionEnabled()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }
}
