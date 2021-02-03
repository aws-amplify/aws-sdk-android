/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AuditMitigationActionExecutionMetadata
 */
class AuditMitigationActionExecutionMetadataJsonMarshaller {

    public void marshall(
            AuditMitigationActionExecutionMetadata auditMitigationActionExecutionMetadata,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (auditMitigationActionExecutionMetadata.getTaskId() != null) {
            String taskId = auditMitigationActionExecutionMetadata.getTaskId();
            jsonWriter.name("taskId");
            jsonWriter.value(taskId);
        }
        if (auditMitigationActionExecutionMetadata.getFindingId() != null) {
            String findingId = auditMitigationActionExecutionMetadata.getFindingId();
            jsonWriter.name("findingId");
            jsonWriter.value(findingId);
        }
        if (auditMitigationActionExecutionMetadata.getActionName() != null) {
            String actionName = auditMitigationActionExecutionMetadata.getActionName();
            jsonWriter.name("actionName");
            jsonWriter.value(actionName);
        }
        if (auditMitigationActionExecutionMetadata.getActionId() != null) {
            String actionId = auditMitigationActionExecutionMetadata.getActionId();
            jsonWriter.name("actionId");
            jsonWriter.value(actionId);
        }
        if (auditMitigationActionExecutionMetadata.getStatus() != null) {
            String status = auditMitigationActionExecutionMetadata.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (auditMitigationActionExecutionMetadata.getStartTime() != null) {
            java.util.Date startTime = auditMitigationActionExecutionMetadata.getStartTime();
            jsonWriter.name("startTime");
            jsonWriter.value(startTime);
        }
        if (auditMitigationActionExecutionMetadata.getEndTime() != null) {
            java.util.Date endTime = auditMitigationActionExecutionMetadata.getEndTime();
            jsonWriter.name("endTime");
            jsonWriter.value(endTime);
        }
        if (auditMitigationActionExecutionMetadata.getErrorCode() != null) {
            String errorCode = auditMitigationActionExecutionMetadata.getErrorCode();
            jsonWriter.name("errorCode");
            jsonWriter.value(errorCode);
        }
        if (auditMitigationActionExecutionMetadata.getMessage() != null) {
            String message = auditMitigationActionExecutionMetadata.getMessage();
            jsonWriter.name("message");
            jsonWriter.value(message);
        }
        jsonWriter.endObject();
    }

    private static AuditMitigationActionExecutionMetadataJsonMarshaller instance;

    public static AuditMitigationActionExecutionMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AuditMitigationActionExecutionMetadataJsonMarshaller();
        return instance;
    }
}
