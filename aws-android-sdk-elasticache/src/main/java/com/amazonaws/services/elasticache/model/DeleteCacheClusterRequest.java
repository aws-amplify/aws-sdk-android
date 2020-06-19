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
 * Deletes a previously provisioned cluster. <code>DeleteCacheCluster</code>
 * deletes all associated cache nodes, node endpoints and the cluster itself.
 * When you receive a successful response from this operation, Amazon
 * ElastiCache immediately begins deleting the cluster; you cannot cancel or
 * revert this operation.
 * </p>
 * <p>
 * This operation is not valid for:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Redis (cluster mode enabled) clusters
 * </p>
 * </li>
 * <li>
 * <p>
 * A cluster that is the last read replica of a replication group
 * </p>
 * </li>
 * <li>
 * <p>
 * A node group (shard) that has Multi-AZ mode enabled
 * </p>
 * </li>
 * <li>
 * <p>
 * A cluster from a Redis (cluster mode enabled) replication group
 * </p>
 * </li>
 * <li>
 * <p>
 * A cluster that is not in the <code>available</code> state
 * </p>
 * </li>
 * </ul>
 */
public class DeleteCacheClusterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The cluster identifier for the cluster to be deleted. This parameter is
     * not case sensitive.
     * </p>
     */
    private String cacheClusterId;

    /**
     * <p>
     * The user-supplied name of a final cluster snapshot. This is the unique
     * name that identifies the snapshot. ElastiCache creates the snapshot, and
     * then deletes the cluster immediately afterward.
     * </p>
     */
    private String finalSnapshotIdentifier;

    /**
     * <p>
     * The cluster identifier for the cluster to be deleted. This parameter is
     * not case sensitive.
     * </p>
     *
     * @return <p>
     *         The cluster identifier for the cluster to be deleted. This
     *         parameter is not case sensitive.
     *         </p>
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }

    /**
     * <p>
     * The cluster identifier for the cluster to be deleted. This parameter is
     * not case sensitive.
     * </p>
     *
     * @param cacheClusterId <p>
     *            The cluster identifier for the cluster to be deleted. This
     *            parameter is not case sensitive.
     *            </p>
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * The cluster identifier for the cluster to be deleted. This parameter is
     * not case sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheClusterId <p>
     *            The cluster identifier for the cluster to be deleted. This
     *            parameter is not case sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteCacheClusterRequest withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
        return this;
    }

    /**
     * <p>
     * The user-supplied name of a final cluster snapshot. This is the unique
     * name that identifies the snapshot. ElastiCache creates the snapshot, and
     * then deletes the cluster immediately afterward.
     * </p>
     *
     * @return <p>
     *         The user-supplied name of a final cluster snapshot. This is the
     *         unique name that identifies the snapshot. ElastiCache creates the
     *         snapshot, and then deletes the cluster immediately afterward.
     *         </p>
     */
    public String getFinalSnapshotIdentifier() {
        return finalSnapshotIdentifier;
    }

    /**
     * <p>
     * The user-supplied name of a final cluster snapshot. This is the unique
     * name that identifies the snapshot. ElastiCache creates the snapshot, and
     * then deletes the cluster immediately afterward.
     * </p>
     *
     * @param finalSnapshotIdentifier <p>
     *            The user-supplied name of a final cluster snapshot. This is
     *            the unique name that identifies the snapshot. ElastiCache
     *            creates the snapshot, and then deletes the cluster immediately
     *            afterward.
     *            </p>
     */
    public void setFinalSnapshotIdentifier(String finalSnapshotIdentifier) {
        this.finalSnapshotIdentifier = finalSnapshotIdentifier;
    }

    /**
     * <p>
     * The user-supplied name of a final cluster snapshot. This is the unique
     * name that identifies the snapshot. ElastiCache creates the snapshot, and
     * then deletes the cluster immediately afterward.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param finalSnapshotIdentifier <p>
     *            The user-supplied name of a final cluster snapshot. This is
     *            the unique name that identifies the snapshot. ElastiCache
     *            creates the snapshot, and then deletes the cluster immediately
     *            afterward.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteCacheClusterRequest withFinalSnapshotIdentifier(String finalSnapshotIdentifier) {
        this.finalSnapshotIdentifier = finalSnapshotIdentifier;
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
        if (getFinalSnapshotIdentifier() != null)
            sb.append("FinalSnapshotIdentifier: " + getFinalSnapshotIdentifier());
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
                + ((getFinalSnapshotIdentifier() == null) ? 0 : getFinalSnapshotIdentifier()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCacheClusterRequest == false)
            return false;
        DeleteCacheClusterRequest other = (DeleteCacheClusterRequest) obj;

        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null
                && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getFinalSnapshotIdentifier() == null ^ this.getFinalSnapshotIdentifier() == null)
            return false;
        if (other.getFinalSnapshotIdentifier() != null
                && other.getFinalSnapshotIdentifier().equals(this.getFinalSnapshotIdentifier()) == false)
            return false;
        return true;
    }
}
