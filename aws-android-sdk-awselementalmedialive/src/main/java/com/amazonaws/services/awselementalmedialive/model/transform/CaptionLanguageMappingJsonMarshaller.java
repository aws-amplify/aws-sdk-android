/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.awselementalmedialive.model.transform;

import com.amazonaws.services.awselementalmedialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CaptionLanguageMapping
 */
class CaptionLanguageMappingJsonMarshaller {

    public void marshall(CaptionLanguageMapping captionLanguageMapping, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (captionLanguageMapping.getCaptionChannel() != null) {
            Integer captionChannel = captionLanguageMapping.getCaptionChannel();
            jsonWriter.name("CaptionChannel");
            jsonWriter.value(captionChannel);
        }
        if (captionLanguageMapping.getLanguageCode() != null) {
            String languageCode = captionLanguageMapping.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (captionLanguageMapping.getLanguageDescription() != null) {
            String languageDescription = captionLanguageMapping.getLanguageDescription();
            jsonWriter.name("LanguageDescription");
            jsonWriter.value(languageDescription);
        }
        jsonWriter.endObject();
    }

    private static CaptionLanguageMappingJsonMarshaller instance;

    public static CaptionLanguageMappingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CaptionLanguageMappingJsonMarshaller();
        return instance;
    }
}
