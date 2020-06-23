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

package com.amazonaws.services.organizations.model.transform;

import com.amazonaws.services.organizations.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO HandshakeResource
 */
class HandshakeResourceJsonUnmarshaller implements
        Unmarshaller<HandshakeResource, JsonUnmarshallerContext> {

    public HandshakeResource unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HandshakeResource handshakeResource = new HandshakeResource();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Value")) {
                handshakeResource.setValue(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                handshakeResource.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Resources")) {
                handshakeResource.setResources(new ListUnmarshaller<HandshakeResource>(
                        HandshakeResourceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return handshakeResource;
    }

    private static HandshakeResourceJsonUnmarshaller instance;

    public static HandshakeResourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HandshakeResourceJsonUnmarshaller();
        return instance;
    }
}
