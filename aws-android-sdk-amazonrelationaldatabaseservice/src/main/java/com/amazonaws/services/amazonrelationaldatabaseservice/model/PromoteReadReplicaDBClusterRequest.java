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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Promotes a read replica DB cluster to a standalone DB cluster.
 * </p>
 * <note>
 * <p>
 * This action only applies to Aurora DB clusters.
 * </p>
 * </note>
 */
public class PromoteReadReplicaDBClusterRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier of the DB cluster read replica to promote. This parameter
     * isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DB cluster read replica.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster-replica1</code>
     * </p>
     */
    private String dBClusterIdentifier;

    /**
     * <p>
     * The identifier of the DB cluster read replica to promote. This parameter
     * isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DB cluster read replica.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster-replica1</code>
     * </p>
     *
     * @return <p>
     *         The identifier of the DB cluster read replica to promote. This
     *         parameter isn't case-sensitive.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing DB cluster read replica.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-cluster-replica1</code>
     *         </p>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB cluster read replica to promote. This parameter
     * isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DB cluster read replica.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster-replica1</code>
     * </p>
     *
     * @param dBClusterIdentifier <p>
     *            The identifier of the DB cluster read replica to promote. This
     *            parameter isn't case-sensitive.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the identifier of an existing DB cluster read
     *            replica.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>my-cluster-replica1</code>
     *            </p>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB cluster read replica to promote. This parameter
     * isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DB cluster read replica.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster-replica1</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterIdentifier <p>
     *            The identifier of the DB cluster read replica to promote. This
     *            parameter isn't case-sensitive.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the identifier of an existing DB cluster read
     *            replica.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>my-cluster-replica1</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PromoteReadReplicaDBClusterRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
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
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: " + getDBClusterIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PromoteReadReplicaDBClusterRequest == false)
            return false;
        PromoteReadReplicaDBClusterRequest other = (PromoteReadReplicaDBClusterRequest) obj;

        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        return true;
    }
}
