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
 * Represents the allowed node types you can use to modify your cluster or
 * replication group.
 * </p>
 */
public class ListAllowedNodeTypeModificationsResult implements Serializable {
    /**
     * <p>
     * A string list, each element of which specifies a cache node type which
     * you can use to scale your cluster or replication group.
     * </p>
     * <p>
     * When scaling up a Redis cluster or replication group using
     * <code>ModifyCacheCluster</code> or <code>ModifyReplicationGroup</code>,
     * use a value from this list for the <code>CacheNodeType</code> parameter.
     * </p>
     */
    private java.util.List<String> scaleUpModifications;

    /**
     * <p>
     * A string list, each element of which specifies a cache node type which
     * you can use to scale your cluster or replication group. When scaling down
     * a Redis cluster or replication group using ModifyCacheCluster or
     * ModifyReplicationGroup, use a value from this list for the CacheNodeType
     * parameter.
     * </p>
     */
    private java.util.List<String> scaleDownModifications;

    /**
     * <p>
     * A string list, each element of which specifies a cache node type which
     * you can use to scale your cluster or replication group.
     * </p>
     * <p>
     * When scaling up a Redis cluster or replication group using
     * <code>ModifyCacheCluster</code> or <code>ModifyReplicationGroup</code>,
     * use a value from this list for the <code>CacheNodeType</code> parameter.
     * </p>
     *
     * @return <p>
     *         A string list, each element of which specifies a cache node type
     *         which you can use to scale your cluster or replication group.
     *         </p>
     *         <p>
     *         When scaling up a Redis cluster or replication group using
     *         <code>ModifyCacheCluster</code> or
     *         <code>ModifyReplicationGroup</code>, use a value from this list
     *         for the <code>CacheNodeType</code> parameter.
     *         </p>
     */
    public java.util.List<String> getScaleUpModifications() {
        return scaleUpModifications;
    }

    /**
     * <p>
     * A string list, each element of which specifies a cache node type which
     * you can use to scale your cluster or replication group.
     * </p>
     * <p>
     * When scaling up a Redis cluster or replication group using
     * <code>ModifyCacheCluster</code> or <code>ModifyReplicationGroup</code>,
     * use a value from this list for the <code>CacheNodeType</code> parameter.
     * </p>
     *
     * @param scaleUpModifications <p>
     *            A string list, each element of which specifies a cache node
     *            type which you can use to scale your cluster or replication
     *            group.
     *            </p>
     *            <p>
     *            When scaling up a Redis cluster or replication group using
     *            <code>ModifyCacheCluster</code> or
     *            <code>ModifyReplicationGroup</code>, use a value from this
     *            list for the <code>CacheNodeType</code> parameter.
     *            </p>
     */
    public void setScaleUpModifications(java.util.Collection<String> scaleUpModifications) {
        if (scaleUpModifications == null) {
            this.scaleUpModifications = null;
            return;
        }

        this.scaleUpModifications = new java.util.ArrayList<String>(scaleUpModifications);
    }

    /**
     * <p>
     * A string list, each element of which specifies a cache node type which
     * you can use to scale your cluster or replication group.
     * </p>
     * <p>
     * When scaling up a Redis cluster or replication group using
     * <code>ModifyCacheCluster</code> or <code>ModifyReplicationGroup</code>,
     * use a value from this list for the <code>CacheNodeType</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scaleUpModifications <p>
     *            A string list, each element of which specifies a cache node
     *            type which you can use to scale your cluster or replication
     *            group.
     *            </p>
     *            <p>
     *            When scaling up a Redis cluster or replication group using
     *            <code>ModifyCacheCluster</code> or
     *            <code>ModifyReplicationGroup</code>, use a value from this
     *            list for the <code>CacheNodeType</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAllowedNodeTypeModificationsResult withScaleUpModifications(
            String... scaleUpModifications) {
        if (getScaleUpModifications() == null) {
            this.scaleUpModifications = new java.util.ArrayList<String>(scaleUpModifications.length);
        }
        for (String value : scaleUpModifications) {
            this.scaleUpModifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A string list, each element of which specifies a cache node type which
     * you can use to scale your cluster or replication group.
     * </p>
     * <p>
     * When scaling up a Redis cluster or replication group using
     * <code>ModifyCacheCluster</code> or <code>ModifyReplicationGroup</code>,
     * use a value from this list for the <code>CacheNodeType</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scaleUpModifications <p>
     *            A string list, each element of which specifies a cache node
     *            type which you can use to scale your cluster or replication
     *            group.
     *            </p>
     *            <p>
     *            When scaling up a Redis cluster or replication group using
     *            <code>ModifyCacheCluster</code> or
     *            <code>ModifyReplicationGroup</code>, use a value from this
     *            list for the <code>CacheNodeType</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAllowedNodeTypeModificationsResult withScaleUpModifications(
            java.util.Collection<String> scaleUpModifications) {
        setScaleUpModifications(scaleUpModifications);
        return this;
    }

    /**
     * <p>
     * A string list, each element of which specifies a cache node type which
     * you can use to scale your cluster or replication group. When scaling down
     * a Redis cluster or replication group using ModifyCacheCluster or
     * ModifyReplicationGroup, use a value from this list for the CacheNodeType
     * parameter.
     * </p>
     *
     * @return <p>
     *         A string list, each element of which specifies a cache node type
     *         which you can use to scale your cluster or replication group.
     *         When scaling down a Redis cluster or replication group using
     *         ModifyCacheCluster or ModifyReplicationGroup, use a value from
     *         this list for the CacheNodeType parameter.
     *         </p>
     */
    public java.util.List<String> getScaleDownModifications() {
        return scaleDownModifications;
    }

