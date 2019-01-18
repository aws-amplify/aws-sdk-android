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

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for PutItemRequest
 */
public class PutItemRequestMarshaller implements
        Marshaller<Request<PutItemRequest>, PutItemRequest> {

    public Request<PutItemRequest> marshall(PutItemRequest putItemRequest) {
        if (putItemRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(PutItemRequest)");
        }

        Request<PutItemRequest> request = new DefaultRequest<PutItemRequest>(putItemRequest,
                "AmazonDynamoDB");
        String target = "DynamoDB_20120810.PutItem";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (putItemRequest.getTableName() != null) {
                String tableName = putItemRequest.getTableName();
                jsonWriter.name("TableName");
                jsonWriter.value(tableName);
            }
            if (putItemRequest.getItem() != null) {
                java.util.Map<String, AttributeValue> item = putItemRequest.getItem();
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
            if (putItemRequest.getExpected() != null) {
                java.util.Map<String, ExpectedAttributeValue> expected = putItemRequest
                        .getExpected();
                jsonWriter.name("Expected");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, ExpectedAttributeValue> expectedEntry : expected
                        .entrySet()) {
                    ExpectedAttributeValue expectedValue = expectedEntry.getValue();
                    if (expectedValue != null) {
                        jsonWriter.name(expectedEntry.getKey());
                        ExpectedAttributeValueJsonMarshaller.getInstance().marshall(expectedValue,
                                jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (putItemRequest.getReturnValues() != null) {
                String returnValues = putItemRequest.getReturnValues();
                jsonWriter.name("ReturnValues");
                jsonWriter.value(returnValues);
            }
            if (putItemRequest.getReturnConsumedCapacity() != null) {
                String returnConsumedCapacity = putItemRequest.getReturnConsumedCapacity();
                jsonWriter.name("ReturnConsumedCapacity");
                jsonWriter.value(returnConsumedCapacity);
            }
            if (putItemRequest.getReturnItemCollectionMetrics() != null) {
                String returnItemCollectionMetrics = putItemRequest
                        .getReturnItemCollectionMetrics();
                jsonWriter.name("ReturnItemCollectionMetrics");
                jsonWriter.value(returnItemCollectionMetrics);
            }
            if (putItemRequest.getConditionalOperator() != null) {
                String conditionalOperator = putItemRequest.getConditionalOperator();
                jsonWriter.name("ConditionalOperator");
                jsonWriter.value(conditionalOperator);
            }
            if (putItemRequest.getConditionExpression() != null) {
                String conditionExpression = putItemRequest.getConditionExpression();
                jsonWriter.name("ConditionExpression");
                jsonWriter.value(conditionExpression);
            }
            if (putItemRequest.getExpressionAttributeNames() != null) {
                java.util.Map<String, String> expressionAttributeNames = putItemRequest
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
            if (putItemRequest.getExpressionAttributeValues() != null) {
                java.util.Map<String, AttributeValue> expressionAttributeValues = putItemRequest
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

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
