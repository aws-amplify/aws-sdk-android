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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful <a>GetCredentialReport</a> request.
 * </p>
 */
public class GetCredentialReportResult implements Serializable {
    /**
     * <p>
     * Contains the credential report. The report is Base64-encoded.
     * </p>
     */
    private java.nio.ByteBuffer content;

    /**
     * <p>
     * The format (MIME type) of the credential report.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>text/csv
     */
    private String reportFormat;

    /**
     * <p>
     * The date and time when the credential report was created, in <a
     * href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>.
     * </p>
     */
    private java.util.Date generatedTime;

    /**
     * <p>
     * Contains the credential report. The report is Base64-encoded.
     * </p>
     *
     * @return <p>
     *         Contains the credential report. The report is Base64-encoded.
     *         </p>
     */
    public java.nio.ByteBuffer getContent() {
        return content;
    }

    /**
     * <p>
     * Contains the credential report. The report is Base64-encoded.
     * </p>
     *
     * @param content <p>
     *            Contains the credential report. The report is Base64-encoded.
     *            </p>
     */
    public void setContent(java.nio.ByteBuffer content) {
        this.content = content;
    }

    /**
     * <p>
     * Contains the credential report. The report is Base64-encoded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param content <p>
     *            Contains the credential report. The report is Base64-encoded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCredentialReportResult withContent(java.nio.ByteBuffer content) {
        this.content = content;
        return this;
    }

    /**
     * <p>
     * The format (MIME type) of the credential report.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>text/csv
     *
     * @return <p>
     *         The format (MIME type) of the credential report.
     *         </p>
     * @see ReportFormatType
     */
    public String getReportFormat() {
        return reportFormat;
    }

    /**
     * <p>
     * The format (MIME type) of the credential report.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>text/csv
     *
     * @param reportFormat <p>
     *            The format (MIME type) of the credential report.
     *            </p>
     * @see ReportFormatType
     */
    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

    /**
     * <p>
     * The format (MIME type) of the credential report.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>text/csv
     *
     * @param reportFormat <p>
     *            The format (MIME type) of the credential report.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReportFormatType
     */
    public GetCredentialReportResult withReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
        return this;
    }

    /**
     * <p>
     * The format (MIME type) of the credential report.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>text/csv
     *
     * @param reportFormat <p>
     *            The format (MIME type) of the credential report.
     *            </p>
     * @see ReportFormatType
     */
    public void setReportFormat(ReportFormatType reportFormat) {
        this.reportFormat = reportFormat.toString();
    }

    /**
     * <p>
     * The format (MIME type) of the credential report.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>text/csv
     *
     * @param reportFormat <p>
     *            The format (MIME type) of the credential report.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReportFormatType
     */
    public GetCredentialReportResult withReportFormat(ReportFormatType reportFormat) {
        this.reportFormat = reportFormat.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the credential report was created, in <a
     * href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>.
     * </p>
     *
     * @return <p>
     *         The date and time when the credential report was created, in <a
     *         href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *         format</a>.
     *         </p>
     */
    public java.util.Date getGeneratedTime() {
        return generatedTime;
    }

    /**
     * <p>
     * The date and time when the credential report was created, in <a
     * href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>.
     * </p>
     *
     * @param generatedTime <p>
     *            The date and time when the credential report was created, in
     *            <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>.
     *            </p>
     */
    public void setGeneratedTime(java.util.Date generatedTime) {
        this.generatedTime = generatedTime;
    }

    /**
     * <p>
     * The date and time when the credential report was created, in <a
     * href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param generatedTime <p>
     *            The date and time when the credential report was created, in
     *            <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCredentialReportResult withGeneratedTime(java.util.Date generatedTime) {
        this.generatedTime = generatedTime;
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
        if (getContent() != null)
            sb.append("Content: " + getContent() + ",");
        if (getReportFormat() != null)
            sb.append("ReportFormat: " + getReportFormat() + ",");
        if (getGeneratedTime() != null)
            sb.append("GeneratedTime: " + getGeneratedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode
                + ((getReportFormat() == null) ? 0 : getReportFormat().hashCode());
        hashCode = prime * hashCode
                + ((getGeneratedTime() == null) ? 0 : getGeneratedTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCredentialReportResult == false)
            return false;
        GetCredentialReportResult other = (GetCredentialReportResult) obj;

        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getReportFormat() == null ^ this.getReportFormat() == null)
            return false;
        if (other.getReportFormat() != null
                && other.getReportFormat().equals(this.getReportFormat()) == false)
            return false;
        if (other.getGeneratedTime() == null ^ this.getGeneratedTime() == null)
            return false;
        if (other.getGeneratedTime() != null
                && other.getGeneratedTime().equals(this.getGeneratedTime()) == false)
            return false;
        return true;
    }
}
