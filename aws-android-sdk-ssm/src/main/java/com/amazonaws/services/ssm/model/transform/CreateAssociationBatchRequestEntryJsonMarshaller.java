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
 * JSON marshaller for POJO CreateAssociationBatchRequestEntry
 */
class CreateAssociationBatchRequestEntryJsonMarshaller {

    public void marshall(CreateAssociationBatchRequestEntry createAssociationBatchRequestEntry,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (createAssociationBatchRequestEntry.getName() != null) {
            String name = createAssociationBatchRequestEntry.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (createAssociationBatchRequestEntry.getInstanceId() != null) {
            String instanceId = createAssociationBatchRequestEntry.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (createAssociationBatchRequestEntry.getParameters() != null) {
            java.util.Map<String, java.util.List<String>> parameters = createAssociationBatchRequestEntry
                    .getParameters();
            jsonWriter.name("Parameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.List<String>> parametersEntry : parameters
                    .entrySet()) {
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
        if (createAssociationBatchRequestEntry.getAutomationTargetParameterName() != null) {
            String automationTargetParameterName = createAssociationBatchRequestEntry
                    .getAutomationTargetParameterName();
            jsonWriter.name("AutomationTargetParameterName");
            jsonWriter.value(automationTargetParameterName);
        }
        if (createAssociationBatchRequestEntry.getDocumentVersion() != null) {
            String documentVersion = createAssociationBatchRequestEntry.getDocumentVersion();
            jsonWriter.name("DocumentVersion");
            jsonWriter.value(documentVersion);
        }
        if (createAssociationBatchRequestEntry.getTargets() != null) {
            java.util.List<Target> targets = createAssociationBatchRequestEntry.getTargets();
            jsonWriter.name("Targets");
            jsonWriter.beginArray();
            for (Target targetsItem : targets) {
                if (targetsItem != null) {
                    TargetJsonMarshaller.getInstance().marshall(targetsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (createAssociationBatchRequestEntry.getScheduleExpression() != null) {
            String scheduleExpression = createAssociationBatchRequestEntry.getScheduleExpression();
            jsonWriter.name("ScheduleExpression");
            jsonWriter.value(scheduleExpression);
        }
        if (createAssociationBatchRequestEntry.getOutputLocation() != null) {
            InstanceAssociationOutputLocation outputLocation = createAssociationBatchRequestEntry
                    .getOutputLocation();
            jsonWriter.name("OutputLocation");
            InstanceAssociationOutputLocationJsonMarshaller.getInstance().marshall(outputLocation,
                    jsonWriter);
        }
        if (createAssociationBatchRequestEntry.getAssociationName() != null) {
            String associationName = createAssociationBatchRequestEntry.getAssociationName();
            jsonWriter.name("AssociationName");
            jsonWriter.value(associationName);
        }
        if (createAssociationBatchRequestEntry.getMaxErrors() != null) {
            String maxErrors = createAssociationBatchRequestEntry.getMaxErrors();
            jsonWriter.name("MaxErrors");
            jsonWriter.value(maxErrors);
        }
        if (createAssociationBatchRequestEntry.getMaxConcurrency() != null) {
            String maxConcurrency = createAssociationBatchRequestEntry.getMaxConcurrency();
            jsonWriter.name("MaxConcurrency");
            jsonWriter.value(maxConcurrency);
        }
        if (createAssociationBatchRequestEntry.getComplianceSeverity() != null) {
            String complianceSeverity = createAssociationBatchRequestEntry.getComplianceSeverity();
            jsonWriter.name("ComplianceSeverity");
            jsonWriter.value(complianceSeverity);
        }
        if (createAssociationBatchRequestEntry.getSyncCompliance() != null) {
            String syncCompliance = createAssociationBatchRequestEntry.getSyncCompliance();
            jsonWriter.name("SyncCompliance");
            jsonWriter.value(syncCompliance);
        }
        if (createAssociationBatchRequestEntry.getApplyOnlyAtCronInterval() != null) {
            Boolean applyOnlyAtCronInterval = createAssociationBatchRequestEntry
                    .getApplyOnlyAtCronInterval();
            jsonWriter.name("ApplyOnlyAtCronInterval");
            jsonWriter.value(applyOnlyAtCronInterval);
        }
        jsonWriter.endObject();
    }

    private static CreateAssociationBatchRequestEntryJsonMarshaller instance;

    public static CreateAssociationBatchRequestEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreateAssociationBatchRequestEntryJsonMarshaller();
        return instance;
    }
}
