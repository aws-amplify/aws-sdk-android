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
 * JSON marshaller for POJO Eac3AtmosSettings
 */
class Eac3AtmosSettingsJsonMarshaller {

    public void marshall(Eac3AtmosSettings eac3AtmosSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (eac3AtmosSettings.getBitrate() != null) {
            Integer bitrate = eac3AtmosSettings.getBitrate();
            jsonWriter.name("Bitrate");
            jsonWriter.value(bitrate);
        }
        if (eac3AtmosSettings.getBitstreamMode() != null) {
            String bitstreamMode = eac3AtmosSettings.getBitstreamMode();
            jsonWriter.name("BitstreamMode");
            jsonWriter.value(bitstreamMode);
        }
        if (eac3AtmosSettings.getCodingMode() != null) {
            String codingMode = eac3AtmosSettings.getCodingMode();
            jsonWriter.name("CodingMode");
            jsonWriter.value(codingMode);
        }
        if (eac3AtmosSettings.getDialogueIntelligence() != null) {
            String dialogueIntelligence = eac3AtmosSettings.getDialogueIntelligence();
            jsonWriter.name("DialogueIntelligence");
            jsonWriter.value(dialogueIntelligence);
        }
        if (eac3AtmosSettings.getDynamicRangeCompressionLine() != null) {
            String dynamicRangeCompressionLine = eac3AtmosSettings.getDynamicRangeCompressionLine();
            jsonWriter.name("DynamicRangeCompressionLine");
            jsonWriter.value(dynamicRangeCompressionLine);
        }
        if (eac3AtmosSettings.getDynamicRangeCompressionRf() != null) {
            String dynamicRangeCompressionRf = eac3AtmosSettings.getDynamicRangeCompressionRf();
            jsonWriter.name("DynamicRangeCompressionRf");
            jsonWriter.value(dynamicRangeCompressionRf);
        }
        if (eac3AtmosSettings.getLoRoCenterMixLevel() != null) {
            Double loRoCenterMixLevel = eac3AtmosSettings.getLoRoCenterMixLevel();
            jsonWriter.name("LoRoCenterMixLevel");
            jsonWriter.value(loRoCenterMixLevel);
        }
        if (eac3AtmosSettings.getLoRoSurroundMixLevel() != null) {
            Double loRoSurroundMixLevel = eac3AtmosSettings.getLoRoSurroundMixLevel();
            jsonWriter.name("LoRoSurroundMixLevel");
            jsonWriter.value(loRoSurroundMixLevel);
        }
        if (eac3AtmosSettings.getLtRtCenterMixLevel() != null) {
            Double ltRtCenterMixLevel = eac3AtmosSettings.getLtRtCenterMixLevel();
            jsonWriter.name("LtRtCenterMixLevel");
            jsonWriter.value(ltRtCenterMixLevel);
        }
        if (eac3AtmosSettings.getLtRtSurroundMixLevel() != null) {
            Double ltRtSurroundMixLevel = eac3AtmosSettings.getLtRtSurroundMixLevel();
            jsonWriter.name("LtRtSurroundMixLevel");
            jsonWriter.value(ltRtSurroundMixLevel);
        }
        if (eac3AtmosSettings.getMeteringMode() != null) {
            String meteringMode = eac3AtmosSettings.getMeteringMode();
            jsonWriter.name("MeteringMode");
            jsonWriter.value(meteringMode);
        }
        if (eac3AtmosSettings.getSampleRate() != null) {
            Integer sampleRate = eac3AtmosSettings.getSampleRate();
            jsonWriter.name("SampleRate");
            jsonWriter.value(sampleRate);
        }
        if (eac3AtmosSettings.getSpeechThreshold() != null) {
            Integer speechThreshold = eac3AtmosSettings.getSpeechThreshold();
            jsonWriter.name("SpeechThreshold");
            jsonWriter.value(speechThreshold);
        }
        if (eac3AtmosSettings.getStereoDownmix() != null) {
            String stereoDownmix = eac3AtmosSettings.getStereoDownmix();
            jsonWriter.name("StereoDownmix");
            jsonWriter.value(stereoDownmix);
        }
        if (eac3AtmosSettings.getSurroundExMode() != null) {
            String surroundExMode = eac3AtmosSettings.getSurroundExMode();
            jsonWriter.name("SurroundExMode");
            jsonWriter.value(surroundExMode);
        }
        jsonWriter.endObject();
    }

    private static Eac3AtmosSettingsJsonMarshaller instance;

    public static Eac3AtmosSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Eac3AtmosSettingsJsonMarshaller();
        return instance;
    }
}
