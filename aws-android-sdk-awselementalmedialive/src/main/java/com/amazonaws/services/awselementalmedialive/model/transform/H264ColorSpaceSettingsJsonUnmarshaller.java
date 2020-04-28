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
 * JSON unmarshaller for POJO H264ColorSpaceSettings
 */
class H264ColorSpaceSettingsJsonUnmarshaller implements
        Unmarshaller<H264ColorSpaceSettings, JsonUnmarshallerContext> {

    public H264ColorSpaceSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        H264ColorSpaceSettings h264ColorSpaceSettings = new H264ColorSpaceSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ColorSpacePassthroughSettings")) {
                h264ColorSpaceSettings
                        .setColorSpacePassthroughSettings(ColorSpacePassthroughSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Rec601Settings")) {
                h264ColorSpaceSettings.setRec601Settings(Rec601SettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Rec709Settings")) {
                h264ColorSpaceSettings.setRec709Settings(Rec709SettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return h264ColorSpaceSettings;
    }

    private static H264ColorSpaceSettingsJsonUnmarshaller instance;

    public static H264ColorSpaceSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new H264ColorSpaceSettingsJsonUnmarshaller();
        return instance;
    }
}
