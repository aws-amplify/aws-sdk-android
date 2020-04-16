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

package com.amazonaws.services.awsglue.model.transform;

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
import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for StartJobRunRequest
 */
public class StartJobRunRequestMarshaller implements
        Marshaller<Request<StartJobRunRequest>, StartJobRunRequest> {

    public Request<StartJobRunRequest> marshall(StartJobRunRequest startJobRunRequest) {
        if (startJobRunRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartJobRunRequest)");
        }

        Request<StartJobRunRequest> request = new DefaultRequest<StartJobRunRequest>(
                startJobRunRequest, "AWSGlue");
        String target = "AWSGlue.StartJobRun";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (startJobRunRequest.getJobName() != null) {
                String jobName = startJobRunRequest.getJobName();
                jsonWriter.name("JobName");
                jsonWriter.value(jobName);
            }
            if (startJobRunRequest.getJobRunId() != null) {
                String jobRunId = startJobRunRequest.getJobRunId();
                jsonWriter.name("JobRunId");
                jsonWriter.value(jobRunId);
            }
            if (startJobRunRequest.getArguments() != null) {
                java.util.Map<String, String> arguments = startJobRunRequest.getArguments();
                jsonWriter.name("Arguments");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> argumentsEntry : arguments.entrySet()) {
                    String argumentsValue = argumentsEntry.getValue();
                    if (argumentsValue != null) {
                        jsonWriter.name(argumentsEntry.getKey());
                        jsonWriter.value(argumentsValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (startJobRunRequest.getAllocatedCapacity() != null) {
                Integer allocatedCapacity = startJobRunRequest.getAllocatedCapacity();
                jsonWriter.name("AllocatedCapacity");
                jsonWriter.value(allocatedCapacity);
            }
            if (startJobRunRequest.getTimeout() != null) {
                Integer timeout = startJobRunRequest.getTimeout();
                jsonWriter.name("Timeout");
                jsonWriter.value(timeout);
            }
            if (startJobRunRequest.getMaxCapacity() != null) {
                Double maxCapacity = startJobRunRequest.getMaxCapacity();
                jsonWriter.name("MaxCapacity");
                jsonWriter.value(maxCapacity);
            }
            if (startJobRunRequest.getSecurityConfiguration() != null) {
                String securityConfiguration = startJobRunRequest.getSecurityConfiguration();
                jsonWriter.name("SecurityConfiguration");
                jsonWriter.value(securityConfiguration);
            }
            if (startJobRunRequest.getNotificationProperty() != null) {
                NotificationProperty notificationProperty = startJobRunRequest
                        .getNotificationProperty();
                jsonWriter.name("NotificationProperty");
                NotificationPropertyJsonMarshaller.getInstance().marshall(notificationProperty,
                        jsonWriter);
            }
            if (startJobRunRequest.getWorkerType() != null) {
                String workerType = startJobRunRequest.getWorkerType();
                jsonWriter.name("WorkerType");
                jsonWriter.value(workerType);
            }
            if (startJobRunRequest.getNumberOfWorkers() != null) {
                Integer numberOfWorkers = startJobRunRequest.getNumberOfWorkers();
                jsonWriter.name("NumberOfWorkers");
                jsonWriter.value(numberOfWorkers);
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
