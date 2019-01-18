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
 * JSON marshaller for POJO VocabularyInfo
 */
class VocabularyInfoJsonMarshaller {

    public void marshall(VocabularyInfo vocabularyInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (vocabularyInfo.getVocabularyName() != null) {
            String vocabularyName = vocabularyInfo.getVocabularyName();
            jsonWriter.name("VocabularyName");
            jsonWriter.value(vocabularyName);
        }
        if (vocabularyInfo.getLanguageCode() != null) {
            String languageCode = vocabularyInfo.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (vocabularyInfo.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = vocabularyInfo.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (vocabularyInfo.getVocabularyState() != null) {
            String vocabularyState = vocabularyInfo.getVocabularyState();
            jsonWriter.name("VocabularyState");
            jsonWriter.value(vocabularyState);
        }
        jsonWriter.endObject();
    }

    private static VocabularyInfoJsonMarshaller instance;

    public static VocabularyInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VocabularyInfoJsonMarshaller();
        return instance;
    }
}
