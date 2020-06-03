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
 * JSON unmarshaller for POJO FileSourceSettings
 */
class FileSourceSettingsJsonUnmarshaller implements
        Unmarshaller<FileSourceSettings, JsonUnmarshallerContext> {

    public FileSourceSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FileSourceSettings fileSourceSettings = new FileSourceSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Convert608To708")) {
                fileSourceSettings.setConvert608To708(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Framerate")) {
                fileSourceSettings.setFramerate(CaptionSourceFramerateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceFile")) {
                fileSourceSettings.setSourceFile(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimeDelta")) {
                fileSourceSettings.setTimeDelta(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return fileSourceSettings;
    }

    private static FileSourceSettingsJsonUnmarshaller instance;

    public static FileSourceSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FileSourceSettingsJsonUnmarshaller();
        return instance;
    }
}
