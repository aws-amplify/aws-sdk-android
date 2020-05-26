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
 * Modifies a replication group's shards (node groups) by allowing you to add
 * shards, remove shards, or rebalance the keyspaces among exisiting shards.
 * </p>
 */
public class ModifyReplicationGroupShardConfigurationRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The name of the Redis (cluster mode enabled) cluster (replication group)
     * on which the shards are to be configured.
     * </p>
     */
    private String replicationGroupId;

    /**
     * <p>
     * The number of node groups (shards) that results from the modification of
     * the shard configuration.
     * </p>
     */
    private Integer nodeGroupCount;

    /**
     * <p>
     * Indicates that the shard reconfiguration process begins immediately. At
     * present, the only permitted value for this parameter is <code>true</code>
     * .
     * </p>
     * <p>
     * Value: true
     * </p>
     */
    private Boolean applyImmediately;

    /**
     * <p>
     * Specifies the preferred availability zones for each node group in the
     * cluster. If the value of <code>NodeGroupCount</code> is greater than the
     * current number of node groups (shards), you can use this parameter to
     * specify the preferred availability zones of the cluster's shards. If you
     * omit this parameter ElastiCache selects availability zones for you.
     * </p>
     * <p>
     * You can specify this parameter only if the value of
     * <code>NodeGroupCount</code> is greater than the current number of node
     * groups (shards).
     * </p>
     */
    private java.util.List<ReshardingConfiguration> reshardingConfiguration;

    /**
     * <p>
     * If the value of <code>NodeGroupCount</code> is less than the current
     * number of node groups (shards), then either
     * <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is
     * required. <code>NodeGroupsToRemove</code> is a list of
     * <code>NodeGroupId</code>s to remove from the cluster.
     * </p>
     * <p>
     * ElastiCache for Redis will attempt to remove all node groups listed by
     * <code>NodeGroupsToRemove</code> from the cluster.
     * </p>
     */
    private java.util.List<String> nodeGroupsToRemove;

    /**
     * <p>
     * If the value of <code>NodeGroupCount</code> is less than the current
     * number of node groups (shards), then either
     * <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is
     * required. <code>NodeGroupsToRetain</code> is a list of
     * <code>NodeGroupId</code>s to retain in the cluster.
     * </p>
     * <p>
     * ElastiCache for Redis will attempt to remove all node groups except those
     * listed by <code>NodeGroupsToRetain</code> from the cluster.
     * </p>
     */
    private java.util.List<String> nodeGroupsToRetain;

    /**
     * <p>
     * The name of the Redis (cluster mode enabled) cluster (replication group)
     * on which the shards are to be configured.
     * </p>
     *
     * @return <p>
     *         The name of the Redis (cluster mode enabled) cluster (replication
     *         group) on which the shards are to be configured.
     *         </p>
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }

    /**
     * <p>
     * The name of the Redis (cluster mode enabled) cluster (replication group)
     * on which the shards are to be configured.
     * </p>
     *
     * @param replicationGroupId <p>
     *            The name of the Redis (cluster mode enabled) cluster
     *            (replication group) on which the shards are to be configured.
     *            </p>
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The name of the Redis (cluster mode enabled) cluster (replication group)
     * on which the shards are to be configured.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupId <p>
     *            The name of the Redis (cluster mode enabled) cluster
     *            (replication group) on which the shards are to be configured.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupShardConfigurationRequest withReplicationGroupId(
            String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
        return this;
    }

    /**
     * <p>
     * The number of node groups (shards) that results from the modification of
     * the shard configuration.
     * </p>
     *
     * @return <p>
     *         The number of node groups (shards) that results from the
     *         modification of the shard configuration.
     *         </p>
     */
    public Integer getNodeGroupCount() {
        return nodeGroupCount;
    }

    /**
     * <p>
     * The number of node groups (shards) that results from the modification of
     * the shard configuration.
     * </p>
     *
     * @param nodeGroupCount <p>
     *            The number of node groups (shards) that results from the
     *            modification of the shard configuration.
     *            </p>
     */
    public void setNodeGroupCount(Integer nodeGroupCount) {
        this.nodeGroupCount = nodeGroupCount;
    }

    /**
     * <p>
     * The number of node groups (shards) that results from the modification of
     * the shard configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeGroupCount <p>
     *            The number of node groups (shards) that results from the
     *            modification of the shard configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupShardConfigurationRequest withNodeGroupCount(Integer nodeGroupCount) {
        this.nodeGroupCount = nodeGroupCount;
        return this;
    }

    /**
     * <p>
     * Indicates that the shard reconfiguration process begins immediately. At
     * present, the only permitted value for this parameter is <code>true</code>
     * .
     * </p>
     * <p>
     * Value: true
     * </p>
     *
     * @return <p>
     *         Indicates that the shard reconfiguration process begins
     *         immediately. At present, the only permitted value for this
     *         parameter is <code>true</code>.
     *         </p>
     *         <p>
     *         Value: true
     *         </p>
     */
    public Boolean isApplyImmediately() {
        return applyImmediately;
    }

    /**
     * <p>
     * Indicates that the shard reconfiguration process begins immediately. At
     * present, the only permitted value for this parameter is <code>true</code>
     * .
     * </p>
     * <p>
     * Value: true
     * </p>
     *
     * @return <p>
     *         Indicates that the shard reconfiguration process begins
     *         immediately. At present, the only permitted value for this
     *         parameter is <code>true</code>.
     *         </p>
     *         <p>
     *         Value: true
     *         </p>
     */
    public Boolean getApplyImmediately() {
        return applyImmediately;
    }

    /**
     * <p>
     * Indicates that the shard reconfiguration process begins immediately. At
     * present, the only permitted value for this parameter is <code>true</code>
     * .
     * </p>
     * <p>
     * Value: true
     * </p>
     *
     * @param applyImmediately <p>
     *            Indicates that the shard reconfiguration process begins
     *            immediately. At present, the only permitted value for this
     *            parameter is <code>true</code>.
     *            </p>
     *            <p>
     *            Value: true
     *            </p>
     */
    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * Indicates that the shard reconfiguration process begins immediately. At
     * present, the only permitted value for this parameter is <code>true</code>
     * .
     * </p>
     * <p>
     * Value: true
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applyImmediately <p>
     *            Indicates that the shard reconfiguration process begins
     *            immediately. At present, the only permitted value for this
     *            parameter is <code>true</code>.
     *            </p>
     *            <p>
     *            Value: true
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupShardConfigurationRequest withApplyImmediately(
            Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
        return this;
    }

    /**
     * <p>
     * Specifies the preferred availability zones for each node group in the
     * cluster. If the value of <code>NodeGroupCount</code> is greater than the
     * current number of node groups (shards), you can use this parameter to
     * specify the preferred availability zones of the cluster's shards. If you
     * omit this parameter ElastiCache selects availability zones for you.
     * </p>
     * <p>
     * You can specify this parameter only if the value of
     * <code>NodeGroupCount</code> is greater than the current number of node
     * groups (shards).
     * </p>
     *
     * @return <p>
     *         Specifies the preferred availability zones for each node group in
     *         the cluster. If the value of <code>NodeGroupCount</code> is
     *         greater than the current number of node groups (shards), you can
     *         use this parameter to specify the preferred availability zones of
     *         the cluster's shards. If you omit this parameter ElastiCache
     *         selects availability zones for you.
     *         </p>
     *         <p>
     *         You can specify this parameter only if the value of
     *         <code>NodeGroupCount</code> is greater than the current number of
     *         node groups (shards).
     *         </p>
     */
    public java.util.List<ReshardingConfiguration> getReshardingConfiguration() {
        return reshardingConfiguration;
    }

    /**
     * <p>
     * Specifies the preferred availability zones for each node group in the
     * cluster. If the value of <code>NodeGroupCount</code> is greater than the
     * current number of node groups (shards), you can use this parameter to
     * specify the preferred availability zones of the cluster's shards. If you
     * omit this parameter ElastiCache selects availability zones for you.
     * </p>
     * <p>
     * You can specify this parameter only if the value of
     * <code>NodeGroupCount</code> is greater than the current number of node
     * groups (shards).
     * </p>
     *
     * @param reshardingConfiguration <p>
     *            Specifies the preferred availability zones for each node group
     *            in the cluster. If the value of <code>NodeGroupCount</code> is
     *            greater than the current number of node groups (shards), you
     *            can use this parameter to specify the preferred availability
     *            zones of the cluster's shards. If you omit this parameter
     *            ElastiCache selects availability zones for you.
     *            </p>
     *            <p>
     *            You can specify this parameter only if the value of
     *            <code>NodeGroupCount</code> is greater than the current number
     *            of node groups (shards).
     *            </p>
     */
    public void setReshardingConfiguration(
            java.util.Collection<ReshardingConfiguration> reshardingConfiguration) {
        if (reshardingConfiguration == null) {
            this.reshardingConfiguration = null;
            return;
        }

        this.reshardingConfiguration = new java.util.ArrayList<ReshardingConfiguration>(
                reshardingConfiguration);
    }

    /**
     * <p>
     * Specifies the preferred availability zones for each node group in the
     * cluster. If the value of <code>NodeGroupCount</code> is greater than the
     * current number of node groups (shards), you can use this parameter to
     * specify the preferred availability zones of the cluster's shards. If you
     * omit this parameter ElastiCache selects availability zones for you.
     * </p>
     * <p>
     * You can specify this parameter only if the value of
     * <code>NodeGroupCount</code> is greater than the current number of node
     * groups (shards).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reshardingConfiguration <p>
     *            Specifies the preferred availability zones for each node group
     *            in the cluster. If the value of <code>NodeGroupCount</code> is
     *            greater than the current number of node groups (shards), you
     *            can use this parameter to specify the preferred availability
     *            zones of the cluster's shards. If you omit this parameter
     *            ElastiCache selects availability zones for you.
     *            </p>
     *            <p>
     *            You can specify this parameter only if the value of
     *            <code>NodeGroupCount</code> is greater than the current number
     *            of node groups (shards).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupShardConfigurationRequest withReshardingConfiguration(
            ReshardingConfiguration... reshardingConfiguration) {
        if (getReshardingConfiguration() == null) {
            this.reshardingConfiguration = new java.util.ArrayList<ReshardingConfiguration>(
                    reshardingConfiguration.length);
        }
        for (ReshardingConfiguration value : reshardingConfiguration) {
            this.reshardingConfiguration.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the preferred availability zones for each node group in the
     * cluster. If the value of <code>NodeGroupCount</code> is greater than the
     * current number of node groups (shards), you can use this parameter to
     * specify the preferred availability zones of the cluster's shards. If you
     * omit this parameter ElastiCache selects availability zones for you.
     * </p>
     * <p>
     * You can specify this parameter only if the value of
     * <code>NodeGroupCount</code> is greater than the current number of node
     * groups (shards).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reshardingConfiguration <p>
     *            Specifies the preferred availability zones for each node group
     *            in the cluster. If the value of <code>NodeGroupCount</code> is
     *            greater than the current number of node groups (shards), you
     *            can use this parameter to specify the preferred availability
     *            zones of the cluster's shards. If you omit this parameter
     *            ElastiCache selects availability zones for you.
     *            </p>
     *            <p>
     *            You can specify this parameter only if the value of
     *            <code>NodeGroupCount</code> is greater than the current number
     *            of node groups (shards).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupShardConfigurationRequest withReshardingConfiguration(
            java.util.Collection<ReshardingConfiguration> reshardingConfiguration) {
        setReshardingConfiguration(reshardingConfiguration);
        return this;
    }

    /**
     * <p>
     * If the value of <code>NodeGroupCount</code> is less than the current
     * number of node groups (shards), then either
     * <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is
     * required. <code>NodeGroupsToRemove</code> is a list of
     * <code>NodeGroupId</code>s to remove from the cluster.
     * </p>
     * <p>
     * ElastiCache for Redis will attempt to remove all node groups listed by
     * <code>NodeGroupsToRemove</code> from the cluster.
     * </p>
     *
     * @return <p>
     *         If the value of <code>NodeGroupCount</code> is less than the
     *         current number of node groups (shards), then either
     *         <code>NodeGroupsToRemove</code> or
     *         <code>NodeGroupsToRetain</code> is required.
     *         <code>NodeGroupsToRemove</code> is a list of
     *         <code>NodeGroupId</code>s to remove from the cluster.
     *         </p>
     *         <p>
     *         ElastiCache for Redis will attempt to remove all node groups
     *         listed by <code>NodeGroupsToRemove</code> from the cluster.
     *         </p>
     */
    public java.util.List<String> getNodeGroupsToRemove() {
        return nodeGroupsToRemove;
    }

    /**
     * <p>
     * If the value of <code>NodeGroupCount</code> is less than the current
     * number of node groups (shards), then either
     * <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is
     * required. <code>NodeGroupsToRemove</code> is a list of
     * <code>NodeGroupId</code>s to remove from the cluster.
     * </p>
     * <p>
     * ElastiCache for Redis will attempt to remove all node groups listed by
     * <code>NodeGroupsToRemove</code> from the cluster.
     * </p>
     *
     * @param nodeGroupsToRemove <p>
     *            If the value of <code>NodeGroupCount</code> is less than the
     *            current number of node groups (shards), then either
     *            <code>NodeGroupsToRemove</code> or
     *            <code>NodeGroupsToRetain</code> is required.
     *            <code>NodeGroupsToRemove</code> is a list of
     *            <code>NodeGroupId</code>s to remove from the cluster.
     *            </p>
     *            <p>
     *            ElastiCache for Redis will attempt to remove all node groups
     *            listed by <code>NodeGroupsToRemove</code> from the cluster.
     *            </p>
     */
    public void setNodeGroupsToRemove(java.util.Collection<String> nodeGroupsToRemove) {
        if (nodeGroupsToRemove == null) {
            this.nodeGroupsToRemove = null;
            return;
        }

        this.nodeGroupsToRemove = new java.util.ArrayList<String>(nodeGroupsToRemove);
    }

    /**
     * <p>
     * If the value of <code>NodeGroupCount</code> is less than the current
     * number of node groups (shards), then either
     * <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is
     * required. <code>NodeGroupsToRemove</code> is a list of
     * <code>NodeGroupId</code>s to remove from the cluster.
     * </p>
     * <p>
     * ElastiCache for Redis will attempt to remove all node groups listed by
     * <code>NodeGroupsToRemove</code> from the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeGroupsToRemove <p>
     *            If the value of <code>NodeGroupCount</code> is less than the
     *            current number of node groups (shards), then either
     *            <code>NodeGroupsToRemove</code> or
     *            <code>NodeGroupsToRetain</code> is required.
     *            <code>NodeGroupsToRemove</code> is a list of
     *            <code>NodeGroupId</code>s to remove from the cluster.
     *            </p>
     *            <p>
     *            ElastiCache for Redis will attempt to remove all node groups
     *            listed by <code>NodeGroupsToRemove</code> from the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupShardConfigurationRequest withNodeGroupsToRemove(
            String... nodeGroupsToRemove) {
        if (getNodeGroupsToRemove() == null) {
            this.nodeGroupsToRemove = new java.util.ArrayList<String>(nodeGroupsToRemove.length);
        }
        for (String value : nodeGroupsToRemove) {
            this.nodeGroupsToRemove.add(value);
        }
        return this;
    }

    /**
     * <p>
     * If the value of <code>NodeGroupCount</code> is less than the current
     * number of node groups (shards), then either
     * <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is
     * required. <code>NodeGroupsToRemove</code> is a list of
     * <code>NodeGroupId</code>s to remove from the cluster.
     * </p>
     * <p>
     * ElastiCache for Redis will attempt to remove all node groups listed by
     * <code>NodeGroupsToRemove</code> from the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeGroupsToRemove <p>
     *            If the value of <code>NodeGroupCount</code> is less than the
     *            current number of node groups (shards), then either
     *            <code>NodeGroupsToRemove</code> or
     *            <code>NodeGroupsToRetain</code> is required.
     *            <code>NodeGroupsToRemove</code> is a list of
     *            <code>NodeGroupId</code>s to remove from the cluster.
     *            </p>
     *            <p>
     *            ElastiCache for Redis will attempt to remove all node groups
     *            listed by <code>NodeGroupsToRemove</code> from the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupShardConfigurationRequest withNodeGroupsToRemove(
            java.util.Collection<String> nodeGroupsToRemove) {
        setNodeGroupsToRemove(nodeGroupsToRemove);
        return this;
    }

    /**
     * <p>
     * If the value of <code>NodeGroupCount</code> is less than the current
     * number of node groups (shards), then either
     * <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is
     * required. <code>NodeGroupsToRetain</code> is a list of
     * <code>NodeGroupId</code>s to retain in the cluster.
     * </p>
     * <p>
     * ElastiCache for Redis will attempt to remove all node groups except those
     * listed by <code>NodeGroupsToRetain</code> from the cluster.
     * </p>
     *
     * @return <p>
     *         If the value of <code>NodeGroupCount</code> is less than the
     *         current number of node groups (shards), then either
     *         <code>NodeGroupsToRemove</code> or
     *         <code>NodeGroupsToRetain</code> is required.
     *         <code>NodeGroupsToRetain</code> is a list of
     *         <code>NodeGroupId</code>s to retain in the cluster.
     *         </p>
     *         <p>
     *         ElastiCache for Redis will attempt to remove all node groups
     *         except those listed by <code>NodeGroupsToRetain</code> from the
     *         cluster.
     *         </p>
     */
    public java.util.List<String> getNodeGroupsToRetain() {
        return nodeGroupsToRetain;
    }

    /**
     * <p>
     * If the value of <code>NodeGroupCount</code> is less than the current
     * number of node groups (shards), then either
     * <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is
     * required. <code>NodeGroupsToRetain</code> is a list of
     * <code>NodeGroupId</code>s to retain in the cluster.
     * </p>
     * <p>
     * ElastiCache for Redis will attempt to remove all node groups except those
     * listed by <code>NodeGroupsToRetain</code> from the cluster.
     * </p>
     *
     * @param nodeGroupsToRetain <p>
     *            If the value of <code>NodeGroupCount</code> is less than the
     *            current number of node groups (shards), then either
     *            <code>NodeGroupsToRemove</code> or
     *            <code>NodeGroupsToRetain</code> is required.
     *            <code>NodeGroupsToRetain</code> is a list of
     *            <code>NodeGroupId</code>s to retain in the cluster.
     *            </p>
     *            <p>
     *            ElastiCache for Redis will attempt to remove all node groups
     *            except those listed by <code>NodeGroupsToRetain</code> from
     *            the cluster.
     *            </p>
     */
    public void setNodeGroupsToRetain(java.util.Collection<String> nodeGroupsToRetain) {
        if (nodeGroupsToRetain == null) {
            this.nodeGroupsToRetain = null;
            return;
        }

        this.nodeGroupsToRetain = new java.util.ArrayList<String>(nodeGroupsToRetain);
    }

    /**
     * <p>
     * If the value of <code>NodeGroupCount</code> is less than the current
     * number of node groups (shards), then either
     * <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is
     * required. <code>NodeGroupsToRetain</code> is a list of
     * <code>NodeGroupId</code>s to retain in the cluster.
     * </p>
     * <p>
     * ElastiCache for Redis will attempt to remove all node groups except those
     * listed by <code>NodeGroupsToRetain</code> from the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeGroupsToRetain <p>
     *            If the value of <code>NodeGroupCount</code> is less than the
     *            current number of node groups (shards), then either
     *            <code>NodeGroupsToRemove</code> or
     *            <code>NodeGroupsToRetain</code> is required.
     *            <code>NodeGroupsToRetain</code> is a list of
     *            <code>NodeGroupId</code>s to retain in the cluster.
     *            </p>
     *            <p>
     *            ElastiCache for Redis will attempt to remove all node groups
     *            except those listed by <code>NodeGroupsToRetain</code> from
     *            the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupShardConfigurationRequest withNodeGroupsToRetain(
            String... nodeGroupsToRetain) {
        if (getNodeGroupsToRetain() == null) {
            this.nodeGroupsToRetain = new java.util.ArrayList<String>(nodeGroupsToRetain.length);
        }
        for (String value : nodeGroupsToRetain) {
            this.nodeGroupsToRetain.add(value);
        }
        return this;
    }

    /**
     * <p>
     * If the value of <code>NodeGroupCount</code> is less than the current
     * number of node groups (shards), then either
     * <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is
     * required. <code>NodeGroupsToRetain</code> is a list of
     * <code>NodeGroupId</code>s to retain in the cluster.
     * </p>
     * <p>
     * ElastiCache for Redis will attempt to remove all node groups except those
     * listed by <code>NodeGroupsToRetain</code> from the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeGroupsToRetain <p>
     *            If the value of <code>NodeGroupCount</code> is less than the
     *            current number of node groups (shards), then either
     *            <code>NodeGroupsToRemove</code> or
     *            <code>NodeGroupsToRetain</code> is required.
     *            <code>NodeGroupsToRetain</code> is a list of
     *            <code>NodeGroupId</code>s to retain in the cluster.
     *            </p>
     *            <p>
     *            ElastiCache for Redis will attempt to remove all node groups
     *            except those listed by <code>NodeGroupsToRetain</code> from
     *            the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationGroupShardConfigurationRequest withNodeGroupsToRetain(
            java.util.Collection<String> nodeGroupsToRetain) {
        setNodeGroupsToRetain(nodeGroupsToRetain);
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
        if (getNodeGroupCount() != null)
            sb.append("NodeGroupCount: " + getNodeGroupCount() + ",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: " + getApplyImmediately() + ",");
        if (getReshardingConfiguration() != null)
            sb.append("ReshardingConfiguration: " + getReshardingConfiguration() + ",");
        if (getNodeGroupsToRemove() != null)
            sb.append("NodeGroupsToRemove: " + getNodeGroupsToRemove() + ",");
        if (getNodeGroupsToRetain() != null)
            sb.append("NodeGroupsToRetain: " + getNodeGroupsToRetain());
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
                + ((getNodeGroupCount() == null) ? 0 : getNodeGroupCount().hashCode());
        hashCode = prime * hashCode
                + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        hashCode = prime
                * hashCode
                + ((getReshardingConfiguration() == null) ? 0 : getReshardingConfiguration()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNodeGroupsToRemove() == null) ? 0 : getNodeGroupsToRemove().hashCode());
        hashCode = prime * hashCode
                + ((getNodeGroupsToRetain() == null) ? 0 : getNodeGroupsToRetain().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyReplicationGroupShardConfigurationRequest == false)
            return false;
        ModifyReplicationGroupShardConfigurationRequest other = (ModifyReplicationGroupShardConfigurationRequest) obj;

        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null
                && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getNodeGroupCount() == null ^ this.getNodeGroupCount() == null)
            return false;
        if (other.getNodeGroupCount() != null
                && other.getNodeGroupCount().equals(this.getNodeGroupCount()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null
                && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        if (other.getReshardingConfiguration() == null ^ this.getReshardingConfiguration() == null)
            return false;
        if (other.getReshardingConfiguration() != null
                && other.getReshardingConfiguration().equals(this.getReshardingConfiguration()) == false)
            return false;
        if (other.getNodeGroupsToRemove() == null ^ this.getNodeGroupsToRemove() == null)
            return false;
        if (other.getNodeGroupsToRemove() != null
                && other.getNodeGroupsToRemove().equals(this.getNodeGroupsToRemove()) == false)
            return false;
        if (other.getNodeGroupsToRetain() == null ^ this.getNodeGroupsToRetain() == null)
            return false;
        if (other.getNodeGroupsToRetain() != null
                && other.getNodeGroupsToRetain().equals(this.getNodeGroupsToRetain()) == false)
            return false;
        return true;
    }
}
