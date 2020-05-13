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
 * The status of the service update on the cache node
 * </p>
 */
public class CacheNodeUpdateStatus implements Serializable {
    /**
     * <p>
     * The node ID of the cache cluster
     * </p>
     */
    private String cacheNodeId;

    /**
     * <p>
     * The update status of the node
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>not-applied, waiting-to-start, in-progress,
     * stopping, stopped, complete
     */
    private String nodeUpdateStatus;

    /**
     * <p>
     * The deletion date of the node
     * </p>
     */
    private java.util.Date nodeDeletionDate;

    /**
     * <p>
     * The start date of the update for a node
     * </p>
     */
    private java.util.Date nodeUpdateStartDate;

    /**
     * <p>
     * The end date of the update for a node
     * </p>
     */
    private java.util.Date nodeUpdateEndDate;

    /**
     * <p>
     * Reflects whether the update was initiated by the customer or
     * automatically applied
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>system, customer
     */
    private String nodeUpdateInitiatedBy;

    /**
     * <p>
     * The date when the update is triggered
     * </p>
     */
    private java.util.Date nodeUpdateInitiatedDate;

    /**
     * <p>
     * The date when the NodeUpdateStatus was last modified&gt;
     * </p>
     */
    private java.util.Date nodeUpdateStatusModifiedDate;

    /**
     * <p>
     * The node ID of the cache cluster
     * </p>
     *
     * @return <p>
     *         The node ID of the cache cluster
     *         </p>
     */
    public String getCacheNodeId() {
        return cacheNodeId;
    }

    /**
     * <p>
     * The node ID of the cache cluster
     * </p>
     *
     * @param cacheNodeId <p>
     *            The node ID of the cache cluster
     *            </p>
     */
    public void setCacheNodeId(String cacheNodeId) {
        this.cacheNodeId = cacheNodeId;
    }

    /**
     * <p>
     * The node ID of the cache cluster
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeId <p>
     *            The node ID of the cache cluster
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheNodeUpdateStatus withCacheNodeId(String cacheNodeId) {
        this.cacheNodeId = cacheNodeId;
        return this;
    }

    /**
     * <p>
     * The update status of the node
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>not-applied, waiting-to-start, in-progress,
     * stopping, stopped, complete
     *
     * @return <p>
     *         The update status of the node
     *         </p>
     * @see NodeUpdateStatus
     */
    public String getNodeUpdateStatus() {
        return nodeUpdateStatus;
    }

    /**
     * <p>
     * The update status of the node
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>not-applied, waiting-to-start, in-progress,
     * stopping, stopped, complete
     *
     * @param nodeUpdateStatus <p>
     *            The update status of the node
     *            </p>
     * @see NodeUpdateStatus
     */
    public void setNodeUpdateStatus(String nodeUpdateStatus) {
        this.nodeUpdateStatus = nodeUpdateStatus;
    }

    /**
     * <p>
     * The update status of the node
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>not-applied, waiting-to-start, in-progress,
     * stopping, stopped, complete
     *
     * @param nodeUpdateStatus <p>
     *            The update status of the node
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NodeUpdateStatus
     */
    public CacheNodeUpdateStatus withNodeUpdateStatus(String nodeUpdateStatus) {
        this.nodeUpdateStatus = nodeUpdateStatus;
        return this;
    }

    /**
     * <p>
     * The update status of the node
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>not-applied, waiting-to-start, in-progress,
     * stopping, stopped, complete
     *
     * @param nodeUpdateStatus <p>
     *            The update status of the node
     *            </p>
     * @see NodeUpdateStatus
     */
    public void setNodeUpdateStatus(NodeUpdateStatus nodeUpdateStatus) {
        this.nodeUpdateStatus = nodeUpdateStatus.toString();
    }

    /**
     * <p>
     * The update status of the node
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>not-applied, waiting-to-start, in-progress,
     * stopping, stopped, complete
     *
     * @param nodeUpdateStatus <p>
     *            The update status of the node
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NodeUpdateStatus
     */
    public CacheNodeUpdateStatus withNodeUpdateStatus(NodeUpdateStatus nodeUpdateStatus) {
        this.nodeUpdateStatus = nodeUpdateStatus.toString();
        return this;
    }

