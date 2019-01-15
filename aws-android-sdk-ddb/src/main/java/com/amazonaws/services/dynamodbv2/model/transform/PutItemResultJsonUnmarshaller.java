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
 * JSON unmarshaller for response PutItemResult
 */
public class PutItemResultJsonUnmarshaller implements
        Unmarshaller<PutItemResult, JsonUnmarshallerContext> {

    public PutItemResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutItemResult putItemResult = new PutItemResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Attributes")) {
                putItemResult.setAttributes(new MapUnmarshaller<AttributeValue>(
                        AttributeValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ConsumedCapacity")) {
                putItemResult.setConsumedCapacity(ConsumedCapacityJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ItemCollectionMetrics")) {
                putItemResult.setItemCollectionMetrics(ItemCollectionMetricsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return putItemResult;
    }

    private static PutItemResultJsonUnmarshaller instance;

    public static PutItemResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutItemResultJsonUnmarshaller();
        return instance;
    }
}
