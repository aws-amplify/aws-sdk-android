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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Stage
 */
class StageJsonMarshaller {

    public void marshall(Stage stage, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (stage.getDeploymentId() != null) {
            String deploymentId = stage.getDeploymentId();
            jsonWriter.name("deploymentId");
            jsonWriter.value(deploymentId);
        }
        if (stage.getClientCertificateId() != null) {
            String clientCertificateId = stage.getClientCertificateId();
            jsonWriter.name("clientCertificateId");
            jsonWriter.value(clientCertificateId);
        }
        if (stage.getStageName() != null) {
            String stageName = stage.getStageName();
            jsonWriter.name("stageName");
            jsonWriter.value(stageName);
        }
        if (stage.getDescription() != null) {
            String description = stage.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (stage.getCacheClusterEnabled() != null) {
            Boolean cacheClusterEnabled = stage.getCacheClusterEnabled();
            jsonWriter.name("cacheClusterEnabled");
            jsonWriter.value(cacheClusterEnabled);
        }
        if (stage.getCacheClusterSize() != null) {
            String cacheClusterSize = stage.getCacheClusterSize();
            jsonWriter.name("cacheClusterSize");
            jsonWriter.value(cacheClusterSize);
        }
        if (stage.getCacheClusterStatus() != null) {
            String cacheClusterStatus = stage.getCacheClusterStatus();
            jsonWriter.name("cacheClusterStatus");
            jsonWriter.value(cacheClusterStatus);
        }
        if (stage.getMethodSettings() != null) {
            java.util.Map<String, MethodSetting> methodSettings = stage.getMethodSettings();
            jsonWriter.name("methodSettings");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, MethodSetting> methodSettingsEntry : methodSettings
                    .entrySet()) {
                MethodSetting methodSettingsValue = methodSettingsEntry.getValue();
                if (methodSettingsValue != null) {
                    jsonWriter.name(methodSettingsEntry.getKey());
                    MethodSettingJsonMarshaller.getInstance().marshall(methodSettingsValue,
                            jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (stage.getVariables() != null) {
            java.util.Map<String, String> variables = stage.getVariables();
            jsonWriter.name("variables");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> variablesEntry : variables.entrySet()) {
                String variablesValue = variablesEntry.getValue();
                if (variablesValue != null) {
                    jsonWriter.name(variablesEntry.getKey());
                    jsonWriter.value(variablesValue);
                }
            }
            jsonWriter.endObject();
        }
        if (stage.getDocumentationVersion() != null) {
            String documentationVersion = stage.getDocumentationVersion();
            jsonWriter.name("documentationVersion");
            jsonWriter.value(documentationVersion);
        }
        if (stage.getAccessLogSettings() != null) {
            AccessLogSettings accessLogSettings = stage.getAccessLogSettings();
            jsonWriter.name("accessLogSettings");
            AccessLogSettingsJsonMarshaller.getInstance().marshall(accessLogSettings, jsonWriter);
        }
        if (stage.getCanarySettings() != null) {
            CanarySettings canarySettings = stage.getCanarySettings();
            jsonWriter.name("canarySettings");
            CanarySettingsJsonMarshaller.getInstance().marshall(canarySettings, jsonWriter);
        }
        if (stage.getTracingEnabled() != null) {
            Boolean tracingEnabled = stage.getTracingEnabled();
            jsonWriter.name("tracingEnabled");
            jsonWriter.value(tracingEnabled);
        }
        if (stage.getWebAclArn() != null) {
            String webAclArn = stage.getWebAclArn();
            jsonWriter.name("webAclArn");
            jsonWriter.value(webAclArn);
        }
        if (stage.getTags() != null) {
            java.util.Map<String, String> tags = stage.getTags();
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
        if (stage.getCreatedDate() != null) {
            java.util.Date createdDate = stage.getCreatedDate();
            jsonWriter.name("createdDate");
            jsonWriter.value(createdDate);
        }
        if (stage.getLastUpdatedDate() != null) {
            java.util.Date lastUpdatedDate = stage.getLastUpdatedDate();
            jsonWriter.name("lastUpdatedDate");
            jsonWriter.value(lastUpdatedDate);
        }
        jsonWriter.endObject();
    }

    private static StageJsonMarshaller instance;

    public static StageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StageJsonMarshaller();
        return instance;
    }
}
