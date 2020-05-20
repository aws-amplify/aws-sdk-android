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
 * JSON marshaller for POJO VirtualNodeData
 */
class VirtualNodeDataJsonMarshaller {

    public void marshall(VirtualNodeData virtualNodeData, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (virtualNodeData.getMeshName() != null) {
            String meshName = virtualNodeData.getMeshName();
            jsonWriter.name("meshName");
            jsonWriter.value(meshName);
        }
        if (virtualNodeData.getMetadata() != null) {
            ResourceMetadata metadata = virtualNodeData.getMetadata();
            jsonWriter.name("metadata");
            ResourceMetadataJsonMarshaller.getInstance().marshall(metadata, jsonWriter);
        }
        if (virtualNodeData.getSpec() != null) {
            VirtualNodeSpec spec = virtualNodeData.getSpec();
            jsonWriter.name("spec");
            VirtualNodeSpecJsonMarshaller.getInstance().marshall(spec, jsonWriter);
        }
        if (virtualNodeData.getStatus() != null) {
            VirtualNodeStatus status = virtualNodeData.getStatus();
            jsonWriter.name("status");
            VirtualNodeStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (virtualNodeData.getVirtualNodeName() != null) {
            String virtualNodeName = virtualNodeData.getVirtualNodeName();
            jsonWriter.name("virtualNodeName");
            jsonWriter.value(virtualNodeName);
        }
        jsonWriter.endObject();
    }

    private static VirtualNodeDataJsonMarshaller instance;

    public static VirtualNodeDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VirtualNodeDataJsonMarshaller();
        return instance;
    }
}
