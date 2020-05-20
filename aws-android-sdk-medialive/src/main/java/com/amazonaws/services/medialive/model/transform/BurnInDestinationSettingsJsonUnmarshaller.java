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
 * JSON unmarshaller for POJO BurnInDestinationSettings
 */
class BurnInDestinationSettingsJsonUnmarshaller implements
        Unmarshaller<BurnInDestinationSettings, JsonUnmarshallerContext> {

    public BurnInDestinationSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        BurnInDestinationSettings burnInDestinationSettings = new BurnInDestinationSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Alignment")) {
                burnInDestinationSettings.setAlignment(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackgroundColor")) {
                burnInDestinationSettings.setBackgroundColor(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackgroundOpacity")) {
                burnInDestinationSettings.setBackgroundOpacity(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Font")) {
                burnInDestinationSettings.setFont(InputLocationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FontColor")) {
                burnInDestinationSettings.setFontColor(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FontOpacity")) {
                burnInDestinationSettings.setFontOpacity(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FontResolution")) {
                burnInDestinationSettings.setFontResolution(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FontSize")) {
                burnInDestinationSettings.setFontSize(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutlineColor")) {
                burnInDestinationSettings.setOutlineColor(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutlineSize")) {
                burnInDestinationSettings.setOutlineSize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ShadowColor")) {
                burnInDestinationSettings.setShadowColor(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ShadowOpacity")) {
                burnInDestinationSettings.setShadowOpacity(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ShadowXOffset")) {
                burnInDestinationSettings.setShadowXOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ShadowYOffset")) {
                burnInDestinationSettings.setShadowYOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TeletextGridControl")) {
                burnInDestinationSettings.setTeletextGridControl(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("XPosition")) {
                burnInDestinationSettings.setXPosition(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("YPosition")) {
                burnInDestinationSettings.setYPosition(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return burnInDestinationSettings;
    }

    private static BurnInDestinationSettingsJsonUnmarshaller instance;

    public static BurnInDestinationSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BurnInDestinationSettingsJsonUnmarshaller();
        return instance;
    }
}
