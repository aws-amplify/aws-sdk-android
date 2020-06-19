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
 * JSON marshaller for POJO H264Settings
 */
class H264SettingsJsonMarshaller {

    public void marshall(H264Settings h264Settings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (h264Settings.getAdaptiveQuantization() != null) {
            String adaptiveQuantization = h264Settings.getAdaptiveQuantization();
            jsonWriter.name("AdaptiveQuantization");
            jsonWriter.value(adaptiveQuantization);
        }
        if (h264Settings.getAfdSignaling() != null) {
            String afdSignaling = h264Settings.getAfdSignaling();
            jsonWriter.name("AfdSignaling");
            jsonWriter.value(afdSignaling);
        }
        if (h264Settings.getBitrate() != null) {
            Integer bitrate = h264Settings.getBitrate();
            jsonWriter.name("Bitrate");
            jsonWriter.value(bitrate);
        }
        if (h264Settings.getBufFillPct() != null) {
            Integer bufFillPct = h264Settings.getBufFillPct();
            jsonWriter.name("BufFillPct");
            jsonWriter.value(bufFillPct);
        }
        if (h264Settings.getBufSize() != null) {
            Integer bufSize = h264Settings.getBufSize();
            jsonWriter.name("BufSize");
            jsonWriter.value(bufSize);
        }
        if (h264Settings.getColorMetadata() != null) {
            String colorMetadata = h264Settings.getColorMetadata();
            jsonWriter.name("ColorMetadata");
            jsonWriter.value(colorMetadata);
        }
        if (h264Settings.getColorSpaceSettings() != null) {
            H264ColorSpaceSettings colorSpaceSettings = h264Settings.getColorSpaceSettings();
            jsonWriter.name("ColorSpaceSettings");
            H264ColorSpaceSettingsJsonMarshaller.getInstance().marshall(colorSpaceSettings,
                    jsonWriter);
        }
        if (h264Settings.getEntropyEncoding() != null) {
            String entropyEncoding = h264Settings.getEntropyEncoding();
            jsonWriter.name("EntropyEncoding");
            jsonWriter.value(entropyEncoding);
        }
        if (h264Settings.getFilterSettings() != null) {
            H264FilterSettings filterSettings = h264Settings.getFilterSettings();
            jsonWriter.name("FilterSettings");
            H264FilterSettingsJsonMarshaller.getInstance().marshall(filterSettings, jsonWriter);
        }
        if (h264Settings.getFixedAfd() != null) {
            String fixedAfd = h264Settings.getFixedAfd();
            jsonWriter.name("FixedAfd");
            jsonWriter.value(fixedAfd);
        }
        if (h264Settings.getFlickerAq() != null) {
            String flickerAq = h264Settings.getFlickerAq();
            jsonWriter.name("FlickerAq");
            jsonWriter.value(flickerAq);
        }
        if (h264Settings.getForceFieldPictures() != null) {
            String forceFieldPictures = h264Settings.getForceFieldPictures();
            jsonWriter.name("ForceFieldPictures");
            jsonWriter.value(forceFieldPictures);
        }
        if (h264Settings.getFramerateControl() != null) {
            String framerateControl = h264Settings.getFramerateControl();
            jsonWriter.name("FramerateControl");
            jsonWriter.value(framerateControl);
        }
        if (h264Settings.getFramerateDenominator() != null) {
            Integer framerateDenominator = h264Settings.getFramerateDenominator();
            jsonWriter.name("FramerateDenominator");
            jsonWriter.value(framerateDenominator);
        }
        if (h264Settings.getFramerateNumerator() != null) {
            Integer framerateNumerator = h264Settings.getFramerateNumerator();
            jsonWriter.name("FramerateNumerator");
            jsonWriter.value(framerateNumerator);
        }
        if (h264Settings.getGopBReference() != null) {
            String gopBReference = h264Settings.getGopBReference();
            jsonWriter.name("GopBReference");
            jsonWriter.value(gopBReference);
        }
        if (h264Settings.getGopClosedCadence() != null) {
            Integer gopClosedCadence = h264Settings.getGopClosedCadence();
            jsonWriter.name("GopClosedCadence");
            jsonWriter.value(gopClosedCadence);
        }
        if (h264Settings.getGopNumBFrames() != null) {
            Integer gopNumBFrames = h264Settings.getGopNumBFrames();
            jsonWriter.name("GopNumBFrames");
            jsonWriter.value(gopNumBFrames);
        }
        if (h264Settings.getGopSize() != null) {
            Double gopSize = h264Settings.getGopSize();
            jsonWriter.name("GopSize");
            jsonWriter.value(gopSize);
        }
        if (h264Settings.getGopSizeUnits() != null) {
            String gopSizeUnits = h264Settings.getGopSizeUnits();
            jsonWriter.name("GopSizeUnits");
            jsonWriter.value(gopSizeUnits);
        }
        if (h264Settings.getLevel() != null) {
            String level = h264Settings.getLevel();
            jsonWriter.name("Level");
            jsonWriter.value(level);
        }
        if (h264Settings.getLookAheadRateControl() != null) {
            String lookAheadRateControl = h264Settings.getLookAheadRateControl();
            jsonWriter.name("LookAheadRateControl");
            jsonWriter.value(lookAheadRateControl);
        }
        if (h264Settings.getMaxBitrate() != null) {
            Integer maxBitrate = h264Settings.getMaxBitrate();
            jsonWriter.name("MaxBitrate");
            jsonWriter.value(maxBitrate);
        }
        if (h264Settings.getMinIInterval() != null) {
            Integer minIInterval = h264Settings.getMinIInterval();
            jsonWriter.name("MinIInterval");
            jsonWriter.value(minIInterval);
        }
        if (h264Settings.getNumRefFrames() != null) {
            Integer numRefFrames = h264Settings.getNumRefFrames();
            jsonWriter.name("NumRefFrames");
            jsonWriter.value(numRefFrames);
        }
        if (h264Settings.getParControl() != null) {
            String parControl = h264Settings.getParControl();
            jsonWriter.name("ParControl");
            jsonWriter.value(parControl);
        }
        if (h264Settings.getParDenominator() != null) {
            Integer parDenominator = h264Settings.getParDenominator();
            jsonWriter.name("ParDenominator");
            jsonWriter.value(parDenominator);
        }
        if (h264Settings.getParNumerator() != null) {
            Integer parNumerator = h264Settings.getParNumerator();
            jsonWriter.name("ParNumerator");
            jsonWriter.value(parNumerator);
        }
        if (h264Settings.getProfile() != null) {
            String profile = h264Settings.getProfile();
            jsonWriter.name("Profile");
            jsonWriter.value(profile);
        }
        if (h264Settings.getQualityLevel() != null) {
            String qualityLevel = h264Settings.getQualityLevel();
            jsonWriter.name("QualityLevel");
            jsonWriter.value(qualityLevel);
        }
        if (h264Settings.getQvbrQualityLevel() != null) {
            Integer qvbrQualityLevel = h264Settings.getQvbrQualityLevel();
            jsonWriter.name("QvbrQualityLevel");
            jsonWriter.value(qvbrQualityLevel);
        }
        if (h264Settings.getRateControlMode() != null) {
            String rateControlMode = h264Settings.getRateControlMode();
            jsonWriter.name("RateControlMode");
            jsonWriter.value(rateControlMode);
        }
        if (h264Settings.getScanType() != null) {
            String scanType = h264Settings.getScanType();
            jsonWriter.name("ScanType");
            jsonWriter.value(scanType);
        }
        if (h264Settings.getSceneChangeDetect() != null) {
            String sceneChangeDetect = h264Settings.getSceneChangeDetect();
            jsonWriter.name("SceneChangeDetect");
            jsonWriter.value(sceneChangeDetect);
        }
        if (h264Settings.getSlices() != null) {
            Integer slices = h264Settings.getSlices();
            jsonWriter.name("Slices");
            jsonWriter.value(slices);
        }
        if (h264Settings.getSoftness() != null) {
            Integer softness = h264Settings.getSoftness();
            jsonWriter.name("Softness");
            jsonWriter.value(softness);
        }
        if (h264Settings.getSpatialAq() != null) {
            String spatialAq = h264Settings.getSpatialAq();
            jsonWriter.name("SpatialAq");
            jsonWriter.value(spatialAq);
        }
        if (h264Settings.getSubgopLength() != null) {
            String subgopLength = h264Settings.getSubgopLength();
            jsonWriter.name("SubgopLength");
            jsonWriter.value(subgopLength);
        }
        if (h264Settings.getSyntax() != null) {
            String syntax = h264Settings.getSyntax();
            jsonWriter.name("Syntax");
            jsonWriter.value(syntax);
        }
        if (h264Settings.getTemporalAq() != null) {
            String temporalAq = h264Settings.getTemporalAq();
            jsonWriter.name("TemporalAq");
            jsonWriter.value(temporalAq);
        }
        if (h264Settings.getTimecodeInsertion() != null) {
            String timecodeInsertion = h264Settings.getTimecodeInsertion();
            jsonWriter.name("TimecodeInsertion");
            jsonWriter.value(timecodeInsertion);
        }
        jsonWriter.endObject();
    }

    private static H264SettingsJsonMarshaller instance;

    public static H264SettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new H264SettingsJsonMarshaller();
        return instance;
    }
}
