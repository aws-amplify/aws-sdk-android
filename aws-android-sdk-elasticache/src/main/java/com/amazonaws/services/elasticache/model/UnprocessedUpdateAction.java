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
 * Update action that has failed to be processed for the corresponding
 * apply/stop request
 * </p>
 */
public class UnprocessedUpdateAction implements Serializable {
    /**
     * <p>
     * The replication group ID
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
     * The error type for requests that are not processed
     * </p>
     */
    private String errorType;

    /**
     * <p>
     * The error message that describes the reason the request was not processed
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The replication group ID
     * </p>
     *
     * @return <p>
     *         The replication group ID
     *         </p>
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }

    /**
     * <p>
     * The replication group ID
     * </p>
     *
     * @param replicationGroupId <p>
     *            The replication group ID
     *            </p>
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The replication group ID
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupId <p>
     *            The replication group ID
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnprocessedUpdateAction withReplicationGroupId(String replicationGroupId) {
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
    public UnprocessedUpdateAction withCacheClusterId(String cacheClusterId) {
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
    public UnprocessedUpdateAction withServiceUpdateName(String serviceUpdateName) {
        this.serviceUpdateName = serviceUpdateName;
        return this;
    }

    /**
     * <p>
     * The error type for requests that are not processed
     * </p>
     *
     * @return <p>
     *         The error type for requests that are not processed
     *         </p>
     */
    public String getErrorType() {
        return errorType;
    }

    /**
     * <p>
     * The error type for requests that are not processed
     * </p>
     *
     * @param errorType <p>
     *            The error type for requests that are not processed
     *            </p>
     */
    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    /**
     * <p>
     * The error type for requests that are not processed
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorType <p>
     *            The error type for requests that are not processed
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnprocessedUpdateAction withErrorType(String errorType) {
        this.errorType = errorType;
        return this;
    }

    /**
     * <p>
     * The error message that describes the reason the request was not processed
     * </p>
     *
     * @return <p>
     *         The error message that describes the reason the request was not
     *         processed
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * The error message that describes the reason the request was not processed
     * </p>
     *
     * @param errorMessage <p>
     *            The error message that describes the reason the request was
     *            not processed
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message that describes the reason the request was not processed
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorMessage <p>
     *            The error message that describes the reason the request was
     *            not processed
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnprocessedUpdateAction withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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
        if (getErrorType() != null)
            sb.append("ErrorType: " + getErrorType() + ",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: " + getErrorMessage());
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
        hashCode = prime * hashCode + ((getErrorType() == null) ? 0 : getErrorType().hashCode());
        hashCode = prime * hashCode
                + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnprocessedUpdateAction == false)
            return false;
        UnprocessedUpdateAction other = (UnprocessedUpdateAction) obj;

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
        if (other.getErrorType() == null ^ this.getErrorType() == null)
            return false;
        if (other.getErrorType() != null
                && other.getErrorType().equals(this.getErrorType()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null
                && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }
}
