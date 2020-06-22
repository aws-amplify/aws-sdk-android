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

public class CreateDBClusterSnapshotResult implements Serializable {
    /**
     * <p>
     * Contains the details for an Amazon RDS DB cluster snapshot
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBClusterSnapshots</code> action.
     * </p>
     */
    private DBClusterSnapshot dBClusterSnapshot;

    /**
     * <p>
     * Contains the details for an Amazon RDS DB cluster snapshot
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBClusterSnapshots</code> action.
     * </p>
     *
     * @return <p>
     *         Contains the details for an Amazon RDS DB cluster snapshot
     *         </p>
     *         <p>
     *         This data type is used as a response element in the
     *         <code>DescribeDBClusterSnapshots</code> action.
     *         </p>
     */
    public DBClusterSnapshot getDBClusterSnapshot() {
        return dBClusterSnapshot;
    }

    /**
     * <p>
     * Contains the details for an Amazon RDS DB cluster snapshot
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBClusterSnapshots</code> action.
     * </p>
     *
     * @param dBClusterSnapshot <p>
     *            Contains the details for an Amazon RDS DB cluster snapshot
     *            </p>
     *            <p>
     *            This data type is used as a response element in the
     *            <code>DescribeDBClusterSnapshots</code> action.
     *            </p>
     */
    public void setDBClusterSnapshot(DBClusterSnapshot dBClusterSnapshot) {
        this.dBClusterSnapshot = dBClusterSnapshot;
    }

    /**
     * <p>
     * Contains the details for an Amazon RDS DB cluster snapshot
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBClusterSnapshots</code> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterSnapshot <p>
     *            Contains the details for an Amazon RDS DB cluster snapshot
     *            </p>
     *            <p>
     *            This data type is used as a response element in the
     *            <code>DescribeDBClusterSnapshots</code> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterSnapshotResult withDBClusterSnapshot(DBClusterSnapshot dBClusterSnapshot) {
        this.dBClusterSnapshot = dBClusterSnapshot;
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
        if (getDBClusterSnapshot() != null)
            sb.append("DBClusterSnapshot: " + getDBClusterSnapshot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBClusterSnapshot() == null) ? 0 : getDBClusterSnapshot().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDBClusterSnapshotResult == false)
            return false;
        CreateDBClusterSnapshotResult other = (CreateDBClusterSnapshotResult) obj;

        if (other.getDBClusterSnapshot() == null ^ this.getDBClusterSnapshot() == null)
            return false;
        if (other.getDBClusterSnapshot() != null
                && other.getDBClusterSnapshot().equals(this.getDBClusterSnapshot()) == false)
            return false;
        return true;
    }
}
