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
 * Represents an individual cache node in a snapshot of a cluster.
 * </p>
 */
public class NodeSnapshot implements Serializable {
    /**
     * <p>
     * A unique identifier for the source cluster.
     * </p>
     */
    private String cacheClusterId;

    /**
     * <p>
     * A unique identifier for the source node group (shard).
     * </p>
     */
    private String nodeGroupId;

    /**
     * <p>
     * The cache node identifier for the node in the source cluster.
     * </p>
     */
    private String cacheNodeId;

    /**
     * <p>
     * The configuration for the source node group (shard).
     * </p>
     */
    private NodeGroupConfiguration nodeGroupConfiguration;

    /**
     * <p>
     * The size of the cache on the source cache node.
     * </p>
     */
    private String cacheSize;

    /**
     * <p>
     * The date and time when the cache node was created in the source cluster.
     * </p>
     */
    private java.util.Date cacheNodeCreateTime;

    /**
     * <p>
     * The date and time when the source node's metadata and cache data set was
     * obtained for the snapshot.
     * </p>
     */
    private java.util.Date snapshotCreateTime;

    /**
     * <p>
     * A unique identifier for the source cluster.
     * </p>
     *
     * @return <p>
     *         A unique identifier for the source cluster.
     *         </p>
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }

    /**
     * <p>
     * A unique identifier for the source cluster.
     * </p>
     *
     * @param cacheClusterId <p>
     *            A unique identifier for the source cluster.
     *            </p>
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * A unique identifier for the source cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheClusterId <p>
     *            A unique identifier for the source cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeSnapshot withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
        return this;
    }

    /**
     * <p>
     * A unique identifier for the source node group (shard).
     * </p>
     *
     * @return <p>
     *         A unique identifier for the source node group (shard).
     *         </p>
     */
    public String getNodeGroupId() {
        return nodeGroupId;
    }

