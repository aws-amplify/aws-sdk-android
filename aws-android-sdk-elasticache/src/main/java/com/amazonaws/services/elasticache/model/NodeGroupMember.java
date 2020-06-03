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
 * Represents a single node within a node group (shard).
 * </p>
 */
public class NodeGroupMember implements Serializable {
    /**
     * <p>
     * The ID of the cluster to which the node belongs.
     * </p>
     */
    private String cacheClusterId;

    /**
     * <p>
     * The ID of the node within its cluster. A node ID is a numeric identifier
     * (0001, 0002, etc.).
     * </p>
     */
    private String cacheNodeId;

    /**
     * <p>
     * The information required for client programs to connect to a node for
     * read operations. The read endpoint is only applicable on Redis (cluster
     * mode disabled) clusters.
     * </p>
     */
    private Endpoint readEndpoint;

    /**
     * <p>
     * The name of the Availability Zone in which the node is located.
     * </p>
     */
    private String preferredAvailabilityZone;

    /**
     * <p>
     * The role that is currently assigned to the node - <code>primary</code> or
     * <code>replica</code>. This member is only applicable for Redis (cluster
     * mode disabled) replication groups.
     * </p>
     */
    private String currentRole;

    /**
     * <p>
     * The ID of the cluster to which the node belongs.
     * </p>
     *
     * @return <p>
     *         The ID of the cluster to which the node belongs.
     *         </p>
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }

    /**
     * <p>
     * The ID of the cluster to which the node belongs.
     * </p>
     *
     * @param cacheClusterId <p>
     *            The ID of the cluster to which the node belongs.
     *            </p>
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * The ID of the cluster to which the node belongs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheClusterId <p>
     *            The ID of the cluster to which the node belongs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeGroupMember withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
        return this;
    }

    /**
     * <p>
     * The ID of the node within its cluster. A node ID is a numeric identifier
     * (0001, 0002, etc.).
     * </p>
     *
     * @return <p>
     *         The ID of the node within its cluster. A node ID is a numeric
     *         identifier (0001, 0002, etc.).
     *         </p>
     */
    public String getCacheNodeId() {
        return cacheNodeId;
    }

    /**
     * <p>
     * The ID of the node within its cluster. A node ID is a numeric identifier
     * (0001, 0002, etc.).
     * </p>
     *
     * @param cacheNodeId <p>
     *            The ID of the node within its cluster. A node ID is a numeric
     *            identifier (0001, 0002, etc.).
     *            </p>
     */
    public void setCacheNodeId(String cacheNodeId) {
        this.cacheNodeId = cacheNodeId;
    }

    /**
     * <p>
     * The ID of the node within its cluster. A node ID is a numeric identifier
     * (0001, 0002, etc.).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeId <p>
     *            The ID of the node within its cluster. A node ID is a numeric
     *            identifier (0001, 0002, etc.).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeGroupMember withCacheNodeId(String cacheNodeId) {
        this.cacheNodeId = cacheNodeId;
        return this;
    }

    /**
     * <p>
     * The information required for client programs to connect to a node for
     * read operations. The read endpoint is only applicable on Redis (cluster
     * mode disabled) clusters.
     * </p>
     *
     * @return <p>
     *         The information required for client programs to connect to a node
     *         for read operations. The read endpoint is only applicable on
     *         Redis (cluster mode disabled) clusters.
     *         </p>
     */
    public Endpoint getReadEndpoint() {
        return readEndpoint;
    }

    /**
     * <p>
     * The information required for client programs to connect to a node for
     * read operations. The read endpoint is only applicable on Redis (cluster
     * mode disabled) clusters.
     * </p>
     *
     * @param readEndpoint <p>
     *            The information required for client programs to connect to a
     *            node for read operations. The read endpoint is only applicable
     *            on Redis (cluster mode disabled) clusters.
     *            </p>
     */
    public void setReadEndpoint(Endpoint readEndpoint) {
        this.readEndpoint = readEndpoint;
    }

