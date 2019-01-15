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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ExportTask
 */
class ExportTaskJsonMarshaller {

    public void marshall(ExportTask exportTask, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (exportTask.getTaskId() != null) {
            String taskId = exportTask.getTaskId();
            jsonWriter.name("taskId");
            jsonWriter.value(taskId);
        }
        if (exportTask.getTaskName() != null) {
            String taskName = exportTask.getTaskName();
            jsonWriter.name("taskName");
            jsonWriter.value(taskName);
        }
        if (exportTask.getLogGroupName() != null) {
            String logGroupName = exportTask.getLogGroupName();
            jsonWriter.name("logGroupName");
            jsonWriter.value(logGroupName);
        }
        if (exportTask.getFrom() != null) {
            Long from = exportTask.getFrom();
            jsonWriter.name("from");
            jsonWriter.value(from);
        }
        if (exportTask.getTo() != null) {
            Long to = exportTask.getTo();
            jsonWriter.name("to");
            jsonWriter.value(to);
        }
        if (exportTask.getDestination() != null) {
            String destination = exportTask.getDestination();
            jsonWriter.name("destination");
            jsonWriter.value(destination);
        }
        if (exportTask.getDestinationPrefix() != null) {
            String destinationPrefix = exportTask.getDestinationPrefix();
            jsonWriter.name("destinationPrefix");
            jsonWriter.value(destinationPrefix);
        }
        if (exportTask.getStatus() != null) {
            ExportTaskStatus status = exportTask.getStatus();
            jsonWriter.name("status");
            ExportTaskStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (exportTask.getExecutionInfo() != null) {
            ExportTaskExecutionInfo executionInfo = exportTask.getExecutionInfo();
            jsonWriter.name("executionInfo");
            ExportTaskExecutionInfoJsonMarshaller.getInstance().marshall(executionInfo, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ExportTaskJsonMarshaller instance;

    public static ExportTaskJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExportTaskJsonMarshaller();
        return instance;
    }
}
