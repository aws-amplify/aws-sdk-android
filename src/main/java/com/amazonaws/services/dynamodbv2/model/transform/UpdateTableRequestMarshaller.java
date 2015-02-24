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
 * Update Table Request Marshaller
 */
public class UpdateTableRequestMarshaller implements Marshaller<Request<UpdateTableRequest>, UpdateTableRequest> {

    public Request<UpdateTableRequest> marshall(UpdateTableRequest updateTableRequest) {
    if (updateTableRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<UpdateTableRequest> request = new DefaultRequest<UpdateTableRequest>(updateTableRequest, "AmazonDynamoDBv2");
        String target = "DynamoDB_20120810.UpdateTable";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);

            jsonWriter.beginObject();
            
            if (updateTableRequest.getTableName() != null) {
                jsonWriter.name("TableName").value(updateTableRequest.getTableName());
            }
            ProvisionedThroughput provisionedThroughput = updateTableRequest.getProvisionedThroughput();
            if (provisionedThroughput != null) {

                jsonWriter.name("ProvisionedThroughput");
                jsonWriter.beginObject();

                if (provisionedThroughput.getReadCapacityUnits() != null) {
                    jsonWriter.name("ReadCapacityUnits").value(provisionedThroughput.getReadCapacityUnits());
                }
                if (provisionedThroughput.getWriteCapacityUnits() != null) {
                    jsonWriter.name("WriteCapacityUnits").value(provisionedThroughput.getWriteCapacityUnits());
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<GlobalSecondaryIndexUpdate> globalSecondaryIndexUpdatesList = (com.amazonaws.internal.ListWithAutoConstructFlag<GlobalSecondaryIndexUpdate>)(updateTableRequest.getGlobalSecondaryIndexUpdates());
            if (globalSecondaryIndexUpdatesList != null && !(globalSecondaryIndexUpdatesList.isAutoConstruct() && globalSecondaryIndexUpdatesList.isEmpty())) {

                jsonWriter.name("GlobalSecondaryIndexUpdates");
                jsonWriter.beginArray();

                for (GlobalSecondaryIndexUpdate globalSecondaryIndexUpdatesListValue : globalSecondaryIndexUpdatesList) {
                    if (globalSecondaryIndexUpdatesListValue != null) {
                        jsonWriter.beginObject();
                        UpdateGlobalSecondaryIndexAction update = globalSecondaryIndexUpdatesListValue.getUpdate();
                        if (update != null) {

                            jsonWriter.name("Update");
                            jsonWriter.beginObject();

                            if (update.getIndexName() != null) {
                                jsonWriter.name("IndexName").value(update.getIndexName());
                            }
                            ProvisionedThroughput provisionedThroughput2 = update.getProvisionedThroughput();
                            if (provisionedThroughput2 != null) {

                                jsonWriter.name("ProvisionedThroughput");
                                jsonWriter.beginObject();

                                if (provisionedThroughput2.getReadCapacityUnits() != null) {
                                    jsonWriter.name("ReadCapacityUnits").value(provisionedThroughput2.getReadCapacityUnits());
                                }
                                if (provisionedThroughput2.getWriteCapacityUnits() != null) {
                                    jsonWriter.name("WriteCapacityUnits").value(provisionedThroughput2.getWriteCapacityUnits());
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endObject();
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
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
