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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DominantLanguage
 */
class DominantLanguageJsonMarshaller {

    public void marshall(DominantLanguage dominantLanguage, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (dominantLanguage.getLanguageCode() != null) {
            String languageCode = dominantLanguage.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (dominantLanguage.getScore() != null) {
            Float score = dominantLanguage.getScore();
            jsonWriter.name("Score");
            jsonWriter.value(score);
        }
        jsonWriter.endObject();
    }

    private static DominantLanguageJsonMarshaller instance;

    public static DominantLanguageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DominantLanguageJsonMarshaller();
        return instance;
    }
}
