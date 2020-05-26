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
 * Node group (shard) configuration options. Each node group (shard)
 * configuration has the following: <code>Slots</code>,
 * <code>PrimaryAvailabilityZone</code>, <code>ReplicaAvailabilityZones</code>,
 * <code>ReplicaCount</code>.
 * </p>
 */
public class NodeGroupConfiguration implements Serializable {
    /**
     * <p>
     * Either the ElastiCache for Redis supplied 4-digit id or a user supplied
     * id for the node group these configuration values apply to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>\d+<br/>
     */
    private String nodeGroupId;

    /**
     * <p>
     * A string that specifies the keyspace for a particular node group.
     * Keyspaces range from 0 to 16,383. The string is in the format
     * <code>startkey-endkey</code>.
     * </p>
     * <p>
     * Example: <code>"0-3999"</code>
     * </p>
     */
    private String slots;

    /**
     * <p>
     * The number of read replica nodes in this node group (shard).
     * </p>
     */
    private Integer replicaCount;

    /**
     * <p>
     * The Availability Zone where the primary node of this node group (shard)
     * is launched.
     * </p>
     */
    private String primaryAvailabilityZone;

    /**
     * <p>
     * A list of Availability Zones to be used for the read replicas. The number
     * of Availability Zones in this list must match the value of
     * <code>ReplicaCount</code> or <code>ReplicasPerNodeGroup</code> if not
     * specified.
     * </p>
     */
    private java.util.List<String> replicaAvailabilityZones;

    /**
     * <p>
     * Either the ElastiCache for Redis supplied 4-digit id or a user supplied
     * id for the node group these configuration values apply to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @return <p>
     *         Either the ElastiCache for Redis supplied 4-digit id or a user
     *         supplied id for the node group these configuration values apply
     *         to.
     *         </p>
     */
    public String getNodeGroupId() {
        return nodeGroupId;
    }

