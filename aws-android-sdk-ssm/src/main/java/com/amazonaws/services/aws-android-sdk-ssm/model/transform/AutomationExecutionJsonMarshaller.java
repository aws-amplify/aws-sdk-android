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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AutomationExecution
 */
class AutomationExecutionJsonMarshaller {

    public void marshall(AutomationExecution automationExecution, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (automationExecution.getAutomationExecutionId() != null) {
            String automationExecutionId = automationExecution.getAutomationExecutionId();
            jsonWriter.name("AutomationExecutionId");
            jsonWriter.value(automationExecutionId);
        }
        if (automationExecution.getDocumentName() != null) {
            String documentName = automationExecution.getDocumentName();
            jsonWriter.name("DocumentName");
            jsonWriter.value(documentName);
        }
        if (automationExecution.getDocumentVersion() != null) {
            String documentVersion = automationExecution.getDocumentVersion();
            jsonWriter.name("DocumentVersion");
            jsonWriter.value(documentVersion);
        }
        if (automationExecution.getExecutionStartTime() != null) {
            java.util.Date executionStartTime = automationExecution.getExecutionStartTime();
            jsonWriter.name("ExecutionStartTime");
            jsonWriter.value(executionStartTime);
        }
        if (automationExecution.getExecutionEndTime() != null) {
            java.util.Date executionEndTime = automationExecution.getExecutionEndTime();
            jsonWriter.name("ExecutionEndTime");
            jsonWriter.value(executionEndTime);
        }
        if (automationExecution.getAutomationExecutionStatus() != null) {
            String automationExecutionStatus = automationExecution.getAutomationExecutionStatus();
            jsonWriter.name("AutomationExecutionStatus");
            jsonWriter.value(automationExecutionStatus);
        }
        if (automationExecution.getStepExecutions() != null) {
            java.util.List<StepExecution> stepExecutions = automationExecution.getStepExecutions();
            jsonWriter.name("StepExecutions");
            jsonWriter.beginArray();
            for (StepExecution stepExecutionsItem : stepExecutions) {
                if (stepExecutionsItem != null) {
            StepExecutionJsonMarshaller.getInstance().marshall(stepExecutionsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (automationExecution.getStepExecutionsTruncated() != null) {
            Boolean stepExecutionsTruncated = automationExecution.getStepExecutionsTruncated();
            jsonWriter.name("StepExecutionsTruncated");
            jsonWriter.value(stepExecutionsTruncated);
        }
        if (automationExecution.getParameters() != null) {
            java.util.Map<String, java.util.List<String>> parameters = automationExecution.getParameters();
            jsonWriter.name("Parameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.List<String>> parametersEntry : parameters.entrySet()) {
                java.util.List<String> parametersValue = parametersEntry.getValue();
                if (parametersValue != null) {
                    jsonWriter.name(parametersEntry.getKey());
            jsonWriter.beginArray();
            for (String parametersValueItem : parametersValue) {
                if (parametersValueItem != null) {
            jsonWriter.value(parametersValueItem);
                    }
            }
            jsonWriter.endArray();
                }
            }
            jsonWriter.endObject();
        }
        if (automationExecution.getOutputs() != null) {
            java.util.Map<String, java.util.List<String>> outputs = automationExecution.getOutputs();
            jsonWriter.name("Outputs");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.List<String>> outputsEntry : outputs.entrySet()) {
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
        if (automationExecution.getFailureMessage() != null) {
            String failureMessage = automationExecution.getFailureMessage();
            jsonWriter.name("FailureMessage");
            jsonWriter.value(failureMessage);
        }
        if (automationExecution.getMode() != null) {
            String mode = automationExecution.getMode();
            jsonWriter.name("Mode");
            jsonWriter.value(mode);
        }
        if (automationExecution.getParentAutomationExecutionId() != null) {
            String parentAutomationExecutionId = automationExecution.getParentAutomationExecutionId();
            jsonWriter.name("ParentAutomationExecutionId");
            jsonWriter.value(parentAutomationExecutionId);
        }
        if (automationExecution.getExecutedBy() != null) {
            String executedBy = automationExecution.getExecutedBy();
            jsonWriter.name("ExecutedBy");
            jsonWriter.value(executedBy);
        }
        if (automationExecution.getCurrentStepName() != null) {
            String currentStepName = automationExecution.getCurrentStepName();
            jsonWriter.name("CurrentStepName");
            jsonWriter.value(currentStepName);
        }
        if (automationExecution.getCurrentAction() != null) {
            String currentAction = automationExecution.getCurrentAction();
            jsonWriter.name("CurrentAction");
            jsonWriter.value(currentAction);
        }
        if (automationExecution.getTargetParameterName() != null) {
            String targetParameterName = automationExecution.getTargetParameterName();
            jsonWriter.name("TargetParameterName");
            jsonWriter.value(targetParameterName);
        }
        if (automationExecution.getTargets() != null) {
            java.util.List<Target> targets = automationExecution.getTargets();
            jsonWriter.name("Targets");
            jsonWriter.beginArray();
            for (Target targetsItem : targets) {
                if (targetsItem != null) {
            TargetJsonMarshaller.getInstance().marshall(targetsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (automationExecution.getTargetMaps() != null) {
            java.util.List<java.util.Map<String, java.util.List<String>>> targetMaps = automationExecution.getTargetMaps();
            jsonWriter.name("TargetMaps");
            jsonWriter.beginArray();
            for (java.util.Map<String, java.util.List<String>> targetMapsItem : targetMaps) {
                if (targetMapsItem != null) {
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.List<String>> targetMapsItemEntry : targetMapsItem.entrySet()) {
                java.util.List<String> targetMapsItemValue = targetMapsItemEntry.getValue();
                if (targetMapsItemValue != null) {
                    jsonWriter.name(targetMapsItemEntry.getKey());
            jsonWriter.beginArray();
            for (String targetMapsItemValueItem : targetMapsItemValue) {
                if (targetMapsItemValueItem != null) {
            jsonWriter.value(targetMapsItemValueItem);
                    }
            }
            jsonWriter.endArray();
                }
            }
            jsonWriter.endObject();
                    }
            }
            jsonWriter.endArray();
        }
        if (automationExecution.getResolvedTargets() != null) {
            ResolvedTargets resolvedTargets = automationExecution.getResolvedTargets();
            jsonWriter.name("ResolvedTargets");
            ResolvedTargetsJsonMarshaller.getInstance().marshall(resolvedTargets, jsonWriter);
        }
        if (automationExecution.getMaxConcurrency() != null) {
            String maxConcurrency = automationExecution.getMaxConcurrency();
            jsonWriter.name("MaxConcurrency");
            jsonWriter.value(maxConcurrency);
        }
        if (automationExecution.getMaxErrors() != null) {
            String maxErrors = automationExecution.getMaxErrors();
            jsonWriter.name("MaxErrors");
            jsonWriter.value(maxErrors);
        }
        if (automationExecution.getTarget() != null) {
            String target = automationExecution.getTarget();
            jsonWriter.name("Target");
            jsonWriter.value(target);
        }
        if (automationExecution.getTargetLocations() != null) {
            java.util.List<TargetLocation> targetLocations = automationExecution.getTargetLocations();
            jsonWriter.name("TargetLocations");
            jsonWriter.beginArray();
            for (TargetLocation targetLocationsItem : targetLocations) {
                if (targetLocationsItem != null) {
            TargetLocationJsonMarshaller.getInstance().marshall(targetLocationsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (automationExecution.getProgressCounters() != null) {
            ProgressCounters progressCounters = automationExecution.getProgressCounters();
            jsonWriter.name("ProgressCounters");
            ProgressCountersJsonMarshaller.getInstance().marshall(progressCounters, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AutomationExecutionJsonMarshaller instance;
    public static AutomationExecutionJsonMarshaller getInstance() {
        if (instance == null) instance = new AutomationExecutionJsonMarshaller();
        return instance;
    }
}
