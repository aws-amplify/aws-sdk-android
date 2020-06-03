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
 * Contains all of the attributes of a specific Redis replication group.
 * </p>
 */
public class ReplicationGroup implements Serializable {
    /**
     * <p>
     * The identifier for the replication group.
     * </p>
     */
    private String replicationGroupId;

    /**
     * <p>
     * The user supplied description of the replication group.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of the Global Datastore and role of this replication group in
     * the Global Datastore.
     * </p>
     */
    private GlobalReplicationGroupInfo globalReplicationGroupInfo;

    /**
     * <p>
     * The current state of this replication group - <code>creating</code>,
     * <code>available</code>, <code>modifying</code>, <code>deleting</code>,
     * <code>create-failed</code>, <code>snapshotting</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * A group of settings to be applied to the replication group, either
     * immediately or during the next maintenance window.
     * </p>
     */
    private ReplicationGroupPendingModifiedValues pendingModifiedValues;

    /**
     * <p>
     * The names of all the cache clusters that are part of this replication
     * group.
     * </p>
     */
    private java.util.List<String> memberClusters;

    /**
     * <p>
     * A list of node groups in this replication group. For Redis (cluster mode
     * disabled) replication groups, this is a single-element list. For Redis
     * (cluster mode enabled) replication groups, the list contains an entry for
     * each node group (shard).
     * </p>
     */
    private java.util.List<NodeGroup> nodeGroups;

    /**
     * <p>
     * The cluster ID that is used as the daily snapshot source for the
     * replication group.
     * </p>
     */
    private String snapshottingClusterId;

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for this Redis
     * replication group.
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
     * The new value for the multiAZ property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled
     */
    private String multiAZ;

    /**
     * <p>
     * The configuration endpoint for this replication group. Use the
     * configuration endpoint to connect to this replication group.
     * </p>
     */
    private Endpoint configurationEndpoint;

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic cluster
     * snapshots before deleting them. For example, if you set
     * <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today
     * is retained for 5 days before being deleted.
     * </p>
     * <important>
     * <p>
     * If the value of <code>SnapshotRetentionLimit</code> is set to zero (0),
     * backups are turned off.
     * </p>
     * </important>
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
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     * </p>
     * </note>
     */
    private String snapshotWindow;

    /**
     * <p>
     * A flag indicating whether or not this replication group is cluster
     * enabled; i.e., whether its data can be partitioned across multiple shards
     * (API/CLI: node groups).
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean clusterEnabled;

    /**
     * <p>
     * The name of the compute and memory capacity node type for each node in
     * the replication group.
     * </p>
     */
    private String cacheNodeType;

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
     * the cluster is created. To enable encryption at-rest on a cluster you
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
     * The ID of the KMS key used to encrypt the disk in the cluster.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the replication group.
     * </p>
     */
    private String aRN;

    /**
     * <p>
     * The identifier for the replication group.
     * </p>
     *
     * @return <p>
     *         The identifier for the replication group.
     *         </p>
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }

    /**
     * <p>
     * The identifier for the replication group.
     * </p>
     *
     * @param replicationGroupId <p>
     *            The identifier for the replication group.
     *            </p>
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The identifier for the replication group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupId <p>
     *            The identifier for the replication group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationGroup withReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
        return this;
    }

    /**
     * <p>
     * The user supplied description of the replication group.
     * </p>
     *
     * @return <p>
     *         The user supplied description of the replication group.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The user supplied description of the replication group.
     * </p>
     *
     * @param description <p>
     *            The user supplied description of the replication group.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The user supplied description of the replication group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The user supplied description of the replication group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The name of the Global Datastore and role of this replication group in
     * the Global Datastore.
     * </p>
     *
     * @return <p>
     *         The name of the Global Datastore and role of this replication
     *         group in the Global Datastore.
     *         </p>
     */
    public GlobalReplicationGroupInfo getGlobalReplicationGroupInfo() {
        return globalReplicationGroupInfo;
    }

