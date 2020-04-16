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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HlsCaptionLanguageMapping
 */
class HlsCaptionLanguageMappingJsonMarshaller {

    public void marshall(HlsCaptionLanguageMapping hlsCaptionLanguageMapping,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hlsCaptionLanguageMapping.getCaptionChannel() != null) {
            Integer captionChannel = hlsCaptionLanguageMapping.getCaptionChannel();
            jsonWriter.name("CaptionChannel");
            jsonWriter.value(captionChannel);
        }
        if (hlsCaptionLanguageMapping.getCustomLanguageCode() != null) {
            String customLanguageCode = hlsCaptionLanguageMapping.getCustomLanguageCode();
            jsonWriter.name("CustomLanguageCode");
            jsonWriter.value(customLanguageCode);
        }
        if (hlsCaptionLanguageMapping.getLanguageCode() != null) {
            String languageCode = hlsCaptionLanguageMapping.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (hlsCaptionLanguageMapping.getLanguageDescription() != null) {
            String languageDescription = hlsCaptionLanguageMapping.getLanguageDescription();
            jsonWriter.name("LanguageDescription");
            jsonWriter.value(languageDescription);
        }
        jsonWriter.endObject();
    }

    private static HlsCaptionLanguageMappingJsonMarshaller instance;

    public static HlsCaptionLanguageMappingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HlsCaptionLanguageMappingJsonMarshaller();
        return instance;
    }
}
