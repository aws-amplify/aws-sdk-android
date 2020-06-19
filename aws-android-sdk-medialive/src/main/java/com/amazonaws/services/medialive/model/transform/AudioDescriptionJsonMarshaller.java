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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AudioDescription
 */
class AudioDescriptionJsonMarshaller {

    public void marshall(AudioDescription audioDescription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (audioDescription.getAudioNormalizationSettings() != null) {
            AudioNormalizationSettings audioNormalizationSettings = audioDescription
                    .getAudioNormalizationSettings();
            jsonWriter.name("AudioNormalizationSettings");
            AudioNormalizationSettingsJsonMarshaller.getInstance().marshall(
                    audioNormalizationSettings, jsonWriter);
        }
        if (audioDescription.getAudioSelectorName() != null) {
            String audioSelectorName = audioDescription.getAudioSelectorName();
            jsonWriter.name("AudioSelectorName");
            jsonWriter.value(audioSelectorName);
        }
        if (audioDescription.getAudioType() != null) {
            String audioType = audioDescription.getAudioType();
            jsonWriter.name("AudioType");
            jsonWriter.value(audioType);
        }
        if (audioDescription.getAudioTypeControl() != null) {
            String audioTypeControl = audioDescription.getAudioTypeControl();
            jsonWriter.name("AudioTypeControl");
            jsonWriter.value(audioTypeControl);
        }
        if (audioDescription.getCodecSettings() != null) {
            AudioCodecSettings codecSettings = audioDescription.getCodecSettings();
            jsonWriter.name("CodecSettings");
            AudioCodecSettingsJsonMarshaller.getInstance().marshall(codecSettings, jsonWriter);
        }
        if (audioDescription.getLanguageCode() != null) {
            String languageCode = audioDescription.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (audioDescription.getLanguageCodeControl() != null) {
            String languageCodeControl = audioDescription.getLanguageCodeControl();
            jsonWriter.name("LanguageCodeControl");
            jsonWriter.value(languageCodeControl);
        }
        if (audioDescription.getName() != null) {
            String name = audioDescription.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (audioDescription.getRemixSettings() != null) {
            RemixSettings remixSettings = audioDescription.getRemixSettings();
            jsonWriter.name("RemixSettings");
            RemixSettingsJsonMarshaller.getInstance().marshall(remixSettings, jsonWriter);
        }
        if (audioDescription.getStreamName() != null) {
            String streamName = audioDescription.getStreamName();
            jsonWriter.name("StreamName");
            jsonWriter.value(streamName);
        }
        jsonWriter.endObject();
    }

    private static AudioDescriptionJsonMarshaller instance;

    public static AudioDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AudioDescriptionJsonMarshaller();
        return instance;
    }
}
