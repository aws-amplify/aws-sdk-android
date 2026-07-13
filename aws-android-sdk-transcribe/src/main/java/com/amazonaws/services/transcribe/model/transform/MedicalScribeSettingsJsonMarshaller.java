/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MedicalScribeSettings
 */
class MedicalScribeSettingsJsonMarshaller {

    public void marshall(MedicalScribeSettings medicalScribeSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (medicalScribeSettings.getShowSpeakerLabels() != null) {
            Boolean showSpeakerLabels = medicalScribeSettings.getShowSpeakerLabels();
            jsonWriter.name("ShowSpeakerLabels");
            jsonWriter.value(showSpeakerLabels);
        }
        if (medicalScribeSettings.getMaxSpeakerLabels() != null) {
            Integer maxSpeakerLabels = medicalScribeSettings.getMaxSpeakerLabels();
            jsonWriter.name("MaxSpeakerLabels");
            jsonWriter.value(maxSpeakerLabels);
        }
        if (medicalScribeSettings.getChannelIdentification() != null) {
            Boolean channelIdentification = medicalScribeSettings.getChannelIdentification();
            jsonWriter.name("ChannelIdentification");
            jsonWriter.value(channelIdentification);
        }
        if (medicalScribeSettings.getVocabularyName() != null) {
            String vocabularyName = medicalScribeSettings.getVocabularyName();
            jsonWriter.name("VocabularyName");
            jsonWriter.value(vocabularyName);
        }
        if (medicalScribeSettings.getVocabularyFilterName() != null) {
            String vocabularyFilterName = medicalScribeSettings.getVocabularyFilterName();
            jsonWriter.name("VocabularyFilterName");
            jsonWriter.value(vocabularyFilterName);
        }
        if (medicalScribeSettings.getVocabularyFilterMethod() != null) {
            String vocabularyFilterMethod = medicalScribeSettings.getVocabularyFilterMethod();
            jsonWriter.name("VocabularyFilterMethod");
            jsonWriter.value(vocabularyFilterMethod);
        }
        jsonWriter.endObject();
    }

    private static MedicalScribeSettingsJsonMarshaller instance;

    public static MedicalScribeSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MedicalScribeSettingsJsonMarshaller();
        return instance;
    }
}
