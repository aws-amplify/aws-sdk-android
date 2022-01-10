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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MedicalTranscriptionSetting
 */
class MedicalTranscriptionSettingJsonUnmarshaller implements
        Unmarshaller<MedicalTranscriptionSetting, JsonUnmarshallerContext> {

    public MedicalTranscriptionSetting unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MedicalTranscriptionSetting medicalTranscriptionSetting = new MedicalTranscriptionSetting();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ShowSpeakerLabels")) {
                medicalTranscriptionSetting.setShowSpeakerLabels(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxSpeakerLabels")) {
                medicalTranscriptionSetting.setMaxSpeakerLabels(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ChannelIdentification")) {
                medicalTranscriptionSetting.setChannelIdentification(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ShowAlternatives")) {
                medicalTranscriptionSetting.setShowAlternatives(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxAlternatives")) {
                medicalTranscriptionSetting.setMaxAlternatives(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("VocabularyName")) {
                medicalTranscriptionSetting.setVocabularyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return medicalTranscriptionSetting;
    }

    private static MedicalTranscriptionSettingJsonUnmarshaller instance;

    public static MedicalTranscriptionSettingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MedicalTranscriptionSettingJsonUnmarshaller();
        return instance;
    }
}
