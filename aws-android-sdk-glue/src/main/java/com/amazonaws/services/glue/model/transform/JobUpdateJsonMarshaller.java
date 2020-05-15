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

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JobUpdate
 */
class JobUpdateJsonMarshaller {

    public void marshall(JobUpdate jobUpdate, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (jobUpdate.getDescription() != null) {
            String description = jobUpdate.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (jobUpdate.getLogUri() != null) {
            String logUri = jobUpdate.getLogUri();
            jsonWriter.name("LogUri");
            jsonWriter.value(logUri);
        }
        if (jobUpdate.getRole() != null) {
            String role = jobUpdate.getRole();
            jsonWriter.name("Role");
            jsonWriter.value(role);
        }
        if (jobUpdate.getExecutionProperty() != null) {
            ExecutionProperty executionProperty = jobUpdate.getExecutionProperty();
            jsonWriter.name("ExecutionProperty");
            ExecutionPropertyJsonMarshaller.getInstance().marshall(executionProperty, jsonWriter);
        }
        if (jobUpdate.getCommand() != null) {
            JobCommand command = jobUpdate.getCommand();
            jsonWriter.name("Command");
            JobCommandJsonMarshaller.getInstance().marshall(command, jsonWriter);
        }
        if (jobUpdate.getDefaultArguments() != null) {
            java.util.Map<String, String> defaultArguments = jobUpdate.getDefaultArguments();
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
        if (jobUpdate.getNonOverridableArguments() != null) {
            java.util.Map<String, String> nonOverridableArguments = jobUpdate
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
        if (jobUpdate.getConnections() != null) {
            ConnectionsList connections = jobUpdate.getConnections();
            jsonWriter.name("Connections");
            ConnectionsListJsonMarshaller.getInstance().marshall(connections, jsonWriter);
        }
        if (jobUpdate.getMaxRetries() != null) {
            Integer maxRetries = jobUpdate.getMaxRetries();
            jsonWriter.name("MaxRetries");
            jsonWriter.value(maxRetries);
        }
        if (jobUpdate.getAllocatedCapacity() != null) {
            Integer allocatedCapacity = jobUpdate.getAllocatedCapacity();
            jsonWriter.name("AllocatedCapacity");
            jsonWriter.value(allocatedCapacity);
        }
        if (jobUpdate.getTimeout() != null) {
            Integer timeout = jobUpdate.getTimeout();
            jsonWriter.name("Timeout");
            jsonWriter.value(timeout);
        }
        if (jobUpdate.getMaxCapacity() != null) {
            Double maxCapacity = jobUpdate.getMaxCapacity();
            jsonWriter.name("MaxCapacity");
            jsonWriter.value(maxCapacity);
        }
        if (jobUpdate.getWorkerType() != null) {
            String workerType = jobUpdate.getWorkerType();
            jsonWriter.name("WorkerType");
            jsonWriter.value(workerType);
        }
        if (jobUpdate.getNumberOfWorkers() != null) {
            Integer numberOfWorkers = jobUpdate.getNumberOfWorkers();
            jsonWriter.name("NumberOfWorkers");
            jsonWriter.value(numberOfWorkers);
        }
        if (jobUpdate.getSecurityConfiguration() != null) {
            String securityConfiguration = jobUpdate.getSecurityConfiguration();
            jsonWriter.name("SecurityConfiguration");
            jsonWriter.value(securityConfiguration);
        }
        if (jobUpdate.getNotificationProperty() != null) {
            NotificationProperty notificationProperty = jobUpdate.getNotificationProperty();
            jsonWriter.name("NotificationProperty");
            NotificationPropertyJsonMarshaller.getInstance().marshall(notificationProperty,
                    jsonWriter);
        }
        if (jobUpdate.getGlueVersion() != null) {
            String glueVersion = jobUpdate.getGlueVersion();
            jsonWriter.name("GlueVersion");
            jsonWriter.value(glueVersion);
        }
        jsonWriter.endObject();
    }

    private static JobUpdateJsonMarshaller instance;

    public static JobUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobUpdateJsonMarshaller();
        return instance;
    }
}
