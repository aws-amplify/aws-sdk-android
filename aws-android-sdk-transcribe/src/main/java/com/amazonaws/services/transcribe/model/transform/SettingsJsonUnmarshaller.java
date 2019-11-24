/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.transcribe.model.transform;

import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Settings
 */
class SettingsJsonUnmarshaller implements Unmarshaller<Settings, JsonUnmarshallerContext> {

    public Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Settings settings = new Settings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("VocabularyName")) {
                settings.setVocabularyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ShowSpeakerLabels")) {
                settings.setShowSpeakerLabels(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxSpeakerLabels")) {
                settings.setMaxSpeakerLabels(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ChannelIdentification")) {
                settings.setChannelIdentification(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ShowAlternatives")) {
                settings.setShowAlternatives(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxAlternatives")) {
                settings.setMaxAlternatives(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return settings;
    }

    private static SettingsJsonUnmarshaller instance;

    public static SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SettingsJsonUnmarshaller();
        return instance;
    }
}
