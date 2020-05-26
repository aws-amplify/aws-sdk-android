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
 * JSON unmarshaller for POJO MaintenanceWindowExecutionTaskInvocationIdentity
 */
class MaintenanceWindowExecutionTaskInvocationIdentityJsonUnmarshaller implements
        Unmarshaller<MaintenanceWindowExecutionTaskInvocationIdentity, JsonUnmarshallerContext> {

    public MaintenanceWindowExecutionTaskInvocationIdentity unmarshall(
            JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MaintenanceWindowExecutionTaskInvocationIdentity maintenanceWindowExecutionTaskInvocationIdentity = new MaintenanceWindowExecutionTaskInvocationIdentity();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("WindowExecutionId")) {
                maintenanceWindowExecutionTaskInvocationIdentity
                        .setWindowExecutionId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("TaskExecutionId")) {
                maintenanceWindowExecutionTaskInvocationIdentity
                        .setTaskExecutionId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("InvocationId")) {
                maintenanceWindowExecutionTaskInvocationIdentity
                        .setInvocationId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("ExecutionId")) {
                maintenanceWindowExecutionTaskInvocationIdentity
                        .setExecutionId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("TaskType")) {
                maintenanceWindowExecutionTaskInvocationIdentity.setTaskType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Parameters")) {
                maintenanceWindowExecutionTaskInvocationIdentity
                        .setParameters(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Status")) {
                maintenanceWindowExecutionTaskInvocationIdentity.setStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusDetails")) {
                maintenanceWindowExecutionTaskInvocationIdentity
                        .setStatusDetails(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("StartTime")) {
                maintenanceWindowExecutionTaskInvocationIdentity.setStartTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                maintenanceWindowExecutionTaskInvocationIdentity.setEndTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OwnerInformation")) {
                maintenanceWindowExecutionTaskInvocationIdentity
                        .setOwnerInformation(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("WindowTargetId")) {
                maintenanceWindowExecutionTaskInvocationIdentity
                        .setWindowTargetId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return maintenanceWindowExecutionTaskInvocationIdentity;
    }

    private static MaintenanceWindowExecutionTaskInvocationIdentityJsonUnmarshaller instance;

    public static MaintenanceWindowExecutionTaskInvocationIdentityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MaintenanceWindowExecutionTaskInvocationIdentityJsonUnmarshaller();
        return instance;
    }
}
