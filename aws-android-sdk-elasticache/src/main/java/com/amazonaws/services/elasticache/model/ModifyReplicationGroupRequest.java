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
 * Modifies the settings for a replication group.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/scaling-redis-cluster-mode-enabled.html"
 * >Scaling for Amazon ElastiCache for Redis (cluster mode enabled)</a> in the
 * ElastiCache User Guide
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ModifyReplicationGroupShardConfiguration.html"
 * >ModifyReplicationGroupShardConfiguration</a> in the ElastiCache API
 * Reference
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * This operation is valid for Redis only.
 * </p>
 * </note>
 */
public class ModifyReplicationGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the replication group to modify.
     * </p>
     */
    private String replicationGroupId;

    /**
     * <p>
     * A description for the replication group. Maximum length is 255
     * characters.
     * </p>
     */
    private String replicationGroupDescription;

    /**
     * <p>
     * For replication groups with a single primary, if this parameter is
     * specified, ElastiCache promotes the specified cluster in the specified
     * replication group to the primary role. The nodes of all other clusters in
     * the replication group are read replicas.
     * </p>
     */
    private String primaryClusterId;

    /**
     * <p>
     * The cluster ID that is used as the daily snapshot source for the
     * replication group. This parameter cannot be set for Redis (cluster mode
     * enabled) replication groups.
     * </p>
     */
    private String snapshottingClusterId;

    /**
     * <p>
     * Determines whether a read replica is automatically promoted to read/write
     * primary if the existing primary encounters a failure.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
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
     * Deprecated. This parameter is not used.
     * </p>
     */
    private String nodeGroupId;

    /**
     * <p>
     * A list of cache security group names to authorize for the clusters in
     * this replication group. This change is asynchronously applied as soon as
     * possible.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing
     * clusters running outside of an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters. Must
     * not be <code>Default</code>.
     * </p>
     */
    private java.util.List<String> cacheSecurityGroupNames;

    /**
     * <p>
     * Specifies the VPC Security Groups associated with the clusters in the
     * replication group.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing
     * clusters running in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     */
    private java.util.List<String> securityGroupIds;

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
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     * notifications are sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be same as the replication group owner.
     * </p>
     * </note>
     */
    private String notificationTopicArn;

    /**
     * <p>
     * The name of the cache parameter group to apply to all of the clusters in
     * this replication group. This change is asynchronously applied as soon as
     * possible for parameters when the <code>ApplyImmediately</code> parameter
     * is specified as <code>true</code> for this request.
     * </p>
     */
    private String cacheParameterGroupName;

    /**
     * <p>
     * The status of the Amazon SNS notification topic for the replication
     * group. Notifications are sent only if the status is <code>active</code>.
     * </p>
     * <p>
     * Valid values: <code>active</code> | <code>inactive</code>
     * </p>
     */
    private String notificationTopicStatus;

    /**
     * <p>
     * If <code>true</code>, this parameter causes the modifications in this
     * request and any pending modifications to be applied, asynchronously and
     * as soon as possible, regardless of the
     * <code>PreferredMaintenanceWindow</code> setting for the replication
     * group.
     * </p>
     * <p>
     * If <code>false</code>, changes to the nodes in the replication group are
     * applied on the next maintenance reboot, or the next failure reboot,
     * whichever occurs first.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean applyImmediately;

    /**
     * <p>
     * The upgraded version of the cache engine to be run on the clusters in the
     * replication group.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     * >Selecting a Cache Engine and Version</a>), but you cannot downgrade to
     * an earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing replication group and create it anew with
     * the earlier engine version.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic node group
     * (shard) snapshots before deleting them. For example, if you set
     * <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today
     * is retained for 5 days before being deleted.
     * </p>
     * <p>
     * <b>Important</b> If the value of SnapshotRetentionLimit is set to zero
     * (0), backups are turned off.
     * </p>
     */
    private Integer snapshotRetentionLimit;

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a
     * daily snapshot of the node group (shard) specified by
     * <code>SnapshottingClusterId</code>.
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
     * A valid cache node type that you want to scale this replication group to.
     * </p>
     */
    private String cacheNodeType;

    /**
     * <p>
     * Reserved parameter. The password used to access a password protected
     * server. This parameter must be specified with the
     * <code>auth-token-update-strategy </code> parameter. Password constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be only printable ASCII characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 16 characters and no more than 128 characters in length
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot contain any of the following characters: '/', '"', or '@', '%'
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see AUTH password at <a
     * href="http://redis.io/commands/AUTH">AUTH</a>.
     * </p>
     */
    private String authToken;

    /**
     * <p>
     * Specifies the strategy to use to update the AUTH token. This parameter
     * must be specified with the <code>auth-token</code> parameter. Possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Rotate
     * </p>
     * </li>
     * <li>
     * <p>
     * Set
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/auth.html"
     * >Authenticating Users with Redis AUTH</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SET, ROTATE
     */
    private String authTokenUpdateStrategy;

    /**
     * <p>
     * The identifier of the replication group to modify.
     * </p>
     *
     * @return <p>
     *         The identifier of the replication group to modify.
     *         </p>
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }

    /**
     * <p>
     * The identifier of the replication group to modify.
     * </p>
     *
     * @param replicationGroupId <p>
     *            The identifier of the replication group to modify.
     *            </p>
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The identifier of the replication group to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupId <p>
     *            The identifier of the replication group to modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupRequest withReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
        return this;
    }

    /**
     * <p>
     * A description for the replication group. Maximum length is 255
     * characters.
     * </p>
     *
     * @return <p>
     *         A description for the replication group. Maximum length is 255
     *         characters.
     *         </p>
     */
    public String getReplicationGroupDescription() {
        return replicationGroupDescription;
    }

    /**
     * <p>
     * A description for the replication group. Maximum length is 255
     * characters.
     * </p>
     *
     * @param replicationGroupDescription <p>
     *            A description for the replication group. Maximum length is 255
     *            characters.
     *            </p>
     */
    public void setReplicationGroupDescription(String replicationGroupDescription) {
        this.replicationGroupDescription = replicationGroupDescription;
    }

    /**
     * <p>
     * A description for the replication group. Maximum length is 255
     * characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupDescription <p>
     *            A description for the replication group. Maximum length is 255
     *            characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupRequest withReplicationGroupDescription(
            String replicationGroupDescription) {
        this.replicationGroupDescription = replicationGroupDescription;
        return this;
    }

    /**
     * <p>
     * For replication groups with a single primary, if this parameter is
     * specified, ElastiCache promotes the specified cluster in the specified
     * replication group to the primary role. The nodes of all other clusters in
     * the replication group are read replicas.
     * </p>
     *
     * @return <p>
     *         For replication groups with a single primary, if this parameter
     *         is specified, ElastiCache promotes the specified cluster in the
     *         specified replication group to the primary role. The nodes of all
     *         other clusters in the replication group are read replicas.
     *         </p>
     */
    public String getPrimaryClusterId() {
        return primaryClusterId;
    }

    /**
     * <p>
     * For replication groups with a single primary, if this parameter is
     * specified, ElastiCache promotes the specified cluster in the specified
     * replication group to the primary role. The nodes of all other clusters in
     * the replication group are read replicas.
     * </p>
     *
     * @param primaryClusterId <p>
     *            For replication groups with a single primary, if this
     *            parameter is specified, ElastiCache promotes the specified
     *            cluster in the specified replication group to the primary
     *            role. The nodes of all other clusters in the replication group
     *            are read replicas.
     *            </p>
     */
    public void setPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
    }

    /**
     * <p>
     * For replication groups with a single primary, if this parameter is
     * specified, ElastiCache promotes the specified cluster in the specified
     * replication group to the primary role. The nodes of all other clusters in
     * the replication group are read replicas.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param primaryClusterId <p>
     *            For replication groups with a single primary, if this
     *            parameter is specified, ElastiCache promotes the specified
     *            cluster in the specified replication group to the primary
     *            role. The nodes of all other clusters in the replication group
     *            are read replicas.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupRequest withPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
        return this;
    }

    /**
     * <p>
     * The cluster ID that is used as the daily snapshot source for the
     * replication group. This parameter cannot be set for Redis (cluster mode
     * enabled) replication groups.
     * </p>
     *
     * @return <p>
     *         The cluster ID that is used as the daily snapshot source for the
     *         replication group. This parameter cannot be set for Redis
     *         (cluster mode enabled) replication groups.
     *         </p>
     */
    public String getSnapshottingClusterId() {
        return snapshottingClusterId;
    }

    /**
     * <p>
     * The cluster ID that is used as the daily snapshot source for the
     * replication group. This parameter cannot be set for Redis (cluster mode
     * enabled) replication groups.
     * </p>
     *
     * @param snapshottingClusterId <p>
     *            The cluster ID that is used as the daily snapshot source for
     *            the replication group. This parameter cannot be set for Redis
     *            (cluster mode enabled) replication groups.
     *            </p>
     */
    public void setSnapshottingClusterId(String snapshottingClusterId) {
        this.snapshottingClusterId = snapshottingClusterId;
    }

    /**
     * <p>
     * The cluster ID that is used as the daily snapshot source for the
     * replication group. This parameter cannot be set for Redis (cluster mode
     * enabled) replication groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshottingClusterId <p>
     *            The cluster ID that is used as the daily snapshot source for
     *            the replication group. This parameter cannot be set for Redis
     *            (cluster mode enabled) replication groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupRequest withSnapshottingClusterId(String snapshottingClusterId) {
        this.snapshottingClusterId = snapshottingClusterId;
        return this;
    }

    /**
     * <p>
     * Determines whether a read replica is automatically promoted to read/write
     * primary if the existing primary encounters a failure.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
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
     *         Determines whether a read replica is automatically promoted to
     *         read/write primary if the existing primary encounters a failure.
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
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
     * Determines whether a read replica is automatically promoted to read/write
     * primary if the existing primary encounters a failure.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
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
     *         Determines whether a read replica is automatically promoted to
     *         read/write primary if the existing primary encounters a failure.
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
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
     * Determines whether a read replica is automatically promoted to read/write
     * primary if the existing primary encounters a failure.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
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
     *            Determines whether a read replica is automatically promoted to
     *            read/write primary if the existing primary encounters a
     *            failure.
     *            </p>
     *            <p>
     *            Valid values: <code>true</code> | <code>false</code>
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
     * Determines whether a read replica is automatically promoted to read/write
     * primary if the existing primary encounters a failure.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
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
     *            Determines whether a read replica is automatically promoted to
     *            read/write primary if the existing primary encounters a
     *            failure.
     *            </p>
     *            <p>
     *            Valid values: <code>true</code> | <code>false</code>
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
    public ModifyReplicationGroupRequest withAutomaticFailoverEnabled(
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
    public ModifyReplicationGroupRequest withMultiAZEnabled(Boolean multiAZEnabled) {
        this.multiAZEnabled = multiAZEnabled;
        return this;
    }

    /**
     * <p>
     * Deprecated. This parameter is not used.
     * </p>
     *
     * @return <p>
     *         Deprecated. This parameter is not used.
     *         </p>
     */
    public String getNodeGroupId() {
        return nodeGroupId;
    }

    /**
     * <p>
     * Deprecated. This parameter is not used.
     * </p>
     *
     * @param nodeGroupId <p>
     *            Deprecated. This parameter is not used.
     *            </p>
     */
    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }

    /**
     * <p>
     * Deprecated. This parameter is not used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeGroupId <p>
     *            Deprecated. This parameter is not used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupRequest withNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }

    /**
     * <p>
     * A list of cache security group names to authorize for the clusters in
     * this replication group. This change is asynchronously applied as soon as
     * possible.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing
     * clusters running outside of an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters. Must
     * not be <code>Default</code>.
     * </p>
     *
     * @return <p>
     *         A list of cache security group names to authorize for the
     *         clusters in this replication group. This change is asynchronously
     *         applied as soon as possible.
     *         </p>
     *         <p>
     *         This parameter can be used only with replication group containing
     *         clusters running outside of an Amazon Virtual Private Cloud
     *         (Amazon VPC).
     *         </p>
     *         <p>
     *         Constraints: Must contain no more than 255 alphanumeric
     *         characters. Must not be <code>Default</code>.
     *         </p>
     */
    public java.util.List<String> getCacheSecurityGroupNames() {
        return cacheSecurityGroupNames;
    }

    /**
     * <p>
     * A list of cache security group names to authorize for the clusters in
     * this replication group. This change is asynchronously applied as soon as
     * possible.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing
     * clusters running outside of an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters. Must
     * not be <code>Default</code>.
     * </p>
     *
     * @param cacheSecurityGroupNames <p>
     *            A list of cache security group names to authorize for the
     *            clusters in this replication group. This change is
     *            asynchronously applied as soon as possible.
     *            </p>
     *            <p>
     *            This parameter can be used only with replication group
     *            containing clusters running outside of an Amazon Virtual
     *            Private Cloud (Amazon VPC).
     *            </p>
     *            <p>
     *            Constraints: Must contain no more than 255 alphanumeric
     *            characters. Must not be <code>Default</code>.
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
     * A list of cache security group names to authorize for the clusters in
     * this replication group. This change is asynchronously applied as soon as
     * possible.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing
     * clusters running outside of an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters. Must
     * not be <code>Default</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheSecurityGroupNames <p>
     *            A list of cache security group names to authorize for the
     *            clusters in this replication group. This change is
     *            asynchronously applied as soon as possible.
     *            </p>
     *            <p>
     *            This parameter can be used only with replication group
     *            containing clusters running outside of an Amazon Virtual
     *            Private Cloud (Amazon VPC).
     *            </p>
     *            <p>
     *            Constraints: Must contain no more than 255 alphanumeric
     *            characters. Must not be <code>Default</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupRequest withCacheSecurityGroupNames(
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
     * A list of cache security group names to authorize for the clusters in
     * this replication group. This change is asynchronously applied as soon as
     * possible.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing
     * clusters running outside of an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters. Must
     * not be <code>Default</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheSecurityGroupNames <p>
     *            A list of cache security group names to authorize for the
     *            clusters in this replication group. This change is
     *            asynchronously applied as soon as possible.
     *            </p>
     *            <p>
     *            This parameter can be used only with replication group
     *            containing clusters running outside of an Amazon Virtual
     *            Private Cloud (Amazon VPC).
     *            </p>
     *            <p>
     *            Constraints: Must contain no more than 255 alphanumeric
     *            characters. Must not be <code>Default</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupRequest withCacheSecurityGroupNames(
            java.util.Collection<String> cacheSecurityGroupNames) {
        setCacheSecurityGroupNames(cacheSecurityGroupNames);
        return this;
    }

    /**
     * <p>
     * Specifies the VPC Security Groups associated with the clusters in the
     * replication group.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing
     * clusters running in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     *
     * @return <p>
     *         Specifies the VPC Security Groups associated with the clusters in
     *         the replication group.
     *         </p>
     *         <p>
     *         This parameter can be used only with replication group containing
     *         clusters running in an Amazon Virtual Private Cloud (Amazon VPC).
     *         </p>
     */
    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * Specifies the VPC Security Groups associated with the clusters in the
     * replication group.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing
     * clusters running in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     *
     * @param securityGroupIds <p>
     *            Specifies the VPC Security Groups associated with the clusters
     *            in the replication group.
     *            </p>
     *            <p>
     *            This parameter can be used only with replication group
     *            containing clusters running in an Amazon Virtual Private Cloud
     *            (Amazon VPC).
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
     * Specifies the VPC Security Groups associated with the clusters in the
     * replication group.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing
     * clusters running in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            Specifies the VPC Security Groups associated with the clusters
     *            in the replication group.
     *            </p>
     *            <p>
     *            This parameter can be used only with replication group
     *            containing clusters running in an Amazon Virtual Private Cloud
     *            (Amazon VPC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupRequest withSecurityGroupIds(String... securityGroupIds) {
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
     * Specifies the VPC Security Groups associated with the clusters in the
     * replication group.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing
     * clusters running in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            Specifies the VPC Security Groups associated with the clusters
     *            in the replication group.
     *            </p>
     *            <p>
     *            This parameter can be used only with replication group
     *            containing clusters running in an Amazon Virtual Private Cloud
     *            (Amazon VPC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupRequest withSecurityGroupIds(
            java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
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
    public ModifyReplicationGroupRequest withPreferredMaintenanceWindow(
            String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     * notifications are sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be same as the replication group owner.
     * </p>
     * </note>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     *         notifications are sent.
     *         </p>
     *         <note>
     *         <p>
     *         The Amazon SNS topic owner must be same as the replication group
     *         owner.
     *         </p>
     *         </note>
     */
    public String getNotificationTopicArn() {
        return notificationTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     * notifications are sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be same as the replication group owner.
     * </p>
     * </note>
     *
     * @param notificationTopicArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon SNS topic to
     *            which notifications are sent.
     *            </p>
     *            <note>
     *            <p>
     *            The Amazon SNS topic owner must be same as the replication
     *            group owner.
     *            </p>
     *            </note>
     */
    public void setNotificationTopicArn(String notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     * notifications are sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be same as the replication group owner.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationTopicArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon SNS topic to
     *            which notifications are sent.
     *            </p>
     *            <note>
     *            <p>
     *            The Amazon SNS topic owner must be same as the replication
     *            group owner.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupRequest withNotificationTopicArn(String notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
        return this;
    }

    /**
     * <p>
     * The name of the cache parameter group to apply to all of the clusters in
     * this replication group. This change is asynchronously applied as soon as
     * possible for parameters when the <code>ApplyImmediately</code> parameter
     * is specified as <code>true</code> for this request.
     * </p>
     *
     * @return <p>
     *         The name of the cache parameter group to apply to all of the
     *         clusters in this replication group. This change is asynchronously
     *         applied as soon as possible for parameters when the
     *         <code>ApplyImmediately</code> parameter is specified as
     *         <code>true</code> for this request.
     *         </p>
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group to apply to all of the clusters in
     * this replication group. This change is asynchronously applied as soon as
     * possible for parameters when the <code>ApplyImmediately</code> parameter
     * is specified as <code>true</code> for this request.
     * </p>
     *
     * @param cacheParameterGroupName <p>
     *            The name of the cache parameter group to apply to all of the
     *            clusters in this replication group. This change is
     *            asynchronously applied as soon as possible for parameters when
     *            the <code>ApplyImmediately</code> parameter is specified as
     *            <code>true</code> for this request.
     *            </p>
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group to apply to all of the clusters in
     * this replication group. This change is asynchronously applied as soon as
     * possible for parameters when the <code>ApplyImmediately</code> parameter
     * is specified as <code>true</code> for this request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheParameterGroupName <p>
     *            The name of the cache parameter group to apply to all of the
     *            clusters in this replication group. This change is
     *            asynchronously applied as soon as possible for parameters when
     *            the <code>ApplyImmediately</code> parameter is specified as
     *            <code>true</code> for this request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupRequest withCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }

    /**
     * <p>
     * The status of the Amazon SNS notification topic for the replication
     * group. Notifications are sent only if the status is <code>active</code>.
     * </p>
     * <p>
     * Valid values: <code>active</code> | <code>inactive</code>
     * </p>
     *
     * @return <p>
     *         The status of the Amazon SNS notification topic for the
     *         replication group. Notifications are sent only if the status is
     *         <code>active</code>.
     *         </p>
     *         <p>
     *         Valid values: <code>active</code> | <code>inactive</code>
     *         </p>
     */
    public String getNotificationTopicStatus() {
        return notificationTopicStatus;
    }

    /**
     * <p>
     * The status of the Amazon SNS notification topic for the replication
     * group. Notifications are sent only if the status is <code>active</code>.
     * </p>
     * <p>
     * Valid values: <code>active</code> | <code>inactive</code>
     * </p>
     *
     * @param notificationTopicStatus <p>
     *            The status of the Amazon SNS notification topic for the
     *            replication group. Notifications are sent only if the status
     *            is <code>active</code>.
     *            </p>
     *            <p>
     *            Valid values: <code>active</code> | <code>inactive</code>
     *            </p>
     */
    public void setNotificationTopicStatus(String notificationTopicStatus) {
        this.notificationTopicStatus = notificationTopicStatus;
    }

    /**
     * <p>
     * The status of the Amazon SNS notification topic for the replication
     * group. Notifications are sent only if the status is <code>active</code>.
     * </p>
     * <p>
     * Valid values: <code>active</code> | <code>inactive</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationTopicStatus <p>
     *            The status of the Amazon SNS notification topic for the
     *            replication group. Notifications are sent only if the status
     *            is <code>active</code>.
     *            </p>
     *            <p>
     *            Valid values: <code>active</code> | <code>inactive</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupRequest withNotificationTopicStatus(String notificationTopicStatus) {
        this.notificationTopicStatus = notificationTopicStatus;
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, this parameter causes the modifications in this
     * request and any pending modifications to be applied, asynchronously and
     * as soon as possible, regardless of the
     * <code>PreferredMaintenanceWindow</code> setting for the replication
     * group.
     * </p>
     * <p>
     * If <code>false</code>, changes to the nodes in the replication group are
     * applied on the next maintenance reboot, or the next failure reboot,
     * whichever occurs first.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, this parameter causes the modifications in
     *         this request and any pending modifications to be applied,
     *         asynchronously and as soon as possible, regardless of the
     *         <code>PreferredMaintenanceWindow</code> setting for the
     *         replication group.
     *         </p>
     *         <p>
     *         If <code>false</code>, changes to the nodes in the replication
     *         group are applied on the next maintenance reboot, or the next
     *         failure reboot, whichever occurs first.
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     */
    public Boolean isApplyImmediately() {
        return applyImmediately;
    }

    /**
     * <p>
     * If <code>true</code>, this parameter causes the modifications in this
     * request and any pending modifications to be applied, asynchronously and
     * as soon as possible, regardless of the
     * <code>PreferredMaintenanceWindow</code> setting for the replication
     * group.
     * </p>
     * <p>
     * If <code>false</code>, changes to the nodes in the replication group are
     * applied on the next maintenance reboot, or the next failure reboot,
     * whichever occurs first.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, this parameter causes the modifications in
     *         this request and any pending modifications to be applied,
     *         asynchronously and as soon as possible, regardless of the
     *         <code>PreferredMaintenanceWindow</code> setting for the
     *         replication group.
     *         </p>
     *         <p>
     *         If <code>false</code>, changes to the nodes in the replication
     *         group are applied on the next maintenance reboot, or the next
     *         failure reboot, whichever occurs first.
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     */
    public Boolean getApplyImmediately() {
        return applyImmediately;
    }

    /**
     * <p>
     * If <code>true</code>, this parameter causes the modifications in this
     * request and any pending modifications to be applied, asynchronously and
     * as soon as possible, regardless of the
     * <code>PreferredMaintenanceWindow</code> setting for the replication
     * group.
     * </p>
     * <p>
     * If <code>false</code>, changes to the nodes in the replication group are
     * applied on the next maintenance reboot, or the next failure reboot,
     * whichever occurs first.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @param applyImmediately <p>
     *            If <code>true</code>, this parameter causes the modifications
     *            in this request and any pending modifications to be applied,
     *            asynchronously and as soon as possible, regardless of the
     *            <code>PreferredMaintenanceWindow</code> setting for the
     *            replication group.
     *            </p>
     *            <p>
     *            If <code>false</code>, changes to the nodes in the replication
     *            group are applied on the next maintenance reboot, or the next
     *            failure reboot, whichever occurs first.
     *            </p>
     *            <p>
     *            Valid values: <code>true</code> | <code>false</code>
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     */
    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * If <code>true</code>, this parameter causes the modifications in this
     * request and any pending modifications to be applied, asynchronously and
     * as soon as possible, regardless of the
     * <code>PreferredMaintenanceWindow</code> setting for the replication
     * group.
     * </p>
     * <p>
     * If <code>false</code>, changes to the nodes in the replication group are
     * applied on the next maintenance reboot, or the next failure reboot,
     * whichever occurs first.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applyImmediately <p>
     *            If <code>true</code>, this parameter causes the modifications
     *            in this request and any pending modifications to be applied,
     *            asynchronously and as soon as possible, regardless of the
     *            <code>PreferredMaintenanceWindow</code> setting for the
     *            replication group.
     *            </p>
     *            <p>
     *            If <code>false</code>, changes to the nodes in the replication
     *            group are applied on the next maintenance reboot, or the next
     *            failure reboot, whichever occurs first.
     *            </p>
     *            <p>
     *            Valid values: <code>true</code> | <code>false</code>
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupRequest withApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
        return this;
    }

    /**
     * <p>
     * The upgraded version of the cache engine to be run on the clusters in the
     * replication group.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     * >Selecting a Cache Engine and Version</a>), but you cannot downgrade to
     * an earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing replication group and create it anew with
     * the earlier engine version.
     * </p>
     *
     * @return <p>
     *         The upgraded version of the cache engine to be run on the
     *         clusters in the replication group.
     *         </p>
     *         <p>
     *         <b>Important:</b> You can upgrade to a newer engine version (see
     *         <a href=
     *         "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     *         >Selecting a Cache Engine and Version</a>), but you cannot
     *         downgrade to an earlier engine version. If you want to use an
     *         earlier engine version, you must delete the existing replication
     *         group and create it anew with the earlier engine version.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The upgraded version of the cache engine to be run on the clusters in the
     * replication group.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     * >Selecting a Cache Engine and Version</a>), but you cannot downgrade to
     * an earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing replication group and create it anew with
     * the earlier engine version.
     * </p>
     *
     * @param engineVersion <p>
     *            The upgraded version of the cache engine to be run on the
     *            clusters in the replication group.
     *            </p>
     *            <p>
     *            <b>Important:</b> You can upgrade to a newer engine version
     *            (see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     *            >Selecting a Cache Engine and Version</a>), but you cannot
     *            downgrade to an earlier engine version. If you want to use an
     *            earlier engine version, you must delete the existing
     *            replication group and create it anew with the earlier engine
     *            version.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The upgraded version of the cache engine to be run on the clusters in the
     * replication group.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     * >Selecting a Cache Engine and Version</a>), but you cannot downgrade to
     * an earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing replication group and create it anew with
     * the earlier engine version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The upgraded version of the cache engine to be run on the
     *            clusters in the replication group.
     *            </p>
     *            <p>
     *            <b>Important:</b> You can upgrade to a newer engine version
     *            (see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     *            >Selecting a Cache Engine and Version</a>), but you cannot
     *            downgrade to an earlier engine version. If you want to use an
     *            earlier engine version, you must delete the existing
     *            replication group and create it anew with the earlier engine
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
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
    public ModifyReplicationGroupRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic node group
     * (shard) snapshots before deleting them. For example, if you set
     * <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today
     * is retained for 5 days before being deleted.
     * </p>
     * <p>
     * <b>Important</b> If the value of SnapshotRetentionLimit is set to zero
     * (0), backups are turned off.
     * </p>
     *
     * @return <p>
     *         The number of days for which ElastiCache retains automatic node
     *         group (shard) snapshots before deleting them. For example, if you
     *         set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was
     *         taken today is retained for 5 days before being deleted.
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
     * The number of days for which ElastiCache retains automatic node group
     * (shard) snapshots before deleting them. For example, if you set
     * <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today
     * is retained for 5 days before being deleted.
     * </p>
     * <p>
     * <b>Important</b> If the value of SnapshotRetentionLimit is set to zero
     * (0), backups are turned off.
     * </p>
     *
     * @param snapshotRetentionLimit <p>
     *            The number of days for which ElastiCache retains automatic
     *            node group (shard) snapshots before deleting them. For
     *            example, if you set <code>SnapshotRetentionLimit</code> to 5,
     *            a snapshot that was taken today is retained for 5 days before
     *            being deleted.
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
     * The number of days for which ElastiCache retains automatic node group
     * (shard) snapshots before deleting them. For example, if you set
     * <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today
     * is retained for 5 days before being deleted.
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
     *            The number of days for which ElastiCache retains automatic
     *            node group (shard) snapshots before deleting them. For
     *            example, if you set <code>SnapshotRetentionLimit</code> to 5,
     *            a snapshot that was taken today is retained for 5 days before
     *            being deleted.
     *            </p>
     *            <p>
     *            <b>Important</b> If the value of SnapshotRetentionLimit is set
     *            to zero (0), backups are turned off.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupRequest withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
        return this;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a
     * daily snapshot of the node group (shard) specified by
     * <code>SnapshottingClusterId</code>.
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
     *         taking a daily snapshot of the node group (shard) specified by
     *         <code>SnapshottingClusterId</code>.
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
     * daily snapshot of the node group (shard) specified by
     * <code>SnapshottingClusterId</code>.
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
     *            taking a daily snapshot of the node group (shard) specified by
     *            <code>SnapshottingClusterId</code>.
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
     * daily snapshot of the node group (shard) specified by
     * <code>SnapshottingClusterId</code>.
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
     *            taking a daily snapshot of the node group (shard) specified by
     *            <code>SnapshottingClusterId</code>.
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
    public ModifyReplicationGroupRequest withSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
        return this;
    }

    /**
     * <p>
     * A valid cache node type that you want to scale this replication group to.
     * </p>
     *
     * @return <p>
     *         A valid cache node type that you want to scale this replication
     *         group to.
     *         </p>
     */
    public String getCacheNodeType() {
        return cacheNodeType;
    }

    /**
     * <p>
     * A valid cache node type that you want to scale this replication group to.
     * </p>
     *
     * @param cacheNodeType <p>
     *            A valid cache node type that you want to scale this
     *            replication group to.
     *            </p>
     */
    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    /**
     * <p>
     * A valid cache node type that you want to scale this replication group to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeType <p>
     *            A valid cache node type that you want to scale this
     *            replication group to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupRequest withCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
        return this;
    }

    /**
     * <p>
     * Reserved parameter. The password used to access a password protected
     * server. This parameter must be specified with the
     * <code>auth-token-update-strategy </code> parameter. Password constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be only printable ASCII characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 16 characters and no more than 128 characters in length
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot contain any of the following characters: '/', '"', or '@', '%'
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see AUTH password at <a
     * href="http://redis.io/commands/AUTH">AUTH</a>.
     * </p>
     *
     * @return <p>
     *         Reserved parameter. The password used to access a password
     *         protected server. This parameter must be specified with the
     *         <code>auth-token-update-strategy </code> parameter. Password
     *         constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be only printable ASCII characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be at least 16 characters and no more than 128 characters in
     *         length
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot contain any of the following characters: '/', '"', or '@',
     *         '%'
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see AUTH password at <a
     *         href="http://redis.io/commands/AUTH">AUTH</a>.
     *         </p>
     */
    public String getAuthToken() {
        return authToken;
    }

    /**
     * <p>
     * Reserved parameter. The password used to access a password protected
     * server. This parameter must be specified with the
     * <code>auth-token-update-strategy </code> parameter. Password constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be only printable ASCII characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 16 characters and no more than 128 characters in length
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot contain any of the following characters: '/', '"', or '@', '%'
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see AUTH password at <a
     * href="http://redis.io/commands/AUTH">AUTH</a>.
     * </p>
     *
     * @param authToken <p>
     *            Reserved parameter. The password used to access a password
     *            protected server. This parameter must be specified with the
     *            <code>auth-token-update-strategy </code> parameter. Password
     *            constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be only printable ASCII characters
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be at least 16 characters and no more than 128 characters
     *            in length
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot contain any of the following characters: '/', '"', or
     *            '@', '%'
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see AUTH password at <a
     *            href="http://redis.io/commands/AUTH">AUTH</a>.
     *            </p>
     */
    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    /**
     * <p>
     * Reserved parameter. The password used to access a password protected
     * server. This parameter must be specified with the
     * <code>auth-token-update-strategy </code> parameter. Password constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be only printable ASCII characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 16 characters and no more than 128 characters in length
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot contain any of the following characters: '/', '"', or '@', '%'
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see AUTH password at <a
     * href="http://redis.io/commands/AUTH">AUTH</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authToken <p>
     *            Reserved parameter. The password used to access a password
     *            protected server. This parameter must be specified with the
     *            <code>auth-token-update-strategy </code> parameter. Password
     *            constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be only printable ASCII characters
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be at least 16 characters and no more than 128 characters
     *            in length
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot contain any of the following characters: '/', '"', or
     *            '@', '%'
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see AUTH password at <a
     *            href="http://redis.io/commands/AUTH">AUTH</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupRequest withAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }

    /**
     * <p>
     * Specifies the strategy to use to update the AUTH token. This parameter
     * must be specified with the <code>auth-token</code> parameter. Possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Rotate
     * </p>
     * </li>
     * <li>
     * <p>
     * Set
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/auth.html"
     * >Authenticating Users with Redis AUTH</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SET, ROTATE
     *
     * @return <p>
     *         Specifies the strategy to use to update the AUTH token. This
     *         parameter must be specified with the <code>auth-token</code>
     *         parameter. Possible values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Rotate
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Set
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/auth.html"
     *         >Authenticating Users with Redis AUTH</a>
     *         </p>
     * @see AuthTokenUpdateStrategyType
     */
    public String getAuthTokenUpdateStrategy() {
        return authTokenUpdateStrategy;
    }

    /**
     * <p>
     * Specifies the strategy to use to update the AUTH token. This parameter
     * must be specified with the <code>auth-token</code> parameter. Possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Rotate
     * </p>
     * </li>
     * <li>
     * <p>
     * Set
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/auth.html"
     * >Authenticating Users with Redis AUTH</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SET, ROTATE
     *
     * @param authTokenUpdateStrategy <p>
     *            Specifies the strategy to use to update the AUTH token. This
     *            parameter must be specified with the <code>auth-token</code>
     *            parameter. Possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Rotate
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Set
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/auth.html"
     *            >Authenticating Users with Redis AUTH</a>
     *            </p>
     * @see AuthTokenUpdateStrategyType
     */
    public void setAuthTokenUpdateStrategy(String authTokenUpdateStrategy) {
        this.authTokenUpdateStrategy = authTokenUpdateStrategy;
    }

    /**
     * <p>
     * Specifies the strategy to use to update the AUTH token. This parameter
     * must be specified with the <code>auth-token</code> parameter. Possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Rotate
     * </p>
     * </li>
     * <li>
     * <p>
     * Set
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/auth.html"
     * >Authenticating Users with Redis AUTH</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SET, ROTATE
     *
     * @param authTokenUpdateStrategy <p>
     *            Specifies the strategy to use to update the AUTH token. This
     *            parameter must be specified with the <code>auth-token</code>
     *            parameter. Possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Rotate
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Set
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/auth.html"
     *            >Authenticating Users with Redis AUTH</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthTokenUpdateStrategyType
     */
    public ModifyReplicationGroupRequest withAuthTokenUpdateStrategy(String authTokenUpdateStrategy) {
        this.authTokenUpdateStrategy = authTokenUpdateStrategy;
        return this;
    }

    /**
     * <p>
     * Specifies the strategy to use to update the AUTH token. This parameter
     * must be specified with the <code>auth-token</code> parameter. Possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Rotate
     * </p>
     * </li>
     * <li>
     * <p>
     * Set
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/auth.html"
     * >Authenticating Users with Redis AUTH</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SET, ROTATE
     *
     * @param authTokenUpdateStrategy <p>
     *            Specifies the strategy to use to update the AUTH token. This
     *            parameter must be specified with the <code>auth-token</code>
     *            parameter. Possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Rotate
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Set
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/auth.html"
     *            >Authenticating Users with Redis AUTH</a>
     *            </p>
     * @see AuthTokenUpdateStrategyType
     */
    public void setAuthTokenUpdateStrategy(AuthTokenUpdateStrategyType authTokenUpdateStrategy) {
        this.authTokenUpdateStrategy = authTokenUpdateStrategy.toString();
    }

    /**
     * <p>
     * Specifies the strategy to use to update the AUTH token. This parameter
     * must be specified with the <code>auth-token</code> parameter. Possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Rotate
     * </p>
     * </li>
     * <li>
     * <p>
     * Set
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/auth.html"
     * >Authenticating Users with Redis AUTH</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SET, ROTATE
     *
     * @param authTokenUpdateStrategy <p>
     *            Specifies the strategy to use to update the AUTH token. This
     *            parameter must be specified with the <code>auth-token</code>
     *            parameter. Possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Rotate
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Set
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/auth.html"
     *            >Authenticating Users with Redis AUTH</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthTokenUpdateStrategyType
     */
    public ModifyReplicationGroupRequest withAuthTokenUpdateStrategy(
            AuthTokenUpdateStrategyType authTokenUpdateStrategy) {
        this.authTokenUpdateStrategy = authTokenUpdateStrategy.toString();
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
        if (getPrimaryClusterId() != null)
            sb.append("PrimaryClusterId: " + getPrimaryClusterId() + ",");
        if (getSnapshottingClusterId() != null)
            sb.append("SnapshottingClusterId: " + getSnapshottingClusterId() + ",");
        if (getAutomaticFailoverEnabled() != null)
            sb.append("AutomaticFailoverEnabled: " + getAutomaticFailoverEnabled() + ",");
        if (getMultiAZEnabled() != null)
            sb.append("MultiAZEnabled: " + getMultiAZEnabled() + ",");
        if (getNodeGroupId() != null)
            sb.append("NodeGroupId: " + getNodeGroupId() + ",");
        if (getCacheSecurityGroupNames() != null)
            sb.append("CacheSecurityGroupNames: " + getCacheSecurityGroupNames() + ",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getNotificationTopicArn() != null)
            sb.append("NotificationTopicArn: " + getNotificationTopicArn() + ",");
        if (getCacheParameterGroupName() != null)
            sb.append("CacheParameterGroupName: " + getCacheParameterGroupName() + ",");
        if (getNotificationTopicStatus() != null)
            sb.append("NotificationTopicStatus: " + getNotificationTopicStatus() + ",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: " + getApplyImmediately() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: " + getAutoMinorVersionUpgrade() + ",");
        if (getSnapshotRetentionLimit() != null)
            sb.append("SnapshotRetentionLimit: " + getSnapshotRetentionLimit() + ",");
        if (getSnapshotWindow() != null)
            sb.append("SnapshotWindow: " + getSnapshotWindow() + ",");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: " + getCacheNodeType() + ",");
        if (getAuthToken() != null)
            sb.append("AuthToken: " + getAuthToken() + ",");
        if (getAuthTokenUpdateStrategy() != null)
            sb.append("AuthTokenUpdateStrategy: " + getAuthTokenUpdateStrategy());
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
        hashCode = prime * hashCode
                + ((getPrimaryClusterId() == null) ? 0 : getPrimaryClusterId().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshottingClusterId() == null) ? 0 : getSnapshottingClusterId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutomaticFailoverEnabled() == null) ? 0 : getAutomaticFailoverEnabled()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMultiAZEnabled() == null) ? 0 : getMultiAZEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getNodeGroupId() == null) ? 0 : getNodeGroupId().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheSecurityGroupNames() == null) ? 0 : getCacheSecurityGroupNames()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNotificationTopicArn() == null) ? 0 : getNotificationTopicArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheParameterGroupName() == null) ? 0 : getCacheParameterGroupName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getNotificationTopicStatus() == null) ? 0 : getNotificationTopicStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
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
                + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode());
        hashCode = prime * hashCode + ((getAuthToken() == null) ? 0 : getAuthToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getAuthTokenUpdateStrategy() == null) ? 0 : getAuthTokenUpdateStrategy()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyReplicationGroupRequest == false)
            return false;
        ModifyReplicationGroupRequest other = (ModifyReplicationGroupRequest) obj;

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
        if (other.getPrimaryClusterId() == null ^ this.getPrimaryClusterId() == null)
            return false;
        if (other.getPrimaryClusterId() != null
                && other.getPrimaryClusterId().equals(this.getPrimaryClusterId()) == false)
            return false;
        if (other.getSnapshottingClusterId() == null ^ this.getSnapshottingClusterId() == null)
            return false;
        if (other.getSnapshottingClusterId() != null
                && other.getSnapshottingClusterId().equals(this.getSnapshottingClusterId()) == false)
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
        if (other.getNodeGroupId() == null ^ this.getNodeGroupId() == null)
            return false;
        if (other.getNodeGroupId() != null
                && other.getNodeGroupId().equals(this.getNodeGroupId()) == false)
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
        if (other.getPreferredMaintenanceWindow() == null
                ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null
                && other.getPreferredMaintenanceWindow().equals(
                        this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getNotificationTopicArn() == null ^ this.getNotificationTopicArn() == null)
            return false;
        if (other.getNotificationTopicArn() != null
                && other.getNotificationTopicArn().equals(this.getNotificationTopicArn()) == false)
            return false;
        if (other.getCacheParameterGroupName() == null ^ this.getCacheParameterGroupName() == null)
            return false;
        if (other.getCacheParameterGroupName() != null
                && other.getCacheParameterGroupName().equals(this.getCacheParameterGroupName()) == false)
            return false;
        if (other.getNotificationTopicStatus() == null ^ this.getNotificationTopicStatus() == null)
            return false;
        if (other.getNotificationTopicStatus() != null
                && other.getNotificationTopicStatus().equals(this.getNotificationTopicStatus()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null
                && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
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
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null)
            return false;
        if (other.getCacheNodeType() != null
                && other.getCacheNodeType().equals(this.getCacheNodeType()) == false)
            return false;
        if (other.getAuthToken() == null ^ this.getAuthToken() == null)
            return false;
        if (other.getAuthToken() != null
                && other.getAuthToken().equals(this.getAuthToken()) == false)
            return false;
        if (other.getAuthTokenUpdateStrategy() == null ^ this.getAuthTokenUpdateStrategy() == null)
            return false;
        if (other.getAuthTokenUpdateStrategy() != null
                && other.getAuthTokenUpdateStrategy().equals(this.getAuthTokenUpdateStrategy()) == false)
            return false;
        return true;
    }
}
