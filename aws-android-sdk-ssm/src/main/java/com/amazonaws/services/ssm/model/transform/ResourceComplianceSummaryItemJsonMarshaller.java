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
 * JSON marshaller for POJO ResourceComplianceSummaryItem
 */
class ResourceComplianceSummaryItemJsonMarshaller {

    public void marshall(ResourceComplianceSummaryItem resourceComplianceSummaryItem,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resourceComplianceSummaryItem.getComplianceType() != null) {
            String complianceType = resourceComplianceSummaryItem.getComplianceType();
            jsonWriter.name("ComplianceType");
            jsonWriter.value(complianceType);
        }
        if (resourceComplianceSummaryItem.getResourceType() != null) {
            String resourceType = resourceComplianceSummaryItem.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        if (resourceComplianceSummaryItem.getResourceId() != null) {
            String resourceId = resourceComplianceSummaryItem.getResourceId();
            jsonWriter.name("ResourceId");
            jsonWriter.value(resourceId);
        }
        if (resourceComplianceSummaryItem.getStatus() != null) {
            String status = resourceComplianceSummaryItem.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (resourceComplianceSummaryItem.getOverallSeverity() != null) {
            String overallSeverity = resourceComplianceSummaryItem.getOverallSeverity();
            jsonWriter.name("OverallSeverity");
            jsonWriter.value(overallSeverity);
        }
        if (resourceComplianceSummaryItem.getExecutionSummary() != null) {
            ComplianceExecutionSummary executionSummary = resourceComplianceSummaryItem
                    .getExecutionSummary();
            jsonWriter.name("ExecutionSummary");
            ComplianceExecutionSummaryJsonMarshaller.getInstance().marshall(executionSummary,
                    jsonWriter);
        }
        if (resourceComplianceSummaryItem.getCompliantSummary() != null) {
            CompliantSummary compliantSummary = resourceComplianceSummaryItem.getCompliantSummary();
            jsonWriter.name("CompliantSummary");
            CompliantSummaryJsonMarshaller.getInstance().marshall(compliantSummary, jsonWriter);
        }
        if (resourceComplianceSummaryItem.getNonCompliantSummary() != null) {
            NonCompliantSummary nonCompliantSummary = resourceComplianceSummaryItem
                    .getNonCompliantSummary();
            jsonWriter.name("NonCompliantSummary");
            NonCompliantSummaryJsonMarshaller.getInstance().marshall(nonCompliantSummary,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ResourceComplianceSummaryItemJsonMarshaller instance;

    public static ResourceComplianceSummaryItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceComplianceSummaryItemJsonMarshaller();
        return instance;
    }
}
