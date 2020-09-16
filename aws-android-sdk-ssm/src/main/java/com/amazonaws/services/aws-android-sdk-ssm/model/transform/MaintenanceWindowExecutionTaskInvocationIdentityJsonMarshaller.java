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
 * JSON marshaller for POJO MaintenanceWindowExecutionTaskInvocationIdentity
 */
class MaintenanceWindowExecutionTaskInvocationIdentityJsonMarshaller {

    public void marshall(MaintenanceWindowExecutionTaskInvocationIdentity maintenanceWindowExecutionTaskInvocationIdentity, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (maintenanceWindowExecutionTaskInvocationIdentity.getWindowExecutionId() != null) {
            String windowExecutionId = maintenanceWindowExecutionTaskInvocationIdentity.getWindowExecutionId();
            jsonWriter.name("WindowExecutionId");
            jsonWriter.value(windowExecutionId);
        }
        if (maintenanceWindowExecutionTaskInvocationIdentity.getTaskExecutionId() != null) {
            String taskExecutionId = maintenanceWindowExecutionTaskInvocationIdentity.getTaskExecutionId();
            jsonWriter.name("TaskExecutionId");
            jsonWriter.value(taskExecutionId);
        }
        if (maintenanceWindowExecutionTaskInvocationIdentity.getInvocationId() != null) {
            String invocationId = maintenanceWindowExecutionTaskInvocationIdentity.getInvocationId();
            jsonWriter.name("InvocationId");
            jsonWriter.value(invocationId);
        }
        if (maintenanceWindowExecutionTaskInvocationIdentity.getExecutionId() != null) {
            String executionId = maintenanceWindowExecutionTaskInvocationIdentity.getExecutionId();
            jsonWriter.name("ExecutionId");
            jsonWriter.value(executionId);
        }
        if (maintenanceWindowExecutionTaskInvocationIdentity.getTaskType() != null) {
            String taskType = maintenanceWindowExecutionTaskInvocationIdentity.getTaskType();
            jsonWriter.name("TaskType");
            jsonWriter.value(taskType);
        }
        if (maintenanceWindowExecutionTaskInvocationIdentity.getParameters() != null) {
            String parameters = maintenanceWindowExecutionTaskInvocationIdentity.getParameters();
            jsonWriter.name("Parameters");
            jsonWriter.value(parameters);
        }
        if (maintenanceWindowExecutionTaskInvocationIdentity.getStatus() != null) {
            String status = maintenanceWindowExecutionTaskInvocationIdentity.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (maintenanceWindowExecutionTaskInvocationIdentity.getStatusDetails() != null) {
            String statusDetails = maintenanceWindowExecutionTaskInvocationIdentity.getStatusDetails();
            jsonWriter.name("StatusDetails");
            jsonWriter.value(statusDetails);
        }
        if (maintenanceWindowExecutionTaskInvocationIdentity.getStartTime() != null) {
            java.util.Date startTime = maintenanceWindowExecutionTaskInvocationIdentity.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (maintenanceWindowExecutionTaskInvocationIdentity.getEndTime() != null) {
            java.util.Date endTime = maintenanceWindowExecutionTaskInvocationIdentity.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (maintenanceWindowExecutionTaskInvocationIdentity.getOwnerInformation() != null) {
            String ownerInformation = maintenanceWindowExecutionTaskInvocationIdentity.getOwnerInformation();
            jsonWriter.name("OwnerInformation");
            jsonWriter.value(ownerInformation);
        }
        if (maintenanceWindowExecutionTaskInvocationIdentity.getWindowTargetId() != null) {
            String windowTargetId = maintenanceWindowExecutionTaskInvocationIdentity.getWindowTargetId();
            jsonWriter.name("WindowTargetId");
            jsonWriter.value(windowTargetId);
        }
        jsonWriter.endObject();
    }

    private static MaintenanceWindowExecutionTaskInvocationIdentityJsonMarshaller instance;
    public static MaintenanceWindowExecutionTaskInvocationIdentityJsonMarshaller getInstance() {
        if (instance == null) instance = new MaintenanceWindowExecutionTaskInvocationIdentityJsonMarshaller();
        return instance;
    }
}
