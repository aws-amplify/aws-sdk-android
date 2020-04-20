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
 * JSON marshaller for POJO RouteResponse
 */
class RouteResponseJsonMarshaller {

    public void marshall(RouteResponse routeResponse, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (routeResponse.getModelSelectionExpression() != null) {
            String modelSelectionExpression = routeResponse.getModelSelectionExpression();
            jsonWriter.name("ModelSelectionExpression");
            jsonWriter.value(modelSelectionExpression);
        }
        if (routeResponse.getResponseModels() != null) {
            java.util.Map<String, String> responseModels = routeResponse.getResponseModels();
            jsonWriter.name("ResponseModels");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> responseModelsEntry : responseModels
                    .entrySet()) {
                String responseModelsValue = responseModelsEntry.getValue();
                if (responseModelsValue != null) {
                    jsonWriter.name(responseModelsEntry.getKey());
                    jsonWriter.value(responseModelsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (routeResponse.getResponseParameters() != null) {
            java.util.Map<String, ParameterConstraints> responseParameters = routeResponse
                    .getResponseParameters();
            jsonWriter.name("ResponseParameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, ParameterConstraints> responseParametersEntry : responseParameters
                    .entrySet()) {
                ParameterConstraints responseParametersValue = responseParametersEntry.getValue();
                if (responseParametersValue != null) {
                    jsonWriter.name(responseParametersEntry.getKey());
                    ParameterConstraintsJsonMarshaller.getInstance().marshall(
                            responseParametersValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (routeResponse.getRouteResponseId() != null) {
            String routeResponseId = routeResponse.getRouteResponseId();
            jsonWriter.name("RouteResponseId");
            jsonWriter.value(routeResponseId);
        }
        if (routeResponse.getRouteResponseKey() != null) {
            String routeResponseKey = routeResponse.getRouteResponseKey();
            jsonWriter.name("RouteResponseKey");
            jsonWriter.value(routeResponseKey);
        }
        jsonWriter.endObject();
    }

    private static RouteResponseJsonMarshaller instance;

    public static RouteResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RouteResponseJsonMarshaller();
        return instance;
    }
}
