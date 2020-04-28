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
 * JSON marshaller for POJO CaptionDestinationSettings
 */
class CaptionDestinationSettingsJsonMarshaller {

    public void marshall(CaptionDestinationSettings captionDestinationSettings,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (captionDestinationSettings.getAribDestinationSettings() != null) {
            AribDestinationSettings aribDestinationSettings = captionDestinationSettings
                    .getAribDestinationSettings();
            jsonWriter.name("AribDestinationSettings");
            AribDestinationSettingsJsonMarshaller.getInstance().marshall(aribDestinationSettings,
                    jsonWriter);
        }
        if (captionDestinationSettings.getBurnInDestinationSettings() != null) {
            BurnInDestinationSettings burnInDestinationSettings = captionDestinationSettings
                    .getBurnInDestinationSettings();
            jsonWriter.name("BurnInDestinationSettings");
            BurnInDestinationSettingsJsonMarshaller.getInstance().marshall(
                    burnInDestinationSettings, jsonWriter);
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
        if (captionDestinationSettings.getEmbeddedPlusScte20DestinationSettings() != null) {
            EmbeddedPlusScte20DestinationSettings embeddedPlusScte20DestinationSettings = captionDestinationSettings
                    .getEmbeddedPlusScte20DestinationSettings();
            jsonWriter.name("EmbeddedPlusScte20DestinationSettings");
            EmbeddedPlusScte20DestinationSettingsJsonMarshaller.getInstance().marshall(
                    embeddedPlusScte20DestinationSettings, jsonWriter);
        }
        if (captionDestinationSettings.getRtmpCaptionInfoDestinationSettings() != null) {
            RtmpCaptionInfoDestinationSettings rtmpCaptionInfoDestinationSettings = captionDestinationSettings
                    .getRtmpCaptionInfoDestinationSettings();
            jsonWriter.name("RtmpCaptionInfoDestinationSettings");
            RtmpCaptionInfoDestinationSettingsJsonMarshaller.getInstance().marshall(
                    rtmpCaptionInfoDestinationSettings, jsonWriter);
        }
        if (captionDestinationSettings.getScte20PlusEmbeddedDestinationSettings() != null) {
            Scte20PlusEmbeddedDestinationSettings scte20PlusEmbeddedDestinationSettings = captionDestinationSettings
                    .getScte20PlusEmbeddedDestinationSettings();
            jsonWriter.name("Scte20PlusEmbeddedDestinationSettings");
            Scte20PlusEmbeddedDestinationSettingsJsonMarshaller.getInstance().marshall(
                    scte20PlusEmbeddedDestinationSettings, jsonWriter);
        }
        if (captionDestinationSettings.getScte27DestinationSettings() != null) {
            Scte27DestinationSettings scte27DestinationSettings = captionDestinationSettings
                    .getScte27DestinationSettings();
            jsonWriter.name("Scte27DestinationSettings");
            Scte27DestinationSettingsJsonMarshaller.getInstance().marshall(
                    scte27DestinationSettings, jsonWriter);
        }
        if (captionDestinationSettings.getSmpteTtDestinationSettings() != null) {
            SmpteTtDestinationSettings smpteTtDestinationSettings = captionDestinationSettings
                    .getSmpteTtDestinationSettings();
            jsonWriter.name("SmpteTtDestinationSettings");
            SmpteTtDestinationSettingsJsonMarshaller.getInstance().marshall(
                    smpteTtDestinationSettings, jsonWriter);
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
        if (captionDestinationSettings.getWebvttDestinationSettings() != null) {
            WebvttDestinationSettings webvttDestinationSettings = captionDestinationSettings
                    .getWebvttDestinationSettings();
            jsonWriter.name("WebvttDestinationSettings");
            WebvttDestinationSettingsJsonMarshaller.getInstance().marshall(
                    webvttDestinationSettings, jsonWriter);
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