    /**
     * <p>
     * The name of the Global Datastore and role of this replication group in
     * the Global Datastore.
     * </p>
     *
     * @param globalReplicationGroupInfo <p>
     *            The name of the Global Datastore and role of this replication
     *            group in the Global Datastore.
     *            </p>
     */
    public void setGlobalReplicationGroupInfo(GlobalReplicationGroupInfo globalReplicationGroupInfo) {
        this.globalReplicationGroupInfo = globalReplicationGroupInfo;
    }

    /**
     * <p>
     * The name of the Global Datastore and role of this replication group in
     * the Global Datastore.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalReplicationGroupInfo <p>
     *            The name of the Global Datastore and role of this replication
     *            group in the Global Datastore.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationGroup withGlobalReplicationGroupInfo(
            GlobalReplicationGroupInfo globalReplicationGroupInfo) {
        this.globalReplicationGroupInfo = globalReplicationGroupInfo;
        return this;
    }

    /**
     * <p>
     * The current state of this replication group - <code>creating</code>,
     * <code>available</code>, <code>modifying</code>, <code>deleting</code>,
     * <code>create-failed</code>, <code>snapshotting</code>.
     * </p>
     *
     * @return <p>
     *         The current state of this replication group -
     *         <code>creating</code>, <code>available</code>,
     *         <code>modifying</code>, <code>deleting</code>,
     *         <code>create-failed</code>, <code>snapshotting</code>.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current state of this replication group - <code>creating</code>,
     * <code>available</code>, <code>modifying</code>, <code>deleting</code>,
     * <code>create-failed</code>, <code>snapshotting</code>.
     * </p>
     *
     * @param status <p>
     *            The current state of this replication group -
     *            <code>creating</code>, <code>available</code>,
     *            <code>modifying</code>, <code>deleting</code>,
     *            <code>create-failed</code>, <code>snapshotting</code>.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of this replication group - <code>creating</code>,
     * <code>available</code>, <code>modifying</code>, <code>deleting</code>,
     * <code>create-failed</code>, <code>snapshotting</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current state of this replication group -
     *            <code>creating</code>, <code>available</code>,
     *            <code>modifying</code>, <code>deleting</code>,
     *            <code>create-failed</code>, <code>snapshotting</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationGroup withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * A group of settings to be applied to the replication group, either
     * immediately or during the next maintenance window.
     * </p>
     *
     * @return <p>
     *         A group of settings to be applied to the replication group,
     *         either immediately or during the next maintenance window.
     *         </p>
     */
    public ReplicationGroupPendingModifiedValues getPendingModifiedValues() {
        return pendingModifiedValues;
    }

    /**
     * <p>
     * A group of settings to be applied to the replication group, either
     * immediately or during the next maintenance window.
     * </p>
     *
     * @param pendingModifiedValues <p>
     *            A group of settings to be applied to the replication group,
     *            either immediately or during the next maintenance window.
     *            </p>
     */
    public void setPendingModifiedValues(ReplicationGroupPendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }

    /**
     * <p>
     * A group of settings to be applied to the replication group, either
     * immediately or during the next maintenance window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pendingModifiedValues <p>
     *            A group of settings to be applied to the replication group,
     *            either immediately or during the next maintenance window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationGroup withPendingModifiedValues(
            ReplicationGroupPendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
        return this;
    }

    /**
     * <p>
     * The names of all the cache clusters that are part of this replication
     * group.
     * </p>
     *
     * @return <p>
     *         The names of all the cache clusters that are part of this
     *         replication group.
     *         </p>
     */
    public java.util.List<String> getMemberClusters() {
        return memberClusters;
    }

    /**
     * <p>
     * The names of all the cache clusters that are part of this replication
     * group.
     * </p>
     *
     * @param memberClusters <p>
     *            The names of all the cache clusters that are part of this
     *            replication group.
     *            </p>
     */
    public void setMemberClusters(java.util.Collection<String> memberClusters) {
        if (memberClusters == null) {
            this.memberClusters = null;
            return;
        }

        this.memberClusters = new java.util.ArrayList<String>(memberClusters);
    }

