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

package com.amazonaws.services.medialive.model.transform;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Fmp4HlsSettings
 */
class Fmp4HlsSettingsJsonMarshaller {

    public void marshall(Fmp4HlsSettings fmp4HlsSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (fmp4HlsSettings.getAudioRenditionSets() != null) {
            String audioRenditionSets = fmp4HlsSettings.getAudioRenditionSets();
            jsonWriter.name("AudioRenditionSets");
            jsonWriter.value(audioRenditionSets);
        }
        if (fmp4HlsSettings.getNielsenId3Behavior() != null) {
            String nielsenId3Behavior = fmp4HlsSettings.getNielsenId3Behavior();
            jsonWriter.name("NielsenId3Behavior");
            jsonWriter.value(nielsenId3Behavior);
        }
        if (fmp4HlsSettings.getTimedMetadataBehavior() != null) {
            String timedMetadataBehavior = fmp4HlsSettings.getTimedMetadataBehavior();
            jsonWriter.name("TimedMetadataBehavior");
            jsonWriter.value(timedMetadataBehavior);
        }
        jsonWriter.endObject();
    }

    private static Fmp4HlsSettingsJsonMarshaller instance;

    public static Fmp4HlsSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Fmp4HlsSettingsJsonMarshaller();
        return instance;
    }
}