    /**
     * <p>
     * A string list, each element of which specifies a cache node type which
     * you can use to scale your cluster or replication group. When scaling down
     * a Redis cluster or replication group using ModifyCacheCluster or
     * ModifyReplicationGroup, use a value from this list for the CacheNodeType
     * parameter.
     * </p>
     *
     * @param scaleDownModifications <p>
     *            A string list, each element of which specifies a cache node
     *            type which you can use to scale your cluster or replication
     *            group. When scaling down a Redis cluster or replication group
     *            using ModifyCacheCluster or ModifyReplicationGroup, use a
     *            value from this list for the CacheNodeType parameter.
     *            </p>
     */
    public void setScaleDownModifications(java.util.Collection<String> scaleDownModifications) {
        if (scaleDownModifications == null) {
            this.scaleDownModifications = null;
            return;
        }

        this.scaleDownModifications = new java.util.ArrayList<String>(scaleDownModifications);
    }

    /**
     * <p>
     * A string list, each element of which specifies a cache node type which
     * you can use to scale your cluster or replication group. When scaling down
     * a Redis cluster or replication group using ModifyCacheCluster or
     * ModifyReplicationGroup, use a value from this list for the CacheNodeType
     * parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scaleDownModifications <p>
     *            A string list, each element of which specifies a cache node
     *            type which you can use to scale your cluster or replication
     *            group. When scaling down a Redis cluster or replication group
     *            using ModifyCacheCluster or ModifyReplicationGroup, use a
     *            value from this list for the CacheNodeType parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAllowedNodeTypeModificationsResult withScaleDownModifications(
            String... scaleDownModifications) {
        if (getScaleDownModifications() == null) {
            this.scaleDownModifications = new java.util.ArrayList<String>(
                    scaleDownModifications.length);
        }
        for (String value : scaleDownModifications) {
            this.scaleDownModifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A string list, each element of which specifies a cache node type which
     * you can use to scale your cluster or replication group. When scaling down
     * a Redis cluster or replication group using ModifyCacheCluster or
     * ModifyReplicationGroup, use a value from this list for the CacheNodeType
     * parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scaleDownModifications <p>
     *            A string list, each element of which specifies a cache node
     *            type which you can use to scale your cluster or replication
     *            group. When scaling down a Redis cluster or replication group
     *            using ModifyCacheCluster or ModifyReplicationGroup, use a
     *            value from this list for the CacheNodeType parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAllowedNodeTypeModificationsResult withScaleDownModifications(
            java.util.Collection<String> scaleDownModifications) {
        setScaleDownModifications(scaleDownModifications);
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
        if (getScaleUpModifications() != null)
            sb.append("ScaleUpModifications: " + getScaleUpModifications() + ",");
        if (getScaleDownModifications() != null)
            sb.append("ScaleDownModifications: " + getScaleDownModifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getScaleUpModifications() == null) ? 0 : getScaleUpModifications().hashCode());
        hashCode = prime
                * hashCode
                + ((getScaleDownModifications() == null) ? 0 : getScaleDownModifications()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAllowedNodeTypeModificationsResult == false)
            return false;
        ListAllowedNodeTypeModificationsResult other = (ListAllowedNodeTypeModificationsResult) obj;

        if (other.getScaleUpModifications() == null ^ this.getScaleUpModifications() == null)
            return false;
        if (other.getScaleUpModifications() != null
                && other.getScaleUpModifications().equals(this.getScaleUpModifications()) == false)
            return false;
        if (other.getScaleDownModifications() == null ^ this.getScaleDownModifications() == null)
            return false;
        if (other.getScaleDownModifications() != null
                && other.getScaleDownModifications().equals(this.getScaleDownModifications()) == false)
            return false;
        return true;
    }
}
