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
 * JSON unmarshaller for POJO MaintenanceWindowExecutionTaskIdentity
 */
class MaintenanceWindowExecutionTaskIdentityJsonUnmarshaller implements
        Unmarshaller<MaintenanceWindowExecutionTaskIdentity, JsonUnmarshallerContext> {

    public MaintenanceWindowExecutionTaskIdentity unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MaintenanceWindowExecutionTaskIdentity maintenanceWindowExecutionTaskIdentity = new MaintenanceWindowExecutionTaskIdentity();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("WindowExecutionId")) {
                maintenanceWindowExecutionTaskIdentity.setWindowExecutionId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TaskExecutionId")) {
                maintenanceWindowExecutionTaskIdentity.setTaskExecutionId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                maintenanceWindowExecutionTaskIdentity.setStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusDetails")) {
                maintenanceWindowExecutionTaskIdentity.setStatusDetails(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartTime")) {
                maintenanceWindowExecutionTaskIdentity.setStartTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                maintenanceWindowExecutionTaskIdentity.setEndTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TaskArn")) {
                maintenanceWindowExecutionTaskIdentity.setTaskArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TaskType")) {
                maintenanceWindowExecutionTaskIdentity.setTaskType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return maintenanceWindowExecutionTaskIdentity;
    }

    private static MaintenanceWindowExecutionTaskIdentityJsonUnmarshaller instance;

    public static MaintenanceWindowExecutionTaskIdentityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MaintenanceWindowExecutionTaskIdentityJsonUnmarshaller();
        return instance;
    }
}
