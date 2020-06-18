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
 * JSON unmarshaller for POJO ProresSettings
 */
class ProresSettingsJsonUnmarshaller implements
        Unmarshaller<ProresSettings, JsonUnmarshallerContext> {

    public ProresSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProresSettings proresSettings = new ProresSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CodecProfile")) {
                proresSettings.setCodecProfile(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateControl")) {
                proresSettings.setFramerateControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateConversionAlgorithm")) {
                proresSettings.setFramerateConversionAlgorithm(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateDenominator")) {
                proresSettings.setFramerateDenominator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateNumerator")) {
                proresSettings.setFramerateNumerator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InterlaceMode")) {
                proresSettings.setInterlaceMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParControl")) {
                proresSettings.setParControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParDenominator")) {
                proresSettings.setParDenominator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParNumerator")) {
                proresSettings.setParNumerator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SlowPal")) {
                proresSettings.setSlowPal(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Telecine")) {
                proresSettings.setTelecine(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return proresSettings;
    }

    private static ProresSettingsJsonUnmarshaller instance;

    public static ProresSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProresSettingsJsonUnmarshaller();
        return instance;
    }
}
