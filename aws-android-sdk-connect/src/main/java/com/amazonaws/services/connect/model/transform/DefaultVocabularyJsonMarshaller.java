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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DefaultVocabulary
 */
class DefaultVocabularyJsonMarshaller {

    public void marshall(DefaultVocabulary defaultVocabulary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (defaultVocabulary.getInstanceId() != null) {
            String instanceId = defaultVocabulary.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (defaultVocabulary.getLanguageCode() != null) {
            String languageCode = defaultVocabulary.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (defaultVocabulary.getVocabularyId() != null) {
            String vocabularyId = defaultVocabulary.getVocabularyId();
            jsonWriter.name("VocabularyId");
            jsonWriter.value(vocabularyId);
        }
        if (defaultVocabulary.getVocabularyName() != null) {
            String vocabularyName = defaultVocabulary.getVocabularyName();
            jsonWriter.name("VocabularyName");
            jsonWriter.value(vocabularyName);
        }
        jsonWriter.endObject();
    }

    private static DefaultVocabularyJsonMarshaller instance;

    public static DefaultVocabularyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DefaultVocabularyJsonMarshaller();
        return instance;
    }
}
