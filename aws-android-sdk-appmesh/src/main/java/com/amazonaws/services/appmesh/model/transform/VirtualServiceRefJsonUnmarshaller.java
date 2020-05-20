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
 * JSON unmarshaller for POJO VirtualServiceRef
 */
class VirtualServiceRefJsonUnmarshaller implements
        Unmarshaller<VirtualServiceRef, JsonUnmarshallerContext> {

    public VirtualServiceRef unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        VirtualServiceRef virtualServiceRef = new VirtualServiceRef();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("arn")) {
                virtualServiceRef.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdAt")) {
                virtualServiceRef.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedAt")) {
                virtualServiceRef.setLastUpdatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("meshName")) {
                virtualServiceRef.setMeshName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("meshOwner")) {
                virtualServiceRef.setMeshOwner(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceOwner")) {
                virtualServiceRef.setResourceOwner(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                virtualServiceRef.setVersion(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualServiceName")) {
                virtualServiceRef.setVirtualServiceName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return virtualServiceRef;
    }

    private static VirtualServiceRefJsonUnmarshaller instance;

    public static VirtualServiceRefJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VirtualServiceRefJsonUnmarshaller();
        return instance;
    }
}
