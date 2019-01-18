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
 * JSON marshaller for POJO TableDescription
 */
class TableDescriptionJsonMarshaller {

    public void marshall(TableDescription tableDescription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (tableDescription.getAttributeDefinitions() != null) {
            java.util.List<AttributeDefinition> attributeDefinitions = tableDescription
                    .getAttributeDefinitions();
            jsonWriter.name("AttributeDefinitions");
            jsonWriter.beginArray();
            for (AttributeDefinition attributeDefinitionsItem : attributeDefinitions) {
                if (attributeDefinitionsItem != null) {
                    AttributeDefinitionJsonMarshaller.getInstance().marshall(
                            attributeDefinitionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (tableDescription.getTableName() != null) {
            String tableName = tableDescription.getTableName();
            jsonWriter.name("TableName");
            jsonWriter.value(tableName);
        }
        if (tableDescription.getKeySchema() != null) {
            java.util.List<KeySchemaElement> keySchema = tableDescription.getKeySchema();
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
        if (tableDescription.getTableStatus() != null) {
            String tableStatus = tableDescription.getTableStatus();
            jsonWriter.name("TableStatus");
            jsonWriter.value(tableStatus);
        }
        if (tableDescription.getCreationDateTime() != null) {
            java.util.Date creationDateTime = tableDescription.getCreationDateTime();
            jsonWriter.name("CreationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (tableDescription.getProvisionedThroughput() != null) {
            ProvisionedThroughputDescription provisionedThroughput = tableDescription
                    .getProvisionedThroughput();
            jsonWriter.name("ProvisionedThroughput");
            ProvisionedThroughputDescriptionJsonMarshaller.getInstance().marshall(
                    provisionedThroughput, jsonWriter);
        }
        if (tableDescription.getTableSizeBytes() != null) {
            Long tableSizeBytes = tableDescription.getTableSizeBytes();
            jsonWriter.name("TableSizeBytes");
            jsonWriter.value(tableSizeBytes);
        }
        if (tableDescription.getItemCount() != null) {
            Long itemCount = tableDescription.getItemCount();
            jsonWriter.name("ItemCount");
            jsonWriter.value(itemCount);
        }
        if (tableDescription.getTableArn() != null) {
            String tableArn = tableDescription.getTableArn();
            jsonWriter.name("TableArn");
            jsonWriter.value(tableArn);
        }
        if (tableDescription.getTableId() != null) {
            String tableId = tableDescription.getTableId();
            jsonWriter.name("TableId");
            jsonWriter.value(tableId);
        }
        if (tableDescription.getLocalSecondaryIndexes() != null) {
            java.util.List<LocalSecondaryIndexDescription> localSecondaryIndexes = tableDescription
                    .getLocalSecondaryIndexes();
            jsonWriter.name("LocalSecondaryIndexes");
            jsonWriter.beginArray();
            for (LocalSecondaryIndexDescription localSecondaryIndexesItem : localSecondaryIndexes) {
                if (localSecondaryIndexesItem != null) {
                    LocalSecondaryIndexDescriptionJsonMarshaller.getInstance().marshall(
                            localSecondaryIndexesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (tableDescription.getGlobalSecondaryIndexes() != null) {
            java.util.List<GlobalSecondaryIndexDescription> globalSecondaryIndexes = tableDescription
                    .getGlobalSecondaryIndexes();
            jsonWriter.name("GlobalSecondaryIndexes");
            jsonWriter.beginArray();
            for (GlobalSecondaryIndexDescription globalSecondaryIndexesItem : globalSecondaryIndexes) {
                if (globalSecondaryIndexesItem != null) {
                    GlobalSecondaryIndexDescriptionJsonMarshaller.getInstance().marshall(
                            globalSecondaryIndexesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (tableDescription.getStreamSpecification() != null) {
            StreamSpecification streamSpecification = tableDescription.getStreamSpecification();
            jsonWriter.name("StreamSpecification");
            StreamSpecificationJsonMarshaller.getInstance().marshall(streamSpecification,
                    jsonWriter);
        }
        if (tableDescription.getLatestStreamLabel() != null) {
            String latestStreamLabel = tableDescription.getLatestStreamLabel();
            jsonWriter.name("LatestStreamLabel");
            jsonWriter.value(latestStreamLabel);
        }
        if (tableDescription.getLatestStreamArn() != null) {
            String latestStreamArn = tableDescription.getLatestStreamArn();
            jsonWriter.name("LatestStreamArn");
            jsonWriter.value(latestStreamArn);
        }
        if (tableDescription.getRestoreSummary() != null) {
            RestoreSummary restoreSummary = tableDescription.getRestoreSummary();
            jsonWriter.name("RestoreSummary");
            RestoreSummaryJsonMarshaller.getInstance().marshall(restoreSummary, jsonWriter);
        }
        if (tableDescription.getSSEDescription() != null) {
            SSEDescription sSEDescription = tableDescription.getSSEDescription();
            jsonWriter.name("SSEDescription");
            SSEDescriptionJsonMarshaller.getInstance().marshall(sSEDescription, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TableDescriptionJsonMarshaller instance;

    public static TableDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TableDescriptionJsonMarshaller();
        return instance;
    }
}
