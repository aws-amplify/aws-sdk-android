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
            } else if (name.equals("AfdSignaling")) {
                h264Settings.setAfdSignaling(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Bitrate")) {
                h264Settings.setBitrate(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BufFillPct")) {
                h264Settings.setBufFillPct(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BufSize")) {
                h264Settings.setBufSize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ColorMetadata")) {
                h264Settings.setColorMetadata(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ColorSpaceSettings")) {
                h264Settings.setColorSpaceSettings(H264ColorSpaceSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EntropyEncoding")) {
                h264Settings.setEntropyEncoding(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FilterSettings")) {
                h264Settings.setFilterSettings(H264FilterSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FixedAfd")) {
                h264Settings.setFixedAfd(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FlickerAq")) {
                h264Settings.setFlickerAq(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ForceFieldPictures")) {
                h264Settings.setForceFieldPictures(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateControl")) {
                h264Settings.setFramerateControl(StringJsonUnmarshaller.getInstance()
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
            } else if (name.equals("GopNumBFrames")) {
                h264Settings.setGopNumBFrames(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GopSize")) {
                h264Settings.setGopSize(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GopSizeUnits")) {
                h264Settings.setGopSizeUnits(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Level")) {
                h264Settings.setLevel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LookAheadRateControl")) {
                h264Settings.setLookAheadRateControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxBitrate")) {
                h264Settings.setMaxBitrate(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MinIInterval")) {
                h264Settings.setMinIInterval(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumRefFrames")) {
                h264Settings.setNumRefFrames(IntegerJsonUnmarshaller.getInstance()
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
            } else if (name.equals("Profile")) {
                h264Settings.setProfile(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("QualityLevel")) {
                h264Settings.setQualityLevel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("QvbrQualityLevel")) {
                h264Settings.setQvbrQualityLevel(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RateControlMode")) {
                h264Settings.setRateControlMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScanType")) {
                h264Settings.setScanType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SceneChangeDetect")) {
                h264Settings.setSceneChangeDetect(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Slices")) {
                h264Settings.setSlices(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Softness")) {
                h264Settings.setSoftness(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SpatialAq")) {
                h264Settings.setSpatialAq(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubgopLength")) {
                h264Settings.setSubgopLength(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Syntax")) {
                h264Settings.setSyntax(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TemporalAq")) {
                h264Settings.setTemporalAq(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimecodeInsertion")) {
                h264Settings.setTimecodeInsertion(StringJsonUnmarshaller.getInstance()
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
