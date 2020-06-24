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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BackendEnvironment
 */
class BackendEnvironmentJsonMarshaller {

    public void marshall(BackendEnvironment backendEnvironment, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (backendEnvironment.getBackendEnvironmentArn() != null) {
            String backendEnvironmentArn = backendEnvironment.getBackendEnvironmentArn();
            jsonWriter.name("backendEnvironmentArn");
            jsonWriter.value(backendEnvironmentArn);
        }
        if (backendEnvironment.getEnvironmentName() != null) {
            String environmentName = backendEnvironment.getEnvironmentName();
            jsonWriter.name("environmentName");
            jsonWriter.value(environmentName);
        }
        if (backendEnvironment.getStackName() != null) {
            String stackName = backendEnvironment.getStackName();
            jsonWriter.name("stackName");
            jsonWriter.value(stackName);
        }
        if (backendEnvironment.getDeploymentArtifacts() != null) {
            String deploymentArtifacts = backendEnvironment.getDeploymentArtifacts();
            jsonWriter.name("deploymentArtifacts");
            jsonWriter.value(deploymentArtifacts);
        }
        if (backendEnvironment.getCreateTime() != null) {
            java.util.Date createTime = backendEnvironment.getCreateTime();
            jsonWriter.name("createTime");
            jsonWriter.value(createTime);
        }
        if (backendEnvironment.getUpdateTime() != null) {
            java.util.Date updateTime = backendEnvironment.getUpdateTime();
            jsonWriter.name("updateTime");
            jsonWriter.value(updateTime);
        }
        jsonWriter.endObject();
    }

    private static BackendEnvironmentJsonMarshaller instance;

    public static BackendEnvironmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BackendEnvironmentJsonMarshaller();
        return instance;
    }
}
