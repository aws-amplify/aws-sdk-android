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
 * JSON marshaller for POJO Output
 */
class OutputJsonMarshaller {

    public void marshall(Output output, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (output.getAudioDescriptions() != null) {
            java.util.List<AudioDescription> audioDescriptions = output.getAudioDescriptions();
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
        if (output.getCaptionDescriptions() != null) {
            java.util.List<CaptionDescription> captionDescriptions = output
                    .getCaptionDescriptions();
            jsonWriter.name("CaptionDescriptions");
            jsonWriter.beginArray();
            for (CaptionDescription captionDescriptionsItem : captionDescriptions) {
                if (captionDescriptionsItem != null) {
                    CaptionDescriptionJsonMarshaller.getInstance().marshall(
                            captionDescriptionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (output.getContainerSettings() != null) {
            ContainerSettings containerSettings = output.getContainerSettings();
            jsonWriter.name("ContainerSettings");
            ContainerSettingsJsonMarshaller.getInstance().marshall(containerSettings, jsonWriter);
        }
        if (output.getExtension() != null) {
            String extension = output.getExtension();
            jsonWriter.name("Extension");
            jsonWriter.value(extension);
        }
        if (output.getNameModifier() != null) {
            String nameModifier = output.getNameModifier();
            jsonWriter.name("NameModifier");
            jsonWriter.value(nameModifier);
        }
        if (output.getOutputSettings() != null) {
            OutputSettings outputSettings = output.getOutputSettings();
            jsonWriter.name("OutputSettings");
            OutputSettingsJsonMarshaller.getInstance().marshall(outputSettings, jsonWriter);
        }
        if (output.getPreset() != null) {
            String preset = output.getPreset();
            jsonWriter.name("Preset");
            jsonWriter.value(preset);
        }
        if (output.getVideoDescription() != null) {
            VideoDescription videoDescription = output.getVideoDescription();
            jsonWriter.name("VideoDescription");
            VideoDescriptionJsonMarshaller.getInstance().marshall(videoDescription, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static OutputJsonMarshaller instance;

    public static OutputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OutputJsonMarshaller();
        return instance;
    }
}