    /**
     * <p>
     * Either the ElastiCache for Redis supplied 4-digit id or a user supplied
     * id for the node group these configuration values apply to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @param nodeGroupId <p>
     *            Either the ElastiCache for Redis supplied 4-digit id or a user
     *            supplied id for the node group these configuration values
     *            apply to.
     *            </p>
     */
    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }

    /**
     * <p>
     * Either the ElastiCache for Redis supplied 4-digit id or a user supplied
     * id for the node group these configuration values apply to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @param nodeGroupId <p>
     *            Either the ElastiCache for Redis supplied 4-digit id or a user
     *            supplied id for the node group these configuration values
     *            apply to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeGroupConfiguration withNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }

    /**
     * <p>
     * A string that specifies the keyspace for a particular node group.
     * Keyspaces range from 0 to 16,383. The string is in the format
     * <code>startkey-endkey</code>.
     * </p>
     * <p>
     * Example: <code>"0-3999"</code>
     * </p>
     *
     * @return <p>
     *         A string that specifies the keyspace for a particular node group.
     *         Keyspaces range from 0 to 16,383. The string is in the format
     *         <code>startkey-endkey</code>.
     *         </p>
     *         <p>
     *         Example: <code>"0-3999"</code>
     *         </p>
     */
    public String getSlots() {
        return slots;
    }

    /**
     * <p>
     * A string that specifies the keyspace for a particular node group.
     * Keyspaces range from 0 to 16,383. The string is in the format
     * <code>startkey-endkey</code>.
     * </p>
     * <p>
     * Example: <code>"0-3999"</code>
     * </p>
     *
     * @param slots <p>
     *            A string that specifies the keyspace for a particular node
     *            group. Keyspaces range from 0 to 16,383. The string is in the
     *            format <code>startkey-endkey</code>.
     *            </p>
     *            <p>
     *            Example: <code>"0-3999"</code>
     *            </p>
     */
    public void setSlots(String slots) {
        this.slots = slots;
    }

    /**
     * <p>
     * A string that specifies the keyspace for a particular node group.
     * Keyspaces range from 0 to 16,383. The string is in the format
     * <code>startkey-endkey</code>.
     * </p>
     * <p>
     * Example: <code>"0-3999"</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slots <p>
     *            A string that specifies the keyspace for a particular node
     *            group. Keyspaces range from 0 to 16,383. The string is in the
     *            format <code>startkey-endkey</code>.
     *            </p>
     *            <p>
     *            Example: <code>"0-3999"</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeGroupConfiguration withSlots(String slots) {
        this.slots = slots;
        return this;
    }

    /**
     * <p>
     * The number of read replica nodes in this node group (shard).
     * </p>
     *
     * @return <p>
     *         The number of read replica nodes in this node group (shard).
     *         </p>
     */
    public Integer getReplicaCount() {
        return replicaCount;
    }

    /**
     * <p>
     * The number of read replica nodes in this node group (shard).
     * </p>
     *
     * @param replicaCount <p>
     *            The number of read replica nodes in this node group (shard).
     *            </p>
     */
    public void setReplicaCount(Integer replicaCount) {
        this.replicaCount = replicaCount;
    }

    /**
     * <p>
     * The number of read replica nodes in this node group (shard).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaCount <p>
     *            The number of read replica nodes in this node group (shard).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeGroupConfiguration withReplicaCount(Integer replicaCount) {
        this.replicaCount = replicaCount;
        return this;
    }

    /**
     * <p>
     * The Availability Zone where the primary node of this node group (shard)
     * is launched.
     * </p>
     *
     * @return <p>
     *         The Availability Zone where the primary node of this node group
     *         (shard) is launched.
     *         </p>
     */
    public String getPrimaryAvailabilityZone() {
        return primaryAvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the primary node of this node group (shard)
     * is launched.
     * </p>
     *
     * @param primaryAvailabilityZone <p>
     *            The Availability Zone where the primary node of this node
     *            group (shard) is launched.
     *            </p>
     */
    public void setPrimaryAvailabilityZone(String primaryAvailabilityZone) {
        this.primaryAvailabilityZone = primaryAvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the primary node of this node group (shard)
     * is launched.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param primaryAvailabilityZone <p>
     *            The Availability Zone where the primary node of this node
     *            group (shard) is launched.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeGroupConfiguration withPrimaryAvailabilityZone(String primaryAvailabilityZone) {
        this.primaryAvailabilityZone = primaryAvailabilityZone;
        return this;
    }

    /**
     * <p>
     * A list of Availability Zones to be used for the read replicas. The number
     * of Availability Zones in this list must match the value of
     * <code>ReplicaCount</code> or <code>ReplicasPerNodeGroup</code> if not
     * specified.
     * </p>
     *
     * @return <p>
     *         A list of Availability Zones to be used for the read replicas.
     *         The number of Availability Zones in this list must match the
     *         value of <code>ReplicaCount</code> or
     *         <code>ReplicasPerNodeGroup</code> if not specified.
     *         </p>
     */
    public java.util.List<String> getReplicaAvailabilityZones() {
        return replicaAvailabilityZones;
    }

    /**
     * <p>
     * A list of Availability Zones to be used for the read replicas. The number
     * of Availability Zones in this list must match the value of
     * <code>ReplicaCount</code> or <code>ReplicasPerNodeGroup</code> if not
     * specified.
     * </p>
     *
     * @param replicaAvailabilityZones <p>
     *            A list of Availability Zones to be used for the read replicas.
     *            The number of Availability Zones in this list must match the
     *            value of <code>ReplicaCount</code> or
     *            <code>ReplicasPerNodeGroup</code> if not specified.
     *            </p>
     */
    public void setReplicaAvailabilityZones(java.util.Collection<String> replicaAvailabilityZones) {
        if (replicaAvailabilityZones == null) {
            this.replicaAvailabilityZones = null;
            return;
        }

        this.replicaAvailabilityZones = new java.util.ArrayList<String>(replicaAvailabilityZones);
    }

    /**
     * <p>
     * A list of Availability Zones to be used for the read replicas. The number
     * of Availability Zones in this list must match the value of
     * <code>ReplicaCount</code> or <code>ReplicasPerNodeGroup</code> if not
     * specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaAvailabilityZones <p>
     *            A list of Availability Zones to be used for the read replicas.
     *            The number of Availability Zones in this list must match the
     *            value of <code>ReplicaCount</code> or
     *            <code>ReplicasPerNodeGroup</code> if not specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeGroupConfiguration withReplicaAvailabilityZones(String... replicaAvailabilityZones) {
        if (getReplicaAvailabilityZones() == null) {
            this.replicaAvailabilityZones = new java.util.ArrayList<String>(
                    replicaAvailabilityZones.length);
        }
        for (String value : replicaAvailabilityZones) {
            this.replicaAvailabilityZones.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of Availability Zones to be used for the read replicas. The number
     * of Availability Zones in this list must match the value of
     * <code>ReplicaCount</code> or <code>ReplicasPerNodeGroup</code> if not
     * specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaAvailabilityZones <p>
     *            A list of Availability Zones to be used for the read replicas.
     *            The number of Availability Zones in this list must match the
     *            value of <code>ReplicaCount</code> or
     *            <code>ReplicasPerNodeGroup</code> if not specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeGroupConfiguration withReplicaAvailabilityZones(
            java.util.Collection<String> replicaAvailabilityZones) {
        setReplicaAvailabilityZones(replicaAvailabilityZones);
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
        if (getNodeGroupId() != null)
            sb.append("NodeGroupId: " + getNodeGroupId() + ",");
        if (getSlots() != null)
            sb.append("Slots: " + getSlots() + ",");
        if (getReplicaCount() != null)
            sb.append("ReplicaCount: " + getReplicaCount() + ",");
        if (getPrimaryAvailabilityZone() != null)
            sb.append("PrimaryAvailabilityZone: " + getPrimaryAvailabilityZone() + ",");
        if (getReplicaAvailabilityZones() != null)
            sb.append("ReplicaAvailabilityZones: " + getReplicaAvailabilityZones());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNodeGroupId() == null) ? 0 : getNodeGroupId().hashCode());
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        hashCode = prime * hashCode
                + ((getReplicaCount() == null) ? 0 : getReplicaCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getPrimaryAvailabilityZone() == null) ? 0 : getPrimaryAvailabilityZone()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicaAvailabilityZones() == null) ? 0 : getReplicaAvailabilityZones()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeGroupConfiguration == false)
            return false;
        NodeGroupConfiguration other = (NodeGroupConfiguration) obj;

        if (other.getNodeGroupId() == null ^ this.getNodeGroupId() == null)
            return false;
        if (other.getNodeGroupId() != null
                && other.getNodeGroupId().equals(this.getNodeGroupId()) == false)
            return false;
        if (other.getSlots() == null ^ this.getSlots() == null)
            return false;
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false)
            return false;
        if (other.getReplicaCount() == null ^ this.getReplicaCount() == null)
            return false;
        if (other.getReplicaCount() != null
                && other.getReplicaCount().equals(this.getReplicaCount()) == false)
            return false;
        if (other.getPrimaryAvailabilityZone() == null ^ this.getPrimaryAvailabilityZone() == null)
            return false;
        if (other.getPrimaryAvailabilityZone() != null
                && other.getPrimaryAvailabilityZone().equals(this.getPrimaryAvailabilityZone()) == false)
            return false;
        if (other.getReplicaAvailabilityZones() == null
                ^ this.getReplicaAvailabilityZones() == null)
            return false;
        if (other.getReplicaAvailabilityZones() != null
                && other.getReplicaAvailabilityZones().equals(this.getReplicaAvailabilityZones()) == false)
            return false;
        return true;
    }
}
