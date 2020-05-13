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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Finding
 */
class FindingJsonMarshaller {

    public void marshall(Finding finding, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (finding.getAccountId() != null) {
            String accountId = finding.getAccountId();
            jsonWriter.name("accountId");
            jsonWriter.value(accountId);
        }
        if (finding.getArchived() != null) {
            Boolean archived = finding.getArchived();
            jsonWriter.name("archived");
            jsonWriter.value(archived);
        }
        if (finding.getCategory() != null) {
            String category = finding.getCategory();
            jsonWriter.name("category");
            jsonWriter.value(category);
        }
        if (finding.getClassificationDetails() != null) {
            ClassificationDetails classificationDetails = finding.getClassificationDetails();
            jsonWriter.name("classificationDetails");
            ClassificationDetailsJsonMarshaller.getInstance().marshall(classificationDetails,
                    jsonWriter);
        }
        if (finding.getCount() != null) {
            Long count = finding.getCount();
            jsonWriter.name("count");
            jsonWriter.value(count);
        }
        if (finding.getCreatedAt() != null) {
            java.util.Date createdAt = finding.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (finding.getDescription() != null) {
            String description = finding.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (finding.getId() != null) {
            String id = finding.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (finding.getPartition() != null) {
            String partition = finding.getPartition();
            jsonWriter.name("partition");
            jsonWriter.value(partition);
        }
        if (finding.getPolicyDetails() != null) {
            PolicyDetails policyDetails = finding.getPolicyDetails();
            jsonWriter.name("policyDetails");
            PolicyDetailsJsonMarshaller.getInstance().marshall(policyDetails, jsonWriter);
        }
        if (finding.getRegion() != null) {
            String region = finding.getRegion();
            jsonWriter.name("region");
            jsonWriter.value(region);
        }
        if (finding.getResourcesAffected() != null) {
            ResourcesAffected resourcesAffected = finding.getResourcesAffected();
            jsonWriter.name("resourcesAffected");
            ResourcesAffectedJsonMarshaller.getInstance().marshall(resourcesAffected, jsonWriter);
        }
        if (finding.getSample() != null) {
            Boolean sample = finding.getSample();
            jsonWriter.name("sample");
            jsonWriter.value(sample);
        }
        if (finding.getSchemaVersion() != null) {
            String schemaVersion = finding.getSchemaVersion();
            jsonWriter.name("schemaVersion");
            jsonWriter.value(schemaVersion);
        }
        if (finding.getSeverity() != null) {
            Severity severity = finding.getSeverity();
            jsonWriter.name("severity");
            SeverityJsonMarshaller.getInstance().marshall(severity, jsonWriter);
        }
        if (finding.getTitle() != null) {
            String title = finding.getTitle();
            jsonWriter.name("title");
            jsonWriter.value(title);
        }
        if (finding.getType() != null) {
            String type = finding.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (finding.getUpdatedAt() != null) {
            java.util.Date updatedAt = finding.getUpdatedAt();
            jsonWriter.name("updatedAt");
            jsonWriter.value(updatedAt);
        }
        jsonWriter.endObject();
    }

    private static FindingJsonMarshaller instance;

    public static FindingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FindingJsonMarshaller();
        return instance;
    }
}
