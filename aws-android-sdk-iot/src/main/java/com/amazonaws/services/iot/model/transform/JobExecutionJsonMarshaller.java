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
 * JSON marshaller for POJO JobExecution
 */
class JobExecutionJsonMarshaller {

    public void marshall(JobExecution jobExecution, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (jobExecution.getJobId() != null) {
            String jobId = jobExecution.getJobId();
            jsonWriter.name("jobId");
            jsonWriter.value(jobId);
        }
        if (jobExecution.getStatus() != null) {
            String status = jobExecution.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (jobExecution.getForceCanceled() != null) {
            Boolean forceCanceled = jobExecution.getForceCanceled();
            jsonWriter.name("forceCanceled");
            jsonWriter.value(forceCanceled);
        }
        if (jobExecution.getStatusDetails() != null) {
            JobExecutionStatusDetails statusDetails = jobExecution.getStatusDetails();
            jsonWriter.name("statusDetails");
            JobExecutionStatusDetailsJsonMarshaller.getInstance().marshall(statusDetails,
                    jsonWriter);
        }
        if (jobExecution.getThingArn() != null) {
            String thingArn = jobExecution.getThingArn();
            jsonWriter.name("thingArn");
            jsonWriter.value(thingArn);
        }
        if (jobExecution.getQueuedAt() != null) {
            java.util.Date queuedAt = jobExecution.getQueuedAt();
            jsonWriter.name("queuedAt");
            jsonWriter.value(queuedAt);
        }
        if (jobExecution.getStartedAt() != null) {
            java.util.Date startedAt = jobExecution.getStartedAt();
            jsonWriter.name("startedAt");
            jsonWriter.value(startedAt);
        }
        if (jobExecution.getLastUpdatedAt() != null) {
            java.util.Date lastUpdatedAt = jobExecution.getLastUpdatedAt();
            jsonWriter.name("lastUpdatedAt");
            jsonWriter.value(lastUpdatedAt);
        }
        if (jobExecution.getExecutionNumber() != null) {
            Long executionNumber = jobExecution.getExecutionNumber();
            jsonWriter.name("executionNumber");
            jsonWriter.value(executionNumber);
        }
        if (jobExecution.getVersionNumber() != null) {
            Long versionNumber = jobExecution.getVersionNumber();
            jsonWriter.name("versionNumber");
            jsonWriter.value(versionNumber);
        }
        if (jobExecution.getApproximateSecondsBeforeTimedOut() != null) {
            Long approximateSecondsBeforeTimedOut = jobExecution
                    .getApproximateSecondsBeforeTimedOut();
            jsonWriter.name("approximateSecondsBeforeTimedOut");
            jsonWriter.value(approximateSecondsBeforeTimedOut);
        }
        jsonWriter.endObject();
    }

    private static JobExecutionJsonMarshaller instance;

    public static JobExecutionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobExecutionJsonMarshaller();
        return instance;
    }
}
