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
 * JSON marshaller for POJO LanguageIdSettings
 */
class LanguageIdSettingsJsonMarshaller {

    public void marshall(LanguageIdSettings languageIdSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (languageIdSettings.getVocabularyName() != null) {
            String vocabularyName = languageIdSettings.getVocabularyName();
            jsonWriter.name("VocabularyName");
            jsonWriter.value(vocabularyName);
        }
        if (languageIdSettings.getVocabularyFilterName() != null) {
            String vocabularyFilterName = languageIdSettings.getVocabularyFilterName();
            jsonWriter.name("VocabularyFilterName");
            jsonWriter.value(vocabularyFilterName);
        }
        if (languageIdSettings.getLanguageModelName() != null) {
            String languageModelName = languageIdSettings.getLanguageModelName();
            jsonWriter.name("LanguageModelName");
            jsonWriter.value(languageModelName);
        }
        jsonWriter.endObject();
    }

    private static LanguageIdSettingsJsonMarshaller instance;

    public static LanguageIdSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LanguageIdSettingsJsonMarshaller();
        return instance;
    }
}
