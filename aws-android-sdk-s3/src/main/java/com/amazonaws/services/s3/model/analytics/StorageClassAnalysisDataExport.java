/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.model.analytics;

import java.io.Serializable;

/**
 * The StorageClassAnalysisDataExport class.
 */
public class StorageClassAnalysisDataExport implements Serializable {
    private String outputSchemaVersion;
    private AnalyticsExportDestination destination;

    /**
     * Sets the version of the output schema to use when exporting data.
     * @param outputSchemaVersion the output schema version.
     */
    public void setOutputSchemaVersion(StorageClassAnalysisSchemaVersion outputSchemaVersion) {
        if (outputSchemaVersion == null) {
            setOutputSchemaVersion((String) null);
        } else {
            setOutputSchemaVersion(outputSchemaVersion.toString());
        }
    }

    /**
     * Sets the version of the output schema to use when exporting data.
     * @param outputSchemaVersion the output schema version.
     * @return this object for method chaining.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public StorageClassAnalysisDataExport withOutputSchemaVersion(StorageClassAnalysisSchemaVersion outputSchemaVersion) {
        setOutputSchemaVersion(outputSchemaVersion);
        return this;
    }

    /**
     * @return the version of the output schema to use when exporting data.
     */
    public String getOutputSchemaVersion() {
        return outputSchemaVersion;
    }

    /**
     * Sets the version of the output schema to use when exporting data.
     * @param outputSchemaVersion the output schema version.
     */
    public void setOutputSchemaVersion(String outputSchemaVersion) {
        this.outputSchemaVersion = outputSchemaVersion;
    }

    /**
     * Sets the version of the output schema to use when exporting data
     * @param outputSchemaVersion the output schema version.
     * @return this object for method chaining.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public StorageClassAnalysisDataExport withOutputSchemaVersion(String outputSchemaVersion) {
        setOutputSchemaVersion(outputSchemaVersion);
        return this;
    }

    /**
     * @return the place to store the data for an analysis.
     */
    public AnalyticsExportDestination getDestination() {
        return destination;
    }

    /**
     * Sets the place to store the data for an analysis.
     * @param destination the destination to store the data.
     */
    public void setDestination(AnalyticsExportDestination destination) {
        this.destination = destination;
    }

    /**
     * Sets the place to store the data for an analysis
     * @param destination the destination to store the data.
     * @return this object for method chaining.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public StorageClassAnalysisDataExport withDestination(AnalyticsExportDestination destination) {
        setDestination(destination);
        return this;
    }
}
