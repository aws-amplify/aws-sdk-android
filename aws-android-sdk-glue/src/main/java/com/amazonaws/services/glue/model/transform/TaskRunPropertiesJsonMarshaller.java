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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TaskRunProperties
 */
class TaskRunPropertiesJsonMarshaller {

    public void marshall(TaskRunProperties taskRunProperties, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (taskRunProperties.getTaskType() != null) {
            String taskType = taskRunProperties.getTaskType();
            jsonWriter.name("TaskType");
            jsonWriter.value(taskType);
        }
        if (taskRunProperties.getImportLabelsTaskRunProperties() != null) {
            ImportLabelsTaskRunProperties importLabelsTaskRunProperties = taskRunProperties
                    .getImportLabelsTaskRunProperties();
            jsonWriter.name("ImportLabelsTaskRunProperties");
            ImportLabelsTaskRunPropertiesJsonMarshaller.getInstance().marshall(
                    importLabelsTaskRunProperties, jsonWriter);
        }
        if (taskRunProperties.getExportLabelsTaskRunProperties() != null) {
            ExportLabelsTaskRunProperties exportLabelsTaskRunProperties = taskRunProperties
                    .getExportLabelsTaskRunProperties();
            jsonWriter.name("ExportLabelsTaskRunProperties");
            ExportLabelsTaskRunPropertiesJsonMarshaller.getInstance().marshall(
                    exportLabelsTaskRunProperties, jsonWriter);
        }
        if (taskRunProperties.getLabelingSetGenerationTaskRunProperties() != null) {
            LabelingSetGenerationTaskRunProperties labelingSetGenerationTaskRunProperties = taskRunProperties
                    .getLabelingSetGenerationTaskRunProperties();
            jsonWriter.name("LabelingSetGenerationTaskRunProperties");
            LabelingSetGenerationTaskRunPropertiesJsonMarshaller.getInstance().marshall(
                    labelingSetGenerationTaskRunProperties, jsonWriter);
        }
        if (taskRunProperties.getFindMatchesTaskRunProperties() != null) {
            FindMatchesTaskRunProperties findMatchesTaskRunProperties = taskRunProperties
                    .getFindMatchesTaskRunProperties();
            jsonWriter.name("FindMatchesTaskRunProperties");
            FindMatchesTaskRunPropertiesJsonMarshaller.getInstance().marshall(
                    findMatchesTaskRunProperties, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TaskRunPropertiesJsonMarshaller instance;

    public static TaskRunPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TaskRunPropertiesJsonMarshaller();
        return instance;
    }
}
