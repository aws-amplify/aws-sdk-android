/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.transcribe.model.transform;

import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Settings
 */
class SettingsJsonMarshaller {

    public void marshall(Settings settings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (settings.getVocabularyName() != null) {
            String vocabularyName = settings.getVocabularyName();
            jsonWriter.name("VocabularyName");
            jsonWriter.value(vocabularyName);
        }
        if (settings.getShowSpeakerLabels() != null) {
            Boolean showSpeakerLabels = settings.getShowSpeakerLabels();
            jsonWriter.name("ShowSpeakerLabels");
            jsonWriter.value(showSpeakerLabels);
        }
        if (settings.getMaxSpeakerLabels() != null) {
            Integer maxSpeakerLabels = settings.getMaxSpeakerLabels();
            jsonWriter.name("MaxSpeakerLabels");
            jsonWriter.value(maxSpeakerLabels);
        }
        if (settings.getChannelIdentification() != null) {
            Boolean channelIdentification = settings.getChannelIdentification();
            jsonWriter.name("ChannelIdentification");
            jsonWriter.value(channelIdentification);
        }
        jsonWriter.endObject();
    }

    private static SettingsJsonMarshaller instance;

    public static SettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SettingsJsonMarshaller();
        return instance;
    }
}
