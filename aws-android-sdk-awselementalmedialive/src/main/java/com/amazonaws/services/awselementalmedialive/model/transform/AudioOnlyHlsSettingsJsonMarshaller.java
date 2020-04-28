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
 * JSON marshaller for POJO AudioOnlyHlsSettings
 */
class AudioOnlyHlsSettingsJsonMarshaller {

    public void marshall(AudioOnlyHlsSettings audioOnlyHlsSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (audioOnlyHlsSettings.getAudioGroupId() != null) {
            String audioGroupId = audioOnlyHlsSettings.getAudioGroupId();
            jsonWriter.name("AudioGroupId");
            jsonWriter.value(audioGroupId);
        }
        if (audioOnlyHlsSettings.getAudioOnlyImage() != null) {
            InputLocation audioOnlyImage = audioOnlyHlsSettings.getAudioOnlyImage();
            jsonWriter.name("AudioOnlyImage");
            InputLocationJsonMarshaller.getInstance().marshall(audioOnlyImage, jsonWriter);
        }
        if (audioOnlyHlsSettings.getAudioTrackType() != null) {
            String audioTrackType = audioOnlyHlsSettings.getAudioTrackType();
            jsonWriter.name("AudioTrackType");
            jsonWriter.value(audioTrackType);
        }
        if (audioOnlyHlsSettings.getSegmentType() != null) {
            String segmentType = audioOnlyHlsSettings.getSegmentType();
            jsonWriter.name("SegmentType");
            jsonWriter.value(segmentType);
        }
        jsonWriter.endObject();
    }

    private static AudioOnlyHlsSettingsJsonMarshaller instance;

    public static AudioOnlyHlsSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AudioOnlyHlsSettingsJsonMarshaller();
        return instance;
    }
}
