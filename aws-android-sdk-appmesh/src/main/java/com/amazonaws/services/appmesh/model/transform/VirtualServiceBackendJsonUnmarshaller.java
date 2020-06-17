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
 * JSON unmarshaller for POJO VirtualServiceBackend
 */
class VirtualServiceBackendJsonUnmarshaller implements
        Unmarshaller<VirtualServiceBackend, JsonUnmarshallerContext> {

    public VirtualServiceBackend unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        VirtualServiceBackend virtualServiceBackend = new VirtualServiceBackend();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("clientPolicy")) {
                virtualServiceBackend.setClientPolicy(ClientPolicyJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualServiceName")) {
                virtualServiceBackend.setVirtualServiceName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return virtualServiceBackend;
    }

    private static VirtualServiceBackendJsonUnmarshaller instance;

    public static VirtualServiceBackendJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VirtualServiceBackendJsonUnmarshaller();
        return instance;
    }
}
