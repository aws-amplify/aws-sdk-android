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
 * Forces a failover for a DB cluster.
 * </p>
 * <p>
 * A failover for a DB cluster promotes one of the Aurora Replicas (read-only
 * instances) in the DB cluster to be the primary instance (the cluster writer).
 * </p>
 * <p>
 * Amazon Aurora will automatically fail over to an Aurora Replica, if one
 * exists, when the primary instance fails. You can force a failover when you
 * want to simulate a failure of a primary instance for testing. Because each
 * instance in a DB cluster has its own endpoint address, you will need to clean
 * up and re-establish any existing connections that use those endpoint
 * addresses when the failover is complete.
 * </p>
 * <p>
 * For more information on Amazon Aurora, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
 * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
 * </p>
 * <note>
 * <p>
 * This action only applies to Aurora DB clusters.
 * </p>
 * </note>
 */
public class FailoverDBClusterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A DB cluster identifier to force a failover for. This parameter isn't
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBCluster.
     * </p>
     * </li>
     * </ul>
     */
    private String dBClusterIdentifier;

    /**
     * <p>
     * The name of the instance to promote to the primary instance.
     * </p>
     * <p>
     * You must specify the instance identifier for an Aurora Replica in the DB
     * cluster. For example, <code>mydbcluster-replica1</code>.
     * </p>
     */
    private String targetDBInstanceIdentifier;

    /**
     * <p>
     * A DB cluster identifier to force a failover for. This parameter isn't
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBCluster.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A DB cluster identifier to force a failover for. This parameter
     *         isn't case-sensitive.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing DBCluster.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * <p>
     * A DB cluster identifier to force a failover for. This parameter isn't
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBCluster.
     * </p>
     * </li>
     * </ul>
     *
     * @param dBClusterIdentifier <p>
     *            A DB cluster identifier to force a failover for. This
     *            parameter isn't case-sensitive.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the identifier of an existing DBCluster.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * A DB cluster identifier to force a failover for. This parameter isn't
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBCluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterIdentifier <p>
     *            A DB cluster identifier to force a failover for. This
     *            parameter isn't case-sensitive.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the identifier of an existing DBCluster.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FailoverDBClusterRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The name of the instance to promote to the primary instance.
     * </p>
     * <p>
     * You must specify the instance identifier for an Aurora Replica in the DB
     * cluster. For example, <code>mydbcluster-replica1</code>.
     * </p>
     *
     * @return <p>
     *         The name of the instance to promote to the primary instance.
     *         </p>
     *         <p>
     *         You must specify the instance identifier for an Aurora Replica in
     *         the DB cluster. For example, <code>mydbcluster-replica1</code>.
     *         </p>
     */
    public String getTargetDBInstanceIdentifier() {
        return targetDBInstanceIdentifier;
    }

    /**
     * <p>
     * The name of the instance to promote to the primary instance.
     * </p>
     * <p>
     * You must specify the instance identifier for an Aurora Replica in the DB
     * cluster. For example, <code>mydbcluster-replica1</code>.
     * </p>
     *
     * @param targetDBInstanceIdentifier <p>
     *            The name of the instance to promote to the primary instance.
     *            </p>
     *            <p>
     *            You must specify the instance identifier for an Aurora Replica
     *            in the DB cluster. For example,
     *            <code>mydbcluster-replica1</code>.
     *            </p>
     */
    public void setTargetDBInstanceIdentifier(String targetDBInstanceIdentifier) {
        this.targetDBInstanceIdentifier = targetDBInstanceIdentifier;
    }

    /**
     * <p>
     * The name of the instance to promote to the primary instance.
     * </p>
     * <p>
     * You must specify the instance identifier for an Aurora Replica in the DB
     * cluster. For example, <code>mydbcluster-replica1</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetDBInstanceIdentifier <p>
     *            The name of the instance to promote to the primary instance.
     *            </p>
     *            <p>
     *            You must specify the instance identifier for an Aurora Replica
     *            in the DB cluster. For example,
     *            <code>mydbcluster-replica1</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FailoverDBClusterRequest withTargetDBInstanceIdentifier(String targetDBInstanceIdentifier) {
        this.targetDBInstanceIdentifier = targetDBInstanceIdentifier;
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
            sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getTargetDBInstanceIdentifier() != null)
            sb.append("TargetDBInstanceIdentifier: " + getTargetDBInstanceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetDBInstanceIdentifier() == null) ? 0 : getTargetDBInstanceIdentifier()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailoverDBClusterRequest == false)
            return false;
        FailoverDBClusterRequest other = (FailoverDBClusterRequest) obj;

        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getTargetDBInstanceIdentifier() == null
                ^ this.getTargetDBInstanceIdentifier() == null)
            return false;
        if (other.getTargetDBInstanceIdentifier() != null
                && other.getTargetDBInstanceIdentifier().equals(
                        this.getTargetDBInstanceIdentifier()) == false)
            return false;
        return true;
    }
}
