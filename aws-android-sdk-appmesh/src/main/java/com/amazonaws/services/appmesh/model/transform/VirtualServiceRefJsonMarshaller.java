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
 * JSON marshaller for POJO VirtualServiceRef
 */
class VirtualServiceRefJsonMarshaller {

    public void marshall(VirtualServiceRef virtualServiceRef, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (virtualServiceRef.getArn() != null) {
            String arn = virtualServiceRef.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (virtualServiceRef.getCreatedAt() != null) {
            java.util.Date createdAt = virtualServiceRef.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (virtualServiceRef.getLastUpdatedAt() != null) {
            java.util.Date lastUpdatedAt = virtualServiceRef.getLastUpdatedAt();
            jsonWriter.name("lastUpdatedAt");
            jsonWriter.value(lastUpdatedAt);
        }
        if (virtualServiceRef.getMeshName() != null) {
            String meshName = virtualServiceRef.getMeshName();
            jsonWriter.name("meshName");
            jsonWriter.value(meshName);
        }
        if (virtualServiceRef.getMeshOwner() != null) {
            String meshOwner = virtualServiceRef.getMeshOwner();
            jsonWriter.name("meshOwner");
            jsonWriter.value(meshOwner);
        }
        if (virtualServiceRef.getResourceOwner() != null) {
            String resourceOwner = virtualServiceRef.getResourceOwner();
            jsonWriter.name("resourceOwner");
            jsonWriter.value(resourceOwner);
        }
        if (virtualServiceRef.getVersion() != null) {
            Long version = virtualServiceRef.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        if (virtualServiceRef.getVirtualServiceName() != null) {
            String virtualServiceName = virtualServiceRef.getVirtualServiceName();
            jsonWriter.name("virtualServiceName");
            jsonWriter.value(virtualServiceName);
        }
        jsonWriter.endObject();
    }

    private static VirtualServiceRefJsonMarshaller instance;

    public static VirtualServiceRefJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VirtualServiceRefJsonMarshaller();
        return instance;
    }
}
