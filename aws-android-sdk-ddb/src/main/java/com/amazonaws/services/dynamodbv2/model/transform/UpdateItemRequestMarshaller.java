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
 * JSON request marshaller for UpdateItemRequest
 */
public class UpdateItemRequestMarshaller implements
        Marshaller<Request<UpdateItemRequest>, UpdateItemRequest> {

    public Request<UpdateItemRequest> marshall(UpdateItemRequest updateItemRequest) {
        if (updateItemRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateItemRequest)");
        }

        Request<UpdateItemRequest> request = new DefaultRequest<UpdateItemRequest>(
                updateItemRequest, "AmazonDynamoDB");
        String target = "DynamoDB_20120810.UpdateItem";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateItemRequest.getTableName() != null) {
                String tableName = updateItemRequest.getTableName();
                jsonWriter.name("TableName");
                jsonWriter.value(tableName);
            }
            if (updateItemRequest.getKey() != null) {
                java.util.Map<String, AttributeValue> key = updateItemRequest.getKey();
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
            if (updateItemRequest.getAttributeUpdates() != null) {
                java.util.Map<String, AttributeValueUpdate> attributeUpdates = updateItemRequest
                        .getAttributeUpdates();
                jsonWriter.name("AttributeUpdates");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, AttributeValueUpdate> attributeUpdatesEntry : attributeUpdates
                        .entrySet()) {
                    AttributeValueUpdate attributeUpdatesValue = attributeUpdatesEntry.getValue();
                    if (attributeUpdatesValue != null) {
                        jsonWriter.name(attributeUpdatesEntry.getKey());
                        AttributeValueUpdateJsonMarshaller.getInstance().marshall(
                                attributeUpdatesValue, jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (updateItemRequest.getExpected() != null) {
                java.util.Map<String, ExpectedAttributeValue> expected = updateItemRequest
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
            if (updateItemRequest.getConditionalOperator() != null) {
                String conditionalOperator = updateItemRequest.getConditionalOperator();
                jsonWriter.name("ConditionalOperator");
                jsonWriter.value(conditionalOperator);
            }
            if (updateItemRequest.getReturnValues() != null) {
                String returnValues = updateItemRequest.getReturnValues();
                jsonWriter.name("ReturnValues");
                jsonWriter.value(returnValues);
            }
            if (updateItemRequest.getReturnConsumedCapacity() != null) {
                String returnConsumedCapacity = updateItemRequest.getReturnConsumedCapacity();
                jsonWriter.name("ReturnConsumedCapacity");
                jsonWriter.value(returnConsumedCapacity);
            }
            if (updateItemRequest.getReturnItemCollectionMetrics() != null) {
                String returnItemCollectionMetrics = updateItemRequest
                        .getReturnItemCollectionMetrics();
                jsonWriter.name("ReturnItemCollectionMetrics");
                jsonWriter.value(returnItemCollectionMetrics);
            }
            if (updateItemRequest.getUpdateExpression() != null) {
                String updateExpression = updateItemRequest.getUpdateExpression();
                jsonWriter.name("UpdateExpression");
                jsonWriter.value(updateExpression);
            }
            if (updateItemRequest.getConditionExpression() != null) {
                String conditionExpression = updateItemRequest.getConditionExpression();
                jsonWriter.name("ConditionExpression");
                jsonWriter.value(conditionExpression);
            }
            if (updateItemRequest.getExpressionAttributeNames() != null) {
                java.util.Map<String, String> expressionAttributeNames = updateItemRequest
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
            if (updateItemRequest.getExpressionAttributeValues() != null) {
                java.util.Map<String, AttributeValue> expressionAttributeValues = updateItemRequest
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