    /**
     * <p>
     * The names of all the cache clusters that are part of this replication
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memberClusters <p>
     *            The names of all the cache clusters that are part of this
     *            replication group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationGroup withMemberClusters(String... memberClusters) {
        if (getMemberClusters() == null) {
            this.memberClusters = new java.util.ArrayList<String>(memberClusters.length);
        }
        for (String value : memberClusters) {
            this.memberClusters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of all the cache clusters that are part of this replication
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memberClusters <p>
     *            The names of all the cache clusters that are part of this
     *            replication group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationGroup withMemberClusters(java.util.Collection<String> memberClusters) {
        setMemberClusters(memberClusters);
        return this;
    }

    /**
     * <p>
     * A list of node groups in this replication group. For Redis (cluster mode
     * disabled) replication groups, this is a single-element list. For Redis
     * (cluster mode enabled) replication groups, the list contains an entry for
     * each node group (shard).
     * </p>
     *
     * @return <p>
     *         A list of node groups in this replication group. For Redis
     *         (cluster mode disabled) replication groups, this is a
     *         single-element list. For Redis (cluster mode enabled) replication
     *         groups, the list contains an entry for each node group (shard).
     *         </p>
     */
    public java.util.List<NodeGroup> getNodeGroups() {
        return nodeGroups;
    }

    /**
     * <p>
     * A list of node groups in this replication group. For Redis (cluster mode
     * disabled) replication groups, this is a single-element list. For Redis
     * (cluster mode enabled) replication groups, the list contains an entry for
     * each node group (shard).
     * </p>
     *
     * @param nodeGroups <p>
     *            A list of node groups in this replication group. For Redis
     *            (cluster mode disabled) replication groups, this is a
     *            single-element list. For Redis (cluster mode enabled)
     *            replication groups, the list contains an entry for each node
     *            group (shard).
     *            </p>
     */
    public void setNodeGroups(java.util.Collection<NodeGroup> nodeGroups) {
        if (nodeGroups == null) {
            this.nodeGroups = null;
            return;
        }

        this.nodeGroups = new java.util.ArrayList<NodeGroup>(nodeGroups);
    }

    /**
     * <p>
     * A list of node groups in this replication group. For Redis (cluster mode
     * disabled) replication groups, this is a single-element list. For Redis
     * (cluster mode enabled) replication groups, the list contains an entry for
     * each node group (shard).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeGroups <p>
     *            A list of node groups in this replication group. For Redis
     *            (cluster mode disabled) replication groups, this is a
     *            single-element list. For Redis (cluster mode enabled)
     *            replication groups, the list contains an entry for each node
     *            group (shard).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationGroup withNodeGroups(NodeGroup... nodeGroups) {
        if (getNodeGroups() == null) {
            this.nodeGroups = new java.util.ArrayList<NodeGroup>(nodeGroups.length);
        }
        for (NodeGroup value : nodeGroups) {
            this.nodeGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of node groups in this replication group. For Redis (cluster mode
     * disabled) replication groups, this is a single-element list. For Redis
     * (cluster mode enabled) replication groups, the list contains an entry for
     * each node group (shard).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeGroups <p>
     *            A list of node groups in this replication group. For Redis
     *            (cluster mode disabled) replication groups, this is a
     *            single-element list. For Redis (cluster mode enabled)
     *            replication groups, the list contains an entry for each node
     *            group (shard).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationGroup withNodeGroups(java.util.Collection<NodeGroup> nodeGroups) {
        setNodeGroups(nodeGroups);
        return this;
    }

    /**
     * <p>
     * The cluster ID that is used as the daily snapshot source for the
     * replication group.
     * </p>
     *
     * @return <p>
     *         The cluster ID that is used as the daily snapshot source for the
     *         replication group.
     *         </p>
     */
    public String getSnapshottingClusterId() {
        return snapshottingClusterId;
    }

