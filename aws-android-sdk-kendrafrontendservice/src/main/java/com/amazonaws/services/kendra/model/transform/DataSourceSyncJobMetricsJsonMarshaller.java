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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DataSourceSyncJobMetrics
 */
class DataSourceSyncJobMetricsJsonMarshaller {

    public void marshall(DataSourceSyncJobMetrics dataSourceSyncJobMetrics, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (dataSourceSyncJobMetrics.getDocumentsAdded() != null) {
            String documentsAdded = dataSourceSyncJobMetrics.getDocumentsAdded();
            jsonWriter.name("DocumentsAdded");
            jsonWriter.value(documentsAdded);
        }
        if (dataSourceSyncJobMetrics.getDocumentsModified() != null) {
            String documentsModified = dataSourceSyncJobMetrics.getDocumentsModified();
            jsonWriter.name("DocumentsModified");
            jsonWriter.value(documentsModified);
        }
        if (dataSourceSyncJobMetrics.getDocumentsDeleted() != null) {
            String documentsDeleted = dataSourceSyncJobMetrics.getDocumentsDeleted();
            jsonWriter.name("DocumentsDeleted");
            jsonWriter.value(documentsDeleted);
        }
        if (dataSourceSyncJobMetrics.getDocumentsFailed() != null) {
            String documentsFailed = dataSourceSyncJobMetrics.getDocumentsFailed();
            jsonWriter.name("DocumentsFailed");
            jsonWriter.value(documentsFailed);
        }
        if (dataSourceSyncJobMetrics.getDocumentsScanned() != null) {
            String documentsScanned = dataSourceSyncJobMetrics.getDocumentsScanned();
            jsonWriter.name("DocumentsScanned");
            jsonWriter.value(documentsScanned);
        }
        jsonWriter.endObject();
    }

    private static DataSourceSyncJobMetricsJsonMarshaller instance;

    public static DataSourceSyncJobMetricsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DataSourceSyncJobMetricsJsonMarshaller();
        return instance;
    }
}
