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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ProcessingJobSummary
 */
class ProcessingJobSummaryJsonMarshaller {

    public void marshall(ProcessingJobSummary processingJobSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (processingJobSummary.getProcessingJobName() != null) {
            String processingJobName = processingJobSummary.getProcessingJobName();
            jsonWriter.name("ProcessingJobName");
            jsonWriter.value(processingJobName);
        }
        if (processingJobSummary.getProcessingJobArn() != null) {
            String processingJobArn = processingJobSummary.getProcessingJobArn();
            jsonWriter.name("ProcessingJobArn");
            jsonWriter.value(processingJobArn);
        }
        if (processingJobSummary.getCreationTime() != null) {
            java.util.Date creationTime = processingJobSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (processingJobSummary.getProcessingEndTime() != null) {
            java.util.Date processingEndTime = processingJobSummary.getProcessingEndTime();
            jsonWriter.name("ProcessingEndTime");
            jsonWriter.value(processingEndTime);
        }
        if (processingJobSummary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = processingJobSummary.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (processingJobSummary.getProcessingJobStatus() != null) {
            String processingJobStatus = processingJobSummary.getProcessingJobStatus();
            jsonWriter.name("ProcessingJobStatus");
            jsonWriter.value(processingJobStatus);
        }
        if (processingJobSummary.getFailureReason() != null) {
            String failureReason = processingJobSummary.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        if (processingJobSummary.getExitMessage() != null) {
            String exitMessage = processingJobSummary.getExitMessage();
            jsonWriter.name("ExitMessage");
            jsonWriter.value(exitMessage);
        }
        jsonWriter.endObject();
    }

    private static ProcessingJobSummaryJsonMarshaller instance;

    public static ProcessingJobSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProcessingJobSummaryJsonMarshaller();
        return instance;
    }
}
