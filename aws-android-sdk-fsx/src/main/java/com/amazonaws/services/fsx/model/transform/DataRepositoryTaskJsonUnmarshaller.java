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

package com.amazonaws.services.fsx.model.transform;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DataRepositoryTask
 */
class DataRepositoryTaskJsonUnmarshaller implements
        Unmarshaller<DataRepositoryTask, JsonUnmarshallerContext> {

    public DataRepositoryTask unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DataRepositoryTask dataRepositoryTask = new DataRepositoryTask();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TaskId")) {
                dataRepositoryTask.setTaskId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Lifecycle")) {
                dataRepositoryTask.setLifecycle(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                dataRepositoryTask.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                dataRepositoryTask.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartTime")) {
                dataRepositoryTask.setStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                dataRepositoryTask.setEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceARN")) {
                dataRepositoryTask.setResourceARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                dataRepositoryTask.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("FileSystemId")) {
                dataRepositoryTask.setFileSystemId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Paths")) {
                dataRepositoryTask.setPaths(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("FailureDetails")) {
                dataRepositoryTask
                        .setFailureDetails(DataRepositoryTaskFailureDetailsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Status")) {
                dataRepositoryTask.setStatus(DataRepositoryTaskStatusJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Report")) {
                dataRepositoryTask.setReport(CompletionReportJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return dataRepositoryTask;
    }

    private static DataRepositoryTaskJsonUnmarshaller instance;

    public static DataRepositoryTaskJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataRepositoryTaskJsonUnmarshaller();
        return instance;
    }
}
