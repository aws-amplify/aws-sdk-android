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
 * Update action that has been processed for the corresponding apply/stop
 * request
 * </p>
 */
public class ProcessedUpdateAction implements Serializable {
    /**
     * <p>
     * The ID of the replication group
     * </p>
     */
    private String replicationGroupId;

    /**
     * <p>
     * The ID of the cache cluster
     * </p>
     */
    private String cacheClusterId;

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     */
    private String serviceUpdateName;

    /**
     * <p>
     * The status of the update action on the Redis cluster
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>not-applied, waiting-to-start, in-progress,
     * stopping, stopped, complete, scheduling, scheduled, not-applicable
     */
    private String updateActionStatus;

    /**
     * <p>
     * The ID of the replication group
     * </p>
     *
     * @return <p>
     *         The ID of the replication group
     *         </p>
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }

    /**
     * <p>
     * The ID of the replication group
     * </p>
     *
     * @param replicationGroupId <p>
     *            The ID of the replication group
     *            </p>
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The ID of the replication group
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupId <p>
     *            The ID of the replication group
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessedUpdateAction withReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
        return this;
    }

    /**
     * <p>
     * The ID of the cache cluster
     * </p>
     *
     * @return <p>
     *         The ID of the cache cluster
     *         </p>
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }

    /**
     * <p>
     * The ID of the cache cluster
     * </p>
     *
     * @param cacheClusterId <p>
     *            The ID of the cache cluster
     *            </p>
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * The ID of the cache cluster
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheClusterId <p>
     *            The ID of the cache cluster
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessedUpdateAction withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
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
    public ProcessedUpdateAction withServiceUpdateName(String serviceUpdateName) {
        this.serviceUpdateName = serviceUpdateName;
        return this;
    }

    /**
     * <p>
     * The status of the update action on the Redis cluster
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>not-applied, waiting-to-start, in-progress,
     * stopping, stopped, complete, scheduling, scheduled, not-applicable
     *
     * @return <p>
     *         The status of the update action on the Redis cluster
     *         </p>
     * @see UpdateActionStatus
     */
    public String getUpdateActionStatus() {
        return updateActionStatus;
    }

    /**
     * <p>
     * The status of the update action on the Redis cluster
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>not-applied, waiting-to-start, in-progress,
     * stopping, stopped, complete, scheduling, scheduled, not-applicable
     *
     * @param updateActionStatus <p>
     *            The status of the update action on the Redis cluster
     *            </p>
     * @see UpdateActionStatus
     */
    public void setUpdateActionStatus(String updateActionStatus) {
        this.updateActionStatus = updateActionStatus;
    }

    /**
     * <p>
     * The status of the update action on the Redis cluster
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>not-applied, waiting-to-start, in-progress,
     * stopping, stopped, complete, scheduling, scheduled, not-applicable
     *
     * @param updateActionStatus <p>
     *            The status of the update action on the Redis cluster
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UpdateActionStatus
     */
    public ProcessedUpdateAction withUpdateActionStatus(String updateActionStatus) {
        this.updateActionStatus = updateActionStatus;
        return this;
    }

    /**
     * <p>
     * The status of the update action on the Redis cluster
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>not-applied, waiting-to-start, in-progress,
     * stopping, stopped, complete, scheduling, scheduled, not-applicable
     *
     * @param updateActionStatus <p>
     *            The status of the update action on the Redis cluster
     *            </p>
     * @see UpdateActionStatus
     */
    public void setUpdateActionStatus(UpdateActionStatus updateActionStatus) {
        this.updateActionStatus = updateActionStatus.toString();
    }

    /**
     * <p>
     * The status of the update action on the Redis cluster
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>not-applied, waiting-to-start, in-progress,
     * stopping, stopped, complete, scheduling, scheduled, not-applicable
     *
     * @param updateActionStatus <p>
     *            The status of the update action on the Redis cluster
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UpdateActionStatus
     */
    public ProcessedUpdateAction withUpdateActionStatus(UpdateActionStatus updateActionStatus) {
        this.updateActionStatus = updateActionStatus.toString();
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
        if (getServiceUpdateName() != null)
            sb.append("ServiceUpdateName: " + getServiceUpdateName() + ",");
        if (getUpdateActionStatus() != null)
            sb.append("UpdateActionStatus: " + getUpdateActionStatus());
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
                + ((getServiceUpdateName() == null) ? 0 : getServiceUpdateName().hashCode());
        hashCode = prime * hashCode
                + ((getUpdateActionStatus() == null) ? 0 : getUpdateActionStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessedUpdateAction == false)
            return false;
        ProcessedUpdateAction other = (ProcessedUpdateAction) obj;

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
        if (other.getServiceUpdateName() == null ^ this.getServiceUpdateName() == null)
            return false;
        if (other.getServiceUpdateName() != null
                && other.getServiceUpdateName().equals(this.getServiceUpdateName()) == false)
            return false;
        if (other.getUpdateActionStatus() == null ^ this.getUpdateActionStatus() == null)
            return false;
        if (other.getUpdateActionStatus() != null
                && other.getUpdateActionStatus().equals(this.getUpdateActionStatus()) == false)
            return false;
        return true;
    }
}
