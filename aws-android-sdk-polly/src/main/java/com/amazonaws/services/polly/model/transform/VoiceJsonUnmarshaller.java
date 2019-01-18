/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.polly.model.transform;

import com.amazonaws.services.polly.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Voice
 */
class VoiceJsonUnmarshaller implements Unmarshaller<Voice, JsonUnmarshallerContext> {

    public Voice unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Voice voice = new Voice();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Gender")) {
                voice.setGender(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                voice.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LanguageCode")) {
                voice.setLanguageCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LanguageName")) {
                voice.setLanguageName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                voice.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AdditionalLanguageCodes")) {
                voice.setAdditionalLanguageCodes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return voice;
    }

    private static VoiceJsonUnmarshaller instance;

    public static VoiceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VoiceJsonUnmarshaller();
        return instance;
    }
}
