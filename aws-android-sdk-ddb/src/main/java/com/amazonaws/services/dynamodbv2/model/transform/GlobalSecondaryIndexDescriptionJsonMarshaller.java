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
 * JSON marshaller for POJO GlobalSecondaryIndexDescription
 */
class GlobalSecondaryIndexDescriptionJsonMarshaller {

    public void marshall(GlobalSecondaryIndexDescription globalSecondaryIndexDescription,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (globalSecondaryIndexDescription.getIndexName() != null) {
            String indexName = globalSecondaryIndexDescription.getIndexName();
            jsonWriter.name("IndexName");
            jsonWriter.value(indexName);
        }
        if (globalSecondaryIndexDescription.getKeySchema() != null) {
            java.util.List<KeySchemaElement> keySchema = globalSecondaryIndexDescription
                    .getKeySchema();
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
        if (globalSecondaryIndexDescription.getProjection() != null) {
            Projection projection = globalSecondaryIndexDescription.getProjection();
            jsonWriter.name("Projection");
            ProjectionJsonMarshaller.getInstance().marshall(projection, jsonWriter);
        }
        if (globalSecondaryIndexDescription.getIndexStatus() != null) {
            String indexStatus = globalSecondaryIndexDescription.getIndexStatus();
            jsonWriter.name("IndexStatus");
            jsonWriter.value(indexStatus);
        }
        if (globalSecondaryIndexDescription.getBackfilling() != null) {
            Boolean backfilling = globalSecondaryIndexDescription.getBackfilling();
            jsonWriter.name("Backfilling");
            jsonWriter.value(backfilling);
        }
        if (globalSecondaryIndexDescription.getProvisionedThroughput() != null) {
            ProvisionedThroughputDescription provisionedThroughput = globalSecondaryIndexDescription
                    .getProvisionedThroughput();
            jsonWriter.name("ProvisionedThroughput");
            ProvisionedThroughputDescriptionJsonMarshaller.getInstance().marshall(
                    provisionedThroughput, jsonWriter);
        }
        if (globalSecondaryIndexDescription.getIndexSizeBytes() != null) {
            Long indexSizeBytes = globalSecondaryIndexDescription.getIndexSizeBytes();
            jsonWriter.name("IndexSizeBytes");
            jsonWriter.value(indexSizeBytes);
        }
        if (globalSecondaryIndexDescription.getItemCount() != null) {
            Long itemCount = globalSecondaryIndexDescription.getItemCount();
            jsonWriter.name("ItemCount");
            jsonWriter.value(itemCount);
        }
        if (globalSecondaryIndexDescription.getIndexArn() != null) {
            String indexArn = globalSecondaryIndexDescription.getIndexArn();
            jsonWriter.name("IndexArn");
            jsonWriter.value(indexArn);
        }
        jsonWriter.endObject();
    }

    private static GlobalSecondaryIndexDescriptionJsonMarshaller instance;

    public static GlobalSecondaryIndexDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GlobalSecondaryIndexDescriptionJsonMarshaller();
        return instance;
    }
}
