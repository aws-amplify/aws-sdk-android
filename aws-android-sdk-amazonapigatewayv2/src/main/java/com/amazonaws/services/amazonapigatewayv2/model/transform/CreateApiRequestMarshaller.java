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
 * JSON request marshaller for CreateApiRequest
 */
public class CreateApiRequestMarshaller implements
        Marshaller<Request<CreateApiRequest>, CreateApiRequest> {

    public Request<CreateApiRequest> marshall(CreateApiRequest createApiRequest) {
        if (createApiRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(CreateApiRequest)");
        }

        Request<CreateApiRequest> request = new DefaultRequest<CreateApiRequest>(createApiRequest,
                "AmazonApiGatewayV2");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/v2/apis";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createApiRequest.getApiKeySelectionExpression() != null) {
                String apiKeySelectionExpression = createApiRequest.getApiKeySelectionExpression();
                jsonWriter.name("ApiKeySelectionExpression");
                jsonWriter.value(apiKeySelectionExpression);
            }
            if (createApiRequest.getCorsConfiguration() != null) {
                Cors corsConfiguration = createApiRequest.getCorsConfiguration();
                jsonWriter.name("CorsConfiguration");
                CorsJsonMarshaller.getInstance().marshall(corsConfiguration, jsonWriter);
            }
            if (createApiRequest.getCredentialsArn() != null) {
                String credentialsArn = createApiRequest.getCredentialsArn();
                jsonWriter.name("CredentialsArn");
                jsonWriter.value(credentialsArn);
            }
            if (createApiRequest.getDescription() != null) {
                String description = createApiRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createApiRequest.getDisableSchemaValidation() != null) {
                Boolean disableSchemaValidation = createApiRequest.getDisableSchemaValidation();
                jsonWriter.name("DisableSchemaValidation");
                jsonWriter.value(disableSchemaValidation);
            }
            if (createApiRequest.getName() != null) {
                String name = createApiRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createApiRequest.getProtocolType() != null) {
                String protocolType = createApiRequest.getProtocolType();
                jsonWriter.name("ProtocolType");
                jsonWriter.value(protocolType);
            }
            if (createApiRequest.getRouteKey() != null) {
                String routeKey = createApiRequest.getRouteKey();
                jsonWriter.name("RouteKey");
                jsonWriter.value(routeKey);
            }
            if (createApiRequest.getRouteSelectionExpression() != null) {
                String routeSelectionExpression = createApiRequest.getRouteSelectionExpression();
                jsonWriter.name("RouteSelectionExpression");
                jsonWriter.value(routeSelectionExpression);
            }
            if (createApiRequest.getTags() != null) {
                java.util.Map<String, String> tags = createApiRequest.getTags();
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
            if (createApiRequest.getTarget() != null) {
                String target = createApiRequest.getTarget();
                jsonWriter.name("Target");
                jsonWriter.value(target);
            }
            if (createApiRequest.getVersion() != null) {
                String version = createApiRequest.getVersion();
                jsonWriter.name("Version");
                jsonWriter.value(version);
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
