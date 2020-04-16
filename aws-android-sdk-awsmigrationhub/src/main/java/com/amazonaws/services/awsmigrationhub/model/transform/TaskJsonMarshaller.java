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

package com.amazonaws.services.awsmigrationhub.model.transform;

import com.amazonaws.services.awsmigrationhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Task
 */
class TaskJsonMarshaller {

    public void marshall(Task task, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (task.getStatus() != null) {
            String status = task.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (task.getStatusDetail() != null) {
            String statusDetail = task.getStatusDetail();
            jsonWriter.name("StatusDetail");
            jsonWriter.value(statusDetail);
        }
        if (task.getProgressPercent() != null) {
            Integer progressPercent = task.getProgressPercent();
            jsonWriter.name("ProgressPercent");
            jsonWriter.value(progressPercent);
        }
        jsonWriter.endObject();
    }

    private static TaskJsonMarshaller instance;

    public static TaskJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TaskJsonMarshaller();
        return instance;
    }
}
