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
 * Contains all of the attributes of a specific cluster.
 * </p>
 */
public class CacheCluster implements Serializable {
    /**
     * <p>
     * The user-supplied identifier of the cluster. This identifier is a unique
     * key that identifies a cluster.
     * </p>
     */
    private String cacheClusterId;

    /**
     * <p>
     * Represents a Memcached cluster endpoint which, if Automatic Discovery is
     * enabled on the cluster, can be used by an application to connect to any
     * node in the cluster. The configuration endpoint will always have
     * <code>.cfg</code> in it.
     * </p>
     * <p>
     * Example:
     * <code>mem-3.9dvc4r<u>.cfg</u>.usw2.cache.amazonaws.com:11211</code>
     * </p>
     */
    private Endpoint configurationEndpoint;

    /**
     * <p>
     * The URL of the web page where you can download the latest ElastiCache
     * client library.
     * </p>
     */
    private String clientDownloadLandingPage;

    /**
     * <p>
     * The name of the compute and memory capacity node type for the cluster.
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
     * <code>redis</code>) to be used for this cluster.
     * </p>
     */
    private String engine;

    /**
     * <p>
     * The version of the cache engine that is used in this cluster.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The current state of this cluster, one of the following values:
     * <code>available</code>, <code>creating</code>, <code>deleted</code>,
     * <code>deleting</code>, <code>incompatible-network</code>,
     * <code>modifying</code>, <code>rebooting cluster nodes</code>,
     * <code>restore-failed</code>, or <code>snapshotting</code>.
     * </p>
     */
    private String cacheClusterStatus;

    /**
     * <p>
     * The number of cache nodes in the cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running
     * Memcached, this value must be between 1 and 20.
     * </p>
     */
    private Integer numCacheNodes;

    /**
     * <p>
     * The name of the Availability Zone in which the cluster is located or
     * "Multiple" if the cache nodes are located in different Availability
     * Zones.
     * </p>
     */
    private String preferredAvailabilityZone;

    /**
     * <p>
     * The date and time when the cluster was created.
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
     * A group of settings that are applied to the cluster in the future, or
     * that are currently being applied.
     * </p>
     */
    private PendingModifiedValues pendingModifiedValues;

    /**
     * <p>
     * Describes a notification topic and its status. Notification topics are
     * used for publishing ElastiCache events to subscribers using Amazon Simple
     * Notification Service (SNS).
     * </p>
     */
    private NotificationConfiguration notificationConfiguration;

    /**
     * <p>
     * A list of cache security group elements, composed of name and status
     * sub-elements.
     * </p>
     */
    private java.util.List<CacheSecurityGroupMembership> cacheSecurityGroups;

    /**
     * <p>
     * Status of the cache parameter group.
     * </p>
     */
    private CacheParameterGroupStatus cacheParameterGroup;

    /**
     * <p>
     * The name of the cache subnet group associated with the cluster.
     * </p>
     */
    private String cacheSubnetGroupName;

    /**
     * <p>
     * A list of cache nodes that are members of the cluster.
     * </p>
     */
    private java.util.List<CacheNode> cacheNodes;

    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * <p>
     * A list of VPC Security Groups associated with the cluster.
     * </p>
     */
    private java.util.List<SecurityGroupMembership> securityGroups;

    /**
     * <p>
     * The replication group to which this cluster belongs. If this field is
     * empty, the cluster is not associated with any replication group.
     * </p>
     */
    private String replicationGroupId;

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic cluster
     * snapshots before deleting them. For example, if you set
     * <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today
     * is retained for 5 days before being deleted.
     * </p>
     * <important>
     * <p>
     * If the value of SnapshotRetentionLimit is set to zero (0), backups are
     * turned off.
     * </p>
     * </important>
     */
    private Integer snapshotRetentionLimit;

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a
     * daily snapshot of your cluster.
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     */
    private String snapshotWindow;

    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when
     * issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean authTokenEnabled;

    /**
     * <p>
     * The date the auth token was last modified
     * </p>
     */
    private java.util.Date authTokenLastModifiedDate;

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
     * <b>Required:</b> Only available when creating a replication group in an
     * Amazon VPC using redis version <code>3.2.6</code>, <code>4.x</code> or
     * later.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean transitEncryptionEnabled;

    /**
     * <p>
     * A flag that enables encryption at-rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after
     * the cluster is created. To enable at-rest encryption on a cluster you
     * must set <code>AtRestEncryptionEnabled</code> to <code>true</code> when
     * you create a cluster.
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
     * The user-supplied identifier of the cluster. This identifier is a unique
     * key that identifies a cluster.
     * </p>
     *
     * @return <p>
     *         The user-supplied identifier of the cluster. This identifier is a
     *         unique key that identifies a cluster.
     *         </p>
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }

    /**
     * <p>
     * The user-supplied identifier of the cluster. This identifier is a unique
     * key that identifies a cluster.
     * </p>
     *
     * @param cacheClusterId <p>
     *            The user-supplied identifier of the cluster. This identifier
     *            is a unique key that identifies a cluster.
     *            </p>
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * The user-supplied identifier of the cluster. This identifier is a unique
     * key that identifies a cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheClusterId <p>
     *            The user-supplied identifier of the cluster. This identifier
     *            is a unique key that identifies a cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheCluster withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
        return this;
    }

    /**
     * <p>
     * Represents a Memcached cluster endpoint which, if Automatic Discovery is
     * enabled on the cluster, can be used by an application to connect to any
     * node in the cluster. The configuration endpoint will always have
     * <code>.cfg</code> in it.
     * </p>
     * <p>
     * Example:
     * <code>mem-3.9dvc4r<u>.cfg</u>.usw2.cache.amazonaws.com:11211</code>
     * </p>
     *
     * @return <p>
     *         Represents a Memcached cluster endpoint which, if Automatic
     *         Discovery is enabled on the cluster, can be used by an
     *         application to connect to any node in the cluster. The
     *         configuration endpoint will always have <code>.cfg</code> in it.
     *         </p>
     *         <p>
     *         Example:
     *         <code>mem-3.9dvc4r<u>.cfg</u>.usw2.cache.amazonaws.com:11211</code>
     *         </p>
     */
    public Endpoint getConfigurationEndpoint() {
        return configurationEndpoint;
    }

