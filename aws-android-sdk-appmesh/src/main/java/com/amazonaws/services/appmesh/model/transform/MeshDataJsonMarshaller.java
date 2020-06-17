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
 * JSON marshaller for POJO MeshData
 */
class MeshDataJsonMarshaller {

    public void marshall(MeshData meshData, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (meshData.getMeshName() != null) {
            String meshName = meshData.getMeshName();
            jsonWriter.name("meshName");
            jsonWriter.value(meshName);
        }
        if (meshData.getMetadata() != null) {
            ResourceMetadata metadata = meshData.getMetadata();
            jsonWriter.name("metadata");
            ResourceMetadataJsonMarshaller.getInstance().marshall(metadata, jsonWriter);
        }
        if (meshData.getSpec() != null) {
            MeshSpec spec = meshData.getSpec();
            jsonWriter.name("spec");
            MeshSpecJsonMarshaller.getInstance().marshall(spec, jsonWriter);
        }
        if (meshData.getStatus() != null) {
            MeshStatus status = meshData.getStatus();
            jsonWriter.name("status");
            MeshStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static MeshDataJsonMarshaller instance;

    public static MeshDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MeshDataJsonMarshaller();
        return instance;
    }
}
