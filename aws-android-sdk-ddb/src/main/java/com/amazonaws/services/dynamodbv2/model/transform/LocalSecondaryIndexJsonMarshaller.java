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
 * JSON marshaller for POJO LocalSecondaryIndex
 */
class LocalSecondaryIndexJsonMarshaller {

    public void marshall(LocalSecondaryIndex localSecondaryIndex, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (localSecondaryIndex.getIndexName() != null) {
            String indexName = localSecondaryIndex.getIndexName();
            jsonWriter.name("IndexName");
            jsonWriter.value(indexName);
        }
        if (localSecondaryIndex.getKeySchema() != null) {
            java.util.List<KeySchemaElement> keySchema = localSecondaryIndex.getKeySchema();
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
        if (localSecondaryIndex.getProjection() != null) {
            Projection projection = localSecondaryIndex.getProjection();
            jsonWriter.name("Projection");
            ProjectionJsonMarshaller.getInstance().marshall(projection, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static LocalSecondaryIndexJsonMarshaller instance;

    public static LocalSecondaryIndexJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LocalSecondaryIndexJsonMarshaller();
        return instance;
    }
}
