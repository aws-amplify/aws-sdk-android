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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DynamoDBv2Action
 */
class DynamoDBv2ActionJsonUnmarshaller implements
        Unmarshaller<DynamoDBv2Action, JsonUnmarshallerContext> {

    public DynamoDBv2Action unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DynamoDBv2Action dynamoDBv2Action = new DynamoDBv2Action();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("roleArn")) {
                dynamoDBv2Action.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("putItem")) {
                dynamoDBv2Action.setPutItem(PutItemInputJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return dynamoDBv2Action;
    }

    private static DynamoDBv2ActionJsonUnmarshaller instance;

    public static DynamoDBv2ActionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DynamoDBv2ActionJsonUnmarshaller();
        return instance;
    }
}
