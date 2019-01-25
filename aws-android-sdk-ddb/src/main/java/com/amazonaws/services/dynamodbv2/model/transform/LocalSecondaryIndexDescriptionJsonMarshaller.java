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
 * JSON marshaller for POJO LocalSecondaryIndexDescription
 */
class LocalSecondaryIndexDescriptionJsonMarshaller {

    public void marshall(LocalSecondaryIndexDescription localSecondaryIndexDescription,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (localSecondaryIndexDescription.getIndexName() != null) {
            String indexName = localSecondaryIndexDescription.getIndexName();
            jsonWriter.name("IndexName");
            jsonWriter.value(indexName);
        }
        if (localSecondaryIndexDescription.getKeySchema() != null) {
            java.util.List<KeySchemaElement> keySchema = localSecondaryIndexDescription
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
        if (localSecondaryIndexDescription.getProjection() != null) {
            Projection projection = localSecondaryIndexDescription.getProjection();
            jsonWriter.name("Projection");
            ProjectionJsonMarshaller.getInstance().marshall(projection, jsonWriter);
        }
        if (localSecondaryIndexDescription.getIndexSizeBytes() != null) {
            Long indexSizeBytes = localSecondaryIndexDescription.getIndexSizeBytes();
            jsonWriter.name("IndexSizeBytes");
            jsonWriter.value(indexSizeBytes);
        }
        if (localSecondaryIndexDescription.getItemCount() != null) {
            Long itemCount = localSecondaryIndexDescription.getItemCount();
            jsonWriter.name("ItemCount");
            jsonWriter.value(itemCount);
        }
        if (localSecondaryIndexDescription.getIndexArn() != null) {
            String indexArn = localSecondaryIndexDescription.getIndexArn();
            jsonWriter.name("IndexArn");
            jsonWriter.value(indexArn);
        }
        jsonWriter.endObject();
    }

    private static LocalSecondaryIndexDescriptionJsonMarshaller instance;

    public static LocalSecondaryIndexDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LocalSecondaryIndexDescriptionJsonMarshaller();
        return instance;
    }
}
