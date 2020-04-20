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

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.amazonapigatewayv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateStageRequest
 */
public class UpdateStageRequestMarshaller implements
        Marshaller<Request<UpdateStageRequest>, UpdateStageRequest> {

    public Request<UpdateStageRequest> marshall(UpdateStageRequest updateStageRequest) {
        if (updateStageRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateStageRequest)");
        }

        Request<UpdateStageRequest> request = new DefaultRequest<UpdateStageRequest>(
                updateStageRequest, "AmazonApiGatewayV2");
        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/v2/apis/{apiId}/stages/{stageName}";
        uriResourcePath = uriResourcePath.replace(
                "{apiId}",
                (updateStageRequest.getApiId() == null) ? "" : StringUtils
                        .fromString(updateStageRequest.getApiId()));
        uriResourcePath = uriResourcePath.replace(
                "{stageName}",
                (updateStageRequest.getStageName() == null) ? "" : StringUtils
                        .fromString(updateStageRequest.getStageName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateStageRequest.getAccessLogSettings() != null) {
                AccessLogSettings accessLogSettings = updateStageRequest.getAccessLogSettings();
                jsonWriter.name("AccessLogSettings");
                AccessLogSettingsJsonMarshaller.getInstance().marshall(accessLogSettings,
                        jsonWriter);
            }
            if (updateStageRequest.getAutoDeploy() != null) {
                Boolean autoDeploy = updateStageRequest.getAutoDeploy();
                jsonWriter.name("AutoDeploy");
                jsonWriter.value(autoDeploy);
            }
            if (updateStageRequest.getClientCertificateId() != null) {
                String clientCertificateId = updateStageRequest.getClientCertificateId();
                jsonWriter.name("ClientCertificateId");
                jsonWriter.value(clientCertificateId);
            }
            if (updateStageRequest.getDefaultRouteSettings() != null) {
                RouteSettings defaultRouteSettings = updateStageRequest.getDefaultRouteSettings();
                jsonWriter.name("DefaultRouteSettings");
                RouteSettingsJsonMarshaller.getInstance()
                        .marshall(defaultRouteSettings, jsonWriter);
            }
            if (updateStageRequest.getDeploymentId() != null) {
                String deploymentId = updateStageRequest.getDeploymentId();
                jsonWriter.name("DeploymentId");
                jsonWriter.value(deploymentId);
            }
            if (updateStageRequest.getDescription() != null) {
                String description = updateStageRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (updateStageRequest.getRouteSettings() != null) {
                java.util.Map<String, RouteSettings> routeSettings = updateStageRequest
                        .getRouteSettings();
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
            if (updateStageRequest.getStageVariables() != null) {
                java.util.Map<String, String> stageVariables = updateStageRequest
                        .getStageVariables();
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

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
