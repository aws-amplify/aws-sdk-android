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

package com.amazonaws.services.awsdatabasemigrationservice.model.transform;

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
import com.amazonaws.services.awsdatabasemigrationservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateReplicationTaskRequest
 */
public class CreateReplicationTaskRequestMarshaller implements
        Marshaller<Request<CreateReplicationTaskRequest>, CreateReplicationTaskRequest> {

    public Request<CreateReplicationTaskRequest> marshall(
            CreateReplicationTaskRequest createReplicationTaskRequest) {
        if (createReplicationTaskRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateReplicationTaskRequest)");
        }

        Request<CreateReplicationTaskRequest> request = new DefaultRequest<CreateReplicationTaskRequest>(
                createReplicationTaskRequest, "AWSDatabaseMigrationService");
        String target = "AmazonDMSv20160101.CreateReplicationTask";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createReplicationTaskRequest.getReplicationTaskIdentifier() != null) {
                String replicationTaskIdentifier = createReplicationTaskRequest
                        .getReplicationTaskIdentifier();
                jsonWriter.name("ReplicationTaskIdentifier");
                jsonWriter.value(replicationTaskIdentifier);
            }
            if (createReplicationTaskRequest.getSourceEndpointArn() != null) {
                String sourceEndpointArn = createReplicationTaskRequest.getSourceEndpointArn();
                jsonWriter.name("SourceEndpointArn");
                jsonWriter.value(sourceEndpointArn);
            }
            if (createReplicationTaskRequest.getTargetEndpointArn() != null) {
                String targetEndpointArn = createReplicationTaskRequest.getTargetEndpointArn();
                jsonWriter.name("TargetEndpointArn");
                jsonWriter.value(targetEndpointArn);
            }
            if (createReplicationTaskRequest.getReplicationInstanceArn() != null) {
                String replicationInstanceArn = createReplicationTaskRequest
                        .getReplicationInstanceArn();
                jsonWriter.name("ReplicationInstanceArn");
                jsonWriter.value(replicationInstanceArn);
            }
            if (createReplicationTaskRequest.getMigrationType() != null) {
                String migrationType = createReplicationTaskRequest.getMigrationType();
                jsonWriter.name("MigrationType");
                jsonWriter.value(migrationType);
            }
            if (createReplicationTaskRequest.getTableMappings() != null) {
                String tableMappings = createReplicationTaskRequest.getTableMappings();
                jsonWriter.name("TableMappings");
                jsonWriter.value(tableMappings);
            }
            if (createReplicationTaskRequest.getReplicationTaskSettings() != null) {
                String replicationTaskSettings = createReplicationTaskRequest
                        .getReplicationTaskSettings();
                jsonWriter.name("ReplicationTaskSettings");
                jsonWriter.value(replicationTaskSettings);
            }
            if (createReplicationTaskRequest.getCdcStartTime() != null) {
                java.util.Date cdcStartTime = createReplicationTaskRequest.getCdcStartTime();
                jsonWriter.name("CdcStartTime");
                jsonWriter.value(cdcStartTime);
            }
            if (createReplicationTaskRequest.getCdcStartPosition() != null) {
                String cdcStartPosition = createReplicationTaskRequest.getCdcStartPosition();
                jsonWriter.name("CdcStartPosition");
                jsonWriter.value(cdcStartPosition);
            }
            if (createReplicationTaskRequest.getCdcStopPosition() != null) {
                String cdcStopPosition = createReplicationTaskRequest.getCdcStopPosition();
                jsonWriter.name("CdcStopPosition");
                jsonWriter.value(cdcStopPosition);
            }
            if (createReplicationTaskRequest.getTags() != null) {
                java.util.List<Tag> tags = createReplicationTaskRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createReplicationTaskRequest.getTaskData() != null) {
                String taskData = createReplicationTaskRequest.getTaskData();
                jsonWriter.name("TaskData");
                jsonWriter.value(taskData);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
