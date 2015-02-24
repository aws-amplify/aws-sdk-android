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
 * Query Request Marshaller
 */
public class QueryRequestMarshaller implements Marshaller<Request<QueryRequest>, QueryRequest> {

    public Request<QueryRequest> marshall(QueryRequest queryRequest) {
    if (queryRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<QueryRequest> request = new DefaultRequest<QueryRequest>(queryRequest, "AmazonDynamoDBv2");
        String target = "DynamoDB_20120810.Query";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);

            jsonWriter.beginObject();
            
            if (queryRequest.getTableName() != null) {
                jsonWriter.name("TableName").value(queryRequest.getTableName());
            }
            if (queryRequest.getIndexName() != null) {
                jsonWriter.name("IndexName").value(queryRequest.getIndexName());
            }
            if (queryRequest.getSelect() != null) {
                jsonWriter.name("Select").value(queryRequest.getSelect());
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<String> attributesToGetList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(queryRequest.getAttributesToGet());
            if (attributesToGetList != null && !(attributesToGetList.isAutoConstruct() && attributesToGetList.isEmpty())) {

                jsonWriter.name("AttributesToGet");
                jsonWriter.beginArray();

                for (String attributesToGetListValue : attributesToGetList) {
                    if (attributesToGetListValue != null) {
                        jsonWriter.value(attributesToGetListValue);
                    }
                }
                jsonWriter.endArray();
            }
            if (queryRequest.getLimit() != null) {
                jsonWriter.name("Limit").value(queryRequest.getLimit());
            }
            if (queryRequest.isConsistentRead() != null) {
                jsonWriter.name("ConsistentRead").value(queryRequest.isConsistentRead());
            }
            if (queryRequest.getKeyConditions() != null) {
                jsonWriter.name("KeyConditions");
                jsonWriter.beginObject();
                for (Map.Entry<String, Condition> keyConditionsListValue : queryRequest.getKeyConditions().entrySet()) {
                    if (keyConditionsListValue.getValue() != null) {
                        jsonWriter.name(keyConditionsListValue.getKey());

                        jsonWriter.beginObject();

                        com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue> attributeValueListList = (com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue>)(keyConditionsListValue.getValue().getAttributeValueList());
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
                        if (keyConditionsListValue.getValue().getComparisonOperator() != null) {
                            jsonWriter.name("ComparisonOperator").value(keyConditionsListValue.getValue().getComparisonOperator());
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endObject();
            }
            if (queryRequest.getQueryFilter() != null) {
                jsonWriter.name("QueryFilter");
                jsonWriter.beginObject();
                for (Map.Entry<String, Condition> queryFilterListValue : queryRequest.getQueryFilter().entrySet()) {
                    if (queryFilterListValue.getValue() != null) {
                        jsonWriter.name(queryFilterListValue.getKey());

                        jsonWriter.beginObject();

                        com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue> attributeValueListList = (com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue>)(queryFilterListValue.getValue().getAttributeValueList());
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
                        if (queryFilterListValue.getValue().getComparisonOperator() != null) {
                            jsonWriter.name("ComparisonOperator").value(queryFilterListValue.getValue().getComparisonOperator());
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endObject();
            }
            if (queryRequest.getConditionalOperator() != null) {
                jsonWriter.name("ConditionalOperator").value(queryRequest.getConditionalOperator());
            }
            if (queryRequest.isScanIndexForward() != null) {
                jsonWriter.name("ScanIndexForward").value(queryRequest.isScanIndexForward());
            }
            if (queryRequest.getExclusiveStartKey() != null) {
                jsonWriter.name("ExclusiveStartKey");
                jsonWriter.beginObject();
                for (Map.Entry<String, AttributeValue> exclusiveStartKeyListValue : queryRequest.getExclusiveStartKey().entrySet()) {
                    if (exclusiveStartKeyListValue.getValue() != null) {
                        jsonWriter.name(exclusiveStartKeyListValue.getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(exclusiveStartKeyListValue.getValue(), jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (queryRequest.getReturnConsumedCapacity() != null) {
                jsonWriter.name("ReturnConsumedCapacity").value(queryRequest.getReturnConsumedCapacity());
            }
            if (queryRequest.getProjectionExpression() != null) {
                jsonWriter.name("ProjectionExpression").value(queryRequest.getProjectionExpression());
            }
            if (queryRequest.getFilterExpression() != null) {
                jsonWriter.name("FilterExpression").value(queryRequest.getFilterExpression());
            }
            if (queryRequest.getExpressionAttributeNames() != null) {
                jsonWriter.name("ExpressionAttributeNames");
                jsonWriter.beginObject();
                for (Map.Entry<String, String> expressionAttributeNamesListValue : queryRequest.getExpressionAttributeNames().entrySet()) {
                    if (expressionAttributeNamesListValue.getValue() != null) {
                        jsonWriter.name(expressionAttributeNamesListValue.getKey());

                        jsonWriter.value(expressionAttributeNamesListValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }
            if (queryRequest.getExpressionAttributeValues() != null) {
                jsonWriter.name("ExpressionAttributeValues");
                jsonWriter.beginObject();
                for (Map.Entry<String, AttributeValue> expressionAttributeValuesListValue : queryRequest.getExpressionAttributeValues().entrySet()) {
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
