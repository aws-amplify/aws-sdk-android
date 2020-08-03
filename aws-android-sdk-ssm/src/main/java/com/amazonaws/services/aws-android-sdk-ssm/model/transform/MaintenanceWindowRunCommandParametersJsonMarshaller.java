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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MaintenanceWindowRunCommandParameters
 */
class MaintenanceWindowRunCommandParametersJsonMarshaller {

    public void marshall(MaintenanceWindowRunCommandParameters maintenanceWindowRunCommandParameters, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (maintenanceWindowRunCommandParameters.getComment() != null) {
            String comment = maintenanceWindowRunCommandParameters.getComment();
            jsonWriter.name("Comment");
            jsonWriter.value(comment);
        }
        if (maintenanceWindowRunCommandParameters.getCloudWatchOutputConfig() != null) {
            CloudWatchOutputConfig cloudWatchOutputConfig = maintenanceWindowRunCommandParameters.getCloudWatchOutputConfig();
            jsonWriter.name("CloudWatchOutputConfig");
            CloudWatchOutputConfigJsonMarshaller.getInstance().marshall(cloudWatchOutputConfig, jsonWriter);
        }
        if (maintenanceWindowRunCommandParameters.getDocumentHash() != null) {
            String documentHash = maintenanceWindowRunCommandParameters.getDocumentHash();
            jsonWriter.name("DocumentHash");
            jsonWriter.value(documentHash);
        }
        if (maintenanceWindowRunCommandParameters.getDocumentHashType() != null) {
            String documentHashType = maintenanceWindowRunCommandParameters.getDocumentHashType();
            jsonWriter.name("DocumentHashType");
            jsonWriter.value(documentHashType);
        }
        if (maintenanceWindowRunCommandParameters.getDocumentVersion() != null) {
            String documentVersion = maintenanceWindowRunCommandParameters.getDocumentVersion();
            jsonWriter.name("DocumentVersion");
            jsonWriter.value(documentVersion);
        }
        if (maintenanceWindowRunCommandParameters.getNotificationConfig() != null) {
            NotificationConfig notificationConfig = maintenanceWindowRunCommandParameters.getNotificationConfig();
            jsonWriter.name("NotificationConfig");
            NotificationConfigJsonMarshaller.getInstance().marshall(notificationConfig, jsonWriter);
        }
        if (maintenanceWindowRunCommandParameters.getOutputS3BucketName() != null) {
            String outputS3BucketName = maintenanceWindowRunCommandParameters.getOutputS3BucketName();
            jsonWriter.name("OutputS3BucketName");
            jsonWriter.value(outputS3BucketName);
        }
        if (maintenanceWindowRunCommandParameters.getOutputS3KeyPrefix() != null) {
            String outputS3KeyPrefix = maintenanceWindowRunCommandParameters.getOutputS3KeyPrefix();
            jsonWriter.name("OutputS3KeyPrefix");
            jsonWriter.value(outputS3KeyPrefix);
        }
        if (maintenanceWindowRunCommandParameters.getParameters() != null) {
            java.util.Map<String, java.util.List<String>> parameters = maintenanceWindowRunCommandParameters.getParameters();
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
        if (maintenanceWindowRunCommandParameters.getServiceRoleArn() != null) {
            String serviceRoleArn = maintenanceWindowRunCommandParameters.getServiceRoleArn();
            jsonWriter.name("ServiceRoleArn");
            jsonWriter.value(serviceRoleArn);
        }
        if (maintenanceWindowRunCommandParameters.getTimeoutSeconds() != null) {
            Integer timeoutSeconds = maintenanceWindowRunCommandParameters.getTimeoutSeconds();
            jsonWriter.name("TimeoutSeconds");
            jsonWriter.value(timeoutSeconds);
        }
        jsonWriter.endObject();
    }

    private static MaintenanceWindowRunCommandParametersJsonMarshaller instance;
    public static MaintenanceWindowRunCommandParametersJsonMarshaller getInstance() {
        if (instance == null) instance = new MaintenanceWindowRunCommandParametersJsonMarshaller();
        return instance;
    }
}
