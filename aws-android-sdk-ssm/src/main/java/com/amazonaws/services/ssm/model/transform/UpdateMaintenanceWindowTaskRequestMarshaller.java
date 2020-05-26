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
 * JSON request marshaller for UpdateMaintenanceWindowTaskRequest
 */
public class UpdateMaintenanceWindowTaskRequestMarshaller implements
        Marshaller<Request<UpdateMaintenanceWindowTaskRequest>, UpdateMaintenanceWindowTaskRequest> {

    public Request<UpdateMaintenanceWindowTaskRequest> marshall(
            UpdateMaintenanceWindowTaskRequest updateMaintenanceWindowTaskRequest) {
        if (updateMaintenanceWindowTaskRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateMaintenanceWindowTaskRequest)");
        }

        Request<UpdateMaintenanceWindowTaskRequest> request = new DefaultRequest<UpdateMaintenanceWindowTaskRequest>(
                updateMaintenanceWindowTaskRequest, "AmazonSimpleSystemsManager(SSM)");
        String target = "AmazonSSM.UpdateMaintenanceWindowTask";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateMaintenanceWindowTaskRequest.getWindowId() != null) {
                String windowId = updateMaintenanceWindowTaskRequest.getWindowId();
                jsonWriter.name("WindowId");
                jsonWriter.value(windowId);
            }
            if (updateMaintenanceWindowTaskRequest.getWindowTaskId() != null) {
                String windowTaskId = updateMaintenanceWindowTaskRequest.getWindowTaskId();
                jsonWriter.name("WindowTaskId");
                jsonWriter.value(windowTaskId);
            }
            if (updateMaintenanceWindowTaskRequest.getTargets() != null) {
                java.util.List<Target> targets = updateMaintenanceWindowTaskRequest.getTargets();
                jsonWriter.name("Targets");
                jsonWriter.beginArray();
                for (Target targetsItem : targets) {
                    if (targetsItem != null) {
                        TargetJsonMarshaller.getInstance().marshall(targetsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateMaintenanceWindowTaskRequest.getTaskArn() != null) {
                String taskArn = updateMaintenanceWindowTaskRequest.getTaskArn();
                jsonWriter.name("TaskArn");
                jsonWriter.value(taskArn);
            }
            if (updateMaintenanceWindowTaskRequest.getServiceRoleArn() != null) {
                String serviceRoleArn = updateMaintenanceWindowTaskRequest.getServiceRoleArn();
                jsonWriter.name("ServiceRoleArn");
                jsonWriter.value(serviceRoleArn);
            }
            if (updateMaintenanceWindowTaskRequest.getTaskParameters() != null) {
                java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters = updateMaintenanceWindowTaskRequest
                        .getTaskParameters();
                jsonWriter.name("TaskParameters");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, MaintenanceWindowTaskParameterValueExpression> taskParametersEntry : taskParameters
                        .entrySet()) {
                    MaintenanceWindowTaskParameterValueExpression taskParametersValue = taskParametersEntry
                            .getValue();
                    if (taskParametersValue != null) {
                        jsonWriter.name(taskParametersEntry.getKey());
                        MaintenanceWindowTaskParameterValueExpressionJsonMarshaller.getInstance()
                                .marshall(taskParametersValue, jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (updateMaintenanceWindowTaskRequest.getTaskInvocationParameters() != null) {
                MaintenanceWindowTaskInvocationParameters taskInvocationParameters = updateMaintenanceWindowTaskRequest
                        .getTaskInvocationParameters();
                jsonWriter.name("TaskInvocationParameters");
                MaintenanceWindowTaskInvocationParametersJsonMarshaller.getInstance().marshall(
                        taskInvocationParameters, jsonWriter);
            }
            if (updateMaintenanceWindowTaskRequest.getPriority() != null) {
                Integer priority = updateMaintenanceWindowTaskRequest.getPriority();
                jsonWriter.name("Priority");
                jsonWriter.value(priority);
            }
            if (updateMaintenanceWindowTaskRequest.getMaxConcurrency() != null) {
                String maxConcurrency = updateMaintenanceWindowTaskRequest.getMaxConcurrency();
                jsonWriter.name("MaxConcurrency");
                jsonWriter.value(maxConcurrency);
            }
            if (updateMaintenanceWindowTaskRequest.getMaxErrors() != null) {
                String maxErrors = updateMaintenanceWindowTaskRequest.getMaxErrors();
                jsonWriter.name("MaxErrors");
                jsonWriter.value(maxErrors);
            }
            if (updateMaintenanceWindowTaskRequest.getLoggingInfo() != null) {
                LoggingInfo loggingInfo = updateMaintenanceWindowTaskRequest.getLoggingInfo();
                jsonWriter.name("LoggingInfo");
                LoggingInfoJsonMarshaller.getInstance().marshall(loggingInfo, jsonWriter);
            }
            if (updateMaintenanceWindowTaskRequest.getName() != null) {
                String name = updateMaintenanceWindowTaskRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateMaintenanceWindowTaskRequest.getDescription() != null) {
                String description = updateMaintenanceWindowTaskRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (updateMaintenanceWindowTaskRequest.getReplace() != null) {
                Boolean replace = updateMaintenanceWindowTaskRequest.getReplace();
                jsonWriter.name("Replace");
                jsonWriter.value(replace);
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
