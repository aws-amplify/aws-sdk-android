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
 * JSON marshaller for POJO CaptionSourceSettings
 */
class CaptionSourceSettingsJsonMarshaller {

    public void marshall(CaptionSourceSettings captionSourceSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (captionSourceSettings.getAncillarySourceSettings() != null) {
            AncillarySourceSettings ancillarySourceSettings = captionSourceSettings
                    .getAncillarySourceSettings();
            jsonWriter.name("AncillarySourceSettings");
            AncillarySourceSettingsJsonMarshaller.getInstance().marshall(ancillarySourceSettings,
                    jsonWriter);
        }
        if (captionSourceSettings.getDvbSubSourceSettings() != null) {
            DvbSubSourceSettings dvbSubSourceSettings = captionSourceSettings
                    .getDvbSubSourceSettings();
            jsonWriter.name("DvbSubSourceSettings");
            DvbSubSourceSettingsJsonMarshaller.getInstance().marshall(dvbSubSourceSettings,
                    jsonWriter);
        }
        if (captionSourceSettings.getEmbeddedSourceSettings() != null) {
            EmbeddedSourceSettings embeddedSourceSettings = captionSourceSettings
                    .getEmbeddedSourceSettings();
            jsonWriter.name("EmbeddedSourceSettings");
            EmbeddedSourceSettingsJsonMarshaller.getInstance().marshall(embeddedSourceSettings,
                    jsonWriter);
        }
        if (captionSourceSettings.getFileSourceSettings() != null) {
            FileSourceSettings fileSourceSettings = captionSourceSettings.getFileSourceSettings();
            jsonWriter.name("FileSourceSettings");
            FileSourceSettingsJsonMarshaller.getInstance().marshall(fileSourceSettings, jsonWriter);
        }
        if (captionSourceSettings.getSourceType() != null) {
            String sourceType = captionSourceSettings.getSourceType();
            jsonWriter.name("SourceType");
            jsonWriter.value(sourceType);
        }
        if (captionSourceSettings.getTeletextSourceSettings() != null) {
            TeletextSourceSettings teletextSourceSettings = captionSourceSettings
                    .getTeletextSourceSettings();
            jsonWriter.name("TeletextSourceSettings");
            TeletextSourceSettingsJsonMarshaller.getInstance().marshall(teletextSourceSettings,
                    jsonWriter);
        }
        if (captionSourceSettings.getTrackSourceSettings() != null) {
            TrackSourceSettings trackSourceSettings = captionSourceSettings
                    .getTrackSourceSettings();
            jsonWriter.name("TrackSourceSettings");
            TrackSourceSettingsJsonMarshaller.getInstance().marshall(trackSourceSettings,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static CaptionSourceSettingsJsonMarshaller instance;

    public static CaptionSourceSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CaptionSourceSettingsJsonMarshaller();
        return instance;
    }
}
