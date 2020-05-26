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
 * Used to failover the primary region to a selected secondary region. The
 * selected secondary region will be come primary, and all other clusters will
 * become secondary.
 * </p>
 */
public class FailoverGlobalReplicationGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     */
    private String globalReplicationGroupId;

    /**
     * <p>
     * The AWS region of the primary cluster of the Global Datastore
     * </p>
     */
    private String primaryRegion;

    /**
     * <p>
     * The name of the primary replication group
     * </p>
     */
    private String primaryReplicationGroupId;

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
    public FailoverGlobalReplicationGroupRequest withGlobalReplicationGroupId(
            String globalReplicationGroupId) {
        this.globalReplicationGroupId = globalReplicationGroupId;
        return this;
    }

    /**
     * <p>
     * The AWS region of the primary cluster of the Global Datastore
     * </p>
     *
     * @return <p>
     *         The AWS region of the primary cluster of the Global Datastore
     *         </p>
     */
    public String getPrimaryRegion() {
        return primaryRegion;
    }

    /**
     * <p>
     * The AWS region of the primary cluster of the Global Datastore
     * </p>
     *
     * @param primaryRegion <p>
     *            The AWS region of the primary cluster of the Global Datastore
     *            </p>
     */
    public void setPrimaryRegion(String primaryRegion) {
        this.primaryRegion = primaryRegion;
    }

    /**
     * <p>
     * The AWS region of the primary cluster of the Global Datastore
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param primaryRegion <p>
     *            The AWS region of the primary cluster of the Global Datastore
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FailoverGlobalReplicationGroupRequest withPrimaryRegion(String primaryRegion) {
        this.primaryRegion = primaryRegion;
        return this;
    }

    /**
     * <p>
     * The name of the primary replication group
     * </p>
     *
     * @return <p>
     *         The name of the primary replication group
     *         </p>
     */
    public String getPrimaryReplicationGroupId() {
        return primaryReplicationGroupId;
    }

    /**
     * <p>
     * The name of the primary replication group
     * </p>
     *
     * @param primaryReplicationGroupId <p>
     *            The name of the primary replication group
     *            </p>
     */
    public void setPrimaryReplicationGroupId(String primaryReplicationGroupId) {
        this.primaryReplicationGroupId = primaryReplicationGroupId;
    }

    /**
     * <p>
     * The name of the primary replication group
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param primaryReplicationGroupId <p>
     *            The name of the primary replication group
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FailoverGlobalReplicationGroupRequest withPrimaryReplicationGroupId(
            String primaryReplicationGroupId) {
        this.primaryReplicationGroupId = primaryReplicationGroupId;
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
        if (getPrimaryRegion() != null)
            sb.append("PrimaryRegion: " + getPrimaryRegion() + ",");
        if (getPrimaryReplicationGroupId() != null)
            sb.append("PrimaryReplicationGroupId: " + getPrimaryReplicationGroupId());
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
                + ((getPrimaryRegion() == null) ? 0 : getPrimaryRegion().hashCode());
        hashCode = prime
                * hashCode
                + ((getPrimaryReplicationGroupId() == null) ? 0 : getPrimaryReplicationGroupId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailoverGlobalReplicationGroupRequest == false)
            return false;
        FailoverGlobalReplicationGroupRequest other = (FailoverGlobalReplicationGroupRequest) obj;

        if (other.getGlobalReplicationGroupId() == null
                ^ this.getGlobalReplicationGroupId() == null)
            return false;
        if (other.getGlobalReplicationGroupId() != null
                && other.getGlobalReplicationGroupId().equals(this.getGlobalReplicationGroupId()) == false)
            return false;
        if (other.getPrimaryRegion() == null ^ this.getPrimaryRegion() == null)
            return false;
        if (other.getPrimaryRegion() != null
                && other.getPrimaryRegion().equals(this.getPrimaryRegion()) == false)
            return false;
        if (other.getPrimaryReplicationGroupId() == null
                ^ this.getPrimaryReplicationGroupId() == null)
            return false;
        if (other.getPrimaryReplicationGroupId() != null
                && other.getPrimaryReplicationGroupId().equals(this.getPrimaryReplicationGroupId()) == false)
            return false;
        return true;
    }
}
