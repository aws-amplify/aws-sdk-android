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
 * JSON request marshaller for QueryRequest
 */
public class QueryRequestMarshaller implements Marshaller<Request<QueryRequest>, QueryRequest> {

    public Request<QueryRequest> marshall(QueryRequest queryRequest) {
        if (queryRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(QueryRequest)");
        }

        Request<QueryRequest> request = new DefaultRequest<QueryRequest>(queryRequest,
                "AmazonDynamoDB");
        String target = "DynamoDB_20120810.Query";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (queryRequest.getTableName() != null) {
                String tableName = queryRequest.getTableName();
                jsonWriter.name("TableName");
                jsonWriter.value(tableName);
            }
            if (queryRequest.getIndexName() != null) {
                String indexName = queryRequest.getIndexName();
                jsonWriter.name("IndexName");
                jsonWriter.value(indexName);
            }
            if (queryRequest.getSelect() != null) {
                String select = queryRequest.getSelect();
                jsonWriter.name("Select");
                jsonWriter.value(select);
            }
            if (queryRequest.getAttributesToGet() != null) {
                java.util.List<String> attributesToGet = queryRequest.getAttributesToGet();
                jsonWriter.name("AttributesToGet");
                jsonWriter.beginArray();
                for (String attributesToGetItem : attributesToGet) {
                    if (attributesToGetItem != null) {
                        jsonWriter.value(attributesToGetItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (queryRequest.getLimit() != null) {
                Integer limit = queryRequest.getLimit();
                jsonWriter.name("Limit");
                jsonWriter.value(limit);
            }
            if (queryRequest.getConsistentRead() != null) {
                Boolean consistentRead = queryRequest.getConsistentRead();
                jsonWriter.name("ConsistentRead");
                jsonWriter.value(consistentRead);
            }
            if (queryRequest.getKeyConditions() != null) {
                java.util.Map<String, Condition> keyConditions = queryRequest.getKeyConditions();
                jsonWriter.name("KeyConditions");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, Condition> keyConditionsEntry : keyConditions
                        .entrySet()) {
                    Condition keyConditionsValue = keyConditionsEntry.getValue();
                    if (keyConditionsValue != null) {
                        jsonWriter.name(keyConditionsEntry.getKey());
                        ConditionJsonMarshaller.getInstance().marshall(keyConditionsValue,
                                jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (queryRequest.getQueryFilter() != null) {
                java.util.Map<String, Condition> queryFilter = queryRequest.getQueryFilter();
                jsonWriter.name("QueryFilter");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, Condition> queryFilterEntry : queryFilter
                        .entrySet()) {
                    Condition queryFilterValue = queryFilterEntry.getValue();
                    if (queryFilterValue != null) {
                        jsonWriter.name(queryFilterEntry.getKey());
                        ConditionJsonMarshaller.getInstance()
                                .marshall(queryFilterValue, jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (queryRequest.getConditionalOperator() != null) {
                String conditionalOperator = queryRequest.getConditionalOperator();
                jsonWriter.name("ConditionalOperator");
                jsonWriter.value(conditionalOperator);
            }
            if (queryRequest.getScanIndexForward() != null) {
                Boolean scanIndexForward = queryRequest.getScanIndexForward();
                jsonWriter.name("ScanIndexForward");
                jsonWriter.value(scanIndexForward);
            }
            if (queryRequest.getExclusiveStartKey() != null) {
                java.util.Map<String, AttributeValue> exclusiveStartKey = queryRequest
                        .getExclusiveStartKey();
                jsonWriter.name("ExclusiveStartKey");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, AttributeValue> exclusiveStartKeyEntry : exclusiveStartKey
                        .entrySet()) {
                    AttributeValue exclusiveStartKeyValue = exclusiveStartKeyEntry.getValue();
                    if (exclusiveStartKeyValue != null) {
                        jsonWriter.name(exclusiveStartKeyEntry.getKey());
                        AttributeValueJsonMarshaller.getInstance().marshall(exclusiveStartKeyValue,
                                jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (queryRequest.getReturnConsumedCapacity() != null) {
                String returnConsumedCapacity = queryRequest.getReturnConsumedCapacity();
                jsonWriter.name("ReturnConsumedCapacity");
                jsonWriter.value(returnConsumedCapacity);
            }
            if (queryRequest.getProjectionExpression() != null) {
                String projectionExpression = queryRequest.getProjectionExpression();
                jsonWriter.name("ProjectionExpression");
                jsonWriter.value(projectionExpression);
            }
            if (queryRequest.getFilterExpression() != null) {
                String filterExpression = queryRequest.getFilterExpression();
                jsonWriter.name("FilterExpression");
                jsonWriter.value(filterExpression);
            }
            if (queryRequest.getKeyConditionExpression() != null) {
                String keyConditionExpression = queryRequest.getKeyConditionExpression();
                jsonWriter.name("KeyConditionExpression");
                jsonWriter.value(keyConditionExpression);
            }
            if (queryRequest.getExpressionAttributeNames() != null) {
                java.util.Map<String, String> expressionAttributeNames = queryRequest
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
            if (queryRequest.getExpressionAttributeValues() != null) {
                java.util.Map<String, AttributeValue> expressionAttributeValues = queryRequest
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
