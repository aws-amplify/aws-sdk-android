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
 * JSON marshaller for POJO Api
 */
class ApiJsonMarshaller {

    public void marshall(Api api, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (api.getApiEndpoint() != null) {
            String apiEndpoint = api.getApiEndpoint();
            jsonWriter.name("ApiEndpoint");
            jsonWriter.value(apiEndpoint);
        }
        if (api.getApiId() != null) {
            String apiId = api.getApiId();
            jsonWriter.name("ApiId");
            jsonWriter.value(apiId);
        }
        if (api.getApiKeySelectionExpression() != null) {
            String apiKeySelectionExpression = api.getApiKeySelectionExpression();
            jsonWriter.name("ApiKeySelectionExpression");
            jsonWriter.value(apiKeySelectionExpression);
        }
        if (api.getCorsConfiguration() != null) {
            Cors corsConfiguration = api.getCorsConfiguration();
            jsonWriter.name("CorsConfiguration");
            CorsJsonMarshaller.getInstance().marshall(corsConfiguration, jsonWriter);
        }
        if (api.getCreatedDate() != null) {
            java.util.Date createdDate = api.getCreatedDate();
            jsonWriter.name("CreatedDate");
            jsonWriter.value(createdDate);
        }
        if (api.getDescription() != null) {
            String description = api.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (api.getDisableSchemaValidation() != null) {
            Boolean disableSchemaValidation = api.getDisableSchemaValidation();
            jsonWriter.name("DisableSchemaValidation");
            jsonWriter.value(disableSchemaValidation);
        }
        if (api.getImportInfo() != null) {
            java.util.List<String> importInfo = api.getImportInfo();
            jsonWriter.name("ImportInfo");
            jsonWriter.beginArray();
            for (String importInfoItem : importInfo) {
                if (importInfoItem != null) {
                    jsonWriter.value(importInfoItem);
                }
            }
            jsonWriter.endArray();
        }
        if (api.getName() != null) {
            String name = api.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (api.getProtocolType() != null) {
            String protocolType = api.getProtocolType();
            jsonWriter.name("ProtocolType");
            jsonWriter.value(protocolType);
        }
        if (api.getRouteSelectionExpression() != null) {
            String routeSelectionExpression = api.getRouteSelectionExpression();
            jsonWriter.name("RouteSelectionExpression");
            jsonWriter.value(routeSelectionExpression);
        }
        if (api.getTags() != null) {
            java.util.Map<String, String> tags = api.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (api.getVersion() != null) {
            String version = api.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        if (api.getWarnings() != null) {
            java.util.List<String> warnings = api.getWarnings();
            jsonWriter.name("Warnings");
            jsonWriter.beginArray();
            for (String warningsItem : warnings) {
                if (warningsItem != null) {
                    jsonWriter.value(warningsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ApiJsonMarshaller instance;

    public static ApiJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ApiJsonMarshaller();
        return instance;
    }
}
