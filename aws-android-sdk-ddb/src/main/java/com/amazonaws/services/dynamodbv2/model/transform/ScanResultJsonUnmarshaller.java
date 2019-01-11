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
 * JSON unmarshaller for response ScanResult
 */
public class ScanResultJsonUnmarshaller implements
        Unmarshaller<ScanResult, JsonUnmarshallerContext> {

    public ScanResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ScanResult scanResult = new ScanResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Items")) {
                scanResult.setItems(new ListUnmarshaller<java.util.Map<String, AttributeValue>>(
                        new MapUnmarshaller<AttributeValue>(AttributeValueJsonUnmarshaller
                                .getInstance()
                        )
                        )
                                .unmarshall(context));
            } else if (name.equals("Count")) {
                scanResult.setCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScannedCount")) {
                scanResult.setScannedCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastEvaluatedKey")) {
                scanResult.setLastEvaluatedKey(new MapUnmarshaller<AttributeValue>(
                        AttributeValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ConsumedCapacity")) {
                scanResult.setConsumedCapacity(ConsumedCapacityJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return scanResult;
    }

    private static ScanResultJsonUnmarshaller instance;

    public static ScanResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScanResultJsonUnmarshaller();
        return instance;
    }
}
