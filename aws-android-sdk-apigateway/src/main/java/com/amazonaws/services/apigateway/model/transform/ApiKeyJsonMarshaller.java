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
 * JSON marshaller for POJO ApiKey
 */
class ApiKeyJsonMarshaller {

    public void marshall(ApiKey apiKey, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (apiKey.getId() != null) {
            String id = apiKey.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (apiKey.getValue() != null) {
            String value = apiKey.getValue();
            jsonWriter.name("value");
            jsonWriter.value(value);
        }
        if (apiKey.getName() != null) {
            String name = apiKey.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (apiKey.getCustomerId() != null) {
            String customerId = apiKey.getCustomerId();
            jsonWriter.name("customerId");
            jsonWriter.value(customerId);
        }
        if (apiKey.getDescription() != null) {
            String description = apiKey.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (apiKey.getEnabled() != null) {
            Boolean enabled = apiKey.getEnabled();
            jsonWriter.name("enabled");
            jsonWriter.value(enabled);
        }
        if (apiKey.getCreatedDate() != null) {
            java.util.Date createdDate = apiKey.getCreatedDate();
            jsonWriter.name("createdDate");
            jsonWriter.value(createdDate);
        }
        if (apiKey.getLastUpdatedDate() != null) {
            java.util.Date lastUpdatedDate = apiKey.getLastUpdatedDate();
            jsonWriter.name("lastUpdatedDate");
            jsonWriter.value(lastUpdatedDate);
        }
        if (apiKey.getStageKeys() != null) {
            java.util.List<String> stageKeys = apiKey.getStageKeys();
            jsonWriter.name("stageKeys");
            jsonWriter.beginArray();
            for (String stageKeysItem : stageKeys) {
                if (stageKeysItem != null) {
                    jsonWriter.value(stageKeysItem);
                }
            }
            jsonWriter.endArray();
        }
        if (apiKey.getTags() != null) {
            java.util.Map<String, String> tags = apiKey.getTags();
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

    private static ApiKeyJsonMarshaller instance;

    public static ApiKeyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ApiKeyJsonMarshaller();
        return instance;
    }
}
