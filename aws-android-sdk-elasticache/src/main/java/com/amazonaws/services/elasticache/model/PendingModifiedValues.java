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
 * A group of settings that are applied to the cluster in the future, or that
 * are currently being applied.
 * </p>
 */
public class PendingModifiedValues implements Serializable {
    /**
     * <p>
     * The new number of cache nodes for the cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running
     * Memcached, this value must be between 1 and 20.
     * </p>
     */
    private Integer numCacheNodes;

    /**
     * <p>
     * A list of cache node IDs that are being removed (or will be removed) from
     * the cluster. A node ID is a 4-digit numeric identifier (0001, 0002,
     * etc.).
     * </p>
     */
    private java.util.List<String> cacheNodeIdsToRemove;

    /**
     * <p>
     * The new cache engine version that the cluster runs.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The cache node type that this cluster or replication group is scaled to.
     * </p>
     */
    private String cacheNodeType;

    /**
     * <p>
     * The auth token status
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SETTING, ROTATING
     */
    private String authTokenStatus;

    /**
     * <p>
     * The new number of cache nodes for the cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running
     * Memcached, this value must be between 1 and 20.
     * </p>
     *
     * @return <p>
     *         The new number of cache nodes for the cluster.
     *         </p>
     *         <p>
     *         For clusters running Redis, this value must be 1. For clusters
     *         running Memcached, this value must be between 1 and 20.
     *         </p>
     */
    public Integer getNumCacheNodes() {
        return numCacheNodes;
    }