    /**
     * <p>
     * The deletion date of the node
     * </p>
     *
     * @return <p>
     *         The deletion date of the node
     *         </p>
     */
    public java.util.Date getNodeDeletionDate() {
        return nodeDeletionDate;
    }

    /**
     * <p>
     * The deletion date of the node
     * </p>
     *
     * @param nodeDeletionDate <p>
     *            The deletion date of the node
     *            </p>
     */
    public void setNodeDeletionDate(java.util.Date nodeDeletionDate) {
        this.nodeDeletionDate = nodeDeletionDate;
    }

    /**
     * <p>
     * The deletion date of the node
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeDeletionDate <p>
     *            The deletion date of the node
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheNodeUpdateStatus withNodeDeletionDate(java.util.Date nodeDeletionDate) {
        this.nodeDeletionDate = nodeDeletionDate;
        return this;
    }

    /**
     * <p>
     * The start date of the update for a node
     * </p>
     *
     * @return <p>
     *         The start date of the update for a node
     *         </p>
     */
    public java.util.Date getNodeUpdateStartDate() {
        return nodeUpdateStartDate;
    }

    /**
     * <p>
     * The start date of the update for a node
     * </p>
     *
     * @param nodeUpdateStartDate <p>
     *            The start date of the update for a node
     *            </p>
     */
    public void setNodeUpdateStartDate(java.util.Date nodeUpdateStartDate) {
        this.nodeUpdateStartDate = nodeUpdateStartDate;
    }

    /**
     * <p>
     * The start date of the update for a node
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeUpdateStartDate <p>
     *            The start date of the update for a node
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheNodeUpdateStatus withNodeUpdateStartDate(java.util.Date nodeUpdateStartDate) {
        this.nodeUpdateStartDate = nodeUpdateStartDate;
        return this;
    }

    /**
     * <p>
     * The end date of the update for a node
     * </p>
     *
     * @return <p>
     *         The end date of the update for a node
     *         </p>
     */
    public java.util.Date getNodeUpdateEndDate() {
        return nodeUpdateEndDate;
    }

    /**
     * <p>
     * The end date of the update for a node
     * </p>
     *
     * @param nodeUpdateEndDate <p>
     *            The end date of the update for a node
     *            </p>
     */
    public void setNodeUpdateEndDate(java.util.Date nodeUpdateEndDate) {
        this.nodeUpdateEndDate = nodeUpdateEndDate;
    }

    /**
     * <p>
     * The end date of the update for a node
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeUpdateEndDate <p>
     *            The end date of the update for a node
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheNodeUpdateStatus withNodeUpdateEndDate(java.util.Date nodeUpdateEndDate) {
        this.nodeUpdateEndDate = nodeUpdateEndDate;
        return this;
    }

    /**
     * <p>
     * Reflects whether the update was initiated by the customer or
     * automatically applied
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>system, customer
     *
     * @return <p>
     *         Reflects whether the update was initiated by the customer or
     *         automatically applied
     *         </p>
     * @see NodeUpdateInitiatedBy
     */
    public String getNodeUpdateInitiatedBy() {
        return nodeUpdateInitiatedBy;
    }

    /**
     * <p>
     * Reflects whether the update was initiated by the customer or
     * automatically applied
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>system, customer
     *
     * @param nodeUpdateInitiatedBy <p>
     *            Reflects whether the update was initiated by the customer or
     *            automatically applied
     *            </p>
     * @see NodeUpdateInitiatedBy
     */
    public void setNodeUpdateInitiatedBy(String nodeUpdateInitiatedBy) {
        this.nodeUpdateInitiatedBy = nodeUpdateInitiatedBy;
    }

    /**
     * <p>
     * Reflects whether the update was initiated by the customer or
     * automatically applied
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>system, customer
     *
     * @param nodeUpdateInitiatedBy <p>
     *            Reflects whether the update was initiated by the customer or
     *            automatically applied
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NodeUpdateInitiatedBy
     */
    public CacheNodeUpdateStatus withNodeUpdateInitiatedBy(String nodeUpdateInitiatedBy) {
        this.nodeUpdateInitiatedBy = nodeUpdateInitiatedBy;
        return this;
    }

