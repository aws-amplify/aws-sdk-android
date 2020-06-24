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
 * JSON marshaller for POJO App
 */
class AppJsonMarshaller {

    public void marshall(App app, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (app.getAppId() != null) {
            String appId = app.getAppId();
            jsonWriter.name("appId");
            jsonWriter.value(appId);
        }
        if (app.getAppArn() != null) {
            String appArn = app.getAppArn();
            jsonWriter.name("appArn");
            jsonWriter.value(appArn);
        }
        if (app.getName() != null) {
            String name = app.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (app.getTags() != null) {
            java.util.Map<String, String> tags = app.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (app.getDescription() != null) {
            String description = app.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (app.getRepository() != null) {
            String repository = app.getRepository();
            jsonWriter.name("repository");
            jsonWriter.value(repository);
        }
        if (app.getPlatform() != null) {
            String platform = app.getPlatform();
            jsonWriter.name("platform");
            jsonWriter.value(platform);
        }
        if (app.getCreateTime() != null) {
            java.util.Date createTime = app.getCreateTime();
            jsonWriter.name("createTime");
            jsonWriter.value(createTime);
        }
        if (app.getUpdateTime() != null) {
            java.util.Date updateTime = app.getUpdateTime();
            jsonWriter.name("updateTime");
            jsonWriter.value(updateTime);
        }
        if (app.getIamServiceRoleArn() != null) {
            String iamServiceRoleArn = app.getIamServiceRoleArn();
            jsonWriter.name("iamServiceRoleArn");
            jsonWriter.value(iamServiceRoleArn);
        }
        if (app.getEnvironmentVariables() != null) {
            java.util.Map<String, String> environmentVariables = app.getEnvironmentVariables();
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
        if (app.getDefaultDomain() != null) {
            String defaultDomain = app.getDefaultDomain();
            jsonWriter.name("defaultDomain");
            jsonWriter.value(defaultDomain);
        }
        if (app.getEnableBranchAutoBuild() != null) {
            Boolean enableBranchAutoBuild = app.getEnableBranchAutoBuild();
            jsonWriter.name("enableBranchAutoBuild");
            jsonWriter.value(enableBranchAutoBuild);
        }
        if (app.getEnableBranchAutoDeletion() != null) {
            Boolean enableBranchAutoDeletion = app.getEnableBranchAutoDeletion();
            jsonWriter.name("enableBranchAutoDeletion");
            jsonWriter.value(enableBranchAutoDeletion);
        }
        if (app.getEnableBasicAuth() != null) {
            Boolean enableBasicAuth = app.getEnableBasicAuth();
            jsonWriter.name("enableBasicAuth");
            jsonWriter.value(enableBasicAuth);
        }
        if (app.getBasicAuthCredentials() != null) {
            String basicAuthCredentials = app.getBasicAuthCredentials();
            jsonWriter.name("basicAuthCredentials");
            jsonWriter.value(basicAuthCredentials);
        }
        if (app.getCustomRules() != null) {
            java.util.List<CustomRule> customRules = app.getCustomRules();
            jsonWriter.name("customRules");
            jsonWriter.beginArray();
            for (CustomRule customRulesItem : customRules) {
                if (customRulesItem != null) {
                    CustomRuleJsonMarshaller.getInstance().marshall(customRulesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (app.getProductionBranch() != null) {
            ProductionBranch productionBranch = app.getProductionBranch();
            jsonWriter.name("productionBranch");
            ProductionBranchJsonMarshaller.getInstance().marshall(productionBranch, jsonWriter);
        }
        if (app.getBuildSpec() != null) {
            String buildSpec = app.getBuildSpec();
            jsonWriter.name("buildSpec");
            jsonWriter.value(buildSpec);
        }
        if (app.getEnableAutoBranchCreation() != null) {
            Boolean enableAutoBranchCreation = app.getEnableAutoBranchCreation();
            jsonWriter.name("enableAutoBranchCreation");
            jsonWriter.value(enableAutoBranchCreation);
        }
        if (app.getAutoBranchCreationPatterns() != null) {
            java.util.List<String> autoBranchCreationPatterns = app.getAutoBranchCreationPatterns();
            jsonWriter.name("autoBranchCreationPatterns");
            jsonWriter.beginArray();
            for (String autoBranchCreationPatternsItem : autoBranchCreationPatterns) {
                if (autoBranchCreationPatternsItem != null) {
                    jsonWriter.value(autoBranchCreationPatternsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (app.getAutoBranchCreationConfig() != null) {
            AutoBranchCreationConfig autoBranchCreationConfig = app.getAutoBranchCreationConfig();
            jsonWriter.name("autoBranchCreationConfig");
            AutoBranchCreationConfigJsonMarshaller.getInstance().marshall(autoBranchCreationConfig,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AppJsonMarshaller instance;

    public static AppJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AppJsonMarshaller();
        return instance;
    }
}
