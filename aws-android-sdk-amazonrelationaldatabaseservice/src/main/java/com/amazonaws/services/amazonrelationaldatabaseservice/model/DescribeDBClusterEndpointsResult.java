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

public class DescribeDBClusterEndpointsResult implements Serializable {
    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeDBClusterEndpoints</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Contains the details of the endpoints associated with the cluster and
     * matching any filter conditions.
     * </p>
     */
    private java.util.List<DBClusterEndpoint> dBClusterEndpoints;

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeDBClusterEndpoints</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @return <p>
     *         An optional pagination token provided by a previous
     *         <code>DescribeDBClusterEndpoints</code> request. If this
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
     * <code>DescribeDBClusterEndpoints</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            <code>DescribeDBClusterEndpoints</code> request. If this
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
     * <code>DescribeDBClusterEndpoints</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            <code>DescribeDBClusterEndpoints</code> request. If this
     *            parameter is specified, the response includes only records
     *            beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClusterEndpointsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * Contains the details of the endpoints associated with the cluster and
     * matching any filter conditions.
     * </p>
     *
     * @return <p>
     *         Contains the details of the endpoints associated with the cluster
     *         and matching any filter conditions.
     *         </p>
     */
    public java.util.List<DBClusterEndpoint> getDBClusterEndpoints() {
        return dBClusterEndpoints;
    }

    /**
     * <p>
     * Contains the details of the endpoints associated with the cluster and
     * matching any filter conditions.
     * </p>
     *
     * @param dBClusterEndpoints <p>
     *            Contains the details of the endpoints associated with the
     *            cluster and matching any filter conditions.
     *            </p>
     */
    public void setDBClusterEndpoints(java.util.Collection<DBClusterEndpoint> dBClusterEndpoints) {
        if (dBClusterEndpoints == null) {
            this.dBClusterEndpoints = null;
            return;
        }

        this.dBClusterEndpoints = new java.util.ArrayList<DBClusterEndpoint>(dBClusterEndpoints);
    }

    /**
     * <p>
     * Contains the details of the endpoints associated with the cluster and
     * matching any filter conditions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterEndpoints <p>
     *            Contains the details of the endpoints associated with the
     *            cluster and matching any filter conditions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClusterEndpointsResult withDBClusterEndpoints(
            DBClusterEndpoint... dBClusterEndpoints) {
        if (getDBClusterEndpoints() == null) {
            this.dBClusterEndpoints = new java.util.ArrayList<DBClusterEndpoint>(
                    dBClusterEndpoints.length);
        }
        for (DBClusterEndpoint value : dBClusterEndpoints) {
            this.dBClusterEndpoints.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains the details of the endpoints associated with the cluster and
     * matching any filter conditions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterEndpoints <p>
     *            Contains the details of the endpoints associated with the
     *            cluster and matching any filter conditions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClusterEndpointsResult withDBClusterEndpoints(
            java.util.Collection<DBClusterEndpoint> dBClusterEndpoints) {
        setDBClusterEndpoints(dBClusterEndpoints);
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
        if (getDBClusterEndpoints() != null)
            sb.append("DBClusterEndpoints: " + getDBClusterEndpoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getDBClusterEndpoints() == null) ? 0 : getDBClusterEndpoints().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBClusterEndpointsResult == false)
            return false;
        DescribeDBClusterEndpointsResult other = (DescribeDBClusterEndpointsResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getDBClusterEndpoints() == null ^ this.getDBClusterEndpoints() == null)
            return false;
        if (other.getDBClusterEndpoints() != null
                && other.getDBClusterEndpoints().equals(this.getDBClusterEndpoints()) == false)
            return false;
        return true;
    }
}
