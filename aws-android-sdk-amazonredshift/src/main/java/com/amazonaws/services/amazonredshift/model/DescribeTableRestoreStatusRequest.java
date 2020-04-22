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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the status of one or more table restore requests made using the
 * <a>RestoreTableFromClusterSnapshot</a> API action. If you don't specify a
 * value for the <code>TableRestoreRequestId</code> parameter, then
 * <code>DescribeTableRestoreStatus</code> returns the status of all table
 * restore requests ordered by the date and time of the request in ascending
 * order. Otherwise <code>DescribeTableRestoreStatus</code> returns the status
 * of the table specified by <code>TableRestoreRequestId</code>.
 * </p>
 */
public class DescribeTableRestoreStatusRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Amazon Redshift cluster that the table is being restored to.
     * </p>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * The identifier of the table restore request to return status for. If you
     * don't specify a <code>TableRestoreRequestId</code> value, then
     * <code>DescribeTableRestoreStatus</code> returns the status of all
     * in-progress table restore requests.
     * </p>
     */
    private String tableRestoreRequestId;

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that the remaining
     * results can be retrieved.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeTableRestoreStatus</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by the <code>MaxRecords</code> parameter.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The Amazon Redshift cluster that the table is being restored to.
     * </p>
     *
     * @return <p>
     *         The Amazon Redshift cluster that the table is being restored to.
     *         </p>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * <p>
     * The Amazon Redshift cluster that the table is being restored to.
     * </p>
     *
     * @param clusterIdentifier <p>
     *            The Amazon Redshift cluster that the table is being restored
     *            to.
     *            </p>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The Amazon Redshift cluster that the table is being restored to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterIdentifier <p>
     *            The Amazon Redshift cluster that the table is being restored
     *            to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTableRestoreStatusRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The identifier of the table restore request to return status for. If you
     * don't specify a <code>TableRestoreRequestId</code> value, then
     * <code>DescribeTableRestoreStatus</code> returns the status of all
     * in-progress table restore requests.
     * </p>
     *
     * @return <p>
     *         The identifier of the table restore request to return status for.
     *         If you don't specify a <code>TableRestoreRequestId</code> value,
     *         then <code>DescribeTableRestoreStatus</code> returns the status
     *         of all in-progress table restore requests.
     *         </p>
     */
    public String getTableRestoreRequestId() {
        return tableRestoreRequestId;
    }

    /**
     * <p>
     * The identifier of the table restore request to return status for. If you
     * don't specify a <code>TableRestoreRequestId</code> value, then
     * <code>DescribeTableRestoreStatus</code> returns the status of all
     * in-progress table restore requests.
     * </p>
     *
     * @param tableRestoreRequestId <p>
     *            The identifier of the table restore request to return status
     *            for. If you don't specify a <code>TableRestoreRequestId</code>
     *            value, then <code>DescribeTableRestoreStatus</code> returns
     *            the status of all in-progress table restore requests.
     *            </p>
     */
    public void setTableRestoreRequestId(String tableRestoreRequestId) {
        this.tableRestoreRequestId = tableRestoreRequestId;
    }

    /**
     * <p>
     * The identifier of the table restore request to return status for. If you
     * don't specify a <code>TableRestoreRequestId</code> value, then
     * <code>DescribeTableRestoreStatus</code> returns the status of all
     * in-progress table restore requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableRestoreRequestId <p>
     *            The identifier of the table restore request to return status
     *            for. If you don't specify a <code>TableRestoreRequestId</code>
     *            value, then <code>DescribeTableRestoreStatus</code> returns
     *            the status of all in-progress table restore requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTableRestoreStatusRequest withTableRestoreRequestId(String tableRestoreRequestId) {
        this.tableRestoreRequestId = tableRestoreRequestId;
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that the remaining
     * results can be retrieved.
     * </p>
     *
     * @return <p>
     *         The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so
     *         that the remaining results can be retrieved.
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
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response. If
     *            more records exist than the specified <code>MaxRecords</code>
     *            value, a pagination token called a marker is included in the
     *            response so that the remaining results can be retrieved.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response. If
     *            more records exist than the specified <code>MaxRecords</code>
     *            value, a pagination token called a marker is included in the
     *            response so that the remaining results can be retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTableRestoreStatusRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeTableRestoreStatus</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by the <code>MaxRecords</code> parameter.
     * </p>
     *
     * @return <p>
     *         An optional pagination token provided by a previous
     *         <code>DescribeTableRestoreStatus</code> request. If this
     *         parameter is specified, the response includes only records beyond
     *         the marker, up to the value specified by the
     *         <code>MaxRecords</code> parameter.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeTableRestoreStatus</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by the <code>MaxRecords</code> parameter.
     * </p>
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            <code>DescribeTableRestoreStatus</code> request. If this
     *            parameter is specified, the response includes only records
     *            beyond the marker, up to the value specified by the
     *            <code>MaxRecords</code> parameter.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeTableRestoreStatus</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by the <code>MaxRecords</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            <code>DescribeTableRestoreStatus</code> request. If this
     *            parameter is specified, the response includes only records
     *            beyond the marker, up to the value specified by the
     *            <code>MaxRecords</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTableRestoreStatusRequest withMarker(String marker) {
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getTableRestoreRequestId() != null)
            sb.append("TableRestoreRequestId: " + getTableRestoreRequestId() + ",");
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
                + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getTableRestoreRequestId() == null) ? 0 : getTableRestoreRequestId().hashCode());
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

        if (obj instanceof DescribeTableRestoreStatusRequest == false)
            return false;
        DescribeTableRestoreStatusRequest other = (DescribeTableRestoreStatusRequest) obj;

        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getTableRestoreRequestId() == null ^ this.getTableRestoreRequestId() == null)
            return false;
        if (other.getTableRestoreRequestId() != null
                && other.getTableRestoreRequestId().equals(this.getTableRestoreRequestId()) == false)
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
