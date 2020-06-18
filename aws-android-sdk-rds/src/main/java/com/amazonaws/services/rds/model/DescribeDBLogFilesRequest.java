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
 * Returns a list of DB log files for the DB instance.
 * </p>
 */
public class DescribeDBLogFilesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The customer-assigned name of the DB instance that contains the log files
     * you want to list.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     */
    private String dBInstanceIdentifier;

    /**
     * <p>
     * Filters the available log files for log file names that contain the
     * specified string.
     * </p>
     */
    private String filenameContains;

    /**
     * <p>
     * Filters the available log files for files written since the specified
     * date, in POSIX timestamp format with milliseconds.
     * </p>
     */
    private Long fileLastWritten;

    /**
     * <p>
     * Filters the available log files for files larger than the specified size.
     * </p>
     */
    private Long fileSize;

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified MaxRecords value, a pagination token called a
     * marker is included in the response so you can retrieve the remaining
     * results.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * The pagination token provided in the previous request. If this parameter
     * is specified the response includes only records beyond the marker, up to
     * MaxRecords.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The customer-assigned name of the DB instance that contains the log files
     * you want to list.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The customer-assigned name of the DB instance that contains the
     *         log files you want to list.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing DBInstance.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }

    /**
     * <p>
     * The customer-assigned name of the DB instance that contains the log files
     * you want to list.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     *
     * @param dBInstanceIdentifier <p>
     *            The customer-assigned name of the DB instance that contains
     *            the log files you want to list.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the identifier of an existing DBInstance.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The customer-assigned name of the DB instance that contains the log files
     * you want to list.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceIdentifier <p>
     *            The customer-assigned name of the DB instance that contains
     *            the log files you want to list.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the identifier of an existing DBInstance.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBLogFilesRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * <p>
     * Filters the available log files for log file names that contain the
     * specified string.
     * </p>
     *
     * @return <p>
     *         Filters the available log files for log file names that contain
     *         the specified string.
     *         </p>
     */
    public String getFilenameContains() {
        return filenameContains;
    }

    /**
     * <p>
     * Filters the available log files for log file names that contain the
     * specified string.
     * </p>
     *
     * @param filenameContains <p>
     *            Filters the available log files for log file names that
     *            contain the specified string.
     *            </p>
     */
    public void setFilenameContains(String filenameContains) {
        this.filenameContains = filenameContains;
    }

    /**
     * <p>
     * Filters the available log files for log file names that contain the
     * specified string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filenameContains <p>
     *            Filters the available log files for log file names that
     *            contain the specified string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBLogFilesRequest withFilenameContains(String filenameContains) {
        this.filenameContains = filenameContains;
        return this;
    }

    /**
     * <p>
     * Filters the available log files for files written since the specified
     * date, in POSIX timestamp format with milliseconds.
     * </p>
     *
     * @return <p>
     *         Filters the available log files for files written since the
     *         specified date, in POSIX timestamp format with milliseconds.
     *         </p>
     */
    public Long getFileLastWritten() {
        return fileLastWritten;
    }

    /**
     * <p>
     * Filters the available log files for files written since the specified
     * date, in POSIX timestamp format with milliseconds.
     * </p>
     *
     * @param fileLastWritten <p>
     *            Filters the available log files for files written since the
     *            specified date, in POSIX timestamp format with milliseconds.
     *            </p>
     */
    public void setFileLastWritten(Long fileLastWritten) {
        this.fileLastWritten = fileLastWritten;
    }

    /**
     * <p>
     * Filters the available log files for files written since the specified
     * date, in POSIX timestamp format with milliseconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileLastWritten <p>
     *            Filters the available log files for files written since the
     *            specified date, in POSIX timestamp format with milliseconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBLogFilesRequest withFileLastWritten(Long fileLastWritten) {
        this.fileLastWritten = fileLastWritten;
        return this;
    }

    /**
     * <p>
     * Filters the available log files for files larger than the specified size.
     * </p>
     *
     * @return <p>
     *         Filters the available log files for files larger than the
     *         specified size.
     *         </p>
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * <p>
     * Filters the available log files for files larger than the specified size.
     * </p>
     *
     * @param fileSize <p>
     *            Filters the available log files for files larger than the
     *            specified size.
     *            </p>
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * <p>
     * Filters the available log files for files larger than the specified size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSize <p>
     *            Filters the available log files for files larger than the
     *            specified size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBLogFilesRequest withFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     *
     * @return <p>
     *         This parameter isn't currently supported.
     *         </p>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     *
     * @param filters <p>
     *            This parameter isn't currently supported.
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
     * This parameter isn't currently supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            This parameter isn't currently supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBLogFilesRequest withFilters(Filter... filters) {
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
     * This parameter isn't currently supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            This parameter isn't currently supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBLogFilesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified MaxRecords value, a pagination token called a
     * marker is included in the response so you can retrieve the remaining
     * results.
     * </p>
     *
     * @return <p>
     *         The maximum number of records to include in the response. If more
     *         records exist than the specified MaxRecords value, a pagination
     *         token called a marker is included in the response so you can
     *         retrieve the remaining results.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified MaxRecords value, a pagination token called a
     * marker is included in the response so you can retrieve the remaining
     * results.
     * </p>
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response. If
     *            more records exist than the specified MaxRecords value, a
     *            pagination token called a marker is included in the response
     *            so you can retrieve the remaining results.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified MaxRecords value, a pagination token called a
     * marker is included in the response so you can retrieve the remaining
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response. If
     *            more records exist than the specified MaxRecords value, a
     *            pagination token called a marker is included in the response
     *            so you can retrieve the remaining results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBLogFilesRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * The pagination token provided in the previous request. If this parameter
     * is specified the response includes only records beyond the marker, up to
     * MaxRecords.
     * </p>
     *
     * @return <p>
     *         The pagination token provided in the previous request. If this
     *         parameter is specified the response includes only records beyond
     *         the marker, up to MaxRecords.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * The pagination token provided in the previous request. If this parameter
     * is specified the response includes only records beyond the marker, up to
     * MaxRecords.
     * </p>
     *
     * @param marker <p>
     *            The pagination token provided in the previous request. If this
     *            parameter is specified the response includes only records
     *            beyond the marker, up to MaxRecords.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The pagination token provided in the previous request. If this parameter
     * is specified the response includes only records beyond the marker, up to
     * MaxRecords.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            The pagination token provided in the previous request. If this
     *            parameter is specified the response includes only records
     *            beyond the marker, up to MaxRecords.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBLogFilesRequest withMarker(String marker) {
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
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
        if (getFilenameContains() != null)
            sb.append("FilenameContains: " + getFilenameContains() + ",");
        if (getFileLastWritten() != null)
            sb.append("FileLastWritten: " + getFileLastWritten() + ",");
        if (getFileSize() != null)
            sb.append("FileSize: " + getFileSize() + ",");
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
                + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getFilenameContains() == null) ? 0 : getFilenameContains().hashCode());
        hashCode = prime * hashCode
                + ((getFileLastWritten() == null) ? 0 : getFileLastWritten().hashCode());
        hashCode = prime * hashCode + ((getFileSize() == null) ? 0 : getFileSize().hashCode());
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

        if (obj instanceof DescribeDBLogFilesRequest == false)
            return false;
        DescribeDBLogFilesRequest other = (DescribeDBLogFilesRequest) obj;

        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null
                && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getFilenameContains() == null ^ this.getFilenameContains() == null)
            return false;
        if (other.getFilenameContains() != null
                && other.getFilenameContains().equals(this.getFilenameContains()) == false)
            return false;
        if (other.getFileLastWritten() == null ^ this.getFileLastWritten() == null)
            return false;
        if (other.getFileLastWritten() != null
                && other.getFileLastWritten().equals(this.getFileLastWritten()) == false)
            return false;
        if (other.getFileSize() == null ^ this.getFileSize() == null)
            return false;
        if (other.getFileSize() != null && other.getFileSize().equals(this.getFileSize()) == false)
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