    /**
     * <p>
     * The cluster ID that is used as the daily snapshot source for the
     * replication group.
     * </p>
     *
     * @param snapshottingClusterId <p>
     *            The cluster ID that is used as the daily snapshot source for
     *            the replication group.
     *            </p>
     */
    public void setSnapshottingClusterId(String snapshottingClusterId) {
        this.snapshottingClusterId = snapshottingClusterId;
    }

    /**
     * <p>
     * The cluster ID that is used as the daily snapshot source for the
     * replication group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshottingClusterId <p>
     *            The cluster ID that is used as the daily snapshot source for
     *            the replication group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationGroup withSnapshottingClusterId(String snapshottingClusterId) {
        this.snapshottingClusterId = snapshottingClusterId;
        return this;
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for this Redis
     * replication group.
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
     *         Indicates the status of Multi-AZ with automatic failover for this
     *         Redis replication group.
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
     * Indicates the status of Multi-AZ with automatic failover for this Redis
     * replication group.
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
     *            this Redis replication group.
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
     * Indicates the status of Multi-AZ with automatic failover for this Redis
     * replication group.
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
     *            this Redis replication group.
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
    public ReplicationGroup withAutomaticFailover(String automaticFailover) {
        this.automaticFailover = automaticFailover;
        return this;
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for this Redis
     * replication group.
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
     *            this Redis replication group.
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
     * Indicates the status of Multi-AZ with automatic failover for this Redis
     * replication group.
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
     *            this Redis replication group.
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
    public ReplicationGroup withAutomaticFailover(AutomaticFailoverStatus automaticFailover) {
        this.automaticFailover = automaticFailover.toString();
        return this;
    }

    /**
     * Returns the value of the multiAZ property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled
     *
     * @return The value of the multiAZ property for this object.
     * @see MultiAZStatus
     */
    public String getMultiAZ() {
        return multiAZ;
    }

