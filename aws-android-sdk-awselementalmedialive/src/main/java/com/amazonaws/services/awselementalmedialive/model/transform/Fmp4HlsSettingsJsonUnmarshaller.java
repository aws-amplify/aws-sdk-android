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
 * JSON unmarshaller for POJO Fmp4HlsSettings
 */
class Fmp4HlsSettingsJsonUnmarshaller implements
        Unmarshaller<Fmp4HlsSettings, JsonUnmarshallerContext> {

    public Fmp4HlsSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Fmp4HlsSettings fmp4HlsSettings = new Fmp4HlsSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AudioRenditionSets")) {
                fmp4HlsSettings.setAudioRenditionSets(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NielsenId3Behavior")) {
                fmp4HlsSettings.setNielsenId3Behavior(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimedMetadataBehavior")) {
                fmp4HlsSettings.setTimedMetadataBehavior(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return fmp4HlsSettings;
    }

    private static Fmp4HlsSettingsJsonUnmarshaller instance;

    public static Fmp4HlsSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Fmp4HlsSettingsJsonUnmarshaller();
        return instance;
    }
}
