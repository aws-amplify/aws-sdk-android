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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MeshData
 */
class MeshDataJsonUnmarshaller implements Unmarshaller<MeshData, JsonUnmarshallerContext> {

    public MeshData unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MeshData meshData = new MeshData();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("meshName")) {
                meshData.setMeshName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("metadata")) {
                meshData.setMetadata(ResourceMetadataJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("spec")) {
                meshData.setSpec(MeshSpecJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                meshData.setStatus(MeshStatusJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return meshData;
    }

    private static MeshDataJsonUnmarshaller instance;

    public static MeshDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MeshDataJsonUnmarshaller();
        return instance;
    }
}
