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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO H265Settings
 */
class H265SettingsJsonMarshaller {

    public void marshall(H265Settings h265Settings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (h265Settings.getAdaptiveQuantization() != null) {
            String adaptiveQuantization = h265Settings.getAdaptiveQuantization();
            jsonWriter.name("AdaptiveQuantization");
            jsonWriter.value(adaptiveQuantization);
        }
        if (h265Settings.getAfdSignaling() != null) {
            String afdSignaling = h265Settings.getAfdSignaling();
            jsonWriter.name("AfdSignaling");
            jsonWriter.value(afdSignaling);
        }
        if (h265Settings.getAlternativeTransferFunction() != null) {
            String alternativeTransferFunction = h265Settings.getAlternativeTransferFunction();
            jsonWriter.name("AlternativeTransferFunction");
            jsonWriter.value(alternativeTransferFunction);
        }
        if (h265Settings.getBitrate() != null) {
            Integer bitrate = h265Settings.getBitrate();
            jsonWriter.name("Bitrate");
            jsonWriter.value(bitrate);
        }
        if (h265Settings.getBufSize() != null) {
            Integer bufSize = h265Settings.getBufSize();
            jsonWriter.name("BufSize");
            jsonWriter.value(bufSize);
        }
        if (h265Settings.getColorMetadata() != null) {
            String colorMetadata = h265Settings.getColorMetadata();
            jsonWriter.name("ColorMetadata");
            jsonWriter.value(colorMetadata);
        }
        if (h265Settings.getColorSpaceSettings() != null) {
            H265ColorSpaceSettings colorSpaceSettings = h265Settings.getColorSpaceSettings();
            jsonWriter.name("ColorSpaceSettings");
            H265ColorSpaceSettingsJsonMarshaller.getInstance().marshall(colorSpaceSettings,
                    jsonWriter);
        }
        if (h265Settings.getFixedAfd() != null) {
            String fixedAfd = h265Settings.getFixedAfd();
            jsonWriter.name("FixedAfd");
            jsonWriter.value(fixedAfd);
        }
        if (h265Settings.getFlickerAq() != null) {
            String flickerAq = h265Settings.getFlickerAq();
            jsonWriter.name("FlickerAq");
            jsonWriter.value(flickerAq);
        }
        if (h265Settings.getFramerateDenominator() != null) {
            Integer framerateDenominator = h265Settings.getFramerateDenominator();
            jsonWriter.name("FramerateDenominator");
            jsonWriter.value(framerateDenominator);
        }
        if (h265Settings.getFramerateNumerator() != null) {
            Integer framerateNumerator = h265Settings.getFramerateNumerator();
            jsonWriter.name("FramerateNumerator");
            jsonWriter.value(framerateNumerator);
        }
        if (h265Settings.getGopClosedCadence() != null) {
            Integer gopClosedCadence = h265Settings.getGopClosedCadence();
            jsonWriter.name("GopClosedCadence");
            jsonWriter.value(gopClosedCadence);
        }
        if (h265Settings.getGopSize() != null) {
            Double gopSize = h265Settings.getGopSize();
            jsonWriter.name("GopSize");
            jsonWriter.value(gopSize);
        }
        if (h265Settings.getGopSizeUnits() != null) {
            String gopSizeUnits = h265Settings.getGopSizeUnits();
            jsonWriter.name("GopSizeUnits");
            jsonWriter.value(gopSizeUnits);
        }
        if (h265Settings.getLevel() != null) {
            String level = h265Settings.getLevel();
            jsonWriter.name("Level");
            jsonWriter.value(level);
        }
        if (h265Settings.getLookAheadRateControl() != null) {
            String lookAheadRateControl = h265Settings.getLookAheadRateControl();
            jsonWriter.name("LookAheadRateControl");
            jsonWriter.value(lookAheadRateControl);
        }
        if (h265Settings.getMaxBitrate() != null) {
            Integer maxBitrate = h265Settings.getMaxBitrate();
            jsonWriter.name("MaxBitrate");
            jsonWriter.value(maxBitrate);
        }
        if (h265Settings.getMinIInterval() != null) {
            Integer minIInterval = h265Settings.getMinIInterval();
            jsonWriter.name("MinIInterval");
            jsonWriter.value(minIInterval);
        }
        if (h265Settings.getParDenominator() != null) {
            Integer parDenominator = h265Settings.getParDenominator();
            jsonWriter.name("ParDenominator");
            jsonWriter.value(parDenominator);
        }
        if (h265Settings.getParNumerator() != null) {
            Integer parNumerator = h265Settings.getParNumerator();
            jsonWriter.name("ParNumerator");
            jsonWriter.value(parNumerator);
        }
        if (h265Settings.getProfile() != null) {
            String profile = h265Settings.getProfile();
            jsonWriter.name("Profile");
            jsonWriter.value(profile);
        }
        if (h265Settings.getQvbrQualityLevel() != null) {
            Integer qvbrQualityLevel = h265Settings.getQvbrQualityLevel();
            jsonWriter.name("QvbrQualityLevel");
            jsonWriter.value(qvbrQualityLevel);
        }
        if (h265Settings.getRateControlMode() != null) {
            String rateControlMode = h265Settings.getRateControlMode();
            jsonWriter.name("RateControlMode");
            jsonWriter.value(rateControlMode);
        }
        if (h265Settings.getScanType() != null) {
            String scanType = h265Settings.getScanType();
            jsonWriter.name("ScanType");
            jsonWriter.value(scanType);
        }
        if (h265Settings.getSceneChangeDetect() != null) {
            String sceneChangeDetect = h265Settings.getSceneChangeDetect();
            jsonWriter.name("SceneChangeDetect");
            jsonWriter.value(sceneChangeDetect);
        }
        if (h265Settings.getSlices() != null) {
            Integer slices = h265Settings.getSlices();
            jsonWriter.name("Slices");
            jsonWriter.value(slices);
        }
        if (h265Settings.getTier() != null) {
            String tier = h265Settings.getTier();
            jsonWriter.name("Tier");
            jsonWriter.value(tier);
        }
        if (h265Settings.getTimecodeInsertion() != null) {
            String timecodeInsertion = h265Settings.getTimecodeInsertion();
            jsonWriter.name("TimecodeInsertion");
            jsonWriter.value(timecodeInsertion);
        }
        jsonWriter.endObject();
    }

    private static H265SettingsJsonMarshaller instance;

    public static H265SettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new H265SettingsJsonMarshaller();
        return instance;
    }
}