    /**
     * <p>
     * A unique identifier for the source node group (shard).
     * </p>
     *
     * @param nodeGroupId <p>
     *            A unique identifier for the source node group (shard).
     *            </p>
     */
    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }

    /**
     * <p>
     * A unique identifier for the source node group (shard).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeGroupId <p>
     *            A unique identifier for the source node group (shard).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeSnapshot withNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }

    /**
     * <p>
     * The cache node identifier for the node in the source cluster.
     * </p>
     *
     * @return <p>
     *         The cache node identifier for the node in the source cluster.
     *         </p>
     */
    public String getCacheNodeId() {
        return cacheNodeId;
    }

    /**
     * <p>
     * The cache node identifier for the node in the source cluster.
     * </p>
     *
     * @param cacheNodeId <p>
     *            The cache node identifier for the node in the source cluster.
     *            </p>
     */
    public void setCacheNodeId(String cacheNodeId) {
        this.cacheNodeId = cacheNodeId;
    }

    /**
     * <p>
     * The cache node identifier for the node in the source cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeId <p>
     *            The cache node identifier for the node in the source cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeSnapshot withCacheNodeId(String cacheNodeId) {
        this.cacheNodeId = cacheNodeId;
        return this;
    }

    /**
     * <p>
     * The configuration for the source node group (shard).
     * </p>
     *
     * @return <p>
     *         The configuration for the source node group (shard).
     *         </p>
     */
    public NodeGroupConfiguration getNodeGroupConfiguration() {
        return nodeGroupConfiguration;
    }

    /**
     * <p>
     * The configuration for the source node group (shard).
     * </p>
     *
     * @param nodeGroupConfiguration <p>
     *            The configuration for the source node group (shard).
     *            </p>
     */
    public void setNodeGroupConfiguration(NodeGroupConfiguration nodeGroupConfiguration) {
        this.nodeGroupConfiguration = nodeGroupConfiguration;
    }

    /**
     * <p>
     * The configuration for the source node group (shard).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeGroupConfiguration <p>
     *            The configuration for the source node group (shard).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeSnapshot withNodeGroupConfiguration(NodeGroupConfiguration nodeGroupConfiguration) {
        this.nodeGroupConfiguration = nodeGroupConfiguration;
        return this;
    }

    /**
     * <p>
     * The size of the cache on the source cache node.
     * </p>
     *
     * @return <p>
     *         The size of the cache on the source cache node.
     *         </p>
     */
    public String getCacheSize() {
        return cacheSize;
    }

    /**
     * <p>
     * The size of the cache on the source cache node.
     * </p>
     *
     * @param cacheSize <p>
     *            The size of the cache on the source cache node.
     *            </p>
     */
    public void setCacheSize(String cacheSize) {
        this.cacheSize = cacheSize;
    }

    /**
     * <p>
     * The size of the cache on the source cache node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheSize <p>
     *            The size of the cache on the source cache node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeSnapshot withCacheSize(String cacheSize) {
        this.cacheSize = cacheSize;
        return this;
    }

    /**
     * <p>
     * The date and time when the cache node was created in the source cluster.
     * </p>
     *
     * @return <p>
     *         The date and time when the cache node was created in the source
     *         cluster.
     *         </p>
     */
    public java.util.Date getCacheNodeCreateTime() {
        return cacheNodeCreateTime;
    }

    /**
     * <p>
     * The date and time when the cache node was created in the source cluster.
     * </p>
     *
     * @param cacheNodeCreateTime <p>
     *            The date and time when the cache node was created in the
     *            source cluster.
     *            </p>
     */
    public void setCacheNodeCreateTime(java.util.Date cacheNodeCreateTime) {
        this.cacheNodeCreateTime = cacheNodeCreateTime;
    }

    /**
     * <p>
     * The date and time when the cache node was created in the source cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeCreateTime <p>
     *            The date and time when the cache node was created in the
     *            source cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeSnapshot withCacheNodeCreateTime(java.util.Date cacheNodeCreateTime) {
        this.cacheNodeCreateTime = cacheNodeCreateTime;
        return this;
    }

    /**
     * <p>
     * The date and time when the source node's metadata and cache data set was
     * obtained for the snapshot.
     * </p>
     *
     * @return <p>
     *         The date and time when the source node's metadata and cache data
     *         set was obtained for the snapshot.
     *         </p>
     */
    public java.util.Date getSnapshotCreateTime() {
        return snapshotCreateTime;
    }

    /**
     * <p>
     * The date and time when the source node's metadata and cache data set was
     * obtained for the snapshot.
     * </p>
     *
     * @param snapshotCreateTime <p>
     *            The date and time when the source node's metadata and cache
     *            data set was obtained for the snapshot.
     *            </p>
     */
    public void setSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        this.snapshotCreateTime = snapshotCreateTime;
    }

    /**
     * <p>
     * The date and time when the source node's metadata and cache data set was
     * obtained for the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotCreateTime <p>
     *            The date and time when the source node's metadata and cache
     *            data set was obtained for the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeSnapshot withSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        this.snapshotCreateTime = snapshotCreateTime;
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
        if (getNodeGroupId() != null)
            sb.append("NodeGroupId: " + getNodeGroupId() + ",");
        if (getCacheNodeId() != null)
            sb.append("CacheNodeId: " + getCacheNodeId() + ",");
        if (getNodeGroupConfiguration() != null)
            sb.append("NodeGroupConfiguration: " + getNodeGroupConfiguration() + ",");
        if (getCacheSize() != null)
            sb.append("CacheSize: " + getCacheSize() + ",");
        if (getCacheNodeCreateTime() != null)
            sb.append("CacheNodeCreateTime: " + getCacheNodeCreateTime() + ",");
        if (getSnapshotCreateTime() != null)
            sb.append("SnapshotCreateTime: " + getSnapshotCreateTime());
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
                + ((getNodeGroupId() == null) ? 0 : getNodeGroupId().hashCode());
        hashCode = prime * hashCode
                + ((getCacheNodeId() == null) ? 0 : getCacheNodeId().hashCode());
        hashCode = prime
                * hashCode
                + ((getNodeGroupConfiguration() == null) ? 0 : getNodeGroupConfiguration()
                        .hashCode());
        hashCode = prime * hashCode + ((getCacheSize() == null) ? 0 : getCacheSize().hashCode());
        hashCode = prime * hashCode
                + ((getCacheNodeCreateTime() == null) ? 0 : getCacheNodeCreateTime().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotCreateTime() == null) ? 0 : getSnapshotCreateTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeSnapshot == false)
            return false;
        NodeSnapshot other = (NodeSnapshot) obj;

        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null
                && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getNodeGroupId() == null ^ this.getNodeGroupId() == null)
            return false;
        if (other.getNodeGroupId() != null
                && other.getNodeGroupId().equals(this.getNodeGroupId()) == false)
            return false;
        if (other.getCacheNodeId() == null ^ this.getCacheNodeId() == null)
            return false;
        if (other.getCacheNodeId() != null
                && other.getCacheNodeId().equals(this.getCacheNodeId()) == false)
            return false;
        if (other.getNodeGroupConfiguration() == null ^ this.getNodeGroupConfiguration() == null)
            return false;
        if (other.getNodeGroupConfiguration() != null
                && other.getNodeGroupConfiguration().equals(this.getNodeGroupConfiguration()) == false)
            return false;
        if (other.getCacheSize() == null ^ this.getCacheSize() == null)
            return false;
        if (other.getCacheSize() != null
                && other.getCacheSize().equals(this.getCacheSize()) == false)
            return false;
        if (other.getCacheNodeCreateTime() == null ^ this.getCacheNodeCreateTime() == null)
            return false;
        if (other.getCacheNodeCreateTime() != null
                && other.getCacheNodeCreateTime().equals(this.getCacheNodeCreateTime()) == false)
            return false;
        if (other.getSnapshotCreateTime() == null ^ this.getSnapshotCreateTime() == null)
            return false;
        if (other.getSnapshotCreateTime() != null
                && other.getSnapshotCreateTime().equals(this.getSnapshotCreateTime()) == false)
            return false;
        return true;
    }
}
