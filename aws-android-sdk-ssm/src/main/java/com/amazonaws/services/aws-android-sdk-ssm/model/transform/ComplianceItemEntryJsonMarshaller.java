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
 * JSON marshaller for POJO ComplianceItemEntry
 */
class ComplianceItemEntryJsonMarshaller {

    public void marshall(ComplianceItemEntry complianceItemEntry, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (complianceItemEntry.getId() != null) {
            String id = complianceItemEntry.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (complianceItemEntry.getTitle() != null) {
            String title = complianceItemEntry.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        if (complianceItemEntry.getSeverity() != null) {
            String severity = complianceItemEntry.getSeverity();
            jsonWriter.name("Severity");
            jsonWriter.value(severity);
        }
        if (complianceItemEntry.getStatus() != null) {
            String status = complianceItemEntry.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (complianceItemEntry.getDetails() != null) {
            java.util.Map<String, String> details = complianceItemEntry.getDetails();
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

    private static ComplianceItemEntryJsonMarshaller instance;
    public static ComplianceItemEntryJsonMarshaller getInstance() {
        if (instance == null) instance = new ComplianceItemEntryJsonMarshaller();
        return instance;
    }
}
