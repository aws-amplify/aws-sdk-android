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
 * Global Datastore for Redis offers fully managed, fast, reliable and secure
 * cross-region replication. Using Global Datastore for Redis, you can create
 * cross-region read replica clusters for ElastiCache for Redis to enable
 * low-latency reads and disaster recovery across regions. For more information,
 * see <a href="/AmazonElastiCache/latest/red-ug/Redis-Global-Clusters.html">
 * Replication Across Regions Using Global Datastore</a>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * The <b>GlobalReplicationGroupIdSuffix</b> is the name of the Global
 * Datastore.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <b>PrimaryReplicationGroupId</b> represents the name of the primary
 * cluster that accepts writes and will replicate updates to the secondary
 * cluster.
 * </p>
 * </li>
 * </ul>
 */
public class CreateGlobalReplicationGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The suffix name of a Global Datastore. The suffix guarantees uniqueness
     * of the Global Datastore name across multiple regions.
     * </p>
     */
    private String globalReplicationGroupIdSuffix;

    /**
     * <p>
     * Provides details of the Global Datastore
     * </p>
     */
    private String globalReplicationGroupDescription;

    /**
     * <p>
     * The name of the primary cluster that accepts writes and will replicate
     * updates to the secondary cluster.
     * </p>
     */
    private String primaryReplicationGroupId;

    /**
     * <p>
     * The suffix name of a Global Datastore. The suffix guarantees uniqueness
     * of the Global Datastore name across multiple regions.
     * </p>
     *
     * @return <p>
     *         The suffix name of a Global Datastore. The suffix guarantees
     *         uniqueness of the Global Datastore name across multiple regions.
     *         </p>
     */
    public String getGlobalReplicationGroupIdSuffix() {
        return globalReplicationGroupIdSuffix;
    }

    /**
     * <p>
     * The suffix name of a Global Datastore. The suffix guarantees uniqueness
     * of the Global Datastore name across multiple regions.
     * </p>
     *
     * @param globalReplicationGroupIdSuffix <p>
     *            The suffix name of a Global Datastore. The suffix guarantees
     *            uniqueness of the Global Datastore name across multiple
     *            regions.
     *            </p>
     */
    public void setGlobalReplicationGroupIdSuffix(String globalReplicationGroupIdSuffix) {
        this.globalReplicationGroupIdSuffix = globalReplicationGroupIdSuffix;
    }

    /**
     * <p>
     * The suffix name of a Global Datastore. The suffix guarantees uniqueness
     * of the Global Datastore name across multiple regions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalReplicationGroupIdSuffix <p>
     *            The suffix name of a Global Datastore. The suffix guarantees
     *            uniqueness of the Global Datastore name across multiple
     *            regions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGlobalReplicationGroupRequest withGlobalReplicationGroupIdSuffix(
            String globalReplicationGroupIdSuffix) {
        this.globalReplicationGroupIdSuffix = globalReplicationGroupIdSuffix;
        return this;
    }

    /**
     * <p>
     * Provides details of the Global Datastore
     * </p>
     *
     * @return <p>
     *         Provides details of the Global Datastore
     *         </p>
     */
    public String getGlobalReplicationGroupDescription() {
        return globalReplicationGroupDescription;
    }

    /**
     * <p>
     * Provides details of the Global Datastore
     * </p>
     *
     * @param globalReplicationGroupDescription <p>
     *            Provides details of the Global Datastore
     *            </p>
     */
    public void setGlobalReplicationGroupDescription(String globalReplicationGroupDescription) {
        this.globalReplicationGroupDescription = globalReplicationGroupDescription;
    }

    /**
     * <p>
     * Provides details of the Global Datastore
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalReplicationGroupDescription <p>
     *            Provides details of the Global Datastore
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGlobalReplicationGroupRequest withGlobalReplicationGroupDescription(
            String globalReplicationGroupDescription) {
        this.globalReplicationGroupDescription = globalReplicationGroupDescription;
        return this;
    }

    /**
     * <p>
     * The name of the primary cluster that accepts writes and will replicate
     * updates to the secondary cluster.
     * </p>
     *
     * @return <p>
     *         The name of the primary cluster that accepts writes and will
     *         replicate updates to the secondary cluster.
     *         </p>
     */
    public String getPrimaryReplicationGroupId() {
        return primaryReplicationGroupId;
    }

    /**
     * <p>
     * The name of the primary cluster that accepts writes and will replicate
     * updates to the secondary cluster.
     * </p>
     *
     * @param primaryReplicationGroupId <p>
     *            The name of the primary cluster that accepts writes and will
     *            replicate updates to the secondary cluster.
     *            </p>
     */
    public void setPrimaryReplicationGroupId(String primaryReplicationGroupId) {
        this.primaryReplicationGroupId = primaryReplicationGroupId;
    }

    /**
     * <p>
     * The name of the primary cluster that accepts writes and will replicate
     * updates to the secondary cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param primaryReplicationGroupId <p>
     *            The name of the primary cluster that accepts writes and will
     *            replicate updates to the secondary cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGlobalReplicationGroupRequest withPrimaryReplicationGroupId(
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
        if (getGlobalReplicationGroupIdSuffix() != null)
            sb.append("GlobalReplicationGroupIdSuffix: " + getGlobalReplicationGroupIdSuffix()
                    + ",");
        if (getGlobalReplicationGroupDescription() != null)
            sb.append("GlobalReplicationGroupDescription: "
                    + getGlobalReplicationGroupDescription() + ",");
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
                + ((getGlobalReplicationGroupIdSuffix() == null) ? 0
                        : getGlobalReplicationGroupIdSuffix().hashCode());
        hashCode = prime
                * hashCode
                + ((getGlobalReplicationGroupDescription() == null) ? 0
                        : getGlobalReplicationGroupDescription().hashCode());
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

        if (obj instanceof CreateGlobalReplicationGroupRequest == false)
            return false;
        CreateGlobalReplicationGroupRequest other = (CreateGlobalReplicationGroupRequest) obj;

        if (other.getGlobalReplicationGroupIdSuffix() == null
                ^ this.getGlobalReplicationGroupIdSuffix() == null)
            return false;
        if (other.getGlobalReplicationGroupIdSuffix() != null
                && other.getGlobalReplicationGroupIdSuffix().equals(
                        this.getGlobalReplicationGroupIdSuffix()) == false)
            return false;
        if (other.getGlobalReplicationGroupDescription() == null
                ^ this.getGlobalReplicationGroupDescription() == null)
            return false;
        if (other.getGlobalReplicationGroupDescription() != null
                && other.getGlobalReplicationGroupDescription().equals(
                        this.getGlobalReplicationGroupDescription()) == false)
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
