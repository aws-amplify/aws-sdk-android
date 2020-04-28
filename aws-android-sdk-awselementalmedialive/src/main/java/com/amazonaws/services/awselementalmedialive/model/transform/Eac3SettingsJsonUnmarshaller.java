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
 * JSON unmarshaller for POJO Eac3Settings
 */
class Eac3SettingsJsonUnmarshaller implements Unmarshaller<Eac3Settings, JsonUnmarshallerContext> {

    public Eac3Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Eac3Settings eac3Settings = new Eac3Settings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AttenuationControl")) {
                eac3Settings.setAttenuationControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Bitrate")) {
                eac3Settings.setBitrate(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BitstreamMode")) {
                eac3Settings.setBitstreamMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CodingMode")) {
                eac3Settings.setCodingMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DcFilter")) {
                eac3Settings.setDcFilter(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Dialnorm")) {
                eac3Settings.setDialnorm(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DrcLine")) {
                eac3Settings.setDrcLine(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DrcRf")) {
                eac3Settings.setDrcRf(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LfeControl")) {
                eac3Settings.setLfeControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LfeFilter")) {
                eac3Settings.setLfeFilter(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LoRoCenterMixLevel")) {
                eac3Settings.setLoRoCenterMixLevel(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LoRoSurroundMixLevel")) {
                eac3Settings.setLoRoSurroundMixLevel(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LtRtCenterMixLevel")) {
                eac3Settings.setLtRtCenterMixLevel(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LtRtSurroundMixLevel")) {
                eac3Settings.setLtRtSurroundMixLevel(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MetadataControl")) {
                eac3Settings.setMetadataControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PassthroughControl")) {
                eac3Settings.setPassthroughControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PhaseControl")) {
                eac3Settings.setPhaseControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StereoDownmix")) {
                eac3Settings.setStereoDownmix(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SurroundExMode")) {
                eac3Settings.setSurroundExMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SurroundMode")) {
                eac3Settings.setSurroundMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return eac3Settings;
    }

    private static Eac3SettingsJsonUnmarshaller instance;

    public static Eac3SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Eac3SettingsJsonUnmarshaller();
        return instance;
    }
}
