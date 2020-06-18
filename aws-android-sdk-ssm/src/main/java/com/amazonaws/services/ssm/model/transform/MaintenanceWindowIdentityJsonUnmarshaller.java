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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MaintenanceWindowIdentity
 */
class MaintenanceWindowIdentityJsonUnmarshaller implements
        Unmarshaller<MaintenanceWindowIdentity, JsonUnmarshallerContext> {

    public MaintenanceWindowIdentity unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MaintenanceWindowIdentity maintenanceWindowIdentity = new MaintenanceWindowIdentity();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("WindowId")) {
                maintenanceWindowIdentity.setWindowId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                maintenanceWindowIdentity.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                maintenanceWindowIdentity.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Enabled")) {
                maintenanceWindowIdentity.setEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Duration")) {
                maintenanceWindowIdentity.setDuration(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Cutoff")) {
                maintenanceWindowIdentity.setCutoff(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Schedule")) {
                maintenanceWindowIdentity.setSchedule(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScheduleTimezone")) {
                maintenanceWindowIdentity.setScheduleTimezone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScheduleOffset")) {
                maintenanceWindowIdentity.setScheduleOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndDate")) {
                maintenanceWindowIdentity.setEndDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartDate")) {
                maintenanceWindowIdentity.setStartDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NextExecutionTime")) {
                maintenanceWindowIdentity.setNextExecutionTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return maintenanceWindowIdentity;
    }

    private static MaintenanceWindowIdentityJsonUnmarshaller instance;

    public static MaintenanceWindowIdentityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MaintenanceWindowIdentityJsonUnmarshaller();
        return instance;
    }
}
