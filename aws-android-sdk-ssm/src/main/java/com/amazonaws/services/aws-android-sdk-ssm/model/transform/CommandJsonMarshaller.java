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
 * JSON marshaller for POJO Command
 */
class CommandJsonMarshaller {

    public void marshall(Command command, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (command.getCommandId() != null) {
            String commandId = command.getCommandId();
            jsonWriter.name("CommandId");
            jsonWriter.value(commandId);
        }
        if (command.getDocumentName() != null) {
            String documentName = command.getDocumentName();
            jsonWriter.name("DocumentName");
            jsonWriter.value(documentName);
        }
        if (command.getDocumentVersion() != null) {
            String documentVersion = command.getDocumentVersion();
            jsonWriter.name("DocumentVersion");
            jsonWriter.value(documentVersion);
        }
        if (command.getComment() != null) {
            String comment = command.getComment();
            jsonWriter.name("Comment");
            jsonWriter.value(comment);
        }
        if (command.getExpiresAfter() != null) {
            java.util.Date expiresAfter = command.getExpiresAfter();
            jsonWriter.name("ExpiresAfter");
            jsonWriter.value(expiresAfter);
        }
        if (command.getParameters() != null) {
            java.util.Map<String, java.util.List<String>> parameters = command.getParameters();
            jsonWriter.name("Parameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.List<String>> parametersEntry : parameters.entrySet()) {
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
        if (command.getInstanceIds() != null) {
            java.util.List<String> instanceIds = command.getInstanceIds();
            jsonWriter.name("InstanceIds");
            jsonWriter.beginArray();
            for (String instanceIdsItem : instanceIds) {
                if (instanceIdsItem != null) {
            jsonWriter.value(instanceIdsItem);
                    }
            }
            jsonWriter.endArray();
        }
        if (command.getTargets() != null) {
            java.util.List<Target> targets = command.getTargets();
            jsonWriter.name("Targets");
            jsonWriter.beginArray();
            for (Target targetsItem : targets) {
                if (targetsItem != null) {
            TargetJsonMarshaller.getInstance().marshall(targetsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (command.getRequestedDateTime() != null) {
            java.util.Date requestedDateTime = command.getRequestedDateTime();
            jsonWriter.name("RequestedDateTime");
            jsonWriter.value(requestedDateTime);
        }
        if (command.getStatus() != null) {
            String status = command.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (command.getStatusDetails() != null) {
            String statusDetails = command.getStatusDetails();
            jsonWriter.name("StatusDetails");
            jsonWriter.value(statusDetails);
        }
        if (command.getOutputS3Region() != null) {
            String outputS3Region = command.getOutputS3Region();
            jsonWriter.name("OutputS3Region");
            jsonWriter.value(outputS3Region);
        }
        if (command.getOutputS3BucketName() != null) {
            String outputS3BucketName = command.getOutputS3BucketName();
            jsonWriter.name("OutputS3BucketName");
            jsonWriter.value(outputS3BucketName);
        }
        if (command.getOutputS3KeyPrefix() != null) {
            String outputS3KeyPrefix = command.getOutputS3KeyPrefix();
            jsonWriter.name("OutputS3KeyPrefix");
            jsonWriter.value(outputS3KeyPrefix);
        }
        if (command.getMaxConcurrency() != null) {
            String maxConcurrency = command.getMaxConcurrency();
            jsonWriter.name("MaxConcurrency");
            jsonWriter.value(maxConcurrency);
        }
        if (command.getMaxErrors() != null) {
            String maxErrors = command.getMaxErrors();
            jsonWriter.name("MaxErrors");
            jsonWriter.value(maxErrors);
        }
        if (command.getTargetCount() != null) {
            Integer targetCount = command.getTargetCount();
            jsonWriter.name("TargetCount");
            jsonWriter.value(targetCount);
        }
        if (command.getCompletedCount() != null) {
            Integer completedCount = command.getCompletedCount();
            jsonWriter.name("CompletedCount");
            jsonWriter.value(completedCount);
        }
        if (command.getErrorCount() != null) {
            Integer errorCount = command.getErrorCount();
            jsonWriter.name("ErrorCount");
            jsonWriter.value(errorCount);
        }
        if (command.getDeliveryTimedOutCount() != null) {
            Integer deliveryTimedOutCount = command.getDeliveryTimedOutCount();
            jsonWriter.name("DeliveryTimedOutCount");
            jsonWriter.value(deliveryTimedOutCount);
        }
        if (command.getServiceRole() != null) {
            String serviceRole = command.getServiceRole();
            jsonWriter.name("ServiceRole");
            jsonWriter.value(serviceRole);
        }
        if (command.getNotificationConfig() != null) {
            NotificationConfig notificationConfig = command.getNotificationConfig();
            jsonWriter.name("NotificationConfig");
            NotificationConfigJsonMarshaller.getInstance().marshall(notificationConfig, jsonWriter);
        }
        if (command.getCloudWatchOutputConfig() != null) {
            CloudWatchOutputConfig cloudWatchOutputConfig = command.getCloudWatchOutputConfig();
            jsonWriter.name("CloudWatchOutputConfig");
            CloudWatchOutputConfigJsonMarshaller.getInstance().marshall(cloudWatchOutputConfig, jsonWriter);
        }
        if (command.getTimeoutSeconds() != null) {
            Integer timeoutSeconds = command.getTimeoutSeconds();
            jsonWriter.name("TimeoutSeconds");
            jsonWriter.value(timeoutSeconds);
        }
        jsonWriter.endObject();
    }

    private static CommandJsonMarshaller instance;
    public static CommandJsonMarshaller getInstance() {
        if (instance == null) instance = new CommandJsonMarshaller();
        return instance;
    }
}
