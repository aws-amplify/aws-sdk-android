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
 * JSON marshaller for POJO Integration
 */
class IntegrationJsonMarshaller {

    public void marshall(Integration integration, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (integration.getApiGatewayManaged() != null) {
            Boolean apiGatewayManaged = integration.getApiGatewayManaged();
            jsonWriter.name("ApiGatewayManaged");
            jsonWriter.value(apiGatewayManaged);
        }
        if (integration.getConnectionId() != null) {
            String connectionId = integration.getConnectionId();
            jsonWriter.name("ConnectionId");
            jsonWriter.value(connectionId);
        }
        if (integration.getConnectionType() != null) {
            String connectionType = integration.getConnectionType();
            jsonWriter.name("ConnectionType");
            jsonWriter.value(connectionType);
        }
        if (integration.getContentHandlingStrategy() != null) {
            String contentHandlingStrategy = integration.getContentHandlingStrategy();
            jsonWriter.name("ContentHandlingStrategy");
            jsonWriter.value(contentHandlingStrategy);
        }
        if (integration.getCredentialsArn() != null) {
            String credentialsArn = integration.getCredentialsArn();
            jsonWriter.name("CredentialsArn");
            jsonWriter.value(credentialsArn);
        }
        if (integration.getDescription() != null) {
            String description = integration.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (integration.getIntegrationId() != null) {
            String integrationId = integration.getIntegrationId();
            jsonWriter.name("IntegrationId");
            jsonWriter.value(integrationId);
        }
        if (integration.getIntegrationMethod() != null) {
            String integrationMethod = integration.getIntegrationMethod();
            jsonWriter.name("IntegrationMethod");
            jsonWriter.value(integrationMethod);
        }
        if (integration.getIntegrationResponseSelectionExpression() != null) {
            String integrationResponseSelectionExpression = integration
                    .getIntegrationResponseSelectionExpression();
            jsonWriter.name("IntegrationResponseSelectionExpression");
            jsonWriter.value(integrationResponseSelectionExpression);
        }
        if (integration.getIntegrationType() != null) {
            String integrationType = integration.getIntegrationType();
            jsonWriter.name("IntegrationType");
            jsonWriter.value(integrationType);
        }
        if (integration.getIntegrationUri() != null) {
            String integrationUri = integration.getIntegrationUri();
            jsonWriter.name("IntegrationUri");
            jsonWriter.value(integrationUri);
        }
        if (integration.getPassthroughBehavior() != null) {
            String passthroughBehavior = integration.getPassthroughBehavior();
            jsonWriter.name("PassthroughBehavior");
            jsonWriter.value(passthroughBehavior);
        }
        if (integration.getPayloadFormatVersion() != null) {
            String payloadFormatVersion = integration.getPayloadFormatVersion();
            jsonWriter.name("PayloadFormatVersion");
            jsonWriter.value(payloadFormatVersion);
        }
        if (integration.getRequestParameters() != null) {
            java.util.Map<String, String> requestParameters = integration.getRequestParameters();
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
        if (integration.getRequestTemplates() != null) {
            java.util.Map<String, String> requestTemplates = integration.getRequestTemplates();
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
        if (integration.getTemplateSelectionExpression() != null) {
            String templateSelectionExpression = integration.getTemplateSelectionExpression();
            jsonWriter.name("TemplateSelectionExpression");
            jsonWriter.value(templateSelectionExpression);
        }
        if (integration.getTimeoutInMillis() != null) {
            Integer timeoutInMillis = integration.getTimeoutInMillis();
            jsonWriter.name("TimeoutInMillis");
            jsonWriter.value(timeoutInMillis);
        }
        if (integration.getTlsConfig() != null) {
            TlsConfig tlsConfig = integration.getTlsConfig();
            jsonWriter.name("TlsConfig");
            TlsConfigJsonMarshaller.getInstance().marshall(tlsConfig, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static IntegrationJsonMarshaller instance;

    public static IntegrationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IntegrationJsonMarshaller();
        return instance;
    }
}
