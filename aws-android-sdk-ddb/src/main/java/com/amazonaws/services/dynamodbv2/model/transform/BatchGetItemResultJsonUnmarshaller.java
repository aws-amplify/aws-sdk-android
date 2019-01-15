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
 * JSON unmarshaller for response BatchGetItemResult
 */
public class BatchGetItemResultJsonUnmarshaller implements
        Unmarshaller<BatchGetItemResult, JsonUnmarshallerContext> {

    public BatchGetItemResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchGetItemResult batchGetItemResult = new BatchGetItemResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Responses")) {
                batchGetItemResult
                        .setResponses(new MapUnmarshaller<java.util.List<java.util.Map<String, AttributeValue>>>(
                                new ListUnmarshaller<java.util.Map<String, AttributeValue>>(
                                        new MapUnmarshaller<AttributeValue>(
                                                AttributeValueJsonUnmarshaller.getInstance()
                                        )
                                )
                        )
                                .unmarshall(context));
            } else if (name.equals("UnprocessedKeys")) {
                batchGetItemResult.setUnprocessedKeys(new MapUnmarshaller<KeysAndAttributes>(
                        KeysAndAttributesJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ConsumedCapacity")) {
                batchGetItemResult.setConsumedCapacity(new ListUnmarshaller<ConsumedCapacity>(
                        ConsumedCapacityJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return batchGetItemResult;
    }

    private static BatchGetItemResultJsonUnmarshaller instance;

    public static BatchGetItemResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchGetItemResultJsonUnmarshaller();
        return instance;
    }
}
