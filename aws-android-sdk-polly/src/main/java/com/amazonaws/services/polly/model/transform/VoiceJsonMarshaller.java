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

package com.amazonaws.services.polly.model.transform;

import com.amazonaws.services.polly.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Voice
 */
class VoiceJsonMarshaller {

    public void marshall(Voice voice, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (voice.getGender() != null) {
            String gender = voice.getGender();
            jsonWriter.name("Gender");
            jsonWriter.value(gender);
        }
        if (voice.getId() != null) {
            String id = voice.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (voice.getLanguageCode() != null) {
            String languageCode = voice.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (voice.getLanguageName() != null) {
            String languageName = voice.getLanguageName();
            jsonWriter.name("LanguageName");
            jsonWriter.value(languageName);
        }
        if (voice.getName() != null) {
            String name = voice.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (voice.getAdditionalLanguageCodes() != null) {
            java.util.List<String> additionalLanguageCodes = voice.getAdditionalLanguageCodes();
            jsonWriter.name("AdditionalLanguageCodes");
            jsonWriter.beginArray();
            for (String additionalLanguageCodesItem : additionalLanguageCodes) {
                if (additionalLanguageCodesItem != null) {
                    jsonWriter.value(additionalLanguageCodesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static VoiceJsonMarshaller instance;

    public static VoiceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VoiceJsonMarshaller();
        return instance;
    }
}
