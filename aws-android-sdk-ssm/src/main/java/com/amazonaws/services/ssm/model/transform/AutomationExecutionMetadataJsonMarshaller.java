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
 * JSON marshaller for POJO AutomationExecutionMetadata
 */
class AutomationExecutionMetadataJsonMarshaller {

    public void marshall(AutomationExecutionMetadata automationExecutionMetadata,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (automationExecutionMetadata.getAutomationExecutionId() != null) {
            String automationExecutionId = automationExecutionMetadata.getAutomationExecutionId();
            jsonWriter.name("AutomationExecutionId");
            jsonWriter.value(automationExecutionId);
        }
        if (automationExecutionMetadata.getDocumentName() != null) {
            String documentName = automationExecutionMetadata.getDocumentName();
            jsonWriter.name("DocumentName");
            jsonWriter.value(documentName);
        }
        if (automationExecutionMetadata.getDocumentVersion() != null) {
            String documentVersion = automationExecutionMetadata.getDocumentVersion();
            jsonWriter.name("DocumentVersion");
            jsonWriter.value(documentVersion);
        }
        if (automationExecutionMetadata.getAutomationExecutionStatus() != null) {
            String automationExecutionStatus = automationExecutionMetadata
                    .getAutomationExecutionStatus();
            jsonWriter.name("AutomationExecutionStatus");
            jsonWriter.value(automationExecutionStatus);
        }
        if (automationExecutionMetadata.getExecutionStartTime() != null) {
            java.util.Date executionStartTime = automationExecutionMetadata.getExecutionStartTime();
            jsonWriter.name("ExecutionStartTime");
            jsonWriter.value(executionStartTime);
        }
        if (automationExecutionMetadata.getExecutionEndTime() != null) {
            java.util.Date executionEndTime = automationExecutionMetadata.getExecutionEndTime();
            jsonWriter.name("ExecutionEndTime");
            jsonWriter.value(executionEndTime);
        }
        if (automationExecutionMetadata.getExecutedBy() != null) {
            String executedBy = automationExecutionMetadata.getExecutedBy();
            jsonWriter.name("ExecutedBy");
            jsonWriter.value(executedBy);
        }
        if (automationExecutionMetadata.getLogFile() != null) {
            String logFile = automationExecutionMetadata.getLogFile();
            jsonWriter.name("LogFile");
            jsonWriter.value(logFile);
        }
        if (automationExecutionMetadata.getOutputs() != null) {
            java.util.Map<String, java.util.List<String>> outputs = automationExecutionMetadata
                    .getOutputs();
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
        if (automationExecutionMetadata.getMode() != null) {
            String mode = automationExecutionMetadata.getMode();
            jsonWriter.name("Mode");
            jsonWriter.value(mode);
        }
        if (automationExecutionMetadata.getParentAutomationExecutionId() != null) {
            String parentAutomationExecutionId = automationExecutionMetadata
                    .getParentAutomationExecutionId();
            jsonWriter.name("ParentAutomationExecutionId");
            jsonWriter.value(parentAutomationExecutionId);
        }
        if (automationExecutionMetadata.getCurrentStepName() != null) {
            String currentStepName = automationExecutionMetadata.getCurrentStepName();
            jsonWriter.name("CurrentStepName");
            jsonWriter.value(currentStepName);
        }
        if (automationExecutionMetadata.getCurrentAction() != null) {
            String currentAction = automationExecutionMetadata.getCurrentAction();
            jsonWriter.name("CurrentAction");
            jsonWriter.value(currentAction);
        }
        if (automationExecutionMetadata.getFailureMessage() != null) {
            String failureMessage = automationExecutionMetadata.getFailureMessage();
            jsonWriter.name("FailureMessage");
            jsonWriter.value(failureMessage);
        }
        if (automationExecutionMetadata.getTargetParameterName() != null) {
            String targetParameterName = automationExecutionMetadata.getTargetParameterName();
            jsonWriter.name("TargetParameterName");
            jsonWriter.value(targetParameterName);
        }
        if (automationExecutionMetadata.getTargets() != null) {
            java.util.List<Target> targets = automationExecutionMetadata.getTargets();
            jsonWriter.name("Targets");
            jsonWriter.beginArray();
            for (Target targetsItem : targets) {
                if (targetsItem != null) {
                    TargetJsonMarshaller.getInstance().marshall(targetsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (automationExecutionMetadata.getTargetMaps() != null) {
            java.util.List<java.util.Map<String, java.util.List<String>>> targetMaps = automationExecutionMetadata
                    .getTargetMaps();
            jsonWriter.name("TargetMaps");
            jsonWriter.beginArray();
            for (java.util.Map<String, java.util.List<String>> targetMapsItem : targetMaps) {
                if (targetMapsItem != null) {
                    jsonWriter.beginObject();
                    for (java.util.Map.Entry<String, java.util.List<String>> targetMapsItemEntry : targetMapsItem
                            .entrySet()) {
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
        if (automationExecutionMetadata.getResolvedTargets() != null) {
            ResolvedTargets resolvedTargets = automationExecutionMetadata.getResolvedTargets();
            jsonWriter.name("ResolvedTargets");
            ResolvedTargetsJsonMarshaller.getInstance().marshall(resolvedTargets, jsonWriter);
        }
        if (automationExecutionMetadata.getMaxConcurrency() != null) {
            String maxConcurrency = automationExecutionMetadata.getMaxConcurrency();
            jsonWriter.name("MaxConcurrency");
            jsonWriter.value(maxConcurrency);
        }
        if (automationExecutionMetadata.getMaxErrors() != null) {
            String maxErrors = automationExecutionMetadata.getMaxErrors();
            jsonWriter.name("MaxErrors");
            jsonWriter.value(maxErrors);
        }
        if (automationExecutionMetadata.getTarget() != null) {
            String target = automationExecutionMetadata.getTarget();
            jsonWriter.name("Target");
            jsonWriter.value(target);
        }
        if (automationExecutionMetadata.getAutomationType() != null) {
            String automationType = automationExecutionMetadata.getAutomationType();
            jsonWriter.name("AutomationType");
            jsonWriter.value(automationType);
        }
        jsonWriter.endObject();
    }

    private static AutomationExecutionMetadataJsonMarshaller instance;

    public static AutomationExecutionMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutomationExecutionMetadataJsonMarshaller();
        return instance;
    }
}
