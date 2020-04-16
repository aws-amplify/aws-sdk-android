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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AudioCodecSettings
 */
class AudioCodecSettingsJsonMarshaller {

    public void marshall(AudioCodecSettings audioCodecSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (audioCodecSettings.getAacSettings() != null) {
            AacSettings aacSettings = audioCodecSettings.getAacSettings();
            jsonWriter.name("AacSettings");
            AacSettingsJsonMarshaller.getInstance().marshall(aacSettings, jsonWriter);
        }
        if (audioCodecSettings.getAc3Settings() != null) {
            Ac3Settings ac3Settings = audioCodecSettings.getAc3Settings();
            jsonWriter.name("Ac3Settings");
            Ac3SettingsJsonMarshaller.getInstance().marshall(ac3Settings, jsonWriter);
        }
        if (audioCodecSettings.getAiffSettings() != null) {
            AiffSettings aiffSettings = audioCodecSettings.getAiffSettings();
            jsonWriter.name("AiffSettings");
            AiffSettingsJsonMarshaller.getInstance().marshall(aiffSettings, jsonWriter);
        }
        if (audioCodecSettings.getCodec() != null) {
            String codec = audioCodecSettings.getCodec();
            jsonWriter.name("Codec");
            jsonWriter.value(codec);
        }
        if (audioCodecSettings.getEac3AtmosSettings() != null) {
            Eac3AtmosSettings eac3AtmosSettings = audioCodecSettings.getEac3AtmosSettings();
            jsonWriter.name("Eac3AtmosSettings");
            Eac3AtmosSettingsJsonMarshaller.getInstance().marshall(eac3AtmosSettings, jsonWriter);
        }
        if (audioCodecSettings.getEac3Settings() != null) {
            Eac3Settings eac3Settings = audioCodecSettings.getEac3Settings();
            jsonWriter.name("Eac3Settings");
            Eac3SettingsJsonMarshaller.getInstance().marshall(eac3Settings, jsonWriter);
        }
        if (audioCodecSettings.getMp2Settings() != null) {
            Mp2Settings mp2Settings = audioCodecSettings.getMp2Settings();
            jsonWriter.name("Mp2Settings");
            Mp2SettingsJsonMarshaller.getInstance().marshall(mp2Settings, jsonWriter);
        }
        if (audioCodecSettings.getMp3Settings() != null) {
            Mp3Settings mp3Settings = audioCodecSettings.getMp3Settings();
            jsonWriter.name("Mp3Settings");
            Mp3SettingsJsonMarshaller.getInstance().marshall(mp3Settings, jsonWriter);
        }
        if (audioCodecSettings.getWavSettings() != null) {
            WavSettings wavSettings = audioCodecSettings.getWavSettings();
            jsonWriter.name("WavSettings");
            WavSettingsJsonMarshaller.getInstance().marshall(wavSettings, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AudioCodecSettingsJsonMarshaller instance;

    public static AudioCodecSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AudioCodecSettingsJsonMarshaller();
        return instance;
    }
}