    /**
     * <p>
     * Reflects whether the update was initiated by the customer or
     * automatically applied
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>system, customer
     *
     * @param nodeUpdateInitiatedBy <p>
     *            Reflects whether the update was initiated by the customer or
     *            automatically applied
     *            </p>
     * @see NodeUpdateInitiatedBy
     */
    public void setNodeUpdateInitiatedBy(NodeUpdateInitiatedBy nodeUpdateInitiatedBy) {
        this.nodeUpdateInitiatedBy = nodeUpdateInitiatedBy.toString();
    }

    /**
     * <p>
     * Reflects whether the update was initiated by the customer or
     * automatically applied
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>system, customer
     *
     * @param nodeUpdateInitiatedBy <p>
     *            Reflects whether the update was initiated by the customer or
     *            automatically applied
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NodeUpdateInitiatedBy
     */
    public CacheNodeUpdateStatus withNodeUpdateInitiatedBy(
            NodeUpdateInitiatedBy nodeUpdateInitiatedBy) {
        this.nodeUpdateInitiatedBy = nodeUpdateInitiatedBy.toString();
        return this;
    }

    /**
     * <p>
     * The date when the update is triggered
     * </p>
     *
     * @return <p>
     *         The date when the update is triggered
     *         </p>
     */
    public java.util.Date getNodeUpdateInitiatedDate() {
        return nodeUpdateInitiatedDate;
    }

    /**
     * <p>
     * The date when the update is triggered
     * </p>
     *
     * @param nodeUpdateInitiatedDate <p>
     *            The date when the update is triggered
     *            </p>
     */
    public void setNodeUpdateInitiatedDate(java.util.Date nodeUpdateInitiatedDate) {
        this.nodeUpdateInitiatedDate = nodeUpdateInitiatedDate;
    }

    /**
     * <p>
     * The date when the update is triggered
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeUpdateInitiatedDate <p>
     *            The date when the update is triggered
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheNodeUpdateStatus withNodeUpdateInitiatedDate(java.util.Date nodeUpdateInitiatedDate) {
        this.nodeUpdateInitiatedDate = nodeUpdateInitiatedDate;
        return this;
    }

    /**
     * <p>
     * The date when the NodeUpdateStatus was last modified&gt;
     * </p>
     *
     * @return <p>
     *         The date when the NodeUpdateStatus was last modified&gt;
     *         </p>
     */
    public java.util.Date getNodeUpdateStatusModifiedDate() {
        return nodeUpdateStatusModifiedDate;
    }

    /**
     * <p>
     * The date when the NodeUpdateStatus was last modified&gt;
     * </p>
     *
     * @param nodeUpdateStatusModifiedDate <p>
     *            The date when the NodeUpdateStatus was last modified&gt;
     *            </p>
     */
    public void setNodeUpdateStatusModifiedDate(java.util.Date nodeUpdateStatusModifiedDate) {
        this.nodeUpdateStatusModifiedDate = nodeUpdateStatusModifiedDate;
    }

