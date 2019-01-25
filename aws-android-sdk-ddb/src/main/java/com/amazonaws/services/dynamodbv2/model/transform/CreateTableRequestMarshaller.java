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
 * JSON request marshaller for CreateTableRequest
 */
public class CreateTableRequestMarshaller implements
        Marshaller<Request<CreateTableRequest>, CreateTableRequest> {

    public Request<CreateTableRequest> marshall(CreateTableRequest createTableRequest) {
        if (createTableRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateTableRequest)");
        }

        Request<CreateTableRequest> request = new DefaultRequest<CreateTableRequest>(
                createTableRequest, "AmazonDynamoDB");
        String target = "DynamoDB_20120810.CreateTable";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createTableRequest.getAttributeDefinitions() != null) {
                java.util.List<AttributeDefinition> attributeDefinitions = createTableRequest
                        .getAttributeDefinitions();
                jsonWriter.name("AttributeDefinitions");
                jsonWriter.beginArray();
                for (AttributeDefinition attributeDefinitionsItem : attributeDefinitions) {
                    if (attributeDefinitionsItem != null) {
                        AttributeDefinitionJsonMarshaller.getInstance().marshall(
                                attributeDefinitionsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createTableRequest.getTableName() != null) {
                String tableName = createTableRequest.getTableName();
                jsonWriter.name("TableName");
                jsonWriter.value(tableName);
            }
            if (createTableRequest.getKeySchema() != null) {
                java.util.List<KeySchemaElement> keySchema = createTableRequest.getKeySchema();
                jsonWriter.name("KeySchema");
                jsonWriter.beginArray();
                for (KeySchemaElement keySchemaItem : keySchema) {
                    if (keySchemaItem != null) {
                        KeySchemaElementJsonMarshaller.getInstance().marshall(keySchemaItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createTableRequest.getLocalSecondaryIndexes() != null) {
                java.util.List<LocalSecondaryIndex> localSecondaryIndexes = createTableRequest
                        .getLocalSecondaryIndexes();
                jsonWriter.name("LocalSecondaryIndexes");
                jsonWriter.beginArray();
                for (LocalSecondaryIndex localSecondaryIndexesItem : localSecondaryIndexes) {
                    if (localSecondaryIndexesItem != null) {
                        LocalSecondaryIndexJsonMarshaller.getInstance().marshall(
                                localSecondaryIndexesItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createTableRequest.getGlobalSecondaryIndexes() != null) {
                java.util.List<GlobalSecondaryIndex> globalSecondaryIndexes = createTableRequest
                        .getGlobalSecondaryIndexes();
                jsonWriter.name("GlobalSecondaryIndexes");
                jsonWriter.beginArray();
                for (GlobalSecondaryIndex globalSecondaryIndexesItem : globalSecondaryIndexes) {
                    if (globalSecondaryIndexesItem != null) {
                        GlobalSecondaryIndexJsonMarshaller.getInstance().marshall(
                                globalSecondaryIndexesItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createTableRequest.getProvisionedThroughput() != null) {
                ProvisionedThroughput provisionedThroughput = createTableRequest
                        .getProvisionedThroughput();
                jsonWriter.name("ProvisionedThroughput");
                ProvisionedThroughputJsonMarshaller.getInstance().marshall(provisionedThroughput,
                        jsonWriter);
            }
            if (createTableRequest.getStreamSpecification() != null) {
                StreamSpecification streamSpecification = createTableRequest
                        .getStreamSpecification();
                jsonWriter.name("StreamSpecification");
                StreamSpecificationJsonMarshaller.getInstance().marshall(streamSpecification,
                        jsonWriter);
            }
            if (createTableRequest.getSSESpecification() != null) {
                SSESpecification sSESpecification = createTableRequest.getSSESpecification();
                jsonWriter.name("SSESpecification");
                SSESpecificationJsonMarshaller.getInstance().marshall(sSESpecification, jsonWriter);
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
