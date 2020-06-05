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
 * JSON marshaller for POJO ProvisioningArtifactDetail
 */
class ProvisioningArtifactDetailJsonMarshaller {

    public void marshall(ProvisioningArtifactDetail provisioningArtifactDetail,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (provisioningArtifactDetail.getId() != null) {
            String id = provisioningArtifactDetail.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (provisioningArtifactDetail.getName() != null) {
            String name = provisioningArtifactDetail.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (provisioningArtifactDetail.getDescription() != null) {
            String description = provisioningArtifactDetail.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (provisioningArtifactDetail.getType() != null) {
            String type = provisioningArtifactDetail.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (provisioningArtifactDetail.getCreatedTime() != null) {
            java.util.Date createdTime = provisioningArtifactDetail.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (provisioningArtifactDetail.getActive() != null) {
            Boolean active = provisioningArtifactDetail.getActive();
            jsonWriter.name("Active");
            jsonWriter.value(active);
        }
        if (provisioningArtifactDetail.getGuidance() != null) {
            String guidance = provisioningArtifactDetail.getGuidance();
            jsonWriter.name("Guidance");
            jsonWriter.value(guidance);
        }
        jsonWriter.endObject();
    }

    private static ProvisioningArtifactDetailJsonMarshaller instance;

    public static ProvisioningArtifactDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProvisioningArtifactDetailJsonMarshaller();
        return instance;
    }
}
