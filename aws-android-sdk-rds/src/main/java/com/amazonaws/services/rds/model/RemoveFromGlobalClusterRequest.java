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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Detaches an Aurora secondary cluster from an Aurora global database cluster.
 * The cluster becomes a standalone cluster with read-write capability instead
 * of being read-only and receiving data from a primary cluster in a different
 * region.
 * </p>
 * <note>
 * <p>
 * This action only applies to Aurora DB clusters.
 * </p>
 * </note>
 */
public class RemoveFromGlobalClusterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The cluster identifier to detach from the Aurora global database cluster.
     * </p>
     */
    private String globalClusterIdentifier;

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the cluster that was detached
     * from the Aurora global database cluster.
     * </p>
     */
    private String dbClusterIdentifier;

    /**
     * <p>
     * The cluster identifier to detach from the Aurora global database cluster.
     * </p>
     *
     * @return <p>
     *         The cluster identifier to detach from the Aurora global database
     *         cluster.
     *         </p>
     */
    public String getGlobalClusterIdentifier() {
        return globalClusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier to detach from the Aurora global database cluster.
     * </p>
     *
     * @param globalClusterIdentifier <p>
     *            The cluster identifier to detach from the Aurora global
     *            database cluster.
     *            </p>
     */
    public void setGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier to detach from the Aurora global database cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalClusterIdentifier <p>
     *            The cluster identifier to detach from the Aurora global
     *            database cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveFromGlobalClusterRequest withGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the cluster that was detached
     * from the Aurora global database cluster.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) identifying the cluster that was
     *         detached from the Aurora global database cluster.
     *         </p>
     */
    public String getDbClusterIdentifier() {
        return dbClusterIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the cluster that was detached
     * from the Aurora global database cluster.
     * </p>
     *
     * @param dbClusterIdentifier <p>
     *            The Amazon Resource Name (ARN) identifying the cluster that
     *            was detached from the Aurora global database cluster.
     *            </p>
     */
    public void setDbClusterIdentifier(String dbClusterIdentifier) {
        this.dbClusterIdentifier = dbClusterIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the cluster that was detached
     * from the Aurora global database cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dbClusterIdentifier <p>
     *            The Amazon Resource Name (ARN) identifying the cluster that
     *            was detached from the Aurora global database cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveFromGlobalClusterRequest withDbClusterIdentifier(String dbClusterIdentifier) {
        this.dbClusterIdentifier = dbClusterIdentifier;
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
        if (getGlobalClusterIdentifier() != null)
            sb.append("GlobalClusterIdentifier: " + getGlobalClusterIdentifier() + ",");
        if (getDbClusterIdentifier() != null)
            sb.append("DbClusterIdentifier: " + getDbClusterIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getGlobalClusterIdentifier() == null) ? 0 : getGlobalClusterIdentifier()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDbClusterIdentifier() == null) ? 0 : getDbClusterIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveFromGlobalClusterRequest == false)
            return false;
        RemoveFromGlobalClusterRequest other = (RemoveFromGlobalClusterRequest) obj;

        if (other.getGlobalClusterIdentifier() == null ^ this.getGlobalClusterIdentifier() == null)
            return false;
        if (other.getGlobalClusterIdentifier() != null
                && other.getGlobalClusterIdentifier().equals(this.getGlobalClusterIdentifier()) == false)
            return false;
        if (other.getDbClusterIdentifier() == null ^ this.getDbClusterIdentifier() == null)
            return false;
        if (other.getDbClusterIdentifier() != null
                && other.getDbClusterIdentifier().equals(this.getDbClusterIdentifier()) == false)
            return false;
        return true;
    }
}
