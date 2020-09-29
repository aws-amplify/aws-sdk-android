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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CommandInvocation
 */
class CommandInvocationJsonMarshaller {

    public void marshall(CommandInvocation commandInvocation, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (commandInvocation.getCommandId() != null) {
            String commandId = commandInvocation.getCommandId();
            jsonWriter.name("CommandId");
            jsonWriter.value(commandId);
        }
        if (commandInvocation.getInstanceId() != null) {
            String instanceId = commandInvocation.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (commandInvocation.getInstanceName() != null) {
            String instanceName = commandInvocation.getInstanceName();
            jsonWriter.name("InstanceName");
            jsonWriter.value(instanceName);
        }
        if (commandInvocation.getComment() != null) {
            String comment = commandInvocation.getComment();
            jsonWriter.name("Comment");
            jsonWriter.value(comment);
        }
        if (commandInvocation.getDocumentName() != null) {
            String documentName = commandInvocation.getDocumentName();
            jsonWriter.name("DocumentName");
            jsonWriter.value(documentName);
        }
        if (commandInvocation.getDocumentVersion() != null) {
            String documentVersion = commandInvocation.getDocumentVersion();
            jsonWriter.name("DocumentVersion");
            jsonWriter.value(documentVersion);
        }
        if (commandInvocation.getRequestedDateTime() != null) {
            java.util.Date requestedDateTime = commandInvocation.getRequestedDateTime();
            jsonWriter.name("RequestedDateTime");
            jsonWriter.value(requestedDateTime);
        }
        if (commandInvocation.getStatus() != null) {
            String status = commandInvocation.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (commandInvocation.getStatusDetails() != null) {
            String statusDetails = commandInvocation.getStatusDetails();
            jsonWriter.name("StatusDetails");
            jsonWriter.value(statusDetails);
        }
        if (commandInvocation.getTraceOutput() != null) {
            String traceOutput = commandInvocation.getTraceOutput();
            jsonWriter.name("TraceOutput");
            jsonWriter.value(traceOutput);
        }
        if (commandInvocation.getStandardOutputUrl() != null) {
            String standardOutputUrl = commandInvocation.getStandardOutputUrl();
            jsonWriter.name("StandardOutputUrl");
            jsonWriter.value(standardOutputUrl);
        }
        if (commandInvocation.getStandardErrorUrl() != null) {
            String standardErrorUrl = commandInvocation.getStandardErrorUrl();
            jsonWriter.name("StandardErrorUrl");
            jsonWriter.value(standardErrorUrl);
        }
        if (commandInvocation.getCommandPlugins() != null) {
            java.util.List<CommandPlugin> commandPlugins = commandInvocation.getCommandPlugins();
            jsonWriter.name("CommandPlugins");
            jsonWriter.beginArray();
            for (CommandPlugin commandPluginsItem : commandPlugins) {
                if (commandPluginsItem != null) {
            CommandPluginJsonMarshaller.getInstance().marshall(commandPluginsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (commandInvocation.getServiceRole() != null) {
            String serviceRole = commandInvocation.getServiceRole();
            jsonWriter.name("ServiceRole");
            jsonWriter.value(serviceRole);
        }
        if (commandInvocation.getNotificationConfig() != null) {
            NotificationConfig notificationConfig = commandInvocation.getNotificationConfig();
            jsonWriter.name("NotificationConfig");
            NotificationConfigJsonMarshaller.getInstance().marshall(notificationConfig, jsonWriter);
        }
        if (commandInvocation.getCloudWatchOutputConfig() != null) {
            CloudWatchOutputConfig cloudWatchOutputConfig = commandInvocation.getCloudWatchOutputConfig();
            jsonWriter.name("CloudWatchOutputConfig");
            CloudWatchOutputConfigJsonMarshaller.getInstance().marshall(cloudWatchOutputConfig, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static CommandInvocationJsonMarshaller instance;
    public static CommandInvocationJsonMarshaller getInstance() {
        if (instance == null) instance = new CommandInvocationJsonMarshaller();
        return instance;
    }
}
