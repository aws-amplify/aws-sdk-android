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
 * Modifies the settings for a cluster. You can use this operation to change one
 * or more cluster configuration parameters by specifying the parameters and the
 * new values.
 * </p>
 */
public class ModifyCacheClusterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The cluster identifier. This value is stored as a lowercase string.
     * </p>
     */
    private String cacheClusterId;

    /**
     * <p>
     * The number of cache nodes that the cluster should have. If the value for
     * <code>NumCacheNodes</code> is greater than the sum of the number of
     * current cache nodes and the number of cache nodes pending creation (which
     * may be zero), more nodes are added. If the value is less than the number
     * of existing cache nodes, nodes are removed. If the value is equal to the
     * number of current cache nodes, any pending add or remove requests are
     * canceled.
     * </p>
     * <p>
     * If you are removing cache nodes, you must use the
     * <code>CacheNodeIdsToRemove</code> parameter to provide the IDs of the
     * specific cache nodes to remove.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running
     * Memcached, this value must be between 1 and 20.
     * </p>
     * <note>
     * <p>
     * Adding or removing Memcached cache nodes can be applied immediately or as
     * a pending operation (see <code>ApplyImmediately</code>).
     * </p>
     * <p>
     * A pending operation to modify the number of cache nodes in a cluster
     * during its maintenance window, whether by adding or removing nodes in
     * accordance with the scale out architecture, is not queued. The customer's
     * latest request to add or remove nodes to the cluster overrides any
     * previous pending operations to modify the number of cache nodes in the
     * cluster. For example, a request to remove 2 nodes would override a
     * previous pending operation to remove 3 nodes. Similarly, a request to add
     * 2 nodes would override a previous pending operation to remove 3 nodes and
     * vice versa. As Memcached cache nodes may now be provisioned in different
     * Availability Zones with flexible cache node placement, a request to add
     * nodes does not automatically override a previous pending operation to add
     * nodes. The customer can modify the previous pending operation to add more
     * nodes or explicitly cancel the pending request and retry the new request.
     * To cancel pending operations to modify the number of cache nodes in a
     * cluster, use the <code>ModifyCacheCluster</code> request and set
     * <code>NumCacheNodes</code> equal to the number of cache nodes currently
     * in the cluster.
     * </p>
     * </note>
     */
    private Integer numCacheNodes;

    /**
     * <p>
     * A list of cache node IDs to be removed. A node ID is a numeric identifier
     * (0001, 0002, etc.). This parameter is only valid when
     * <code>NumCacheNodes</code> is less than the existing number of cache
     * nodes. The number of cache node IDs supplied in this parameter must match
     * the difference between the existing number of cache nodes in the cluster
     * or pending cache nodes, whichever is greater, and the value of
     * <code>NumCacheNodes</code> in the request.
     * </p>
     * <p>
     * For example: If you have 3 active cache nodes, 7 pending cache nodes, and
     * the number of cache nodes in this <code>ModifyCacheCluster</code> call is
     * 5, you must list 2 (7 - 5) cache node IDs to remove.
     * </p>
     */
    private java.util.List<String> cacheNodeIdsToRemove;

    /**
     * <p>
     * Specifies whether the new nodes in this Memcached cluster are all created
     * in a single Availability Zone or created across multiple Availability
     * Zones.
     * </p>
     * <p>
     * Valid values: <code>single-az</code> | <code>cross-az</code>.
     * </p>
     * <p>
     * This option is only supported for Memcached clusters.
     * </p>
     * <note>
     * <p>
     * You cannot specify <code>single-az</code> if the Memcached cluster
     * already has cache nodes in different Availability Zones. If
     * <code>cross-az</code> is specified, existing Memcached nodes remain in
     * their current Availability Zone.
     * </p>
     * <p>
     * Only newly created nodes are located in different Availability Zones.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>single-az, cross-az
     */
    private String aZMode;

    /**
     * <p>
     * The list of Availability Zones where the new Memcached cache nodes are
     * created.
     * </p>
     * <p>
     * This parameter is only valid when <code>NumCacheNodes</code> in the
     * request is greater than the sum of the number of active cache nodes and
     * the number of cache nodes pending creation (which may be zero). The
     * number of Availability Zones supplied in this list must match the cache
     * nodes being added in this request.
     * </p>
     * <p>
     * This option is only supported on Memcached clusters.
     * </p>
     * <p>
     * Scenarios:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Scenario 1:</b> You have 3 active nodes and wish to add 2 nodes.
     * Specify <code>NumCacheNodes=5</code> (3 + 2) and optionally specify two
     * Availability Zones for the two new nodes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Scenario 2:</b> You have 3 active nodes and 2 nodes pending creation
     * (from the scenario 1 call) and want to add 1 more node. Specify
     * <code>NumCacheNodes=6</code> ((3 + 2) + 1) and optionally specify an
     * Availability Zone for the new node.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Scenario 3:</b> You want to cancel all pending operations. Specify
     * <code>NumCacheNodes=3</code> to cancel all pending operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The Availability Zone placement of nodes pending creation cannot be
     * modified. If you wish to cancel any nodes pending creation, add 0 nodes
     * by setting <code>NumCacheNodes</code> to the number of current nodes.
     * </p>
     * <p>
     * If <code>cross-az</code> is specified, existing Memcached nodes remain in
     * their current Availability Zone. Only newly created nodes can be located
     * in different Availability Zones. For guidance on how to move existing
     * Memcached nodes to different Availability Zones, see the <b>Availability
     * Zone Considerations</b> section of <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/CacheNodes.SupportedTypes.html"
     * >Cache Node Considerations for Memcached</a>.
     * </p>
     * <p>
     * <b>Impact of new add/remove requests upon pending requests</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Scenario-1
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending Action: Delete
     * </p>
     * </li>
     * <li>
     * <p>
     * New Request: Delete
     * </p>
     * </li>
     * <li>
     * <p>
     * Result: The new delete, pending or immediate, replaces the pending
     * delete.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Scenario-2
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending Action: Delete
     * </p>
     * </li>
     * <li>
     * <p>
     * New Request: Create
     * </p>
     * </li>
     * <li>
     * <p>
     * Result: The new create, pending or immediate, replaces the pending
     * delete.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Scenario-3
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending Action: Create
     * </p>
     * </li>
     * <li>
     * <p>
     * New Request: Delete
     * </p>
     * </li>
     * <li>
     * <p>
     * Result: The new delete, pending or immediate, replaces the pending
     * create.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Scenario-4
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending Action: Create
     * </p>
     * </li>
     * <li>
     * <p>
     * New Request: Create
     * </p>
     * </li>
     * <li>
     * <p>
     * Result: The new create is added to the pending create.
     * </p>
     * <important>
     * <p>
     * <b>Important:</b> If the new create request is <b>Apply Immediately -
     * Yes</b>, all creates are performed immediately. If the new create request
     * is <b>Apply Immediately - No</b>, all creates are pending.
     * </p>
     * </important></li>
     * </ul>
     * </li>
     * </ul>
     */
    private java.util.List<String> newAvailabilityZones;

    /**
     * <p>
     * A list of cache security group names to authorize on this cluster. This
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * You can use this parameter only with clusters that are created outside of
     * an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters. Must
     * not be "Default".
     * </p>
     */
    private java.util.List<String> cacheSecurityGroupNames;

    /**
     * <p>
     * Specifies the VPC Security Groups associated with the cluster.
     * </p>
     * <p>
     * This parameter can be used only with clusters that are created in an
     * Amazon Virtual Private Cloud (Amazon VPC).
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
     * The Amazon SNS topic owner must be same as the cluster owner.
     * </p>
     * </note>
     */
    private String notificationTopicArn;

    /**
     * <p>
     * The name of the cache parameter group to apply to this cluster. This
     * change is asynchronously applied as soon as possible for parameters when
     * the <code>ApplyImmediately</code> parameter is specified as
     * <code>true</code> for this request.
     * </p>
     */
    private String cacheParameterGroupName;

    /**
     * <p>
     * The status of the Amazon SNS notification topic. Notifications are sent
     * only if the status is <code>active</code>.
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
     * <code>PreferredMaintenanceWindow</code> setting for the cluster.
     * </p>
     * <p>
     * If <code>false</code>, changes to the cluster are applied on the next
     * maintenance reboot, or the next failure reboot, whichever occurs first.
     * </p>
     * <important>
     * <p>
     * If you perform a <code>ModifyCacheCluster</code> before a pending
     * modification is applied, the pending modification is replaced by the
     * newer modification.
     * </p>
     * </important>
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
     * The upgraded version of the cache engine to be run on the cache nodes.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     * >Selecting a Cache Engine and Version</a>), but you cannot downgrade to
     * an earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing cluster and create it anew with the earlier
     * engine version.
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
     * The number of days for which ElastiCache retains automatic cluster
     * snapshots before deleting them. For example, if you set
     * <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today
     * is retained for 5 days before being deleted.
     * </p>
     * <note>
     * <p>
     * If the value of <code>SnapshotRetentionLimit</code> is set to zero (0),
     * backups are turned off.
     * </p>
     * </note>
     */
    private Integer snapshotRetentionLimit;

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a
     * daily snapshot of your cluster.
     * </p>
     */
    private String snapshotWindow;

    /**
     * <p>
     * A valid cache node type that you want to scale this cluster up to.
     * </p>
     */
    private String cacheNodeType;

    /**
     * <p>
     * Reserved parameter. The password used to access a password protected
     * server. This parameter must be specified with the
     * <code>auth-token-update</code> parameter. Password constraints:
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
     * The cluster identifier. This value is stored as a lowercase string.
     * </p>
     *
     * @return <p>
     *         The cluster identifier. This value is stored as a lowercase
     *         string.
     *         </p>
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }

    /**
     * <p>
     * The cluster identifier. This value is stored as a lowercase string.
     * </p>
     *
     * @param cacheClusterId <p>
     *            The cluster identifier. This value is stored as a lowercase
     *            string.
     *            </p>
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * The cluster identifier. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheClusterId <p>
     *            The cluster identifier. This value is stored as a lowercase
     *            string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCacheClusterRequest withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
        return this;
    }

    /**
     * <p>
     * The number of cache nodes that the cluster should have. If the value for
     * <code>NumCacheNodes</code> is greater than the sum of the number of
     * current cache nodes and the number of cache nodes pending creation (which
     * may be zero), more nodes are added. If the value is less than the number
     * of existing cache nodes, nodes are removed. If the value is equal to the
     * number of current cache nodes, any pending add or remove requests are
     * canceled.
     * </p>
     * <p>
     * If you are removing cache nodes, you must use the
     * <code>CacheNodeIdsToRemove</code> parameter to provide the IDs of the
     * specific cache nodes to remove.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running
     * Memcached, this value must be between 1 and 20.
     * </p>
     * <note>
     * <p>
     * Adding or removing Memcached cache nodes can be applied immediately or as
     * a pending operation (see <code>ApplyImmediately</code>).
     * </p>
     * <p>
     * A pending operation to modify the number of cache nodes in a cluster
     * during its maintenance window, whether by adding or removing nodes in
     * accordance with the scale out architecture, is not queued. The customer's
     * latest request to add or remove nodes to the cluster overrides any
     * previous pending operations to modify the number of cache nodes in the
     * cluster. For example, a request to remove 2 nodes would override a
     * previous pending operation to remove 3 nodes. Similarly, a request to add
     * 2 nodes would override a previous pending operation to remove 3 nodes and
     * vice versa. As Memcached cache nodes may now be provisioned in different
     * Availability Zones with flexible cache node placement, a request to add
     * nodes does not automatically override a previous pending operation to add
     * nodes. The customer can modify the previous pending operation to add more
     * nodes or explicitly cancel the pending request and retry the new request.
     * To cancel pending operations to modify the number of cache nodes in a
     * cluster, use the <code>ModifyCacheCluster</code> request and set
     * <code>NumCacheNodes</code> equal to the number of cache nodes currently
     * in the cluster.
     * </p>
     * </note>
     *
     * @return <p>
     *         The number of cache nodes that the cluster should have. If the
     *         value for <code>NumCacheNodes</code> is greater than the sum of
     *         the number of current cache nodes and the number of cache nodes
     *         pending creation (which may be zero), more nodes are added. If
     *         the value is less than the number of existing cache nodes, nodes
     *         are removed. If the value is equal to the number of current cache
     *         nodes, any pending add or remove requests are canceled.
     *         </p>
     *         <p>
     *         If you are removing cache nodes, you must use the
     *         <code>CacheNodeIdsToRemove</code> parameter to provide the IDs of
     *         the specific cache nodes to remove.
     *         </p>
     *         <p>
     *         For clusters running Redis, this value must be 1. For clusters
     *         running Memcached, this value must be between 1 and 20.
     *         </p>
     *         <note>
     *         <p>
     *         Adding or removing Memcached cache nodes can be applied
     *         immediately or as a pending operation (see
     *         <code>ApplyImmediately</code>).
     *         </p>
     *         <p>
     *         A pending operation to modify the number of cache nodes in a
     *         cluster during its maintenance window, whether by adding or
     *         removing nodes in accordance with the scale out architecture, is
     *         not queued. The customer's latest request to add or remove nodes
     *         to the cluster overrides any previous pending operations to
     *         modify the number of cache nodes in the cluster. For example, a
     *         request to remove 2 nodes would override a previous pending
     *         operation to remove 3 nodes. Similarly, a request to add 2 nodes
     *         would override a previous pending operation to remove 3 nodes and
     *         vice versa. As Memcached cache nodes may now be provisioned in
     *         different Availability Zones with flexible cache node placement,
     *         a request to add nodes does not automatically override a previous
     *         pending operation to add nodes. The customer can modify the
     *         previous pending operation to add more nodes or explicitly cancel
     *         the pending request and retry the new request. To cancel pending
     *         operations to modify the number of cache nodes in a cluster, use
     *         the <code>ModifyCacheCluster</code> request and set
     *         <code>NumCacheNodes</code> equal to the number of cache nodes
     *         currently in the cluster.
     *         </p>
     *         </note>
     */
    public Integer getNumCacheNodes() {
        return numCacheNodes;
    }

    /**
     * <p>
     * The number of cache nodes that the cluster should have. If the value for
     * <code>NumCacheNodes</code> is greater than the sum of the number of
     * current cache nodes and the number of cache nodes pending creation (which
     * may be zero), more nodes are added. If the value is less than the number
     * of existing cache nodes, nodes are removed. If the value is equal to the
     * number of current cache nodes, any pending add or remove requests are
     * canceled.
     * </p>
     * <p>
     * If you are removing cache nodes, you must use the
     * <code>CacheNodeIdsToRemove</code> parameter to provide the IDs of the
     * specific cache nodes to remove.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running
     * Memcached, this value must be between 1 and 20.
     * </p>
     * <note>
     * <p>
     * Adding or removing Memcached cache nodes can be applied immediately or as
     * a pending operation (see <code>ApplyImmediately</code>).
     * </p>
     * <p>
     * A pending operation to modify the number of cache nodes in a cluster
     * during its maintenance window, whether by adding or removing nodes in
     * accordance with the scale out architecture, is not queued. The customer's
     * latest request to add or remove nodes to the cluster overrides any
     * previous pending operations to modify the number of cache nodes in the
     * cluster. For example, a request to remove 2 nodes would override a
     * previous pending operation to remove 3 nodes. Similarly, a request to add
     * 2 nodes would override a previous pending operation to remove 3 nodes and
     * vice versa. As Memcached cache nodes may now be provisioned in different
     * Availability Zones with flexible cache node placement, a request to add
     * nodes does not automatically override a previous pending operation to add
     * nodes. The customer can modify the previous pending operation to add more
     * nodes or explicitly cancel the pending request and retry the new request.
     * To cancel pending operations to modify the number of cache nodes in a
     * cluster, use the <code>ModifyCacheCluster</code> request and set
     * <code>NumCacheNodes</code> equal to the number of cache nodes currently
     * in the cluster.
     * </p>
     * </note>
     *
     * @param numCacheNodes <p>
     *            The number of cache nodes that the cluster should have. If the
     *            value for <code>NumCacheNodes</code> is greater than the sum
     *            of the number of current cache nodes and the number of cache
     *            nodes pending creation (which may be zero), more nodes are
     *            added. If the value is less than the number of existing cache
     *            nodes, nodes are removed. If the value is equal to the number
     *            of current cache nodes, any pending add or remove requests are
     *            canceled.
     *            </p>
     *            <p>
     *            If you are removing cache nodes, you must use the
     *            <code>CacheNodeIdsToRemove</code> parameter to provide the IDs
     *            of the specific cache nodes to remove.
     *            </p>
     *            <p>
     *            For clusters running Redis, this value must be 1. For clusters
     *            running Memcached, this value must be between 1 and 20.
     *            </p>
     *            <note>
     *            <p>
     *            Adding or removing Memcached cache nodes can be applied
     *            immediately or as a pending operation (see
     *            <code>ApplyImmediately</code>).
     *            </p>
     *            <p>
     *            A pending operation to modify the number of cache nodes in a
     *            cluster during its maintenance window, whether by adding or
     *            removing nodes in accordance with the scale out architecture,
     *            is not queued. The customer's latest request to add or remove
     *            nodes to the cluster overrides any previous pending operations
     *            to modify the number of cache nodes in the cluster. For
     *            example, a request to remove 2 nodes would override a previous
     *            pending operation to remove 3 nodes. Similarly, a request to
     *            add 2 nodes would override a previous pending operation to
     *            remove 3 nodes and vice versa. As Memcached cache nodes may
     *            now be provisioned in different Availability Zones with
     *            flexible cache node placement, a request to add nodes does not
     *            automatically override a previous pending operation to add
     *            nodes. The customer can modify the previous pending operation
     *            to add more nodes or explicitly cancel the pending request and
     *            retry the new request. To cancel pending operations to modify
     *            the number of cache nodes in a cluster, use the
     *            <code>ModifyCacheCluster</code> request and set
     *            <code>NumCacheNodes</code> equal to the number of cache nodes
     *            currently in the cluster.
     *            </p>
     *            </note>
     */
    public void setNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
    }

    /**
     * <p>
     * The number of cache nodes that the cluster should have. If the value for
     * <code>NumCacheNodes</code> is greater than the sum of the number of
     * current cache nodes and the number of cache nodes pending creation (which
     * may be zero), more nodes are added. If the value is less than the number
     * of existing cache nodes, nodes are removed. If the value is equal to the
     * number of current cache nodes, any pending add or remove requests are
     * canceled.
     * </p>
     * <p>
     * If you are removing cache nodes, you must use the
     * <code>CacheNodeIdsToRemove</code> parameter to provide the IDs of the
     * specific cache nodes to remove.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running
     * Memcached, this value must be between 1 and 20.
     * </p>
     * <note>
     * <p>
     * Adding or removing Memcached cache nodes can be applied immediately or as
     * a pending operation (see <code>ApplyImmediately</code>).
     * </p>
     * <p>
     * A pending operation to modify the number of cache nodes in a cluster
     * during its maintenance window, whether by adding or removing nodes in
     * accordance with the scale out architecture, is not queued. The customer's
     * latest request to add or remove nodes to the cluster overrides any
     * previous pending operations to modify the number of cache nodes in the
     * cluster. For example, a request to remove 2 nodes would override a
     * previous pending operation to remove 3 nodes. Similarly, a request to add
     * 2 nodes would override a previous pending operation to remove 3 nodes and
     * vice versa. As Memcached cache nodes may now be provisioned in different
     * Availability Zones with flexible cache node placement, a request to add
     * nodes does not automatically override a previous pending operation to add
     * nodes. The customer can modify the previous pending operation to add more
     * nodes or explicitly cancel the pending request and retry the new request.
     * To cancel pending operations to modify the number of cache nodes in a
     * cluster, use the <code>ModifyCacheCluster</code> request and set
     * <code>NumCacheNodes</code> equal to the number of cache nodes currently
     * in the cluster.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numCacheNodes <p>
     *            The number of cache nodes that the cluster should have. If the
     *            value for <code>NumCacheNodes</code> is greater than the sum
     *            of the number of current cache nodes and the number of cache
     *            nodes pending creation (which may be zero), more nodes are
     *            added. If the value is less than the number of existing cache
     *            nodes, nodes are removed. If the value is equal to the number
     *            of current cache nodes, any pending add or remove requests are
     *            canceled.
     *            </p>
     *            <p>
     *            If you are removing cache nodes, you must use the
     *            <code>CacheNodeIdsToRemove</code> parameter to provide the IDs
     *            of the specific cache nodes to remove.
     *            </p>
     *            <p>
     *            For clusters running Redis, this value must be 1. For clusters
     *            running Memcached, this value must be between 1 and 20.
     *            </p>
     *            <note>
     *            <p>
     *            Adding or removing Memcached cache nodes can be applied
     *            immediately or as a pending operation (see
     *            <code>ApplyImmediately</code>).
     *            </p>
     *            <p>
     *            A pending operation to modify the number of cache nodes in a
     *            cluster during its maintenance window, whether by adding or
     *            removing nodes in accordance with the scale out architecture,
     *            is not queued. The customer's latest request to add or remove
     *            nodes to the cluster overrides any previous pending operations
     *            to modify the number of cache nodes in the cluster. For
     *            example, a request to remove 2 nodes would override a previous
     *            pending operation to remove 3 nodes. Similarly, a request to
     *            add 2 nodes would override a previous pending operation to
     *            remove 3 nodes and vice versa. As Memcached cache nodes may
     *            now be provisioned in different Availability Zones with
     *            flexible cache node placement, a request to add nodes does not
     *            automatically override a previous pending operation to add
     *            nodes. The customer can modify the previous pending operation
     *            to add more nodes or explicitly cancel the pending request and
     *            retry the new request. To cancel pending operations to modify
     *            the number of cache nodes in a cluster, use the
     *            <code>ModifyCacheCluster</code> request and set
     *            <code>NumCacheNodes</code> equal to the number of cache nodes
     *            currently in the cluster.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCacheClusterRequest withNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
        return this;
    }

    /**
     * <p>
     * A list of cache node IDs to be removed. A node ID is a numeric identifier
     * (0001, 0002, etc.). This parameter is only valid when
     * <code>NumCacheNodes</code> is less than the existing number of cache
     * nodes. The number of cache node IDs supplied in this parameter must match
     * the difference between the existing number of cache nodes in the cluster
     * or pending cache nodes, whichever is greater, and the value of
     * <code>NumCacheNodes</code> in the request.
     * </p>
     * <p>
     * For example: If you have 3 active cache nodes, 7 pending cache nodes, and
     * the number of cache nodes in this <code>ModifyCacheCluster</code> call is
     * 5, you must list 2 (7 - 5) cache node IDs to remove.
     * </p>
     *
     * @return <p>
     *         A list of cache node IDs to be removed. A node ID is a numeric
     *         identifier (0001, 0002, etc.). This parameter is only valid when
     *         <code>NumCacheNodes</code> is less than the existing number of
     *         cache nodes. The number of cache node IDs supplied in this
     *         parameter must match the difference between the existing number
     *         of cache nodes in the cluster or pending cache nodes, whichever
     *         is greater, and the value of <code>NumCacheNodes</code> in the
     *         request.
     *         </p>
     *         <p>
     *         For example: If you have 3 active cache nodes, 7 pending cache
     *         nodes, and the number of cache nodes in this
     *         <code>ModifyCacheCluster</code> call is 5, you must list 2 (7 -
     *         5) cache node IDs to remove.
     *         </p>
     */
    public java.util.List<String> getCacheNodeIdsToRemove() {
        return cacheNodeIdsToRemove;
    }

    /**
     * <p>
     * A list of cache node IDs to be removed. A node ID is a numeric identifier
     * (0001, 0002, etc.). This parameter is only valid when
     * <code>NumCacheNodes</code> is less than the existing number of cache
     * nodes. The number of cache node IDs supplied in this parameter must match
     * the difference between the existing number of cache nodes in the cluster
     * or pending cache nodes, whichever is greater, and the value of
     * <code>NumCacheNodes</code> in the request.
     * </p>
     * <p>
     * For example: If you have 3 active cache nodes, 7 pending cache nodes, and
     * the number of cache nodes in this <code>ModifyCacheCluster</code> call is
     * 5, you must list 2 (7 - 5) cache node IDs to remove.
     * </p>
     *
     * @param cacheNodeIdsToRemove <p>
     *            A list of cache node IDs to be removed. A node ID is a numeric
     *            identifier (0001, 0002, etc.). This parameter is only valid
     *            when <code>NumCacheNodes</code> is less than the existing
     *            number of cache nodes. The number of cache node IDs supplied
     *            in this parameter must match the difference between the
     *            existing number of cache nodes in the cluster or pending cache
     *            nodes, whichever is greater, and the value of
     *            <code>NumCacheNodes</code> in the request.
     *            </p>
     *            <p>
     *            For example: If you have 3 active cache nodes, 7 pending cache
     *            nodes, and the number of cache nodes in this
     *            <code>ModifyCacheCluster</code> call is 5, you must list 2 (7
     *            - 5) cache node IDs to remove.
     *            </p>
     */
    public void setCacheNodeIdsToRemove(java.util.Collection<String> cacheNodeIdsToRemove) {
        if (cacheNodeIdsToRemove == null) {
            this.cacheNodeIdsToRemove = null;
            return;
        }

        this.cacheNodeIdsToRemove = new java.util.ArrayList<String>(cacheNodeIdsToRemove);
    }

    /**
     * <p>
     * A list of cache node IDs to be removed. A node ID is a numeric identifier
     * (0001, 0002, etc.). This parameter is only valid when
     * <code>NumCacheNodes</code> is less than the existing number of cache
     * nodes. The number of cache node IDs supplied in this parameter must match
     * the difference between the existing number of cache nodes in the cluster
     * or pending cache nodes, whichever is greater, and the value of
     * <code>NumCacheNodes</code> in the request.
     * </p>
     * <p>
     * For example: If you have 3 active cache nodes, 7 pending cache nodes, and
     * the number of cache nodes in this <code>ModifyCacheCluster</code> call is
     * 5, you must list 2 (7 - 5) cache node IDs to remove.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeIdsToRemove <p>
     *            A list of cache node IDs to be removed. A node ID is a numeric
     *            identifier (0001, 0002, etc.). This parameter is only valid
     *            when <code>NumCacheNodes</code> is less than the existing
     *            number of cache nodes. The number of cache node IDs supplied
     *            in this parameter must match the difference between the
     *            existing number of cache nodes in the cluster or pending cache
     *            nodes, whichever is greater, and the value of
     *            <code>NumCacheNodes</code> in the request.
     *            </p>
     *            <p>
     *            For example: If you have 3 active cache nodes, 7 pending cache
     *            nodes, and the number of cache nodes in this
     *            <code>ModifyCacheCluster</code> call is 5, you must list 2 (7
     *            - 5) cache node IDs to remove.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCacheClusterRequest withCacheNodeIdsToRemove(String... cacheNodeIdsToRemove) {
        if (getCacheNodeIdsToRemove() == null) {
            this.cacheNodeIdsToRemove = new java.util.ArrayList<String>(cacheNodeIdsToRemove.length);
        }
        for (String value : cacheNodeIdsToRemove) {
            this.cacheNodeIdsToRemove.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of cache node IDs to be removed. A node ID is a numeric identifier
     * (0001, 0002, etc.). This parameter is only valid when
     * <code>NumCacheNodes</code> is less than the existing number of cache
     * nodes. The number of cache node IDs supplied in this parameter must match
     * the difference between the existing number of cache nodes in the cluster
     * or pending cache nodes, whichever is greater, and the value of
     * <code>NumCacheNodes</code> in the request.
     * </p>
     * <p>
     * For example: If you have 3 active cache nodes, 7 pending cache nodes, and
     * the number of cache nodes in this <code>ModifyCacheCluster</code> call is
     * 5, you must list 2 (7 - 5) cache node IDs to remove.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeIdsToRemove <p>
     *            A list of cache node IDs to be removed. A node ID is a numeric
     *            identifier (0001, 0002, etc.). This parameter is only valid
     *            when <code>NumCacheNodes</code> is less than the existing
     *            number of cache nodes. The number of cache node IDs supplied
     *            in this parameter must match the difference between the
     *            existing number of cache nodes in the cluster or pending cache
     *            nodes, whichever is greater, and the value of
     *            <code>NumCacheNodes</code> in the request.
     *            </p>
     *            <p>
     *            For example: If you have 3 active cache nodes, 7 pending cache
     *            nodes, and the number of cache nodes in this
     *            <code>ModifyCacheCluster</code> call is 5, you must list 2 (7
     *            - 5) cache node IDs to remove.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCacheClusterRequest withCacheNodeIdsToRemove(
            java.util.Collection<String> cacheNodeIdsToRemove) {
        setCacheNodeIdsToRemove(cacheNodeIdsToRemove);
        return this;
    }

    /**
     * <p>
     * Specifies whether the new nodes in this Memcached cluster are all created
     * in a single Availability Zone or created across multiple Availability
     * Zones.
     * </p>
     * <p>
     * Valid values: <code>single-az</code> | <code>cross-az</code>.
     * </p>
     * <p>
     * This option is only supported for Memcached clusters.
     * </p>
     * <note>
     * <p>
     * You cannot specify <code>single-az</code> if the Memcached cluster
     * already has cache nodes in different Availability Zones. If
     * <code>cross-az</code> is specified, existing Memcached nodes remain in
     * their current Availability Zone.
     * </p>
     * <p>
     * Only newly created nodes are located in different Availability Zones.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>single-az, cross-az
     *
     * @return <p>
     *         Specifies whether the new nodes in this Memcached cluster are all
     *         created in a single Availability Zone or created across multiple
     *         Availability Zones.
     *         </p>
     *         <p>
     *         Valid values: <code>single-az</code> | <code>cross-az</code>.
     *         </p>
     *         <p>
     *         This option is only supported for Memcached clusters.
     *         </p>
     *         <note>
     *         <p>
     *         You cannot specify <code>single-az</code> if the Memcached
     *         cluster already has cache nodes in different Availability Zones.
     *         If <code>cross-az</code> is specified, existing Memcached nodes
     *         remain in their current Availability Zone.
     *         </p>
     *         <p>
     *         Only newly created nodes are located in different Availability
     *         Zones.
     *         </p>
     *         </note>
     * @see AZMode
     */
    public String getAZMode() {
        return aZMode;
    }

    /**
     * <p>
     * Specifies whether the new nodes in this Memcached cluster are all created
     * in a single Availability Zone or created across multiple Availability
     * Zones.
     * </p>
     * <p>
     * Valid values: <code>single-az</code> | <code>cross-az</code>.
     * </p>
     * <p>
     * This option is only supported for Memcached clusters.
     * </p>
     * <note>
     * <p>
     * You cannot specify <code>single-az</code> if the Memcached cluster
     * already has cache nodes in different Availability Zones. If
     * <code>cross-az</code> is specified, existing Memcached nodes remain in
     * their current Availability Zone.
     * </p>
     * <p>
     * Only newly created nodes are located in different Availability Zones.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>single-az, cross-az
     *
     * @param aZMode <p>
     *            Specifies whether the new nodes in this Memcached cluster are
     *            all created in a single Availability Zone or created across
     *            multiple Availability Zones.
     *            </p>
     *            <p>
     *            Valid values: <code>single-az</code> | <code>cross-az</code>.
     *            </p>
     *            <p>
     *            This option is only supported for Memcached clusters.
     *            </p>
     *            <note>
     *            <p>
     *            You cannot specify <code>single-az</code> if the Memcached
     *            cluster already has cache nodes in different Availability
     *            Zones. If <code>cross-az</code> is specified, existing
     *            Memcached nodes remain in their current Availability Zone.
     *            </p>
     *            <p>
     *            Only newly created nodes are located in different Availability
     *            Zones.
     *            </p>
     *            </note>
     * @see AZMode
     */
    public void setAZMode(String aZMode) {
        this.aZMode = aZMode;
    }

    /**
     * <p>
     * Specifies whether the new nodes in this Memcached cluster are all created
     * in a single Availability Zone or created across multiple Availability
     * Zones.
     * </p>
     * <p>
     * Valid values: <code>single-az</code> | <code>cross-az</code>.
     * </p>
     * <p>
     * This option is only supported for Memcached clusters.
     * </p>
     * <note>
     * <p>
     * You cannot specify <code>single-az</code> if the Memcached cluster
     * already has cache nodes in different Availability Zones. If
     * <code>cross-az</code> is specified, existing Memcached nodes remain in
     * their current Availability Zone.
     * </p>
     * <p>
     * Only newly created nodes are located in different Availability Zones.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>single-az, cross-az
     *
     * @param aZMode <p>
     *            Specifies whether the new nodes in this Memcached cluster are
     *            all created in a single Availability Zone or created across
     *            multiple Availability Zones.
     *            </p>
     *            <p>
     *            Valid values: <code>single-az</code> | <code>cross-az</code>.
     *            </p>
     *            <p>
     *            This option is only supported for Memcached clusters.
     *            </p>
     *            <note>
     *            <p>
     *            You cannot specify <code>single-az</code> if the Memcached
     *            cluster already has cache nodes in different Availability
     *            Zones. If <code>cross-az</code> is specified, existing
     *            Memcached nodes remain in their current Availability Zone.
     *            </p>
     *            <p>
     *            Only newly created nodes are located in different Availability
     *            Zones.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AZMode
     */
    public ModifyCacheClusterRequest withAZMode(String aZMode) {
        this.aZMode = aZMode;
        return this;
    }

    /**
     * <p>
     * Specifies whether the new nodes in this Memcached cluster are all created
     * in a single Availability Zone or created across multiple Availability
     * Zones.
     * </p>
     * <p>
     * Valid values: <code>single-az</code> | <code>cross-az</code>.
     * </p>
     * <p>
     * This option is only supported for Memcached clusters.
     * </p>
     * <note>
     * <p>
     * You cannot specify <code>single-az</code> if the Memcached cluster
     * already has cache nodes in different Availability Zones. If
     * <code>cross-az</code> is specified, existing Memcached nodes remain in
     * their current Availability Zone.
     * </p>
     * <p>
     * Only newly created nodes are located in different Availability Zones.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>single-az, cross-az
     *
     * @param aZMode <p>
     *            Specifies whether the new nodes in this Memcached cluster are
     *            all created in a single Availability Zone or created across
     *            multiple Availability Zones.
     *            </p>
     *            <p>
     *            Valid values: <code>single-az</code> | <code>cross-az</code>.
     *            </p>
     *            <p>
     *            This option is only supported for Memcached clusters.
     *            </p>
     *            <note>
     *            <p>
     *            You cannot specify <code>single-az</code> if the Memcached
     *            cluster already has cache nodes in different Availability
     *            Zones. If <code>cross-az</code> is specified, existing
     *            Memcached nodes remain in their current Availability Zone.
     *            </p>
     *            <p>
     *            Only newly created nodes are located in different Availability
     *            Zones.
     *            </p>
     *            </note>
     * @see AZMode
     */
    public void setAZMode(AZMode aZMode) {
        this.aZMode = aZMode.toString();
    }

    /**
     * <p>
     * Specifies whether the new nodes in this Memcached cluster are all created
     * in a single Availability Zone or created across multiple Availability
     * Zones.
     * </p>
     * <p>
     * Valid values: <code>single-az</code> | <code>cross-az</code>.
     * </p>
     * <p>
     * This option is only supported for Memcached clusters.
     * </p>
     * <note>
     * <p>
     * You cannot specify <code>single-az</code> if the Memcached cluster
     * already has cache nodes in different Availability Zones. If
     * <code>cross-az</code> is specified, existing Memcached nodes remain in
     * their current Availability Zone.
     * </p>
     * <p>
     * Only newly created nodes are located in different Availability Zones.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>single-az, cross-az
     *
     * @param aZMode <p>
     *            Specifies whether the new nodes in this Memcached cluster are
     *            all created in a single Availability Zone or created across
     *            multiple Availability Zones.
     *            </p>
     *            <p>
     *            Valid values: <code>single-az</code> | <code>cross-az</code>.
     *            </p>
     *            <p>
     *            This option is only supported for Memcached clusters.
     *            </p>
     *            <note>
     *            <p>
     *            You cannot specify <code>single-az</code> if the Memcached
     *            cluster already has cache nodes in different Availability
     *            Zones. If <code>cross-az</code> is specified, existing
     *            Memcached nodes remain in their current Availability Zone.
     *            </p>
     *            <p>
     *            Only newly created nodes are located in different Availability
     *            Zones.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AZMode
     */
    public ModifyCacheClusterRequest withAZMode(AZMode aZMode) {
        this.aZMode = aZMode.toString();
        return this;
    }

    /**
     * <p>
     * The list of Availability Zones where the new Memcached cache nodes are
     * created.
     * </p>
     * <p>
     * This parameter is only valid when <code>NumCacheNodes</code> in the
     * request is greater than the sum of the number of active cache nodes and
     * the number of cache nodes pending creation (which may be zero). The
     * number of Availability Zones supplied in this list must match the cache
     * nodes being added in this request.
     * </p>
     * <p>
     * This option is only supported on Memcached clusters.
     * </p>
     * <p>
     * Scenarios:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Scenario 1:</b> You have 3 active nodes and wish to add 2 nodes.
     * Specify <code>NumCacheNodes=5</code> (3 + 2) and optionally specify two
     * Availability Zones for the two new nodes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Scenario 2:</b> You have 3 active nodes and 2 nodes pending creation
     * (from the scenario 1 call) and want to add 1 more node. Specify
     * <code>NumCacheNodes=6</code> ((3 + 2) + 1) and optionally specify an
     * Availability Zone for the new node.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Scenario 3:</b> You want to cancel all pending operations. Specify
     * <code>NumCacheNodes=3</code> to cancel all pending operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The Availability Zone placement of nodes pending creation cannot be
     * modified. If you wish to cancel any nodes pending creation, add 0 nodes
     * by setting <code>NumCacheNodes</code> to the number of current nodes.
     * </p>
     * <p>
     * If <code>cross-az</code> is specified, existing Memcached nodes remain in
     * their current Availability Zone. Only newly created nodes can be located
     * in different Availability Zones. For guidance on how to move existing
     * Memcached nodes to different Availability Zones, see the <b>Availability
     * Zone Considerations</b> section of <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/CacheNodes.SupportedTypes.html"
     * >Cache Node Considerations for Memcached</a>.
     * </p>
     * <p>
     * <b>Impact of new add/remove requests upon pending requests</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Scenario-1
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending Action: Delete
     * </p>
     * </li>
     * <li>
     * <p>
     * New Request: Delete
     * </p>
     * </li>
     * <li>
     * <p>
     * Result: The new delete, pending or immediate, replaces the pending
     * delete.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Scenario-2
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending Action: Delete
     * </p>
     * </li>
     * <li>
     * <p>
     * New Request: Create
     * </p>
     * </li>
     * <li>
     * <p>
     * Result: The new create, pending or immediate, replaces the pending
     * delete.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Scenario-3
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending Action: Create
     * </p>
     * </li>
     * <li>
     * <p>
     * New Request: Delete
     * </p>
     * </li>
     * <li>
     * <p>
     * Result: The new delete, pending or immediate, replaces the pending
     * create.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Scenario-4
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending Action: Create
     * </p>
     * </li>
     * <li>
     * <p>
     * New Request: Create
     * </p>
     * </li>
     * <li>
     * <p>
     * Result: The new create is added to the pending create.
     * </p>
     * <important>
     * <p>
     * <b>Important:</b> If the new create request is <b>Apply Immediately -
     * Yes</b>, all creates are performed immediately. If the new create request
     * is <b>Apply Immediately - No</b>, all creates are pending.
     * </p>
     * </important></li>
     * </ul>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The list of Availability Zones where the new Memcached cache
     *         nodes are created.
     *         </p>
     *         <p>
     *         This parameter is only valid when <code>NumCacheNodes</code> in
     *         the request is greater than the sum of the number of active cache
     *         nodes and the number of cache nodes pending creation (which may
     *         be zero). The number of Availability Zones supplied in this list
     *         must match the cache nodes being added in this request.
     *         </p>
     *         <p>
     *         This option is only supported on Memcached clusters.
     *         </p>
     *         <p>
     *         Scenarios:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Scenario 1:</b> You have 3 active nodes and wish to add 2
     *         nodes. Specify <code>NumCacheNodes=5</code> (3 + 2) and
     *         optionally specify two Availability Zones for the two new nodes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Scenario 2:</b> You have 3 active nodes and 2 nodes pending
     *         creation (from the scenario 1 call) and want to add 1 more node.
     *         Specify <code>NumCacheNodes=6</code> ((3 + 2) + 1) and optionally
     *         specify an Availability Zone for the new node.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Scenario 3:</b> You want to cancel all pending operations.
     *         Specify <code>NumCacheNodes=3</code> to cancel all pending
     *         operations.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The Availability Zone placement of nodes pending creation cannot
     *         be modified. If you wish to cancel any nodes pending creation,
     *         add 0 nodes by setting <code>NumCacheNodes</code> to the number
     *         of current nodes.
     *         </p>
     *         <p>
     *         If <code>cross-az</code> is specified, existing Memcached nodes
     *         remain in their current Availability Zone. Only newly created
     *         nodes can be located in different Availability Zones. For
     *         guidance on how to move existing Memcached nodes to different
     *         Availability Zones, see the <b>Availability Zone
     *         Considerations</b> section of <a href=
     *         "https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/CacheNodes.SupportedTypes.html"
     *         >Cache Node Considerations for Memcached</a>.
     *         </p>
     *         <p>
     *         <b>Impact of new add/remove requests upon pending requests</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Scenario-1
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Pending Action: Delete
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         New Request: Delete
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Result: The new delete, pending or immediate, replaces the
     *         pending delete.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Scenario-2
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Pending Action: Delete
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         New Request: Create
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Result: The new create, pending or immediate, replaces the
     *         pending delete.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Scenario-3
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Pending Action: Create
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         New Request: Delete
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Result: The new delete, pending or immediate, replaces the
     *         pending create.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Scenario-4
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Pending Action: Create
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         New Request: Create
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Result: The new create is added to the pending create.
     *         </p>
     *         <important>
     *         <p>
     *         <b>Important:</b> If the new create request is <b>Apply
     *         Immediately - Yes</b>, all creates are performed immediately. If
     *         the new create request is <b>Apply Immediately - No</b>, all
     *         creates are pending.
     *         </p>
     *         </important></li>
     *         </ul>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getNewAvailabilityZones() {
        return newAvailabilityZones;
    }

    /**
     * <p>
     * The list of Availability Zones where the new Memcached cache nodes are
     * created.
     * </p>
     * <p>
     * This parameter is only valid when <code>NumCacheNodes</code> in the
     * request is greater than the sum of the number of active cache nodes and
     * the number of cache nodes pending creation (which may be zero). The
     * number of Availability Zones supplied in this list must match the cache
     * nodes being added in this request.
     * </p>
     * <p>
     * This option is only supported on Memcached clusters.
     * </p>
     * <p>
     * Scenarios:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Scenario 1:</b> You have 3 active nodes and wish to add 2 nodes.
     * Specify <code>NumCacheNodes=5</code> (3 + 2) and optionally specify two
     * Availability Zones for the two new nodes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Scenario 2:</b> You have 3 active nodes and 2 nodes pending creation
     * (from the scenario 1 call) and want to add 1 more node. Specify
     * <code>NumCacheNodes=6</code> ((3 + 2) + 1) and optionally specify an
     * Availability Zone for the new node.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Scenario 3:</b> You want to cancel all pending operations. Specify
     * <code>NumCacheNodes=3</code> to cancel all pending operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The Availability Zone placement of nodes pending creation cannot be
     * modified. If you wish to cancel any nodes pending creation, add 0 nodes
     * by setting <code>NumCacheNodes</code> to the number of current nodes.
     * </p>
     * <p>
     * If <code>cross-az</code> is specified, existing Memcached nodes remain in
     * their current Availability Zone. Only newly created nodes can be located
     * in different Availability Zones. For guidance on how to move existing
     * Memcached nodes to different Availability Zones, see the <b>Availability
     * Zone Considerations</b> section of <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/CacheNodes.SupportedTypes.html"
     * >Cache Node Considerations for Memcached</a>.
     * </p>
     * <p>
     * <b>Impact of new add/remove requests upon pending requests</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Scenario-1
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending Action: Delete
     * </p>
     * </li>
     * <li>
     * <p>
     * New Request: Delete
     * </p>
     * </li>
     * <li>
     * <p>
     * Result: The new delete, pending or immediate, replaces the pending
     * delete.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Scenario-2
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending Action: Delete
     * </p>
     * </li>
     * <li>
     * <p>
     * New Request: Create
     * </p>
     * </li>
     * <li>
     * <p>
     * Result: The new create, pending or immediate, replaces the pending
     * delete.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Scenario-3
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending Action: Create
     * </p>
     * </li>
     * <li>
     * <p>
     * New Request: Delete
     * </p>
     * </li>
     * <li>
     * <p>
     * Result: The new delete, pending or immediate, replaces the pending
     * create.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Scenario-4
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending Action: Create
     * </p>
     * </li>
     * <li>
     * <p>
     * New Request: Create
     * </p>
     * </li>
     * <li>
     * <p>
     * Result: The new create is added to the pending create.
     * </p>
     * <important>
     * <p>
     * <b>Important:</b> If the new create request is <b>Apply Immediately -
     * Yes</b>, all creates are performed immediately. If the new create request
     * is <b>Apply Immediately - No</b>, all creates are pending.
     * </p>
     * </important></li>
     * </ul>
     * </li>
     * </ul>
     *
     * @param newAvailabilityZones <p>
     *            The list of Availability Zones where the new Memcached cache
     *            nodes are created.
     *            </p>
     *            <p>
     *            This parameter is only valid when <code>NumCacheNodes</code>
     *            in the request is greater than the sum of the number of active
     *            cache nodes and the number of cache nodes pending creation
     *            (which may be zero). The number of Availability Zones supplied
     *            in this list must match the cache nodes being added in this
     *            request.
     *            </p>
     *            <p>
     *            This option is only supported on Memcached clusters.
     *            </p>
     *            <p>
     *            Scenarios:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Scenario 1:</b> You have 3 active nodes and wish to add 2
     *            nodes. Specify <code>NumCacheNodes=5</code> (3 + 2) and
     *            optionally specify two Availability Zones for the two new
     *            nodes.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Scenario 2:</b> You have 3 active nodes and 2 nodes pending
     *            creation (from the scenario 1 call) and want to add 1 more
     *            node. Specify <code>NumCacheNodes=6</code> ((3 + 2) + 1) and
     *            optionally specify an Availability Zone for the new node.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Scenario 3:</b> You want to cancel all pending operations.
     *            Specify <code>NumCacheNodes=3</code> to cancel all pending
     *            operations.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The Availability Zone placement of nodes pending creation
     *            cannot be modified. If you wish to cancel any nodes pending
     *            creation, add 0 nodes by setting <code>NumCacheNodes</code> to
     *            the number of current nodes.
     *            </p>
     *            <p>
     *            If <code>cross-az</code> is specified, existing Memcached
     *            nodes remain in their current Availability Zone. Only newly
     *            created nodes can be located in different Availability Zones.
     *            For guidance on how to move existing Memcached nodes to
     *            different Availability Zones, see the <b>Availability Zone
     *            Considerations</b> section of <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/CacheNodes.SupportedTypes.html"
     *            >Cache Node Considerations for Memcached</a>.
     *            </p>
     *            <p>
     *            <b>Impact of new add/remove requests upon pending requests</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Scenario-1
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Pending Action: Delete
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            New Request: Delete
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Result: The new delete, pending or immediate, replaces the
     *            pending delete.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Scenario-2
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Pending Action: Delete
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            New Request: Create
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Result: The new create, pending or immediate, replaces the
     *            pending delete.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Scenario-3
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Pending Action: Create
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            New Request: Delete
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Result: The new delete, pending or immediate, replaces the
     *            pending create.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Scenario-4
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Pending Action: Create
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            New Request: Create
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Result: The new create is added to the pending create.
     *            </p>
     *            <important>
     *            <p>
     *            <b>Important:</b> If the new create request is <b>Apply
     *            Immediately - Yes</b>, all creates are performed immediately.
     *            If the new create request is <b>Apply Immediately - No</b>,
     *            all creates are pending.
     *            </p>
     *            </important></li>
     *            </ul>
     *            </li>
     *            </ul>
     */
    public void setNewAvailabilityZones(java.util.Collection<String> newAvailabilityZones) {
        if (newAvailabilityZones == null) {
            this.newAvailabilityZones = null;
            return;
        }

        this.newAvailabilityZones = new java.util.ArrayList<String>(newAvailabilityZones);
    }

    /**
     * <p>
     * The list of Availability Zones where the new Memcached cache nodes are
     * created.
     * </p>
     * <p>
     * This parameter is only valid when <code>NumCacheNodes</code> in the
     * request is greater than the sum of the number of active cache nodes and
     * the number of cache nodes pending creation (which may be zero). The
     * number of Availability Zones supplied in this list must match the cache
     * nodes being added in this request.
     * </p>
     * <p>
     * This option is only supported on Memcached clusters.
     * </p>
     * <p>
     * Scenarios:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Scenario 1:</b> You have 3 active nodes and wish to add 2 nodes.
     * Specify <code>NumCacheNodes=5</code> (3 + 2) and optionally specify two
     * Availability Zones for the two new nodes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Scenario 2:</b> You have 3 active nodes and 2 nodes pending creation
     * (from the scenario 1 call) and want to add 1 more node. Specify
     * <code>NumCacheNodes=6</code> ((3 + 2) + 1) and optionally specify an
     * Availability Zone for the new node.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Scenario 3:</b> You want to cancel all pending operations. Specify
     * <code>NumCacheNodes=3</code> to cancel all pending operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The Availability Zone placement of nodes pending creation cannot be
     * modified. If you wish to cancel any nodes pending creation, add 0 nodes
     * by setting <code>NumCacheNodes</code> to the number of current nodes.
     * </p>
     * <p>
     * If <code>cross-az</code> is specified, existing Memcached nodes remain in
     * their current Availability Zone. Only newly created nodes can be located
     * in different Availability Zones. For guidance on how to move existing
     * Memcached nodes to different Availability Zones, see the <b>Availability
     * Zone Considerations</b> section of <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/CacheNodes.SupportedTypes.html"
     * >Cache Node Considerations for Memcached</a>.
     * </p>
     * <p>
     * <b>Impact of new add/remove requests upon pending requests</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Scenario-1
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending Action: Delete
     * </p>
     * </li>
     * <li>
     * <p>
     * New Request: Delete
     * </p>
     * </li>
     * <li>
     * <p>
     * Result: The new delete, pending or immediate, replaces the pending
     * delete.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Scenario-2
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending Action: Delete
     * </p>
     * </li>
     * <li>
     * <p>
     * New Request: Create
     * </p>
     * </li>
     * <li>
     * <p>
     * Result: The new create, pending or immediate, replaces the pending
     * delete.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Scenario-3
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending Action: Create
     * </p>
     * </li>
     * <li>
     * <p>
     * New Request: Delete
     * </p>
     * </li>
     * <li>
     * <p>
     * Result: The new delete, pending or immediate, replaces the pending
     * create.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Scenario-4
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending Action: Create
     * </p>
     * </li>
     * <li>
     * <p>
     * New Request: Create
     * </p>
     * </li>
     * <li>
     * <p>
     * Result: The new create is added to the pending create.
     * </p>
     * <important>
     * <p>
     * <b>Important:</b> If the new create request is <b>Apply Immediately -
     * Yes</b>, all creates are performed immediately. If the new create request
     * is <b>Apply Immediately - No</b>, all creates are pending.
     * </p>
     * </important></li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newAvailabilityZones <p>
     *            The list of Availability Zones where the new Memcached cache
     *            nodes are created.
     *            </p>
     *            <p>
     *            This parameter is only valid when <code>NumCacheNodes</code>
     *            in the request is greater than the sum of the number of active
     *            cache nodes and the number of cache nodes pending creation
     *            (which may be zero). The number of Availability Zones supplied
     *            in this list must match the cache nodes being added in this
     *            request.
     *            </p>
     *            <p>
     *            This option is only supported on Memcached clusters.
     *            </p>
     *            <p>
     *            Scenarios:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Scenario 1:</b> You have 3 active nodes and wish to add 2
     *            nodes. Specify <code>NumCacheNodes=5</code> (3 + 2) and
     *            optionally specify two Availability Zones for the two new
     *            nodes.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Scenario 2:</b> You have 3 active nodes and 2 nodes pending
     *            creation (from the scenario 1 call) and want to add 1 more
     *            node. Specify <code>NumCacheNodes=6</code> ((3 + 2) + 1) and
     *            optionally specify an Availability Zone for the new node.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Scenario 3:</b> You want to cancel all pending operations.
     *            Specify <code>NumCacheNodes=3</code> to cancel all pending
     *            operations.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The Availability Zone placement of nodes pending creation
     *            cannot be modified. If you wish to cancel any nodes pending
     *            creation, add 0 nodes by setting <code>NumCacheNodes</code> to
     *            the number of current nodes.
     *            </p>
     *            <p>
     *            If <code>cross-az</code> is specified, existing Memcached
     *            nodes remain in their current Availability Zone. Only newly
     *            created nodes can be located in different Availability Zones.
     *            For guidance on how to move existing Memcached nodes to
     *            different Availability Zones, see the <b>Availability Zone
     *            Considerations</b> section of <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/CacheNodes.SupportedTypes.html"
     *            >Cache Node Considerations for Memcached</a>.
     *            </p>
     *            <p>
     *            <b>Impact of new add/remove requests upon pending requests</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Scenario-1
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Pending Action: Delete
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            New Request: Delete
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Result: The new delete, pending or immediate, replaces the
     *            pending delete.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Scenario-2
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Pending Action: Delete
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            New Request: Create
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Result: The new create, pending or immediate, replaces the
     *            pending delete.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Scenario-3
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Pending Action: Create
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            New Request: Delete
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Result: The new delete, pending or immediate, replaces the
     *            pending create.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Scenario-4
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Pending Action: Create
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            New Request: Create
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Result: The new create is added to the pending create.
     *            </p>
     *            <important>
     *            <p>
     *            <b>Important:</b> If the new create request is <b>Apply
     *            Immediately - Yes</b>, all creates are performed immediately.
     *            If the new create request is <b>Apply Immediately - No</b>,
     *            all creates are pending.
     *            </p>
     *            </important></li>
     *            </ul>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCacheClusterRequest withNewAvailabilityZones(String... newAvailabilityZones) {
        if (getNewAvailabilityZones() == null) {
            this.newAvailabilityZones = new java.util.ArrayList<String>(newAvailabilityZones.length);
        }
        for (String value : newAvailabilityZones) {
            this.newAvailabilityZones.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of Availability Zones where the new Memcached cache nodes are
     * created.
     * </p>
     * <p>
     * This parameter is only valid when <code>NumCacheNodes</code> in the
     * request is greater than the sum of the number of active cache nodes and
     * the number of cache nodes pending creation (which may be zero). The
     * number of Availability Zones supplied in this list must match the cache
     * nodes being added in this request.
     * </p>
     * <p>
     * This option is only supported on Memcached clusters.
     * </p>
     * <p>
     * Scenarios:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Scenario 1:</b> You have 3 active nodes and wish to add 2 nodes.
     * Specify <code>NumCacheNodes=5</code> (3 + 2) and optionally specify two
     * Availability Zones for the two new nodes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Scenario 2:</b> You have 3 active nodes and 2 nodes pending creation
     * (from the scenario 1 call) and want to add 1 more node. Specify
     * <code>NumCacheNodes=6</code> ((3 + 2) + 1) and optionally specify an
     * Availability Zone for the new node.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Scenario 3:</b> You want to cancel all pending operations. Specify
     * <code>NumCacheNodes=3</code> to cancel all pending operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The Availability Zone placement of nodes pending creation cannot be
     * modified. If you wish to cancel any nodes pending creation, add 0 nodes
     * by setting <code>NumCacheNodes</code> to the number of current nodes.
     * </p>
     * <p>
     * If <code>cross-az</code> is specified, existing Memcached nodes remain in
     * their current Availability Zone. Only newly created nodes can be located
     * in different Availability Zones. For guidance on how to move existing
     * Memcached nodes to different Availability Zones, see the <b>Availability
     * Zone Considerations</b> section of <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/CacheNodes.SupportedTypes.html"
     * >Cache Node Considerations for Memcached</a>.
     * </p>
     * <p>
     * <b>Impact of new add/remove requests upon pending requests</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Scenario-1
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending Action: Delete
     * </p>
     * </li>
     * <li>
     * <p>
     * New Request: Delete
     * </p>
     * </li>
     * <li>
     * <p>
     * Result: The new delete, pending or immediate, replaces the pending
     * delete.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Scenario-2
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending Action: Delete
     * </p>
     * </li>
     * <li>
     * <p>
     * New Request: Create
     * </p>
     * </li>
     * <li>
     * <p>
     * Result: The new create, pending or immediate, replaces the pending
     * delete.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Scenario-3
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending Action: Create
     * </p>
     * </li>
     * <li>
     * <p>
     * New Request: Delete
     * </p>
     * </li>
     * <li>
     * <p>
     * Result: The new delete, pending or immediate, replaces the pending
     * create.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Scenario-4
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending Action: Create
     * </p>
     * </li>
     * <li>
     * <p>
     * New Request: Create
     * </p>
     * </li>
     * <li>
     * <p>
     * Result: The new create is added to the pending create.
     * </p>
     * <important>
     * <p>
     * <b>Important:</b> If the new create request is <b>Apply Immediately -
     * Yes</b>, all creates are performed immediately. If the new create request
     * is <b>Apply Immediately - No</b>, all creates are pending.
     * </p>
     * </important></li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newAvailabilityZones <p>
     *            The list of Availability Zones where the new Memcached cache
     *            nodes are created.
     *            </p>
     *            <p>
     *            This parameter is only valid when <code>NumCacheNodes</code>
     *            in the request is greater than the sum of the number of active
     *            cache nodes and the number of cache nodes pending creation
     *            (which may be zero). The number of Availability Zones supplied
     *            in this list must match the cache nodes being added in this
     *            request.
     *            </p>
     *            <p>
     *            This option is only supported on Memcached clusters.
     *            </p>
     *            <p>
     *            Scenarios:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Scenario 1:</b> You have 3 active nodes and wish to add 2
     *            nodes. Specify <code>NumCacheNodes=5</code> (3 + 2) and
     *            optionally specify two Availability Zones for the two new
     *            nodes.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Scenario 2:</b> You have 3 active nodes and 2 nodes pending
     *            creation (from the scenario 1 call) and want to add 1 more
     *            node. Specify <code>NumCacheNodes=6</code> ((3 + 2) + 1) and
     *            optionally specify an Availability Zone for the new node.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Scenario 3:</b> You want to cancel all pending operations.
     *            Specify <code>NumCacheNodes=3</code> to cancel all pending
     *            operations.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The Availability Zone placement of nodes pending creation
     *            cannot be modified. If you wish to cancel any nodes pending
     *            creation, add 0 nodes by setting <code>NumCacheNodes</code> to
     *            the number of current nodes.
     *            </p>
     *            <p>
     *            If <code>cross-az</code> is specified, existing Memcached
     *            nodes remain in their current Availability Zone. Only newly
     *            created nodes can be located in different Availability Zones.
     *            For guidance on how to move existing Memcached nodes to
     *            different Availability Zones, see the <b>Availability Zone
     *            Considerations</b> section of <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/CacheNodes.SupportedTypes.html"
     *            >Cache Node Considerations for Memcached</a>.
     *            </p>
     *            <p>
     *            <b>Impact of new add/remove requests upon pending requests</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Scenario-1
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Pending Action: Delete
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            New Request: Delete
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Result: The new delete, pending or immediate, replaces the
     *            pending delete.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Scenario-2
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Pending Action: Delete
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            New Request: Create
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Result: The new create, pending or immediate, replaces the
     *            pending delete.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Scenario-3
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Pending Action: Create
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            New Request: Delete
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Result: The new delete, pending or immediate, replaces the
     *            pending create.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Scenario-4
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Pending Action: Create
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            New Request: Create
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Result: The new create is added to the pending create.
     *            </p>
     *            <important>
     *            <p>
     *            <b>Important:</b> If the new create request is <b>Apply
     *            Immediately - Yes</b>, all creates are performed immediately.
     *            If the new create request is <b>Apply Immediately - No</b>,
     *            all creates are pending.
     *            </p>
     *            </important></li>
     *            </ul>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCacheClusterRequest withNewAvailabilityZones(
            java.util.Collection<String> newAvailabilityZones) {
        setNewAvailabilityZones(newAvailabilityZones);
        return this;
    }

    /**
     * <p>
     * A list of cache security group names to authorize on this cluster. This
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * You can use this parameter only with clusters that are created outside of
     * an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters. Must
     * not be "Default".
     * </p>
     *
     * @return <p>
     *         A list of cache security group names to authorize on this
     *         cluster. This change is asynchronously applied as soon as
     *         possible.
     *         </p>
     *         <p>
     *         You can use this parameter only with clusters that are created
     *         outside of an Amazon Virtual Private Cloud (Amazon VPC).
     *         </p>
     *         <p>
     *         Constraints: Must contain no more than 255 alphanumeric
     *         characters. Must not be "Default".
     *         </p>
     */
    public java.util.List<String> getCacheSecurityGroupNames() {
        return cacheSecurityGroupNames;
    }

    /**
     * <p>
     * A list of cache security group names to authorize on this cluster. This
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * You can use this parameter only with clusters that are created outside of
     * an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters. Must
     * not be "Default".
     * </p>
     *
     * @param cacheSecurityGroupNames <p>
     *            A list of cache security group names to authorize on this
     *            cluster. This change is asynchronously applied as soon as
     *            possible.
     *            </p>
     *            <p>
     *            You can use this parameter only with clusters that are created
     *            outside of an Amazon Virtual Private Cloud (Amazon VPC).
     *            </p>
     *            <p>
     *            Constraints: Must contain no more than 255 alphanumeric
     *            characters. Must not be "Default".
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
     * A list of cache security group names to authorize on this cluster. This
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * You can use this parameter only with clusters that are created outside of
     * an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters. Must
     * not be "Default".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheSecurityGroupNames <p>
     *            A list of cache security group names to authorize on this
     *            cluster. This change is asynchronously applied as soon as
     *            possible.
     *            </p>
     *            <p>
     *            You can use this parameter only with clusters that are created
     *            outside of an Amazon Virtual Private Cloud (Amazon VPC).
     *            </p>
     *            <p>
     *            Constraints: Must contain no more than 255 alphanumeric
     *            characters. Must not be "Default".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCacheClusterRequest withCacheSecurityGroupNames(String... cacheSecurityGroupNames) {
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
     * A list of cache security group names to authorize on this cluster. This
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * You can use this parameter only with clusters that are created outside of
     * an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters. Must
     * not be "Default".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheSecurityGroupNames <p>
     *            A list of cache security group names to authorize on this
     *            cluster. This change is asynchronously applied as soon as
     *            possible.
     *            </p>
     *            <p>
     *            You can use this parameter only with clusters that are created
     *            outside of an Amazon Virtual Private Cloud (Amazon VPC).
     *            </p>
     *            <p>
     *            Constraints: Must contain no more than 255 alphanumeric
     *            characters. Must not be "Default".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCacheClusterRequest withCacheSecurityGroupNames(
            java.util.Collection<String> cacheSecurityGroupNames) {
        setCacheSecurityGroupNames(cacheSecurityGroupNames);
        return this;
    }

    /**
     * <p>
     * Specifies the VPC Security Groups associated with the cluster.
     * </p>
     * <p>
     * This parameter can be used only with clusters that are created in an
     * Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     *
     * @return <p>
     *         Specifies the VPC Security Groups associated with the cluster.
     *         </p>
     *         <p>
     *         This parameter can be used only with clusters that are created in
     *         an Amazon Virtual Private Cloud (Amazon VPC).
     *         </p>
     */
    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * Specifies the VPC Security Groups associated with the cluster.
     * </p>
     * <p>
     * This parameter can be used only with clusters that are created in an
     * Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     *
     * @param securityGroupIds <p>
     *            Specifies the VPC Security Groups associated with the cluster.
     *            </p>
     *            <p>
     *            This parameter can be used only with clusters that are created
     *            in an Amazon Virtual Private Cloud (Amazon VPC).
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
     * Specifies the VPC Security Groups associated with the cluster.
     * </p>
     * <p>
     * This parameter can be used only with clusters that are created in an
     * Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            Specifies the VPC Security Groups associated with the cluster.
     *            </p>
     *            <p>
     *            This parameter can be used only with clusters that are created
     *            in an Amazon Virtual Private Cloud (Amazon VPC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCacheClusterRequest withSecurityGroupIds(String... securityGroupIds) {
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
     * Specifies the VPC Security Groups associated with the cluster.
     * </p>
     * <p>
     * This parameter can be used only with clusters that are created in an
     * Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            Specifies the VPC Security Groups associated with the cluster.
     *            </p>
     *            <p>
     *            This parameter can be used only with clusters that are created
     *            in an Amazon Virtual Private Cloud (Amazon VPC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCacheClusterRequest withSecurityGroupIds(
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
    public ModifyCacheClusterRequest withPreferredMaintenanceWindow(
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
     * The Amazon SNS topic owner must be same as the cluster owner.
     * </p>
     * </note>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     *         notifications are sent.
     *         </p>
     *         <note>
     *         <p>
     *         The Amazon SNS topic owner must be same as the cluster owner.
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
     * The Amazon SNS topic owner must be same as the cluster owner.
     * </p>
     * </note>
     *
     * @param notificationTopicArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon SNS topic to
     *            which notifications are sent.
     *            </p>
     *            <note>
     *            <p>
     *            The Amazon SNS topic owner must be same as the cluster owner.
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
     * The Amazon SNS topic owner must be same as the cluster owner.
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
     *            The Amazon SNS topic owner must be same as the cluster owner.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCacheClusterRequest withNotificationTopicArn(String notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
        return this;
    }

    /**
     * <p>
     * The name of the cache parameter group to apply to this cluster. This
     * change is asynchronously applied as soon as possible for parameters when
     * the <code>ApplyImmediately</code> parameter is specified as
     * <code>true</code> for this request.
     * </p>
     *
     * @return <p>
     *         The name of the cache parameter group to apply to this cluster.
     *         This change is asynchronously applied as soon as possible for
     *         parameters when the <code>ApplyImmediately</code> parameter is
     *         specified as <code>true</code> for this request.
     *         </p>
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group to apply to this cluster. This
     * change is asynchronously applied as soon as possible for parameters when
     * the <code>ApplyImmediately</code> parameter is specified as
     * <code>true</code> for this request.
     * </p>
     *
     * @param cacheParameterGroupName <p>
     *            The name of the cache parameter group to apply to this
     *            cluster. This change is asynchronously applied as soon as
     *            possible for parameters when the <code>ApplyImmediately</code>
     *            parameter is specified as <code>true</code> for this request.
     *            </p>
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group to apply to this cluster. This
     * change is asynchronously applied as soon as possible for parameters when
     * the <code>ApplyImmediately</code> parameter is specified as
     * <code>true</code> for this request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheParameterGroupName <p>
     *            The name of the cache parameter group to apply to this
     *            cluster. This change is asynchronously applied as soon as
     *            possible for parameters when the <code>ApplyImmediately</code>
     *            parameter is specified as <code>true</code> for this request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCacheClusterRequest withCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }

    /**
     * <p>
     * The status of the Amazon SNS notification topic. Notifications are sent
     * only if the status is <code>active</code>.
     * </p>
     * <p>
     * Valid values: <code>active</code> | <code>inactive</code>
     * </p>
     *
     * @return <p>
     *         The status of the Amazon SNS notification topic. Notifications
     *         are sent only if the status is <code>active</code>.
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
     * The status of the Amazon SNS notification topic. Notifications are sent
     * only if the status is <code>active</code>.
     * </p>
     * <p>
     * Valid values: <code>active</code> | <code>inactive</code>
     * </p>
     *
     * @param notificationTopicStatus <p>
     *            The status of the Amazon SNS notification topic. Notifications
     *            are sent only if the status is <code>active</code>.
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
     * The status of the Amazon SNS notification topic. Notifications are sent
     * only if the status is <code>active</code>.
     * </p>
     * <p>
     * Valid values: <code>active</code> | <code>inactive</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationTopicStatus <p>
     *            The status of the Amazon SNS notification topic. Notifications
     *            are sent only if the status is <code>active</code>.
     *            </p>
     *            <p>
     *            Valid values: <code>active</code> | <code>inactive</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCacheClusterRequest withNotificationTopicStatus(String notificationTopicStatus) {
        this.notificationTopicStatus = notificationTopicStatus;
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, this parameter causes the modifications in this
     * request and any pending modifications to be applied, asynchronously and
     * as soon as possible, regardless of the
     * <code>PreferredMaintenanceWindow</code> setting for the cluster.
     * </p>
     * <p>
     * If <code>false</code>, changes to the cluster are applied on the next
     * maintenance reboot, or the next failure reboot, whichever occurs first.
     * </p>
     * <important>
     * <p>
     * If you perform a <code>ModifyCacheCluster</code> before a pending
     * modification is applied, the pending modification is replaced by the
     * newer modification.
     * </p>
     * </important>
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
     *         <code>PreferredMaintenanceWindow</code> setting for the cluster.
     *         </p>
     *         <p>
     *         If <code>false</code>, changes to the cluster are applied on the
     *         next maintenance reboot, or the next failure reboot, whichever
     *         occurs first.
     *         </p>
     *         <important>
     *         <p>
     *         If you perform a <code>ModifyCacheCluster</code> before a pending
     *         modification is applied, the pending modification is replaced by
     *         the newer modification.
     *         </p>
     *         </important>
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
     * <code>PreferredMaintenanceWindow</code> setting for the cluster.
     * </p>
     * <p>
     * If <code>false</code>, changes to the cluster are applied on the next
     * maintenance reboot, or the next failure reboot, whichever occurs first.
     * </p>
     * <important>
     * <p>
     * If you perform a <code>ModifyCacheCluster</code> before a pending
     * modification is applied, the pending modification is replaced by the
     * newer modification.
     * </p>
     * </important>
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
     *         <code>PreferredMaintenanceWindow</code> setting for the cluster.
     *         </p>
     *         <p>
     *         If <code>false</code>, changes to the cluster are applied on the
     *         next maintenance reboot, or the next failure reboot, whichever
     *         occurs first.
     *         </p>
     *         <important>
     *         <p>
     *         If you perform a <code>ModifyCacheCluster</code> before a pending
     *         modification is applied, the pending modification is replaced by
     *         the newer modification.
     *         </p>
     *         </important>
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
     * <code>PreferredMaintenanceWindow</code> setting for the cluster.
     * </p>
     * <p>
     * If <code>false</code>, changes to the cluster are applied on the next
     * maintenance reboot, or the next failure reboot, whichever occurs first.
     * </p>
     * <important>
     * <p>
     * If you perform a <code>ModifyCacheCluster</code> before a pending
     * modification is applied, the pending modification is replaced by the
     * newer modification.
     * </p>
     * </important>
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
     *            cluster.
     *            </p>
     *            <p>
     *            If <code>false</code>, changes to the cluster are applied on
     *            the next maintenance reboot, or the next failure reboot,
     *            whichever occurs first.
     *            </p>
     *            <important>
     *            <p>
     *            If you perform a <code>ModifyCacheCluster</code> before a
     *            pending modification is applied, the pending modification is
     *            replaced by the newer modification.
     *            </p>
     *            </important>
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
     * <code>PreferredMaintenanceWindow</code> setting for the cluster.
     * </p>
     * <p>
     * If <code>false</code>, changes to the cluster are applied on the next
     * maintenance reboot, or the next failure reboot, whichever occurs first.
     * </p>
     * <important>
     * <p>
     * If you perform a <code>ModifyCacheCluster</code> before a pending
     * modification is applied, the pending modification is replaced by the
     * newer modification.
     * </p>
     * </important>
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
     *            cluster.
     *            </p>
     *            <p>
     *            If <code>false</code>, changes to the cluster are applied on
     *            the next maintenance reboot, or the next failure reboot,
     *            whichever occurs first.
     *            </p>
     *            <important>
     *            <p>
     *            If you perform a <code>ModifyCacheCluster</code> before a
     *            pending modification is applied, the pending modification is
     *            replaced by the newer modification.
     *            </p>
     *            </important>
     *            <p>
     *            Valid values: <code>true</code> | <code>false</code>
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCacheClusterRequest withApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
        return this;
    }

    /**
     * <p>
     * The upgraded version of the cache engine to be run on the cache nodes.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     * >Selecting a Cache Engine and Version</a>), but you cannot downgrade to
     * an earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing cluster and create it anew with the earlier
     * engine version.
     * </p>
     *
     * @return <p>
     *         The upgraded version of the cache engine to be run on the cache
     *         nodes.
     *         </p>
     *         <p>
     *         <b>Important:</b> You can upgrade to a newer engine version (see
     *         <a href=
     *         "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     *         >Selecting a Cache Engine and Version</a>), but you cannot
     *         downgrade to an earlier engine version. If you want to use an
     *         earlier engine version, you must delete the existing cluster and
     *         create it anew with the earlier engine version.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The upgraded version of the cache engine to be run on the cache nodes.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     * >Selecting a Cache Engine and Version</a>), but you cannot downgrade to
     * an earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing cluster and create it anew with the earlier
     * engine version.
     * </p>
     *
     * @param engineVersion <p>
     *            The upgraded version of the cache engine to be run on the
     *            cache nodes.
     *            </p>
     *            <p>
     *            <b>Important:</b> You can upgrade to a newer engine version
     *            (see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     *            >Selecting a Cache Engine and Version</a>), but you cannot
     *            downgrade to an earlier engine version. If you want to use an
     *            earlier engine version, you must delete the existing cluster
     *            and create it anew with the earlier engine version.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The upgraded version of the cache engine to be run on the cache nodes.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     * >Selecting a Cache Engine and Version</a>), but you cannot downgrade to
     * an earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing cluster and create it anew with the earlier
     * engine version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The upgraded version of the cache engine to be run on the
     *            cache nodes.
     *            </p>
     *            <p>
     *            <b>Important:</b> You can upgrade to a newer engine version
     *            (see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     *            >Selecting a Cache Engine and Version</a>), but you cannot
     *            downgrade to an earlier engine version. If you want to use an
     *            earlier engine version, you must delete the existing cluster
     *            and create it anew with the earlier engine version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCacheClusterRequest withEngineVersion(String engineVersion) {
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
    public ModifyCacheClusterRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic cluster
     * snapshots before deleting them. For example, if you set
     * <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today
     * is retained for 5 days before being deleted.
     * </p>
     * <note>
     * <p>
     * If the value of <code>SnapshotRetentionLimit</code> is set to zero (0),
     * backups are turned off.
     * </p>
     * </note>
     *
     * @return <p>
     *         The number of days for which ElastiCache retains automatic
     *         cluster snapshots before deleting them. For example, if you set
     *         <code>SnapshotRetentionLimit</code> to 5, a snapshot that was
     *         taken today is retained for 5 days before being deleted.
     *         </p>
     *         <note>
     *         <p>
     *         If the value of <code>SnapshotRetentionLimit</code> is set to
     *         zero (0), backups are turned off.
     *         </p>
     *         </note>
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
     * <note>
     * <p>
     * If the value of <code>SnapshotRetentionLimit</code> is set to zero (0),
     * backups are turned off.
     * </p>
     * </note>
     *
     * @param snapshotRetentionLimit <p>
     *            The number of days for which ElastiCache retains automatic
     *            cluster snapshots before deleting them. For example, if you
     *            set <code>SnapshotRetentionLimit</code> to 5, a snapshot that
     *            was taken today is retained for 5 days before being deleted.
     *            </p>
     *            <note>
     *            <p>
     *            If the value of <code>SnapshotRetentionLimit</code> is set to
     *            zero (0), backups are turned off.
     *            </p>
     *            </note>
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
     * <note>
     * <p>
     * If the value of <code>SnapshotRetentionLimit</code> is set to zero (0),
     * backups are turned off.
     * </p>
     * </note>
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
     *            <note>
     *            <p>
     *            If the value of <code>SnapshotRetentionLimit</code> is set to
     *            zero (0), backups are turned off.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCacheClusterRequest withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
        return this;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a
     * daily snapshot of your cluster.
     * </p>
     *
     * @return <p>
     *         The daily time range (in UTC) during which ElastiCache begins
     *         taking a daily snapshot of your cluster.
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
     *
     * @param snapshotWindow <p>
     *            The daily time range (in UTC) during which ElastiCache begins
     *            taking a daily snapshot of your cluster.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotWindow <p>
     *            The daily time range (in UTC) during which ElastiCache begins
     *            taking a daily snapshot of your cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCacheClusterRequest withSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
        return this;
    }

    /**
     * <p>
     * A valid cache node type that you want to scale this cluster up to.
     * </p>
     *
     * @return <p>
     *         A valid cache node type that you want to scale this cluster up
     *         to.
     *         </p>
     */
    public String getCacheNodeType() {
        return cacheNodeType;
    }

    /**
     * <p>
     * A valid cache node type that you want to scale this cluster up to.
     * </p>
     *
     * @param cacheNodeType <p>
     *            A valid cache node type that you want to scale this cluster up
     *            to.
     *            </p>
     */
    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    /**
     * <p>
     * A valid cache node type that you want to scale this cluster up to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeType <p>
     *            A valid cache node type that you want to scale this cluster up
     *            to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCacheClusterRequest withCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
        return this;
    }

    /**
     * <p>
     * Reserved parameter. The password used to access a password protected
     * server. This parameter must be specified with the
     * <code>auth-token-update</code> parameter. Password constraints:
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
     *         <code>auth-token-update</code> parameter. Password constraints:
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
     * <code>auth-token-update</code> parameter. Password constraints:
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
     *            <code>auth-token-update</code> parameter. Password
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
     * <code>auth-token-update</code> parameter. Password constraints:
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
     *            <code>auth-token-update</code> parameter. Password
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
    public ModifyCacheClusterRequest withAuthToken(String authToken) {
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
    public ModifyCacheClusterRequest withAuthTokenUpdateStrategy(String authTokenUpdateStrategy) {
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
    public ModifyCacheClusterRequest withAuthTokenUpdateStrategy(
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
        if (getCacheClusterId() != null)
            sb.append("CacheClusterId: " + getCacheClusterId() + ",");
        if (getNumCacheNodes() != null)
            sb.append("NumCacheNodes: " + getNumCacheNodes() + ",");
        if (getCacheNodeIdsToRemove() != null)
            sb.append("CacheNodeIdsToRemove: " + getCacheNodeIdsToRemove() + ",");
        if (getAZMode() != null)
            sb.append("AZMode: " + getAZMode() + ",");
        if (getNewAvailabilityZones() != null)
            sb.append("NewAvailabilityZones: " + getNewAvailabilityZones() + ",");
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
                + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode());
        hashCode = prime * hashCode
                + ((getNumCacheNodes() == null) ? 0 : getNumCacheNodes().hashCode());
        hashCode = prime * hashCode
                + ((getCacheNodeIdsToRemove() == null) ? 0 : getCacheNodeIdsToRemove().hashCode());
        hashCode = prime * hashCode + ((getAZMode() == null) ? 0 : getAZMode().hashCode());
        hashCode = prime * hashCode
                + ((getNewAvailabilityZones() == null) ? 0 : getNewAvailabilityZones().hashCode());
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

        if (obj instanceof ModifyCacheClusterRequest == false)
            return false;
        ModifyCacheClusterRequest other = (ModifyCacheClusterRequest) obj;

        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null
                && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getNumCacheNodes() == null ^ this.getNumCacheNodes() == null)
            return false;
        if (other.getNumCacheNodes() != null
                && other.getNumCacheNodes().equals(this.getNumCacheNodes()) == false)
            return false;
        if (other.getCacheNodeIdsToRemove() == null ^ this.getCacheNodeIdsToRemove() == null)
            return false;
        if (other.getCacheNodeIdsToRemove() != null
                && other.getCacheNodeIdsToRemove().equals(this.getCacheNodeIdsToRemove()) == false)
            return false;
        if (other.getAZMode() == null ^ this.getAZMode() == null)
            return false;
        if (other.getAZMode() != null && other.getAZMode().equals(this.getAZMode()) == false)
            return false;
        if (other.getNewAvailabilityZones() == null ^ this.getNewAvailabilityZones() == null)
            return false;
        if (other.getNewAvailabilityZones() != null
                && other.getNewAvailabilityZones().equals(this.getNewAvailabilityZones()) == false)
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
