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
 * JSON marshaller for POJO ContainerDefinition
 */
class ContainerDefinitionJsonMarshaller {

    public void marshall(ContainerDefinition containerDefinition, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (containerDefinition.getContainerHostname() != null) {
            String containerHostname = containerDefinition.getContainerHostname();
            jsonWriter.name("ContainerHostname");
            jsonWriter.value(containerHostname);
        }
        if (containerDefinition.getImage() != null) {
            String image = containerDefinition.getImage();
            jsonWriter.name("Image");
            jsonWriter.value(image);
        }
        if (containerDefinition.getMode() != null) {
            String mode = containerDefinition.getMode();
            jsonWriter.name("Mode");
            jsonWriter.value(mode);
        }
        if (containerDefinition.getModelDataUrl() != null) {
            String modelDataUrl = containerDefinition.getModelDataUrl();
            jsonWriter.name("ModelDataUrl");
            jsonWriter.value(modelDataUrl);
        }
        if (containerDefinition.getEnvironment() != null) {
            java.util.Map<String, String> environment = containerDefinition.getEnvironment();
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
        if (containerDefinition.getModelPackageName() != null) {
            String modelPackageName = containerDefinition.getModelPackageName();
            jsonWriter.name("ModelPackageName");
            jsonWriter.value(modelPackageName);
        }
        jsonWriter.endObject();
    }

    private static ContainerDefinitionJsonMarshaller instance;

    public static ContainerDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContainerDefinitionJsonMarshaller();
        return instance;
    }
}
