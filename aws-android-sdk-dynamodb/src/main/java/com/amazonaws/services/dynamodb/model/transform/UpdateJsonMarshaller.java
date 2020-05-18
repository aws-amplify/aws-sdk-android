/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodb.model.transform;

import com.amazonaws.services.dynamodb.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Update
 */
class UpdateJsonMarshaller {

    public void marshall(Update update, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (update.getKey() != null) {
            java.util.Map<String, AttributeValue> key = update.getKey();
            jsonWriter.name("Key");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, AttributeValue> keyEntry : key.entrySet()) {
                AttributeValue keyValue = keyEntry.getValue();
                if (keyValue != null) {
                    jsonWriter.name(keyEntry.getKey());
                    AttributeValueJsonMarshaller.getInstance().marshall(keyValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (update.getUpdateExpression() != null) {
            String updateExpression = update.getUpdateExpression();
            jsonWriter.name("UpdateExpression");
            jsonWriter.value(updateExpression);
        }
        if (update.getTableName() != null) {
            String tableName = update.getTableName();
            jsonWriter.name("TableName");
            jsonWriter.value(tableName);
        }
        if (update.getConditionExpression() != null) {
            String conditionExpression = update.getConditionExpression();
            jsonWriter.name("ConditionExpression");
            jsonWriter.value(conditionExpression);
        }
        if (update.getExpressionAttributeNames() != null) {
            java.util.Map<String, String> expressionAttributeNames = update
                    .getExpressionAttributeNames();
            jsonWriter.name("ExpressionAttributeNames");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> expressionAttributeNamesEntry : expressionAttributeNames
                    .entrySet()) {
                String expressionAttributeNamesValue = expressionAttributeNamesEntry.getValue();
                if (expressionAttributeNamesValue != null) {
                    jsonWriter.name(expressionAttributeNamesEntry.getKey());
                    jsonWriter.value(expressionAttributeNamesValue);
                }
            }
            jsonWriter.endObject();
        }
        if (update.getExpressionAttributeValues() != null) {
            java.util.Map<String, AttributeValue> expressionAttributeValues = update
                    .getExpressionAttributeValues();
            jsonWriter.name("ExpressionAttributeValues");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, AttributeValue> expressionAttributeValuesEntry : expressionAttributeValues
                    .entrySet()) {
                AttributeValue expressionAttributeValuesValue = expressionAttributeValuesEntry
                        .getValue();
                if (expressionAttributeValuesValue != null) {
                    jsonWriter.name(expressionAttributeValuesEntry.getKey());
                    AttributeValueJsonMarshaller.getInstance().marshall(
                            expressionAttributeValuesValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (update.getReturnValuesOnConditionCheckFailure() != null) {
            String returnValuesOnConditionCheckFailure = update
                    .getReturnValuesOnConditionCheckFailure();
            jsonWriter.name("ReturnValuesOnConditionCheckFailure");
            jsonWriter.value(returnValuesOnConditionCheckFailure);
        }
        jsonWriter.endObject();
    }

    private static UpdateJsonMarshaller instance;

    public static UpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UpdateJsonMarshaller();
        return instance;
    }
}
