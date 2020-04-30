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
 * JSON marshaller for POJO PresetSettings
 */
class PresetSettingsJsonMarshaller {

    public void marshall(PresetSettings presetSettings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (presetSettings.getAudioDescriptions() != null) {
            java.util.List<AudioDescription> audioDescriptions = presetSettings
                    .getAudioDescriptions();
            jsonWriter.name("AudioDescriptions");
            jsonWriter.beginArray();
            for (AudioDescription audioDescriptionsItem : audioDescriptions) {
                if (audioDescriptionsItem != null) {
                    AudioDescriptionJsonMarshaller.getInstance().marshall(audioDescriptionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (presetSettings.getCaptionDescriptions() != null) {
            java.util.List<CaptionDescriptionPreset> captionDescriptions = presetSettings
                    .getCaptionDescriptions();
            jsonWriter.name("CaptionDescriptions");
            jsonWriter.beginArray();
            for (CaptionDescriptionPreset captionDescriptionsItem : captionDescriptions) {
                if (captionDescriptionsItem != null) {
                    CaptionDescriptionPresetJsonMarshaller.getInstance().marshall(
                            captionDescriptionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (presetSettings.getContainerSettings() != null) {
            ContainerSettings containerSettings = presetSettings.getContainerSettings();
            jsonWriter.name("ContainerSettings");
            ContainerSettingsJsonMarshaller.getInstance().marshall(containerSettings, jsonWriter);
        }
        if (presetSettings.getVideoDescription() != null) {
            VideoDescription videoDescription = presetSettings.getVideoDescription();
            jsonWriter.name("VideoDescription");
            VideoDescriptionJsonMarshaller.getInstance().marshall(videoDescription, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static PresetSettingsJsonMarshaller instance;

    public static PresetSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PresetSettingsJsonMarshaller();
        return instance;
    }
}
