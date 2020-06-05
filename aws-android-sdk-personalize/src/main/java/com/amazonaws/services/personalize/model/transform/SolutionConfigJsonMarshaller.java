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

package com.amazonaws.services.personalize.model.transform;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SolutionConfig
 */
class SolutionConfigJsonMarshaller {

    public void marshall(SolutionConfig solutionConfig, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (solutionConfig.getEventValueThreshold() != null) {
            String eventValueThreshold = solutionConfig.getEventValueThreshold();
            jsonWriter.name("eventValueThreshold");
            jsonWriter.value(eventValueThreshold);
        }
        if (solutionConfig.getHpoConfig() != null) {
            HPOConfig hpoConfig = solutionConfig.getHpoConfig();
            jsonWriter.name("hpoConfig");
            HPOConfigJsonMarshaller.getInstance().marshall(hpoConfig, jsonWriter);
        }
        if (solutionConfig.getAlgorithmHyperParameters() != null) {
            java.util.Map<String, String> algorithmHyperParameters = solutionConfig
                    .getAlgorithmHyperParameters();
            jsonWriter.name("algorithmHyperParameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> algorithmHyperParametersEntry : algorithmHyperParameters
                    .entrySet()) {
                String algorithmHyperParametersValue = algorithmHyperParametersEntry.getValue();
                if (algorithmHyperParametersValue != null) {
                    jsonWriter.name(algorithmHyperParametersEntry.getKey());
                    jsonWriter.value(algorithmHyperParametersValue);
                }
            }
            jsonWriter.endObject();
        }
        if (solutionConfig.getFeatureTransformationParameters() != null) {
            java.util.Map<String, String> featureTransformationParameters = solutionConfig
                    .getFeatureTransformationParameters();
            jsonWriter.name("featureTransformationParameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> featureTransformationParametersEntry : featureTransformationParameters
                    .entrySet()) {
                String featureTransformationParametersValue = featureTransformationParametersEntry
                        .getValue();
                if (featureTransformationParametersValue != null) {
                    jsonWriter.name(featureTransformationParametersEntry.getKey());
                    jsonWriter.value(featureTransformationParametersValue);
                }
            }
            jsonWriter.endObject();
        }
        if (solutionConfig.getAutoMLConfig() != null) {
            AutoMLConfig autoMLConfig = solutionConfig.getAutoMLConfig();
            jsonWriter.name("autoMLConfig");
            AutoMLConfigJsonMarshaller.getInstance().marshall(autoMLConfig, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SolutionConfigJsonMarshaller instance;

    public static SolutionConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SolutionConfigJsonMarshaller();
        return instance;
    }
}
