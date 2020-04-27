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

package com.amazonaws.services.awsdatabasemigrationservice.model;

import java.io.Serializable;

/**
 * <p>
 * Contains metadata for a replication instance task log.
 * </p>
 */
public class ReplicationInstanceTaskLog implements Serializable {
    /**
     * <p>
     * The name of the replication task.
     * </p>
     */
    private String replicationTaskName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     */
    private String replicationTaskArn;

    /**
     * <p>
     * The size, in bytes, of the replication task log.
     * </p>
     */
    private Long replicationInstanceTaskLogSize;

    /**
     * <p>
     * The name of the replication task.
     * </p>
     *
     * @return <p>
     *         The name of the replication task.
     *         </p>
     */
    public String getReplicationTaskName() {
        return replicationTaskName;
    }

    /**
     * <p>
     * The name of the replication task.
     * </p>
     *
     * @param replicationTaskName <p>
     *            The name of the replication task.
     *            </p>
     */
    public void setReplicationTaskName(String replicationTaskName) {
        this.replicationTaskName = replicationTaskName;
    }

    /**
     * <p>
     * The name of the replication task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationTaskName <p>
     *            The name of the replication task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationInstanceTaskLog withReplicationTaskName(String replicationTaskName) {
        this.replicationTaskName = replicationTaskName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the replication task.
     *         </p>
     */
    public String getReplicationTaskArn() {
        return replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     *
     * @param replicationTaskArn <p>
     *            The Amazon Resource Name (ARN) of the replication task.
     *            </p>
     */
    public void setReplicationTaskArn(String replicationTaskArn) {
        this.replicationTaskArn = replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationTaskArn <p>
     *            The Amazon Resource Name (ARN) of the replication task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationInstanceTaskLog withReplicationTaskArn(String replicationTaskArn) {
        this.replicationTaskArn = replicationTaskArn;
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of the replication task log.
     * </p>
     *
     * @return <p>
     *         The size, in bytes, of the replication task log.
     *         </p>
     */
    public Long getReplicationInstanceTaskLogSize() {
        return replicationInstanceTaskLogSize;
    }

    /**
     * <p>
     * The size, in bytes, of the replication task log.
     * </p>
     *
     * @param replicationInstanceTaskLogSize <p>
     *            The size, in bytes, of the replication task log.
     *            </p>
     */
    public void setReplicationInstanceTaskLogSize(Long replicationInstanceTaskLogSize) {
        this.replicationInstanceTaskLogSize = replicationInstanceTaskLogSize;
    }

    /**
     * <p>
     * The size, in bytes, of the replication task log.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstanceTaskLogSize <p>
     *            The size, in bytes, of the replication task log.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationInstanceTaskLog withReplicationInstanceTaskLogSize(
            Long replicationInstanceTaskLogSize) {
        this.replicationInstanceTaskLogSize = replicationInstanceTaskLogSize;
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
        if (getReplicationTaskName() != null)
            sb.append("ReplicationTaskName: " + getReplicationTaskName() + ",");
        if (getReplicationTaskArn() != null)
            sb.append("ReplicationTaskArn: " + getReplicationTaskArn() + ",");
        if (getReplicationInstanceTaskLogSize() != null)
            sb.append("ReplicationInstanceTaskLogSize: " + getReplicationInstanceTaskLogSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReplicationTaskName() == null) ? 0 : getReplicationTaskName().hashCode());
        hashCode = prime * hashCode
                + ((getReplicationTaskArn() == null) ? 0 : getReplicationTaskArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationInstanceTaskLogSize() == null) ? 0
                        : getReplicationInstanceTaskLogSize().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationInstanceTaskLog == false)
            return false;
        ReplicationInstanceTaskLog other = (ReplicationInstanceTaskLog) obj;

        if (other.getReplicationTaskName() == null ^ this.getReplicationTaskName() == null)
            return false;
        if (other.getReplicationTaskName() != null
                && other.getReplicationTaskName().equals(this.getReplicationTaskName()) == false)
            return false;
        if (other.getReplicationTaskArn() == null ^ this.getReplicationTaskArn() == null)
            return false;
        if (other.getReplicationTaskArn() != null
                && other.getReplicationTaskArn().equals(this.getReplicationTaskArn()) == false)
            return false;
        if (other.getReplicationInstanceTaskLogSize() == null
                ^ this.getReplicationInstanceTaskLogSize() == null)
            return false;
        if (other.getReplicationInstanceTaskLogSize() != null
                && other.getReplicationInstanceTaskLogSize().equals(
                        this.getReplicationInstanceTaskLogSize()) == false)
            return false;
        return true;
    }
}
