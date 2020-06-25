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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TaskRun
 */
class TaskRunJsonUnmarshaller implements Unmarshaller<TaskRun, JsonUnmarshallerContext> {

    public TaskRun unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TaskRun taskRun = new TaskRun();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TransformId")) {
                taskRun.setTransformId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TaskRunId")) {
                taskRun.setTaskRunId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                taskRun.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LogGroupName")) {
                taskRun.setLogGroupName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Properties")) {
                taskRun.setProperties(TaskRunPropertiesJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ErrorString")) {
                taskRun.setErrorString(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartedOn")) {
                taskRun.setStartedOn(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedOn")) {
                taskRun.setLastModifiedOn(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletedOn")) {
                taskRun.setCompletedOn(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExecutionTime")) {
                taskRun.setExecutionTime(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return taskRun;
    }

    private static TaskRunJsonUnmarshaller instance;

    public static TaskRunJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TaskRunJsonUnmarshaller();
        return instance;
    }
}
