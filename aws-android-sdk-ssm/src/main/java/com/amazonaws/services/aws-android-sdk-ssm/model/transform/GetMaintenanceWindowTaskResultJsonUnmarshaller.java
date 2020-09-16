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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for response GetMaintenanceWindowTaskResult
 */
public class GetMaintenanceWindowTaskResultJsonUnmarshaller implements Unmarshaller<GetMaintenanceWindowTaskResult, JsonUnmarshallerContext> {

    public GetMaintenanceWindowTaskResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMaintenanceWindowTaskResult getMaintenanceWindowTaskResult = new GetMaintenanceWindowTaskResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("WindowId")) {
                getMaintenanceWindowTaskResult.setWindowId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("WindowTaskId")) {
                getMaintenanceWindowTaskResult.setWindowTaskId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Targets")) {
                getMaintenanceWindowTaskResult.setTargets(new ListUnmarshaller<Target>(TargetJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("TaskArn")) {
                getMaintenanceWindowTaskResult.setTaskArn(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ServiceRoleArn")) {
                getMaintenanceWindowTaskResult.setServiceRoleArn(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("TaskType")) {
                getMaintenanceWindowTaskResult.setTaskType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("TaskParameters")) {
                getMaintenanceWindowTaskResult.setTaskParameters(new MapUnmarshaller<MaintenanceWindowTaskParameterValueExpression>(MaintenanceWindowTaskParameterValueExpressionJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("TaskInvocationParameters")) {
                getMaintenanceWindowTaskResult.setTaskInvocationParameters(MaintenanceWindowTaskInvocationParametersJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Priority")) {
                getMaintenanceWindowTaskResult.setPriority(IntegerJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("MaxConcurrency")) {
                getMaintenanceWindowTaskResult.setMaxConcurrency(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("MaxErrors")) {
                getMaintenanceWindowTaskResult.setMaxErrors(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LoggingInfo")) {
                getMaintenanceWindowTaskResult.setLoggingInfo(LoggingInfoJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Name")) {
                getMaintenanceWindowTaskResult.setName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Description")) {
                getMaintenanceWindowTaskResult.setDescription(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getMaintenanceWindowTaskResult;
    }

    private static GetMaintenanceWindowTaskResultJsonUnmarshaller instance;
    public static GetMaintenanceWindowTaskResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new GetMaintenanceWindowTaskResultJsonUnmarshaller();
        return instance;
    }
}
