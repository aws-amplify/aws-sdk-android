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
 * Creates a copy of an entire cluster or replication group at a specific moment
 * in time.
 * </p>
 * <note>
 * <p>
 * This operation is valid for Redis only.
 * </p>
 * </note>
 */
public class CreateSnapshotRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of an existing replication group. The snapshot is created
     * from this replication group.
     * </p>
     */
    private String replicationGroupId;

    /**
     * <p>
     * The identifier of an existing cluster. The snapshot is created from this
     * cluster.
     * </p>
     */
    private String cacheClusterId;

    /**
     * <p>
     * A name for the snapshot being created.
     * </p>
     */
    private String snapshotName;

    /**
     * <p>
     * The ID of the KMS key used to encrypt the snapshot.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The identifier of an existing replication group. The snapshot is created
     * from this replication group.
     * </p>
     *
     * @return <p>
     *         The identifier of an existing replication group. The snapshot is
     *         created from this replication group.
     *         </p>
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }

    /**
     * <p>
     * The identifier of an existing replication group. The snapshot is created
     * from this replication group.
     * </p>
     *
     * @param replicationGroupId <p>
     *            The identifier of an existing replication group. The snapshot
     *            is created from this replication group.
     *            </p>
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The identifier of an existing replication group. The snapshot is created
     * from this replication group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupId <p>
     *            The identifier of an existing replication group. The snapshot
     *            is created from this replication group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotRequest withReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
        return this;
    }

    /**
     * <p>
     * The identifier of an existing cluster. The snapshot is created from this
     * cluster.
     * </p>
     *
     * @return <p>
     *         The identifier of an existing cluster. The snapshot is created
     *         from this cluster.
     *         </p>
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }

    /**
     * <p>
     * The identifier of an existing cluster. The snapshot is created from this
     * cluster.
     * </p>
     *
     * @param cacheClusterId <p>
     *            The identifier of an existing cluster. The snapshot is created
     *            from this cluster.
     *            </p>
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * The identifier of an existing cluster. The snapshot is created from this
     * cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheClusterId <p>
     *            The identifier of an existing cluster. The snapshot is created
     *            from this cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotRequest withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
        return this;
    }

    /**
     * <p>
     * A name for the snapshot being created.
     * </p>
     *
     * @return <p>
     *         A name for the snapshot being created.
     *         </p>
     */
    public String getSnapshotName() {
        return snapshotName;
    }

    /**
     * <p>
     * A name for the snapshot being created.
     * </p>
     *
     * @param snapshotName <p>
     *            A name for the snapshot being created.
     *            </p>
     */
    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * A name for the snapshot being created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotName <p>
     *            A name for the snapshot being created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotRequest withSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the snapshot.
     * </p>
     *
     * @return <p>
     *         The ID of the KMS key used to encrypt the snapshot.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the snapshot.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The ID of the KMS key used to encrypt the snapshot.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The ID of the KMS key used to encrypt the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
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
        if (getCacheClusterId() != null)
            sb.append("CacheClusterId: " + getCacheClusterId() + ",");
        if (getSnapshotName() != null)
            sb.append("SnapshotName: " + getSnapshotName() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId());
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
                + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSnapshotRequest == false)
            return false;
        CreateSnapshotRequest other = (CreateSnapshotRequest) obj;

        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null
                && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null
                && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null
                && other.getSnapshotName().equals(this.getSnapshotName()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }
}
