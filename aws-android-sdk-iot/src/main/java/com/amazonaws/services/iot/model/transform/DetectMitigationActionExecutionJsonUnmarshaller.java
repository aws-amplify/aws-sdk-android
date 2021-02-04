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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DetectMitigationActionExecution
 */
class DetectMitigationActionExecutionJsonUnmarshaller implements
        Unmarshaller<DetectMitigationActionExecution, JsonUnmarshallerContext> {

    public DetectMitigationActionExecution unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DetectMitigationActionExecution detectMitigationActionExecution = new DetectMitigationActionExecution();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("taskId")) {
                detectMitigationActionExecution.setTaskId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("violationId")) {
                detectMitigationActionExecution.setViolationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("actionName")) {
                detectMitigationActionExecution.setActionName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("thingName")) {
                detectMitigationActionExecution.setThingName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("executionStartDate")) {
                detectMitigationActionExecution.setExecutionStartDate(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("executionEndDate")) {
                detectMitigationActionExecution.setExecutionEndDate(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                detectMitigationActionExecution.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("errorCode")) {
                detectMitigationActionExecution.setErrorCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("message")) {
                detectMitigationActionExecution.setMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return detectMitigationActionExecution;
    }

    private static DetectMitigationActionExecutionJsonUnmarshaller instance;

    public static DetectMitigationActionExecutionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DetectMitigationActionExecutionJsonUnmarshaller();
        return instance;
    }
}
