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
 * JSON marshaller for POJO StepFunctionsAction
 */
class StepFunctionsActionJsonMarshaller {

    public void marshall(StepFunctionsAction stepFunctionsAction, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (stepFunctionsAction.getExecutionNamePrefix() != null) {
            String executionNamePrefix = stepFunctionsAction.getExecutionNamePrefix();
            jsonWriter.name("executionNamePrefix");
            jsonWriter.value(executionNamePrefix);
        }
        if (stepFunctionsAction.getStateMachineName() != null) {
            String stateMachineName = stepFunctionsAction.getStateMachineName();
            jsonWriter.name("stateMachineName");
            jsonWriter.value(stateMachineName);
        }
        if (stepFunctionsAction.getRoleArn() != null) {
            String roleArn = stepFunctionsAction.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        jsonWriter.endObject();
    }

    private static StepFunctionsActionJsonMarshaller instance;

    public static StepFunctionsActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StepFunctionsActionJsonMarshaller();
        return instance;
    }
}