    /**
     * <p>
     * The information required for client programs to connect to a node for
     * read operations. The read endpoint is only applicable on Redis (cluster
     * mode disabled) clusters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readEndpoint <p>
     *            The information required for client programs to connect to a
     *            node for read operations. The read endpoint is only applicable
     *            on Redis (cluster mode disabled) clusters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeGroupMember withReadEndpoint(Endpoint readEndpoint) {
        this.readEndpoint = readEndpoint;
        return this;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the node is located.
     * </p>
     *
     * @return <p>
     *         The name of the Availability Zone in which the node is located.
     *         </p>
     */
    public String getPreferredAvailabilityZone() {
        return preferredAvailabilityZone;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the node is located.
     * </p>
     *
     * @param preferredAvailabilityZone <p>
     *            The name of the Availability Zone in which the node is
     *            located.
     *            </p>
     */
    public void setPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the node is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredAvailabilityZone <p>
     *            The name of the Availability Zone in which the node is
     *            located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeGroupMember withPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
        return this;
    }

    /**
     * <p>
     * The role that is currently assigned to the node - <code>primary</code> or
     * <code>replica</code>. This member is only applicable for Redis (cluster
     * mode disabled) replication groups.
     * </p>
     *
     * @return <p>
     *         The role that is currently assigned to the node -
     *         <code>primary</code> or <code>replica</code>. This member is only
     *         applicable for Redis (cluster mode disabled) replication groups.
     *         </p>
     */
    public String getCurrentRole() {
        return currentRole;
    }

    /**
     * <p>
     * The role that is currently assigned to the node - <code>primary</code> or
     * <code>replica</code>. This member is only applicable for Redis (cluster
     * mode disabled) replication groups.
     * </p>
     *
     * @param currentRole <p>
     *            The role that is currently assigned to the node -
     *            <code>primary</code> or <code>replica</code>. This member is
     *            only applicable for Redis (cluster mode disabled) replication
     *            groups.
     *            </p>
     */
    public void setCurrentRole(String currentRole) {
        this.currentRole = currentRole;
    }

    /**
     * <p>
     * The role that is currently assigned to the node - <code>primary</code> or
     * <code>replica</code>. This member is only applicable for Redis (cluster
     * mode disabled) replication groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentRole <p>
     *            The role that is currently assigned to the node -
     *            <code>primary</code> or <code>replica</code>. This member is
     *            only applicable for Redis (cluster mode disabled) replication
     *            groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeGroupMember withCurrentRole(String currentRole) {
        this.currentRole = currentRole;
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
        if (getCacheNodeId() != null)
            sb.append("CacheNodeId: " + getCacheNodeId() + ",");
        if (getReadEndpoint() != null)
            sb.append("ReadEndpoint: " + getReadEndpoint() + ",");
        if (getPreferredAvailabilityZone() != null)
            sb.append("PreferredAvailabilityZone: " + getPreferredAvailabilityZone() + ",");
        if (getCurrentRole() != null)
            sb.append("CurrentRole: " + getCurrentRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode());
        hashCode = prime * hashCode
                + ((getCacheNodeId() == null) ? 0 : getCacheNodeId().hashCode());
        hashCode = prime * hashCode
                + ((getReadEndpoint() == null) ? 0 : getReadEndpoint().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredAvailabilityZone() == null) ? 0 : getPreferredAvailabilityZone()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCurrentRole() == null) ? 0 : getCurrentRole().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeGroupMember == false)
            return false;
        NodeGroupMember other = (NodeGroupMember) obj;

        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null
                && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getCacheNodeId() == null ^ this.getCacheNodeId() == null)
            return false;
        if (other.getCacheNodeId() != null
                && other.getCacheNodeId().equals(this.getCacheNodeId()) == false)
            return false;
        if (other.getReadEndpoint() == null ^ this.getReadEndpoint() == null)
            return false;
        if (other.getReadEndpoint() != null
                && other.getReadEndpoint().equals(this.getReadEndpoint()) == false)
            return false;
        if (other.getPreferredAvailabilityZone() == null
                ^ this.getPreferredAvailabilityZone() == null)
            return false;
        if (other.getPreferredAvailabilityZone() != null
                && other.getPreferredAvailabilityZone().equals(this.getPreferredAvailabilityZone()) == false)
            return false;
        if (other.getCurrentRole() == null ^ this.getCurrentRole() == null)
            return false;
        if (other.getCurrentRole() != null
                && other.getCurrentRole().equals(this.getCurrentRole()) == false)
            return false;
        return true;
    }
}
