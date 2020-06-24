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

package com.amazonaws.services.amplify.model.transform;

import com.amazonaws.services.amplify.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO BackendEnvironment
 */
class BackendEnvironmentJsonUnmarshaller implements
        Unmarshaller<BackendEnvironment, JsonUnmarshallerContext> {

    public BackendEnvironment unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        BackendEnvironment backendEnvironment = new BackendEnvironment();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("backendEnvironmentArn")) {
                backendEnvironment.setBackendEnvironmentArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("environmentName")) {
                backendEnvironment.setEnvironmentName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("stackName")) {
                backendEnvironment.setStackName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("deploymentArtifacts")) {
                backendEnvironment.setDeploymentArtifacts(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createTime")) {
                backendEnvironment.setCreateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("updateTime")) {
                backendEnvironment.setUpdateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return backendEnvironment;
    }

    private static BackendEnvironmentJsonUnmarshaller instance;

    public static BackendEnvironmentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BackendEnvironmentJsonUnmarshaller();
        return instance;
    }
}
