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
 * JSON request marshaller for PutBackupVaultNotificationsRequest
 */
public class PutBackupVaultNotificationsRequestMarshaller implements
        Marshaller<Request<PutBackupVaultNotificationsRequest>, PutBackupVaultNotificationsRequest> {

    public Request<PutBackupVaultNotificationsRequest> marshall(
            PutBackupVaultNotificationsRequest putBackupVaultNotificationsRequest) {
        if (putBackupVaultNotificationsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutBackupVaultNotificationsRequest)");
        }

        Request<PutBackupVaultNotificationsRequest> request = new DefaultRequest<PutBackupVaultNotificationsRequest>(
                putBackupVaultNotificationsRequest, "AWSBackup");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/backup-vaults/{backupVaultName}/notification-configuration";
        uriResourcePath = uriResourcePath.replace(
                "{backupVaultName}",
                (putBackupVaultNotificationsRequest.getBackupVaultName() == null) ? ""
                        : StringUtils.fromString(putBackupVaultNotificationsRequest
                                .getBackupVaultName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (putBackupVaultNotificationsRequest.getSNSTopicArn() != null) {
                String sNSTopicArn = putBackupVaultNotificationsRequest.getSNSTopicArn();
                jsonWriter.name("SNSTopicArn");
                jsonWriter.value(sNSTopicArn);
            }
            if (putBackupVaultNotificationsRequest.getBackupVaultEvents() != null) {
                java.util.List<String> backupVaultEvents = putBackupVaultNotificationsRequest
                        .getBackupVaultEvents();
                jsonWriter.name("BackupVaultEvents");
                jsonWriter.beginArray();
                for (String backupVaultEventsItem : backupVaultEvents) {
                    if (backupVaultEventsItem != null) {
                        jsonWriter.value(backupVaultEventsItem);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
