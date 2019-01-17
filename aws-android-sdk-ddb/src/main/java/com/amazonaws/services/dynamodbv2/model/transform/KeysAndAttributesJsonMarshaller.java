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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO KeysAndAttributes
 */
class KeysAndAttributesJsonMarshaller {

    public void marshall(KeysAndAttributes keysAndAttributes, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (keysAndAttributes.getKeys() != null) {
            java.util.List<java.util.Map<String, AttributeValue>> keys = keysAndAttributes
                    .getKeys();
            jsonWriter.name("Keys");
            jsonWriter.beginArray();
            for (java.util.Map<String, AttributeValue> keysItem : keys) {
                if (keysItem != null) {
                    jsonWriter.beginObject();
                    for (java.util.Map.Entry<String, AttributeValue> keysItemEntry : keysItem
                            .entrySet()) {
                        AttributeValue keysItemValue = keysItemEntry.getValue();
                        if (keysItemValue != null) {
                            jsonWriter.name(keysItemEntry.getKey());
                            AttributeValueJsonMarshaller.getInstance().marshall(keysItemValue,
                                    jsonWriter);
                        }
                    }
                    jsonWriter.endObject();
                }
            }
            jsonWriter.endArray();
        }
        if (keysAndAttributes.getAttributesToGet() != null) {
            java.util.List<String> attributesToGet = keysAndAttributes.getAttributesToGet();
            jsonWriter.name("AttributesToGet");
            jsonWriter.beginArray();
            for (String attributesToGetItem : attributesToGet) {
                if (attributesToGetItem != null) {
                    jsonWriter.value(attributesToGetItem);
                }
            }
            jsonWriter.endArray();
        }
        if (keysAndAttributes.getConsistentRead() != null) {
            Boolean consistentRead = keysAndAttributes.getConsistentRead();
            jsonWriter.name("ConsistentRead");
            jsonWriter.value(consistentRead);
        }
        if (keysAndAttributes.getProjectionExpression() != null) {
            String projectionExpression = keysAndAttributes.getProjectionExpression();
            jsonWriter.name("ProjectionExpression");
            jsonWriter.value(projectionExpression);
        }
        if (keysAndAttributes.getExpressionAttributeNames() != null) {
            java.util.Map<String, String> expressionAttributeNames = keysAndAttributes
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

    private static KeysAndAttributesJsonMarshaller instance;

    public static KeysAndAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KeysAndAttributesJsonMarshaller();
        return instance;
    }
}
