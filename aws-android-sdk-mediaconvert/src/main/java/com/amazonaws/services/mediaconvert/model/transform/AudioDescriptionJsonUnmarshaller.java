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

package com.amazonaws.services.mediaconvert.model.transform;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AudioDescription
 */
class AudioDescriptionJsonUnmarshaller implements
        Unmarshaller<AudioDescription, JsonUnmarshallerContext> {

    public AudioDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AudioDescription audioDescription = new AudioDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AudioNormalizationSettings")) {
                audioDescription
                        .setAudioNormalizationSettings(AudioNormalizationSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("AudioSourceName")) {
                audioDescription.setAudioSourceName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AudioType")) {
                audioDescription.setAudioType(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AudioTypeControl")) {
                audioDescription.setAudioTypeControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CodecSettings")) {
                audioDescription.setCodecSettings(AudioCodecSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CustomLanguageCode")) {
                audioDescription.setCustomLanguageCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LanguageCode")) {
                audioDescription.setLanguageCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LanguageCodeControl")) {
                audioDescription.setLanguageCodeControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RemixSettings")) {
                audioDescription.setRemixSettings(RemixSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StreamName")) {
                audioDescription.setStreamName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return audioDescription;
    }

    private static AudioDescriptionJsonUnmarshaller instance;

    public static AudioDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AudioDescriptionJsonUnmarshaller();
        return instance;
    }
}
