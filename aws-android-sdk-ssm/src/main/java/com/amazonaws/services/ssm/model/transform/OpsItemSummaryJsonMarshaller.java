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
 * JSON marshaller for POJO OpsItemSummary
 */
class OpsItemSummaryJsonMarshaller {

    public void marshall(OpsItemSummary opsItemSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (opsItemSummary.getCreatedBy() != null) {
            String createdBy = opsItemSummary.getCreatedBy();
            jsonWriter.name("CreatedBy");
            jsonWriter.value(createdBy);
        }
        if (opsItemSummary.getCreatedTime() != null) {
            java.util.Date createdTime = opsItemSummary.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (opsItemSummary.getLastModifiedBy() != null) {
            String lastModifiedBy = opsItemSummary.getLastModifiedBy();
            jsonWriter.name("LastModifiedBy");
            jsonWriter.value(lastModifiedBy);
        }
        if (opsItemSummary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = opsItemSummary.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (opsItemSummary.getPriority() != null) {
            Integer priority = opsItemSummary.getPriority();
            jsonWriter.name("Priority");
            jsonWriter.value(priority);
        }
        if (opsItemSummary.getSource() != null) {
            String source = opsItemSummary.getSource();
            jsonWriter.name("Source");
            jsonWriter.value(source);
        }
        if (opsItemSummary.getStatus() != null) {
            String status = opsItemSummary.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (opsItemSummary.getOpsItemId() != null) {
            String opsItemId = opsItemSummary.getOpsItemId();
            jsonWriter.name("OpsItemId");
            jsonWriter.value(opsItemId);
        }
        if (opsItemSummary.getTitle() != null) {
            String title = opsItemSummary.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        if (opsItemSummary.getOperationalData() != null) {
            java.util.Map<String, OpsItemDataValue> operationalData = opsItemSummary
                    .getOperationalData();
            jsonWriter.name("OperationalData");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, OpsItemDataValue> operationalDataEntry : operationalData
                    .entrySet()) {
                OpsItemDataValue operationalDataValue = operationalDataEntry.getValue();
                if (operationalDataValue != null) {
                    jsonWriter.name(operationalDataEntry.getKey());
                    OpsItemDataValueJsonMarshaller.getInstance().marshall(operationalDataValue,
                            jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (opsItemSummary.getCategory() != null) {
            String category = opsItemSummary.getCategory();
            jsonWriter.name("Category");
            jsonWriter.value(category);
        }
        if (opsItemSummary.getSeverity() != null) {
            String severity = opsItemSummary.getSeverity();
            jsonWriter.name("Severity");
            jsonWriter.value(severity);
        }
        jsonWriter.endObject();
    }

    private static OpsItemSummaryJsonMarshaller instance;

    public static OpsItemSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OpsItemSummaryJsonMarshaller();
        return instance;
    }
}
