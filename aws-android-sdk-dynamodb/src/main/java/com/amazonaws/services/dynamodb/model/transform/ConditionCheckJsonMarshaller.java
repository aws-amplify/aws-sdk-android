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
 * JSON marshaller for POJO ConditionCheck
 */
class ConditionCheckJsonMarshaller {

    public void marshall(ConditionCheck conditionCheck, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (conditionCheck.getKey() != null) {
            java.util.Map<String, AttributeValue> key = conditionCheck.getKey();
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
        if (conditionCheck.getTableName() != null) {
            String tableName = conditionCheck.getTableName();
            jsonWriter.name("TableName");
            jsonWriter.value(tableName);
        }
        if (conditionCheck.getConditionExpression() != null) {
            String conditionExpression = conditionCheck.getConditionExpression();
            jsonWriter.name("ConditionExpression");
            jsonWriter.value(conditionExpression);
        }
        if (conditionCheck.getExpressionAttributeNames() != null) {
            java.util.Map<String, String> expressionAttributeNames = conditionCheck
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
        if (conditionCheck.getExpressionAttributeValues() != null) {
            java.util.Map<String, AttributeValue> expressionAttributeValues = conditionCheck
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
        if (conditionCheck.getReturnValuesOnConditionCheckFailure() != null) {
            String returnValuesOnConditionCheckFailure = conditionCheck
                    .getReturnValuesOnConditionCheckFailure();
            jsonWriter.name("ReturnValuesOnConditionCheckFailure");
            jsonWriter.value(returnValuesOnConditionCheckFailure);
        }
        jsonWriter.endObject();
    }

    private static ConditionCheckJsonMarshaller instance;

    public static ConditionCheckJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConditionCheckJsonMarshaller();
        return instance;
    }
}
