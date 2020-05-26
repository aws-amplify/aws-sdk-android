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
 * Represents an individual cache node within a cluster. Each cache node runs
 * its own instance of the cluster's protocol-compliant caching software -
 * either Memcached or Redis.
 * </p>
 * <p>
 * The following node types are supported by ElastiCache. Generally speaking,
 * the current generation types provide more memory and computational power at
 * lower cost when compared to their equivalent previous generation
 * counterparts.
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
 * All current generation instance types are created in Amazon VPC by default.
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
 * <code>appendfsync</code> are not supported on Redis version 2.8.22 and later.
 * </p>
 * </li>
 * </ul>
 */
public class CacheNode implements Serializable {
    /**
     * <p>
     * The cache node identifier. A node ID is a numeric identifier (0001, 0002,
     * etc.). The combination of cluster ID and node ID uniquely identifies
     * every cache node used in a customer's AWS account.
     * </p>
     */
    private String cacheNodeId;

    /**
     * <p>
     * The current state of this cache node, one of the following values:
     * <code>available</code>, <code>creating</code>, <code>rebooting</code>, or
     * <code>deleting</code>.
     * </p>
     */
    private String cacheNodeStatus;

    /**
     * <p>
     * The date and time when the cache node was created.
     * </p>
     */
    private java.util.Date cacheNodeCreateTime;

    /**
     * <p>
     * The hostname for connecting to this cache node.
     * </p>
     */
    private Endpoint endpoint;

    /**
     * <p>
     * The status of the parameter group applied to this cache node.
     * </p>
     */
    private String parameterGroupStatus;

    /**
     * <p>
     * The ID of the primary node to which this read replica node is
     * synchronized. If this field is empty, this node is not associated with a
     * primary cluster.
     * </p>
     */
    private String sourceCacheNodeId;

    /**
     * <p>
     * The Availability Zone where this node was created and now resides.
     * </p>
     */
    private String customerAvailabilityZone;

    /**
     * <p>
     * The cache node identifier. A node ID is a numeric identifier (0001, 0002,
     * etc.). The combination of cluster ID and node ID uniquely identifies
     * every cache node used in a customer's AWS account.
     * </p>
     *
     * @return <p>
     *         The cache node identifier. A node ID is a numeric identifier
     *         (0001, 0002, etc.). The combination of cluster ID and node ID
     *         uniquely identifies every cache node used in a customer's AWS
     *         account.
     *         </p>
     */
    public String getCacheNodeId() {
        return cacheNodeId;
    }

    /**
     * <p>
     * The cache node identifier. A node ID is a numeric identifier (0001, 0002,
     * etc.). The combination of cluster ID and node ID uniquely identifies
     * every cache node used in a customer's AWS account.
     * </p>
     *
     * @param cacheNodeId <p>
     *            The cache node identifier. A node ID is a numeric identifier
     *            (0001, 0002, etc.). The combination of cluster ID and node ID
     *            uniquely identifies every cache node used in a customer's AWS
     *            account.
     *            </p>
     */
    public void setCacheNodeId(String cacheNodeId) {
        this.cacheNodeId = cacheNodeId;
    }

    /**
     * <p>
     * The cache node identifier. A node ID is a numeric identifier (0001, 0002,
     * etc.). The combination of cluster ID and node ID uniquely identifies
     * every cache node used in a customer's AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeId <p>
     *            The cache node identifier. A node ID is a numeric identifier
     *            (0001, 0002, etc.). The combination of cluster ID and node ID
     *            uniquely identifies every cache node used in a customer's AWS
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheNode withCacheNodeId(String cacheNodeId) {
        this.cacheNodeId = cacheNodeId;
        return this;
    }

    /**
     * <p>
     * The current state of this cache node, one of the following values:
     * <code>available</code>, <code>creating</code>, <code>rebooting</code>, or
     * <code>deleting</code>.
     * </p>
     *
     * @return <p>
     *         The current state of this cache node, one of the following
     *         values: <code>available</code>, <code>creating</code>,
     *         <code>rebooting</code>, or <code>deleting</code>.
     *         </p>
     */
    public String getCacheNodeStatus() {
        return cacheNodeStatus;
    }

