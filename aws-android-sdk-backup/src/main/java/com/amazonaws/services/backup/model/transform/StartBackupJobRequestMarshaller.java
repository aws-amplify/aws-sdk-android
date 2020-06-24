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

package com.amazonaws.services.backup.model.transform;

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
import com.amazonaws.services.backup.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for StartBackupJobRequest
 */
public class StartBackupJobRequestMarshaller implements
        Marshaller<Request<StartBackupJobRequest>, StartBackupJobRequest> {

    public Request<StartBackupJobRequest> marshall(StartBackupJobRequest startBackupJobRequest) {
        if (startBackupJobRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartBackupJobRequest)");
        }

        Request<StartBackupJobRequest> request = new DefaultRequest<StartBackupJobRequest>(
                startBackupJobRequest, "AWSBackup");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/backup-jobs";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (startBackupJobRequest.getBackupVaultName() != null) {
                String backupVaultName = startBackupJobRequest.getBackupVaultName();
                jsonWriter.name("BackupVaultName");
                jsonWriter.value(backupVaultName);
            }
            if (startBackupJobRequest.getResourceArn() != null) {
                String resourceArn = startBackupJobRequest.getResourceArn();
                jsonWriter.name("ResourceArn");
                jsonWriter.value(resourceArn);
            }
            if (startBackupJobRequest.getIamRoleArn() != null) {
                String iamRoleArn = startBackupJobRequest.getIamRoleArn();
                jsonWriter.name("IamRoleArn");
                jsonWriter.value(iamRoleArn);
            }
            if (startBackupJobRequest.getIdempotencyToken() != null) {
                String idempotencyToken = startBackupJobRequest.getIdempotencyToken();
                jsonWriter.name("IdempotencyToken");
                jsonWriter.value(idempotencyToken);
            }
            if (startBackupJobRequest.getStartWindowMinutes() != null) {
                Long startWindowMinutes = startBackupJobRequest.getStartWindowMinutes();
                jsonWriter.name("StartWindowMinutes");
                jsonWriter.value(startWindowMinutes);
            }
            if (startBackupJobRequest.getCompleteWindowMinutes() != null) {
                Long completeWindowMinutes = startBackupJobRequest.getCompleteWindowMinutes();
                jsonWriter.name("CompleteWindowMinutes");
                jsonWriter.value(completeWindowMinutes);
            }
            if (startBackupJobRequest.getLifecycle() != null) {
                Lifecycle lifecycle = startBackupJobRequest.getLifecycle();
                jsonWriter.name("Lifecycle");
                LifecycleJsonMarshaller.getInstance().marshall(lifecycle, jsonWriter);
            }
            if (startBackupJobRequest.getRecoveryPointTags() != null) {
                java.util.Map<String, String> recoveryPointTags = startBackupJobRequest
                        .getRecoveryPointTags();
                jsonWriter.name("RecoveryPointTags");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> recoveryPointTagsEntry : recoveryPointTags
                        .entrySet()) {
                    String recoveryPointTagsValue = recoveryPointTagsEntry.getValue();
                    if (recoveryPointTagsValue != null) {
                        jsonWriter.name(recoveryPointTagsEntry.getKey());
                        jsonWriter.value(recoveryPointTagsValue);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
