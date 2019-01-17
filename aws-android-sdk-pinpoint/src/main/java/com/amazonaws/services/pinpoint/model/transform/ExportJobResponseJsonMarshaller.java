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
 * JSON marshaller for POJO ExportJobResponse
 */
class ExportJobResponseJsonMarshaller {

    public void marshall(ExportJobResponse exportJobResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (exportJobResponse.getApplicationId() != null) {
            String applicationId = exportJobResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (exportJobResponse.getCompletedPieces() != null) {
            Integer completedPieces = exportJobResponse.getCompletedPieces();
            jsonWriter.name("CompletedPieces");
            jsonWriter.value(completedPieces);
        }
        if (exportJobResponse.getCompletionDate() != null) {
            String completionDate = exportJobResponse.getCompletionDate();
            jsonWriter.name("CompletionDate");
            jsonWriter.value(completionDate);
        }
        if (exportJobResponse.getCreationDate() != null) {
            String creationDate = exportJobResponse.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (exportJobResponse.getDefinition() != null) {
            ExportJobResource definition = exportJobResponse.getDefinition();
            jsonWriter.name("Definition");
            ExportJobResourceJsonMarshaller.getInstance().marshall(definition, jsonWriter);
        }
        if (exportJobResponse.getFailedPieces() != null) {
            Integer failedPieces = exportJobResponse.getFailedPieces();
            jsonWriter.name("FailedPieces");
            jsonWriter.value(failedPieces);
        }
        if (exportJobResponse.getFailures() != null) {
            java.util.List<String> failures = exportJobResponse.getFailures();
            jsonWriter.name("Failures");
            jsonWriter.beginArray();
            for (String failuresItem : failures) {
                if (failuresItem != null) {
                    jsonWriter.value(failuresItem);
                }
            }
            jsonWriter.endArray();
        }
        if (exportJobResponse.getId() != null) {
            String id = exportJobResponse.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (exportJobResponse.getJobStatus() != null) {
            String jobStatus = exportJobResponse.getJobStatus();
            jsonWriter.name("JobStatus");
            jsonWriter.value(jobStatus);
        }
        if (exportJobResponse.getTotalFailures() != null) {
            Integer totalFailures = exportJobResponse.getTotalFailures();
            jsonWriter.name("TotalFailures");
            jsonWriter.value(totalFailures);
        }
        if (exportJobResponse.getTotalPieces() != null) {
            Integer totalPieces = exportJobResponse.getTotalPieces();
            jsonWriter.name("TotalPieces");
            jsonWriter.value(totalPieces);
        }
        if (exportJobResponse.getTotalProcessed() != null) {
            Integer totalProcessed = exportJobResponse.getTotalProcessed();
            jsonWriter.name("TotalProcessed");
            jsonWriter.value(totalProcessed);
        }
        if (exportJobResponse.getType() != null) {
            String type = exportJobResponse.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static ExportJobResponseJsonMarshaller instance;

    public static ExportJobResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExportJobResponseJsonMarshaller();
        return instance;
    }
}
