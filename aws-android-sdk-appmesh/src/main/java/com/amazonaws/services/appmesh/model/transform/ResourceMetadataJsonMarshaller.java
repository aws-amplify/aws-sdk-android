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

package com.amazonaws.services.appmesh.model.transform;

import com.amazonaws.services.appmesh.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResourceMetadata
 */
class ResourceMetadataJsonMarshaller {

    public void marshall(ResourceMetadata resourceMetadata, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (resourceMetadata.getArn() != null) {
            String arn = resourceMetadata.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (resourceMetadata.getCreatedAt() != null) {
            java.util.Date createdAt = resourceMetadata.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (resourceMetadata.getLastUpdatedAt() != null) {
            java.util.Date lastUpdatedAt = resourceMetadata.getLastUpdatedAt();
            jsonWriter.name("lastUpdatedAt");
            jsonWriter.value(lastUpdatedAt);
        }
        if (resourceMetadata.getMeshOwner() != null) {
            String meshOwner = resourceMetadata.getMeshOwner();
            jsonWriter.name("meshOwner");
            jsonWriter.value(meshOwner);
        }
        if (resourceMetadata.getResourceOwner() != null) {
            String resourceOwner = resourceMetadata.getResourceOwner();
            jsonWriter.name("resourceOwner");
            jsonWriter.value(resourceOwner);
        }
        if (resourceMetadata.getUid() != null) {
            String uid = resourceMetadata.getUid();
            jsonWriter.name("uid");
            jsonWriter.value(uid);
        }
        if (resourceMetadata.getVersion() != null) {
            Long version = resourceMetadata.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static ResourceMetadataJsonMarshaller instance;

    public static ResourceMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceMetadataJsonMarshaller();
        return instance;
    }
}
