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
 * Returns information about cluster or replication group snapshots. By default,
 * <code>DescribeSnapshots</code> lists all of your snapshots; it can optionally
 * describe a single snapshot, or just the snapshots associated with a
 * particular cache cluster.
 * </p>
 * <note>
 * <p>
 * This operation is valid for Redis only.
 * </p>
 * </note>
 */
public class DescribeSnapshotsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A user-supplied replication group identifier. If this parameter is
     * specified, only snapshots associated with that specific replication group
     * are described.
     * </p>
     */
    private String replicationGroupId;

    /**
     * <p>
     * A user-supplied cluster identifier. If this parameter is specified, only
     * snapshots associated with that specific cluster are described.
     * </p>
     */
    private String cacheClusterId;

    /**
     * <p>
     * A user-supplied name of the snapshot. If this parameter is specified,
     * only this snapshot are described.
     * </p>
     */
    private String snapshotName;

    /**
     * <p>
     * If set to <code>system</code>, the output shows snapshots that were
     * automatically created by ElastiCache. If set to <code>user</code> the
     * output shows snapshots that were manually created. If omitted, the output
     * shows both automatically and manually created snapshots.
     * </p>
     */
    private String snapshotSource;

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
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a marker is
     * included in the response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 50
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 50.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * A Boolean value which if true, the node group (shard) configuration is
     * included in the snapshot description.
     * </p>
     */
    private Boolean showNodeGroupConfig;

    /**
     * <p>
     * A user-supplied replication group identifier. If this parameter is
     * specified, only snapshots associated with that specific replication group
     * are described.
     * </p>
     *
     * @return <p>
     *         A user-supplied replication group identifier. If this parameter
     *         is specified, only snapshots associated with that specific
     *         replication group are described.
     *         </p>
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }

    /**
     * <p>
     * A user-supplied replication group identifier. If this parameter is
     * specified, only snapshots associated with that specific replication group
     * are described.
     * </p>
     *
     * @param replicationGroupId <p>
     *            A user-supplied replication group identifier. If this
     *            parameter is specified, only snapshots associated with that
     *            specific replication group are described.
     *            </p>
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * A user-supplied replication group identifier. If this parameter is
     * specified, only snapshots associated with that specific replication group
     * are described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupId <p>
     *            A user-supplied replication group identifier. If this
     *            parameter is specified, only snapshots associated with that
     *            specific replication group are described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotsRequest withReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
        return this;
    }

    /**
     * <p>
     * A user-supplied cluster identifier. If this parameter is specified, only
     * snapshots associated with that specific cluster are described.
     * </p>
     *
     * @return <p>
     *         A user-supplied cluster identifier. If this parameter is
     *         specified, only snapshots associated with that specific cluster
     *         are described.
     *         </p>
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }

    /**
     * <p>
     * A user-supplied cluster identifier. If this parameter is specified, only
     * snapshots associated with that specific cluster are described.
     * </p>
     *
     * @param cacheClusterId <p>
     *            A user-supplied cluster identifier. If this parameter is
     *            specified, only snapshots associated with that specific
     *            cluster are described.
     *            </p>
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * A user-supplied cluster identifier. If this parameter is specified, only
     * snapshots associated with that specific cluster are described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheClusterId <p>
     *            A user-supplied cluster identifier. If this parameter is
     *            specified, only snapshots associated with that specific
     *            cluster are described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotsRequest withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
        return this;
    }

    /**
     * <p>
     * A user-supplied name of the snapshot. If this parameter is specified,
     * only this snapshot are described.
     * </p>
     *
     * @return <p>
     *         A user-supplied name of the snapshot. If this parameter is
     *         specified, only this snapshot are described.
     *         </p>
     */
    public String getSnapshotName() {
        return snapshotName;
    }

    /**
     * <p>
     * A user-supplied name of the snapshot. If this parameter is specified,
     * only this snapshot are described.
     * </p>
     *
     * @param snapshotName <p>
     *            A user-supplied name of the snapshot. If this parameter is
     *            specified, only this snapshot are described.
     *            </p>
     */
    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * A user-supplied name of the snapshot. If this parameter is specified,
     * only this snapshot are described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotName <p>
     *            A user-supplied name of the snapshot. If this parameter is
     *            specified, only this snapshot are described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotsRequest withSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }

    /**
     * <p>
     * If set to <code>system</code>, the output shows snapshots that were
     * automatically created by ElastiCache. If set to <code>user</code> the
     * output shows snapshots that were manually created. If omitted, the output
     * shows both automatically and manually created snapshots.
     * </p>
     *
     * @return <p>
     *         If set to <code>system</code>, the output shows snapshots that
     *         were automatically created by ElastiCache. If set to
     *         <code>user</code> the output shows snapshots that were manually
     *         created. If omitted, the output shows both automatically and
     *         manually created snapshots.
     *         </p>
     */
    public String getSnapshotSource() {
        return snapshotSource;
    }

    /**
     * <p>
     * If set to <code>system</code>, the output shows snapshots that were
     * automatically created by ElastiCache. If set to <code>user</code> the
     * output shows snapshots that were manually created. If omitted, the output
     * shows both automatically and manually created snapshots.
     * </p>
     *
     * @param snapshotSource <p>
     *            If set to <code>system</code>, the output shows snapshots that
     *            were automatically created by ElastiCache. If set to
     *            <code>user</code> the output shows snapshots that were
     *            manually created. If omitted, the output shows both
     *            automatically and manually created snapshots.
     *            </p>
     */
    public void setSnapshotSource(String snapshotSource) {
        this.snapshotSource = snapshotSource;
    }

    /**
     * <p>
     * If set to <code>system</code>, the output shows snapshots that were
     * automatically created by ElastiCache. If set to <code>user</code> the
     * output shows snapshots that were manually created. If omitted, the output
     * shows both automatically and manually created snapshots.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotSource <p>
     *            If set to <code>system</code>, the output shows snapshots that
     *            were automatically created by ElastiCache. If set to
     *            <code>user</code> the output shows snapshots that were
     *            manually created. If omitted, the output shows both
     *            automatically and manually created snapshots.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotsRequest withSnapshotSource(String snapshotSource) {
        this.snapshotSource = snapshotSource;
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
    public DescribeSnapshotsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a marker is
     * included in the response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 50
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 50.
     * </p>
     *
     * @return <p>
     *         The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results
     *         can be retrieved.
     *         </p>
     *         <p>
     *         Default: 50
     *         </p>
     *         <p>
     *         Constraints: minimum 20; maximum 50.
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
     * Default: 50
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 50.
     * </p>
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response. If
     *            more records exist than the specified <code>MaxRecords</code>
     *            value, a marker is included in the response so that the
     *            remaining results can be retrieved.
     *            </p>
     *            <p>
     *            Default: 50
     *            </p>
     *            <p>
     *            Constraints: minimum 20; maximum 50.
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
     * Default: 50
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 50.
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
     *            Default: 50
     *            </p>
     *            <p>
     *            Constraints: minimum 20; maximum 50.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * A Boolean value which if true, the node group (shard) configuration is
     * included in the snapshot description.
     * </p>
     *
     * @return <p>
     *         A Boolean value which if true, the node group (shard)
     *         configuration is included in the snapshot description.
     *         </p>
     */
    public Boolean isShowNodeGroupConfig() {
        return showNodeGroupConfig;
    }

    /**
     * <p>
     * A Boolean value which if true, the node group (shard) configuration is
     * included in the snapshot description.
     * </p>
     *
     * @return <p>
     *         A Boolean value which if true, the node group (shard)
     *         configuration is included in the snapshot description.
     *         </p>
     */
    public Boolean getShowNodeGroupConfig() {
        return showNodeGroupConfig;
    }

    /**
     * <p>
     * A Boolean value which if true, the node group (shard) configuration is
     * included in the snapshot description.
     * </p>
     *
     * @param showNodeGroupConfig <p>
     *            A Boolean value which if true, the node group (shard)
     *            configuration is included in the snapshot description.
     *            </p>
     */
    public void setShowNodeGroupConfig(Boolean showNodeGroupConfig) {
        this.showNodeGroupConfig = showNodeGroupConfig;
    }

    /**
     * <p>
     * A Boolean value which if true, the node group (shard) configuration is
     * included in the snapshot description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param showNodeGroupConfig <p>
     *            A Boolean value which if true, the node group (shard)
     *            configuration is included in the snapshot description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotsRequest withShowNodeGroupConfig(Boolean showNodeGroupConfig) {
        this.showNodeGroupConfig = showNodeGroupConfig;
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
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: " + getReplicationGroupId() + ",");
        if (getCacheClusterId() != null)
            sb.append("CacheClusterId: " + getCacheClusterId() + ",");
        if (getSnapshotName() != null)
            sb.append("SnapshotName: " + getSnapshotName() + ",");
        if (getSnapshotSource() != null)
            sb.append("SnapshotSource: " + getSnapshotSource() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getShowNodeGroupConfig() != null)
            sb.append("ShowNodeGroupConfig: " + getShowNodeGroupConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime * hashCode
                + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotSource() == null) ? 0 : getSnapshotSource().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode
                + ((getShowNodeGroupConfig() == null) ? 0 : getShowNodeGroupConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSnapshotsRequest == false)
            return false;
        DescribeSnapshotsRequest other = (DescribeSnapshotsRequest) obj;

        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null
                && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null
                && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null
                && other.getSnapshotName().equals(this.getSnapshotName()) == false)
            return false;
        if (other.getSnapshotSource() == null ^ this.getSnapshotSource() == null)
            return false;
        if (other.getSnapshotSource() != null
                && other.getSnapshotSource().equals(this.getSnapshotSource()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getShowNodeGroupConfig() == null ^ this.getShowNodeGroupConfig() == null)
            return false;
        if (other.getShowNodeGroupConfig() != null
                && other.getShowNodeGroupConfig().equals(this.getShowNodeGroupConfig()) == false)
            return false;
        return true;
    }
}
