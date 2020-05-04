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
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateStageRequest
 */
public class CreateStageRequestMarshaller implements
        Marshaller<Request<CreateStageRequest>, CreateStageRequest> {

    public Request<CreateStageRequest> marshall(CreateStageRequest createStageRequest) {
        if (createStageRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateStageRequest)");
        }

        Request<CreateStageRequest> request = new DefaultRequest<CreateStageRequest>(
                createStageRequest, "AmazonAPIGateway");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/restapis/{restapi_id}/stages";
        uriResourcePath = uriResourcePath.replace(
                "{restapi_id}",
                (createStageRequest.getRestApiId() == null) ? "" : StringUtils
                        .fromString(createStageRequest.getRestApiId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createStageRequest.getStageName() != null) {
                String stageName = createStageRequest.getStageName();
                jsonWriter.name("stageName");
                jsonWriter.value(stageName);
            }
            if (createStageRequest.getDeploymentId() != null) {
                String deploymentId = createStageRequest.getDeploymentId();
                jsonWriter.name("deploymentId");
                jsonWriter.value(deploymentId);
            }
            if (createStageRequest.getDescription() != null) {
                String description = createStageRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (createStageRequest.getCacheClusterEnabled() != null) {
                Boolean cacheClusterEnabled = createStageRequest.getCacheClusterEnabled();
                jsonWriter.name("cacheClusterEnabled");
                jsonWriter.value(cacheClusterEnabled);
            }
            if (createStageRequest.getCacheClusterSize() != null) {
                String cacheClusterSize = createStageRequest.getCacheClusterSize();
                jsonWriter.name("cacheClusterSize");
                jsonWriter.value(cacheClusterSize);
            }
            if (createStageRequest.getVariables() != null) {
                java.util.Map<String, String> variables = createStageRequest.getVariables();
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
            if (createStageRequest.getDocumentationVersion() != null) {
                String documentationVersion = createStageRequest.getDocumentationVersion();
                jsonWriter.name("documentationVersion");
                jsonWriter.value(documentationVersion);
            }
            if (createStageRequest.getCanarySettings() != null) {
                CanarySettings canarySettings = createStageRequest.getCanarySettings();
                jsonWriter.name("canarySettings");
                CanarySettingsJsonMarshaller.getInstance().marshall(canarySettings, jsonWriter);
            }
            if (createStageRequest.getTracingEnabled() != null) {
                Boolean tracingEnabled = createStageRequest.getTracingEnabled();
                jsonWriter.name("tracingEnabled");
                jsonWriter.value(tracingEnabled);
            }
            if (createStageRequest.getTags() != null) {
                java.util.Map<String, String> tags = createStageRequest.getTags();
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
