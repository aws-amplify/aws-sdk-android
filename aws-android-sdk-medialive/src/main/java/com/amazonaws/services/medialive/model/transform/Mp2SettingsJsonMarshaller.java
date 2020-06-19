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
 * JSON marshaller for POJO Mp2Settings
 */
class Mp2SettingsJsonMarshaller {

    public void marshall(Mp2Settings mp2Settings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (mp2Settings.getBitrate() != null) {
            Double bitrate = mp2Settings.getBitrate();
            jsonWriter.name("Bitrate");
            jsonWriter.value(bitrate);
        }
        if (mp2Settings.getCodingMode() != null) {
            String codingMode = mp2Settings.getCodingMode();
            jsonWriter.name("CodingMode");
            jsonWriter.value(codingMode);
        }
        if (mp2Settings.getSampleRate() != null) {
            Double sampleRate = mp2Settings.getSampleRate();
            jsonWriter.name("SampleRate");
            jsonWriter.value(sampleRate);
        }
        jsonWriter.endObject();
    }

    private static Mp2SettingsJsonMarshaller instance;

    public static Mp2SettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Mp2SettingsJsonMarshaller();
        return instance;
    }
}
