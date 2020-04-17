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

package com.amazonaws.services.amazonfrauddetector.model.transform;

import com.amazonaws.services.amazonfrauddetector.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ModelVersionDetail
 */
class ModelVersionDetailJsonMarshaller {

    public void marshall(ModelVersionDetail modelVersionDetail, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (modelVersionDetail.getModelId() != null) {
            String modelId = modelVersionDetail.getModelId();
            jsonWriter.name("modelId");
            jsonWriter.value(modelId);
        }
        if (modelVersionDetail.getModelType() != null) {
            String modelType = modelVersionDetail.getModelType();
            jsonWriter.name("modelType");
            jsonWriter.value(modelType);
        }
        if (modelVersionDetail.getModelVersionNumber() != null) {
            String modelVersionNumber = modelVersionDetail.getModelVersionNumber();
            jsonWriter.name("modelVersionNumber");
            jsonWriter.value(modelVersionNumber);
        }
        if (modelVersionDetail.getDescription() != null) {
            String description = modelVersionDetail.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (modelVersionDetail.getStatus() != null) {
            String status = modelVersionDetail.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (modelVersionDetail.getTrainingDataSource() != null) {
            TrainingDataSource trainingDataSource = modelVersionDetail.getTrainingDataSource();
            jsonWriter.name("trainingDataSource");
            TrainingDataSourceJsonMarshaller.getInstance().marshall(trainingDataSource, jsonWriter);
        }
        if (modelVersionDetail.getModelVariables() != null) {
            java.util.List<ModelVariable> modelVariables = modelVersionDetail.getModelVariables();
            jsonWriter.name("modelVariables");
            jsonWriter.beginArray();
            for (ModelVariable modelVariablesItem : modelVariables) {
                if (modelVariablesItem != null) {
                    ModelVariableJsonMarshaller.getInstance().marshall(modelVariablesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (modelVersionDetail.getLabelSchema() != null) {
            LabelSchema labelSchema = modelVersionDetail.getLabelSchema();
            jsonWriter.name("labelSchema");
            LabelSchemaJsonMarshaller.getInstance().marshall(labelSchema, jsonWriter);
        }
        if (modelVersionDetail.getValidationMetrics() != null) {
            java.util.Map<String, String> validationMetrics = modelVersionDetail
                    .getValidationMetrics();
            jsonWriter.name("validationMetrics");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> validationMetricsEntry : validationMetrics
                    .entrySet()) {
                String validationMetricsValue = validationMetricsEntry.getValue();
                if (validationMetricsValue != null) {
                    jsonWriter.name(validationMetricsEntry.getKey());
                    jsonWriter.value(validationMetricsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (modelVersionDetail.getTrainingMetrics() != null) {
            java.util.Map<String, String> trainingMetrics = modelVersionDetail.getTrainingMetrics();
            jsonWriter.name("trainingMetrics");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> trainingMetricsEntry : trainingMetrics
                    .entrySet()) {
                String trainingMetricsValue = trainingMetricsEntry.getValue();
                if (trainingMetricsValue != null) {
                    jsonWriter.name(trainingMetricsEntry.getKey());
                    jsonWriter.value(trainingMetricsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (modelVersionDetail.getLastUpdatedTime() != null) {
            String lastUpdatedTime = modelVersionDetail.getLastUpdatedTime();
            jsonWriter.name("lastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        if (modelVersionDetail.getCreatedTime() != null) {
            String createdTime = modelVersionDetail.getCreatedTime();
            jsonWriter.name("createdTime");
            jsonWriter.value(createdTime);
        }
        jsonWriter.endObject();
    }

    private static ModelVersionDetailJsonMarshaller instance;

    public static ModelVersionDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ModelVersionDetailJsonMarshaller();
        return instance;
    }
}
