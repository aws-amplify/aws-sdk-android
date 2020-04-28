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
 * JSON marshaller for POJO CaptionDescription
 */
class CaptionDescriptionJsonMarshaller {

    public void marshall(CaptionDescription captionDescription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (captionDescription.getCaptionSelectorName() != null) {
            String captionSelectorName = captionDescription.getCaptionSelectorName();
            jsonWriter.name("CaptionSelectorName");
            jsonWriter.value(captionSelectorName);
        }
        if (captionDescription.getDestinationSettings() != null) {
            CaptionDestinationSettings destinationSettings = captionDescription
                    .getDestinationSettings();
            jsonWriter.name("DestinationSettings");
            CaptionDestinationSettingsJsonMarshaller.getInstance().marshall(destinationSettings,
                    jsonWriter);
        }
        if (captionDescription.getLanguageCode() != null) {
            String languageCode = captionDescription.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (captionDescription.getLanguageDescription() != null) {
            String languageDescription = captionDescription.getLanguageDescription();
            jsonWriter.name("LanguageDescription");
            jsonWriter.value(languageDescription);
        }
        if (captionDescription.getName() != null) {
            String name = captionDescription.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        jsonWriter.endObject();
    }

    private static CaptionDescriptionJsonMarshaller instance;

    public static CaptionDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CaptionDescriptionJsonMarshaller();
        return instance;
    }
}
