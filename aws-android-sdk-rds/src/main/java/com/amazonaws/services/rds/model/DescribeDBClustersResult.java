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
 * Contains the result of a successful invocation of the
 * <code>DescribeDBClusters</code> action.
 * </p>
 */
public class DescribeDBClustersResult implements Serializable {
    /**
     * <p>
     * A pagination token that can be used in a later DescribeDBClusters
     * request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Contains a list of DB clusters for the user.
     * </p>
     */
    private java.util.List<DBCluster> dBClusters;

    /**
     * <p>
     * A pagination token that can be used in a later DescribeDBClusters
     * request.
     * </p>
     *
     * @return <p>
     *         A pagination token that can be used in a later DescribeDBClusters
     *         request.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a later DescribeDBClusters
     * request.
     * </p>
     *
     * @param marker <p>
     *            A pagination token that can be used in a later
     *            DescribeDBClusters request.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a later DescribeDBClusters
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            A pagination token that can be used in a later
     *            DescribeDBClusters request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClustersResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * Contains a list of DB clusters for the user.
     * </p>
     *
     * @return <p>
     *         Contains a list of DB clusters for the user.
     *         </p>
     */
    public java.util.List<DBCluster> getDBClusters() {
        return dBClusters;
    }

    /**
     * <p>
     * Contains a list of DB clusters for the user.
     * </p>
     *
     * @param dBClusters <p>
     *            Contains a list of DB clusters for the user.
     *            </p>
     */
    public void setDBClusters(java.util.Collection<DBCluster> dBClusters) {
        if (dBClusters == null) {
            this.dBClusters = null;
            return;
        }

        this.dBClusters = new java.util.ArrayList<DBCluster>(dBClusters);
    }

    /**
     * <p>
     * Contains a list of DB clusters for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusters <p>
     *            Contains a list of DB clusters for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClustersResult withDBClusters(DBCluster... dBClusters) {
        if (getDBClusters() == null) {
            this.dBClusters = new java.util.ArrayList<DBCluster>(dBClusters.length);
        }
        for (DBCluster value : dBClusters) {
            this.dBClusters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of DB clusters for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusters <p>
     *            Contains a list of DB clusters for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClustersResult withDBClusters(java.util.Collection<DBCluster> dBClusters) {
        setDBClusters(dBClusters);
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
        if (getDBClusters() != null)
            sb.append("DBClusters: " + getDBClusters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getDBClusters() == null) ? 0 : getDBClusters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBClustersResult == false)
            return false;
        DescribeDBClustersResult other = (DescribeDBClustersResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getDBClusters() == null ^ this.getDBClusters() == null)
            return false;
        if (other.getDBClusters() != null
                && other.getDBClusters().equals(this.getDBClusters()) == false)
            return false;
        return true;
    }
}
