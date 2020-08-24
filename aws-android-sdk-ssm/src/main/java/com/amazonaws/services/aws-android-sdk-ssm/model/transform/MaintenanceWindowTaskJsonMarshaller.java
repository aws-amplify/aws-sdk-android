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
 * JSON marshaller for POJO MaintenanceWindowTask
 */
class MaintenanceWindowTaskJsonMarshaller {

    public void marshall(MaintenanceWindowTask maintenanceWindowTask, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (maintenanceWindowTask.getWindowId() != null) {
            String windowId = maintenanceWindowTask.getWindowId();
            jsonWriter.name("WindowId");
            jsonWriter.value(windowId);
        }
        if (maintenanceWindowTask.getWindowTaskId() != null) {
            String windowTaskId = maintenanceWindowTask.getWindowTaskId();
            jsonWriter.name("WindowTaskId");
            jsonWriter.value(windowTaskId);
        }
        if (maintenanceWindowTask.getTaskArn() != null) {
            String taskArn = maintenanceWindowTask.getTaskArn();
            jsonWriter.name("TaskArn");
            jsonWriter.value(taskArn);
        }
        if (maintenanceWindowTask.getType() != null) {
            String type = maintenanceWindowTask.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (maintenanceWindowTask.getTargets() != null) {
            java.util.List<Target> targets = maintenanceWindowTask.getTargets();
            jsonWriter.name("Targets");
            jsonWriter.beginArray();
            for (Target targetsItem : targets) {
                if (targetsItem != null) {
            TargetJsonMarshaller.getInstance().marshall(targetsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (maintenanceWindowTask.getTaskParameters() != null) {
            java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters = maintenanceWindowTask.getTaskParameters();
            jsonWriter.name("TaskParameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, MaintenanceWindowTaskParameterValueExpression> taskParametersEntry : taskParameters.entrySet()) {
                MaintenanceWindowTaskParameterValueExpression taskParametersValue = taskParametersEntry.getValue();
                if (taskParametersValue != null) {
                    jsonWriter.name(taskParametersEntry.getKey());
            MaintenanceWindowTaskParameterValueExpressionJsonMarshaller.getInstance().marshall(taskParametersValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (maintenanceWindowTask.getPriority() != null) {
            Integer priority = maintenanceWindowTask.getPriority();
            jsonWriter.name("Priority");
            jsonWriter.value(priority);
        }
        if (maintenanceWindowTask.getLoggingInfo() != null) {
            LoggingInfo loggingInfo = maintenanceWindowTask.getLoggingInfo();
            jsonWriter.name("LoggingInfo");
            LoggingInfoJsonMarshaller.getInstance().marshall(loggingInfo, jsonWriter);
        }
        if (maintenanceWindowTask.getServiceRoleArn() != null) {
            String serviceRoleArn = maintenanceWindowTask.getServiceRoleArn();
            jsonWriter.name("ServiceRoleArn");
            jsonWriter.value(serviceRoleArn);
        }
        if (maintenanceWindowTask.getMaxConcurrency() != null) {
            String maxConcurrency = maintenanceWindowTask.getMaxConcurrency();
            jsonWriter.name("MaxConcurrency");
            jsonWriter.value(maxConcurrency);
        }
        if (maintenanceWindowTask.getMaxErrors() != null) {
            String maxErrors = maintenanceWindowTask.getMaxErrors();
            jsonWriter.name("MaxErrors");
            jsonWriter.value(maxErrors);
        }
        if (maintenanceWindowTask.getName() != null) {
            String name = maintenanceWindowTask.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (maintenanceWindowTask.getDescription() != null) {
            String description = maintenanceWindowTask.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        jsonWriter.endObject();
    }

    private static MaintenanceWindowTaskJsonMarshaller instance;
    public static MaintenanceWindowTaskJsonMarshaller getInstance() {
        if (instance == null) instance = new MaintenanceWindowTaskJsonMarshaller();
        return instance;
    }
}
