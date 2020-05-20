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
 * JSON marshaller for POJO MeshRef
 */
class MeshRefJsonMarshaller {

    public void marshall(MeshRef meshRef, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (meshRef.getArn() != null) {
            String arn = meshRef.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (meshRef.getCreatedAt() != null) {
            java.util.Date createdAt = meshRef.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (meshRef.getLastUpdatedAt() != null) {
            java.util.Date lastUpdatedAt = meshRef.getLastUpdatedAt();
            jsonWriter.name("lastUpdatedAt");
            jsonWriter.value(lastUpdatedAt);
        }
        if (meshRef.getMeshName() != null) {
            String meshName = meshRef.getMeshName();
            jsonWriter.name("meshName");
            jsonWriter.value(meshName);
        }
        if (meshRef.getMeshOwner() != null) {
            String meshOwner = meshRef.getMeshOwner();
            jsonWriter.name("meshOwner");
            jsonWriter.value(meshOwner);
        }
        if (meshRef.getResourceOwner() != null) {
            String resourceOwner = meshRef.getResourceOwner();
            jsonWriter.name("resourceOwner");
            jsonWriter.value(resourceOwner);
        }
        if (meshRef.getVersion() != null) {
            Long version = meshRef.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static MeshRefJsonMarshaller instance;

    public static MeshRefJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MeshRefJsonMarshaller();
        return instance;
    }
}
