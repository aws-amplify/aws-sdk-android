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
 * Remove a secondary cluster from the Global Datastore using the Global
 * Datastore name. The secondary cluster will no longer receive updates from the
 * primary cluster, but will remain as a standalone cluster in that AWS region.
 * </p>
 */
public class DisassociateGlobalReplicationGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     */
    private String globalReplicationGroupId;

    /**
     * <p>
     * The name of the secondary cluster you wish to remove from the Global
     * Datastore
     * </p>
     */
    private String replicationGroupId;

    /**
     * <p>
     * The AWS region of secondary cluster you wish to remove from the Global
     * Datastore
     * </p>
     */
    private String replicationGroupRegion;

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
    public DisassociateGlobalReplicationGroupRequest withGlobalReplicationGroupId(
            String globalReplicationGroupId) {
        this.globalReplicationGroupId = globalReplicationGroupId;
        return this;
    }

    /**
     * <p>
     * The name of the secondary cluster you wish to remove from the Global
     * Datastore
     * </p>
     *
     * @return <p>
     *         The name of the secondary cluster you wish to remove from the
     *         Global Datastore
     *         </p>
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }

    /**
     * <p>
     * The name of the secondary cluster you wish to remove from the Global
     * Datastore
     * </p>
     *
     * @param replicationGroupId <p>
     *            The name of the secondary cluster you wish to remove from the
     *            Global Datastore
     *            </p>
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The name of the secondary cluster you wish to remove from the Global
     * Datastore
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupId <p>
     *            The name of the secondary cluster you wish to remove from the
     *            Global Datastore
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateGlobalReplicationGroupRequest withReplicationGroupId(
            String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
        return this;
    }

    /**
     * <p>
     * The AWS region of secondary cluster you wish to remove from the Global
     * Datastore
     * </p>
     *
     * @return <p>
     *         The AWS region of secondary cluster you wish to remove from the
     *         Global Datastore
     *         </p>
     */
    public String getReplicationGroupRegion() {
        return replicationGroupRegion;
    }

    /**
     * <p>
     * The AWS region of secondary cluster you wish to remove from the Global
     * Datastore
     * </p>
     *
     * @param replicationGroupRegion <p>
     *            The AWS region of secondary cluster you wish to remove from
     *            the Global Datastore
     *            </p>
     */
    public void setReplicationGroupRegion(String replicationGroupRegion) {
        this.replicationGroupRegion = replicationGroupRegion;
    }

    /**
     * <p>
     * The AWS region of secondary cluster you wish to remove from the Global
     * Datastore
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupRegion <p>
     *            The AWS region of secondary cluster you wish to remove from
     *            the Global Datastore
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateGlobalReplicationGroupRequest withReplicationGroupRegion(
            String replicationGroupRegion) {
        this.replicationGroupRegion = replicationGroupRegion;
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
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: " + getReplicationGroupId() + ",");
        if (getReplicationGroupRegion() != null)
            sb.append("ReplicationGroupRegion: " + getReplicationGroupRegion());
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
        hashCode = prime * hashCode
                + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationGroupRegion() == null) ? 0 : getReplicationGroupRegion()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateGlobalReplicationGroupRequest == false)
            return false;
        DisassociateGlobalReplicationGroupRequest other = (DisassociateGlobalReplicationGroupRequest) obj;

        if (other.getGlobalReplicationGroupId() == null
                ^ this.getGlobalReplicationGroupId() == null)
            return false;
        if (other.getGlobalReplicationGroupId() != null
                && other.getGlobalReplicationGroupId().equals(this.getGlobalReplicationGroupId()) == false)
            return false;
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null
                && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getReplicationGroupRegion() == null ^ this.getReplicationGroupRegion() == null)
            return false;
        if (other.getReplicationGroupRegion() != null
                && other.getReplicationGroupRegion().equals(this.getReplicationGroupRegion()) == false)
            return false;
        return true;
    }
}
