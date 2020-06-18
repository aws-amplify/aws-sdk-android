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
        if (h264Settings.getBitrate() != null) {
            Integer bitrate = h264Settings.getBitrate();
            jsonWriter.name("Bitrate");
            jsonWriter.value(bitrate);
        }
        if (h264Settings.getCodecLevel() != null) {
            String codecLevel = h264Settings.getCodecLevel();
            jsonWriter.name("CodecLevel");
            jsonWriter.value(codecLevel);
        }
        if (h264Settings.getCodecProfile() != null) {
            String codecProfile = h264Settings.getCodecProfile();
            jsonWriter.name("CodecProfile");
            jsonWriter.value(codecProfile);
        }
        if (h264Settings.getDynamicSubGop() != null) {
            String dynamicSubGop = h264Settings.getDynamicSubGop();
            jsonWriter.name("DynamicSubGop");
            jsonWriter.value(dynamicSubGop);
        }
        if (h264Settings.getEntropyEncoding() != null) {
            String entropyEncoding = h264Settings.getEntropyEncoding();
            jsonWriter.name("EntropyEncoding");
            jsonWriter.value(entropyEncoding);
        }
        if (h264Settings.getFieldEncoding() != null) {
            String fieldEncoding = h264Settings.getFieldEncoding();
            jsonWriter.name("FieldEncoding");
            jsonWriter.value(fieldEncoding);
        }
        if (h264Settings.getFlickerAdaptiveQuantization() != null) {
            String flickerAdaptiveQuantization = h264Settings.getFlickerAdaptiveQuantization();
            jsonWriter.name("FlickerAdaptiveQuantization");
            jsonWriter.value(flickerAdaptiveQuantization);
        }
        if (h264Settings.getFramerateControl() != null) {
            String framerateControl = h264Settings.getFramerateControl();
            jsonWriter.name("FramerateControl");
            jsonWriter.value(framerateControl);
        }
        if (h264Settings.getFramerateConversionAlgorithm() != null) {
            String framerateConversionAlgorithm = h264Settings.getFramerateConversionAlgorithm();
            jsonWriter.name("FramerateConversionAlgorithm");
            jsonWriter.value(framerateConversionAlgorithm);
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
        if (h264Settings.getHrdBufferInitialFillPercentage() != null) {
            Integer hrdBufferInitialFillPercentage = h264Settings
                    .getHrdBufferInitialFillPercentage();
            jsonWriter.name("HrdBufferInitialFillPercentage");
            jsonWriter.value(hrdBufferInitialFillPercentage);
        }
        if (h264Settings.getHrdBufferSize() != null) {
            Integer hrdBufferSize = h264Settings.getHrdBufferSize();
            jsonWriter.name("HrdBufferSize");
            jsonWriter.value(hrdBufferSize);
        }
        if (h264Settings.getInterlaceMode() != null) {
            String interlaceMode = h264Settings.getInterlaceMode();
            jsonWriter.name("InterlaceMode");
            jsonWriter.value(interlaceMode);
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
        if (h264Settings.getNumberBFramesBetweenReferenceFrames() != null) {
            Integer numberBFramesBetweenReferenceFrames = h264Settings
                    .getNumberBFramesBetweenReferenceFrames();
            jsonWriter.name("NumberBFramesBetweenReferenceFrames");
            jsonWriter.value(numberBFramesBetweenReferenceFrames);
        }
        if (h264Settings.getNumberReferenceFrames() != null) {
            Integer numberReferenceFrames = h264Settings.getNumberReferenceFrames();
            jsonWriter.name("NumberReferenceFrames");
            jsonWriter.value(numberReferenceFrames);
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
        if (h264Settings.getQualityTuningLevel() != null) {
            String qualityTuningLevel = h264Settings.getQualityTuningLevel();
            jsonWriter.name("QualityTuningLevel");
            jsonWriter.value(qualityTuningLevel);
        }
        if (h264Settings.getQvbrSettings() != null) {
            H264QvbrSettings qvbrSettings = h264Settings.getQvbrSettings();
            jsonWriter.name("QvbrSettings");
            H264QvbrSettingsJsonMarshaller.getInstance().marshall(qvbrSettings, jsonWriter);
        }
        if (h264Settings.getRateControlMode() != null) {
            String rateControlMode = h264Settings.getRateControlMode();
            jsonWriter.name("RateControlMode");
            jsonWriter.value(rateControlMode);
        }
        if (h264Settings.getRepeatPps() != null) {
            String repeatPps = h264Settings.getRepeatPps();
            jsonWriter.name("RepeatPps");
            jsonWriter.value(repeatPps);
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
        if (h264Settings.getSlowPal() != null) {
            String slowPal = h264Settings.getSlowPal();
            jsonWriter.name("SlowPal");
            jsonWriter.value(slowPal);
        }
        if (h264Settings.getSoftness() != null) {
            Integer softness = h264Settings.getSoftness();
            jsonWriter.name("Softness");
            jsonWriter.value(softness);
        }
        if (h264Settings.getSpatialAdaptiveQuantization() != null) {
            String spatialAdaptiveQuantization = h264Settings.getSpatialAdaptiveQuantization();
            jsonWriter.name("SpatialAdaptiveQuantization");
            jsonWriter.value(spatialAdaptiveQuantization);
        }
        if (h264Settings.getSyntax() != null) {
            String syntax = h264Settings.getSyntax();
            jsonWriter.name("Syntax");
            jsonWriter.value(syntax);
        }
        if (h264Settings.getTelecine() != null) {
            String telecine = h264Settings.getTelecine();
            jsonWriter.name("Telecine");
            jsonWriter.value(telecine);
        }
        if (h264Settings.getTemporalAdaptiveQuantization() != null) {
            String temporalAdaptiveQuantization = h264Settings.getTemporalAdaptiveQuantization();
            jsonWriter.name("TemporalAdaptiveQuantization");
            jsonWriter.value(temporalAdaptiveQuantization);
        }
        if (h264Settings.getUnregisteredSeiTimecode() != null) {
            String unregisteredSeiTimecode = h264Settings.getUnregisteredSeiTimecode();
            jsonWriter.name("UnregisteredSeiTimecode");
            jsonWriter.value(unregisteredSeiTimecode);
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