    /**
     * <p>
     * Represents a Memcached cluster endpoint which, if Automatic Discovery is
     * enabled on the cluster, can be used by an application to connect to any
     * node in the cluster. The configuration endpoint will always have
     * <code>.cfg</code> in it.
     * </p>
     * <p>
     * Example:
     * <code>mem-3.9dvc4r<u>.cfg</u>.usw2.cache.amazonaws.com:11211</code>
     * </p>
     *
     * @param configurationEndpoint <p>
     *            Represents a Memcached cluster endpoint which, if Automatic
     *            Discovery is enabled on the cluster, can be used by an
     *            application to connect to any node in the cluster. The
     *            configuration endpoint will always have <code>.cfg</code> in
     *            it.
     *            </p>
     *            <p>
     *            Example:
     *            <code>mem-3.9dvc4r<u>.cfg</u>.usw2.cache.amazonaws.com:11211</code>
     *            </p>
     */
    public void setConfigurationEndpoint(Endpoint configurationEndpoint) {
        this.configurationEndpoint = configurationEndpoint;
    }

    /**
     * <p>
     * Represents a Memcached cluster endpoint which, if Automatic Discovery is
     * enabled on the cluster, can be used by an application to connect to any
     * node in the cluster. The configuration endpoint will always have
     * <code>.cfg</code> in it.
     * </p>
     * <p>
     * Example:
     * <code>mem-3.9dvc4r<u>.cfg</u>.usw2.cache.amazonaws.com:11211</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationEndpoint <p>
     *            Represents a Memcached cluster endpoint which, if Automatic
     *            Discovery is enabled on the cluster, can be used by an
     *            application to connect to any node in the cluster. The
     *            configuration endpoint will always have <code>.cfg</code> in
     *            it.
     *            </p>
     *            <p>
     *            Example:
     *            <code>mem-3.9dvc4r<u>.cfg</u>.usw2.cache.amazonaws.com:11211</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheCluster withConfigurationEndpoint(Endpoint configurationEndpoint) {
        this.configurationEndpoint = configurationEndpoint;
        return this;
    }

    /**
     * <p>
     * The URL of the web page where you can download the latest ElastiCache
     * client library.
     * </p>
     *
     * @return <p>
     *         The URL of the web page where you can download the latest
     *         ElastiCache client library.
     *         </p>
     */
    public String getClientDownloadLandingPage() {
        return clientDownloadLandingPage;
    }

    /**
     * <p>
     * The URL of the web page where you can download the latest ElastiCache
     * client library.
     * </p>
     *
     * @param clientDownloadLandingPage <p>
     *            The URL of the web page where you can download the latest
     *            ElastiCache client library.
     *            </p>
     */
    public void setClientDownloadLandingPage(String clientDownloadLandingPage) {
        this.clientDownloadLandingPage = clientDownloadLandingPage;
    }

    /**
     * <p>
     * The URL of the web page where you can download the latest ElastiCache
     * client library.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientDownloadLandingPage <p>
     *            The URL of the web page where you can download the latest
     *            ElastiCache client library.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheCluster withClientDownloadLandingPage(String clientDownloadLandingPage) {
        this.clientDownloadLandingPage = clientDownloadLandingPage;
        return this;
    }

    /**
     * <p>
     * The name of the compute and memory capacity node type for the cluster.
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
     *         cluster.
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
     * The name of the compute and memory capacity node type for the cluster.
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
     *            cluster.
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
     * The name of the compute and memory capacity node type for the cluster.
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
     *            cluster.
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
    public CacheCluster withCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
        return this;
    }

    /**
     * <p>
     * The name of the cache engine (<code>memcached</code> or
     * <code>redis</code>) to be used for this cluster.
     * </p>
     *
     * @return <p>
     *         The name of the cache engine (<code>memcached</code> or
     *         <code>redis</code>) to be used for this cluster.
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The name of the cache engine (<code>memcached</code> or
     * <code>redis</code>) to be used for this cluster.
     * </p>
     *
     * @param engine <p>
     *            The name of the cache engine (<code>memcached</code> or
     *            <code>redis</code>) to be used for this cluster.
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the cache engine (<code>memcached</code> or
     * <code>redis</code>) to be used for this cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            The name of the cache engine (<code>memcached</code> or
     *            <code>redis</code>) to be used for this cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheCluster withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * The version of the cache engine that is used in this cluster.
     * </p>
     *
     * @return <p>
     *         The version of the cache engine that is used in this cluster.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The version of the cache engine that is used in this cluster.
     * </p>
     *
     * @param engineVersion <p>
     *            The version of the cache engine that is used in this cluster.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version of the cache engine that is used in this cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The version of the cache engine that is used in this cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheCluster withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * The current state of this cluster, one of the following values:
     * <code>available</code>, <code>creating</code>, <code>deleted</code>,
     * <code>deleting</code>, <code>incompatible-network</code>,
     * <code>modifying</code>, <code>rebooting cluster nodes</code>,
     * <code>restore-failed</code>, or <code>snapshotting</code>.
     * </p>
     *
     * @return <p>
     *         The current state of this cluster, one of the following values:
     *         <code>available</code>, <code>creating</code>,
     *         <code>deleted</code>, <code>deleting</code>,
     *         <code>incompatible-network</code>, <code>modifying</code>,
     *         <code>rebooting cluster nodes</code>, <code>restore-failed</code>
     *         , or <code>snapshotting</code>.
     *         </p>
     */
    public String getCacheClusterStatus() {
        return cacheClusterStatus;
    }

