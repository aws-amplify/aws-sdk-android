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
 * JSON unmarshaller for response UpdateMaintenanceWindowTaskResult
 */
public class UpdateMaintenanceWindowTaskResultJsonUnmarshaller implements
        Unmarshaller<UpdateMaintenanceWindowTaskResult, JsonUnmarshallerContext> {

    public UpdateMaintenanceWindowTaskResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        UpdateMaintenanceWindowTaskResult updateMaintenanceWindowTaskResult = new UpdateMaintenanceWindowTaskResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("WindowId")) {
                updateMaintenanceWindowTaskResult.setWindowId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WindowTaskId")) {
                updateMaintenanceWindowTaskResult.setWindowTaskId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Targets")) {
                updateMaintenanceWindowTaskResult.setTargets(new ListUnmarshaller<Target>(
                        TargetJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TaskArn")) {
                updateMaintenanceWindowTaskResult.setTaskArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServiceRoleArn")) {
                updateMaintenanceWindowTaskResult.setServiceRoleArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TaskParameters")) {
                updateMaintenanceWindowTaskResult
                        .setTaskParameters(new MapUnmarshaller<MaintenanceWindowTaskParameterValueExpression>(
                                MaintenanceWindowTaskParameterValueExpressionJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TaskInvocationParameters")) {
                updateMaintenanceWindowTaskResult
                        .setTaskInvocationParameters(MaintenanceWindowTaskInvocationParametersJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Priority")) {
                updateMaintenanceWindowTaskResult.setPriority(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxConcurrency")) {
                updateMaintenanceWindowTaskResult.setMaxConcurrency(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxErrors")) {
                updateMaintenanceWindowTaskResult.setMaxErrors(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LoggingInfo")) {
                updateMaintenanceWindowTaskResult.setLoggingInfo(LoggingInfoJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                updateMaintenanceWindowTaskResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                updateMaintenanceWindowTaskResult.setDescription(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateMaintenanceWindowTaskResult;
    }

    private static UpdateMaintenanceWindowTaskResultJsonUnmarshaller instance;

    public static UpdateMaintenanceWindowTaskResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateMaintenanceWindowTaskResultJsonUnmarshaller();
        return instance;
    }
}
