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
 * JSON request marshaller for CreateBackupVaultRequest
 */
public class CreateBackupVaultRequestMarshaller implements
        Marshaller<Request<CreateBackupVaultRequest>, CreateBackupVaultRequest> {

    public Request<CreateBackupVaultRequest> marshall(
            CreateBackupVaultRequest createBackupVaultRequest) {
        if (createBackupVaultRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateBackupVaultRequest)");
        }

        Request<CreateBackupVaultRequest> request = new DefaultRequest<CreateBackupVaultRequest>(
                createBackupVaultRequest, "AWSBackup");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/backup-vaults/{backupVaultName}";
        uriResourcePath = uriResourcePath.replace(
                "{backupVaultName}",
                (createBackupVaultRequest.getBackupVaultName() == null) ? "" : StringUtils
                        .fromString(createBackupVaultRequest.getBackupVaultName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createBackupVaultRequest.getBackupVaultTags() != null) {
                java.util.Map<String, String> backupVaultTags = createBackupVaultRequest
                        .getBackupVaultTags();
                jsonWriter.name("BackupVaultTags");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> backupVaultTagsEntry : backupVaultTags
                        .entrySet()) {
                    String backupVaultTagsValue = backupVaultTagsEntry.getValue();
                    if (backupVaultTagsValue != null) {
                        jsonWriter.name(backupVaultTagsEntry.getKey());
                        jsonWriter.value(backupVaultTagsValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (createBackupVaultRequest.getEncryptionKeyArn() != null) {
                String encryptionKeyArn = createBackupVaultRequest.getEncryptionKeyArn();
                jsonWriter.name("EncryptionKeyArn");
                jsonWriter.value(encryptionKeyArn);
            }
            if (createBackupVaultRequest.getCreatorRequestId() != null) {
                String creatorRequestId = createBackupVaultRequest.getCreatorRequestId();
                jsonWriter.name("CreatorRequestId");
                jsonWriter.value(creatorRequestId);
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