    /**
     * <p>
     * The current state of this cluster, one of the following values:
     * <code>available</code>, <code>creating</code>, <code>deleted</code>,
     * <code>deleting</code>, <code>incompatible-network</code>,
     * <code>modifying</code>, <code>rebooting cluster nodes</code>,
     * <code>restore-failed</code>, or <code>snapshotting</code>.
     * </p>
     *
     * @param cacheClusterStatus <p>
     *            The current state of this cluster, one of the following
     *            values: <code>available</code>, <code>creating</code>,
     *            <code>deleted</code>, <code>deleting</code>,
     *            <code>incompatible-network</code>, <code>modifying</code>,
     *            <code>rebooting cluster nodes</code>,
     *            <code>restore-failed</code>, or <code>snapshotting</code>.
     *            </p>
     */
    public void setCacheClusterStatus(String cacheClusterStatus) {
        this.cacheClusterStatus = cacheClusterStatus;
    }

    /**
     * <p>
     * The current state of this cluster, one of the following values:
     * <code>available</code>, <code>creating</code>, <code>deleted</code>,
     * <code>deleting</code>, <code>incompatible-network</code>,
     * <code>modifying</code>, <code>rebooting cluster nodes</code>,
     * <code>restore-failed</code>, or <code>snapshotting</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheClusterStatus <p>
     *            The current state of this cluster, one of the following
     *            values: <code>available</code>, <code>creating</code>,
     *            <code>deleted</code>, <code>deleting</code>,
     *            <code>incompatible-network</code>, <code>modifying</code>,
     *            <code>rebooting cluster nodes</code>,
     *            <code>restore-failed</code>, or <code>snapshotting</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheCluster withCacheClusterStatus(String cacheClusterStatus) {
        this.cacheClusterStatus = cacheClusterStatus;
        return this;
    }

    /**
     * <p>
     * The number of cache nodes in the cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running
     * Memcached, this value must be between 1 and 20.
     * </p>
     *
     * @return <p>
     *         The number of cache nodes in the cluster.
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
     * The number of cache nodes in the cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running
     * Memcached, this value must be between 1 and 20.
     * </p>
     *
     * @param numCacheNodes <p>
     *            The number of cache nodes in the cluster.
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
     * The number of cache nodes in the cluster.
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
     *            The number of cache nodes in the cluster.
     *            </p>
     *            <p>
     *            For clusters running Redis, this value must be 1. For clusters
     *            running Memcached, this value must be between 1 and 20.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheCluster withNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
        return this;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the cluster is located or
     * "Multiple" if the cache nodes are located in different Availability
     * Zones.
     * </p>
     *
     * @return <p>
     *         The name of the Availability Zone in which the cluster is located
     *         or "Multiple" if the cache nodes are located in different
     *         Availability Zones.
     *         </p>
     */
    public String getPreferredAvailabilityZone() {
        return preferredAvailabilityZone;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the cluster is located or
     * "Multiple" if the cache nodes are located in different Availability
     * Zones.
     * </p>
     *
     * @param preferredAvailabilityZone <p>
     *            The name of the Availability Zone in which the cluster is
     *            located or "Multiple" if the cache nodes are located in
     *            different Availability Zones.
     *            </p>
     */
    public void setPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the cluster is located or
     * "Multiple" if the cache nodes are located in different Availability
     * Zones.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredAvailabilityZone <p>
     *            The name of the Availability Zone in which the cluster is
     *            located or "Multiple" if the cache nodes are located in
     *            different Availability Zones.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheCluster withPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
        return this;
    }

    /**
     * <p>
     * The date and time when the cluster was created.
     * </p>
     *
     * @return <p>
     *         The date and time when the cluster was created.
     *         </p>
     */
    public java.util.Date getCacheClusterCreateTime() {
        return cacheClusterCreateTime;
    }

    /**
     * <p>
     * The date and time when the cluster was created.
     * </p>
     *
     * @param cacheClusterCreateTime <p>
     *            The date and time when the cluster was created.
     *            </p>
     */
    public void setCacheClusterCreateTime(java.util.Date cacheClusterCreateTime) {
        this.cacheClusterCreateTime = cacheClusterCreateTime;
    }

