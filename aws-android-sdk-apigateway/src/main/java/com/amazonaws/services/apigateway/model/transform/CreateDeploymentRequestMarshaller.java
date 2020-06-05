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
 * JSON request marshaller for CreateDeploymentRequest
 */
public class CreateDeploymentRequestMarshaller implements
        Marshaller<Request<CreateDeploymentRequest>, CreateDeploymentRequest> {

    public Request<CreateDeploymentRequest> marshall(CreateDeploymentRequest createDeploymentRequest) {
        if (createDeploymentRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateDeploymentRequest)");
        }

        Request<CreateDeploymentRequest> request = new DefaultRequest<CreateDeploymentRequest>(
                createDeploymentRequest, "AmazonAPIGateway");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/restapis/{restapi_id}/deployments";
        uriResourcePath = uriResourcePath.replace(
                "{restapi_id}",
                (createDeploymentRequest.getRestApiId() == null) ? "" : StringUtils
                        .fromString(createDeploymentRequest.getRestApiId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createDeploymentRequest.getStageName() != null) {
                String stageName = createDeploymentRequest.getStageName();
                jsonWriter.name("stageName");
                jsonWriter.value(stageName);
            }
            if (createDeploymentRequest.getStageDescription() != null) {
                String stageDescription = createDeploymentRequest.getStageDescription();
                jsonWriter.name("stageDescription");
                jsonWriter.value(stageDescription);
            }
            if (createDeploymentRequest.getDescription() != null) {
                String description = createDeploymentRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (createDeploymentRequest.getCacheClusterEnabled() != null) {
                Boolean cacheClusterEnabled = createDeploymentRequest.getCacheClusterEnabled();
                jsonWriter.name("cacheClusterEnabled");
                jsonWriter.value(cacheClusterEnabled);
            }
            if (createDeploymentRequest.getCacheClusterSize() != null) {
                String cacheClusterSize = createDeploymentRequest.getCacheClusterSize();
                jsonWriter.name("cacheClusterSize");
                jsonWriter.value(cacheClusterSize);
            }
            if (createDeploymentRequest.getVariables() != null) {
                java.util.Map<String, String> variables = createDeploymentRequest.getVariables();
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
            if (createDeploymentRequest.getCanarySettings() != null) {
                DeploymentCanarySettings canarySettings = createDeploymentRequest
                        .getCanarySettings();
                jsonWriter.name("canarySettings");
                DeploymentCanarySettingsJsonMarshaller.getInstance().marshall(canarySettings,
                        jsonWriter);
            }
            if (createDeploymentRequest.getTracingEnabled() != null) {
                Boolean tracingEnabled = createDeploymentRequest.getTracingEnabled();
                jsonWriter.name("tracingEnabled");
                jsonWriter.value(tracingEnabled);
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
