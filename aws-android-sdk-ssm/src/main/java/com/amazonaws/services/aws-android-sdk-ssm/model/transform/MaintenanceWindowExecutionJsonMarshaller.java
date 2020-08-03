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
 * JSON marshaller for POJO MaintenanceWindowExecution
 */
class MaintenanceWindowExecutionJsonMarshaller {

    public void marshall(MaintenanceWindowExecution maintenanceWindowExecution, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (maintenanceWindowExecution.getWindowId() != null) {
            String windowId = maintenanceWindowExecution.getWindowId();
            jsonWriter.name("WindowId");
            jsonWriter.value(windowId);
        }
        if (maintenanceWindowExecution.getWindowExecutionId() != null) {
            String windowExecutionId = maintenanceWindowExecution.getWindowExecutionId();
            jsonWriter.name("WindowExecutionId");
            jsonWriter.value(windowExecutionId);
        }
        if (maintenanceWindowExecution.getStatus() != null) {
            String status = maintenanceWindowExecution.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (maintenanceWindowExecution.getStatusDetails() != null) {
            String statusDetails = maintenanceWindowExecution.getStatusDetails();
            jsonWriter.name("StatusDetails");
            jsonWriter.value(statusDetails);
        }
        if (maintenanceWindowExecution.getStartTime() != null) {
            java.util.Date startTime = maintenanceWindowExecution.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (maintenanceWindowExecution.getEndTime() != null) {
            java.util.Date endTime = maintenanceWindowExecution.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        jsonWriter.endObject();
    }

    private static MaintenanceWindowExecutionJsonMarshaller instance;
    public static MaintenanceWindowExecutionJsonMarshaller getInstance() {
        if (instance == null) instance = new MaintenanceWindowExecutionJsonMarshaller();
        return instance;
    }
}
