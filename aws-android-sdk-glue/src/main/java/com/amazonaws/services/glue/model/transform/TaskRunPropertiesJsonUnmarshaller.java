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
 * JSON unmarshaller for POJO TaskRunProperties
 */
class TaskRunPropertiesJsonUnmarshaller implements
        Unmarshaller<TaskRunProperties, JsonUnmarshallerContext> {

    public TaskRunProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TaskRunProperties taskRunProperties = new TaskRunProperties();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TaskType")) {
                taskRunProperties.setTaskType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImportLabelsTaskRunProperties")) {
                taskRunProperties
                        .setImportLabelsTaskRunProperties(ImportLabelsTaskRunPropertiesJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ExportLabelsTaskRunProperties")) {
                taskRunProperties
                        .setExportLabelsTaskRunProperties(ExportLabelsTaskRunPropertiesJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("LabelingSetGenerationTaskRunProperties")) {
                taskRunProperties
                        .setLabelingSetGenerationTaskRunProperties(LabelingSetGenerationTaskRunPropertiesJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("FindMatchesTaskRunProperties")) {
                taskRunProperties
                        .setFindMatchesTaskRunProperties(FindMatchesTaskRunPropertiesJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return taskRunProperties;
    }

    private static TaskRunPropertiesJsonUnmarshaller instance;

    public static TaskRunPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TaskRunPropertiesJsonUnmarshaller();
        return instance;
    }
}
