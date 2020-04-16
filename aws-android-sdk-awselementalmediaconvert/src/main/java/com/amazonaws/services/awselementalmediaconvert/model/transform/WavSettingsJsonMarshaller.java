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
 * JSON marshaller for POJO WavSettings
 */
class WavSettingsJsonMarshaller {

    public void marshall(WavSettings wavSettings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (wavSettings.getBitDepth() != null) {
            Integer bitDepth = wavSettings.getBitDepth();
            jsonWriter.name("BitDepth");
            jsonWriter.value(bitDepth);
        }
        if (wavSettings.getChannels() != null) {
            Integer channels = wavSettings.getChannels();
            jsonWriter.name("Channels");
            jsonWriter.value(channels);
        }
        if (wavSettings.getFormat() != null) {
            String format = wavSettings.getFormat();
            jsonWriter.name("Format");
            jsonWriter.value(format);
        }
        if (wavSettings.getSampleRate() != null) {
            Integer sampleRate = wavSettings.getSampleRate();
            jsonWriter.name("SampleRate");
            jsonWriter.value(sampleRate);
        }
        jsonWriter.endObject();
    }

    private static WavSettingsJsonMarshaller instance;

    public static WavSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WavSettingsJsonMarshaller();
        return instance;
    }
}
