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
 * JSON marshaller for POJO AudioSelector
 */
class AudioSelectorJsonMarshaller {

    public void marshall(AudioSelector audioSelector, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (audioSelector.getCustomLanguageCode() != null) {
            String customLanguageCode = audioSelector.getCustomLanguageCode();
            jsonWriter.name("CustomLanguageCode");
            jsonWriter.value(customLanguageCode);
        }
        if (audioSelector.getDefaultSelection() != null) {
            String defaultSelection = audioSelector.getDefaultSelection();
            jsonWriter.name("DefaultSelection");
            jsonWriter.value(defaultSelection);
        }
        if (audioSelector.getExternalAudioFileInput() != null) {
            String externalAudioFileInput = audioSelector.getExternalAudioFileInput();
            jsonWriter.name("ExternalAudioFileInput");
            jsonWriter.value(externalAudioFileInput);
        }
        if (audioSelector.getLanguageCode() != null) {
            String languageCode = audioSelector.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (audioSelector.getOffset() != null) {
            Integer offset = audioSelector.getOffset();
            jsonWriter.name("Offset");
            jsonWriter.value(offset);
        }
        if (audioSelector.getPids() != null) {
            java.util.List<Integer> pids = audioSelector.getPids();
            jsonWriter.name("Pids");
            jsonWriter.beginArray();
            for (Integer pidsItem : pids) {
                if (pidsItem != null) {
                    jsonWriter.value(pidsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (audioSelector.getProgramSelection() != null) {
            Integer programSelection = audioSelector.getProgramSelection();
            jsonWriter.name("ProgramSelection");
            jsonWriter.value(programSelection);
        }
        if (audioSelector.getRemixSettings() != null) {
            RemixSettings remixSettings = audioSelector.getRemixSettings();
            jsonWriter.name("RemixSettings");
            RemixSettingsJsonMarshaller.getInstance().marshall(remixSettings, jsonWriter);
        }
        if (audioSelector.getSelectorType() != null) {
            String selectorType = audioSelector.getSelectorType();
            jsonWriter.name("SelectorType");
            jsonWriter.value(selectorType);
        }
        if (audioSelector.getTracks() != null) {
            java.util.List<Integer> tracks = audioSelector.getTracks();
            jsonWriter.name("Tracks");
            jsonWriter.beginArray();
            for (Integer tracksItem : tracks) {
                if (tracksItem != null) {
                    jsonWriter.value(tracksItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AudioSelectorJsonMarshaller instance;

    public static AudioSelectorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AudioSelectorJsonMarshaller();
        return instance;
    }
}
