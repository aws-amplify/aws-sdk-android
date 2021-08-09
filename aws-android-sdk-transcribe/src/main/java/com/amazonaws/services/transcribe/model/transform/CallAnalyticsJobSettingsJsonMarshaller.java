/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO CallAnalyticsJobSettings
 */
class CallAnalyticsJobSettingsJsonMarshaller {

    public void marshall(CallAnalyticsJobSettings callAnalyticsJobSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (callAnalyticsJobSettings.getVocabularyName() != null) {
            String vocabularyName = callAnalyticsJobSettings.getVocabularyName();
            jsonWriter.name("VocabularyName");
            jsonWriter.value(vocabularyName);
        }
        if (callAnalyticsJobSettings.getVocabularyFilterName() != null) {
            String vocabularyFilterName = callAnalyticsJobSettings.getVocabularyFilterName();
            jsonWriter.name("VocabularyFilterName");
            jsonWriter.value(vocabularyFilterName);
        }
        if (callAnalyticsJobSettings.getVocabularyFilterMethod() != null) {
            String vocabularyFilterMethod = callAnalyticsJobSettings.getVocabularyFilterMethod();
            jsonWriter.name("VocabularyFilterMethod");
            jsonWriter.value(vocabularyFilterMethod);
        }
        if (callAnalyticsJobSettings.getLanguageModelName() != null) {
            String languageModelName = callAnalyticsJobSettings.getLanguageModelName();
            jsonWriter.name("LanguageModelName");
            jsonWriter.value(languageModelName);
        }
        if (callAnalyticsJobSettings.getContentRedaction() != null) {
            ContentRedaction contentRedaction = callAnalyticsJobSettings.getContentRedaction();
            jsonWriter.name("ContentRedaction");
            ContentRedactionJsonMarshaller.getInstance().marshall(contentRedaction, jsonWriter);
        }
        if (callAnalyticsJobSettings.getLanguageOptions() != null) {
            java.util.List<String> languageOptions = callAnalyticsJobSettings.getLanguageOptions();
            jsonWriter.name("LanguageOptions");
            jsonWriter.beginArray();
            for (String languageOptionsItem : languageOptions) {
                if (languageOptionsItem != null) {
                    jsonWriter.value(languageOptionsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static CallAnalyticsJobSettingsJsonMarshaller instance;

    public static CallAnalyticsJobSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CallAnalyticsJobSettingsJsonMarshaller();
        return instance;
    }
}
