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
 * JSON marshaller for POJO Method
 */
class MethodJsonMarshaller {

    public void marshall(Method method, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (method.getHttpMethod() != null) {
            String httpMethod = method.getHttpMethod();
            jsonWriter.name("httpMethod");
            jsonWriter.value(httpMethod);
        }
        if (method.getAuthorizationType() != null) {
            String authorizationType = method.getAuthorizationType();
            jsonWriter.name("authorizationType");
            jsonWriter.value(authorizationType);
        }
        if (method.getAuthorizerId() != null) {
            String authorizerId = method.getAuthorizerId();
            jsonWriter.name("authorizerId");
            jsonWriter.value(authorizerId);
        }
        if (method.getApiKeyRequired() != null) {
            Boolean apiKeyRequired = method.getApiKeyRequired();
            jsonWriter.name("apiKeyRequired");
            jsonWriter.value(apiKeyRequired);
        }
        if (method.getRequestValidatorId() != null) {
            String requestValidatorId = method.getRequestValidatorId();
            jsonWriter.name("requestValidatorId");
            jsonWriter.value(requestValidatorId);
        }
        if (method.getOperationName() != null) {
            String operationName = method.getOperationName();
            jsonWriter.name("operationName");
            jsonWriter.value(operationName);
        }
        if (method.getRequestParameters() != null) {
            java.util.Map<String, Boolean> requestParameters = method.getRequestParameters();
            jsonWriter.name("requestParameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, Boolean> requestParametersEntry : requestParameters
                    .entrySet()) {
                Boolean requestParametersValue = requestParametersEntry.getValue();
                if (requestParametersValue != null) {
                    jsonWriter.name(requestParametersEntry.getKey());
                    jsonWriter.value(requestParametersValue);
                }
            }
            jsonWriter.endObject();
        }
        if (method.getRequestModels() != null) {
            java.util.Map<String, String> requestModels = method.getRequestModels();
            jsonWriter.name("requestModels");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> requestModelsEntry : requestModels.entrySet()) {
                String requestModelsValue = requestModelsEntry.getValue();
                if (requestModelsValue != null) {
                    jsonWriter.name(requestModelsEntry.getKey());
                    jsonWriter.value(requestModelsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (method.getMethodResponses() != null) {
            java.util.Map<String, MethodResponse> methodResponses = method.getMethodResponses();
            jsonWriter.name("methodResponses");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, MethodResponse> methodResponsesEntry : methodResponses
                    .entrySet()) {
                MethodResponse methodResponsesValue = methodResponsesEntry.getValue();
                if (methodResponsesValue != null) {
                    jsonWriter.name(methodResponsesEntry.getKey());
                    MethodResponseJsonMarshaller.getInstance().marshall(methodResponsesValue,
                            jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (method.getMethodIntegration() != null) {
            Integration methodIntegration = method.getMethodIntegration();
            jsonWriter.name("methodIntegration");
            IntegrationJsonMarshaller.getInstance().marshall(methodIntegration, jsonWriter);
        }
        if (method.getAuthorizationScopes() != null) {
            java.util.List<String> authorizationScopes = method.getAuthorizationScopes();
            jsonWriter.name("authorizationScopes");
            jsonWriter.beginArray();
            for (String authorizationScopesItem : authorizationScopes) {
                if (authorizationScopesItem != null) {
                    jsonWriter.value(authorizationScopesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static MethodJsonMarshaller instance;

    public static MethodJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MethodJsonMarshaller();
        return instance;
    }
}
