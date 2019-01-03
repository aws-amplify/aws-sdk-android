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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AuditTaskMetadata
 */
class AuditTaskMetadataJsonMarshaller {

    public void marshall(AuditTaskMetadata auditTaskMetadata, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (auditTaskMetadata.getTaskId() != null) {
            String taskId = auditTaskMetadata.getTaskId();
            jsonWriter.name("taskId");
            jsonWriter.value(taskId);
        }
        if (auditTaskMetadata.getTaskStatus() != null) {
            String taskStatus = auditTaskMetadata.getTaskStatus();
            jsonWriter.name("taskStatus");
            jsonWriter.value(taskStatus);
        }
        if (auditTaskMetadata.getTaskType() != null) {
            String taskType = auditTaskMetadata.getTaskType();
            jsonWriter.name("taskType");
            jsonWriter.value(taskType);
        }
        jsonWriter.endObject();
    }

    private static AuditTaskMetadataJsonMarshaller instance;

    public static AuditTaskMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AuditTaskMetadataJsonMarshaller();
        return instance;
    }
}
