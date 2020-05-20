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
 * JSON unmarshaller for POJO ResourceMetadata
 */
class ResourceMetadataJsonUnmarshaller implements
        Unmarshaller<ResourceMetadata, JsonUnmarshallerContext> {

    public ResourceMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ResourceMetadata resourceMetadata = new ResourceMetadata();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("arn")) {
                resourceMetadata.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdAt")) {
                resourceMetadata.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedAt")) {
                resourceMetadata.setLastUpdatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("meshOwner")) {
                resourceMetadata.setMeshOwner(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceOwner")) {
                resourceMetadata.setResourceOwner(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("uid")) {
                resourceMetadata.setUid(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                resourceMetadata.setVersion(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return resourceMetadata;
    }

    private static ResourceMetadataJsonUnmarshaller instance;

    public static ResourceMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceMetadataJsonUnmarshaller();
        return instance;
    }
}
