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
 * JSON marshaller for POJO Route
 */
class RouteJsonMarshaller {

    public void marshall(Route route, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (route.getApiGatewayManaged() != null) {
            Boolean apiGatewayManaged = route.getApiGatewayManaged();
            jsonWriter.name("ApiGatewayManaged");
            jsonWriter.value(apiGatewayManaged);
        }
        if (route.getApiKeyRequired() != null) {
            Boolean apiKeyRequired = route.getApiKeyRequired();
            jsonWriter.name("ApiKeyRequired");
            jsonWriter.value(apiKeyRequired);
        }
        if (route.getAuthorizationScopes() != null) {
            java.util.List<String> authorizationScopes = route.getAuthorizationScopes();
            jsonWriter.name("AuthorizationScopes");
            jsonWriter.beginArray();
            for (String authorizationScopesItem : authorizationScopes) {
                if (authorizationScopesItem != null) {
                    jsonWriter.value(authorizationScopesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (route.getAuthorizationType() != null) {
            String authorizationType = route.getAuthorizationType();
            jsonWriter.name("AuthorizationType");
            jsonWriter.value(authorizationType);
        }
        if (route.getAuthorizerId() != null) {
            String authorizerId = route.getAuthorizerId();
            jsonWriter.name("AuthorizerId");
            jsonWriter.value(authorizerId);
        }
        if (route.getModelSelectionExpression() != null) {
            String modelSelectionExpression = route.getModelSelectionExpression();
            jsonWriter.name("ModelSelectionExpression");
            jsonWriter.value(modelSelectionExpression);
        }
        if (route.getOperationName() != null) {
            String operationName = route.getOperationName();
            jsonWriter.name("OperationName");
            jsonWriter.value(operationName);
        }
        if (route.getRequestModels() != null) {
            java.util.Map<String, String> requestModels = route.getRequestModels();
            jsonWriter.name("RequestModels");
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
        if (route.getRequestParameters() != null) {
            java.util.Map<String, ParameterConstraints> requestParameters = route
                    .getRequestParameters();
            jsonWriter.name("RequestParameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, ParameterConstraints> requestParametersEntry : requestParameters
                    .entrySet()) {
                ParameterConstraints requestParametersValue = requestParametersEntry.getValue();
                if (requestParametersValue != null) {
                    jsonWriter.name(requestParametersEntry.getKey());
                    ParameterConstraintsJsonMarshaller.getInstance().marshall(
                            requestParametersValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (route.getRouteId() != null) {
            String routeId = route.getRouteId();
            jsonWriter.name("RouteId");
            jsonWriter.value(routeId);
        }
        if (route.getRouteKey() != null) {
            String routeKey = route.getRouteKey();
            jsonWriter.name("RouteKey");
            jsonWriter.value(routeKey);
        }
        if (route.getRouteResponseSelectionExpression() != null) {
            String routeResponseSelectionExpression = route.getRouteResponseSelectionExpression();
            jsonWriter.name("RouteResponseSelectionExpression");
            jsonWriter.value(routeResponseSelectionExpression);
        }
        if (route.getTarget() != null) {
            String target = route.getTarget();
            jsonWriter.name("Target");
            jsonWriter.value(target);
        }
        jsonWriter.endObject();
    }

    private static RouteJsonMarshaller instance;

    public static RouteJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RouteJsonMarshaller();
        return instance;
    }
}
