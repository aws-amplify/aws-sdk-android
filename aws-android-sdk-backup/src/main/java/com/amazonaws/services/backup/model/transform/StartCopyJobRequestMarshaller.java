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
 * JSON request marshaller for StartCopyJobRequest
 */
public class StartCopyJobRequestMarshaller implements
        Marshaller<Request<StartCopyJobRequest>, StartCopyJobRequest> {

    public Request<StartCopyJobRequest> marshall(StartCopyJobRequest startCopyJobRequest) {
        if (startCopyJobRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartCopyJobRequest)");
        }

        Request<StartCopyJobRequest> request = new DefaultRequest<StartCopyJobRequest>(
                startCopyJobRequest, "AWSBackup");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/copy-jobs";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (startCopyJobRequest.getRecoveryPointArn() != null) {
                String recoveryPointArn = startCopyJobRequest.getRecoveryPointArn();
                jsonWriter.name("RecoveryPointArn");
                jsonWriter.value(recoveryPointArn);
            }
            if (startCopyJobRequest.getSourceBackupVaultName() != null) {
                String sourceBackupVaultName = startCopyJobRequest.getSourceBackupVaultName();
                jsonWriter.name("SourceBackupVaultName");
                jsonWriter.value(sourceBackupVaultName);
            }
            if (startCopyJobRequest.getDestinationBackupVaultArn() != null) {
                String destinationBackupVaultArn = startCopyJobRequest
                        .getDestinationBackupVaultArn();
                jsonWriter.name("DestinationBackupVaultArn");
                jsonWriter.value(destinationBackupVaultArn);
            }
            if (startCopyJobRequest.getIamRoleArn() != null) {
                String iamRoleArn = startCopyJobRequest.getIamRoleArn();
                jsonWriter.name("IamRoleArn");
                jsonWriter.value(iamRoleArn);
            }
            if (startCopyJobRequest.getIdempotencyToken() != null) {
                String idempotencyToken = startCopyJobRequest.getIdempotencyToken();
                jsonWriter.name("IdempotencyToken");
                jsonWriter.value(idempotencyToken);
            }
            if (startCopyJobRequest.getLifecycle() != null) {
                Lifecycle lifecycle = startCopyJobRequest.getLifecycle();
                jsonWriter.name("Lifecycle");
                LifecycleJsonMarshaller.getInstance().marshall(lifecycle, jsonWriter);
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
