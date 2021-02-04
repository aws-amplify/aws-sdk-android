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
 * JSON marshaller for POJO DetectMitigationActionExecution
 */
class DetectMitigationActionExecutionJsonMarshaller {

    public void marshall(DetectMitigationActionExecution detectMitigationActionExecution,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (detectMitigationActionExecution.getTaskId() != null) {
            String taskId = detectMitigationActionExecution.getTaskId();
            jsonWriter.name("taskId");
            jsonWriter.value(taskId);
        }
        if (detectMitigationActionExecution.getViolationId() != null) {
            String violationId = detectMitigationActionExecution.getViolationId();
            jsonWriter.name("violationId");
            jsonWriter.value(violationId);
        }
        if (detectMitigationActionExecution.getActionName() != null) {
            String actionName = detectMitigationActionExecution.getActionName();
            jsonWriter.name("actionName");
            jsonWriter.value(actionName);
        }
        if (detectMitigationActionExecution.getThingName() != null) {
            String thingName = detectMitigationActionExecution.getThingName();
            jsonWriter.name("thingName");
            jsonWriter.value(thingName);
        }
        if (detectMitigationActionExecution.getExecutionStartDate() != null) {
            java.util.Date executionStartDate = detectMitigationActionExecution
                    .getExecutionStartDate();
            jsonWriter.name("executionStartDate");
            jsonWriter.value(executionStartDate);
        }
        if (detectMitigationActionExecution.getExecutionEndDate() != null) {
            java.util.Date executionEndDate = detectMitigationActionExecution.getExecutionEndDate();
            jsonWriter.name("executionEndDate");
            jsonWriter.value(executionEndDate);
        }
        if (detectMitigationActionExecution.getStatus() != null) {
            String status = detectMitigationActionExecution.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (detectMitigationActionExecution.getErrorCode() != null) {
            String errorCode = detectMitigationActionExecution.getErrorCode();
            jsonWriter.name("errorCode");
            jsonWriter.value(errorCode);
        }
        if (detectMitigationActionExecution.getMessage() != null) {
            String message = detectMitigationActionExecution.getMessage();
            jsonWriter.name("message");
            jsonWriter.value(message);
        }
        jsonWriter.endObject();
    }

    private static DetectMitigationActionExecutionJsonMarshaller instance;

    public static DetectMitigationActionExecutionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DetectMitigationActionExecutionJsonMarshaller();
        return instance;
    }
}
