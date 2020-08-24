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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InventoryItem
 */
class InventoryItemJsonMarshaller {

    public void marshall(InventoryItem inventoryItem, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (inventoryItem.getTypeName() != null) {
            String typeName = inventoryItem.getTypeName();
            jsonWriter.name("TypeName");
            jsonWriter.value(typeName);
        }
        if (inventoryItem.getSchemaVersion() != null) {
            String schemaVersion = inventoryItem.getSchemaVersion();
            jsonWriter.name("SchemaVersion");
            jsonWriter.value(schemaVersion);
        }
        if (inventoryItem.getCaptureTime() != null) {
            String captureTime = inventoryItem.getCaptureTime();
            jsonWriter.name("CaptureTime");
            jsonWriter.value(captureTime);
        }
        if (inventoryItem.getContentHash() != null) {
            String contentHash = inventoryItem.getContentHash();
            jsonWriter.name("ContentHash");
            jsonWriter.value(contentHash);
        }
        if (inventoryItem.getContent() != null) {
            java.util.List<java.util.Map<String, String>> content = inventoryItem.getContent();
            jsonWriter.name("Content");
            jsonWriter.beginArray();
            for (java.util.Map<String, String> contentItem : content) {
                if (contentItem != null) {
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> contentItemEntry : contentItem.entrySet()) {
                String contentItemValue = contentItemEntry.getValue();
                if (contentItemValue != null) {
                    jsonWriter.name(contentItemEntry.getKey());
            jsonWriter.value(contentItemValue);
                }
            }
            jsonWriter.endObject();
                    }
            }
            jsonWriter.endArray();
        }
        if (inventoryItem.getContext() != null) {
            java.util.Map<String, String> context = inventoryItem.getContext();
            jsonWriter.name("Context");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> contextEntry : context.entrySet()) {
                String contextValue = contextEntry.getValue();
                if (contextValue != null) {
                    jsonWriter.name(contextEntry.getKey());
            jsonWriter.value(contextValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static InventoryItemJsonMarshaller instance;
    public static InventoryItemJsonMarshaller getInstance() {
        if (instance == null) instance = new InventoryItemJsonMarshaller();
        return instance;
    }
}
