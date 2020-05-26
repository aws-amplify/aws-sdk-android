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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO StepExecution
 */
class StepExecutionJsonUnmarshaller implements Unmarshaller<StepExecution, JsonUnmarshallerContext> {

    public StepExecution unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StepExecution stepExecution = new StepExecution();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("StepName")) {
                stepExecution.setStepName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Action")) {
                stepExecution.setAction(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimeoutSeconds")) {
                stepExecution.setTimeoutSeconds(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OnFailure")) {
                stepExecution.setOnFailure(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxAttempts")) {
                stepExecution.setMaxAttempts(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExecutionStartTime")) {
                stepExecution.setExecutionStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExecutionEndTime")) {
                stepExecution.setExecutionEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StepStatus")) {
                stepExecution.setStepStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResponseCode")) {
                stepExecution.setResponseCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Inputs")) {
                stepExecution.setInputs(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Outputs")) {
                stepExecution.setOutputs(new MapUnmarshaller<java.util.List<String>>(
                        new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                        )
                                .unmarshall(context));
            } else if (name.equals("Response")) {
                stepExecution.setResponse(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureMessage")) {
                stepExecution.setFailureMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureDetails")) {
                stepExecution.setFailureDetails(FailureDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StepExecutionId")) {
                stepExecution.setStepExecutionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OverriddenParameters")) {
                stepExecution.setOverriddenParameters(new MapUnmarshaller<java.util.List<String>>(
                        new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                        )
                                .unmarshall(context));
            } else if (name.equals("IsEnd")) {
                stepExecution.setIsEnd(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NextStep")) {
                stepExecution.setNextStep(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IsCritical")) {
                stepExecution.setIsCritical(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ValidNextSteps")) {
                stepExecution.setValidNextSteps(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Targets")) {
                stepExecution.setTargets(new ListUnmarshaller<Target>(TargetJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TargetLocation")) {
                stepExecution.setTargetLocation(TargetLocationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return stepExecution;
    }

    private static StepExecutionJsonUnmarshaller instance;

    public static StepExecutionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StepExecutionJsonUnmarshaller();
        return instance;
    }
}
