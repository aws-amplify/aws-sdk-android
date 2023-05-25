/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.translate.model.transform;

import com.amazonaws.services.translate.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Language
 */
class LanguageJsonMarshaller {

    public void marshall(Language language, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (language.getLanguageName() != null) {
            String languageName = language.getLanguageName();
            jsonWriter.name("LanguageName");
            jsonWriter.value(languageName);
        }
        if (language.getLanguageCode() != null) {
            String languageCode = language.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        jsonWriter.endObject();
    }

    private static LanguageJsonMarshaller instance;

    public static LanguageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LanguageJsonMarshaller();
        return instance;
    }
}
