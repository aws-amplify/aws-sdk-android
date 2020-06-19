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
 * Decreases the number of node groups in a Global Datastore
 * </p>
 */
public class DecreaseNodeGroupsInGlobalReplicationGroupRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     */
    private String globalReplicationGroupId;

    /**
     * <p>
     * The number of node groups (shards) that results from the modification of
     * the shard configuration
     * </p>
     */
    private Integer nodeGroupCount;

    /**
     * <p>
     * If the value of NodeGroupCount is less than the current number of node
     * groups (shards), then either NodeGroupsToRemove or NodeGroupsToRetain is
     * required. NodeGroupsToRemove is a list of NodeGroupIds to remove from the
     * cluster. ElastiCache for Redis will attempt to remove all node groups
     * listed by NodeGroupsToRemove from the cluster.
     * </p>
     */
    private java.util.List<String> globalNodeGroupsToRemove;

    /**
     * <p>
     * If the value of NodeGroupCount is less than the current number of node
     * groups (shards), then either NodeGroupsToRemove or NodeGroupsToRetain is
     * required. NodeGroupsToRemove is a list of NodeGroupIds to remove from the
     * cluster. ElastiCache for Redis will attempt to remove all node groups
     * listed by NodeGroupsToRemove from the cluster.
     * </p>
     */
    private java.util.List<String> globalNodeGroupsToRetain;

    /**
     * <p>
     * Indicates that the shard reconfiguration process begins immediately. At
     * present, the only permitted value for this parameter is true.
     * </p>
     */
    private Boolean applyImmediately;

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
    public DecreaseNodeGroupsInGlobalReplicationGroupRequest withGlobalReplicationGroupId(
            String globalReplicationGroupId) {
        this.globalReplicationGroupId = globalReplicationGroupId;
        return this;
    }

    /**
     * <p>
     * The number of node groups (shards) that results from the modification of
     * the shard configuration
     * </p>
     *
     * @return <p>
     *         The number of node groups (shards) that results from the
     *         modification of the shard configuration
     *         </p>
     */
    public Integer getNodeGroupCount() {
        return nodeGroupCount;
    }

    /**
     * <p>
     * The number of node groups (shards) that results from the modification of
     * the shard configuration
     * </p>
     *
     * @param nodeGroupCount <p>
     *            The number of node groups (shards) that results from the
     *            modification of the shard configuration
     *            </p>
     */
    public void setNodeGroupCount(Integer nodeGroupCount) {
        this.nodeGroupCount = nodeGroupCount;
    }

    /**
     * <p>
     * The number of node groups (shards) that results from the modification of
     * the shard configuration
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeGroupCount <p>
     *            The number of node groups (shards) that results from the
     *            modification of the shard configuration
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecreaseNodeGroupsInGlobalReplicationGroupRequest withNodeGroupCount(
            Integer nodeGroupCount) {
        this.nodeGroupCount = nodeGroupCount;
        return this;
    }

    /**
     * <p>
     * If the value of NodeGroupCount is less than the current number of node
     * groups (shards), then either NodeGroupsToRemove or NodeGroupsToRetain is
     * required. NodeGroupsToRemove is a list of NodeGroupIds to remove from the
     * cluster. ElastiCache for Redis will attempt to remove all node groups
     * listed by NodeGroupsToRemove from the cluster.
     * </p>
     *
     * @return <p>
     *         If the value of NodeGroupCount is less than the current number of
     *         node groups (shards), then either NodeGroupsToRemove or
     *         NodeGroupsToRetain is required. NodeGroupsToRemove is a list of
     *         NodeGroupIds to remove from the cluster. ElastiCache for Redis
     *         will attempt to remove all node groups listed by
     *         NodeGroupsToRemove from the cluster.
     *         </p>
     */
    public java.util.List<String> getGlobalNodeGroupsToRemove() {
        return globalNodeGroupsToRemove;
    }

    /**
     * <p>
     * If the value of NodeGroupCount is less than the current number of node
     * groups (shards), then either NodeGroupsToRemove or NodeGroupsToRetain is
     * required. NodeGroupsToRemove is a list of NodeGroupIds to remove from the
     * cluster. ElastiCache for Redis will attempt to remove all node groups
     * listed by NodeGroupsToRemove from the cluster.
     * </p>
     *
     * @param globalNodeGroupsToRemove <p>
     *            If the value of NodeGroupCount is less than the current number
     *            of node groups (shards), then either NodeGroupsToRemove or
     *            NodeGroupsToRetain is required. NodeGroupsToRemove is a list
     *            of NodeGroupIds to remove from the cluster. ElastiCache for
     *            Redis will attempt to remove all node groups listed by
     *            NodeGroupsToRemove from the cluster.
     *            </p>
     */
    public void setGlobalNodeGroupsToRemove(java.util.Collection<String> globalNodeGroupsToRemove) {
        if (globalNodeGroupsToRemove == null) {
            this.globalNodeGroupsToRemove = null;
            return;
        }

        this.globalNodeGroupsToRemove = new java.util.ArrayList<String>(globalNodeGroupsToRemove);
    }

    /**
     * <p>
     * If the value of NodeGroupCount is less than the current number of node
     * groups (shards), then either NodeGroupsToRemove or NodeGroupsToRetain is
     * required. NodeGroupsToRemove is a list of NodeGroupIds to remove from the
     * cluster. ElastiCache for Redis will attempt to remove all node groups
     * listed by NodeGroupsToRemove from the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalNodeGroupsToRemove <p>
     *            If the value of NodeGroupCount is less than the current number
     *            of node groups (shards), then either NodeGroupsToRemove or
     *            NodeGroupsToRetain is required. NodeGroupsToRemove is a list
     *            of NodeGroupIds to remove from the cluster. ElastiCache for
     *            Redis will attempt to remove all node groups listed by
     *            NodeGroupsToRemove from the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecreaseNodeGroupsInGlobalReplicationGroupRequest withGlobalNodeGroupsToRemove(
            String... globalNodeGroupsToRemove) {
        if (getGlobalNodeGroupsToRemove() == null) {
            this.globalNodeGroupsToRemove = new java.util.ArrayList<String>(
                    globalNodeGroupsToRemove.length);
        }
        for (String value : globalNodeGroupsToRemove) {
            this.globalNodeGroupsToRemove.add(value);
        }
        return this;
    }

    /**
     * <p>
     * If the value of NodeGroupCount is less than the current number of node
     * groups (shards), then either NodeGroupsToRemove or NodeGroupsToRetain is
     * required. NodeGroupsToRemove is a list of NodeGroupIds to remove from the
     * cluster. ElastiCache for Redis will attempt to remove all node groups
     * listed by NodeGroupsToRemove from the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalNodeGroupsToRemove <p>
     *            If the value of NodeGroupCount is less than the current number
     *            of node groups (shards), then either NodeGroupsToRemove or
     *            NodeGroupsToRetain is required. NodeGroupsToRemove is a list
     *            of NodeGroupIds to remove from the cluster. ElastiCache for
     *            Redis will attempt to remove all node groups listed by
     *            NodeGroupsToRemove from the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecreaseNodeGroupsInGlobalReplicationGroupRequest withGlobalNodeGroupsToRemove(
            java.util.Collection<String> globalNodeGroupsToRemove) {
        setGlobalNodeGroupsToRemove(globalNodeGroupsToRemove);
        return this;
    }

    /**
     * <p>
     * If the value of NodeGroupCount is less than the current number of node
     * groups (shards), then either NodeGroupsToRemove or NodeGroupsToRetain is
     * required. NodeGroupsToRemove is a list of NodeGroupIds to remove from the
     * cluster. ElastiCache for Redis will attempt to remove all node groups
     * listed by NodeGroupsToRemove from the cluster.
     * </p>
     *
     * @return <p>
     *         If the value of NodeGroupCount is less than the current number of
     *         node groups (shards), then either NodeGroupsToRemove or
     *         NodeGroupsToRetain is required. NodeGroupsToRemove is a list of
     *         NodeGroupIds to remove from the cluster. ElastiCache for Redis
     *         will attempt to remove all node groups listed by
     *         NodeGroupsToRemove from the cluster.
     *         </p>
     */
    public java.util.List<String> getGlobalNodeGroupsToRetain() {
        return globalNodeGroupsToRetain;
    }

    /**
     * <p>
     * If the value of NodeGroupCount is less than the current number of node
     * groups (shards), then either NodeGroupsToRemove or NodeGroupsToRetain is
     * required. NodeGroupsToRemove is a list of NodeGroupIds to remove from the
     * cluster. ElastiCache for Redis will attempt to remove all node groups
     * listed by NodeGroupsToRemove from the cluster.
     * </p>
     *
     * @param globalNodeGroupsToRetain <p>
     *            If the value of NodeGroupCount is less than the current number
     *            of node groups (shards), then either NodeGroupsToRemove or
     *            NodeGroupsToRetain is required. NodeGroupsToRemove is a list
     *            of NodeGroupIds to remove from the cluster. ElastiCache for
     *            Redis will attempt to remove all node groups listed by
     *            NodeGroupsToRemove from the cluster.
     *            </p>
     */
    public void setGlobalNodeGroupsToRetain(java.util.Collection<String> globalNodeGroupsToRetain) {
        if (globalNodeGroupsToRetain == null) {
            this.globalNodeGroupsToRetain = null;
            return;
        }

        this.globalNodeGroupsToRetain = new java.util.ArrayList<String>(globalNodeGroupsToRetain);
    }

    /**
     * <p>
     * If the value of NodeGroupCount is less than the current number of node
     * groups (shards), then either NodeGroupsToRemove or NodeGroupsToRetain is
     * required. NodeGroupsToRemove is a list of NodeGroupIds to remove from the
     * cluster. ElastiCache for Redis will attempt to remove all node groups
     * listed by NodeGroupsToRemove from the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalNodeGroupsToRetain <p>
     *            If the value of NodeGroupCount is less than the current number
     *            of node groups (shards), then either NodeGroupsToRemove or
     *            NodeGroupsToRetain is required. NodeGroupsToRemove is a list
     *            of NodeGroupIds to remove from the cluster. ElastiCache for
     *            Redis will attempt to remove all node groups listed by
     *            NodeGroupsToRemove from the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecreaseNodeGroupsInGlobalReplicationGroupRequest withGlobalNodeGroupsToRetain(
            String... globalNodeGroupsToRetain) {
        if (getGlobalNodeGroupsToRetain() == null) {
            this.globalNodeGroupsToRetain = new java.util.ArrayList<String>(
                    globalNodeGroupsToRetain.length);
        }
        for (String value : globalNodeGroupsToRetain) {
            this.globalNodeGroupsToRetain.add(value);
        }
        return this;
    }

    /**
     * <p>
     * If the value of NodeGroupCount is less than the current number of node
     * groups (shards), then either NodeGroupsToRemove or NodeGroupsToRetain is
     * required. NodeGroupsToRemove is a list of NodeGroupIds to remove from the
     * cluster. ElastiCache for Redis will attempt to remove all node groups
     * listed by NodeGroupsToRemove from the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalNodeGroupsToRetain <p>
     *            If the value of NodeGroupCount is less than the current number
     *            of node groups (shards), then either NodeGroupsToRemove or
     *            NodeGroupsToRetain is required. NodeGroupsToRemove is a list
     *            of NodeGroupIds to remove from the cluster. ElastiCache for
     *            Redis will attempt to remove all node groups listed by
     *            NodeGroupsToRemove from the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecreaseNodeGroupsInGlobalReplicationGroupRequest withGlobalNodeGroupsToRetain(
            java.util.Collection<String> globalNodeGroupsToRetain) {
        setGlobalNodeGroupsToRetain(globalNodeGroupsToRetain);
        return this;
    }

    /**
     * <p>
     * Indicates that the shard reconfiguration process begins immediately. At
     * present, the only permitted value for this parameter is true.
     * </p>
     *
     * @return <p>
     *         Indicates that the shard reconfiguration process begins
     *         immediately. At present, the only permitted value for this
     *         parameter is true.
     *         </p>
     */
    public Boolean isApplyImmediately() {
        return applyImmediately;
    }

    /**
     * <p>
     * Indicates that the shard reconfiguration process begins immediately. At
     * present, the only permitted value for this parameter is true.
     * </p>
     *
     * @return <p>
     *         Indicates that the shard reconfiguration process begins
     *         immediately. At present, the only permitted value for this
     *         parameter is true.
     *         </p>
     */
    public Boolean getApplyImmediately() {
        return applyImmediately;
    }

    /**
     * <p>
     * Indicates that the shard reconfiguration process begins immediately. At
     * present, the only permitted value for this parameter is true.
     * </p>
     *
     * @param applyImmediately <p>
     *            Indicates that the shard reconfiguration process begins
     *            immediately. At present, the only permitted value for this
     *            parameter is true.
     *            </p>
     */
    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * Indicates that the shard reconfiguration process begins immediately. At
     * present, the only permitted value for this parameter is true.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applyImmediately <p>
     *            Indicates that the shard reconfiguration process begins
     *            immediately. At present, the only permitted value for this
     *            parameter is true.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecreaseNodeGroupsInGlobalReplicationGroupRequest withApplyImmediately(
            Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
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
        if (getGlobalReplicationGroupId() != null)
            sb.append("GlobalReplicationGroupId: " + getGlobalReplicationGroupId() + ",");
        if (getNodeGroupCount() != null)
            sb.append("NodeGroupCount: " + getNodeGroupCount() + ",");
        if (getGlobalNodeGroupsToRemove() != null)
            sb.append("GlobalNodeGroupsToRemove: " + getGlobalNodeGroupsToRemove() + ",");
        if (getGlobalNodeGroupsToRetain() != null)
            sb.append("GlobalNodeGroupsToRetain: " + getGlobalNodeGroupsToRetain() + ",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: " + getApplyImmediately());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getGlobalReplicationGroupId() == null) ? 0 : getGlobalReplicationGroupId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNodeGroupCount() == null) ? 0 : getNodeGroupCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getGlobalNodeGroupsToRemove() == null) ? 0 : getGlobalNodeGroupsToRemove()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getGlobalNodeGroupsToRetain() == null) ? 0 : getGlobalNodeGroupsToRetain()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DecreaseNodeGroupsInGlobalReplicationGroupRequest == false)
            return false;
        DecreaseNodeGroupsInGlobalReplicationGroupRequest other = (DecreaseNodeGroupsInGlobalReplicationGroupRequest) obj;

        if (other.getGlobalReplicationGroupId() == null
                ^ this.getGlobalReplicationGroupId() == null)
            return false;
        if (other.getGlobalReplicationGroupId() != null
                && other.getGlobalReplicationGroupId().equals(this.getGlobalReplicationGroupId()) == false)
            return false;
        if (other.getNodeGroupCount() == null ^ this.getNodeGroupCount() == null)
            return false;
        if (other.getNodeGroupCount() != null
                && other.getNodeGroupCount().equals(this.getNodeGroupCount()) == false)
            return false;
        if (other.getGlobalNodeGroupsToRemove() == null
                ^ this.getGlobalNodeGroupsToRemove() == null)
            return false;
        if (other.getGlobalNodeGroupsToRemove() != null
                && other.getGlobalNodeGroupsToRemove().equals(this.getGlobalNodeGroupsToRemove()) == false)
            return false;
        if (other.getGlobalNodeGroupsToRetain() == null
                ^ this.getGlobalNodeGroupsToRetain() == null)
            return false;
        if (other.getGlobalNodeGroupsToRetain() != null
                && other.getGlobalNodeGroupsToRetain().equals(this.getGlobalNodeGroupsToRetain()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null
                && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        return true;
    }
}
