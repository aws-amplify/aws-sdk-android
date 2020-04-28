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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CaptionSelectorSettings
 */
class CaptionSelectorSettingsJsonMarshaller {

    public void marshall(CaptionSelectorSettings captionSelectorSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (captionSelectorSettings.getAribSourceSettings() != null) {
            AribSourceSettings aribSourceSettings = captionSelectorSettings.getAribSourceSettings();
            jsonWriter.name("AribSourceSettings");
            AribSourceSettingsJsonMarshaller.getInstance().marshall(aribSourceSettings, jsonWriter);
        }
        if (captionSelectorSettings.getDvbSubSourceSettings() != null) {
            DvbSubSourceSettings dvbSubSourceSettings = captionSelectorSettings
                    .getDvbSubSourceSettings();
            jsonWriter.name("DvbSubSourceSettings");
            DvbSubSourceSettingsJsonMarshaller.getInstance().marshall(dvbSubSourceSettings,
                    jsonWriter);
        }
        if (captionSelectorSettings.getEmbeddedSourceSettings() != null) {
            EmbeddedSourceSettings embeddedSourceSettings = captionSelectorSettings
                    .getEmbeddedSourceSettings();
            jsonWriter.name("EmbeddedSourceSettings");
            EmbeddedSourceSettingsJsonMarshaller.getInstance().marshall(embeddedSourceSettings,
                    jsonWriter);
        }
        if (captionSelectorSettings.getScte20SourceSettings() != null) {
            Scte20SourceSettings scte20SourceSettings = captionSelectorSettings
                    .getScte20SourceSettings();
            jsonWriter.name("Scte20SourceSettings");
            Scte20SourceSettingsJsonMarshaller.getInstance().marshall(scte20SourceSettings,
                    jsonWriter);
        }
        if (captionSelectorSettings.getScte27SourceSettings() != null) {
            Scte27SourceSettings scte27SourceSettings = captionSelectorSettings
                    .getScte27SourceSettings();
            jsonWriter.name("Scte27SourceSettings");
            Scte27SourceSettingsJsonMarshaller.getInstance().marshall(scte27SourceSettings,
                    jsonWriter);
        }
        if (captionSelectorSettings.getTeletextSourceSettings() != null) {
            TeletextSourceSettings teletextSourceSettings = captionSelectorSettings
                    .getTeletextSourceSettings();
            jsonWriter.name("TeletextSourceSettings");
            TeletextSourceSettingsJsonMarshaller.getInstance().marshall(teletextSourceSettings,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static CaptionSelectorSettingsJsonMarshaller instance;

    public static CaptionSelectorSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CaptionSelectorSettingsJsonMarshaller();
        return instance;
    }
}
