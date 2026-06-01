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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MedicalScribeSettings
 */
class MedicalScribeSettingsJsonUnmarshaller implements
        Unmarshaller<MedicalScribeSettings, JsonUnmarshallerContext> {

    public MedicalScribeSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MedicalScribeSettings medicalScribeSettings = new MedicalScribeSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ShowSpeakerLabels")) {
                medicalScribeSettings.setShowSpeakerLabels(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxSpeakerLabels")) {
                medicalScribeSettings.setMaxSpeakerLabels(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ChannelIdentification")) {
                medicalScribeSettings.setChannelIdentification(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("VocabularyName")) {
                medicalScribeSettings.setVocabularyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VocabularyFilterName")) {
                medicalScribeSettings.setVocabularyFilterName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VocabularyFilterMethod")) {
                medicalScribeSettings.setVocabularyFilterMethod(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return medicalScribeSettings;
    }

    private static MedicalScribeSettingsJsonUnmarshaller instance;

    public static MedicalScribeSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MedicalScribeSettingsJsonUnmarshaller();
        return instance;
    }
}
