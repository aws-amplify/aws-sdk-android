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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Eac3Settings
 */
class Eac3SettingsJsonMarshaller {

    public void marshall(Eac3Settings eac3Settings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (eac3Settings.getAttenuationControl() != null) {
            String attenuationControl = eac3Settings.getAttenuationControl();
            jsonWriter.name("AttenuationControl");
            jsonWriter.value(attenuationControl);
        }
        if (eac3Settings.getBitrate() != null) {
            Integer bitrate = eac3Settings.getBitrate();
            jsonWriter.name("Bitrate");
            jsonWriter.value(bitrate);
        }
        if (eac3Settings.getBitstreamMode() != null) {
            String bitstreamMode = eac3Settings.getBitstreamMode();
            jsonWriter.name("BitstreamMode");
            jsonWriter.value(bitstreamMode);
        }
        if (eac3Settings.getCodingMode() != null) {
            String codingMode = eac3Settings.getCodingMode();
            jsonWriter.name("CodingMode");
            jsonWriter.value(codingMode);
        }
        if (eac3Settings.getDcFilter() != null) {
            String dcFilter = eac3Settings.getDcFilter();
            jsonWriter.name("DcFilter");
            jsonWriter.value(dcFilter);
        }
        if (eac3Settings.getDialnorm() != null) {
            Integer dialnorm = eac3Settings.getDialnorm();
            jsonWriter.name("Dialnorm");
            jsonWriter.value(dialnorm);
        }
        if (eac3Settings.getDynamicRangeCompressionLine() != null) {
            String dynamicRangeCompressionLine = eac3Settings.getDynamicRangeCompressionLine();
            jsonWriter.name("DynamicRangeCompressionLine");
            jsonWriter.value(dynamicRangeCompressionLine);
        }
        if (eac3Settings.getDynamicRangeCompressionRf() != null) {
            String dynamicRangeCompressionRf = eac3Settings.getDynamicRangeCompressionRf();
            jsonWriter.name("DynamicRangeCompressionRf");
            jsonWriter.value(dynamicRangeCompressionRf);
        }
        if (eac3Settings.getLfeControl() != null) {
            String lfeControl = eac3Settings.getLfeControl();
            jsonWriter.name("LfeControl");
            jsonWriter.value(lfeControl);
        }
        if (eac3Settings.getLfeFilter() != null) {
            String lfeFilter = eac3Settings.getLfeFilter();
            jsonWriter.name("LfeFilter");
            jsonWriter.value(lfeFilter);
        }
        if (eac3Settings.getLoRoCenterMixLevel() != null) {
            Double loRoCenterMixLevel = eac3Settings.getLoRoCenterMixLevel();
            jsonWriter.name("LoRoCenterMixLevel");
            jsonWriter.value(loRoCenterMixLevel);
        }
        if (eac3Settings.getLoRoSurroundMixLevel() != null) {
            Double loRoSurroundMixLevel = eac3Settings.getLoRoSurroundMixLevel();
            jsonWriter.name("LoRoSurroundMixLevel");
            jsonWriter.value(loRoSurroundMixLevel);
        }
        if (eac3Settings.getLtRtCenterMixLevel() != null) {
            Double ltRtCenterMixLevel = eac3Settings.getLtRtCenterMixLevel();
            jsonWriter.name("LtRtCenterMixLevel");
            jsonWriter.value(ltRtCenterMixLevel);
        }
        if (eac3Settings.getLtRtSurroundMixLevel() != null) {
            Double ltRtSurroundMixLevel = eac3Settings.getLtRtSurroundMixLevel();
            jsonWriter.name("LtRtSurroundMixLevel");
            jsonWriter.value(ltRtSurroundMixLevel);
        }
        if (eac3Settings.getMetadataControl() != null) {
            String metadataControl = eac3Settings.getMetadataControl();
            jsonWriter.name("MetadataControl");
            jsonWriter.value(metadataControl);
        }
        if (eac3Settings.getPassthroughControl() != null) {
            String passthroughControl = eac3Settings.getPassthroughControl();
            jsonWriter.name("PassthroughControl");
            jsonWriter.value(passthroughControl);
        }
        if (eac3Settings.getPhaseControl() != null) {
            String phaseControl = eac3Settings.getPhaseControl();
            jsonWriter.name("PhaseControl");
            jsonWriter.value(phaseControl);
        }
        if (eac3Settings.getSampleRate() != null) {
            Integer sampleRate = eac3Settings.getSampleRate();
            jsonWriter.name("SampleRate");
            jsonWriter.value(sampleRate);
        }
        if (eac3Settings.getStereoDownmix() != null) {
            String stereoDownmix = eac3Settings.getStereoDownmix();
            jsonWriter.name("StereoDownmix");
            jsonWriter.value(stereoDownmix);
        }
        if (eac3Settings.getSurroundExMode() != null) {
            String surroundExMode = eac3Settings.getSurroundExMode();
            jsonWriter.name("SurroundExMode");
            jsonWriter.value(surroundExMode);
        }
        if (eac3Settings.getSurroundMode() != null) {
            String surroundMode = eac3Settings.getSurroundMode();
            jsonWriter.name("SurroundMode");
            jsonWriter.value(surroundMode);
        }
        jsonWriter.endObject();
    }

    private static Eac3SettingsJsonMarshaller instance;

    public static Eac3SettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Eac3SettingsJsonMarshaller();
        return instance;
    }
}
