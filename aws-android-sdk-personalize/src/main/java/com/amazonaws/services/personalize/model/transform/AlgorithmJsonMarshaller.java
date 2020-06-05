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
 * JSON marshaller for POJO Algorithm
 */
class AlgorithmJsonMarshaller {

    public void marshall(Algorithm algorithm, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (algorithm.getName() != null) {
            String name = algorithm.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (algorithm.getAlgorithmArn() != null) {
            String algorithmArn = algorithm.getAlgorithmArn();
            jsonWriter.name("algorithmArn");
            jsonWriter.value(algorithmArn);
        }
        if (algorithm.getAlgorithmImage() != null) {
            AlgorithmImage algorithmImage = algorithm.getAlgorithmImage();
            jsonWriter.name("algorithmImage");
            AlgorithmImageJsonMarshaller.getInstance().marshall(algorithmImage, jsonWriter);
        }
        if (algorithm.getDefaultHyperParameters() != null) {
            java.util.Map<String, String> defaultHyperParameters = algorithm
                    .getDefaultHyperParameters();
            jsonWriter.name("defaultHyperParameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> defaultHyperParametersEntry : defaultHyperParameters
                    .entrySet()) {
                String defaultHyperParametersValue = defaultHyperParametersEntry.getValue();
                if (defaultHyperParametersValue != null) {
                    jsonWriter.name(defaultHyperParametersEntry.getKey());
                    jsonWriter.value(defaultHyperParametersValue);
                }
            }
            jsonWriter.endObject();
        }
        if (algorithm.getDefaultHyperParameterRanges() != null) {
            DefaultHyperParameterRanges defaultHyperParameterRanges = algorithm
                    .getDefaultHyperParameterRanges();
            jsonWriter.name("defaultHyperParameterRanges");
            DefaultHyperParameterRangesJsonMarshaller.getInstance().marshall(
                    defaultHyperParameterRanges, jsonWriter);
        }
        if (algorithm.getDefaultResourceConfig() != null) {
            java.util.Map<String, String> defaultResourceConfig = algorithm
                    .getDefaultResourceConfig();
            jsonWriter.name("defaultResourceConfig");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> defaultResourceConfigEntry : defaultResourceConfig
                    .entrySet()) {
                String defaultResourceConfigValue = defaultResourceConfigEntry.getValue();
                if (defaultResourceConfigValue != null) {
                    jsonWriter.name(defaultResourceConfigEntry.getKey());
                    jsonWriter.value(defaultResourceConfigValue);
                }
            }
            jsonWriter.endObject();
        }
        if (algorithm.getTrainingInputMode() != null) {
            String trainingInputMode = algorithm.getTrainingInputMode();
            jsonWriter.name("trainingInputMode");
            jsonWriter.value(trainingInputMode);
        }
        if (algorithm.getRoleArn() != null) {
            String roleArn = algorithm.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (algorithm.getCreationDateTime() != null) {
            java.util.Date creationDateTime = algorithm.getCreationDateTime();
            jsonWriter.name("creationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (algorithm.getLastUpdatedDateTime() != null) {
            java.util.Date lastUpdatedDateTime = algorithm.getLastUpdatedDateTime();
            jsonWriter.name("lastUpdatedDateTime");
            jsonWriter.value(lastUpdatedDateTime);
        }
        jsonWriter.endObject();
    }

    private static AlgorithmJsonMarshaller instance;

    public static AlgorithmJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AlgorithmJsonMarshaller();
        return instance;
    }
}
