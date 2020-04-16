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
 * JSON marshaller for POJO TaskRunFilterCriteria
 */
class TaskRunFilterCriteriaJsonMarshaller {

    public void marshall(TaskRunFilterCriteria taskRunFilterCriteria, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (taskRunFilterCriteria.getTaskRunType() != null) {
            String taskRunType = taskRunFilterCriteria.getTaskRunType();
            jsonWriter.name("TaskRunType");
            jsonWriter.value(taskRunType);
        }
        if (taskRunFilterCriteria.getStatus() != null) {
            String status = taskRunFilterCriteria.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (taskRunFilterCriteria.getStartedBefore() != null) {
            java.util.Date startedBefore = taskRunFilterCriteria.getStartedBefore();
            jsonWriter.name("StartedBefore");
            jsonWriter.value(startedBefore);
        }
        if (taskRunFilterCriteria.getStartedAfter() != null) {
            java.util.Date startedAfter = taskRunFilterCriteria.getStartedAfter();
            jsonWriter.name("StartedAfter");
            jsonWriter.value(startedAfter);
        }
        jsonWriter.endObject();
    }

    private static TaskRunFilterCriteriaJsonMarshaller instance;

    public static TaskRunFilterCriteriaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TaskRunFilterCriteriaJsonMarshaller();
        return instance;
    }
}
