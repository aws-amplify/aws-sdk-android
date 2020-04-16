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
 * JSON marshaller for POJO TransformJobDefinition
 */
class TransformJobDefinitionJsonMarshaller {

    public void marshall(TransformJobDefinition transformJobDefinition, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (transformJobDefinition.getMaxConcurrentTransforms() != null) {
            Integer maxConcurrentTransforms = transformJobDefinition.getMaxConcurrentTransforms();
            jsonWriter.name("MaxConcurrentTransforms");
            jsonWriter.value(maxConcurrentTransforms);
        }
        if (transformJobDefinition.getMaxPayloadInMB() != null) {
            Integer maxPayloadInMB = transformJobDefinition.getMaxPayloadInMB();
            jsonWriter.name("MaxPayloadInMB");
            jsonWriter.value(maxPayloadInMB);
        }
        if (transformJobDefinition.getBatchStrategy() != null) {
            String batchStrategy = transformJobDefinition.getBatchStrategy();
            jsonWriter.name("BatchStrategy");
            jsonWriter.value(batchStrategy);
        }
        if (transformJobDefinition.getEnvironment() != null) {
            java.util.Map<String, String> environment = transformJobDefinition.getEnvironment();
            jsonWriter.name("Environment");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> environmentEntry : environment.entrySet()) {
                String environmentValue = environmentEntry.getValue();
                if (environmentValue != null) {
                    jsonWriter.name(environmentEntry.getKey());
                    jsonWriter.value(environmentValue);
                }
            }
            jsonWriter.endObject();
        }
        if (transformJobDefinition.getTransformInput() != null) {
            TransformInput transformInput = transformJobDefinition.getTransformInput();
            jsonWriter.name("TransformInput");
            TransformInputJsonMarshaller.getInstance().marshall(transformInput, jsonWriter);
        }
        if (transformJobDefinition.getTransformOutput() != null) {
            TransformOutput transformOutput = transformJobDefinition.getTransformOutput();
            jsonWriter.name("TransformOutput");
            TransformOutputJsonMarshaller.getInstance().marshall(transformOutput, jsonWriter);
        }
        if (transformJobDefinition.getTransformResources() != null) {
            TransformResources transformResources = transformJobDefinition.getTransformResources();
            jsonWriter.name("TransformResources");
            TransformResourcesJsonMarshaller.getInstance().marshall(transformResources, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TransformJobDefinitionJsonMarshaller instance;

    public static TransformJobDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransformJobDefinitionJsonMarshaller();
        return instance;
    }
}
