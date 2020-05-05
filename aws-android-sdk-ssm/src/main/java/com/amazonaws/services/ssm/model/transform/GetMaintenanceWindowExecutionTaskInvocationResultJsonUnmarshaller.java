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
 * JSON unmarshaller for response
 * GetMaintenanceWindowExecutionTaskInvocationResult
 */
public class GetMaintenanceWindowExecutionTaskInvocationResultJsonUnmarshaller implements
        Unmarshaller<GetMaintenanceWindowExecutionTaskInvocationResult, JsonUnmarshallerContext> {

    public GetMaintenanceWindowExecutionTaskInvocationResult unmarshall(
            JsonUnmarshallerContext context) throws Exception {
        GetMaintenanceWindowExecutionTaskInvocationResult getMaintenanceWindowExecutionTaskInvocationResult = new GetMaintenanceWindowExecutionTaskInvocationResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("WindowExecutionId")) {
                getMaintenanceWindowExecutionTaskInvocationResult
                        .setWindowExecutionId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("TaskExecutionId")) {
                getMaintenanceWindowExecutionTaskInvocationResult
                        .setTaskExecutionId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("InvocationId")) {
                getMaintenanceWindowExecutionTaskInvocationResult
                        .setInvocationId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("ExecutionId")) {
                getMaintenanceWindowExecutionTaskInvocationResult
                        .setExecutionId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("TaskType")) {
                getMaintenanceWindowExecutionTaskInvocationResult
                        .setTaskType(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Parameters")) {
                getMaintenanceWindowExecutionTaskInvocationResult
                        .setParameters(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Status")) {
                getMaintenanceWindowExecutionTaskInvocationResult.setStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusDetails")) {
                getMaintenanceWindowExecutionTaskInvocationResult
                        .setStatusDetails(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("StartTime")) {
                getMaintenanceWindowExecutionTaskInvocationResult.setStartTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                getMaintenanceWindowExecutionTaskInvocationResult.setEndTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OwnerInformation")) {
                getMaintenanceWindowExecutionTaskInvocationResult
                        .setOwnerInformation(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("WindowTargetId")) {
                getMaintenanceWindowExecutionTaskInvocationResult
                        .setWindowTargetId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getMaintenanceWindowExecutionTaskInvocationResult;
    }

    private static GetMaintenanceWindowExecutionTaskInvocationResultJsonUnmarshaller instance;

    public static GetMaintenanceWindowExecutionTaskInvocationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMaintenanceWindowExecutionTaskInvocationResultJsonUnmarshaller();
        return instance;
    }
}
