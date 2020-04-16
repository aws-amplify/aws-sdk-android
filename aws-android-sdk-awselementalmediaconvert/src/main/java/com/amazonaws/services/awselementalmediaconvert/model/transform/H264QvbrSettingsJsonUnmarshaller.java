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
 * JSON unmarshaller for POJO H264QvbrSettings
 */
class H264QvbrSettingsJsonUnmarshaller implements
        Unmarshaller<H264QvbrSettings, JsonUnmarshallerContext> {

    public H264QvbrSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        H264QvbrSettings h264QvbrSettings = new H264QvbrSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("MaxAverageBitrate")) {
                h264QvbrSettings.setMaxAverageBitrate(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("QvbrQualityLevel")) {
                h264QvbrSettings.setQvbrQualityLevel(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("QvbrQualityLevelFineTune")) {
                h264QvbrSettings.setQvbrQualityLevelFineTune(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return h264QvbrSettings;
    }

    private static H264QvbrSettingsJsonUnmarshaller instance;

    public static H264QvbrSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new H264QvbrSettingsJsonUnmarshaller();
        return instance;
    }
}
