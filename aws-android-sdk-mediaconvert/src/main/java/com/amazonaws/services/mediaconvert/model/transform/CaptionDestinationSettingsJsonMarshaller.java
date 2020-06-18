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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CaptionDestinationSettings
 */
class CaptionDestinationSettingsJsonMarshaller {

    public void marshall(CaptionDestinationSettings captionDestinationSettings,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (captionDestinationSettings.getBurninDestinationSettings() != null) {
            BurninDestinationSettings burninDestinationSettings = captionDestinationSettings
                    .getBurninDestinationSettings();
            jsonWriter.name("BurninDestinationSettings");
            BurninDestinationSettingsJsonMarshaller.getInstance().marshall(
                    burninDestinationSettings, jsonWriter);
        }
        if (captionDestinationSettings.getDestinationType() != null) {
            String destinationType = captionDestinationSettings.getDestinationType();
            jsonWriter.name("DestinationType");
            jsonWriter.value(destinationType);
        }
        if (captionDestinationSettings.getDvbSubDestinationSettings() != null) {
            DvbSubDestinationSettings dvbSubDestinationSettings = captionDestinationSettings
                    .getDvbSubDestinationSettings();
            jsonWriter.name("DvbSubDestinationSettings");
            DvbSubDestinationSettingsJsonMarshaller.getInstance().marshall(
                    dvbSubDestinationSettings, jsonWriter);
        }
        if (captionDestinationSettings.getEmbeddedDestinationSettings() != null) {
            EmbeddedDestinationSettings embeddedDestinationSettings = captionDestinationSettings
                    .getEmbeddedDestinationSettings();
            jsonWriter.name("EmbeddedDestinationSettings");
            EmbeddedDestinationSettingsJsonMarshaller.getInstance().marshall(
                    embeddedDestinationSettings, jsonWriter);
        }
        if (captionDestinationSettings.getImscDestinationSettings() != null) {
            ImscDestinationSettings imscDestinationSettings = captionDestinationSettings
                    .getImscDestinationSettings();
            jsonWriter.name("ImscDestinationSettings");
            ImscDestinationSettingsJsonMarshaller.getInstance().marshall(imscDestinationSettings,
                    jsonWriter);
        }
        if (captionDestinationSettings.getSccDestinationSettings() != null) {
            SccDestinationSettings sccDestinationSettings = captionDestinationSettings
                    .getSccDestinationSettings();
            jsonWriter.name("SccDestinationSettings");
            SccDestinationSettingsJsonMarshaller.getInstance().marshall(sccDestinationSettings,
                    jsonWriter);
        }
        if (captionDestinationSettings.getTeletextDestinationSettings() != null) {
            TeletextDestinationSettings teletextDestinationSettings = captionDestinationSettings
                    .getTeletextDestinationSettings();
            jsonWriter.name("TeletextDestinationSettings");
            TeletextDestinationSettingsJsonMarshaller.getInstance().marshall(
                    teletextDestinationSettings, jsonWriter);
        }
        if (captionDestinationSettings.getTtmlDestinationSettings() != null) {
            TtmlDestinationSettings ttmlDestinationSettings = captionDestinationSettings
                    .getTtmlDestinationSettings();
            jsonWriter.name("TtmlDestinationSettings");
            TtmlDestinationSettingsJsonMarshaller.getInstance().marshall(ttmlDestinationSettings,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static CaptionDestinationSettingsJsonMarshaller instance;

    public static CaptionDestinationSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CaptionDestinationSettingsJsonMarshaller();
        return instance;
    }
}
