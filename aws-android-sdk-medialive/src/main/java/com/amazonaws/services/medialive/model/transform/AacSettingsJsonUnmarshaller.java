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

package com.amazonaws.services.medialive.model.transform;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AacSettings
 */
class AacSettingsJsonUnmarshaller implements Unmarshaller<AacSettings, JsonUnmarshallerContext> {

    public AacSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AacSettings aacSettings = new AacSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Bitrate")) {
                aacSettings.setBitrate(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CodingMode")) {
                aacSettings.setCodingMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputType")) {
                aacSettings.setInputType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Profile")) {
                aacSettings.setProfile(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RateControlMode")) {
                aacSettings.setRateControlMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RawFormat")) {
                aacSettings.setRawFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SampleRate")) {
                aacSettings.setSampleRate(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Spec")) {
                aacSettings.setSpec(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VbrQuality")) {
                aacSettings.setVbrQuality(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return aacSettings;
    }

    private static AacSettingsJsonUnmarshaller instance;

    public static AacSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AacSettingsJsonUnmarshaller();
        return instance;
    }
}