    /**
     * <p>
     * The new number of cache nodes for the cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running
     * Memcached, this value must be between 1 and 20.
     * </p>
     *
     * @param numCacheNodes <p>
     *            The new number of cache nodes for the cluster.
     *            </p>
     *            <p>
     *            For clusters running Redis, this value must be 1. For clusters
     *            running Memcached, this value must be between 1 and 20.
     *            </p>
     */
    public void setNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
    }

    /**
     * <p>
     * The new number of cache nodes for the cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running
     * Memcached, this value must be between 1 and 20.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numCacheNodes <p>
     *            The new number of cache nodes for the cluster.
     *            </p>
     *            <p>
     *            For clusters running Redis, this value must be 1. For clusters
     *            running Memcached, this value must be between 1 and 20.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
        return this;
    }

    /**
     * <p>
     * A list of cache node IDs that are being removed (or will be removed) from
     * the cluster. A node ID is a 4-digit numeric identifier (0001, 0002,
     * etc.).
     * </p>
     *
     * @return <p>
     *         A list of cache node IDs that are being removed (or will be
     *         removed) from the cluster. A node ID is a 4-digit numeric
     *         identifier (0001, 0002, etc.).
     *         </p>
     */
    public java.util.List<String> getCacheNodeIdsToRemove() {
        return cacheNodeIdsToRemove;
    }

    /**
     * <p>
     * A list of cache node IDs that are being removed (or will be removed) from
     * the cluster. A node ID is a 4-digit numeric identifier (0001, 0002,
     * etc.).
     * </p>
     *
     * @param cacheNodeIdsToRemove <p>
     *            A list of cache node IDs that are being removed (or will be
     *            removed) from the cluster. A node ID is a 4-digit numeric
     *            identifier (0001, 0002, etc.).
     *            </p>
     */
    public void setCacheNodeIdsToRemove(java.util.Collection<String> cacheNodeIdsToRemove) {
        if (cacheNodeIdsToRemove == null) {
            this.cacheNodeIdsToRemove = null;
            return;
        }

        this.cacheNodeIdsToRemove = new java.util.ArrayList<String>(cacheNodeIdsToRemove);
    }

    /**
     * <p>
     * A list of cache node IDs that are being removed (or will be removed) from
     * the cluster. A node ID is a 4-digit numeric identifier (0001, 0002,
     * etc.).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeIdsToRemove <p>
     *            A list of cache node IDs that are being removed (or will be
     *            removed) from the cluster. A node ID is a 4-digit numeric
     *            identifier (0001, 0002, etc.).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withCacheNodeIdsToRemove(String... cacheNodeIdsToRemove) {
        if (getCacheNodeIdsToRemove() == null) {
            this.cacheNodeIdsToRemove = new java.util.ArrayList<String>(cacheNodeIdsToRemove.length);
        }
        for (String value : cacheNodeIdsToRemove) {
            this.cacheNodeIdsToRemove.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of cache node IDs that are being removed (or will be removed) from
     * the cluster. A node ID is a 4-digit numeric identifier (0001, 0002,
     * etc.).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeIdsToRemove <p>
     *            A list of cache node IDs that are being removed (or will be
     *            removed) from the cluster. A node ID is a 4-digit numeric
     *            identifier (0001, 0002, etc.).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withCacheNodeIdsToRemove(
            java.util.Collection<String> cacheNodeIdsToRemove) {
        setCacheNodeIdsToRemove(cacheNodeIdsToRemove);
        return this;
    }

    /**
     * <p>
     * The new cache engine version that the cluster runs.
     * </p>
     *
     * @return <p>
     *         The new cache engine version that the cluster runs.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The new cache engine version that the cluster runs.
     * </p>
     *
     * @param engineVersion <p>
     *            The new cache engine version that the cluster runs.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The new cache engine version that the cluster runs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The new cache engine version that the cluster runs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * The cache node type that this cluster or replication group is scaled to.
     * </p>
     *
     * @return <p>
     *         The cache node type that this cluster or replication group is
     *         scaled to.
     *         </p>
     */
    public String getCacheNodeType() {
        return cacheNodeType;
    }

    /**
     * <p>
     * The cache node type that this cluster or replication group is scaled to.
     * </p>
     *
     * @param cacheNodeType <p>
     *            The cache node type that this cluster or replication group is
     *            scaled to.
     *            </p>
     */
    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    /**
     * <p>
     * The cache node type that this cluster or replication group is scaled to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeType <p>
     *            The cache node type that this cluster or replication group is
     *            scaled to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
        return this;
    }

    /**
     * <p>
     * The auth token status
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SETTING, ROTATING
     *
     * @return <p>
     *         The auth token status
     *         </p>
     * @see AuthTokenUpdateStatus
     */
    public String getAuthTokenStatus() {
        return authTokenStatus;
    }

    /**
     * <p>
     * The auth token status
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SETTING, ROTATING
     *
     * @param authTokenStatus <p>
     *            The auth token status
     *            </p>
     * @see AuthTokenUpdateStatus
     */
    public void setAuthTokenStatus(String authTokenStatus) {
        this.authTokenStatus = authTokenStatus;
    }

    /**
     * <p>
     * The auth token status
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SETTING, ROTATING
     *
     * @param authTokenStatus <p>
     *            The auth token status
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthTokenUpdateStatus
     */
    public PendingModifiedValues withAuthTokenStatus(String authTokenStatus) {
        this.authTokenStatus = authTokenStatus;
        return this;
    }

    /**
     * <p>
     * The auth token status
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SETTING, ROTATING
     *
     * @param authTokenStatus <p>
     *            The auth token status
     *            </p>
     * @see AuthTokenUpdateStatus
     */
    public void setAuthTokenStatus(AuthTokenUpdateStatus authTokenStatus) {
        this.authTokenStatus = authTokenStatus.toString();
    }

    /**
     * <p>
     * The auth token status
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SETTING, ROTATING
     *
     * @param authTokenStatus <p>
     *            The auth token status
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthTokenUpdateStatus
     */
    public PendingModifiedValues withAuthTokenStatus(AuthTokenUpdateStatus authTokenStatus) {
        this.authTokenStatus = authTokenStatus.toString();
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
        if (getNumCacheNodes() != null)
            sb.append("NumCacheNodes: " + getNumCacheNodes() + ",");
        if (getCacheNodeIdsToRemove() != null)
            sb.append("CacheNodeIdsToRemove: " + getCacheNodeIdsToRemove() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: " + getCacheNodeType() + ",");
        if (getAuthTokenStatus() != null)
            sb.append("AuthTokenStatus: " + getAuthTokenStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNumCacheNodes() == null) ? 0 : getNumCacheNodes().hashCode());
        hashCode = prime * hashCode
                + ((getCacheNodeIdsToRemove() == null) ? 0 : getCacheNodeIdsToRemove().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode
                + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode());
        hashCode = prime * hashCode
                + ((getAuthTokenStatus() == null) ? 0 : getAuthTokenStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PendingModifiedValues == false)
            return false;
        PendingModifiedValues other = (PendingModifiedValues) obj;

        if (other.getNumCacheNodes() == null ^ this.getNumCacheNodes() == null)
            return false;
        if (other.getNumCacheNodes() != null
                && other.getNumCacheNodes().equals(this.getNumCacheNodes()) == false)
            return false;
        if (other.getCacheNodeIdsToRemove() == null ^ this.getCacheNodeIdsToRemove() == null)
            return false;
        if (other.getCacheNodeIdsToRemove() != null
                && other.getCacheNodeIdsToRemove().equals(this.getCacheNodeIdsToRemove()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null)
            return false;
        if (other.getCacheNodeType() != null
                && other.getCacheNodeType().equals(this.getCacheNodeType()) == false)
            return false;
        if (other.getAuthTokenStatus() == null ^ this.getAuthTokenStatus() == null)
            return false;
        if (other.getAuthTokenStatus() != null
                && other.getAuthTokenStatus().equals(this.getAuthTokenStatus()) == false)
            return false;
        return true;
    }
}
