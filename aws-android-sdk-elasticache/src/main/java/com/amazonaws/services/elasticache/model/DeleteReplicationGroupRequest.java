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
 * Deletes an existing replication group. By default, this operation deletes the
 * entire replication group, including the primary/primaries and all of the read
 * replicas. If the replication group has only one primary, you can optionally
 * delete only the read replicas, while retaining the primary by setting
 * <code>RetainPrimaryCluster=true</code>.
 * </p>
 * <p>
 * When you receive a successful response from this operation, Amazon
 * ElastiCache immediately begins deleting the selected resources; you cannot
 * cancel or revert this operation.
 * </p>
 * <note>
 * <p>
 * This operation is valid for Redis only.
 * </p>
 * </note>
 */
public class DeleteReplicationGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier for the cluster to be deleted. This parameter is not case
     * sensitive.
     * </p>
     */
    private String replicationGroupId;

    /**
     * <p>
     * If set to <code>true</code>, all of the read replicas are deleted, but
     * the primary node is retained.
     * </p>
     */
    private Boolean retainPrimaryCluster;

    /**
     * <p>
     * The name of a final node group (shard) snapshot. ElastiCache creates the
     * snapshot from the primary node in the cluster, rather than one of the
     * replicas; this is to ensure that it captures the freshest data. After the
     * final snapshot is taken, the replication group is immediately deleted.
     * </p>
     */
    private String finalSnapshotIdentifier;

    /**
     * <p>
     * The identifier for the cluster to be deleted. This parameter is not case
     * sensitive.
     * </p>
     *
     * @return <p>
     *         The identifier for the cluster to be deleted. This parameter is
     *         not case sensitive.
     *         </p>
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }

    /**
     * <p>
     * The identifier for the cluster to be deleted. This parameter is not case
     * sensitive.
     * </p>
     *
     * @param replicationGroupId <p>
     *            The identifier for the cluster to be deleted. This parameter
     *            is not case sensitive.
     *            </p>
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The identifier for the cluster to be deleted. This parameter is not case
     * sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupId <p>
     *            The identifier for the cluster to be deleted. This parameter
     *            is not case sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteReplicationGroupRequest withReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, all of the read replicas are deleted, but
     * the primary node is retained.
     * </p>
     *
     * @return <p>
     *         If set to <code>true</code>, all of the read replicas are
     *         deleted, but the primary node is retained.
     *         </p>
     */
    public Boolean isRetainPrimaryCluster() {
        return retainPrimaryCluster;
    }

    /**
     * <p>
     * If set to <code>true</code>, all of the read replicas are deleted, but
     * the primary node is retained.
     * </p>
     *
     * @return <p>
     *         If set to <code>true</code>, all of the read replicas are
     *         deleted, but the primary node is retained.
     *         </p>
     */
    public Boolean getRetainPrimaryCluster() {
        return retainPrimaryCluster;
    }

    /**
     * <p>
     * If set to <code>true</code>, all of the read replicas are deleted, but
     * the primary node is retained.
     * </p>
     *
     * @param retainPrimaryCluster <p>
     *            If set to <code>true</code>, all of the read replicas are
     *            deleted, but the primary node is retained.
     *            </p>
     */
    public void setRetainPrimaryCluster(Boolean retainPrimaryCluster) {
        this.retainPrimaryCluster = retainPrimaryCluster;
    }

    /**
     * <p>
     * If set to <code>true</code>, all of the read replicas are deleted, but
     * the primary node is retained.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param retainPrimaryCluster <p>
     *            If set to <code>true</code>, all of the read replicas are
     *            deleted, but the primary node is retained.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteReplicationGroupRequest withRetainPrimaryCluster(Boolean retainPrimaryCluster) {
        this.retainPrimaryCluster = retainPrimaryCluster;
        return this;
    }

    /**
     * <p>
     * The name of a final node group (shard) snapshot. ElastiCache creates the
     * snapshot from the primary node in the cluster, rather than one of the
     * replicas; this is to ensure that it captures the freshest data. After the
     * final snapshot is taken, the replication group is immediately deleted.
     * </p>
     *
     * @return <p>
     *         The name of a final node group (shard) snapshot. ElastiCache
     *         creates the snapshot from the primary node in the cluster, rather
     *         than one of the replicas; this is to ensure that it captures the
     *         freshest data. After the final snapshot is taken, the replication
     *         group is immediately deleted.
     *         </p>
     */
    public String getFinalSnapshotIdentifier() {
        return finalSnapshotIdentifier;
    }

    /**
     * <p>
     * The name of a final node group (shard) snapshot. ElastiCache creates the
     * snapshot from the primary node in the cluster, rather than one of the
     * replicas; this is to ensure that it captures the freshest data. After the
     * final snapshot is taken, the replication group is immediately deleted.
     * </p>
     *
     * @param finalSnapshotIdentifier <p>
     *            The name of a final node group (shard) snapshot. ElastiCache
     *            creates the snapshot from the primary node in the cluster,
     *            rather than one of the replicas; this is to ensure that it
     *            captures the freshest data. After the final snapshot is taken,
     *            the replication group is immediately deleted.
     *            </p>
     */
    public void setFinalSnapshotIdentifier(String finalSnapshotIdentifier) {
        this.finalSnapshotIdentifier = finalSnapshotIdentifier;
    }

    /**
     * <p>
     * The name of a final node group (shard) snapshot. ElastiCache creates the
     * snapshot from the primary node in the cluster, rather than one of the
     * replicas; this is to ensure that it captures the freshest data. After the
     * final snapshot is taken, the replication group is immediately deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param finalSnapshotIdentifier <p>
     *            The name of a final node group (shard) snapshot. ElastiCache
     *            creates the snapshot from the primary node in the cluster,
     *            rather than one of the replicas; this is to ensure that it
     *            captures the freshest data. After the final snapshot is taken,
     *            the replication group is immediately deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteReplicationGroupRequest withFinalSnapshotIdentifier(String finalSnapshotIdentifier) {
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
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: " + getReplicationGroupId() + ",");
        if (getRetainPrimaryCluster() != null)
            sb.append("RetainPrimaryCluster: " + getRetainPrimaryCluster() + ",");
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
                + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime * hashCode
                + ((getRetainPrimaryCluster() == null) ? 0 : getRetainPrimaryCluster().hashCode());
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

        if (obj instanceof DeleteReplicationGroupRequest == false)
            return false;
        DeleteReplicationGroupRequest other = (DeleteReplicationGroupRequest) obj;

        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null
                && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getRetainPrimaryCluster() == null ^ this.getRetainPrimaryCluster() == null)
            return false;
        if (other.getRetainPrimaryCluster() != null
                && other.getRetainPrimaryCluster().equals(this.getRetainPrimaryCluster()) == false)
            return false;
        if (other.getFinalSnapshotIdentifier() == null ^ this.getFinalSnapshotIdentifier() == null)
            return false;
        if (other.getFinalSnapshotIdentifier() != null
                && other.getFinalSnapshotIdentifier().equals(this.getFinalSnapshotIdentifier()) == false)
            return false;
        return true;
    }
}
