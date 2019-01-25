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
 * JSON marshaller for POJO AuditFinding
 */
class AuditFindingJsonMarshaller {

    public void marshall(AuditFinding auditFinding, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (auditFinding.getTaskId() != null) {
            String taskId = auditFinding.getTaskId();
            jsonWriter.name("taskId");
            jsonWriter.value(taskId);
        }
        if (auditFinding.getCheckName() != null) {
            String checkName = auditFinding.getCheckName();
            jsonWriter.name("checkName");
            jsonWriter.value(checkName);
        }
        if (auditFinding.getTaskStartTime() != null) {
            java.util.Date taskStartTime = auditFinding.getTaskStartTime();
            jsonWriter.name("taskStartTime");
            jsonWriter.value(taskStartTime);
        }
        if (auditFinding.getFindingTime() != null) {
            java.util.Date findingTime = auditFinding.getFindingTime();
            jsonWriter.name("findingTime");
            jsonWriter.value(findingTime);
        }
        if (auditFinding.getSeverity() != null) {
            String severity = auditFinding.getSeverity();
            jsonWriter.name("severity");
            jsonWriter.value(severity);
        }
        if (auditFinding.getNonCompliantResource() != null) {
            NonCompliantResource nonCompliantResource = auditFinding.getNonCompliantResource();
            jsonWriter.name("nonCompliantResource");
            NonCompliantResourceJsonMarshaller.getInstance().marshall(nonCompliantResource,
                    jsonWriter);
        }
        if (auditFinding.getRelatedResources() != null) {
            java.util.List<RelatedResource> relatedResources = auditFinding.getRelatedResources();
            jsonWriter.name("relatedResources");
            jsonWriter.beginArray();
            for (RelatedResource relatedResourcesItem : relatedResources) {
                if (relatedResourcesItem != null) {
                    RelatedResourceJsonMarshaller.getInstance().marshall(relatedResourcesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (auditFinding.getReasonForNonCompliance() != null) {
            String reasonForNonCompliance = auditFinding.getReasonForNonCompliance();
            jsonWriter.name("reasonForNonCompliance");
            jsonWriter.value(reasonForNonCompliance);
        }
        if (auditFinding.getReasonForNonComplianceCode() != null) {
            String reasonForNonComplianceCode = auditFinding.getReasonForNonComplianceCode();
            jsonWriter.name("reasonForNonComplianceCode");
            jsonWriter.value(reasonForNonComplianceCode);
        }
        jsonWriter.endObject();
    }

    private static AuditFindingJsonMarshaller instance;

    public static AuditFindingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AuditFindingJsonMarshaller();
        return instance;
    }
}
