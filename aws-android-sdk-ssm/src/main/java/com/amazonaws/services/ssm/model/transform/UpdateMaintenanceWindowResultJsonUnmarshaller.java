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
 * JSON unmarshaller for response UpdateMaintenanceWindowResult
 */
public class UpdateMaintenanceWindowResultJsonUnmarshaller implements
        Unmarshaller<UpdateMaintenanceWindowResult, JsonUnmarshallerContext> {

    public UpdateMaintenanceWindowResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        UpdateMaintenanceWindowResult updateMaintenanceWindowResult = new UpdateMaintenanceWindowResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("WindowId")) {
                updateMaintenanceWindowResult.setWindowId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                updateMaintenanceWindowResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                updateMaintenanceWindowResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartDate")) {
                updateMaintenanceWindowResult.setStartDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndDate")) {
                updateMaintenanceWindowResult.setEndDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Schedule")) {
                updateMaintenanceWindowResult.setSchedule(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScheduleTimezone")) {
                updateMaintenanceWindowResult.setScheduleTimezone(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScheduleOffset")) {
                updateMaintenanceWindowResult.setScheduleOffset(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Duration")) {
                updateMaintenanceWindowResult.setDuration(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Cutoff")) {
                updateMaintenanceWindowResult.setCutoff(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AllowUnassociatedTargets")) {
                updateMaintenanceWindowResult.setAllowUnassociatedTargets(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Enabled")) {
                updateMaintenanceWindowResult.setEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateMaintenanceWindowResult;
    }

    private static UpdateMaintenanceWindowResultJsonUnmarshaller instance;

    public static UpdateMaintenanceWindowResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateMaintenanceWindowResultJsonUnmarshaller();
        return instance;
    }
}
