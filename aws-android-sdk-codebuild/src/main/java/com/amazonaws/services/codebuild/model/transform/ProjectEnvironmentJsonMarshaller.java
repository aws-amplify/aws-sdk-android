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

package com.amazonaws.services.codebuild.model.transform;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ProjectEnvironment
 */
class ProjectEnvironmentJsonMarshaller {

    public void marshall(ProjectEnvironment projectEnvironment, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (projectEnvironment.getType() != null) {
            String type = projectEnvironment.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (projectEnvironment.getImage() != null) {
            String image = projectEnvironment.getImage();
            jsonWriter.name("image");
            jsonWriter.value(image);
        }
        if (projectEnvironment.getComputeType() != null) {
            String computeType = projectEnvironment.getComputeType();
            jsonWriter.name("computeType");
            jsonWriter.value(computeType);
        }
        if (projectEnvironment.getEnvironmentVariables() != null) {
            java.util.List<EnvironmentVariable> environmentVariables = projectEnvironment
                    .getEnvironmentVariables();
            jsonWriter.name("environmentVariables");
            jsonWriter.beginArray();
            for (EnvironmentVariable environmentVariablesItem : environmentVariables) {
                if (environmentVariablesItem != null) {
                    EnvironmentVariableJsonMarshaller.getInstance().marshall(
                            environmentVariablesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (projectEnvironment.getPrivilegedMode() != null) {
            Boolean privilegedMode = projectEnvironment.getPrivilegedMode();
            jsonWriter.name("privilegedMode");
            jsonWriter.value(privilegedMode);
        }
        if (projectEnvironment.getCertificate() != null) {
            String certificate = projectEnvironment.getCertificate();
            jsonWriter.name("certificate");
            jsonWriter.value(certificate);
        }
        if (projectEnvironment.getRegistryCredential() != null) {
            RegistryCredential registryCredential = projectEnvironment.getRegistryCredential();
            jsonWriter.name("registryCredential");
            RegistryCredentialJsonMarshaller.getInstance().marshall(registryCredential, jsonWriter);
        }
        if (projectEnvironment.getImagePullCredentialsType() != null) {
            String imagePullCredentialsType = projectEnvironment.getImagePullCredentialsType();
            jsonWriter.name("imagePullCredentialsType");
            jsonWriter.value(imagePullCredentialsType);
        }
        jsonWriter.endObject();
    }

    private static ProjectEnvironmentJsonMarshaller instance;

    public static ProjectEnvironmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProjectEnvironmentJsonMarshaller();
        return instance;
    }
}