    /**
     * <p>
     * The current state of this cache node, one of the following values:
     * <code>available</code>, <code>creating</code>, <code>rebooting</code>, or
     * <code>deleting</code>.
     * </p>
     *
     * @param cacheNodeStatus <p>
     *            The current state of this cache node, one of the following
     *            values: <code>available</code>, <code>creating</code>,
     *            <code>rebooting</code>, or <code>deleting</code>.
     *            </p>
     */
    public void setCacheNodeStatus(String cacheNodeStatus) {
        this.cacheNodeStatus = cacheNodeStatus;
    }

    /**
     * <p>
     * The current state of this cache node, one of the following values:
     * <code>available</code>, <code>creating</code>, <code>rebooting</code>, or
     * <code>deleting</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeStatus <p>
     *            The current state of this cache node, one of the following
     *            values: <code>available</code>, <code>creating</code>,
     *            <code>rebooting</code>, or <code>deleting</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheNode withCacheNodeStatus(String cacheNodeStatus) {
        this.cacheNodeStatus = cacheNodeStatus;
        return this;
    }

    /**
     * <p>
     * The date and time when the cache node was created.
     * </p>
     *
     * @return <p>
     *         The date and time when the cache node was created.
     *         </p>
     */
    public java.util.Date getCacheNodeCreateTime() {
        return cacheNodeCreateTime;
    }

    /**
     * <p>
     * The date and time when the cache node was created.
     * </p>
     *
     * @param cacheNodeCreateTime <p>
     *            The date and time when the cache node was created.
     *            </p>
     */
    public void setCacheNodeCreateTime(java.util.Date cacheNodeCreateTime) {
        this.cacheNodeCreateTime = cacheNodeCreateTime;
    }

    /**
     * <p>
     * The date and time when the cache node was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeCreateTime <p>
     *            The date and time when the cache node was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheNode withCacheNodeCreateTime(java.util.Date cacheNodeCreateTime) {
        this.cacheNodeCreateTime = cacheNodeCreateTime;
        return this;
    }

    /**
     * <p>
     * The hostname for connecting to this cache node.
     * </p>
     *
     * @return <p>
     *         The hostname for connecting to this cache node.
     *         </p>
     */
    public Endpoint getEndpoint() {
        return endpoint;
    }

    /**
     * <p>
     * The hostname for connecting to this cache node.
     * </p>
     *
     * @param endpoint <p>
     *            The hostname for connecting to this cache node.
     *            </p>
     */
    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The hostname for connecting to this cache node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoint <p>
     *            The hostname for connecting to this cache node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheNode withEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * <p>
     * The status of the parameter group applied to this cache node.
     * </p>
     *
     * @return <p>
     *         The status of the parameter group applied to this cache node.
     *         </p>
     */
    public String getParameterGroupStatus() {
        return parameterGroupStatus;
    }

    /**
     * <p>
     * The status of the parameter group applied to this cache node.
     * </p>
     *
     * @param parameterGroupStatus <p>
     *            The status of the parameter group applied to this cache node.
     *            </p>
     */
    public void setParameterGroupStatus(String parameterGroupStatus) {
        this.parameterGroupStatus = parameterGroupStatus;
    }

    /**
     * <p>
     * The status of the parameter group applied to this cache node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterGroupStatus <p>
     *            The status of the parameter group applied to this cache node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheNode withParameterGroupStatus(String parameterGroupStatus) {
        this.parameterGroupStatus = parameterGroupStatus;
        return this;
    }

    /**
     * <p>
     * The ID of the primary node to which this read replica node is
     * synchronized. If this field is empty, this node is not associated with a
     * primary cluster.
     * </p>
     *
     * @return <p>
     *         The ID of the primary node to which this read replica node is
     *         synchronized. If this field is empty, this node is not associated
     *         with a primary cluster.
     *         </p>
     */
    public String getSourceCacheNodeId() {
        return sourceCacheNodeId;
    }

    /**
     * <p>
     * The ID of the primary node to which this read replica node is
     * synchronized. If this field is empty, this node is not associated with a
     * primary cluster.
     * </p>
     *
     * @param sourceCacheNodeId <p>
     *            The ID of the primary node to which this read replica node is
     *            synchronized. If this field is empty, this node is not
     *            associated with a primary cluster.
     *            </p>
     */
    public void setSourceCacheNodeId(String sourceCacheNodeId) {
        this.sourceCacheNodeId = sourceCacheNodeId;
    }

