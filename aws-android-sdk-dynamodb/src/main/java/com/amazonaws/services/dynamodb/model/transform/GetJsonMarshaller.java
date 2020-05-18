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
 * JSON marshaller for POJO Get
 */
class GetJsonMarshaller {

    public void marshall(Get get, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (get.getKey() != null) {
            java.util.Map<String, AttributeValue> key = get.getKey();
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
        if (get.getTableName() != null) {
            String tableName = get.getTableName();
            jsonWriter.name("TableName");
            jsonWriter.value(tableName);
        }
        if (get.getProjectionExpression() != null) {
            String projectionExpression = get.getProjectionExpression();
            jsonWriter.name("ProjectionExpression");
            jsonWriter.value(projectionExpression);
        }
        if (get.getExpressionAttributeNames() != null) {
            java.util.Map<String, String> expressionAttributeNames = get
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
        jsonWriter.endObject();
    }

    private static GetJsonMarshaller instance;

    public static GetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GetJsonMarshaller();
        return instance;
    }
}
