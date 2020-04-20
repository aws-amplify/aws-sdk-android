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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TaskRun
 */
class TaskRunJsonMarshaller {

    public void marshall(TaskRun taskRun, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (taskRun.getTransformId() != null) {
            String transformId = taskRun.getTransformId();
            jsonWriter.name("TransformId");
            jsonWriter.value(transformId);
        }
        if (taskRun.getTaskRunId() != null) {
            String taskRunId = taskRun.getTaskRunId();
            jsonWriter.name("TaskRunId");
            jsonWriter.value(taskRunId);
        }
        if (taskRun.getStatus() != null) {
            String status = taskRun.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (taskRun.getLogGroupName() != null) {
            String logGroupName = taskRun.getLogGroupName();
            jsonWriter.name("LogGroupName");
            jsonWriter.value(logGroupName);
        }
        if (taskRun.getProperties() != null) {
            TaskRunProperties properties = taskRun.getProperties();
            jsonWriter.name("Properties");
            TaskRunPropertiesJsonMarshaller.getInstance().marshall(properties, jsonWriter);
        }
        if (taskRun.getErrorString() != null) {
            String errorString = taskRun.getErrorString();
            jsonWriter.name("ErrorString");
            jsonWriter.value(errorString);
        }
        if (taskRun.getStartedOn() != null) {
            java.util.Date startedOn = taskRun.getStartedOn();
            jsonWriter.name("StartedOn");
            jsonWriter.value(startedOn);
        }
        if (taskRun.getLastModifiedOn() != null) {
            java.util.Date lastModifiedOn = taskRun.getLastModifiedOn();
            jsonWriter.name("LastModifiedOn");
            jsonWriter.value(lastModifiedOn);
        }
        if (taskRun.getCompletedOn() != null) {
            java.util.Date completedOn = taskRun.getCompletedOn();
            jsonWriter.name("CompletedOn");
            jsonWriter.value(completedOn);
        }
        if (taskRun.getExecutionTime() != null) {
            Integer executionTime = taskRun.getExecutionTime();
            jsonWriter.name("ExecutionTime");
            jsonWriter.value(executionTime);
        }
        jsonWriter.endObject();
    }

    private static TaskRunJsonMarshaller instance;

    public static TaskRunJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TaskRunJsonMarshaller();
        return instance;
    }
}
