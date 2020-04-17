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
 * JSON marshaller for POJO Model
 */
class ModelJsonMarshaller {

    public void marshall(Model model, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (model.getModelId() != null) {
            String modelId = model.getModelId();
            jsonWriter.name("modelId");
            jsonWriter.value(modelId);
        }
        if (model.getModelType() != null) {
            String modelType = model.getModelType();
            jsonWriter.name("modelType");
            jsonWriter.value(modelType);
        }
        if (model.getDescription() != null) {
            String description = model.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (model.getTrainingDataSource() != null) {
            TrainingDataSource trainingDataSource = model.getTrainingDataSource();
            jsonWriter.name("trainingDataSource");
            TrainingDataSourceJsonMarshaller.getInstance().marshall(trainingDataSource, jsonWriter);
        }
        if (model.getModelVariables() != null) {
            java.util.List<ModelVariable> modelVariables = model.getModelVariables();
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
        if (model.getLabelSchema() != null) {
            LabelSchema labelSchema = model.getLabelSchema();
            jsonWriter.name("labelSchema");
            LabelSchemaJsonMarshaller.getInstance().marshall(labelSchema, jsonWriter);
        }
        if (model.getLastUpdatedTime() != null) {
            String lastUpdatedTime = model.getLastUpdatedTime();
            jsonWriter.name("lastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        if (model.getCreatedTime() != null) {
            String createdTime = model.getCreatedTime();
            jsonWriter.name("createdTime");
            jsonWriter.value(createdTime);
        }
        jsonWriter.endObject();
    }

    private static ModelJsonMarshaller instance;

    public static ModelJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ModelJsonMarshaller();
        return instance;
    }
}
