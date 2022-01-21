/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO MedicalTranscriptionSetting
 */
class MedicalTranscriptionSettingJsonMarshaller {

    public void marshall(MedicalTranscriptionSetting medicalTranscriptionSetting,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (medicalTranscriptionSetting.getShowSpeakerLabels() != null) {
            Boolean showSpeakerLabels = medicalTranscriptionSetting.getShowSpeakerLabels();
            jsonWriter.name("ShowSpeakerLabels");
            jsonWriter.value(showSpeakerLabels);
        }
        if (medicalTranscriptionSetting.getMaxSpeakerLabels() != null) {
            Integer maxSpeakerLabels = medicalTranscriptionSetting.getMaxSpeakerLabels();
            jsonWriter.name("MaxSpeakerLabels");
            jsonWriter.value(maxSpeakerLabels);
        }
        if (medicalTranscriptionSetting.getChannelIdentification() != null) {
            Boolean channelIdentification = medicalTranscriptionSetting.getChannelIdentification();
            jsonWriter.name("ChannelIdentification");
            jsonWriter.value(channelIdentification);
        }
        if (medicalTranscriptionSetting.getShowAlternatives() != null) {
            Boolean showAlternatives = medicalTranscriptionSetting.getShowAlternatives();
            jsonWriter.name("ShowAlternatives");
            jsonWriter.value(showAlternatives);
        }
        if (medicalTranscriptionSetting.getMaxAlternatives() != null) {
            Integer maxAlternatives = medicalTranscriptionSetting.getMaxAlternatives();
            jsonWriter.name("MaxAlternatives");
            jsonWriter.value(maxAlternatives);
        }
        if (medicalTranscriptionSetting.getVocabularyName() != null) {
            String vocabularyName = medicalTranscriptionSetting.getVocabularyName();
            jsonWriter.name("VocabularyName");
            jsonWriter.value(vocabularyName);
        }
        jsonWriter.endObject();
    }

    private static MedicalTranscriptionSettingJsonMarshaller instance;

    public static MedicalTranscriptionSettingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MedicalTranscriptionSettingJsonMarshaller();
        return instance;
    }
}
