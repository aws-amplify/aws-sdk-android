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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DataRepositoryTask
 */
class DataRepositoryTaskJsonMarshaller {

    public void marshall(DataRepositoryTask dataRepositoryTask, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (dataRepositoryTask.getTaskId() != null) {
            String taskId = dataRepositoryTask.getTaskId();
            jsonWriter.name("TaskId");
            jsonWriter.value(taskId);
        }
        if (dataRepositoryTask.getLifecycle() != null) {
            String lifecycle = dataRepositoryTask.getLifecycle();
            jsonWriter.name("Lifecycle");
            jsonWriter.value(lifecycle);
        }
        if (dataRepositoryTask.getType() != null) {
            String type = dataRepositoryTask.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (dataRepositoryTask.getCreationTime() != null) {
            java.util.Date creationTime = dataRepositoryTask.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (dataRepositoryTask.getStartTime() != null) {
            java.util.Date startTime = dataRepositoryTask.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (dataRepositoryTask.getEndTime() != null) {
            java.util.Date endTime = dataRepositoryTask.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (dataRepositoryTask.getResourceARN() != null) {
            String resourceARN = dataRepositoryTask.getResourceARN();
            jsonWriter.name("ResourceARN");
            jsonWriter.value(resourceARN);
        }
        if (dataRepositoryTask.getTags() != null) {
            java.util.List<Tag> tags = dataRepositoryTask.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (dataRepositoryTask.getFileSystemId() != null) {
            String fileSystemId = dataRepositoryTask.getFileSystemId();
            jsonWriter.name("FileSystemId");
            jsonWriter.value(fileSystemId);
        }
        if (dataRepositoryTask.getPaths() != null) {
            java.util.List<String> paths = dataRepositoryTask.getPaths();
            jsonWriter.name("Paths");
            jsonWriter.beginArray();
            for (String pathsItem : paths) {
                if (pathsItem != null) {
                    jsonWriter.value(pathsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (dataRepositoryTask.getFailureDetails() != null) {
            DataRepositoryTaskFailureDetails failureDetails = dataRepositoryTask
                    .getFailureDetails();
            jsonWriter.name("FailureDetails");
            DataRepositoryTaskFailureDetailsJsonMarshaller.getInstance().marshall(failureDetails,
                    jsonWriter);
        }
        if (dataRepositoryTask.getStatus() != null) {
            DataRepositoryTaskStatus status = dataRepositoryTask.getStatus();
            jsonWriter.name("Status");
            DataRepositoryTaskStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (dataRepositoryTask.getReport() != null) {
            CompletionReport report = dataRepositoryTask.getReport();
            jsonWriter.name("Report");
            CompletionReportJsonMarshaller.getInstance().marshall(report, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DataRepositoryTaskJsonMarshaller instance;

    public static DataRepositoryTaskJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DataRepositoryTaskJsonMarshaller();
        return instance;
    }
}