    /**
     * <p>
     * The date and time when the cluster was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheClusterCreateTime <p>
     *            The date and time when the cluster was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheCluster withCacheClusterCreateTime(java.util.Date cacheClusterCreateTime) {
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
    public CacheCluster withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * <p>
     * A group of settings that are applied to the cluster in the future, or
     * that are currently being applied.
     * </p>
     *
     * @return <p>
     *         A group of settings that are applied to the cluster in the
     *         future, or that are currently being applied.
     *         </p>
     */
    public PendingModifiedValues getPendingModifiedValues() {
        return pendingModifiedValues;
    }

    /**
     * <p>
     * A group of settings that are applied to the cluster in the future, or
     * that are currently being applied.
     * </p>
     *
     * @param pendingModifiedValues <p>
     *            A group of settings that are applied to the cluster in the
     *            future, or that are currently being applied.
     *            </p>
     */
    public void setPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }

    /**
     * <p>
     * A group of settings that are applied to the cluster in the future, or
     * that are currently being applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pendingModifiedValues <p>
     *            A group of settings that are applied to the cluster in the
     *            future, or that are currently being applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheCluster withPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
        return this;
    }

    /**
     * <p>
     * Describes a notification topic and its status. Notification topics are
     * used for publishing ElastiCache events to subscribers using Amazon Simple
     * Notification Service (SNS).
     * </p>
     *
     * @return <p>
     *         Describes a notification topic and its status. Notification
     *         topics are used for publishing ElastiCache events to subscribers
     *         using Amazon Simple Notification Service (SNS).
     *         </p>
     */
    public NotificationConfiguration getNotificationConfiguration() {
        return notificationConfiguration;
    }

    /**
     * <p>
     * Describes a notification topic and its status. Notification topics are
     * used for publishing ElastiCache events to subscribers using Amazon Simple
     * Notification Service (SNS).
     * </p>
     *
     * @param notificationConfiguration <p>
     *            Describes a notification topic and its status. Notification
     *            topics are used for publishing ElastiCache events to
     *            subscribers using Amazon Simple Notification Service (SNS).
     *            </p>
     */
    public void setNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }

    /**
     * <p>
     * Describes a notification topic and its status. Notification topics are
     * used for publishing ElastiCache events to subscribers using Amazon Simple
     * Notification Service (SNS).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationConfiguration <p>
     *            Describes a notification topic and its status. Notification
     *            topics are used for publishing ElastiCache events to
     *            subscribers using Amazon Simple Notification Service (SNS).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheCluster withNotificationConfiguration(
            NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
        return this;
    }

    /**
     * <p>
     * A list of cache security group elements, composed of name and status
     * sub-elements.
     * </p>
     *
     * @return <p>
     *         A list of cache security group elements, composed of name and
     *         status sub-elements.
     *         </p>
     */
    public java.util.List<CacheSecurityGroupMembership> getCacheSecurityGroups() {
        return cacheSecurityGroups;
    }

    /**
     * <p>
     * A list of cache security group elements, composed of name and status
     * sub-elements.
     * </p>
     *
     * @param cacheSecurityGroups <p>
     *            A list of cache security group elements, composed of name and
     *            status sub-elements.
     *            </p>
     */
    public void setCacheSecurityGroups(
            java.util.Collection<CacheSecurityGroupMembership> cacheSecurityGroups) {
        if (cacheSecurityGroups == null) {
            this.cacheSecurityGroups = null;
            return;
        }

        this.cacheSecurityGroups = new java.util.ArrayList<CacheSecurityGroupMembership>(
                cacheSecurityGroups);
    }

    /**
     * <p>
     * A list of cache security group elements, composed of name and status
     * sub-elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheSecurityGroups <p>
     *            A list of cache security group elements, composed of name and
     *            status sub-elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheCluster withCacheSecurityGroups(CacheSecurityGroupMembership... cacheSecurityGroups) {
        if (getCacheSecurityGroups() == null) {
            this.cacheSecurityGroups = new java.util.ArrayList<CacheSecurityGroupMembership>(
                    cacheSecurityGroups.length);
        }
        for (CacheSecurityGroupMembership value : cacheSecurityGroups) {
            this.cacheSecurityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of cache security group elements, composed of name and status
     * sub-elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheSecurityGroups <p>
     *            A list of cache security group elements, composed of name and
     *            status sub-elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheCluster withCacheSecurityGroups(
            java.util.Collection<CacheSecurityGroupMembership> cacheSecurityGroups) {
        setCacheSecurityGroups(cacheSecurityGroups);
        return this;
    }

    /**
     * <p>
     * Status of the cache parameter group.
     * </p>
     *
     * @return <p>
     *         Status of the cache parameter group.
     *         </p>
     */
    public CacheParameterGroupStatus getCacheParameterGroup() {
        return cacheParameterGroup;
    }

    /**
     * <p>
     * Status of the cache parameter group.
     * </p>
     *
     * @param cacheParameterGroup <p>
     *            Status of the cache parameter group.
     *            </p>
     */
    public void setCacheParameterGroup(CacheParameterGroupStatus cacheParameterGroup) {
        this.cacheParameterGroup = cacheParameterGroup;
    }

    /**
     * <p>
     * Status of the cache parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheParameterGroup <p>
     *            Status of the cache parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheCluster withCacheParameterGroup(CacheParameterGroupStatus cacheParameterGroup) {
        this.cacheParameterGroup = cacheParameterGroup;
        return this;
    }

    /**
     * <p>
     * The name of the cache subnet group associated with the cluster.
     * </p>
     *
     * @return <p>
     *         The name of the cache subnet group associated with the cluster.
     *         </p>
     */
    public String getCacheSubnetGroupName() {
        return cacheSubnetGroupName;
    }

    /**
     * <p>
     * The name of the cache subnet group associated with the cluster.
     * </p>
     *
     * @param cacheSubnetGroupName <p>
     *            The name of the cache subnet group associated with the
     *            cluster.
     *            </p>
     */
    public void setCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }

    /**
     * <p>
     * The name of the cache subnet group associated with the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheSubnetGroupName <p>
     *            The name of the cache subnet group associated with the
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheCluster withCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
        return this;
    }

    /**
     * <p>
     * A list of cache nodes that are members of the cluster.
     * </p>
     *
     * @return <p>
     *         A list of cache nodes that are members of the cluster.
     *         </p>
     */
    public java.util.List<CacheNode> getCacheNodes() {
        return cacheNodes;
    }

    /**
     * <p>
     * A list of cache nodes that are members of the cluster.
     * </p>
     *
     * @param cacheNodes <p>
     *            A list of cache nodes that are members of the cluster.
     *            </p>
     */
    public void setCacheNodes(java.util.Collection<CacheNode> cacheNodes) {
        if (cacheNodes == null) {
            this.cacheNodes = null;
            return;
        }

        this.cacheNodes = new java.util.ArrayList<CacheNode>(cacheNodes);
    }

    /**
     * <p>
     * A list of cache nodes that are members of the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodes <p>
     *            A list of cache nodes that are members of the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheCluster withCacheNodes(CacheNode... cacheNodes) {
        if (getCacheNodes() == null) {
            this.cacheNodes = new java.util.ArrayList<CacheNode>(cacheNodes.length);
        }
        for (CacheNode value : cacheNodes) {
            this.cacheNodes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of cache nodes that are members of the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodes <p>
     *            A list of cache nodes that are members of the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheCluster withCacheNodes(java.util.Collection<CacheNode> cacheNodes) {
        setCacheNodes(cacheNodes);
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
    public CacheCluster withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * <p>
     * A list of VPC Security Groups associated with the cluster.
     * </p>
     *
     * @return <p>
     *         A list of VPC Security Groups associated with the cluster.
     *         </p>
     */
    public java.util.List<SecurityGroupMembership> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * A list of VPC Security Groups associated with the cluster.
     * </p>
     *
     * @param securityGroups <p>
     *            A list of VPC Security Groups associated with the cluster.
     *            </p>
     */
    public void setSecurityGroups(java.util.Collection<SecurityGroupMembership> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<SecurityGroupMembership>(securityGroups);
    }

    /**
     * <p>
     * A list of VPC Security Groups associated with the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            A list of VPC Security Groups associated with the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheCluster withSecurityGroups(SecurityGroupMembership... securityGroups) {
        if (getSecurityGroups() == null) {
            this.securityGroups = new java.util.ArrayList<SecurityGroupMembership>(
                    securityGroups.length);
        }
        for (SecurityGroupMembership value : securityGroups) {
            this.securityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of VPC Security Groups associated with the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            A list of VPC Security Groups associated with the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheCluster withSecurityGroups(
            java.util.Collection<SecurityGroupMembership> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The replication group to which this cluster belongs. If this field is
     * empty, the cluster is not associated with any replication group.
     * </p>
     *
     * @return <p>
     *         The replication group to which this cluster belongs. If this
     *         field is empty, the cluster is not associated with any
     *         replication group.
     *         </p>
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }

    /**
     * <p>
     * The replication group to which this cluster belongs. If this field is
     * empty, the cluster is not associated with any replication group.
     * </p>
     *
     * @param replicationGroupId <p>
     *            The replication group to which this cluster belongs. If this
     *            field is empty, the cluster is not associated with any
     *            replication group.
     *            </p>
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The replication group to which this cluster belongs. If this field is
     * empty, the cluster is not associated with any replication group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupId <p>
     *            The replication group to which this cluster belongs. If this
     *            field is empty, the cluster is not associated with any
     *            replication group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheCluster withReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
        return this;
    }

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic cluster
     * snapshots before deleting them. For example, if you set
     * <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today
     * is retained for 5 days before being deleted.
     * </p>
     * <important>
     * <p>
     * If the value of SnapshotRetentionLimit is set to zero (0), backups are
     * turned off.
     * </p>
     * </important>
     *
     * @return <p>
     *         The number of days for which ElastiCache retains automatic
     *         cluster snapshots before deleting them. For example, if you set
     *         <code>SnapshotRetentionLimit</code> to 5, a snapshot that was
     *         taken today is retained for 5 days before being deleted.
     *         </p>
     *         <important>
     *         <p>
     *         If the value of SnapshotRetentionLimit is set to zero (0),
     *         backups are turned off.
     *         </p>
     *         </important>
     */
    public Integer getSnapshotRetentionLimit() {
        return snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic cluster
     * snapshots before deleting them. For example, if you set
     * <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today
     * is retained for 5 days before being deleted.
     * </p>
     * <important>
     * <p>
     * If the value of SnapshotRetentionLimit is set to zero (0), backups are
     * turned off.
     * </p>
     * </important>
     *
     * @param snapshotRetentionLimit <p>
     *            The number of days for which ElastiCache retains automatic
     *            cluster snapshots before deleting them. For example, if you
     *            set <code>SnapshotRetentionLimit</code> to 5, a snapshot that
     *            was taken today is retained for 5 days before being deleted.
     *            </p>
     *            <important>
     *            <p>
     *            If the value of SnapshotRetentionLimit is set to zero (0),
     *            backups are turned off.
     *            </p>
     *            </important>
     */
    public void setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic cluster
     * snapshots before deleting them. For example, if you set
     * <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today
     * is retained for 5 days before being deleted.
     * </p>
     * <important>
     * <p>
     * If the value of SnapshotRetentionLimit is set to zero (0), backups are
     * turned off.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotRetentionLimit <p>
     *            The number of days for which ElastiCache retains automatic
     *            cluster snapshots before deleting them. For example, if you
     *            set <code>SnapshotRetentionLimit</code> to 5, a snapshot that
     *            was taken today is retained for 5 days before being deleted.
     *            </p>
     *            <important>
     *            <p>
     *            If the value of SnapshotRetentionLimit is set to zero (0),
     *            backups are turned off.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheCluster withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
        return this;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a
     * daily snapshot of your cluster.
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     *
     * @return <p>
     *         The daily time range (in UTC) during which ElastiCache begins
     *         taking a daily snapshot of your cluster.
     *         </p>
     *         <p>
     *         Example: <code>05:00-09:00</code>
     *         </p>
     */
    public String getSnapshotWindow() {
        return snapshotWindow;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a
     * daily snapshot of your cluster.
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     *
     * @param snapshotWindow <p>
     *            The daily time range (in UTC) during which ElastiCache begins
     *            taking a daily snapshot of your cluster.
     *            </p>
     *            <p>
     *            Example: <code>05:00-09:00</code>
     *            </p>
     */
    public void setSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a
     * daily snapshot of your cluster.
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotWindow <p>
     *            The daily time range (in UTC) during which ElastiCache begins
     *            taking a daily snapshot of your cluster.
     *            </p>
     *            <p>
     *            Example: <code>05:00-09:00</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheCluster withSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
        return this;
    }

    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when
     * issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @return <p>
     *         A flag that enables using an <code>AuthToken</code> (password)
     *         when issuing Redis commands.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     */
    public Boolean isAuthTokenEnabled() {
        return authTokenEnabled;
    }

    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when
     * issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @return <p>
     *         A flag that enables using an <code>AuthToken</code> (password)
     *         when issuing Redis commands.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     */
    public Boolean getAuthTokenEnabled() {
        return authTokenEnabled;
    }

    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when
     * issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @param authTokenEnabled <p>
     *            A flag that enables using an <code>AuthToken</code> (password)
     *            when issuing Redis commands.
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     */
    public void setAuthTokenEnabled(Boolean authTokenEnabled) {
        this.authTokenEnabled = authTokenEnabled;
    }

    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when
     * issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authTokenEnabled <p>
     *            A flag that enables using an <code>AuthToken</code> (password)
     *            when issuing Redis commands.
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheCluster withAuthTokenEnabled(Boolean authTokenEnabled) {
        this.authTokenEnabled = authTokenEnabled;
        return this;
    }

    /**
     * <p>
     * The date the auth token was last modified
     * </p>
     *
     * @return <p>
     *         The date the auth token was last modified
     *         </p>
     */
    public java.util.Date getAuthTokenLastModifiedDate() {
        return authTokenLastModifiedDate;
    }

    /**
     * <p>
     * The date the auth token was last modified
     * </p>
     *
     * @param authTokenLastModifiedDate <p>
     *            The date the auth token was last modified
     *            </p>
     */
    public void setAuthTokenLastModifiedDate(java.util.Date authTokenLastModifiedDate) {
        this.authTokenLastModifiedDate = authTokenLastModifiedDate;
    }

    /**
     * <p>
     * The date the auth token was last modified
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authTokenLastModifiedDate <p>
     *            The date the auth token was last modified
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheCluster withAuthTokenLastModifiedDate(java.util.Date authTokenLastModifiedDate) {
        this.authTokenLastModifiedDate = authTokenLastModifiedDate;
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
     * <b>Required:</b> Only available when creating a replication group in an
     * Amazon VPC using redis version <code>3.2.6</code>, <code>4.x</code> or
     * later.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
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
     *         <b>Required:</b> Only available when creating a replication group
     *         in an Amazon VPC using redis version <code>3.2.6</code>,
     *         <code>4.x</code> or later.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
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
     * <b>Required:</b> Only available when creating a replication group in an
     * Amazon VPC using redis version <code>3.2.6</code>, <code>4.x</code> or
     * later.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
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
     *         <b>Required:</b> Only available when creating a replication group
     *         in an Amazon VPC using redis version <code>3.2.6</code>,
     *         <code>4.x</code> or later.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
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
     * <b>Required:</b> Only available when creating a replication group in an
     * Amazon VPC using redis version <code>3.2.6</code>, <code>4.x</code> or
     * later.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
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
     *            <b>Required:</b> Only available when creating a replication
     *            group in an Amazon VPC using redis version <code>3.2.6</code>,
     *            <code>4.x</code> or later.
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
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
    public CacheCluster withTransitEncryptionEnabled(Boolean transitEncryptionEnabled) {
        this.transitEncryptionEnabled = transitEncryptionEnabled;
        return this;
    }

    /**
     * <p>
     * A flag that enables encryption at-rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after
     * the cluster is created. To enable at-rest encryption on a cluster you
     * must set <code>AtRestEncryptionEnabled</code> to <code>true</code> when
     * you create a cluster.
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
     *         A flag that enables encryption at-rest when set to
     *         <code>true</code>.
     *         </p>
     *         <p>
     *         You cannot modify the value of
     *         <code>AtRestEncryptionEnabled</code> after the cluster is
     *         created. To enable at-rest encryption on a cluster you must set
     *         <code>AtRestEncryptionEnabled</code> to <code>true</code> when
     *         you create a cluster.
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
     * A flag that enables encryption at-rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after
     * the cluster is created. To enable at-rest encryption on a cluster you
     * must set <code>AtRestEncryptionEnabled</code> to <code>true</code> when
     * you create a cluster.
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
     *         A flag that enables encryption at-rest when set to
     *         <code>true</code>.
     *         </p>
     *         <p>
     *         You cannot modify the value of
     *         <code>AtRestEncryptionEnabled</code> after the cluster is
     *         created. To enable at-rest encryption on a cluster you must set
     *         <code>AtRestEncryptionEnabled</code> to <code>true</code> when
     *         you create a cluster.
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
     * A flag that enables encryption at-rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after
     * the cluster is created. To enable at-rest encryption on a cluster you
     * must set <code>AtRestEncryptionEnabled</code> to <code>true</code> when
     * you create a cluster.
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
     *            A flag that enables encryption at-rest when set to
     *            <code>true</code>.
     *            </p>
     *            <p>
     *            You cannot modify the value of
     *            <code>AtRestEncryptionEnabled</code> after the cluster is
     *            created. To enable at-rest encryption on a cluster you must
     *            set <code>AtRestEncryptionEnabled</code> to <code>true</code>
     *            when you create a cluster.
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
     * A flag that enables encryption at-rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after
     * the cluster is created. To enable at-rest encryption on a cluster you
     * must set <code>AtRestEncryptionEnabled</code> to <code>true</code> when
     * you create a cluster.
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
     *            A flag that enables encryption at-rest when set to
     *            <code>true</code>.
     *            </p>
     *            <p>
     *            You cannot modify the value of
     *            <code>AtRestEncryptionEnabled</code> after the cluster is
     *            created. To enable at-rest encryption on a cluster you must
     *            set <code>AtRestEncryptionEnabled</code> to <code>true</code>
     *            when you create a cluster.
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
    public CacheCluster withAtRestEncryptionEnabled(Boolean atRestEncryptionEnabled) {
        this.atRestEncryptionEnabled = atRestEncryptionEnabled;
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
        if (getCacheClusterId() != null)
            sb.append("CacheClusterId: " + getCacheClusterId() + ",");
        if (getConfigurationEndpoint() != null)
            sb.append("ConfigurationEndpoint: " + getConfigurationEndpoint() + ",");
        if (getClientDownloadLandingPage() != null)
            sb.append("ClientDownloadLandingPage: " + getClientDownloadLandingPage() + ",");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: " + getCacheNodeType() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getCacheClusterStatus() != null)
            sb.append("CacheClusterStatus: " + getCacheClusterStatus() + ",");
        if (getNumCacheNodes() != null)
            sb.append("NumCacheNodes: " + getNumCacheNodes() + ",");
        if (getPreferredAvailabilityZone() != null)
            sb.append("PreferredAvailabilityZone: " + getPreferredAvailabilityZone() + ",");
        if (getCacheClusterCreateTime() != null)
            sb.append("CacheClusterCreateTime: " + getCacheClusterCreateTime() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getPendingModifiedValues() != null)
            sb.append("PendingModifiedValues: " + getPendingModifiedValues() + ",");
        if (getNotificationConfiguration() != null)
            sb.append("NotificationConfiguration: " + getNotificationConfiguration() + ",");
        if (getCacheSecurityGroups() != null)
            sb.append("CacheSecurityGroups: " + getCacheSecurityGroups() + ",");
        if (getCacheParameterGroup() != null)
            sb.append("CacheParameterGroup: " + getCacheParameterGroup() + ",");
        if (getCacheSubnetGroupName() != null)
            sb.append("CacheSubnetGroupName: " + getCacheSubnetGroupName() + ",");
        if (getCacheNodes() != null)
            sb.append("CacheNodes: " + getCacheNodes() + ",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: " + getAutoMinorVersionUpgrade() + ",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: " + getReplicationGroupId() + ",");
        if (getSnapshotRetentionLimit() != null)
            sb.append("SnapshotRetentionLimit: " + getSnapshotRetentionLimit() + ",");
        if (getSnapshotWindow() != null)
            sb.append("SnapshotWindow: " + getSnapshotWindow() + ",");
        if (getAuthTokenEnabled() != null)
            sb.append("AuthTokenEnabled: " + getAuthTokenEnabled() + ",");
        if (getAuthTokenLastModifiedDate() != null)
            sb.append("AuthTokenLastModifiedDate: " + getAuthTokenLastModifiedDate() + ",");
        if (getTransitEncryptionEnabled() != null)
            sb.append("TransitEncryptionEnabled: " + getTransitEncryptionEnabled() + ",");
        if (getAtRestEncryptionEnabled() != null)
            sb.append("AtRestEncryptionEnabled: " + getAtRestEncryptionEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode());
        hashCode = prime
                * hashCode
                + ((getConfigurationEndpoint() == null) ? 0 : getConfigurationEndpoint().hashCode());
        hashCode = prime
                * hashCode
                + ((getClientDownloadLandingPage() == null) ? 0 : getClientDownloadLandingPage()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode
                + ((getCacheClusterStatus() == null) ? 0 : getCacheClusterStatus().hashCode());
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
        hashCode = prime
                * hashCode
                + ((getPendingModifiedValues() == null) ? 0 : getPendingModifiedValues().hashCode());
        hashCode = prime
                * hashCode
                + ((getNotificationConfiguration() == null) ? 0 : getNotificationConfiguration()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCacheSecurityGroups() == null) ? 0 : getCacheSecurityGroups().hashCode());
        hashCode = prime * hashCode
                + ((getCacheParameterGroup() == null) ? 0 : getCacheParameterGroup().hashCode());
        hashCode = prime * hashCode
                + ((getCacheSubnetGroupName() == null) ? 0 : getCacheSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getCacheNodes() == null) ? 0 : getCacheNodes().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode
                + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotRetentionLimit() == null) ? 0 : getSnapshotRetentionLimit()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotWindow() == null) ? 0 : getSnapshotWindow().hashCode());
        hashCode = prime * hashCode
                + ((getAuthTokenEnabled() == null) ? 0 : getAuthTokenEnabled().hashCode());
        hashCode = prime
                * hashCode
                + ((getAuthTokenLastModifiedDate() == null) ? 0 : getAuthTokenLastModifiedDate()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTransitEncryptionEnabled() == null) ? 0 : getTransitEncryptionEnabled()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAtRestEncryptionEnabled() == null) ? 0 : getAtRestEncryptionEnabled()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CacheCluster == false)
            return false;
        CacheCluster other = (CacheCluster) obj;

        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null
                && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getConfigurationEndpoint() == null ^ this.getConfigurationEndpoint() == null)
            return false;
        if (other.getConfigurationEndpoint() != null
                && other.getConfigurationEndpoint().equals(this.getConfigurationEndpoint()) == false)
            return false;
        if (other.getClientDownloadLandingPage() == null
                ^ this.getClientDownloadLandingPage() == null)
            return false;
        if (other.getClientDownloadLandingPage() != null
                && other.getClientDownloadLandingPage().equals(this.getClientDownloadLandingPage()) == false)
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
        if (other.getCacheClusterStatus() == null ^ this.getCacheClusterStatus() == null)
            return false;
        if (other.getCacheClusterStatus() != null
                && other.getCacheClusterStatus().equals(this.getCacheClusterStatus()) == false)
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
        if (other.getPendingModifiedValues() == null ^ this.getPendingModifiedValues() == null)
            return false;
        if (other.getPendingModifiedValues() != null
                && other.getPendingModifiedValues().equals(this.getPendingModifiedValues()) == false)
            return false;
        if (other.getNotificationConfiguration() == null
                ^ this.getNotificationConfiguration() == null)
            return false;
        if (other.getNotificationConfiguration() != null
                && other.getNotificationConfiguration().equals(this.getNotificationConfiguration()) == false)
            return false;
        if (other.getCacheSecurityGroups() == null ^ this.getCacheSecurityGroups() == null)
            return false;
        if (other.getCacheSecurityGroups() != null
                && other.getCacheSecurityGroups().equals(this.getCacheSecurityGroups()) == false)
            return false;
        if (other.getCacheParameterGroup() == null ^ this.getCacheParameterGroup() == null)
            return false;
        if (other.getCacheParameterGroup() != null
                && other.getCacheParameterGroup().equals(this.getCacheParameterGroup()) == false)
            return false;
        if (other.getCacheSubnetGroupName() == null ^ this.getCacheSubnetGroupName() == null)
            return false;
        if (other.getCacheSubnetGroupName() != null
                && other.getCacheSubnetGroupName().equals(this.getCacheSubnetGroupName()) == false)
            return false;
        if (other.getCacheNodes() == null ^ this.getCacheNodes() == null)
            return false;
        if (other.getCacheNodes() != null
                && other.getCacheNodes().equals(this.getCacheNodes()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null
                && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null
                && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null
                && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
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
        if (other.getAuthTokenEnabled() == null ^ this.getAuthTokenEnabled() == null)
            return false;
        if (other.getAuthTokenEnabled() != null
                && other.getAuthTokenEnabled().equals(this.getAuthTokenEnabled()) == false)
            return false;
        if (other.getAuthTokenLastModifiedDate() == null
                ^ this.getAuthTokenLastModifiedDate() == null)
            return false;
        if (other.getAuthTokenLastModifiedDate() != null
                && other.getAuthTokenLastModifiedDate().equals(this.getAuthTokenLastModifiedDate()) == false)
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
        return true;
    }
}
