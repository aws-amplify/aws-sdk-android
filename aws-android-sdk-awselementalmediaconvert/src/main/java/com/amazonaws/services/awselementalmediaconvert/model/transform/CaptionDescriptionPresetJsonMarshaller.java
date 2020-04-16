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
 * JSON marshaller for POJO CaptionDescriptionPreset
 */
class CaptionDescriptionPresetJsonMarshaller {

    public void marshall(CaptionDescriptionPreset captionDescriptionPreset, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (captionDescriptionPreset.getCustomLanguageCode() != null) {
            String customLanguageCode = captionDescriptionPreset.getCustomLanguageCode();
            jsonWriter.name("CustomLanguageCode");
            jsonWriter.value(customLanguageCode);
        }
        if (captionDescriptionPreset.getDestinationSettings() != null) {
            CaptionDestinationSettings destinationSettings = captionDescriptionPreset
                    .getDestinationSettings();
            jsonWriter.name("DestinationSettings");
            CaptionDestinationSettingsJsonMarshaller.getInstance().marshall(destinationSettings,
                    jsonWriter);
        }
        if (captionDescriptionPreset.getLanguageCode() != null) {
            String languageCode = captionDescriptionPreset.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (captionDescriptionPreset.getLanguageDescription() != null) {
            String languageDescription = captionDescriptionPreset.getLanguageDescription();
            jsonWriter.name("LanguageDescription");
            jsonWriter.value(languageDescription);
        }
        jsonWriter.endObject();
    }

    private static CaptionDescriptionPresetJsonMarshaller instance;

    public static CaptionDescriptionPresetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CaptionDescriptionPresetJsonMarshaller();
        return instance;
    }
}
