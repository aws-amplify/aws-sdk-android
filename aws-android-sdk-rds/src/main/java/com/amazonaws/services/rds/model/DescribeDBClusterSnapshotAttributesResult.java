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

public class DescribeDBClusterSnapshotAttributesResult implements Serializable {
    /**
     * <p>
     * Contains the results of a successful call to the
     * <code>DescribeDBClusterSnapshotAttributes</code> API action.
     * </p>
     * <p>
     * Manual DB cluster snapshot attributes are used to authorize other AWS
     * accounts to copy or restore a manual DB cluster snapshot. For more
     * information, see the <code>ModifyDBClusterSnapshotAttribute</code> API
     * action.
     * </p>
     */
    private DBClusterSnapshotAttributesResult dBClusterSnapshotAttributesResult;

    /**
     * <p>
     * Contains the results of a successful call to the
     * <code>DescribeDBClusterSnapshotAttributes</code> API action.
     * </p>
     * <p>
     * Manual DB cluster snapshot attributes are used to authorize other AWS
     * accounts to copy or restore a manual DB cluster snapshot. For more
     * information, see the <code>ModifyDBClusterSnapshotAttribute</code> API
     * action.
     * </p>
     *
     * @return <p>
     *         Contains the results of a successful call to the
     *         <code>DescribeDBClusterSnapshotAttributes</code> API action.
     *         </p>
     *         <p>
     *         Manual DB cluster snapshot attributes are used to authorize other
     *         AWS accounts to copy or restore a manual DB cluster snapshot. For
     *         more information, see the
     *         <code>ModifyDBClusterSnapshotAttribute</code> API action.
     *         </p>
     */
    public DBClusterSnapshotAttributesResult getDBClusterSnapshotAttributesResult() {
        return dBClusterSnapshotAttributesResult;
    }

    /**
     * <p>
     * Contains the results of a successful call to the
     * <code>DescribeDBClusterSnapshotAttributes</code> API action.
     * </p>
     * <p>
     * Manual DB cluster snapshot attributes are used to authorize other AWS
     * accounts to copy or restore a manual DB cluster snapshot. For more
     * information, see the <code>ModifyDBClusterSnapshotAttribute</code> API
     * action.
     * </p>
     *
     * @param dBClusterSnapshotAttributesResult <p>
     *            Contains the results of a successful call to the
     *            <code>DescribeDBClusterSnapshotAttributes</code> API action.
     *            </p>
     *            <p>
     *            Manual DB cluster snapshot attributes are used to authorize
     *            other AWS accounts to copy or restore a manual DB cluster
     *            snapshot. For more information, see the
     *            <code>ModifyDBClusterSnapshotAttribute</code> API action.
     *            </p>
     */
    public void setDBClusterSnapshotAttributesResult(
            DBClusterSnapshotAttributesResult dBClusterSnapshotAttributesResult) {
        this.dBClusterSnapshotAttributesResult = dBClusterSnapshotAttributesResult;
    }

    /**
     * <p>
     * Contains the results of a successful call to the
     * <code>DescribeDBClusterSnapshotAttributes</code> API action.
     * </p>
     * <p>
     * Manual DB cluster snapshot attributes are used to authorize other AWS
     * accounts to copy or restore a manual DB cluster snapshot. For more
     * information, see the <code>ModifyDBClusterSnapshotAttribute</code> API
     * action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterSnapshotAttributesResult <p>
     *            Contains the results of a successful call to the
     *            <code>DescribeDBClusterSnapshotAttributes</code> API action.
     *            </p>
     *            <p>
     *            Manual DB cluster snapshot attributes are used to authorize
     *            other AWS accounts to copy or restore a manual DB cluster
     *            snapshot. For more information, see the
     *            <code>ModifyDBClusterSnapshotAttribute</code> API action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClusterSnapshotAttributesResult withDBClusterSnapshotAttributesResult(
            DBClusterSnapshotAttributesResult dBClusterSnapshotAttributesResult) {
        this.dBClusterSnapshotAttributesResult = dBClusterSnapshotAttributesResult;
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
        if (getDBClusterSnapshotAttributesResult() != null)
            sb.append("DBClusterSnapshotAttributesResult: "
                    + getDBClusterSnapshotAttributesResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDBClusterSnapshotAttributesResult() == null) ? 0
                        : getDBClusterSnapshotAttributesResult().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBClusterSnapshotAttributesResult == false)
            return false;
        DescribeDBClusterSnapshotAttributesResult other = (DescribeDBClusterSnapshotAttributesResult) obj;

        if (other.getDBClusterSnapshotAttributesResult() == null
                ^ this.getDBClusterSnapshotAttributesResult() == null)
            return false;
        if (other.getDBClusterSnapshotAttributesResult() != null
                && other.getDBClusterSnapshotAttributesResult().equals(
                        this.getDBClusterSnapshotAttributesResult()) == false)
            return false;
        return true;
    }
}
