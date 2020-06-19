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
 * Deleting a Global Datastore is a two-step process:
 * </p>
 * <ul>
 * <li>
 * <p>
 * First, you must <a>DisassociateGlobalReplicationGroup</a> to remove the
 * secondary clusters in the Global Datastore.
 * </p>
 * </li>
 * <li>
 * <p>
 * Once the Global Datastore contains only the primary cluster, you can use
 * DeleteGlobalReplicationGroup API to delete the Global Datastore while
 * retainining the primary cluster using Retain…= true.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Since the Global Datastore has only a primary cluster, you can delete the
 * Global Datastore while retaining the primary by setting
 * <code>RetainPrimaryCluster=true</code>.
 * </p>
 * <p>
 * When you receive a successful response from this operation, Amazon
 * ElastiCache immediately begins deleting the selected resources; you cannot
 * cancel or revert this operation.
 * </p>
 */
public class DeleteGlobalReplicationGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     */
    private String globalReplicationGroupId;

    /**
     * <p>
     * The primary replication group is retained as a standalone replication
     * group.
     * </p>
     */
    private Boolean retainPrimaryReplicationGroup;

    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     *
     * @return <p>
     *         The name of the Global Datastore
     *         </p>
     */
    public String getGlobalReplicationGroupId() {
        return globalReplicationGroupId;
    }

    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     *
     * @param globalReplicationGroupId <p>
     *            The name of the Global Datastore
     *            </p>
     */
    public void setGlobalReplicationGroupId(String globalReplicationGroupId) {
        this.globalReplicationGroupId = globalReplicationGroupId;
    }

    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalReplicationGroupId <p>
     *            The name of the Global Datastore
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteGlobalReplicationGroupRequest withGlobalReplicationGroupId(
            String globalReplicationGroupId) {
        this.globalReplicationGroupId = globalReplicationGroupId;
        return this;
    }

    /**
     * <p>
     * The primary replication group is retained as a standalone replication
     * group.
     * </p>
     *
     * @return <p>
     *         The primary replication group is retained as a standalone
     *         replication group.
     *         </p>
     */
    public Boolean isRetainPrimaryReplicationGroup() {
        return retainPrimaryReplicationGroup;
    }

    /**
     * <p>
     * The primary replication group is retained as a standalone replication
     * group.
     * </p>
     *
     * @return <p>
     *         The primary replication group is retained as a standalone
     *         replication group.
     *         </p>
     */
    public Boolean getRetainPrimaryReplicationGroup() {
        return retainPrimaryReplicationGroup;
    }

    /**
     * <p>
     * The primary replication group is retained as a standalone replication
     * group.
     * </p>
     *
     * @param retainPrimaryReplicationGroup <p>
     *            The primary replication group is retained as a standalone
     *            replication group.
     *            </p>
     */
    public void setRetainPrimaryReplicationGroup(Boolean retainPrimaryReplicationGroup) {
        this.retainPrimaryReplicationGroup = retainPrimaryReplicationGroup;
    }

    /**
     * <p>
     * The primary replication group is retained as a standalone replication
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param retainPrimaryReplicationGroup <p>
     *            The primary replication group is retained as a standalone
     *            replication group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteGlobalReplicationGroupRequest withRetainPrimaryReplicationGroup(
            Boolean retainPrimaryReplicationGroup) {
        this.retainPrimaryReplicationGroup = retainPrimaryReplicationGroup;
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
        if (getGlobalReplicationGroupId() != null)
            sb.append("GlobalReplicationGroupId: " + getGlobalReplicationGroupId() + ",");
        if (getRetainPrimaryReplicationGroup() != null)
            sb.append("RetainPrimaryReplicationGroup: " + getRetainPrimaryReplicationGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getGlobalReplicationGroupId() == null) ? 0 : getGlobalReplicationGroupId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRetainPrimaryReplicationGroup() == null) ? 0
                        : getRetainPrimaryReplicationGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteGlobalReplicationGroupRequest == false)
            return false;
        DeleteGlobalReplicationGroupRequest other = (DeleteGlobalReplicationGroupRequest) obj;

        if (other.getGlobalReplicationGroupId() == null
                ^ this.getGlobalReplicationGroupId() == null)
            return false;
        if (other.getGlobalReplicationGroupId() != null
                && other.getGlobalReplicationGroupId().equals(this.getGlobalReplicationGroupId()) == false)
            return false;
        if (other.getRetainPrimaryReplicationGroup() == null
                ^ this.getRetainPrimaryReplicationGroup() == null)
            return false;
        if (other.getRetainPrimaryReplicationGroup() != null
                && other.getRetainPrimaryReplicationGroup().equals(
                        this.getRetainPrimaryReplicationGroup()) == false)
            return false;
        return true;
    }
}
