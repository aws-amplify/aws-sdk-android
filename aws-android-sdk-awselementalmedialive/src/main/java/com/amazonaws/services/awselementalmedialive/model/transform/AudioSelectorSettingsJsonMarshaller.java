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
 * JSON marshaller for POJO AudioSelectorSettings
 */
class AudioSelectorSettingsJsonMarshaller {

    public void marshall(AudioSelectorSettings audioSelectorSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (audioSelectorSettings.getAudioLanguageSelection() != null) {
            AudioLanguageSelection audioLanguageSelection = audioSelectorSettings
                    .getAudioLanguageSelection();
            jsonWriter.name("AudioLanguageSelection");
            AudioLanguageSelectionJsonMarshaller.getInstance().marshall(audioLanguageSelection,
                    jsonWriter);
        }
        if (audioSelectorSettings.getAudioPidSelection() != null) {
            AudioPidSelection audioPidSelection = audioSelectorSettings.getAudioPidSelection();
            jsonWriter.name("AudioPidSelection");
            AudioPidSelectionJsonMarshaller.getInstance().marshall(audioPidSelection, jsonWriter);
        }
        if (audioSelectorSettings.getAudioTrackSelection() != null) {
            AudioTrackSelection audioTrackSelection = audioSelectorSettings
                    .getAudioTrackSelection();
            jsonWriter.name("AudioTrackSelection");
            AudioTrackSelectionJsonMarshaller.getInstance().marshall(audioTrackSelection,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AudioSelectorSettingsJsonMarshaller instance;

    public static AudioSelectorSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AudioSelectorSettingsJsonMarshaller();
        return instance;
    }
}
