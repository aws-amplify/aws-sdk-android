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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ComplianceItem
 */
class ComplianceItemJsonMarshaller {

    public void marshall(ComplianceItem complianceItem, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (complianceItem.getComplianceType() != null) {
            String complianceType = complianceItem.getComplianceType();
            jsonWriter.name("ComplianceType");
            jsonWriter.value(complianceType);
        }
        if (complianceItem.getResourceType() != null) {
            String resourceType = complianceItem.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        if (complianceItem.getResourceId() != null) {
            String resourceId = complianceItem.getResourceId();
            jsonWriter.name("ResourceId");
            jsonWriter.value(resourceId);
        }
        if (complianceItem.getId() != null) {
            String id = complianceItem.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (complianceItem.getTitle() != null) {
            String title = complianceItem.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        if (complianceItem.getStatus() != null) {
            String status = complianceItem.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (complianceItem.getSeverity() != null) {
            String severity = complianceItem.getSeverity();
            jsonWriter.name("Severity");
            jsonWriter.value(severity);
        }
        if (complianceItem.getExecutionSummary() != null) {
            ComplianceExecutionSummary executionSummary = complianceItem.getExecutionSummary();
            jsonWriter.name("ExecutionSummary");
            ComplianceExecutionSummaryJsonMarshaller.getInstance().marshall(executionSummary, jsonWriter);
        }
        if (complianceItem.getDetails() != null) {
            java.util.Map<String, String> details = complianceItem.getDetails();
            jsonWriter.name("Details");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> detailsEntry : details.entrySet()) {
                String detailsValue = detailsEntry.getValue();
                if (detailsValue != null) {
                    jsonWriter.name(detailsEntry.getKey());
            jsonWriter.value(detailsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static ComplianceItemJsonMarshaller instance;
    public static ComplianceItemJsonMarshaller getInstance() {
        if (instance == null) instance = new ComplianceItemJsonMarshaller();
        return instance;
    }
}
