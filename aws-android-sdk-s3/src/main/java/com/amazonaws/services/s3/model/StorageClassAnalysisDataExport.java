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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Container for data related to the storage class analysis for an Amazon S3
 * bucket for export.
 * </p>
 */
public class StorageClassAnalysisDataExport implements Serializable {
    /**
     * <p>
     * The version of the output schema to use when exporting data. Must be
     * <code>V_1</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>V_1
     */
    private String outputSchemaVersion;

    /**
     * <p>
     * The place to store the data for an analysis.
     * </p>
     */
    private AnalyticsExportDestination destination;

    /**
     * <p>
     * The version of the output schema to use when exporting data. Must be
     * <code>V_1</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>V_1
     *
     * @return <p>
     *         The version of the output schema to use when exporting data. Must
     *         be <code>V_1</code>.
     *         </p>
     * @see StorageClassAnalysisSchemaVersion
     */
    public String getOutputSchemaVersion() {
        return outputSchemaVersion;
    }

    /**
     * <p>
     * The version of the output schema to use when exporting data. Must be
     * <code>V_1</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>V_1
     *
     * @param outputSchemaVersion <p>
     *            The version of the output schema to use when exporting data.
     *            Must be <code>V_1</code>.
     *            </p>
     * @see StorageClassAnalysisSchemaVersion
     */
    public void setOutputSchemaVersion(String outputSchemaVersion) {
        this.outputSchemaVersion = outputSchemaVersion;
    }

    /**
     * <p>
     * The version of the output schema to use when exporting data. Must be
     * <code>V_1</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>V_1
     *
     * @param outputSchemaVersion <p>
     *            The version of the output schema to use when exporting data.
     *            Must be <code>V_1</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageClassAnalysisSchemaVersion
     */
    public StorageClassAnalysisDataExport withOutputSchemaVersion(String outputSchemaVersion) {
        this.outputSchemaVersion = outputSchemaVersion;
        return this;
    }

    /**
     * <p>
     * The version of the output schema to use when exporting data. Must be
     * <code>V_1</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>V_1
     *
     * @param outputSchemaVersion <p>
     *            The version of the output schema to use when exporting data.
     *            Must be <code>V_1</code>.
     *            </p>
     * @see StorageClassAnalysisSchemaVersion
     */
    public void setOutputSchemaVersion(StorageClassAnalysisSchemaVersion outputSchemaVersion) {
        this.outputSchemaVersion = outputSchemaVersion.toString();
    }

    /**
     * <p>
     * The version of the output schema to use when exporting data. Must be
     * <code>V_1</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>V_1
     *
     * @param outputSchemaVersion <p>
     *            The version of the output schema to use when exporting data.
     *            Must be <code>V_1</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageClassAnalysisSchemaVersion
     */
    public StorageClassAnalysisDataExport withOutputSchemaVersion(
            StorageClassAnalysisSchemaVersion outputSchemaVersion) {
        this.outputSchemaVersion = outputSchemaVersion.toString();
        return this;
    }

    /**
     * <p>
     * The place to store the data for an analysis.
     * </p>
     *
     * @return <p>
     *         The place to store the data for an analysis.
     *         </p>
     */
    public AnalyticsExportDestination getDestination() {
        return destination;
    }

    /**
     * <p>
     * The place to store the data for an analysis.
     * </p>
     *
     * @param destination <p>
     *            The place to store the data for an analysis.
     *            </p>
     */
    public void setDestination(AnalyticsExportDestination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The place to store the data for an analysis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destination <p>
     *            The place to store the data for an analysis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorageClassAnalysisDataExport withDestination(AnalyticsExportDestination destination) {
        this.destination = destination;
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
        if (getOutputSchemaVersion() != null)
            sb.append("OutputSchemaVersion: " + getOutputSchemaVersion() + ",");
        if (getDestination() != null)
            sb.append("Destination: " + getDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOutputSchemaVersion() == null) ? 0 : getOutputSchemaVersion().hashCode());
        hashCode = prime * hashCode
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageClassAnalysisDataExport == false)
            return false;
        StorageClassAnalysisDataExport other = (StorageClassAnalysisDataExport) obj;

        if (other.getOutputSchemaVersion() == null ^ this.getOutputSchemaVersion() == null)
            return false;
        if (other.getOutputSchemaVersion() != null
                && other.getOutputSchemaVersion().equals(this.getOutputSchemaVersion()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null
                && other.getDestination().equals(this.getDestination()) == false)
            return false;
        return true;
    }
}
