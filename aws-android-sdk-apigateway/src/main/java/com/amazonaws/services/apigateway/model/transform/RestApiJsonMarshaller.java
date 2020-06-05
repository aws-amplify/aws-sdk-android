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
 * JSON marshaller for POJO RestApi
 */
class RestApiJsonMarshaller {

    public void marshall(RestApi restApi, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (restApi.getId() != null) {
            String id = restApi.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (restApi.getName() != null) {
            String name = restApi.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (restApi.getDescription() != null) {
            String description = restApi.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (restApi.getCreatedDate() != null) {
            java.util.Date createdDate = restApi.getCreatedDate();
            jsonWriter.name("createdDate");
            jsonWriter.value(createdDate);
        }
        if (restApi.getVersion() != null) {
            String version = restApi.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        if (restApi.getWarnings() != null) {
            java.util.List<String> warnings = restApi.getWarnings();
            jsonWriter.name("warnings");
            jsonWriter.beginArray();
            for (String warningsItem : warnings) {
                if (warningsItem != null) {
                    jsonWriter.value(warningsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (restApi.getBinaryMediaTypes() != null) {
            java.util.List<String> binaryMediaTypes = restApi.getBinaryMediaTypes();
            jsonWriter.name("binaryMediaTypes");
            jsonWriter.beginArray();
            for (String binaryMediaTypesItem : binaryMediaTypes) {
                if (binaryMediaTypesItem != null) {
                    jsonWriter.value(binaryMediaTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (restApi.getMinimumCompressionSize() != null) {
            Integer minimumCompressionSize = restApi.getMinimumCompressionSize();
            jsonWriter.name("minimumCompressionSize");
            jsonWriter.value(minimumCompressionSize);
        }
        if (restApi.getApiKeySource() != null) {
            String apiKeySource = restApi.getApiKeySource();
            jsonWriter.name("apiKeySource");
            jsonWriter.value(apiKeySource);
        }
        if (restApi.getEndpointConfiguration() != null) {
            EndpointConfiguration endpointConfiguration = restApi.getEndpointConfiguration();
            jsonWriter.name("endpointConfiguration");
            EndpointConfigurationJsonMarshaller.getInstance().marshall(endpointConfiguration,
                    jsonWriter);
        }
        if (restApi.getPolicy() != null) {
            String policy = restApi.getPolicy();
            jsonWriter.name("policy");
            jsonWriter.value(policy);
        }
        if (restApi.getTags() != null) {
            java.util.Map<String, String> tags = restApi.getTags();
            jsonWriter.name("tags");
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
        jsonWriter.endObject();
    }

    private static RestApiJsonMarshaller instance;

    public static RestApiJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RestApiJsonMarshaller();
        return instance;
    }
}
