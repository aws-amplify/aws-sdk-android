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
 * JSON marshaller for POJO MethodResponse
 */
class MethodResponseJsonMarshaller {

    public void marshall(MethodResponse methodResponse, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (methodResponse.getStatusCode() != null) {
            String statusCode = methodResponse.getStatusCode();
            jsonWriter.name("statusCode");
            jsonWriter.value(statusCode);
        }
        if (methodResponse.getResponseParameters() != null) {
            java.util.Map<String, Boolean> responseParameters = methodResponse
                    .getResponseParameters();
            jsonWriter.name("responseParameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, Boolean> responseParametersEntry : responseParameters
                    .entrySet()) {
                Boolean responseParametersValue = responseParametersEntry.getValue();
                if (responseParametersValue != null) {
                    jsonWriter.name(responseParametersEntry.getKey());
                    jsonWriter.value(responseParametersValue);
                }
            }
            jsonWriter.endObject();
        }
        if (methodResponse.getResponseModels() != null) {
            java.util.Map<String, String> responseModels = methodResponse.getResponseModels();
            jsonWriter.name("responseModels");
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
        jsonWriter.endObject();
    }

    private static MethodResponseJsonMarshaller instance;

    public static MethodResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MethodResponseJsonMarshaller();
        return instance;
    }
}
