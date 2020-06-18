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
 * JSON unmarshaller for POJO Mpeg2Settings
 */
class Mpeg2SettingsJsonUnmarshaller implements Unmarshaller<Mpeg2Settings, JsonUnmarshallerContext> {

    public Mpeg2Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Mpeg2Settings mpeg2Settings = new Mpeg2Settings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AdaptiveQuantization")) {
                mpeg2Settings.setAdaptiveQuantization(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Bitrate")) {
                mpeg2Settings.setBitrate(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CodecLevel")) {
                mpeg2Settings.setCodecLevel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CodecProfile")) {
                mpeg2Settings.setCodecProfile(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DynamicSubGop")) {
                mpeg2Settings.setDynamicSubGop(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateControl")) {
                mpeg2Settings.setFramerateControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateConversionAlgorithm")) {
                mpeg2Settings.setFramerateConversionAlgorithm(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateDenominator")) {
                mpeg2Settings.setFramerateDenominator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateNumerator")) {
                mpeg2Settings.setFramerateNumerator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GopClosedCadence")) {
                mpeg2Settings.setGopClosedCadence(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GopSize")) {
                mpeg2Settings.setGopSize(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GopSizeUnits")) {
                mpeg2Settings.setGopSizeUnits(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HrdBufferInitialFillPercentage")) {
                mpeg2Settings.setHrdBufferInitialFillPercentage(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("HrdBufferSize")) {
                mpeg2Settings.setHrdBufferSize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InterlaceMode")) {
                mpeg2Settings.setInterlaceMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IntraDcPrecision")) {
                mpeg2Settings.setIntraDcPrecision(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxBitrate")) {
                mpeg2Settings.setMaxBitrate(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MinIInterval")) {
                mpeg2Settings.setMinIInterval(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberBFramesBetweenReferenceFrames")) {
                mpeg2Settings.setNumberBFramesBetweenReferenceFrames(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParControl")) {
                mpeg2Settings.setParControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParDenominator")) {
                mpeg2Settings.setParDenominator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParNumerator")) {
                mpeg2Settings.setParNumerator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("QualityTuningLevel")) {
                mpeg2Settings.setQualityTuningLevel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RateControlMode")) {
                mpeg2Settings.setRateControlMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SceneChangeDetect")) {
                mpeg2Settings.setSceneChangeDetect(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SlowPal")) {
                mpeg2Settings.setSlowPal(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Softness")) {
                mpeg2Settings.setSoftness(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SpatialAdaptiveQuantization")) {
                mpeg2Settings.setSpatialAdaptiveQuantization(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Syntax")) {
                mpeg2Settings.setSyntax(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Telecine")) {
                mpeg2Settings.setTelecine(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TemporalAdaptiveQuantization")) {
                mpeg2Settings.setTemporalAdaptiveQuantization(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return mpeg2Settings;
    }

    private static Mpeg2SettingsJsonUnmarshaller instance;

    public static Mpeg2SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Mpeg2SettingsJsonUnmarshaller();
        return instance;
    }
}
