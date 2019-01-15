/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ConsumedCapacity
 */
class ConsumedCapacityJsonMarshaller {

    public void marshall(ConsumedCapacity consumedCapacity, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (consumedCapacity.getTableName() != null) {
            String tableName = consumedCapacity.getTableName();
            jsonWriter.name("TableName");
            jsonWriter.value(tableName);
        }
        if (consumedCapacity.getCapacityUnits() != null) {
            Double capacityUnits = consumedCapacity.getCapacityUnits();
            jsonWriter.name("CapacityUnits");
            jsonWriter.value(capacityUnits);
        }
        if (consumedCapacity.getTable() != null) {
            Capacity table = consumedCapacity.getTable();
            jsonWriter.name("Table");
            CapacityJsonMarshaller.getInstance().marshall(table, jsonWriter);
        }
        if (consumedCapacity.getLocalSecondaryIndexes() != null) {
            java.util.Map<String, Capacity> localSecondaryIndexes = consumedCapacity
                    .getLocalSecondaryIndexes();
            jsonWriter.name("LocalSecondaryIndexes");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, Capacity> localSecondaryIndexesEntry : localSecondaryIndexes
                    .entrySet()) {
                Capacity localSecondaryIndexesValue = localSecondaryIndexesEntry.getValue();
                if (localSecondaryIndexesValue != null) {
                    jsonWriter.name(localSecondaryIndexesEntry.getKey());
                    CapacityJsonMarshaller.getInstance().marshall(localSecondaryIndexesValue,
                            jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (consumedCapacity.getGlobalSecondaryIndexes() != null) {
            java.util.Map<String, Capacity> globalSecondaryIndexes = consumedCapacity
                    .getGlobalSecondaryIndexes();
            jsonWriter.name("GlobalSecondaryIndexes");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, Capacity> globalSecondaryIndexesEntry : globalSecondaryIndexes
                    .entrySet()) {
                Capacity globalSecondaryIndexesValue = globalSecondaryIndexesEntry.getValue();
                if (globalSecondaryIndexesValue != null) {
                    jsonWriter.name(globalSecondaryIndexesEntry.getKey());
                    CapacityJsonMarshaller.getInstance().marshall(globalSecondaryIndexesValue,
                            jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static ConsumedCapacityJsonMarshaller instance;

    public static ConsumedCapacityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConsumedCapacityJsonMarshaller();
        return instance;
    }
}
