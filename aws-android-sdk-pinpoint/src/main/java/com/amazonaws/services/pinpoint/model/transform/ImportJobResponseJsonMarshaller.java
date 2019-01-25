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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ImportJobResponse
 */
class ImportJobResponseJsonMarshaller {

    public void marshall(ImportJobResponse importJobResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (importJobResponse.getApplicationId() != null) {
            String applicationId = importJobResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (importJobResponse.getCompletedPieces() != null) {
            Integer completedPieces = importJobResponse.getCompletedPieces();
            jsonWriter.name("CompletedPieces");
            jsonWriter.value(completedPieces);
        }
        if (importJobResponse.getCompletionDate() != null) {
            String completionDate = importJobResponse.getCompletionDate();
            jsonWriter.name("CompletionDate");
            jsonWriter.value(completionDate);
        }
        if (importJobResponse.getCreationDate() != null) {
            String creationDate = importJobResponse.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (importJobResponse.getDefinition() != null) {
            ImportJobResource definition = importJobResponse.getDefinition();
            jsonWriter.name("Definition");
            ImportJobResourceJsonMarshaller.getInstance().marshall(definition, jsonWriter);
        }
        if (importJobResponse.getFailedPieces() != null) {
            Integer failedPieces = importJobResponse.getFailedPieces();
            jsonWriter.name("FailedPieces");
            jsonWriter.value(failedPieces);
        }
        if (importJobResponse.getFailures() != null) {
            java.util.List<String> failures = importJobResponse.getFailures();
            jsonWriter.name("Failures");
            jsonWriter.beginArray();
            for (String failuresItem : failures) {
                if (failuresItem != null) {
                    jsonWriter.value(failuresItem);
                }
            }
            jsonWriter.endArray();
        }
        if (importJobResponse.getId() != null) {
            String id = importJobResponse.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (importJobResponse.getJobStatus() != null) {
            String jobStatus = importJobResponse.getJobStatus();
            jsonWriter.name("JobStatus");
            jsonWriter.value(jobStatus);
        }
        if (importJobResponse.getTotalFailures() != null) {
            Integer totalFailures = importJobResponse.getTotalFailures();
            jsonWriter.name("TotalFailures");
            jsonWriter.value(totalFailures);
        }
        if (importJobResponse.getTotalPieces() != null) {
            Integer totalPieces = importJobResponse.getTotalPieces();
            jsonWriter.name("TotalPieces");
            jsonWriter.value(totalPieces);
        }
        if (importJobResponse.getTotalProcessed() != null) {
            Integer totalProcessed = importJobResponse.getTotalProcessed();
            jsonWriter.name("TotalProcessed");
            jsonWriter.value(totalProcessed);
        }
        if (importJobResponse.getType() != null) {
            String type = importJobResponse.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static ImportJobResponseJsonMarshaller instance;

    public static ImportJobResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImportJobResponseJsonMarshaller();
        return instance;
    }
}
