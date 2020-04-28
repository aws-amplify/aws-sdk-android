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
 * JSON unmarshaller for POJO CaptionSelectorSettings
 */
class CaptionSelectorSettingsJsonUnmarshaller implements
        Unmarshaller<CaptionSelectorSettings, JsonUnmarshallerContext> {

    public CaptionSelectorSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CaptionSelectorSettings captionSelectorSettings = new CaptionSelectorSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AribSourceSettings")) {
                captionSelectorSettings.setAribSourceSettings(AribSourceSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DvbSubSourceSettings")) {
                captionSelectorSettings
                        .setDvbSubSourceSettings(DvbSubSourceSettingsJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("EmbeddedSourceSettings")) {
                captionSelectorSettings
                        .setEmbeddedSourceSettings(EmbeddedSourceSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Scte20SourceSettings")) {
                captionSelectorSettings
                        .setScte20SourceSettings(Scte20SourceSettingsJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Scte27SourceSettings")) {
                captionSelectorSettings
                        .setScte27SourceSettings(Scte27SourceSettingsJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("TeletextSourceSettings")) {
                captionSelectorSettings
                        .setTeletextSourceSettings(TeletextSourceSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return captionSelectorSettings;
    }

    private static CaptionSelectorSettingsJsonUnmarshaller instance;

    public static CaptionSelectorSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CaptionSelectorSettingsJsonUnmarshaller();
        return instance;
    }
}
