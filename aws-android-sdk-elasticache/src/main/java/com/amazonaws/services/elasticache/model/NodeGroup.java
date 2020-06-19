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
 * Represents a collection of cache nodes in a replication group. One node in
 * the node group is the read/write primary node. All the other nodes are
 * read-only Replica nodes.
 * </p>
 */
public class NodeGroup implements Serializable {
    /**
     * <p>
     * The identifier for the node group (shard). A Redis (cluster mode
     * disabled) replication group contains only 1 node group; therefore, the
     * node group ID is 0001. A Redis (cluster mode enabled) replication group
     * contains 1 to 90 node groups numbered 0001 to 0090. Optionally, the user
     * can provide the id for a node group.
     * </p>
     */
    private String nodeGroupId;

    /**
     * <p>
     * The current state of this replication group - <code>creating</code>,
     * <code>available</code>, <code>modifying</code>, <code>deleting</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The endpoint of the primary node in this node group (shard).
     * </p>
     */
    private Endpoint primaryEndpoint;

    /**
     * <p>
     * The endpoint of the replica nodes in this node group (shard).
     * </p>
     */
    private Endpoint readerEndpoint;

    /**
     * <p>
     * The keyspace for this node group (shard).
     * </p>
     */
    private String slots;

    /**
     * <p>
     * A list containing information about individual nodes within the node
     * group (shard).
     * </p>
     */
    private java.util.List<NodeGroupMember> nodeGroupMembers;

    /**
     * <p>
     * The identifier for the node group (shard). A Redis (cluster mode
     * disabled) replication group contains only 1 node group; therefore, the
     * node group ID is 0001. A Redis (cluster mode enabled) replication group
     * contains 1 to 90 node groups numbered 0001 to 0090. Optionally, the user
     * can provide the id for a node group.
     * </p>
     *
     * @return <p>
     *         The identifier for the node group (shard). A Redis (cluster mode
     *         disabled) replication group contains only 1 node group;
     *         therefore, the node group ID is 0001. A Redis (cluster mode
     *         enabled) replication group contains 1 to 90 node groups numbered
     *         0001 to 0090. Optionally, the user can provide the id for a node
     *         group.
     *         </p>
     */
    public String getNodeGroupId() {
        return nodeGroupId;
    }

