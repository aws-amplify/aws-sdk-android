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
 * Returns information about a snapshot export to Amazon S3. This API operation
 * supports pagination.
 * </p>
 */
public class DescribeExportTasksRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the snapshot export task to be described.
     * </p>
     */
    private String exportTaskIdentifier;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
     * </p>
     */
    private String sourceArn;

    /**
     * <p>
     * Filters specify one or more snapshot exports to describe. The filters are
     * specified as name-value pairs that define what to include in the output.
     * </p>
     * <p>
     * Supported filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>export-task-identifier</code> - An identifier for the snapshot
     * export task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-bucket</code> - The Amazon S3 bucket the snapshot is exported
     * to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-arn</code> - The Amazon Resource Name (ARN) of the snapshot
     * exported to Amazon S3
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the export task.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeExportTasks</code> request. If you specify this parameter,
     * the response includes only records beyond the marker, up to the value
     * specified by the <code>MaxRecords</code> parameter.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified value, a pagination token called a marker is
     * included in the response. You can use the marker in a later
     * <code>DescribeExportTasks</code> request to retrieve the remaining
     * results.
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
     * The identifier of the snapshot export task to be described.
     * </p>
     *
     * @return <p>
     *         The identifier of the snapshot export task to be described.
     *         </p>
     */
    public String getExportTaskIdentifier() {
        return exportTaskIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot export task to be described.
     * </p>
     *
     * @param exportTaskIdentifier <p>
     *            The identifier of the snapshot export task to be described.
     *            </p>
     */
    public void setExportTaskIdentifier(String exportTaskIdentifier) {
        this.exportTaskIdentifier = exportTaskIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot export task to be described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportTaskIdentifier <p>
     *            The identifier of the snapshot export task to be described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeExportTasksRequest withExportTaskIdentifier(String exportTaskIdentifier) {
        this.exportTaskIdentifier = exportTaskIdentifier;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the snapshot exported to Amazon
     *         S3.
     *         </p>
     */
    public String getSourceArn() {
        return sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
     * </p>
     *
     * @param sourceArn <p>
     *            The Amazon Resource Name (ARN) of the snapshot exported to
     *            Amazon S3.
     *            </p>
     */
    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceArn <p>
     *            The Amazon Resource Name (ARN) of the snapshot exported to
     *            Amazon S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeExportTasksRequest withSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }

    /**
     * <p>
     * Filters specify one or more snapshot exports to describe. The filters are
     * specified as name-value pairs that define what to include in the output.
     * </p>
     * <p>
     * Supported filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>export-task-identifier</code> - An identifier for the snapshot
     * export task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-bucket</code> - The Amazon S3 bucket the snapshot is exported
     * to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-arn</code> - The Amazon Resource Name (ARN) of the snapshot
     * exported to Amazon S3
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the export task.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Filters specify one or more snapshot exports to describe. The
     *         filters are specified as name-value pairs that define what to
     *         include in the output.
     *         </p>
     *         <p>
     *         Supported filters include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>export-task-identifier</code> - An identifier for the
     *         snapshot export task.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3-bucket</code> - The Amazon S3 bucket the snapshot is
     *         exported to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>source-arn</code> - The Amazon Resource Name (ARN) of the
     *         snapshot exported to Amazon S3
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status</code> - The status of the export task.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Filters specify one or more snapshot exports to describe. The filters are
     * specified as name-value pairs that define what to include in the output.
     * </p>
     * <p>
     * Supported filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>export-task-identifier</code> - An identifier for the snapshot
     * export task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-bucket</code> - The Amazon S3 bucket the snapshot is exported
     * to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-arn</code> - The Amazon Resource Name (ARN) of the snapshot
     * exported to Amazon S3
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the export task.
     * </p>
     * </li>
     * </ul>
     *
     * @param filters <p>
     *            Filters specify one or more snapshot exports to describe. The
     *            filters are specified as name-value pairs that define what to
     *            include in the output.
     *            </p>
     *            <p>
     *            Supported filters include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>export-task-identifier</code> - An identifier for the
     *            snapshot export task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3-bucket</code> - The Amazon S3 bucket the snapshot is
     *            exported to.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>source-arn</code> - The Amazon Resource Name (ARN) of
     *            the snapshot exported to Amazon S3
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>status</code> - The status of the export task.
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
     * Filters specify one or more snapshot exports to describe. The filters are
     * specified as name-value pairs that define what to include in the output.
     * </p>
     * <p>
     * Supported filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>export-task-identifier</code> - An identifier for the snapshot
     * export task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-bucket</code> - The Amazon S3 bucket the snapshot is exported
     * to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-arn</code> - The Amazon Resource Name (ARN) of the snapshot
     * exported to Amazon S3
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the export task.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Filters specify one or more snapshot exports to describe. The
     *            filters are specified as name-value pairs that define what to
     *            include in the output.
     *            </p>
     *            <p>
     *            Supported filters include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>export-task-identifier</code> - An identifier for the
     *            snapshot export task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3-bucket</code> - The Amazon S3 bucket the snapshot is
     *            exported to.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>source-arn</code> - The Amazon Resource Name (ARN) of
     *            the snapshot exported to Amazon S3
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>status</code> - The status of the export task.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeExportTasksRequest withFilters(Filter... filters) {
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
     * Filters specify one or more snapshot exports to describe. The filters are
     * specified as name-value pairs that define what to include in the output.
     * </p>
     * <p>
     * Supported filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>export-task-identifier</code> - An identifier for the snapshot
     * export task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-bucket</code> - The Amazon S3 bucket the snapshot is exported
     * to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-arn</code> - The Amazon Resource Name (ARN) of the snapshot
     * exported to Amazon S3
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the export task.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Filters specify one or more snapshot exports to describe. The
     *            filters are specified as name-value pairs that define what to
     *            include in the output.
     *            </p>
     *            <p>
     *            Supported filters include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>export-task-identifier</code> - An identifier for the
     *            snapshot export task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3-bucket</code> - The Amazon S3 bucket the snapshot is
     *            exported to.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>source-arn</code> - The Amazon Resource Name (ARN) of
     *            the snapshot exported to Amazon S3
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>status</code> - The status of the export task.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeExportTasksRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeExportTasks</code> request. If you specify this parameter,
     * the response includes only records beyond the marker, up to the value
     * specified by the <code>MaxRecords</code> parameter.
     * </p>
     *
     * @return <p>
     *         An optional pagination token provided by a previous
     *         <code>DescribeExportTasks</code> request. If you specify this
     *         parameter, the response includes only records beyond the marker,
     *         up to the value specified by the <code>MaxRecords</code>
     *         parameter.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeExportTasks</code> request. If you specify this parameter,
     * the response includes only records beyond the marker, up to the value
     * specified by the <code>MaxRecords</code> parameter.
     * </p>
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            <code>DescribeExportTasks</code> request. If you specify this
     *            parameter, the response includes only records beyond the
     *            marker, up to the value specified by the
     *            <code>MaxRecords</code> parameter.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeExportTasks</code> request. If you specify this parameter,
     * the response includes only records beyond the marker, up to the value
     * specified by the <code>MaxRecords</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            <code>DescribeExportTasks</code> request. If you specify this
     *            parameter, the response includes only records beyond the
     *            marker, up to the value specified by the
     *            <code>MaxRecords</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeExportTasksRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified value, a pagination token called a marker is
     * included in the response. You can use the marker in a later
     * <code>DescribeExportTasks</code> request to retrieve the remaining
     * results.
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
     *         records exist than the specified value, a pagination token called
     *         a marker is included in the response. You can use the marker in a
     *         later <code>DescribeExportTasks</code> request to retrieve the
     *         remaining results.
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
     * exist than the specified value, a pagination token called a marker is
     * included in the response. You can use the marker in a later
     * <code>DescribeExportTasks</code> request to retrieve the remaining
     * results.
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
     *            more records exist than the specified value, a pagination
     *            token called a marker is included in the response. You can use
     *            the marker in a later <code>DescribeExportTasks</code> request
     *            to retrieve the remaining results.
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
     * exist than the specified value, a pagination token called a marker is
     * included in the response. You can use the marker in a later
     * <code>DescribeExportTasks</code> request to retrieve the remaining
     * results.
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
     *            more records exist than the specified value, a pagination
     *            token called a marker is included in the response. You can use
     *            the marker in a later <code>DescribeExportTasks</code> request
     *            to retrieve the remaining results.
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
    public DescribeExportTasksRequest withMaxRecords(Integer maxRecords) {
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
        if (getExportTaskIdentifier() != null)
            sb.append("ExportTaskIdentifier: " + getExportTaskIdentifier() + ",");
        if (getSourceArn() != null)
            sb.append("SourceArn: " + getSourceArn() + ",");
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
                + ((getExportTaskIdentifier() == null) ? 0 : getExportTaskIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
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

        if (obj instanceof DescribeExportTasksRequest == false)
            return false;
        DescribeExportTasksRequest other = (DescribeExportTasksRequest) obj;

        if (other.getExportTaskIdentifier() == null ^ this.getExportTaskIdentifier() == null)
            return false;
        if (other.getExportTaskIdentifier() != null
                && other.getExportTaskIdentifier().equals(this.getExportTaskIdentifier()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null
                && other.getSourceArn().equals(this.getSourceArn()) == false)
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
