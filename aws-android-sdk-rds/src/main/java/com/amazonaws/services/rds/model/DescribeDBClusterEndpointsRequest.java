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
 * Returns information about endpoints for an Amazon Aurora DB cluster.
 * </p>
 * <note>
 * <p>
 * This action only applies to Aurora DB clusters.
 * </p>
 * </note>
 */
public class DescribeDBClusterEndpointsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The DB cluster identifier of the DB cluster associated with the endpoint.
     * This parameter is stored as a lowercase string.
     * </p>
     */
    private String dBClusterIdentifier;

    /**
     * <p>
     * The identifier of the endpoint to describe. This parameter is stored as a
     * lowercase string.
     * </p>
     */
    private String dBClusterEndpointIdentifier;

    /**
     * <p>
     * A set of name-value pairs that define which endpoints to include in the
     * output. The filters are specified as name-value pairs, in the format
     * <code>Name=<i>endpoint_type</i>,Values=<i>endpoint_type1</i>,<i>endpoint_type2</i>,...</code>. <code>Name</code> can be one of: <code>db-cluster-endpoint-type</code>,
     * <code>db-cluster-endpoint-custom-type</code>,
     * <code>db-cluster-endpoint-id</code>,
     * <code>db-cluster-endpoint-status</code>. <code>Values</code> for the
     * <code> db-cluster-endpoint-type</code> filter can be one or more of:
     * <code>reader</code>, <code>writer</code>, <code>custom</code>.
     * <code>Values</code> for the <code>db-cluster-endpoint-custom-type</code>
     * filter can be one or more of: <code>reader</code>, <code>any</code>.
     * <code>Values</code> for the <code>db-cluster-endpoint-status</code>
     * filter can be one or more of: <code>available</code>,
     * <code>creating</code>, <code>deleting</code>, <code>modifying</code>.
     * </p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so you can retrieve the
     * remaining results.
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
     * <code>DescribeDBClusterEndpoints</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The DB cluster identifier of the DB cluster associated with the endpoint.
     * This parameter is stored as a lowercase string.
     * </p>
     *
     * @return <p>
     *         The DB cluster identifier of the DB cluster associated with the
     *         endpoint. This parameter is stored as a lowercase string.
     *         </p>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier of the DB cluster associated with the endpoint.
     * This parameter is stored as a lowercase string.
     * </p>
     *
     * @param dBClusterIdentifier <p>
     *            The DB cluster identifier of the DB cluster associated with
     *            the endpoint. This parameter is stored as a lowercase string.
     *            </p>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier of the DB cluster associated with the endpoint.
     * This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterIdentifier <p>
     *            The DB cluster identifier of the DB cluster associated with
     *            the endpoint. This parameter is stored as a lowercase string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClusterEndpointsRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The identifier of the endpoint to describe. This parameter is stored as a
     * lowercase string.
     * </p>
     *
     * @return <p>
     *         The identifier of the endpoint to describe. This parameter is
     *         stored as a lowercase string.
     *         </p>
     */
    public String getDBClusterEndpointIdentifier() {
        return dBClusterEndpointIdentifier;
    }

    /**
     * <p>
     * The identifier of the endpoint to describe. This parameter is stored as a
     * lowercase string.
     * </p>
     *
     * @param dBClusterEndpointIdentifier <p>
     *            The identifier of the endpoint to describe. This parameter is
     *            stored as a lowercase string.
     *            </p>
     */
    public void setDBClusterEndpointIdentifier(String dBClusterEndpointIdentifier) {
        this.dBClusterEndpointIdentifier = dBClusterEndpointIdentifier;
    }

    /**
     * <p>
     * The identifier of the endpoint to describe. This parameter is stored as a
     * lowercase string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterEndpointIdentifier <p>
     *            The identifier of the endpoint to describe. This parameter is
     *            stored as a lowercase string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClusterEndpointsRequest withDBClusterEndpointIdentifier(
            String dBClusterEndpointIdentifier) {
        this.dBClusterEndpointIdentifier = dBClusterEndpointIdentifier;
        return this;
    }

    /**
     * <p>
     * A set of name-value pairs that define which endpoints to include in the
     * output. The filters are specified as name-value pairs, in the format
     * <code>Name=<i>endpoint_type</i>,Values=<i>endpoint_type1</i>,<i>endpoint_type2</i>,...</code>. <code>Name</code> can be one of: <code>db-cluster-endpoint-type</code>,
     * <code>db-cluster-endpoint-custom-type</code>,
     * <code>db-cluster-endpoint-id</code>,
     * <code>db-cluster-endpoint-status</code>. <code>Values</code> for the
     * <code> db-cluster-endpoint-type</code> filter can be one or more of:
     * <code>reader</code>, <code>writer</code>, <code>custom</code>.
     * <code>Values</code> for the <code>db-cluster-endpoint-custom-type</code>
     * filter can be one or more of: <code>reader</code>, <code>any</code>.
     * <code>Values</code> for the <code>db-cluster-endpoint-status</code>
     * filter can be one or more of: <code>available</code>,
     * <code>creating</code>, <code>deleting</code>, <code>modifying</code>.
     * </p>
     *
     * @return <p>
     *         A set of name-value pairs that define which endpoints to include
     *         in the output. The filters are specified as name-value pairs, in
     *         the format
     *         <code>Name=<i>endpoint_type</i>,Values=<i>endpoint_type1</i>,<i>endpoint_type2</i>,...</code>. <code>Name</code> can be one of:
     *         <code>db-cluster-endpoint-type</code>,
     *         <code>db-cluster-endpoint-custom-type</code>,
     *         <code>db-cluster-endpoint-id</code>,
     *         <code>db-cluster-endpoint-status</code>. <code>Values</code> for
     *         the <code> db-cluster-endpoint-type</code> filter can be one or
     *         more of: <code>reader</code>, <code>writer</code>,
     *         <code>custom</code>. <code>Values</code> for the
     *         <code>db-cluster-endpoint-custom-type</code> filter can be one or
     *         more of: <code>reader</code>, <code>any</code>.
     *         <code>Values</code> for the
     *         <code>db-cluster-endpoint-status</code> filter can be one or more
     *         of: <code>available</code>, <code>creating</code>,
     *         <code>deleting</code>, <code>modifying</code>.
     *         </p>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A set of name-value pairs that define which endpoints to include in the
     * output. The filters are specified as name-value pairs, in the format
     * <code>Name=<i>endpoint_type</i>,Values=<i>endpoint_type1</i>,<i>endpoint_type2</i>,...</code>. <code>Name</code> can be one of: <code>db-cluster-endpoint-type</code>,
     * <code>db-cluster-endpoint-custom-type</code>,
     * <code>db-cluster-endpoint-id</code>,
     * <code>db-cluster-endpoint-status</code>. <code>Values</code> for the
     * <code> db-cluster-endpoint-type</code> filter can be one or more of:
     * <code>reader</code>, <code>writer</code>, <code>custom</code>.
     * <code>Values</code> for the <code>db-cluster-endpoint-custom-type</code>
     * filter can be one or more of: <code>reader</code>, <code>any</code>.
     * <code>Values</code> for the <code>db-cluster-endpoint-status</code>
     * filter can be one or more of: <code>available</code>,
     * <code>creating</code>, <code>deleting</code>, <code>modifying</code>.
     * </p>
     *
     * @param filters <p>
     *            A set of name-value pairs that define which endpoints to
     *            include in the output. The filters are specified as name-value
     *            pairs, in the format
     *            <code>Name=<i>endpoint_type</i>,Values=<i>endpoint_type1</i>,<i>endpoint_type2</i>,...</code>. <code>Name</code> can be one of:
     *            <code>db-cluster-endpoint-type</code>,
     *            <code>db-cluster-endpoint-custom-type</code>,
     *            <code>db-cluster-endpoint-id</code>,
     *            <code>db-cluster-endpoint-status</code>. <code>Values</code>
     *            for the <code> db-cluster-endpoint-type</code> filter can be
     *            one or more of: <code>reader</code>, <code>writer</code>,
     *            <code>custom</code>. <code>Values</code> for the
     *            <code>db-cluster-endpoint-custom-type</code> filter can be one
     *            or more of: <code>reader</code>, <code>any</code>.
     *            <code>Values</code> for the
     *            <code>db-cluster-endpoint-status</code> filter can be one or
     *            more of: <code>available</code>, <code>creating</code>,
     *            <code>deleting</code>, <code>modifying</code>.
     *            </p>
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
     * A set of name-value pairs that define which endpoints to include in the
     * output. The filters are specified as name-value pairs, in the format
     * <code>Name=<i>endpoint_type</i>,Values=<i>endpoint_type1</i>,<i>endpoint_type2</i>,...</code>. <code>Name</code> can be one of: <code>db-cluster-endpoint-type</code>,
     * <code>db-cluster-endpoint-custom-type</code>,
     * <code>db-cluster-endpoint-id</code>,
     * <code>db-cluster-endpoint-status</code>. <code>Values</code> for the
     * <code> db-cluster-endpoint-type</code> filter can be one or more of:
     * <code>reader</code>, <code>writer</code>, <code>custom</code>.
     * <code>Values</code> for the <code>db-cluster-endpoint-custom-type</code>
     * filter can be one or more of: <code>reader</code>, <code>any</code>.
     * <code>Values</code> for the <code>db-cluster-endpoint-status</code>
     * filter can be one or more of: <code>available</code>,
     * <code>creating</code>, <code>deleting</code>, <code>modifying</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A set of name-value pairs that define which endpoints to
     *            include in the output. The filters are specified as name-value
     *            pairs, in the format
     *            <code>Name=<i>endpoint_type</i>,Values=<i>endpoint_type1</i>,<i>endpoint_type2</i>,...</code>. <code>Name</code> can be one of:
     *            <code>db-cluster-endpoint-type</code>,
     *            <code>db-cluster-endpoint-custom-type</code>,
     *            <code>db-cluster-endpoint-id</code>,
     *            <code>db-cluster-endpoint-status</code>. <code>Values</code>
     *            for the <code> db-cluster-endpoint-type</code> filter can be
     *            one or more of: <code>reader</code>, <code>writer</code>,
     *            <code>custom</code>. <code>Values</code> for the
     *            <code>db-cluster-endpoint-custom-type</code> filter can be one
     *            or more of: <code>reader</code>, <code>any</code>.
     *            <code>Values</code> for the
     *            <code>db-cluster-endpoint-status</code> filter can be one or
     *            more of: <code>available</code>, <code>creating</code>,
     *            <code>deleting</code>, <code>modifying</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClusterEndpointsRequest withFilters(Filter... filters) {
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
     * A set of name-value pairs that define which endpoints to include in the
     * output. The filters are specified as name-value pairs, in the format
     * <code>Name=<i>endpoint_type</i>,Values=<i>endpoint_type1</i>,<i>endpoint_type2</i>,...</code>. <code>Name</code> can be one of: <code>db-cluster-endpoint-type</code>,
     * <code>db-cluster-endpoint-custom-type</code>,
     * <code>db-cluster-endpoint-id</code>,
     * <code>db-cluster-endpoint-status</code>. <code>Values</code> for the
     * <code> db-cluster-endpoint-type</code> filter can be one or more of:
     * <code>reader</code>, <code>writer</code>, <code>custom</code>.
     * <code>Values</code> for the <code>db-cluster-endpoint-custom-type</code>
     * filter can be one or more of: <code>reader</code>, <code>any</code>.
     * <code>Values</code> for the <code>db-cluster-endpoint-status</code>
     * filter can be one or more of: <code>available</code>,
     * <code>creating</code>, <code>deleting</code>, <code>modifying</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A set of name-value pairs that define which endpoints to
     *            include in the output. The filters are specified as name-value
     *            pairs, in the format
     *            <code>Name=<i>endpoint_type</i>,Values=<i>endpoint_type1</i>,<i>endpoint_type2</i>,...</code>. <code>Name</code> can be one of:
     *            <code>db-cluster-endpoint-type</code>,
     *            <code>db-cluster-endpoint-custom-type</code>,
     *            <code>db-cluster-endpoint-id</code>,
     *            <code>db-cluster-endpoint-status</code>. <code>Values</code>
     *            for the <code> db-cluster-endpoint-type</code> filter can be
     *            one or more of: <code>reader</code>, <code>writer</code>,
     *            <code>custom</code>. <code>Values</code> for the
     *            <code>db-cluster-endpoint-custom-type</code> filter can be one
     *            or more of: <code>reader</code>, <code>any</code>.
     *            <code>Values</code> for the
     *            <code>db-cluster-endpoint-status</code> filter can be one or
     *            more of: <code>available</code>, <code>creating</code>,
     *            <code>deleting</code>, <code>modifying</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClusterEndpointsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so you can retrieve the
     * remaining results.
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
     *         you can retrieve the remaining results.
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
     * token called a marker is included in the response so you can retrieve the
     * remaining results.
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
     *            response so you can retrieve the remaining results.
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
     * token called a marker is included in the response so you can retrieve the
     * remaining results.
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
     *            response so you can retrieve the remaining results.
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
    public DescribeDBClusterEndpointsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

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
    public DescribeDBClusterEndpointsRequest withMarker(String marker) {
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
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getDBClusterEndpointIdentifier() != null)
            sb.append("DBClusterEndpointIdentifier: " + getDBClusterEndpointIdentifier() + ",");
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

        hashCode = prime * hashCode
                + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBClusterEndpointIdentifier() == null) ? 0
                        : getDBClusterEndpointIdentifier().hashCode());
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

        if (obj instanceof DescribeDBClusterEndpointsRequest == false)
            return false;
        DescribeDBClusterEndpointsRequest other = (DescribeDBClusterEndpointsRequest) obj;

        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getDBClusterEndpointIdentifier() == null
                ^ this.getDBClusterEndpointIdentifier() == null)
            return false;
        if (other.getDBClusterEndpointIdentifier() != null
                && other.getDBClusterEndpointIdentifier().equals(
                        this.getDBClusterEndpointIdentifier()) == false)
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
