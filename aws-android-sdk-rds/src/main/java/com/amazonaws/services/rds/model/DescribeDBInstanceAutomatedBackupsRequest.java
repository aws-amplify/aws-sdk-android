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
 * Displays backups for both current and deleted instances. For example, use
 * this operation to find details about automated backups for previously deleted
 * instances. Current instances with retention periods greater than zero (0) are
 * returned for both the <code>DescribeDBInstanceAutomatedBackups</code> and
 * <code>DescribeDBInstances</code> operations.
 * </p>
 * <p>
 * All parameters are optional.
 * </p>
 */
public class DescribeDBInstanceAutomatedBackupsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The resource ID of the DB instance that is the source of the automated
     * backup. This parameter isn't case-sensitive.
     * </p>
     */
    private String dbiResourceId;

    /**
     * <p>
     * (Optional) The user-supplied instance identifier. If this parameter is
     * specified, it must match the identifier of an existing DB instance. It
     * returns information from the specific DB instance' automated backup. This
     * parameter isn't case-sensitive.
     * </p>
     */
    private String dBInstanceIdentifier;

    /**
     * <p>
     * A filter that specifies which resources to return based on status.
     * </p>
     * <p>
     * Supported filters are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>status</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - automated backups for current instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>retained</code> - automated backups for deleted instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code> - automated backups that are waiting for the first
     * automated snapshot to be available
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and Amazon
     * Resource Names (ARNs) for DB instances. The results list includes only
     * information about the DB instance automated backupss identified by these
     * ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - Accepts DB instance resource identifiers
     * and DB Amazon Resource Names (ARNs) for DB instances. The results list
     * includes only information about the DB instance resources identified by
     * these ARNs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns all resources by default. The status for each resource is
     * specified in the response.
     * </p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * The pagination token provided in the previous request. If this parameter
     * is specified the response includes only records beyond the marker, up to
     * <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The resource ID of the DB instance that is the source of the automated
     * backup. This parameter isn't case-sensitive.
     * </p>
     *
     * @return <p>
     *         The resource ID of the DB instance that is the source of the
     *         automated backup. This parameter isn't case-sensitive.
     *         </p>
     */
    public String getDbiResourceId() {
        return dbiResourceId;
    }

    /**
     * <p>
     * The resource ID of the DB instance that is the source of the automated
     * backup. This parameter isn't case-sensitive.
     * </p>
     *
     * @param dbiResourceId <p>
     *            The resource ID of the DB instance that is the source of the
     *            automated backup. This parameter isn't case-sensitive.
     *            </p>
     */
    public void setDbiResourceId(String dbiResourceId) {
        this.dbiResourceId = dbiResourceId;
    }

    /**
     * <p>
     * The resource ID of the DB instance that is the source of the automated
     * backup. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dbiResourceId <p>
     *            The resource ID of the DB instance that is the source of the
     *            automated backup. This parameter isn't case-sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBInstanceAutomatedBackupsRequest withDbiResourceId(String dbiResourceId) {
        this.dbiResourceId = dbiResourceId;
        return this;
    }

    /**
     * <p>
     * (Optional) The user-supplied instance identifier. If this parameter is
     * specified, it must match the identifier of an existing DB instance. It
     * returns information from the specific DB instance' automated backup. This
     * parameter isn't case-sensitive.
     * </p>
     *
     * @return <p>
     *         (Optional) The user-supplied instance identifier. If this
     *         parameter is specified, it must match the identifier of an
     *         existing DB instance. It returns information from the specific DB
     *         instance' automated backup. This parameter isn't case-sensitive.
     *         </p>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }

    /**
     * <p>
     * (Optional) The user-supplied instance identifier. If this parameter is
     * specified, it must match the identifier of an existing DB instance. It
     * returns information from the specific DB instance' automated backup. This
     * parameter isn't case-sensitive.
     * </p>
     *
     * @param dBInstanceIdentifier <p>
     *            (Optional) The user-supplied instance identifier. If this
     *            parameter is specified, it must match the identifier of an
     *            existing DB instance. It returns information from the specific
     *            DB instance' automated backup. This parameter isn't
     *            case-sensitive.
     *            </p>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * (Optional) The user-supplied instance identifier. If this parameter is
     * specified, it must match the identifier of an existing DB instance. It
     * returns information from the specific DB instance' automated backup. This
     * parameter isn't case-sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceIdentifier <p>
     *            (Optional) The user-supplied instance identifier. If this
     *            parameter is specified, it must match the identifier of an
     *            existing DB instance. It returns information from the specific
     *            DB instance' automated backup. This parameter isn't
     *            case-sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBInstanceAutomatedBackupsRequest withDBInstanceIdentifier(
            String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * <p>
     * A filter that specifies which resources to return based on status.
     * </p>
     * <p>
     * Supported filters are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>status</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - automated backups for current instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>retained</code> - automated backups for deleted instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code> - automated backups that are waiting for the first
     * automated snapshot to be available
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and Amazon
     * Resource Names (ARNs) for DB instances. The results list includes only
     * information about the DB instance automated backupss identified by these
     * ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - Accepts DB instance resource identifiers
     * and DB Amazon Resource Names (ARNs) for DB instances. The results list
     * includes only information about the DB instance resources identified by
     * these ARNs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns all resources by default. The status for each resource is
     * specified in the response.
     * </p>
     *
     * @return <p>
     *         A filter that specifies which resources to return based on
     *         status.
     *         </p>
     *         <p>
     *         Supported filters are the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>status</code>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>active</code> - automated backups for current instances
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>retained</code> - automated backups for deleted instances
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>creating</code> - automated backups that are waiting for
     *         the first automated snapshot to be available
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>db-instance-id</code> - Accepts DB instance identifiers and
     *         Amazon Resource Names (ARNs) for DB instances. The results list
     *         includes only information about the DB instance automated
     *         backupss identified by these ARNs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dbi-resource-id</code> - Accepts DB instance resource
     *         identifiers and DB Amazon Resource Names (ARNs) for DB instances.
     *         The results list includes only information about the DB instance
     *         resources identified by these ARNs.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Returns all resources by default. The status for each resource is
     *         specified in the response.
     *         </p>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A filter that specifies which resources to return based on status.
     * </p>
     * <p>
     * Supported filters are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>status</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - automated backups for current instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>retained</code> - automated backups for deleted instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code> - automated backups that are waiting for the first
     * automated snapshot to be available
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and Amazon
     * Resource Names (ARNs) for DB instances. The results list includes only
     * information about the DB instance automated backupss identified by these
     * ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - Accepts DB instance resource identifiers
     * and DB Amazon Resource Names (ARNs) for DB instances. The results list
     * includes only information about the DB instance resources identified by
     * these ARNs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns all resources by default. The status for each resource is
     * specified in the response.
     * </p>
     *
     * @param filters <p>
     *            A filter that specifies which resources to return based on
     *            status.
     *            </p>
     *            <p>
     *            Supported filters are the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>status</code>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>active</code> - automated backups for current instances
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>retained</code> - automated backups for deleted
     *            instances
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>creating</code> - automated backups that are waiting for
     *            the first automated snapshot to be available
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>db-instance-id</code> - Accepts DB instance identifiers
     *            and Amazon Resource Names (ARNs) for DB instances. The results
     *            list includes only information about the DB instance automated
     *            backupss identified by these ARNs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dbi-resource-id</code> - Accepts DB instance resource
     *            identifiers and DB Amazon Resource Names (ARNs) for DB
     *            instances. The results list includes only information about
     *            the DB instance resources identified by these ARNs.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Returns all resources by default. The status for each resource
     *            is specified in the response.
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
     * A filter that specifies which resources to return based on status.
     * </p>
     * <p>
     * Supported filters are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>status</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - automated backups for current instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>retained</code> - automated backups for deleted instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code> - automated backups that are waiting for the first
     * automated snapshot to be available
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and Amazon
     * Resource Names (ARNs) for DB instances. The results list includes only
     * information about the DB instance automated backupss identified by these
     * ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - Accepts DB instance resource identifiers
     * and DB Amazon Resource Names (ARNs) for DB instances. The results list
     * includes only information about the DB instance resources identified by
     * these ARNs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns all resources by default. The status for each resource is
     * specified in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A filter that specifies which resources to return based on
     *            status.
     *            </p>
     *            <p>
     *            Supported filters are the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>status</code>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>active</code> - automated backups for current instances
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>retained</code> - automated backups for deleted
     *            instances
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>creating</code> - automated backups that are waiting for
     *            the first automated snapshot to be available
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>db-instance-id</code> - Accepts DB instance identifiers
     *            and Amazon Resource Names (ARNs) for DB instances. The results
     *            list includes only information about the DB instance automated
     *            backupss identified by these ARNs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dbi-resource-id</code> - Accepts DB instance resource
     *            identifiers and DB Amazon Resource Names (ARNs) for DB
     *            instances. The results list includes only information about
     *            the DB instance resources identified by these ARNs.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Returns all resources by default. The status for each resource
     *            is specified in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBInstanceAutomatedBackupsRequest withFilters(Filter... filters) {
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
     * A filter that specifies which resources to return based on status.
     * </p>
     * <p>
     * Supported filters are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>status</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - automated backups for current instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>retained</code> - automated backups for deleted instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code> - automated backups that are waiting for the first
     * automated snapshot to be available
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and Amazon
     * Resource Names (ARNs) for DB instances. The results list includes only
     * information about the DB instance automated backupss identified by these
     * ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - Accepts DB instance resource identifiers
     * and DB Amazon Resource Names (ARNs) for DB instances. The results list
     * includes only information about the DB instance resources identified by
     * these ARNs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns all resources by default. The status for each resource is
     * specified in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A filter that specifies which resources to return based on
     *            status.
     *            </p>
     *            <p>
     *            Supported filters are the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>status</code>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>active</code> - automated backups for current instances
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>retained</code> - automated backups for deleted
     *            instances
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>creating</code> - automated backups that are waiting for
     *            the first automated snapshot to be available
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>db-instance-id</code> - Accepts DB instance identifiers
     *            and Amazon Resource Names (ARNs) for DB instances. The results
     *            list includes only information about the DB instance automated
     *            backupss identified by these ARNs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dbi-resource-id</code> - Accepts DB instance resource
     *            identifiers and DB Amazon Resource Names (ARNs) for DB
     *            instances. The results list includes only information about
     *            the DB instance resources identified by these ARNs.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Returns all resources by default. The status for each resource
     *            is specified in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBInstanceAutomatedBackupsRequest withFilters(
            java.util.Collection<Filter> filters) {
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
     *
     * @return <p>
     *         The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so
     *         that you can retrieve the remaining results.
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
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response. If
     *            more records exist than the specified <code>MaxRecords</code>
     *            value, a pagination token called a marker is included in the
     *            response so that you can retrieve the remaining results.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response. If
     *            more records exist than the specified <code>MaxRecords</code>
     *            value, a pagination token called a marker is included in the
     *            response so that you can retrieve the remaining results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBInstanceAutomatedBackupsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * The pagination token provided in the previous request. If this parameter
     * is specified the response includes only records beyond the marker, up to
     * <code>MaxRecords</code>.
     * </p>
     *
     * @return <p>
     *         The pagination token provided in the previous request. If this
     *         parameter is specified the response includes only records beyond
     *         the marker, up to <code>MaxRecords</code>.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * The pagination token provided in the previous request. If this parameter
     * is specified the response includes only records beyond the marker, up to
     * <code>MaxRecords</code>.
     * </p>
     *
     * @param marker <p>
     *            The pagination token provided in the previous request. If this
     *            parameter is specified the response includes only records
     *            beyond the marker, up to <code>MaxRecords</code>.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The pagination token provided in the previous request. If this parameter
     * is specified the response includes only records beyond the marker, up to
     * <code>MaxRecords</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            The pagination token provided in the previous request. If this
     *            parameter is specified the response includes only records
     *            beyond the marker, up to <code>MaxRecords</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBInstanceAutomatedBackupsRequest withMarker(String marker) {
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
        if (getDbiResourceId() != null)
            sb.append("DbiResourceId: " + getDbiResourceId() + ",");
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
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
                + ((getDbiResourceId() == null) ? 0 : getDbiResourceId().hashCode());
        hashCode = prime * hashCode
                + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
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

        if (obj instanceof DescribeDBInstanceAutomatedBackupsRequest == false)
            return false;
        DescribeDBInstanceAutomatedBackupsRequest other = (DescribeDBInstanceAutomatedBackupsRequest) obj;

        if (other.getDbiResourceId() == null ^ this.getDbiResourceId() == null)
            return false;
        if (other.getDbiResourceId() != null
                && other.getDbiResourceId().equals(this.getDbiResourceId()) == false)
            return false;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null
                && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
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
