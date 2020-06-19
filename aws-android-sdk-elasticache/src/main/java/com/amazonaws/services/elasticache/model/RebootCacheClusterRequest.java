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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Reboots some, or all, of the cache nodes within a provisioned cluster. This
 * operation applies any modified cache parameter groups to the cluster. The
 * reboot operation takes place as soon as possible, and results in a momentary
 * outage to the cluster. During the reboot, the cluster status is set to
 * REBOOTING.
 * </p>
 * <p>
 * The reboot causes the contents of the cache (for each cache node being
 * rebooted) to be lost.
 * </p>
 * <p>
 * When the reboot is complete, a cluster event is created.
 * </p>
 * <p>
 * Rebooting a cluster is currently supported on Memcached and Redis (cluster
 * mode disabled) clusters. Rebooting is not supported on Redis (cluster mode
 * enabled) clusters.
 * </p>
 * <p>
 * If you make changes to parameters that require a Redis (cluster mode enabled)
 * cluster reboot for the changes to be applied, see <a href=
 * "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.Rebooting.html"
 * >Rebooting a Cluster</a> for an alternate process.
 * </p>
 */
public class RebootCacheClusterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The cluster identifier. This parameter is stored as a lowercase string.
     * </p>
     */
    private String cacheClusterId;

    /**
     * <p>
     * A list of cache node IDs to reboot. A node ID is a numeric identifier
     * (0001, 0002, etc.). To reboot an entire cluster, specify all of the cache
     * node IDs.
     * </p>
     */
    private java.util.List<String> cacheNodeIdsToReboot;

    /**
     * <p>
     * The cluster identifier. This parameter is stored as a lowercase string.
     * </p>
     *
     * @return <p>
     *         The cluster identifier. This parameter is stored as a lowercase
     *         string.
     *         </p>
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }

    /**
     * <p>
     * The cluster identifier. This parameter is stored as a lowercase string.
     * </p>
     *
     * @param cacheClusterId <p>
     *            The cluster identifier. This parameter is stored as a
     *            lowercase string.
     *            </p>
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * The cluster identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheClusterId <p>
     *            The cluster identifier. This parameter is stored as a
     *            lowercase string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RebootCacheClusterRequest withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
        return this;
    }

    /**
     * <p>
     * A list of cache node IDs to reboot. A node ID is a numeric identifier
     * (0001, 0002, etc.). To reboot an entire cluster, specify all of the cache
     * node IDs.
     * </p>
     *
     * @return <p>
     *         A list of cache node IDs to reboot. A node ID is a numeric
     *         identifier (0001, 0002, etc.). To reboot an entire cluster,
     *         specify all of the cache node IDs.
     *         </p>
     */
    public java.util.List<String> getCacheNodeIdsToReboot() {
        return cacheNodeIdsToReboot;
    }

    /**
     * <p>
     * A list of cache node IDs to reboot. A node ID is a numeric identifier
     * (0001, 0002, etc.). To reboot an entire cluster, specify all of the cache
     * node IDs.
     * </p>
     *
     * @param cacheNodeIdsToReboot <p>
     *            A list of cache node IDs to reboot. A node ID is a numeric
     *            identifier (0001, 0002, etc.). To reboot an entire cluster,
     *            specify all of the cache node IDs.
     *            </p>
     */
    public void setCacheNodeIdsToReboot(java.util.Collection<String> cacheNodeIdsToReboot) {
        if (cacheNodeIdsToReboot == null) {
            this.cacheNodeIdsToReboot = null;
            return;
        }

        this.cacheNodeIdsToReboot = new java.util.ArrayList<String>(cacheNodeIdsToReboot);
    }

    /**
     * <p>
     * A list of cache node IDs to reboot. A node ID is a numeric identifier
     * (0001, 0002, etc.). To reboot an entire cluster, specify all of the cache
     * node IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeIdsToReboot <p>
     *            A list of cache node IDs to reboot. A node ID is a numeric
     *            identifier (0001, 0002, etc.). To reboot an entire cluster,
     *            specify all of the cache node IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RebootCacheClusterRequest withCacheNodeIdsToReboot(String... cacheNodeIdsToReboot) {
        if (getCacheNodeIdsToReboot() == null) {
            this.cacheNodeIdsToReboot = new java.util.ArrayList<String>(cacheNodeIdsToReboot.length);
        }
        for (String value : cacheNodeIdsToReboot) {
            this.cacheNodeIdsToReboot.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of cache node IDs to reboot. A node ID is a numeric identifier
     * (0001, 0002, etc.). To reboot an entire cluster, specify all of the cache
     * node IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeIdsToReboot <p>
     *            A list of cache node IDs to reboot. A node ID is a numeric
     *            identifier (0001, 0002, etc.). To reboot an entire cluster,
     *            specify all of the cache node IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RebootCacheClusterRequest withCacheNodeIdsToReboot(
            java.util.Collection<String> cacheNodeIdsToReboot) {
        setCacheNodeIdsToReboot(cacheNodeIdsToReboot);
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
        if (getCacheNodeIdsToReboot() != null)
            sb.append("CacheNodeIdsToReboot: " + getCacheNodeIdsToReboot());
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
                + ((getCacheNodeIdsToReboot() == null) ? 0 : getCacheNodeIdsToReboot().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RebootCacheClusterRequest == false)
            return false;
        RebootCacheClusterRequest other = (RebootCacheClusterRequest) obj;

        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null
                && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getCacheNodeIdsToReboot() == null ^ this.getCacheNodeIdsToReboot() == null)
            return false;
        if (other.getCacheNodeIdsToReboot() != null
                && other.getCacheNodeIdsToReboot().equals(this.getCacheNodeIdsToReboot()) == false)
            return false;
        return true;
    }
}
