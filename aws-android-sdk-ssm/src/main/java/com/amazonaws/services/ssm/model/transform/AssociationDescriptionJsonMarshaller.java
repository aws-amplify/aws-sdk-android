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
 * JSON marshaller for POJO AssociationDescription
 */
class AssociationDescriptionJsonMarshaller {

    public void marshall(AssociationDescription associationDescription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (associationDescription.getName() != null) {
            String name = associationDescription.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (associationDescription.getInstanceId() != null) {
            String instanceId = associationDescription.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (associationDescription.getAssociationVersion() != null) {
            String associationVersion = associationDescription.getAssociationVersion();
            jsonWriter.name("AssociationVersion");
            jsonWriter.value(associationVersion);
        }
        if (associationDescription.getDate() != null) {
            java.util.Date dateValue = associationDescription.getDate();
            jsonWriter.name("Date");
            jsonWriter.value(dateValue);
        }
        if (associationDescription.getLastUpdateAssociationDate() != null) {
            java.util.Date lastUpdateAssociationDate = associationDescription
                    .getLastUpdateAssociationDate();
            jsonWriter.name("LastUpdateAssociationDate");
            jsonWriter.value(lastUpdateAssociationDate);
        }
        if (associationDescription.getStatus() != null) {
            AssociationStatus status = associationDescription.getStatus();
            jsonWriter.name("Status");
            AssociationStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (associationDescription.getOverview() != null) {
            AssociationOverview overview = associationDescription.getOverview();
            jsonWriter.name("Overview");
            AssociationOverviewJsonMarshaller.getInstance().marshall(overview, jsonWriter);
        }
        if (associationDescription.getDocumentVersion() != null) {
            String documentVersion = associationDescription.getDocumentVersion();
            jsonWriter.name("DocumentVersion");
            jsonWriter.value(documentVersion);
        }
        if (associationDescription.getAutomationTargetParameterName() != null) {
            String automationTargetParameterName = associationDescription
                    .getAutomationTargetParameterName();
            jsonWriter.name("AutomationTargetParameterName");
            jsonWriter.value(automationTargetParameterName);
        }
        if (associationDescription.getParameters() != null) {
            java.util.Map<String, java.util.List<String>> parameters = associationDescription
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
        if (associationDescription.getAssociationId() != null) {
            String associationId = associationDescription.getAssociationId();
            jsonWriter.name("AssociationId");
            jsonWriter.value(associationId);
        }
        if (associationDescription.getTargets() != null) {
            java.util.List<Target> targets = associationDescription.getTargets();
            jsonWriter.name("Targets");
            jsonWriter.beginArray();
            for (Target targetsItem : targets) {
                if (targetsItem != null) {
                    TargetJsonMarshaller.getInstance().marshall(targetsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (associationDescription.getScheduleExpression() != null) {
            String scheduleExpression = associationDescription.getScheduleExpression();
            jsonWriter.name("ScheduleExpression");
            jsonWriter.value(scheduleExpression);
        }
        if (associationDescription.getOutputLocation() != null) {
            InstanceAssociationOutputLocation outputLocation = associationDescription
                    .getOutputLocation();
            jsonWriter.name("OutputLocation");
            InstanceAssociationOutputLocationJsonMarshaller.getInstance().marshall(outputLocation,
                    jsonWriter);
        }
        if (associationDescription.getLastExecutionDate() != null) {
            java.util.Date lastExecutionDate = associationDescription.getLastExecutionDate();
            jsonWriter.name("LastExecutionDate");
            jsonWriter.value(lastExecutionDate);
        }
        if (associationDescription.getLastSuccessfulExecutionDate() != null) {
            java.util.Date lastSuccessfulExecutionDate = associationDescription
                    .getLastSuccessfulExecutionDate();
            jsonWriter.name("LastSuccessfulExecutionDate");
            jsonWriter.value(lastSuccessfulExecutionDate);
        }
        if (associationDescription.getAssociationName() != null) {
            String associationName = associationDescription.getAssociationName();
            jsonWriter.name("AssociationName");
            jsonWriter.value(associationName);
        }
        if (associationDescription.getMaxErrors() != null) {
            String maxErrors = associationDescription.getMaxErrors();
            jsonWriter.name("MaxErrors");
            jsonWriter.value(maxErrors);
        }
        if (associationDescription.getMaxConcurrency() != null) {
            String maxConcurrency = associationDescription.getMaxConcurrency();
            jsonWriter.name("MaxConcurrency");
            jsonWriter.value(maxConcurrency);
        }
        if (associationDescription.getComplianceSeverity() != null) {
            String complianceSeverity = associationDescription.getComplianceSeverity();
            jsonWriter.name("ComplianceSeverity");
            jsonWriter.value(complianceSeverity);
        }
        if (associationDescription.getSyncCompliance() != null) {
            String syncCompliance = associationDescription.getSyncCompliance();
            jsonWriter.name("SyncCompliance");
            jsonWriter.value(syncCompliance);
        }
        if (associationDescription.getApplyOnlyAtCronInterval() != null) {
            Boolean applyOnlyAtCronInterval = associationDescription.getApplyOnlyAtCronInterval();
            jsonWriter.name("ApplyOnlyAtCronInterval");
            jsonWriter.value(applyOnlyAtCronInterval);
        }
        jsonWriter.endObject();
    }

    private static AssociationDescriptionJsonMarshaller instance;

    public static AssociationDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssociationDescriptionJsonMarshaller();
        return instance;
    }
}
