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
 * JSON request marshaller for CreateIntegrationRequest
 */
public class CreateIntegrationRequestMarshaller implements
        Marshaller<Request<CreateIntegrationRequest>, CreateIntegrationRequest> {

    public Request<CreateIntegrationRequest> marshall(
            CreateIntegrationRequest createIntegrationRequest) {
        if (createIntegrationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateIntegrationRequest)");
        }

        Request<CreateIntegrationRequest> request = new DefaultRequest<CreateIntegrationRequest>(
                createIntegrationRequest, "AmazonApiGatewayV2");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/v2/apis/{apiId}/integrations";
        uriResourcePath = uriResourcePath.replace(
                "{apiId}",
                (createIntegrationRequest.getApiId() == null) ? "" : StringUtils
                        .fromString(createIntegrationRequest.getApiId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createIntegrationRequest.getConnectionId() != null) {
                String connectionId = createIntegrationRequest.getConnectionId();
                jsonWriter.name("ConnectionId");
                jsonWriter.value(connectionId);
            }
            if (createIntegrationRequest.getConnectionType() != null) {
                String connectionType = createIntegrationRequest.getConnectionType();
                jsonWriter.name("ConnectionType");
                jsonWriter.value(connectionType);
            }
            if (createIntegrationRequest.getContentHandlingStrategy() != null) {
                String contentHandlingStrategy = createIntegrationRequest
                        .getContentHandlingStrategy();
                jsonWriter.name("ContentHandlingStrategy");
                jsonWriter.value(contentHandlingStrategy);
            }
            if (createIntegrationRequest.getCredentialsArn() != null) {
                String credentialsArn = createIntegrationRequest.getCredentialsArn();
                jsonWriter.name("CredentialsArn");
                jsonWriter.value(credentialsArn);
            }
            if (createIntegrationRequest.getDescription() != null) {
                String description = createIntegrationRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createIntegrationRequest.getIntegrationMethod() != null) {
                String integrationMethod = createIntegrationRequest.getIntegrationMethod();
                jsonWriter.name("IntegrationMethod");
                jsonWriter.value(integrationMethod);
            }
            if (createIntegrationRequest.getIntegrationType() != null) {
                String integrationType = createIntegrationRequest.getIntegrationType();
                jsonWriter.name("IntegrationType");
                jsonWriter.value(integrationType);
            }
            if (createIntegrationRequest.getIntegrationUri() != null) {
                String integrationUri = createIntegrationRequest.getIntegrationUri();
                jsonWriter.name("IntegrationUri");
                jsonWriter.value(integrationUri);
            }
            if (createIntegrationRequest.getPassthroughBehavior() != null) {
                String passthroughBehavior = createIntegrationRequest.getPassthroughBehavior();
                jsonWriter.name("PassthroughBehavior");
                jsonWriter.value(passthroughBehavior);
            }
            if (createIntegrationRequest.getPayloadFormatVersion() != null) {
                String payloadFormatVersion = createIntegrationRequest.getPayloadFormatVersion();
                jsonWriter.name("PayloadFormatVersion");
                jsonWriter.value(payloadFormatVersion);
            }
            if (createIntegrationRequest.getRequestParameters() != null) {
                java.util.Map<String, String> requestParameters = createIntegrationRequest
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
            if (createIntegrationRequest.getRequestTemplates() != null) {
                java.util.Map<String, String> requestTemplates = createIntegrationRequest
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
            if (createIntegrationRequest.getTemplateSelectionExpression() != null) {
                String templateSelectionExpression = createIntegrationRequest
                        .getTemplateSelectionExpression();
                jsonWriter.name("TemplateSelectionExpression");
                jsonWriter.value(templateSelectionExpression);
            }
            if (createIntegrationRequest.getTimeoutInMillis() != null) {
                Integer timeoutInMillis = createIntegrationRequest.getTimeoutInMillis();
                jsonWriter.name("TimeoutInMillis");
                jsonWriter.value(timeoutInMillis);
            }
            if (createIntegrationRequest.getTlsConfig() != null) {
                TlsConfigInput tlsConfig = createIntegrationRequest.getTlsConfig();
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
