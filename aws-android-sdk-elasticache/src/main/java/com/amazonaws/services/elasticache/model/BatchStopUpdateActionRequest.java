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
 * Stop the service update. For more information on service updates and stopping
 * them, see <a href=
 * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/stopping-self-service-updates.html"
 * >Stopping Service Updates</a>.
 * </p>
 */
public class BatchStopUpdateActionRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The unique ID of the service update
     * </p>
     */
    private String serviceUpdateName;

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
    public BatchStopUpdateActionRequest withReplicationGroupIds(String... replicationGroupIds) {
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
    public BatchStopUpdateActionRequest withReplicationGroupIds(
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
    public BatchStopUpdateActionRequest withCacheClusterIds(String... cacheClusterIds) {
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
    public BatchStopUpdateActionRequest withCacheClusterIds(
            java.util.Collection<String> cacheClusterIds) {
        setCacheClusterIds(cacheClusterIds);
        return this;
    }

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
    public BatchStopUpdateActionRequest withServiceUpdateName(String serviceUpdateName) {
        this.serviceUpdateName = serviceUpdateName;
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
        if (getReplicationGroupIds() != null)
            sb.append("ReplicationGroupIds: " + getReplicationGroupIds() + ",");
        if (getCacheClusterIds() != null)
            sb.append("CacheClusterIds: " + getCacheClusterIds() + ",");
        if (getServiceUpdateName() != null)
            sb.append("ServiceUpdateName: " + getServiceUpdateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReplicationGroupIds() == null) ? 0 : getReplicationGroupIds().hashCode());
        hashCode = prime * hashCode
                + ((getCacheClusterIds() == null) ? 0 : getCacheClusterIds().hashCode());
        hashCode = prime * hashCode
                + ((getServiceUpdateName() == null) ? 0 : getServiceUpdateName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchStopUpdateActionRequest == false)
            return false;
        BatchStopUpdateActionRequest other = (BatchStopUpdateActionRequest) obj;

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
        if (other.getServiceUpdateName() == null ^ this.getServiceUpdateName() == null)
            return false;
        if (other.getServiceUpdateName() != null
                && other.getServiceUpdateName().equals(this.getServiceUpdateName()) == false)
            return false;
        return true;
    }
}
