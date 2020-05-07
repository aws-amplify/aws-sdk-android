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

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MaintenanceWindowIdentity
 */
class MaintenanceWindowIdentityJsonMarshaller {

    public void marshall(MaintenanceWindowIdentity maintenanceWindowIdentity,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (maintenanceWindowIdentity.getWindowId() != null) {
            String windowId = maintenanceWindowIdentity.getWindowId();
            jsonWriter.name("WindowId");
            jsonWriter.value(windowId);
        }
        if (maintenanceWindowIdentity.getName() != null) {
            String name = maintenanceWindowIdentity.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (maintenanceWindowIdentity.getDescription() != null) {
            String description = maintenanceWindowIdentity.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (maintenanceWindowIdentity.getEnabled() != null) {
            Boolean enabled = maintenanceWindowIdentity.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (maintenanceWindowIdentity.getDuration() != null) {
            Integer duration = maintenanceWindowIdentity.getDuration();
            jsonWriter.name("Duration");
            jsonWriter.value(duration);
        }
        if (maintenanceWindowIdentity.getCutoff() != null) {
            Integer cutoff = maintenanceWindowIdentity.getCutoff();
            jsonWriter.name("Cutoff");
            jsonWriter.value(cutoff);
        }
        if (maintenanceWindowIdentity.getSchedule() != null) {
            String schedule = maintenanceWindowIdentity.getSchedule();
            jsonWriter.name("Schedule");
            jsonWriter.value(schedule);
        }
        if (maintenanceWindowIdentity.getScheduleTimezone() != null) {
            String scheduleTimezone = maintenanceWindowIdentity.getScheduleTimezone();
            jsonWriter.name("ScheduleTimezone");
            jsonWriter.value(scheduleTimezone);
        }
        if (maintenanceWindowIdentity.getEndDate() != null) {
            String endDate = maintenanceWindowIdentity.getEndDate();
            jsonWriter.name("EndDate");
            jsonWriter.value(endDate);
        }
        if (maintenanceWindowIdentity.getStartDate() != null) {
            String startDate = maintenanceWindowIdentity.getStartDate();
            jsonWriter.name("StartDate");
            jsonWriter.value(startDate);
        }
        if (maintenanceWindowIdentity.getNextExecutionTime() != null) {
            String nextExecutionTime = maintenanceWindowIdentity.getNextExecutionTime();
            jsonWriter.name("NextExecutionTime");
            jsonWriter.value(nextExecutionTime);
        }
        jsonWriter.endObject();
    }

    private static MaintenanceWindowIdentityJsonMarshaller instance;

    public static MaintenanceWindowIdentityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MaintenanceWindowIdentityJsonMarshaller();
        return instance;
    }
}
