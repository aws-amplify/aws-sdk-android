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
 * JSON marshaller for POJO TrainingJobDefinition
 */
class TrainingJobDefinitionJsonMarshaller {

    public void marshall(TrainingJobDefinition trainingJobDefinition, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (trainingJobDefinition.getTrainingInputMode() != null) {
            String trainingInputMode = trainingJobDefinition.getTrainingInputMode();
            jsonWriter.name("TrainingInputMode");
            jsonWriter.value(trainingInputMode);
        }
        if (trainingJobDefinition.getHyperParameters() != null) {
            java.util.Map<String, String> hyperParameters = trainingJobDefinition
                    .getHyperParameters();
            jsonWriter.name("HyperParameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> hyperParametersEntry : hyperParameters
                    .entrySet()) {
                String hyperParametersValue = hyperParametersEntry.getValue();
                if (hyperParametersValue != null) {
                    jsonWriter.name(hyperParametersEntry.getKey());
                    jsonWriter.value(hyperParametersValue);
                }
            }
            jsonWriter.endObject();
        }
        if (trainingJobDefinition.getInputDataConfig() != null) {
            java.util.List<Channel> inputDataConfig = trainingJobDefinition.getInputDataConfig();
            jsonWriter.name("InputDataConfig");
            jsonWriter.beginArray();
            for (Channel inputDataConfigItem : inputDataConfig) {
                if (inputDataConfigItem != null) {
                    ChannelJsonMarshaller.getInstance().marshall(inputDataConfigItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (trainingJobDefinition.getOutputDataConfig() != null) {
            OutputDataConfig outputDataConfig = trainingJobDefinition.getOutputDataConfig();
            jsonWriter.name("OutputDataConfig");
            OutputDataConfigJsonMarshaller.getInstance().marshall(outputDataConfig, jsonWriter);
        }
        if (trainingJobDefinition.getResourceConfig() != null) {
            ResourceConfig resourceConfig = trainingJobDefinition.getResourceConfig();
            jsonWriter.name("ResourceConfig");
            ResourceConfigJsonMarshaller.getInstance().marshall(resourceConfig, jsonWriter);
        }
        if (trainingJobDefinition.getStoppingCondition() != null) {
            StoppingCondition stoppingCondition = trainingJobDefinition.getStoppingCondition();
            jsonWriter.name("StoppingCondition");
            StoppingConditionJsonMarshaller.getInstance().marshall(stoppingCondition, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TrainingJobDefinitionJsonMarshaller instance;

    public static TrainingJobDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrainingJobDefinitionJsonMarshaller();
        return instance;
    }
}
