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
 * JSON marshaller for POJO DebugHookConfig
 */
class DebugHookConfigJsonMarshaller {

    public void marshall(DebugHookConfig debugHookConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (debugHookConfig.getLocalPath() != null) {
            String localPath = debugHookConfig.getLocalPath();
            jsonWriter.name("LocalPath");
            jsonWriter.value(localPath);
        }
        if (debugHookConfig.getS3OutputPath() != null) {
            String s3OutputPath = debugHookConfig.getS3OutputPath();
            jsonWriter.name("S3OutputPath");
            jsonWriter.value(s3OutputPath);
        }
        if (debugHookConfig.getHookParameters() != null) {
            java.util.Map<String, String> hookParameters = debugHookConfig.getHookParameters();
            jsonWriter.name("HookParameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> hookParametersEntry : hookParameters
                    .entrySet()) {
                String hookParametersValue = hookParametersEntry.getValue();
                if (hookParametersValue != null) {
                    jsonWriter.name(hookParametersEntry.getKey());
                    jsonWriter.value(hookParametersValue);
                }
            }
            jsonWriter.endObject();
        }
        if (debugHookConfig.getCollectionConfigurations() != null) {
            java.util.List<CollectionConfiguration> collectionConfigurations = debugHookConfig
                    .getCollectionConfigurations();
            jsonWriter.name("CollectionConfigurations");
            jsonWriter.beginArray();
            for (CollectionConfiguration collectionConfigurationsItem : collectionConfigurations) {
                if (collectionConfigurationsItem != null) {
                    CollectionConfigurationJsonMarshaller.getInstance().marshall(
                            collectionConfigurationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static DebugHookConfigJsonMarshaller instance;

    public static DebugHookConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DebugHookConfigJsonMarshaller();
        return instance;
    }
}
