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
 * JSON marshaller for POJO VirtualRouterRef
 */
class VirtualRouterRefJsonMarshaller {

    public void marshall(VirtualRouterRef virtualRouterRef, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (virtualRouterRef.getArn() != null) {
            String arn = virtualRouterRef.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (virtualRouterRef.getCreatedAt() != null) {
            java.util.Date createdAt = virtualRouterRef.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (virtualRouterRef.getLastUpdatedAt() != null) {
            java.util.Date lastUpdatedAt = virtualRouterRef.getLastUpdatedAt();
            jsonWriter.name("lastUpdatedAt");
            jsonWriter.value(lastUpdatedAt);
        }
        if (virtualRouterRef.getMeshName() != null) {
            String meshName = virtualRouterRef.getMeshName();
            jsonWriter.name("meshName");
            jsonWriter.value(meshName);
        }
        if (virtualRouterRef.getMeshOwner() != null) {
            String meshOwner = virtualRouterRef.getMeshOwner();
            jsonWriter.name("meshOwner");
            jsonWriter.value(meshOwner);
        }
        if (virtualRouterRef.getResourceOwner() != null) {
            String resourceOwner = virtualRouterRef.getResourceOwner();
            jsonWriter.name("resourceOwner");
            jsonWriter.value(resourceOwner);
        }
        if (virtualRouterRef.getVersion() != null) {
            Long version = virtualRouterRef.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        if (virtualRouterRef.getVirtualRouterName() != null) {
            String virtualRouterName = virtualRouterRef.getVirtualRouterName();
            jsonWriter.name("virtualRouterName");
            jsonWriter.value(virtualRouterName);
        }
        jsonWriter.endObject();
    }

    private static VirtualRouterRefJsonMarshaller instance;

    public static VirtualRouterRefJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VirtualRouterRefJsonMarshaller();
        return instance;
    }
}
