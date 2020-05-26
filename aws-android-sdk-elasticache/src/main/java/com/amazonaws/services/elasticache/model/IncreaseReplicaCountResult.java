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

public class IncreaseReplicaCountResult implements Serializable {
    /**
     * <p>
     * Contains all of the attributes of a specific Redis replication group.
     * </p>
     */
    private ReplicationGroup replicationGroup;

    /**
     * <p>
     * Contains all of the attributes of a specific Redis replication group.
     * </p>
     *
     * @return <p>
     *         Contains all of the attributes of a specific Redis replication
     *         group.
     *         </p>
     */
    public ReplicationGroup getReplicationGroup() {
        return replicationGroup;
    }

    /**
     * <p>
     * Contains all of the attributes of a specific Redis replication group.
     * </p>
     *
     * @param replicationGroup <p>
     *            Contains all of the attributes of a specific Redis replication
     *            group.
     *            </p>
     */
    public void setReplicationGroup(ReplicationGroup replicationGroup) {
        this.replicationGroup = replicationGroup;
    }

    /**
     * <p>
     * Contains all of the attributes of a specific Redis replication group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroup <p>
     *            Contains all of the attributes of a specific Redis replication
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IncreaseReplicaCountResult withReplicationGroup(ReplicationGroup replicationGroup) {
        this.replicationGroup = replicationGroup;
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
        if (getReplicationGroup() != null)
            sb.append("ReplicationGroup: " + getReplicationGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReplicationGroup() == null) ? 0 : getReplicationGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IncreaseReplicaCountResult == false)
            return false;
        IncreaseReplicaCountResult other = (IncreaseReplicaCountResult) obj;

        if (other.getReplicationGroup() == null ^ this.getReplicationGroup() == null)
            return false;
        if (other.getReplicationGroup() != null
                && other.getReplicationGroup().equals(this.getReplicationGroup()) == false)
            return false;
        return true;
    }
}
