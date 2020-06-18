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

package com.amazonaws.services.mediaconvert.model.transform;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CaptionSelector
 */
class CaptionSelectorJsonMarshaller {

    public void marshall(CaptionSelector captionSelector, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (captionSelector.getCustomLanguageCode() != null) {
            String customLanguageCode = captionSelector.getCustomLanguageCode();
            jsonWriter.name("CustomLanguageCode");
            jsonWriter.value(customLanguageCode);
        }
        if (captionSelector.getLanguageCode() != null) {
            String languageCode = captionSelector.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (captionSelector.getSourceSettings() != null) {
            CaptionSourceSettings sourceSettings = captionSelector.getSourceSettings();
            jsonWriter.name("SourceSettings");
            CaptionSourceSettingsJsonMarshaller.getInstance().marshall(sourceSettings, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static CaptionSelectorJsonMarshaller instance;

    public static CaptionSelectorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CaptionSelectorJsonMarshaller();
        return instance;
    }
}
