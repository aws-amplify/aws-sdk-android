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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response BatchWriteItemResult
 */
public class BatchWriteItemResultJsonUnmarshaller implements
        Unmarshaller<BatchWriteItemResult, JsonUnmarshallerContext> {

    public BatchWriteItemResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchWriteItemResult batchWriteItemResult = new BatchWriteItemResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("UnprocessedItems")) {
                batchWriteItemResult
                        .setUnprocessedItems(new MapUnmarshaller<java.util.List<WriteRequest>>(
                                new ListUnmarshaller<WriteRequest>(WriteRequestJsonUnmarshaller
                                        .getInstance()
                                )
                        )
                                .unmarshall(context));
            } else if (name.equals("ItemCollectionMetrics")) {
                batchWriteItemResult
                        .setItemCollectionMetrics(new MapUnmarshaller<java.util.List<ItemCollectionMetrics>>(
                                new ListUnmarshaller<ItemCollectionMetrics>(
                                        ItemCollectionMetricsJsonUnmarshaller.getInstance()
                                )
                        )
                                .unmarshall(context));
            } else if (name.equals("ConsumedCapacity")) {
                batchWriteItemResult.setConsumedCapacity(new ListUnmarshaller<ConsumedCapacity>(
                        ConsumedCapacityJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return batchWriteItemResult;
    }

    private static BatchWriteItemResultJsonUnmarshaller instance;

    public static BatchWriteItemResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchWriteItemResultJsonUnmarshaller();
        return instance;
    }
}
