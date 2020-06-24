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
 * JSON marshaller for POJO AutoBranchCreationConfig
 */
class AutoBranchCreationConfigJsonMarshaller {

    public void marshall(AutoBranchCreationConfig autoBranchCreationConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (autoBranchCreationConfig.getStage() != null) {
            String stage = autoBranchCreationConfig.getStage();
            jsonWriter.name("stage");
            jsonWriter.value(stage);
        }
        if (autoBranchCreationConfig.getFramework() != null) {
            String framework = autoBranchCreationConfig.getFramework();
            jsonWriter.name("framework");
            jsonWriter.value(framework);
        }
        if (autoBranchCreationConfig.getEnableAutoBuild() != null) {
            Boolean enableAutoBuild = autoBranchCreationConfig.getEnableAutoBuild();
            jsonWriter.name("enableAutoBuild");
            jsonWriter.value(enableAutoBuild);
        }
        if (autoBranchCreationConfig.getEnvironmentVariables() != null) {
            java.util.Map<String, String> environmentVariables = autoBranchCreationConfig
                    .getEnvironmentVariables();
            jsonWriter.name("environmentVariables");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> environmentVariablesEntry : environmentVariables
                    .entrySet()) {
                String environmentVariablesValue = environmentVariablesEntry.getValue();
                if (environmentVariablesValue != null) {
                    jsonWriter.name(environmentVariablesEntry.getKey());
                    jsonWriter.value(environmentVariablesValue);
                }
            }
            jsonWriter.endObject();
        }
        if (autoBranchCreationConfig.getBasicAuthCredentials() != null) {
            String basicAuthCredentials = autoBranchCreationConfig.getBasicAuthCredentials();
            jsonWriter.name("basicAuthCredentials");
            jsonWriter.value(basicAuthCredentials);
        }
        if (autoBranchCreationConfig.getEnableBasicAuth() != null) {
            Boolean enableBasicAuth = autoBranchCreationConfig.getEnableBasicAuth();
            jsonWriter.name("enableBasicAuth");
            jsonWriter.value(enableBasicAuth);
        }
        if (autoBranchCreationConfig.getBuildSpec() != null) {
            String buildSpec = autoBranchCreationConfig.getBuildSpec();
            jsonWriter.name("buildSpec");
            jsonWriter.value(buildSpec);
        }
        if (autoBranchCreationConfig.getEnablePullRequestPreview() != null) {
            Boolean enablePullRequestPreview = autoBranchCreationConfig
                    .getEnablePullRequestPreview();
            jsonWriter.name("enablePullRequestPreview");
            jsonWriter.value(enablePullRequestPreview);
        }
        if (autoBranchCreationConfig.getPullRequestEnvironmentName() != null) {
            String pullRequestEnvironmentName = autoBranchCreationConfig
                    .getPullRequestEnvironmentName();
            jsonWriter.name("pullRequestEnvironmentName");
            jsonWriter.value(pullRequestEnvironmentName);
        }
        jsonWriter.endObject();
    }

    private static AutoBranchCreationConfigJsonMarshaller instance;

    public static AutoBranchCreationConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutoBranchCreationConfigJsonMarshaller();
        return instance;
    }
}
