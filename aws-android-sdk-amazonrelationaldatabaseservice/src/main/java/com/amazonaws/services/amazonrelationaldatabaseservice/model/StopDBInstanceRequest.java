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
 * Stops an Amazon RDS DB instance. When you stop a DB instance, Amazon RDS
 * retains the DB instance's metadata, including its endpoint, DB parameter
 * group, and option group membership. Amazon RDS also retains the transaction
 * logs so you can do a point-in-time restore if necessary.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_StopInstance.html"
 * > Stopping an Amazon RDS DB Instance Temporarily</a> in the <i>Amazon RDS
 * User Guide.</i>
 * </p>
 * <note>
 * <p>
 * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora
 * clusters, use <code>StopDBCluster</code> instead.
 * </p>
 * </note>
 */
public class StopDBInstanceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The user-supplied instance identifier.
     * </p>
     */
    private String dBInstanceIdentifier;

    /**
     * <p>
     * The user-supplied instance identifier of the DB Snapshot created
     * immediately before the DB instance is stopped.
     * </p>
     */
    private String dBSnapshotIdentifier;

    /**
     * <p>
     * The user-supplied instance identifier.
     * </p>
     *
     * @return <p>
     *         The user-supplied instance identifier.
     *         </p>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }

    /**
     * <p>
     * The user-supplied instance identifier.
     * </p>
     *
     * @param dBInstanceIdentifier <p>
     *            The user-supplied instance identifier.
     *            </p>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The user-supplied instance identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceIdentifier <p>
     *            The user-supplied instance identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * <p>
     * The user-supplied instance identifier of the DB Snapshot created
     * immediately before the DB instance is stopped.
     * </p>
     *
     * @return <p>
     *         The user-supplied instance identifier of the DB Snapshot created
     *         immediately before the DB instance is stopped.
     *         </p>
     */
    public String getDBSnapshotIdentifier() {
        return dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The user-supplied instance identifier of the DB Snapshot created
     * immediately before the DB instance is stopped.
     * </p>
     *
     * @param dBSnapshotIdentifier <p>
     *            The user-supplied instance identifier of the DB Snapshot
     *            created immediately before the DB instance is stopped.
     *            </p>
     */
    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The user-supplied instance identifier of the DB Snapshot created
     * immediately before the DB instance is stopped.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSnapshotIdentifier <p>
     *            The user-supplied instance identifier of the DB Snapshot
     *            created immediately before the DB instance is stopped.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopDBInstanceRequest withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
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
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
        if (getDBSnapshotIdentifier() != null)
            sb.append("DBSnapshotIdentifier: " + getDBSnapshotIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getDBSnapshotIdentifier() == null) ? 0 : getDBSnapshotIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopDBInstanceRequest == false)
            return false;
        StopDBInstanceRequest other = (StopDBInstanceRequest) obj;

        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null
                && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getDBSnapshotIdentifier() == null ^ this.getDBSnapshotIdentifier() == null)
            return false;
        if (other.getDBSnapshotIdentifier() != null
                && other.getDBSnapshotIdentifier().equals(this.getDBSnapshotIdentifier()) == false)
            return false;
        return true;
    }
}
