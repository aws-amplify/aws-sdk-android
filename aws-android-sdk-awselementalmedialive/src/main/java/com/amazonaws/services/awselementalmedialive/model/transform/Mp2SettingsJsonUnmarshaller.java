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

package com.amazonaws.services.awselementalmedialive.model.transform;

import com.amazonaws.services.awselementalmedialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Mp2Settings
 */
class Mp2SettingsJsonUnmarshaller implements Unmarshaller<Mp2Settings, JsonUnmarshallerContext> {

    public Mp2Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Mp2Settings mp2Settings = new Mp2Settings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Bitrate")) {
                mp2Settings.setBitrate(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CodingMode")) {
                mp2Settings.setCodingMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SampleRate")) {
                mp2Settings.setSampleRate(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return mp2Settings;
    }

    private static Mp2SettingsJsonUnmarshaller instance;

    public static Mp2SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Mp2SettingsJsonUnmarshaller();
        return instance;
    }
}
