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

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Job
 */
class JobJsonMarshaller {

    public void marshall(Job job, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (job.getName() != null) {
            String name = job.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (job.getDescription() != null) {
            String description = job.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (job.getLogUri() != null) {
            String logUri = job.getLogUri();
            jsonWriter.name("LogUri");
            jsonWriter.value(logUri);
        }
        if (job.getRole() != null) {
            String role = job.getRole();
            jsonWriter.name("Role");
            jsonWriter.value(role);
        }
        if (job.getCreatedOn() != null) {
            java.util.Date createdOn = job.getCreatedOn();
            jsonWriter.name("CreatedOn");
            jsonWriter.value(createdOn);
        }
        if (job.getLastModifiedOn() != null) {
            java.util.Date lastModifiedOn = job.getLastModifiedOn();
            jsonWriter.name("LastModifiedOn");
            jsonWriter.value(lastModifiedOn);
        }
        if (job.getExecutionProperty() != null) {
            ExecutionProperty executionProperty = job.getExecutionProperty();
            jsonWriter.name("ExecutionProperty");
            ExecutionPropertyJsonMarshaller.getInstance().marshall(executionProperty, jsonWriter);
        }
        if (job.getCommand() != null) {
            JobCommand command = job.getCommand();
            jsonWriter.name("Command");
            JobCommandJsonMarshaller.getInstance().marshall(command, jsonWriter);
        }
        if (job.getDefaultArguments() != null) {
            java.util.Map<String, String> defaultArguments = job.getDefaultArguments();
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
        if (job.getNonOverridableArguments() != null) {
            java.util.Map<String, String> nonOverridableArguments = job
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
        if (job.getConnections() != null) {
            ConnectionsList connections = job.getConnections();
            jsonWriter.name("Connections");
            ConnectionsListJsonMarshaller.getInstance().marshall(connections, jsonWriter);
        }
        if (job.getMaxRetries() != null) {
            Integer maxRetries = job.getMaxRetries();
            jsonWriter.name("MaxRetries");
            jsonWriter.value(maxRetries);
        }
        if (job.getAllocatedCapacity() != null) {
            Integer allocatedCapacity = job.getAllocatedCapacity();
            jsonWriter.name("AllocatedCapacity");
            jsonWriter.value(allocatedCapacity);
        }
        if (job.getTimeout() != null) {
            Integer timeout = job.getTimeout();
            jsonWriter.name("Timeout");
            jsonWriter.value(timeout);
        }
        if (job.getMaxCapacity() != null) {
            Double maxCapacity = job.getMaxCapacity();
            jsonWriter.name("MaxCapacity");
            jsonWriter.value(maxCapacity);
        }
        if (job.getWorkerType() != null) {
            String workerType = job.getWorkerType();
            jsonWriter.name("WorkerType");
            jsonWriter.value(workerType);
        }
        if (job.getNumberOfWorkers() != null) {
            Integer numberOfWorkers = job.getNumberOfWorkers();
            jsonWriter.name("NumberOfWorkers");
            jsonWriter.value(numberOfWorkers);
        }
        if (job.getSecurityConfiguration() != null) {
            String securityConfiguration = job.getSecurityConfiguration();
            jsonWriter.name("SecurityConfiguration");
            jsonWriter.value(securityConfiguration);
        }
        if (job.getNotificationProperty() != null) {
            NotificationProperty notificationProperty = job.getNotificationProperty();
            jsonWriter.name("NotificationProperty");
            NotificationPropertyJsonMarshaller.getInstance().marshall(notificationProperty,
                    jsonWriter);
        }
        if (job.getGlueVersion() != null) {
            String glueVersion = job.getGlueVersion();
            jsonWriter.name("GlueVersion");
            jsonWriter.value(glueVersion);
        }
        jsonWriter.endObject();
    }

    private static JobJsonMarshaller instance;

    public static JobJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobJsonMarshaller();
        return instance;
    }
}
