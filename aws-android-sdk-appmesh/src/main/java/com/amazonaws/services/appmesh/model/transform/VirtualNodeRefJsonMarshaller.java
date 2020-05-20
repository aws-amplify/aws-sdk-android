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
 * JSON marshaller for POJO VirtualNodeRef
 */
class VirtualNodeRefJsonMarshaller {

    public void marshall(VirtualNodeRef virtualNodeRef, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (virtualNodeRef.getArn() != null) {
            String arn = virtualNodeRef.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (virtualNodeRef.getCreatedAt() != null) {
            java.util.Date createdAt = virtualNodeRef.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (virtualNodeRef.getLastUpdatedAt() != null) {
            java.util.Date lastUpdatedAt = virtualNodeRef.getLastUpdatedAt();
            jsonWriter.name("lastUpdatedAt");
            jsonWriter.value(lastUpdatedAt);
        }
        if (virtualNodeRef.getMeshName() != null) {
            String meshName = virtualNodeRef.getMeshName();
            jsonWriter.name("meshName");
            jsonWriter.value(meshName);
        }
        if (virtualNodeRef.getMeshOwner() != null) {
            String meshOwner = virtualNodeRef.getMeshOwner();
            jsonWriter.name("meshOwner");
            jsonWriter.value(meshOwner);
        }
        if (virtualNodeRef.getResourceOwner() != null) {
            String resourceOwner = virtualNodeRef.getResourceOwner();
            jsonWriter.name("resourceOwner");
            jsonWriter.value(resourceOwner);
        }
        if (virtualNodeRef.getVersion() != null) {
            Long version = virtualNodeRef.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        if (virtualNodeRef.getVirtualNodeName() != null) {
            String virtualNodeName = virtualNodeRef.getVirtualNodeName();
            jsonWriter.name("virtualNodeName");
            jsonWriter.value(virtualNodeName);
        }
        jsonWriter.endObject();
    }

    private static VirtualNodeRefJsonMarshaller instance;

    public static VirtualNodeRefJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VirtualNodeRefJsonMarshaller();
        return instance;
    }
}
