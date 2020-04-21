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

package com.amazonaws.services.amazonguardduty.model.transform;

import com.amazonaws.services.amazonguardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Finding
 */
class FindingJsonMarshaller {

    public void marshall(Finding finding, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (finding.getAccountId() != null) {
            String accountId = finding.getAccountId();
            jsonWriter.name("AccountId");
            jsonWriter.value(accountId);
        }
        if (finding.getArn() != null) {
            String arn = finding.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (finding.getConfidence() != null) {
            Double confidence = finding.getConfidence();
            jsonWriter.name("Confidence");
            jsonWriter.value(confidence);
        }
        if (finding.getCreatedAt() != null) {
            String createdAt = finding.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.value(createdAt);
        }
        if (finding.getDescription() != null) {
            String description = finding.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (finding.getId() != null) {
            String id = finding.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (finding.getPartition() != null) {
            String partition = finding.getPartition();
            jsonWriter.name("Partition");
            jsonWriter.value(partition);
        }
        if (finding.getRegion() != null) {
            String region = finding.getRegion();
            jsonWriter.name("Region");
            jsonWriter.value(region);
        }
        if (finding.getResource() != null) {
            Resource resource = finding.getResource();
            jsonWriter.name("Resource");
            ResourceJsonMarshaller.getInstance().marshall(resource, jsonWriter);
        }
        if (finding.getSchemaVersion() != null) {
            String schemaVersion = finding.getSchemaVersion();
            jsonWriter.name("SchemaVersion");
            jsonWriter.value(schemaVersion);
        }
        if (finding.getService() != null) {
            Service service = finding.getService();
            jsonWriter.name("Service");
            ServiceJsonMarshaller.getInstance().marshall(service, jsonWriter);
        }
        if (finding.getSeverity() != null) {
            Double severity = finding.getSeverity();
            jsonWriter.name("Severity");
            jsonWriter.value(severity);
        }
        if (finding.getTitle() != null) {
            String title = finding.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        if (finding.getType() != null) {
            String type = finding.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (finding.getUpdatedAt() != null) {
            String updatedAt = finding.getUpdatedAt();
            jsonWriter.name("UpdatedAt");
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
