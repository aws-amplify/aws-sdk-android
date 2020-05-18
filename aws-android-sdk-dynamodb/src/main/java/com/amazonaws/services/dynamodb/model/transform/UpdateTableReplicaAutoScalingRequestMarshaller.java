/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodb.model.transform;

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
import com.amazonaws.services.dynamodb.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateTableReplicaAutoScalingRequest
 */
public class UpdateTableReplicaAutoScalingRequestMarshaller
        implements
        Marshaller<Request<UpdateTableReplicaAutoScalingRequest>, UpdateTableReplicaAutoScalingRequest> {

    public Request<UpdateTableReplicaAutoScalingRequest> marshall(
            UpdateTableReplicaAutoScalingRequest updateTableReplicaAutoScalingRequest) {
        if (updateTableReplicaAutoScalingRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateTableReplicaAutoScalingRequest)");
        }

        Request<UpdateTableReplicaAutoScalingRequest> request = new DefaultRequest<UpdateTableReplicaAutoScalingRequest>(
                updateTableReplicaAutoScalingRequest, "AmazonDynamoDB");
        String target = "DynamoDB_20120810.UpdateTableReplicaAutoScaling";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateTableReplicaAutoScalingRequest.getGlobalSecondaryIndexUpdates() != null) {
                java.util.List<GlobalSecondaryIndexAutoScalingUpdate> globalSecondaryIndexUpdates = updateTableReplicaAutoScalingRequest
                        .getGlobalSecondaryIndexUpdates();
                jsonWriter.name("GlobalSecondaryIndexUpdates");
                jsonWriter.beginArray();
                for (GlobalSecondaryIndexAutoScalingUpdate globalSecondaryIndexUpdatesItem : globalSecondaryIndexUpdates) {
                    if (globalSecondaryIndexUpdatesItem != null) {
                        GlobalSecondaryIndexAutoScalingUpdateJsonMarshaller.getInstance().marshall(
                                globalSecondaryIndexUpdatesItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateTableReplicaAutoScalingRequest.getTableName() != null) {
                String tableName = updateTableReplicaAutoScalingRequest.getTableName();
                jsonWriter.name("TableName");
                jsonWriter.value(tableName);
            }
            if (updateTableReplicaAutoScalingRequest.getProvisionedWriteCapacityAutoScalingUpdate() != null) {
                AutoScalingSettingsUpdate provisionedWriteCapacityAutoScalingUpdate = updateTableReplicaAutoScalingRequest
                        .getProvisionedWriteCapacityAutoScalingUpdate();
                jsonWriter.name("ProvisionedWriteCapacityAutoScalingUpdate");
                AutoScalingSettingsUpdateJsonMarshaller.getInstance().marshall(
                        provisionedWriteCapacityAutoScalingUpdate, jsonWriter);
            }
            if (updateTableReplicaAutoScalingRequest.getReplicaUpdates() != null) {
                java.util.List<ReplicaAutoScalingUpdate> replicaUpdates = updateTableReplicaAutoScalingRequest
                        .getReplicaUpdates();
                jsonWriter.name("ReplicaUpdates");
                jsonWriter.beginArray();
                for (ReplicaAutoScalingUpdate replicaUpdatesItem : replicaUpdates) {
                    if (replicaUpdatesItem != null) {
                        ReplicaAutoScalingUpdateJsonMarshaller.getInstance().marshall(
                                replicaUpdatesItem, jsonWriter);
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
