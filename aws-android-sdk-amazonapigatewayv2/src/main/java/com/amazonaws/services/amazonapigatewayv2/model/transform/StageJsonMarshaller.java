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

package com.amazonaws.services.amazonapigatewayv2.model.transform;

import com.amazonaws.services.amazonapigatewayv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Stage
 */
class StageJsonMarshaller {

    public void marshall(Stage stage, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (stage.getAccessLogSettings() != null) {
            AccessLogSettings accessLogSettings = stage.getAccessLogSettings();
            jsonWriter.name("AccessLogSettings");
            AccessLogSettingsJsonMarshaller.getInstance().marshall(accessLogSettings, jsonWriter);
        }
        if (stage.getApiGatewayManaged() != null) {
            Boolean apiGatewayManaged = stage.getApiGatewayManaged();
            jsonWriter.name("ApiGatewayManaged");
            jsonWriter.value(apiGatewayManaged);
        }
        if (stage.getAutoDeploy() != null) {
            Boolean autoDeploy = stage.getAutoDeploy();
            jsonWriter.name("AutoDeploy");
            jsonWriter.value(autoDeploy);
        }
        if (stage.getClientCertificateId() != null) {
            String clientCertificateId = stage.getClientCertificateId();
            jsonWriter.name("ClientCertificateId");
            jsonWriter.value(clientCertificateId);
        }
        if (stage.getCreatedDate() != null) {
            java.util.Date createdDate = stage.getCreatedDate();
            jsonWriter.name("CreatedDate");
            jsonWriter.value(createdDate);
        }
        if (stage.getDefaultRouteSettings() != null) {
            RouteSettings defaultRouteSettings = stage.getDefaultRouteSettings();
            jsonWriter.name("DefaultRouteSettings");
            RouteSettingsJsonMarshaller.getInstance().marshall(defaultRouteSettings, jsonWriter);
        }
        if (stage.getDeploymentId() != null) {
            String deploymentId = stage.getDeploymentId();
            jsonWriter.name("DeploymentId");
            jsonWriter.value(deploymentId);
        }
        if (stage.getDescription() != null) {
            String description = stage.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (stage.getLastDeploymentStatusMessage() != null) {
            String lastDeploymentStatusMessage = stage.getLastDeploymentStatusMessage();
            jsonWriter.name("LastDeploymentStatusMessage");
            jsonWriter.value(lastDeploymentStatusMessage);
        }
        if (stage.getLastUpdatedDate() != null) {
            java.util.Date lastUpdatedDate = stage.getLastUpdatedDate();
            jsonWriter.name("LastUpdatedDate");
            jsonWriter.value(lastUpdatedDate);
        }
        if (stage.getRouteSettings() != null) {
            java.util.Map<String, RouteSettings> routeSettings = stage.getRouteSettings();
            jsonWriter.name("RouteSettings");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, RouteSettings> routeSettingsEntry : routeSettings
                    .entrySet()) {
                RouteSettings routeSettingsValue = routeSettingsEntry.getValue();
                if (routeSettingsValue != null) {
                    jsonWriter.name(routeSettingsEntry.getKey());
                    RouteSettingsJsonMarshaller.getInstance().marshall(routeSettingsValue,
                            jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (stage.getStageName() != null) {
            String stageName = stage.getStageName();
            jsonWriter.name("StageName");
            jsonWriter.value(stageName);
        }
        if (stage.getStageVariables() != null) {
            java.util.Map<String, String> stageVariables = stage.getStageVariables();
            jsonWriter.name("StageVariables");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> stageVariablesEntry : stageVariables
                    .entrySet()) {
                String stageVariablesValue = stageVariablesEntry.getValue();
                if (stageVariablesValue != null) {
                    jsonWriter.name(stageVariablesEntry.getKey());
                    jsonWriter.value(stageVariablesValue);
                }
            }
            jsonWriter.endObject();
        }
        if (stage.getTags() != null) {
            java.util.Map<String, String> tags = stage.getTags();
            jsonWriter.name("Tags");
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
        jsonWriter.endObject();
    }

    private static StageJsonMarshaller instance;

    public static StageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StageJsonMarshaller();
        return instance;
    }
}
