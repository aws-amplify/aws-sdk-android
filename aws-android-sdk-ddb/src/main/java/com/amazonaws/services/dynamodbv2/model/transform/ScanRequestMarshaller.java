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
 * JSON request marshaller for ScanRequest
 */
public class ScanRequestMarshaller implements Marshaller<Request<ScanRequest>, ScanRequest> {

    public Request<ScanRequest> marshall(ScanRequest scanRequest) {
        if (scanRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(ScanRequest)");
        }

        Request<ScanRequest> request = new DefaultRequest<ScanRequest>(scanRequest,
                "AmazonDynamoDB");
        String target = "DynamoDB_20120810.Scan";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (scanRequest.getTableName() != null) {
                String tableName = scanRequest.getTableName();
                jsonWriter.name("TableName");
                jsonWriter.value(tableName);
            }
            if (scanRequest.getIndexName() != null) {
                String indexName = scanRequest.getIndexName();
                jsonWriter.name("IndexName");
                jsonWriter.value(indexName);
            }
            if (scanRequest.getAttributesToGet() != null) {
                java.util.List<String> attributesToGet = scanRequest.getAttributesToGet();
                jsonWriter.name("AttributesToGet");
                jsonWriter.beginArray();
                for (String attributesToGetItem : attributesToGet) {
                    if (attributesToGetItem != null) {
                        jsonWriter.value(attributesToGetItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (scanRequest.getLimit() != null) {
                Integer limit = scanRequest.getLimit();
                jsonWriter.name("Limit");
                jsonWriter.value(limit);
            }
            if (scanRequest.getSelect() != null) {
                String select = scanRequest.getSelect();
                jsonWriter.name("Select");
                jsonWriter.value(select);
            }
            if (scanRequest.getScanFilter() != null) {
                java.util.Map<String, Condition> scanFilter = scanRequest.getScanFilter();
                jsonWriter.name("ScanFilter");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, Condition> scanFilterEntry : scanFilter.entrySet()) {
                    Condition scanFilterValue = scanFilterEntry.getValue();
                    if (scanFilterValue != null) {
                        jsonWriter.name(scanFilterEntry.getKey());
                        ConditionJsonMarshaller.getInstance().marshall(scanFilterValue, jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (scanRequest.getConditionalOperator() != null) {
                String conditionalOperator = scanRequest.getConditionalOperator();
                jsonWriter.name("ConditionalOperator");
                jsonWriter.value(conditionalOperator);
            }
            if (scanRequest.getExclusiveStartKey() != null) {
                java.util.Map<String, AttributeValue> exclusiveStartKey = scanRequest
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
            if (scanRequest.getReturnConsumedCapacity() != null) {
                String returnConsumedCapacity = scanRequest.getReturnConsumedCapacity();
                jsonWriter.name("ReturnConsumedCapacity");
                jsonWriter.value(returnConsumedCapacity);
            }
            if (scanRequest.getTotalSegments() != null) {
                Integer totalSegments = scanRequest.getTotalSegments();
                jsonWriter.name("TotalSegments");
                jsonWriter.value(totalSegments);
            }
            if (scanRequest.getSegment() != null) {
                Integer segment = scanRequest.getSegment();
                jsonWriter.name("Segment");
                jsonWriter.value(segment);
            }
            if (scanRequest.getProjectionExpression() != null) {
                String projectionExpression = scanRequest.getProjectionExpression();
                jsonWriter.name("ProjectionExpression");
                jsonWriter.value(projectionExpression);
            }
            if (scanRequest.getFilterExpression() != null) {
                String filterExpression = scanRequest.getFilterExpression();
                jsonWriter.name("FilterExpression");
                jsonWriter.value(filterExpression);
            }
            if (scanRequest.getExpressionAttributeNames() != null) {
                java.util.Map<String, String> expressionAttributeNames = scanRequest
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
            if (scanRequest.getExpressionAttributeValues() != null) {
                java.util.Map<String, AttributeValue> expressionAttributeValues = scanRequest
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
            if (scanRequest.getConsistentRead() != null) {
                Boolean consistentRead = scanRequest.getConsistentRead();
                jsonWriter.name("ConsistentRead");
                jsonWriter.value(consistentRead);
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
