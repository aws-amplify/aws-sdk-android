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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HandshakeResource
 */
class HandshakeResourceJsonMarshaller {

    public void marshall(HandshakeResource handshakeResource, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (handshakeResource.getValue() != null) {
            String value = handshakeResource.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        if (handshakeResource.getType() != null) {
            String type = handshakeResource.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (handshakeResource.getResources() != null) {
            java.util.List<HandshakeResource> resources = handshakeResource.getResources();
            jsonWriter.name("Resources");
            jsonWriter.beginArray();
            for (HandshakeResource resourcesItem : resources) {
                if (resourcesItem != null) {
                    HandshakeResourceJsonMarshaller.getInstance().marshall(resourcesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static HandshakeResourceJsonMarshaller instance;

    public static HandshakeResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HandshakeResourceJsonMarshaller();
        return instance;
    }
}
