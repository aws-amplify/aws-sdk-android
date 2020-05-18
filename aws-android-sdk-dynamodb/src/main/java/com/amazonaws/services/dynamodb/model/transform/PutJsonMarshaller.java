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
 * JSON marshaller for POJO Put
 */
class PutJsonMarshaller {

    public void marshall(Put put, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (put.getItem() != null) {
            java.util.Map<String, AttributeValue> item = put.getItem();
            jsonWriter.name("Item");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, AttributeValue> itemEntry : item.entrySet()) {
                AttributeValue itemValue = itemEntry.getValue();
                if (itemValue != null) {
                    jsonWriter.name(itemEntry.getKey());
                    AttributeValueJsonMarshaller.getInstance().marshall(itemValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (put.getTableName() != null) {
            String tableName = put.getTableName();
            jsonWriter.name("TableName");
            jsonWriter.value(tableName);
        }
        if (put.getConditionExpression() != null) {
            String conditionExpression = put.getConditionExpression();
            jsonWriter.name("ConditionExpression");
            jsonWriter.value(conditionExpression);
        }
        if (put.getExpressionAttributeNames() != null) {
            java.util.Map<String, String> expressionAttributeNames = put
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
        if (put.getExpressionAttributeValues() != null) {
            java.util.Map<String, AttributeValue> expressionAttributeValues = put
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
        if (put.getReturnValuesOnConditionCheckFailure() != null) {
            String returnValuesOnConditionCheckFailure = put
                    .getReturnValuesOnConditionCheckFailure();
            jsonWriter.name("ReturnValuesOnConditionCheckFailure");
            jsonWriter.value(returnValuesOnConditionCheckFailure);
        }
        jsonWriter.endObject();
    }

    private static PutJsonMarshaller instance;

    public static PutJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PutJsonMarshaller();
        return instance;
    }
}
