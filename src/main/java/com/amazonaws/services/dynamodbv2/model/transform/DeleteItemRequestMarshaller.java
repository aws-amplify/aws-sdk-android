/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.Map;
import java.util.List;

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
 * Delete Item Request Marshaller
 */
public class DeleteItemRequestMarshaller implements Marshaller<Request<DeleteItemRequest>, DeleteItemRequest> {

    public Request<DeleteItemRequest> marshall(DeleteItemRequest deleteItemRequest) {
    if (deleteItemRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<DeleteItemRequest> request = new DefaultRequest<DeleteItemRequest>(deleteItemRequest, "AmazonDynamoDBv2");
        String target = "DynamoDB_20120810.DeleteItem";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);

            jsonWriter.beginObject();
            
            if (deleteItemRequest.getTableName() != null) {
                jsonWriter.name("TableName").value(deleteItemRequest.getTableName());
            }
            if (deleteItemRequest.getKey() != null) {
                jsonWriter.name("Key");
                jsonWriter.beginObject();
                for (Map.Entry<String, AttributeValue> keyListValue : deleteItemRequest.getKey().entrySet()) {
                    if (keyListValue.getValue() != null) {
                        jsonWriter.name(keyListValue.getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(keyListValue.getValue(), jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (deleteItemRequest.getExpected() != null) {
                jsonWriter.name("Expected");
                jsonWriter.beginObject();
                for (Map.Entry<String, ExpectedAttributeValue> expectedListValue : deleteItemRequest.getExpected().entrySet()) {
                    if (expectedListValue.getValue() != null) {
                        jsonWriter.name(expectedListValue.getKey());

                        jsonWriter.beginObject();
                        AttributeValue value = expectedListValue.getValue().getValue();
                        if (value != null) {

                            jsonWriter.name("Value");
                            AttributeValueJsonMarshaller.getInstance().marshall(value, jsonWriter);
                        }
                        if (expectedListValue.getValue().isExists() != null) {
                            jsonWriter.name("Exists").value(expectedListValue.getValue().isExists());
                        }
                        if (expectedListValue.getValue().getComparisonOperator() != null) {
                            jsonWriter.name("ComparisonOperator").value(expectedListValue.getValue().getComparisonOperator());
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue> attributeValueListList = (com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue>)(expectedListValue.getValue().getAttributeValueList());
                        if (attributeValueListList != null && !(attributeValueListList.isAutoConstruct() && attributeValueListList.isEmpty())) {

                            jsonWriter.name("AttributeValueList");
                            jsonWriter.beginArray();

                            for (AttributeValue attributeValueListListValue : attributeValueListList) {
                                if (attributeValueListListValue != null) {
                                    AttributeValueJsonMarshaller.getInstance().marshall(attributeValueListListValue, jsonWriter);
                                }
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endObject();
            }
            if (deleteItemRequest.getConditionalOperator() != null) {
                jsonWriter.name("ConditionalOperator").value(deleteItemRequest.getConditionalOperator());
            }
            if (deleteItemRequest.getReturnValues() != null) {
                jsonWriter.name("ReturnValues").value(deleteItemRequest.getReturnValues());
            }
            if (deleteItemRequest.getReturnConsumedCapacity() != null) {
                jsonWriter.name("ReturnConsumedCapacity").value(deleteItemRequest.getReturnConsumedCapacity());
            }
            if (deleteItemRequest.getReturnItemCollectionMetrics() != null) {
                jsonWriter.name("ReturnItemCollectionMetrics").value(deleteItemRequest.getReturnItemCollectionMetrics());
            }
            if (deleteItemRequest.getConditionExpression() != null) {
                jsonWriter.name("ConditionExpression").value(deleteItemRequest.getConditionExpression());
            }
            if (deleteItemRequest.getExpressionAttributeNames() != null) {
                jsonWriter.name("ExpressionAttributeNames");
                jsonWriter.beginObject();
                for (Map.Entry<String, String> expressionAttributeNamesListValue : deleteItemRequest.getExpressionAttributeNames().entrySet()) {
                    if (expressionAttributeNamesListValue.getValue() != null) {
                        jsonWriter.name(expressionAttributeNamesListValue.getKey());

                        jsonWriter.value(expressionAttributeNamesListValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }
            if (deleteItemRequest.getExpressionAttributeValues() != null) {
                jsonWriter.name("ExpressionAttributeValues");
                jsonWriter.beginObject();
                for (Map.Entry<String, AttributeValue> expressionAttributeValuesListValue : deleteItemRequest.getExpressionAttributeValues().entrySet()) {
                    if (expressionAttributeValuesListValue.getValue() != null) {
                        jsonWriter.name(expressionAttributeValuesListValue.getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(expressionAttributeValuesListValue.getValue(), jsonWriter);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        } catch(Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}
