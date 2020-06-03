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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO H264Settings
 */
class H264SettingsJsonUnmarshaller implements Unmarshaller<H264Settings, JsonUnmarshallerContext> {

    public H264Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        H264Settings h264Settings = new H264Settings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AdaptiveQuantization")) {
                h264Settings.setAdaptiveQuantization(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Bitrate")) {
                h264Settings.setBitrate(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CodecLevel")) {
                h264Settings.setCodecLevel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CodecProfile")) {
                h264Settings.setCodecProfile(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DynamicSubGop")) {
                h264Settings.setDynamicSubGop(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EntropyEncoding")) {
                h264Settings.setEntropyEncoding(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FieldEncoding")) {
                h264Settings.setFieldEncoding(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FlickerAdaptiveQuantization")) {
                h264Settings.setFlickerAdaptiveQuantization(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateControl")) {
                h264Settings.setFramerateControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateConversionAlgorithm")) {
                h264Settings.setFramerateConversionAlgorithm(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateDenominator")) {
                h264Settings.setFramerateDenominator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateNumerator")) {
                h264Settings.setFramerateNumerator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GopBReference")) {
                h264Settings.setGopBReference(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GopClosedCadence")) {
                h264Settings.setGopClosedCadence(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GopSize")) {
                h264Settings.setGopSize(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GopSizeUnits")) {
                h264Settings.setGopSizeUnits(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HrdBufferInitialFillPercentage")) {
                h264Settings.setHrdBufferInitialFillPercentage(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("HrdBufferSize")) {
                h264Settings.setHrdBufferSize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InterlaceMode")) {
                h264Settings.setInterlaceMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxBitrate")) {
                h264Settings.setMaxBitrate(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MinIInterval")) {
                h264Settings.setMinIInterval(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberBFramesBetweenReferenceFrames")) {
                h264Settings.setNumberBFramesBetweenReferenceFrames(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberReferenceFrames")) {
                h264Settings.setNumberReferenceFrames(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParControl")) {
                h264Settings.setParControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParDenominator")) {
                h264Settings.setParDenominator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParNumerator")) {
                h264Settings.setParNumerator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("QualityTuningLevel")) {
                h264Settings.setQualityTuningLevel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("QvbrSettings")) {
                h264Settings.setQvbrSettings(H264QvbrSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RateControlMode")) {
                h264Settings.setRateControlMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RepeatPps")) {
                h264Settings.setRepeatPps(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SceneChangeDetect")) {
                h264Settings.setSceneChangeDetect(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Slices")) {
                h264Settings.setSlices(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SlowPal")) {
                h264Settings.setSlowPal(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Softness")) {
                h264Settings.setSoftness(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SpatialAdaptiveQuantization")) {
                h264Settings.setSpatialAdaptiveQuantization(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Syntax")) {
                h264Settings.setSyntax(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Telecine")) {
                h264Settings.setTelecine(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TemporalAdaptiveQuantization")) {
                h264Settings.setTemporalAdaptiveQuantization(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UnregisteredSeiTimecode")) {
                h264Settings.setUnregisteredSeiTimecode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return h264Settings;
    }

    private static H264SettingsJsonUnmarshaller instance;

    public static H264SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new H264SettingsJsonUnmarshaller();
        return instance;
    }
}
