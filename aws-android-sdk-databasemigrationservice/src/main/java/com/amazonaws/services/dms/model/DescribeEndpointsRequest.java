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

package com.amazonaws.services.dms.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns information about the endpoints for your account in the current
 * region.
 * </p>
 */
public class DescribeEndpointsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Filters applied to the describe action.
     * </p>
     * <p>
     * Valid filter names: endpoint-arn | endpoint-type | endpoint-id |
     * engine-name
     * </p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that the remaining
     * results can be retrieved.
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
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Filters applied to the describe action.
     * </p>
     * <p>
     * Valid filter names: endpoint-arn | endpoint-type | endpoint-id |
     * engine-name
     * </p>
     *
     * @return <p>
     *         Filters applied to the describe action.
     *         </p>
     *         <p>
     *         Valid filter names: endpoint-arn | endpoint-type | endpoint-id |
     *         engine-name
     *         </p>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Filters applied to the describe action.
     * </p>
     * <p>
     * Valid filter names: endpoint-arn | endpoint-type | endpoint-id |
     * engine-name
     * </p>
     *
     * @param filters <p>
     *            Filters applied to the describe action.
     *            </p>
     *            <p>
     *            Valid filter names: endpoint-arn | endpoint-type | endpoint-id
     *            | engine-name
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
     * Filters applied to the describe action.
     * </p>
     * <p>
     * Valid filter names: endpoint-arn | endpoint-type | endpoint-id |
     * engine-name
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Filters applied to the describe action.
     *            </p>
     *            <p>
     *            Valid filter names: endpoint-arn | endpoint-type | endpoint-id
     *            | engine-name
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointsRequest withFilters(Filter... filters) {
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
     * Filters applied to the describe action.
     * </p>
     * <p>
     * Valid filter names: endpoint-arn | endpoint-type | endpoint-id |
     * engine-name
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Filters applied to the describe action.
     *            </p>
     *            <p>
     *            Valid filter names: endpoint-arn | endpoint-type | endpoint-id
     *            | engine-name
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that the remaining
     * results can be retrieved.
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
     *         that the remaining results can be retrieved.
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
     * token called a marker is included in the response so that the remaining
     * results can be retrieved.
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
     *            response so that the remaining results can be retrieved.
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
     * token called a marker is included in the response so that the remaining
     * results can be retrieved.
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
     *            response so that the remaining results can be retrieved.
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
    public DescribeEndpointsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @return <p>
     *         An optional pagination token provided by a previous request. If
     *         this parameter is specified, the response includes only records
     *         beyond the marker, up to the value specified by
     *         <code>MaxRecords</code>.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous request.
     *            If this parameter is specified, the response includes only
     *            records beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous request.
     *            If this parameter is specified, the response includes only
     *            records beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointsRequest withMarker(String marker) {
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

        if (obj instanceof DescribeEndpointsRequest == false)
            return false;
        DescribeEndpointsRequest other = (DescribeEndpointsRequest) obj;

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