    /**
     * <p>
     * The identifier for the node group (shard). A Redis (cluster mode
     * disabled) replication group contains only 1 node group; therefore, the
     * node group ID is 0001. A Redis (cluster mode enabled) replication group
     * contains 1 to 90 node groups numbered 0001 to 0090. Optionally, the user
     * can provide the id for a node group.
     * </p>
     *
     * @param nodeGroupId <p>
     *            The identifier for the node group (shard). A Redis (cluster
     *            mode disabled) replication group contains only 1 node group;
     *            therefore, the node group ID is 0001. A Redis (cluster mode
     *            enabled) replication group contains 1 to 90 node groups
     *            numbered 0001 to 0090. Optionally, the user can provide the id
     *            for a node group.
     *            </p>
     */
    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }

    /**
     * <p>
     * The identifier for the node group (shard). A Redis (cluster mode
     * disabled) replication group contains only 1 node group; therefore, the
     * node group ID is 0001. A Redis (cluster mode enabled) replication group
     * contains 1 to 90 node groups numbered 0001 to 0090. Optionally, the user
     * can provide the id for a node group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeGroupId <p>
     *            The identifier for the node group (shard). A Redis (cluster
     *            mode disabled) replication group contains only 1 node group;
     *            therefore, the node group ID is 0001. A Redis (cluster mode
     *            enabled) replication group contains 1 to 90 node groups
     *            numbered 0001 to 0090. Optionally, the user can provide the id
     *            for a node group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeGroup withNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }

    /**
     * <p>
     * The current state of this replication group - <code>creating</code>,
     * <code>available</code>, <code>modifying</code>, <code>deleting</code>.
     * </p>
     *
     * @return <p>
     *         The current state of this replication group -
     *         <code>creating</code>, <code>available</code>,
     *         <code>modifying</code>, <code>deleting</code>.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current state of this replication group - <code>creating</code>,
     * <code>available</code>, <code>modifying</code>, <code>deleting</code>.
     * </p>
     *
     * @param status <p>
     *            The current state of this replication group -
     *            <code>creating</code>, <code>available</code>,
     *            <code>modifying</code>, <code>deleting</code>.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of this replication group - <code>creating</code>,
     * <code>available</code>, <code>modifying</code>, <code>deleting</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current state of this replication group -
     *            <code>creating</code>, <code>available</code>,
     *            <code>modifying</code>, <code>deleting</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeGroup withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The endpoint of the primary node in this node group (shard).
     * </p>
     *
     * @return <p>
     *         The endpoint of the primary node in this node group (shard).
     *         </p>
     */
    public Endpoint getPrimaryEndpoint() {
        return primaryEndpoint;
    }

    /**
     * <p>
     * The endpoint of the primary node in this node group (shard).
     * </p>
     *
     * @param primaryEndpoint <p>
     *            The endpoint of the primary node in this node group (shard).
     *            </p>
     */
    public void setPrimaryEndpoint(Endpoint primaryEndpoint) {
        this.primaryEndpoint = primaryEndpoint;
    }

    /**
     * <p>
     * The endpoint of the primary node in this node group (shard).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param primaryEndpoint <p>
     *            The endpoint of the primary node in this node group (shard).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeGroup withPrimaryEndpoint(Endpoint primaryEndpoint) {
        this.primaryEndpoint = primaryEndpoint;
        return this;
    }

    /**
     * <p>
     * The endpoint of the replica nodes in this node group (shard).
     * </p>
     *
     * @return <p>
     *         The endpoint of the replica nodes in this node group (shard).
     *         </p>
     */
    public Endpoint getReaderEndpoint() {
        return readerEndpoint;
    }

    /**
     * <p>
     * The endpoint of the replica nodes in this node group (shard).
     * </p>
     *
     * @param readerEndpoint <p>
     *            The endpoint of the replica nodes in this node group (shard).
     *            </p>
     */
    public void setReaderEndpoint(Endpoint readerEndpoint) {
        this.readerEndpoint = readerEndpoint;
    }

    /**
     * <p>
     * The endpoint of the replica nodes in this node group (shard).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readerEndpoint <p>
     *            The endpoint of the replica nodes in this node group (shard).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeGroup withReaderEndpoint(Endpoint readerEndpoint) {
        this.readerEndpoint = readerEndpoint;
        return this;
    }

    /**
     * <p>
     * The keyspace for this node group (shard).
     * </p>
     *
     * @return <p>
     *         The keyspace for this node group (shard).
     *         </p>
     */
    public String getSlots() {
        return slots;
    }

    /**
     * <p>
     * The keyspace for this node group (shard).
     * </p>
     *
     * @param slots <p>
     *            The keyspace for this node group (shard).
     *            </p>
     */
    public void setSlots(String slots) {
        this.slots = slots;
    }

    /**
     * <p>
     * The keyspace for this node group (shard).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slots <p>
     *            The keyspace for this node group (shard).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeGroup withSlots(String slots) {
        this.slots = slots;
        return this;
    }

    /**
     * <p>
     * A list containing information about individual nodes within the node
     * group (shard).
     * </p>
     *
     * @return <p>
     *         A list containing information about individual nodes within the
     *         node group (shard).
     *         </p>
     */
    public java.util.List<NodeGroupMember> getNodeGroupMembers() {
        return nodeGroupMembers;
    }

    /**
     * <p>
     * A list containing information about individual nodes within the node
     * group (shard).
     * </p>
     *
     * @param nodeGroupMembers <p>
     *            A list containing information about individual nodes within
     *            the node group (shard).
     *            </p>
     */
    public void setNodeGroupMembers(java.util.Collection<NodeGroupMember> nodeGroupMembers) {
        if (nodeGroupMembers == null) {
            this.nodeGroupMembers = null;
            return;
        }

        this.nodeGroupMembers = new java.util.ArrayList<NodeGroupMember>(nodeGroupMembers);
    }

    /**
     * <p>
     * A list containing information about individual nodes within the node
     * group (shard).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeGroupMembers <p>
     *            A list containing information about individual nodes within
     *            the node group (shard).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeGroup withNodeGroupMembers(NodeGroupMember... nodeGroupMembers) {
        if (getNodeGroupMembers() == null) {
            this.nodeGroupMembers = new java.util.ArrayList<NodeGroupMember>(
                    nodeGroupMembers.length);
        }
        for (NodeGroupMember value : nodeGroupMembers) {
            this.nodeGroupMembers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list containing information about individual nodes within the node
     * group (shard).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeGroupMembers <p>
     *            A list containing information about individual nodes within
     *            the node group (shard).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeGroup withNodeGroupMembers(java.util.Collection<NodeGroupMember> nodeGroupMembers) {
        setNodeGroupMembers(nodeGroupMembers);
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getPrimaryEndpoint() != null)
            sb.append("PrimaryEndpoint: " + getPrimaryEndpoint() + ",");
        if (getReaderEndpoint() != null)
            sb.append("ReaderEndpoint: " + getReaderEndpoint() + ",");
        if (getSlots() != null)
            sb.append("Slots: " + getSlots() + ",");
        if (getNodeGroupMembers() != null)
            sb.append("NodeGroupMembers: " + getNodeGroupMembers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNodeGroupId() == null) ? 0 : getNodeGroupId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getPrimaryEndpoint() == null) ? 0 : getPrimaryEndpoint().hashCode());
        hashCode = prime * hashCode
                + ((getReaderEndpoint() == null) ? 0 : getReaderEndpoint().hashCode());
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        hashCode = prime * hashCode
                + ((getNodeGroupMembers() == null) ? 0 : getNodeGroupMembers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeGroup == false)
            return false;
        NodeGroup other = (NodeGroup) obj;

        if (other.getNodeGroupId() == null ^ this.getNodeGroupId() == null)
            return false;
        if (other.getNodeGroupId() != null
                && other.getNodeGroupId().equals(this.getNodeGroupId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPrimaryEndpoint() == null ^ this.getPrimaryEndpoint() == null)
            return false;
        if (other.getPrimaryEndpoint() != null
                && other.getPrimaryEndpoint().equals(this.getPrimaryEndpoint()) == false)
            return false;
        if (other.getReaderEndpoint() == null ^ this.getReaderEndpoint() == null)
            return false;
        if (other.getReaderEndpoint() != null
                && other.getReaderEndpoint().equals(this.getReaderEndpoint()) == false)
            return false;
        if (other.getSlots() == null ^ this.getSlots() == null)
            return false;
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false)
            return false;
        if (other.getNodeGroupMembers() == null ^ this.getNodeGroupMembers() == null)
            return false;
        if (other.getNodeGroupMembers() != null
                && other.getNodeGroupMembers().equals(this.getNodeGroupMembers()) == false)
            return false;
        return true;
    }
}
