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

package com.amazonaws.services.ssm.model.transform;

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
import com.amazonaws.services.ssm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for SendCommandRequest
 */
public class SendCommandRequestMarshaller implements
        Marshaller<Request<SendCommandRequest>, SendCommandRequest> {

    public Request<SendCommandRequest> marshall(SendCommandRequest sendCommandRequest) {
        if (sendCommandRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SendCommandRequest)");
        }

        Request<SendCommandRequest> request = new DefaultRequest<SendCommandRequest>(
                sendCommandRequest, "AmazonSimpleSystemsManager(SSM)");
        String target = "AmazonSSM.SendCommand";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (sendCommandRequest.getInstanceIds() != null) {
                java.util.List<String> instanceIds = sendCommandRequest.getInstanceIds();
                jsonWriter.name("InstanceIds");
                jsonWriter.beginArray();
                for (String instanceIdsItem : instanceIds) {
                    if (instanceIdsItem != null) {
                        jsonWriter.value(instanceIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (sendCommandRequest.getTargets() != null) {
                java.util.List<Target> targets = sendCommandRequest.getTargets();
                jsonWriter.name("Targets");
                jsonWriter.beginArray();
                for (Target targetsItem : targets) {
                    if (targetsItem != null) {
                        TargetJsonMarshaller.getInstance().marshall(targetsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (sendCommandRequest.getDocumentName() != null) {
                String documentName = sendCommandRequest.getDocumentName();
                jsonWriter.name("DocumentName");
                jsonWriter.value(documentName);
            }
            if (sendCommandRequest.getDocumentVersion() != null) {
                String documentVersion = sendCommandRequest.getDocumentVersion();
                jsonWriter.name("DocumentVersion");
                jsonWriter.value(documentVersion);
            }
            if (sendCommandRequest.getDocumentHash() != null) {
                String documentHash = sendCommandRequest.getDocumentHash();
                jsonWriter.name("DocumentHash");
                jsonWriter.value(documentHash);
            }
            if (sendCommandRequest.getDocumentHashType() != null) {
                String documentHashType = sendCommandRequest.getDocumentHashType();
                jsonWriter.name("DocumentHashType");
                jsonWriter.value(documentHashType);
            }
            if (sendCommandRequest.getTimeoutSeconds() != null) {
                Integer timeoutSeconds = sendCommandRequest.getTimeoutSeconds();
                jsonWriter.name("TimeoutSeconds");
                jsonWriter.value(timeoutSeconds);
            }
            if (sendCommandRequest.getComment() != null) {
                String comment = sendCommandRequest.getComment();
                jsonWriter.name("Comment");
                jsonWriter.value(comment);
            }
            if (sendCommandRequest.getParameters() != null) {
                java.util.Map<String, java.util.List<String>> parameters = sendCommandRequest
                        .getParameters();
                jsonWriter.name("Parameters");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, java.util.List<String>> parametersEntry : parameters
                        .entrySet()) {
                    java.util.List<String> parametersValue = parametersEntry.getValue();
                    if (parametersValue != null) {
                        jsonWriter.name(parametersEntry.getKey());
                        jsonWriter.beginArray();
                        for (String parametersValueItem : parametersValue) {
                            if (parametersValueItem != null) {
                                jsonWriter.value(parametersValueItem);
                            }
                        }
                        jsonWriter.endArray();
                    }
                }
                jsonWriter.endObject();
            }
            if (sendCommandRequest.getOutputS3Region() != null) {
                String outputS3Region = sendCommandRequest.getOutputS3Region();
                jsonWriter.name("OutputS3Region");
                jsonWriter.value(outputS3Region);
            }
            if (sendCommandRequest.getOutputS3BucketName() != null) {
                String outputS3BucketName = sendCommandRequest.getOutputS3BucketName();
                jsonWriter.name("OutputS3BucketName");
                jsonWriter.value(outputS3BucketName);
            }
            if (sendCommandRequest.getOutputS3KeyPrefix() != null) {
                String outputS3KeyPrefix = sendCommandRequest.getOutputS3KeyPrefix();
                jsonWriter.name("OutputS3KeyPrefix");
                jsonWriter.value(outputS3KeyPrefix);
            }
            if (sendCommandRequest.getMaxConcurrency() != null) {
                String maxConcurrency = sendCommandRequest.getMaxConcurrency();
                jsonWriter.name("MaxConcurrency");
                jsonWriter.value(maxConcurrency);
            }
            if (sendCommandRequest.getMaxErrors() != null) {
                String maxErrors = sendCommandRequest.getMaxErrors();
                jsonWriter.name("MaxErrors");
                jsonWriter.value(maxErrors);
            }
            if (sendCommandRequest.getServiceRoleArn() != null) {
                String serviceRoleArn = sendCommandRequest.getServiceRoleArn();
                jsonWriter.name("ServiceRoleArn");
                jsonWriter.value(serviceRoleArn);
            }
            if (sendCommandRequest.getNotificationConfig() != null) {
                NotificationConfig notificationConfig = sendCommandRequest.getNotificationConfig();
                jsonWriter.name("NotificationConfig");
                NotificationConfigJsonMarshaller.getInstance().marshall(notificationConfig,
                        jsonWriter);
            }
            if (sendCommandRequest.getCloudWatchOutputConfig() != null) {
                CloudWatchOutputConfig cloudWatchOutputConfig = sendCommandRequest
                        .getCloudWatchOutputConfig();
                jsonWriter.name("CloudWatchOutputConfig");
                CloudWatchOutputConfigJsonMarshaller.getInstance().marshall(cloudWatchOutputConfig,
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
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
