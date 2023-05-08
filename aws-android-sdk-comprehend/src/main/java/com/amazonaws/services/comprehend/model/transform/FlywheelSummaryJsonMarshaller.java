/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FlywheelSummary
 */
class FlywheelSummaryJsonMarshaller {

    public void marshall(FlywheelSummary flywheelSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (flywheelSummary.getFlywheelArn() != null) {
            String flywheelArn = flywheelSummary.getFlywheelArn();
            jsonWriter.name("FlywheelArn");
            jsonWriter.value(flywheelArn);
        }
        if (flywheelSummary.getActiveModelArn() != null) {
            String activeModelArn = flywheelSummary.getActiveModelArn();
            jsonWriter.name("ActiveModelArn");
            jsonWriter.value(activeModelArn);
        }
        if (flywheelSummary.getDataLakeS3Uri() != null) {
            String dataLakeS3Uri = flywheelSummary.getDataLakeS3Uri();
            jsonWriter.name("DataLakeS3Uri");
            jsonWriter.value(dataLakeS3Uri);
        }
        if (flywheelSummary.getStatus() != null) {
            String status = flywheelSummary.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (flywheelSummary.getModelType() != null) {
            String modelType = flywheelSummary.getModelType();
            jsonWriter.name("ModelType");
            jsonWriter.value(modelType);
        }
        if (flywheelSummary.getMessage() != null) {
            String message = flywheelSummary.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (flywheelSummary.getCreationTime() != null) {
            java.util.Date creationTime = flywheelSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (flywheelSummary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = flywheelSummary.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (flywheelSummary.getLatestFlywheelIteration() != null) {
            String latestFlywheelIteration = flywheelSummary.getLatestFlywheelIteration();
            jsonWriter.name("LatestFlywheelIteration");
            jsonWriter.value(latestFlywheelIteration);
        }
        jsonWriter.endObject();
    }

    private static FlywheelSummaryJsonMarshaller instance;

    public static FlywheelSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FlywheelSummaryJsonMarshaller();
        return instance;
    }
}
