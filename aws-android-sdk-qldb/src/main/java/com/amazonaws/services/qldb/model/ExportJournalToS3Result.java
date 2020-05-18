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

package com.amazonaws.services.qldb.model;

import java.io.Serializable;

public class ExportJournalToS3Result implements Serializable {
    /**
     * <p>
     * The unique ID that QLDB assigns to each journal export job.
     * </p>
     * <p>
     * To describe your export request and check the status of the job, you can
     * use <code>ExportId</code> to call <code>DescribeJournalS3Export</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     */
    private String exportId;

    /**
     * <p>
     * The unique ID that QLDB assigns to each journal export job.
     * </p>
     * <p>
     * To describe your export request and check the status of the job, you can
     * use <code>ExportId</code> to call <code>DescribeJournalS3Export</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @return <p>
     *         The unique ID that QLDB assigns to each journal export job.
     *         </p>
     *         <p>
     *         To describe your export request and check the status of the job,
     *         you can use <code>ExportId</code> to call
     *         <code>DescribeJournalS3Export</code>.
     *         </p>
     */
    public String getExportId() {
        return exportId;
    }

    /**
     * <p>
     * The unique ID that QLDB assigns to each journal export job.
     * </p>
     * <p>
     * To describe your export request and check the status of the job, you can
     * use <code>ExportId</code> to call <code>DescribeJournalS3Export</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @param exportId <p>
     *            The unique ID that QLDB assigns to each journal export job.
     *            </p>
     *            <p>
     *            To describe your export request and check the status of the
     *            job, you can use <code>ExportId</code> to call
     *            <code>DescribeJournalS3Export</code>.
     *            </p>
     */
    public void setExportId(String exportId) {
        this.exportId = exportId;
    }

    /**
     * <p>
     * The unique ID that QLDB assigns to each journal export job.
     * </p>
     * <p>
     * To describe your export request and check the status of the job, you can
     * use <code>ExportId</code> to call <code>DescribeJournalS3Export</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @param exportId <p>
     *            The unique ID that QLDB assigns to each journal export job.
     *            </p>
     *            <p>
     *            To describe your export request and check the status of the
     *            job, you can use <code>ExportId</code> to call
     *            <code>DescribeJournalS3Export</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportJournalToS3Result withExportId(String exportId) {
        this.exportId = exportId;
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
        if (getExportId() != null)
            sb.append("ExportId: " + getExportId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportId() == null) ? 0 : getExportId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportJournalToS3Result == false)
            return false;
        ExportJournalToS3Result other = (ExportJournalToS3Result) obj;

        if (other.getExportId() == null ^ this.getExportId() == null)
            return false;
        if (other.getExportId() != null && other.getExportId().equals(this.getExportId()) == false)
            return false;
        return true;
    }
}
