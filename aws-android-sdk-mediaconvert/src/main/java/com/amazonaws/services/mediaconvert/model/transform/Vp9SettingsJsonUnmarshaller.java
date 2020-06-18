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
 * JSON unmarshaller for POJO Vp9Settings
 */
class Vp9SettingsJsonUnmarshaller implements Unmarshaller<Vp9Settings, JsonUnmarshallerContext> {

    public Vp9Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Vp9Settings vp9Settings = new Vp9Settings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Bitrate")) {
                vp9Settings.setBitrate(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateControl")) {
                vp9Settings.setFramerateControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateConversionAlgorithm")) {
                vp9Settings.setFramerateConversionAlgorithm(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateDenominator")) {
                vp9Settings.setFramerateDenominator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateNumerator")) {
                vp9Settings.setFramerateNumerator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GopSize")) {
                vp9Settings.setGopSize(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HrdBufferSize")) {
                vp9Settings.setHrdBufferSize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxBitrate")) {
                vp9Settings.setMaxBitrate(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParControl")) {
                vp9Settings.setParControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParDenominator")) {
                vp9Settings.setParDenominator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParNumerator")) {
                vp9Settings.setParNumerator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("QualityTuningLevel")) {
                vp9Settings.setQualityTuningLevel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RateControlMode")) {
                vp9Settings.setRateControlMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return vp9Settings;
    }

    private static Vp9SettingsJsonUnmarshaller instance;

    public static Vp9SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Vp9SettingsJsonUnmarshaller();
        return instance;
    }
}
