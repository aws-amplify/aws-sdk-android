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
 * JSON unmarshaller for POJO UdpOutputSettings
 */
class UdpOutputSettingsJsonUnmarshaller implements
        Unmarshaller<UdpOutputSettings, JsonUnmarshallerContext> {

    public UdpOutputSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UdpOutputSettings udpOutputSettings = new UdpOutputSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BufferMsec")) {
                udpOutputSettings.setBufferMsec(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContainerSettings")) {
                udpOutputSettings.setContainerSettings(UdpContainerSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Destination")) {
                udpOutputSettings.setDestination(OutputLocationRefJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FecOutputSettings")) {
                udpOutputSettings.setFecOutputSettings(FecOutputSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return udpOutputSettings;
    }

    private static UdpOutputSettingsJsonUnmarshaller instance;

    public static UdpOutputSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UdpOutputSettingsJsonUnmarshaller();
        return instance;
    }
}
