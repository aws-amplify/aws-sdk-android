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
 * JSON unmarshaller for POJO DvbSubDestinationSettings
 */
class DvbSubDestinationSettingsJsonUnmarshaller implements
        Unmarshaller<DvbSubDestinationSettings, JsonUnmarshallerContext> {

    public DvbSubDestinationSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DvbSubDestinationSettings dvbSubDestinationSettings = new DvbSubDestinationSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Alignment")) {
                dvbSubDestinationSettings.setAlignment(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackgroundColor")) {
                dvbSubDestinationSettings.setBackgroundColor(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackgroundOpacity")) {
                dvbSubDestinationSettings.setBackgroundOpacity(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FontColor")) {
                dvbSubDestinationSettings.setFontColor(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FontOpacity")) {
                dvbSubDestinationSettings.setFontOpacity(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FontResolution")) {
                dvbSubDestinationSettings.setFontResolution(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FontScript")) {
                dvbSubDestinationSettings.setFontScript(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FontSize")) {
                dvbSubDestinationSettings.setFontSize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutlineColor")) {
                dvbSubDestinationSettings.setOutlineColor(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutlineSize")) {
                dvbSubDestinationSettings.setOutlineSize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ShadowColor")) {
                dvbSubDestinationSettings.setShadowColor(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ShadowOpacity")) {
                dvbSubDestinationSettings.setShadowOpacity(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ShadowXOffset")) {
                dvbSubDestinationSettings.setShadowXOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ShadowYOffset")) {
                dvbSubDestinationSettings.setShadowYOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubtitlingType")) {
                dvbSubDestinationSettings.setSubtitlingType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TeletextSpacing")) {
                dvbSubDestinationSettings.setTeletextSpacing(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("XPosition")) {
                dvbSubDestinationSettings.setXPosition(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("YPosition")) {
                dvbSubDestinationSettings.setYPosition(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return dvbSubDestinationSettings;
    }

    private static DvbSubDestinationSettingsJsonUnmarshaller instance;

    public static DvbSubDestinationSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DvbSubDestinationSettingsJsonUnmarshaller();
        return instance;
    }
}
