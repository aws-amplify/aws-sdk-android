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
 * Returns details of the update actions
 * </p>
 */
public class DescribeUpdateActionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique ID of the service update
     * </p>
     */
    private String serviceUpdateName;

    /**
     * <p>
     * The replication group IDs
     * </p>
     */
    private java.util.List<String> replicationGroupIds;

    /**
     * <p>
     * The cache cluster IDs
     * </p>
     */
    private java.util.List<String> cacheClusterIds;

    /**
     * <p>
     * The Elasticache engine to which the update applies. Either Redis or
     * Memcached
     * </p>
     */
    private String engine;

    /**
     * <p>
     * The status of the service update
     * </p>
     */
    private java.util.List<String> serviceUpdateStatus;

    /**
     * <p>
     * The range of time specified to search for service updates that are in
     * available status
     * </p>
     */
    private TimeRangeFilter serviceUpdateTimeRange;

    /**
     * <p>
     * The status of the update action.
     * </p>
     */
    private java.util.List<String> updateActionStatus;

    /**
     * <p>
     * Dictates whether to include node level update status in the response
     * </p>
     */
    private Boolean showNodeLevelUpdateStatus;

    /**
     * <p>
     * The maximum number of records to include in the response
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
     * The unique ID of the service update
     * </p>
     *
     * @return <p>
     *         The unique ID of the service update
     *         </p>
     */
    public String getServiceUpdateName() {
        return serviceUpdateName;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     *
     * @param serviceUpdateName <p>
     *            The unique ID of the service update
     *            </p>
     */
    public void setServiceUpdateName(String serviceUpdateName) {
        this.serviceUpdateName = serviceUpdateName;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceUpdateName <p>
     *            The unique ID of the service update
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUpdateActionsRequest withServiceUpdateName(String serviceUpdateName) {
        this.serviceUpdateName = serviceUpdateName;
        return this;
    }

    /**
     * <p>
     * The replication group IDs
     * </p>
     *
     * @return <p>
     *         The replication group IDs
     *         </p>
     */
    public java.util.List<String> getReplicationGroupIds() {
        return replicationGroupIds;
    }

    /**
     * <p>
     * The replication group IDs
     * </p>
     *
     * @param replicationGroupIds <p>
     *            The replication group IDs
     *            </p>
     */
    public void setReplicationGroupIds(java.util.Collection<String> replicationGroupIds) {
        if (replicationGroupIds == null) {
            this.replicationGroupIds = null;
            return;
        }

        this.replicationGroupIds = new java.util.ArrayList<String>(replicationGroupIds);
    }

    /**
     * <p>
     * The replication group IDs
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupIds <p>
     *            The replication group IDs
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUpdateActionsRequest withReplicationGroupIds(String... replicationGroupIds) {
        if (getReplicationGroupIds() == null) {
            this.replicationGroupIds = new java.util.ArrayList<String>(replicationGroupIds.length);
        }
        for (String value : replicationGroupIds) {
            this.replicationGroupIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The replication group IDs
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupIds <p>
     *            The replication group IDs
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUpdateActionsRequest withReplicationGroupIds(
            java.util.Collection<String> replicationGroupIds) {
        setReplicationGroupIds(replicationGroupIds);
        return this;
    }

    /**
     * <p>
     * The cache cluster IDs
     * </p>
     *
     * @return <p>
     *         The cache cluster IDs
     *         </p>
     */
    public java.util.List<String> getCacheClusterIds() {
        return cacheClusterIds;
    }

    /**
     * <p>
     * The cache cluster IDs
     * </p>
     *
     * @param cacheClusterIds <p>
     *            The cache cluster IDs
     *            </p>
     */
    public void setCacheClusterIds(java.util.Collection<String> cacheClusterIds) {
        if (cacheClusterIds == null) {
            this.cacheClusterIds = null;
            return;
        }

        this.cacheClusterIds = new java.util.ArrayList<String>(cacheClusterIds);
    }

    /**
     * <p>
     * The cache cluster IDs
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheClusterIds <p>
     *            The cache cluster IDs
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUpdateActionsRequest withCacheClusterIds(String... cacheClusterIds) {
        if (getCacheClusterIds() == null) {
            this.cacheClusterIds = new java.util.ArrayList<String>(cacheClusterIds.length);
        }
        for (String value : cacheClusterIds) {
            this.cacheClusterIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The cache cluster IDs
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheClusterIds <p>
     *            The cache cluster IDs
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUpdateActionsRequest withCacheClusterIds(
            java.util.Collection<String> cacheClusterIds) {
        setCacheClusterIds(cacheClusterIds);
        return this;
    }

    /**
     * <p>
     * The Elasticache engine to which the update applies. Either Redis or
     * Memcached
     * </p>
     *
     * @return <p>
     *         The Elasticache engine to which the update applies. Either Redis
     *         or Memcached
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The Elasticache engine to which the update applies. Either Redis or
     * Memcached
     * </p>
     *
     * @param engine <p>
     *            The Elasticache engine to which the update applies. Either
     *            Redis or Memcached
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The Elasticache engine to which the update applies. Either Redis or
     * Memcached
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            The Elasticache engine to which the update applies. Either
     *            Redis or Memcached
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUpdateActionsRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     *
     * @return <p>
     *         The status of the service update
     *         </p>
     */
    public java.util.List<String> getServiceUpdateStatus() {
        return serviceUpdateStatus;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     *
     * @param serviceUpdateStatus <p>
     *            The status of the service update
     *            </p>
     */
    public void setServiceUpdateStatus(java.util.Collection<String> serviceUpdateStatus) {
        if (serviceUpdateStatus == null) {
            this.serviceUpdateStatus = null;
            return;
        }

        this.serviceUpdateStatus = new java.util.ArrayList<String>(serviceUpdateStatus);
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceUpdateStatus <p>
     *            The status of the service update
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUpdateActionsRequest withServiceUpdateStatus(String... serviceUpdateStatus) {
        if (getServiceUpdateStatus() == null) {
            this.serviceUpdateStatus = new java.util.ArrayList<String>(serviceUpdateStatus.length);
        }
        for (String value : serviceUpdateStatus) {
            this.serviceUpdateStatus.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceUpdateStatus <p>
     *            The status of the service update
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUpdateActionsRequest withServiceUpdateStatus(
            java.util.Collection<String> serviceUpdateStatus) {
        setServiceUpdateStatus(serviceUpdateStatus);
        return this;
    }

    /**
     * <p>
     * The range of time specified to search for service updates that are in
     * available status
     * </p>
     *
     * @return <p>
     *         The range of time specified to search for service updates that
     *         are in available status
     *         </p>
     */
    public TimeRangeFilter getServiceUpdateTimeRange() {
        return serviceUpdateTimeRange;
    }

    /**
     * <p>
     * The range of time specified to search for service updates that are in
     * available status
     * </p>
     *
     * @param serviceUpdateTimeRange <p>
     *            The range of time specified to search for service updates that
     *            are in available status
     *            </p>
     */
    public void setServiceUpdateTimeRange(TimeRangeFilter serviceUpdateTimeRange) {
        this.serviceUpdateTimeRange = serviceUpdateTimeRange;
    }

    /**
     * <p>
     * The range of time specified to search for service updates that are in
     * available status
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceUpdateTimeRange <p>
     *            The range of time specified to search for service updates that
     *            are in available status
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUpdateActionsRequest withServiceUpdateTimeRange(
            TimeRangeFilter serviceUpdateTimeRange) {
        this.serviceUpdateTimeRange = serviceUpdateTimeRange;
        return this;
    }

    /**
     * <p>
     * The status of the update action.
     * </p>
     *
     * @return <p>
     *         The status of the update action.
     *         </p>
     */
    public java.util.List<String> getUpdateActionStatus() {
        return updateActionStatus;
    }

    /**
     * <p>
     * The status of the update action.
     * </p>
     *
     * @param updateActionStatus <p>
     *            The status of the update action.
     *            </p>
     */
    public void setUpdateActionStatus(java.util.Collection<String> updateActionStatus) {
        if (updateActionStatus == null) {
            this.updateActionStatus = null;
            return;
        }

        this.updateActionStatus = new java.util.ArrayList<String>(updateActionStatus);
    }

    /**
     * <p>
     * The status of the update action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateActionStatus <p>
     *            The status of the update action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUpdateActionsRequest withUpdateActionStatus(String... updateActionStatus) {
        if (getUpdateActionStatus() == null) {
            this.updateActionStatus = new java.util.ArrayList<String>(updateActionStatus.length);
        }
        for (String value : updateActionStatus) {
            this.updateActionStatus.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The status of the update action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateActionStatus <p>
     *            The status of the update action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUpdateActionsRequest withUpdateActionStatus(
            java.util.Collection<String> updateActionStatus) {
        setUpdateActionStatus(updateActionStatus);
        return this;
    }

    /**
     * <p>
     * Dictates whether to include node level update status in the response
     * </p>
     *
     * @return <p>
     *         Dictates whether to include node level update status in the
     *         response
     *         </p>
     */
    public Boolean isShowNodeLevelUpdateStatus() {
        return showNodeLevelUpdateStatus;
    }

    /**
     * <p>
     * Dictates whether to include node level update status in the response
     * </p>
     *
     * @return <p>
     *         Dictates whether to include node level update status in the
     *         response
     *         </p>
     */
    public Boolean getShowNodeLevelUpdateStatus() {
        return showNodeLevelUpdateStatus;
    }

    /**
     * <p>
     * Dictates whether to include node level update status in the response
     * </p>
     *
     * @param showNodeLevelUpdateStatus <p>
     *            Dictates whether to include node level update status in the
     *            response
     *            </p>
     */
    public void setShowNodeLevelUpdateStatus(Boolean showNodeLevelUpdateStatus) {
        this.showNodeLevelUpdateStatus = showNodeLevelUpdateStatus;
    }

    /**
     * <p>
     * Dictates whether to include node level update status in the response
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param showNodeLevelUpdateStatus <p>
     *            Dictates whether to include node level update status in the
     *            response
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUpdateActionsRequest withShowNodeLevelUpdateStatus(
            Boolean showNodeLevelUpdateStatus) {
        this.showNodeLevelUpdateStatus = showNodeLevelUpdateStatus;
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response
     * </p>
     *
     * @return <p>
     *         The maximum number of records to include in the response
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response
     * </p>
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUpdateActionsRequest withMaxRecords(Integer maxRecords) {
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
    public DescribeUpdateActionsRequest withMarker(String marker) {
        this.marker = marker;
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
        if (getServiceUpdateName() != null)
            sb.append("ServiceUpdateName: " + getServiceUpdateName() + ",");
        if (getReplicationGroupIds() != null)
            sb.append("ReplicationGroupIds: " + getReplicationGroupIds() + ",");
        if (getCacheClusterIds() != null)
            sb.append("CacheClusterIds: " + getCacheClusterIds() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getServiceUpdateStatus() != null)
            sb.append("ServiceUpdateStatus: " + getServiceUpdateStatus() + ",");
        if (getServiceUpdateTimeRange() != null)
            sb.append("ServiceUpdateTimeRange: " + getServiceUpdateTimeRange() + ",");
        if (getUpdateActionStatus() != null)
            sb.append("UpdateActionStatus: " + getUpdateActionStatus() + ",");
        if (getShowNodeLevelUpdateStatus() != null)
            sb.append("ShowNodeLevelUpdateStatus: " + getShowNodeLevelUpdateStatus() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getServiceUpdateName() == null) ? 0 : getServiceUpdateName().hashCode());
        hashCode = prime * hashCode
                + ((getReplicationGroupIds() == null) ? 0 : getReplicationGroupIds().hashCode());
        hashCode = prime * hashCode
                + ((getCacheClusterIds() == null) ? 0 : getCacheClusterIds().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getServiceUpdateStatus() == null) ? 0 : getServiceUpdateStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getServiceUpdateTimeRange() == null) ? 0 : getServiceUpdateTimeRange()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getUpdateActionStatus() == null) ? 0 : getUpdateActionStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getShowNodeLevelUpdateStatus() == null) ? 0 : getShowNodeLevelUpdateStatus()
                        .hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUpdateActionsRequest == false)
            return false;
        DescribeUpdateActionsRequest other = (DescribeUpdateActionsRequest) obj;

        if (other.getServiceUpdateName() == null ^ this.getServiceUpdateName() == null)
            return false;
        if (other.getServiceUpdateName() != null
                && other.getServiceUpdateName().equals(this.getServiceUpdateName()) == false)
            return false;
        if (other.getReplicationGroupIds() == null ^ this.getReplicationGroupIds() == null)
            return false;
        if (other.getReplicationGroupIds() != null
                && other.getReplicationGroupIds().equals(this.getReplicationGroupIds()) == false)
            return false;
        if (other.getCacheClusterIds() == null ^ this.getCacheClusterIds() == null)
            return false;
        if (other.getCacheClusterIds() != null
                && other.getCacheClusterIds().equals(this.getCacheClusterIds()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getServiceUpdateStatus() == null ^ this.getServiceUpdateStatus() == null)
            return false;
        if (other.getServiceUpdateStatus() != null
                && other.getServiceUpdateStatus().equals(this.getServiceUpdateStatus()) == false)
            return false;
        if (other.getServiceUpdateTimeRange() == null ^ this.getServiceUpdateTimeRange() == null)
            return false;
        if (other.getServiceUpdateTimeRange() != null
                && other.getServiceUpdateTimeRange().equals(this.getServiceUpdateTimeRange()) == false)
            return false;
        if (other.getUpdateActionStatus() == null ^ this.getUpdateActionStatus() == null)
            return false;
        if (other.getUpdateActionStatus() != null
                && other.getUpdateActionStatus().equals(this.getUpdateActionStatus()) == false)
            return false;
        if (other.getShowNodeLevelUpdateStatus() == null
                ^ this.getShowNodeLevelUpdateStatus() == null)
            return false;
        if (other.getShowNodeLevelUpdateStatus() != null
                && other.getShowNodeLevelUpdateStatus().equals(this.getShowNodeLevelUpdateStatus()) == false)
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
        return true;
    }
}
