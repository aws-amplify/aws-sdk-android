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
 * JSON marshaller for POJO AssociationVersionInfo
 */
class AssociationVersionInfoJsonMarshaller {

    public void marshall(AssociationVersionInfo associationVersionInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (associationVersionInfo.getAssociationId() != null) {
            String associationId = associationVersionInfo.getAssociationId();
            jsonWriter.name("AssociationId");
            jsonWriter.value(associationId);
        }
        if (associationVersionInfo.getAssociationVersion() != null) {
            String associationVersion = associationVersionInfo.getAssociationVersion();
            jsonWriter.name("AssociationVersion");
            jsonWriter.value(associationVersion);
        }
        if (associationVersionInfo.getCreatedDate() != null) {
            java.util.Date createdDate = associationVersionInfo.getCreatedDate();
            jsonWriter.name("CreatedDate");
            jsonWriter.value(createdDate);
        }
        if (associationVersionInfo.getName() != null) {
            String name = associationVersionInfo.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (associationVersionInfo.getDocumentVersion() != null) {
            String documentVersion = associationVersionInfo.getDocumentVersion();
            jsonWriter.name("DocumentVersion");
            jsonWriter.value(documentVersion);
        }
        if (associationVersionInfo.getParameters() != null) {
            java.util.Map<String, java.util.List<String>> parameters = associationVersionInfo.getParameters();
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
        if (associationVersionInfo.getTargets() != null) {
            java.util.List<Target> targets = associationVersionInfo.getTargets();
            jsonWriter.name("Targets");
            jsonWriter.beginArray();
            for (Target targetsItem : targets) {
                if (targetsItem != null) {
            TargetJsonMarshaller.getInstance().marshall(targetsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (associationVersionInfo.getScheduleExpression() != null) {
            String scheduleExpression = associationVersionInfo.getScheduleExpression();
            jsonWriter.name("ScheduleExpression");
            jsonWriter.value(scheduleExpression);
        }
        if (associationVersionInfo.getOutputLocation() != null) {
            InstanceAssociationOutputLocation outputLocation = associationVersionInfo.getOutputLocation();
            jsonWriter.name("OutputLocation");
            InstanceAssociationOutputLocationJsonMarshaller.getInstance().marshall(outputLocation, jsonWriter);
        }
        if (associationVersionInfo.getAssociationName() != null) {
            String associationName = associationVersionInfo.getAssociationName();
            jsonWriter.name("AssociationName");
            jsonWriter.value(associationName);
        }
        if (associationVersionInfo.getMaxErrors() != null) {
            String maxErrors = associationVersionInfo.getMaxErrors();
            jsonWriter.name("MaxErrors");
            jsonWriter.value(maxErrors);
        }
        if (associationVersionInfo.getMaxConcurrency() != null) {
            String maxConcurrency = associationVersionInfo.getMaxConcurrency();
            jsonWriter.name("MaxConcurrency");
            jsonWriter.value(maxConcurrency);
        }
        if (associationVersionInfo.getComplianceSeverity() != null) {
            String complianceSeverity = associationVersionInfo.getComplianceSeverity();
            jsonWriter.name("ComplianceSeverity");
            jsonWriter.value(complianceSeverity);
        }
        if (associationVersionInfo.getSyncCompliance() != null) {
            String syncCompliance = associationVersionInfo.getSyncCompliance();
            jsonWriter.name("SyncCompliance");
            jsonWriter.value(syncCompliance);
        }
        if (associationVersionInfo.getApplyOnlyAtCronInterval() != null) {
            Boolean applyOnlyAtCronInterval = associationVersionInfo.getApplyOnlyAtCronInterval();
            jsonWriter.name("ApplyOnlyAtCronInterval");
            jsonWriter.value(applyOnlyAtCronInterval);
        }
        jsonWriter.endObject();
    }

    private static AssociationVersionInfoJsonMarshaller instance;
    public static AssociationVersionInfoJsonMarshaller getInstance() {
        if (instance == null) instance = new AssociationVersionInfoJsonMarshaller();
        return instance;
    }
}