    /**
     * <p>
     * The date when the NodeUpdateStatus was last modified&gt;
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeUpdateStatusModifiedDate <p>
     *            The date when the NodeUpdateStatus was last modified&gt;
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheNodeUpdateStatus withNodeUpdateStatusModifiedDate(
            java.util.Date nodeUpdateStatusModifiedDate) {
        this.nodeUpdateStatusModifiedDate = nodeUpdateStatusModifiedDate;
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
        if (getCacheNodeId() != null)
            sb.append("CacheNodeId: " + getCacheNodeId() + ",");
        if (getNodeUpdateStatus() != null)
            sb.append("NodeUpdateStatus: " + getNodeUpdateStatus() + ",");
        if (getNodeDeletionDate() != null)
            sb.append("NodeDeletionDate: " + getNodeDeletionDate() + ",");
        if (getNodeUpdateStartDate() != null)
            sb.append("NodeUpdateStartDate: " + getNodeUpdateStartDate() + ",");
        if (getNodeUpdateEndDate() != null)
            sb.append("NodeUpdateEndDate: " + getNodeUpdateEndDate() + ",");
        if (getNodeUpdateInitiatedBy() != null)
            sb.append("NodeUpdateInitiatedBy: " + getNodeUpdateInitiatedBy() + ",");
        if (getNodeUpdateInitiatedDate() != null)
            sb.append("NodeUpdateInitiatedDate: " + getNodeUpdateInitiatedDate() + ",");
        if (getNodeUpdateStatusModifiedDate() != null)
            sb.append("NodeUpdateStatusModifiedDate: " + getNodeUpdateStatusModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCacheNodeId() == null) ? 0 : getCacheNodeId().hashCode());
        hashCode = prime * hashCode
                + ((getNodeUpdateStatus() == null) ? 0 : getNodeUpdateStatus().hashCode());
        hashCode = prime * hashCode
                + ((getNodeDeletionDate() == null) ? 0 : getNodeDeletionDate().hashCode());
        hashCode = prime * hashCode
                + ((getNodeUpdateStartDate() == null) ? 0 : getNodeUpdateStartDate().hashCode());
        hashCode = prime * hashCode
                + ((getNodeUpdateEndDate() == null) ? 0 : getNodeUpdateEndDate().hashCode());
        hashCode = prime
                * hashCode
                + ((getNodeUpdateInitiatedBy() == null) ? 0 : getNodeUpdateInitiatedBy().hashCode());
        hashCode = prime
                * hashCode
                + ((getNodeUpdateInitiatedDate() == null) ? 0 : getNodeUpdateInitiatedDate()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getNodeUpdateStatusModifiedDate() == null) ? 0
                        : getNodeUpdateStatusModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CacheNodeUpdateStatus == false)
            return false;
        CacheNodeUpdateStatus other = (CacheNodeUpdateStatus) obj;

        if (other.getCacheNodeId() == null ^ this.getCacheNodeId() == null)
            return false;
        if (other.getCacheNodeId() != null
                && other.getCacheNodeId().equals(this.getCacheNodeId()) == false)
            return false;
        if (other.getNodeUpdateStatus() == null ^ this.getNodeUpdateStatus() == null)
            return false;
        if (other.getNodeUpdateStatus() != null
                && other.getNodeUpdateStatus().equals(this.getNodeUpdateStatus()) == false)
            return false;
        if (other.getNodeDeletionDate() == null ^ this.getNodeDeletionDate() == null)
            return false;
        if (other.getNodeDeletionDate() != null
                && other.getNodeDeletionDate().equals(this.getNodeDeletionDate()) == false)
            return false;
        if (other.getNodeUpdateStartDate() == null ^ this.getNodeUpdateStartDate() == null)
            return false;
        if (other.getNodeUpdateStartDate() != null
                && other.getNodeUpdateStartDate().equals(this.getNodeUpdateStartDate()) == false)
            return false;
        if (other.getNodeUpdateEndDate() == null ^ this.getNodeUpdateEndDate() == null)
            return false;
        if (other.getNodeUpdateEndDate() != null
                && other.getNodeUpdateEndDate().equals(this.getNodeUpdateEndDate()) == false)
            return false;
        if (other.getNodeUpdateInitiatedBy() == null ^ this.getNodeUpdateInitiatedBy() == null)
            return false;
        if (other.getNodeUpdateInitiatedBy() != null
                && other.getNodeUpdateInitiatedBy().equals(this.getNodeUpdateInitiatedBy()) == false)
            return false;
        if (other.getNodeUpdateInitiatedDate() == null ^ this.getNodeUpdateInitiatedDate() == null)
            return false;
        if (other.getNodeUpdateInitiatedDate() != null
                && other.getNodeUpdateInitiatedDate().equals(this.getNodeUpdateInitiatedDate()) == false)
            return false;
        if (other.getNodeUpdateStatusModifiedDate() == null
                ^ this.getNodeUpdateStatusModifiedDate() == null)
            return false;
        if (other.getNodeUpdateStatusModifiedDate() != null
                && other.getNodeUpdateStatusModifiedDate().equals(
                        this.getNodeUpdateStatusModifiedDate()) == false)
            return false;
        return true;
    }
}
