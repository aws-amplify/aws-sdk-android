/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TaskStatistics
 */
class TaskStatisticsJsonUnmarshaller implements
        Unmarshaller<TaskStatistics, JsonUnmarshallerContext> {

    public TaskStatistics unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TaskStatistics taskStatistics = new TaskStatistics();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("totalChecks")) {
                taskStatistics.setTotalChecks(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("inProgressChecks")) {
                taskStatistics.setInProgressChecks(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("waitingForDataCollectionChecks")) {
                taskStatistics.setWaitingForDataCollectionChecks(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("compliantChecks")) {
                taskStatistics.setCompliantChecks(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("nonCompliantChecks")) {
                taskStatistics.setNonCompliantChecks(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("failedChecks")) {
                taskStatistics.setFailedChecks(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("canceledChecks")) {
                taskStatistics.setCanceledChecks(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return taskStatistics;
    }

    private static TaskStatisticsJsonUnmarshaller instance;

    public static TaskStatisticsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TaskStatisticsJsonUnmarshaller();
        return instance;
    }
}
