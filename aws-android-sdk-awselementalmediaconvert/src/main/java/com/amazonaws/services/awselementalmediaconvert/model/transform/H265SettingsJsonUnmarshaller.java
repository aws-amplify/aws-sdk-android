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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO H265Settings
 */
class H265SettingsJsonUnmarshaller implements Unmarshaller<H265Settings, JsonUnmarshallerContext> {

    public H265Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        H265Settings h265Settings = new H265Settings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AdaptiveQuantization")) {
                h265Settings.setAdaptiveQuantization(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AlternateTransferFunctionSei")) {
                h265Settings.setAlternateTransferFunctionSei(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Bitrate")) {
                h265Settings.setBitrate(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CodecLevel")) {
                h265Settings.setCodecLevel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CodecProfile")) {
                h265Settings.setCodecProfile(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DynamicSubGop")) {
                h265Settings.setDynamicSubGop(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FlickerAdaptiveQuantization")) {
                h265Settings.setFlickerAdaptiveQuantization(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateControl")) {
                h265Settings.setFramerateControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateConversionAlgorithm")) {
                h265Settings.setFramerateConversionAlgorithm(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateDenominator")) {
                h265Settings.setFramerateDenominator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateNumerator")) {
                h265Settings.setFramerateNumerator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GopBReference")) {
                h265Settings.setGopBReference(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GopClosedCadence")) {
                h265Settings.setGopClosedCadence(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GopSize")) {
                h265Settings.setGopSize(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GopSizeUnits")) {
                h265Settings.setGopSizeUnits(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HrdBufferInitialFillPercentage")) {
                h265Settings.setHrdBufferInitialFillPercentage(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("HrdBufferSize")) {
                h265Settings.setHrdBufferSize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InterlaceMode")) {
                h265Settings.setInterlaceMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxBitrate")) {
                h265Settings.setMaxBitrate(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MinIInterval")) {
                h265Settings.setMinIInterval(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberBFramesBetweenReferenceFrames")) {
                h265Settings.setNumberBFramesBetweenReferenceFrames(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberReferenceFrames")) {
                h265Settings.setNumberReferenceFrames(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParControl")) {
                h265Settings.setParControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParDenominator")) {
                h265Settings.setParDenominator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParNumerator")) {
                h265Settings.setParNumerator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("QualityTuningLevel")) {
                h265Settings.setQualityTuningLevel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("QvbrSettings")) {
                h265Settings.setQvbrSettings(H265QvbrSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RateControlMode")) {
                h265Settings.setRateControlMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SampleAdaptiveOffsetFilterMode")) {
                h265Settings.setSampleAdaptiveOffsetFilterMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SceneChangeDetect")) {
                h265Settings.setSceneChangeDetect(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Slices")) {
                h265Settings.setSlices(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SlowPal")) {
                h265Settings.setSlowPal(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SpatialAdaptiveQuantization")) {
                h265Settings.setSpatialAdaptiveQuantization(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Telecine")) {
                h265Settings.setTelecine(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TemporalAdaptiveQuantization")) {
                h265Settings.setTemporalAdaptiveQuantization(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TemporalIds")) {
                h265Settings.setTemporalIds(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tiles")) {
                h265Settings.setTiles(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UnregisteredSeiTimecode")) {
                h265Settings.setUnregisteredSeiTimecode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WriteMp4PackagingType")) {
                h265Settings.setWriteMp4PackagingType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return h265Settings;
    }

    private static H265SettingsJsonUnmarshaller instance;

    public static H265SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new H265SettingsJsonUnmarshaller();
        return instance;
    }
}
