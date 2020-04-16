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
 * JSON marshaller for POJO HyperParameterAlgorithmSpecification
 */
class HyperParameterAlgorithmSpecificationJsonMarshaller {

    public void marshall(HyperParameterAlgorithmSpecification hyperParameterAlgorithmSpecification,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hyperParameterAlgorithmSpecification.getTrainingImage() != null) {
            String trainingImage = hyperParameterAlgorithmSpecification.getTrainingImage();
            jsonWriter.name("TrainingImage");
            jsonWriter.value(trainingImage);
        }
        if (hyperParameterAlgorithmSpecification.getTrainingInputMode() != null) {
            String trainingInputMode = hyperParameterAlgorithmSpecification.getTrainingInputMode();
            jsonWriter.name("TrainingInputMode");
            jsonWriter.value(trainingInputMode);
        }
        if (hyperParameterAlgorithmSpecification.getAlgorithmName() != null) {
            String algorithmName = hyperParameterAlgorithmSpecification.getAlgorithmName();
            jsonWriter.name("AlgorithmName");
            jsonWriter.value(algorithmName);
        }
        if (hyperParameterAlgorithmSpecification.getMetricDefinitions() != null) {
            java.util.List<MetricDefinition> metricDefinitions = hyperParameterAlgorithmSpecification
                    .getMetricDefinitions();
            jsonWriter.name("MetricDefinitions");
            jsonWriter.beginArray();
            for (MetricDefinition metricDefinitionsItem : metricDefinitions) {
                if (metricDefinitionsItem != null) {
                    MetricDefinitionJsonMarshaller.getInstance().marshall(metricDefinitionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static HyperParameterAlgorithmSpecificationJsonMarshaller instance;

    public static HyperParameterAlgorithmSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HyperParameterAlgorithmSpecificationJsonMarshaller();
        return instance;
    }
}
