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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsCodeBuildProjectEnvironment
 */
class AwsCodeBuildProjectEnvironmentJsonMarshaller {

    public void marshall(AwsCodeBuildProjectEnvironment awsCodeBuildProjectEnvironment,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsCodeBuildProjectEnvironment.getCertificate() != null) {
            String certificate = awsCodeBuildProjectEnvironment.getCertificate();
            jsonWriter.name("Certificate");
            jsonWriter.value(certificate);
        }
        if (awsCodeBuildProjectEnvironment.getImagePullCredentialsType() != null) {
            String imagePullCredentialsType = awsCodeBuildProjectEnvironment
                    .getImagePullCredentialsType();
            jsonWriter.name("ImagePullCredentialsType");
            jsonWriter.value(imagePullCredentialsType);
        }
        if (awsCodeBuildProjectEnvironment.getRegistryCredential() != null) {
            AwsCodeBuildProjectEnvironmentRegistryCredential registryCredential = awsCodeBuildProjectEnvironment
                    .getRegistryCredential();
            jsonWriter.name("RegistryCredential");
            AwsCodeBuildProjectEnvironmentRegistryCredentialJsonMarshaller.getInstance().marshall(
                    registryCredential, jsonWriter);
        }
        if (awsCodeBuildProjectEnvironment.getType() != null) {
            String type = awsCodeBuildProjectEnvironment.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static AwsCodeBuildProjectEnvironmentJsonMarshaller instance;

    public static AwsCodeBuildProjectEnvironmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsCodeBuildProjectEnvironmentJsonMarshaller();
        return instance;
    }
}