    /**
     * Sets the value of multiAZ
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled
     *
     * @param multiAZ The new value for the multiAZ property for this object.
     * @see MultiAZStatus
     */
    public void setMultiAZ(String multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * Sets the value of the multiAZ property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled
     *
     * @param multiAZ The new value for the multiAZ property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MultiAZStatus
     */
    public ReplicationGroup withMultiAZ(String multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }

    /**
     * Sets the value of multiAZ
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled
     *
     * @param multiAZ The new value for the multiAZ property for this object.
     * @see MultiAZStatus
     */
    public void setMultiAZ(MultiAZStatus multiAZ) {
        this.multiAZ = multiAZ.toString();
    }

    /**
     * Sets the value of the multiAZ property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled
     *
     * @param multiAZ The new value for the multiAZ property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MultiAZStatus
     */
    public ReplicationGroup withMultiAZ(MultiAZStatus multiAZ) {
        this.multiAZ = multiAZ.toString();
        return this;
    }

    /**
     * <p>
     * The configuration endpoint for this replication group. Use the
     * configuration endpoint to connect to this replication group.
     * </p>
     *
     * @return <p>
     *         The configuration endpoint for this replication group. Use the
     *         configuration endpoint to connect to this replication group.
     *         </p>
     */
    public Endpoint getConfigurationEndpoint() {
        return configurationEndpoint;
    }

    /**
     * <p>
     * The configuration endpoint for this replication group. Use the
     * configuration endpoint to connect to this replication group.
     * </p>
     *
     * @param configurationEndpoint <p>
     *            The configuration endpoint for this replication group. Use the
     *            configuration endpoint to connect to this replication group.
     *            </p>
     */
    public void setConfigurationEndpoint(Endpoint configurationEndpoint) {
        this.configurationEndpoint = configurationEndpoint;
    }

    /**
     * <p>
     * The configuration endpoint for this replication group. Use the
     * configuration endpoint to connect to this replication group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationEndpoint <p>
     *            The configuration endpoint for this replication group. Use the
     *            configuration endpoint to connect to this replication group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationGroup withConfigurationEndpoint(Endpoint configurationEndpoint) {
        this.configurationEndpoint = configurationEndpoint;
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
     * If the value of <code>SnapshotRetentionLimit</code> is set to zero (0),
     * backups are turned off.
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
     *         If the value of <code>SnapshotRetentionLimit</code> is set to
     *         zero (0), backups are turned off.
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
     * If the value of <code>SnapshotRetentionLimit</code> is set to zero (0),
     * backups are turned off.
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
     *            If the value of <code>SnapshotRetentionLimit</code> is set to
     *            zero (0), backups are turned off.
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
     * If the value of <code>SnapshotRetentionLimit</code> is set to zero (0),
     * backups are turned off.
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
     *            If the value of <code>SnapshotRetentionLimit</code> is set to
     *            zero (0), backups are turned off.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationGroup withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
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
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     * </p>
     * </note>
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
     *         <note>
     *         <p>
     *         This parameter is only valid if the <code>Engine</code> parameter
     *         is <code>redis</code>.
     *         </p>
     *         </note>
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
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     * </p>
     * </note>
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
     *            <note>
     *            <p>
     *            This parameter is only valid if the <code>Engine</code>
     *            parameter is <code>redis</code>.
     *            </p>
     *            </note>
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
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     * </p>
     * </note>
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
     *            <note>
     *            <p>
     *            This parameter is only valid if the <code>Engine</code>
     *            parameter is <code>redis</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationGroup withSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
        return this;
    }

    /**
     * <p>
     * A flag indicating whether or not this replication group is cluster
     * enabled; i.e., whether its data can be partitioned across multiple shards
     * (API/CLI: node groups).
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @return <p>
     *         A flag indicating whether or not this replication group is
     *         cluster enabled; i.e., whether its data can be partitioned across
     *         multiple shards (API/CLI: node groups).
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     */
    public Boolean isClusterEnabled() {
        return clusterEnabled;
    }

    /**
     * <p>
     * A flag indicating whether or not this replication group is cluster
     * enabled; i.e., whether its data can be partitioned across multiple shards
     * (API/CLI: node groups).
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @return <p>
     *         A flag indicating whether or not this replication group is
     *         cluster enabled; i.e., whether its data can be partitioned across
     *         multiple shards (API/CLI: node groups).
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     */
    public Boolean getClusterEnabled() {
        return clusterEnabled;
    }

    /**
     * <p>
     * A flag indicating whether or not this replication group is cluster
     * enabled; i.e., whether its data can be partitioned across multiple shards
     * (API/CLI: node groups).
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @param clusterEnabled <p>
     *            A flag indicating whether or not this replication group is
     *            cluster enabled; i.e., whether its data can be partitioned
     *            across multiple shards (API/CLI: node groups).
     *            </p>
     *            <p>
     *            Valid values: <code>true</code> | <code>false</code>
     *            </p>
     */
    public void setClusterEnabled(Boolean clusterEnabled) {
        this.clusterEnabled = clusterEnabled;
    }

    /**
     * <p>
     * A flag indicating whether or not this replication group is cluster
     * enabled; i.e., whether its data can be partitioned across multiple shards
     * (API/CLI: node groups).
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterEnabled <p>
     *            A flag indicating whether or not this replication group is
     *            cluster enabled; i.e., whether its data can be partitioned
     *            across multiple shards (API/CLI: node groups).
     *            </p>
     *            <p>
     *            Valid values: <code>true</code> | <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationGroup withClusterEnabled(Boolean clusterEnabled) {
        this.clusterEnabled = clusterEnabled;
        return this;
    }

    /**
     * <p>
     * The name of the compute and memory capacity node type for each node in
     * the replication group.
     * </p>
     *
     * @return <p>
     *         The name of the compute and memory capacity node type for each
     *         node in the replication group.
     *         </p>
     */
    public String getCacheNodeType() {
        return cacheNodeType;
    }

    /**
     * <p>
     * The name of the compute and memory capacity node type for each node in
     * the replication group.
     * </p>
     *
     * @param cacheNodeType <p>
     *            The name of the compute and memory capacity node type for each
     *            node in the replication group.
     *            </p>
     */
    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    /**
     * <p>
     * The name of the compute and memory capacity node type for each node in
     * the replication group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeType <p>
     *            The name of the compute and memory capacity node type for each
     *            node in the replication group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationGroup withCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
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
    public ReplicationGroup withAuthTokenEnabled(Boolean authTokenEnabled) {
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
    public ReplicationGroup withAuthTokenLastModifiedDate(java.util.Date authTokenLastModifiedDate) {
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
    public ReplicationGroup withTransitEncryptionEnabled(Boolean transitEncryptionEnabled) {
        this.transitEncryptionEnabled = transitEncryptionEnabled;
        return this;
    }

    /**
     * <p>
     * A flag that enables encryption at-rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after
     * the cluster is created. To enable encryption at-rest on a cluster you
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
     *         created. To enable encryption at-rest on a cluster you must set
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
     * the cluster is created. To enable encryption at-rest on a cluster you
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
     *         created. To enable encryption at-rest on a cluster you must set
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
     * the cluster is created. To enable encryption at-rest on a cluster you
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
     *            created. To enable encryption at-rest on a cluster you must
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
     * the cluster is created. To enable encryption at-rest on a cluster you
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
     *            created. To enable encryption at-rest on a cluster you must
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
    public ReplicationGroup withAtRestEncryptionEnabled(Boolean atRestEncryptionEnabled) {
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
    public ReplicationGroup withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the replication group.
     * </p>
     *
     * @return <p>
     *         The ARN (Amazon Resource Name) of the replication group.
     *         </p>
     */
    public String getARN() {
        return aRN;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the replication group.
     * </p>
     *
     * @param aRN <p>
     *            The ARN (Amazon Resource Name) of the replication group.
     *            </p>
     */
    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the replication group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aRN <p>
     *            The ARN (Amazon Resource Name) of the replication group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationGroup withARN(String aRN) {
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
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: " + getReplicationGroupId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getGlobalReplicationGroupInfo() != null)
            sb.append("GlobalReplicationGroupInfo: " + getGlobalReplicationGroupInfo() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getPendingModifiedValues() != null)
            sb.append("PendingModifiedValues: " + getPendingModifiedValues() + ",");
        if (getMemberClusters() != null)
            sb.append("MemberClusters: " + getMemberClusters() + ",");
        if (getNodeGroups() != null)
            sb.append("NodeGroups: " + getNodeGroups() + ",");
        if (getSnapshottingClusterId() != null)
            sb.append("SnapshottingClusterId: " + getSnapshottingClusterId() + ",");
        if (getAutomaticFailover() != null)
            sb.append("AutomaticFailover: " + getAutomaticFailover() + ",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: " + getMultiAZ() + ",");
        if (getConfigurationEndpoint() != null)
            sb.append("ConfigurationEndpoint: " + getConfigurationEndpoint() + ",");
        if (getSnapshotRetentionLimit() != null)
            sb.append("SnapshotRetentionLimit: " + getSnapshotRetentionLimit() + ",");
        if (getSnapshotWindow() != null)
            sb.append("SnapshotWindow: " + getSnapshotWindow() + ",");
        if (getClusterEnabled() != null)
            sb.append("ClusterEnabled: " + getClusterEnabled() + ",");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: " + getCacheNodeType() + ",");
        if (getAuthTokenEnabled() != null)
            sb.append("AuthTokenEnabled: " + getAuthTokenEnabled() + ",");
        if (getAuthTokenLastModifiedDate() != null)
            sb.append("AuthTokenLastModifiedDate: " + getAuthTokenLastModifiedDate() + ",");
        if (getTransitEncryptionEnabled() != null)
            sb.append("TransitEncryptionEnabled: " + getTransitEncryptionEnabled() + ",");
        if (getAtRestEncryptionEnabled() != null)
            sb.append("AtRestEncryptionEnabled: " + getAtRestEncryptionEnabled() + ",");
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
                + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getGlobalReplicationGroupInfo() == null) ? 0 : getGlobalReplicationGroupInfo()
                        .hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getPendingModifiedValues() == null) ? 0 : getPendingModifiedValues().hashCode());
        hashCode = prime * hashCode
                + ((getMemberClusters() == null) ? 0 : getMemberClusters().hashCode());
        hashCode = prime * hashCode + ((getNodeGroups() == null) ? 0 : getNodeGroups().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshottingClusterId() == null) ? 0 : getSnapshottingClusterId().hashCode());
        hashCode = prime * hashCode
                + ((getAutomaticFailover() == null) ? 0 : getAutomaticFailover().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime
                * hashCode
                + ((getConfigurationEndpoint() == null) ? 0 : getConfigurationEndpoint().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotRetentionLimit() == null) ? 0 : getSnapshotRetentionLimit()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotWindow() == null) ? 0 : getSnapshotWindow().hashCode());
        hashCode = prime * hashCode
                + ((getClusterEnabled() == null) ? 0 : getClusterEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode());
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

        if (obj instanceof ReplicationGroup == false)
            return false;
        ReplicationGroup other = (ReplicationGroup) obj;

        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null
                && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getGlobalReplicationGroupInfo() == null
                ^ this.getGlobalReplicationGroupInfo() == null)
            return false;
        if (other.getGlobalReplicationGroupInfo() != null
                && other.getGlobalReplicationGroupInfo().equals(
                        this.getGlobalReplicationGroupInfo()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPendingModifiedValues() == null ^ this.getPendingModifiedValues() == null)
            return false;
        if (other.getPendingModifiedValues() != null
                && other.getPendingModifiedValues().equals(this.getPendingModifiedValues()) == false)
            return false;
        if (other.getMemberClusters() == null ^ this.getMemberClusters() == null)
            return false;
        if (other.getMemberClusters() != null
                && other.getMemberClusters().equals(this.getMemberClusters()) == false)
            return false;
        if (other.getNodeGroups() == null ^ this.getNodeGroups() == null)
            return false;
        if (other.getNodeGroups() != null
                && other.getNodeGroups().equals(this.getNodeGroups()) == false)
            return false;
        if (other.getSnapshottingClusterId() == null ^ this.getSnapshottingClusterId() == null)
            return false;
        if (other.getSnapshottingClusterId() != null
                && other.getSnapshottingClusterId().equals(this.getSnapshottingClusterId()) == false)
            return false;
        if (other.getAutomaticFailover() == null ^ this.getAutomaticFailover() == null)
            return false;
        if (other.getAutomaticFailover() != null
                && other.getAutomaticFailover().equals(this.getAutomaticFailover()) == false)
            return false;
        if (other.getMultiAZ() == null ^ this.getMultiAZ() == null)
            return false;
        if (other.getMultiAZ() != null && other.getMultiAZ().equals(this.getMultiAZ()) == false)
            return false;
        if (other.getConfigurationEndpoint() == null ^ this.getConfigurationEndpoint() == null)
            return false;
        if (other.getConfigurationEndpoint() != null
                && other.getConfigurationEndpoint().equals(this.getConfigurationEndpoint()) == false)
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
        if (other.getClusterEnabled() == null ^ this.getClusterEnabled() == null)
            return false;
        if (other.getClusterEnabled() != null
                && other.getClusterEnabled().equals(this.getClusterEnabled()) == false)
            return false;
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null)
            return false;
        if (other.getCacheNodeType() != null
                && other.getCacheNodeType().equals(this.getCacheNodeType()) == false)
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
