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
 * JSON marshaller for POJO CreateGlobalSecondaryIndexAction
 */
class CreateGlobalSecondaryIndexActionJsonMarshaller {

    public void marshall(CreateGlobalSecondaryIndexAction createGlobalSecondaryIndexAction,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (createGlobalSecondaryIndexAction.getIndexName() != null) {
            String indexName = createGlobalSecondaryIndexAction.getIndexName();
            jsonWriter.name("IndexName");
            jsonWriter.value(indexName);
        }
        if (createGlobalSecondaryIndexAction.getKeySchema() != null) {
            java.util.List<KeySchemaElement> keySchema = createGlobalSecondaryIndexAction
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
        if (createGlobalSecondaryIndexAction.getProjection() != null) {
            Projection projection = createGlobalSecondaryIndexAction.getProjection();
            jsonWriter.name("Projection");
            ProjectionJsonMarshaller.getInstance().marshall(projection, jsonWriter);
        }
        if (createGlobalSecondaryIndexAction.getProvisionedThroughput() != null) {
            ProvisionedThroughput provisionedThroughput = createGlobalSecondaryIndexAction
                    .getProvisionedThroughput();
            jsonWriter.name("ProvisionedThroughput");
            ProvisionedThroughputJsonMarshaller.getInstance().marshall(provisionedThroughput,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static CreateGlobalSecondaryIndexActionJsonMarshaller instance;

    public static CreateGlobalSecondaryIndexActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreateGlobalSecondaryIndexActionJsonMarshaller();
        return instance;
    }
}
