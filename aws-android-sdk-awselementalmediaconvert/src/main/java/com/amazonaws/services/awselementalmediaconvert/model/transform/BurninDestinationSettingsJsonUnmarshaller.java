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
 * JSON unmarshaller for POJO BurninDestinationSettings
 */
class BurninDestinationSettingsJsonUnmarshaller implements
        Unmarshaller<BurninDestinationSettings, JsonUnmarshallerContext> {

    public BurninDestinationSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        BurninDestinationSettings burninDestinationSettings = new BurninDestinationSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Alignment")) {
                burninDestinationSettings.setAlignment(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackgroundColor")) {
                burninDestinationSettings.setBackgroundColor(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackgroundOpacity")) {
                burninDestinationSettings.setBackgroundOpacity(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FontColor")) {
                burninDestinationSettings.setFontColor(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FontOpacity")) {
                burninDestinationSettings.setFontOpacity(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FontResolution")) {
                burninDestinationSettings.setFontResolution(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FontScript")) {
                burninDestinationSettings.setFontScript(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FontSize")) {
                burninDestinationSettings.setFontSize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutlineColor")) {
                burninDestinationSettings.setOutlineColor(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutlineSize")) {
                burninDestinationSettings.setOutlineSize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ShadowColor")) {
                burninDestinationSettings.setShadowColor(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ShadowOpacity")) {
                burninDestinationSettings.setShadowOpacity(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ShadowXOffset")) {
                burninDestinationSettings.setShadowXOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ShadowYOffset")) {
                burninDestinationSettings.setShadowYOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TeletextSpacing")) {
                burninDestinationSettings.setTeletextSpacing(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("XPosition")) {
                burninDestinationSettings.setXPosition(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("YPosition")) {
                burninDestinationSettings.setYPosition(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return burninDestinationSettings;
    }

    private static BurninDestinationSettingsJsonUnmarshaller instance;

    public static BurninDestinationSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BurninDestinationSettingsJsonUnmarshaller();
        return instance;
    }
}
