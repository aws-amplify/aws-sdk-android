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
 * JSON request marshaller for RegisterTaskWithMaintenanceWindowRequest
 */
public class RegisterTaskWithMaintenanceWindowRequestMarshaller
        implements
        Marshaller<Request<RegisterTaskWithMaintenanceWindowRequest>, RegisterTaskWithMaintenanceWindowRequest> {

    public Request<RegisterTaskWithMaintenanceWindowRequest> marshall(
            RegisterTaskWithMaintenanceWindowRequest registerTaskWithMaintenanceWindowRequest) {
        if (registerTaskWithMaintenanceWindowRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RegisterTaskWithMaintenanceWindowRequest)");
        }

        Request<RegisterTaskWithMaintenanceWindowRequest> request = new DefaultRequest<RegisterTaskWithMaintenanceWindowRequest>(
                registerTaskWithMaintenanceWindowRequest, "AmazonSimpleSystemsManager(SSM)");
        String target = "AmazonSSM.RegisterTaskWithMaintenanceWindow";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (registerTaskWithMaintenanceWindowRequest.getWindowId() != null) {
                String windowId = registerTaskWithMaintenanceWindowRequest.getWindowId();
                jsonWriter.name("WindowId");
                jsonWriter.value(windowId);
            }
            if (registerTaskWithMaintenanceWindowRequest.getTargets() != null) {
                java.util.List<Target> targets = registerTaskWithMaintenanceWindowRequest
                        .getTargets();
                jsonWriter.name("Targets");
                jsonWriter.beginArray();
                for (Target targetsItem : targets) {
                    if (targetsItem != null) {
                        TargetJsonMarshaller.getInstance().marshall(targetsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (registerTaskWithMaintenanceWindowRequest.getTaskArn() != null) {
                String taskArn = registerTaskWithMaintenanceWindowRequest.getTaskArn();
                jsonWriter.name("TaskArn");
                jsonWriter.value(taskArn);
            }
            if (registerTaskWithMaintenanceWindowRequest.getServiceRoleArn() != null) {
                String serviceRoleArn = registerTaskWithMaintenanceWindowRequest
                        .getServiceRoleArn();
                jsonWriter.name("ServiceRoleArn");
                jsonWriter.value(serviceRoleArn);
            }
            if (registerTaskWithMaintenanceWindowRequest.getTaskType() != null) {
                String taskType = registerTaskWithMaintenanceWindowRequest.getTaskType();
                jsonWriter.name("TaskType");
                jsonWriter.value(taskType);
            }
            if (registerTaskWithMaintenanceWindowRequest.getTaskParameters() != null) {
                java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters = registerTaskWithMaintenanceWindowRequest
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
            if (registerTaskWithMaintenanceWindowRequest.getTaskInvocationParameters() != null) {
                MaintenanceWindowTaskInvocationParameters taskInvocationParameters = registerTaskWithMaintenanceWindowRequest
                        .getTaskInvocationParameters();
                jsonWriter.name("TaskInvocationParameters");
                MaintenanceWindowTaskInvocationParametersJsonMarshaller.getInstance().marshall(
                        taskInvocationParameters, jsonWriter);
            }
            if (registerTaskWithMaintenanceWindowRequest.getPriority() != null) {
                Integer priority = registerTaskWithMaintenanceWindowRequest.getPriority();
                jsonWriter.name("Priority");
                jsonWriter.value(priority);
            }
            if (registerTaskWithMaintenanceWindowRequest.getMaxConcurrency() != null) {
                String maxConcurrency = registerTaskWithMaintenanceWindowRequest
                        .getMaxConcurrency();
                jsonWriter.name("MaxConcurrency");
                jsonWriter.value(maxConcurrency);
            }
            if (registerTaskWithMaintenanceWindowRequest.getMaxErrors() != null) {
                String maxErrors = registerTaskWithMaintenanceWindowRequest.getMaxErrors();
                jsonWriter.name("MaxErrors");
                jsonWriter.value(maxErrors);
            }
            if (registerTaskWithMaintenanceWindowRequest.getLoggingInfo() != null) {
                LoggingInfo loggingInfo = registerTaskWithMaintenanceWindowRequest.getLoggingInfo();
                jsonWriter.name("LoggingInfo");
                LoggingInfoJsonMarshaller.getInstance().marshall(loggingInfo, jsonWriter);
            }
            if (registerTaskWithMaintenanceWindowRequest.getName() != null) {
                String name = registerTaskWithMaintenanceWindowRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (registerTaskWithMaintenanceWindowRequest.getDescription() != null) {
                String description = registerTaskWithMaintenanceWindowRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (registerTaskWithMaintenanceWindowRequest.getClientToken() != null) {
                String clientToken = registerTaskWithMaintenanceWindowRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
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
