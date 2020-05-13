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
 * Returns information about all provisioned clusters if no cluster identifier
 * is specified, or about a specific cache cluster if a cluster identifier is
 * supplied.
 * </p>
 * <p>
 * By default, abbreviated information about the clusters is returned. You can
 * use the optional <i>ShowCacheNodeInfo</i> flag to retrieve detailed
 * information about the cache nodes associated with the clusters. These details
 * include the DNS address and port for the cache node endpoint.
 * </p>
 * <p>
 * If the cluster is in the <i>creating</i> state, only cluster-level
 * information is displayed until all of the nodes are successfully provisioned.
 * </p>
 * <p>
 * If the cluster is in the <i>deleting</i> state, only cluster-level
 * information is displayed.
 * </p>
 * <p>
 * If cache nodes are currently being added to the cluster, node endpoint
 * information and creation time for the additional nodes are not displayed
 * until they are completely provisioned. When the cluster state is
 * <i>available</i>, the cluster is ready for use.
 * </p>
 * <p>
 * If cache nodes are currently being removed from the cluster, no endpoint
 * information for the removed nodes is displayed.
 * </p>
 */
public class DescribeCacheClustersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The user-supplied cluster identifier. If this parameter is specified,
     * only information about that specific cluster is returned. This parameter
     * isn't case sensitive.
     * </p>
     */
    private String cacheClusterId;

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a marker is
     * included in the response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 100.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * An optional flag that can be included in the
     * <code>DescribeCacheCluster</code> request to retrieve information about
     * the individual cache nodes.
     * </p>
     */
    private Boolean showCacheNodeInfo;

    /**
     * <p>
     * An optional flag that can be included in the
     * <code>DescribeCacheCluster</code> request to show only nodes (API/CLI:
     * clusters) that are not members of a replication group. In practice, this
     * mean Memcached and single node Redis clusters.
     * </p>
     */
    private Boolean showCacheClustersNotInReplicationGroups;

    /**
     * <p>
     * The user-supplied cluster identifier. If this parameter is specified,
     * only information about that specific cluster is returned. This parameter
     * isn't case sensitive.
     * </p>
     *
     * @return <p>
     *         The user-supplied cluster identifier. If this parameter is
     *         specified, only information about that specific cluster is
     *         returned. This parameter isn't case sensitive.
     *         </p>
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }

    /**
     * <p>
     * The user-supplied cluster identifier. If this parameter is specified,
     * only information about that specific cluster is returned. This parameter
     * isn't case sensitive.
     * </p>
     *
     * @param cacheClusterId <p>
     *            The user-supplied cluster identifier. If this parameter is
     *            specified, only information about that specific cluster is
     *            returned. This parameter isn't case sensitive.
     *            </p>
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * The user-supplied cluster identifier. If this parameter is specified,
     * only information about that specific cluster is returned. This parameter
     * isn't case sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheClusterId <p>
     *            The user-supplied cluster identifier. If this parameter is
     *            specified, only information about that specific cluster is
     *            returned. This parameter isn't case sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheClustersRequest withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a marker is
     * included in the response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 100.
     * </p>
     *
     * @return <p>
     *         The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results
     *         can be retrieved.
     *         </p>
     *         <p>
     *         Default: 100
     *         </p>
     *         <p>
     *         Constraints: minimum 20; maximum 100.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a marker is
     * included in the response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 100.
     * </p>
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response. If
     *            more records exist than the specified <code>MaxRecords</code>
     *            value, a marker is included in the response so that the
     *            remaining results can be retrieved.
     *            </p>
     *            <p>
     *            Default: 100
     *            </p>
     *            <p>
     *            Constraints: minimum 20; maximum 100.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a marker is
     * included in the response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response. If
     *            more records exist than the specified <code>MaxRecords</code>
     *            value, a marker is included in the response so that the
     *            remaining results can be retrieved.
     *            </p>
     *            <p>
     *            Default: 100
     *            </p>
     *            <p>
     *            Constraints: minimum 20; maximum 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheClustersRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @return <p>
     *         An optional marker returned from a prior request. Use this marker
     *         for pagination of results from this operation. If this parameter
     *         is specified, the response includes only records beyond the
     *         marker, up to the value specified by <code>MaxRecords</code>.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @param marker <p>
     *            An optional marker returned from a prior request. Use this
     *            marker for pagination of results from this operation. If this
     *            parameter is specified, the response includes only records
     *            beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional marker returned from a prior request. Use this
     *            marker for pagination of results from this operation. If this
     *            parameter is specified, the response includes only records
     *            beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheClustersRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * An optional flag that can be included in the
     * <code>DescribeCacheCluster</code> request to retrieve information about
     * the individual cache nodes.
     * </p>
     *
     * @return <p>
     *         An optional flag that can be included in the
     *         <code>DescribeCacheCluster</code> request to retrieve information
     *         about the individual cache nodes.
     *         </p>
     */
    public Boolean isShowCacheNodeInfo() {
        return showCacheNodeInfo;
    }

    /**
     * <p>
     * An optional flag that can be included in the
     * <code>DescribeCacheCluster</code> request to retrieve information about
     * the individual cache nodes.
     * </p>
     *
     * @return <p>
     *         An optional flag that can be included in the
     *         <code>DescribeCacheCluster</code> request to retrieve information
     *         about the individual cache nodes.
     *         </p>
     */
    public Boolean getShowCacheNodeInfo() {
        return showCacheNodeInfo;
    }

    /**
     * <p>
     * An optional flag that can be included in the
     * <code>DescribeCacheCluster</code> request to retrieve information about
     * the individual cache nodes.
     * </p>
     *
     * @param showCacheNodeInfo <p>
     *            An optional flag that can be included in the
     *            <code>DescribeCacheCluster</code> request to retrieve
     *            information about the individual cache nodes.
     *            </p>
     */
    public void setShowCacheNodeInfo(Boolean showCacheNodeInfo) {
        this.showCacheNodeInfo = showCacheNodeInfo;
    }

    /**
     * <p>
     * An optional flag that can be included in the
     * <code>DescribeCacheCluster</code> request to retrieve information about
     * the individual cache nodes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param showCacheNodeInfo <p>
     *            An optional flag that can be included in the
     *            <code>DescribeCacheCluster</code> request to retrieve
     *            information about the individual cache nodes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheClustersRequest withShowCacheNodeInfo(Boolean showCacheNodeInfo) {
        this.showCacheNodeInfo = showCacheNodeInfo;
        return this;
    }

    /**
     * <p>
     * An optional flag that can be included in the
     * <code>DescribeCacheCluster</code> request to show only nodes (API/CLI:
     * clusters) that are not members of a replication group. In practice, this
     * mean Memcached and single node Redis clusters.
     * </p>
     *
     * @return <p>
     *         An optional flag that can be included in the
     *         <code>DescribeCacheCluster</code> request to show only nodes
     *         (API/CLI: clusters) that are not members of a replication group.
     *         In practice, this mean Memcached and single node Redis clusters.
     *         </p>
     */
    public Boolean isShowCacheClustersNotInReplicationGroups() {
        return showCacheClustersNotInReplicationGroups;
    }

    /**
     * <p>
     * An optional flag that can be included in the
     * <code>DescribeCacheCluster</code> request to show only nodes (API/CLI:
     * clusters) that are not members of a replication group. In practice, this
     * mean Memcached and single node Redis clusters.
     * </p>
     *
     * @return <p>
     *         An optional flag that can be included in the
     *         <code>DescribeCacheCluster</code> request to show only nodes
     *         (API/CLI: clusters) that are not members of a replication group.
     *         In practice, this mean Memcached and single node Redis clusters.
     *         </p>
     */
    public Boolean getShowCacheClustersNotInReplicationGroups() {
        return showCacheClustersNotInReplicationGroups;
    }

    /**
     * <p>
     * An optional flag that can be included in the
     * <code>DescribeCacheCluster</code> request to show only nodes (API/CLI:
     * clusters) that are not members of a replication group. In practice, this
     * mean Memcached and single node Redis clusters.
     * </p>
     *
     * @param showCacheClustersNotInReplicationGroups <p>
     *            An optional flag that can be included in the
     *            <code>DescribeCacheCluster</code> request to show only nodes
     *            (API/CLI: clusters) that are not members of a replication
     *            group. In practice, this mean Memcached and single node Redis
     *            clusters.
     *            </p>
     */
    public void setShowCacheClustersNotInReplicationGroups(
            Boolean showCacheClustersNotInReplicationGroups) {
        this.showCacheClustersNotInReplicationGroups = showCacheClustersNotInReplicationGroups;
    }

    /**
     * <p>
     * An optional flag that can be included in the
     * <code>DescribeCacheCluster</code> request to show only nodes (API/CLI:
     * clusters) that are not members of a replication group. In practice, this
     * mean Memcached and single node Redis clusters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param showCacheClustersNotInReplicationGroups <p>
     *            An optional flag that can be included in the
     *            <code>DescribeCacheCluster</code> request to show only nodes
     *            (API/CLI: clusters) that are not members of a replication
     *            group. In practice, this mean Memcached and single node Redis
     *            clusters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheClustersRequest withShowCacheClustersNotInReplicationGroups(
            Boolean showCacheClustersNotInReplicationGroups) {
        this.showCacheClustersNotInReplicationGroups = showCacheClustersNotInReplicationGroups;
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
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getShowCacheNodeInfo() != null)
            sb.append("ShowCacheNodeInfo: " + getShowCacheNodeInfo() + ",");
        if (getShowCacheClustersNotInReplicationGroups() != null)
            sb.append("ShowCacheClustersNotInReplicationGroups: "
                    + getShowCacheClustersNotInReplicationGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getShowCacheNodeInfo() == null) ? 0 : getShowCacheNodeInfo().hashCode());
        hashCode = prime
                * hashCode
                + ((getShowCacheClustersNotInReplicationGroups() == null) ? 0
                        : getShowCacheClustersNotInReplicationGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCacheClustersRequest == false)
            return false;
        DescribeCacheClustersRequest other = (DescribeCacheClustersRequest) obj;

        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null
                && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getShowCacheNodeInfo() == null ^ this.getShowCacheNodeInfo() == null)
            return false;
        if (other.getShowCacheNodeInfo() != null
                && other.getShowCacheNodeInfo().equals(this.getShowCacheNodeInfo()) == false)
            return false;
        if (other.getShowCacheClustersNotInReplicationGroups() == null
                ^ this.getShowCacheClustersNotInReplicationGroups() == null)
            return false;
        if (other.getShowCacheClustersNotInReplicationGroups() != null
                && other.getShowCacheClustersNotInReplicationGroups().equals(
                        this.getShowCacheClustersNotInReplicationGroups()) == false)
            return false;
        return true;
    }
}
