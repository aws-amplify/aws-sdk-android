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
 * JSON marshaller for POJO Integration
 */
class IntegrationJsonMarshaller {

    public void marshall(Integration integration, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (integration.getType() != null) {
            String type = integration.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (integration.getHttpMethod() != null) {
            String httpMethod = integration.getHttpMethod();
            jsonWriter.name("httpMethod");
            jsonWriter.value(httpMethod);
        }
        if (integration.getUri() != null) {
            String uri = integration.getUri();
            jsonWriter.name("uri");
            jsonWriter.value(uri);
        }
        if (integration.getConnectionType() != null) {
            String connectionType = integration.getConnectionType();
            jsonWriter.name("connectionType");
            jsonWriter.value(connectionType);
        }
        if (integration.getConnectionId() != null) {
            String connectionId = integration.getConnectionId();
            jsonWriter.name("connectionId");
            jsonWriter.value(connectionId);
        }
        if (integration.getCredentials() != null) {
            String credentials = integration.getCredentials();
            jsonWriter.name("credentials");
            jsonWriter.value(credentials);
        }
        if (integration.getRequestParameters() != null) {
            java.util.Map<String, String> requestParameters = integration.getRequestParameters();
            jsonWriter.name("requestParameters");
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
            jsonWriter.name("requestTemplates");
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
        if (integration.getPassthroughBehavior() != null) {
            String passthroughBehavior = integration.getPassthroughBehavior();
            jsonWriter.name("passthroughBehavior");
            jsonWriter.value(passthroughBehavior);
        }
        if (integration.getContentHandling() != null) {
            String contentHandling = integration.getContentHandling();
            jsonWriter.name("contentHandling");
            jsonWriter.value(contentHandling);
        }
        if (integration.getTimeoutInMillis() != null) {
            Integer timeoutInMillis = integration.getTimeoutInMillis();
            jsonWriter.name("timeoutInMillis");
            jsonWriter.value(timeoutInMillis);
        }
        if (integration.getCacheNamespace() != null) {
            String cacheNamespace = integration.getCacheNamespace();
            jsonWriter.name("cacheNamespace");
            jsonWriter.value(cacheNamespace);
        }
        if (integration.getCacheKeyParameters() != null) {
            java.util.List<String> cacheKeyParameters = integration.getCacheKeyParameters();
            jsonWriter.name("cacheKeyParameters");
            jsonWriter.beginArray();
            for (String cacheKeyParametersItem : cacheKeyParameters) {
                if (cacheKeyParametersItem != null) {
                    jsonWriter.value(cacheKeyParametersItem);
                }
            }
            jsonWriter.endArray();
        }
        if (integration.getIntegrationResponses() != null) {
            java.util.Map<String, IntegrationResponse> integrationResponses = integration
                    .getIntegrationResponses();
            jsonWriter.name("integrationResponses");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, IntegrationResponse> integrationResponsesEntry : integrationResponses
                    .entrySet()) {
                IntegrationResponse integrationResponsesValue = integrationResponsesEntry
                        .getValue();
                if (integrationResponsesValue != null) {
                    jsonWriter.name(integrationResponsesEntry.getKey());
                    IntegrationResponseJsonMarshaller.getInstance().marshall(
                            integrationResponsesValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (integration.getTlsConfig() != null) {
            TlsConfig tlsConfig = integration.getTlsConfig();
            jsonWriter.name("tlsConfig");
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
