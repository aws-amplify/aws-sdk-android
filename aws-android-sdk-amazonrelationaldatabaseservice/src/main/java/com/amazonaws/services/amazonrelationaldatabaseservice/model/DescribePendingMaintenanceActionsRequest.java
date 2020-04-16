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
 * Returns a list of resources (for example, DB instances) that have at least
 * one pending maintenance action.
 * </p>
 */
public class DescribePendingMaintenanceActionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ARN of a resource to return pending maintenance actions for.
     * </p>
     */
    private String resourceIdentifier;

    /**
     * <p>
     * A filter that specifies one or more resources to return pending
     * maintenance actions for.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-id</code> - Accepts DB cluster identifiers and DB
     * cluster Amazon Resource Names (ARNs). The results list will only include
     * pending maintenance actions for the DB clusters identified by these ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and DB
     * instance ARNs. The results list will only include pending maintenance
     * actions for the DB instances identified by these ARNs.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribePendingMaintenanceActions</code> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to
     * a number of records specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

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
     * The ARN of a resource to return pending maintenance actions for.
     * </p>
     *
     * @return <p>
     *         The ARN of a resource to return pending maintenance actions for.
     *         </p>
     */
    public String getResourceIdentifier() {
        return resourceIdentifier;
    }

    /**
     * <p>
     * The ARN of a resource to return pending maintenance actions for.
     * </p>
     *
     * @param resourceIdentifier <p>
     *            The ARN of a resource to return pending maintenance actions
     *            for.
     *            </p>
     */
    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * The ARN of a resource to return pending maintenance actions for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceIdentifier <p>
     *            The ARN of a resource to return pending maintenance actions
     *            for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePendingMaintenanceActionsRequest withResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
        return this;
    }

    /**
     * <p>
     * A filter that specifies one or more resources to return pending
     * maintenance actions for.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-id</code> - Accepts DB cluster identifiers and DB
     * cluster Amazon Resource Names (ARNs). The results list will only include
     * pending maintenance actions for the DB clusters identified by these ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and DB
     * instance ARNs. The results list will only include pending maintenance
     * actions for the DB instances identified by these ARNs.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A filter that specifies one or more resources to return pending
     *         maintenance actions for.
     *         </p>
     *         <p>
     *         Supported filters:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>db-cluster-id</code> - Accepts DB cluster identifiers and
     *         DB cluster Amazon Resource Names (ARNs). The results list will
     *         only include pending maintenance actions for the DB clusters
     *         identified by these ARNs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>db-instance-id</code> - Accepts DB instance identifiers and
     *         DB instance ARNs. The results list will only include pending
     *         maintenance actions for the DB instances identified by these
     *         ARNs.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A filter that specifies one or more resources to return pending
     * maintenance actions for.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-id</code> - Accepts DB cluster identifiers and DB
     * cluster Amazon Resource Names (ARNs). The results list will only include
     * pending maintenance actions for the DB clusters identified by these ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and DB
     * instance ARNs. The results list will only include pending maintenance
     * actions for the DB instances identified by these ARNs.
     * </p>
     * </li>
     * </ul>
     *
     * @param filters <p>
     *            A filter that specifies one or more resources to return
     *            pending maintenance actions for.
     *            </p>
     *            <p>
     *            Supported filters:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>db-cluster-id</code> - Accepts DB cluster identifiers
     *            and DB cluster Amazon Resource Names (ARNs). The results list
     *            will only include pending maintenance actions for the DB
     *            clusters identified by these ARNs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>db-instance-id</code> - Accepts DB instance identifiers
     *            and DB instance ARNs. The results list will only include
     *            pending maintenance actions for the DB instances identified by
     *            these ARNs.
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
     * A filter that specifies one or more resources to return pending
     * maintenance actions for.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-id</code> - Accepts DB cluster identifiers and DB
     * cluster Amazon Resource Names (ARNs). The results list will only include
     * pending maintenance actions for the DB clusters identified by these ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and DB
     * instance ARNs. The results list will only include pending maintenance
     * actions for the DB instances identified by these ARNs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A filter that specifies one or more resources to return
     *            pending maintenance actions for.
     *            </p>
     *            <p>
     *            Supported filters:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>db-cluster-id</code> - Accepts DB cluster identifiers
     *            and DB cluster Amazon Resource Names (ARNs). The results list
     *            will only include pending maintenance actions for the DB
     *            clusters identified by these ARNs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>db-instance-id</code> - Accepts DB instance identifiers
     *            and DB instance ARNs. The results list will only include
     *            pending maintenance actions for the DB instances identified by
     *            these ARNs.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePendingMaintenanceActionsRequest withFilters(Filter... filters) {
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
     * A filter that specifies one or more resources to return pending
     * maintenance actions for.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-id</code> - Accepts DB cluster identifiers and DB
     * cluster Amazon Resource Names (ARNs). The results list will only include
     * pending maintenance actions for the DB clusters identified by these ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and DB
     * instance ARNs. The results list will only include pending maintenance
     * actions for the DB instances identified by these ARNs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A filter that specifies one or more resources to return
     *            pending maintenance actions for.
     *            </p>
     *            <p>
     *            Supported filters:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>db-cluster-id</code> - Accepts DB cluster identifiers
     *            and DB cluster Amazon Resource Names (ARNs). The results list
     *            will only include pending maintenance actions for the DB
     *            clusters identified by these ARNs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>db-instance-id</code> - Accepts DB instance identifiers
     *            and DB instance ARNs. The results list will only include
     *            pending maintenance actions for the DB instances identified by
     *            these ARNs.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePendingMaintenanceActionsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribePendingMaintenanceActions</code> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to
     * a number of records specified by <code>MaxRecords</code>.
     * </p>
     *
     * @return <p>
     *         An optional pagination token provided by a previous
     *         <code>DescribePendingMaintenanceActions</code> request. If this
     *         parameter is specified, the response includes only records beyond
     *         the marker, up to a number of records specified by
     *         <code>MaxRecords</code>.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribePendingMaintenanceActions</code> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to
     * a number of records specified by <code>MaxRecords</code>.
     * </p>
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            <code>DescribePendingMaintenanceActions</code> request. If
     *            this parameter is specified, the response includes only
     *            records beyond the marker, up to a number of records specified
     *            by <code>MaxRecords</code>.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribePendingMaintenanceActions</code> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to
     * a number of records specified by <code>MaxRecords</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            <code>DescribePendingMaintenanceActions</code> request. If
     *            this parameter is specified, the response includes only
     *            records beyond the marker, up to a number of records specified
     *            by <code>MaxRecords</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePendingMaintenanceActionsRequest withMarker(String marker) {
        this.marker = marker;
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
    public DescribePendingMaintenanceActionsRequest withMaxRecords(Integer maxRecords) {
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
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: " + getResourceIdentifier() + ",");
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
                + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
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

        if (obj instanceof DescribePendingMaintenanceActionsRequest == false)
            return false;
        DescribePendingMaintenanceActionsRequest other = (DescribePendingMaintenanceActionsRequest) obj;

        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null
                && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
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
