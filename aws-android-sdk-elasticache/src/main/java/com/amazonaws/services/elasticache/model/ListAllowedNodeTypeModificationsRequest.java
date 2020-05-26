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
 * Lists all available node types that you can scale your Redis cluster's or
 * replication group's current node type.
 * </p>
 * <p>
 * When you use the <code>ModifyCacheCluster</code> or
 * <code>ModifyReplicationGroup</code> operations to scale your cluster or
 * replication group, the value of the <code>CacheNodeType</code> parameter must
 * be one of the node types returned by this operation.
 * </p>
 */
public class ListAllowedNodeTypeModificationsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the cluster you want to scale up to a larger node instanced
     * type. ElastiCache uses the cluster id to identify the current node type
     * of this cluster and from that to create a list of node types you can
     * scale up to.
     * </p>
     * <important>
     * <p>
     * You must provide a value for either the <code>CacheClusterId</code> or
     * the <code>ReplicationGroupId</code>.
     * </p>
     * </important>
     */
    private String cacheClusterId;

    /**
     * <p>
     * The name of the replication group want to scale up to a larger node type.
     * ElastiCache uses the replication group id to identify the current node
     * type being used by this replication group, and from that to create a list
     * of node types you can scale up to.
     * </p>
     * <important>
     * <p>
     * You must provide a value for either the <code>CacheClusterId</code> or
     * the <code>ReplicationGroupId</code>.
     * </p>
     * </important>
     */
    private String replicationGroupId;

    /**
     * <p>
     * The name of the cluster you want to scale up to a larger node instanced
     * type. ElastiCache uses the cluster id to identify the current node type
     * of this cluster and from that to create a list of node types you can
     * scale up to.
     * </p>
     * <important>
     * <p>
     * You must provide a value for either the <code>CacheClusterId</code> or
     * the <code>ReplicationGroupId</code>.
     * </p>
     * </important>
     *
     * @return <p>
     *         The name of the cluster you want to scale up to a larger node
     *         instanced type. ElastiCache uses the cluster id to identify the
     *         current node type of this cluster and from that to create a list
     *         of node types you can scale up to.
     *         </p>
     *         <important>
     *         <p>
     *         You must provide a value for either the
     *         <code>CacheClusterId</code> or the
     *         <code>ReplicationGroupId</code>.
     *         </p>
     *         </important>
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }

    /**
     * <p>
     * The name of the cluster you want to scale up to a larger node instanced
     * type. ElastiCache uses the cluster id to identify the current node type
     * of this cluster and from that to create a list of node types you can
     * scale up to.
     * </p>
     * <important>
     * <p>
     * You must provide a value for either the <code>CacheClusterId</code> or
     * the <code>ReplicationGroupId</code>.
     * </p>
     * </important>
     *
     * @param cacheClusterId <p>
     *            The name of the cluster you want to scale up to a larger node
     *            instanced type. ElastiCache uses the cluster id to identify
     *            the current node type of this cluster and from that to create
     *            a list of node types you can scale up to.
     *            </p>
     *            <important>
     *            <p>
     *            You must provide a value for either the
     *            <code>CacheClusterId</code> or the
     *            <code>ReplicationGroupId</code>.
     *            </p>
     *            </important>
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * The name of the cluster you want to scale up to a larger node instanced
     * type. ElastiCache uses the cluster id to identify the current node type
     * of this cluster and from that to create a list of node types you can
     * scale up to.
     * </p>
     * <important>
     * <p>
     * You must provide a value for either the <code>CacheClusterId</code> or
     * the <code>ReplicationGroupId</code>.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheClusterId <p>
     *            The name of the cluster you want to scale up to a larger node
     *            instanced type. ElastiCache uses the cluster id to identify
     *            the current node type of this cluster and from that to create
     *            a list of node types you can scale up to.
     *            </p>
     *            <important>
     *            <p>
     *            You must provide a value for either the
     *            <code>CacheClusterId</code> or the
     *            <code>ReplicationGroupId</code>.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAllowedNodeTypeModificationsRequest withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
        return this;
    }

    /**
     * <p>
     * The name of the replication group want to scale up to a larger node type.
     * ElastiCache uses the replication group id to identify the current node
     * type being used by this replication group, and from that to create a list
     * of node types you can scale up to.
     * </p>
     * <important>
     * <p>
     * You must provide a value for either the <code>CacheClusterId</code> or
     * the <code>ReplicationGroupId</code>.
     * </p>
     * </important>
     *
     * @return <p>
     *         The name of the replication group want to scale up to a larger
     *         node type. ElastiCache uses the replication group id to identify
     *         the current node type being used by this replication group, and
     *         from that to create a list of node types you can scale up to.
     *         </p>
     *         <important>
     *         <p>
     *         You must provide a value for either the
     *         <code>CacheClusterId</code> or the
     *         <code>ReplicationGroupId</code>.
     *         </p>
     *         </important>
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }

    /**
     * <p>
     * The name of the replication group want to scale up to a larger node type.
     * ElastiCache uses the replication group id to identify the current node
     * type being used by this replication group, and from that to create a list
     * of node types you can scale up to.
     * </p>
     * <important>
     * <p>
     * You must provide a value for either the <code>CacheClusterId</code> or
     * the <code>ReplicationGroupId</code>.
     * </p>
     * </important>
     *
     * @param replicationGroupId <p>
     *            The name of the replication group want to scale up to a larger
     *            node type. ElastiCache uses the replication group id to
     *            identify the current node type being used by this replication
     *            group, and from that to create a list of node types you can
     *            scale up to.
     *            </p>
     *            <important>
     *            <p>
     *            You must provide a value for either the
     *            <code>CacheClusterId</code> or the
     *            <code>ReplicationGroupId</code>.
     *            </p>
     *            </important>
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The name of the replication group want to scale up to a larger node type.
     * ElastiCache uses the replication group id to identify the current node
     * type being used by this replication group, and from that to create a list
     * of node types you can scale up to.
     * </p>
     * <important>
     * <p>
     * You must provide a value for either the <code>CacheClusterId</code> or
     * the <code>ReplicationGroupId</code>.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupId <p>
     *            The name of the replication group want to scale up to a larger
     *            node type. ElastiCache uses the replication group id to
     *            identify the current node type being used by this replication
     *            group, and from that to create a list of node types you can
     *            scale up to.
     *            </p>
     *            <important>
     *            <p>
     *            You must provide a value for either the
     *            <code>CacheClusterId</code> or the
     *            <code>ReplicationGroupId</code>.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAllowedNodeTypeModificationsRequest withReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
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
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: " + getReplicationGroupId());
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
                + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAllowedNodeTypeModificationsRequest == false)
            return false;
        ListAllowedNodeTypeModificationsRequest other = (ListAllowedNodeTypeModificationsRequest) obj;

        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null
                && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null
                && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        return true;
    }
}
