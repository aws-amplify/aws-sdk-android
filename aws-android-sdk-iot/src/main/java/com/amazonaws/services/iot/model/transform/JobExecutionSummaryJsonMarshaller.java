/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JobExecutionSummary
 */
class JobExecutionSummaryJsonMarshaller {

    public void marshall(JobExecutionSummary jobExecutionSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (jobExecutionSummary.getStatus() != null) {
            String status = jobExecutionSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (jobExecutionSummary.getQueuedAt() != null) {
            java.util.Date queuedAt = jobExecutionSummary.getQueuedAt();
            jsonWriter.name("queuedAt");
            jsonWriter.value(queuedAt);
        }
        if (jobExecutionSummary.getStartedAt() != null) {
            java.util.Date startedAt = jobExecutionSummary.getStartedAt();
            jsonWriter.name("startedAt");
            jsonWriter.value(startedAt);
        }
        if (jobExecutionSummary.getLastUpdatedAt() != null) {
            java.util.Date lastUpdatedAt = jobExecutionSummary.getLastUpdatedAt();
            jsonWriter.name("lastUpdatedAt");
            jsonWriter.value(lastUpdatedAt);
        }
        if (jobExecutionSummary.getExecutionNumber() != null) {
            Long executionNumber = jobExecutionSummary.getExecutionNumber();
            jsonWriter.name("executionNumber");
            jsonWriter.value(executionNumber);
        }
        jsonWriter.endObject();
    }

    private static JobExecutionSummaryJsonMarshaller instance;

    public static JobExecutionSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobExecutionSummaryJsonMarshaller();
        return instance;
    }
}
