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
 * JSON request marshaller for RestoreTableFromBackupRequest
 */
public class RestoreTableFromBackupRequestMarshaller implements
        Marshaller<Request<RestoreTableFromBackupRequest>, RestoreTableFromBackupRequest> {

    public Request<RestoreTableFromBackupRequest> marshall(
            RestoreTableFromBackupRequest restoreTableFromBackupRequest) {
        if (restoreTableFromBackupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RestoreTableFromBackupRequest)");
        }

        Request<RestoreTableFromBackupRequest> request = new DefaultRequest<RestoreTableFromBackupRequest>(
                restoreTableFromBackupRequest, "AmazonDynamoDB");
        String target = "DynamoDB_20120810.RestoreTableFromBackup";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (restoreTableFromBackupRequest.getTargetTableName() != null) {
                String targetTableName = restoreTableFromBackupRequest.getTargetTableName();
                jsonWriter.name("TargetTableName");
                jsonWriter.value(targetTableName);
            }
            if (restoreTableFromBackupRequest.getBackupArn() != null) {
                String backupArn = restoreTableFromBackupRequest.getBackupArn();
                jsonWriter.name("BackupArn");
                jsonWriter.value(backupArn);
            }
            if (restoreTableFromBackupRequest.getBillingModeOverride() != null) {
                String billingModeOverride = restoreTableFromBackupRequest.getBillingModeOverride();
                jsonWriter.name("BillingModeOverride");
                jsonWriter.value(billingModeOverride);
            }
            if (restoreTableFromBackupRequest.getGlobalSecondaryIndexOverride() != null) {
                java.util.List<GlobalSecondaryIndex> globalSecondaryIndexOverride = restoreTableFromBackupRequest
                        .getGlobalSecondaryIndexOverride();
                jsonWriter.name("GlobalSecondaryIndexOverride");
                jsonWriter.beginArray();
                for (GlobalSecondaryIndex globalSecondaryIndexOverrideItem : globalSecondaryIndexOverride) {
                    if (globalSecondaryIndexOverrideItem != null) {
                        GlobalSecondaryIndexJsonMarshaller.getInstance().marshall(
                                globalSecondaryIndexOverrideItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (restoreTableFromBackupRequest.getLocalSecondaryIndexOverride() != null) {
                java.util.List<LocalSecondaryIndex> localSecondaryIndexOverride = restoreTableFromBackupRequest
                        .getLocalSecondaryIndexOverride();
                jsonWriter.name("LocalSecondaryIndexOverride");
                jsonWriter.beginArray();
                for (LocalSecondaryIndex localSecondaryIndexOverrideItem : localSecondaryIndexOverride) {
                    if (localSecondaryIndexOverrideItem != null) {
                        LocalSecondaryIndexJsonMarshaller.getInstance().marshall(
                                localSecondaryIndexOverrideItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (restoreTableFromBackupRequest.getProvisionedThroughputOverride() != null) {
                ProvisionedThroughput provisionedThroughputOverride = restoreTableFromBackupRequest
                        .getProvisionedThroughputOverride();
                jsonWriter.name("ProvisionedThroughputOverride");
                ProvisionedThroughputJsonMarshaller.getInstance().marshall(
                        provisionedThroughputOverride, jsonWriter);
            }
            if (restoreTableFromBackupRequest.getSSESpecificationOverride() != null) {
                SSESpecification sSESpecificationOverride = restoreTableFromBackupRequest
                        .getSSESpecificationOverride();
                jsonWriter.name("SSESpecificationOverride");
                SSESpecificationJsonMarshaller.getInstance().marshall(sSESpecificationOverride,
                        jsonWriter);
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
