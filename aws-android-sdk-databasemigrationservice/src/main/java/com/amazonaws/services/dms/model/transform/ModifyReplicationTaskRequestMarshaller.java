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

package com.amazonaws.services.dms.model.transform;

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
import com.amazonaws.services.dms.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ModifyReplicationTaskRequest
 */
public class ModifyReplicationTaskRequestMarshaller implements
        Marshaller<Request<ModifyReplicationTaskRequest>, ModifyReplicationTaskRequest> {

    public Request<ModifyReplicationTaskRequest> marshall(
            ModifyReplicationTaskRequest modifyReplicationTaskRequest) {
        if (modifyReplicationTaskRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyReplicationTaskRequest)");
        }

        Request<ModifyReplicationTaskRequest> request = new DefaultRequest<ModifyReplicationTaskRequest>(
                modifyReplicationTaskRequest, "AWSDatabaseMigrationService");
        String target = "AmazonDMSv20160101.ModifyReplicationTask";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (modifyReplicationTaskRequest.getReplicationTaskArn() != null) {
                String replicationTaskArn = modifyReplicationTaskRequest.getReplicationTaskArn();
                jsonWriter.name("ReplicationTaskArn");
                jsonWriter.value(replicationTaskArn);
            }
            if (modifyReplicationTaskRequest.getReplicationTaskIdentifier() != null) {
                String replicationTaskIdentifier = modifyReplicationTaskRequest
                        .getReplicationTaskIdentifier();
                jsonWriter.name("ReplicationTaskIdentifier");
                jsonWriter.value(replicationTaskIdentifier);
            }
            if (modifyReplicationTaskRequest.getMigrationType() != null) {
                String migrationType = modifyReplicationTaskRequest.getMigrationType();
                jsonWriter.name("MigrationType");
                jsonWriter.value(migrationType);
            }
            if (modifyReplicationTaskRequest.getTableMappings() != null) {
                String tableMappings = modifyReplicationTaskRequest.getTableMappings();
                jsonWriter.name("TableMappings");
                jsonWriter.value(tableMappings);
            }
            if (modifyReplicationTaskRequest.getReplicationTaskSettings() != null) {
                String replicationTaskSettings = modifyReplicationTaskRequest
                        .getReplicationTaskSettings();
                jsonWriter.name("ReplicationTaskSettings");
                jsonWriter.value(replicationTaskSettings);
            }
            if (modifyReplicationTaskRequest.getCdcStartTime() != null) {
                java.util.Date cdcStartTime = modifyReplicationTaskRequest.getCdcStartTime();
                jsonWriter.name("CdcStartTime");
                jsonWriter.value(cdcStartTime);
            }
            if (modifyReplicationTaskRequest.getCdcStartPosition() != null) {
                String cdcStartPosition = modifyReplicationTaskRequest.getCdcStartPosition();
                jsonWriter.name("CdcStartPosition");
                jsonWriter.value(cdcStartPosition);
            }
            if (modifyReplicationTaskRequest.getCdcStopPosition() != null) {
                String cdcStopPosition = modifyReplicationTaskRequest.getCdcStopPosition();
                jsonWriter.name("CdcStopPosition");
                jsonWriter.value(cdcStopPosition);
            }
            if (modifyReplicationTaskRequest.getTaskData() != null) {
                String taskData = modifyReplicationTaskRequest.getTaskData();
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
