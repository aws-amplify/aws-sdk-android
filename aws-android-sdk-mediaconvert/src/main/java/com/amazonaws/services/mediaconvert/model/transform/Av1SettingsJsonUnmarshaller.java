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
 * JSON unmarshaller for POJO Av1Settings
 */
class Av1SettingsJsonUnmarshaller implements Unmarshaller<Av1Settings, JsonUnmarshallerContext> {

    public Av1Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Av1Settings av1Settings = new Av1Settings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AdaptiveQuantization")) {
                av1Settings.setAdaptiveQuantization(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateControl")) {
                av1Settings.setFramerateControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateConversionAlgorithm")) {
                av1Settings.setFramerateConversionAlgorithm(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateDenominator")) {
                av1Settings.setFramerateDenominator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateNumerator")) {
                av1Settings.setFramerateNumerator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GopSize")) {
                av1Settings.setGopSize(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxBitrate")) {
                av1Settings.setMaxBitrate(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberBFramesBetweenReferenceFrames")) {
                av1Settings.setNumberBFramesBetweenReferenceFrames(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("QvbrSettings")) {
                av1Settings.setQvbrSettings(Av1QvbrSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RateControlMode")) {
                av1Settings.setRateControlMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Slices")) {
                av1Settings.setSlices(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SpatialAdaptiveQuantization")) {
                av1Settings.setSpatialAdaptiveQuantization(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return av1Settings;
    }

    private static Av1SettingsJsonUnmarshaller instance;

    public static Av1SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Av1SettingsJsonUnmarshaller();
        return instance;
    }
}
