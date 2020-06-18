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
 * JSON unmarshaller for POJO FrameCaptureSettings
 */
class FrameCaptureSettingsJsonUnmarshaller implements
        Unmarshaller<FrameCaptureSettings, JsonUnmarshallerContext> {

    public FrameCaptureSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FrameCaptureSettings frameCaptureSettings = new FrameCaptureSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("FramerateDenominator")) {
                frameCaptureSettings.setFramerateDenominator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FramerateNumerator")) {
                frameCaptureSettings.setFramerateNumerator(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxCaptures")) {
                frameCaptureSettings.setMaxCaptures(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Quality")) {
                frameCaptureSettings.setQuality(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return frameCaptureSettings;
    }

    private static FrameCaptureSettingsJsonUnmarshaller instance;

    public static FrameCaptureSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FrameCaptureSettingsJsonUnmarshaller();
        return instance;
    }
}
