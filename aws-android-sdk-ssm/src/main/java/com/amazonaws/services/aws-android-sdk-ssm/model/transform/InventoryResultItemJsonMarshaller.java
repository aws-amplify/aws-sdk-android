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
 * JSON marshaller for POJO InventoryResultItem
 */
class InventoryResultItemJsonMarshaller {

    public void marshall(InventoryResultItem inventoryResultItem, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (inventoryResultItem.getTypeName() != null) {
            String typeName = inventoryResultItem.getTypeName();
            jsonWriter.name("TypeName");
            jsonWriter.value(typeName);
        }
        if (inventoryResultItem.getSchemaVersion() != null) {
            String schemaVersion = inventoryResultItem.getSchemaVersion();
            jsonWriter.name("SchemaVersion");
            jsonWriter.value(schemaVersion);
        }
        if (inventoryResultItem.getCaptureTime() != null) {
            String captureTime = inventoryResultItem.getCaptureTime();
            jsonWriter.name("CaptureTime");
            jsonWriter.value(captureTime);
        }
        if (inventoryResultItem.getContentHash() != null) {
            String contentHash = inventoryResultItem.getContentHash();
            jsonWriter.name("ContentHash");
            jsonWriter.value(contentHash);
        }
        if (inventoryResultItem.getContent() != null) {
            java.util.List<java.util.Map<String, String>> content = inventoryResultItem.getContent();
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
        jsonWriter.endObject();
    }

    private static InventoryResultItemJsonMarshaller instance;
    public static InventoryResultItemJsonMarshaller getInstance() {
        if (instance == null) instance = new InventoryResultItemJsonMarshaller();
        return instance;
    }
}
