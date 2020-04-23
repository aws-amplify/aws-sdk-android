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
 * <note>
 * <p>
 * This is prerelease documentation for the RDS Database Proxy feature in
 * preview release. It is subject to change.
 * </p>
 * </note>
 * <p>
 * Returns information about DB proxy target groups, represented by
 * <code>DBProxyTargetGroup</code> data structures.
 * </p>
 */
public class DescribeDBProxyTargetGroupsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier of the <code>DBProxy</code> associated with the target
     * group.
     * </p>
     */
    private String dBProxyName;

    /**
     * <p>
     * The identifier of the <code>DBProxyTargetGroup</code> to describe.
     * </p>
     */
    private String targetGroupName;

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     */
    private java.util.List<Filter> filters;

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
     * <b>Constraints:</b><br/>
     * <b>Range: </b>20 - 100<br/>
     */
    private Integer maxRecords;

    /**
     * <p>
     * The identifier of the <code>DBProxy</code> associated with the target
     * group.
     * </p>
     *
     * @return <p>
     *         The identifier of the <code>DBProxy</code> associated with the
     *         target group.
     *         </p>
     */
    public String getDBProxyName() {
        return dBProxyName;
    }

    /**
     * <p>
     * The identifier of the <code>DBProxy</code> associated with the target
     * group.
     * </p>
     *
     * @param dBProxyName <p>
     *            The identifier of the <code>DBProxy</code> associated with the
     *            target group.
     *            </p>
     */
    public void setDBProxyName(String dBProxyName) {
        this.dBProxyName = dBProxyName;
    }

    /**
     * <p>
     * The identifier of the <code>DBProxy</code> associated with the target
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBProxyName <p>
     *            The identifier of the <code>DBProxy</code> associated with the
     *            target group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBProxyTargetGroupsRequest withDBProxyName(String dBProxyName) {
        this.dBProxyName = dBProxyName;
        return this;
    }

    /**
     * <p>
     * The identifier of the <code>DBProxyTargetGroup</code> to describe.
     * </p>
     *
     * @return <p>
     *         The identifier of the <code>DBProxyTargetGroup</code> to
     *         describe.
     *         </p>
     */
    public String getTargetGroupName() {
        return targetGroupName;
    }

    /**
     * <p>
     * The identifier of the <code>DBProxyTargetGroup</code> to describe.
     * </p>
     *
     * @param targetGroupName <p>
     *            The identifier of the <code>DBProxyTargetGroup</code> to
     *            describe.
     *            </p>
     */
    public void setTargetGroupName(String targetGroupName) {
        this.targetGroupName = targetGroupName;
    }

    /**
     * <p>
     * The identifier of the <code>DBProxyTargetGroup</code> to describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetGroupName <p>
     *            The identifier of the <code>DBProxyTargetGroup</code> to
     *            describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBProxyTargetGroupsRequest withTargetGroupName(String targetGroupName) {
        this.targetGroupName = targetGroupName;
        return this;
    }

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     *
     * @return <p>
     *         This parameter is not currently supported.
     *         </p>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     *
     * @param filters <p>
     *            This parameter is not currently supported.
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
     * This parameter is not currently supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            This parameter is not currently supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBProxyTargetGroupsRequest withFilters(Filter... filters) {
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
     * This parameter is not currently supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            This parameter is not currently supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBProxyTargetGroupsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
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
    public DescribeDBProxyTargetGroupsRequest withMarker(String marker) {
        this.marker = marker;
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>20 - 100<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>20 - 100<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>20 - 100<br/>
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
    public DescribeDBProxyTargetGroupsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
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
        if (getDBProxyName() != null)
            sb.append("DBProxyName: " + getDBProxyName() + ",");
        if (getTargetGroupName() != null)
            sb.append("TargetGroupName: " + getTargetGroupName() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBProxyName() == null) ? 0 : getDBProxyName().hashCode());
        hashCode = prime * hashCode
                + ((getTargetGroupName() == null) ? 0 : getTargetGroupName().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBProxyTargetGroupsRequest == false)
            return false;
        DescribeDBProxyTargetGroupsRequest other = (DescribeDBProxyTargetGroupsRequest) obj;

        if (other.getDBProxyName() == null ^ this.getDBProxyName() == null)
            return false;
        if (other.getDBProxyName() != null
                && other.getDBProxyName().equals(this.getDBProxyName()) == false)
            return false;
        if (other.getTargetGroupName() == null ^ this.getTargetGroupName() == null)
            return false;
        if (other.getTargetGroupName() != null
                && other.getTargetGroupName().equals(this.getTargetGroupName()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        return true;
    }
}
