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

package com.amazonaws.services.glue.model.transform;

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
import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateJobRequest
 */
public class CreateJobRequestMarshaller implements
        Marshaller<Request<CreateJobRequest>, CreateJobRequest> {

    public Request<CreateJobRequest> marshall(CreateJobRequest createJobRequest) {
        if (createJobRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(CreateJobRequest)");
        }

        Request<CreateJobRequest> request = new DefaultRequest<CreateJobRequest>(createJobRequest,
                "AWSGlue");
        String target = "AWSGlue.CreateJob";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createJobRequest.getName() != null) {
                String name = createJobRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createJobRequest.getDescription() != null) {
                String description = createJobRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createJobRequest.getLogUri() != null) {
                String logUri = createJobRequest.getLogUri();
                jsonWriter.name("LogUri");
                jsonWriter.value(logUri);
            }
            if (createJobRequest.getRole() != null) {
                String role = createJobRequest.getRole();
                jsonWriter.name("Role");
                jsonWriter.value(role);
            }
            if (createJobRequest.getExecutionProperty() != null) {
                ExecutionProperty executionProperty = createJobRequest.getExecutionProperty();
                jsonWriter.name("ExecutionProperty");
                ExecutionPropertyJsonMarshaller.getInstance().marshall(executionProperty,
                        jsonWriter);
            }
            if (createJobRequest.getCommand() != null) {
                JobCommand command = createJobRequest.getCommand();
                jsonWriter.name("Command");
                JobCommandJsonMarshaller.getInstance().marshall(command, jsonWriter);
            }
            if (createJobRequest.getDefaultArguments() != null) {
                java.util.Map<String, String> defaultArguments = createJobRequest
                        .getDefaultArguments();
                jsonWriter.name("DefaultArguments");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> defaultArgumentsEntry : defaultArguments
                        .entrySet()) {
                    String defaultArgumentsValue = defaultArgumentsEntry.getValue();
                    if (defaultArgumentsValue != null) {
                        jsonWriter.name(defaultArgumentsEntry.getKey());
                        jsonWriter.value(defaultArgumentsValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (createJobRequest.getNonOverridableArguments() != null) {
                java.util.Map<String, String> nonOverridableArguments = createJobRequest
                        .getNonOverridableArguments();
                jsonWriter.name("NonOverridableArguments");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> nonOverridableArgumentsEntry : nonOverridableArguments
                        .entrySet()) {
                    String nonOverridableArgumentsValue = nonOverridableArgumentsEntry.getValue();
                    if (nonOverridableArgumentsValue != null) {
                        jsonWriter.name(nonOverridableArgumentsEntry.getKey());
                        jsonWriter.value(nonOverridableArgumentsValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (createJobRequest.getConnections() != null) {
                ConnectionsList connections = createJobRequest.getConnections();
                jsonWriter.name("Connections");
                ConnectionsListJsonMarshaller.getInstance().marshall(connections, jsonWriter);
            }
            if (createJobRequest.getMaxRetries() != null) {
                Integer maxRetries = createJobRequest.getMaxRetries();
                jsonWriter.name("MaxRetries");
                jsonWriter.value(maxRetries);
            }
            if (createJobRequest.getAllocatedCapacity() != null) {
                Integer allocatedCapacity = createJobRequest.getAllocatedCapacity();
                jsonWriter.name("AllocatedCapacity");
                jsonWriter.value(allocatedCapacity);
            }
            if (createJobRequest.getTimeout() != null) {
                Integer timeout = createJobRequest.getTimeout();
                jsonWriter.name("Timeout");
                jsonWriter.value(timeout);
            }
            if (createJobRequest.getMaxCapacity() != null) {
                Double maxCapacity = createJobRequest.getMaxCapacity();
                jsonWriter.name("MaxCapacity");
                jsonWriter.value(maxCapacity);
            }
            if (createJobRequest.getSecurityConfiguration() != null) {
                String securityConfiguration = createJobRequest.getSecurityConfiguration();
                jsonWriter.name("SecurityConfiguration");
                jsonWriter.value(securityConfiguration);
            }
            if (createJobRequest.getTags() != null) {
                java.util.Map<String, String> tags = createJobRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                    String tagsValue = tagsEntry.getValue();
                    if (tagsValue != null) {
                        jsonWriter.name(tagsEntry.getKey());
                        jsonWriter.value(tagsValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (createJobRequest.getNotificationProperty() != null) {
                NotificationProperty notificationProperty = createJobRequest
                        .getNotificationProperty();
                jsonWriter.name("NotificationProperty");
                NotificationPropertyJsonMarshaller.getInstance().marshall(notificationProperty,
                        jsonWriter);
            }
            if (createJobRequest.getGlueVersion() != null) {
                String glueVersion = createJobRequest.getGlueVersion();
                jsonWriter.name("GlueVersion");
                jsonWriter.value(glueVersion);
            }
            if (createJobRequest.getNumberOfWorkers() != null) {
                Integer numberOfWorkers = createJobRequest.getNumberOfWorkers();
                jsonWriter.name("NumberOfWorkers");
                jsonWriter.value(numberOfWorkers);
            }
            if (createJobRequest.getWorkerType() != null) {
                String workerType = createJobRequest.getWorkerType();
                jsonWriter.name("WorkerType");
                jsonWriter.value(workerType);
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
