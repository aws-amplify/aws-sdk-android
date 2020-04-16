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
 * JSON unmarshaller for POJO CaptionDestinationSettings
 */
class CaptionDestinationSettingsJsonUnmarshaller implements
        Unmarshaller<CaptionDestinationSettings, JsonUnmarshallerContext> {

    public CaptionDestinationSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CaptionDestinationSettings captionDestinationSettings = new CaptionDestinationSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BurninDestinationSettings")) {
                captionDestinationSettings
                        .setBurninDestinationSettings(BurninDestinationSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("DestinationType")) {
                captionDestinationSettings.setDestinationType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DvbSubDestinationSettings")) {
                captionDestinationSettings
                        .setDvbSubDestinationSettings(DvbSubDestinationSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("EmbeddedDestinationSettings")) {
                captionDestinationSettings
                        .setEmbeddedDestinationSettings(EmbeddedDestinationSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ImscDestinationSettings")) {
                captionDestinationSettings
                        .setImscDestinationSettings(ImscDestinationSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("SccDestinationSettings")) {
                captionDestinationSettings
                        .setSccDestinationSettings(SccDestinationSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("TeletextDestinationSettings")) {
                captionDestinationSettings
                        .setTeletextDestinationSettings(TeletextDestinationSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("TtmlDestinationSettings")) {
                captionDestinationSettings
                        .setTtmlDestinationSettings(TtmlDestinationSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return captionDestinationSettings;
    }

    private static CaptionDestinationSettingsJsonUnmarshaller instance;

    public static CaptionDestinationSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CaptionDestinationSettingsJsonUnmarshaller();
        return instance;
    }
}
