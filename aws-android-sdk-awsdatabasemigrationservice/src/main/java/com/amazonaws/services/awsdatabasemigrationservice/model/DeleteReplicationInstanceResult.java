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
 * <p/>
 */
public class DeleteReplicationInstanceResult implements Serializable {
    /**
     * <p>
     * The replication instance that was deleted.
     * </p>
     */
    private ReplicationInstance replicationInstance;

    /**
     * <p>
     * The replication instance that was deleted.
     * </p>
     *
     * @return <p>
     *         The replication instance that was deleted.
     *         </p>
     */
    public ReplicationInstance getReplicationInstance() {
        return replicationInstance;
    }

    /**
     * <p>
     * The replication instance that was deleted.
     * </p>
     *
     * @param replicationInstance <p>
     *            The replication instance that was deleted.
     *            </p>
     */
    public void setReplicationInstance(ReplicationInstance replicationInstance) {
        this.replicationInstance = replicationInstance;
    }

    /**
     * <p>
     * The replication instance that was deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstance <p>
     *            The replication instance that was deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteReplicationInstanceResult withReplicationInstance(
            ReplicationInstance replicationInstance) {
        this.replicationInstance = replicationInstance;
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
        if (getReplicationInstance() != null)
            sb.append("ReplicationInstance: " + getReplicationInstance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReplicationInstance() == null) ? 0 : getReplicationInstance().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteReplicationInstanceResult == false)
            return false;
        DeleteReplicationInstanceResult other = (DeleteReplicationInstanceResult) obj;

        if (other.getReplicationInstance() == null ^ this.getReplicationInstance() == null)
            return false;
        if (other.getReplicationInstance() != null
                && other.getReplicationInstance().equals(this.getReplicationInstance()) == false)
            return false;
        return true;
    }
}
