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
 * JSON unmarshaller for POJO MaintenanceWindowTask
 */
class MaintenanceWindowTaskJsonUnmarshaller implements Unmarshaller<MaintenanceWindowTask, JsonUnmarshallerContext> {

    public MaintenanceWindowTask unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MaintenanceWindowTask maintenanceWindowTask = new MaintenanceWindowTask();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("WindowId")) {
                maintenanceWindowTask.setWindowId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("WindowTaskId")) {
                maintenanceWindowTask.setWindowTaskId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("TaskArn")) {
                maintenanceWindowTask.setTaskArn(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Type")) {
                maintenanceWindowTask.setType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Targets")) {
                maintenanceWindowTask.setTargets(new ListUnmarshaller<Target>(TargetJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("TaskParameters")) {
                maintenanceWindowTask.setTaskParameters(new MapUnmarshaller<MaintenanceWindowTaskParameterValueExpression>(MaintenanceWindowTaskParameterValueExpressionJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("Priority")) {
                maintenanceWindowTask.setPriority(IntegerJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LoggingInfo")) {
                maintenanceWindowTask.setLoggingInfo(LoggingInfoJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ServiceRoleArn")) {
                maintenanceWindowTask.setServiceRoleArn(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("MaxConcurrency")) {
                maintenanceWindowTask.setMaxConcurrency(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("MaxErrors")) {
                maintenanceWindowTask.setMaxErrors(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Name")) {
                maintenanceWindowTask.setName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Description")) {
                maintenanceWindowTask.setDescription(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return maintenanceWindowTask;
    }

    private static MaintenanceWindowTaskJsonUnmarshaller instance;
    public static MaintenanceWindowTaskJsonUnmarshaller getInstance() {
        if (instance == null) instance = new MaintenanceWindowTaskJsonUnmarshaller();
        return instance;
    }
}
