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
 * JSON marshaller for POJO FlywheelIterationProperties
 */
class FlywheelIterationPropertiesJsonMarshaller {

    public void marshall(FlywheelIterationProperties flywheelIterationProperties,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (flywheelIterationProperties.getFlywheelArn() != null) {
            String flywheelArn = flywheelIterationProperties.getFlywheelArn();
            jsonWriter.name("FlywheelArn");
            jsonWriter.value(flywheelArn);
        }
        if (flywheelIterationProperties.getFlywheelIterationId() != null) {
            String flywheelIterationId = flywheelIterationProperties.getFlywheelIterationId();
            jsonWriter.name("FlywheelIterationId");
            jsonWriter.value(flywheelIterationId);
        }
        if (flywheelIterationProperties.getCreationTime() != null) {
            java.util.Date creationTime = flywheelIterationProperties.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (flywheelIterationProperties.getEndTime() != null) {
            java.util.Date endTime = flywheelIterationProperties.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (flywheelIterationProperties.getStatus() != null) {
            String status = flywheelIterationProperties.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (flywheelIterationProperties.getMessage() != null) {
            String message = flywheelIterationProperties.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (flywheelIterationProperties.getEvaluatedModelArn() != null) {
            String evaluatedModelArn = flywheelIterationProperties.getEvaluatedModelArn();
            jsonWriter.name("EvaluatedModelArn");
            jsonWriter.value(evaluatedModelArn);
        }
        if (flywheelIterationProperties.getEvaluatedModelMetrics() != null) {
            FlywheelModelEvaluationMetrics evaluatedModelMetrics = flywheelIterationProperties
                    .getEvaluatedModelMetrics();
            jsonWriter.name("EvaluatedModelMetrics");
            FlywheelModelEvaluationMetricsJsonMarshaller.getInstance().marshall(
                    evaluatedModelMetrics, jsonWriter);
        }
        if (flywheelIterationProperties.getTrainedModelArn() != null) {
            String trainedModelArn = flywheelIterationProperties.getTrainedModelArn();
            jsonWriter.name("TrainedModelArn");
            jsonWriter.value(trainedModelArn);
        }
        if (flywheelIterationProperties.getTrainedModelMetrics() != null) {
            FlywheelModelEvaluationMetrics trainedModelMetrics = flywheelIterationProperties
                    .getTrainedModelMetrics();
            jsonWriter.name("TrainedModelMetrics");
            FlywheelModelEvaluationMetricsJsonMarshaller.getInstance().marshall(
                    trainedModelMetrics, jsonWriter);
        }
        if (flywheelIterationProperties.getEvaluationManifestS3Prefix() != null) {
            String evaluationManifestS3Prefix = flywheelIterationProperties
                    .getEvaluationManifestS3Prefix();
            jsonWriter.name("EvaluationManifestS3Prefix");
            jsonWriter.value(evaluationManifestS3Prefix);
        }
        jsonWriter.endObject();
    }

    private static FlywheelIterationPropertiesJsonMarshaller instance;

    public static FlywheelIterationPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FlywheelIterationPropertiesJsonMarshaller();
        return instance;
    }
}
