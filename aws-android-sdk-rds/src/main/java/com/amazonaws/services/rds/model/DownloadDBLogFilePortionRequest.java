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
 * Downloads all or a portion of the specified log file, up to 1 MB in size.
 * </p>
 */
public class DownloadDBLogFilePortionRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * The name of the log file to be downloaded.
     * </p>
     */
    private String logFileName;

    /**
     * <p>
     * The pagination token provided in the previous request or "0". If the
     * Marker parameter is specified the response includes only records beyond
     * the marker until the end of the file or up to NumberOfLines.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The number of lines to download. If the number of lines specified results
     * in a file over 1 MB in size, the file is truncated at 1 MB in size.
     * </p>
     * <p>
     * If the NumberOfLines parameter is specified, then the block of lines
     * returned can be from the beginning or the end of the log file, depending
     * on the value of the Marker parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If neither Marker or NumberOfLines are specified, the entire log file is
     * returned up to a maximum of 10000 lines, starting with the most recent
     * log entries first.
     * </p>
     * </li>
     * <li>
     * <p>
     * If NumberOfLines is specified and Marker isn't specified, then the most
     * recent lines from the end of the log file are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * If Marker is specified as "0", then the specified number of lines from
     * the beginning of the log file are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can download the log file in blocks of lines by specifying the size
     * of the block using the NumberOfLines parameter, and by specifying a value
     * of "0" for the Marker parameter in your first request. Include the Marker
     * value returned in the response as the Marker value for the next request,
     * continuing until the AdditionalDataPending response element returns
     * false.
     * </p>
     * </li>
     * </ul>
     */
    private Integer numberOfLines;

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
    public DownloadDBLogFilePortionRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * <p>
     * The name of the log file to be downloaded.
     * </p>
     *
     * @return <p>
     *         The name of the log file to be downloaded.
     *         </p>
     */
    public String getLogFileName() {
        return logFileName;
    }

    /**
     * <p>
     * The name of the log file to be downloaded.
     * </p>
     *
     * @param logFileName <p>
     *            The name of the log file to be downloaded.
     *            </p>
     */
    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }

    /**
     * <p>
     * The name of the log file to be downloaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logFileName <p>
     *            The name of the log file to be downloaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DownloadDBLogFilePortionRequest withLogFileName(String logFileName) {
        this.logFileName = logFileName;
        return this;
    }

    /**
     * <p>
     * The pagination token provided in the previous request or "0". If the
     * Marker parameter is specified the response includes only records beyond
     * the marker until the end of the file or up to NumberOfLines.
     * </p>
     *
     * @return <p>
     *         The pagination token provided in the previous request or "0". If
     *         the Marker parameter is specified the response includes only
     *         records beyond the marker until the end of the file or up to
     *         NumberOfLines.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * The pagination token provided in the previous request or "0". If the
     * Marker parameter is specified the response includes only records beyond
     * the marker until the end of the file or up to NumberOfLines.
     * </p>
     *
     * @param marker <p>
     *            The pagination token provided in the previous request or "0".
     *            If the Marker parameter is specified the response includes
     *            only records beyond the marker until the end of the file or up
     *            to NumberOfLines.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The pagination token provided in the previous request or "0". If the
     * Marker parameter is specified the response includes only records beyond
     * the marker until the end of the file or up to NumberOfLines.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            The pagination token provided in the previous request or "0".
     *            If the Marker parameter is specified the response includes
     *            only records beyond the marker until the end of the file or up
     *            to NumberOfLines.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DownloadDBLogFilePortionRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * The number of lines to download. If the number of lines specified results
     * in a file over 1 MB in size, the file is truncated at 1 MB in size.
     * </p>
     * <p>
     * If the NumberOfLines parameter is specified, then the block of lines
     * returned can be from the beginning or the end of the log file, depending
     * on the value of the Marker parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If neither Marker or NumberOfLines are specified, the entire log file is
     * returned up to a maximum of 10000 lines, starting with the most recent
     * log entries first.
     * </p>
     * </li>
     * <li>
     * <p>
     * If NumberOfLines is specified and Marker isn't specified, then the most
     * recent lines from the end of the log file are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * If Marker is specified as "0", then the specified number of lines from
     * the beginning of the log file are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can download the log file in blocks of lines by specifying the size
     * of the block using the NumberOfLines parameter, and by specifying a value
     * of "0" for the Marker parameter in your first request. Include the Marker
     * value returned in the response as the Marker value for the next request,
     * continuing until the AdditionalDataPending response element returns
     * false.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The number of lines to download. If the number of lines specified
     *         results in a file over 1 MB in size, the file is truncated at 1
     *         MB in size.
     *         </p>
     *         <p>
     *         If the NumberOfLines parameter is specified, then the block of
     *         lines returned can be from the beginning or the end of the log
     *         file, depending on the value of the Marker parameter.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If neither Marker or NumberOfLines are specified, the entire log
     *         file is returned up to a maximum of 10000 lines, starting with
     *         the most recent log entries first.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If NumberOfLines is specified and Marker isn't specified, then
     *         the most recent lines from the end of the log file are returned.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If Marker is specified as "0", then the specified number of lines
     *         from the beginning of the log file are returned.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can download the log file in blocks of lines by specifying
     *         the size of the block using the NumberOfLines parameter, and by
     *         specifying a value of "0" for the Marker parameter in your first
     *         request. Include the Marker value returned in the response as the
     *         Marker value for the next request, continuing until the
     *         AdditionalDataPending response element returns false.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Integer getNumberOfLines() {
        return numberOfLines;
    }

    /**
     * <p>
     * The number of lines to download. If the number of lines specified results
     * in a file over 1 MB in size, the file is truncated at 1 MB in size.
     * </p>
     * <p>
     * If the NumberOfLines parameter is specified, then the block of lines
     * returned can be from the beginning or the end of the log file, depending
     * on the value of the Marker parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If neither Marker or NumberOfLines are specified, the entire log file is
     * returned up to a maximum of 10000 lines, starting with the most recent
     * log entries first.
     * </p>
     * </li>
     * <li>
     * <p>
     * If NumberOfLines is specified and Marker isn't specified, then the most
     * recent lines from the end of the log file are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * If Marker is specified as "0", then the specified number of lines from
     * the beginning of the log file are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can download the log file in blocks of lines by specifying the size
     * of the block using the NumberOfLines parameter, and by specifying a value
     * of "0" for the Marker parameter in your first request. Include the Marker
     * value returned in the response as the Marker value for the next request,
     * continuing until the AdditionalDataPending response element returns
     * false.
     * </p>
     * </li>
     * </ul>
     *
     * @param numberOfLines <p>
     *            The number of lines to download. If the number of lines
     *            specified results in a file over 1 MB in size, the file is
     *            truncated at 1 MB in size.
     *            </p>
     *            <p>
     *            If the NumberOfLines parameter is specified, then the block of
     *            lines returned can be from the beginning or the end of the log
     *            file, depending on the value of the Marker parameter.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If neither Marker or NumberOfLines are specified, the entire
     *            log file is returned up to a maximum of 10000 lines, starting
     *            with the most recent log entries first.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If NumberOfLines is specified and Marker isn't specified, then
     *            the most recent lines from the end of the log file are
     *            returned.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If Marker is specified as "0", then the specified number of
     *            lines from the beginning of the log file are returned.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You can download the log file in blocks of lines by specifying
     *            the size of the block using the NumberOfLines parameter, and
     *            by specifying a value of "0" for the Marker parameter in your
     *            first request. Include the Marker value returned in the
     *            response as the Marker value for the next request, continuing
     *            until the AdditionalDataPending response element returns
     *            false.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setNumberOfLines(Integer numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    /**
     * <p>
     * The number of lines to download. If the number of lines specified results
     * in a file over 1 MB in size, the file is truncated at 1 MB in size.
     * </p>
     * <p>
     * If the NumberOfLines parameter is specified, then the block of lines
     * returned can be from the beginning or the end of the log file, depending
     * on the value of the Marker parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If neither Marker or NumberOfLines are specified, the entire log file is
     * returned up to a maximum of 10000 lines, starting with the most recent
     * log entries first.
     * </p>
     * </li>
     * <li>
     * <p>
     * If NumberOfLines is specified and Marker isn't specified, then the most
     * recent lines from the end of the log file are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * If Marker is specified as "0", then the specified number of lines from
     * the beginning of the log file are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can download the log file in blocks of lines by specifying the size
     * of the block using the NumberOfLines parameter, and by specifying a value
     * of "0" for the Marker parameter in your first request. Include the Marker
     * value returned in the response as the Marker value for the next request,
     * continuing until the AdditionalDataPending response element returns
     * false.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfLines <p>
     *            The number of lines to download. If the number of lines
     *            specified results in a file over 1 MB in size, the file is
     *            truncated at 1 MB in size.
     *            </p>
     *            <p>
     *            If the NumberOfLines parameter is specified, then the block of
     *            lines returned can be from the beginning or the end of the log
     *            file, depending on the value of the Marker parameter.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If neither Marker or NumberOfLines are specified, the entire
     *            log file is returned up to a maximum of 10000 lines, starting
     *            with the most recent log entries first.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If NumberOfLines is specified and Marker isn't specified, then
     *            the most recent lines from the end of the log file are
     *            returned.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If Marker is specified as "0", then the specified number of
     *            lines from the beginning of the log file are returned.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You can download the log file in blocks of lines by specifying
     *            the size of the block using the NumberOfLines parameter, and
     *            by specifying a value of "0" for the Marker parameter in your
     *            first request. Include the Marker value returned in the
     *            response as the Marker value for the next request, continuing
     *            until the AdditionalDataPending response element returns
     *            false.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DownloadDBLogFilePortionRequest withNumberOfLines(Integer numberOfLines) {
        this.numberOfLines = numberOfLines;
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
        if (getLogFileName() != null)
            sb.append("LogFileName: " + getLogFileName() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getNumberOfLines() != null)
            sb.append("NumberOfLines: " + getNumberOfLines());
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
                + ((getLogFileName() == null) ? 0 : getLogFileName().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfLines() == null) ? 0 : getNumberOfLines().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DownloadDBLogFilePortionRequest == false)
            return false;
        DownloadDBLogFilePortionRequest other = (DownloadDBLogFilePortionRequest) obj;

        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null
                && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getLogFileName() == null ^ this.getLogFileName() == null)
            return false;
        if (other.getLogFileName() != null
                && other.getLogFileName().equals(this.getLogFileName()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getNumberOfLines() == null ^ this.getNumberOfLines() == null)
            return false;
        if (other.getNumberOfLines() != null
                && other.getNumberOfLines().equals(this.getNumberOfLines()) == false)
            return false;
        return true;
    }
}
