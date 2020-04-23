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
 * Returns information about backtracks for a DB cluster.
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
public class DescribeDBClusterBacktracksRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The DB cluster identifier of the DB cluster to be described. This
     * parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     */
    private String dBClusterIdentifier;

    /**
     * <p>
     * If specified, this value is the backtrack identifier of the backtrack to
     * be described.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain a valid universally unique identifier (UUID). For more
     * information about UUIDs, see <a
     * href="http://www.ietf.org/rfc/rfc4122.txt">A Universally Unique
     * Identifier (UUID) URN Namespace</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>123e4567-e89b-12d3-a456-426655440000</code>
     * </p>
     */
    private String backtrackIdentifier;

    /**
     * <p>
     * A filter that specifies one or more DB clusters to describe. Supported
     * filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-backtrack-id</code> - Accepts backtrack identifiers. The
     * results list includes information about only the backtracks identified by
     * these identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-cluster-backtrack-status</code> - Accepts any of the following
     * backtrack status values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>applying</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>completed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The results list includes information about only the backtracks
     * identified by these values.
     * </p>
     * </li>
     * </ul>
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
     * <code>DescribeDBClusterBacktracks</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The DB cluster identifier of the DB cluster to be described. This
     * parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     *
     * @return <p>
     *         The DB cluster identifier of the DB cluster to be described. This
     *         parameter is stored as a lowercase string.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 alphanumeric characters or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-cluster1</code>
     *         </p>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier of the DB cluster to be described. This
     * parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     *
     * @param dBClusterIdentifier <p>
     *            The DB cluster identifier of the DB cluster to be described.
     *            This parameter is stored as a lowercase string.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 1 to 63 alphanumeric characters or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>my-cluster1</code>
     *            </p>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier of the DB cluster to be described. This
     * parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterIdentifier <p>
     *            The DB cluster identifier of the DB cluster to be described.
     *            This parameter is stored as a lowercase string.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 1 to 63 alphanumeric characters or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>my-cluster1</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClusterBacktracksRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * If specified, this value is the backtrack identifier of the backtrack to
     * be described.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain a valid universally unique identifier (UUID). For more
     * information about UUIDs, see <a
     * href="http://www.ietf.org/rfc/rfc4122.txt">A Universally Unique
     * Identifier (UUID) URN Namespace</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>123e4567-e89b-12d3-a456-426655440000</code>
     * </p>
     *
     * @return <p>
     *         If specified, this value is the backtrack identifier of the
     *         backtrack to be described.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain a valid universally unique identifier (UUID). For
     *         more information about UUIDs, see <a
     *         href="http://www.ietf.org/rfc/rfc4122.txt">A Universally Unique
     *         Identifier (UUID) URN Namespace</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>123e4567-e89b-12d3-a456-426655440000</code>
     *         </p>
     */
    public String getBacktrackIdentifier() {
        return backtrackIdentifier;
    }

    /**
     * <p>
     * If specified, this value is the backtrack identifier of the backtrack to
     * be described.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain a valid universally unique identifier (UUID). For more
     * information about UUIDs, see <a
     * href="http://www.ietf.org/rfc/rfc4122.txt">A Universally Unique
     * Identifier (UUID) URN Namespace</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>123e4567-e89b-12d3-a456-426655440000</code>
     * </p>
     *
     * @param backtrackIdentifier <p>
     *            If specified, this value is the backtrack identifier of the
     *            backtrack to be described.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain a valid universally unique identifier (UUID). For
     *            more information about UUIDs, see <a
     *            href="http://www.ietf.org/rfc/rfc4122.txt">A Universally
     *            Unique Identifier (UUID) URN Namespace</a>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>123e4567-e89b-12d3-a456-426655440000</code>
     *            </p>
     */
    public void setBacktrackIdentifier(String backtrackIdentifier) {
        this.backtrackIdentifier = backtrackIdentifier;
    }

    /**
     * <p>
     * If specified, this value is the backtrack identifier of the backtrack to
     * be described.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain a valid universally unique identifier (UUID). For more
     * information about UUIDs, see <a
     * href="http://www.ietf.org/rfc/rfc4122.txt">A Universally Unique
     * Identifier (UUID) URN Namespace</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>123e4567-e89b-12d3-a456-426655440000</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backtrackIdentifier <p>
     *            If specified, this value is the backtrack identifier of the
     *            backtrack to be described.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain a valid universally unique identifier (UUID). For
     *            more information about UUIDs, see <a
     *            href="http://www.ietf.org/rfc/rfc4122.txt">A Universally
     *            Unique Identifier (UUID) URN Namespace</a>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>123e4567-e89b-12d3-a456-426655440000</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClusterBacktracksRequest withBacktrackIdentifier(String backtrackIdentifier) {
        this.backtrackIdentifier = backtrackIdentifier;
        return this;
    }

    /**
     * <p>
     * A filter that specifies one or more DB clusters to describe. Supported
     * filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-backtrack-id</code> - Accepts backtrack identifiers. The
     * results list includes information about only the backtracks identified by
     * these identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-cluster-backtrack-status</code> - Accepts any of the following
     * backtrack status values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>applying</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>completed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The results list includes information about only the backtracks
     * identified by these values.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A filter that specifies one or more DB clusters to describe.
     *         Supported filters include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>db-cluster-backtrack-id</code> - Accepts backtrack
     *         identifiers. The results list includes information about only the
     *         backtracks identified by these identifiers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>db-cluster-backtrack-status</code> - Accepts any of the
     *         following backtrack status values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>applying</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>completed</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>failed</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The results list includes information about only the backtracks
     *         identified by these values.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A filter that specifies one or more DB clusters to describe. Supported
     * filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-backtrack-id</code> - Accepts backtrack identifiers. The
     * results list includes information about only the backtracks identified by
     * these identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-cluster-backtrack-status</code> - Accepts any of the following
     * backtrack status values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>applying</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>completed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The results list includes information about only the backtracks
     * identified by these values.
     * </p>
     * </li>
     * </ul>
     *
     * @param filters <p>
     *            A filter that specifies one or more DB clusters to describe.
     *            Supported filters include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>db-cluster-backtrack-id</code> - Accepts backtrack
     *            identifiers. The results list includes information about only
     *            the backtracks identified by these identifiers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>db-cluster-backtrack-status</code> - Accepts any of the
     *            following backtrack status values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>applying</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>completed</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>failed</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The results list includes information about only the
     *            backtracks identified by these values.
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
     * A filter that specifies one or more DB clusters to describe. Supported
     * filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-backtrack-id</code> - Accepts backtrack identifiers. The
     * results list includes information about only the backtracks identified by
     * these identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-cluster-backtrack-status</code> - Accepts any of the following
     * backtrack status values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>applying</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>completed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The results list includes information about only the backtracks
     * identified by these values.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A filter that specifies one or more DB clusters to describe.
     *            Supported filters include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>db-cluster-backtrack-id</code> - Accepts backtrack
     *            identifiers. The results list includes information about only
     *            the backtracks identified by these identifiers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>db-cluster-backtrack-status</code> - Accepts any of the
     *            following backtrack status values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>applying</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>completed</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>failed</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The results list includes information about only the
     *            backtracks identified by these values.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClusterBacktracksRequest withFilters(Filter... filters) {
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
     * A filter that specifies one or more DB clusters to describe. Supported
     * filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-backtrack-id</code> - Accepts backtrack identifiers. The
     * results list includes information about only the backtracks identified by
     * these identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-cluster-backtrack-status</code> - Accepts any of the following
     * backtrack status values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>applying</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>completed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The results list includes information about only the backtracks
     * identified by these values.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A filter that specifies one or more DB clusters to describe.
     *            Supported filters include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>db-cluster-backtrack-id</code> - Accepts backtrack
     *            identifiers. The results list includes information about only
     *            the backtracks identified by these identifiers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>db-cluster-backtrack-status</code> - Accepts any of the
     *            following backtrack status values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>applying</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>completed</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>failed</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The results list includes information about only the
     *            backtracks identified by these values.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClusterBacktracksRequest withFilters(java.util.Collection<Filter> filters) {
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
    public DescribeDBClusterBacktracksRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeDBClusterBacktracks</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @return <p>
     *         An optional pagination token provided by a previous
     *         <code>DescribeDBClusterBacktracks</code> request. If this
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
     * <code>DescribeDBClusterBacktracks</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            <code>DescribeDBClusterBacktracks</code> request. If this
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
     * <code>DescribeDBClusterBacktracks</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            <code>DescribeDBClusterBacktracks</code> request. If this
     *            parameter is specified, the response includes only records
     *            beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClusterBacktracksRequest withMarker(String marker) {
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
        if (getBacktrackIdentifier() != null)
            sb.append("BacktrackIdentifier: " + getBacktrackIdentifier() + ",");
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
        hashCode = prime * hashCode
                + ((getBacktrackIdentifier() == null) ? 0 : getBacktrackIdentifier().hashCode());
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

        if (obj instanceof DescribeDBClusterBacktracksRequest == false)
            return false;
        DescribeDBClusterBacktracksRequest other = (DescribeDBClusterBacktracksRequest) obj;

        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getBacktrackIdentifier() == null ^ this.getBacktrackIdentifier() == null)
            return false;
        if (other.getBacktrackIdentifier() != null
                && other.getBacktrackIdentifier().equals(this.getBacktrackIdentifier()) == false)
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
