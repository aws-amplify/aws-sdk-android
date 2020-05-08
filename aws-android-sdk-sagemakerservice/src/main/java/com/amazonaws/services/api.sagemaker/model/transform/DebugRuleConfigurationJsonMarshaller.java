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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DebugRuleConfiguration
 */
class DebugRuleConfigurationJsonMarshaller {

    public void marshall(DebugRuleConfiguration debugRuleConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (debugRuleConfiguration.getRuleConfigurationName() != null) {
            String ruleConfigurationName = debugRuleConfiguration.getRuleConfigurationName();
            jsonWriter.name("RuleConfigurationName");
            jsonWriter.value(ruleConfigurationName);
        }
        if (debugRuleConfiguration.getLocalPath() != null) {
            String localPath = debugRuleConfiguration.getLocalPath();
            jsonWriter.name("LocalPath");
            jsonWriter.value(localPath);
        }
        if (debugRuleConfiguration.getS3OutputPath() != null) {
            String s3OutputPath = debugRuleConfiguration.getS3OutputPath();
            jsonWriter.name("S3OutputPath");
            jsonWriter.value(s3OutputPath);
        }
        if (debugRuleConfiguration.getRuleEvaluatorImage() != null) {
            String ruleEvaluatorImage = debugRuleConfiguration.getRuleEvaluatorImage();
            jsonWriter.name("RuleEvaluatorImage");
            jsonWriter.value(ruleEvaluatorImage);
        }
        if (debugRuleConfiguration.getInstanceType() != null) {
            String instanceType = debugRuleConfiguration.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (debugRuleConfiguration.getVolumeSizeInGB() != null) {
            Integer volumeSizeInGB = debugRuleConfiguration.getVolumeSizeInGB();
            jsonWriter.name("VolumeSizeInGB");
            jsonWriter.value(volumeSizeInGB);
        }
        if (debugRuleConfiguration.getRuleParameters() != null) {
            java.util.Map<String, String> ruleParameters = debugRuleConfiguration
                    .getRuleParameters();
            jsonWriter.name("RuleParameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> ruleParametersEntry : ruleParameters
                    .entrySet()) {
                String ruleParametersValue = ruleParametersEntry.getValue();
                if (ruleParametersValue != null) {
                    jsonWriter.name(ruleParametersEntry.getKey());
                    jsonWriter.value(ruleParametersValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static DebugRuleConfigurationJsonMarshaller instance;

    public static DebugRuleConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DebugRuleConfigurationJsonMarshaller();
        return instance;
    }
}
