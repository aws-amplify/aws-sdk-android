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

package com.amazonaws.services.medialive.model.transform;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Scte35Descriptor
 */
class Scte35DescriptorJsonUnmarshaller implements
        Unmarshaller<Scte35Descriptor, JsonUnmarshallerContext> {

    public Scte35Descriptor unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Scte35Descriptor scte35Descriptor = new Scte35Descriptor();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Scte35DescriptorSettings")) {
                scte35Descriptor
                        .setScte35DescriptorSettings(Scte35DescriptorSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return scte35Descriptor;
    }

    private static Scte35DescriptorJsonUnmarshaller instance;

    public static Scte35DescriptorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Scte35DescriptorJsonUnmarshaller();
        return instance;
    }
}
