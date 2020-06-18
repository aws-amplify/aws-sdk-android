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
 * JSON unmarshaller for response GetMaintenanceWindowResult
 */
public class GetMaintenanceWindowResultJsonUnmarshaller implements
        Unmarshaller<GetMaintenanceWindowResult, JsonUnmarshallerContext> {

    public GetMaintenanceWindowResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMaintenanceWindowResult getMaintenanceWindowResult = new GetMaintenanceWindowResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("WindowId")) {
                getMaintenanceWindowResult.setWindowId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                getMaintenanceWindowResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                getMaintenanceWindowResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartDate")) {
                getMaintenanceWindowResult.setStartDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndDate")) {
                getMaintenanceWindowResult.setEndDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Schedule")) {
                getMaintenanceWindowResult.setSchedule(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScheduleTimezone")) {
                getMaintenanceWindowResult.setScheduleTimezone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScheduleOffset")) {
                getMaintenanceWindowResult.setScheduleOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NextExecutionTime")) {
                getMaintenanceWindowResult.setNextExecutionTime(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Duration")) {
                getMaintenanceWindowResult.setDuration(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Cutoff")) {
                getMaintenanceWindowResult.setCutoff(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AllowUnassociatedTargets")) {
                getMaintenanceWindowResult.setAllowUnassociatedTargets(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Enabled")) {
                getMaintenanceWindowResult.setEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedDate")) {
                getMaintenanceWindowResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ModifiedDate")) {
                getMaintenanceWindowResult.setModifiedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getMaintenanceWindowResult;
    }

    private static GetMaintenanceWindowResultJsonUnmarshaller instance;

    public static GetMaintenanceWindowResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMaintenanceWindowResultJsonUnmarshaller();
        return instance;
    }
}
