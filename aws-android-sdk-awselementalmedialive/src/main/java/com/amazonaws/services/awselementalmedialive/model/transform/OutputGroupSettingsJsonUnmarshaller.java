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
 * JSON unmarshaller for POJO OutputGroupSettings
 */
class OutputGroupSettingsJsonUnmarshaller implements
        Unmarshaller<OutputGroupSettings, JsonUnmarshallerContext> {

    public OutputGroupSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        OutputGroupSettings outputGroupSettings = new OutputGroupSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ArchiveGroupSettings")) {
                outputGroupSettings.setArchiveGroupSettings(ArchiveGroupSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FrameCaptureGroupSettings")) {
                outputGroupSettings
                        .setFrameCaptureGroupSettings(FrameCaptureGroupSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("HlsGroupSettings")) {
                outputGroupSettings.setHlsGroupSettings(HlsGroupSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MediaPackageGroupSettings")) {
                outputGroupSettings
                        .setMediaPackageGroupSettings(MediaPackageGroupSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("MsSmoothGroupSettings")) {
                outputGroupSettings.setMsSmoothGroupSettings(MsSmoothGroupSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MultiplexGroupSettings")) {
                outputGroupSettings
                        .setMultiplexGroupSettings(MultiplexGroupSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("RtmpGroupSettings")) {
                outputGroupSettings.setRtmpGroupSettings(RtmpGroupSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("UdpGroupSettings")) {
                outputGroupSettings.setUdpGroupSettings(UdpGroupSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return outputGroupSettings;
    }

    private static OutputGroupSettingsJsonUnmarshaller instance;

    public static OutputGroupSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OutputGroupSettingsJsonUnmarshaller();
        return instance;
    }
}
