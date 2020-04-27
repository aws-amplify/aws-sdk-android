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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MonitoringExecutionSummary
 */
class MonitoringExecutionSummaryJsonMarshaller {

    public void marshall(MonitoringExecutionSummary monitoringExecutionSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (monitoringExecutionSummary.getMonitoringScheduleName() != null) {
            String monitoringScheduleName = monitoringExecutionSummary.getMonitoringScheduleName();
            jsonWriter.name("MonitoringScheduleName");
            jsonWriter.value(monitoringScheduleName);
        }
        if (monitoringExecutionSummary.getScheduledTime() != null) {
            java.util.Date scheduledTime = monitoringExecutionSummary.getScheduledTime();
            jsonWriter.name("ScheduledTime");
            jsonWriter.value(scheduledTime);
        }
        if (monitoringExecutionSummary.getCreationTime() != null) {
            java.util.Date creationTime = monitoringExecutionSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (monitoringExecutionSummary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = monitoringExecutionSummary.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (monitoringExecutionSummary.getMonitoringExecutionStatus() != null) {
            String monitoringExecutionStatus = monitoringExecutionSummary
                    .getMonitoringExecutionStatus();
            jsonWriter.name("MonitoringExecutionStatus");
            jsonWriter.value(monitoringExecutionStatus);
        }
        if (monitoringExecutionSummary.getProcessingJobArn() != null) {
            String processingJobArn = monitoringExecutionSummary.getProcessingJobArn();
            jsonWriter.name("ProcessingJobArn");
            jsonWriter.value(processingJobArn);
        }
        if (monitoringExecutionSummary.getEndpointName() != null) {
            String endpointName = monitoringExecutionSummary.getEndpointName();
            jsonWriter.name("EndpointName");
            jsonWriter.value(endpointName);
        }
        if (monitoringExecutionSummary.getFailureReason() != null) {
            String failureReason = monitoringExecutionSummary.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        jsonWriter.endObject();
    }

    private static MonitoringExecutionSummaryJsonMarshaller instance;

    public static MonitoringExecutionSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MonitoringExecutionSummaryJsonMarshaller();
        return instance;
    }
}
