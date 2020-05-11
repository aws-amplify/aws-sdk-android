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
 * JSON marshaller for POJO DataSourceSyncJob
 */
class DataSourceSyncJobJsonMarshaller {

    public void marshall(DataSourceSyncJob dataSourceSyncJob, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (dataSourceSyncJob.getExecutionId() != null) {
            String executionId = dataSourceSyncJob.getExecutionId();
            jsonWriter.name("ExecutionId");
            jsonWriter.value(executionId);
        }
        if (dataSourceSyncJob.getStartTime() != null) {
            java.util.Date startTime = dataSourceSyncJob.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (dataSourceSyncJob.getEndTime() != null) {
            java.util.Date endTime = dataSourceSyncJob.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (dataSourceSyncJob.getStatus() != null) {
            String status = dataSourceSyncJob.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (dataSourceSyncJob.getErrorMessage() != null) {
            String errorMessage = dataSourceSyncJob.getErrorMessage();
            jsonWriter.name("ErrorMessage");
            jsonWriter.value(errorMessage);
        }
        if (dataSourceSyncJob.getErrorCode() != null) {
            String errorCode = dataSourceSyncJob.getErrorCode();
            jsonWriter.name("ErrorCode");
            jsonWriter.value(errorCode);
        }
        if (dataSourceSyncJob.getDataSourceErrorCode() != null) {
            String dataSourceErrorCode = dataSourceSyncJob.getDataSourceErrorCode();
            jsonWriter.name("DataSourceErrorCode");
            jsonWriter.value(dataSourceErrorCode);
        }
        if (dataSourceSyncJob.getMetrics() != null) {
            DataSourceSyncJobMetrics metrics = dataSourceSyncJob.getMetrics();
            jsonWriter.name("Metrics");
            DataSourceSyncJobMetricsJsonMarshaller.getInstance().marshall(metrics, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DataSourceSyncJobJsonMarshaller instance;

    public static DataSourceSyncJobJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DataSourceSyncJobJsonMarshaller();
        return instance;
    }
}
