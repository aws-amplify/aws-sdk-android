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
 * JSON unmarshaller for POJO AudioCodecSettings
 */
class AudioCodecSettingsJsonUnmarshaller implements
        Unmarshaller<AudioCodecSettings, JsonUnmarshallerContext> {

    public AudioCodecSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AudioCodecSettings audioCodecSettings = new AudioCodecSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AacSettings")) {
                audioCodecSettings.setAacSettings(AacSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Ac3Settings")) {
                audioCodecSettings.setAc3Settings(Ac3SettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Eac3Settings")) {
                audioCodecSettings.setEac3Settings(Eac3SettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Mp2Settings")) {
                audioCodecSettings.setMp2Settings(Mp2SettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PassThroughSettings")) {
                audioCodecSettings.setPassThroughSettings(PassThroughSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return audioCodecSettings;
    }

    private static AudioCodecSettingsJsonUnmarshaller instance;

    public static AudioCodecSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AudioCodecSettingsJsonUnmarshaller();
        return instance;
    }
}
