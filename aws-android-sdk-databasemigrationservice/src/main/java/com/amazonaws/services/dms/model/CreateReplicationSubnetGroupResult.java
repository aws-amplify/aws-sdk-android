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
public class CreateReplicationSubnetGroupResult implements Serializable {
    /**
     * <p>
     * The replication subnet group that was created.
     * </p>
     */
    private ReplicationSubnetGroup replicationSubnetGroup;

    /**
     * <p>
     * The replication subnet group that was created.
     * </p>
     *
     * @return <p>
     *         The replication subnet group that was created.
     *         </p>
     */
    public ReplicationSubnetGroup getReplicationSubnetGroup() {
        return replicationSubnetGroup;
    }

    /**
     * <p>
     * The replication subnet group that was created.
     * </p>
     *
     * @param replicationSubnetGroup <p>
     *            The replication subnet group that was created.
     *            </p>
     */
    public void setReplicationSubnetGroup(ReplicationSubnetGroup replicationSubnetGroup) {
        this.replicationSubnetGroup = replicationSubnetGroup;
    }

    /**
     * <p>
     * The replication subnet group that was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationSubnetGroup <p>
     *            The replication subnet group that was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationSubnetGroupResult withReplicationSubnetGroup(
            ReplicationSubnetGroup replicationSubnetGroup) {
        this.replicationSubnetGroup = replicationSubnetGroup;
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
        if (getReplicationSubnetGroup() != null)
            sb.append("ReplicationSubnetGroup: " + getReplicationSubnetGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReplicationSubnetGroup() == null) ? 0 : getReplicationSubnetGroup()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReplicationSubnetGroupResult == false)
            return false;
        CreateReplicationSubnetGroupResult other = (CreateReplicationSubnetGroupResult) obj;

        if (other.getReplicationSubnetGroup() == null ^ this.getReplicationSubnetGroup() == null)
            return false;
        if (other.getReplicationSubnetGroup() != null
                && other.getReplicationSubnetGroup().equals(this.getReplicationSubnetGroup()) == false)
            return false;
        return true;
    }
}