    /**
     * <p>
     * The ID of the primary node to which this read replica node is
     * synchronized. If this field is empty, this node is not associated with a
     * primary cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceCacheNodeId <p>
     *            The ID of the primary node to which this read replica node is
     *            synchronized. If this field is empty, this node is not
     *            associated with a primary cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheNode withSourceCacheNodeId(String sourceCacheNodeId) {
        this.sourceCacheNodeId = sourceCacheNodeId;
        return this;
    }

    /**
     * <p>
     * The Availability Zone where this node was created and now resides.
     * </p>
     *
     * @return <p>
     *         The Availability Zone where this node was created and now
     *         resides.
     *         </p>
     */
    public String getCustomerAvailabilityZone() {
        return customerAvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where this node was created and now resides.
     * </p>
     *
     * @param customerAvailabilityZone <p>
     *            The Availability Zone where this node was created and now
     *            resides.
     *            </p>
     */
    public void setCustomerAvailabilityZone(String customerAvailabilityZone) {
        this.customerAvailabilityZone = customerAvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where this node was created and now resides.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customerAvailabilityZone <p>
     *            The Availability Zone where this node was created and now
     *            resides.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheNode withCustomerAvailabilityZone(String customerAvailabilityZone) {
        this.customerAvailabilityZone = customerAvailabilityZone;
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
        if (getCacheNodeId() != null)
            sb.append("CacheNodeId: " + getCacheNodeId() + ",");
        if (getCacheNodeStatus() != null)
            sb.append("CacheNodeStatus: " + getCacheNodeStatus() + ",");
        if (getCacheNodeCreateTime() != null)
            sb.append("CacheNodeCreateTime: " + getCacheNodeCreateTime() + ",");
        if (getEndpoint() != null)
            sb.append("Endpoint: " + getEndpoint() + ",");
        if (getParameterGroupStatus() != null)
            sb.append("ParameterGroupStatus: " + getParameterGroupStatus() + ",");
        if (getSourceCacheNodeId() != null)
            sb.append("SourceCacheNodeId: " + getSourceCacheNodeId() + ",");
        if (getCustomerAvailabilityZone() != null)
            sb.append("CustomerAvailabilityZone: " + getCustomerAvailabilityZone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCacheNodeId() == null) ? 0 : getCacheNodeId().hashCode());
        hashCode = prime * hashCode
                + ((getCacheNodeStatus() == null) ? 0 : getCacheNodeStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCacheNodeCreateTime() == null) ? 0 : getCacheNodeCreateTime().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode
                + ((getParameterGroupStatus() == null) ? 0 : getParameterGroupStatus().hashCode());
        hashCode = prime * hashCode
                + ((getSourceCacheNodeId() == null) ? 0 : getSourceCacheNodeId().hashCode());
        hashCode = prime
                * hashCode
                + ((getCustomerAvailabilityZone() == null) ? 0 : getCustomerAvailabilityZone()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CacheNode == false)
            return false;
        CacheNode other = (CacheNode) obj;

        if (other.getCacheNodeId() == null ^ this.getCacheNodeId() == null)
            return false;
        if (other.getCacheNodeId() != null
                && other.getCacheNodeId().equals(this.getCacheNodeId()) == false)
            return false;
        if (other.getCacheNodeStatus() == null ^ this.getCacheNodeStatus() == null)
            return false;
        if (other.getCacheNodeStatus() != null
                && other.getCacheNodeStatus().equals(this.getCacheNodeStatus()) == false)
            return false;
        if (other.getCacheNodeCreateTime() == null ^ this.getCacheNodeCreateTime() == null)
            return false;
        if (other.getCacheNodeCreateTime() != null
                && other.getCacheNodeCreateTime().equals(this.getCacheNodeCreateTime()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getParameterGroupStatus() == null ^ this.getParameterGroupStatus() == null)
            return false;
        if (other.getParameterGroupStatus() != null
                && other.getParameterGroupStatus().equals(this.getParameterGroupStatus()) == false)
            return false;
        if (other.getSourceCacheNodeId() == null ^ this.getSourceCacheNodeId() == null)
            return false;
        if (other.getSourceCacheNodeId() != null
                && other.getSourceCacheNodeId().equals(this.getSourceCacheNodeId()) == false)
            return false;
        if (other.getCustomerAvailabilityZone() == null
                ^ this.getCustomerAvailabilityZone() == null)
            return false;
        if (other.getCustomerAvailabilityZone() != null
                && other.getCustomerAvailabilityZone().equals(this.getCustomerAvailabilityZone()) == false)
            return false;
        return true;
    }
}
