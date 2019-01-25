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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DynamoDBAction
 */
class DynamoDBActionJsonMarshaller {

    public void marshall(DynamoDBAction dynamoDBAction, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dynamoDBAction.getTableName() != null) {
            String tableName = dynamoDBAction.getTableName();
            jsonWriter.name("tableName");
            jsonWriter.value(tableName);
        }
        if (dynamoDBAction.getRoleArn() != null) {
            String roleArn = dynamoDBAction.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (dynamoDBAction.getOperation() != null) {
            String operation = dynamoDBAction.getOperation();
            jsonWriter.name("operation");
            jsonWriter.value(operation);
        }
        if (dynamoDBAction.getHashKeyField() != null) {
            String hashKeyField = dynamoDBAction.getHashKeyField();
            jsonWriter.name("hashKeyField");
            jsonWriter.value(hashKeyField);
        }
        if (dynamoDBAction.getHashKeyValue() != null) {
            String hashKeyValue = dynamoDBAction.getHashKeyValue();
            jsonWriter.name("hashKeyValue");
            jsonWriter.value(hashKeyValue);
        }
        if (dynamoDBAction.getHashKeyType() != null) {
            String hashKeyType = dynamoDBAction.getHashKeyType();
            jsonWriter.name("hashKeyType");
            jsonWriter.value(hashKeyType);
        }
        if (dynamoDBAction.getRangeKeyField() != null) {
            String rangeKeyField = dynamoDBAction.getRangeKeyField();
            jsonWriter.name("rangeKeyField");
            jsonWriter.value(rangeKeyField);
        }
        if (dynamoDBAction.getRangeKeyValue() != null) {
            String rangeKeyValue = dynamoDBAction.getRangeKeyValue();
            jsonWriter.name("rangeKeyValue");
            jsonWriter.value(rangeKeyValue);
        }
        if (dynamoDBAction.getRangeKeyType() != null) {
            String rangeKeyType = dynamoDBAction.getRangeKeyType();
            jsonWriter.name("rangeKeyType");
            jsonWriter.value(rangeKeyType);
        }
        if (dynamoDBAction.getPayloadField() != null) {
            String payloadField = dynamoDBAction.getPayloadField();
            jsonWriter.name("payloadField");
            jsonWriter.value(payloadField);
        }
        jsonWriter.endObject();
    }

    private static DynamoDBActionJsonMarshaller instance;

    public static DynamoDBActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DynamoDBActionJsonMarshaller();
        return instance;
    }
}
