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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO StepExecution
 */
class StepExecutionJsonMarshaller {

    public void marshall(StepExecution stepExecution, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (stepExecution.getStepName() != null) {
            String stepName = stepExecution.getStepName();
            jsonWriter.name("StepName");
            jsonWriter.value(stepName);
        }
        if (stepExecution.getAction() != null) {
            String action = stepExecution.getAction();
            jsonWriter.name("Action");
            jsonWriter.value(action);
        }
        if (stepExecution.getTimeoutSeconds() != null) {
            Long timeoutSeconds = stepExecution.getTimeoutSeconds();
            jsonWriter.name("TimeoutSeconds");
            jsonWriter.value(timeoutSeconds);
        }
        if (stepExecution.getOnFailure() != null) {
            String onFailure = stepExecution.getOnFailure();
            jsonWriter.name("OnFailure");
            jsonWriter.value(onFailure);
        }
        if (stepExecution.getMaxAttempts() != null) {
            Integer maxAttempts = stepExecution.getMaxAttempts();
            jsonWriter.name("MaxAttempts");
            jsonWriter.value(maxAttempts);
        }
        if (stepExecution.getExecutionStartTime() != null) {
            java.util.Date executionStartTime = stepExecution.getExecutionStartTime();
            jsonWriter.name("ExecutionStartTime");
            jsonWriter.value(executionStartTime);
        }
        if (stepExecution.getExecutionEndTime() != null) {
            java.util.Date executionEndTime = stepExecution.getExecutionEndTime();
            jsonWriter.name("ExecutionEndTime");
            jsonWriter.value(executionEndTime);
        }
        if (stepExecution.getStepStatus() != null) {
            String stepStatus = stepExecution.getStepStatus();
            jsonWriter.name("StepStatus");
            jsonWriter.value(stepStatus);
        }
        if (stepExecution.getResponseCode() != null) {
            String responseCode = stepExecution.getResponseCode();
            jsonWriter.name("ResponseCode");
            jsonWriter.value(responseCode);
        }
        if (stepExecution.getInputs() != null) {
            java.util.Map<String, String> inputs = stepExecution.getInputs();
            jsonWriter.name("Inputs");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> inputsEntry : inputs.entrySet()) {
                String inputsValue = inputsEntry.getValue();
                if (inputsValue != null) {
                    jsonWriter.name(inputsEntry.getKey());
                    jsonWriter.value(inputsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (stepExecution.getOutputs() != null) {
            java.util.Map<String, java.util.List<String>> outputs = stepExecution.getOutputs();
            jsonWriter.name("Outputs");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.List<String>> outputsEntry : outputs
                    .entrySet()) {
                java.util.List<String> outputsValue = outputsEntry.getValue();
                if (outputsValue != null) {
                    jsonWriter.name(outputsEntry.getKey());
                    jsonWriter.beginArray();
                    for (String outputsValueItem : outputsValue) {
                        if (outputsValueItem != null) {
                            jsonWriter.value(outputsValueItem);
                        }
                    }
                    jsonWriter.endArray();
                }
            }
            jsonWriter.endObject();
        }
        if (stepExecution.getResponse() != null) {
            String response = stepExecution.getResponse();
            jsonWriter.name("Response");
            jsonWriter.value(response);
        }
        if (stepExecution.getFailureMessage() != null) {
            String failureMessage = stepExecution.getFailureMessage();
            jsonWriter.name("FailureMessage");
            jsonWriter.value(failureMessage);
        }
        if (stepExecution.getFailureDetails() != null) {
            FailureDetails failureDetails = stepExecution.getFailureDetails();
            jsonWriter.name("FailureDetails");
            FailureDetailsJsonMarshaller.getInstance().marshall(failureDetails, jsonWriter);
        }
        if (stepExecution.getStepExecutionId() != null) {
            String stepExecutionId = stepExecution.getStepExecutionId();
            jsonWriter.name("StepExecutionId");
            jsonWriter.value(stepExecutionId);
        }
        if (stepExecution.getOverriddenParameters() != null) {
            java.util.Map<String, java.util.List<String>> overriddenParameters = stepExecution
                    .getOverriddenParameters();
            jsonWriter.name("OverriddenParameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.List<String>> overriddenParametersEntry : overriddenParameters
                    .entrySet()) {
                java.util.List<String> overriddenParametersValue = overriddenParametersEntry
                        .getValue();
                if (overriddenParametersValue != null) {
                    jsonWriter.name(overriddenParametersEntry.getKey());
                    jsonWriter.beginArray();
                    for (String overriddenParametersValueItem : overriddenParametersValue) {
                        if (overriddenParametersValueItem != null) {
                            jsonWriter.value(overriddenParametersValueItem);
                        }
                    }
                    jsonWriter.endArray();
                }
            }
            jsonWriter.endObject();
        }
        if (stepExecution.getIsEnd() != null) {
            Boolean isEnd = stepExecution.getIsEnd();
            jsonWriter.name("IsEnd");
            jsonWriter.value(isEnd);
        }
        if (stepExecution.getNextStep() != null) {
            String nextStep = stepExecution.getNextStep();
            jsonWriter.name("NextStep");
            jsonWriter.value(nextStep);
        }
        if (stepExecution.getIsCritical() != null) {
            Boolean isCritical = stepExecution.getIsCritical();
            jsonWriter.name("IsCritical");
            jsonWriter.value(isCritical);
        }
        if (stepExecution.getValidNextSteps() != null) {
            java.util.List<String> validNextSteps = stepExecution.getValidNextSteps();
            jsonWriter.name("ValidNextSteps");
            jsonWriter.beginArray();
            for (String validNextStepsItem : validNextSteps) {
                if (validNextStepsItem != null) {
                    jsonWriter.value(validNextStepsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (stepExecution.getTargets() != null) {
            java.util.List<Target> targets = stepExecution.getTargets();
            jsonWriter.name("Targets");
            jsonWriter.beginArray();
            for (Target targetsItem : targets) {
                if (targetsItem != null) {
                    TargetJsonMarshaller.getInstance().marshall(targetsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (stepExecution.getTargetLocation() != null) {
            TargetLocation targetLocation = stepExecution.getTargetLocation();
            jsonWriter.name("TargetLocation");
            TargetLocationJsonMarshaller.getInstance().marshall(targetLocation, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static StepExecutionJsonMarshaller instance;

    public static StepExecutionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StepExecutionJsonMarshaller();
        return instance;
    }
}
