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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the location where the run of a report is exported.
 * </p>
 */
public class ReportExportConfig implements Serializable {
    /**
     * <p>
     * The export configuration type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code>: The report results are exported to an S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_EXPORT</code>: The report results are not exported.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, NO_EXPORT
     */
    private String exportConfigType;

    /**
     * <p>
     * A <code>S3ReportExportConfig</code> object that contains information
     * about the S3 bucket where the run of a report is exported.
     * </p>
     */
    private S3ReportExportConfig s3Destination;

    /**
     * <p>
     * The export configuration type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code>: The report results are exported to an S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_EXPORT</code>: The report results are not exported.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, NO_EXPORT
     *
     * @return <p>
     *         The export configuration type. Valid values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>S3</code>: The report results are exported to an S3 bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NO_EXPORT</code>: The report results are not exported.
     *         </p>
     *         </li>
     *         </ul>
     * @see ReportExportConfigType
     */
    public String getExportConfigType() {
        return exportConfigType;
    }

    /**
     * <p>
     * The export configuration type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code>: The report results are exported to an S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_EXPORT</code>: The report results are not exported.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, NO_EXPORT
     *
     * @param exportConfigType <p>
     *            The export configuration type. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>S3</code>: The report results are exported to an S3
     *            bucket.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NO_EXPORT</code>: The report results are not exported.
     *            </p>
     *            </li>
     *            </ul>
     * @see ReportExportConfigType
     */
    public void setExportConfigType(String exportConfigType) {
        this.exportConfigType = exportConfigType;
    }

    /**
     * <p>
     * The export configuration type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code>: The report results are exported to an S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_EXPORT</code>: The report results are not exported.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, NO_EXPORT
     *
     * @param exportConfigType <p>
     *            The export configuration type. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>S3</code>: The report results are exported to an S3
     *            bucket.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NO_EXPORT</code>: The report results are not exported.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReportExportConfigType
     */
    public ReportExportConfig withExportConfigType(String exportConfigType) {
        this.exportConfigType = exportConfigType;
        return this;
    }

    /**
     * <p>
     * The export configuration type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code>: The report results are exported to an S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_EXPORT</code>: The report results are not exported.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, NO_EXPORT
     *
     * @param exportConfigType <p>
     *            The export configuration type. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>S3</code>: The report results are exported to an S3
     *            bucket.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NO_EXPORT</code>: The report results are not exported.
     *            </p>
     *            </li>
     *            </ul>
     * @see ReportExportConfigType
     */
    public void setExportConfigType(ReportExportConfigType exportConfigType) {
        this.exportConfigType = exportConfigType.toString();
    }

    /**
     * <p>
     * The export configuration type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code>: The report results are exported to an S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_EXPORT</code>: The report results are not exported.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, NO_EXPORT
     *
     * @param exportConfigType <p>
     *            The export configuration type. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>S3</code>: The report results are exported to an S3
     *            bucket.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NO_EXPORT</code>: The report results are not exported.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReportExportConfigType
     */
    public ReportExportConfig withExportConfigType(ReportExportConfigType exportConfigType) {
        this.exportConfigType = exportConfigType.toString();
        return this;
    }

    /**
     * <p>
     * A <code>S3ReportExportConfig</code> object that contains information
     * about the S3 bucket where the run of a report is exported.
     * </p>
     *
     * @return <p>
     *         A <code>S3ReportExportConfig</code> object that contains
     *         information about the S3 bucket where the run of a report is
     *         exported.
     *         </p>
     */
    public S3ReportExportConfig getS3Destination() {
        return s3Destination;
    }

    /**
     * <p>
     * A <code>S3ReportExportConfig</code> object that contains information
     * about the S3 bucket where the run of a report is exported.
     * </p>
     *
     * @param s3Destination <p>
     *            A <code>S3ReportExportConfig</code> object that contains
     *            information about the S3 bucket where the run of a report is
     *            exported.
     *            </p>
     */
    public void setS3Destination(S3ReportExportConfig s3Destination) {
        this.s3Destination = s3Destination;
    }

    /**
     * <p>
     * A <code>S3ReportExportConfig</code> object that contains information
     * about the S3 bucket where the run of a report is exported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Destination <p>
     *            A <code>S3ReportExportConfig</code> object that contains
     *            information about the S3 bucket where the run of a report is
     *            exported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReportExportConfig withS3Destination(S3ReportExportConfig s3Destination) {
        this.s3Destination = s3Destination;
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
        if (getExportConfigType() != null)
            sb.append("exportConfigType: " + getExportConfigType() + ",");
        if (getS3Destination() != null)
            sb.append("s3Destination: " + getS3Destination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getExportConfigType() == null) ? 0 : getExportConfigType().hashCode());
        hashCode = prime * hashCode
                + ((getS3Destination() == null) ? 0 : getS3Destination().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportExportConfig == false)
            return false;
        ReportExportConfig other = (ReportExportConfig) obj;

        if (other.getExportConfigType() == null ^ this.getExportConfigType() == null)
            return false;
        if (other.getExportConfigType() != null
                && other.getExportConfigType().equals(this.getExportConfigType()) == false)
            return false;
        if (other.getS3Destination() == null ^ this.getS3Destination() == null)
            return false;
        if (other.getS3Destination() != null
                && other.getS3Destination().equals(this.getS3Destination()) == false)
            return false;
        return true;
    }
}
