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
 * JSON marshaller for POJO VirtualRouterData
 */
class VirtualRouterDataJsonMarshaller {

    public void marshall(VirtualRouterData virtualRouterData, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (virtualRouterData.getMeshName() != null) {
            String meshName = virtualRouterData.getMeshName();
            jsonWriter.name("meshName");
            jsonWriter.value(meshName);
        }
        if (virtualRouterData.getMetadata() != null) {
            ResourceMetadata metadata = virtualRouterData.getMetadata();
            jsonWriter.name("metadata");
            ResourceMetadataJsonMarshaller.getInstance().marshall(metadata, jsonWriter);
        }
        if (virtualRouterData.getSpec() != null) {
            VirtualRouterSpec spec = virtualRouterData.getSpec();
            jsonWriter.name("spec");
            VirtualRouterSpecJsonMarshaller.getInstance().marshall(spec, jsonWriter);
        }
        if (virtualRouterData.getStatus() != null) {
            VirtualRouterStatus status = virtualRouterData.getStatus();
            jsonWriter.name("status");
            VirtualRouterStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (virtualRouterData.getVirtualRouterName() != null) {
            String virtualRouterName = virtualRouterData.getVirtualRouterName();
            jsonWriter.name("virtualRouterName");
            jsonWriter.value(virtualRouterName);
        }
        jsonWriter.endObject();
    }

    private static VirtualRouterDataJsonMarshaller instance;

    public static VirtualRouterDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VirtualRouterDataJsonMarshaller();
        return instance;
    }
}
