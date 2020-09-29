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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ScheduledWindowExecution
 */
class ScheduledWindowExecutionJsonMarshaller {

    public void marshall(ScheduledWindowExecution scheduledWindowExecution, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (scheduledWindowExecution.getWindowId() != null) {
            String windowId = scheduledWindowExecution.getWindowId();
            jsonWriter.name("WindowId");
            jsonWriter.value(windowId);
        }
        if (scheduledWindowExecution.getName() != null) {
            String name = scheduledWindowExecution.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (scheduledWindowExecution.getExecutionTime() != null) {
            String executionTime = scheduledWindowExecution.getExecutionTime();
            jsonWriter.name("ExecutionTime");
            jsonWriter.value(executionTime);
        }
        jsonWriter.endObject();
    }

    private static ScheduledWindowExecutionJsonMarshaller instance;
    public static ScheduledWindowExecutionJsonMarshaller getInstance() {
        if (instance == null) instance = new ScheduledWindowExecutionJsonMarshaller();
        return instance;
    }
}
