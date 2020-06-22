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
 * Deletes a DB cluster snapshot. If the snapshot is being copied, the copy
 * operation is terminated.
 * </p>
 * <note>
 * <p>
 * The DB cluster snapshot must be in the <code>available</code> state to be
 * deleted.
 * </p>
 * </note>
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
public class DeleteDBClusterSnapshotRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the DB cluster snapshot to delete.
     * </p>
     * <p>
     * Constraints: Must be the name of an existing DB cluster snapshot in the
     * <code>available</code> state.
     * </p>
     */
    private String dBClusterSnapshotIdentifier;

    /**
     * <p>
     * The identifier of the DB cluster snapshot to delete.
     * </p>
     * <p>
     * Constraints: Must be the name of an existing DB cluster snapshot in the
     * <code>available</code> state.
     * </p>
     *
     * @return <p>
     *         The identifier of the DB cluster snapshot to delete.
     *         </p>
     *         <p>
     *         Constraints: Must be the name of an existing DB cluster snapshot
     *         in the <code>available</code> state.
     *         </p>
     */
    public String getDBClusterSnapshotIdentifier() {
        return dBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB cluster snapshot to delete.
     * </p>
     * <p>
     * Constraints: Must be the name of an existing DB cluster snapshot in the
     * <code>available</code> state.
     * </p>
     *
     * @param dBClusterSnapshotIdentifier <p>
     *            The identifier of the DB cluster snapshot to delete.
     *            </p>
     *            <p>
     *            Constraints: Must be the name of an existing DB cluster
     *            snapshot in the <code>available</code> state.
     *            </p>
     */
    public void setDBClusterSnapshotIdentifier(String dBClusterSnapshotIdentifier) {
        this.dBClusterSnapshotIdentifier = dBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB cluster snapshot to delete.
     * </p>
     * <p>
     * Constraints: Must be the name of an existing DB cluster snapshot in the
     * <code>available</code> state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterSnapshotIdentifier <p>
     *            The identifier of the DB cluster snapshot to delete.
     *            </p>
     *            <p>
     *            Constraints: Must be the name of an existing DB cluster
     *            snapshot in the <code>available</code> state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDBClusterSnapshotRequest withDBClusterSnapshotIdentifier(
            String dBClusterSnapshotIdentifier) {
        this.dBClusterSnapshotIdentifier = dBClusterSnapshotIdentifier;
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
        if (getDBClusterSnapshotIdentifier() != null)
            sb.append("DBClusterSnapshotIdentifier: " + getDBClusterSnapshotIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDBClusterSnapshotIdentifier() == null) ? 0
                        : getDBClusterSnapshotIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDBClusterSnapshotRequest == false)
            return false;
        DeleteDBClusterSnapshotRequest other = (DeleteDBClusterSnapshotRequest) obj;

        if (other.getDBClusterSnapshotIdentifier() == null
                ^ this.getDBClusterSnapshotIdentifier() == null)
            return false;
        if (other.getDBClusterSnapshotIdentifier() != null
                && other.getDBClusterSnapshotIdentifier().equals(
                        this.getDBClusterSnapshotIdentifier()) == false)
            return false;
        return true;
    }
}
