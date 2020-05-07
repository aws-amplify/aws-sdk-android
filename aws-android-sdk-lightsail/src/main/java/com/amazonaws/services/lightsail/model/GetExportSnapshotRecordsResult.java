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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

public class GetExportSnapshotRecordsResult implements Serializable {
    /**
     * <p>
     * A list of objects describing the export snapshot records.
     * </p>
     */
    private java.util.List<ExportSnapshotRecord> exportSnapshotRecords;

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another
     * <code>GetExportSnapshotRecords</code> request and specify the next page
     * token using the <code>pageToken</code> parameter.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * A list of objects describing the export snapshot records.
     * </p>
     *
     * @return <p>
     *         A list of objects describing the export snapshot records.
     *         </p>
     */
    public java.util.List<ExportSnapshotRecord> getExportSnapshotRecords() {
        return exportSnapshotRecords;
    }

    /**
     * <p>
     * A list of objects describing the export snapshot records.
     * </p>
     *
     * @param exportSnapshotRecords <p>
     *            A list of objects describing the export snapshot records.
     *            </p>
     */
    public void setExportSnapshotRecords(
            java.util.Collection<ExportSnapshotRecord> exportSnapshotRecords) {
        if (exportSnapshotRecords == null) {
            this.exportSnapshotRecords = null;
            return;
        }

        this.exportSnapshotRecords = new java.util.ArrayList<ExportSnapshotRecord>(
                exportSnapshotRecords);
    }

    /**
     * <p>
     * A list of objects describing the export snapshot records.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportSnapshotRecords <p>
     *            A list of objects describing the export snapshot records.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExportSnapshotRecordsResult withExportSnapshotRecords(
            ExportSnapshotRecord... exportSnapshotRecords) {
        if (getExportSnapshotRecords() == null) {
            this.exportSnapshotRecords = new java.util.ArrayList<ExportSnapshotRecord>(
                    exportSnapshotRecords.length);
        }
        for (ExportSnapshotRecord value : exportSnapshotRecords) {
            this.exportSnapshotRecords.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects describing the export snapshot records.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportSnapshotRecords <p>
     *            A list of objects describing the export snapshot records.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExportSnapshotRecordsResult withExportSnapshotRecords(
            java.util.Collection<ExportSnapshotRecord> exportSnapshotRecords) {
        setExportSnapshotRecords(exportSnapshotRecords);
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another
     * <code>GetExportSnapshotRecords</code> request and specify the next page
     * token using the <code>pageToken</code> parameter.
     * </p>
     *
     * @return <p>
     *         The token to advance to the next page of resutls from your
     *         request.
     *         </p>
     *         <p>
     *         A next page token is not returned if there are no more results to
     *         display.
     *         </p>
     *         <p>
     *         To get the next page of results, perform another
     *         <code>GetExportSnapshotRecords</code> request and specify the
     *         next page token using the <code>pageToken</code> parameter.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another
     * <code>GetExportSnapshotRecords</code> request and specify the next page
     * token using the <code>pageToken</code> parameter.
     * </p>
     *
     * @param nextPageToken <p>
     *            The token to advance to the next page of resutls from your
     *            request.
     *            </p>
     *            <p>
     *            A next page token is not returned if there are no more results
     *            to display.
     *            </p>
     *            <p>
     *            To get the next page of results, perform another
     *            <code>GetExportSnapshotRecords</code> request and specify the
     *            next page token using the <code>pageToken</code> parameter.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another
     * <code>GetExportSnapshotRecords</code> request and specify the next page
     * token using the <code>pageToken</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextPageToken <p>
     *            The token to advance to the next page of resutls from your
     *            request.
     *            </p>
     *            <p>
     *            A next page token is not returned if there are no more results
     *            to display.
     *            </p>
     *            <p>
     *            To get the next page of results, perform another
     *            <code>GetExportSnapshotRecords</code> request and specify the
     *            next page token using the <code>pageToken</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExportSnapshotRecordsResult withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
        if (getExportSnapshotRecords() != null)
            sb.append("exportSnapshotRecords: " + getExportSnapshotRecords() + ",");
        if (getNextPageToken() != null)
            sb.append("nextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getExportSnapshotRecords() == null) ? 0 : getExportSnapshotRecords().hashCode());
        hashCode = prime * hashCode
                + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExportSnapshotRecordsResult == false)
            return false;
        GetExportSnapshotRecordsResult other = (GetExportSnapshotRecordsResult) obj;

        if (other.getExportSnapshotRecords() == null ^ this.getExportSnapshotRecords() == null)
            return false;
        if (other.getExportSnapshotRecords() != null
                && other.getExportSnapshotRecords().equals(this.getExportSnapshotRecords()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
