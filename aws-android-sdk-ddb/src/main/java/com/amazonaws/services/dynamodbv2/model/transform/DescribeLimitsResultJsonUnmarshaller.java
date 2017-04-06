/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for response DescribeLimitsResult
 */
public class DescribeLimitsResultJsonUnmarshaller implements
        Unmarshaller<DescribeLimitsResult, JsonUnmarshallerContext> {

    public DescribeLimitsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeLimitsResult describeLimitsResult = new DescribeLimitsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AccountMaxReadCapacityUnits")) {
                describeLimitsResult.setAccountMaxReadCapacityUnits(LongJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AccountMaxWriteCapacityUnits")) {
                describeLimitsResult.setAccountMaxWriteCapacityUnits(LongJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TableMaxReadCapacityUnits")) {
                describeLimitsResult.setTableMaxReadCapacityUnits(LongJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TableMaxWriteCapacityUnits")) {
                describeLimitsResult.setTableMaxWriteCapacityUnits(LongJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeLimitsResult;
    }

    private static DescribeLimitsResultJsonUnmarshaller instance;

    public static DescribeLimitsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeLimitsResultJsonUnmarshaller();
        return instance;
    }
}
