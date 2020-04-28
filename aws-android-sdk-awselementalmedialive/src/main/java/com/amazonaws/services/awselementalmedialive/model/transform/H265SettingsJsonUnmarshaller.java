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
            } else if (name.equals("AfdSignaling")) {
                h265Settings.setAfdSignaling(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AlternativeTransferFunction")) {
                h265Settings.setAlternativeTransferFunction(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Bitrate")) {
                h265Settings.setBitrate(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BufSize")) {
                h265Settings.setBufSize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ColorMetadata")) {
                h265Settings.setColorMetadata(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ColorSpaceSettings")) {
                h265Settings.setColorSpaceSettings(H265ColorSpaceSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FixedAfd")) {
                h265Settings.setFixedAfd(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FlickerAq")) {
                h265Settings.setFlickerAq(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateDenominator")) {
                h265Settings.setFramerateDenominator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateNumerator")) {
                h265Settings.setFramerateNumerator(IntegerJsonUnmarshaller.getInstance()
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
            } else if (name.equals("Level")) {
                h265Settings.setLevel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LookAheadRateControl")) {
                h265Settings.setLookAheadRateControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxBitrate")) {
                h265Settings.setMaxBitrate(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MinIInterval")) {
                h265Settings.setMinIInterval(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParDenominator")) {
                h265Settings.setParDenominator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParNumerator")) {
                h265Settings.setParNumerator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Profile")) {
                h265Settings.setProfile(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("QvbrQualityLevel")) {
                h265Settings.setQvbrQualityLevel(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RateControlMode")) {
                h265Settings.setRateControlMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScanType")) {
                h265Settings.setScanType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SceneChangeDetect")) {
                h265Settings.setSceneChangeDetect(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Slices")) {
                h265Settings.setSlices(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tier")) {
                h265Settings.setTier(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimecodeInsertion")) {
                h265Settings.setTimecodeInsertion(StringJsonUnmarshaller.getInstance()
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
