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
 * JSON marshaller for POJO HlsSettings
 */
class HlsSettingsJsonMarshaller {

    public void marshall(HlsSettings hlsSettings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hlsSettings.getAudioOnlyHlsSettings() != null) {
            AudioOnlyHlsSettings audioOnlyHlsSettings = hlsSettings.getAudioOnlyHlsSettings();
            jsonWriter.name("AudioOnlyHlsSettings");
            AudioOnlyHlsSettingsJsonMarshaller.getInstance().marshall(audioOnlyHlsSettings,
                    jsonWriter);
        }
        if (hlsSettings.getFmp4HlsSettings() != null) {
            Fmp4HlsSettings fmp4HlsSettings = hlsSettings.getFmp4HlsSettings();
            jsonWriter.name("Fmp4HlsSettings");
            Fmp4HlsSettingsJsonMarshaller.getInstance().marshall(fmp4HlsSettings, jsonWriter);
        }
        if (hlsSettings.getStandardHlsSettings() != null) {
            StandardHlsSettings standardHlsSettings = hlsSettings.getStandardHlsSettings();
            jsonWriter.name("StandardHlsSettings");
            StandardHlsSettingsJsonMarshaller.getInstance().marshall(standardHlsSettings,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static HlsSettingsJsonMarshaller instance;

    public static HlsSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HlsSettingsJsonMarshaller();
        return instance;
    }
}
