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
 * Get Item Request Marshaller
 */
public class GetItemRequestMarshaller implements Marshaller<Request<GetItemRequest>, GetItemRequest> {

    public Request<GetItemRequest> marshall(GetItemRequest getItemRequest) {
    if (getItemRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<GetItemRequest> request = new DefaultRequest<GetItemRequest>(getItemRequest, "AmazonDynamoDBv2");
        String target = "DynamoDB_20120810.GetItem";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);

            jsonWriter.beginObject();
            
            if (getItemRequest.getTableName() != null) {
                jsonWriter.name("TableName").value(getItemRequest.getTableName());
            }
            if (getItemRequest.getKey() != null) {
                jsonWriter.name("Key");
                jsonWriter.beginObject();
                for (Map.Entry<String, AttributeValue> keyListValue : getItemRequest.getKey().entrySet()) {
                    if (keyListValue.getValue() != null) {
                        jsonWriter.name(keyListValue.getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(keyListValue.getValue(), jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<String> attributesToGetList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(getItemRequest.getAttributesToGet());
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
            if (getItemRequest.isConsistentRead() != null) {
                jsonWriter.name("ConsistentRead").value(getItemRequest.isConsistentRead());
            }
            if (getItemRequest.getReturnConsumedCapacity() != null) {
                jsonWriter.name("ReturnConsumedCapacity").value(getItemRequest.getReturnConsumedCapacity());
            }
            if (getItemRequest.getProjectionExpression() != null) {
                jsonWriter.name("ProjectionExpression").value(getItemRequest.getProjectionExpression());
            }
            if (getItemRequest.getExpressionAttributeNames() != null) {
                jsonWriter.name("ExpressionAttributeNames");
                jsonWriter.beginObject();
                for (Map.Entry<String, String> expressionAttributeNamesListValue : getItemRequest.getExpressionAttributeNames().entrySet()) {
                    if (expressionAttributeNamesListValue.getValue() != null) {
                        jsonWriter.name(expressionAttributeNamesListValue.getKey());

                        jsonWriter.value(expressionAttributeNamesListValue.getValue());
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
