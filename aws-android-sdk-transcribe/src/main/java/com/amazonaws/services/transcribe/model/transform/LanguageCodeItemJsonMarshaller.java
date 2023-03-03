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

package com.amazonaws.services.transcribe.model.transform;

import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LanguageCodeItem
 */
class LanguageCodeItemJsonMarshaller {

    public void marshall(LanguageCodeItem languageCodeItem, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (languageCodeItem.getLanguageCode() != null) {
            String languageCode = languageCodeItem.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (languageCodeItem.getDurationInSeconds() != null) {
            Float durationInSeconds = languageCodeItem.getDurationInSeconds();
            jsonWriter.name("DurationInSeconds");
            jsonWriter.value(durationInSeconds);
        }
        jsonWriter.endObject();
    }

    private static LanguageCodeItemJsonMarshaller instance;

    public static LanguageCodeItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LanguageCodeItemJsonMarshaller();
        return instance;
    }
}
