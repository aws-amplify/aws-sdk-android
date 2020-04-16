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
 * JSON marshaller for POJO Mpeg2Settings
 */
class Mpeg2SettingsJsonMarshaller {

    public void marshall(Mpeg2Settings mpeg2Settings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (mpeg2Settings.getAdaptiveQuantization() != null) {
            String adaptiveQuantization = mpeg2Settings.getAdaptiveQuantization();
            jsonWriter.name("AdaptiveQuantization");
            jsonWriter.value(adaptiveQuantization);
        }
        if (mpeg2Settings.getBitrate() != null) {
            Integer bitrate = mpeg2Settings.getBitrate();
            jsonWriter.name("Bitrate");
            jsonWriter.value(bitrate);
        }
        if (mpeg2Settings.getCodecLevel() != null) {
            String codecLevel = mpeg2Settings.getCodecLevel();
            jsonWriter.name("CodecLevel");
            jsonWriter.value(codecLevel);
        }
        if (mpeg2Settings.getCodecProfile() != null) {
            String codecProfile = mpeg2Settings.getCodecProfile();
            jsonWriter.name("CodecProfile");
            jsonWriter.value(codecProfile);
        }
        if (mpeg2Settings.getDynamicSubGop() != null) {
            String dynamicSubGop = mpeg2Settings.getDynamicSubGop();
            jsonWriter.name("DynamicSubGop");
            jsonWriter.value(dynamicSubGop);
        }
        if (mpeg2Settings.getFramerateControl() != null) {
            String framerateControl = mpeg2Settings.getFramerateControl();
            jsonWriter.name("FramerateControl");
            jsonWriter.value(framerateControl);
        }
        if (mpeg2Settings.getFramerateConversionAlgorithm() != null) {
            String framerateConversionAlgorithm = mpeg2Settings.getFramerateConversionAlgorithm();
            jsonWriter.name("FramerateConversionAlgorithm");
            jsonWriter.value(framerateConversionAlgorithm);
        }
        if (mpeg2Settings.getFramerateDenominator() != null) {
            Integer framerateDenominator = mpeg2Settings.getFramerateDenominator();
            jsonWriter.name("FramerateDenominator");
            jsonWriter.value(framerateDenominator);
        }
        if (mpeg2Settings.getFramerateNumerator() != null) {
            Integer framerateNumerator = mpeg2Settings.getFramerateNumerator();
            jsonWriter.name("FramerateNumerator");
            jsonWriter.value(framerateNumerator);
        }
        if (mpeg2Settings.getGopClosedCadence() != null) {
            Integer gopClosedCadence = mpeg2Settings.getGopClosedCadence();
            jsonWriter.name("GopClosedCadence");
            jsonWriter.value(gopClosedCadence);
        }
        if (mpeg2Settings.getGopSize() != null) {
            Double gopSize = mpeg2Settings.getGopSize();
            jsonWriter.name("GopSize");
            jsonWriter.value(gopSize);
        }
        if (mpeg2Settings.getGopSizeUnits() != null) {
            String gopSizeUnits = mpeg2Settings.getGopSizeUnits();
            jsonWriter.name("GopSizeUnits");
            jsonWriter.value(gopSizeUnits);
        }
        if (mpeg2Settings.getHrdBufferInitialFillPercentage() != null) {
            Integer hrdBufferInitialFillPercentage = mpeg2Settings
                    .getHrdBufferInitialFillPercentage();
            jsonWriter.name("HrdBufferInitialFillPercentage");
            jsonWriter.value(hrdBufferInitialFillPercentage);
        }
        if (mpeg2Settings.getHrdBufferSize() != null) {
            Integer hrdBufferSize = mpeg2Settings.getHrdBufferSize();
            jsonWriter.name("HrdBufferSize");
            jsonWriter.value(hrdBufferSize);
        }
        if (mpeg2Settings.getInterlaceMode() != null) {
            String interlaceMode = mpeg2Settings.getInterlaceMode();
            jsonWriter.name("InterlaceMode");
            jsonWriter.value(interlaceMode);
        }
        if (mpeg2Settings.getIntraDcPrecision() != null) {
            String intraDcPrecision = mpeg2Settings.getIntraDcPrecision();
            jsonWriter.name("IntraDcPrecision");
            jsonWriter.value(intraDcPrecision);
        }
        if (mpeg2Settings.getMaxBitrate() != null) {
            Integer maxBitrate = mpeg2Settings.getMaxBitrate();
            jsonWriter.name("MaxBitrate");
            jsonWriter.value(maxBitrate);
        }
        if (mpeg2Settings.getMinIInterval() != null) {
            Integer minIInterval = mpeg2Settings.getMinIInterval();
            jsonWriter.name("MinIInterval");
            jsonWriter.value(minIInterval);
        }
        if (mpeg2Settings.getNumberBFramesBetweenReferenceFrames() != null) {
            Integer numberBFramesBetweenReferenceFrames = mpeg2Settings
                    .getNumberBFramesBetweenReferenceFrames();
            jsonWriter.name("NumberBFramesBetweenReferenceFrames");
            jsonWriter.value(numberBFramesBetweenReferenceFrames);
        }
        if (mpeg2Settings.getParControl() != null) {
            String parControl = mpeg2Settings.getParControl();
            jsonWriter.name("ParControl");
            jsonWriter.value(parControl);
        }
        if (mpeg2Settings.getParDenominator() != null) {
            Integer parDenominator = mpeg2Settings.getParDenominator();
            jsonWriter.name("ParDenominator");
            jsonWriter.value(parDenominator);
        }
        if (mpeg2Settings.getParNumerator() != null) {
            Integer parNumerator = mpeg2Settings.getParNumerator();
            jsonWriter.name("ParNumerator");
            jsonWriter.value(parNumerator);
        }
        if (mpeg2Settings.getQualityTuningLevel() != null) {
            String qualityTuningLevel = mpeg2Settings.getQualityTuningLevel();
            jsonWriter.name("QualityTuningLevel");
            jsonWriter.value(qualityTuningLevel);
        }
        if (mpeg2Settings.getRateControlMode() != null) {
            String rateControlMode = mpeg2Settings.getRateControlMode();
            jsonWriter.name("RateControlMode");
            jsonWriter.value(rateControlMode);
        }
        if (mpeg2Settings.getSceneChangeDetect() != null) {
            String sceneChangeDetect = mpeg2Settings.getSceneChangeDetect();
            jsonWriter.name("SceneChangeDetect");
            jsonWriter.value(sceneChangeDetect);
        }
        if (mpeg2Settings.getSlowPal() != null) {
            String slowPal = mpeg2Settings.getSlowPal();
            jsonWriter.name("SlowPal");
            jsonWriter.value(slowPal);
        }
        if (mpeg2Settings.getSoftness() != null) {
            Integer softness = mpeg2Settings.getSoftness();
            jsonWriter.name("Softness");
            jsonWriter.value(softness);
        }
        if (mpeg2Settings.getSpatialAdaptiveQuantization() != null) {
            String spatialAdaptiveQuantization = mpeg2Settings.getSpatialAdaptiveQuantization();
            jsonWriter.name("SpatialAdaptiveQuantization");
            jsonWriter.value(spatialAdaptiveQuantization);
        }
        if (mpeg2Settings.getSyntax() != null) {
            String syntax = mpeg2Settings.getSyntax();
            jsonWriter.name("Syntax");
            jsonWriter.value(syntax);
        }
        if (mpeg2Settings.getTelecine() != null) {
            String telecine = mpeg2Settings.getTelecine();
            jsonWriter.name("Telecine");
            jsonWriter.value(telecine);
        }
        if (mpeg2Settings.getTemporalAdaptiveQuantization() != null) {
            String temporalAdaptiveQuantization = mpeg2Settings.getTemporalAdaptiveQuantization();
            jsonWriter.name("TemporalAdaptiveQuantization");
            jsonWriter.value(temporalAdaptiveQuantization);
        }
        jsonWriter.endObject();
    }

    private static Mpeg2SettingsJsonMarshaller instance;

    public static Mpeg2SettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Mpeg2SettingsJsonMarshaller();
        return instance;
    }
}
