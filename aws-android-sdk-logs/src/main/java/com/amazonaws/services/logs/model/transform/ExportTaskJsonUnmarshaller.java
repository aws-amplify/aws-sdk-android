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

package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ExportTask
 */
class ExportTaskJsonUnmarshaller implements Unmarshaller<ExportTask, JsonUnmarshallerContext> {

    public ExportTask unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ExportTask exportTask = new ExportTask();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("taskId")) {
                exportTask.setTaskId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("taskName")) {
                exportTask.setTaskName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("logGroupName")) {
                exportTask.setLogGroupName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("from")) {
                exportTask.setFrom(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("to")) {
                exportTask.setTo(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("destination")) {
                exportTask.setDestination(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("destinationPrefix")) {
                exportTask.setDestinationPrefix(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                exportTask.setStatus(ExportTaskStatusJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("executionInfo")) {
                exportTask.setExecutionInfo(ExportTaskExecutionInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return exportTask;
    }

    private static ExportTaskJsonUnmarshaller instance;

    public static ExportTaskJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExportTaskJsonUnmarshaller();
        return instance;
    }
}
