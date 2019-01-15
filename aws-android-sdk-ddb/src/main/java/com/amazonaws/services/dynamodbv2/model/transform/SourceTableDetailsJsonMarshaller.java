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
 * JSON marshaller for POJO SourceTableDetails
 */
class SourceTableDetailsJsonMarshaller {

    public void marshall(SourceTableDetails sourceTableDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sourceTableDetails.getTableName() != null) {
            String tableName = sourceTableDetails.getTableName();
            jsonWriter.name("TableName");
            jsonWriter.value(tableName);
        }
        if (sourceTableDetails.getTableId() != null) {
            String tableId = sourceTableDetails.getTableId();
            jsonWriter.name("TableId");
            jsonWriter.value(tableId);
        }
        if (sourceTableDetails.getTableArn() != null) {
            String tableArn = sourceTableDetails.getTableArn();
            jsonWriter.name("TableArn");
            jsonWriter.value(tableArn);
        }
        if (sourceTableDetails.getTableSizeBytes() != null) {
            Long tableSizeBytes = sourceTableDetails.getTableSizeBytes();
            jsonWriter.name("TableSizeBytes");
            jsonWriter.value(tableSizeBytes);
        }
        if (sourceTableDetails.getKeySchema() != null) {
            java.util.List<KeySchemaElement> keySchema = sourceTableDetails.getKeySchema();
            jsonWriter.name("KeySchema");
            jsonWriter.beginArray();
            for (KeySchemaElement keySchemaItem : keySchema) {
                if (keySchemaItem != null) {
                    KeySchemaElementJsonMarshaller.getInstance()
                            .marshall(keySchemaItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (sourceTableDetails.getTableCreationDateTime() != null) {
            java.util.Date tableCreationDateTime = sourceTableDetails.getTableCreationDateTime();
            jsonWriter.name("TableCreationDateTime");
            jsonWriter.value(tableCreationDateTime);
        }
        if (sourceTableDetails.getProvisionedThroughput() != null) {
            ProvisionedThroughput provisionedThroughput = sourceTableDetails
                    .getProvisionedThroughput();
            jsonWriter.name("ProvisionedThroughput");
            ProvisionedThroughputJsonMarshaller.getInstance().marshall(provisionedThroughput,
                    jsonWriter);
        }
        if (sourceTableDetails.getItemCount() != null) {
            Long itemCount = sourceTableDetails.getItemCount();
            jsonWriter.name("ItemCount");
            jsonWriter.value(itemCount);
        }
        jsonWriter.endObject();
    }

    private static SourceTableDetailsJsonMarshaller instance;

    public static SourceTableDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SourceTableDetailsJsonMarshaller();
        return instance;
    }
}
