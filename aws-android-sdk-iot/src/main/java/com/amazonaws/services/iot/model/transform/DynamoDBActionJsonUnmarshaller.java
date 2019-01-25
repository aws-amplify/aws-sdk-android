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
 * JSON unmarshaller for POJO DynamoDBAction
 */
class DynamoDBActionJsonUnmarshaller implements
        Unmarshaller<DynamoDBAction, JsonUnmarshallerContext> {

    public DynamoDBAction unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DynamoDBAction dynamoDBAction = new DynamoDBAction();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("tableName")) {
                dynamoDBAction.setTableName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("roleArn")) {
                dynamoDBAction.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("operation")) {
                dynamoDBAction.setOperation(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("hashKeyField")) {
                dynamoDBAction.setHashKeyField(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("hashKeyValue")) {
                dynamoDBAction.setHashKeyValue(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("hashKeyType")) {
                dynamoDBAction.setHashKeyType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("rangeKeyField")) {
                dynamoDBAction.setRangeKeyField(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("rangeKeyValue")) {
                dynamoDBAction.setRangeKeyValue(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("rangeKeyType")) {
                dynamoDBAction.setRangeKeyType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("payloadField")) {
                dynamoDBAction.setPayloadField(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return dynamoDBAction;
    }

    private static DynamoDBActionJsonUnmarshaller instance;

    public static DynamoDBActionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DynamoDBActionJsonUnmarshaller();
        return instance;
    }
}
