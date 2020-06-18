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
 * JSON unmarshaller for POJO Eac3AtmosSettings
 */
class Eac3AtmosSettingsJsonUnmarshaller implements
        Unmarshaller<Eac3AtmosSettings, JsonUnmarshallerContext> {

    public Eac3AtmosSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Eac3AtmosSettings eac3AtmosSettings = new Eac3AtmosSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Bitrate")) {
                eac3AtmosSettings.setBitrate(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BitstreamMode")) {
                eac3AtmosSettings.setBitstreamMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CodingMode")) {
                eac3AtmosSettings.setCodingMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DialogueIntelligence")) {
                eac3AtmosSettings.setDialogueIntelligence(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DynamicRangeCompressionLine")) {
                eac3AtmosSettings.setDynamicRangeCompressionLine(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DynamicRangeCompressionRf")) {
                eac3AtmosSettings.setDynamicRangeCompressionRf(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LoRoCenterMixLevel")) {
                eac3AtmosSettings.setLoRoCenterMixLevel(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LoRoSurroundMixLevel")) {
                eac3AtmosSettings.setLoRoSurroundMixLevel(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LtRtCenterMixLevel")) {
                eac3AtmosSettings.setLtRtCenterMixLevel(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LtRtSurroundMixLevel")) {
                eac3AtmosSettings.setLtRtSurroundMixLevel(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MeteringMode")) {
                eac3AtmosSettings.setMeteringMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SampleRate")) {
                eac3AtmosSettings.setSampleRate(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SpeechThreshold")) {
                eac3AtmosSettings.setSpeechThreshold(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StereoDownmix")) {
                eac3AtmosSettings.setStereoDownmix(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SurroundExMode")) {
                eac3AtmosSettings.setSurroundExMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return eac3AtmosSettings;
    }

    private static Eac3AtmosSettingsJsonUnmarshaller instance;

    public static Eac3AtmosSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Eac3AtmosSettingsJsonUnmarshaller();
        return instance;
    }
}
