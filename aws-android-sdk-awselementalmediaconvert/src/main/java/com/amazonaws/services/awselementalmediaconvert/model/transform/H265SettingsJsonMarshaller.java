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
        if (h265Settings.getAlternateTransferFunctionSei() != null) {
            String alternateTransferFunctionSei = h265Settings.getAlternateTransferFunctionSei();
            jsonWriter.name("AlternateTransferFunctionSei");
            jsonWriter.value(alternateTransferFunctionSei);
        }
        if (h265Settings.getBitrate() != null) {
            Integer bitrate = h265Settings.getBitrate();
            jsonWriter.name("Bitrate");
            jsonWriter.value(bitrate);
        }
        if (h265Settings.getCodecLevel() != null) {
            String codecLevel = h265Settings.getCodecLevel();
            jsonWriter.name("CodecLevel");
            jsonWriter.value(codecLevel);
        }
        if (h265Settings.getCodecProfile() != null) {
            String codecProfile = h265Settings.getCodecProfile();
            jsonWriter.name("CodecProfile");
            jsonWriter.value(codecProfile);
        }
        if (h265Settings.getDynamicSubGop() != null) {
            String dynamicSubGop = h265Settings.getDynamicSubGop();
            jsonWriter.name("DynamicSubGop");
            jsonWriter.value(dynamicSubGop);
        }
        if (h265Settings.getFlickerAdaptiveQuantization() != null) {
            String flickerAdaptiveQuantization = h265Settings.getFlickerAdaptiveQuantization();
            jsonWriter.name("FlickerAdaptiveQuantization");
            jsonWriter.value(flickerAdaptiveQuantization);
        }
        if (h265Settings.getFramerateControl() != null) {
            String framerateControl = h265Settings.getFramerateControl();
            jsonWriter.name("FramerateControl");
            jsonWriter.value(framerateControl);
        }
        if (h265Settings.getFramerateConversionAlgorithm() != null) {
            String framerateConversionAlgorithm = h265Settings.getFramerateConversionAlgorithm();
            jsonWriter.name("FramerateConversionAlgorithm");
            jsonWriter.value(framerateConversionAlgorithm);
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
        if (h265Settings.getGopBReference() != null) {
            String gopBReference = h265Settings.getGopBReference();
            jsonWriter.name("GopBReference");
            jsonWriter.value(gopBReference);
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
        if (h265Settings.getHrdBufferInitialFillPercentage() != null) {
            Integer hrdBufferInitialFillPercentage = h265Settings
                    .getHrdBufferInitialFillPercentage();
            jsonWriter.name("HrdBufferInitialFillPercentage");
            jsonWriter.value(hrdBufferInitialFillPercentage);
        }
        if (h265Settings.getHrdBufferSize() != null) {
            Integer hrdBufferSize = h265Settings.getHrdBufferSize();
            jsonWriter.name("HrdBufferSize");
            jsonWriter.value(hrdBufferSize);
        }
        if (h265Settings.getInterlaceMode() != null) {
            String interlaceMode = h265Settings.getInterlaceMode();
            jsonWriter.name("InterlaceMode");
            jsonWriter.value(interlaceMode);
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
        if (h265Settings.getNumberBFramesBetweenReferenceFrames() != null) {
            Integer numberBFramesBetweenReferenceFrames = h265Settings
                    .getNumberBFramesBetweenReferenceFrames();
            jsonWriter.name("NumberBFramesBetweenReferenceFrames");
            jsonWriter.value(numberBFramesBetweenReferenceFrames);
        }
        if (h265Settings.getNumberReferenceFrames() != null) {
            Integer numberReferenceFrames = h265Settings.getNumberReferenceFrames();
            jsonWriter.name("NumberReferenceFrames");
            jsonWriter.value(numberReferenceFrames);
        }
        if (h265Settings.getParControl() != null) {
            String parControl = h265Settings.getParControl();
            jsonWriter.name("ParControl");
            jsonWriter.value(parControl);
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
        if (h265Settings.getQualityTuningLevel() != null) {
            String qualityTuningLevel = h265Settings.getQualityTuningLevel();
            jsonWriter.name("QualityTuningLevel");
            jsonWriter.value(qualityTuningLevel);
        }
        if (h265Settings.getQvbrSettings() != null) {
            H265QvbrSettings qvbrSettings = h265Settings.getQvbrSettings();
            jsonWriter.name("QvbrSettings");
            H265QvbrSettingsJsonMarshaller.getInstance().marshall(qvbrSettings, jsonWriter);
        }
        if (h265Settings.getRateControlMode() != null) {
            String rateControlMode = h265Settings.getRateControlMode();
            jsonWriter.name("RateControlMode");
            jsonWriter.value(rateControlMode);
        }
        if (h265Settings.getSampleAdaptiveOffsetFilterMode() != null) {
            String sampleAdaptiveOffsetFilterMode = h265Settings
                    .getSampleAdaptiveOffsetFilterMode();
            jsonWriter.name("SampleAdaptiveOffsetFilterMode");
            jsonWriter.value(sampleAdaptiveOffsetFilterMode);
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
        if (h265Settings.getSlowPal() != null) {
            String slowPal = h265Settings.getSlowPal();
            jsonWriter.name("SlowPal");
            jsonWriter.value(slowPal);
        }
        if (h265Settings.getSpatialAdaptiveQuantization() != null) {
            String spatialAdaptiveQuantization = h265Settings.getSpatialAdaptiveQuantization();
            jsonWriter.name("SpatialAdaptiveQuantization");
            jsonWriter.value(spatialAdaptiveQuantization);
        }
        if (h265Settings.getTelecine() != null) {
            String telecine = h265Settings.getTelecine();
            jsonWriter.name("Telecine");
            jsonWriter.value(telecine);
        }
        if (h265Settings.getTemporalAdaptiveQuantization() != null) {
            String temporalAdaptiveQuantization = h265Settings.getTemporalAdaptiveQuantization();
            jsonWriter.name("TemporalAdaptiveQuantization");
            jsonWriter.value(temporalAdaptiveQuantization);
        }
        if (h265Settings.getTemporalIds() != null) {
            String temporalIds = h265Settings.getTemporalIds();
            jsonWriter.name("TemporalIds");
            jsonWriter.value(temporalIds);
        }
        if (h265Settings.getTiles() != null) {
            String tiles = h265Settings.getTiles();
            jsonWriter.name("Tiles");
            jsonWriter.value(tiles);
        }
        if (h265Settings.getUnregisteredSeiTimecode() != null) {
            String unregisteredSeiTimecode = h265Settings.getUnregisteredSeiTimecode();
            jsonWriter.name("UnregisteredSeiTimecode");
            jsonWriter.value(unregisteredSeiTimecode);
        }
        if (h265Settings.getWriteMp4PackagingType() != null) {
            String writeMp4PackagingType = h265Settings.getWriteMp4PackagingType();
            jsonWriter.name("WriteMp4PackagingType");
            jsonWriter.value(writeMp4PackagingType);
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
