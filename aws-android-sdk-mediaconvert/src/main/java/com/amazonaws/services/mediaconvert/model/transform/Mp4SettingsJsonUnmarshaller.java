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
 * JSON unmarshaller for POJO Mp4Settings
 */
class Mp4SettingsJsonUnmarshaller implements Unmarshaller<Mp4Settings, JsonUnmarshallerContext> {

    public Mp4Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Mp4Settings mp4Settings = new Mp4Settings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CslgAtom")) {
                mp4Settings.setCslgAtom(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CttsVersion")) {
                mp4Settings.setCttsVersion(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FreeSpaceBox")) {
                mp4Settings.setFreeSpaceBox(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MoovPlacement")) {
                mp4Settings.setMoovPlacement(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Mp4MajorBrand")) {
                mp4Settings.setMp4MajorBrand(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return mp4Settings;
    }

    private static Mp4SettingsJsonUnmarshaller instance;

    public static Mp4SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Mp4SettingsJsonUnmarshaller();
        return instance;
    }
}
