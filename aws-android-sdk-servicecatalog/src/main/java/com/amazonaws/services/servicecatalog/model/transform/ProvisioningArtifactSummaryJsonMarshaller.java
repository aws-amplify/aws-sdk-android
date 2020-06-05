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

package com.amazonaws.services.servicecatalog.model.transform;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ProvisioningArtifactSummary
 */
class ProvisioningArtifactSummaryJsonMarshaller {

    public void marshall(ProvisioningArtifactSummary provisioningArtifactSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (provisioningArtifactSummary.getId() != null) {
            String id = provisioningArtifactSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (provisioningArtifactSummary.getName() != null) {
            String name = provisioningArtifactSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (provisioningArtifactSummary.getDescription() != null) {
            String description = provisioningArtifactSummary.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (provisioningArtifactSummary.getCreatedTime() != null) {
            java.util.Date createdTime = provisioningArtifactSummary.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (provisioningArtifactSummary.getProvisioningArtifactMetadata() != null) {
            java.util.Map<String, String> provisioningArtifactMetadata = provisioningArtifactSummary
                    .getProvisioningArtifactMetadata();
            jsonWriter.name("ProvisioningArtifactMetadata");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> provisioningArtifactMetadataEntry : provisioningArtifactMetadata
                    .entrySet()) {
                String provisioningArtifactMetadataValue = provisioningArtifactMetadataEntry
                        .getValue();
                if (provisioningArtifactMetadataValue != null) {
                    jsonWriter.name(provisioningArtifactMetadataEntry.getKey());
                    jsonWriter.value(provisioningArtifactMetadataValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static ProvisioningArtifactSummaryJsonMarshaller instance;

    public static ProvisioningArtifactSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProvisioningArtifactSummaryJsonMarshaller();
        return instance;
    }
}
