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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FileSourceSettings
 */
class FileSourceSettingsJsonMarshaller {

    public void marshall(FileSourceSettings fileSourceSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (fileSourceSettings.getConvert608To708() != null) {
            String convert608To708 = fileSourceSettings.getConvert608To708();
            jsonWriter.name("Convert608To708");
            jsonWriter.value(convert608To708);
        }
        if (fileSourceSettings.getFramerate() != null) {
            CaptionSourceFramerate framerate = fileSourceSettings.getFramerate();
            jsonWriter.name("Framerate");
            CaptionSourceFramerateJsonMarshaller.getInstance().marshall(framerate, jsonWriter);
        }
        if (fileSourceSettings.getSourceFile() != null) {
            String sourceFile = fileSourceSettings.getSourceFile();
            jsonWriter.name("SourceFile");
            jsonWriter.value(sourceFile);
        }
        if (fileSourceSettings.getTimeDelta() != null) {
            Integer timeDelta = fileSourceSettings.getTimeDelta();
            jsonWriter.name("TimeDelta");
            jsonWriter.value(timeDelta);
        }
        jsonWriter.endObject();
    }

    private static FileSourceSettingsJsonMarshaller instance;

    public static FileSourceSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FileSourceSettingsJsonMarshaller();
        return instance;
    }
}
