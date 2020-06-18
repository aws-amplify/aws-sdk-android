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

/**
 * <p>
 * Provides a list of DB cluster snapshots for the user as the result of a call
 * to the <code>DescribeDBClusterSnapshots</code> action.
 * </p>
 */
public class DescribeDBClusterSnapshotsResult implements Serializable {
    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeDBClusterSnapshots</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Provides a list of DB cluster snapshots for the user.
     * </p>
     */
    private java.util.List<DBClusterSnapshot> dBClusterSnapshots;

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeDBClusterSnapshots</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @return <p>
     *         An optional pagination token provided by a previous
     *         <code>DescribeDBClusterSnapshots</code> request. If this
     *         parameter is specified, the response includes only records beyond
     *         the marker, up to the value specified by <code>MaxRecords</code>.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeDBClusterSnapshots</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            <code>DescribeDBClusterSnapshots</code> request. If this
     *            parameter is specified, the response includes only records
     *            beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeDBClusterSnapshots</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            <code>DescribeDBClusterSnapshots</code> request. If this
     *            parameter is specified, the response includes only records
     *            beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClusterSnapshotsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * Provides a list of DB cluster snapshots for the user.
     * </p>
     *
     * @return <p>
     *         Provides a list of DB cluster snapshots for the user.
     *         </p>
     */
    public java.util.List<DBClusterSnapshot> getDBClusterSnapshots() {
        return dBClusterSnapshots;
    }

    /**
     * <p>
     * Provides a list of DB cluster snapshots for the user.
     * </p>
     *
     * @param dBClusterSnapshots <p>
     *            Provides a list of DB cluster snapshots for the user.
     *            </p>
     */
    public void setDBClusterSnapshots(java.util.Collection<DBClusterSnapshot> dBClusterSnapshots) {
        if (dBClusterSnapshots == null) {
            this.dBClusterSnapshots = null;
            return;
        }

        this.dBClusterSnapshots = new java.util.ArrayList<DBClusterSnapshot>(dBClusterSnapshots);
    }

    /**
     * <p>
     * Provides a list of DB cluster snapshots for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterSnapshots <p>
     *            Provides a list of DB cluster snapshots for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClusterSnapshotsResult withDBClusterSnapshots(
            DBClusterSnapshot... dBClusterSnapshots) {
        if (getDBClusterSnapshots() == null) {
            this.dBClusterSnapshots = new java.util.ArrayList<DBClusterSnapshot>(
                    dBClusterSnapshots.length);
        }
        for (DBClusterSnapshot value : dBClusterSnapshots) {
            this.dBClusterSnapshots.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Provides a list of DB cluster snapshots for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterSnapshots <p>
     *            Provides a list of DB cluster snapshots for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClusterSnapshotsResult withDBClusterSnapshots(
            java.util.Collection<DBClusterSnapshot> dBClusterSnapshots) {
        setDBClusterSnapshots(dBClusterSnapshots);
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
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getDBClusterSnapshots() != null)
            sb.append("DBClusterSnapshots: " + getDBClusterSnapshots());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getDBClusterSnapshots() == null) ? 0 : getDBClusterSnapshots().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBClusterSnapshotsResult == false)
            return false;
        DescribeDBClusterSnapshotsResult other = (DescribeDBClusterSnapshotsResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getDBClusterSnapshots() == null ^ this.getDBClusterSnapshots() == null)
            return false;
        if (other.getDBClusterSnapshots() != null
                && other.getDBClusterSnapshots().equals(this.getDBClusterSnapshots()) == false)
            return false;
        return true;
    }
}
