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

package com.amazonaws.services.dms.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class DeleteReplicationTaskResult implements Serializable {
    /**
     * <p>
     * The deleted replication task.
     * </p>
     */
    private ReplicationTask replicationTask;

    /**
     * <p>
     * The deleted replication task.
     * </p>
     *
     * @return <p>
     *         The deleted replication task.
     *         </p>
     */
    public ReplicationTask getReplicationTask() {
        return replicationTask;
    }

    /**
     * <p>
     * The deleted replication task.
     * </p>
     *
     * @param replicationTask <p>
     *            The deleted replication task.
     *            </p>
     */
    public void setReplicationTask(ReplicationTask replicationTask) {
        this.replicationTask = replicationTask;
    }

    /**
     * <p>
     * The deleted replication task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationTask <p>
     *            The deleted replication task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteReplicationTaskResult withReplicationTask(ReplicationTask replicationTask) {
        this.replicationTask = replicationTask;
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
        if (getReplicationTask() != null)
            sb.append("ReplicationTask: " + getReplicationTask());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReplicationTask() == null) ? 0 : getReplicationTask().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteReplicationTaskResult == false)
            return false;
        DeleteReplicationTaskResult other = (DeleteReplicationTaskResult) obj;

        if (other.getReplicationTask() == null ^ this.getReplicationTask() == null)
            return false;
        if (other.getReplicationTask() != null
                && other.getReplicationTask().equals(this.getReplicationTask()) == false)
            return false;
        return true;
    }
}
