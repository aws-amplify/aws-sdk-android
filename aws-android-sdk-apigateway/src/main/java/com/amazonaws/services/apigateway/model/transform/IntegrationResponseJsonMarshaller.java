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
 * JSON marshaller for POJO IntegrationResponse
 */
class IntegrationResponseJsonMarshaller {

    public void marshall(IntegrationResponse integrationResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (integrationResponse.getStatusCode() != null) {
            String statusCode = integrationResponse.getStatusCode();
            jsonWriter.name("statusCode");
            jsonWriter.value(statusCode);
        }
        if (integrationResponse.getSelectionPattern() != null) {
            String selectionPattern = integrationResponse.getSelectionPattern();
            jsonWriter.name("selectionPattern");
            jsonWriter.value(selectionPattern);
        }
        if (integrationResponse.getResponseParameters() != null) {
            java.util.Map<String, String> responseParameters = integrationResponse
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
        if (integrationResponse.getResponseTemplates() != null) {
            java.util.Map<String, String> responseTemplates = integrationResponse
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
        if (integrationResponse.getContentHandling() != null) {
            String contentHandling = integrationResponse.getContentHandling();
            jsonWriter.name("contentHandling");
            jsonWriter.value(contentHandling);
        }
        jsonWriter.endObject();
    }

    private static IntegrationResponseJsonMarshaller instance;

    public static IntegrationResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IntegrationResponseJsonMarshaller();
        return instance;
    }
}
