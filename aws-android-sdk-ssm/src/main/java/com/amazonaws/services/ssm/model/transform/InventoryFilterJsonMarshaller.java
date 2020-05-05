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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InventoryFilter
 */
class InventoryFilterJsonMarshaller {

    public void marshall(InventoryFilter inventoryFilter, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (inventoryFilter.getKey() != null) {
            String key = inventoryFilter.getKey();
            jsonWriter.name("Key");
            jsonWriter.value(key);
        }
        if (inventoryFilter.getValues() != null) {
            java.util.List<String> values = inventoryFilter.getValues();
            jsonWriter.name("Values");
            jsonWriter.beginArray();
            for (String valuesItem : values) {
                if (valuesItem != null) {
                    jsonWriter.value(valuesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (inventoryFilter.getType() != null) {
            String type = inventoryFilter.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static InventoryFilterJsonMarshaller instance;

    public static InventoryFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InventoryFilterJsonMarshaller();
        return instance;
    }
}
