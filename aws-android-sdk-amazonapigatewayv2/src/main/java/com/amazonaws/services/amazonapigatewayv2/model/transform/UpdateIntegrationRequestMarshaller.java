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
 * JSON request marshaller for UpdateIntegrationRequest
 */
public class UpdateIntegrationRequestMarshaller implements
        Marshaller<Request<UpdateIntegrationRequest>, UpdateIntegrationRequest> {

    public Request<UpdateIntegrationRequest> marshall(
            UpdateIntegrationRequest updateIntegrationRequest) {
        if (updateIntegrationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateIntegrationRequest)");
        }

        Request<UpdateIntegrationRequest> request = new DefaultRequest<UpdateIntegrationRequest>(
                updateIntegrationRequest, "AmazonApiGatewayV2");
        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/v2/apis/{apiId}/integrations/{integrationId}";
        uriResourcePath = uriResourcePath.replace(
                "{apiId}",
                (updateIntegrationRequest.getApiId() == null) ? "" : StringUtils
                        .fromString(updateIntegrationRequest.getApiId()));
        uriResourcePath = uriResourcePath.replace(
                "{integrationId}",
                (updateIntegrationRequest.getIntegrationId() == null) ? "" : StringUtils
                        .fromString(updateIntegrationRequest.getIntegrationId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateIntegrationRequest.getConnectionId() != null) {
                String connectionId = updateIntegrationRequest.getConnectionId();
                jsonWriter.name("ConnectionId");
                jsonWriter.value(connectionId);
            }
            if (updateIntegrationRequest.getConnectionType() != null) {
                String connectionType = updateIntegrationRequest.getConnectionType();
                jsonWriter.name("ConnectionType");
                jsonWriter.value(connectionType);
            }
            if (updateIntegrationRequest.getContentHandlingStrategy() != null) {
                String contentHandlingStrategy = updateIntegrationRequest
                        .getContentHandlingStrategy();
                jsonWriter.name("ContentHandlingStrategy");
                jsonWriter.value(contentHandlingStrategy);
            }
            if (updateIntegrationRequest.getCredentialsArn() != null) {
                String credentialsArn = updateIntegrationRequest.getCredentialsArn();
                jsonWriter.name("CredentialsArn");
                jsonWriter.value(credentialsArn);
            }
            if (updateIntegrationRequest.getDescription() != null) {
                String description = updateIntegrationRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (updateIntegrationRequest.getIntegrationMethod() != null) {
                String integrationMethod = updateIntegrationRequest.getIntegrationMethod();
                jsonWriter.name("IntegrationMethod");
                jsonWriter.value(integrationMethod);
            }
            if (updateIntegrationRequest.getIntegrationType() != null) {
                String integrationType = updateIntegrationRequest.getIntegrationType();
                jsonWriter.name("IntegrationType");
                jsonWriter.value(integrationType);
            }
            if (updateIntegrationRequest.getIntegrationUri() != null) {
                String integrationUri = updateIntegrationRequest.getIntegrationUri();
                jsonWriter.name("IntegrationUri");
                jsonWriter.value(integrationUri);
            }
            if (updateIntegrationRequest.getPassthroughBehavior() != null) {
                String passthroughBehavior = updateIntegrationRequest.getPassthroughBehavior();
                jsonWriter.name("PassthroughBehavior");
                jsonWriter.value(passthroughBehavior);
            }
            if (updateIntegrationRequest.getPayloadFormatVersion() != null) {
                String payloadFormatVersion = updateIntegrationRequest.getPayloadFormatVersion();
                jsonWriter.name("PayloadFormatVersion");
                jsonWriter.value(payloadFormatVersion);
            }
            if (updateIntegrationRequest.getRequestParameters() != null) {
                java.util.Map<String, String> requestParameters = updateIntegrationRequest
                        .getRequestParameters();
                jsonWriter.name("RequestParameters");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> requestParametersEntry : requestParameters
                        .entrySet()) {
                    String requestParametersValue = requestParametersEntry.getValue();
                    if (requestParametersValue != null) {
                        jsonWriter.name(requestParametersEntry.getKey());
                        jsonWriter.value(requestParametersValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (updateIntegrationRequest.getRequestTemplates() != null) {
                java.util.Map<String, String> requestTemplates = updateIntegrationRequest
                        .getRequestTemplates();
                jsonWriter.name("RequestTemplates");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> requestTemplatesEntry : requestTemplates
                        .entrySet()) {
                    String requestTemplatesValue = requestTemplatesEntry.getValue();
                    if (requestTemplatesValue != null) {
                        jsonWriter.name(requestTemplatesEntry.getKey());
                        jsonWriter.value(requestTemplatesValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (updateIntegrationRequest.getTemplateSelectionExpression() != null) {
                String templateSelectionExpression = updateIntegrationRequest
                        .getTemplateSelectionExpression();
                jsonWriter.name("TemplateSelectionExpression");
                jsonWriter.value(templateSelectionExpression);
            }
            if (updateIntegrationRequest.getTimeoutInMillis() != null) {
                Integer timeoutInMillis = updateIntegrationRequest.getTimeoutInMillis();
                jsonWriter.name("TimeoutInMillis");
                jsonWriter.value(timeoutInMillis);
            }
            if (updateIntegrationRequest.getTlsConfig() != null) {
                TlsConfigInput tlsConfig = updateIntegrationRequest.getTlsConfig();
                jsonWriter.name("TlsConfig");
                TlsConfigInputJsonMarshaller.getInstance().marshall(tlsConfig, jsonWriter);
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
