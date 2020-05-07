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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ProjectEnvironment
 */
class ProjectEnvironmentJsonUnmarshaller implements
        Unmarshaller<ProjectEnvironment, JsonUnmarshallerContext> {

    public ProjectEnvironment unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProjectEnvironment projectEnvironment = new ProjectEnvironment();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("type")) {
                projectEnvironment.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("image")) {
                projectEnvironment.setImage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("computeType")) {
                projectEnvironment.setComputeType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("environmentVariables")) {
                projectEnvironment
                        .setEnvironmentVariables(new ListUnmarshaller<EnvironmentVariable>(
                                EnvironmentVariableJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("privilegedMode")) {
                projectEnvironment.setPrivilegedMode(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("certificate")) {
                projectEnvironment.setCertificate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("registryCredential")) {
                projectEnvironment.setRegistryCredential(RegistryCredentialJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("imagePullCredentialsType")) {
                projectEnvironment.setImagePullCredentialsType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return projectEnvironment;
    }

    private static ProjectEnvironmentJsonUnmarshaller instance;

    public static ProjectEnvironmentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProjectEnvironmentJsonUnmarshaller();
        return instance;
    }
}
