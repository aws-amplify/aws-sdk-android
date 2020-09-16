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
 * JSON marshaller for POJO MaintenanceWindowExecutionTaskIdentity
 */
class MaintenanceWindowExecutionTaskIdentityJsonMarshaller {

    public void marshall(MaintenanceWindowExecutionTaskIdentity maintenanceWindowExecutionTaskIdentity, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (maintenanceWindowExecutionTaskIdentity.getWindowExecutionId() != null) {
            String windowExecutionId = maintenanceWindowExecutionTaskIdentity.getWindowExecutionId();
            jsonWriter.name("WindowExecutionId");
            jsonWriter.value(windowExecutionId);
        }
        if (maintenanceWindowExecutionTaskIdentity.getTaskExecutionId() != null) {
            String taskExecutionId = maintenanceWindowExecutionTaskIdentity.getTaskExecutionId();
            jsonWriter.name("TaskExecutionId");
            jsonWriter.value(taskExecutionId);
        }
        if (maintenanceWindowExecutionTaskIdentity.getStatus() != null) {
            String status = maintenanceWindowExecutionTaskIdentity.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (maintenanceWindowExecutionTaskIdentity.getStatusDetails() != null) {
            String statusDetails = maintenanceWindowExecutionTaskIdentity.getStatusDetails();
            jsonWriter.name("StatusDetails");
            jsonWriter.value(statusDetails);
        }
        if (maintenanceWindowExecutionTaskIdentity.getStartTime() != null) {
            java.util.Date startTime = maintenanceWindowExecutionTaskIdentity.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (maintenanceWindowExecutionTaskIdentity.getEndTime() != null) {
            java.util.Date endTime = maintenanceWindowExecutionTaskIdentity.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (maintenanceWindowExecutionTaskIdentity.getTaskArn() != null) {
            String taskArn = maintenanceWindowExecutionTaskIdentity.getTaskArn();
            jsonWriter.name("TaskArn");
            jsonWriter.value(taskArn);
        }
        if (maintenanceWindowExecutionTaskIdentity.getTaskType() != null) {
            String taskType = maintenanceWindowExecutionTaskIdentity.getTaskType();
            jsonWriter.name("TaskType");
            jsonWriter.value(taskType);
        }
        jsonWriter.endObject();
    }

    private static MaintenanceWindowExecutionTaskIdentityJsonMarshaller instance;
    public static MaintenanceWindowExecutionTaskIdentityJsonMarshaller getInstance() {
        if (instance == null) instance = new MaintenanceWindowExecutionTaskIdentityJsonMarshaller();
        return instance;
    }
}
