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
 * JSON marshaller for POJO GatewayResponse
 */
class GatewayResponseJsonMarshaller {

    public void marshall(GatewayResponse gatewayResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (gatewayResponse.getResponseType() != null) {
            String responseType = gatewayResponse.getResponseType();
            jsonWriter.name("responseType");
            jsonWriter.value(responseType);
        }
        if (gatewayResponse.getStatusCode() != null) {
            String statusCode = gatewayResponse.getStatusCode();
            jsonWriter.name("statusCode");
            jsonWriter.value(statusCode);
        }
        if (gatewayResponse.getResponseParameters() != null) {
            java.util.Map<String, String> responseParameters = gatewayResponse
                    .getResponseParameters();
            jsonWriter.name("responseParameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> responseParametersEntry : responseParameters
                    .entrySet()) {
                String responseParametersValue = responseParametersEntry.getValue();
                if (responseParametersValue != null) {
                    jsonWriter.name(responseParametersEntry.getKey());
                    jsonWriter.value(responseParametersValue);
                }
            }
            jsonWriter.endObject();
        }
        if (gatewayResponse.getResponseTemplates() != null) {
            java.util.Map<String, String> responseTemplates = gatewayResponse
                    .getResponseTemplates();
            jsonWriter.name("responseTemplates");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> responseTemplatesEntry : responseTemplates
                    .entrySet()) {
                String responseTemplatesValue = responseTemplatesEntry.getValue();
                if (responseTemplatesValue != null) {
                    jsonWriter.name(responseTemplatesEntry.getKey());
                    jsonWriter.value(responseTemplatesValue);
                }
            }
            jsonWriter.endObject();
        }
        if (gatewayResponse.getDefaultResponse() != null) {
            Boolean defaultResponse = gatewayResponse.getDefaultResponse();
            jsonWriter.name("defaultResponse");
            jsonWriter.value(defaultResponse);
        }
        jsonWriter.endObject();
    }

    private static GatewayResponseJsonMarshaller instance;

    public static GatewayResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GatewayResponseJsonMarshaller();
        return instance;
    }
}
