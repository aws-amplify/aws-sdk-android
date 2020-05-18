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
 * JSON request marshaller for RestoreTableToPointInTimeRequest
 */
public class RestoreTableToPointInTimeRequestMarshaller implements
        Marshaller<Request<RestoreTableToPointInTimeRequest>, RestoreTableToPointInTimeRequest> {

    public Request<RestoreTableToPointInTimeRequest> marshall(
            RestoreTableToPointInTimeRequest restoreTableToPointInTimeRequest) {
        if (restoreTableToPointInTimeRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RestoreTableToPointInTimeRequest)");
        }

        Request<RestoreTableToPointInTimeRequest> request = new DefaultRequest<RestoreTableToPointInTimeRequest>(
                restoreTableToPointInTimeRequest, "AmazonDynamoDB");
        String target = "DynamoDB_20120810.RestoreTableToPointInTime";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (restoreTableToPointInTimeRequest.getSourceTableArn() != null) {
                String sourceTableArn = restoreTableToPointInTimeRequest.getSourceTableArn();
                jsonWriter.name("SourceTableArn");
                jsonWriter.value(sourceTableArn);
            }
            if (restoreTableToPointInTimeRequest.getSourceTableName() != null) {
                String sourceTableName = restoreTableToPointInTimeRequest.getSourceTableName();
                jsonWriter.name("SourceTableName");
                jsonWriter.value(sourceTableName);
            }
            if (restoreTableToPointInTimeRequest.getTargetTableName() != null) {
                String targetTableName = restoreTableToPointInTimeRequest.getTargetTableName();
                jsonWriter.name("TargetTableName");
                jsonWriter.value(targetTableName);
            }
            if (restoreTableToPointInTimeRequest.getUseLatestRestorableTime() != null) {
                Boolean useLatestRestorableTime = restoreTableToPointInTimeRequest
                        .getUseLatestRestorableTime();
                jsonWriter.name("UseLatestRestorableTime");
                jsonWriter.value(useLatestRestorableTime);
            }
            if (restoreTableToPointInTimeRequest.getRestoreDateTime() != null) {
                java.util.Date restoreDateTime = restoreTableToPointInTimeRequest
                        .getRestoreDateTime();
                jsonWriter.name("RestoreDateTime");
                jsonWriter.value(restoreDateTime);
            }
            if (restoreTableToPointInTimeRequest.getBillingModeOverride() != null) {
                String billingModeOverride = restoreTableToPointInTimeRequest
                        .getBillingModeOverride();
                jsonWriter.name("BillingModeOverride");
                jsonWriter.value(billingModeOverride);
            }
            if (restoreTableToPointInTimeRequest.getGlobalSecondaryIndexOverride() != null) {
                java.util.List<GlobalSecondaryIndex> globalSecondaryIndexOverride = restoreTableToPointInTimeRequest
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
            if (restoreTableToPointInTimeRequest.getLocalSecondaryIndexOverride() != null) {
                java.util.List<LocalSecondaryIndex> localSecondaryIndexOverride = restoreTableToPointInTimeRequest
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
            if (restoreTableToPointInTimeRequest.getProvisionedThroughputOverride() != null) {
                ProvisionedThroughput provisionedThroughputOverride = restoreTableToPointInTimeRequest
                        .getProvisionedThroughputOverride();
                jsonWriter.name("ProvisionedThroughputOverride");
                ProvisionedThroughputJsonMarshaller.getInstance().marshall(
                        provisionedThroughputOverride, jsonWriter);
            }
            if (restoreTableToPointInTimeRequest.getSSESpecificationOverride() != null) {
                SSESpecification sSESpecificationOverride = restoreTableToPointInTimeRequest
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
