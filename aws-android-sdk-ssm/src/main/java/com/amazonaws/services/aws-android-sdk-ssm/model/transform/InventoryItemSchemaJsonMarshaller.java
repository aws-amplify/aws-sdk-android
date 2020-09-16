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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InventoryItemSchema
 */
class InventoryItemSchemaJsonMarshaller {

    public void marshall(InventoryItemSchema inventoryItemSchema, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (inventoryItemSchema.getTypeName() != null) {
            String typeName = inventoryItemSchema.getTypeName();
            jsonWriter.name("TypeName");
            jsonWriter.value(typeName);
        }
        if (inventoryItemSchema.getVersion() != null) {
            String version = inventoryItemSchema.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        if (inventoryItemSchema.getAttributes() != null) {
            java.util.List<InventoryItemAttribute> attributes = inventoryItemSchema.getAttributes();
            jsonWriter.name("Attributes");
            jsonWriter.beginArray();
            for (InventoryItemAttribute attributesItem : attributes) {
                if (attributesItem != null) {
            InventoryItemAttributeJsonMarshaller.getInstance().marshall(attributesItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (inventoryItemSchema.getDisplayName() != null) {
            String displayName = inventoryItemSchema.getDisplayName();
            jsonWriter.name("DisplayName");
            jsonWriter.value(displayName);
        }
        jsonWriter.endObject();
    }

    private static InventoryItemSchemaJsonMarshaller instance;
    public static InventoryItemSchemaJsonMarshaller getInstance() {
        if (instance == null) instance = new InventoryItemSchemaJsonMarshaller();
        return instance;
    }
}
