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
 * JSON unmarshaller for POJO Ac3Settings
 */
class Ac3SettingsJsonUnmarshaller implements Unmarshaller<Ac3Settings, JsonUnmarshallerContext> {

    public Ac3Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Ac3Settings ac3Settings = new Ac3Settings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Bitrate")) {
                ac3Settings.setBitrate(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BitstreamMode")) {
                ac3Settings.setBitstreamMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CodingMode")) {
                ac3Settings.setCodingMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Dialnorm")) {
                ac3Settings.setDialnorm(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DynamicRangeCompressionProfile")) {
                ac3Settings.setDynamicRangeCompressionProfile(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LfeFilter")) {
                ac3Settings.setLfeFilter(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MetadataControl")) {
                ac3Settings.setMetadataControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SampleRate")) {
                ac3Settings.setSampleRate(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return ac3Settings;
    }

    private static Ac3SettingsJsonUnmarshaller instance;

    public static Ac3SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Ac3SettingsJsonUnmarshaller();
        return instance;
    }
}
