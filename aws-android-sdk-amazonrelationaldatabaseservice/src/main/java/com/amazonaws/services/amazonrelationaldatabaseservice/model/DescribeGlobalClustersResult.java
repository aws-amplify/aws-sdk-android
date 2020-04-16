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

public class DescribeGlobalClustersResult implements Serializable {
    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeGlobalClusters</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The list of global clusters returned by this request.
     * </p>
     */
    private java.util.List<GlobalCluster> globalClusters;

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeGlobalClusters</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @return <p>
     *         An optional pagination token provided by a previous
     *         <code>DescribeGlobalClusters</code> request. If this parameter is
     *         specified, the response includes only records beyond the marker,
     *         up to the value specified by <code>MaxRecords</code>.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeGlobalClusters</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            <code>DescribeGlobalClusters</code> request. If this parameter
     *            is specified, the response includes only records beyond the
     *            marker, up to the value specified by <code>MaxRecords</code>.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeGlobalClusters</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            <code>DescribeGlobalClusters</code> request. If this parameter
     *            is specified, the response includes only records beyond the
     *            marker, up to the value specified by <code>MaxRecords</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGlobalClustersResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * The list of global clusters returned by this request.
     * </p>
     *
     * @return <p>
     *         The list of global clusters returned by this request.
     *         </p>
     */
    public java.util.List<GlobalCluster> getGlobalClusters() {
        return globalClusters;
    }

    /**
     * <p>
     * The list of global clusters returned by this request.
     * </p>
     *
     * @param globalClusters <p>
     *            The list of global clusters returned by this request.
     *            </p>
     */
    public void setGlobalClusters(java.util.Collection<GlobalCluster> globalClusters) {
        if (globalClusters == null) {
            this.globalClusters = null;
            return;
        }

        this.globalClusters = new java.util.ArrayList<GlobalCluster>(globalClusters);
    }

    /**
     * <p>
     * The list of global clusters returned by this request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalClusters <p>
     *            The list of global clusters returned by this request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGlobalClustersResult withGlobalClusters(GlobalCluster... globalClusters) {
        if (getGlobalClusters() == null) {
            this.globalClusters = new java.util.ArrayList<GlobalCluster>(globalClusters.length);
        }
        for (GlobalCluster value : globalClusters) {
            this.globalClusters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of global clusters returned by this request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalClusters <p>
     *            The list of global clusters returned by this request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGlobalClustersResult withGlobalClusters(
            java.util.Collection<GlobalCluster> globalClusters) {
        setGlobalClusters(globalClusters);
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
        if (getGlobalClusters() != null)
            sb.append("GlobalClusters: " + getGlobalClusters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getGlobalClusters() == null) ? 0 : getGlobalClusters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGlobalClustersResult == false)
            return false;
        DescribeGlobalClustersResult other = (DescribeGlobalClustersResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getGlobalClusters() == null ^ this.getGlobalClusters() == null)
            return false;
        if (other.getGlobalClusters() != null
                && other.getGlobalClusters().equals(this.getGlobalClusters()) == false)
            return false;
        return true;
    }
}
