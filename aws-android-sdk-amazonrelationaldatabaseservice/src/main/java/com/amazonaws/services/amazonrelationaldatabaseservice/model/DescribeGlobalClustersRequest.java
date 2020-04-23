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
 * Returns information about Aurora global database clusters. This API supports
 * pagination.
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
public class DescribeGlobalClustersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The user-supplied DB cluster identifier. If this parameter is specified,
     * information from only the specific DB cluster is returned. This parameter
     * isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match an existing DBClusterIdentifier.
     * </p>
     * </li>
     * </ul>
     */
    private String globalClusterIdentifier;

    /**
     * <p>
     * A filter that specifies one or more global DB clusters to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-id</code> - Accepts DB cluster identifiers and DB
     * cluster Amazon Resource Names (ARNs). The results list will only include
     * information about the DB clusters identified by these ARNs.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;

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
     * The user-supplied DB cluster identifier. If this parameter is specified,
     * information from only the specific DB cluster is returned. This parameter
     * isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match an existing DBClusterIdentifier.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The user-supplied DB cluster identifier. If this parameter is
     *         specified, information from only the specific DB cluster is
     *         returned. This parameter isn't case-sensitive.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match an existing DBClusterIdentifier.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getGlobalClusterIdentifier() {
        return globalClusterIdentifier;
    }

    /**
     * <p>
     * The user-supplied DB cluster identifier. If this parameter is specified,
     * information from only the specific DB cluster is returned. This parameter
     * isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match an existing DBClusterIdentifier.
     * </p>
     * </li>
     * </ul>
     *
     * @param globalClusterIdentifier <p>
     *            The user-supplied DB cluster identifier. If this parameter is
     *            specified, information from only the specific DB cluster is
     *            returned. This parameter isn't case-sensitive.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If supplied, must match an existing DBClusterIdentifier.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
    }

    /**
     * <p>
     * The user-supplied DB cluster identifier. If this parameter is specified,
     * information from only the specific DB cluster is returned. This parameter
     * isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match an existing DBClusterIdentifier.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalClusterIdentifier <p>
     *            The user-supplied DB cluster identifier. If this parameter is
     *            specified, information from only the specific DB cluster is
     *            returned. This parameter isn't case-sensitive.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If supplied, must match an existing DBClusterIdentifier.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGlobalClustersRequest withGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * A filter that specifies one or more global DB clusters to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-id</code> - Accepts DB cluster identifiers and DB
     * cluster Amazon Resource Names (ARNs). The results list will only include
     * information about the DB clusters identified by these ARNs.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A filter that specifies one or more global DB clusters to
     *         describe.
     *         </p>
     *         <p>
     *         Supported filters:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>db-cluster-id</code> - Accepts DB cluster identifiers and
     *         DB cluster Amazon Resource Names (ARNs). The results list will
     *         only include information about the DB clusters identified by
     *         these ARNs.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A filter that specifies one or more global DB clusters to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-id</code> - Accepts DB cluster identifiers and DB
     * cluster Amazon Resource Names (ARNs). The results list will only include
     * information about the DB clusters identified by these ARNs.
     * </p>
     * </li>
     * </ul>
     *
     * @param filters <p>
     *            A filter that specifies one or more global DB clusters to
     *            describe.
     *            </p>
     *            <p>
     *            Supported filters:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>db-cluster-id</code> - Accepts DB cluster identifiers
     *            and DB cluster Amazon Resource Names (ARNs). The results list
     *            will only include information about the DB clusters identified
     *            by these ARNs.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * A filter that specifies one or more global DB clusters to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-id</code> - Accepts DB cluster identifiers and DB
     * cluster Amazon Resource Names (ARNs). The results list will only include
     * information about the DB clusters identified by these ARNs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A filter that specifies one or more global DB clusters to
     *            describe.
     *            </p>
     *            <p>
     *            Supported filters:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>db-cluster-id</code> - Accepts DB cluster identifiers
     *            and DB cluster Amazon Resource Names (ARNs). The results list
     *            will only include information about the DB clusters identified
     *            by these ARNs.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGlobalClustersRequest withFilters(Filter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<Filter>(filters.length);
        }
        for (Filter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A filter that specifies one or more global DB clusters to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-id</code> - Accepts DB cluster identifiers and DB
     * cluster Amazon Resource Names (ARNs). The results list will only include
     * information about the DB clusters identified by these ARNs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A filter that specifies one or more global DB clusters to
     *            describe.
     *            </p>
     *            <p>
     *            Supported filters:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>db-cluster-id</code> - Accepts DB cluster identifiers
     *            and DB cluster Amazon Resource Names (ARNs). The results list
     *            will only include information about the DB clusters identified
     *            by these ARNs.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGlobalClustersRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     *
     * @return <p>
     *         The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so
     *         that you can retrieve the remaining results.
     *         </p>
     *         <p>
     *         Default: 100
     *         </p>
     *         <p>
     *         Constraints: Minimum 20, maximum 100.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response. If
     *            more records exist than the specified <code>MaxRecords</code>
     *            value, a pagination token called a marker is included in the
     *            response so that you can retrieve the remaining results.
     *            </p>
     *            <p>
     *            Default: 100
     *            </p>
     *            <p>
     *            Constraints: Minimum 20, maximum 100.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response. If
     *            more records exist than the specified <code>MaxRecords</code>
     *            value, a pagination token called a marker is included in the
     *            response so that you can retrieve the remaining results.
     *            </p>
     *            <p>
     *            Default: 100
     *            </p>
     *            <p>
     *            Constraints: Minimum 20, maximum 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGlobalClustersRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

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
    public DescribeGlobalClustersRequest withMarker(String marker) {
        this.marker = marker;
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
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
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
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGlobalClustersRequest == false)
            return false;
        DescribeGlobalClustersRequest other = (DescribeGlobalClustersRequest) obj;

        if (other.getGlobalClusterIdentifier() == null ^ this.getGlobalClusterIdentifier() == null)
            return false;
        if (other.getGlobalClusterIdentifier() != null
                && other.getGlobalClusterIdentifier().equals(this.getGlobalClusterIdentifier()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
